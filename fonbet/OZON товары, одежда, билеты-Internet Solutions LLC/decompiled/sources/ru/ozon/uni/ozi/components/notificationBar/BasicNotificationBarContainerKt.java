package ru.ozon.uni.ozi.components.notificationBar;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Pk0.h;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import T7.E;
import U7.i;
import androidx.compose.foundation.gestures.C5158a;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.P;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.g;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarContainerLocation;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarState;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarVisibility;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a7\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000f²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarState;", "notificationBarState", "Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarContainerLocation;", "location", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function0;", "", "content", "BasicNotificationBarContainer", "(Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarState;Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarContainerLocation;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "", "contentHeightPx", "", "wasInShowState", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BasicNotificationBarContainerKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicNotificationBarContainer(@NotNull OziNotificationBarState notificationBarState, @NotNull OziNotificationBarContainerLocation location, e eVar, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        Object C11;
        Object b11;
        boolean F11;
        Object C12;
        int I11;
        boolean F12;
        Object C13;
        boolean F13;
        Object C14;
        int I12;
        J0 m02;
        Intrinsics.checkNotNullParameter(notificationBarState, "notificationBarState");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(1710452214);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(notificationBarState) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(location) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i12 & 8) == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i13 |= u11.F(content) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i13 & 1171) == 1170 || !u11.b()) {
                if (i14 != 0) {
                    eVar2 = e.f40358c0;
                }
                u11.o(-1217001937);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = n1.f(Float.valueOf(1.0f), D1.f25195a);
                    u11.x(C11);
                }
                InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
                b11 = h.b(u11, -1217000078);
                if (b11 == InterfaceC3967k.a.a()) {
                    b11 = n1.f(Boolean.FALSE, D1.f25195a);
                    u11.x(b11);
                }
                InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) b11;
                u11.k();
                e oziTestTag = OziTestTagsKt.oziTestTag(eVar2, OziNotificationBarContainerTestTags.Container, null, u11, ((i13 >> 6) & 14) | 48, 2);
                u11.o(-1216994260);
                F11 = u11.F(notificationBarState);
                C12 = u11.C();
                if (!F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new BasicNotificationBarContainerKt$BasicNotificationBarContainer$1$1(notificationBarState, interfaceC3978p0);
                    u11.x(C12);
                }
                u11.k();
                e a11 = g.a(oziTestTag, (Function1) C12);
                V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f11 = c.f(u11, a11);
                Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 f12 = E.f(u11, f7, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, f12);
                }
                i.b(u11, f11, -1315223234);
                F12 = ((i13 & 112) != 32) | u11.F(notificationBarState);
                C13 = u11.C();
                if (!F12 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new BasicNotificationBarContainerKt$BasicNotificationBarContainer$2$yOffsetLambda$1$1(location, notificationBarState);
                    u11.x(C13);
                }
                Function1 function1 = (Function1) C13;
                u11.k();
                e a13 = P.a(C5158a.e(e.f40358c0, notificationBarState.getAnchoredDraggableState$uni_release(), location != OziNotificationBarContainerLocation.Top, EnumC9142v.Vertical, notificationBarState.getCurrentValue() != OziNotificationBarVisibility.Shown), function1);
                u11.o(-1315197485);
                F13 = u11.F(notificationBarState);
                C14 = u11.C();
                if (!F13 || C14 == InterfaceC3967k.a.a()) {
                    C14 = new BasicNotificationBarContainerKt$BasicNotificationBarContainer$2$1$1(notificationBarState, interfaceC3978p02, interfaceC3978p0);
                    u11.x(C14);
                }
                u11.k();
                e a14 = androidx.compose.ui.graphics.a.a(a13, (Function1) C14);
                V f13 = C5185h.f(InterfaceC6250b.a.o(), false);
                I12 = u11.I();
                A0 d12 = u11.d();
                e f14 = c.f(u11, a14);
                Function0 a15 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a15);
                }
                Function2 f15 = E.f(u11, f13, u11, d12);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, f15);
                }
                F1.b(u11, f14, InterfaceC2801g.a.f());
                content.invoke(u11, Integer.valueOf((i13 >> 9) & 14));
                u11.f();
                u11.f();
            } else {
                u11.j();
            }
            e eVar3 = eVar2;
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new BasicNotificationBarContainerKt$BasicNotificationBarContainer$3(notificationBarState, location, eVar3, content, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i12 & 8) == 0) {
        }
        if ((i13 & 1171) == 1170) {
        }
        if (i14 != 0) {
        }
        u11.o(-1217001937);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p03 = (InterfaceC3978p0) C11;
        b11 = h.b(u11, -1217000078);
        if (b11 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p022 = (InterfaceC3978p0) b11;
        u11.k();
        e oziTestTag2 = OziTestTagsKt.oziTestTag(eVar2, OziNotificationBarContainerTestTags.Container, null, u11, ((i13 >> 6) & 14) | 48, 2);
        u11.o(-1216994260);
        F11 = u11.F(notificationBarState);
        C12 = u11.C();
        if (!F11) {
        }
        C12 = new BasicNotificationBarContainerKt$BasicNotificationBarContainer$1$1(notificationBarState, interfaceC3978p03);
        u11.x(C12);
        u11.k();
        e a112 = g.a(oziTestTag2, (Function1) C12);
        V f72 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f112 = c.f(u11, a112);
        Function0 a122 = Fr.g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f122 = E.f(u11, f72, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f122);
        i.b(u11, f112, -1315223234);
        F12 = ((i13 & 112) != 32) | u11.F(notificationBarState);
        C13 = u11.C();
        if (!F12) {
        }
        C13 = new BasicNotificationBarContainerKt$BasicNotificationBarContainer$2$yOffsetLambda$1$1(location, notificationBarState);
        u11.x(C13);
        Function1 function12 = (Function1) C13;
        u11.k();
        if (notificationBarState.getCurrentValue() != OziNotificationBarVisibility.Shown) {
        }
        e a132 = P.a(C5158a.e(e.f40358c0, notificationBarState.getAnchoredDraggableState$uni_release(), location != OziNotificationBarContainerLocation.Top, EnumC9142v.Vertical, notificationBarState.getCurrentValue() != OziNotificationBarVisibility.Shown), function12);
        u11.o(-1315197485);
        F13 = u11.F(notificationBarState);
        C14 = u11.C();
        if (!F13) {
        }
        C14 = new BasicNotificationBarContainerKt$BasicNotificationBarContainer$2$1$1(notificationBarState, interfaceC3978p022, interfaceC3978p03);
        u11.x(C14);
        u11.k();
        e a142 = androidx.compose.ui.graphics.a.a(a132, (Function1) C14);
        V f132 = C5185h.f(InterfaceC6250b.a.o(), false);
        I12 = u11.I();
        A0 d122 = u11.d();
        e f142 = c.f(u11, a142);
        Function0 a152 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 f152 = E.f(u11, f132, u11, d122);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, f152);
        F1.b(u11, f142, InterfaceC2801g.a.f());
        content.invoke(u11, Integer.valueOf((i13 >> 9) & 14));
        u11.f();
        u11.f();
        e eVar32 = eVar2;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BasicNotificationBarContainer$lambda$1(InterfaceC3978p0<Float> interfaceC3978p0) {
        return interfaceC3978p0.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BasicNotificationBarContainer$lambda$2(InterfaceC3978p0<Float> interfaceC3978p0, float f7) {
        interfaceC3978p0.setValue(Float.valueOf(f7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BasicNotificationBarContainer$lambda$4(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BasicNotificationBarContainer$lambda$5(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }
}
