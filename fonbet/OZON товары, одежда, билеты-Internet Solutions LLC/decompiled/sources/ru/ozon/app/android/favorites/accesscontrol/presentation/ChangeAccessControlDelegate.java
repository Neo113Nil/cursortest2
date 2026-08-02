package ru.ozon.app.android.favorites.accesscontrol.presentation;

import Gy.b;
import Lm0.a;
import Sc.o;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import i10.l;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.accesscontrol.data.AccessControlAction;
import ru.ozon.app.android.favorites.accesscontrol.data.AccessControlViewModel;
import ru.ozon.app.android.favorites.domain.utils.FavoritesListExtentionsKt;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.dialog.AlertDialogFragment;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/favorites/accesscontrol/presentation/ChangeAccessControlDelegate;", "", "Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel;", "shoppingListsViewModel", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "favoritesListsEventsManager", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Landroidx/lifecycle/J;", "lifecycleOwner", "viewOwner", "<init>", "(Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel;Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;Lru/ozon/app/android/composer/ComposerReferences;Landroidx/lifecycle/J;Landroidx/lifecycle/J;)V", "", "message", "", "icon", "", "showMessage", "(Ljava/lang/String;Ljava/lang/Integer;)V", "", "requestId", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "userName", "listName", "showConfirmationDialog", "(JLru/ozon/uni/atoms/af/AtomAction$ComposerAction;Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "Lru/ozon/app/android/composer/ComposerReferences;", "Landroidx/lifecycle/J;", "J", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChangeAccessControlDelegate {

    @NotNull
    private final FavoritesListsEventsManager favoritesListsEventsManager;

    @NotNull
    private final J lifecycleOwner;

    @NotNull
    private final ComposerReferences references;
    private long requestId;

    @NotNull
    private final AccessControlViewModel shoppingListsViewModel;

    @NotNull
    private final J viewOwner;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<destruct>", "Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel$AccessActionDTO;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel$AccessActionDTO;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.favorites.accesscontrol.presentation.ChangeAccessControlDelegate$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AccessControlViewModel.AccessActionDTO, Boolean> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AccessControlViewModel.AccessActionDTO accessActionDTO) {
            Intrinsics.checkNotNullParameter(accessActionDTO, "<destruct>");
            return Boolean.valueOf(accessActionDTO.getId() == ChangeAccessControlDelegate.this.requestId);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<destruct>", "Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel$AccessActionDTO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel$AccessActionDTO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.favorites.accesscontrol.presentation.ChangeAccessControlDelegate$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<AccessControlViewModel.AccessActionDTO, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AccessControlViewModel.AccessActionDTO accessActionDTO) {
            invoke2(accessActionDTO);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AccessControlViewModel.AccessActionDTO accessActionDTO) {
            AccessControlViewModel.Action action = accessActionDTO.getAction();
            if (Intrinsics.d(action, AccessControlViewModel.Action.Loading.INSTANCE)) {
                ChangeAccessControlDelegate.this.references.getController().e(new l.a.C1079a(0L, null, 3));
            } else if (Intrinsics.d(action, AccessControlViewModel.Action.Success.INSTANCE)) {
                InterfaceC7851b.a.e(ChangeAccessControlDelegate.this.references.getController(), null, null, null, 7);
                ChangeAccessControlDelegate.this.references.getController().hideLoader();
                ChangeAccessControlDelegate.this.favoritesListsEventsManager.onListAccessChanged();
            } else {
                if (!(action instanceof AccessControlViewModel.Action.Failure)) {
                    throw new o();
                }
                ChangeAccessControlDelegate.this.references.getController().hideLoader();
                ChangeAccessControlDelegate.this.showMessage(FavoritesListExtentionsKt.toMessage(((AccessControlViewModel.Action.Failure) action).getThrowable()), Integer.valueOf(R$drawable.ic_warning));
            }
            WhenExtKt.getExhaustive(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.favorites.accesscontrol.presentation.ChangeAccessControlDelegate$3, reason: invalid class name */
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
            a.f17149a.e(it);
        }
    }

    public ChangeAccessControlDelegate(@NotNull AccessControlViewModel shoppingListsViewModel, @NotNull FavoritesListsEventsManager favoritesListsEventsManager, @NotNull ComposerReferences references, @NotNull J lifecycleOwner, @NotNull J viewOwner) {
        Intrinsics.checkNotNullParameter(shoppingListsViewModel, "shoppingListsViewModel");
        Intrinsics.checkNotNullParameter(favoritesListsEventsManager, "favoritesListsEventsManager");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewOwner, "viewOwner");
        this.shoppingListsViewModel = shoppingListsViewModel;
        this.favoritesListsEventsManager = favoritesListsEventsManager;
        this.references = references;
        this.lifecycleOwner = lifecycleOwner;
        this.viewOwner = viewOwner;
        p<AccessControlViewModel.AccessActionDTO> filter = shoppingListsViewModel.getAction().filter(new b(new AnonymousClass1(), 1));
        Intrinsics.checkNotNullExpressionValue(filter, "filter(...)");
        RxExtKt.observe$default(filter, lifecycleOwner, new AnonymousClass2(), AnonymousClass3.INSTANCE, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    public static /* synthetic */ void showConfirmationDialog$default(ChangeAccessControlDelegate changeAccessControlDelegate, long j11, AtomAction.ComposerAction composerAction, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = "";
        }
        String str3 = str;
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        changeAccessControlDelegate.showConfirmationDialog(j11, composerAction, str3, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMessage(String message, Integer icon) {
        ViewGroup b11 = Bl.b.b(this.references);
        if (b11 != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, b11, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, icon, null, null, null, null, null, null, null, 3000L, null, null, this.viewOwner, 57306, null).show();
        }
    }

    public final void showConfirmationDialog(long requestId, @NotNull AtomAction.ComposerAction action, @NotNull String userName, String listName) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(userName, "userName");
        if (AccessControlAction.INSTANCE.fromValue(action.getId()) == null) {
            return;
        }
        this.requestId = requestId;
        ComponentCallbacksC5392m j11 = this.references.getContainer().j();
        AlertDialogFragment.Params buildParams = this.shoppingListsViewModel.buildParams(action, userName, listName);
        Intent intent = new Intent();
        intent.putExtra("key:request_id_ac_widget", requestId);
        AlertDialogFragment newInstanceForFragmentResult = AlertDialogFragment.INSTANCE.newInstanceForFragmentResult(buildParams, intent);
        newInstanceForFragmentResult.setTargetFragment(j11, 5463);
        newInstanceForFragmentResult.show(j11.getParentFragmentManager(), (String) null);
    }
}
