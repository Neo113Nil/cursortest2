package ru.ozon.uni.ozi.theme;

import K1.T;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/ozi/theme/OziTypography;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziTypographyKt$defaultOziTypography$2 extends AbstractC7737t implements Function0<OziTypography> {
    public static final OziTypographyKt$defaultOziTypography$2 INSTANCE = new OziTypographyKt$defaultOziTypography$2();

    OziTypographyKt$defaultOziTypography$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final OziTypography invoke() {
        UniTheme uniTheme = UniTheme.INSTANCE;
        T headline400Small = uniTheme.getTypography().getHeadline400Small();
        T headline500Medium = uniTheme.getTypography().getHeadline500Medium();
        T headline600Large = uniTheme.getTypography().getHeadline600Large();
        T headline700XLarge = uniTheme.getTypography().getHeadline700XLarge();
        T headline800XxLarge = uniTheme.getTypography().getHeadline800XxLarge();
        T headline300XSmall = uniTheme.getTypography().getHeadline300XSmall();
        T headlineNumeric700XLarge = uniTheme.getTypography().getHeadlineNumeric700XLarge();
        T headlineNumeric800XxLarge = uniTheme.getTypography().getHeadlineNumeric800XxLarge();
        T headlinePromo400Small = uniTheme.getTypography().getHeadlinePromo400Small();
        T headlinePromo500Medium = uniTheme.getTypography().getHeadlinePromo500Medium();
        T headline400Small2 = uniTheme.getTypography().getHeadline400Small();
        T body200XSmall = uniTheme.getTypography().getBody200XSmall();
        T body300XSmall = uniTheme.getTypography().getBody300XSmall();
        T body400Large = uniTheme.getTypography().getBody400Large();
        T body500Medium = uniTheme.getTypography().getBody500Medium();
        T bodyAccent300XSmall = uniTheme.getTypography().getBodyAccent300XSmall();
        T bodyAccent400Small = uniTheme.getTypography().getBodyAccent400Small();
        T bodyAccent500Medium = uniTheme.getTypography().getBodyAccent500Medium();
        T bodyAccent250Caption = uniTheme.getTypography().getBodyAccent250Caption();
        T bodyControl300XSmall = uniTheme.getTypography().getBodyControl300XSmall();
        T bodyControl400Small = uniTheme.getTypography().getBodyControl400Small();
        T bodyControl500Medium = uniTheme.getTypography().getBodyControl500Medium();
        T bodyControl600Large = uniTheme.getTypography().getBodyControl600Large();
        T bodyControl700XLarge = uniTheme.getTypography().getBodyControl700XLarge();
        T bodyNumeric300XSmall = uniTheme.getTypography().getBodyNumeric300XSmall();
        T bodyNumeric400Small = uniTheme.getTypography().getBodyNumeric400Small();
        T bodyNumeric500Medium = uniTheme.getTypography().getBodyNumeric500Medium();
        T bodyControl300XSmall2 = uniTheme.getTypography().getBodyControl300XSmall();
        T compact300XSmall = uniTheme.getTypography().getCompact300XSmall();
        T compact400Small = uniTheme.getTypography().getCompact400Small();
        T compact500Medium = uniTheme.getTypography().getCompact500Medium();
        T compactControl300XSmall = uniTheme.getTypography().getCompactControl300XSmall();
        T compactControl400Small = uniTheme.getTypography().getCompactControl400Small();
        T headlinePromo400Small2 = uniTheme.getTypography().getHeadlinePromo400Small();
        T keyPromo500Medium = uniTheme.getTypography().getKeyPromo500Medium();
        return new OziTypography(headline800XxLarge, headline700XLarge, headline600Large, headline500Medium, headline400Small, headline300XSmall, headlineNumeric800XxLarge, headlineNumeric700XLarge, headlinePromo500Medium, headlinePromo400Small, headline400Small2, body500Medium, body400Large, body300XSmall, body200XSmall, bodyAccent500Medium, bodyAccent400Small, bodyAccent300XSmall, bodyAccent250Caption, bodyControl700XLarge, bodyControl600Large, bodyControl500Medium, bodyControl400Small, bodyControl300XSmall, bodyNumeric500Medium, bodyNumeric400Small, bodyNumeric300XSmall, bodyControl300XSmall2, compact500Medium, compact400Small, compact300XSmall, headlinePromo400Small2, compactControl400Small, compactControl300XSmall, uniTheme.getTypography().getKeyPromo700XLarge(), uniTheme.getTypography().getKeyPromo600XLarge(), keyPromo500Medium, uniTheme.getTypography().getKeyPromo800Small());
    }
}
