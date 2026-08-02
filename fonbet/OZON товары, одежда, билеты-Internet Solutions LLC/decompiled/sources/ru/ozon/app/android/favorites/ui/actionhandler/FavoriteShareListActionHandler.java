package ru.ozon.app.android.favorites.ui.actionhandler;

import De.s;
import Sc.InterfaceC4008j;
import Sc.k;
import Wc.a;
import android.app.Activity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.ui.AdultDialog;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0018\u0010\u0019JD\u0010\u001f\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020!2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u001b\u0010-\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/favorites/ui/actionhandler/FavoriteShareListActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "favoritesListsInteractor", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "", "listId", "", "permission", "", "shareAsManager", "", "shareList", "(Lru/ozon/app/android/composer/ComposerReferences;JLjava/lang/String;Ljava/lang/Boolean;)V", "Landroid/app/Activity;", "activity", "message", "showShareSheet", "(Landroid/app/Activity;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "icon", "duration", "Lru/ozon/uni/android/flashbar/model/Action;", "action", "showMessage", "(Lru/ozon/app/android/composer/ComposerReferences;Ljava/lang/String;Ljava/lang/Integer;JLru/ozon/uni/android/flashbar/model/Action;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "adultDialogMessage$delegate", "LSc/j;", "getAdultDialogMessage", "()I", "adultDialogMessage", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoriteShareListActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    /* renamed from: adultDialogMessage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j adultDialogMessage;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final FavoritesListsInteractor favoritesListsInteractor;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final InterfaceC4008j<M> coroutineScope$delegate = k.b(FavoriteShareListActionHandler$Companion$coroutineScope$2.INSTANCE);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/favorites/ui/actionhandler/FavoriteShareListActionHandler$Companion;", "", "<init>", "()V", "Lxe/M;", "coroutineScope$delegate", "LSc/j;", "getCoroutineScope", "()Lxe/M;", "coroutineScope", "", "SHARE_DATA_TYPE", "Ljava/lang/String;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final M getCoroutineScope() {
            return (M) FavoriteShareListActionHandler.coroutineScope$delegate.getValue();
        }

        private Companion() {
        }
    }

    public FavoriteShareListActionHandler(@NotNull AdultHandler adultHandler, @NotNull FavoritesListsInteractor favoritesListsInteractor, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(favoritesListsInteractor, "favoritesListsInteractor");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.adultHandler = adultHandler;
        this.favoritesListsInteractor = favoritesListsInteractor;
        this.featureChecker = featureChecker;
        this.adultDialogMessage = LazyUtilsKt.unsafeLazy(new FavoriteShareListActionHandler$adultDialogMessage$2(this));
        this.actionId = "favoriteShareList";
    }

    private final int getAdultDialogMessage() {
        return ((Number) this.adultDialogMessage.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareList(ComposerReferences references, long listId, String permission, Boolean shareAsManager) {
        C10727i.c(Companion.getCoroutineScope(), null, null, new FavoriteShareListActionHandler$shareList$1(references, this, listId, permission, shareAsManager, null), 3);
    }

    private final Object showMessage(ComposerReferences composerReferences, String str, Integer num, long j11, Action action, d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(s.f6650a, new FavoriteShareListActionHandler$showMessage$2(composerReferences, str, num, action, j11, null), dVar);
    }

    static /* synthetic */ Object showMessage$default(FavoriteShareListActionHandler favoriteShareListActionHandler, ComposerReferences composerReferences, String str, Integer num, long j11, Action action, d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            j11 = 3000;
        }
        if ((i11 & 16) != 0) {
            action = null;
        }
        return favoriteShareListActionHandler.showMessage(composerReferences, str, num, j11, action, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showShareSheet(Activity activity, String str, d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(s.f6650a, new FavoriteShareListActionHandler$showShareSheet$2(activity, str, null), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull final CustomActionHandler.HandlerReferences handlerRefs) {
        AtomAction.ComposerAction composerAction;
        Map<String, String> params;
        String str;
        Long y02;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (!(action instanceof AtomAction.ComposerAction) || (params = (composerAction = (AtomAction.ComposerAction) action).getParams()) == null || (str = params.get("id")) == null || (y02 = h.y0(str)) == null) {
            return;
        }
        final long longValue = y02.longValue();
        Map<String, String> params2 = composerAction.getParams();
        boolean parseBoolean = (params2 == null || (str3 = params2.get("hasAdultProducts")) == null) ? false : Boolean.parseBoolean(str3);
        Map<String, String> params3 = composerAction.getParams();
        Boolean bool = null;
        String str4 = params3 != null ? params3.get("permission") : null;
        Map<String, String> params4 = composerAction.getParams();
        if (params4 != null && (str2 = params4.get("shareAsManager")) != null) {
            bool = Boolean.valueOf(Boolean.parseBoolean(str2));
        }
        final Boolean bool2 = bool;
        if (!parseBoolean) {
            shareList(handlerRefs.getRefs(), longValue, str4, bool2);
        } else {
            final String str5 = str4;
            this.adultHandler.forceShowAdultDialog(handlerRefs.getRefs().getContainer().k(), new AdultListener() { // from class: ru.ozon.app.android.favorites.ui.actionhandler.FavoriteShareListActionHandler$processAction$1
                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultAccept() {
                    FavoriteShareListActionHandler.this.shareList(handlerRefs.getRefs(), longValue, str5, bool2);
                }

                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultReject() {
                    AdultListener.DefaultImpls.onAdultReject(this);
                }
            }, new AdultDialog.Customisation(StringProvider.getString(getAdultDialogMessage()), StringProvider.getString(R$string.common_action_share), null, AdultDialog.Customisation.Style.NO_STYLE, 4, null), true);
        }
    }
}
