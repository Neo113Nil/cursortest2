package ru.ozon.app.android.favorites.ui.atomactionsheethandlers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import nc.C8486a;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "newIsAuthenticated", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CreateFavoritesListDelegate$handle$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ Long $category;
    final /* synthetic */ String $fromList;
    final /* synthetic */ String $hash;
    final /* synthetic */ Boolean $isWishlist;
    final /* synthetic */ String $title;
    final /* synthetic */ CreateFavoritesListDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateFavoritesListDelegate$handle$1(CreateFavoritesListDelegate createFavoritesListDelegate, String str, String str2, String str3, Long l11, Boolean bool) {
        super(1);
        this.this$0 = createFavoritesListDelegate;
        this.$title = str;
        this.$hash = str2;
        this.$fromList = str3;
        this.$category = l11;
        this.$isWishlist = bool;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        boolean z11;
        C8486a c8486a;
        z11 = this.this$0.isAuthenticated;
        if (Boolean.valueOf(z11).equals(bool) || !bool.booleanValue()) {
            return;
        }
        c8486a = this.this$0.disposables;
        c8486a.d();
        this.this$0.createFavoritesList(this.$title, this.$hash, this.$fromList, this.$category, this.$isWishlist);
    }
}
