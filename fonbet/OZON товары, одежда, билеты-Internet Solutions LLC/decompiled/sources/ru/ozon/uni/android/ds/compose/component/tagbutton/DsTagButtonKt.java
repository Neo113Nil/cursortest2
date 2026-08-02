package ru.ozon.uni.android.ds.compose.component.tagbutton;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import P0.E;
import P0.p2;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.pikazon.compose.painter.f;
import ru.ozon.uni.android.ds.compose.component.image.DsImageKt;
import ru.ozon.uni.android.ds.compose.component.image.ImageVO;
import ru.ozon.uni.android.ds.compose.component.loader.DsLoaderKt;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.foundation.utils.ModifierUtilsKt;
import t0.p;
import t0.q;
import u0.C9891D;
import u0.EnumC9909s;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u001aã\u0001\u0010\"\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00002\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001dH\u0007¢\u0006\u0004\b \u0010!\u001a[\u0010&\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b$\u0010%\u001aé\u0001\u0010+\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00002\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010#\u001a\u00020\u000f2\b\b\u0002\u0010(\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001dH\u0003¢\u0006\u0004\b)\u0010*\u001a;\u00104\u001a\u00020,*\u00020,2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020-2\b\b\u0002\u00101\u001a\u00020-H\u0007¢\u0006\u0004\b2\u00103\u001a\u001d\u00105\u001a\u00020,*\u00020,2\b\b\u0002\u00105\u001a\u00020\u000fH\u0007¢\u0006\u0004\b5\u00106\u001a\u001d\u0010\u0019\u001a\u00020\u0018*\u00020\u00162\b\b\u0002\u00107\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0019\u00108\u001a\u001b\u0010:\u001a\u00020\u0018*\u00020\u00162\u0006\u00109\u001a\u00020\u000fH\u0002¢\u0006\u0004\b:\u0010;\u001a\u0013\u0010<\u001a\u00020,*\u00020,H\u0003¢\u0006\u0004\b<\u0010=\u001a#\u0010>\u001a\u00020,*\u00020\u00142\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000fH\u0003¢\u0006\u0004\b>\u0010?\"\u0018\u0010B\u001a\u00020\u0018*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A\"\u0018\u0010D\u001a\u00020\u0018*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010A¨\u0006E"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "", "text", "textModifier", "Lq1/b;", "icon", "iconModifier", "Lru/ozon/uni/android/ds/compose/component/image/ImageVO;", "image", "imageModifier", "Lkotlin/Function1;", "Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonScope;", "", "indicator", "", "closable", "closeIconModifier", "Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonState;", "state", "Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonStyle;", "style", "Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonSize;", "size", "LZ1/h;", "cornerRadius", "Lkotlin/Function0;", "onClick", "onCloseClick", "Lt0/q;", "interactionSource", "closeInteractionSource", "DsTagButton-DRvdSBo", "(Landroidx/compose/ui/e;Ljava/lang/String;Landroidx/compose/ui/e;Lq1/b;Landroidx/compose/ui/e;Lru/ozon/uni/android/ds/compose/component/image/ImageVO;Landroidx/compose/ui/e;Lfd/n;ZLandroidx/compose/ui/e;Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonState;Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonStyle;Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonSize;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lt0/q;Lt0/q;LS0/k;III)V", "DsTagButton", "selected", "DsLoaderTagButton--b7W0Lw", "(Landroidx/compose/ui/e;Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonSize;Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonStyle;FZLkotlin/jvm/functions/Function0;Lt0/q;LS0/k;II)V", "DsLoaderTagButton", "imageVO", "enabled", "DsFullTagButton-cZC2P0Y", "(Landroidx/compose/ui/e;Ljava/lang/String;Landroidx/compose/ui/e;Lq1/b;Landroidx/compose/ui/e;Lru/ozon/uni/android/ds/compose/component/image/ImageVO;Landroidx/compose/ui/e;Lfd/n;ZLandroidx/compose/ui/e;Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonSize;Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonStyle;ZZFLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lt0/q;Lt0/q;LS0/k;III)V", "DsFullTagButton", "Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;", "Ll1/Z;", "backgroundColor", "textColor", "iconTint", "closeIconTint", "custom--hDc7uY", "(Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;JJJJ)Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;", "custom", "multicolor", "(Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;Z)Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;", "roundCorners", "(Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonSize;ZLS0/k;II)F", "loader", "verticalPadding", "(Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonSize;Z)F", "disabled", "(Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;)Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;", "colors", "(Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonStyle;ZZ)Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;", "getHeight", "(Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonSize;)F", "height", "getHorizontalPadding", "horizontalPadding", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsTagButtonKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DsTagButtonState.values().length];
            try {
                iArr[DsTagButtonState.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DsTagButtonState.Selected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DsTagButtonState.Disabled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DsTagButtonState.Loading.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DsTagButtonState.LoadingSelected.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DsTagButtonSize.values().length];
            try {
                iArr2[DsTagButtonSize.Size500.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DsTagButtonSize.Size600.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x052d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b1  */
    /* renamed from: DsFullTagButton-cZC2P0Y, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1808DsFullTagButtoncZC2P0Y(e eVar, String str, e eVar2, AbstractC8972b abstractC8972b, e eVar3, ImageVO imageVO, e eVar4, InterfaceC6511n<? super DsTagButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, boolean z11, e eVar5, DsTagButtonSize dsTagButtonSize, DsTagButtonStyle dsTagButtonStyle, boolean z12, boolean z13, float f7, Function0<Unit> function0, Function0<Unit> function02, q qVar, q qVar2, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        e eVar6;
        int i15;
        String str2;
        int i16;
        int i17;
        int i18;
        int i19;
        e eVar7;
        int i21;
        AbstractC8972b abstractC8972b2;
        int i22;
        boolean z14;
        int i23;
        ImageVO imageVO2;
        int i24;
        e eVar8;
        int i25;
        InterfaceC6511n<? super DsTagButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2;
        int i26;
        boolean z15;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        DsTagButtonSize dsTagButtonSize2;
        C3969l c3969l;
        DsTagButtonStyle dsTagButtonStyle2;
        boolean z16;
        InterfaceC6511n<? super DsTagButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n3;
        float f11;
        q qVar3;
        int i37;
        boolean z17;
        e eVar9;
        q qVar4;
        q qVar5;
        float f12;
        e eVar10;
        float f13;
        AbstractC8972b abstractC8972b3;
        e b11;
        int I11;
        boolean z18;
        e.a aVar;
        float f14;
        int I12;
        DsTagButtonSize dsTagButtonSize3;
        AbstractC8972b abstractC8972b4;
        float f15;
        String str3;
        e eVar11;
        boolean z19;
        q qVar6;
        e eVar12;
        q qVar7;
        AbstractC8972b abstractC8972b5;
        ImageVO imageVO3;
        DsTagButtonSize dsTagButtonSize4;
        C3969l c3969l2;
        e eVar13;
        e eVar14;
        boolean z21;
        DsTagButtonStyle dsTagButtonStyle3;
        float f16;
        boolean z22;
        e eVar15;
        e eVar16;
        String str4;
        q qVar8;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(1579120298);
        int i38 = i13 & 1;
        if (i38 != 0) {
            eVar6 = eVar;
            i15 = i11 | 6;
            i14 = 16;
        } else if ((i11 & 6) == 0) {
            i14 = 16;
            eVar6 = eVar;
            i15 = i11 | (u11.n(eVar6) ? 4 : 2);
        } else {
            i14 = 16;
            eVar6 = eVar;
            i15 = i11;
        }
        int i39 = i13 & 2;
        if (i39 != 0) {
            str2 = str;
            i17 = i15 | 48;
            i18 = 4;
            i16 = 32;
        } else {
            str2 = str;
            if ((i11 & 48) == 0) {
                i16 = 32;
                i15 |= u11.n(str2) ? 32 : i14;
            } else {
                i16 = 32;
            }
            i17 = i15;
            i18 = 4;
        }
        int i41 = i13 & 4;
        if (i41 != 0) {
            i17 |= 384;
            i19 = 48;
        } else {
            i19 = 48;
            if ((i11 & 384) == 0) {
                eVar7 = eVar2;
                i17 |= u11.n(eVar7) ? 256 : 128;
                i21 = i13 & 8;
                if (i21 == 0) {
                    i17 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    abstractC8972b2 = abstractC8972b;
                    i17 |= u11.n(abstractC8972b2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    i22 = i13 & 16;
                    if (i22 != 0) {
                        i17 |= 24576;
                        z14 = true;
                    } else {
                        z14 = true;
                        if ((i11 & 24576) == 0) {
                            i17 |= u11.n(eVar3) ? 16384 : 8192;
                            i23 = i13 & 32;
                            if (i23 == 0) {
                                i17 |= 196608;
                                imageVO2 = imageVO;
                            } else {
                                imageVO2 = imageVO;
                                if ((i11 & 196608) == 0) {
                                    i17 |= u11.n(imageVO2) ? 131072 : 65536;
                                }
                            }
                            i24 = i13 & 64;
                            if (i24 == 0) {
                                i17 |= 1572864;
                                eVar8 = eVar4;
                            } else {
                                eVar8 = eVar4;
                                if ((i11 & 1572864) == 0) {
                                    i17 |= u11.n(eVar8) ? 1048576 : 524288;
                                }
                            }
                            i25 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                            if (i25 == 0) {
                                i17 |= 12582912;
                                interfaceC6511n2 = interfaceC6511n;
                            } else {
                                interfaceC6511n2 = interfaceC6511n;
                                if ((i11 & 12582912) == 0) {
                                    i17 |= u11.F(interfaceC6511n2) ? 8388608 : 4194304;
                                }
                            }
                            i26 = i13 & 256;
                            if (i26 == 0) {
                                i17 |= 100663296;
                                z15 = z11;
                            } else {
                                z15 = z11;
                                if ((i11 & 100663296) == 0) {
                                    i17 |= u11.p(z15) ? 67108864 : 33554432;
                                }
                            }
                            i27 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                            if (i27 == 0) {
                                i17 |= 805306368;
                            } else if ((i11 & 805306368) == 0) {
                                i28 = i27;
                                i17 |= u11.n(eVar5) ? 536870912 : 268435456;
                                if ((i12 & 6) == 0) {
                                    i29 = (((i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0 && u11.n(dsTagButtonSize)) ? i18 : 2) | i12;
                                } else {
                                    i29 = i12;
                                }
                                if ((i12 & 48) == 0) {
                                    int i42 = i29;
                                    if ((i13 & 2048) == 0 && u11.n(dsTagButtonStyle)) {
                                        i14 = i16;
                                    }
                                    i29 = i42 | i14;
                                }
                                i31 = i13 & 4096;
                                if (i31 != 0) {
                                    i29 |= 384;
                                    i32 = i31;
                                } else {
                                    i32 = i31;
                                    if ((i12 & 384) == 0) {
                                        i29 |= u11.p(z12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                                    }
                                }
                                i33 = i17;
                                i34 = i13 & 8192;
                                if (i34 != 0) {
                                    i29 |= 3072;
                                } else if ((i12 & 3072) == 0) {
                                    i29 |= u11.p(z13) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                                }
                                if ((i12 & 24576) == 0) {
                                    i29 |= ((i13 & 16384) == 0 && u11.q(f7)) ? 16384 : 8192;
                                }
                                if ((32768 & i13) != 0) {
                                    i29 |= 196608;
                                } else if ((i12 & 196608) == 0) {
                                    i29 |= u11.F(function0) ? 131072 : 65536;
                                    if ((i13 & 65536) == 0) {
                                        i29 |= 1572864;
                                    } else if ((i12 & 1572864) == 0) {
                                        i29 |= u11.F(function02) ? 1048576 : 524288;
                                    }
                                    i35 = i13 & 131072;
                                    if (i35 == 0) {
                                        i29 |= 12582912;
                                    } else if ((i12 & 12582912) == 0) {
                                        i29 |= u11.n(qVar) ? 8388608 : 4194304;
                                    }
                                    i36 = i13 & 262144;
                                    if (i36 == 0) {
                                        i29 |= 100663296;
                                    } else if ((i12 & 100663296) == 0) {
                                        i29 |= u11.n(qVar2) ? 67108864 : 33554432;
                                    }
                                    if ((i33 & 306783379) != 306783378 && (38347923 & i29) == 38347922 && u11.b()) {
                                        u11.j();
                                        eVar14 = eVar3;
                                        z21 = z12;
                                        z22 = z13;
                                        qVar8 = qVar;
                                        qVar7 = qVar2;
                                        c3969l2 = u11;
                                        abstractC8972b5 = abstractC8972b2;
                                        eVar15 = eVar6;
                                        str4 = str2;
                                        imageVO3 = imageVO2;
                                        eVar13 = eVar7;
                                        eVar16 = eVar5;
                                        dsTagButtonSize4 = dsTagButtonSize;
                                        dsTagButtonStyle3 = dsTagButtonStyle;
                                        f16 = f7;
                                    } else {
                                        u11.Q0();
                                        if ((i11 & 1) != 0 || u11.w0()) {
                                            if (i38 != 0) {
                                                eVar6 = e.f40358c0;
                                            }
                                            if (i39 != 0) {
                                                str2 = null;
                                            }
                                            if (i41 != 0) {
                                                eVar7 = e.f40358c0;
                                            }
                                            if (i21 != 0) {
                                                abstractC8972b2 = null;
                                            }
                                            e eVar17 = i22 == 0 ? e.f40358c0 : eVar3;
                                            if (i23 != 0) {
                                                imageVO2 = null;
                                            }
                                            if (i24 != 0) {
                                                eVar8 = e.f40358c0;
                                            }
                                            InterfaceC6511n<? super DsTagButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n4 = i25 == 0 ? interfaceC6511n2 : null;
                                            if (i26 != 0) {
                                                z15 = false;
                                            }
                                            e eVar18 = i28 == 0 ? e.f40358c0 : eVar5;
                                            if ((1024 & i13) == 0) {
                                                dsTagButtonSize2 = DsTagButtonDefaults.INSTANCE.getSize$uni_release();
                                                i29 &= -15;
                                            } else {
                                                dsTagButtonSize2 = dsTagButtonSize;
                                            }
                                            if ((2048 & i13) == 0) {
                                                dsTagButtonStyle2 = DsTagButtonDefaults.INSTANCE.style(null, null, false, u11, UniIconToken.$stable << 9, 7);
                                                c3969l = u11;
                                                i29 &= -113;
                                            } else {
                                                c3969l = u11;
                                                dsTagButtonStyle2 = dsTagButtonStyle;
                                            }
                                            boolean z23 = i32 == 0 ? false : z12;
                                            z16 = i34 == 0 ? z14 : z13;
                                            if ((16384 & i13) == 0) {
                                                interfaceC6511n3 = interfaceC6511n4;
                                                f11 = cornerRadius(dsTagButtonSize2, false, c3969l, i29 & 14, z14 ? 1 : 0);
                                                i29 = (-57345) & i29;
                                            } else {
                                                interfaceC6511n3 = interfaceC6511n4;
                                                f11 = f7;
                                            }
                                            if (i35 == 0) {
                                                c3969l.o(-947841859);
                                                Object C11 = c3969l.C();
                                                if (C11 == InterfaceC3967k.a.a()) {
                                                    C11 = p.a();
                                                    c3969l.x(C11);
                                                }
                                                qVar3 = (q) C11;
                                                c3969l.k();
                                            } else {
                                                qVar3 = qVar;
                                            }
                                            if (i36 == 0) {
                                                c3969l.o(-947838787);
                                                Object C12 = c3969l.C();
                                                q qVar9 = qVar3;
                                                if (C12 == InterfaceC3967k.a.a()) {
                                                    C12 = p.a();
                                                    c3969l.x(C12);
                                                }
                                                q qVar10 = (q) C12;
                                                c3969l.k();
                                                e eVar19 = eVar17;
                                                qVar5 = qVar10;
                                                eVar9 = eVar19;
                                                i37 = i29;
                                                z17 = z23;
                                                qVar4 = qVar9;
                                            } else {
                                                q qVar11 = qVar3;
                                                i37 = i29;
                                                z17 = z23;
                                                eVar9 = eVar17;
                                                qVar4 = qVar11;
                                                qVar5 = qVar2;
                                            }
                                            f12 = f11;
                                            eVar10 = eVar18;
                                            interfaceC6511n2 = interfaceC6511n3;
                                        } else {
                                            u11.j();
                                            if ((1024 & i13) != 0) {
                                                i29 &= -15;
                                            }
                                            if ((2048 & i13) != 0) {
                                                i29 &= -113;
                                            }
                                            if ((16384 & i13) != 0) {
                                                i29 &= -57345;
                                            }
                                            eVar9 = eVar3;
                                            eVar10 = eVar5;
                                            dsTagButtonSize2 = dsTagButtonSize;
                                            z17 = z12;
                                            z16 = z13;
                                            qVar4 = qVar;
                                            qVar5 = qVar2;
                                            c3969l = u11;
                                            i37 = i29;
                                            dsTagButtonStyle2 = dsTagButtonStyle;
                                            f12 = f7;
                                        }
                                        c3969l.j0();
                                        DsTagButtonColors colors = colors(dsTagButtonStyle2, z16, z17);
                                        e eVar20 = eVar10;
                                        float horizontalPadding = getHorizontalPadding(dsTagButtonSize2);
                                        boolean z24 = z17;
                                        DsTagButtonStyle dsTagButtonStyle4 = dsTagButtonStyle2;
                                        float verticalPadding = verticalPadding(dsTagButtonSize2, false);
                                        f13 = f12;
                                        boolean z25 = z16;
                                        abstractC8972b3 = abstractC8972b2;
                                        b11 = androidx.compose.foundation.e.b(C6988h.a(a0.h(M.a(eVar6, EnumC9909s.Min), getHeight(dsTagButtonSize2), 0.0f, 2), h.b(f13)), colors.getBackgroundColor(), y0.a());
                                        e maxIntrinsicWidthIfInLazyRow = ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(b11);
                                        Y b12 = X.b(C5179b.b(), InterfaceC6250b.a.i(), c3969l, 54);
                                        I11 = c3969l.I();
                                        A0 d11 = c3969l.d();
                                        e f17 = c.f(c3969l, maxIntrinsicWidthIfInLazyRow);
                                        z18 = z15;
                                        Function0 a11 = g.a(InterfaceC2801g.f5440U, c3969l);
                                        if (c3969l.t()) {
                                            c3969l.e();
                                        } else {
                                            c3969l.H(a11);
                                        }
                                        Function2 h11 = Cm.e.h(c3969l, b12, c3969l, d11);
                                        if (!c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I11))) {
                                            a.d(I11, c3969l, I11, h11);
                                        }
                                        F1.b(c3969l, f17, InterfaceC2801g.a.f());
                                        C9891D c9891d = C9891D.f99599a;
                                        e.a aVar2 = e.f40358c0;
                                        e b13 = i.b(c9891d.a(aVar2, 1.0f, false), qVar4, null, z25, null, null, function0, 24);
                                        if (z18) {
                                            aVar = aVar2;
                                            f14 = horizontalPadding;
                                        } else {
                                            aVar = aVar2;
                                            f14 = 0;
                                        }
                                        e i43 = T.i(b13, horizontalPadding, verticalPadding, f14, verticalPadding);
                                        Y b14 = X.b(C5179b.f(), InterfaceC6250b.a.i(), c3969l, i19);
                                        I12 = c3969l.I();
                                        A0 d12 = c3969l.d();
                                        e f18 = c.f(c3969l, i43);
                                        Function0 a12 = InterfaceC2801g.a.a();
                                        c3969l.i();
                                        if (c3969l.t()) {
                                            c3969l.e();
                                        } else {
                                            c3969l.H(a12);
                                        }
                                        Function2 h12 = Cm.e.h(c3969l, b14, c3969l, d12);
                                        if (!c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I12))) {
                                            a.d(I12, c3969l, I12, h12);
                                        }
                                        U7.i.b(c3969l, f18, 528299677);
                                        dsTagButtonSize3 = DsTagButtonSize.Size600;
                                        if (dsTagButtonSize2 == dsTagButtonSize3 || abstractC8972b3 == null) {
                                            abstractC8972b4 = abstractC8972b3;
                                        } else {
                                            E.a(abstractC8972b3, null, a0.n(eVar9, 20), colors.getIconTint(), c3969l, ((i33 >> 9) & 14) | 48);
                                            abstractC8972b4 = abstractC8972b3;
                                        }
                                        c3969l.k();
                                        c3969l.o(528310153);
                                        if (dsTagButtonSize2 == dsTagButtonSize3 || imageVO2 == null) {
                                            f15 = f13;
                                        } else {
                                            DsImageKt.m1720DsImageA8mMYrQ(f.a(imageVO2.getImage(), null, null, null, c3969l, 0, 14), T.f(a0.n(eVar8, 20), 2), imageVO2.getHasParanja(), imageVO2.getAspectRatio(), imageVO2.getBackgroundColor(), imageVO2.getContentScale(), f13, imageVO2.getStartPadding(), imageVO2.getTopPadding(), imageVO2.getEndPadding(), imageVO2.getBottomPadding(), c3969l, (i37 << 6) & 3670016, 0, 0);
                                            f15 = f13;
                                            Unit unit = Unit.f71690a;
                                        }
                                        c3969l.k();
                                        c3969l.o(528337466);
                                        if (str2 != null || kotlin.text.h.K(str2)) {
                                            str3 = str2;
                                        } else {
                                            str3 = str2;
                                            p2.b(str3, T.h(c9891d.a(eVar7, 1.0f, false), i18, 0.0f, 2), colors.getTextColor(), 0L, 0L, null, 0L, 2, false, 1, 0, UniTheme.INSTANCE.getTypography().getBodyControl400Small(), c3969l, (i33 >> 3) & 14, 3120, 55288);
                                        }
                                        c3969l.k();
                                        c3969l.o(528352048);
                                        if (interfaceC6511n2 != null) {
                                            interfaceC6511n2.invoke(DsTagButtonScope.INSTANCE.getInstance$uni_release(), c3969l, Integer.valueOf(((i33 >> 18) & 112) | 6));
                                        }
                                        c3969l.k();
                                        c3969l.f();
                                        c3969l.o(1178507642);
                                        if (z18) {
                                            eVar11 = eVar20;
                                            z19 = z25;
                                            qVar6 = qVar5;
                                            eVar12 = eVar9;
                                        } else {
                                            q qVar12 = qVar5;
                                            qVar6 = qVar12;
                                            z19 = z25;
                                            e h13 = T.h(i.b(a0.c(aVar), qVar12, null, z25, null, null, function02, 24), 0.0f, verticalPadding, 1);
                                            V f19 = C5185h.f(InterfaceC6250b.a.h(), false);
                                            int I13 = c3969l.I();
                                            A0 d13 = c3969l.d();
                                            e f21 = c.f(c3969l, h13);
                                            eVar12 = eVar9;
                                            Function0 a13 = InterfaceC2801g.a.a();
                                            c3969l.i();
                                            if (c3969l.t()) {
                                                c3969l.H(a13);
                                            } else {
                                                c3969l.e();
                                            }
                                            Function2 f22 = T7.E.f(c3969l, f19, c3969l, d13);
                                            if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I13))) {
                                                a.d(I13, c3969l, I13, f22);
                                            }
                                            F1.b(c3969l, f21, InterfaceC2801g.a.f());
                                            eVar11 = eVar20;
                                            E.a(TokensExtKt.getIcon(DsTagButtonDefaults.INSTANCE.getCloseIconToken$uni_release(), c3969l, UniIconToken.$stable), null, T.j(eVar20, 0.0f, 0.0f, horizontalPadding, 0.0f, 11), colors.getCloseIconTint(), c3969l, 48);
                                            c3969l.f();
                                        }
                                        c3969l.k();
                                        c3969l.f();
                                        qVar7 = qVar6;
                                        abstractC8972b5 = abstractC8972b4;
                                        imageVO3 = imageVO2;
                                        dsTagButtonSize4 = dsTagButtonSize2;
                                        c3969l2 = c3969l;
                                        eVar13 = eVar7;
                                        eVar14 = eVar12;
                                        z21 = z24;
                                        dsTagButtonStyle3 = dsTagButtonStyle4;
                                        f16 = f15;
                                        z22 = z19;
                                        eVar15 = eVar6;
                                        z15 = z18;
                                        eVar16 = eVar11;
                                        str4 = str3;
                                        qVar8 = qVar4;
                                    }
                                    m02 = c3969l2.m0();
                                    if (m02 == null) {
                                        m02.G(new DsTagButtonKt$DsFullTagButton$4(eVar15, str4, eVar13, abstractC8972b5, eVar14, imageVO3, eVar8, interfaceC6511n2, z15, eVar16, dsTagButtonSize4, dsTagButtonStyle3, z21, z22, f16, function0, function02, qVar8, qVar7, i11, i12, i13));
                                        return;
                                    }
                                    return;
                                }
                                if ((i13 & 65536) == 0) {
                                }
                                i35 = i13 & 131072;
                                if (i35 == 0) {
                                }
                                i36 = i13 & 262144;
                                if (i36 == 0) {
                                }
                                if ((i33 & 306783379) != 306783378) {
                                }
                                u11.Q0();
                                if ((i11 & 1) != 0) {
                                }
                                if (i38 != 0) {
                                }
                                if (i39 != 0) {
                                }
                                if (i41 != 0) {
                                }
                                if (i21 != 0) {
                                }
                                if (i22 == 0) {
                                }
                                if (i23 != 0) {
                                }
                                if (i24 != 0) {
                                }
                                if (i25 == 0) {
                                }
                                if (i26 != 0) {
                                }
                                if (i28 == 0) {
                                }
                                if ((1024 & i13) == 0) {
                                }
                                if ((2048 & i13) == 0) {
                                }
                                if (i32 == 0) {
                                }
                                if (i34 == 0) {
                                }
                                if ((16384 & i13) == 0) {
                                }
                                if (i35 == 0) {
                                }
                                if (i36 == 0) {
                                }
                                f12 = f11;
                                eVar10 = eVar18;
                                interfaceC6511n2 = interfaceC6511n3;
                                c3969l.j0();
                                DsTagButtonColors colors2 = colors(dsTagButtonStyle2, z16, z17);
                                e eVar202 = eVar10;
                                float horizontalPadding2 = getHorizontalPadding(dsTagButtonSize2);
                                boolean z242 = z17;
                                DsTagButtonStyle dsTagButtonStyle42 = dsTagButtonStyle2;
                                float verticalPadding2 = verticalPadding(dsTagButtonSize2, false);
                                f13 = f12;
                                boolean z252 = z16;
                                abstractC8972b3 = abstractC8972b2;
                                b11 = androidx.compose.foundation.e.b(C6988h.a(a0.h(M.a(eVar6, EnumC9909s.Min), getHeight(dsTagButtonSize2), 0.0f, 2), h.b(f13)), colors2.getBackgroundColor(), y0.a());
                                e maxIntrinsicWidthIfInLazyRow2 = ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(b11);
                                Y b122 = X.b(C5179b.b(), InterfaceC6250b.a.i(), c3969l, 54);
                                I11 = c3969l.I();
                                A0 d112 = c3969l.d();
                                e f172 = c.f(c3969l, maxIntrinsicWidthIfInLazyRow2);
                                z18 = z15;
                                Function0 a112 = g.a(InterfaceC2801g.f5440U, c3969l);
                                if (c3969l.t()) {
                                }
                                Function2 h112 = Cm.e.h(c3969l, b122, c3969l, d112);
                                if (!c3969l.t()) {
                                }
                                a.d(I11, c3969l, I11, h112);
                                F1.b(c3969l, f172, InterfaceC2801g.a.f());
                                C9891D c9891d2 = C9891D.f99599a;
                                e.a aVar22 = e.f40358c0;
                                e b132 = i.b(c9891d2.a(aVar22, 1.0f, false), qVar4, null, z252, null, null, function0, 24);
                                if (z18) {
                                }
                                e i432 = T.i(b132, horizontalPadding2, verticalPadding2, f14, verticalPadding2);
                                Y b142 = X.b(C5179b.f(), InterfaceC6250b.a.i(), c3969l, i19);
                                I12 = c3969l.I();
                                A0 d122 = c3969l.d();
                                e f182 = c.f(c3969l, i432);
                                Function0 a122 = InterfaceC2801g.a.a();
                                c3969l.i();
                                if (c3969l.t()) {
                                }
                                Function2 h122 = Cm.e.h(c3969l, b142, c3969l, d122);
                                if (!c3969l.t()) {
                                }
                                a.d(I12, c3969l, I12, h122);
                                U7.i.b(c3969l, f182, 528299677);
                                dsTagButtonSize3 = DsTagButtonSize.Size600;
                                if (dsTagButtonSize2 == dsTagButtonSize3) {
                                }
                                abstractC8972b4 = abstractC8972b3;
                                c3969l.k();
                                c3969l.o(528310153);
                                if (dsTagButtonSize2 == dsTagButtonSize3) {
                                }
                                f15 = f13;
                                c3969l.k();
                                c3969l.o(528337466);
                                if (str2 != null) {
                                }
                                str3 = str2;
                                c3969l.k();
                                c3969l.o(528352048);
                                if (interfaceC6511n2 != null) {
                                }
                                c3969l.k();
                                c3969l.f();
                                c3969l.o(1178507642);
                                if (z18) {
                                }
                                c3969l.k();
                                c3969l.f();
                                qVar7 = qVar6;
                                abstractC8972b5 = abstractC8972b4;
                                imageVO3 = imageVO2;
                                dsTagButtonSize4 = dsTagButtonSize2;
                                c3969l2 = c3969l;
                                eVar13 = eVar7;
                                eVar14 = eVar12;
                                z21 = z242;
                                dsTagButtonStyle3 = dsTagButtonStyle42;
                                f16 = f15;
                                z22 = z19;
                                eVar15 = eVar6;
                                z15 = z18;
                                eVar16 = eVar11;
                                str4 = str3;
                                qVar8 = qVar4;
                                m02 = c3969l2.m0();
                                if (m02 == null) {
                                }
                            }
                            i28 = i27;
                            if ((i12 & 6) == 0) {
                            }
                            if ((i12 & 48) == 0) {
                            }
                            i31 = i13 & 4096;
                            if (i31 != 0) {
                            }
                            i33 = i17;
                            i34 = i13 & 8192;
                            if (i34 != 0) {
                            }
                            if ((i12 & 24576) == 0) {
                            }
                            if ((32768 & i13) != 0) {
                            }
                            if ((i13 & 65536) == 0) {
                            }
                            i35 = i13 & 131072;
                            if (i35 == 0) {
                            }
                            i36 = i13 & 262144;
                            if (i36 == 0) {
                            }
                            if ((i33 & 306783379) != 306783378) {
                            }
                            u11.Q0();
                            if ((i11 & 1) != 0) {
                            }
                            if (i38 != 0) {
                            }
                            if (i39 != 0) {
                            }
                            if (i41 != 0) {
                            }
                            if (i21 != 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (i23 != 0) {
                            }
                            if (i24 != 0) {
                            }
                            if (i25 == 0) {
                            }
                            if (i26 != 0) {
                            }
                            if (i28 == 0) {
                            }
                            if ((1024 & i13) == 0) {
                            }
                            if ((2048 & i13) == 0) {
                            }
                            if (i32 == 0) {
                            }
                            if (i34 == 0) {
                            }
                            if ((16384 & i13) == 0) {
                            }
                            if (i35 == 0) {
                            }
                            if (i36 == 0) {
                            }
                            f12 = f11;
                            eVar10 = eVar18;
                            interfaceC6511n2 = interfaceC6511n3;
                            c3969l.j0();
                            DsTagButtonColors colors22 = colors(dsTagButtonStyle2, z16, z17);
                            e eVar2022 = eVar10;
                            float horizontalPadding22 = getHorizontalPadding(dsTagButtonSize2);
                            boolean z2422 = z17;
                            DsTagButtonStyle dsTagButtonStyle422 = dsTagButtonStyle2;
                            float verticalPadding22 = verticalPadding(dsTagButtonSize2, false);
                            f13 = f12;
                            boolean z2522 = z16;
                            abstractC8972b3 = abstractC8972b2;
                            b11 = androidx.compose.foundation.e.b(C6988h.a(a0.h(M.a(eVar6, EnumC9909s.Min), getHeight(dsTagButtonSize2), 0.0f, 2), h.b(f13)), colors22.getBackgroundColor(), y0.a());
                            e maxIntrinsicWidthIfInLazyRow22 = ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(b11);
                            Y b1222 = X.b(C5179b.b(), InterfaceC6250b.a.i(), c3969l, 54);
                            I11 = c3969l.I();
                            A0 d1122 = c3969l.d();
                            e f1722 = c.f(c3969l, maxIntrinsicWidthIfInLazyRow22);
                            z18 = z15;
                            Function0 a1122 = g.a(InterfaceC2801g.f5440U, c3969l);
                            if (c3969l.t()) {
                            }
                            Function2 h1122 = Cm.e.h(c3969l, b1222, c3969l, d1122);
                            if (!c3969l.t()) {
                            }
                            a.d(I11, c3969l, I11, h1122);
                            F1.b(c3969l, f1722, InterfaceC2801g.a.f());
                            C9891D c9891d22 = C9891D.f99599a;
                            e.a aVar222 = e.f40358c0;
                            e b1322 = i.b(c9891d22.a(aVar222, 1.0f, false), qVar4, null, z2522, null, null, function0, 24);
                            if (z18) {
                            }
                            e i4322 = T.i(b1322, horizontalPadding22, verticalPadding22, f14, verticalPadding22);
                            Y b1422 = X.b(C5179b.f(), InterfaceC6250b.a.i(), c3969l, i19);
                            I12 = c3969l.I();
                            A0 d1222 = c3969l.d();
                            e f1822 = c.f(c3969l, i4322);
                            Function0 a1222 = InterfaceC2801g.a.a();
                            c3969l.i();
                            if (c3969l.t()) {
                            }
                            Function2 h1222 = Cm.e.h(c3969l, b1422, c3969l, d1222);
                            if (!c3969l.t()) {
                            }
                            a.d(I12, c3969l, I12, h1222);
                            U7.i.b(c3969l, f1822, 528299677);
                            dsTagButtonSize3 = DsTagButtonSize.Size600;
                            if (dsTagButtonSize2 == dsTagButtonSize3) {
                            }
                            abstractC8972b4 = abstractC8972b3;
                            c3969l.k();
                            c3969l.o(528310153);
                            if (dsTagButtonSize2 == dsTagButtonSize3) {
                            }
                            f15 = f13;
                            c3969l.k();
                            c3969l.o(528337466);
                            if (str2 != null) {
                            }
                            str3 = str2;
                            c3969l.k();
                            c3969l.o(528352048);
                            if (interfaceC6511n2 != null) {
                            }
                            c3969l.k();
                            c3969l.f();
                            c3969l.o(1178507642);
                            if (z18) {
                            }
                            c3969l.k();
                            c3969l.f();
                            qVar7 = qVar6;
                            abstractC8972b5 = abstractC8972b4;
                            imageVO3 = imageVO2;
                            dsTagButtonSize4 = dsTagButtonSize2;
                            c3969l2 = c3969l;
                            eVar13 = eVar7;
                            eVar14 = eVar12;
                            z21 = z2422;
                            dsTagButtonStyle3 = dsTagButtonStyle422;
                            f16 = f15;
                            z22 = z19;
                            eVar15 = eVar6;
                            z15 = z18;
                            eVar16 = eVar11;
                            str4 = str3;
                            qVar8 = qVar4;
                            m02 = c3969l2.m0();
                            if (m02 == null) {
                            }
                        }
                    }
                    i23 = i13 & 32;
                    if (i23 == 0) {
                    }
                    i24 = i13 & 64;
                    if (i24 == 0) {
                    }
                    i25 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i25 == 0) {
                    }
                    i26 = i13 & 256;
                    if (i26 == 0) {
                    }
                    i27 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                    if (i27 == 0) {
                    }
                    i28 = i27;
                    if ((i12 & 6) == 0) {
                    }
                    if ((i12 & 48) == 0) {
                    }
                    i31 = i13 & 4096;
                    if (i31 != 0) {
                    }
                    i33 = i17;
                    i34 = i13 & 8192;
                    if (i34 != 0) {
                    }
                    if ((i12 & 24576) == 0) {
                    }
                    if ((32768 & i13) != 0) {
                    }
                    if ((i13 & 65536) == 0) {
                    }
                    i35 = i13 & 131072;
                    if (i35 == 0) {
                    }
                    i36 = i13 & 262144;
                    if (i36 == 0) {
                    }
                    if ((i33 & 306783379) != 306783378) {
                    }
                    u11.Q0();
                    if ((i11 & 1) != 0) {
                    }
                    if (i38 != 0) {
                    }
                    if (i39 != 0) {
                    }
                    if (i41 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i23 != 0) {
                    }
                    if (i24 != 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (i26 != 0) {
                    }
                    if (i28 == 0) {
                    }
                    if ((1024 & i13) == 0) {
                    }
                    if ((2048 & i13) == 0) {
                    }
                    if (i32 == 0) {
                    }
                    if (i34 == 0) {
                    }
                    if ((16384 & i13) == 0) {
                    }
                    if (i35 == 0) {
                    }
                    if (i36 == 0) {
                    }
                    f12 = f11;
                    eVar10 = eVar18;
                    interfaceC6511n2 = interfaceC6511n3;
                    c3969l.j0();
                    DsTagButtonColors colors222 = colors(dsTagButtonStyle2, z16, z17);
                    e eVar20222 = eVar10;
                    float horizontalPadding222 = getHorizontalPadding(dsTagButtonSize2);
                    boolean z24222 = z17;
                    DsTagButtonStyle dsTagButtonStyle4222 = dsTagButtonStyle2;
                    float verticalPadding222 = verticalPadding(dsTagButtonSize2, false);
                    f13 = f12;
                    boolean z25222 = z16;
                    abstractC8972b3 = abstractC8972b2;
                    b11 = androidx.compose.foundation.e.b(C6988h.a(a0.h(M.a(eVar6, EnumC9909s.Min), getHeight(dsTagButtonSize2), 0.0f, 2), h.b(f13)), colors222.getBackgroundColor(), y0.a());
                    e maxIntrinsicWidthIfInLazyRow222 = ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(b11);
                    Y b12222 = X.b(C5179b.b(), InterfaceC6250b.a.i(), c3969l, 54);
                    I11 = c3969l.I();
                    A0 d11222 = c3969l.d();
                    e f17222 = c.f(c3969l, maxIntrinsicWidthIfInLazyRow222);
                    z18 = z15;
                    Function0 a11222 = g.a(InterfaceC2801g.f5440U, c3969l);
                    if (c3969l.t()) {
                    }
                    Function2 h11222 = Cm.e.h(c3969l, b12222, c3969l, d11222);
                    if (!c3969l.t()) {
                    }
                    a.d(I11, c3969l, I11, h11222);
                    F1.b(c3969l, f17222, InterfaceC2801g.a.f());
                    C9891D c9891d222 = C9891D.f99599a;
                    e.a aVar2222 = e.f40358c0;
                    e b13222 = i.b(c9891d222.a(aVar2222, 1.0f, false), qVar4, null, z25222, null, null, function0, 24);
                    if (z18) {
                    }
                    e i43222 = T.i(b13222, horizontalPadding222, verticalPadding222, f14, verticalPadding222);
                    Y b14222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), c3969l, i19);
                    I12 = c3969l.I();
                    A0 d12222 = c3969l.d();
                    e f18222 = c.f(c3969l, i43222);
                    Function0 a12222 = InterfaceC2801g.a.a();
                    c3969l.i();
                    if (c3969l.t()) {
                    }
                    Function2 h12222 = Cm.e.h(c3969l, b14222, c3969l, d12222);
                    if (!c3969l.t()) {
                    }
                    a.d(I12, c3969l, I12, h12222);
                    U7.i.b(c3969l, f18222, 528299677);
                    dsTagButtonSize3 = DsTagButtonSize.Size600;
                    if (dsTagButtonSize2 == dsTagButtonSize3) {
                    }
                    abstractC8972b4 = abstractC8972b3;
                    c3969l.k();
                    c3969l.o(528310153);
                    if (dsTagButtonSize2 == dsTagButtonSize3) {
                    }
                    f15 = f13;
                    c3969l.k();
                    c3969l.o(528337466);
                    if (str2 != null) {
                    }
                    str3 = str2;
                    c3969l.k();
                    c3969l.o(528352048);
                    if (interfaceC6511n2 != null) {
                    }
                    c3969l.k();
                    c3969l.f();
                    c3969l.o(1178507642);
                    if (z18) {
                    }
                    c3969l.k();
                    c3969l.f();
                    qVar7 = qVar6;
                    abstractC8972b5 = abstractC8972b4;
                    imageVO3 = imageVO2;
                    dsTagButtonSize4 = dsTagButtonSize2;
                    c3969l2 = c3969l;
                    eVar13 = eVar7;
                    eVar14 = eVar12;
                    z21 = z24222;
                    dsTagButtonStyle3 = dsTagButtonStyle4222;
                    f16 = f15;
                    z22 = z19;
                    eVar15 = eVar6;
                    z15 = z18;
                    eVar16 = eVar11;
                    str4 = str3;
                    qVar8 = qVar4;
                    m02 = c3969l2.m0();
                    if (m02 == null) {
                    }
                }
                abstractC8972b2 = abstractC8972b;
                i22 = i13 & 16;
                if (i22 != 0) {
                }
                i23 = i13 & 32;
                if (i23 == 0) {
                }
                i24 = i13 & 64;
                if (i24 == 0) {
                }
                i25 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i25 == 0) {
                }
                i26 = i13 & 256;
                if (i26 == 0) {
                }
                i27 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i27 == 0) {
                }
                i28 = i27;
                if ((i12 & 6) == 0) {
                }
                if ((i12 & 48) == 0) {
                }
                i31 = i13 & 4096;
                if (i31 != 0) {
                }
                i33 = i17;
                i34 = i13 & 8192;
                if (i34 != 0) {
                }
                if ((i12 & 24576) == 0) {
                }
                if ((32768 & i13) != 0) {
                }
                if ((i13 & 65536) == 0) {
                }
                i35 = i13 & 131072;
                if (i35 == 0) {
                }
                i36 = i13 & 262144;
                if (i36 == 0) {
                }
                if ((i33 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i38 != 0) {
                }
                if (i39 != 0) {
                }
                if (i41 != 0) {
                }
                if (i21 != 0) {
                }
                if (i22 == 0) {
                }
                if (i23 != 0) {
                }
                if (i24 != 0) {
                }
                if (i25 == 0) {
                }
                if (i26 != 0) {
                }
                if (i28 == 0) {
                }
                if ((1024 & i13) == 0) {
                }
                if ((2048 & i13) == 0) {
                }
                if (i32 == 0) {
                }
                if (i34 == 0) {
                }
                if ((16384 & i13) == 0) {
                }
                if (i35 == 0) {
                }
                if (i36 == 0) {
                }
                f12 = f11;
                eVar10 = eVar18;
                interfaceC6511n2 = interfaceC6511n3;
                c3969l.j0();
                DsTagButtonColors colors2222 = colors(dsTagButtonStyle2, z16, z17);
                e eVar202222 = eVar10;
                float horizontalPadding2222 = getHorizontalPadding(dsTagButtonSize2);
                boolean z242222 = z17;
                DsTagButtonStyle dsTagButtonStyle42222 = dsTagButtonStyle2;
                float verticalPadding2222 = verticalPadding(dsTagButtonSize2, false);
                f13 = f12;
                boolean z252222 = z16;
                abstractC8972b3 = abstractC8972b2;
                b11 = androidx.compose.foundation.e.b(C6988h.a(a0.h(M.a(eVar6, EnumC9909s.Min), getHeight(dsTagButtonSize2), 0.0f, 2), h.b(f13)), colors2222.getBackgroundColor(), y0.a());
                e maxIntrinsicWidthIfInLazyRow2222 = ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(b11);
                Y b122222 = X.b(C5179b.b(), InterfaceC6250b.a.i(), c3969l, 54);
                I11 = c3969l.I();
                A0 d112222 = c3969l.d();
                e f172222 = c.f(c3969l, maxIntrinsicWidthIfInLazyRow2222);
                z18 = z15;
                Function0 a112222 = g.a(InterfaceC2801g.f5440U, c3969l);
                if (c3969l.t()) {
                }
                Function2 h112222 = Cm.e.h(c3969l, b122222, c3969l, d112222);
                if (!c3969l.t()) {
                }
                a.d(I11, c3969l, I11, h112222);
                F1.b(c3969l, f172222, InterfaceC2801g.a.f());
                C9891D c9891d2222 = C9891D.f99599a;
                e.a aVar22222 = e.f40358c0;
                e b132222 = i.b(c9891d2222.a(aVar22222, 1.0f, false), qVar4, null, z252222, null, null, function0, 24);
                if (z18) {
                }
                e i432222 = T.i(b132222, horizontalPadding2222, verticalPadding2222, f14, verticalPadding2222);
                Y b142222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), c3969l, i19);
                I12 = c3969l.I();
                A0 d122222 = c3969l.d();
                e f182222 = c.f(c3969l, i432222);
                Function0 a122222 = InterfaceC2801g.a.a();
                c3969l.i();
                if (c3969l.t()) {
                }
                Function2 h122222 = Cm.e.h(c3969l, b142222, c3969l, d122222);
                if (!c3969l.t()) {
                }
                a.d(I12, c3969l, I12, h122222);
                U7.i.b(c3969l, f182222, 528299677);
                dsTagButtonSize3 = DsTagButtonSize.Size600;
                if (dsTagButtonSize2 == dsTagButtonSize3) {
                }
                abstractC8972b4 = abstractC8972b3;
                c3969l.k();
                c3969l.o(528310153);
                if (dsTagButtonSize2 == dsTagButtonSize3) {
                }
                f15 = f13;
                c3969l.k();
                c3969l.o(528337466);
                if (str2 != null) {
                }
                str3 = str2;
                c3969l.k();
                c3969l.o(528352048);
                if (interfaceC6511n2 != null) {
                }
                c3969l.k();
                c3969l.f();
                c3969l.o(1178507642);
                if (z18) {
                }
                c3969l.k();
                c3969l.f();
                qVar7 = qVar6;
                abstractC8972b5 = abstractC8972b4;
                imageVO3 = imageVO2;
                dsTagButtonSize4 = dsTagButtonSize2;
                c3969l2 = c3969l;
                eVar13 = eVar7;
                eVar14 = eVar12;
                z21 = z242222;
                dsTagButtonStyle3 = dsTagButtonStyle42222;
                f16 = f15;
                z22 = z19;
                eVar15 = eVar6;
                z15 = z18;
                eVar16 = eVar11;
                str4 = str3;
                qVar8 = qVar4;
                m02 = c3969l2.m0();
                if (m02 == null) {
                }
            }
        }
        eVar7 = eVar2;
        i21 = i13 & 8;
        if (i21 == 0) {
        }
        abstractC8972b2 = abstractC8972b;
        i22 = i13 & 16;
        if (i22 != 0) {
        }
        i23 = i13 & 32;
        if (i23 == 0) {
        }
        i24 = i13 & 64;
        if (i24 == 0) {
        }
        i25 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i25 == 0) {
        }
        i26 = i13 & 256;
        if (i26 == 0) {
        }
        i27 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i27 == 0) {
        }
        i28 = i27;
        if ((i12 & 6) == 0) {
        }
        if ((i12 & 48) == 0) {
        }
        i31 = i13 & 4096;
        if (i31 != 0) {
        }
        i33 = i17;
        i34 = i13 & 8192;
        if (i34 != 0) {
        }
        if ((i12 & 24576) == 0) {
        }
        if ((32768 & i13) != 0) {
        }
        if ((i13 & 65536) == 0) {
        }
        i35 = i13 & 131072;
        if (i35 == 0) {
        }
        i36 = i13 & 262144;
        if (i36 == 0) {
        }
        if ((i33 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i38 != 0) {
        }
        if (i39 != 0) {
        }
        if (i41 != 0) {
        }
        if (i21 != 0) {
        }
        if (i22 == 0) {
        }
        if (i23 != 0) {
        }
        if (i24 != 0) {
        }
        if (i25 == 0) {
        }
        if (i26 != 0) {
        }
        if (i28 == 0) {
        }
        if ((1024 & i13) == 0) {
        }
        if ((2048 & i13) == 0) {
        }
        if (i32 == 0) {
        }
        if (i34 == 0) {
        }
        if ((16384 & i13) == 0) {
        }
        if (i35 == 0) {
        }
        if (i36 == 0) {
        }
        f12 = f11;
        eVar10 = eVar18;
        interfaceC6511n2 = interfaceC6511n3;
        c3969l.j0();
        DsTagButtonColors colors22222 = colors(dsTagButtonStyle2, z16, z17);
        e eVar2022222 = eVar10;
        float horizontalPadding22222 = getHorizontalPadding(dsTagButtonSize2);
        boolean z2422222 = z17;
        DsTagButtonStyle dsTagButtonStyle422222 = dsTagButtonStyle2;
        float verticalPadding22222 = verticalPadding(dsTagButtonSize2, false);
        f13 = f12;
        boolean z2522222 = z16;
        abstractC8972b3 = abstractC8972b2;
        b11 = androidx.compose.foundation.e.b(C6988h.a(a0.h(M.a(eVar6, EnumC9909s.Min), getHeight(dsTagButtonSize2), 0.0f, 2), h.b(f13)), colors22222.getBackgroundColor(), y0.a());
        e maxIntrinsicWidthIfInLazyRow22222 = ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(b11);
        Y b1222222 = X.b(C5179b.b(), InterfaceC6250b.a.i(), c3969l, 54);
        I11 = c3969l.I();
        A0 d1122222 = c3969l.d();
        e f1722222 = c.f(c3969l, maxIntrinsicWidthIfInLazyRow22222);
        z18 = z15;
        Function0 a1122222 = g.a(InterfaceC2801g.f5440U, c3969l);
        if (c3969l.t()) {
        }
        Function2 h1122222 = Cm.e.h(c3969l, b1222222, c3969l, d1122222);
        if (!c3969l.t()) {
        }
        a.d(I11, c3969l, I11, h1122222);
        F1.b(c3969l, f1722222, InterfaceC2801g.a.f());
        C9891D c9891d22222 = C9891D.f99599a;
        e.a aVar222222 = e.f40358c0;
        e b1322222 = i.b(c9891d22222.a(aVar222222, 1.0f, false), qVar4, null, z2522222, null, null, function0, 24);
        if (z18) {
        }
        e i4322222 = T.i(b1322222, horizontalPadding22222, verticalPadding22222, f14, verticalPadding22222);
        Y b1422222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), c3969l, i19);
        I12 = c3969l.I();
        A0 d1222222 = c3969l.d();
        e f1822222 = c.f(c3969l, i4322222);
        Function0 a1222222 = InterfaceC2801g.a.a();
        c3969l.i();
        if (c3969l.t()) {
        }
        Function2 h1222222 = Cm.e.h(c3969l, b1422222, c3969l, d1222222);
        if (!c3969l.t()) {
        }
        a.d(I12, c3969l, I12, h1222222);
        U7.i.b(c3969l, f1822222, 528299677);
        dsTagButtonSize3 = DsTagButtonSize.Size600;
        if (dsTagButtonSize2 == dsTagButtonSize3) {
        }
        abstractC8972b4 = abstractC8972b3;
        c3969l.k();
        c3969l.o(528310153);
        if (dsTagButtonSize2 == dsTagButtonSize3) {
        }
        f15 = f13;
        c3969l.k();
        c3969l.o(528337466);
        if (str2 != null) {
        }
        str3 = str2;
        c3969l.k();
        c3969l.o(528352048);
        if (interfaceC6511n2 != null) {
        }
        c3969l.k();
        c3969l.f();
        c3969l.o(1178507642);
        if (z18) {
        }
        c3969l.k();
        c3969l.f();
        qVar7 = qVar6;
        abstractC8972b5 = abstractC8972b4;
        imageVO3 = imageVO2;
        dsTagButtonSize4 = dsTagButtonSize2;
        c3969l2 = c3969l;
        eVar13 = eVar7;
        eVar14 = eVar12;
        z21 = z2422222;
        dsTagButtonStyle3 = dsTagButtonStyle422222;
        f16 = f15;
        z22 = z19;
        eVar15 = eVar6;
        z15 = z18;
        eVar16 = eVar11;
        str4 = str3;
        qVar8 = qVar4;
        m02 = c3969l2.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DsLoaderTagButton--b7W0Lw, reason: not valid java name */
    public static final void m1809DsLoaderTagButtonb7W0Lw(e eVar, DsTagButtonSize dsTagButtonSize, DsTagButtonStyle dsTagButtonStyle, float f7, boolean z11, Function0<Unit> function0, q qVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        DsTagButtonSize dsTagButtonSize2;
        DsTagButtonStyle dsTagButtonStyle2;
        float f11;
        boolean z12;
        Function0<Unit> function02;
        q qVar2;
        DsTagButtonSize dsTagButtonSize3;
        int i14;
        e eVar3;
        boolean z13;
        boolean z14;
        int i15;
        DsTagButtonSize dsTagButtonSize4;
        DsTagButtonStyle dsTagButtonStyle3;
        float cornerRadius;
        e b11;
        DsTagButtonStyle dsTagButtonStyle4;
        DsTagButtonSize dsTagButtonSize5;
        float f12;
        Function0<Unit> function03;
        q qVar3;
        C3969l c3969l;
        boolean z15;
        int i16;
        int i17;
        C3969l u11 = interfaceC3967k.u(873685843);
        int i18 = i12 & 1;
        if (i18 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2) == 0) {
                dsTagButtonSize2 = dsTagButtonSize;
                if (u11.n(dsTagButtonSize2)) {
                    i17 = 32;
                    i13 |= i17;
                }
            } else {
                dsTagButtonSize2 = dsTagButtonSize;
            }
            i17 = 16;
            i13 |= i17;
        } else {
            dsTagButtonSize2 = dsTagButtonSize;
        }
        if ((i11 & 384) == 0) {
            if ((i12 & 4) == 0) {
                dsTagButtonStyle2 = dsTagButtonStyle;
                if (u11.n(dsTagButtonStyle2)) {
                    i16 = 256;
                    i13 |= i16;
                }
            } else {
                dsTagButtonStyle2 = dsTagButtonStyle;
            }
            i16 = UserVerificationMethods.USER_VERIFY_PATTERN;
            i13 |= i16;
        } else {
            dsTagButtonStyle2 = dsTagButtonStyle;
        }
        if ((i11 & 3072) == 0) {
            f11 = f7;
            i13 |= ((i12 & 8) == 0 && u11.q(f11)) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            f11 = f7;
        }
        int i19 = i12 & 16;
        if (i19 != 0) {
            i13 |= 24576;
            z12 = z11;
        } else {
            z12 = z11;
            if ((i11 & 24576) == 0) {
                i13 |= u11.p(z12) ? 16384 : 8192;
            }
        }
        int i21 = i12 & 32;
        if (i21 != 0) {
            i13 |= 196608;
            function02 = function0;
        } else {
            function02 = function0;
            if ((196608 & i11) == 0) {
                i13 |= u11.F(function02) ? 131072 : 65536;
            }
        }
        int i22 = i12 & 64;
        if (i22 != 0) {
            i13 |= 1572864;
            qVar2 = qVar;
        } else {
            qVar2 = qVar;
            if ((1572864 & i11) == 0) {
                i13 |= u11.n(qVar2) ? 1048576 : 524288;
            }
        }
        if ((599187 & i13) == 599186 && u11.b()) {
            u11.j();
            dsTagButtonSize5 = dsTagButtonSize2;
            dsTagButtonStyle4 = dsTagButtonStyle2;
            f12 = f11;
            c3969l = u11;
            z15 = z12;
            function03 = function02;
            qVar3 = qVar2;
        } else {
            u11.Q0();
            int i23 = i13;
            if ((i11 & 1) == 0 || u11.w0()) {
                e eVar4 = i18 != 0 ? e.f40358c0 : eVar2;
                if ((i12 & 2) != 0) {
                    dsTagButtonSize3 = DsTagButtonDefaults.INSTANCE.getSize$uni_release();
                    i14 = i23 & (-113);
                } else {
                    dsTagButtonSize3 = dsTagButtonSize2;
                    i14 = i23;
                }
                if ((i12 & 4) != 0) {
                    eVar3 = eVar4;
                    i15 = i19;
                    dsTagButtonSize4 = dsTagButtonSize3;
                    z13 = false;
                    z14 = true;
                    dsTagButtonStyle3 = DsTagButtonDefaults.INSTANCE.style(null, null, false, u11, UniIconToken.$stable << 9, 7);
                    i14 &= -897;
                } else {
                    eVar3 = eVar4;
                    z13 = false;
                    z14 = true;
                    i15 = i19;
                    dsTagButtonSize4 = dsTagButtonSize3;
                    dsTagButtonStyle3 = dsTagButtonStyle2;
                }
                cornerRadius = (i12 & 8) != 0 ? cornerRadius(dsTagButtonSize4, z13, u11, (i14 >> 3) & 14, z14 ? 1 : 0) : f7;
                if (i15 != 0) {
                    z12 = z13;
                }
                if (i21 != 0) {
                    u11.o(1154147604);
                    Object C11 = u11.C();
                    if (C11 == InterfaceC3967k.a.a()) {
                        C11 = DsTagButtonKt$DsLoaderTagButton$1$1.INSTANCE;
                        u11.x(C11);
                    }
                    u11.k();
                    function02 = (Function0) C11;
                }
                if (i22 != 0) {
                    u11.o(1154149369);
                    Object C12 = u11.C();
                    if (C12 == InterfaceC3967k.a.a()) {
                        C12 = p.a();
                        u11.x(C12);
                    }
                    u11.k();
                    dsTagButtonStyle2 = dsTagButtonStyle3;
                    qVar2 = (q) C12;
                } else {
                    dsTagButtonStyle2 = dsTagButtonStyle3;
                }
                eVar2 = eVar3;
            } else {
                u11.j();
                dsTagButtonSize4 = dsTagButtonSize2;
                z14 = true;
                cornerRadius = f11;
                z13 = false;
            }
            u11.j0();
            DsTagButtonColors colors = colors(dsTagButtonStyle2, z14, z12);
            b11 = androidx.compose.foundation.e.b(C6988h.a(i.b(a0.f(eVar2, getHeight(dsTagButtonSize4)), qVar2, null, false, null, null, function02, 28), h.b(cornerRadius)), colors.getBackgroundColor(), y0.a());
            e g10 = T.g(b11, getHorizontalPadding(dsTagButtonSize4), verticalPadding(dsTagButtonSize4, z14));
            V f13 = C5185h.f(InterfaceC6250b.a.e(), z13);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f14 = c.f(u11, g10);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f15 = T7.E.f(u11, f13, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f15);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            DsLoaderKt.m1753DsLoader3IgeMak(e.f40358c0, colors.getLoaderColor(), DsTagButtonDefaults.INSTANCE.getLoaderSize$uni_release(), u11, 6, 0);
            u11.f();
            dsTagButtonStyle4 = dsTagButtonStyle2;
            dsTagButtonSize5 = dsTagButtonSize4;
            f12 = cornerRadius;
            function03 = function02;
            qVar3 = qVar2;
            c3969l = u11;
            z15 = z12;
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new DsTagButtonKt$DsLoaderTagButton$4(eVar2, dsTagButtonSize5, dsTagButtonStyle4, f12, z15, function03, qVar3, i11, i12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x043c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x028d  */
    /* renamed from: DsTagButton-DRvdSBo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1810DsTagButtonDRvdSBo(e eVar, String str, e eVar2, AbstractC8972b abstractC8972b, e eVar3, ImageVO imageVO, e eVar4, InterfaceC6511n<? super DsTagButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, boolean z11, e eVar5, DsTagButtonState dsTagButtonState, DsTagButtonStyle dsTagButtonStyle, DsTagButtonSize dsTagButtonSize, float f7, Function0<Unit> function0, Function0<Unit> function02, q qVar, q qVar2, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        e eVar6;
        int i15;
        String str2;
        int i16;
        int i17;
        int i18;
        e eVar7;
        int i19;
        int i21;
        int i22;
        int i23;
        ImageVO imageVO2;
        int i24;
        e eVar8;
        int i25;
        InterfaceC6511n<? super DsTagButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2;
        int i26;
        boolean z12;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        DsTagButtonState dsTagButtonState2;
        C3969l c3969l;
        DsTagButtonStyle dsTagButtonStyle2;
        DsTagButtonSize dsTagButtonSize2;
        DsTagButtonStyle dsTagButtonStyle3;
        float f11;
        Function0<Unit> function03;
        Function0<Unit> function04;
        float f12;
        q qVar3;
        DsTagButtonSize dsTagButtonSize3;
        Function0<Unit> function05;
        Function0<Unit> function06;
        int i35;
        ImageVO imageVO3;
        boolean z13;
        e eVar9;
        String str3;
        e eVar10;
        e eVar11;
        DsTagButtonState dsTagButtonState3;
        AbstractC8972b abstractC8972b2;
        e eVar12;
        DsTagButtonStyle dsTagButtonStyle4;
        float f13;
        q qVar4;
        q qVar5;
        e eVar13;
        boolean z14;
        int i36;
        C3969l c3969l2;
        ImageVO imageVO4;
        DsTagButtonSize dsTagButtonSize4;
        Function0<Unit> function07;
        J0 m02;
        int i37;
        C3969l u11 = interfaceC3967k.u(-1704408935);
        int i38 = i13 & 1;
        if (i38 != 0) {
            eVar6 = eVar;
            i15 = i11 | 6;
            i14 = 16;
        } else if ((i11 & 6) == 0) {
            i14 = 16;
            eVar6 = eVar;
            i15 = i11 | (u11.n(eVar6) ? 4 : 2);
        } else {
            i14 = 16;
            eVar6 = eVar;
            i15 = i11;
        }
        int i39 = i13 & 2;
        if (i39 != 0) {
            str2 = str;
            i17 = i15 | 48;
            i18 = 4;
            i16 = 32;
        } else {
            str2 = str;
            if ((i11 & 48) == 0) {
                i16 = 32;
                i15 |= u11.n(str2) ? 32 : i14;
            } else {
                i16 = 32;
            }
            i17 = i15;
            i18 = 4;
        }
        int i41 = i13 & 4;
        if (i41 != 0) {
            i17 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar7 = eVar2;
            i17 |= u11.n(eVar7) ? 256 : 128;
            i19 = i13 & 8;
            if (i19 == 0) {
                i17 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i17 |= u11.n(abstractC8972b) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                i21 = i13 & 16;
                if (i21 != 0) {
                    i17 |= 24576;
                    i22 = 1;
                } else {
                    i22 = 1;
                    if ((i11 & 24576) == 0) {
                        i17 |= u11.n(eVar3) ? 16384 : 8192;
                        i23 = i13 & 32;
                        if (i23 == 0) {
                            i17 |= 196608;
                            imageVO2 = imageVO;
                        } else {
                            imageVO2 = imageVO;
                            if ((i11 & 196608) == 0) {
                                i17 |= u11.n(imageVO2) ? 131072 : 65536;
                            }
                        }
                        i24 = i13 & 64;
                        if (i24 == 0) {
                            i17 |= 1572864;
                            eVar8 = eVar4;
                        } else {
                            eVar8 = eVar4;
                            if ((i11 & 1572864) == 0) {
                                i17 |= u11.n(eVar8) ? 1048576 : 524288;
                            }
                        }
                        i25 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i25 == 0) {
                            i17 |= 12582912;
                            interfaceC6511n2 = interfaceC6511n;
                        } else {
                            interfaceC6511n2 = interfaceC6511n;
                            if ((i11 & 12582912) == 0) {
                                i17 |= u11.F(interfaceC6511n2) ? 8388608 : 4194304;
                            }
                        }
                        i26 = i13 & 256;
                        if (i26 == 0) {
                            i17 |= 100663296;
                            z12 = z11;
                        } else {
                            z12 = z11;
                            if ((i11 & 100663296) == 0) {
                                i17 |= u11.p(z12) ? 67108864 : 33554432;
                            }
                        }
                        i27 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                        if (i27 == 0) {
                            i17 |= 805306368;
                        } else if ((i11 & 805306368) == 0) {
                            i28 = i27;
                            i17 |= u11.n(eVar5) ? 536870912 : 268435456;
                            if ((i12 & 6) == 0) {
                                i29 = (((i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0 && u11.n(dsTagButtonState)) ? i18 : 2) | i12;
                            } else {
                                i29 = i12;
                            }
                            if ((i12 & 48) == 0) {
                                int i42 = i29;
                                if ((i13 & 2048) == 0 && u11.n(dsTagButtonStyle)) {
                                    i14 = i16;
                                }
                                i29 = i42 | i14;
                            }
                            if ((i12 & 384) == 0) {
                                if ((i13 & 4096) == 0 && u11.n(dsTagButtonSize)) {
                                    i37 = 256;
                                    i29 |= i37;
                                }
                                i37 = UserVerificationMethods.USER_VERIFY_PATTERN;
                                i29 |= i37;
                            }
                            if ((i12 & 3072) == 0) {
                                i29 |= ((i13 & 8192) == 0 && u11.q(f7)) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                            }
                            i31 = i13 & 16384;
                            if (i31 != 0) {
                                i29 |= 24576;
                            } else if ((i12 & 24576) == 0) {
                                i29 |= u11.F(function0) ? 16384 : 8192;
                                i32 = i13 & 32768;
                                if (i32 == 0) {
                                    i29 |= 196608;
                                } else if ((i12 & 196608) == 0) {
                                    i29 |= u11.F(function02) ? 131072 : 65536;
                                }
                                i33 = i13 & 65536;
                                if (i33 == 0) {
                                    i29 |= 1572864;
                                } else if ((i12 & 1572864) == 0) {
                                    i29 |= u11.n(qVar) ? 1048576 : 524288;
                                }
                                i34 = i13 & 131072;
                                if (i34 == 0) {
                                    i29 |= 12582912;
                                } else if ((i12 & 12582912) == 0) {
                                    i29 |= u11.n(qVar2) ? 8388608 : 4194304;
                                }
                                if ((i17 & 306783379) != 306783378 && (4793491 & i29) == 4793490 && u11.b()) {
                                    u11.j();
                                    abstractC8972b2 = abstractC8972b;
                                    eVar12 = eVar3;
                                    f13 = f7;
                                    function07 = function0;
                                    function06 = function02;
                                    qVar4 = qVar;
                                    qVar5 = qVar2;
                                    c3969l2 = u11;
                                    imageVO4 = imageVO2;
                                    eVar9 = eVar6;
                                    str3 = str2;
                                    eVar10 = eVar7;
                                    eVar11 = eVar8;
                                    eVar13 = eVar5;
                                    dsTagButtonState3 = dsTagButtonState;
                                    dsTagButtonStyle4 = dsTagButtonStyle;
                                    dsTagButtonSize4 = dsTagButtonSize;
                                } else {
                                    u11.Q0();
                                    if ((i11 & 1) != 0 || u11.w0()) {
                                        if (i38 != 0) {
                                            eVar6 = e.f40358c0;
                                        }
                                        if (i39 != 0) {
                                            str2 = null;
                                        }
                                        if (i41 != 0) {
                                            eVar7 = e.f40358c0;
                                        }
                                        AbstractC8972b abstractC8972b3 = i19 == 0 ? null : abstractC8972b;
                                        e eVar14 = i21 == 0 ? e.f40358c0 : eVar3;
                                        if (i23 != 0) {
                                            imageVO2 = null;
                                        }
                                        if (i24 != 0) {
                                            eVar8 = e.f40358c0;
                                        }
                                        InterfaceC6511n<? super DsTagButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n3 = i25 == 0 ? interfaceC6511n2 : null;
                                        if (i26 != 0) {
                                            z12 = false;
                                        }
                                        e eVar15 = i28 == 0 ? e.f40358c0 : eVar5;
                                        if ((1024 & i13) == 0) {
                                            dsTagButtonState2 = DsTagButtonDefaults.INSTANCE.getState$uni_release();
                                            i29 &= -15;
                                        } else {
                                            dsTagButtonState2 = dsTagButtonState;
                                        }
                                        if ((2048 & i13) == 0) {
                                            dsTagButtonStyle2 = DsTagButtonDefaults.INSTANCE.style(null, null, false, u11, UniIconToken.$stable << 9, 7);
                                            c3969l = u11;
                                            i29 &= -113;
                                        } else {
                                            c3969l = u11;
                                            dsTagButtonStyle2 = dsTagButtonStyle;
                                        }
                                        if ((i13 & 4096) == 0) {
                                            dsTagButtonSize2 = DsTagButtonDefaults.INSTANCE.getSize$uni_release();
                                            i29 &= -897;
                                        } else {
                                            dsTagButtonSize2 = dsTagButtonSize;
                                        }
                                        InterfaceC6511n<? super DsTagButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n4 = interfaceC6511n3;
                                        if ((8192 & i13) == 0) {
                                            dsTagButtonStyle3 = dsTagButtonStyle2;
                                            f11 = cornerRadius(dsTagButtonSize2, false, c3969l, (i29 >> 6) & 14, i22);
                                            i29 &= -7169;
                                        } else {
                                            dsTagButtonStyle3 = dsTagButtonStyle2;
                                            f11 = f7;
                                        }
                                        if (i31 == 0) {
                                            c3969l.o(-2088155129);
                                            Object C11 = c3969l.C();
                                            if (C11 == InterfaceC3967k.a.a()) {
                                                C11 = DsTagButtonKt$DsTagButton$5$1.INSTANCE;
                                                c3969l.x(C11);
                                            }
                                            function03 = (Function0) C11;
                                            c3969l.k();
                                        } else {
                                            function03 = function0;
                                        }
                                        if (i32 == 0) {
                                            c3969l.o(-2088154009);
                                            Object C12 = c3969l.C();
                                            if (C12 == InterfaceC3967k.a.a()) {
                                                C12 = DsTagButtonKt$DsTagButton$6$1.INSTANCE;
                                                c3969l.x(C12);
                                            }
                                            function04 = (Function0) C12;
                                            c3969l.k();
                                        } else {
                                            function04 = function02;
                                        }
                                        if (i33 == 0) {
                                            c3969l.o(-2088152244);
                                            Object C13 = c3969l.C();
                                            f12 = f11;
                                            if (C13 == InterfaceC3967k.a.a()) {
                                                C13 = p.a();
                                                c3969l.x(C13);
                                            }
                                            qVar3 = (q) C13;
                                            c3969l.k();
                                        } else {
                                            f12 = f11;
                                            qVar3 = qVar;
                                        }
                                        if (i34 == 0) {
                                            c3969l.o(-2088149172);
                                            Object C14 = c3969l.C();
                                            q qVar6 = qVar3;
                                            if (C14 == InterfaceC3967k.a.a()) {
                                                C14 = p.a();
                                                c3969l.x(C14);
                                            }
                                            q qVar7 = (q) C14;
                                            c3969l.k();
                                            dsTagButtonSize3 = dsTagButtonSize2;
                                            function05 = function03;
                                            function06 = function04;
                                            imageVO3 = imageVO2;
                                            z13 = z12;
                                            eVar9 = eVar6;
                                            str3 = str2;
                                            eVar10 = eVar7;
                                            eVar11 = eVar8;
                                            dsTagButtonState3 = dsTagButtonState2;
                                            eVar12 = eVar14;
                                            dsTagButtonStyle4 = dsTagButtonStyle3;
                                            f13 = f12;
                                            qVar5 = qVar7;
                                            i35 = i29;
                                            eVar13 = eVar15;
                                            abstractC8972b2 = abstractC8972b3;
                                            interfaceC6511n2 = interfaceC6511n4;
                                            qVar4 = qVar6;
                                        } else {
                                            q qVar8 = qVar3;
                                            dsTagButtonSize3 = dsTagButtonSize2;
                                            function05 = function03;
                                            function06 = function04;
                                            i35 = i29;
                                            imageVO3 = imageVO2;
                                            z13 = z12;
                                            eVar9 = eVar6;
                                            str3 = str2;
                                            eVar10 = eVar7;
                                            eVar11 = eVar8;
                                            dsTagButtonState3 = dsTagButtonState2;
                                            abstractC8972b2 = abstractC8972b3;
                                            eVar12 = eVar14;
                                            dsTagButtonStyle4 = dsTagButtonStyle3;
                                            f13 = f12;
                                            qVar4 = qVar8;
                                            qVar5 = qVar2;
                                            eVar13 = eVar15;
                                            interfaceC6511n2 = interfaceC6511n4;
                                        }
                                    } else {
                                        u11.j();
                                        if ((1024 & i13) != 0) {
                                            i29 &= -15;
                                        }
                                        if ((2048 & i13) != 0) {
                                            i29 &= -113;
                                        }
                                        if ((i13 & 4096) != 0) {
                                            i29 &= -897;
                                        }
                                        if ((8192 & i13) != 0) {
                                            i29 &= -7169;
                                        }
                                        eVar12 = eVar3;
                                        dsTagButtonSize3 = dsTagButtonSize;
                                        f13 = f7;
                                        function05 = function0;
                                        function06 = function02;
                                        qVar4 = qVar;
                                        qVar5 = qVar2;
                                        c3969l = u11;
                                        i35 = i29;
                                        imageVO3 = imageVO2;
                                        z13 = z12;
                                        eVar9 = eVar6;
                                        str3 = str2;
                                        eVar10 = eVar7;
                                        eVar11 = eVar8;
                                        abstractC8972b2 = abstractC8972b;
                                        eVar13 = eVar5;
                                        dsTagButtonState3 = dsTagButtonState;
                                        dsTagButtonStyle4 = dsTagButtonStyle;
                                    }
                                    c3969l.j0();
                                    if (abstractC8972b2 != null && str3 == null && interfaceC6511n2 == null && dsTagButtonState3 != DsTagButtonState.Loading && dsTagButtonState3 != DsTagButtonState.LoadingSelected) {
                                        J0 m03 = c3969l.m0();
                                        if (m03 != null) {
                                            m03.G(new DsTagButtonKt$DsTagButton$9(eVar9, str3, eVar10, abstractC8972b2, eVar12, imageVO3, eVar11, interfaceC6511n2, z13, eVar13, dsTagButtonState3, dsTagButtonStyle4, dsTagButtonSize3, f13, function05, function06, qVar4, qVar5, i11, i12, i13));
                                            return;
                                        }
                                        return;
                                    }
                                    z14 = dsTagButtonState3 != DsTagButtonState.Selected || dsTagButtonState3 == DsTagButtonState.LoadingSelected;
                                    i36 = WhenMappings.$EnumSwitchMapping$0[dsTagButtonState3.ordinal()];
                                    if (i36 != 1 || i36 == 2 || i36 == 3) {
                                        c3969l.o(-307642140);
                                        int i43 = i17 & 2147483646;
                                        int i44 = ((i35 >> 6) & 14) | (i35 & 112);
                                        int i45 = i35 << 3;
                                        q qVar9 = qVar5;
                                        m1808DsFullTagButtoncZC2P0Y(eVar9, str3, eVar10, abstractC8972b2, eVar12, imageVO3, eVar11, interfaceC6511n2, z13, eVar13, dsTagButtonSize3, dsTagButtonStyle4, z14, dsTagButtonState3 == DsTagButtonState.Disabled, f13, function05, function06, qVar4, qVar9, c3969l, i43, i44 | (57344 & i45) | (458752 & i45) | (3670016 & i45) | (29360128 & i45) | (i45 & 234881024), 0);
                                        qVar5 = qVar9;
                                        c3969l.k();
                                        Unit unit = Unit.f71690a;
                                    } else {
                                        if (i36 != i18 && i36 != 5) {
                                            c3969l.o(-2088136774);
                                            c3969l.k();
                                            throw new o();
                                        }
                                        c3969l.o(-306706312);
                                        int i46 = i35 << 3;
                                        m1809DsLoaderTagButtonb7W0Lw(eVar9, dsTagButtonSize3, dsTagButtonStyle4, f13, z14, function05, qVar4, c3969l, (i35 & 3670016) | (i17 & 14) | ((i35 >> 3) & 112) | (i46 & 896) | (i35 & 7168) | (i46 & 458752), 0);
                                        c3969l.k();
                                        Unit unit2 = Unit.f71690a;
                                    }
                                    c3969l2 = c3969l;
                                    imageVO4 = imageVO3;
                                    z12 = z13;
                                    dsTagButtonSize4 = dsTagButtonSize3;
                                    function07 = function05;
                                }
                                m02 = c3969l2.m0();
                                if (m02 == null) {
                                    m02.G(new DsTagButtonKt$DsTagButton$10(eVar9, str3, eVar10, abstractC8972b2, eVar12, imageVO4, eVar11, interfaceC6511n2, z12, eVar13, dsTagButtonState3, dsTagButtonStyle4, dsTagButtonSize4, f13, function07, function06, qVar4, qVar5, i11, i12, i13));
                                    return;
                                }
                                return;
                            }
                            i32 = i13 & 32768;
                            if (i32 == 0) {
                            }
                            i33 = i13 & 65536;
                            if (i33 == 0) {
                            }
                            i34 = i13 & 131072;
                            if (i34 == 0) {
                            }
                            if ((i17 & 306783379) != 306783378) {
                            }
                            u11.Q0();
                            if ((i11 & 1) != 0) {
                            }
                            if (i38 != 0) {
                            }
                            if (i39 != 0) {
                            }
                            if (i41 != 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (i21 == 0) {
                            }
                            if (i23 != 0) {
                            }
                            if (i24 != 0) {
                            }
                            if (i25 == 0) {
                            }
                            if (i26 != 0) {
                            }
                            if (i28 == 0) {
                            }
                            if ((1024 & i13) == 0) {
                            }
                            if ((2048 & i13) == 0) {
                            }
                            if ((i13 & 4096) == 0) {
                            }
                            InterfaceC6511n<? super DsTagButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n42 = interfaceC6511n3;
                            if ((8192 & i13) == 0) {
                            }
                            if (i31 == 0) {
                            }
                            if (i32 == 0) {
                            }
                            if (i33 == 0) {
                            }
                            if (i34 == 0) {
                            }
                            c3969l.j0();
                            if (abstractC8972b2 != null) {
                            }
                            if (dsTagButtonState3 != DsTagButtonState.Selected) {
                            }
                            i36 = WhenMappings.$EnumSwitchMapping$0[dsTagButtonState3.ordinal()];
                            if (i36 != 1) {
                            }
                            c3969l.o(-307642140);
                            int i432 = i17 & 2147483646;
                            int i442 = ((i35 >> 6) & 14) | (i35 & 112);
                            int i452 = i35 << 3;
                            q qVar92 = qVar5;
                            m1808DsFullTagButtoncZC2P0Y(eVar9, str3, eVar10, abstractC8972b2, eVar12, imageVO3, eVar11, interfaceC6511n2, z13, eVar13, dsTagButtonSize3, dsTagButtonStyle4, z14, dsTagButtonState3 == DsTagButtonState.Disabled, f13, function05, function06, qVar4, qVar92, c3969l, i432, i442 | (57344 & i452) | (458752 & i452) | (3670016 & i452) | (29360128 & i452) | (i452 & 234881024), 0);
                            qVar5 = qVar92;
                            c3969l.k();
                            Unit unit3 = Unit.f71690a;
                            c3969l2 = c3969l;
                            imageVO4 = imageVO3;
                            z12 = z13;
                            dsTagButtonSize4 = dsTagButtonSize3;
                            function07 = function05;
                            m02 = c3969l2.m0();
                            if (m02 == null) {
                            }
                        }
                        i28 = i27;
                        if ((i12 & 6) == 0) {
                        }
                        if ((i12 & 48) == 0) {
                        }
                        if ((i12 & 384) == 0) {
                        }
                        if ((i12 & 3072) == 0) {
                        }
                        i31 = i13 & 16384;
                        if (i31 != 0) {
                        }
                        i32 = i13 & 32768;
                        if (i32 == 0) {
                        }
                        i33 = i13 & 65536;
                        if (i33 == 0) {
                        }
                        i34 = i13 & 131072;
                        if (i34 == 0) {
                        }
                        if ((i17 & 306783379) != 306783378) {
                        }
                        u11.Q0();
                        if ((i11 & 1) != 0) {
                        }
                        if (i38 != 0) {
                        }
                        if (i39 != 0) {
                        }
                        if (i41 != 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (i23 != 0) {
                        }
                        if (i24 != 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (i26 != 0) {
                        }
                        if (i28 == 0) {
                        }
                        if ((1024 & i13) == 0) {
                        }
                        if ((2048 & i13) == 0) {
                        }
                        if ((i13 & 4096) == 0) {
                        }
                        InterfaceC6511n<? super DsTagButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n422 = interfaceC6511n3;
                        if ((8192 & i13) == 0) {
                        }
                        if (i31 == 0) {
                        }
                        if (i32 == 0) {
                        }
                        if (i33 == 0) {
                        }
                        if (i34 == 0) {
                        }
                        c3969l.j0();
                        if (abstractC8972b2 != null) {
                        }
                        if (dsTagButtonState3 != DsTagButtonState.Selected) {
                        }
                        i36 = WhenMappings.$EnumSwitchMapping$0[dsTagButtonState3.ordinal()];
                        if (i36 != 1) {
                        }
                        c3969l.o(-307642140);
                        int i4322 = i17 & 2147483646;
                        int i4422 = ((i35 >> 6) & 14) | (i35 & 112);
                        int i4522 = i35 << 3;
                        q qVar922 = qVar5;
                        m1808DsFullTagButtoncZC2P0Y(eVar9, str3, eVar10, abstractC8972b2, eVar12, imageVO3, eVar11, interfaceC6511n2, z13, eVar13, dsTagButtonSize3, dsTagButtonStyle4, z14, dsTagButtonState3 == DsTagButtonState.Disabled, f13, function05, function06, qVar4, qVar922, c3969l, i4322, i4422 | (57344 & i4522) | (458752 & i4522) | (3670016 & i4522) | (29360128 & i4522) | (i4522 & 234881024), 0);
                        qVar5 = qVar922;
                        c3969l.k();
                        Unit unit32 = Unit.f71690a;
                        c3969l2 = c3969l;
                        imageVO4 = imageVO3;
                        z12 = z13;
                        dsTagButtonSize4 = dsTagButtonSize3;
                        function07 = function05;
                        m02 = c3969l2.m0();
                        if (m02 == null) {
                        }
                    }
                }
                i23 = i13 & 32;
                if (i23 == 0) {
                }
                i24 = i13 & 64;
                if (i24 == 0) {
                }
                i25 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i25 == 0) {
                }
                i26 = i13 & 256;
                if (i26 == 0) {
                }
                i27 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i27 == 0) {
                }
                i28 = i27;
                if ((i12 & 6) == 0) {
                }
                if ((i12 & 48) == 0) {
                }
                if ((i12 & 384) == 0) {
                }
                if ((i12 & 3072) == 0) {
                }
                i31 = i13 & 16384;
                if (i31 != 0) {
                }
                i32 = i13 & 32768;
                if (i32 == 0) {
                }
                i33 = i13 & 65536;
                if (i33 == 0) {
                }
                i34 = i13 & 131072;
                if (i34 == 0) {
                }
                if ((i17 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i38 != 0) {
                }
                if (i39 != 0) {
                }
                if (i41 != 0) {
                }
                if (i19 == 0) {
                }
                if (i21 == 0) {
                }
                if (i23 != 0) {
                }
                if (i24 != 0) {
                }
                if (i25 == 0) {
                }
                if (i26 != 0) {
                }
                if (i28 == 0) {
                }
                if ((1024 & i13) == 0) {
                }
                if ((2048 & i13) == 0) {
                }
                if ((i13 & 4096) == 0) {
                }
                InterfaceC6511n<? super DsTagButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n4222 = interfaceC6511n3;
                if ((8192 & i13) == 0) {
                }
                if (i31 == 0) {
                }
                if (i32 == 0) {
                }
                if (i33 == 0) {
                }
                if (i34 == 0) {
                }
                c3969l.j0();
                if (abstractC8972b2 != null) {
                }
                if (dsTagButtonState3 != DsTagButtonState.Selected) {
                }
                i36 = WhenMappings.$EnumSwitchMapping$0[dsTagButtonState3.ordinal()];
                if (i36 != 1) {
                }
                c3969l.o(-307642140);
                int i43222 = i17 & 2147483646;
                int i44222 = ((i35 >> 6) & 14) | (i35 & 112);
                int i45222 = i35 << 3;
                q qVar9222 = qVar5;
                m1808DsFullTagButtoncZC2P0Y(eVar9, str3, eVar10, abstractC8972b2, eVar12, imageVO3, eVar11, interfaceC6511n2, z13, eVar13, dsTagButtonSize3, dsTagButtonStyle4, z14, dsTagButtonState3 == DsTagButtonState.Disabled, f13, function05, function06, qVar4, qVar9222, c3969l, i43222, i44222 | (57344 & i45222) | (458752 & i45222) | (3670016 & i45222) | (29360128 & i45222) | (i45222 & 234881024), 0);
                qVar5 = qVar9222;
                c3969l.k();
                Unit unit322 = Unit.f71690a;
                c3969l2 = c3969l;
                imageVO4 = imageVO3;
                z12 = z13;
                dsTagButtonSize4 = dsTagButtonSize3;
                function07 = function05;
                m02 = c3969l2.m0();
                if (m02 == null) {
                }
            }
            i21 = i13 & 16;
            if (i21 != 0) {
            }
            i23 = i13 & 32;
            if (i23 == 0) {
            }
            i24 = i13 & 64;
            if (i24 == 0) {
            }
            i25 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i25 == 0) {
            }
            i26 = i13 & 256;
            if (i26 == 0) {
            }
            i27 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i27 == 0) {
            }
            i28 = i27;
            if ((i12 & 6) == 0) {
            }
            if ((i12 & 48) == 0) {
            }
            if ((i12 & 384) == 0) {
            }
            if ((i12 & 3072) == 0) {
            }
            i31 = i13 & 16384;
            if (i31 != 0) {
            }
            i32 = i13 & 32768;
            if (i32 == 0) {
            }
            i33 = i13 & 65536;
            if (i33 == 0) {
            }
            i34 = i13 & 131072;
            if (i34 == 0) {
            }
            if ((i17 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i38 != 0) {
            }
            if (i39 != 0) {
            }
            if (i41 != 0) {
            }
            if (i19 == 0) {
            }
            if (i21 == 0) {
            }
            if (i23 != 0) {
            }
            if (i24 != 0) {
            }
            if (i25 == 0) {
            }
            if (i26 != 0) {
            }
            if (i28 == 0) {
            }
            if ((1024 & i13) == 0) {
            }
            if ((2048 & i13) == 0) {
            }
            if ((i13 & 4096) == 0) {
            }
            InterfaceC6511n<? super DsTagButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n42222 = interfaceC6511n3;
            if ((8192 & i13) == 0) {
            }
            if (i31 == 0) {
            }
            if (i32 == 0) {
            }
            if (i33 == 0) {
            }
            if (i34 == 0) {
            }
            c3969l.j0();
            if (abstractC8972b2 != null) {
            }
            if (dsTagButtonState3 != DsTagButtonState.Selected) {
            }
            i36 = WhenMappings.$EnumSwitchMapping$0[dsTagButtonState3.ordinal()];
            if (i36 != 1) {
            }
            c3969l.o(-307642140);
            int i432222 = i17 & 2147483646;
            int i442222 = ((i35 >> 6) & 14) | (i35 & 112);
            int i452222 = i35 << 3;
            q qVar92222 = qVar5;
            m1808DsFullTagButtoncZC2P0Y(eVar9, str3, eVar10, abstractC8972b2, eVar12, imageVO3, eVar11, interfaceC6511n2, z13, eVar13, dsTagButtonSize3, dsTagButtonStyle4, z14, dsTagButtonState3 == DsTagButtonState.Disabled, f13, function05, function06, qVar4, qVar92222, c3969l, i432222, i442222 | (57344 & i452222) | (458752 & i452222) | (3670016 & i452222) | (29360128 & i452222) | (i452222 & 234881024), 0);
            qVar5 = qVar92222;
            c3969l.k();
            Unit unit3222 = Unit.f71690a;
            c3969l2 = c3969l;
            imageVO4 = imageVO3;
            z12 = z13;
            dsTagButtonSize4 = dsTagButtonSize3;
            function07 = function05;
            m02 = c3969l2.m0();
            if (m02 == null) {
            }
        }
        eVar7 = eVar2;
        i19 = i13 & 8;
        if (i19 == 0) {
        }
        i21 = i13 & 16;
        if (i21 != 0) {
        }
        i23 = i13 & 32;
        if (i23 == 0) {
        }
        i24 = i13 & 64;
        if (i24 == 0) {
        }
        i25 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i25 == 0) {
        }
        i26 = i13 & 256;
        if (i26 == 0) {
        }
        i27 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i27 == 0) {
        }
        i28 = i27;
        if ((i12 & 6) == 0) {
        }
        if ((i12 & 48) == 0) {
        }
        if ((i12 & 384) == 0) {
        }
        if ((i12 & 3072) == 0) {
        }
        i31 = i13 & 16384;
        if (i31 != 0) {
        }
        i32 = i13 & 32768;
        if (i32 == 0) {
        }
        i33 = i13 & 65536;
        if (i33 == 0) {
        }
        i34 = i13 & 131072;
        if (i34 == 0) {
        }
        if ((i17 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i38 != 0) {
        }
        if (i39 != 0) {
        }
        if (i41 != 0) {
        }
        if (i19 == 0) {
        }
        if (i21 == 0) {
        }
        if (i23 != 0) {
        }
        if (i24 != 0) {
        }
        if (i25 == 0) {
        }
        if (i26 != 0) {
        }
        if (i28 == 0) {
        }
        if ((1024 & i13) == 0) {
        }
        if ((2048 & i13) == 0) {
        }
        if ((i13 & 4096) == 0) {
        }
        InterfaceC6511n<? super DsTagButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n422222 = interfaceC6511n3;
        if ((8192 & i13) == 0) {
        }
        if (i31 == 0) {
        }
        if (i32 == 0) {
        }
        if (i33 == 0) {
        }
        if (i34 == 0) {
        }
        c3969l.j0();
        if (abstractC8972b2 != null) {
        }
        if (dsTagButtonState3 != DsTagButtonState.Selected) {
        }
        i36 = WhenMappings.$EnumSwitchMapping$0[dsTagButtonState3.ordinal()];
        if (i36 != 1) {
        }
        c3969l.o(-307642140);
        int i4322222 = i17 & 2147483646;
        int i4422222 = ((i35 >> 6) & 14) | (i35 & 112);
        int i4522222 = i35 << 3;
        q qVar922222 = qVar5;
        m1808DsFullTagButtoncZC2P0Y(eVar9, str3, eVar10, abstractC8972b2, eVar12, imageVO3, eVar11, interfaceC6511n2, z13, eVar13, dsTagButtonSize3, dsTagButtonStyle4, z14, dsTagButtonState3 == DsTagButtonState.Disabled, f13, function05, function06, qVar4, qVar922222, c3969l, i4322222, i4422222 | (57344 & i4522222) | (458752 & i4522222) | (3670016 & i4522222) | (29360128 & i4522222) | (i4522222 & 234881024), 0);
        qVar5 = qVar922222;
        c3969l.k();
        Unit unit32222 = Unit.f71690a;
        c3969l2 = c3969l;
        imageVO4 = imageVO3;
        z12 = z13;
        dsTagButtonSize4 = dsTagButtonSize3;
        function07 = function05;
        m02 = c3969l2.m0();
        if (m02 == null) {
        }
    }

    private static final DsTagButtonColors colors(DsTagButtonStyle dsTagButtonStyle, boolean z11, boolean z12) {
        return (z11 && z12) ? dsTagButtonStyle.getSelectedColors() : !z11 ? disabled(dsTagButtonStyle.getColors()) : dsTagButtonStyle.getColors();
    }

    public static final float cornerRadius(@NotNull DsTagButtonSize dsTagButtonSize, boolean z11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(dsTagButtonSize, "<this>");
        interfaceC3967k.o(1447771698);
        if ((i12 & 1) != 0) {
            z11 = false;
        }
        int i14 = WhenMappings.$EnumSwitchMapping$1[dsTagButtonSize.ordinal()];
        if (i14 == 1) {
            i13 = z11 ? 12 : 8;
        } else {
            if (i14 != 2) {
                throw new o();
            }
            i13 = z11 ? 16 : 10;
        }
        float f7 = i13;
        interfaceC3967k.k();
        return f7;
    }

    @NotNull
    /* renamed from: custom--hDc7uY, reason: not valid java name */
    public static final DsTagButtonColors m1813customhDc7uY(@NotNull DsTagButtonColors custom, long j11, long j12, long j13, long j14) {
        long loaderColor;
        long j15;
        long j16;
        long j17;
        long j18;
        Intrinsics.checkNotNullParameter(custom, "$this$custom");
        long backgroundColor = j11 != 16 ? j11 : custom.getBackgroundColor();
        long textColor = j12 != 16 ? j12 : custom.getTextColor();
        long iconTint = j13 != 16 ? j13 : custom.getIconTint();
        long closeIconTint = j14 != 16 ? j14 : custom.getCloseIconTint();
        if (j12 != 16) {
            long j19 = iconTint;
            j15 = closeIconTint;
            j16 = backgroundColor;
            j17 = textColor;
            j18 = j19;
            loaderColor = j12;
        } else {
            loaderColor = custom.getLoaderColor();
            long j21 = iconTint;
            j15 = closeIconTint;
            j16 = backgroundColor;
            j17 = textColor;
            j18 = j21;
        }
        return custom.m1801copyt635Npw(j16, j17, j18, j15, loaderColor);
    }

    private static final DsTagButtonColors disabled(DsTagButtonColors dsTagButtonColors) {
        return DsTagButtonColors.m1800copyt635Npw$default(dsTagButtonColors, 0L, C7807Z.o(0.4f, dsTagButtonColors.getTextColor()), C7807Z.o(0.4f, dsTagButtonColors.getIconTint()), 0L, 0L, 25, null);
    }

    private static final float getHeight(DsTagButtonSize dsTagButtonSize) {
        int i11;
        int i12 = WhenMappings.$EnumSwitchMapping$1[dsTagButtonSize.ordinal()];
        if (i12 == 1) {
            i11 = 24;
        } else {
            if (i12 != 2) {
                throw new o();
            }
            i11 = 32;
        }
        return i11;
    }

    private static final float getHorizontalPadding(DsTagButtonSize dsTagButtonSize) {
        int i11;
        int i12 = WhenMappings.$EnumSwitchMapping$1[dsTagButtonSize.ordinal()];
        if (i12 == 1) {
            i11 = 4;
        } else {
            if (i12 != 2) {
                throw new o();
            }
            i11 = 8;
        }
        return i11;
    }

    @NotNull
    public static final DsTagButtonColors multicolor(@NotNull DsTagButtonColors dsTagButtonColors, boolean z11) {
        long j11;
        Intrinsics.checkNotNullParameter(dsTagButtonColors, "<this>");
        if (!z11) {
            return dsTagButtonColors;
        }
        int i11 = C7807Z.f72260n;
        j11 = C7807Z.f72259m;
        return DsTagButtonColors.m1800copyt635Npw$default(dsTagButtonColors, 0L, 0L, j11, 0L, 0L, 27, null);
    }

    private static final float verticalPadding(DsTagButtonSize dsTagButtonSize, boolean z11) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[dsTagButtonSize.ordinal()];
        if (i11 == 1) {
            return 2;
        }
        if (i11 == 2) {
            return z11 ? 8 : 6;
        }
        throw new o();
    }
}
