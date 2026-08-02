package ru.ozon.app.android.favorites.ui.configurators;

import GZ.g;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CreateShoppingListConfigurator$showMessage$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Uri $link;
    final /* synthetic */ CreateShoppingListConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateShoppingListConfigurator$showMessage$1$1$1(CreateShoppingListConfigurator createShoppingListConfigurator, Uri uri) {
        super(0);
        this.this$0 = createShoppingListConfigurator;
        this.$link = uri;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        g gVar;
        gVar = this.this$0.ozonRouter;
        String uri = this.$link.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        g.a.a(gVar, uri, null, null, 6);
    }
}
