package gb0;

import B0.C2510t;
import Bl0.C2652m;
import K1.T;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7813c0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.theme.OziTheme;

/* renamed from: gb0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6706a {

    /* renamed from: gb0.a$a, reason: collision with other inner class name */
    static final class C1039a implements InterfaceC7813c0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f64215a;

        C1039a(long j11) {
            this.f64215a = j11;
        }

        @Override // l1.InterfaceC7813c0
        /* renamed from: invoke-0d7_KjU */
        public final long mo7invoke0d7_KjU() {
            return this.f64215a;
        }
    }

    /* renamed from: gb0.a$b */
    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f64216b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f64217c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f64218d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f64219e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f64220f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, e eVar, T t2, int i11, int i12) {
            super(2);
            this.f64216b = str;
            this.f64217c = eVar;
            this.f64218d = t2;
            this.f64219e = i11;
            this.f64220f = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f64219e | 1);
            String str = this.f64216b;
            C6706a.a(str, this.f64217c, this.f64218d, interfaceC3967k, e11, this.f64220f);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull String text, e eVar, T t2, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        T t11;
        e eVar2;
        Intrinsics.checkNotNullParameter(text, "text");
        C3969l u11 = interfaceC3967k.u(552367920);
        int i14 = i11 | (u11.n(text) ? 4 : 2);
        int i15 = i12 & 2;
        if (i15 != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            i14 |= u11.n(eVar) ? 32 : 16;
        }
        int i16 = i12 & 4;
        if (i16 != 0) {
            i13 = i14 | 384;
        } else {
            i13 = i14 | (u11.n(t2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN);
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            eVar2 = eVar;
            t11 = t2;
        } else {
            e eVar3 = i15 != 0 ? e.f40358c0 : eVar;
            T t12 = i16 != 0 ? T.f15012d : t2;
            long textPrimary = OziTheme.INSTANCE.getColors(u11, OziTheme.$stable).getTextPrimary();
            u11.o(377810476);
            boolean s11 = u11.s(textPrimary);
            Object C11 = u11.C();
            if (s11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C1039a(textPrimary);
                u11.x(C11);
            }
            u11.k();
            int i17 = i13 & 1022;
            e eVar4 = eVar3;
            T t13 = t12;
            C2510t.b(text, eVar4, t13, null, 0, false, 0, 0, (InterfaceC7813c0) C11, u11, i17, 248);
            t11 = t13;
            eVar2 = eVar4;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(text, eVar2, t11, i11, i12));
        }
    }
}
