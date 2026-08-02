package ru.ozon.uni.ozi.components.cell.addons;

import B1.V;
import D1.InterfaceC2801g;
import Fr.g;
import J0.C3349u1;
import J0.u3;
import K00.b;
import K1.C3422b;
import K1.T;
import P9.a;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import U7.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.core.compose.tokens.UniPaddings;
import ru.ozon.uni.core.compose.tokens.UniRadii;
import ru.ozon.uni.core.compose.tokens.UniResourceIcons;
import ru.ozon.uni.ozi.components.badge.presets.OziBadgeStyle;
import ru.ozon.uni.ozi.components.cell.OziCellTestTags;
import ru.ozon.uni.ozi.components.cell.addons.OziCellScope;
import ru.ozon.uni.ozi.theme.OziTheme;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;
import ru.ozon.uni.ozi.utils.internal.ModifierUtilsKt;
import u0.C9891D;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Js\u0010\u0017\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\n2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J_\u0010\u001f\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00182\b\u0010\f\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0087\u0001\u0010*\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010 2\b\u0010\f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0003\u0010\r\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00182\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u00132\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b(\u0010)R\u001a\u0010,\u001a\u00020+8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/uni/ozi/components/cell/addons/OziCellCenterScope;", "Lru/ozon/uni/ozi/components/cell/addons/OziCellScope;", "<init>", "()V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "titleMaxLines", "Ll1/Z;", "titleColor", "LK1/T;", "titleStyle", "subtitle", "subtitleMaxLines", "subtitleColor", "subtitleStyle", "Lkotlin/Function0;", "", "titleSlot", "", "isReversed", "TextBlock-OjOrPUU", "(Ljava/lang/CharSequence;IJLK1/T;Ljava/lang/CharSequence;IJLK1/T;Lkotlin/jvm/functions/Function2;ZLS0/k;III)V", "TextBlock", "", "Landroidx/compose/ui/e;", "modifier", "LZ1/h;", "minWidth", "Default500-Rx1qByU", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/e;IIJJFLS0/k;II)V", "Default500", "LK1/b;", "badgeModifier", "badgeLabel", "Lq1/b;", "badgeStartGraphic", "Lru/ozon/uni/ozi/components/badge/presets/OziBadgeStyle;", "badgeStyle", "badgeNumeric", "Default500Badge-X9ctgU4", "(LK1/b;LK1/b;Landroidx/compose/ui/e;Landroidx/compose/ui/e;ILjava/lang/String;Lq1/b;Lru/ozon/uni/ozi/components/badge/presets/OziBadgeStyle;ZJJFLS0/k;III)V", "Default500Badge", "Lru/ozon/uni/ozi/components/cell/addons/OziCellScope$AddonMarker;", "addonMarker", "Lru/ozon/uni/ozi/components/cell/addons/OziCellScope$AddonMarker;", "getAddonMarker$uni_release", "()Lru/ozon/uni/ozi/components/cell/addons/OziCellScope$AddonMarker;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziCellCenterScope extends OziCellScope {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final OziCellCenterScope INSTANCE = new OziCellCenterScope();

    @NotNull
    private final OziCellScope.AddonMarker addonMarker;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/ozi/components/cell/addons/OziCellCenterScope$Companion;", "", "<init>", "()V", "INSTANCE", "Lru/ozon/uni/ozi/components/cell/addons/OziCellCenterScope;", "getINSTANCE$uni_release", "()Lru/ozon/uni/ozi/components/cell/addons/OziCellCenterScope;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OziCellCenterScope getINSTANCE$uni_release() {
            return OziCellCenterScope.INSTANCE;
        }

        private Companion() {
        }
    }

    private OziCellCenterScope() {
        super(null);
        this.addonMarker = OziCellScope.AddonMarker.Center;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x038c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03b9  */
    /* renamed from: TextBlock-OjOrPUU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3074TextBlockOjOrPUU(CharSequence charSequence, int i11, long j11, T t2, CharSequence charSequence2, int i12, long j12, T t11, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, boolean z11, InterfaceC3967k interfaceC3967k, int i13, int i14, int i15) {
        int i16;
        int i17;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function22;
        int i18;
        int i19;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function23;
        e.a aVar;
        int I11;
        int I12;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function24;
        int I13;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-2053369537);
        if ((i15 & 1) != 0) {
            i16 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i16 = (u11.F(charSequence) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i13 & 48) == 0) {
            i16 |= u11.r(i11) ? 32 : 16;
            if ((i15 & 4) == 0) {
                i16 |= 384;
            } else if ((i13 & 384) == 0) {
                i16 |= u11.s(j11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i15 & 8) != 0) {
                    i16 |= 3072;
                } else if ((i13 & 3072) == 0) {
                    i16 |= u11.n(t2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                }
                if ((i15 & 16) != 0) {
                    i16 |= 24576;
                } else if ((i13 & 24576) == 0) {
                    i16 |= u11.F(charSequence2) ? 16384 : 8192;
                }
                if ((i15 & 32) != 0) {
                    i16 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    i16 |= u11.r(i12) ? 131072 : 65536;
                    if ((i15 & 64) == 0) {
                        i16 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        i16 |= u11.s(j12) ? 1048576 : 524288;
                        if ((i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                            i16 |= 12582912;
                        } else if ((i13 & 12582912) == 0) {
                            i16 |= u11.n(t11) ? 8388608 : 4194304;
                            i17 = i15 & 256;
                            if (i17 == 0) {
                                i16 |= 100663296;
                                function22 = function2;
                            } else {
                                function22 = function2;
                                if ((i13 & 100663296) == 0) {
                                    i16 |= u11.F(function22) ? 67108864 : 33554432;
                                }
                            }
                            int i21 = i16;
                            i18 = i15 & UserVerificationMethods.USER_VERIFY_NONE;
                            if (i18 == 0) {
                                i21 |= 805306368;
                            } else if ((i13 & 805306368) == 0) {
                                i21 |= u11.p(z11) ? 536870912 : 268435456;
                            }
                            i19 = i21;
                            if ((306783379 & i19) != 306783378 && (i14 & 1) == 0 && u11.b()) {
                                u11.j();
                                function24 = function22;
                            } else {
                                function23 = i17 == 0 ? null : function22;
                                boolean z12 = i18 == 0 ? false : z11;
                                aVar = e.f40358c0;
                                e oziTestTag = OziTestTagsKt.oziTestTag(aVar, OziCellTestTags.CenterTitle, null, u11, 54, 2);
                                a.b(oziTestTag, SelectionItemFormDTO.TITLE_FIELD_NAME);
                                z11 = z12;
                                u11 = u11;
                                e oziTestTag2 = OziTestTagsKt.oziTestTag(aVar, OziCellTestTags.CenterSubtitle, null, u11, 54, 2);
                                a.b(oziTestTag2, "subtitle");
                                C5194q a11 = C5193p.a(C5179b.n(2), InterfaceC6250b.a.k(), u11, 6);
                                I11 = u11.I();
                                A0 d11 = u11.d();
                                e f7 = c.f(u11, aVar);
                                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                                if (u11.t()) {
                                    u11.e();
                                } else {
                                    u11.H(a12);
                                }
                                Function2 g10 = b.g(u11, a11, u11, d11);
                                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                    Ep.a.d(I11, u11, I11, g10);
                                }
                                i.b(u11, f7, 19318187);
                                if (z11) {
                                    if (charSequence2 instanceof String) {
                                        u11.o(598928620);
                                        u3.b((String) charSequence2, oziTestTag2, j12, 0L, null, 0L, null, 0L, 2, false, i12, 0, null, t11, u11, (i19 >> 12) & 896, ((i19 >> 6) & 7168) | 48 | ((i19 >> 3) & 3670016), 55288);
                                        u11.k();
                                    } else if (charSequence2 instanceof C3422b) {
                                        u11.o(599295660);
                                        u3.c((C3422b) charSequence2, oziTestTag2, j12, 0L, 0L, null, 0L, 2, false, i12, 0, null, null, t11, u11, (i19 >> 12) & 896, ((i19 >> 6) & 7168) | 48 | (i19 & 29360128), 120824);
                                        oziTestTag2 = oziTestTag2;
                                        u11.k();
                                    } else {
                                        oziTestTag2 = oziTestTag2;
                                        if (charSequence2 != null) {
                                            u11.o(19344319);
                                            u11.k();
                                            throw new IllegalStateException(("Такой тип subtitle не поддерживается: " + N.b(charSequence2.getClass()).u()).toString());
                                        }
                                        u11.o(19343188);
                                        u11.k();
                                    }
                                }
                                u11.k();
                                e maxIntrinsicWidthIfInLazyRow = ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(aVar);
                                Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                                I12 = u11.I();
                                A0 d12 = u11.d();
                                e f11 = c.f(u11, maxIntrinsicWidthIfInLazyRow);
                                Function0 a13 = InterfaceC2801g.a.a();
                                u11.i();
                                if (u11.t()) {
                                    u11.e();
                                } else {
                                    u11.H(a13);
                                }
                                Function2 h11 = Cm.e.h(u11, b11, u11, d12);
                                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                                    Ep.a.d(I12, u11, I12, h11);
                                }
                                F1.b(u11, f11, InterfaceC2801g.a.f());
                                C9891D c9891d = C9891D.f99599a;
                                if (!(charSequence instanceof String)) {
                                    u11.o(2032516490);
                                    u3.b((String) charSequence, c9891d.a(oziTestTag, 1.0f, false), j11, 0L, null, 0L, null, 0L, 2, false, i11, 0, null, t2, u11, i19 & 896, ((i19 << 6) & 7168) | 48 | ((i19 << 9) & 3670016), 55288);
                                    u11.k();
                                } else if (charSequence instanceof C3422b) {
                                    u11.o(2032886506);
                                    u3.c((C3422b) charSequence, c9891d.a(oziTestTag, 1.0f, false), j11, 0L, 0L, null, 0L, 2, false, i11, 0, null, null, t2, u11, i19 & 896, ((i19 << 6) & 7168) | 48 | ((i19 << 12) & 29360128), 120824);
                                    u11.k();
                                } else {
                                    if (charSequence != null) {
                                        u11.o(65589272);
                                        u11.k();
                                        throw new IllegalStateException(("Такой тип title не поддерживается: " + N.b(charSequence.getClass()).u()).toString());
                                    }
                                    u11.o(65588147);
                                    u11.k();
                                }
                                u11.o(65592807);
                                if (charSequence != null && function23 != null) {
                                    a.b(aVar, "titleSlot");
                                    V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
                                    I13 = u11.I();
                                    A0 d13 = u11.d();
                                    e f13 = c.f(u11, aVar);
                                    Function0 a14 = InterfaceC2801g.a.a();
                                    u11.i();
                                    if (u11.t()) {
                                        u11.e();
                                    } else {
                                        u11.H(a14);
                                    }
                                    Function2 f14 = E.f(u11, f12, u11, d13);
                                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                                        Ep.a.d(I13, u11, I13, f14);
                                    }
                                    F1.b(u11, f13, InterfaceC2801g.a.f());
                                    C3349u1.e((i19 >> 24) & 14, function23, u11);
                                }
                                u11.k();
                                u11.f();
                                u11.o(19389836);
                                if (!z11) {
                                    if (charSequence2 instanceof String) {
                                        u11.o(601150700);
                                        u3.b((String) charSequence2, oziTestTag2, j12, 0L, null, 0L, null, 0L, 2, false, i12, 0, null, t11, u11, (i19 >> 12) & 896, ((i19 >> 6) & 7168) | 48 | ((i19 >> 3) & 3670016), 55288);
                                        u11.k();
                                    } else {
                                        e eVar = oziTestTag2;
                                        if (charSequence2 instanceof C3422b) {
                                            u11.o(601517740);
                                            u3.c((C3422b) charSequence2, eVar, j12, 0L, 0L, null, 0L, 2, false, i12, 0, null, null, t11, u11, (i19 >> 12) & 896, ((i19 >> 6) & 7168) | 48 | (i19 & 29360128), 120824);
                                            u11.k();
                                        } else {
                                            if (charSequence2 != null) {
                                                u11.o(19415999);
                                                u11.k();
                                                throw new IllegalStateException(("Такой тип subtitle не поддерживается: " + N.b(charSequence2.getClass()).u()).toString());
                                            }
                                            u11.o(19414868);
                                            u11.k();
                                        }
                                    }
                                }
                                u11.k();
                                u11.f();
                                function24 = function23;
                            }
                            boolean z13 = z11;
                            m02 = u11.m0();
                            if (m02 == null) {
                                m02.G(new OziCellCenterScope$TextBlock$2(this, charSequence, i11, j11, t2, charSequence2, i12, j12, t11, function24, z13, i13, i14, i15));
                                return;
                            }
                            return;
                        }
                        i17 = i15 & 256;
                        if (i17 == 0) {
                        }
                        int i212 = i16;
                        i18 = i15 & UserVerificationMethods.USER_VERIFY_NONE;
                        if (i18 == 0) {
                        }
                        i19 = i212;
                        if ((306783379 & i19) != 306783378) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        aVar = e.f40358c0;
                        e oziTestTag3 = OziTestTagsKt.oziTestTag(aVar, OziCellTestTags.CenterTitle, null, u11, 54, 2);
                        a.b(oziTestTag3, SelectionItemFormDTO.TITLE_FIELD_NAME);
                        z11 = z12;
                        u11 = u11;
                        e oziTestTag22 = OziTestTagsKt.oziTestTag(aVar, OziCellTestTags.CenterSubtitle, null, u11, 54, 2);
                        a.b(oziTestTag22, "subtitle");
                        C5194q a112 = C5193p.a(C5179b.n(2), InterfaceC6250b.a.k(), u11, 6);
                        I11 = u11.I();
                        A0 d112 = u11.d();
                        e f72 = c.f(u11, aVar);
                        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                        }
                        Function2 g102 = b.g(u11, a112, u11, d112);
                        if (!u11.t()) {
                        }
                        Ep.a.d(I11, u11, I11, g102);
                        i.b(u11, f72, 19318187);
                        if (z11) {
                        }
                        u11.k();
                        e maxIntrinsicWidthIfInLazyRow2 = ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(aVar);
                        Y b112 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                        I12 = u11.I();
                        A0 d122 = u11.d();
                        e f112 = c.f(u11, maxIntrinsicWidthIfInLazyRow2);
                        Function0 a132 = InterfaceC2801g.a.a();
                        u11.i();
                        if (u11.t()) {
                        }
                        Function2 h112 = Cm.e.h(u11, b112, u11, d122);
                        if (!u11.t()) {
                        }
                        Ep.a.d(I12, u11, I12, h112);
                        F1.b(u11, f112, InterfaceC2801g.a.f());
                        C9891D c9891d2 = C9891D.f99599a;
                        if (!(charSequence instanceof String)) {
                        }
                        u11.o(65592807);
                        if (charSequence != null) {
                            a.b(aVar, "titleSlot");
                            V f122 = C5185h.f(InterfaceC6250b.a.o(), false);
                            I13 = u11.I();
                            A0 d132 = u11.d();
                            e f132 = c.f(u11, aVar);
                            Function0 a142 = InterfaceC2801g.a.a();
                            u11.i();
                            if (u11.t()) {
                            }
                            Function2 f142 = E.f(u11, f122, u11, d132);
                            if (!u11.t()) {
                            }
                            Ep.a.d(I13, u11, I13, f142);
                            F1.b(u11, f132, InterfaceC2801g.a.f());
                            C3349u1.e((i19 >> 24) & 14, function23, u11);
                        }
                        u11.k();
                        u11.f();
                        u11.o(19389836);
                        if (!z11) {
                        }
                        u11.k();
                        u11.f();
                        function24 = function23;
                        boolean z132 = z11;
                        m02 = u11.m0();
                        if (m02 == null) {
                        }
                    }
                    if ((i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    }
                    i17 = i15 & 256;
                    if (i17 == 0) {
                    }
                    int i2122 = i16;
                    i18 = i15 & UserVerificationMethods.USER_VERIFY_NONE;
                    if (i18 == 0) {
                    }
                    i19 = i2122;
                    if ((306783379 & i19) != 306783378) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    aVar = e.f40358c0;
                    e oziTestTag32 = OziTestTagsKt.oziTestTag(aVar, OziCellTestTags.CenterTitle, null, u11, 54, 2);
                    a.b(oziTestTag32, SelectionItemFormDTO.TITLE_FIELD_NAME);
                    z11 = z12;
                    u11 = u11;
                    e oziTestTag222 = OziTestTagsKt.oziTestTag(aVar, OziCellTestTags.CenterSubtitle, null, u11, 54, 2);
                    a.b(oziTestTag222, "subtitle");
                    C5194q a1122 = C5193p.a(C5179b.n(2), InterfaceC6250b.a.k(), u11, 6);
                    I11 = u11.I();
                    A0 d1122 = u11.d();
                    e f722 = c.f(u11, aVar);
                    Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 g1022 = b.g(u11, a1122, u11, d1122);
                    if (!u11.t()) {
                    }
                    Ep.a.d(I11, u11, I11, g1022);
                    i.b(u11, f722, 19318187);
                    if (z11) {
                    }
                    u11.k();
                    e maxIntrinsicWidthIfInLazyRow22 = ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(aVar);
                    Y b1122 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                    I12 = u11.I();
                    A0 d1222 = u11.d();
                    e f1122 = c.f(u11, maxIntrinsicWidthIfInLazyRow22);
                    Function0 a1322 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                    }
                    Function2 h1122 = Cm.e.h(u11, b1122, u11, d1222);
                    if (!u11.t()) {
                    }
                    Ep.a.d(I12, u11, I12, h1122);
                    F1.b(u11, f1122, InterfaceC2801g.a.f());
                    C9891D c9891d22 = C9891D.f99599a;
                    if (!(charSequence instanceof String)) {
                    }
                    u11.o(65592807);
                    if (charSequence != null) {
                    }
                    u11.k();
                    u11.f();
                    u11.o(19389836);
                    if (!z11) {
                    }
                    u11.k();
                    u11.f();
                    function24 = function23;
                    boolean z1322 = z11;
                    m02 = u11.m0();
                    if (m02 == null) {
                    }
                }
                if ((i15 & 64) == 0) {
                }
                if ((i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                }
                i17 = i15 & 256;
                if (i17 == 0) {
                }
                int i21222 = i16;
                i18 = i15 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i18 == 0) {
                }
                i19 = i21222;
                if ((306783379 & i19) != 306783378) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                aVar = e.f40358c0;
                e oziTestTag322 = OziTestTagsKt.oziTestTag(aVar, OziCellTestTags.CenterTitle, null, u11, 54, 2);
                a.b(oziTestTag322, SelectionItemFormDTO.TITLE_FIELD_NAME);
                z11 = z12;
                u11 = u11;
                e oziTestTag2222 = OziTestTagsKt.oziTestTag(aVar, OziCellTestTags.CenterSubtitle, null, u11, 54, 2);
                a.b(oziTestTag2222, "subtitle");
                C5194q a11222 = C5193p.a(C5179b.n(2), InterfaceC6250b.a.k(), u11, 6);
                I11 = u11.I();
                A0 d11222 = u11.d();
                e f7222 = c.f(u11, aVar);
                Function0 a12222 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 g10222 = b.g(u11, a11222, u11, d11222);
                if (!u11.t()) {
                }
                Ep.a.d(I11, u11, I11, g10222);
                i.b(u11, f7222, 19318187);
                if (z11) {
                }
                u11.k();
                e maxIntrinsicWidthIfInLazyRow222 = ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(aVar);
                Y b11222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                I12 = u11.I();
                A0 d12222 = u11.d();
                e f11222 = c.f(u11, maxIntrinsicWidthIfInLazyRow222);
                Function0 a13222 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                }
                Function2 h11222 = Cm.e.h(u11, b11222, u11, d12222);
                if (!u11.t()) {
                }
                Ep.a.d(I12, u11, I12, h11222);
                F1.b(u11, f11222, InterfaceC2801g.a.f());
                C9891D c9891d222 = C9891D.f99599a;
                if (!(charSequence instanceof String)) {
                }
                u11.o(65592807);
                if (charSequence != null) {
                }
                u11.k();
                u11.f();
                u11.o(19389836);
                if (!z11) {
                }
                u11.k();
                u11.f();
                function24 = function23;
                boolean z13222 = z11;
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            if ((i15 & 8) != 0) {
            }
            if ((i15 & 16) != 0) {
            }
            if ((i15 & 32) != 0) {
            }
            if ((i15 & 64) == 0) {
            }
            if ((i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            }
            i17 = i15 & 256;
            if (i17 == 0) {
            }
            int i212222 = i16;
            i18 = i15 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i18 == 0) {
            }
            i19 = i212222;
            if ((306783379 & i19) != 306783378) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            aVar = e.f40358c0;
            e oziTestTag3222 = OziTestTagsKt.oziTestTag(aVar, OziCellTestTags.CenterTitle, null, u11, 54, 2);
            a.b(oziTestTag3222, SelectionItemFormDTO.TITLE_FIELD_NAME);
            z11 = z12;
            u11 = u11;
            e oziTestTag22222 = OziTestTagsKt.oziTestTag(aVar, OziCellTestTags.CenterSubtitle, null, u11, 54, 2);
            a.b(oziTestTag22222, "subtitle");
            C5194q a112222 = C5193p.a(C5179b.n(2), InterfaceC6250b.a.k(), u11, 6);
            I11 = u11.I();
            A0 d112222 = u11.d();
            e f72222 = c.f(u11, aVar);
            Function0 a122222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 g102222 = b.g(u11, a112222, u11, d112222);
            if (!u11.t()) {
            }
            Ep.a.d(I11, u11, I11, g102222);
            i.b(u11, f72222, 19318187);
            if (z11) {
            }
            u11.k();
            e maxIntrinsicWidthIfInLazyRow2222 = ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(aVar);
            Y b112222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            I12 = u11.I();
            A0 d122222 = u11.d();
            e f112222 = c.f(u11, maxIntrinsicWidthIfInLazyRow2222);
            Function0 a132222 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
            }
            Function2 h112222 = Cm.e.h(u11, b112222, u11, d122222);
            if (!u11.t()) {
            }
            Ep.a.d(I12, u11, I12, h112222);
            F1.b(u11, f112222, InterfaceC2801g.a.f());
            C9891D c9891d2222 = C9891D.f99599a;
            if (!(charSequence instanceof String)) {
            }
            u11.o(65592807);
            if (charSequence != null) {
            }
            u11.k();
            u11.f();
            u11.o(19389836);
            if (!z11) {
            }
            u11.k();
            u11.f();
            function24 = function23;
            boolean z132222 = z11;
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        if ((i15 & 4) == 0) {
        }
        if ((i15 & 8) != 0) {
        }
        if ((i15 & 16) != 0) {
        }
        if ((i15 & 32) != 0) {
        }
        if ((i15 & 64) == 0) {
        }
        if ((i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
        }
        i17 = i15 & 256;
        if (i17 == 0) {
        }
        int i2122222 = i16;
        i18 = i15 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i18 == 0) {
        }
        i19 = i2122222;
        if ((306783379 & i19) != 306783378) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        aVar = e.f40358c0;
        e oziTestTag32222 = OziTestTagsKt.oziTestTag(aVar, OziCellTestTags.CenterTitle, null, u11, 54, 2);
        a.b(oziTestTag32222, SelectionItemFormDTO.TITLE_FIELD_NAME);
        z11 = z12;
        u11 = u11;
        e oziTestTag222222 = OziTestTagsKt.oziTestTag(aVar, OziCellTestTags.CenterSubtitle, null, u11, 54, 2);
        a.b(oziTestTag222222, "subtitle");
        C5194q a1122222 = C5193p.a(C5179b.n(2), InterfaceC6250b.a.k(), u11, 6);
        I11 = u11.I();
        A0 d1122222 = u11.d();
        e f722222 = c.f(u11, aVar);
        Function0 a1222222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g1022222 = b.g(u11, a1122222, u11, d1122222);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, g1022222);
        i.b(u11, f722222, 19318187);
        if (z11) {
        }
        u11.k();
        e maxIntrinsicWidthIfInLazyRow22222 = ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(aVar);
        Y b1122222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
        I12 = u11.I();
        A0 d1222222 = u11.d();
        e f1122222 = c.f(u11, maxIntrinsicWidthIfInLazyRow22222);
        Function0 a1322222 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 h1122222 = Cm.e.h(u11, b1122222, u11, d1222222);
        if (!u11.t()) {
        }
        Ep.a.d(I12, u11, I12, h1122222);
        F1.b(u11, f1122222, InterfaceC2801g.a.f());
        C9891D c9891d22222 = C9891D.f99599a;
        if (!(charSequence instanceof String)) {
        }
        u11.o(65592807);
        if (charSequence != null) {
        }
        u11.k();
        u11.f();
        u11.o(19389836);
        if (!z11) {
        }
        u11.k();
        u11.f();
        function24 = function23;
        boolean z1322222 = z11;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00de  */
    /* renamed from: Default500-Rx1qByU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3076Default500Rx1qByU(String str, String str2, e eVar, int i11, int i12, long j11, long j12, float f7, InterfaceC3967k interfaceC3967k, int i13, int i14) {
        int i15;
        String str3;
        int i16;
        e eVar2;
        int i17;
        int i18;
        int i19;
        int i21;
        long j13;
        int i22;
        int i23;
        int i24;
        long j14;
        float f11;
        int i25;
        long j15;
        int i26;
        float f12;
        e eVar3;
        int i27;
        long j16;
        int i28;
        long j17;
        J0 m02;
        int i29;
        int i31;
        C3969l u11 = interfaceC3967k.u(-501091947);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (u11.n(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            str3 = str2;
            i15 |= u11.n(str3) ? 32 : 16;
            i16 = i14 & 4;
            if (i16 == 0) {
                i15 |= 384;
            } else if ((i13 & 384) == 0) {
                eVar2 = eVar;
                i15 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i17 = i14 & 8;
                if (i17 != 0) {
                    i15 |= 3072;
                } else if ((i13 & 3072) == 0) {
                    i18 = i11;
                    i15 |= u11.r(i18) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    i19 = i14 & 16;
                    if (i19 == 0) {
                        i15 |= 24576;
                    } else if ((i13 & 24576) == 0) {
                        i21 = i12;
                        i15 |= u11.r(i21) ? 16384 : 8192;
                        if ((196608 & i13) == 0) {
                            j13 = j11;
                            i15 |= ((i14 & 32) == 0 && u11.s(j13)) ? 131072 : 65536;
                        } else {
                            j13 = j11;
                        }
                        if ((1572864 & i13) == 0) {
                            if ((i14 & 64) == 0) {
                                i29 = i15;
                                if (u11.s(j12)) {
                                    i31 = 1048576;
                                    i22 = i29 | i31;
                                }
                            } else {
                                i29 = i15;
                            }
                            i31 = 524288;
                            i22 = i29 | i31;
                        } else {
                            i22 = i15;
                        }
                        i23 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i23 != 0) {
                            i22 |= 12582912;
                        } else if ((i13 & 12582912) == 0) {
                            i24 = i23;
                            i22 |= u11.q(f7) ? 8388608 : 4194304;
                            if ((i14 & 256) == 0) {
                                i22 |= 100663296;
                            } else if ((i13 & 100663296) == 0) {
                                i22 |= u11.n(this) ? 67108864 : 33554432;
                                if ((i22 & 38347923) == 38347922 || !u11.b()) {
                                    u11.Q0();
                                    if ((i13 & 1) != 0 || u11.w0()) {
                                        if (i16 != 0) {
                                            eVar2 = e.f40358c0;
                                        }
                                        if (i17 != 0) {
                                            i18 = 2;
                                        }
                                        if (i19 != 0) {
                                            i21 = 3;
                                        }
                                        if ((i14 & 32) != 0) {
                                            j13 = OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getTextPrimary();
                                            i22 &= -458753;
                                        }
                                        if ((i14 & 64) != 0) {
                                            j14 = OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getTextSecondaryTransparent();
                                            i22 &= -3670017;
                                        } else {
                                            j14 = j12;
                                        }
                                        f11 = i24 != 0 ? 50 : f7;
                                        i25 = i21;
                                        j15 = j14;
                                        i26 = i18;
                                    } else {
                                        u11.j();
                                        if ((i14 & 32) != 0) {
                                            i22 &= -458753;
                                        }
                                        if ((i14 & 64) != 0) {
                                            i22 &= -3670017;
                                        }
                                        j15 = j12;
                                        f11 = f7;
                                        i26 = i18;
                                        i25 = i21;
                                    }
                                    long j18 = j13;
                                    u11.j0();
                                    m3079AddonBuilder942rkJo(androidx.compose.foundation.layout.T.h(eVar2, 0.0f, 2, 1), null, f11, a1.c.c(1714847466, new OziCellCenterScope$Default500$1(this, str, i26, j18, str3, i25, j15), u11), u11, ((i22 >> 15) & 896) | 3072 | ((i22 >> 12) & 57344), 2);
                                    f12 = f11;
                                    eVar3 = eVar2;
                                    i27 = i26;
                                    j16 = j18;
                                    i28 = i25;
                                    j17 = j15;
                                } else {
                                    u11.j();
                                    f12 = f7;
                                    eVar3 = eVar2;
                                    i27 = i18;
                                    i28 = i21;
                                    j16 = j13;
                                    j17 = j12;
                                }
                                m02 = u11.m0();
                                if (m02 != null) {
                                    m02.G(new OziCellCenterScope$Default500$2(this, str, str2, eVar3, i27, i28, j16, j17, f12, i13, i14));
                                    return;
                                }
                                return;
                            }
                            if ((i22 & 38347923) == 38347922) {
                            }
                            u11.Q0();
                            if ((i13 & 1) != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i17 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            if ((i14 & 32) != 0) {
                            }
                            if ((i14 & 64) != 0) {
                            }
                            if (i24 != 0) {
                            }
                            i25 = i21;
                            j15 = j14;
                            i26 = i18;
                            long j182 = j13;
                            u11.j0();
                            m3079AddonBuilder942rkJo(androidx.compose.foundation.layout.T.h(eVar2, 0.0f, 2, 1), null, f11, a1.c.c(1714847466, new OziCellCenterScope$Default500$1(this, str, i26, j182, str3, i25, j15), u11), u11, ((i22 >> 15) & 896) | 3072 | ((i22 >> 12) & 57344), 2);
                            f12 = f11;
                            eVar3 = eVar2;
                            i27 = i26;
                            j16 = j182;
                            i28 = i25;
                            j17 = j15;
                            m02 = u11.m0();
                            if (m02 != null) {
                            }
                        }
                        i24 = i23;
                        if ((i14 & 256) == 0) {
                        }
                        if ((i22 & 38347923) == 38347922) {
                        }
                        u11.Q0();
                        if ((i13 & 1) != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if ((i14 & 32) != 0) {
                        }
                        if ((i14 & 64) != 0) {
                        }
                        if (i24 != 0) {
                        }
                        i25 = i21;
                        j15 = j14;
                        i26 = i18;
                        long j1822 = j13;
                        u11.j0();
                        m3079AddonBuilder942rkJo(androidx.compose.foundation.layout.T.h(eVar2, 0.0f, 2, 1), null, f11, a1.c.c(1714847466, new OziCellCenterScope$Default500$1(this, str, i26, j1822, str3, i25, j15), u11), u11, ((i22 >> 15) & 896) | 3072 | ((i22 >> 12) & 57344), 2);
                        f12 = f11;
                        eVar3 = eVar2;
                        i27 = i26;
                        j16 = j1822;
                        i28 = i25;
                        j17 = j15;
                        m02 = u11.m0();
                        if (m02 != null) {
                        }
                    }
                    i21 = i12;
                    if ((196608 & i13) == 0) {
                    }
                    if ((1572864 & i13) == 0) {
                    }
                    i23 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i23 != 0) {
                    }
                    i24 = i23;
                    if ((i14 & 256) == 0) {
                    }
                    if ((i22 & 38347923) == 38347922) {
                    }
                    u11.Q0();
                    if ((i13 & 1) != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if ((i14 & 32) != 0) {
                    }
                    if ((i14 & 64) != 0) {
                    }
                    if (i24 != 0) {
                    }
                    i25 = i21;
                    j15 = j14;
                    i26 = i18;
                    long j18222 = j13;
                    u11.j0();
                    m3079AddonBuilder942rkJo(androidx.compose.foundation.layout.T.h(eVar2, 0.0f, 2, 1), null, f11, a1.c.c(1714847466, new OziCellCenterScope$Default500$1(this, str, i26, j18222, str3, i25, j15), u11), u11, ((i22 >> 15) & 896) | 3072 | ((i22 >> 12) & 57344), 2);
                    f12 = f11;
                    eVar3 = eVar2;
                    i27 = i26;
                    j16 = j18222;
                    i28 = i25;
                    j17 = j15;
                    m02 = u11.m0();
                    if (m02 != null) {
                    }
                }
                i18 = i11;
                i19 = i14 & 16;
                if (i19 == 0) {
                }
                i21 = i12;
                if ((196608 & i13) == 0) {
                }
                if ((1572864 & i13) == 0) {
                }
                i23 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i23 != 0) {
                }
                i24 = i23;
                if ((i14 & 256) == 0) {
                }
                if ((i22 & 38347923) == 38347922) {
                }
                u11.Q0();
                if ((i13 & 1) != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i19 != 0) {
                }
                if ((i14 & 32) != 0) {
                }
                if ((i14 & 64) != 0) {
                }
                if (i24 != 0) {
                }
                i25 = i21;
                j15 = j14;
                i26 = i18;
                long j182222 = j13;
                u11.j0();
                m3079AddonBuilder942rkJo(androidx.compose.foundation.layout.T.h(eVar2, 0.0f, 2, 1), null, f11, a1.c.c(1714847466, new OziCellCenterScope$Default500$1(this, str, i26, j182222, str3, i25, j15), u11), u11, ((i22 >> 15) & 896) | 3072 | ((i22 >> 12) & 57344), 2);
                f12 = f11;
                eVar3 = eVar2;
                i27 = i26;
                j16 = j182222;
                i28 = i25;
                j17 = j15;
                m02 = u11.m0();
                if (m02 != null) {
                }
            }
            eVar2 = eVar;
            i17 = i14 & 8;
            if (i17 != 0) {
            }
            i18 = i11;
            i19 = i14 & 16;
            if (i19 == 0) {
            }
            i21 = i12;
            if ((196608 & i13) == 0) {
            }
            if ((1572864 & i13) == 0) {
            }
            i23 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i23 != 0) {
            }
            i24 = i23;
            if ((i14 & 256) == 0) {
            }
            if ((i22 & 38347923) == 38347922) {
            }
            u11.Q0();
            if ((i13 & 1) != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i19 != 0) {
            }
            if ((i14 & 32) != 0) {
            }
            if ((i14 & 64) != 0) {
            }
            if (i24 != 0) {
            }
            i25 = i21;
            j15 = j14;
            i26 = i18;
            long j1822222 = j13;
            u11.j0();
            m3079AddonBuilder942rkJo(androidx.compose.foundation.layout.T.h(eVar2, 0.0f, 2, 1), null, f11, a1.c.c(1714847466, new OziCellCenterScope$Default500$1(this, str, i26, j1822222, str3, i25, j15), u11), u11, ((i22 >> 15) & 896) | 3072 | ((i22 >> 12) & 57344), 2);
            f12 = f11;
            eVar3 = eVar2;
            i27 = i26;
            j16 = j1822222;
            i28 = i25;
            j17 = j15;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        str3 = str2;
        i16 = i14 & 4;
        if (i16 == 0) {
        }
        eVar2 = eVar;
        i17 = i14 & 8;
        if (i17 != 0) {
        }
        i18 = i11;
        i19 = i14 & 16;
        if (i19 == 0) {
        }
        i21 = i12;
        if ((196608 & i13) == 0) {
        }
        if ((1572864 & i13) == 0) {
        }
        i23 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i23 != 0) {
        }
        i24 = i23;
        if ((i14 & 256) == 0) {
        }
        if ((i22 & 38347923) == 38347922) {
        }
        u11.Q0();
        if ((i13 & 1) != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i19 != 0) {
        }
        if ((i14 & 32) != 0) {
        }
        if ((i14 & 64) != 0) {
        }
        if (i24 != 0) {
        }
        i25 = i21;
        j15 = j14;
        i26 = i18;
        long j18222222 = j13;
        u11.j0();
        m3079AddonBuilder942rkJo(androidx.compose.foundation.layout.T.h(eVar2, 0.0f, 2, 1), null, f11, a1.c.c(1714847466, new OziCellCenterScope$Default500$1(this, str, i26, j18222222, str3, i25, j15), u11), u11, ((i22 >> 15) & 896) | 3072 | ((i22 >> 12) & 57344), 2);
        f12 = f11;
        eVar3 = eVar2;
        i27 = i26;
        j16 = j18222222;
        i28 = i25;
        j17 = j15;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0250  */
    /* renamed from: Default500Badge-X9ctgU4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3077Default500BadgeX9ctgU4(C3422b c3422b, C3422b c3422b2, e eVar, e eVar2, int i11, @NotNull String badgeLabel, AbstractC8972b abstractC8972b, OziBadgeStyle oziBadgeStyle, boolean z11, long j11, long j12, float f7, InterfaceC3967k interfaceC3967k, int i12, int i13, int i14) {
        int i15;
        int i16;
        e eVar3;
        int i17;
        int i18;
        int i19;
        int i21;
        AbstractC8972b abstractC8972b2;
        int i22;
        OziBadgeStyle oziBadgeStyle2;
        int i23;
        int i24;
        int i25;
        long j13;
        int i26;
        e eVar4;
        e eVar5;
        boolean z12;
        long j14;
        AbstractC8972b abstractC8972b3;
        long j15;
        float f11;
        int i27;
        float f12;
        e eVar6;
        OziBadgeStyle oziBadgeStyle3;
        boolean z13;
        C3969l c3969l;
        long j16;
        AbstractC8972b abstractC8972b4;
        long j17;
        e eVar7;
        J0 m02;
        int i28;
        int i29;
        Intrinsics.checkNotNullParameter(badgeLabel, "badgeLabel");
        C3969l u11 = interfaceC3967k.u(373907394);
        if ((i14 & 1) != 0) {
            i15 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i15 = (u11.n(c3422b) ? 4 : 2) | i12;
        } else {
            i15 = i12;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i12 & 48) == 0) {
            i15 |= u11.n(c3422b2) ? 32 : 16;
            i16 = i14 & 4;
            if (i16 == 0) {
                i15 |= 384;
            } else if ((i12 & 384) == 0) {
                eVar3 = eVar;
                i15 |= u11.n(eVar3) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i17 = i14 & 8;
                if (i17 != 0) {
                    i15 |= 3072;
                } else if ((i12 & 3072) == 0) {
                    i15 |= u11.n(eVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    i18 = i14 & 16;
                    if (i18 == 0) {
                        i15 |= 24576;
                    } else if ((i12 & 24576) == 0) {
                        i19 = i11;
                        i15 |= u11.r(i19) ? 16384 : 8192;
                        if ((i14 & 32) != 0) {
                            i15 |= 196608;
                        } else if ((i12 & 196608) == 0) {
                            i15 |= u11.n(badgeLabel) ? 131072 : 65536;
                        }
                        i21 = i14 & 64;
                        if (i21 != 0) {
                            i15 |= 1572864;
                            abstractC8972b2 = abstractC8972b;
                        } else {
                            abstractC8972b2 = abstractC8972b;
                            if ((i12 & 1572864) == 0) {
                                i15 |= u11.n(abstractC8972b2) ? 1048576 : 524288;
                            }
                        }
                        i22 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i22 != 0) {
                            i15 |= 12582912;
                            oziBadgeStyle2 = oziBadgeStyle;
                        } else {
                            oziBadgeStyle2 = oziBadgeStyle;
                            if ((i12 & 12582912) == 0) {
                                i15 |= u11.n(oziBadgeStyle2) ? 8388608 : 4194304;
                            }
                        }
                        i23 = i14 & 256;
                        if (i23 != 0) {
                            i15 |= 100663296;
                        } else if ((i12 & 100663296) == 0) {
                            i15 |= u11.p(z11) ? 67108864 : 33554432;
                        }
                        if ((i12 & 805306368) == 0) {
                            if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) == 0 && u11.s(j11)) {
                                i29 = 536870912;
                                i15 |= i29;
                            }
                            i29 = 268435456;
                            i15 |= i29;
                        }
                        if ((i13 & 6) == 0) {
                            if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) == 0 && u11.s(j12)) {
                                i28 = 4;
                                i24 = i13 | i28;
                            }
                            i28 = 2;
                            i24 = i13 | i28;
                        } else {
                            i24 = i13;
                        }
                        i25 = i14 & 2048;
                        if (i25 != 0) {
                            i24 |= 48;
                        } else if ((i13 & 48) == 0) {
                            i24 |= u11.q(f7) ? 32 : 16;
                            int i31 = i24;
                            if ((i14 & 4096) == 0) {
                                i31 |= 384;
                            } else if ((i13 & 384) == 0) {
                                i31 |= u11.n(this) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                                if ((i15 & 306783379) != 306783378 && (i31 & 147) == 146 && u11.b()) {
                                    u11.j();
                                    eVar6 = eVar2;
                                    z13 = z11;
                                    f12 = f7;
                                    c3969l = u11;
                                    i26 = i19;
                                    abstractC8972b4 = abstractC8972b2;
                                    oziBadgeStyle3 = oziBadgeStyle2;
                                    eVar7 = eVar3;
                                    j17 = j11;
                                    j16 = j12;
                                } else {
                                    u11.Q0();
                                    if ((i12 & 1) != 0 || u11.w0()) {
                                        if (i16 != 0) {
                                            eVar3 = e.f40358c0;
                                        }
                                        e eVar8 = i17 != 0 ? e.f40358c0 : eVar2;
                                        int i32 = i18 != 0 ? 3 : i19;
                                        AbstractC8972b abstractC8972b5 = i21 != 0 ? null : abstractC8972b2;
                                        OziBadgeStyle oziBadgeStyle4 = i22 != 0 ? OziBadgeStyle.NeutralSecondary.INSTANCE : oziBadgeStyle2;
                                        boolean z14 = i23 != 0 ? false : z11;
                                        long textPrimary = (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getTextPrimary() : j11;
                                        if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                            j13 = OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getTextSecondaryTransparent();
                                            i31 &= -15;
                                        } else {
                                            j13 = j12;
                                        }
                                        if (i25 != 0) {
                                            i26 = i32;
                                            oziBadgeStyle2 = oziBadgeStyle4;
                                            eVar5 = eVar8;
                                            long j18 = j13;
                                            f11 = 50;
                                            i27 = i31;
                                            eVar4 = eVar3;
                                            z12 = z14;
                                            j14 = textPrimary;
                                            abstractC8972b3 = abstractC8972b5;
                                            j15 = j18;
                                        } else {
                                            i26 = i32;
                                            oziBadgeStyle2 = oziBadgeStyle4;
                                            eVar4 = eVar3;
                                            eVar5 = eVar8;
                                            z12 = z14;
                                            j14 = textPrimary;
                                            abstractC8972b3 = abstractC8972b5;
                                            j15 = j13;
                                            f11 = f7;
                                            i27 = i31;
                                        }
                                    } else {
                                        u11.j();
                                        if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                            i31 &= -15;
                                        }
                                        j14 = j11;
                                        f11 = f7;
                                        i27 = i31;
                                        i26 = i19;
                                        abstractC8972b3 = abstractC8972b2;
                                        eVar4 = eVar3;
                                        eVar5 = eVar2;
                                        z12 = z11;
                                        j15 = j12;
                                    }
                                    u11.j0();
                                    e eVar9 = eVar4;
                                    float f13 = f11;
                                    m3079AddonBuilder942rkJo(androidx.compose.foundation.layout.T.h(eVar4, 0.0f, 2, 1), null, f13, a1.c.c(611755277, new OziCellCenterScope$Default500Badge$5(this, c3422b, j14, c3422b2, i26, j15, eVar5, badgeLabel, abstractC8972b3, oziBadgeStyle2, z12), u11), u11, ((i27 << 3) & 896) | 3072 | (57344 & (i27 << 6)), 2);
                                    f12 = f13;
                                    eVar6 = eVar5;
                                    oziBadgeStyle3 = oziBadgeStyle2;
                                    z13 = z12;
                                    c3969l = u11;
                                    j16 = j15;
                                    abstractC8972b4 = abstractC8972b3;
                                    j17 = j14;
                                    eVar7 = eVar9;
                                }
                                m02 = c3969l.m0();
                                if (m02 != null) {
                                    m02.G(new OziCellCenterScope$Default500Badge$6(this, c3422b, c3422b2, eVar7, eVar6, i26, badgeLabel, abstractC8972b4, oziBadgeStyle3, z13, j17, j16, f12, i12, i13, i14));
                                    return;
                                }
                                return;
                            }
                            if ((i15 & 306783379) != 306783378) {
                            }
                            u11.Q0();
                            if ((i12 & 1) != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i17 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i21 != 0) {
                            }
                            if (i22 != 0) {
                            }
                            if (i23 != 0) {
                            }
                            if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                            }
                            if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                            }
                            if (i25 != 0) {
                            }
                            u11.j0();
                            e eVar92 = eVar4;
                            float f132 = f11;
                            m3079AddonBuilder942rkJo(androidx.compose.foundation.layout.T.h(eVar4, 0.0f, 2, 1), null, f132, a1.c.c(611755277, new OziCellCenterScope$Default500Badge$5(this, c3422b, j14, c3422b2, i26, j15, eVar5, badgeLabel, abstractC8972b3, oziBadgeStyle2, z12), u11), u11, ((i27 << 3) & 896) | 3072 | (57344 & (i27 << 6)), 2);
                            f12 = f132;
                            eVar6 = eVar5;
                            oziBadgeStyle3 = oziBadgeStyle2;
                            z13 = z12;
                            c3969l = u11;
                            j16 = j15;
                            abstractC8972b4 = abstractC8972b3;
                            j17 = j14;
                            eVar7 = eVar92;
                            m02 = c3969l.m0();
                            if (m02 != null) {
                            }
                        }
                        int i312 = i24;
                        if ((i14 & 4096) == 0) {
                        }
                        if ((i15 & 306783379) != 306783378) {
                        }
                        u11.Q0();
                        if ((i12 & 1) != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i21 != 0) {
                        }
                        if (i22 != 0) {
                        }
                        if (i23 != 0) {
                        }
                        if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                        }
                        if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                        }
                        if (i25 != 0) {
                        }
                        u11.j0();
                        e eVar922 = eVar4;
                        float f1322 = f11;
                        m3079AddonBuilder942rkJo(androidx.compose.foundation.layout.T.h(eVar4, 0.0f, 2, 1), null, f1322, a1.c.c(611755277, new OziCellCenterScope$Default500Badge$5(this, c3422b, j14, c3422b2, i26, j15, eVar5, badgeLabel, abstractC8972b3, oziBadgeStyle2, z12), u11), u11, ((i27 << 3) & 896) | 3072 | (57344 & (i27 << 6)), 2);
                        f12 = f1322;
                        eVar6 = eVar5;
                        oziBadgeStyle3 = oziBadgeStyle2;
                        z13 = z12;
                        c3969l = u11;
                        j16 = j15;
                        abstractC8972b4 = abstractC8972b3;
                        j17 = j14;
                        eVar7 = eVar922;
                        m02 = c3969l.m0();
                        if (m02 != null) {
                        }
                    }
                    i19 = i11;
                    if ((i14 & 32) != 0) {
                    }
                    i21 = i14 & 64;
                    if (i21 != 0) {
                    }
                    i22 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i22 != 0) {
                    }
                    i23 = i14 & 256;
                    if (i23 != 0) {
                    }
                    if ((i12 & 805306368) == 0) {
                    }
                    if ((i13 & 6) == 0) {
                    }
                    i25 = i14 & 2048;
                    if (i25 != 0) {
                    }
                    int i3122 = i24;
                    if ((i14 & 4096) == 0) {
                    }
                    if ((i15 & 306783379) != 306783378) {
                    }
                    u11.Q0();
                    if ((i12 & 1) != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i23 != 0) {
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    }
                    if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    }
                    if (i25 != 0) {
                    }
                    u11.j0();
                    e eVar9222 = eVar4;
                    float f13222 = f11;
                    m3079AddonBuilder942rkJo(androidx.compose.foundation.layout.T.h(eVar4, 0.0f, 2, 1), null, f13222, a1.c.c(611755277, new OziCellCenterScope$Default500Badge$5(this, c3422b, j14, c3422b2, i26, j15, eVar5, badgeLabel, abstractC8972b3, oziBadgeStyle2, z12), u11), u11, ((i27 << 3) & 896) | 3072 | (57344 & (i27 << 6)), 2);
                    f12 = f13222;
                    eVar6 = eVar5;
                    oziBadgeStyle3 = oziBadgeStyle2;
                    z13 = z12;
                    c3969l = u11;
                    j16 = j15;
                    abstractC8972b4 = abstractC8972b3;
                    j17 = j14;
                    eVar7 = eVar9222;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                i18 = i14 & 16;
                if (i18 == 0) {
                }
                i19 = i11;
                if ((i14 & 32) != 0) {
                }
                i21 = i14 & 64;
                if (i21 != 0) {
                }
                i22 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i22 != 0) {
                }
                i23 = i14 & 256;
                if (i23 != 0) {
                }
                if ((i12 & 805306368) == 0) {
                }
                if ((i13 & 6) == 0) {
                }
                i25 = i14 & 2048;
                if (i25 != 0) {
                }
                int i31222 = i24;
                if ((i14 & 4096) == 0) {
                }
                if ((i15 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i12 & 1) != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i21 != 0) {
                }
                if (i22 != 0) {
                }
                if (i23 != 0) {
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                }
                if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                }
                if (i25 != 0) {
                }
                u11.j0();
                e eVar92222 = eVar4;
                float f132222 = f11;
                m3079AddonBuilder942rkJo(androidx.compose.foundation.layout.T.h(eVar4, 0.0f, 2, 1), null, f132222, a1.c.c(611755277, new OziCellCenterScope$Default500Badge$5(this, c3422b, j14, c3422b2, i26, j15, eVar5, badgeLabel, abstractC8972b3, oziBadgeStyle2, z12), u11), u11, ((i27 << 3) & 896) | 3072 | (57344 & (i27 << 6)), 2);
                f12 = f132222;
                eVar6 = eVar5;
                oziBadgeStyle3 = oziBadgeStyle2;
                z13 = z12;
                c3969l = u11;
                j16 = j15;
                abstractC8972b4 = abstractC8972b3;
                j17 = j14;
                eVar7 = eVar92222;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            eVar3 = eVar;
            i17 = i14 & 8;
            if (i17 != 0) {
            }
            i18 = i14 & 16;
            if (i18 == 0) {
            }
            i19 = i11;
            if ((i14 & 32) != 0) {
            }
            i21 = i14 & 64;
            if (i21 != 0) {
            }
            i22 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i22 != 0) {
            }
            i23 = i14 & 256;
            if (i23 != 0) {
            }
            if ((i12 & 805306368) == 0) {
            }
            if ((i13 & 6) == 0) {
            }
            i25 = i14 & 2048;
            if (i25 != 0) {
            }
            int i312222 = i24;
            if ((i14 & 4096) == 0) {
            }
            if ((i15 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i12 & 1) != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i21 != 0) {
            }
            if (i22 != 0) {
            }
            if (i23 != 0) {
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            }
            if (i25 != 0) {
            }
            u11.j0();
            e eVar922222 = eVar4;
            float f1322222 = f11;
            m3079AddonBuilder942rkJo(androidx.compose.foundation.layout.T.h(eVar4, 0.0f, 2, 1), null, f1322222, a1.c.c(611755277, new OziCellCenterScope$Default500Badge$5(this, c3422b, j14, c3422b2, i26, j15, eVar5, badgeLabel, abstractC8972b3, oziBadgeStyle2, z12), u11), u11, ((i27 << 3) & 896) | 3072 | (57344 & (i27 << 6)), 2);
            f12 = f1322222;
            eVar6 = eVar5;
            oziBadgeStyle3 = oziBadgeStyle2;
            z13 = z12;
            c3969l = u11;
            j16 = j15;
            abstractC8972b4 = abstractC8972b3;
            j17 = j14;
            eVar7 = eVar922222;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        i16 = i14 & 4;
        if (i16 == 0) {
        }
        eVar3 = eVar;
        i17 = i14 & 8;
        if (i17 != 0) {
        }
        i18 = i14 & 16;
        if (i18 == 0) {
        }
        i19 = i11;
        if ((i14 & 32) != 0) {
        }
        i21 = i14 & 64;
        if (i21 != 0) {
        }
        i22 = i14 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i22 != 0) {
        }
        i23 = i14 & 256;
        if (i23 != 0) {
        }
        if ((i12 & 805306368) == 0) {
        }
        if ((i13 & 6) == 0) {
        }
        i25 = i14 & 2048;
        if (i25 != 0) {
        }
        int i3122222 = i24;
        if ((i14 & 4096) == 0) {
        }
        if ((i15 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i12 & 1) != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i21 != 0) {
        }
        if (i22 != 0) {
        }
        if (i23 != 0) {
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
        }
        if (i25 != 0) {
        }
        u11.j0();
        e eVar9222222 = eVar4;
        float f13222222 = f11;
        m3079AddonBuilder942rkJo(androidx.compose.foundation.layout.T.h(eVar4, 0.0f, 2, 1), null, f13222222, a1.c.c(611755277, new OziCellCenterScope$Default500Badge$5(this, c3422b, j14, c3422b2, i26, j15, eVar5, badgeLabel, abstractC8972b3, oziBadgeStyle2, z12), u11), u11, ((i27 << 3) & 896) | 3072 | (57344 & (i27 << 6)), 2);
        f12 = f13222222;
        eVar6 = eVar5;
        oziBadgeStyle3 = oziBadgeStyle2;
        z13 = z12;
        c3969l = u11;
        j16 = j15;
        abstractC8972b4 = abstractC8972b3;
        j17 = j14;
        eVar7 = eVar9222222;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    @Override // ru.ozon.uni.ozi.components.cell.addons.OziCellScope
    @NotNull
    /* renamed from: getAddonMarker$uni_release, reason: from getter */
    public OziCellScope.AddonMarker getAddonMarker() {
        return this.addonMarker;
    }
}
