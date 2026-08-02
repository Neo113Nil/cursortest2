package ru.ozon.app.android.commonwidgets.widgets.navbariconbutton.presentation;

import G.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "shareLink", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class NavBarIconButtonWidgetViewHolder$processCustomAction$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ String $text;
    final /* synthetic */ NavBarIconButtonWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavBarIconButtonWidgetViewHolder$processCustomAction$1(String str, NavBarIconButtonWidgetViewHolder navBarIconButtonWidgetViewHolder) {
        super(1);
        this.$text = str;
        this.this$0 = navBarIconButtonWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String shareLink) {
        Intrinsics.checkNotNullParameter(shareLink, "shareLink");
        this.this$0.share(g.c(this.$text, "\n", shareLink));
    }
}
