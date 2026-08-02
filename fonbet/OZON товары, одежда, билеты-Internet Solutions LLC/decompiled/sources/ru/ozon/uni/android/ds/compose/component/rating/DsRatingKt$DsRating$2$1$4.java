package ru.ozon.uni.android.ds.compose.component.rating;

import I1.A;
import I1.D;
import I1.z;
import S0.InterfaceC3970l0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LI1/D;", "", "invoke", "(LI1/D;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes8.dex */
final class DsRatingKt$DsRating$2$1$4 extends AbstractC7737t implements Function1<D, Unit> {
    final /* synthetic */ M<String> $dsTestTag;
    final /* synthetic */ int $i;
    final /* synthetic */ InterfaceC3970l0 $selectedIndex$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsRatingKt$DsRating$2$1$4(M<String> m11, int i11, InterfaceC3970l0 interfaceC3970l0) {
        super(1);
        this.$dsTestTag = m11;
        this.$i = i11;
        this.$selectedIndex$delegate = interfaceC3970l0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(D d11) {
        invoke2(d11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(D semantics) {
        String str;
        float floatValue;
        float floatValue2;
        float floatValue3;
        String str2;
        float floatValue4;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        A.a(semantics, true);
        String str3 = this.$dsTestTag.f71787a;
        if (str3 == null || str3.length() == 0) {
            str = "";
        } else {
            str = ((Object) this.$dsTestTag.f71787a) + ".";
        }
        floatValue = this.$selectedIndex$delegate.getFloatValue();
        floatValue2 = this.$selectedIndex$delegate.getFloatValue();
        double d11 = floatValue2 - ((int) floatValue);
        floatValue3 = this.$selectedIndex$delegate.getFloatValue();
        int i11 = this.$i;
        if (floatValue3 >= i11 + 1) {
            str2 = "fully_checked";
        } else {
            if (d11 != 0.0d) {
                float f7 = i11;
                float f11 = i11 + 1.0f;
                floatValue4 = this.$selectedIndex$delegate.getFloatValue();
                if (f7 <= floatValue4 && floatValue4 <= f11) {
                    str2 = "partially_checked";
                }
            }
            str2 = "not_checked";
        }
        z.t(semantics, str + str2);
    }
}
