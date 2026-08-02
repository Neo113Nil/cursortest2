package ru.ozon.app.android.ugcratingmolecule.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.o;
import UZ.a;
import UZ.d;
import WZ.e;
import WZ.g;
import WZ.m;
import WZ.t;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.common.ugc.data.ugcratingmolecule.UgcRatingMolecule;
import ru.ozon.app.android.ugcratingmolecule.data.TrackViewInfo;
import ru.ozon.app.android.ugcratingmolecule.presentation.UgcRatingDelegateViewModel;
import ru.ozon.app.android.ugcratingmolecule.presentation.UiRatingState;
import ru.ozon.app.android.ugcratingservice.data.RatingState;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 :2\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\bJ\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\"\u001a\u00020\u00062\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R$\u0010/\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001f\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/ugcratingmolecule/presentation/UgcRatingDelegateViewModel;", "", "<init>", "()V", "Lru/ozon/app/android/ugcratingservice/data/RatingState;", "ratingState", "", "handleRatingState", "(Lru/ozon/app/android/ugcratingservice/data/RatingState;)V", "Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;", "molecule", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "", "canHandleRatingClick", "(Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;Lru/ozon/app/android/composer/ComposerReferences;)Z", "", "actionLink", "", "rating", "buildRatingLink", "(Ljava/lang/String;I)Ljava/lang/String;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "data", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/composer/ComposerReferences;)V", "updateRatingState", "", "widgetId", "onBindWidgetWithMolecule", "(JLru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "onBindAction", "(Lkotlin/jvm/functions/Function1;)V", "onRatingClicked", "(ILru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/ugcratingmolecule/data/TrackViewInfo;", "getTrackViewInfo", "()Lru/ozon/app/android/ugcratingmolecule/data/TrackViewInfo;", "currentWidgetId", "Ljava/lang/Long;", "currentMolecule", "Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;", "currentRatingState", "Lru/ozon/app/android/ugcratingservice/data/RatingState;", "currentActionHandler", "Lkotlin/jvm/functions/Function1;", "LAe/x0;", "Lru/ozon/app/android/ugcratingmolecule/presentation/UiRatingState;", "_uiRatingState", "LAe/x0;", "LAe/M0;", "uiRatingState", "LAe/M0;", "getUiRatingState", "()LAe/M0;", "Companion", "ugcratingmolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UgcRatingDelegateViewModel {

    @NotNull
    private final x0<UiRatingState> _uiRatingState;
    private Function1<? super AtomAction, Unit> currentActionHandler;
    private UgcRatingMolecule currentMolecule;
    private RatingState currentRatingState;
    private Long currentWidgetId;

    @NotNull
    private final M0<UiRatingState> uiRatingState;

    public UgcRatingDelegateViewModel() {
        x0<UiRatingState> a11 = O0.a(null);
        this._uiRatingState = a11;
        this.uiRatingState = C2399j.b(a11);
    }

    private final String buildRatingLink(String actionLink, int rating) {
        String uri = Uri.parse(actionLink).buildUpon().appendQueryParameter("selectedRating", String.valueOf(rating)).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    private final boolean canHandleRatingClick(UgcRatingMolecule molecule, ComposerReferences refs) {
        CommonControlSettings common = molecule.getRating().getCommon();
        if ((common != null ? common.getAction() : null) != null) {
            return true;
        }
        NotificationDTO editErrorNotification = molecule.getEditErrorNotification();
        if (editErrorNotification != null) {
            showNotification(editErrorNotification, refs);
        }
        handleRatingState(new RatingState.Failed(molecule.getSku()));
        return false;
    }

    private final void handleRatingState(RatingState ratingState) {
        UiRatingState value;
        UgcRatingMolecule ugcRatingMolecule;
        RatingDTO rating;
        this.currentRatingState = ratingState;
        UgcRatingMolecule ugcRatingMolecule2 = this.currentMolecule;
        if (ugcRatingMolecule2 == null) {
            return;
        }
        if (ratingState instanceof RatingState.Pending) {
            x0<UiRatingState> x0Var = this._uiRatingState;
            while (!x0Var.b(x0Var.getValue(), new UiRatingState.PendingState(((RatingState.Pending) ratingState).getPendingRatingValue()))) {
            }
            return;
        }
        UgcRatingMolecule ugcRatingMolecule3 = null;
        if (ratingState instanceof RatingState.Failed) {
            x0<UiRatingState> x0Var2 = this._uiRatingState;
            do {
                value = x0Var2.getValue();
                ugcRatingMolecule = this.currentMolecule;
            } while (!x0Var2.b(value, new UiRatingState.FailedState((ugcRatingMolecule == null || (rating = ugcRatingMolecule.getRating()) == null) ? null : rating.getTotal())));
            return;
        }
        if (!(ratingState instanceof RatingState.Success)) {
            throw new o();
        }
        if (ugcRatingMolecule2 != null) {
            RatingState.Success success = (RatingState.Success) ratingState;
            ugcRatingMolecule3 = ugcRatingMolecule2.updateInfo(success.getEditingAction().getAction(), success.getEditingAction().getTrackingInfo(), success.getNewRatingValue(), success.getEditingAction().getEditErrorNotification());
        }
        this.currentMolecule = ugcRatingMolecule3;
        x0<UiRatingState> x0Var3 = this._uiRatingState;
        while (!x0Var3.b(x0Var3.getValue(), new UiRatingState.UpdatedState(this.currentMolecule))) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g onRatingClicked$lambda$3$lambda$2$lambda$1(Map map, a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, map, null, 2);
    }

    private final void showNotification(NotificationDTO data, ComposerReferences refs) {
        ViewGroup rootView;
        NotificationLayoutManager asNotificationLayoutManager$default;
        r a11 = refs.getContainer().a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, data, refs.getContainer().f(), null, 8, null).show();
    }

    public final TrackViewInfo getTrackViewInfo() {
        RatingDTO rating;
        UgcRatingMolecule ugcRatingMolecule = this.currentMolecule;
        if (ugcRatingMolecule == null || (rating = ugcRatingMolecule.getRating()) == null) {
            return null;
        }
        return new TrackViewInfo(this.currentWidgetId, rating, "reviewScore");
    }

    @NotNull
    public final M0<UiRatingState> getUiRatingState() {
        return this.uiRatingState;
    }

    public final void onBindAction(Function1<? super AtomAction, Unit> onAction) {
        this.currentActionHandler = onAction;
    }

    public final void onBindWidgetWithMolecule(long widgetId, UgcRatingMolecule molecule) {
        this.currentWidgetId = Long.valueOf(widgetId);
        if (this.currentMolecule == null) {
            this.currentMolecule = molecule;
            RatingState ratingState = this.currentRatingState;
            if (ratingState != null) {
                handleRatingState(ratingState);
            }
        }
    }

    public final void onRatingClicked(int rating, @NotNull ComposerReferences refs) {
        CommonControlSettings common;
        AtomActionDTO action;
        String link;
        t mapToTokenizedEvent$default;
        Intrinsics.checkNotNullParameter(refs, "refs");
        UgcRatingMolecule ugcRatingMolecule = this.currentMolecule;
        if (ugcRatingMolecule == null || !canHandleRatingClick(ugcRatingMolecule, refs) || (common = ugcRatingMolecule.getRating().getCommon()) == null || (action = common.getAction()) == null || (link = action.getLink()) == null) {
            return;
        }
        String buildRatingLink = buildRatingLink(link, rating);
        Function1<? super AtomAction, Unit> function1 = this.currentActionHandler;
        if (function1 != null) {
            final Map i11 = U.i(new Pair("reviewScore", Integer.valueOf(rating)));
            CommonControlSettings common2 = ugcRatingMolecule.getRating().getCommon();
            Map<String, TokenizedTrackingInfo> trackingInfo = common2 != null ? common2.getTrackingInfo() : null;
            if (trackingInfo != null && (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, this.currentWidgetId, null, 2, null)) != null) {
                m.a(refs.getTokenizedAnalytics(), mapToTokenizedEvent$default, new e() { // from class: fX.c
                    @Override // WZ.e
                    public final g modifyParams(UZ.a aVar, g gVar) {
                        g onRatingClicked$lambda$3$lambda$2$lambda$1;
                        onRatingClicked$lambda$3$lambda$2$lambda$1 = UgcRatingDelegateViewModel.onRatingClicked$lambda$3$lambda$2$lambda$1(i11, (d) aVar, gVar);
                        return onRatingClicked$lambda$3$lambda$2$lambda$1;
                    }
                });
            }
            function1.invoke(AtomActionMapperKt.toAtomAction(AtomActionDTO.copy$default(action, null, buildRatingLink, null, null, null, 29, null), null));
        }
    }

    public final void updateRatingState(@NotNull RatingState ratingState) {
        Intrinsics.checkNotNullParameter(ratingState, "ratingState");
        handleRatingState(ratingState);
    }
}
