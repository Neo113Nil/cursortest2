package ru.ozon.app.android.favorites.ui.atomactionsheethandlers;

import Bl.b;
import GZ.g;
import Hs.c;
import Hs.d;
import Hs.e;
import Mc.a;
import android.view.ViewGroup;
import i10.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJA\u0010\u0015\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00102\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0014¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010-R\u0014\u0010.\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;", "", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "favoritesListsInteractor", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "favoritesListsEventsManager", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authManager", "LGZ/g;", "ozonRouter", "<init>", "(Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;Lru/ozon/app/android/storage/auth/AuthStateStorage;LGZ/g;)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "hash", "fromList", "", "category", "", "isWishlist", "", "createFavoritesList", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)V", "message", "", "icon", "duration", "Lru/ozon/uni/android/flashbar/model/Action;", "action", "showMessage", "(Ljava/lang/String;Ljava/lang/Integer;JLru/ozon/uni/android/flashbar/model/Action;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "handle", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Lru/ozon/app/android/composer/ComposerReferences;)V", "clear", "()V", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "LGZ/g;", "Lnc/a;", "disposables", "Lnc/a;", "Lru/ozon/app/android/composer/ComposerReferences;", "isAuthenticated", "Z", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CreateFavoritesListDelegate {

    @NotNull
    private final AuthStateStorage authManager;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final FavoritesListsEventsManager favoritesListsEventsManager;

    @NotNull
    private final FavoritesListsInteractor favoritesListsInteractor;
    private final boolean isAuthenticated;

    @NotNull
    private final g ozonRouter;
    private ComposerReferences references;

    public CreateFavoritesListDelegate(@NotNull FavoritesListsInteractor favoritesListsInteractor, @NotNull FavoritesListsEventsManager favoritesListsEventsManager, @NotNull AuthStateStorage authManager, @NotNull g ozonRouter) {
        Intrinsics.checkNotNullParameter(favoritesListsInteractor, "favoritesListsInteractor");
        Intrinsics.checkNotNullParameter(favoritesListsEventsManager, "favoritesListsEventsManager");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.favoritesListsInteractor = favoritesListsInteractor;
        this.favoritesListsEventsManager = favoritesListsEventsManager;
        this.authManager = authManager;
        this.ozonRouter = ozonRouter;
        this.disposables = new C8486a();
        this.isAuthenticated = authManager.isAuthenticated();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createFavoritesList(String title, String hash, String fromList, Long category, Boolean isWishlist) {
        ComposerReferences composerReferences = this.references;
        if (composerReferences == null) {
            Intrinsics.n("references");
            throw null;
        }
        composerReferences.getController().e(new l.a.C1079a(0L, null, 3));
        C8486a c8486a = this.disposables;
        InterfaceC8487b h11 = FavoritesListsInteractor.DefaultImpls.createFavoritesList$default(this.favoritesListsInteractor, title, hash, fromList, category, null, isWishlist, 16, null).j(a.b()).g(C8125a.a()).h(new d(new CreateFavoritesListDelegate$createFavoritesList$1(this), 11), new e(new CreateFavoritesListDelegate$createFavoritesList$2(this), 9));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    private final void showMessage(String message, Integer icon, long duration, Action action) {
        ComposerReferences composerReferences = this.references;
        if (composerReferences == null) {
            Intrinsics.n("references");
            throw null;
        }
        ViewGroup b11 = b.b(composerReferences);
        if (b11 != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(message);
            Long valueOf = Long.valueOf(duration);
            ComposerReferences composerReferences2 = this.references;
            if (composerReferences2 != null) {
                FlashbarFactory.create$default(flashbarFactory, b11, null, ozonSpannableString, null, null, icon, null, null, null, action, null, null, null, valueOf, null, null, composerReferences2.getContainer().f(), 56794, null).show();
            } else {
                Intrinsics.n("references");
                throw null;
            }
        }
    }

    static /* synthetic */ void showMessage$default(CreateFavoritesListDelegate createFavoritesListDelegate, String str, Integer num, long j11, Action action, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            j11 = 3000;
        }
        if ((i11 & 8) != 0) {
            action = null;
        }
        createFavoritesListDelegate.showMessage(str, num, j11, action);
    }

    public final void clear() {
        this.disposables.d();
    }

    public final void handle(@NotNull AtomAction.ComposerAction action, @NotNull ComposerReferences references) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(references, "references");
        this.references = references;
        Map<String, String> params = action.getParams();
        String str3 = params != null ? params.get(SelectionItemFormDTO.TITLE_FIELD_NAME) : null;
        Map<String, String> params2 = action.getParams();
        String str4 = params2 != null ? params2.get("fromList") : null;
        Map<String, String> params3 = action.getParams();
        String str5 = params3 != null ? params3.get("hash") : null;
        Map<String, String> params4 = action.getParams();
        Long y02 = (params4 == null || (str2 = params4.get("category")) == null) ? null : h.y0(str2);
        Map<String, String> params5 = action.getParams();
        Boolean t02 = (params5 == null || (str = params5.get("isWishlist")) == null) ? null : h.t0(str);
        if (this.isAuthenticated) {
            createFavoritesList(str3, str5, str4, y02, t02);
            return;
        }
        ComposerNavigator navigator = references.getNavigator();
        String uri = LinkGenerator.INSTANCE.auth().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, uri, null, 2, null);
        C8486a c8486a = this.disposables;
        Boolean bool = t02;
        InterfaceC8487b subscribe = this.authManager.getAuthState().subscribeOn(a.b()).observeOn(C8125a.a()).subscribe(new c(new CreateFavoritesListDelegate$handle$1(this, str3, str5, str4, y02, bool), 14));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
    }
}
