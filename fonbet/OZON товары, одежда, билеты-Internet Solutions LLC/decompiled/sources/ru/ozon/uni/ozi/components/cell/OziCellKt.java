package ru.ozon.uni.ozi.components.cell;

import B1.U;
import P9.a;
import S0.A1;
import S0.B1;
import S0.C3969l;
import S0.G0;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import a1.c;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import i1.C6981a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.uni.foundation.components.cell.FoundationCellKt;
import ru.ozon.uni.ozi.components.cell.addons.OziCellCenterScope;
import ru.ozon.uni.ozi.components.cell.addons.OziCellEndScope;
import ru.ozon.uni.ozi.components.cell.addons.OziCellScope;
import ru.ozon.uni.ozi.components.cell.addons.OziCellStartScope;
import ru.ozon.uni.ozi.config.OziConfigKt;
import ru.ozon.uni.ozi.theme.OziTheme;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;
import ru.ozon.uni.ozi.utils.internal.AnimationUtilsKt;
import ru.ozon.uni.ozi.utils.internal.TransitionsKt;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001aß\u0001\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aË\u0001\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010#\u001a\u00020\u00042\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0 H\u0002¢\u0006\u0004\b#\u0010$\"\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\"&\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060²\u0006\f\u0010/\u001a\u00020*8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "Lru/ozon/uni/ozi/components/cell/addons/OziCellStartScope;", "", "start", "Lru/ozon/uni/ozi/components/cell/addons/OziCellCenterScope;", RichContentDTO.ALIGN_CENTER, "Lru/ozon/uni/ozi/components/cell/addons/OziCellEndScope;", "end", "Lkotlin/Function0;", "onStartClick", "onEndClick", "onClick", "", "isEnabled", "showSeparator", "LZ1/h;", "verticalPadding", "startPadding", "endPadding", "Lt0/q;", "interactionSource", "startInteractionSource", "endInteractionSource", "OziCell-rx89VDg", "(Landroidx/compose/ui/e;Lfd/n;Lfd/n;Lfd/n;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZFFFLt0/q;Lt0/q;Lt0/q;LS0/k;III)V", "OziCell", "separatorThickness", "BasicCell-zUQEyjg", "(Landroidx/compose/ui/e;Lfd/n;Lfd/n;Lfd/n;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZFFFFLt0/q;Lt0/q;Lt0/q;LS0/k;II)V", "BasicCell", "", "LB1/U;", "measurables", "checkForScopeCompliance", "(Ljava/util/List;)V", "Lru/ozon/uni/ozi/components/cell/addons/OziCellScope;", "scopesList", "Ljava/util/List;", "LS0/G0;", "LS0/A1;", "", "LocalAddonAlpha", "LS0/G0;", "getLocalAddonAlpha", "()LS0/G0;", "alpha", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziCellKt {

    @NotNull
    private static final List<OziCellScope> scopesList = C7714v.b0(OziCellStartScope.INSTANCE.getINSTANCE$uni_release(), OziCellCenterScope.INSTANCE.getINSTANCE$uni_release(), OziCellEndScope.INSTANCE.getINSTANCE$uni_release());

    @NotNull
    private static final G0<A1<Float>> LocalAddonAlpha = new B1(OziCellKt$LocalAddonAlpha$1.INSTANCE);

    /* renamed from: BasicCell-zUQEyjg, reason: not valid java name */
    public static final void m3071BasicCellzUQEyjg(@NotNull e modifier, @NotNull InterfaceC6511n<? super OziCellStartScope, ? super InterfaceC3967k, ? super Integer, Unit> start, @NotNull InterfaceC6511n<? super OziCellCenterScope, ? super InterfaceC3967k, ? super Integer, Unit> center, @NotNull InterfaceC6511n<? super OziCellEndScope, ? super InterfaceC3967k, ? super Integer, Unit> end, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, boolean z11, boolean z12, float f7, float f11, float f12, float f13, @NotNull q interactionSource, @NotNull q startInteractionSource, @NotNull q endInteractionSource, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        A1<Float> a12;
        h hVar;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(startInteractionSource, "startInteractionSource");
        Intrinsics.checkNotNullParameter(endInteractionSource, "endInteractionSource");
        C3969l u11 = interfaceC3967k.u(-2070273297);
        if ((i11 & 6) == 0) {
            i13 = (u11.n(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.F(start) ? 32 : 16;
        }
        int i16 = i11 & 384;
        int i17 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i16 == 0) {
            i13 |= u11.F(center) ? 256 : 128;
        }
        int i18 = i11 & 3072;
        int i19 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i18 == 0) {
            i13 |= u11.F(end) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= u11.F(function0) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i13 |= u11.F(function02) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= u11.F(function03) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= u11.p(z11) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= u11.p(z12) ? 67108864 : 33554432;
        }
        int i21 = i13;
        if ((i11 & 805306368) == 0) {
            i14 = i21 | (u11.q(f7) ? 536870912 : 268435456);
        } else {
            i14 = i21;
        }
        if ((i12 & 6) == 0) {
            i15 = i12 | (u11.q(f11) ? 4 : 2);
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= u11.q(f12) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            if (u11.q(f13)) {
                i17 = 256;
            }
            i15 |= i17;
        }
        if ((i12 & 3072) == 0) {
            if (u11.n(interactionSource)) {
                i19 = 2048;
            }
            i15 |= i19;
        }
        if ((i12 & 24576) == 0) {
            i15 |= u11.n(startInteractionSource) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i15 |= u11.n(endInteractionSource) ? 131072 : 65536;
        }
        int i22 = i15;
        if ((i14 & 306783379) == 306783378 && (i22 & 74899) == 74898 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            A1<Float> animateClickAlpha = AnimationUtilsKt.animateClickAlpha(TransitionsKt.m3245rememberIndicationTransitionFbhrOv8(interactionSource, 0L, 0L, u11, (i22 >> 9) & 14, 3), 0.0f, 0.6f, u11, 384, 1);
            A1<Float> animateClickAlpha2 = AnimationUtilsKt.animateClickAlpha(TransitionsKt.m3245rememberIndicationTransitionFbhrOv8(startInteractionSource, 0L, 0L, u11, (i22 >> 12) & 14, 3), 0.0f, 0.6f, u11, 384, 1);
            A1<Float> animateClickAlpha3 = AnimationUtilsKt.animateClickAlpha(TransitionsKt.m3245rememberIndicationTransitionFbhrOv8(endInteractionSource, 0L, 0L, u11, (i22 >> 15) & 14, 3), 0.0f, 0.6f, u11, 384, 1);
            C4912a c11 = c.c(2003093485, new OziCellKt$BasicCell$1(animateClickAlpha2, start), u11);
            C4912a c12 = c.c(-1285192564, new OziCellKt$BasicCell$2(center), u11);
            C4912a c13 = c.c(-278511317, new OziCellKt$BasicCell$3(animateClickAlpha3, end), u11);
            C4912a c14 = c.c(728169930, new OziCellKt$BasicCell$4(z12, f13), u11);
            C4912a c15 = c.c(1734851177, new OziCellKt$BasicCell$5(function0, startInteractionSource, z11), u11);
            C4912a c16 = c.c(-1553434872, new OziCellKt$BasicCell$6(function02, endInteractionSource, z11), u11);
            e oziTestTag = OziTestTagsKt.oziTestTag(modifier, OziCellTestTags.Container, null, u11, (i14 & 14) | 48, 2);
            a.b(oziTestTag, "parent");
            e e11 = a0.e(oziTestTag, 1.0f);
            if (function03 != null) {
                e.a aVar = e.f40358c0;
                Intrinsics.f(function03);
                a12 = animateClickAlpha;
                e11 = e11.l0(i.b(aVar, interactionSource, null, z11, null, null, function03, 24));
            } else {
                a12 = animateClickAlpha;
            }
            if (!z11) {
                e11 = e11.l0(C6981a.a(e.f40358c0, 0.4f));
            }
            u11.o(-771134485);
            boolean n11 = u11.n(a12);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new OziCellKt$BasicCell$9$1(a12);
                u11.x(C11);
            }
            u11.k();
            e j11 = T.j(androidx.compose.ui.graphics.a.a(e11, (Function1) C11), f11, f7, 0.0f, 0.0f, 12);
            u11.o(-771130722);
            if (OziConfigKt.getGlobalOziConfig().getEnableStrictMode()) {
                u11.o(-771129554);
                Object C12 = u11.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    C12 = OziCellKt$BasicCell$10$1.INSTANCE;
                    u11.x(C12);
                }
                hVar = (h) C12;
                u11.k();
            } else {
                hVar = null;
            }
            u11.k();
            Function1 function1 = (Function1) hVar;
            u11.o(-771127436);
            Object C13 = u11.C();
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = OziCellKt$BasicCell$11$1.INSTANCE;
                u11.x(C13);
            }
            Function1 function12 = (Function1) C13;
            Object b11 = Pk0.h.b(u11, -771120497);
            if (b11 == InterfaceC3967k.a.a()) {
                b11 = OziCellKt$BasicCell$12$1.INSTANCE;
                u11.x(b11);
            }
            u11.k();
            FoundationCellKt.m2986FoundationCellhW5Ac_0(c11, c12, c13, c14, c15, c16, f7, f12, j11, function1, function12, (Function1) b11, u11, ((i14 >> 9) & 3670016) | 224694 | ((i22 << 18) & 29360128), 54, 0);
            c3969l = u11;
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new OziCellKt$BasicCell$13(modifier, start, center, end, function0, function02, function03, z11, z12, f7, f11, f12, f13, interactionSource, startInteractionSource, endInteractionSource, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BasicCell_zUQEyjg$lambda$3(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* renamed from: OziCell-rx89VDg, reason: not valid java name */
    public static final void m3072OziCellrx89VDg(e eVar, InterfaceC6511n<? super OziCellStartScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, @NotNull InterfaceC6511n<? super OziCellCenterScope, ? super InterfaceC3967k, ? super Integer, Unit> center, InterfaceC6511n<? super OziCellEndScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, boolean z11, boolean z12, float f7, float f11, float f12, q qVar, q qVar2, q qVar3, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        q qVar4;
        e eVar2;
        q qVar5;
        q qVar6;
        Intrinsics.checkNotNullParameter(center, "center");
        interfaceC3967k.o(169887013);
        e eVar3 = (i13 & 1) != 0 ? e.f40358c0 : eVar;
        InterfaceC6511n<? super OziCellStartScope, ? super InterfaceC3967k, ? super Integer, Unit> m3069getLambda1$uni_release = (i13 & 2) != 0 ? ComposableSingletons$OziCellKt.INSTANCE.m3069getLambda1$uni_release() : interfaceC6511n;
        InterfaceC6511n<? super OziCellEndScope, ? super InterfaceC3967k, ? super Integer, Unit> m3070getLambda2$uni_release = (i13 & 8) != 0 ? ComposableSingletons$OziCellKt.INSTANCE.m3070getLambda2$uni_release() : interfaceC6511n2;
        Function0<Unit> function04 = (i13 & 16) != 0 ? null : function0;
        Function0<Unit> function05 = (i13 & 32) != 0 ? null : function02;
        Function0<Unit> function06 = (i13 & 64) == 0 ? function03 : null;
        boolean z13 = (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? true : z11;
        boolean z14 = (i13 & 256) != 0 ? true : z12;
        float padding350 = (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? OziTheme.INSTANCE.getPaddings().getPadding350() : f7;
        float f13 = (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? 0 : f11;
        float f14 = (i13 & 2048) != 0 ? 0 : f12;
        if ((i13 & 4096) != 0) {
            interfaceC3967k.o(995541644);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                interfaceC3967k.x(C11);
            }
            qVar4 = (q) C11;
            interfaceC3967k.k();
        } else {
            qVar4 = qVar;
        }
        if ((i13 & 8192) != 0) {
            interfaceC3967k.o(995544716);
            Object C12 = interfaceC3967k.C();
            eVar2 = eVar3;
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = p.a();
                interfaceC3967k.x(C12);
            }
            qVar5 = (q) C12;
            interfaceC3967k.k();
        } else {
            eVar2 = eVar3;
            qVar5 = qVar2;
        }
        if ((i13 & 16384) != 0) {
            interfaceC3967k.o(995547724);
            Object C13 = interfaceC3967k.C();
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = p.a();
                interfaceC3967k.x(C13);
            }
            interfaceC3967k.k();
            qVar6 = (q) C13;
        } else {
            qVar6 = qVar3;
        }
        int i14 = i12 << 3;
        int i15 = (i14 & 458752) | (i12 & 14) | 384 | (i12 & 112) | (i14 & 7168) | (i14 & 57344);
        m3071BasicCellzUQEyjg(eVar2, m3069getLambda1$uni_release, center, m3070getLambda2$uni_release, function04, function05, function06, z13, z14, padding350, f13, f14, 1, qVar4, qVar5, qVar6, interfaceC3967k, i11 & 2147483646, i15);
        interfaceC3967k.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkForScopeCompliance(List<? extends List<? extends U>> list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List<? extends U> list2 = list.get(i11);
            if (i11 <= 2) {
                if (i11 == 1) {
                    if (list2.size() != 1) {
                        throw new IllegalArgumentException("В center-лямбде OziCell должен быть ровно 1 composable child");
                    }
                } else if (list2.size() > 1) {
                    throw new IllegalArgumentException("В slot-лямбде OziCell должно быть не больше 1 composable child.");
                }
                U u11 = (U) C7714v.M(list2);
                if (u11 == null) {
                    continue;
                } else {
                    Object a11 = androidx.compose.ui.layout.a.a(u11);
                    OziCellScope.AddonLayoutId addonLayoutId = a11 instanceof OziCellScope.AddonLayoutId ? (OziCellScope.AddonLayoutId) a11 : null;
                    if ((addonLayoutId != null ? addonLayoutId.getMarker() : null) != scopesList.get(i11).getAddonMarker()) {
                        throw new IllegalArgumentException("Переданный аддон не является функцией из соответствующего scope. Вызывайте только их.");
                    }
                }
            }
        }
    }

    @NotNull
    public static final G0<A1<Float>> getLocalAddonAlpha() {
        return LocalAddonAlpha;
    }
}
