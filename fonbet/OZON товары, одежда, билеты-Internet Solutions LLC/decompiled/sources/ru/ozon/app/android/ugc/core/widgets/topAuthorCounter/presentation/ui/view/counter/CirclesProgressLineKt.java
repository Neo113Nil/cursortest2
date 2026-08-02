package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.view.counter;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import l1.C7807Z;
import n0.C8392m;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aI\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"", "totalCount", "progressCount", "", "lastStepProgress", "", "", "activeGradient", "inactiveColor", "LZ1/h;", "circleSize", "", "CirclesProgressLine-aoAMqTM", "(IIFLjava/util/List;Ljava/lang/String;FLS0/k;I)V", "CirclesProgressLine", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CirclesProgressLineKt {
    /* renamed from: CirclesProgressLine-aoAMqTM, reason: not valid java name */
    public static final void m1526CirclesProgressLineaoAMqTM(int i11, int i12, float f7, List<String> list, String str, float f11, InterfaceC3967k interfaceC3967k, int i13) {
        int i14;
        int i15;
        ArrayList arrayList;
        e eVar;
        C3969l u11 = interfaceC3967k.u(932794892);
        if ((i13 & 6) == 0) {
            i14 = i11;
            i15 = (u11.r(i14) ? 4 : 2) | i13;
        } else {
            i14 = i11;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= u11.r(i12) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= u11.q(f7) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            i15 |= u11.F(list) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 24576) == 0) {
            i15 |= u11.n(str) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i15 |= u11.q(f11) ? 131072 : 65536;
        }
        if ((74899 & i15) == 74898 && u11.b()) {
            u11.j();
        } else {
            C7807Z c7807z = TokenParserKt.tokenToColor(str, u11, (i15 >> 12) & 14);
            long w11 = c7807z != null ? c7807z.w() : C7807Z.f72258l;
            u11.o(-570753981);
            if (list == null) {
                arrayList = null;
            } else {
                List<String> list2 = list;
                ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    C7807Z c7807z2 = TokenParserKt.tokenToColor((String) it.next(), u11, 0);
                    arrayList2.add(C7807Z.m(c7807z2 != null ? c7807z2.w() : C7807Z.f72258l));
                }
                arrayList = arrayList2;
            }
            u11.k();
            int i16 = i15;
            e f12 = a0.f(T.j(a0.e(e.f40358c0, 1.0f), 0.0f, 0.0f, f11, 0.0f, 11), f11);
            u11.o(-570744221);
            boolean s11 = ((i16 & 14) == 4) | ((i16 & 112) == 32) | ((i16 & 896) == 256) | u11.s(w11) | u11.F(arrayList);
            Object C11 = u11.C();
            if (s11 || C11 == InterfaceC3967k.a.a()) {
                eVar = f12;
                CirclesProgressLineKt$CirclesProgressLine$1$1 circlesProgressLineKt$CirclesProgressLine$1$1 = new CirclesProgressLineKt$CirclesProgressLine$1$1(i14, i12, f7, w11, arrayList);
                u11.x(circlesProgressLineKt$CirclesProgressLine$1$1);
                C11 = circlesProgressLineKt$CirclesProgressLine$1$1;
            } else {
                eVar = f12;
            }
            u11.k();
            C8392m.a(eVar, (Function1) C11, u11, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CirclesProgressLineKt$CirclesProgressLine$2(i11, i12, f7, list, str, f11, i13));
        }
    }
}
