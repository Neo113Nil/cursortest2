package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation;

import Ae.O0;
import Ae.x0;
import Kk.c;
import Nh.a;
import V.e;
import WZ.b;
import WZ.t;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7747g;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.cart.common.models.events.ProductTokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.common.models.events.TokenizedCartAnalyticsEvent;
import ru.ozon.app.android.cart.common.models.events.TokenizedCartType;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.data.DataForReorder;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.data.ReorderProductItem;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u0000 82\u00020\u00012\u00020\u0002:\u000289B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d0\u001c*\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010H\u0082@¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\"\u0010!J\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010%J!\u0010'\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020&2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R \u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u00104\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModel;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/cart/common/domain/CartService;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "LW10/c;", "trackingData", "", "handleComposerActionWithAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;LW10/c;)V", "handleComposerActionWithRedirect", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/DataForReorder;", "data", "", "id", "", "Lru/ozon/app/android/cart/common/models/events/ProductTokenizedCartAnalyticsEvent;", "mapToAnalyticEvents", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/DataForReorder;Ljava/lang/Long;)Ljava/util/List;", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "toMap", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/DataForReorder;)Ljava/util/Map;", "showLoader", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "hideLoader", "Lru/ozon/uni/atoms/af/AtomAction;", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;LW10/c;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "reorder", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/lang/Long;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action;", "actions", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getActions", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "LAe/x0;", "", "loaderState", "LAe/x0;", "getLoaderState", "()LAe/x0;", "Companion", "Action", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDoneButtonBarViewModelImpl extends w0 implements OrderDoneButtonBarViewModel {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final SingleLiveEvent<Action> actions;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final x0<Boolean> loaderState;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action;", "", "OpenCart", "InvokeAction", "ShowMessage", "Redirect", "ShowRestrictionMessage", "ShowNotification", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action$InvokeAction;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action$OpenCart;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action$Redirect;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action$ShowMessage;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action$ShowNotification;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action$ShowRestrictionMessage;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Action {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action$InvokeAction;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvokeAction implements Action {
            public static final int $stable = AtomAction.$stable;

            @NotNull
            private final AtomAction action;

            public InvokeAction(@NotNull AtomAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InvokeAction) && Intrinsics.d(this.action, ((InvokeAction) other).action);
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return c.e("InvokeAction(action=", ")", this.action);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action$OpenCart;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OpenCart implements Action {

            @NotNull
            public static final OpenCart INSTANCE = new OpenCart();

            private OpenCart() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof OpenCart);
            }

            public int hashCode() {
                return -240679927;
            }

            @NotNull
            public String toString() {
                return "OpenCart";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action$Redirect;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action;", "", "redirectLink", "refreshLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRedirectLink", "getRefreshLink", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Redirect implements Action {
            private final String redirectLink;
            private final String refreshLink;

            public Redirect(String str, String str2) {
                this.redirectLink = str;
                this.refreshLink = str2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Redirect)) {
                    return false;
                }
                Redirect redirect = (Redirect) other;
                return Intrinsics.d(this.redirectLink, redirect.redirectLink) && Intrinsics.d(this.refreshLink, redirect.refreshLink);
            }

            public final String getRedirectLink() {
                return this.redirectLink;
            }

            public int hashCode() {
                String str = this.redirectLink;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.refreshLink;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return e.a("Redirect(redirectLink=", this.redirectLink, ", refreshLink=", this.refreshLink, ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action$ShowMessage;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;", "message", "<init>", "(Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;", "getMessage", "()Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowMessage implements Action {

            @NotNull
            private final ComposerActionWithActionDTO.MessageDTO message;

            public ShowMessage(@NotNull ComposerActionWithActionDTO.MessageDTO message) {
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowMessage) && Intrinsics.d(this.message, ((ShowMessage) other).message);
            }

            @NotNull
            public final ComposerActionWithActionDTO.MessageDTO getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            @NotNull
            public String toString() {
                return "ShowMessage(message=" + this.message + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action$ShowNotification;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "data", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getData", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowNotification implements Action {
            public static final int $stable = NotificationDTO.$stable;
            private final NotificationDTO data;

            public ShowNotification(NotificationDTO notificationDTO) {
                this.data = notificationDTO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowNotification) && Intrinsics.d(this.data, ((ShowNotification) other).data);
            }

            public final NotificationDTO getData() {
                return this.data;
            }

            public int hashCode() {
                NotificationDTO notificationDTO = this.data;
                if (notificationDTO == null) {
                    return 0;
                }
                return notificationDTO.hashCode();
            }

            @NotNull
            public String toString() {
                return a.e("ShowNotification(data=", ")", this.data);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action$ShowRestrictionMessage;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action;", "Lru/ozon/uni/android/flashbar/model/Restriction;", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "<init>", "(Lru/ozon/uni/android/flashbar/model/Restriction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/flashbar/model/Restriction;", "getRestriction", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowRestrictionMessage implements Action {
            public static final int $stable = Restriction.$stable;
            private final Restriction restriction;

            public ShowRestrictionMessage(Restriction restriction) {
                this.restriction = restriction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowRestrictionMessage) && Intrinsics.d(this.restriction, ((ShowRestrictionMessage) other).restriction);
            }

            public final Restriction getRestriction() {
                return this.restriction;
            }

            public int hashCode() {
                Restriction restriction = this.restriction;
                if (restriction == null) {
                    return 0;
                }
                return restriction.hashCode();
            }

            @NotNull
            public String toString() {
                return "ShowRestrictionMessage(restriction=" + this.restriction + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Companion;", "", "<init>", "()V", "PARAM_REORDER_INFO", "", "ACTION_WITH_REDIRECT_ID", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OrderDoneButtonBarViewModelImpl(@NotNull ActionV2Repository actionV2Repository, @NotNull JsonParser jsonDeserializer, @NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.actionV2Repository = actionV2Repository;
        this.jsonDeserializer = jsonDeserializer;
        this.cartService = cartService;
        this.actions = new SingleLiveEvent<>();
        this.loaderState = O0.a(Boolean.FALSE);
    }

    private final void handleComposerActionWithAction(AtomAction.ComposerAction action, W10.c trackingData) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new OrderDoneButtonBarViewModelImpl$handleComposerActionWithAction$1(this, new ActionV2Request(action.getParams(), action.getActionName(), false, 4, null), trackingData, null), 3);
    }

    private final void handleComposerActionWithRedirect(AtomAction.ComposerAction action, W10.c trackingData) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new OrderDoneButtonBarViewModelImpl$handleComposerActionWithRedirect$1(this, new ActionV2Request(action.getParams(), action.getActionName(), false, 4, null), trackingData, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object hideLoader(d<? super Unit> dVar) {
        Object emit = getLoaderState().emit(Boolean.FALSE, dVar);
        return emit == Wc.a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ProductTokenizedCartAnalyticsEvent> mapToAnalyticEvents(DataForReorder data, Long id2) {
        t tokenizedEvent$default;
        List<ReorderProductItem> products = data.getProducts();
        ArrayList arrayList = new ArrayList();
        for (ReorderProductItem reorderProductItem : products) {
            Map<String, TokenizedTrackingInfo> toCartTrackingInfo = reorderProductItem.getToCartTrackingInfo();
            ProductTokenizedCartAnalyticsEvent productTokenizedCartAnalyticsEvent = null;
            if (toCartTrackingInfo != null && (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(toCartTrackingInfo, id2, null, 2, null)) != null) {
                productTokenizedCartAnalyticsEvent = new ProductTokenizedCartAnalyticsEvent(Long.parseLong(reorderProductItem.getSku()), new TokenizedCartAnalyticsEvent(new TokenizedCartType.FilterCartType(b.f33354a), tokenizedEvent$default));
            }
            if (productTokenizedCartAnalyticsEvent != null) {
                arrayList.add(productTokenizedCartAnalyticsEvent);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showLoader(d<? super Unit> dVar) {
        Object emit = getLoaderState().emit(Boolean.TRUE, dVar);
        return emit == Wc.a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Long, CartItemInfo> toMap(DataForReorder dataForReorder) {
        C7747g h11 = l.h(C7714v.w(dataForReorder.getProducts()), OrderDoneButtonBarViewModelImpl$toMap$1.INSTANCE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = h11.iterator();
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                return linkedHashMap;
            }
            ReorderProductItem reorderProductItem = (ReorderProductItem) aVar.next();
            Pair pair = new Pair(Long.valueOf(Long.parseLong(reorderProductItem.getSku())), new CartItemInfo(reorderProductItem.getQuantity(), reorderProductItem.getSelectedDeliverySchema(), null, null, null, null, 60, null));
            linkedHashMap.put(pair.e(), pair.f());
        }
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarViewModel
    public void handleAction(@NotNull AtomAction action, @NotNull W10.c trackingData) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        if (action instanceof AtomAction.ComposerAction) {
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
            if (Intrinsics.d(composerAction.getId(), "composerActionWithRedirect")) {
                handleComposerActionWithRedirect(composerAction, trackingData);
            } else {
                handleComposerActionWithAction(composerAction, trackingData);
            }
        }
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarViewModel
    public void reorder(@NotNull AtomAction.Click action, Long id2) {
        String str;
        Intrinsics.checkNotNullParameter(action, "action");
        Map<String, String> params = action.getParams();
        if (params == null || (str = params.get("reOrderInfo")) == null) {
            return;
        }
        if (str.length() <= 0) {
            str = null;
        }
        if (str == null) {
            return;
        }
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new OrderDoneButtonBarViewModelImpl$reorder$1(this, str, id2, null), 3);
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarViewModel
    @NotNull
    public SingleLiveEvent<Action> getActions() {
        return this.actions;
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarViewModel
    @NotNull
    public x0<Boolean> getLoaderState() {
        return this.loaderState;
    }
}
