package io.sentry.featureflags;

import io.sentry.ISentryLifecycleToken;
import io.sentry.protocol.FeatureFlag;
import io.sentry.protocol.FeatureFlags;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class SpanFeatureFlagBuffer implements IFeatureFlagBuffer {
    private static final int MAX_SIZE = 10;
    private Map<String, Boolean> flags = null;
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();

    private SpanFeatureFlagBuffer() {
    }

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    public void add(String str, Boolean bool) {
        if (str == null || bool == null) {
            return;
        }
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            if (this.flags == null) {
                this.flags = new LinkedHashMap(10);
            }
            if (this.flags.size() < 10 || this.flags.containsKey(str)) {
                this.flags.put(str, bool);
            }
            if (acquire != null) {
                acquire.close();
            }
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

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    public FeatureFlags getFeatureFlags() {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            Map<String, Boolean> map = this.flags;
            if (map != null && !map.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.flags.size());
                for (Map.Entry<String, Boolean> entry : this.flags.entrySet()) {
                    arrayList.add(new FeatureFlag(entry.getKey(), entry.getValue().booleanValue()));
                }
                FeatureFlags featureFlags = new FeatureFlags(arrayList);
                if (acquire != null) {
                    acquire.close();
                }
                return featureFlags;
            }
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

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IFeatureFlagBuffer m13430clone() {
        return create();
    }

    public static IFeatureFlagBuffer create() {
        return new SpanFeatureFlagBuffer();
    }
}
