package ru.ozon.app.android.favorites.accesscontrol.data;

import D40.a;
import L9.c;
import WZ.l;
import WZ.t;
import WZ.x;
import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import io.reactivex.p;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.favorites.accesscontrol.data.AccessControlAction;
import ru.ozon.app.android.favorites.accesscontrol.data.AccessControlViewModel;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.domain.flags.FavoritesWishlistsEnabledFlag;
import ru.ozon.app.android.favorites.ui.R$string;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.app.android.uikit.dialog.AlertDialogFragment;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import uc.i;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 42\u00020\u0001:\u0003456B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u000fJ'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R\"\u0010%\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010\u001f0\u001f0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R$\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u000202\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010.¨\u00067"}, d2 = {"Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "favoritesListsInteractor", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;Lru/ozon/app/android/network/abtool/FeatureChecker;LWZ/l;)V", "", "id", "", "sendConfirmChangeAccessAnalytics", "(J)V", "onCleared", "()V", "requestId", "changeAccess", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "listName", "Lru/ozon/app/android/uikit/dialog/AlertDialogFragment$Params;", "buildParams", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/uikit/dialog/AlertDialogFragment$Params;", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "LWZ/l;", "Lio/reactivex/p;", "Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel$AccessActionDTO;", "Lio/reactivex/p;", "getAction", "()Lio/reactivex/p;", "LL9/c;", "kotlin.jvm.PlatformType", "actionRelay", "LL9/c;", "Lnc/a;", "disposables", "Lnc/a;", "link", "Ljava/lang/String;", "", "params", "Ljava/util/Map;", "", "wishlistsEnabled", "Z", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "resetAccessTrackingInfo", "Companion", "Action", "AccessActionDTO", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccessControlViewModel extends w0 {

    @NotNull
    private final p<AccessActionDTO> action;

    @NotNull
    private final c<AccessActionDTO> actionRelay;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final FavoritesListsInteractor favoritesListsInteractor;

    @NotNull
    private String link;

    @NotNull
    private Map<String, String> params;
    private Map<String, TokenizedTrackingInfo> resetAccessTrackingInfo;

    @NotNull
    private final l tokenizedAnalytics;
    private final boolean wishlistsEnabled;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel$AccessActionDTO;", "", "id", "", "action", "Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel$Action;", "<init>", "(JLru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel$Action;)V", "getId", "()J", "getAction", "()Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel$Action;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccessActionDTO {

        @NotNull
        private final Action action;
        private final long id;

        public AccessActionDTO(long j11, @NotNull Action action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.id = j11;
            this.action = action;
        }

        public static /* synthetic */ AccessActionDTO copy$default(AccessActionDTO accessActionDTO, long j11, Action action, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = accessActionDTO.id;
            }
            if ((i11 & 2) != 0) {
                action = accessActionDTO.action;
            }
            return accessActionDTO.copy(j11, action);
        }

        /* renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        @NotNull
        public final AccessActionDTO copy(long id2, @NotNull Action action) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new AccessActionDTO(id2, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccessActionDTO)) {
                return false;
            }
            AccessActionDTO accessActionDTO = (AccessActionDTO) other;
            return this.id == accessActionDTO.id && Intrinsics.d(this.action, accessActionDTO.action);
        }

        @NotNull
        public final Action getAction() {
            return this.action;
        }

        public final long getId() {
            return this.id;
        }

        public int hashCode() {
            return this.action.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "AccessActionDTO(id=" + this.id + ", action=" + this.action + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel$Action;", "", "<init>", "()V", "Loading", "Success", "Failure", "Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel$Action$Failure;", "Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel$Action$Loading;", "Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel$Action$Success;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel$Action$Failure;", "Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel$Action;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Failure extends Action {

            @NotNull
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(@NotNull Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Failure) && Intrinsics.d(this.throwable, ((Failure) other).throwable);
            }

            @NotNull
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            @NotNull
            public String toString() {
                return a.c("Failure(throwable=", ")", this.throwable);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel$Action$Loading;", "Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel$Action;", "<init>", "()V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Loading extends Action {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel$Action$Success;", "Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel$Action;", "<init>", "()V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Success extends Action {

            @NotNull
            public static final Success INSTANCE = new Success();

            private Success() {
                super(null);
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccessControlAction.values().length];
            try {
                iArr[AccessControlAction.REMOVE_USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccessControlAction.RESET_READ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccessControlAction.RESET_EDIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AccessControlViewModel(@NotNull FavoritesListsInteractor favoritesListsInteractor, @NotNull FeatureChecker featureChecker, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(favoritesListsInteractor, "favoritesListsInteractor");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.favoritesListsInteractor = favoritesListsInteractor;
        this.tokenizedAnalytics = tokenizedAnalytics;
        c<AccessActionDTO> c11 = c.c();
        Intrinsics.checkNotNullExpressionValue(c11, "create(...)");
        this.actionRelay = c11;
        this.disposables = new C8486a();
        this.link = "";
        this.params = U.c();
        this.wishlistsEnabled = featureChecker.isEnabled(FavoritesWishlistsEnabledFlag.INSTANCE);
        this.action = c11.hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeAccess$lambda$0(AccessControlViewModel accessControlViewModel, long j11) {
        accessControlViewModel.actionRelay.accept(new AccessActionDTO(j11, Action.Success.INSTANCE));
    }

    private final void sendConfirmChangeAccessAnalytics(long id2) {
        Map<String, TokenizedTrackingInfo> map = this.resetAccessTrackingInfo;
        if (map != null) {
            Long valueOf = Long.valueOf(id2);
            Intrinsics.checkNotNullParameter(map, "<this>");
            t b11 = x.b(map, valueOf, null);
            if (b11 == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, b11, null, 2, null);
            this.resetAccessTrackingInfo = null;
        }
    }

    @NotNull
    public final AlertDialogFragment.Params buildParams(@NotNull AtomAction.ComposerAction action, @NotNull String name, String listName) {
        Integer valueOf;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(name, "name");
        this.link = action.getActionName();
        Map<String, String> params = action.getParams();
        if (params == null) {
            params = U.c();
        }
        this.params = params;
        this.resetAccessTrackingInfo = action.getTrackingInfo();
        String string = StringProvider.getString(R$string.access_control_list_pattern_android, listName);
        String str = null;
        if (listName == null || listName.length() == 0) {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        int i11 = R$style.OzAlertDialog_Danger;
        AccessControlAction.Companion companion = AccessControlAction.INSTANCE;
        AccessControlAction fromValue = companion.fromValue(action.getId());
        int i12 = fromValue == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fromValue.ordinal()];
        if (i12 == 1) {
            valueOf = Integer.valueOf(R$string.access_control_list_remove_user_title);
        } else if (i12 != 2) {
            valueOf = i12 != 3 ? null : Integer.valueOf(R$string.access_control_list_disable_joint_access_title);
        } else {
            valueOf = Integer.valueOf(this.wishlistsEnabled ? R$string.access_control_wishlist_reset_access_title : R$string.access_control_list_reset_access_title);
        }
        AccessControlAction fromValue2 = companion.fromValue(action.getId());
        int i13 = fromValue2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fromValue2.ordinal()];
        if (i13 == 1) {
            str = StringProvider.getString(this.wishlistsEnabled ? R$string.access_control_wishlist_remove_user_message : R$string.access_control_list_remove_user_message_android, name, string);
        } else if (i13 == 2) {
            str = StringProvider.getString(this.wishlistsEnabled ? R$string.access_control_wishlist_reset_access_message : R$string.access_control_list_reset_access_message);
        } else if (i13 == 3) {
            str = StringProvider.getString(R$string.access_control_list_disable_joint_access_message);
        }
        int i14 = R$string.common_action_cancel;
        AccessControlAction fromValue3 = companion.fromValue(action.getId());
        int i15 = fromValue3 != null ? WhenMappings.$EnumSwitchMapping$0[fromValue3.ordinal()] : -1;
        return new AlertDialogFragment.Params(null, str, valueOf, null, i15 != 1 ? i15 != 2 ? i15 != 3 ? ru.ozon.app.android.uikit.R$string.common_action_ok : ru.ozon.app.android.uikit.R$string.access_control_action_disable : ru.ozon.app.android.uikit.R$string.access_control_action_reset : ru.ozon.app.android.uikit.R$string.common_action_delete, null, Integer.valueOf(i14), i11, 40, null);
    }

    public final void changeAccess(final long requestId) {
        this.actionRelay.accept(new AccessActionDTO(requestId, Action.Loading.INSTANCE));
        sendConfirmChangeAccessAnalytics(requestId);
        C8486a c8486a = this.disposables;
        vc.l lVar = new vc.l(this.favoritesListsInteractor.changeAccess(this.link, this.params).k(Mc.a.b()), C8125a.a());
        i iVar = new i(new H2.c(new AccessControlViewModel$changeAccess$2(this, requestId), 2), new InterfaceC9019a() { // from class: Ps.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                AccessControlViewModel.changeAccess$lambda$0(AccessControlViewModel.this, requestId);
            }
        });
        lVar.a(iVar);
        Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, iVar);
    }

    @NotNull
    public final p<AccessActionDTO> getAction() {
        return this.action;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.disposables.dispose();
    }
}
