package ru.ozon.app.android.favorites.buttonStack.presentation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.ui.wishlists.DeleteWishlistViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<unused var>", "", "bundle", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ButtonStackWidgetViewHolder$2$1 extends AbstractC7737t implements Function2<String, Bundle, Unit> {
    final /* synthetic */ ButtonStackWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonStackWidgetViewHolder$2$1(ButtonStackWidgetViewHolder buttonStackWidgetViewHolder) {
        super(2);
        this.this$0 = buttonStackWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Bundle bundle) {
        invoke2(str, bundle);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, Bundle bundle) {
        DeleteWishlistViewModel deleteWishlistViewModel;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        deleteWishlistViewModel = this.this$0.deleteWishlistViewModel;
        deleteWishlistViewModel.setListId(Long.valueOf(bundle.getLong("RESULT_LIST_ID_KEY")));
    }
}
