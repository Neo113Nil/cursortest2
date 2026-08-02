package ru.ozon.uni.core.repository.implementation;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniPaddingToken;
import ru.ozon.uni.core.repository.UniPaddingTokenRepository;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0017\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u001d\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u001f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\fR\u001a\u0010!\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\fR\u001a\u0010#\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010\fR\u001a\u0010%\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b&\u0010\fR\u001a\u0010'\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\n\u001a\u0004\b(\u0010\fR\u001a\u0010)\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b*\u0010\fR\u001a\u0010+\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b,\u0010\fR\u001a\u0010-\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b.\u0010\f¨\u0006/"}, d2 = {"Lru/ozon/uni/core/repository/implementation/UniPaddingTokenRepositoryImpl;", "Lru/ozon/uni/core/repository/UniPaddingTokenRepository;", "<init>", "()V", "", "tokenId", "Lru/ozon/uni/core/models/UniPaddingToken;", "getById", "(Ljava/lang/String;)Lru/ozon/uni/core/models/UniPaddingToken;", DevicePublicKeyStringDef.NONE, "Lru/ozon/uni/core/models/UniPaddingToken;", "getNone", "()Lru/ozon/uni/core/models/UniPaddingToken;", "padding100", "getPadding100", "padding200", "getPadding200", "padding250", "getPadding250", "padding300", "getPadding300", "padding350", "getPadding350", "padding400", "getPadding400", "padding450", "getPadding450", "padding500", "getPadding500", "padding550", "getPadding550", "padding600", "getPadding600", "padding700", "getPadding700", "padding800", "getPadding800", "padding900", "getPadding900", "padding950", "getPadding950", "padding1000", "getPadding1000", "padding1050", "getPadding1050", "padding1100", "getPadding1100", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UniPaddingTokenRepositoryImpl implements UniPaddingTokenRepository {

    @NotNull
    public static final UniPaddingTokenRepositoryImpl INSTANCE = new UniPaddingTokenRepositoryImpl();

    @NotNull
    private static final UniPaddingToken none = new UniPaddingToken("NONE");

    @NotNull
    private static final UniPaddingToken padding100 = new UniPaddingToken("PADDING_100");

    @NotNull
    private static final UniPaddingToken padding200 = new UniPaddingToken("PADDING_200");

    @NotNull
    private static final UniPaddingToken padding250 = new UniPaddingToken("PADDING_250");

    @NotNull
    private static final UniPaddingToken padding300 = new UniPaddingToken("PADDING_300");

    @NotNull
    private static final UniPaddingToken padding350 = new UniPaddingToken("PADDING_350");

    @NotNull
    private static final UniPaddingToken padding400 = new UniPaddingToken("PADDING_400");

    @NotNull
    private static final UniPaddingToken padding450 = new UniPaddingToken("PADDING_450");

    @NotNull
    private static final UniPaddingToken padding500 = new UniPaddingToken("PADDING_500");

    @NotNull
    private static final UniPaddingToken padding550 = new UniPaddingToken("PADDING_550");

    @NotNull
    private static final UniPaddingToken padding600 = new UniPaddingToken("PADDING_600");

    @NotNull
    private static final UniPaddingToken padding700 = new UniPaddingToken("PADDING_700");

    @NotNull
    private static final UniPaddingToken padding800 = new UniPaddingToken("PADDING_800");

    @NotNull
    private static final UniPaddingToken padding900 = new UniPaddingToken("PADDING_900");

    @NotNull
    private static final UniPaddingToken padding950 = new UniPaddingToken("PADDING_950");

    @NotNull
    private static final UniPaddingToken padding1000 = new UniPaddingToken("PADDING_1000");

    @NotNull
    private static final UniPaddingToken padding1050 = new UniPaddingToken("PADDING_1050");

    @NotNull
    private static final UniPaddingToken padding1100 = new UniPaddingToken("PADDING_1100");

    private UniPaddingTokenRepositoryImpl() {
    }

    @Override // ru.ozon.uni.core.repository.UniPaddingTokenRepository
    @NotNull
    public UniPaddingToken getNone() {
        return none;
    }

    @Override // ru.ozon.uni.core.repository.UniPaddingTokenRepository
    @NotNull
    public UniPaddingToken getPadding100() {
        return padding100;
    }

    @Override // ru.ozon.uni.core.repository.UniPaddingTokenRepository
    @NotNull
    public UniPaddingToken getPadding1000() {
        return padding1000;
    }

    @Override // ru.ozon.uni.core.repository.UniPaddingTokenRepository
    @NotNull
    public UniPaddingToken getPadding1050() {
        return padding1050;
    }

    @Override // ru.ozon.uni.core.repository.UniPaddingTokenRepository
    @NotNull
    public UniPaddingToken getPadding1100() {
        return padding1100;
    }

    @Override // ru.ozon.uni.core.repository.UniPaddingTokenRepository
    @NotNull
    public UniPaddingToken getPadding200() {
        return padding200;
    }

    @Override // ru.ozon.uni.core.repository.UniPaddingTokenRepository
    @NotNull
    public UniPaddingToken getPadding250() {
        return padding250;
    }

    @Override // ru.ozon.uni.core.repository.UniPaddingTokenRepository
    @NotNull
    public UniPaddingToken getPadding300() {
        return padding300;
    }

    @Override // ru.ozon.uni.core.repository.UniPaddingTokenRepository
    @NotNull
    public UniPaddingToken getPadding350() {
        return padding350;
    }

    @Override // ru.ozon.uni.core.repository.UniPaddingTokenRepository
    @NotNull
    public UniPaddingToken getPadding400() {
        return padding400;
    }

    @Override // ru.ozon.uni.core.repository.UniPaddingTokenRepository
    @NotNull
    public UniPaddingToken getPadding450() {
        return padding450;
    }

    @Override // ru.ozon.uni.core.repository.UniPaddingTokenRepository
    @NotNull
    public UniPaddingToken getPadding500() {
        return padding500;
    }

    @Override // ru.ozon.uni.core.repository.UniPaddingTokenRepository
    @NotNull
    public UniPaddingToken getPadding550() {
        return padding550;
    }

    @Override // ru.ozon.uni.core.repository.UniPaddingTokenRepository
    @NotNull
    public UniPaddingToken getPadding600() {
        return padding600;
    }

    @Override // ru.ozon.uni.core.repository.UniPaddingTokenRepository
    @NotNull
    public UniPaddingToken getPadding700() {
        return padding700;
    }

    @Override // ru.ozon.uni.core.repository.UniPaddingTokenRepository
    @NotNull
    public UniPaddingToken getPadding800() {
        return padding800;
    }

    @Override // ru.ozon.uni.core.repository.UniPaddingTokenRepository
    @NotNull
    public UniPaddingToken getPadding900() {
        return padding900;
    }

    @Override // ru.ozon.uni.core.repository.UniPaddingTokenRepository
    @NotNull
    public UniPaddingToken getPadding950() {
        return padding950;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.ozon.uni.core.repository.UniTokenRepository
    public UniPaddingToken getById(@NotNull String tokenId) {
        Map map;
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        map = UniPaddingTokenRepositoryImplKt.tokenMap;
        return (UniPaddingToken) map.get(tokenId);
    }
}
