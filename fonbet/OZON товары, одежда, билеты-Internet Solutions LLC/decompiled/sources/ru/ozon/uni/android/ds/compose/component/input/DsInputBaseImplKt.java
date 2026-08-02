package ru.ozon.uni.android.ds.compose.component.input;

import A0.h;
import B0.C2475h;
import B0.M0;
import B0.N0;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import I0.j1;
import I0.k1;
import K00.b;
import K1.M;
import K1.N;
import K1.T;
import P0.p2;
import Q1.K;
import Q1.X;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.C3996z;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import Sc.o;
import T7.E;
import a1.C4912a;
import android.content.Context;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import j1.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.K0;
import n0.C8385f;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.ds.compose.component.common.SingleLineTextKt;
import ru.ozon.uni.android.ds.compose.component.input.DsInputType;
import ru.ozon.uni.android.ds.compose.component.input.inputCore.DecorationBoxKt;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.android.ds.compose.util.TextFieldScrollExtKt;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.foundation.utils.EmptyInteractionSource;
import t0.i;
import t0.p;
import t0.q;
import u0.C9891D;
import u0.InterfaceC9890C;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0004\u001aÅ\u0002\u00108\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00192\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010$2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0'2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0'2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0\nH\u0001¢\u0006\u0004\b6\u00107\u001aó\u0001\u0010K\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u00152\u0006\u0010;\u001a\u00020\u00152\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010<\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\u001f2\u0006\u0010?\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020\u001f2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020A2\u0006\u0010D\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u00062\u0006\u0010H\u001a\u00020GH\u0003¢\u0006\u0004\bI\u0010J\u001a§\u0001\u0010P\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010'*\u00020L2\u0006\u0010\t\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010$2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0'2\b\u0010&\u001a\u0004\u0018\u00010$2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0'2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0'2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u000b0'2\u0006\u0010O\u001a\u00020NH\u0003¢\u0006\u0004\bP\u0010Q\u001aI\u0010Y\u001a\u00020\u000b*\u00020L2\u0006\u0010R\u001a\u00020$2\b\b\u0002\u0010S\u001a\u00020\u00062\b\b\u0002\u0010T\u001a\u00020\u001f2\u000e\b\u0002\u0010U\u001a\b\u0012\u0004\u0012\u00020\u000b0'2\b\b\u0002\u0010V\u001a\u00020\u0015H\u0003¢\u0006\u0004\bW\u0010X¨\u0006[²\u0006\f\u0010Z\u001a\u00020\u00158\nX\u008a\u0084\u0002"}, d2 = {"LZ1/h;", "cornerSize", "LA0/g;", "inputShape-8Feqmps", "(FLS0/k;I)LA0/g;", "inputShape", "Landroidx/compose/ui/e;", "modifier", "LQ1/K;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lkotlin/Function1;", "", "onValueChange", "Lru/ozon/uni/android/ds/compose/component/input/DsInputSize;", "size", "Lru/ozon/uni/android/ds/compose/component/input/DsInputType;", "type", "Lru/ozon/uni/android/ds/compose/component/input/DsInputTheme;", "theme", "Lru/ozon/uni/android/ds/compose/component/input/DsInputState;", "state", "", "loading", "Lru/ozon/uni/android/ds/compose/component/input/DsInputStatus;", "status", "", HammersV3BodyDTO.PLACEHOLDER, "label", "Lru/ozon/uni/android/ds/compose/component/input/DsInputLabelPosition;", "labelPosition", "caption", "Ll1/Z;", "captionColor", "hasClearButton", "hasErrorIcon", "hasCopyButton", "Lru/ozon/uni/core/models/UniIconToken;", "firstIcon", "secondIcon", "Lkotlin/Function0;", "onFirstIconClick", "onSecondIconClick", "LB0/N0;", "keyboardOptions", "LB0/M0;", "keyboardActions", "LQ1/X;", "visualTransformation", "Lt0/q;", "interactionSource", "onClearClick", "onStatusChanged", "onFocusChanged", "copyTextAction", "DsInputBaseImpl-oiW5flc", "(Landroidx/compose/ui/e;LQ1/K;Lkotlin/jvm/functions/Function1;Lru/ozon/uni/android/ds/compose/component/input/DsInputSize;Lru/ozon/uni/android/ds/compose/component/input/DsInputType;Lru/ozon/uni/android/ds/compose/component/input/DsInputTheme;Lru/ozon/uni/android/ds/compose/component/input/DsInputState;ZLru/ozon/uni/android/ds/compose/component/input/DsInputStatus;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/ds/compose/component/input/DsInputLabelPosition;Ljava/lang/String;Ll1/Z;ZZZLru/ozon/uni/core/models/UniIconToken;Lru/ozon/uni/core/models/UniIconToken;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LB0/N0;LB0/M0;LQ1/X;Lt0/q;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;III)V", "DsInputBaseImpl", "readOnly", "enabled", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "labelColor", "placeholderColor", "valueColor", "cursorColor", "backgroundColor", "LK1/T;", "labelTextStyle", "valueTextStyle", "textFieldModifier", "labelModifier", "placeholderModifier", "Lu0/x;", "contentPadding", "InputBody-hYDyX_4", "(Landroidx/compose/ui/e;LQ1/K;Ljava/lang/String;Lru/ozon/uni/android/ds/compose/component/input/DsInputLabelPosition;Ljava/lang/String;ZZZLQ1/X;Lt0/q;LB0/N0;LB0/M0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;JJJJJLK1/T;LK1/T;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Lu0/x;LS0/k;III)V", "InputBody", "Lu0/C;", "onCopyClick", "Lru/ozon/uni/android/ds/compose/component/input/DsInputBaseLocator;", "locators", "getFinalEndContent", "(Lu0/C;Ljava/lang/String;Lru/ozon/uni/android/ds/compose/component/input/DsInputState;Lru/ozon/uni/android/ds/compose/component/input/DsInputStatus;ZZZZLru/ozon/uni/core/models/UniIconToken;Lkotlin/jvm/functions/Function0;Lru/ozon/uni/core/models/UniIconToken;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lru/ozon/uni/android/ds/compose/component/input/DsInputBaseLocator;LS0/k;II)Lkotlin/jvm/functions/Function2;", "iconToken", "locatorModifier", "color", "onClick", "isFirst", "IconSlot-fWhpE4E", "(Lu0/C;Lru/ozon/uni/core/models/UniIconToken;Landroidx/compose/ui/e;JLkotlin/jvm/functions/Function0;ZLS0/k;II)V", "IconSlot", "isFocused", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsInputBaseImplKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DsInputStatus.values().length];
            try {
                iArr[DsInputStatus.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DsInputStatus.READ_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DsInputStatus.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DsInputStatus.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x0529, code lost:
    
        if ((r55.f().length() > 0) != false) goto L312;
     */
    /* JADX WARN: Removed duplicated region for block: B:262:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0593  */
    /* renamed from: DsInputBaseImpl-oiW5flc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1736DsInputBaseImploiW5flc(@NotNull e modifier, @NotNull K value, @NotNull Function1<? super K, Unit> onValueChange, @NotNull DsInputSize size, @NotNull DsInputType type, @NotNull DsInputTheme theme, @NotNull DsInputState state, boolean z11, @NotNull DsInputStatus status, String str, String str2, @NotNull DsInputLabelPosition labelPosition, String str3, C7807Z c7807z, boolean z12, boolean z13, boolean z14, UniIconToken uniIconToken, UniIconToken uniIconToken2, @NotNull Function0<Unit> onFirstIconClick, @NotNull Function0<Unit> onSecondIconClick, @NotNull N0 keyboardOptions, @NotNull M0 keyboardActions, @NotNull X visualTransformation, @NotNull q interactionSource, @NotNull Function0<Unit> onClearClick, @NotNull Function1<? super DsInputStatus, Unit> onStatusChanged, @NotNull Function1<? super Boolean, Unit> onFocusChanged, @NotNull Function1<? super String, Unit> copyTextAction, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        q qVar;
        r rVar;
        DsInputState dsInputState;
        DsInputState dsInputState2;
        DsInputState dsInputState3;
        r rVar2;
        long j11;
        long o11;
        long graphicNeutral;
        float f7;
        long textSecondary;
        long j12;
        long j13;
        T compactControl400Small;
        int I11;
        T t2;
        Function0<Unit> function0;
        Function1<? super String, Unit> function1;
        C3969l c3969l;
        long j14;
        boolean z15;
        char c11;
        T t11;
        int I12;
        int I13;
        boolean z16;
        Object C11;
        boolean z17;
        Object C12;
        Function2<InterfaceC3967k, Integer, Unit> finalEndContent;
        DsInputType dsInputType;
        e.a aVar;
        C3969l c3969l2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(labelPosition, "labelPosition");
        Intrinsics.checkNotNullParameter(onFirstIconClick, "onFirstIconClick");
        Intrinsics.checkNotNullParameter(onSecondIconClick, "onSecondIconClick");
        Intrinsics.checkNotNullParameter(keyboardOptions, "keyboardOptions");
        Intrinsics.checkNotNullParameter(keyboardActions, "keyboardActions");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClearClick, "onClearClick");
        Intrinsics.checkNotNullParameter(onStatusChanged, "onStatusChanged");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        Intrinsics.checkNotNullParameter(copyTextAction, "copyTextAction");
        C3969l u11 = interfaceC3967k.u(-1961827562);
        if ((i11 & 6) == 0) {
            i14 = i11 | (u11.n(modifier) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= u11.n(value) ? 32 : 16;
        }
        int i17 = i11 & 384;
        int i18 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i17 == 0) {
            i14 |= u11.F(onValueChange) ? 256 : 128;
        }
        int i19 = i11 & 3072;
        int i21 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i19 == 0) {
            i14 |= u11.n(size) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i14 |= (32768 & i11) == 0 ? u11.n(type) : u11.F(type) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i14 |= u11.n(theme) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i14 |= u11.n(state) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i14 |= u11.p(z11) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i14 |= u11.n(status) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i14 |= u11.n(str) ? 536870912 : 268435456;
        }
        int i22 = i14;
        if ((i12 & 6) == 0) {
            i15 = i12 | (u11.n(str2) ? 4 : 2);
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= u11.n(labelPosition) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i15 |= u11.n(str3) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i15 |= u11.n(c7807z) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i15 |= u11.p(z12) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i15 |= u11.p(z13) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i15 |= u11.p(z14) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i15 |= (i12 & 16777216) == 0 ? u11.n(uniIconToken) : u11.F(uniIconToken) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i15 |= (i12 & 134217728) == 0 ? u11.n(uniIconToken2) : u11.F(uniIconToken2) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i15 |= u11.F(onFirstIconClick) ? 536870912 : 268435456;
        }
        int i23 = i15;
        if ((i13 & 6) == 0) {
            i16 = i13 | (u11.F(onSecondIconClick) ? 4 : 2);
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= u11.n(keyboardOptions) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if (u11.n(keyboardActions)) {
                i18 = 256;
            }
            i16 |= i18;
        }
        if ((i13 & 3072) == 0) {
            if (u11.n(visualTransformation)) {
                i21 = 2048;
            }
            i16 |= i21;
        }
        if ((i13 & 24576) == 0) {
            qVar = interactionSource;
            i16 |= u11.n(qVar) ? 16384 : 8192;
        } else {
            qVar = interactionSource;
        }
        if ((i13 & 196608) == 0) {
            i16 |= u11.F(onClearClick) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i16 |= u11.F(onStatusChanged) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i16 |= u11.F(onFocusChanged) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i16 |= u11.F(copyTextAction) ? 67108864 : 33554432;
        }
        int i24 = i16;
        if ((i22 & 306783379) == 306783378 && (i23 & 306783379) == 306783378 && (i24 & 38347923) == 38347922 && u11.b()) {
            u11.j();
            dsInputType = type;
            c3969l2 = u11;
        } else {
            u11.o(69476751);
            Object C13 = u11.C();
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = new r();
                u11.x(C13);
            }
            r rVar3 = (r) C13;
            u11.k();
            InterfaceC3978p0 a11 = i.a(qVar, u11, (i24 >> 12) & 14);
            if (state.isDisabled$uni_release()) {
                dsInputState2 = DsInputState.DISABLED;
                rVar = rVar3;
            } else {
                if (state.isActive$uni_release() || DsInputBaseImpl_oiW5flc$lambda$1(a11)) {
                    rVar = rVar3;
                    if (status != DsInputStatus.READ_ONLY) {
                        dsInputState = DsInputState.ACTIVE;
                        dsInputState2 = dsInputState;
                    }
                } else {
                    rVar = rVar3;
                }
                dsInputState = DsInputState.DEFAULT;
                dsInputState2 = dsInputState;
            }
            u11.o(69490557);
            boolean n11 = ((i22 & 3670016) == 1048576) | ((i24 & 3670016) == 1048576) | u11.n(a11);
            Object C14 = u11.C();
            if (n11 || C14 == InterfaceC3967k.a.a()) {
                r rVar4 = rVar;
                dsInputState3 = state;
                DsInputBaseImplKt$DsInputBaseImpl$1$1 dsInputBaseImplKt$DsInputBaseImpl$1$1 = new DsInputBaseImplKt$DsInputBaseImpl$1$1(dsInputState3, onStatusChanged, rVar4, a11, null);
                rVar2 = rVar4;
                u11.x(dsInputBaseImplKt$DsInputBaseImpl$1$1);
                C14 = dsInputBaseImplKt$DsInputBaseImpl$1$1;
            } else {
                dsInputState3 = state;
                rVar2 = rVar;
            }
            u11.k();
            Q.e(u11, dsInputState3, (Function2) C14);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i25 = UniTheme.$stable;
            long bgActionPrimary = uniTheme.getColors(u11, i25).getBgActionPrimary();
            DsInputTheme dsInputTheme = DsInputTheme.SOLID;
            if (theme == dsInputTheme) {
                u11.o(-2140418779);
                o11 = uniTheme.getColors(u11, i25).getLayerFloor1();
                u11.k();
                j11 = bgActionPrimary;
            } else {
                u11.o(-2140368652);
                j11 = bgActionPrimary;
                o11 = C7807Z.o(0.04f, uniTheme.getColors(u11, i25).getBgSecondary());
                u11.k();
            }
            long j15 = o11;
            if (dsInputState2.isActive$uni_release()) {
                u11.o(-2140227044);
                graphicNeutral = uniTheme.getColors(u11, i25).getGraphicActionPrimary();
                u11.k();
            } else {
                u11.o(-2140157790);
                int i26 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
                if (i26 == 1 || i26 == 2) {
                    u11.o(-2140054374);
                    graphicNeutral = theme == dsInputTheme ? uniTheme.getColors(u11, i25).getGraphicNeutral() : C7807Z.f72259m;
                    u11.k();
                } else if (i26 == 3) {
                    u11.o(69519752);
                    graphicNeutral = uniTheme.getColors(u11, i25).getGraphicPositivePrimary();
                    u11.k();
                } else {
                    if (i26 != 4) {
                        u11.o(69510288);
                        u11.k();
                        throw new o();
                    }
                    u11.o(69522120);
                    graphicNeutral = uniTheme.getColors(u11, i25).getGraphicNegativePrimary();
                    u11.k();
                }
                u11.k();
            }
            long j16 = graphicNeutral;
            long textPrimary = uniTheme.getColors(u11, i25).getTextPrimary();
            if (dsInputState2.isDisabled$uni_release()) {
                textPrimary = C7807Z.o(C7807Z.q(textPrimary) * 0.4f, textPrimary);
            }
            DsInputLabelPosition dsInputLabelPosition = DsInputLabelPosition.INSIDE_TOP;
            if (labelPosition == dsInputLabelPosition) {
                f7 = 0.4f;
                u11.o(-2139518012);
                textSecondary = uniTheme.getColors(u11, i25).getTextTertiary();
                u11.k();
            } else {
                f7 = 0.4f;
                u11.o(-2139468381);
                textSecondary = uniTheme.getColors(u11, i25).getTextSecondary();
                u11.k();
            }
            long j17 = textSecondary;
            if (!dsInputState2.isDisabled$uni_release() || labelPosition == DsInputLabelPosition.OUTSIDE) {
                j12 = textPrimary;
                j13 = j17;
            } else {
                j12 = textPrimary;
                j13 = C7807Z.o(C7807Z.q(j17) * f7, j17);
            }
            long textTertiary = uniTheme.getColors(u11, i25).getTextTertiary();
            u11.o(69542815);
            long textSecondary2 = c7807z == null ? uniTheme.getColors(u11, i25).getTextSecondary() : c7807z.w();
            u11.k();
            T compact500Medium = uniTheme.getTypography().getCompact500Medium();
            if (labelPosition == dsInputLabelPosition) {
                if (!dsInputState2.isActive$uni_release()) {
                }
                compactControl400Small = uniTheme.getTypography().getBody300XSmall();
                T body300XSmall = uniTheme.getTypography().getBody300XSmall();
                DsInputBaseLocator dsInputBaseLocator = new DsInputBaseLocator(null, null, 3, null);
                e disabledHorizontalPointerInputScroll = TextFieldScrollExtKt.disabledHorizontalPointerInputScroll(modifier, !dsInputState2.isActive$uni_release());
                C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f11 = c.f(u11, disabledHorizontalPointerInputScroll);
                t2 = compactControl400Small;
                Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a13);
                }
                Function2 g10 = b.g(u11, a12, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, g10);
                }
                U7.i.b(u11, f11, -1630186223);
                if ((str2 != null || str2.length() == 0) && labelPosition == DsInputLabelPosition.OUTSIDE) {
                    e testTag = AtomLocatorKt.testTag(e.f40358c0, dsInputBaseLocator.getLabel().invoke());
                    DsSpacings dsSpacings = DsSpacings.INSTANCE;
                    long j18 = j13;
                    function1 = copyTextAction;
                    c11 = 3;
                    function0 = onClearClick;
                    SingleLineTextKt.m1704SingleLineTextsW7UJKQ(str2, j18, t2, androidx.compose.foundation.layout.T.j(testTag, dsSpacings.m1845getDp16D9Ej5fM(), 0.0f, 0.0f, dsSpacings.m1854getDp4D9Ej5fM(), 6), u11, i23 & 14, 0);
                    j14 = j18;
                    c3969l = u11;
                    z15 = true;
                    t11 = t2;
                } else {
                    function0 = onClearClick;
                    function1 = copyTextAction;
                    c3969l = u11;
                    j14 = j13;
                    z15 = true;
                    c11 = 3;
                    t11 = t2;
                }
                c3969l.k();
                e.a aVar2 = e.f40358c0;
                V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
                I12 = c3969l.I();
                A0 d12 = c3969l.d();
                e f13 = c.f(c3969l, aVar2);
                Function0 a14 = InterfaceC2801g.a.a();
                c3969l.i();
                if (c3969l.t()) {
                    c3969l.e();
                } else {
                    c3969l.H(a14);
                }
                Function2 f14 = E.f(c3969l, f12, c3969l, d12);
                if (!c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I12))) {
                    a.d(I12, c3969l, I12, f14);
                }
                F1.b(c3969l, f13, InterfaceC2801g.a.f());
                C5187j c5187j = C5187j.f39515a;
                e c12 = C8385f.c(dsInputState2.getBorderWidth(), j16, androidx.compose.foundation.e.b(a0.i(a0.e(aVar2, 1.0f), size.getMinHeight()), j15, m1741inputShape8Feqmps(size.getCornerRadius(), c3969l, 0)), m1741inputShape8Feqmps(size.getCornerRadius(), c3969l, 0));
                Y b11 = androidx.compose.foundation.layout.X.b(C5179b.f(), InterfaceC6250b.a.l(), c3969l, 0);
                I13 = c3969l.I();
                A0 d13 = c3969l.d();
                e f15 = c.f(c3969l, c12);
                Function0 a15 = InterfaceC2801g.a.a();
                c3969l.i();
                if (c3969l.t()) {
                    c3969l.e();
                } else {
                    c3969l.H(a15);
                }
                Function2 h11 = Cm.e.h(c3969l, b11, c3969l, d13);
                if (!c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I13))) {
                    a.d(I13, c3969l, I13, h11);
                }
                F1.b(c3969l, f15, InterfaceC2801g.a.f());
                C9891D c9891d = C9891D.f99599a;
                String f16 = value.f();
                c3969l.o(287502405);
                z16 = ((i22 & 896) != 256 ? z15 : false) | ((i24 & 458752) != 131072 ? z15 : false);
                C11 = c3969l.C();
                if (!z16 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new DsInputBaseImplKt$DsInputBaseImpl$2$1$1$finalEndContent$1$1(onValueChange, function0);
                    c3969l.x(C11);
                }
                Function0 function02 = (Function0) C11;
                c3969l.k();
                c3969l.o(287507245);
                boolean z18 = (i24 & 234881024) != 67108864 ? z15 : false;
                if ((i22 & 112) != 32) {
                    z15 = false;
                }
                z17 = z18 | z15;
                C12 = c3969l.C();
                if (!z17 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new DsInputBaseImplKt$DsInputBaseImpl$2$1$1$finalEndContent$2$1(function1, value);
                    c3969l.x(C12);
                }
                Function0 function03 = (Function0) C12;
                c3969l.k();
                int i27 = ((i22 >> 9) & 57344) | 6 | ((i22 >> 15) & 7168) | (i23 & 458752) | ((i23 << 6) & 3670016);
                int i28 = i23 << 3;
                int i29 = UniIconToken.$stable;
                C3969l c3969l3 = c3969l;
                DsInputState dsInputState4 = dsInputState2;
                long j19 = j11;
                finalEndContent = getFinalEndContent(c9891d, f16, dsInputState4, status, z11, z13, z12, z14, uniIconToken, onFirstIconClick, uniIconToken2, onSecondIconClick, function02, function03, dsInputBaseLocator, c3969l3, i27 | (29360128 & i28) | (i29 << 24) | (i28 & 234881024) | (i23 & 1879048192), ((i23 >> 24) & 14) | i29 | ((i24 << 3) & 112));
                C3996z.a(k1.b().c(new j1(j19, C7807Z.o(f7, j19))), a1.c.c(-519219530, new DsInputBaseImplKt$DsInputBaseImpl$2$1$1$1(c9891d, size, rVar2, value, labelPosition, state, str2, str, status, dsInputState4, visualTransformation, interactionSource, keyboardOptions, keyboardActions, onValueChange, onFocusChanged, j14, textTertiary, j12, j19, j15, t11, compact500Medium, dsInputBaseLocator, finalEndContent), c3969l3), c3969l3, 56);
                c3969l3.o(287594679);
                if (finalEndContent != null) {
                    finalEndContent.invoke(c3969l3, 0);
                    Unit unit = Unit.f71690a;
                }
                c3969l3.k();
                c3969l3.f();
                c3969l3.o(-956705592);
                dsInputType = type;
                if (dsInputType instanceof DsInputType.Button) {
                    aVar = aVar2;
                } else {
                    aVar = aVar2;
                    C5185h.a(androidx.compose.foundation.i.b(c5187j.b(aVar), EmptyInteractionSource.INSTANCE, null, false, null, null, ((DsInputType.Button) dsInputType).getOnInputClick(), 28), c3969l3, 0);
                }
                c3969l3.k();
                c3969l3.f();
                c3969l3.o(-1630029084);
                if (str3 != null) {
                    c3969l2 = c3969l3;
                } else {
                    e testTag2 = AtomLocatorKt.testTag(aVar, dsInputBaseLocator.getCaption().invoke());
                    DsSpacings dsSpacings2 = DsSpacings.INSTANCE;
                    c3969l2 = c3969l3;
                    p2.b(str3, androidx.compose.foundation.layout.T.j(testTag2, dsSpacings2.m1845getDp16D9Ej5fM(), dsSpacings2.m1854getDp4D9Ej5fM(), 0.0f, 0.0f, 12), textSecondary2, 0L, 0L, null, 0L, 2, false, 3, 0, body300XSmall, c3969l2, 0, 3120, 55288);
                    Unit unit2 = Unit.f71690a;
                }
                c3969l2.k();
                c3969l2.f();
            }
            compactControl400Small = labelPosition == DsInputLabelPosition.OUTSIDE ? uniTheme.getTypography().getCompactControl400Small() : uniTheme.getTypography().getCompact500Medium();
            T body300XSmall2 = uniTheme.getTypography().getBody300XSmall();
            DsInputBaseLocator dsInputBaseLocator2 = new DsInputBaseLocator(null, null, 3, null);
            e disabledHorizontalPointerInputScroll2 = TextFieldScrollExtKt.disabledHorizontalPointerInputScroll(modifier, !dsInputState2.isActive$uni_release());
            C5194q a122 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f112 = c.f(u11, disabledHorizontalPointerInputScroll2);
            t2 = compactControl400Small;
            Function0 a132 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 g102 = b.g(u11, a122, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, g102);
            U7.i.b(u11, f112, -1630186223);
            if (str2 != null || str2.length() == 0) {
            }
            function0 = onClearClick;
            function1 = copyTextAction;
            c3969l = u11;
            j14 = j13;
            z15 = true;
            c11 = 3;
            t11 = t2;
            c3969l.k();
            e.a aVar22 = e.f40358c0;
            V f122 = C5185h.f(InterfaceC6250b.a.o(), false);
            I12 = c3969l.I();
            A0 d122 = c3969l.d();
            e f132 = c.f(c3969l, aVar22);
            Function0 a142 = InterfaceC2801g.a.a();
            c3969l.i();
            if (c3969l.t()) {
            }
            Function2 f142 = E.f(c3969l, f122, c3969l, d122);
            if (!c3969l.t()) {
            }
            a.d(I12, c3969l, I12, f142);
            F1.b(c3969l, f132, InterfaceC2801g.a.f());
            C5187j c5187j2 = C5187j.f39515a;
            e c122 = C8385f.c(dsInputState2.getBorderWidth(), j16, androidx.compose.foundation.e.b(a0.i(a0.e(aVar22, 1.0f), size.getMinHeight()), j15, m1741inputShape8Feqmps(size.getCornerRadius(), c3969l, 0)), m1741inputShape8Feqmps(size.getCornerRadius(), c3969l, 0));
            Y b112 = androidx.compose.foundation.layout.X.b(C5179b.f(), InterfaceC6250b.a.l(), c3969l, 0);
            I13 = c3969l.I();
            A0 d132 = c3969l.d();
            e f152 = c.f(c3969l, c122);
            Function0 a152 = InterfaceC2801g.a.a();
            c3969l.i();
            if (c3969l.t()) {
            }
            Function2 h112 = Cm.e.h(c3969l, b112, c3969l, d132);
            if (!c3969l.t()) {
            }
            a.d(I13, c3969l, I13, h112);
            F1.b(c3969l, f152, InterfaceC2801g.a.f());
            C9891D c9891d2 = C9891D.f99599a;
            String f162 = value.f();
            c3969l.o(287502405);
            z16 = ((i22 & 896) != 256 ? z15 : false) | ((i24 & 458752) != 131072 ? z15 : false);
            C11 = c3969l.C();
            if (!z16) {
            }
            C11 = new DsInputBaseImplKt$DsInputBaseImpl$2$1$1$finalEndContent$1$1(onValueChange, function0);
            c3969l.x(C11);
            Function0 function022 = (Function0) C11;
            c3969l.k();
            c3969l.o(287507245);
            if ((i24 & 234881024) != 67108864) {
            }
            if ((i22 & 112) != 32) {
            }
            z17 = z18 | z15;
            C12 = c3969l.C();
            if (!z17) {
            }
            C12 = new DsInputBaseImplKt$DsInputBaseImpl$2$1$1$finalEndContent$2$1(function1, value);
            c3969l.x(C12);
            Function0 function032 = (Function0) C12;
            c3969l.k();
            int i272 = ((i22 >> 9) & 57344) | 6 | ((i22 >> 15) & 7168) | (i23 & 458752) | ((i23 << 6) & 3670016);
            int i282 = i23 << 3;
            int i292 = UniIconToken.$stable;
            C3969l c3969l32 = c3969l;
            DsInputState dsInputState42 = dsInputState2;
            long j192 = j11;
            finalEndContent = getFinalEndContent(c9891d2, f162, dsInputState42, status, z11, z13, z12, z14, uniIconToken, onFirstIconClick, uniIconToken2, onSecondIconClick, function022, function032, dsInputBaseLocator2, c3969l32, i272 | (29360128 & i282) | (i292 << 24) | (i282 & 234881024) | (i23 & 1879048192), ((i23 >> 24) & 14) | i292 | ((i24 << 3) & 112));
            C3996z.a(k1.b().c(new j1(j192, C7807Z.o(f7, j192))), a1.c.c(-519219530, new DsInputBaseImplKt$DsInputBaseImpl$2$1$1$1(c9891d2, size, rVar2, value, labelPosition, state, str2, str, status, dsInputState42, visualTransformation, interactionSource, keyboardOptions, keyboardActions, onValueChange, onFocusChanged, j14, textTertiary, j12, j192, j15, t11, compact500Medium, dsInputBaseLocator2, finalEndContent), c3969l32), c3969l32, 56);
            c3969l32.o(287594679);
            if (finalEndContent != null) {
            }
            c3969l32.k();
            c3969l32.f();
            c3969l32.o(-956705592);
            dsInputType = type;
            if (dsInputType instanceof DsInputType.Button) {
            }
            c3969l32.k();
            c3969l32.f();
            c3969l32.o(-1630029084);
            if (str3 != null) {
            }
            c3969l2.k();
            c3969l2.f();
        }
        J0 m02 = c3969l2.m0();
        if (m02 != null) {
            m02.G(new DsInputBaseImplKt$DsInputBaseImpl$3(modifier, value, onValueChange, size, dsInputType, theme, state, z11, status, str, str2, labelPosition, str3, c7807z, z12, z13, z14, uniIconToken, uniIconToken2, onFirstIconClick, onSecondIconClick, keyboardOptions, keyboardActions, visualTransformation, interactionSource, onClearClick, onStatusChanged, onFocusChanged, copyTextAction, i11, i12, i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DsInputBaseImpl_oiW5flc$lambda$1(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0087  */
    /* renamed from: IconSlot-fWhpE4E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1737IconSlotfWhpE4E(InterfaceC9890C interfaceC9890C, UniIconToken uniIconToken, e eVar, long j11, Function0<Unit> function0, boolean z11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        long j12;
        int i14;
        Function0<Unit> function02;
        int i15;
        boolean z12;
        e eVar3;
        long j13;
        Function0<Unit> function03;
        Function0<Unit> function04;
        int i16;
        boolean z13;
        Object C11;
        int I11;
        boolean z14;
        Function0<Unit> function05;
        J0 m02;
        int i17;
        C3969l u11 = interfaceC3967k.u(385923659);
        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(interfaceC9890C) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 1) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? u11.n(uniIconToken) : u11.F(uniIconToken) ? 32 : 16;
        }
        int i18 = i12 & 2;
        if (i18 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i11 & 3072) != 0) {
                if ((i12 & 4) == 0) {
                    j12 = j11;
                    if (u11.s(j12)) {
                        i17 = 2048;
                        i13 |= i17;
                    }
                } else {
                    j12 = j11;
                }
                i17 = UserVerificationMethods.USER_VERIFY_ALL;
                i13 |= i17;
            } else {
                j12 = j11;
            }
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                function02 = function0;
                i13 |= u11.F(function02) ? 16384 : 8192;
                i15 = i12 & 16;
                if (i15 != 0) {
                    i13 |= 196608;
                } else if ((196608 & i11) == 0) {
                    z12 = z11;
                    i13 |= u11.p(z12) ? 131072 : 65536;
                    if ((74899 & i13) == 74898 || !u11.b()) {
                        u11.Q0();
                        if ((i11 & 1) != 0 || u11.w0()) {
                            eVar3 = i18 == 0 ? e.f40358c0 : eVar2;
                            if ((i12 & 4) == 0) {
                                j13 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicTertiary();
                                i13 &= -7169;
                            } else {
                                j13 = j12;
                            }
                            if (i14 == 0) {
                                u11.o(-140189933);
                                Object C12 = u11.C();
                                if (C12 == InterfaceC3967k.a.a()) {
                                    C12 = DsInputBaseImplKt$IconSlot$1$1.INSTANCE;
                                    u11.x(C12);
                                }
                                function03 = (Function0) C12;
                                u11.k();
                            } else {
                                function03 = function02;
                            }
                            function04 = function03;
                            i16 = i13;
                            if (i15 != 0) {
                                z13 = false;
                                u11.j0();
                                float f7 = (float) (z13 ? 6.5d : 16.5d);
                                long j14 = uniIconToken.getIsMulticolor() ? C7807Z.f72259m : j13;
                                e b11 = interfaceC9890C.b(a0.r(a0.c(e.f40358c0), DsSpacings.INSTANCE.m1856getDp44D9Ej5fM()), InterfaceC6250b.a.i());
                                u11.o(-140176360);
                                C11 = u11.C();
                                if (C11 == InterfaceC3967k.a.a()) {
                                    C11 = p.a();
                                    u11.x(C11);
                                }
                                u11.k();
                                e b12 = androidx.compose.foundation.i.b(b11, (q) C11, null, false, null, null, function04, 28);
                                V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
                                I11 = u11.I();
                                A0 d11 = u11.d();
                                e f12 = c.f(u11, b12);
                                boolean z15 = z13;
                                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                                if (u11.t()) {
                                    u11.H(a11);
                                } else {
                                    u11.e();
                                }
                                Function2 f13 = E.f(u11, f11, u11, d11);
                                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                    a.d(I11, u11, I11, f13);
                                }
                                F1.b(u11, f12, InterfaceC2801g.a.f());
                                P0.E.a(TokensExtKt.getIcon(uniIconToken, u11, ((i16 >> 3) & 14) | UniIconToken.$stable), null, androidx.compose.foundation.layout.T.j(C5187j.f39515a.a(eVar3, InterfaceC6250b.a.f()), 0.0f, 0.0f, f7, 0.0f, 11), j14, u11, 48);
                                u11.f();
                                z14 = z15;
                                function05 = function04;
                            }
                        } else {
                            u11.j();
                            if ((i12 & 4) != 0) {
                                i13 &= -7169;
                            }
                            eVar3 = eVar2;
                            j13 = j12;
                            function04 = function02;
                            i16 = i13;
                        }
                        z13 = z12;
                        u11.j0();
                        float f72 = (float) (z13 ? 6.5d : 16.5d);
                        if (uniIconToken.getIsMulticolor()) {
                        }
                        e b112 = interfaceC9890C.b(a0.r(a0.c(e.f40358c0), DsSpacings.INSTANCE.m1856getDp44D9Ej5fM()), InterfaceC6250b.a.i());
                        u11.o(-140176360);
                        C11 = u11.C();
                        if (C11 == InterfaceC3967k.a.a()) {
                        }
                        u11.k();
                        e b122 = androidx.compose.foundation.i.b(b112, (q) C11, null, false, null, null, function04, 28);
                        V f112 = C5185h.f(InterfaceC6250b.a.o(), false);
                        I11 = u11.I();
                        A0 d112 = u11.d();
                        e f122 = c.f(u11, b122);
                        boolean z152 = z13;
                        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                        }
                        Function2 f132 = E.f(u11, f112, u11, d112);
                        if (!u11.t()) {
                        }
                        a.d(I11, u11, I11, f132);
                        F1.b(u11, f122, InterfaceC2801g.a.f());
                        P0.E.a(TokensExtKt.getIcon(uniIconToken, u11, ((i16 >> 3) & 14) | UniIconToken.$stable), null, androidx.compose.foundation.layout.T.j(C5187j.f39515a.a(eVar3, InterfaceC6250b.a.f()), 0.0f, 0.0f, f72, 0.0f, 11), j14, u11, 48);
                        u11.f();
                        z14 = z152;
                        function05 = function04;
                    } else {
                        u11.j();
                        eVar3 = eVar2;
                        j13 = j12;
                        function05 = function02;
                        z14 = z12;
                    }
                    m02 = u11.m0();
                    if (m02 == null) {
                        m02.G(new DsInputBaseImplKt$IconSlot$4(interfaceC9890C, uniIconToken, eVar3, j13, function05, z14, i11, i12));
                        return;
                    }
                    return;
                }
                z12 = z11;
                if ((74899 & i13) == 74898) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i18 == 0) {
                }
                if ((i12 & 4) == 0) {
                }
                if (i14 == 0) {
                }
                function04 = function03;
                i16 = i13;
                if (i15 != 0) {
                }
                z13 = z12;
                u11.j0();
                float f722 = (float) (z13 ? 6.5d : 16.5d);
                if (uniIconToken.getIsMulticolor()) {
                }
                e b1122 = interfaceC9890C.b(a0.r(a0.c(e.f40358c0), DsSpacings.INSTANCE.m1856getDp44D9Ej5fM()), InterfaceC6250b.a.i());
                u11.o(-140176360);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                }
                u11.k();
                e b1222 = androidx.compose.foundation.i.b(b1122, (q) C11, null, false, null, null, function04, 28);
                V f1122 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d1122 = u11.d();
                e f1222 = c.f(u11, b1222);
                boolean z1522 = z13;
                Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 f1322 = E.f(u11, f1122, u11, d1122);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, f1322);
                F1.b(u11, f1222, InterfaceC2801g.a.f());
                P0.E.a(TokensExtKt.getIcon(uniIconToken, u11, ((i16 >> 3) & 14) | UniIconToken.$stable), null, androidx.compose.foundation.layout.T.j(C5187j.f39515a.a(eVar3, InterfaceC6250b.a.f()), 0.0f, 0.0f, f722, 0.0f, 11), j14, u11, 48);
                u11.f();
                z14 = z1522;
                function05 = function04;
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            function02 = function0;
            i15 = i12 & 16;
            if (i15 != 0) {
            }
            z12 = z11;
            if ((74899 & i13) == 74898) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i18 == 0) {
            }
            if ((i12 & 4) == 0) {
            }
            if (i14 == 0) {
            }
            function04 = function03;
            i16 = i13;
            if (i15 != 0) {
            }
            z13 = z12;
            u11.j0();
            float f7222 = (float) (z13 ? 6.5d : 16.5d);
            if (uniIconToken.getIsMulticolor()) {
            }
            e b11222 = interfaceC9890C.b(a0.r(a0.c(e.f40358c0), DsSpacings.INSTANCE.m1856getDp44D9Ej5fM()), InterfaceC6250b.a.i());
            u11.o(-140176360);
            C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
            }
            u11.k();
            e b12222 = androidx.compose.foundation.i.b(b11222, (q) C11, null, false, null, null, function04, 28);
            V f11222 = C5185h.f(InterfaceC6250b.a.o(), false);
            I11 = u11.I();
            A0 d11222 = u11.d();
            e f12222 = c.f(u11, b12222);
            boolean z15222 = z13;
            Function0 a11222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f13222 = E.f(u11, f11222, u11, d11222);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f13222);
            F1.b(u11, f12222, InterfaceC2801g.a.f());
            P0.E.a(TokensExtKt.getIcon(uniIconToken, u11, ((i16 >> 3) & 14) | UniIconToken.$stable), null, androidx.compose.foundation.layout.T.j(C5187j.f39515a.a(eVar3, InterfaceC6250b.a.f()), 0.0f, 0.0f, f7222, 0.0f, 11), j14, u11, 48);
            u11.f();
            z14 = z15222;
            function05 = function04;
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        if ((i11 & 3072) != 0) {
        }
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        function02 = function0;
        i15 = i12 & 16;
        if (i15 != 0) {
        }
        z12 = z11;
        if ((74899 & i13) == 74898) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i18 == 0) {
        }
        if ((i12 & 4) == 0) {
        }
        if (i14 == 0) {
        }
        function04 = function03;
        i16 = i13;
        if (i15 != 0) {
        }
        z13 = z12;
        u11.j0();
        float f72222 = (float) (z13 ? 6.5d : 16.5d);
        if (uniIconToken.getIsMulticolor()) {
        }
        e b112222 = interfaceC9890C.b(a0.r(a0.c(e.f40358c0), DsSpacings.INSTANCE.m1856getDp44D9Ej5fM()), InterfaceC6250b.a.i());
        u11.o(-140176360);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        e b122222 = androidx.compose.foundation.i.b(b112222, (q) C11, null, false, null, null, function04, 28);
        V f112222 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d112222 = u11.d();
        e f122222 = c.f(u11, b122222);
        boolean z152222 = z13;
        Function0 a112222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f132222 = E.f(u11, f112222, u11, d112222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f132222);
        F1.b(u11, f122222, InterfaceC2801g.a.f());
        P0.E.a(TokensExtKt.getIcon(uniIconToken, u11, ((i16 >> 3) & 14) | UniIconToken.$stable), null, androidx.compose.foundation.layout.T.j(C5187j.f39515a.a(eVar3, InterfaceC6250b.a.f()), 0.0f, 0.0f, f72222, 0.0f, 11), j14, u11, 48);
        u11.f();
        z14 = z152222;
        function05 = function04;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InputBody-hYDyX_4, reason: not valid java name */
    public static final void m1738InputBodyhYDyX_4(e eVar, K k11, String str, DsInputLabelPosition dsInputLabelPosition, String str2, boolean z11, boolean z12, boolean z13, X x11, q qVar, N0 n02, M0 m02, Function1<? super K, Unit> function1, Function1<? super Boolean, Unit> function12, long j11, long j12, long j13, long j14, long j15, T t2, T t11, e eVar2, e eVar3, e eVar4, InterfaceC9914x interfaceC9914x, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        K k12;
        String str3;
        DsInputLabelPosition dsInputLabelPosition2;
        String str4;
        int i15;
        int i16;
        InterfaceC3978p0 interfaceC3978p0;
        T t12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-860674003);
        if ((i11 & 6) == 0) {
            i14 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            k12 = k11;
            i14 |= u11.n(k12) ? 32 : 16;
        } else {
            k12 = k11;
        }
        int i17 = i11 & 384;
        int i18 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i17 == 0) {
            str3 = str;
            i14 |= u11.n(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        int i19 = i11 & 3072;
        int i21 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i19 == 0) {
            dsInputLabelPosition2 = dsInputLabelPosition;
            i14 |= u11.n(dsInputLabelPosition2) ? 2048 : 1024;
        } else {
            dsInputLabelPosition2 = dsInputLabelPosition;
        }
        if ((i11 & 24576) == 0) {
            str4 = str2;
            i14 |= u11.n(str4) ? 16384 : 8192;
        } else {
            str4 = str2;
        }
        if ((i11 & 196608) == 0) {
            i14 |= u11.p(z11) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i14 |= u11.p(z12) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i14 |= u11.p(z13) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i14 |= u11.n(x11) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i14 |= u11.n(qVar) ? 536870912 : 268435456;
        }
        int i22 = i14;
        if ((i12 & 6) == 0) {
            i15 = i12 | (u11.n(n02) ? 4 : 2);
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= u11.n(m02) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i15 |= u11.F(function1) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i15 |= u11.F(function12) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i15 |= u11.s(j11) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i15 |= u11.s(j12) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i15 |= u11.s(j13) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i15 |= u11.s(j14) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i15 |= u11.s(j15) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i15 |= u11.n(t2) ? 536870912 : 268435456;
        }
        int i23 = i15;
        if ((i13 & 6) == 0) {
            i16 = i13 | (u11.n(t11) ? 4 : 2);
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= u11.n(eVar2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if (u11.n(eVar3)) {
                i18 = 256;
            }
            i16 |= i18;
        }
        if ((i13 & 3072) == 0) {
            if (u11.n(eVar4)) {
                i21 = 2048;
            }
            i16 |= i21;
        }
        if ((i13 & 24576) == 0) {
            i16 |= u11.n(interfaceC9914x) ? 16384 : 8192;
        }
        int i24 = i16;
        if ((i22 & 306783379) == 306783378 && (i23 & 306783379) == 306783378 && (i24 & 9363) == 9362 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            boolean z14 = z11 && z12;
            T c11 = T.c(t11, j13, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214);
            M a11 = N.a(u11);
            u11.o(1885142662);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(null, D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C11;
            u11.k();
            String f7 = k12.f();
            u11.o(1885163358);
            boolean n11 = ((234881024 & i23) == 67108864) | ((i22 & 112) == 32) | ((i22 & 29360128) == 8388608) | u11.n(a11) | u11.n(c11);
            Object C12 = u11.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new DsInputBaseImplKt$InputBody$decorationBox$1$1(interfaceC3978p02, k12, z13, a11, c11, j15);
                interfaceC3978p0 = interfaceC3978p02;
                t12 = c11;
                u11.x(C12);
            } else {
                t12 = c11;
                interfaceC3978p0 = interfaceC3978p02;
            }
            u11.k();
            int i25 = i22 >> 18;
            int i26 = i25 & 7168;
            int i27 = (i25 & 896) | ((i24 << 3) & 112) | i26 | ((i22 << 6) & 57344) | ((i23 << 3) & 458752) | ((i23 >> 9) & 3670016);
            int i28 = i22 << 12;
            InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, Unit>, InterfaceC3967k, Integer, Unit> m1747DecorationBoxyr6d_t4 = DecorationBoxKt.m1747DecorationBoxyr6d_t4(f7, t11, x11, qVar, str3, j11, t2, dsInputLabelPosition2, str4, j12, eVar3, eVar4, androidx.compose.ui.draw.c.d(eVar2, (Function1) C12), interfaceC9914x, u11, i27 | (i28 & 29360128) | (i28 & 234881024) | ((i23 << 12) & 1879048192), ((i24 >> 6) & 126) | ((i24 >> 3) & 7168));
            e e11 = a0.e(eVar, 1.0f);
            u11.o(1885183600);
            boolean p11 = ((i23 & 7168) == 2048) | u11.p(z14);
            Object C13 = u11.C();
            if (p11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new DsInputBaseImplKt$InputBody$1$1(function12, z14);
                u11.x(C13);
            }
            u11.k();
            e a12 = androidx.compose.ui.focus.a.a(e11, (Function1) C13);
            K0 k02 = new K0(j14);
            u11.o(1885189969);
            Object C14 = u11.C();
            if (C14 == InterfaceC3967k.a.a()) {
                C14 = new DsInputBaseImplKt$InputBody$2$1(interfaceC3978p0);
                u11.x(C14);
            }
            u11.k();
            int i29 = ((i22 >> 3) & 14) | 100663296 | ((i23 >> 3) & 112) | ((i22 >> 9) & 7168);
            int i31 = i23 << 18;
            c3969l = u11;
            C2475h.c(k11, function1, a12, z12, z14, t12, n02, m02, true, 0, 0, x11, (Function1) C14, qVar, k02, a1.c.c(451565866, new DsInputBaseImplKt$InputBody$3(m1747DecorationBoxyr6d_t4), u11), c3969l, i29 | (3670016 & i31) | (i31 & 29360128), ((i22 >> 21) & 112) | 196992 | i26, 1536);
        }
        J0 m03 = c3969l.m0();
        if (m03 != null) {
            m03.G(new DsInputBaseImplKt$InputBody$4(eVar, k11, str, dsInputLabelPosition, str2, z11, z12, z13, x11, qVar, n02, m02, function1, function12, j11, j12, j13, j14, j15, t2, t11, eVar2, eVar3, eVar4, interfaceC9914x, i11, i12, i13));
        }
    }

    private static final Function2<InterfaceC3967k, Integer, Unit> getFinalEndContent(InterfaceC9890C interfaceC9890C, String str, DsInputState dsInputState, DsInputStatus dsInputStatus, boolean z11, boolean z12, boolean z13, boolean z14, UniIconToken uniIconToken, Function0<Unit> function0, UniIconToken uniIconToken2, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, DsInputBaseLocator dsInputBaseLocator, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Function0<Unit> function05;
        C4912a c11;
        interfaceC3967k.o(-106550129);
        if (z11) {
            interfaceC3967k.o(-1613591320);
            c11 = a1.c.c(-324078902, new DsInputBaseImplKt$getFinalEndContent$1(dsInputBaseLocator), interfaceC3967k);
            interfaceC3967k.k();
        } else if (dsInputStatus == DsInputStatus.READ_ONLY) {
            interfaceC3967k.o(-1613030499);
            c11 = a1.c.c(-214397709, new DsInputBaseImplKt$getFinalEndContent$2(dsInputBaseLocator, interfaceC9890C, z14, function04), interfaceC3967k);
            interfaceC3967k.k();
        } else if (dsInputState.isActive$uni_release() && z13 && str.length() > 0) {
            interfaceC3967k.o(-1612324691);
            c11 = a1.c.c(2078258258, new DsInputBaseImplKt$getFinalEndContent$3(dsInputBaseLocator, interfaceC9890C, function03), interfaceC3967k);
            interfaceC3967k.k();
        } else if (dsInputStatus == DsInputStatus.ERROR && z12) {
            interfaceC3967k.o(-1611982730);
            c11 = a1.c.c(75946929, new DsInputBaseImplKt$getFinalEndContent$4(dsInputBaseLocator, interfaceC9890C), interfaceC3967k);
            interfaceC3967k.k();
        } else if (dsInputStatus == DsInputStatus.SUCCESS) {
            interfaceC3967k.o(-1611632523);
            c11 = a1.c.c(-1926364400, new DsInputBaseImplKt$getFinalEndContent$5(dsInputBaseLocator, interfaceC9890C), interfaceC3967k);
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(-1611277170);
            UniIconToken uniIconToken3 = uniIconToken == null ? uniIconToken2 != null ? uniIconToken2 : null : uniIconToken;
            UniIconToken uniIconToken4 = (uniIconToken != null || uniIconToken2 == null) ? uniIconToken2 : null;
            interfaceC3967k.o(-1160346179);
            if (uniIconToken != null) {
                function05 = function0;
            } else if (uniIconToken2 != null) {
                function05 = function02;
            } else {
                interfaceC3967k.o(-1160341158);
                Object C11 = interfaceC3967k.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = DsInputBaseImplKt$getFinalEndContent$actualOnFirstIconClick$1$1.INSTANCE;
                    interfaceC3967k.x(C11);
                }
                interfaceC3967k.k();
                function05 = (Function0) C11;
            }
            interfaceC3967k.k();
            c11 = uniIconToken3 != null ? a1.c.c(-559202194, new DsInputBaseImplKt$getFinalEndContent$6(uniIconToken4, dsInputBaseLocator, interfaceC9890C, uniIconToken3, function05, function02), interfaceC3967k) : null;
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        return c11;
    }

    /* renamed from: inputShape-8Feqmps, reason: not valid java name */
    private static final A0.g m1741inputShape8Feqmps(float f7, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(221251768);
        if (UniGlobalConfigKt.getRoundCornersFlag((Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d()))) {
            f7 = DsSpacings.INSTANCE.m1845getDp16D9Ej5fM();
        }
        A0.g b11 = h.b(f7);
        interfaceC3967k.k();
        return b11;
    }
}
