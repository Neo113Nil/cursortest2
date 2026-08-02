package ru.ozon.uni.foundation.components.image;

import A0.h;
import B1.InterfaceC2547p;
import P9.a;
import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import Z1.d;
import androidx.compose.foundation.layout.C5182e;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5239d1;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import i1.C6988h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import m0.C8004n;
import m0.EnumC7987e0;
import m0.G;
import m0.O;
import m0.T0;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0081\u0001\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!²\u0006\u000e\u0010 \u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lq1/b;", "painter", "", "contentDescription", "", "ratio", "", "hasParanja", "Ll1/Z;", "paranjaColor", "LB1/p;", "contentScale", "backgroundColor", "LZ1/h;", "cornerRadius", "startPadding", "endPadding", "topPadding", "bottomPadding", "", "FoundationImage-jfyh3yM", "(Landroidx/compose/ui/e;Lq1/b;Ljava/lang/String;FZJLB1/p;JFFFFFLS0/k;III)V", "FoundationImage", "gradientWidth", "FoundationLoadingImage-WqkqGGM", "(Landroidx/compose/ui/e;FJFFLS0/k;I)V", "FoundationLoadingImage", "", "loadingGradientColors", "Ljava/util/List;", "firstAnimCycle", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FoundationImageKt {

    @NotNull
    private static final List<C7807Z> loadingGradientColors;

    static {
        long j11;
        long j12;
        long j13;
        long j14;
        j11 = C7807Z.f72251e;
        C7807Z m11 = C7807Z.m(C7807Z.o(0.0f, j11));
        j12 = C7807Z.f72251e;
        C7807Z m12 = C7807Z.m(C7807Z.o(0.2f, j12));
        j13 = C7807Z.f72251e;
        C7807Z m13 = C7807Z.m(C7807Z.o(0.5f, j13));
        j14 = C7807Z.f72251e;
        loadingGradientColors = C7714v.b0(m11, m12, m13, C7807Z.m(C7807Z.o(0.0f, j14)));
    }

    /* renamed from: FoundationImage-jfyh3yM, reason: not valid java name */
    public static final void m2999FoundationImagejfyh3yM(@NotNull e modifier, @NotNull AbstractC8972b painter, String str, float f7, boolean z11, long j11, @NotNull InterfaceC2547p contentScale, long j12, float f11, float f12, float f13, float f14, float f15, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        e b11;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        interfaceC3967k.o(631392661);
        float f16 = (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 0 : f12;
        float f17 = (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? 0 : f13;
        float f18 = (i13 & 2048) != 0 ? 0 : f14;
        float f19 = (i13 & 4096) != 0 ? 0 : f15;
        interfaceC3967k.o(-374781596);
        a.b(modifier, "image");
        b11 = androidx.compose.foundation.e.b(C6988h.a(C5182e.a(modifier, f7, false), h.b(f11)), j12, y0.a());
        if (z11) {
            e.a aVar = e.f40358c0;
            interfaceC3967k.o(-1518467008);
            boolean z12 = (((i11 & 458752) ^ 196608) > 131072 && interfaceC3967k.s(j11)) || (i11 & 196608) == 131072;
            Object C11 = interfaceC3967k.C();
            if (z12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new FoundationImageKt$FoundationImage$1$1$1(j11);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            b11 = b11.l0(c.d(aVar, (Function1) C11));
        }
        interfaceC3967k.k();
        C8366G.a(painter, str, T.i(b11, f16, f18, f17, f19), null, contentScale, 0.0f, null, interfaceC3967k, ((i11 >> 3) & 126) | ((i11 >> 6) & 57344), 104);
        interfaceC3967k.k();
    }

    /* renamed from: FoundationLoadingImage-WqkqGGM, reason: not valid java name */
    public static final void m3000FoundationLoadingImageWqkqGGM(@NotNull e modifier, float f7, long j11, float f11, float f12, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        C3969l u11 = interfaceC3967k.u(-1502938449);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.q(f7) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.s(j11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.q(f11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.q(f12) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            O.a a11 = m0.T.a(m0.T.c("Infinite transition", u11, 0), 0.0f, 1.0f, C8004n.a(new T0(1300, 300, G.b()), EnumC7987e0.Restart, 4), "Shimmer", u11, 29112, 0);
            float v12 = ((d) u11.m(K0.e())).v1(f12);
            boolean booleanValue = ((Boolean) u11.m(C5239d1.a())).booleanValue();
            u11.o(-519600582);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(Boolean.TRUE, D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            b11 = androidx.compose.foundation.e.b(C6988h.a(C5182e.a(modifier, f7, false), h.b(f11)), j11, y0.a());
            u11.o(-519592953);
            boolean n11 = u11.n(a11) | u11.p(booleanValue) | u11.q(v12);
            Object C12 = u11.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new FoundationImageKt$FoundationLoadingImage$1$1(a11, booleanValue, v12, interfaceC3978p0);
                u11.x(C12);
            }
            u11.k();
            C5185h.a(c.b(b11, (Function1) C12), u11, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new FoundationImageKt$FoundationLoadingImage$2(modifier, f7, j11, f11, f12, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FoundationLoadingImage_WqkqGGM$lambda$5(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FoundationLoadingImage_WqkqGGM$lambda$6(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }
}
