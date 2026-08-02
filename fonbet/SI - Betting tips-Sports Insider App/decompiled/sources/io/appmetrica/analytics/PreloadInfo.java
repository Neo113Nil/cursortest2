package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class PreloadInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f11355a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f11356b;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f11357a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f11358b;

        public /* synthetic */ Builder(String str, int i5) {
            this(str);
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, 0);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f11358b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f11357a = str;
            this.f11358b = new HashMap();
        }
    }

    public /* synthetic */ PreloadInfo(Builder builder, int i5) {
        this(builder);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, 0);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f11356b;
    }

    public String getTrackingId() {
        return this.f11355a;
    }

    private PreloadInfo(Builder builder) {
        this.f11355a = builder.f11357a;
        this.f11356b = CollectionUtils.unmodifiableMapCopy(builder.f11358b);
    }
}
