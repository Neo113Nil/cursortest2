package ru.ozon.mapsdk.common.geoproxy.model;

import B0.A0;
import Fb0.e;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/model/GeoProxyApiHost;", "Lru/ozon/mapsdk/common/geoproxy/model/ApiHost;", "", ImagesContract.URL, "", "isStage", "<init>", "(Ljava/lang/String;Z)V", "LFb0/e;", "base", "(LFb0/e;)V", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "Z", "()Z", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GeoProxyApiHost implements ApiHost {
    private final boolean isStage;

    @NotNull
    private final String url;

    private GeoProxyApiHost(String str, boolean z11) {
        this.url = str;
        this.isStage = z11;
    }

    @Override // ru.ozon.mapsdk.common.geoproxy.model.ApiHost
    @NotNull
    public String getUrl() {
        return this.url;
    }

    @Override // ru.ozon.mapsdk.common.geoproxy.model.ApiHost
    /* renamed from: isStage, reason: from getter */
    public boolean getIsStage() {
        return this.isStage;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GeoProxyApiHost(@NotNull e base) {
        this(r0, base.n());
        String b11;
        Intrinsics.checkNotNullParameter(base, "base");
        if (base.n()) {
            b11 = A0.b("https://maps-geoproxy-latest-stg.", base.j(), "/");
        } else {
            b11 = A0.b("https://geoproxy.", base.j(), "/");
        }
    }
}
