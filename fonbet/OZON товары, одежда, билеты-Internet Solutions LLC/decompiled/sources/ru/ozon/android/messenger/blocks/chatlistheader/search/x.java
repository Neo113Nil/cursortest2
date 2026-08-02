package ru.ozon.android.messenger.blocks.chatlistheader.search;

import I0.j1;
import I0.k1;
import K1.Q;
import K1.S;
import K1.T;
import Q1.K;
import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import S0.J0;
import b1.C5516s;
import b1.C5517t;
import b1.InterfaceC5518u;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.repository.UniTheme;

/* loaded from: classes10.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C5517t f84870a = C5516s.a(a.f84871b, b.f84872b);

    static final class a extends AbstractC7737t implements Function2<InterfaceC5518u, K, List<? extends Object>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f84871b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends Object> invoke(InterfaceC5518u interfaceC5518u, K k11) {
            InterfaceC5518u Saver = interfaceC5518u;
            K value = k11;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(value, "value");
            String f7 = value.f();
            long e11 = value.e();
            int i11 = Q.f15010c;
            return C7714v.b0(f7, Integer.valueOf((int) (e11 >> 32)), Integer.valueOf((int) (value.e() & 4294967295L)));
        }
    }

    static final class b extends AbstractC7737t implements Function1<List<? extends Object>, K> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f84872b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final K invoke(List<? extends Object> list) {
            List<? extends Object> restored = list;
            Intrinsics.checkNotNullParameter(restored, "restored");
            Object obj = restored.get(0);
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = restored.get(1);
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            Object obj3 = restored.get(2);
            Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Int");
            return new K(4, S.a(intValue, ((Integer) obj3).intValue()), (String) obj);
        }
    }

    public static final void a(androidx.compose.ui.e eVar, boolean z11, @NotNull IconDTO iconDTO, TextDTO textDTO, String str, Integer num, Integer num2, @NotNull Function1 onTextChangedListener, @NotNull Function0 onCancelClickedListener, @NotNull Function0 onClearSearchQueryClicked, ButtonV3DTO buttonV3DTO, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        String str2;
        Integer num3;
        Integer num4;
        Intrinsics.checkNotNullParameter(iconDTO, "iconDTO");
        Intrinsics.checkNotNullParameter(onTextChangedListener, "onTextChangedListener");
        Intrinsics.checkNotNullParameter(onCancelClickedListener, "onCancelClickedListener");
        Intrinsics.checkNotNullParameter(onClearSearchQueryClicked, "onClearSearchQueryClicked");
        C3969l u11 = interfaceC3967k.u(-1628408131);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? u11.n(iconDTO) : u11.F(iconDTO) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(textDTO) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            str2 = str;
            i12 |= u11.n(str2) ? 16384 : 8192;
        } else {
            str2 = str;
        }
        if ((196608 & i11) == 0) {
            num3 = num;
            i12 |= u11.n(num3) ? 131072 : 65536;
        } else {
            num3 = num;
        }
        if ((1572864 & i11) == 0) {
            num4 = num2;
            i12 |= u11.n(num4) ? 1048576 : 524288;
        } else {
            num4 = num2;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.F(onTextChangedListener) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= u11.F(onCancelClickedListener) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= u11.F(onClearSearchQueryClicked) ? 536870912 : 268435456;
        }
        char c11 = u11.n(buttonV3DTO) ? (char) 4 : (char) 2;
        if ((i12 & 306783379) == 306783378 && (c11 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            ru.ozon.android.messenger.framework.presentation.common.screen.compose.t.a(null, a1.c.c(-1326885823, new q(eVar, str2, num4, z11, buttonV3DTO, iconDTO, textDTO, num3, onTextChangedListener, onClearSearchQueryClicked, onCancelClickedListener), u11), u11, 48);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new r(eVar, z11, iconDTO, textDTO, str, num, num2, onTextChangedListener, onCancelClickedListener, onClearSearchQueryClicked, buttonV3DTO, i11));
        }
    }

    public static final void b(androidx.compose.ui.e eVar, K k11, boolean z11, TextDTO textDTO, Function1 function1, Function0 function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(24447311);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(k11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(textDTO) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function1) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(function0) ? 131072 : 65536;
        }
        if ((i12 & 74899) == 74898 && u11.b()) {
            u11.j();
        } else {
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i13 = UniTheme.$stable;
            long bgActionPrimary = uniTheme.getColors(u11, i13).getBgActionPrimary();
            C3996z.a(k1.b().c(new j1(bgActionPrimary, C7807Z.o(0.4f, bgActionPrimary))), a1.c.c(-98918897, new v(bgActionPrimary, k11, function1, eVar, z11, T.c(uniTheme.getTypography().getCompact500Medium(), uniTheme.getColors(u11, i13).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), textDTO, function0), u11), u11, 56);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new w(eVar, k11, z11, textDTO, function1, function0, i11));
        }
    }
}
