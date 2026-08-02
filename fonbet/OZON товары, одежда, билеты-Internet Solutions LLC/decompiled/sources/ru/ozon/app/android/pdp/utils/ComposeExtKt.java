package ru.ozon.app.android.pdp.utils;

import A0.h;
import P9.a;
import S0.C0;
import S0.InterfaceC3967k;
import S0.InterfaceC3970l0;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import i1.C6988h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import m0.C8004n;
import m0.EnumC7987e0;
import m0.O;
import m0.T;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u001ay\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014²\u0006\u000e\u0010\u0013\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/e;", "", "durationMs", "LZ1/h;", "cornerRadius", "", "gradientWidthPx", "yBiasPx", "delayBetweenAnimationMs", "", "isDarkTheme", "", "Ll1/Z;", "colors", "darkColors", "blurAlpha", "shimmer-yBXNGS4", "(Landroidx/compose/ui/e;IFFFIZLjava/util/List;Ljava/util/List;FLS0/k;II)Landroidx/compose/ui/e;", "shimmer", "widthPx", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposeExtKt {
    /* JADX WARN: Removed duplicated region for block: B:108:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0195  */
    @NotNull
    /* renamed from: shimmer-yBXNGS4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final e m875shimmeryBXNGS4(@NotNull e shimmer, int i11, float f7, float f11, float f12, int i12, boolean z11, List<C7807Z> list, List<C7807Z> list2, float f13, InterfaceC3967k interfaceC3967k, int i13, int i14) {
        boolean z12;
        boolean z13;
        boolean z14;
        Object C11;
        boolean z15;
        Object C12;
        Object obj;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        boolean n11;
        Object C13;
        boolean n12;
        Object C14;
        Intrinsics.checkNotNullParameter(shimmer, "$this$shimmer");
        interfaceC3967k.o(-794673532);
        int i15 = (i14 & 1) != 0 ? 1000 : i11;
        float f14 = (i14 & 2) != 0 ? 0.0f : f7;
        float f15 = (i14 & 8) != 0 ? 0.0f : f12;
        int i16 = (i14 & 16) != 0 ? 0 : i12;
        Object obj2 = (i14 & 64) != 0 ? null : list;
        Object obj3 = (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : list2;
        float f16 = (i14 & 256) != 0 ? 1.0f : f13;
        interfaceC3967k.o(-376084975);
        Object C15 = interfaceC3967k.C();
        if (C15 == InterfaceC3967k.a.a()) {
            C15 = C0.a(0.0f);
            interfaceC3967k.x(C15);
        }
        InterfaceC3970l0 interfaceC3970l0 = (InterfaceC3970l0) C15;
        interfaceC3967k.k();
        interfaceC3967k.o(-376082218);
        Object C16 = interfaceC3967k.C();
        if (C16 == InterfaceC3967k.a.a()) {
            C16 = new ComposeExtKt$shimmer$getSizeModifier$1$1(interfaceC3970l0);
            interfaceC3967k.x(C16);
        }
        interfaceC3967k.k();
        e a11 = c.a(shimmer, (Function1) C16);
        if (interfaceC3970l0.getFloatValue() == 0.0f) {
            interfaceC3967k.k();
            return a11;
        }
        O c11 = T.c("ShimmerTransition", interfaceC3967k, 0);
        float floatValue = interfaceC3970l0.getFloatValue() + f11;
        interfaceC3967k.o(-376069156);
        float f17 = f16;
        boolean z16 = ((((458752 & i13) ^ 196608) > 131072 && interfaceC3967k.r(i16)) || (i13 & 196608) == 131072) | ((((i13 & 112) ^ 48) > 32 && interfaceC3967k.r(i15)) || (i13 & 48) == 32);
        int i17 = (i13 & 7168) ^ 3072;
        if (i17 <= 2048 || !interfaceC3967k.q(f11)) {
            z12 = z16;
            if ((i13 & 3072) != 2048) {
                z13 = false;
                z14 = z12 | z13;
                C11 = interfaceC3967k.C();
                if (!z14 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new ComposeExtKt$shimmer$translateAnimation$1$1(i15, i16, f11, interfaceC3970l0);
                    interfaceC3967k.x(C11);
                }
                interfaceC3967k.k();
                float f18 = f14;
                Object obj4 = obj2;
                O.a a12 = T.a(c11, 0.0f, floatValue, C8004n.a(C8004n.b((Function1) C11), EnumC7987e0.Restart, 4), "ShimmerTranslate", interfaceC3967k, 28728, 0);
                interfaceC3967k.o(-376055416);
                z15 = (((3670016 & i13) ^ 1572864) <= 1048576 && interfaceC3967k.p(z11)) || (i13 & 1572864) == 1048576;
                C12 = interfaceC3967k.C();
                if (!z15 || C12 == InterfaceC3967k.a.a()) {
                    if (z11) {
                        if (obj4 == null) {
                            j11 = C7807Z.f72258l;
                            C7807Z m11 = C7807Z.m(j11);
                            j12 = C7807Z.f72251e;
                            C7807Z m12 = C7807Z.m(C7807Z.o(0.5f, j12));
                            j13 = C7807Z.f72258l;
                            obj = C7714v.b0(m11, m12, C7807Z.m(j13));
                        } else {
                            obj = obj4;
                        }
                    } else if (obj3 == null) {
                        j14 = C7807Z.f72258l;
                        C7807Z m13 = C7807Z.m(j14);
                        j15 = C7807Z.f72248b;
                        C7807Z m14 = C7807Z.m(C7807Z.o(0.5f, j15));
                        j16 = C7807Z.f72258l;
                        obj = C7714v.b0(m13, m14, C7807Z.m(j16));
                    } else {
                        obj = obj3;
                    }
                    interfaceC3967k.x(obj);
                    C12 = obj;
                }
                List list3 = (List) C12;
                interfaceC3967k.k();
                interfaceC3967k.o(-376041893);
                n11 = interfaceC3967k.n(list3) | ((i17 <= 2048 && interfaceC3967k.q(f11)) || (i13 & 3072) == 2048) | ((((57344 & i13) ^ 24576) <= 16384 && interfaceC3967k.q(f15)) || (i13 & 24576) == 16384);
                C13 = interfaceC3967k.C();
                if (!n11 || C13 == InterfaceC3967k.a.a()) {
                    C13 = AbstractC7799Q.a.d(AbstractC7799Q.Companion, list3, 0L, a.a(f11, f15), 8);
                    interfaceC3967k.x(C13);
                }
                AbstractC7799Q abstractC7799Q = (AbstractC7799Q) C13;
                interfaceC3967k.k();
                e a13 = C6988h.a(a11, h.b(f18));
                interfaceC3967k.o(-376031887);
                n12 = interfaceC3967k.n(a12) | ((i17 <= 2048 && interfaceC3967k.q(f11)) || (i13 & 3072) == 2048) | interfaceC3967k.n(abstractC7799Q) | ((((1879048192 & i13) ^ 805306368) <= 536870912 && interfaceC3967k.q(f17)) || (i13 & 805306368) == 536870912);
                C14 = interfaceC3967k.C();
                if (!n12 || C14 == InterfaceC3967k.a.a()) {
                    C14 = new ComposeExtKt$shimmer$1$1(a12, f11, abstractC7799Q, f17);
                    interfaceC3967k.x(C14);
                }
                interfaceC3967k.k();
                e c12 = androidx.compose.ui.draw.c.c(a13, (Function1) C14);
                interfaceC3967k.k();
                return c12;
            }
        } else {
            z12 = z16;
        }
        z13 = true;
        z14 = z12 | z13;
        C11 = interfaceC3967k.C();
        if (!z14) {
        }
        C11 = new ComposeExtKt$shimmer$translateAnimation$1$1(i15, i16, f11, interfaceC3970l0);
        interfaceC3967k.x(C11);
        interfaceC3967k.k();
        float f182 = f14;
        Object obj42 = obj2;
        O.a a122 = T.a(c11, 0.0f, floatValue, C8004n.a(C8004n.b((Function1) C11), EnumC7987e0.Restart, 4), "ShimmerTranslate", interfaceC3967k, 28728, 0);
        interfaceC3967k.o(-376055416);
        if (((3670016 & i13) ^ 1572864) <= 1048576) {
        }
        C12 = interfaceC3967k.C();
        if (!z15) {
        }
        if (z11) {
        }
        interfaceC3967k.x(obj);
        C12 = obj;
        List list32 = (List) C12;
        interfaceC3967k.k();
        interfaceC3967k.o(-376041893);
        n11 = interfaceC3967k.n(list32) | ((i17 <= 2048 && interfaceC3967k.q(f11)) || (i13 & 3072) == 2048) | ((((57344 & i13) ^ 24576) <= 16384 && interfaceC3967k.q(f15)) || (i13 & 24576) == 16384);
        C13 = interfaceC3967k.C();
        if (!n11) {
        }
        C13 = AbstractC7799Q.a.d(AbstractC7799Q.Companion, list32, 0L, a.a(f11, f15), 8);
        interfaceC3967k.x(C13);
        AbstractC7799Q abstractC7799Q2 = (AbstractC7799Q) C13;
        interfaceC3967k.k();
        e a132 = C6988h.a(a11, h.b(f182));
        interfaceC3967k.o(-376031887);
        n12 = interfaceC3967k.n(a122) | ((i17 <= 2048 && interfaceC3967k.q(f11)) || (i13 & 3072) == 2048) | interfaceC3967k.n(abstractC7799Q2) | ((((1879048192 & i13) ^ 805306368) <= 536870912 && interfaceC3967k.q(f17)) || (i13 & 805306368) == 536870912);
        C14 = interfaceC3967k.C();
        if (!n12) {
        }
        C14 = new ComposeExtKt$shimmer$1$1(a122, f11, abstractC7799Q2, f17);
        interfaceC3967k.x(C14);
        interfaceC3967k.k();
        e c122 = androidx.compose.ui.draw.c.c(a132, (Function1) C14);
        interfaceC3967k.k();
        return c122;
    }
}
