package ru.ozon.uni.ozi.theme;

import K1.T;
import Tc.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "LK1/T;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziTypographyKt$oziTypographyMap$2 extends AbstractC7737t implements Function0<Map<String, ? extends T>> {
    public static final OziTypographyKt$oziTypographyMap$2 INSTANCE = new OziTypographyKt$oziTypographyMap$2();

    OziTypographyKt$oziTypographyMap$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends T> invoke() {
        d builder = new d();
        builder.put("headline800", OziTypographyKt.getDefaultOziTypography().getHeadline800());
        builder.put("headline700", OziTypographyKt.getDefaultOziTypography().getHeadline700());
        builder.put("headline600", OziTypographyKt.getDefaultOziTypography().getHeadline600());
        builder.put("headline500", OziTypographyKt.getDefaultOziTypography().getHeadline500());
        builder.put("headline400", OziTypographyKt.getDefaultOziTypography().getHeadline400());
        builder.put("headline300Caption", OziTypographyKt.getDefaultOziTypography().getHeadline300Caption());
        builder.put("headlineNumeric800", OziTypographyKt.getDefaultOziTypography().getHeadlineNumeric800());
        builder.put("headlineNumeric700", OziTypographyKt.getDefaultOziTypography().getHeadlineNumeric700());
        builder.put("headlinePromo500", OziTypographyKt.getDefaultOziTypography().getHeadlinePromo500());
        builder.put("headlinePromo400", OziTypographyKt.getDefaultOziTypography().getHeadlinePromo400());
        builder.put("headlineCompact400", OziTypographyKt.getDefaultOziTypography().getHeadlineCompact400());
        builder.put("body500", OziTypographyKt.getDefaultOziTypography().getBody500());
        builder.put("body400", OziTypographyKt.getDefaultOziTypography().getBody400());
        builder.put("body300", OziTypographyKt.getDefaultOziTypography().getBody300());
        builder.put("body200", OziTypographyKt.getDefaultOziTypography().getBody200());
        builder.put("bodyAccent500", OziTypographyKt.getDefaultOziTypography().getBodyAccent500());
        builder.put("bodyAccent400", OziTypographyKt.getDefaultOziTypography().getBodyAccent400());
        builder.put("bodyAccent300", OziTypographyKt.getDefaultOziTypography().getBodyAccent300());
        builder.put("bodyAccent250Caption", OziTypographyKt.getDefaultOziTypography().getBodyAccent250Caption());
        builder.put("bodyControl700", OziTypographyKt.getDefaultOziTypography().getBodyControl700());
        builder.put("bodyControl600", OziTypographyKt.getDefaultOziTypography().getBodyControl600());
        builder.put("bodyControl500", OziTypographyKt.getDefaultOziTypography().getBodyControl500());
        builder.put("bodyControl400", OziTypographyKt.getDefaultOziTypography().getBodyControl400());
        builder.put("bodyControl300", OziTypographyKt.getDefaultOziTypography().getBodyControl300());
        builder.put("bodyNumeric500", OziTypographyKt.getDefaultOziTypography().getBodyNumeric500());
        builder.put("bodyNumeric400", OziTypographyKt.getDefaultOziTypography().getBodyNumeric400());
        builder.put("bodyNumeric300", OziTypographyKt.getDefaultOziTypography().getBodyNumeric300());
        builder.put("bodyPromo300", OziTypographyKt.getDefaultOziTypography().getBodyPromo300());
        builder.put("compact500", OziTypographyKt.getDefaultOziTypography().getCompact500());
        builder.put("compact400", OziTypographyKt.getDefaultOziTypography().getCompact400());
        builder.put("compact300", OziTypographyKt.getDefaultOziTypography().getCompact300());
        builder.put("compactControl500", OziTypographyKt.getDefaultOziTypography().getCompactControl500());
        builder.put("compactControl400", OziTypographyKt.getDefaultOziTypography().getCompactControl400());
        builder.put("compactControl300", OziTypographyKt.getDefaultOziTypography().getCompactControl300());
        builder.put("keyPromo700", OziTypographyKt.getDefaultOziTypography().getKeyPromo700());
        builder.put("keyPromo600", OziTypographyKt.getDefaultOziTypography().getKeyPromo600());
        builder.put("keyPromo500", OziTypographyKt.getDefaultOziTypography().getKeyPromo500());
        builder.put("key600", OziTypographyKt.getDefaultOziTypography().getKey600());
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.u();
    }
}
