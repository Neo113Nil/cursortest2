package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.item;

import YZ.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LYZ/a;", "it", "", "invoke-kwQ5Lys", "(Ljava/lang/String;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class ProductsInBotV2ItemView$setupCheckedAnalytics$1 extends AbstractC7737t implements Function1<a, Boolean> {
    final /* synthetic */ String $payload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsInBotV2ItemView$setupCheckedAnalytics$1(String str) {
        super(1);
        this.$payload = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(a aVar) {
        return m771invokekwQ5Lys(aVar.b());
    }

    /* renamed from: invoke-kwQ5Lys, reason: not valid java name */
    public final Boolean m771invokekwQ5Lys(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(Intrinsics.d(it, this.$payload));
    }
}
