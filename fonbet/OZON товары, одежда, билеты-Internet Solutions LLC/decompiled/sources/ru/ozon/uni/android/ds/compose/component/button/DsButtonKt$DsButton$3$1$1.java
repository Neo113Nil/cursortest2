package ru.ozon.uni.android.ds.compose.component.button;

import I1.D;
import I1.u;
import I1.z;
import Ij.C3261b;
import K1.C3422b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.ds.UniGlobalConfig;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LI1/D;", "", "invoke", "(LI1/D;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class DsButtonKt$DsButton$3$1$1 extends AbstractC7737t implements Function1<D, Unit> {
    final /* synthetic */ String $accessibilityContentDescription;
    final /* synthetic */ boolean $canShowSubtitle;
    final /* synthetic */ String $dataText;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsButtonKt$DsButton$3$1$1(String str, String str2, boolean z11, String str3, String str4) {
        super(1);
        this.$accessibilityContentDescription = str;
        this.$title = str2;
        this.$canShowSubtitle = z11;
        this.$dataText = str3;
        this.$subtitle = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(D d11) {
        invoke2(d11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(D clearAndSetSemantics) {
        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
        if (this.$accessibilityContentDescription != null && !UniGlobalConfig.INSTANCE.getTestTagsAsContentDescription()) {
            z.i(clearAndSetSemantics, this.$accessibilityContentDescription);
            return;
        }
        String str = this.$title;
        boolean z11 = this.$canShowSubtitle;
        String str2 = this.$dataText;
        String str3 = this.$subtitle;
        StringBuilder e11 = C3261b.e(str);
        if (z11 && str2 == null && str3 != null) {
            e11.append(", ");
            e11.append(str3);
        }
        if (str2 != null) {
            e11.append(", ");
            e11.append(str2);
        }
        String sb2 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        C3422b c3422b = new C3422b(6, sb2, null);
        int i11 = z.f11793b;
        clearAndSetSemantics.b(u.B(), C7714v.a0(c3422b));
    }
}
