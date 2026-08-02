package io.sentry.android.ndk;

import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.IDebugImagesLoader;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.ndk.NativeModuleListLoader;
import io.sentry.protocol.DebugImage;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes9.dex */
public final class DebugImagesLoader implements IDebugImagesLoader {
    private static volatile List<DebugImage> debugImages;
    protected static final AutoClosableReentrantLock debugImagesLock = new AutoClosableReentrantLock();
    private final NativeModuleListLoader moduleListLoader;
    private final SentryOptions options;

    public DebugImagesLoader(SentryAndroidOptions sentryAndroidOptions, NativeModuleListLoader nativeModuleListLoader) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryAndroidOptions, "The SentryAndroidOptions is required.");
        this.moduleListLoader = (NativeModuleListLoader) Objects.requireNonNull(nativeModuleListLoader, "The NativeModuleListLoader is required.");
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    public List<DebugImage> loadDebugImages() {
        ISentryLifecycleToken acquire = debugImagesLock.acquire();
        try {
            if (debugImages == null) {
                try {
                    io.sentry.ndk.DebugImage[] loadModuleList = this.moduleListLoader.loadModuleList();
                    if (loadModuleList != null) {
                        debugImages = new ArrayList(loadModuleList.length);
                        for (io.sentry.ndk.DebugImage debugImage : loadModuleList) {
                            DebugImage debugImage2 = new DebugImage();
                            debugImage2.setCodeFile(debugImage.getCodeFile());
                            debugImage2.setDebugFile(debugImage.getDebugFile());
                            debugImage2.setUuid(debugImage.getUuid());
                            debugImage2.setType(debugImage.getType());
                            debugImage2.setDebugId(debugImage.getDebugId());
                            debugImage2.setCodeId(debugImage.getCodeId());
                            debugImage2.setImageAddr(debugImage.getImageAddr());
                            debugImage2.setImageSize(debugImage.getImageSize());
                            debugImage2.setArch(debugImage.getArch());
                            debugImages.add(debugImage2);
                        }
                        this.options.getLogger().log(SentryLevel.DEBUG, "Debug images loaded: %d", Integer.valueOf(debugImages.size()));
                    }
                } catch (Throwable th) {
                    this.options.getLogger().log(SentryLevel.ERROR, th, "Failed to load debug images.", new Object[0]);
                }
            }
            if (acquire != null) {
                acquire.close();
            }
            return debugImages;
        } catch (Throwable th2) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    public Set<DebugImage> loadDebugImagesForAddresses(Set<String> set) {
        ISentryLifecycleToken acquire = debugImagesLock.acquire();
        try {
            List<DebugImage> loadDebugImages = loadDebugImages();
            if (loadDebugImages == null) {
                if (acquire != null) {
                    acquire.close();
                }
                return null;
            }
            if (set.isEmpty()) {
                if (acquire != null) {
                    acquire.close();
                }
                return null;
            }
            Set<DebugImage> filterImagesByAddresses = filterImagesByAddresses(loadDebugImages, set);
            if (!filterImagesByAddresses.isEmpty()) {
                if (acquire != null) {
                    acquire.close();
                }
                return filterImagesByAddresses;
            }
            this.options.getLogger().log(SentryLevel.WARNING, "No debug images found for any of the %d addresses.", Integer.valueOf(set.size()));
            if (acquire != null) {
                acquire.close();
            }
            return null;
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private Set<DebugImage> filterImagesByAddresses(List<DebugImage> list, Set<String> set) {
        long parseLong;
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < list.size()) {
            DebugImage debugImage = list.get(i);
            i++;
            DebugImage debugImage2 = i < list.size() ? list.get(i) : null;
            String imageAddr = debugImage2 != null ? debugImage2.getImageAddr() : null;
            Iterator<String> it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        long parseLong2 = Long.parseLong(it.next().replace("0x", ""), 16);
                        String imageAddr2 = debugImage.getImageAddr();
                        if (imageAddr2 != null) {
                            long parseLong3 = Long.parseLong(imageAddr2.replace("0x", ""), 16);
                            Long imageSize = debugImage.getImageSize();
                            if (imageSize != null) {
                                parseLong = imageSize.longValue() + parseLong3;
                            } else {
                                parseLong = imageAddr != null ? Long.parseLong(imageAddr.replace("0x", ""), 16) : Long.MAX_VALUE;
                            }
                            if (parseLong2 >= parseLong3 && parseLong2 < parseLong) {
                                hashSet.add(debugImage);
                                break;
                            }
                        } else {
                            continue;
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    @Override // io.sentry.android.core.IDebugImagesLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void clearDebugImages() {
        ISentryLifecycleToken acquire = debugImagesLock.acquire();
        try {
            try {
                this.moduleListLoader.clearModuleList();
                this.options.getLogger().log(SentryLevel.INFO, "Debug images cleared.", new Object[0]);
            } catch (Throwable th) {
                if (acquire != null) {
                    try {
                        acquire.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
        } finally {
            debugImages = null;
            if (acquire == null) {
            }
        }
        debugImages = null;
        if (acquire == null) {
            acquire.close();
        }
    }

    List<DebugImage> getCachedDebugImages() {
        return debugImages;
    }
}
