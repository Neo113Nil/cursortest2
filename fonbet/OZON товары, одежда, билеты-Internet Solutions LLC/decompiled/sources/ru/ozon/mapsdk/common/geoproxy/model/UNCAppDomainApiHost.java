package ru.ozon.mapsdk.common.geoproxy.model;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/model/UNCAppDomainApiHost;", "Lru/ozon/mapsdk/common/geoproxy/model/ApiHost;", ImagesContract.URL, "", "isStage", "", "<init>", "(Ljava/lang/String;Z)V", "isStaging", "domain", "(ZLjava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "()Z", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UNCAppDomainApiHost implements ApiHost {
    private final boolean isStage;

    @NotNull
    private final String url;

    private UNCAppDomainApiHost(String str, boolean z11) {
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UNCAppDomainApiHost(boolean z11, @NotNull String domain) {
        this("https://" + domain + "/api/composer-api.bx/_action/", z11);
        Intrinsics.checkNotNullParameter(domain, "domain");
    }
}
