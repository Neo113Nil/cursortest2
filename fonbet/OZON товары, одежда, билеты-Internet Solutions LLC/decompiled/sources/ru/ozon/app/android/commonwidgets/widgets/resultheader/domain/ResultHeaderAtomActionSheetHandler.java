package ru.ozon.app.android.commonwidgets.widgets.resultheader.domain;

import AF.b;
import Bc.e;
import Mc.a;
import W10.c;
import android.app.Activity;
import android.view.ViewGroup;
import androidx.core.app.t;
import i10.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.account.R$string;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.ui.AdultDialog;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.action.sheet.AtomActionSheetHandler;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.domain.ResultHeaderAtomActionSheetHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.delegate.RemoveFavoritesListDelegate;
import ru.ozon.app.android.favorites.ui.shoppinglists.ShoppingListsViewModel;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 42\u00020\u0001:\u00014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010\"\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00132\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0016H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0016H\u0016¢\u0006\u0004\b)\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ResultHeaderAtomActionSheetHandler;", "Lru/ozon/app/android/action/sheet/AtomActionSheetHandler;", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ResultsHeaderRepository;", "repository", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel;", "shoppingListsViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "<init>", "(Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ResultsHeaderRepository;Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/account/adult/presenter/AdultHandler;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "handleComposerAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Z", "", "listId", "", "permission", "shareAsManager", "", "shareList", "(JLjava/lang/String;Ljava/lang/Boolean;)V", "Landroid/app/Activity;", "activity", "message", "showShareSheet", "(Landroid/app/Activity;Ljava/lang/String;)V", "", "icon", "duration", "Lru/ozon/uni/android/flashbar/model/Action;", "showMessage", "(Ljava/lang/String;Ljava/lang/Integer;JLru/ozon/uni/android/flashbar/model/Action;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "handle", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "onBind", "()V", "clear", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ResultsHeaderRepository;", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/favorites/ui/delegate/RemoveFavoritesListDelegate;", "removeFavoritesListDelegate", "Lru/ozon/app/android/favorites/ui/delegate/RemoveFavoritesListDelegate;", "Lnc/a;", "disposables", "Lnc/a;", "Companion", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ResultHeaderAtomActionSheetHandler implements AtomActionSheetHandler {

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final ComposerReferences references;
    private RemoveFavoritesListDelegate removeFavoritesListDelegate;

    @NotNull
    private final ResultsHeaderRepository repository;

    @NotNull
    private final ShoppingListsViewModel shoppingListsViewModel;

    public ResultHeaderAtomActionSheetHandler(@NotNull ResultsHeaderRepository repository, @NotNull ShoppingListsViewModel shoppingListsViewModel, @NotNull ComposerReferences references, @NotNull AdultHandler adultHandler) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(shoppingListsViewModel, "shoppingListsViewModel");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        this.repository = repository;
        this.shoppingListsViewModel = shoppingListsViewModel;
        this.references = references;
        this.adultHandler = adultHandler;
        this.disposables = new C8486a();
    }

    private final boolean handleComposerAction(AtomAction.ComposerAction action) {
        String str;
        String str2;
        String str3;
        Map<String, String> params = action.getParams();
        boolean parseBoolean = (params == null || (str3 = params.get("hasAdultProducts")) == null) ? false : Boolean.parseBoolean(str3);
        Map<String, String> params2 = action.getParams();
        final Boolean bool = null;
        final String str4 = params2 != null ? params2.get("permission") : null;
        Map<String, String> params3 = action.getParams();
        final Long y02 = (params3 == null || (str2 = params3.get("id")) == null) ? null : h.y0(str2);
        Map<String, String> params4 = action.getParams();
        if (params4 != null && (str = params4.get("shareAsManager")) != null) {
            bool = Boolean.valueOf(Boolean.parseBoolean(str));
        }
        if (y02 == null) {
            return false;
        }
        if (parseBoolean) {
            this.adultHandler.forceShowAdultDialog(this.references.getContainer().k(), new AdultListener() { // from class: ru.ozon.app.android.commonwidgets.widgets.resultheader.domain.ResultHeaderAtomActionSheetHandler$handleComposerAction$1
                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultAccept() {
                    ResultHeaderAtomActionSheetHandler.this.shareList(y02.longValue(), str4, bool);
                }

                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultReject() {
                    AdultListener.DefaultImpls.onAdultReject(this);
                }
            }, new AdultDialog.Customisation(StringProvider.getString(R$string.favorites_adult_dialog_list_request), StringProvider.getString(ru.ozon.app.android.uikit.R$string.common_action_share), null, AdultDialog.Customisation.Style.NO_STYLE, 4, null), true);
        } else {
            shareList(y02.longValue(), str4, bool);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareList(long listId, String permission, Boolean shareAsManager) {
        this.references.getController().e(new l.a.C1079a(0L, null, 3));
        C8486a c8486a = this.disposables;
        InterfaceC8487b h11 = new e(this.repository.shareList(listId, permission, shareAsManager).j(a.b()).g(C8125a.a()), new InterfaceC9019a() { // from class: zr.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                ResultHeaderAtomActionSheetHandler.shareList$lambda$0(ResultHeaderAtomActionSheetHandler.this);
            }
        }).h(new AF.a(new ResultHeaderAtomActionSheetHandler$shareList$2(this), 16), new b(new ResultHeaderAtomActionSheetHandler$shareList$3(this), 14));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shareList$lambda$0(ResultHeaderAtomActionSheetHandler resultHeaderAtomActionSheetHandler) {
        resultHeaderAtomActionSheetHandler.references.getController().hideLoader();
    }

    private final void showMessage(String message, Integer icon, long duration, Action action) {
        ViewGroup b11 = Bl.b.b(this.references);
        if (b11 != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, b11, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, icon, null, null, null, action, null, null, null, Long.valueOf(duration), null, null, this.references.getContainer().f(), 56794, null).show();
        }
    }

    static /* synthetic */ void showMessage$default(ResultHeaderAtomActionSheetHandler resultHeaderAtomActionSheetHandler, String str, Integer num, long j11, Action action, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            j11 = 3000;
        }
        if ((i11 & 8) != 0) {
            action = null;
        }
        resultHeaderAtomActionSheetHandler.showMessage(str, num, j11, action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showShareSheet(Activity activity, String message) {
        t.a aVar = new t.a(activity);
        aVar.g("text/plain");
        aVar.f(message);
        aVar.d(StringProvider.getString(ru.ozon.app.android.uikit.R$string.common_action_share));
        aVar.h();
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public void clear() {
        this.disposables.d();
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public boolean handle(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.ComposerAction) {
            return handleComposerAction((AtomAction.ComposerAction) action);
        }
        return false;
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public void onBind() {
        ShoppingListsViewModel shoppingListsViewModel = this.shoppingListsViewModel;
        ComposerReferences composerReferences = this.references;
        this.removeFavoritesListDelegate = new RemoveFavoritesListDelegate(shoppingListsViewModel, composerReferences, composerReferences.getContainer().f(), this.references.getContainer().g());
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public void setTrackingData(@NotNull c cVar) {
        AtomActionSheetHandler.DefaultImpls.setTrackingData(this, cVar);
    }

    @Override // ru.ozon.app.android.action.sheet.AtomActionSheetHandler
    public void setWidgetViewItem(ru.ozon.composer.ui.widget.l lVar) {
        AtomActionSheetHandler.DefaultImpls.setWidgetViewItem(this, lVar);
    }
}
