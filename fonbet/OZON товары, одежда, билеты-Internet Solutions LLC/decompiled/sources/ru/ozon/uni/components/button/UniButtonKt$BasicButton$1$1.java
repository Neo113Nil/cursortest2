package ru.ozon.uni.components.button;

import I1.D;
import I1.z;
import K1.C3422b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LI1/D;", "", "invoke", "(LI1/D;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class UniButtonKt$BasicButton$1$1 extends AbstractC7737t implements Function1<D, Unit> {
    final /* synthetic */ String $accessibilityContentDescription;
    final /* synthetic */ boolean $canShowSubtitle;
    final /* synthetic */ String $dataContent;
    final /* synthetic */ String $subtitleContent;
    final /* synthetic */ String $titleContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniButtonKt$BasicButton$1$1(String str, String str2, boolean z11, String str3, String str4) {
        super(1);
        this.$accessibilityContentDescription = str;
        this.$titleContent = str2;
        this.$canShowSubtitle = z11;
        this.$dataContent = str3;
        this.$subtitleContent = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(D d11) {
        invoke2(d11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(D semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        Object obj = this.$accessibilityContentDescription;
        if (obj == null) {
            String str = this.$titleContent;
            boolean z11 = this.$canShowSubtitle;
            String str2 = this.$dataContent;
            String str3 = this.$subtitleContent;
            C3422b.a aVar = new C3422b.a();
            aVar.e(str);
            if (z11 && str2 == null && str3 != null) {
                aVar.e(", ");
                aVar.e(str3);
            }
            if (str2 != null) {
                aVar.e(", ");
                aVar.e(str2);
            }
            obj = aVar.i();
        }
        z.i(semantics, obj.toString());
    }
}
