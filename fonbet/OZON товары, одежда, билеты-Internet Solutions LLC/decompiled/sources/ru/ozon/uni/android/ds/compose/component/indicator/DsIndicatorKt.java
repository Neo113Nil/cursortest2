package ru.ozon.uni.android.ds.compose.component.indicator;

import A0.g;
import A0.h;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.foundation.components.indicator.FoundationIndicatorKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\r\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0014\u001a\u00020\u0011*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorSize;", "size", "Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorStyle;", "style", "", "text", "Lq1/b;", "icon", "", "DsIndicator", "(Landroidx/compose/ui/e;Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorSize;Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorStyle;Ljava/lang/String;Lq1/b;LS0/k;II)V", "takeIconIf", "(Lq1/b;Ljava/lang/String;Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorSize;)Lq1/b;", "takeTextIf", "(Ljava/lang/String;Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorSize;)Ljava/lang/String;", "LZ1/h;", "getTextHorizontalPadding", "(Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorSize;)F", "textHorizontalPadding", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsIndicatorKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsIndicator(e eVar, DsIndicatorSize dsIndicatorSize, DsIndicatorStyle dsIndicatorStyle, String str, AbstractC8972b abstractC8972b, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        DsIndicatorSize dsIndicatorSize2;
        DsIndicatorStyle dsIndicatorStyle2;
        int i14;
        String str2;
        int i15;
        AbstractC8972b abstractC8972b2;
        e eVar3;
        DsIndicatorSize dsIndicatorSize3;
        DsIndicatorStyle accent;
        String str3;
        AbstractC8972b abstractC8972b3;
        C3969l c3969l;
        J0 m02;
        int i16;
        C3969l u11 = interfaceC3967k.u(16311158);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        int i18 = i12 & 2;
        if (i18 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            dsIndicatorSize2 = dsIndicatorSize;
            i13 |= u11.n(dsIndicatorSize2) ? 32 : 16;
            if ((i11 & 384) != 0) {
                if ((i12 & 4) == 0) {
                    dsIndicatorStyle2 = dsIndicatorStyle;
                    if (u11.n(dsIndicatorStyle2)) {
                        i16 = 256;
                        i13 |= i16;
                    }
                } else {
                    dsIndicatorStyle2 = dsIndicatorStyle;
                }
                i16 = UserVerificationMethods.USER_VERIFY_PATTERN;
                i13 |= i16;
            } else {
                dsIndicatorStyle2 = dsIndicatorStyle;
            }
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                str2 = str;
                i13 |= u11.n(str2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                i15 = i12 & 16;
                if (i15 != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    abstractC8972b2 = abstractC8972b;
                    i13 |= u11.n(abstractC8972b2) ? 16384 : 8192;
                    if ((i13 & 9363) == 9362 || !u11.b()) {
                        u11.Q0();
                        if ((i11 & 1) != 0 || u11.w0()) {
                            eVar3 = i17 == 0 ? e.f40358c0 : eVar2;
                            dsIndicatorSize3 = i18 == 0 ? DsIndicatorSize.Size500 : dsIndicatorSize2;
                            accent = (i12 & 4) == 0 ? DsIndicatorStyle.INSTANCE.accent(u11, 6) : dsIndicatorStyle2;
                            if (i14 != 0) {
                                str2 = null;
                            }
                            str3 = str2;
                            if (i15 != 0) {
                                abstractC8972b3 = null;
                                u11.j0();
                                g b11 = h.b(dsIndicatorSize3.getCornerRadius());
                                String takeTextIf = takeTextIf(str3, dsIndicatorSize3);
                                AbstractC8972b takeIconIf = takeIconIf(abstractC8972b3, takeTextIf, dsIndicatorSize3);
                                float m1838getDp0D9Ej5fM = (takeTextIf != null || takeTextIf.length() == 0) ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : getTextHorizontalPadding(dsIndicatorSize3);
                                e x11 = a0.x(eVar3, null, 3);
                                e.a aVar = e.f40358c0;
                                c3969l = u11;
                                FoundationIndicatorKt.m3002FoundationIndicatorgSnA9MM(x11, aVar, a0.h(aVar, 0.0f, dsIndicatorSize3.getSize(), 1), accent.getBackgroundColor(), b11, dsIndicatorSize3.getSize(), takeIconIf, accent.getIconColor(), m1838getDp0D9Ej5fM, dsIndicatorSize3.getSize(), takeTextIf, accent.getTextColor(), dsIndicatorSize3.getTextStyle(), c3969l, 48, 0);
                            }
                        } else {
                            u11.j();
                            eVar3 = eVar2;
                            dsIndicatorSize3 = dsIndicatorSize2;
                            accent = dsIndicatorStyle2;
                            str3 = str2;
                        }
                        abstractC8972b3 = abstractC8972b2;
                        u11.j0();
                        g b112 = h.b(dsIndicatorSize3.getCornerRadius());
                        String takeTextIf2 = takeTextIf(str3, dsIndicatorSize3);
                        AbstractC8972b takeIconIf2 = takeIconIf(abstractC8972b3, takeTextIf2, dsIndicatorSize3);
                        float m1838getDp0D9Ej5fM2 = (takeTextIf2 != null || takeTextIf2.length() == 0) ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : getTextHorizontalPadding(dsIndicatorSize3);
                        e x112 = a0.x(eVar3, null, 3);
                        e.a aVar2 = e.f40358c0;
                        c3969l = u11;
                        FoundationIndicatorKt.m3002FoundationIndicatorgSnA9MM(x112, aVar2, a0.h(aVar2, 0.0f, dsIndicatorSize3.getSize(), 1), accent.getBackgroundColor(), b112, dsIndicatorSize3.getSize(), takeIconIf2, accent.getIconColor(), m1838getDp0D9Ej5fM2, dsIndicatorSize3.getSize(), takeTextIf2, accent.getTextColor(), dsIndicatorSize3.getTextStyle(), c3969l, 48, 0);
                    } else {
                        u11.j();
                        c3969l = u11;
                        eVar3 = eVar2;
                        dsIndicatorSize3 = dsIndicatorSize2;
                        accent = dsIndicatorStyle2;
                        str3 = str2;
                        abstractC8972b3 = abstractC8972b2;
                    }
                    m02 = c3969l.m0();
                    if (m02 == null) {
                        m02.G(new DsIndicatorKt$DsIndicator$1(eVar3, dsIndicatorSize3, accent, str3, abstractC8972b3, i11, i12));
                        return;
                    }
                    return;
                }
                abstractC8972b2 = abstractC8972b;
                if ((i13 & 9363) == 9362) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if ((i12 & 4) == 0) {
                }
                if (i14 != 0) {
                }
                str3 = str2;
                if (i15 != 0) {
                }
                abstractC8972b3 = abstractC8972b2;
                u11.j0();
                g b1122 = h.b(dsIndicatorSize3.getCornerRadius());
                String takeTextIf22 = takeTextIf(str3, dsIndicatorSize3);
                AbstractC8972b takeIconIf22 = takeIconIf(abstractC8972b3, takeTextIf22, dsIndicatorSize3);
                float m1838getDp0D9Ej5fM22 = (takeTextIf22 != null || takeTextIf22.length() == 0) ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : getTextHorizontalPadding(dsIndicatorSize3);
                e x1122 = a0.x(eVar3, null, 3);
                e.a aVar22 = e.f40358c0;
                c3969l = u11;
                FoundationIndicatorKt.m3002FoundationIndicatorgSnA9MM(x1122, aVar22, a0.h(aVar22, 0.0f, dsIndicatorSize3.getSize(), 1), accent.getBackgroundColor(), b1122, dsIndicatorSize3.getSize(), takeIconIf22, accent.getIconColor(), m1838getDp0D9Ej5fM22, dsIndicatorSize3.getSize(), takeTextIf22, accent.getTextColor(), dsIndicatorSize3.getTextStyle(), c3969l, 48, 0);
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            str2 = str;
            i15 = i12 & 16;
            if (i15 != 0) {
            }
            abstractC8972b2 = abstractC8972b;
            if ((i13 & 9363) == 9362) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if ((i12 & 4) == 0) {
            }
            if (i14 != 0) {
            }
            str3 = str2;
            if (i15 != 0) {
            }
            abstractC8972b3 = abstractC8972b2;
            u11.j0();
            g b11222 = h.b(dsIndicatorSize3.getCornerRadius());
            String takeTextIf222 = takeTextIf(str3, dsIndicatorSize3);
            AbstractC8972b takeIconIf222 = takeIconIf(abstractC8972b3, takeTextIf222, dsIndicatorSize3);
            float m1838getDp0D9Ej5fM222 = (takeTextIf222 != null || takeTextIf222.length() == 0) ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : getTextHorizontalPadding(dsIndicatorSize3);
            e x11222 = a0.x(eVar3, null, 3);
            e.a aVar222 = e.f40358c0;
            c3969l = u11;
            FoundationIndicatorKt.m3002FoundationIndicatorgSnA9MM(x11222, aVar222, a0.h(aVar222, 0.0f, dsIndicatorSize3.getSize(), 1), accent.getBackgroundColor(), b11222, dsIndicatorSize3.getSize(), takeIconIf222, accent.getIconColor(), m1838getDp0D9Ej5fM222, dsIndicatorSize3.getSize(), takeTextIf222, accent.getTextColor(), dsIndicatorSize3.getTextStyle(), c3969l, 48, 0);
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        dsIndicatorSize2 = dsIndicatorSize;
        if ((i11 & 384) != 0) {
        }
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        str2 = str;
        i15 = i12 & 16;
        if (i15 != 0) {
        }
        abstractC8972b2 = abstractC8972b;
        if ((i13 & 9363) == 9362) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if ((i12 & 4) == 0) {
        }
        if (i14 != 0) {
        }
        str3 = str2;
        if (i15 != 0) {
        }
        abstractC8972b3 = abstractC8972b2;
        u11.j0();
        g b112222 = h.b(dsIndicatorSize3.getCornerRadius());
        String takeTextIf2222 = takeTextIf(str3, dsIndicatorSize3);
        AbstractC8972b takeIconIf2222 = takeIconIf(abstractC8972b3, takeTextIf2222, dsIndicatorSize3);
        float m1838getDp0D9Ej5fM2222 = (takeTextIf2222 != null || takeTextIf2222.length() == 0) ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : getTextHorizontalPadding(dsIndicatorSize3);
        e x112222 = a0.x(eVar3, null, 3);
        e.a aVar2222 = e.f40358c0;
        c3969l = u11;
        FoundationIndicatorKt.m3002FoundationIndicatorgSnA9MM(x112222, aVar2222, a0.h(aVar2222, 0.0f, dsIndicatorSize3.getSize(), 1), accent.getBackgroundColor(), b112222, dsIndicatorSize3.getSize(), takeIconIf2222, accent.getIconColor(), m1838getDp0D9Ej5fM2222, dsIndicatorSize3.getSize(), takeTextIf2222, accent.getTextColor(), dsIndicatorSize3.getTextStyle(), c3969l, 48, 0);
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    private static final float getTextHorizontalPadding(DsIndicatorSize dsIndicatorSize) {
        return dsIndicatorSize == DsIndicatorSize.Size450 ? DsSpacings.INSTANCE.m1852getDp3D9Ej5fM() : DsSpacings.INSTANCE.m1854getDp4D9Ej5fM();
    }

    private static final AbstractC8972b takeIconIf(AbstractC8972b abstractC8972b, String str, DsIndicatorSize dsIndicatorSize) {
        if (str != null || dsIndicatorSize.compareTo(DsIndicatorSize.Size450) <= 0) {
            return null;
        }
        return abstractC8972b;
    }

    private static final String takeTextIf(String str, DsIndicatorSize dsIndicatorSize) {
        if (dsIndicatorSize.compareTo(DsIndicatorSize.Size400) > 0) {
            return str;
        }
        return null;
    }
}
