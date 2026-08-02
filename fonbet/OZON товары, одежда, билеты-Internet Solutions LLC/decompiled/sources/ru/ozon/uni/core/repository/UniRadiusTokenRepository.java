package ru.ozon.uni.core.repository;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniRadiusToken;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0004¨\u0006\u001e"}, d2 = {"Lru/ozon/uni/core/repository/UniRadiusTokenRepository;", "Lru/ozon/uni/core/repository/UniTokenRepository;", "Lru/ozon/uni/core/models/UniRadiusToken;", "getNone", "()Lru/ozon/uni/core/models/UniRadiusToken;", DevicePublicKeyStringDef.NONE, "getRadius200", "radius200", "getRadius250", "radius250", "getRadius300", "radius300", "getRadius350", "radius350", "getRadius400", "radius400", "getRadius450", "radius450", "getRadius500", "radius500", "getRadius525", "radius525", "getRadius550", "radius550", "getRadius600", "radius600", "getRadius650", "radius650", "getRadius700", "radius700", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface UniRadiusTokenRepository extends UniTokenRepository<UniRadiusToken> {
    @NotNull
    UniRadiusToken getNone();

    @NotNull
    UniRadiusToken getRadius200();

    @NotNull
    UniRadiusToken getRadius250();

    @NotNull
    UniRadiusToken getRadius300();

    @NotNull
    UniRadiusToken getRadius350();

    @NotNull
    UniRadiusToken getRadius400();

    @NotNull
    UniRadiusToken getRadius450();

    @NotNull
    UniRadiusToken getRadius500();

    @NotNull
    UniRadiusToken getRadius525();

    @NotNull
    UniRadiusToken getRadius550();

    @NotNull
    UniRadiusToken getRadius600();

    @NotNull
    UniRadiusToken getRadius650();

    @NotNull
    UniRadiusToken getRadius700();
}
