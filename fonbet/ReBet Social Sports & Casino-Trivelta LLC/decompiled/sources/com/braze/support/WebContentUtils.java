package com.braze.support;

import android.content.Context;
import com.braze.support.BrazeLogger;
import com.braze.support.WebContentUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u001a\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001b\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0019H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J+\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060'H\u0007¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0007¢\u0006\u0004\b-\u0010.R(\u0010/\u001a\u00020\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b/\u00100\u0012\u0004\b5\u0010\u0003\u001a\u0004\b1\u00102\"\u0004\b3\u00104R(\u00106\u001a\u00020\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b6\u00107\u0012\u0004\b<\u0010\u0003\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010=\u001a\u00020\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b=\u00107\u0012\u0004\b@\u0010\u0003\u001a\u0004\b>\u00109\"\u0004\b?\u0010;¨\u0006A"}, d2 = {"Lcom/braze/support/WebContentUtils;", "", "<init>", "()V", "Ljava/io/File;", "localDirectory", "", "remoteZipUrl", "getLocalHtmlUrlFromRemoteUrl", "(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;", "unpackDirectory", "zipFile", "", "unpackZipIntoDirectory", "(Ljava/lang/String;Ljava/io/File;)Z", "Ljava/util/zip/ZipEntry;", "shouldSkip", "(Ljava/util/zip/ZipEntry;)Z", "", "entryCount", "hasTooManyZipEntries", "(I)Z", "Ljava/util/zip/ZipInputStream;", "zipInputStream", "zipEntry", "", "totalUnpackedBytes", "unpackZipEntry", "(Ljava/lang/String;Ljava/util/zip/ZipInputStream;Ljava/util/zip/ZipEntry;J)J", "Ljava/io/BufferedOutputStream;", "outputStream", "initialTotalUnpackedBytes", "copyZipEntryToOutputStream", "(Ljava/util/zip/ZipInputStream;Ljava/io/BufferedOutputStream;J)J", "Landroid/content/Context;", "context", "getHtmlInAppMessageAssetCacheDirectory", "(Landroid/content/Context;)Ljava/io/File;", "originalString", "", "remoteToLocalAssetMap", "replacePrefetchedUrlsWithLocalAssets", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "intendedParentDirectory", "childFilePath", "validateChildFileExistsUnderParent", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "maxUnpackedZipEntryCount", "I", "getMaxUnpackedZipEntryCount$android_sdk_base_release", "()I", "setMaxUnpackedZipEntryCount$android_sdk_base_release", "(I)V", "getMaxUnpackedZipEntryCount$android_sdk_base_release$annotations", "maxUnpackedZipEntrySizeBytes", "J", "getMaxUnpackedZipEntrySizeBytes$android_sdk_base_release", "()J", "setMaxUnpackedZipEntrySizeBytes$android_sdk_base_release", "(J)V", "getMaxUnpackedZipEntrySizeBytes$android_sdk_base_release$annotations", "maxUnpackedZipSizeBytes", "getMaxUnpackedZipSizeBytes$android_sdk_base_release", "setMaxUnpackedZipSizeBytes$android_sdk_base_release", "getMaxUnpackedZipSizeBytes$android_sdk_base_release$annotations", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebContentUtils {
    public static final WebContentUtils INSTANCE = new WebContentUtils();
    private static int maxUnpackedZipEntryCount = 1024;
    private static long maxUnpackedZipEntrySizeBytes = 26214400;
    private static long maxUnpackedZipSizeBytes = 104857600;

    private WebContentUtils() {
    }

    private final long copyZipEntryToOutputStream(ZipInputStream zipInputStream, BufferedOutputStream outputStream, long initialTotalUnpackedBytes) {
        byte[] bArr = new byte[8192];
        int read = zipInputStream.read(bArr);
        long j10 = 0;
        while (read >= 0) {
            long j11 = read;
            j10 += j11;
            initialTotalUnpackedBytes += j11;
            if (j10 > maxUnpackedZipEntrySizeBytes) {
                throw new IOException("Zip entry exceeds maximum unpacked size.");
            }
            if (initialTotalUnpackedBytes > maxUnpackedZipSizeBytes) {
                throw new IOException("Zip file exceeds maximum total unpacked size.");
            }
            outputStream.write(bArr, 0, read);
            read = zipInputStream.read(bArr);
        }
        return initialTotalUnpackedBytes;
    }

    @JvmStatic
    public static final File getHtmlInAppMessageAssetCacheDirectory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new File(context.getCacheDir().getPath() + "/braze-html-inapp-messages");
    }

    @JvmStatic
    public static final String getLocalHtmlUrlFromRemoteUrl(File localDirectory, final String remoteZipUrl) {
        Intrinsics.checkNotNullParameter(localDirectory, "localDirectory");
        Intrinsics.checkNotNullParameter(remoteZipUrl, "remoteZipUrl");
        if (StringsKt.isBlank(remoteZipUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.M0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String localHtmlUrlFromRemoteUrl$lambda$0;
                    localHtmlUrlFromRemoteUrl$lambda$0 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$0();
                    return localHtmlUrlFromRemoteUrl$lambda$0;
                }
            }, 6, (Object) null);
            return null;
        }
        String absolutePath = localDirectory.getAbsolutePath();
        String valueOf = String.valueOf(IntentUtils.getRequestCode());
        final String str = absolutePath + "/" + valueOf;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        WebContentUtils webContentUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.O0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String localHtmlUrlFromRemoteUrl$lambda$1;
                localHtmlUrlFromRemoteUrl$lambda$1 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$1(remoteZipUrl, str);
                return localHtmlUrlFromRemoteUrl$lambda$1;
            }
        }, 7, (Object) null);
        try {
            File component1 = BrazeFileUtils.downloadFileToPath(str, remoteZipUrl, valueOf, ".zip").component1();
            BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.P0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String localHtmlUrlFromRemoteUrl$lambda$3;
                    localHtmlUrlFromRemoteUrl$lambda$3 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$3(remoteZipUrl, str);
                    return localHtmlUrlFromRemoteUrl$lambda$3;
                }
            }, 7, (Object) null);
            if (unpackZipIntoDirectory(str, component1)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.R0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String localHtmlUrlFromRemoteUrl$lambda$5;
                        localHtmlUrlFromRemoteUrl$lambda$5 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$5(str);
                        return localHtmlUrlFromRemoteUrl$lambda$5;
                    }
                }, 7, (Object) null);
                return str;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.Q0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String localHtmlUrlFromRemoteUrl$lambda$4;
                    localHtmlUrlFromRemoteUrl$lambda$4 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$4();
                    return localHtmlUrlFromRemoteUrl$lambda$4;
                }
            }, 6, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(new File(str));
            return null;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: Y3.S0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String localHtmlUrlFromRemoteUrl$lambda$2;
                    localHtmlUrlFromRemoteUrl$lambda$2 = WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$2(remoteZipUrl);
                    return localHtmlUrlFromRemoteUrl$lambda$2;
                }
            }, 4, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(new File(str));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$0() {
        return "Remote zip url is empty. No local URL will be created.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$1(String str, String str2) {
        return "Starting download of url: " + str + " to " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$2(String str) {
        return "Could not download zip file to local storage. " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$3(String str, String str2) {
        return "Html content zip downloaded. " + str + " to " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$4() {
        return "Error during the zip unpack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$5(String str) {
        return "Html content zip unpacked to to " + str + ".";
    }

    private final boolean hasTooManyZipEntries(int entryCount) {
        if (entryCount <= maxUnpackedZipEntryCount) {
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) null, false, new Function0() { // from class: Y3.N0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String hasTooManyZipEntries$lambda$0;
                hasTooManyZipEntries$lambda$0 = WebContentUtils.hasTooManyZipEntries$lambda$0();
                return hasTooManyZipEntries$lambda$0;
            }
        }, 6, (Object) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String hasTooManyZipEntries$lambda$0() {
        return "Zip file contains too many entries.";
    }

    @JvmStatic
    public static final String replacePrefetchedUrlsWithLocalAssets(String originalString, Map<String, String> remoteToLocalAssetMap) {
        Intrinsics.checkNotNullParameter(originalString, "originalString");
        Intrinsics.checkNotNullParameter(remoteToLocalAssetMap, "remoteToLocalAssetMap");
        String str = originalString;
        for (Map.Entry<String, String> entry : remoteToLocalAssetMap.entrySet()) {
            final String value = entry.getValue();
            if (new File(value).exists()) {
                final String key = entry.getKey();
                if (StringsKt.contains$default((CharSequence) value, (CharSequence) "ab_triggers", false, 2, (Object) null)) {
                    final String str2 = "https://iamcache.braze/ab_triggers" + ((String) StringsKt.split$default((CharSequence) value, new String[]{"ab_triggers"}, false, 0, 6, (Object) null).get(1));
                    if (StringsKt.contains$default((CharSequence) str, (CharSequence) key, false, 2, (Object) null)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: Y3.U0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String replacePrefetchedUrlsWithLocalAssets$lambda$1;
                                replacePrefetchedUrlsWithLocalAssets$lambda$1 = WebContentUtils.replacePrefetchedUrlsWithLocalAssets$lambda$1(key, str2);
                                return replacePrefetchedUrlsWithLocalAssets$lambda$1;
                            }
                        }, 7, (Object) null);
                        str = StringsKt.replace$default(str, key, str2, false, 4, (Object) null);
                    }
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.T0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String replacePrefetchedUrlsWithLocalAssets$lambda$0;
                        replacePrefetchedUrlsWithLocalAssets$lambda$0 = WebContentUtils.replacePrefetchedUrlsWithLocalAssets$lambda$0(value);
                        return replacePrefetchedUrlsWithLocalAssets$lambda$0;
                    }
                }, 6, (Object) null);
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String replacePrefetchedUrlsWithLocalAssets$lambda$0(String str) {
        return "Cannot find local asset file at path: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String replacePrefetchedUrlsWithLocalAssets$lambda$1(String str, String str2) {
        return "Replacing remote url \"" + str + "\" with local uri \"" + str2 + "\"";
    }

    private final boolean shouldSkip(ZipEntry zipEntry) {
        String name = zipEntry.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = name.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt.startsWith$default(lowerCase, "__macosx", false, 2, (Object) null);
    }

    private final long unpackZipEntry(String unpackDirectory, ZipInputStream zipInputStream, ZipEntry zipEntry, long totalUnpackedBytes) {
        String validateChildFileExistsUnderParent = validateChildFileExistsUnderParent(unpackDirectory, unpackDirectory + "/" + zipEntry.getName());
        if (zipEntry.isDirectory()) {
            new File(validateChildFileExistsUnderParent).mkdirs();
            return totalUnpackedBytes;
        }
        File parentFile = new File(validateChildFileExistsUnderParent).getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(validateChildFileExistsUnderParent));
        try {
            long copyZipEntryToOutputStream = INSTANCE.copyZipEntryToOutputStream(zipInputStream, bufferedOutputStream, totalUnpackedBytes);
            CloseableKt.closeFinally(bufferedOutputStream, null);
            return copyZipEntryToOutputStream;
        } finally {
        }
    }

    @JvmStatic
    public static final boolean unpackZipIntoDirectory(final String unpackDirectory, final File zipFile) {
        Intrinsics.checkNotNullParameter(unpackDirectory, "unpackDirectory");
        Intrinsics.checkNotNullParameter(zipFile, "zipFile");
        if (StringsKt.isBlank(unpackDirectory)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: Y3.V0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unpackZipIntoDirectory$lambda$0;
                    unpackZipIntoDirectory$lambda$0 = WebContentUtils.unpackZipIntoDirectory$lambda$0();
                    return unpackZipIntoDirectory$lambda$0;
                }
            }, 6, (Object) null);
            return false;
        }
        new File(unpackDirectory).mkdirs();
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFile));
            try {
                int i10 = 0;
                long j10 = 0;
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    WebContentUtils webContentUtils = INSTANCE;
                    if (!webContentUtils.shouldSkip(nextEntry)) {
                        i10++;
                        if (webContentUtils.hasTooManyZipEntries(i10)) {
                            CloseableKt.closeFinally(zipInputStream, null);
                            return false;
                        }
                        try {
                            j10 = webContentUtils.unpackZipEntry(unpackDirectory, zipInputStream, nextEntry, j10);
                        } catch (Throwable th2) {
                            th = th2;
                            unpackDirectory = unpackDirectory;
                            Throwable th3 = th;
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                CloseableKt.closeFinally(zipInputStream, th3);
                                throw th4;
                            }
                        }
                    }
                    zipInputStream.closeEntry();
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(zipInputStream, null);
                return true;
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29470E, th6, false, new Function0() { // from class: Y3.W0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unpackZipIntoDirectory$lambda$2;
                    unpackZipIntoDirectory$lambda$2 = WebContentUtils.unpackZipIntoDirectory$lambda$2(zipFile, unpackDirectory);
                    return unpackZipIntoDirectory$lambda$2;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unpackZipIntoDirectory$lambda$0() {
        return "Unpack directory is blank. Zip file not unpacked.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unpackZipIntoDirectory$lambda$2(File file, String str) {
        return "Error during unpack of zip file " + file.getAbsolutePath() + " to " + str + ".";
    }

    @JvmStatic
    public static final String validateChildFileExistsUnderParent(String intendedParentDirectory, String childFilePath) {
        Intrinsics.checkNotNullParameter(intendedParentDirectory, "intendedParentDirectory");
        Intrinsics.checkNotNullParameter(childFilePath, "childFilePath");
        String canonicalPath = new File(intendedParentDirectory).getCanonicalPath();
        String canonicalPath2 = new File(childFilePath).getCanonicalPath();
        Intrinsics.checkNotNull(canonicalPath2);
        if (StringsKt.startsWith$default(canonicalPath2, canonicalPath + File.separator, false, 2, (Object) null)) {
            return canonicalPath2;
        }
        throw new IllegalStateException("Invalid file with original path: " + childFilePath + " with canonical path: " + canonicalPath2 + " does not exist under intended parent with  path: " + intendedParentDirectory + " and canonical path: " + canonicalPath);
    }
}
