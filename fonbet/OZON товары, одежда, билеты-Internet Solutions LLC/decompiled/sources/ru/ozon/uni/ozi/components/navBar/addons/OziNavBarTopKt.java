package ru.ozon.uni.ozi.components.navBar.addons;

import S0.InterfaceC3967k;
import a1.C4912a;
import a1.c;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.ozi.components.navBar.OziNavBarTestTags;
import ru.ozon.uni.ozi.components.navBar.presets.OziNavBarAlignment;
import ru.ozon.uni.ozi.theme.OziTheme;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001aq\u0010\u0010\u001a\u00020\u00022\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00002\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0093\u0001\u0010\u0010\u001a\u00020\u00022\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lkotlin/Function1;", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarTopStartScope;", "", "startContent", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarTopCenterScope;", "centerContent", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarTopEndScope;", "endContent", "Landroidx/compose/ui/e;", "modifier", "Lru/ozon/uni/ozi/components/navBar/presets/OziNavBarAlignment;", "alignment", "LZ1/h;", "bottomPadding", "OziNavBarTop-HYR8e34", "(Lfd/n;Lfd/n;Lfd/n;Landroidx/compose/ui/e;Lru/ozon/uni/ozi/components/navBar/presets/OziNavBarAlignment;FLS0/k;II)V", "OziNavBarTop", "Lkotlin/Function0;", "onBackButtonClick", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "backButtonEnabled", "Lt0/q;", "backButtonInteractionSource", "", "titleLinesLimit", "subtitleLinesLimit", "OziNavBarTop-yKJFJhA", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lfd/n;Landroidx/compose/ui/e;ZLt0/q;IILru/ozon/uni/ozi/components/navBar/presets/OziNavBarAlignment;FLS0/k;III)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziNavBarTopKt {
    /* renamed from: OziNavBarTop-HYR8e34, reason: not valid java name */
    public static final void m3117OziNavBarTopHYR8e34(InterfaceC6511n<? super OziNavBarTopStartScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, @NotNull InterfaceC6511n<? super OziNavBarTopCenterScope, ? super InterfaceC3967k, ? super Integer, Unit> centerContent, InterfaceC6511n<? super OziNavBarTopEndScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2, e eVar, OziNavBarAlignment oziNavBarAlignment, float f7, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(centerContent, "centerContent");
        interfaceC3967k.o(1732066314);
        InterfaceC6511n<? super OziNavBarTopStartScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n3 = (i12 & 1) != 0 ? null : interfaceC6511n;
        InterfaceC6511n<? super OziNavBarTopEndScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n4 = (i12 & 4) != 0 ? null : interfaceC6511n2;
        e eVar2 = (i12 & 8) != 0 ? e.f40358c0 : eVar;
        OziNavBarAlignment oziNavBarAlignment2 = (i12 & 16) != 0 ? OziNavBarAlignment.Center : oziNavBarAlignment;
        OziNavBarAlignment oziNavBarAlignment3 = oziNavBarAlignment2;
        NavBarPartKt.NavBarPart(c.c(-945682054, new OziNavBarTopKt$OziNavBarTop$1(interfaceC6511n3), interfaceC3967k), c.c(204150233, new OziNavBarTopKt$OziNavBarTop$2(centerContent), interfaceC3967k), c.c(1353982520, new OziNavBarTopKt$OziNavBarTop$3(interfaceC6511n4), interfaceC3967k), "TOP_CONTAINER", oziNavBarAlignment3, NavBarFloor.Top, T.j(OziTestTagsKt.oziTestTag(eVar2, OziNavBarTestTags.TopPart, null, interfaceC3967k, ((i11 >> 9) & 14) | 48, 2), 0.0f, 0.0f, 0.0f, (i12 & 32) != 0 ? OziTheme.INSTANCE.getPaddings().getPadding300() : f7, 7), interfaceC3967k, (i11 & 57344) | 200118, 0);
        interfaceC3967k.k();
    }

    /* renamed from: OziNavBarTop-yKJFJhA, reason: not valid java name */
    public static final void m3118OziNavBarTopyKJFJhA(Function0<Unit> function0, String str, String str2, InterfaceC6511n<? super OziNavBarTopEndScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, e eVar, boolean z11, q qVar, int i11, int i12, OziNavBarAlignment oziNavBarAlignment, float f7, InterfaceC3967k interfaceC3967k, int i13, int i14, int i15) {
        q qVar2;
        interfaceC3967k.o(1224583829);
        if ((i15 & 4) != 0) {
            str2 = null;
        }
        InterfaceC6511n<? super OziNavBarTopEndScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2 = (i15 & 8) == 0 ? interfaceC6511n : null;
        if ((i15 & 16) != 0) {
            eVar = e.f40358c0;
        }
        e eVar2 = eVar;
        boolean z12 = (i15 & 32) != 0 ? true : z11;
        if ((i15 & 64) != 0) {
            interfaceC3967k.o(1739887324);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                interfaceC3967k.x(C11);
            }
            qVar2 = (q) C11;
            interfaceC3967k.k();
        } else {
            qVar2 = qVar;
        }
        int i16 = (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 1 : i11;
        int i17 = (i15 & 256) == 0 ? i12 : 1;
        OziNavBarAlignment oziNavBarAlignment2 = (i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? OziNavBarAlignment.Center : oziNavBarAlignment;
        float padding300 = (i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? OziTheme.INSTANCE.getPaddings().getPadding300() : f7;
        C4912a c11 = c.c(68701680, new OziNavBarTopKt$OziNavBarTop$5(function0, z12, qVar2), interfaceC3967k);
        OziNavBarAlignment oziNavBarAlignment3 = oziNavBarAlignment2;
        C4912a c12 = c.c(1315096404, new OziNavBarTopKt$OziNavBarTop$6(str, str2, oziNavBarAlignment3, i16, i17), interfaceC3967k);
        int i18 = i13 >> 3;
        m3117OziNavBarTopHYR8e34(c11, c12, interfaceC6511n2, eVar2, oziNavBarAlignment3, padding300, interfaceC3967k, (i18 & 7168) | (i18 & 896) | 54 | ((i13 >> 15) & 57344) | (458752 & (i14 << 15)), 0);
        interfaceC3967k.k();
    }
}
