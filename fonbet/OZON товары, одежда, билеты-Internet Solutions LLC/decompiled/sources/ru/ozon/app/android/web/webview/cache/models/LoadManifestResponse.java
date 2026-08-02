package ru.ozon.app.android.web.webview.cache.models;

import H3.c;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/web/webview/cache/models/LoadManifestResponse;", "", "manifest", "Lru/ozon/app/android/web/webview/cache/models/LoadManifestResponse$Manifest;", "<init>", "(Lru/ozon/app/android/web/webview/cache/models/LoadManifestResponse$Manifest;)V", "getManifest", "()Lru/ozon/app/android/web/webview/cache/models/LoadManifestResponse$Manifest;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Manifest", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LoadManifestResponse {

    @NotNull
    private final Manifest manifest;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/web/webview/cache/models/LoadManifestResponse$Manifest;", "", "appVersion", "", "cache", "Lru/ozon/app/android/web/webview/cache/models/LoadManifestResponse$Manifest$Cache;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/web/webview/cache/models/LoadManifestResponse$Manifest$Cache;)V", "getAppVersion", "()Ljava/lang/String;", "getCache", "()Lru/ozon/app/android/web/webview/cache/models/LoadManifestResponse$Manifest$Cache;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Cache", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Manifest {

        @NotNull
        private final String appVersion;

        @NotNull
        private final Cache cache;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/web/webview/cache/models/LoadManifestResponse$Manifest$Cache;", "", "resources", "", "", "<init>", "(Ljava/util/List;)V", "getResources", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Cache {

            @NotNull
            private final List<String> resources;

            public Cache(@NotNull List<String> resources) {
                Intrinsics.checkNotNullParameter(resources, "resources");
                this.resources = resources;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Cache copy$default(Cache cache, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = cache.resources;
                }
                return cache.copy(list);
            }

            @NotNull
            public final List<String> component1() {
                return this.resources;
            }

            @NotNull
            public final Cache copy(@NotNull List<String> resources) {
                Intrinsics.checkNotNullParameter(resources, "resources");
                return new Cache(resources);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Cache) && Intrinsics.d(this.resources, ((Cache) other).resources);
            }

            @NotNull
            public final List<String> getResources() {
                return this.resources;
            }

            public int hashCode() {
                return this.resources.hashCode();
            }

            @NotNull
            public String toString() {
                return c.a("Cache(resources=", ")", this.resources);
            }
        }

        public Manifest(@i(name = "app_version") @NotNull String appVersion, @NotNull Cache cache) {
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(cache, "cache");
            this.appVersion = appVersion;
            this.cache = cache;
        }

        public static /* synthetic */ Manifest copy$default(Manifest manifest, String str, Cache cache, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = manifest.appVersion;
            }
            if ((i11 & 2) != 0) {
                cache = manifest.cache;
            }
            return manifest.copy(str, cache);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getAppVersion() {
            return this.appVersion;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Cache getCache() {
            return this.cache;
        }

        @NotNull
        public final Manifest copy(@i(name = "app_version") @NotNull String appVersion, @NotNull Cache cache) {
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(cache, "cache");
            return new Manifest(appVersion, cache);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Manifest)) {
                return false;
            }
            Manifest manifest = (Manifest) other;
            return Intrinsics.d(this.appVersion, manifest.appVersion) && Intrinsics.d(this.cache, manifest.cache);
        }

        @NotNull
        public final String getAppVersion() {
            return this.appVersion;
        }

        @NotNull
        public final Cache getCache() {
            return this.cache;
        }

        public int hashCode() {
            return this.cache.hashCode() + (this.appVersion.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Manifest(appVersion=" + this.appVersion + ", cache=" + this.cache + ")";
        }
    }

    public LoadManifestResponse(@NotNull Manifest manifest) {
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        this.manifest = manifest;
    }

    public static /* synthetic */ LoadManifestResponse copy$default(LoadManifestResponse loadManifestResponse, Manifest manifest, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            manifest = loadManifestResponse.manifest;
        }
        return loadManifestResponse.copy(manifest);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Manifest getManifest() {
        return this.manifest;
    }

    @NotNull
    public final LoadManifestResponse copy(@NotNull Manifest manifest) {
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        return new LoadManifestResponse(manifest);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LoadManifestResponse) && Intrinsics.d(this.manifest, ((LoadManifestResponse) other).manifest);
    }

    @NotNull
    public final Manifest getManifest() {
        return this.manifest;
    }

    public int hashCode() {
        return this.manifest.hashCode();
    }

    @NotNull
    public String toString() {
        return "LoadManifestResponse(manifest=" + this.manifest + ")";
    }
}
