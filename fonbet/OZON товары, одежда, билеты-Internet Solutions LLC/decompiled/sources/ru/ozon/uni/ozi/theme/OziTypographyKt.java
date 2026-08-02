package ru.ozon.uni.ozi.theme;

import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001b\u0010\u0005\u001a\u00020\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"'\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/uni/ozi/theme/OziTypography;", "defaultOziTypography$delegate", "LSc/j;", "getDefaultOziTypography", "()Lru/ozon/uni/ozi/theme/OziTypography;", "defaultOziTypography", "", "", "LK1/T;", "oziTypographyMap$delegate", "getOziTypographyMap", "()Ljava/util/Map;", "oziTypographyMap", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziTypographyKt {

    @NotNull
    private static final InterfaceC4008j defaultOziTypography$delegate = k.b(OziTypographyKt$defaultOziTypography$2.INSTANCE);

    @NotNull
    private static final InterfaceC4008j oziTypographyMap$delegate = k.b(OziTypographyKt$oziTypographyMap$2.INSTANCE);

    @NotNull
    public static final OziTypography getDefaultOziTypography() {
        return (OziTypography) defaultOziTypography$delegate.getValue();
    }
}
