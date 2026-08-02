package ru.ozon.uni.foundation.components.input;

import A0.g;
import A0.h;
import B0.C2475h;
import B0.M0;
import B0.N0;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import I0.j1;
import I0.k1;
import J0.T0;
import J0.u3;
import K00.b;
import K1.M;
import K1.N;
import K1.T;
import Q1.K;
import Q1.X;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.C3991w0;
import S0.C3996z;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import T7.E;
import a1.C4912a;
import a1.c;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import i1.C6981a;
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
import q1.AbstractC8972b;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.foundation.components.inputCore.decorationBox.DecorationBoxKt;
import ru.ozon.uni.foundation.utils.EmptyInteractionSource;
import ru.ozon.uni.foundation.utils.InputKt;
import ru.ozon.uni.foundation.utils.SpacersKt;
import t0.i;
import t0.q;
import u0.C9891D;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aÅ\u0003\u0010B\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\"2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u00100\u001a\u00020-2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u00002\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\"2\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\r2\u0006\u0010?\u001a\u000201H\u0001¢\u0006\u0004\b@\u0010A\u001a\u008b\u0002\u0010H\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010C\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u0010E\u001a\u00020D2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\r2\u0006\u0010?\u001a\u000201H\u0003¢\u0006\u0004\bF\u0010G\"\u001a\u0010J\u001a\u00020I8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"+\u0010U\u001a\u00020\u00132\u0006\u0010N\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006X²\u0006\f\u0010V\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\f\u0010V\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\u000e\u0010W\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "LQ1/K;", "", "onValueChange", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "label", HammersV3BodyDTO.PLACEHOLDER, "caption", "", "captionLineLimit", "Lq1/b;", "leftContent", "systemContent", "Lkotlin/Function0;", "rightContent", "systemRightContent", "", "readOnly", "enabled", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "showSystemContent", "LB0/N0;", "keyboardOptions", "LB0/M0;", "keyboardActions", "LQ1/X;", "visualTransformation", "Lt0/q;", "interactionSource", "onInputClick", "onFocusChanged", "Ll1/Z;", "backgroundColor", "cursorColor", "valueColor", "labelColor", "placeholderColor", "lockColor", "captionColor", "borderColor", "activeBorderColor", "systemContentColor", "LK1/T;", "labelTextStyle", "valueTextStyle", "captionTextStyle", "LZ1/h;", "borderWidth", "Lj1/r;", "focusRequester", "systemContentModifier", "clearButton", "leftContentModifier", "leftContentIconTint", "captionModifier", "textFieldModifier", "labelModifier", "placeholderModifier", "lockIconModifier", "lockIcon", "labelTopPadding", "FoundationInput-Yx1C-VQ", "(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LQ1/K;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILq1/b;Lq1/b;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZZLB0/N0;LB0/M0;LQ1/X;Lt0/q;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;JJJJJJJJJJLK1/T;LK1/T;LK1/T;FLj1/r;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;JLandroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Lq1/b;FLS0/k;IIIII)V", "FoundationInput", "forceEnabled", "Lu0/x;", "contentPadding", "InputBody-Ghj78x8", "(Landroidx/compose/ui/e;LQ1/K;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Boolean;ZLQ1/X;Lt0/q;LB0/N0;LB0/M0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;JJJJJJLK1/T;LK1/T;Lu0/x;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Lq1/b;FLS0/k;III)V", "InputBody", "LA0/g;", "inputShape", "LA0/g;", "getInputShape", "()LA0/g;", "<set-?>", "CustomEllipsisDebug$delegate", "LS0/p0;", "getCustomEllipsisDebug", "()Z", "setCustomEllipsisDebug", "(Z)V", "CustomEllipsisDebug", "isFocused", "text", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FoundationInputKt {

    @NotNull
    private static final InterfaceC3978p0 CustomEllipsisDebug$delegate;

    @NotNull
    private static final g inputShape = h.b(12);

    static {
        C3991w0 f7;
        f7 = n1.f(Boolean.FALSE, D1.f25195a);
        CustomEllipsisDebug$delegate = f7;
    }

    /* JADX WARN: Removed duplicated region for block: B:353:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0615  */
    /* renamed from: FoundationInput-Yx1C-VQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3007FoundationInputYx1CVQ(@NotNull e modifier, @NotNull Function1<? super K, Unit> onValueChange, @NotNull K value, @NotNull String label, String str, String str2, int i11, AbstractC8972b abstractC8972b, AbstractC8972b abstractC8972b2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, boolean z11, boolean z12, boolean z13, boolean z14, @NotNull N0 keyboardOptions, @NotNull M0 keyboardActions, @NotNull X visualTransformation, @NotNull q interactionSource, Function0<Unit> function0, @NotNull Function1<? super Boolean, Unit> onFocusChanged, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, @NotNull T labelTextStyle, @NotNull T valueTextStyle, @NotNull T captionTextStyle, float f7, @NotNull r focusRequester, @NotNull e systemContentModifier, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> clearButton, @NotNull e leftContentModifier, long j22, @NotNull e captionModifier, @NotNull e textFieldModifier, @NotNull e labelModifier, @NotNull e placeholderModifier, @NotNull e lockIconModifier, @NotNull AbstractC8972b lockIcon, float f11, InterfaceC3967k interfaceC3967k, int i12, int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        long j23;
        float f12;
        int i23;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function23;
        e disabledHorizontalPointerInputScroll;
        int I11;
        int I12;
        char c11;
        C3969l c3969l;
        C3969l c3969l2;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function24;
        int I13;
        Function0<Unit> function02;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(keyboardOptions, "keyboardOptions");
        Intrinsics.checkNotNullParameter(keyboardActions, "keyboardActions");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        Intrinsics.checkNotNullParameter(labelTextStyle, "labelTextStyle");
        Intrinsics.checkNotNullParameter(valueTextStyle, "valueTextStyle");
        Intrinsics.checkNotNullParameter(captionTextStyle, "captionTextStyle");
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        Intrinsics.checkNotNullParameter(systemContentModifier, "systemContentModifier");
        Intrinsics.checkNotNullParameter(clearButton, "clearButton");
        Intrinsics.checkNotNullParameter(leftContentModifier, "leftContentModifier");
        Intrinsics.checkNotNullParameter(captionModifier, "captionModifier");
        Intrinsics.checkNotNullParameter(textFieldModifier, "textFieldModifier");
        Intrinsics.checkNotNullParameter(labelModifier, "labelModifier");
        Intrinsics.checkNotNullParameter(placeholderModifier, "placeholderModifier");
        Intrinsics.checkNotNullParameter(lockIconModifier, "lockIconModifier");
        Intrinsics.checkNotNullParameter(lockIcon, "lockIcon");
        C3969l u11 = interfaceC3967k.u(2028066838);
        if ((i12 & 6) == 0) {
            i17 = i12 | (u11.n(modifier) ? 4 : 2);
        } else {
            i17 = i12;
        }
        if ((i12 & 48) == 0) {
            i17 |= u11.F(onValueChange) ? 32 : 16;
        }
        int i24 = i12 & 384;
        int i25 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i24 == 0) {
            i17 |= u11.n(value) ? 256 : 128;
        }
        int i26 = i12 & 3072;
        int i27 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i26 == 0) {
            i17 |= u11.n(label) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i17 |= u11.n(str) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i17 |= u11.n(str2) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i17 |= u11.r(i11) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i17 |= u11.n(abstractC8972b) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i17 |= u11.n(abstractC8972b2) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i17 |= u11.F(function2) ? 536870912 : 268435456;
        }
        int i28 = i17;
        if ((i13 & 6) == 0) {
            i18 = i13 | (u11.F(function22) ? 4 : 2);
        } else {
            i18 = i13;
        }
        if ((i13 & 48) == 0) {
            i18 |= u11.p(z11) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i18 |= u11.p(z12) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i18 |= u11.p(z13) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i18 |= u11.p(z14) ? 16384 : 8192;
        }
        if ((i13 & 196608) == 0) {
            i18 |= u11.n(keyboardOptions) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i18 |= u11.n(keyboardActions) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i18 |= u11.n(visualTransformation) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i18 |= u11.n(interactionSource) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            i18 |= u11.F(function0) ? 536870912 : 268435456;
        }
        if ((i14 & 6) == 0) {
            i19 = i14 | (u11.F(onFocusChanged) ? 4 : 2);
        } else {
            i19 = i14;
        }
        if ((i14 & 48) == 0) {
            i19 |= u11.s(j11) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i19 |= u11.s(j12) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i19 |= u11.s(j13) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i19 |= u11.s(j14) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i19 |= u11.s(j15) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i19 |= u11.s(j16) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i19 |= u11.s(j17) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i19 |= u11.s(j18) ? 67108864 : 33554432;
        }
        if ((i14 & 805306368) == 0) {
            i19 |= u11.s(j19) ? 536870912 : 268435456;
        }
        int i29 = i19;
        if ((i15 & 6) == 0) {
            i21 = i15 | (u11.s(j21) ? 4 : 2);
        } else {
            i21 = i15;
        }
        if ((i15 & 48) == 0) {
            i21 |= u11.n(labelTextStyle) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i21 |= u11.n(valueTextStyle) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i21 |= u11.n(captionTextStyle) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i21 |= u11.q(f7) ? 16384 : 8192;
        }
        if ((i15 & 196608) == 0) {
            i21 |= u11.n(focusRequester) ? 131072 : 65536;
        }
        if ((i15 & 1572864) == 0) {
            i21 |= u11.n(systemContentModifier) ? 1048576 : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i21 |= u11.F(clearButton) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i21 |= u11.n(leftContentModifier) ? 67108864 : 33554432;
        }
        if ((i15 & 805306368) == 0) {
            i21 |= u11.s(j22) ? 536870912 : 268435456;
        }
        int i31 = i21;
        if ((i16 & 6) == 0) {
            i22 = i16 | (u11.n(captionModifier) ? 4 : 2);
        } else {
            i22 = i16;
        }
        if ((i16 & 48) == 0) {
            i22 |= u11.n(textFieldModifier) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            if (u11.n(labelModifier)) {
                i25 = 256;
            }
            i22 |= i25;
        }
        if ((i16 & 3072) == 0) {
            if (u11.n(placeholderModifier)) {
                i27 = 2048;
            }
            i22 |= i27;
        }
        if ((i16 & 24576) == 0) {
            i22 |= u11.n(lockIconModifier) ? 16384 : 8192;
        }
        if ((i16 & 196608) == 0) {
            i22 |= u11.n(lockIcon) ? 131072 : 65536;
        }
        if ((i16 & 1572864) == 0) {
            i22 |= u11.q(f11) ? 1048576 : 524288;
        }
        if ((i28 & 306783379) == 306783378 && (i18 & 306783379) == 306783378 && (i29 & 306783379) == 306783378 && (i31 & 306783379) == 306783378 && (i22 & 599187) == 599186 && u11.b()) {
            u11.j();
            c3969l2 = u11;
        } else {
            InterfaceC3978p0 a11 = i.a(interactionSource, u11, (i18 >> 24) & 14);
            Function2<? super InterfaceC3967k, ? super Integer, Unit> function25 = null;
            Boolean bool = function0 != null ? Boolean.FALSE : null;
            boolean z15 = value.f().length() > 0;
            int i32 = i31 >> 18;
            int i33 = i28 >> 21;
            u11.o(-520279427);
            u11.o(790201312);
            if (z14) {
                u11.o(-1582101208);
                if (z13) {
                    u11.o(-1953510380);
                    if (!z11 && z15) {
                        function25 = clearButton;
                    } else if (abstractC8972b2 != null) {
                        function25 = c.c(1906751198, new FoundationInputKt$getSystemContent$1$1(abstractC8972b2, j21, systemContentModifier), u11);
                    }
                    u11.k();
                } else if (z12) {
                    u11.o(-1952905849);
                    if (abstractC8972b2 == null) {
                        j23 = j11;
                        f12 = f7;
                        i23 = 24;
                    } else {
                        i23 = 24;
                        j23 = j11;
                        f12 = f7;
                        function25 = c.c(1700859033, new FoundationInputKt$getSystemContent$2$1(systemContentModifier, z11, abstractC8972b2, j21, focusRequester), u11);
                    }
                    u11.k();
                    u11.k();
                } else {
                    u11.o(-1953056975);
                    u11.k();
                }
                j23 = j11;
                f12 = f7;
                i23 = 24;
                u11.k();
            } else {
                j23 = j11;
                f12 = f7;
                i23 = 24;
            }
            u11.k();
            if (!z12) {
                u11.o(-1273050548);
                function25 = c.c(563453112, new FoundationInputKt$getTrailingIcon$1(function22), u11);
                u11.k();
            } else if (function2 == null && function22 == null) {
                u11.o(790244805);
                u11.k();
            } else {
                if (function25 == null && function22 == null) {
                    u11.o(790247615);
                    u11.k();
                    function23 = function2;
                } else if (function2 == null && function25 == null) {
                    u11.o(790250053);
                    u11.k();
                    function23 = function22;
                } else {
                    u11.o(-1272010157);
                    function25 = c.c(-99924095, new FoundationInputKt$getTrailingIcon$2(function25, function2, function22), u11);
                    u11.k();
                }
                u11.k();
                u11.o(-410091798);
                disabledHorizontalPointerInputScroll = InputKt.disabledHorizontalPointerInputScroll(modifier, !FoundationInput_Yx1C_VQ$lambda$8(a11));
                if (function0 != null && z12) {
                    e.a aVar = e.f40358c0;
                    u11.o(-410086447);
                    if (function0 != null) {
                        u11.o(115945792);
                        Object C11 = u11.C();
                        if (C11 == InterfaceC3967k.a.a()) {
                            C11 = FoundationInputKt$FoundationInput$4$1$1.INSTANCE;
                            u11.x(C11);
                        }
                        u11.k();
                        function02 = (Function0) C11;
                    } else {
                        function02 = function0;
                    }
                    u11.k();
                    disabledHorizontalPointerInputScroll = disabledHorizontalPointerInputScroll.l0(androidx.compose.foundation.i.b(aVar, EmptyInteractionSource.INSTANCE, null, false, null, null, function02, 28));
                }
                u11.k();
                C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f13 = androidx.compose.ui.c.f(u11, disabledHorizontalPointerInputScroll);
                Function0 a13 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a13);
                }
                Function2 g10 = b.g(u11, a12, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, g10);
                }
                F1.b(u11, f13, InterfaceC2801g.a.f());
                e.a aVar2 = e.f40358c0;
                e i34 = a0.i(a0.e(aVar2, 1.0f), 56);
                g gVar = inputShape;
                e c12 = C8385f.c(f12, !z13 ? j19 : j18, androidx.compose.foundation.e.b(i34, j23, gVar), gVar);
                Y b11 = androidx.compose.foundation.layout.X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
                I12 = u11.I();
                A0 d12 = u11.d();
                e f14 = androidx.compose.ui.c.f(u11, c12);
                Function0 a14 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a14);
                }
                Function2 h11 = Cm.e.h(u11, b11, u11, d12);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, h11);
                }
                F1.b(u11, f14, InterfaceC2801g.a.f());
                C9891D c9891d = C9891D.f99599a;
                u11.o(-1758208123);
                if (abstractC8972b != null) {
                    c3969l = u11;
                    c11 = 14;
                } else {
                    SpacersKt.m3044SpacerWidthziNgDLE(c9891d, 14, u11, 54);
                    c11 = 14;
                    T0.a(abstractC8972b, null, c9891d.b(a0.n(C6981a.a(leftContentModifier, !z12 ? 0.4f : 1.0f), i23), InterfaceC6250b.a.i()), j22, u11, (i33 & 14) | 48 | (i32 & 7168));
                    c3969l = u11;
                    SpacersKt.m3044SpacerWidthziNgDLE(c9891d, 4, c3969l, 54);
                    Unit unit = Unit.f71690a;
                }
                c3969l.k();
                c3969l2 = c3969l;
                function24 = function23;
                C3996z.a(k1.b().c(new j1(j12, C7807Z.o(0.4f, j12))), c.c(-2106221904, new FoundationInputKt$FoundationInput$5$1$2(c9891d, textFieldModifier, focusRequester, value, label, str, z11, z12, bool, z13, visualTransformation, interactionSource, keyboardOptions, keyboardActions, onValueChange, onFocusChanged, j14, j15, j16, j13, j12, j11, labelTextStyle, valueTextStyle, abstractC8972b, function23, function22, labelModifier, placeholderModifier, lockIconModifier, lockIcon, f11), c3969l2), c3969l2, 56);
                e b12 = c9891d.b(aVar2, InterfaceC6250b.a.i());
                V f15 = C5185h.f(InterfaceC6250b.a.o(), false);
                I13 = c3969l2.I();
                A0 d13 = c3969l2.d();
                e f16 = androidx.compose.ui.c.f(c3969l2, b12);
                Function0 a15 = InterfaceC2801g.a.a();
                c3969l2.i();
                if (c3969l2.t()) {
                    c3969l2.e();
                } else {
                    c3969l2.H(a15);
                }
                Function2 f17 = E.f(c3969l2, f15, c3969l2, d13);
                if (!c3969l2.t() || !Intrinsics.d(c3969l2.C(), Integer.valueOf(I13))) {
                    a.d(I13, c3969l2, I13, f17);
                }
                U7.i.b(c3969l2, f16, -1692071420);
                if (function24 != null) {
                    function24.invoke(c3969l2, 0);
                    Unit unit2 = Unit.f71690a;
                }
                c3969l2.k();
                c3969l2.f();
                c3969l2.f();
                c3969l2.o(116059690);
                if (str2 != null) {
                    float f18 = 4;
                    u3.b(str2, androidx.compose.foundation.layout.T.j(captionModifier, f18, f18, 0.0f, 0.0f, 12), j17, 0L, null, 0L, null, 0L, 2, false, i11, 0, null, captionTextStyle, c3969l2, ((i28 >> 15) & 14) | ((i29 >> 15) & 896), ((i28 >> 9) & 7168) | 48 | ((i31 << 9) & 3670016), 55288);
                    Unit unit3 = Unit.f71690a;
                }
                c3969l2.k();
                c3969l2.f();
            }
            function23 = function25;
            u11.k();
            u11.o(-410091798);
            disabledHorizontalPointerInputScroll = InputKt.disabledHorizontalPointerInputScroll(modifier, !FoundationInput_Yx1C_VQ$lambda$8(a11));
            if (function0 != null) {
                e.a aVar3 = e.f40358c0;
                u11.o(-410086447);
                if (function0 != null) {
                }
                u11.k();
                disabledHorizontalPointerInputScroll = disabledHorizontalPointerInputScroll.l0(androidx.compose.foundation.i.b(aVar3, EmptyInteractionSource.INSTANCE, null, false, null, null, function02, 28));
            }
            u11.k();
            C5194q a122 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f132 = androidx.compose.ui.c.f(u11, disabledHorizontalPointerInputScroll);
            Function0 a132 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 g102 = b.g(u11, a122, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, g102);
            F1.b(u11, f132, InterfaceC2801g.a.f());
            e.a aVar22 = e.f40358c0;
            e i342 = a0.i(a0.e(aVar22, 1.0f), 56);
            g gVar2 = inputShape;
            e c122 = C8385f.c(f12, !z13 ? j19 : j18, androidx.compose.foundation.e.b(i342, j23, gVar2), gVar2);
            Y b112 = androidx.compose.foundation.layout.X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            I12 = u11.I();
            A0 d122 = u11.d();
            e f142 = androidx.compose.ui.c.f(u11, c122);
            Function0 a142 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
            }
            Function2 h112 = Cm.e.h(u11, b112, u11, d122);
            if (!u11.t()) {
            }
            a.d(I12, u11, I12, h112);
            F1.b(u11, f142, InterfaceC2801g.a.f());
            C9891D c9891d2 = C9891D.f99599a;
            u11.o(-1758208123);
            if (abstractC8972b != null) {
            }
            c3969l.k();
            c3969l2 = c3969l;
            function24 = function23;
            C3996z.a(k1.b().c(new j1(j12, C7807Z.o(0.4f, j12))), c.c(-2106221904, new FoundationInputKt$FoundationInput$5$1$2(c9891d2, textFieldModifier, focusRequester, value, label, str, z11, z12, bool, z13, visualTransformation, interactionSource, keyboardOptions, keyboardActions, onValueChange, onFocusChanged, j14, j15, j16, j13, j12, j11, labelTextStyle, valueTextStyle, abstractC8972b, function23, function22, labelModifier, placeholderModifier, lockIconModifier, lockIcon, f11), c3969l2), c3969l2, 56);
            e b122 = c9891d2.b(aVar22, InterfaceC6250b.a.i());
            V f152 = C5185h.f(InterfaceC6250b.a.o(), false);
            I13 = c3969l2.I();
            A0 d132 = c3969l2.d();
            e f162 = androidx.compose.ui.c.f(c3969l2, b122);
            Function0 a152 = InterfaceC2801g.a.a();
            c3969l2.i();
            if (c3969l2.t()) {
            }
            Function2 f172 = E.f(c3969l2, f152, c3969l2, d132);
            if (!c3969l2.t()) {
            }
            a.d(I13, c3969l2, I13, f172);
            U7.i.b(c3969l2, f162, -1692071420);
            if (function24 != null) {
            }
            c3969l2.k();
            c3969l2.f();
            c3969l2.f();
            c3969l2.o(116059690);
            if (str2 != null) {
            }
            c3969l2.k();
            c3969l2.f();
        }
        J0 m02 = c3969l2.m0();
        if (m02 != null) {
            m02.G(new FoundationInputKt$FoundationInput$6(modifier, onValueChange, value, label, str, str2, i11, abstractC8972b, abstractC8972b2, function2, function22, z11, z12, z13, z14, keyboardOptions, keyboardActions, visualTransformation, interactionSource, function0, onFocusChanged, j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, labelTextStyle, valueTextStyle, captionTextStyle, f7, focusRequester, systemContentModifier, clearButton, leftContentModifier, j22, captionModifier, textFieldModifier, labelModifier, placeholderModifier, lockIconModifier, lockIcon, f11, i12, i13, i14, i15, i16));
        }
    }

    private static final boolean FoundationInput_Yx1C_VQ$lambda$8(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InputBody-Ghj78x8, reason: not valid java name */
    public static final void m3008InputBodyGhj78x8(e eVar, K k11, String str, String str2, boolean z11, boolean z12, Boolean bool, boolean z13, X x11, q qVar, N0 n02, M0 m02, Function1<? super K, Unit> function1, Function1<? super Boolean, Unit> function12, long j11, long j12, long j13, long j14, long j15, long j16, T t2, T t11, InterfaceC9914x interfaceC9914x, e eVar2, e eVar3, e eVar4, AbstractC8972b abstractC8972b, float f7, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        K k12;
        int i15;
        int i16;
        Object foundationInputKt$InputBody$decorationBox$1$1;
        C3969l c3969l;
        InterfaceC3978p0 interfaceC3978p0;
        T t12;
        e eVar5;
        C3969l c3969l2;
        C3969l u11 = interfaceC3967k.u(-1074847502);
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
            i14 |= u11.n(str) ? 256 : 128;
        }
        int i19 = i11 & 3072;
        int i21 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i19 == 0) {
            i14 |= u11.n(str2) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i14 |= u11.p(z11) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i14 |= u11.p(z12) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i14 |= u11.n(bool) ? 1048576 : 524288;
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
            i15 |= u11.s(j16) ? 536870912 : 268435456;
        }
        int i23 = i15;
        if ((i13 & 6) == 0) {
            i16 = i13 | (u11.n(t2) ? 4 : 2);
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= u11.n(t11) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if (u11.n(interfaceC9914x)) {
                i18 = 256;
            }
            i16 |= i18;
        }
        if ((i13 & 3072) == 0) {
            if (u11.n(eVar2)) {
                i21 = 2048;
            }
            i16 |= i21;
        }
        if ((i13 & 24576) == 0) {
            i16 |= u11.n(eVar3) ? 16384 : 8192;
        }
        if ((i13 & 196608) == 0) {
            i16 |= u11.n(eVar4) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i16 |= u11.n(abstractC8972b) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i16 |= u11.q(f7) ? 8388608 : 4194304;
        }
        if ((i22 & 306783379) == 306783378 && (306783379 & i23) == 306783378 && (4793491 & i16) == 4793490 && u11.b()) {
            u11.j();
            eVar5 = eVar;
            c3969l2 = u11;
        } else {
            boolean z14 = z11 && z12 && k12.f().length() > 0;
            T c11 = T.c(t11, j14, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214);
            M a11 = N.a(u11);
            u11.o(-66240888);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(null, D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C11;
            u11.k();
            String f11 = k12.f();
            e.a aVar = e.f40358c0;
            u11.o(-66214432);
            boolean n11 = ((1879048192 & i23) == 536870912) | ((i22 & 112) == 32) | ((i22 & 29360128) == 8388608) | u11.n(a11) | u11.n(c11);
            Object C12 = u11.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                c3969l = u11;
                interfaceC3978p0 = interfaceC3978p02;
                foundationInputKt$InputBody$decorationBox$1$1 = new FoundationInputKt$InputBody$decorationBox$1$1(interfaceC3978p0, k12, z13, a11, c11, j16);
                t12 = c11;
                c3969l.x(foundationInputKt$InputBody$decorationBox$1$1);
            } else {
                foundationInputKt$InputBody$decorationBox$1$1 = C12;
                c3969l = u11;
                interfaceC3978p0 = interfaceC3978p02;
                t12 = c11;
            }
            c3969l.k();
            e d11 = androidx.compose.ui.draw.c.d(aVar, (Function1) foundationInputKt$InputBody$decorationBox$1$1);
            int i24 = i16 << 3;
            int i25 = i22 >> 15;
            C3969l c3969l3 = c3969l;
            boolean z15 = z14;
            InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, Unit>, InterfaceC3967k, Integer, Unit> m3016DecorationBoxrw7q5tQ = DecorationBoxKt.m3016DecorationBoxrw7q5tQ(f11, z15, t11, x11, qVar, str, j11, j13, t2, str2, j12, 0, interfaceC9914x, eVar2, eVar3, eVar4, abstractC8972b, d11, f7, false, c3969l3, (i24 & 896) | (i25 & 7168) | (i25 & 57344) | ((i22 << 9) & 458752) | ((i23 << 6) & 3670016) | ((i23 << 3) & 29360128) | ((i16 << 24) & 234881024) | ((i22 << 18) & 1879048192), (i16 & 3670016) | ((i23 >> 15) & 14) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (i24 & 234881024), 526336);
            K k13 = z13 ? k11 : new K(k11.c(), 0L, 6);
            eVar5 = eVar;
            e e11 = a0.e(eVar5, 1.0f);
            c3969l3.o(-66192709);
            boolean z16 = (i23 & 7168) == 2048;
            Object C13 = c3969l3.C();
            if (z16 || C13 == InterfaceC3967k.a.a()) {
                C13 = new FoundationInputKt$InputBody$1$1(function12);
                c3969l3.x(C13);
            }
            c3969l3.k();
            e a12 = androidx.compose.ui.focus.a.a(e11, (Function1) C13);
            boolean booleanValue = bool != null ? bool.booleanValue() : z12;
            K0 k02 = new K0(j15);
            c3969l3.o(-66187053);
            Object C14 = c3969l3.C();
            if (C14 == InterfaceC3967k.a.a()) {
                C14 = new FoundationInputKt$InputBody$2$1(interfaceC3978p0);
                c3969l3.x(C14);
            }
            c3969l3.k();
            C4912a c12 = c.c(-1941120747, new FoundationInputKt$InputBody$3(m3016DecorationBoxrw7q5tQ), c3969l3);
            int i26 = ((i23 >> 3) & 112) | 100663296;
            int i27 = i23 << 18;
            c3969l2 = c3969l3;
            C2475h.c(k13, function1, a12, booleanValue, z15, t12, n02, m02, true, 0, 0, x11, (Function1) C14, qVar, k02, c12, c3969l2, i26 | (i27 & 3670016) | (i27 & 29360128), ((i22 >> 21) & 112) | 196992 | ((i22 >> 18) & 7168), 1536);
        }
        J0 m03 = c3969l2.m0();
        if (m03 != null) {
            m03.G(new FoundationInputKt$InputBody$4(eVar5, k11, str, str2, z11, z12, bool, z13, x11, qVar, n02, m02, function1, function12, j11, j12, j13, j14, j15, j16, t2, t11, interfaceC9914x, eVar2, eVar3, eVar4, abstractC8972b, f7, i11, i12, i13));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean getCustomEllipsisDebug() {
        return ((Boolean) CustomEllipsisDebug$delegate.getValue()).booleanValue();
    }
}
