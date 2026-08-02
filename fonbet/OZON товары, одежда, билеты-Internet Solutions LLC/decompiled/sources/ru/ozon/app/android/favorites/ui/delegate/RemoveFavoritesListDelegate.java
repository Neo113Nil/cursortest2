package ru.ozon.app.android.favorites.ui.delegate;

import BF.b;
import Kk.C3532b;
import Sc.o;
import a00.C4911f;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.fragment.app.G;
import androidx.lifecycle.J;
import i10.l;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.R$string;
import ru.ozon.app.android.favorites.ui.shoppinglists.ShoppingListsViewModel;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.dialog.AlertDialogFragment;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/favorites/ui/delegate/RemoveFavoritesListDelegate;", "", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel;", "shoppingListsViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Landroidx/lifecycle/J;", "lifecycleOwner", "viewOwner", "<init>", "(Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel;Lru/ozon/app/android/composer/ComposerReferences;Landroidx/lifecycle/J;Landroidx/lifecycle/J;)V", "", "message", "", "icon", "", "showMessage", "(Ljava/lang/String;Ljava/lang/Integer;)V", "", "listId", "redirectLink", "", "shouldGoBack", "requestId", "showRemoveConfirmationDialog", "(Ljava/lang/Long;Ljava/lang/String;ZJ)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/favorites/ui/delegate/RemoveFavoritesListDelegate$ActionParams;", "params", "Lru/ozon/app/android/favorites/ui/delegate/RemoveFavoritesListDelegate$ActionParams;", "ActionParams", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RemoveFavoritesListDelegate {
    private ActionParams params;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final J viewOwner;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<destruct>", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel$ListActionDTO;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel$ListActionDTO;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.favorites.ui.delegate.RemoveFavoritesListDelegate$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<ShoppingListsViewModel.ListActionDTO, Boolean> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ShoppingListsViewModel.ListActionDTO listActionDTO) {
            Intrinsics.checkNotNullParameter(listActionDTO, "<destruct>");
            long requestId = listActionDTO.getRequestId();
            ActionParams actionParams = RemoveFavoritesListDelegate.this.params;
            boolean z11 = false;
            if (actionParams != null && requestId == actionParams.getRequestId()) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<destruct>", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel$ListActionDTO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel$ListActionDTO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.favorites.ui.delegate.RemoveFavoritesListDelegate$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<ShoppingListsViewModel.ListActionDTO, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ShoppingListsViewModel.ListActionDTO listActionDTO) {
            invoke2(listActionDTO);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ShoppingListsViewModel.ListActionDTO listActionDTO) {
            Unit unit;
            String redirectLink;
            ShoppingListsViewModel.Action action = listActionDTO.getAction();
            if (action instanceof ShoppingListsViewModel.Action.Loading) {
                RemoveFavoritesListDelegate.this.references.getController().e(new l.a.C1079a(0L, null, 3));
                unit = Unit.f71690a;
            } else if (action instanceof ShoppingListsViewModel.Action.Success) {
                RemoveFavoritesListDelegate.this.references.getController().hideLoader();
                ActionParams actionParams = RemoveFavoritesListDelegate.this.params;
                if (actionParams == null || !actionParams.getShouldGoBack()) {
                    ActionParams actionParams2 = RemoveFavoritesListDelegate.this.params;
                    if (actionParams2 == null || (redirectLink = actionParams2.getRedirectLink()) == null) {
                        unit = null;
                    } else {
                        RemoveFavoritesListDelegate removeFavoritesListDelegate = RemoveFavoritesListDelegate.this;
                        removeFavoritesListDelegate.references.getNavigator().popBackStack();
                        ComposerNavigator.DefaultImpls.openDeeplink$default(removeFavoritesListDelegate.references.getNavigator(), redirectLink, null, 2, null);
                        unit = Unit.f71690a;
                    }
                } else {
                    RemoveFavoritesListDelegate.this.references.getNavigator().popBackStack();
                    unit = Unit.f71690a;
                }
            } else {
                if (!(action instanceof ShoppingListsViewModel.Action.Error)) {
                    throw new o();
                }
                RemoveFavoritesListDelegate.this.references.getController().hideLoader();
                RemoveFavoritesListDelegate.this.showMessage(((ShoppingListsViewModel.Action.Error) action).getMessage(), Integer.valueOf(R$drawable.ic_warning));
                unit = Unit.f71690a;
            }
            WhenExtKt.getExhaustive(unit);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.favorites.ui.delegate.RemoveFavoritesListDelegate$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<Throwable, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.printStackTrace();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/favorites/ui/delegate/RemoveFavoritesListDelegate$ActionParams;", "", "", "listId", "", "redirectLink", "", "shouldGoBack", "requestId", "<init>", "(Ljava/lang/Long;Ljava/lang/String;ZJ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getListId", "()Ljava/lang/Long;", "Ljava/lang/String;", "getRedirectLink", "Z", "getShouldGoBack", "()Z", "J", "getRequestId", "()J", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class ActionParams {
        private final Long listId;
        private final String redirectLink;
        private final long requestId;
        private final boolean shouldGoBack;

        public ActionParams(Long l11, String str, boolean z11, long j11) {
            this.listId = l11;
            this.redirectLink = str;
            this.shouldGoBack = z11;
            this.requestId = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionParams)) {
                return false;
            }
            ActionParams actionParams = (ActionParams) other;
            return Intrinsics.d(this.listId, actionParams.listId) && Intrinsics.d(this.redirectLink, actionParams.redirectLink) && this.shouldGoBack == actionParams.shouldGoBack && this.requestId == actionParams.requestId;
        }

        public final String getRedirectLink() {
            return this.redirectLink;
        }

        public final long getRequestId() {
            return this.requestId;
        }

        public final boolean getShouldGoBack() {
            return this.shouldGoBack;
        }

        public int hashCode() {
            Long l11 = this.listId;
            int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
            String str = this.redirectLink;
            return Long.hashCode(this.requestId) + C3532b.a((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.shouldGoBack);
        }

        @NotNull
        public String toString() {
            return "ActionParams(listId=" + this.listId + ", redirectLink=" + this.redirectLink + ", shouldGoBack=" + this.shouldGoBack + ", requestId=" + this.requestId + ")";
        }
    }

    public RemoveFavoritesListDelegate(@NotNull ShoppingListsViewModel shoppingListsViewModel, @NotNull ComposerReferences references, @NotNull J lifecycleOwner, @NotNull J viewOwner) {
        Intrinsics.checkNotNullParameter(shoppingListsViewModel, "shoppingListsViewModel");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewOwner, "viewOwner");
        this.references = references;
        this.viewOwner = viewOwner;
        p<ShoppingListsViewModel.ListActionDTO> filter = shoppingListsViewModel.getAction().filter(new b(new AnonymousClass1(), 15));
        Intrinsics.checkNotNullExpressionValue(filter, "filter(...)");
        RxExtKt.observe$default(filter, lifecycleOwner, new AnonymousClass2(), AnonymousClass3.INSTANCE, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMessage(String message, Integer icon) {
        ViewGroup b11 = Bl.b.b(this.references);
        if (b11 != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, b11, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, icon, null, null, null, null, null, null, null, 3000L, null, null, this.viewOwner, 57306, null).show();
        }
    }

    public final void showRemoveConfirmationDialog(Long listId, String redirectLink, boolean shouldGoBack, long requestId) {
        this.params = new ActionParams(listId, redirectLink, shouldGoBack, requestId);
        C4911f container = this.references.getContainer();
        G k11 = container.k();
        AlertDialogFragment.Companion companion = AlertDialogFragment.INSTANCE;
        AlertDialogFragment.Params params = new AlertDialogFragment.Params(Integer.valueOf(R$string.favorites_remove_favorites_list_alert_message_android), null, null, null, R$string.favorites_remove_favorites_list_android, null, Integer.valueOf(R$string.favorites_remove_favorites_list_cancel_button_android), 0, 174, null);
        Intent intent = new Intent();
        intent.putExtra("list_id", listId);
        intent.putExtra("request_id", requestId);
        Unit unit = Unit.f71690a;
        AlertDialogFragment newInstanceForFragmentResult = companion.newInstanceForFragmentResult(params, intent);
        newInstanceForFragmentResult.setTargetFragment(container.c(), 17463);
        newInstanceForFragmentResult.show(k11, (String) null);
    }
}
