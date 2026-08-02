package ru.ozon.uni.core.repository;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniPaddingToken;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0004R\u0014\u0010!\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0004R\u0014\u0010#\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0004R\u0014\u0010%\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0004R\u0014\u0010'\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0004¨\u0006("}, d2 = {"Lru/ozon/uni/core/repository/UniPaddingTokenRepository;", "Lru/ozon/uni/core/repository/UniTokenRepository;", "Lru/ozon/uni/core/models/UniPaddingToken;", "getNone", "()Lru/ozon/uni/core/models/UniPaddingToken;", DevicePublicKeyStringDef.NONE, "getPadding100", "padding100", "getPadding200", "padding200", "getPadding250", "padding250", "getPadding300", "padding300", "getPadding350", "padding350", "getPadding400", "padding400", "getPadding450", "padding450", "getPadding500", "padding500", "getPadding550", "padding550", "getPadding600", "padding600", "getPadding700", "padding700", "getPadding800", "padding800", "getPadding900", "padding900", "getPadding950", "padding950", "getPadding1000", "padding1000", "getPadding1050", "padding1050", "getPadding1100", "padding1100", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface UniPaddingTokenRepository extends UniTokenRepository<UniPaddingToken> {
    @NotNull
    UniPaddingToken getNone();

    @NotNull
    UniPaddingToken getPadding100();

    @NotNull
    UniPaddingToken getPadding1000();

    @NotNull
    UniPaddingToken getPadding1050();

    @NotNull
    UniPaddingToken getPadding1100();

    @NotNull
    UniPaddingToken getPadding200();

    @NotNull
    UniPaddingToken getPadding250();

    @NotNull
    UniPaddingToken getPadding300();

    @NotNull
    UniPaddingToken getPadding350();

    @NotNull
    UniPaddingToken getPadding400();

    @NotNull
    UniPaddingToken getPadding450();

    @NotNull
    UniPaddingToken getPadding500();

    @NotNull
    UniPaddingToken getPadding550();

    @NotNull
    UniPaddingToken getPadding600();

    @NotNull
    UniPaddingToken getPadding700();

    @NotNull
    UniPaddingToken getPadding800();

    @NotNull
    UniPaddingToken getPadding900();

    @NotNull
    UniPaddingToken getPadding950();
}
