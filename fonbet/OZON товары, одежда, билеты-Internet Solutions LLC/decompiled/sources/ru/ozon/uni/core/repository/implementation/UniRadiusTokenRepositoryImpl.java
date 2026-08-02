package ru.ozon.uni.core.repository.implementation;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniRadiusToken;
import ru.ozon.uni.core.repository.UniRadiusTokenRepository;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0017\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u001d\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u001f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\fR\u001a\u0010!\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\fR\u001a\u0010#\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lru/ozon/uni/core/repository/implementation/UniRadiusTokenRepositoryImpl;", "Lru/ozon/uni/core/repository/UniRadiusTokenRepository;", "<init>", "()V", "", "tokenId", "Lru/ozon/uni/core/models/UniRadiusToken;", "getById", "(Ljava/lang/String;)Lru/ozon/uni/core/models/UniRadiusToken;", DevicePublicKeyStringDef.NONE, "Lru/ozon/uni/core/models/UniRadiusToken;", "getNone", "()Lru/ozon/uni/core/models/UniRadiusToken;", "radius200", "getRadius200", "radius250", "getRadius250", "radius300", "getRadius300", "radius350", "getRadius350", "radius400", "getRadius400", "radius450", "getRadius450", "radius500", "getRadius500", "radius525", "getRadius525", "radius550", "getRadius550", "radius600", "getRadius600", "radius650", "getRadius650", "radius700", "getRadius700", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UniRadiusTokenRepositoryImpl implements UniRadiusTokenRepository {

    @NotNull
    public static final UniRadiusTokenRepositoryImpl INSTANCE = new UniRadiusTokenRepositoryImpl();

    @NotNull
    private static final UniRadiusToken none = new UniRadiusToken("NONE");

    @NotNull
    private static final UniRadiusToken radius200 = new UniRadiusToken("RADIUS_200");

    @NotNull
    private static final UniRadiusToken radius250 = new UniRadiusToken("RADIUS_250");

    @NotNull
    private static final UniRadiusToken radius300 = new UniRadiusToken("RADIUS_300");

    @NotNull
    private static final UniRadiusToken radius350 = new UniRadiusToken("RADIUS_350");

    @NotNull
    private static final UniRadiusToken radius400 = new UniRadiusToken("RADIUS_400");

    @NotNull
    private static final UniRadiusToken radius450 = new UniRadiusToken("RADIUS_450");

    @NotNull
    private static final UniRadiusToken radius500 = new UniRadiusToken("RADIUS_500");

    @NotNull
    private static final UniRadiusToken radius525 = new UniRadiusToken("RADIUS_525");

    @NotNull
    private static final UniRadiusToken radius550 = new UniRadiusToken("RADIUS_550");

    @NotNull
    private static final UniRadiusToken radius600 = new UniRadiusToken("RADIUS_600");

    @NotNull
    private static final UniRadiusToken radius650 = new UniRadiusToken("RADIUS_650");

    @NotNull
    private static final UniRadiusToken radius700 = new UniRadiusToken("RADIUS_700");

    private UniRadiusTokenRepositoryImpl() {
    }

    @Override // ru.ozon.uni.core.repository.UniRadiusTokenRepository
    @NotNull
    public UniRadiusToken getNone() {
        return none;
    }

    @Override // ru.ozon.uni.core.repository.UniRadiusTokenRepository
    @NotNull
    public UniRadiusToken getRadius200() {
        return radius200;
    }

    @Override // ru.ozon.uni.core.repository.UniRadiusTokenRepository
    @NotNull
    public UniRadiusToken getRadius250() {
        return radius250;
    }

    @Override // ru.ozon.uni.core.repository.UniRadiusTokenRepository
    @NotNull
    public UniRadiusToken getRadius300() {
        return radius300;
    }

    @Override // ru.ozon.uni.core.repository.UniRadiusTokenRepository
    @NotNull
    public UniRadiusToken getRadius350() {
        return radius350;
    }

    @Override // ru.ozon.uni.core.repository.UniRadiusTokenRepository
    @NotNull
    public UniRadiusToken getRadius400() {
        return radius400;
    }

    @Override // ru.ozon.uni.core.repository.UniRadiusTokenRepository
    @NotNull
    public UniRadiusToken getRadius450() {
        return radius450;
    }

    @Override // ru.ozon.uni.core.repository.UniRadiusTokenRepository
    @NotNull
    public UniRadiusToken getRadius500() {
        return radius500;
    }

    @Override // ru.ozon.uni.core.repository.UniRadiusTokenRepository
    @NotNull
    public UniRadiusToken getRadius525() {
        return radius525;
    }

    @Override // ru.ozon.uni.core.repository.UniRadiusTokenRepository
    @NotNull
    public UniRadiusToken getRadius550() {
        return radius550;
    }

    @Override // ru.ozon.uni.core.repository.UniRadiusTokenRepository
    @NotNull
    public UniRadiusToken getRadius600() {
        return radius600;
    }

    @Override // ru.ozon.uni.core.repository.UniRadiusTokenRepository
    @NotNull
    public UniRadiusToken getRadius650() {
        return radius650;
    }

    @Override // ru.ozon.uni.core.repository.UniRadiusTokenRepository
    @NotNull
    public UniRadiusToken getRadius700() {
        return radius700;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.ozon.uni.core.repository.UniTokenRepository
    public UniRadiusToken getById(@NotNull String tokenId) {
        Map map;
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        map = UniRadiusTokenRepositoryImplKt.tokenMap;
        return (UniRadiusToken) map.get(tokenId);
    }
}
