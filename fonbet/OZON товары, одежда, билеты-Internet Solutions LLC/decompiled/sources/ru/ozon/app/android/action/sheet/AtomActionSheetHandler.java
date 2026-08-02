package ru.ozon.app.android.action.sheet;

import W10.c;
import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\u0014J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00042\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/action/sheet/AtomActionSheetHandler;", "", "Lru/ozon/composer/ui/widget/l;", "viewItem", "", "setWidgetViewItem", "(Lru/ozon/composer/ui/widget/l;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "setTrackingData", "(LW10/c;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "handle", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "onBind", "()V", "clear", "SheetAction", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AtomActionSheetHandler {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class DefaultImpls {
        public static void clear(@NotNull AtomActionSheetHandler atomActionSheetHandler) {
        }

        public static void onBind(@NotNull AtomActionSheetHandler atomActionSheetHandler) {
        }

        public static void setTrackingData(@NotNull AtomActionSheetHandler atomActionSheetHandler, @NotNull c trackingData) {
            Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        }

        public static void setWidgetViewItem(@NotNull AtomActionSheetHandler atomActionSheetHandler, l lVar) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b2\b\u0086\u0081\u0002\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00014B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3¨\u00065"}, d2 = {"Lru/ozon/app/android/action/sheet/AtomActionSheetHandler$SheetAction;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "COMPOSER_ACTION", "TRAVEL_RESULT_ACTION", "SHARE", "SHARE_LINK", "REMOVE_FROM_LIST", "SUBSCRIBE_TO_STOCK", "UNSUBSCRIBE_FROM_STOCK", "ADD_TO_CART", "FAVORITES_SHARE_LIST", "DELETE_LIST", "PIN_LIST", "UNPIN_LIST", "FAVORITE_CREATE_LIST", "FAVORITE_SELLER_ADD", "FAVORITE_SELLER_REMOVE", "ADD_TO_FAVORITE_ENTITY", "REMOVE_FROM_FAVORITE_ENTITY", "VOTE_QUESTION", "VOTE_ANSWER_LIKE", "VOTE_ANSWER_DISLIKE", "REPORT_QUESTION", "REPORT_ANSWER", "MAKE_ANSWER_BEST", "MAKE_QUESTION_ANONYMOUS", "MAKE_ANSWER_ANONYMOUS", "DELETE_QUESTION", "DELETE_ANSWER", "ADD_TO_COMPARISON", "REMOVE_FROM_COMPARISON", "DELETE_COMPARISON_LIST", "REMOVE_SPLIT", "DELETE_REVIEW", "MAKE_REVIEW_ANONYMOUS", "DELETE_COMMENT", "DELETE_ADDRESS", "SAVE_AND_CLOSE_PHOTOS", "SAVE_AND_CLOSE_CATEGORY", "SAVE_AND_CLOSE_PARAMETERS", "SAVE_AND_CLOSE_CHARACTERISTICS", "SAVE_AND_CLOSE_PRICE", "SAVE_AND_CLOSE_COMMUNICATION_WAYS", "SAVE_AND_CLOSE_PREVIEW", "SAVE_AND_CLOSE_DEPARTURE_CITY", "COMPOSER_ACTION_WITH_REFRESH", "Companion", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class SheetAction {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SheetAction[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @NotNull
        private static final Map<String, SheetAction> values;

        @NotNull
        private final String id;
        public static final SheetAction COMPOSER_ACTION = new SheetAction("COMPOSER_ACTION", 0, "composerActionWithRedirect");
        public static final SheetAction TRAVEL_RESULT_ACTION = new SheetAction("TRAVEL_RESULT_ACTION", 1, "travelResultAction");
        public static final SheetAction SHARE = new SheetAction("SHARE", 2, "share");
        public static final SheetAction SHARE_LINK = new SheetAction("SHARE_LINK", 3, "shareLink");
        public static final SheetAction REMOVE_FROM_LIST = new SheetAction("REMOVE_FROM_LIST", 4, "favoriteListRemove");
        public static final SheetAction SUBSCRIBE_TO_STOCK = new SheetAction("SUBSCRIBE_TO_STOCK", 5, "subscribeToStock");
        public static final SheetAction UNSUBSCRIBE_FROM_STOCK = new SheetAction("UNSUBSCRIBE_FROM_STOCK", 6, "unsubscribeFromStock");
        public static final SheetAction ADD_TO_CART = new SheetAction("ADD_TO_CART", 7, "addToCart");
        public static final SheetAction FAVORITES_SHARE_LIST = new SheetAction("FAVORITES_SHARE_LIST", 8, "favoriteShareList");
        public static final SheetAction DELETE_LIST = new SheetAction("DELETE_LIST", 9, "favoriteDeleteList");
        public static final SheetAction PIN_LIST = new SheetAction("PIN_LIST", 10, "favoriteListPin");
        public static final SheetAction UNPIN_LIST = new SheetAction("UNPIN_LIST", 11, "favoriteListUnpin");
        public static final SheetAction FAVORITE_CREATE_LIST = new SheetAction("FAVORITE_CREATE_LIST", 12, "favoriteCreateList");
        public static final SheetAction FAVORITE_SELLER_ADD = new SheetAction("FAVORITE_SELLER_ADD", 13, "favoriteSellerAdd");
        public static final SheetAction FAVORITE_SELLER_REMOVE = new SheetAction("FAVORITE_SELLER_REMOVE", 14, "favoriteSellerRemove");
        public static final SheetAction ADD_TO_FAVORITE_ENTITY = new SheetAction("ADD_TO_FAVORITE_ENTITY", 15, "favoriteEntityAdd");
        public static final SheetAction REMOVE_FROM_FAVORITE_ENTITY = new SheetAction("REMOVE_FROM_FAVORITE_ENTITY", 16, "favoriteEntityRemove");
        public static final SheetAction VOTE_QUESTION = new SheetAction("VOTE_QUESTION", 17, "voteQuestion");
        public static final SheetAction VOTE_ANSWER_LIKE = new SheetAction("VOTE_ANSWER_LIKE", 18, "voteAnswerLike");
        public static final SheetAction VOTE_ANSWER_DISLIKE = new SheetAction("VOTE_ANSWER_DISLIKE", 19, "voteAnswerDislike");
        public static final SheetAction REPORT_QUESTION = new SheetAction("REPORT_QUESTION", 20, "reportQuestion");
        public static final SheetAction REPORT_ANSWER = new SheetAction("REPORT_ANSWER", 21, "reportAnswer");
        public static final SheetAction MAKE_ANSWER_BEST = new SheetAction("MAKE_ANSWER_BEST", 22, "makeAnswerBest");
        public static final SheetAction MAKE_QUESTION_ANONYMOUS = new SheetAction("MAKE_QUESTION_ANONYMOUS", 23, "makeQuestionAnonymous");
        public static final SheetAction MAKE_ANSWER_ANONYMOUS = new SheetAction("MAKE_ANSWER_ANONYMOUS", 24, "makeAnswerAnonymous");
        public static final SheetAction DELETE_QUESTION = new SheetAction("DELETE_QUESTION", 25, "deleteQuestion");
        public static final SheetAction DELETE_ANSWER = new SheetAction("DELETE_ANSWER", 26, "deleteAnswer");
        public static final SheetAction ADD_TO_COMPARISON = new SheetAction("ADD_TO_COMPARISON", 27, "addToCompare");
        public static final SheetAction REMOVE_FROM_COMPARISON = new SheetAction("REMOVE_FROM_COMPARISON", 28, "removeFromCompare");
        public static final SheetAction DELETE_COMPARISON_LIST = new SheetAction("DELETE_COMPARISON_LIST", 29, "compareApiRemoveSkusFromCompareV1");
        public static final SheetAction REMOVE_SPLIT = new SheetAction("REMOVE_SPLIT", 30, "removeSplit");
        public static final SheetAction DELETE_REVIEW = new SheetAction("DELETE_REVIEW", 31, "rpDeleteMyReviewV2");
        public static final SheetAction MAKE_REVIEW_ANONYMOUS = new SheetAction("MAKE_REVIEW_ANONYMOUS", 32, "makeReviewAnonymousV2");
        public static final SheetAction DELETE_COMMENT = new SheetAction("DELETE_COMMENT", 33, "deleteComment");
        public static final SheetAction DELETE_ADDRESS = new SheetAction("DELETE_ADDRESS", 34, "deleteAddress");
        public static final SheetAction SAVE_AND_CLOSE_PHOTOS = new SheetAction("SAVE_AND_CLOSE_PHOTOS", 35, "saveAndClosePhotos");
        public static final SheetAction SAVE_AND_CLOSE_CATEGORY = new SheetAction("SAVE_AND_CLOSE_CATEGORY", 36, "saveAndCloseCategory");
        public static final SheetAction SAVE_AND_CLOSE_PARAMETERS = new SheetAction("SAVE_AND_CLOSE_PARAMETERS", 37, "saveAndCloseParameters");
        public static final SheetAction SAVE_AND_CLOSE_CHARACTERISTICS = new SheetAction("SAVE_AND_CLOSE_CHARACTERISTICS", 38, "saveAndCloseCharacteristics");
        public static final SheetAction SAVE_AND_CLOSE_PRICE = new SheetAction("SAVE_AND_CLOSE_PRICE", 39, "saveAndClosePrice");
        public static final SheetAction SAVE_AND_CLOSE_COMMUNICATION_WAYS = new SheetAction("SAVE_AND_CLOSE_COMMUNICATION_WAYS", 40, "saveAndCloseCommunicationWays");
        public static final SheetAction SAVE_AND_CLOSE_PREVIEW = new SheetAction("SAVE_AND_CLOSE_PREVIEW", 41, "saveAndClosePreview");
        public static final SheetAction SAVE_AND_CLOSE_DEPARTURE_CITY = new SheetAction("SAVE_AND_CLOSE_DEPARTURE_CITY", 42, "saveAndCloseDispatchCity");
        public static final SheetAction COMPOSER_ACTION_WITH_REFRESH = new SheetAction("COMPOSER_ACTION_WITH_REFRESH", 43, "composerActionWithRefresh");

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/action/sheet/AtomActionSheetHandler$SheetAction$Companion;", "", "<init>", "()V", "values", "", "", "Lru/ozon/app/android/action/sheet/AtomActionSheetHandler$SheetAction;", "getValues", "()Ljava/util/Map;", "fromValue", AppMeasurementSdk.ConditionalUserProperty.VALUE, "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SheetAction fromValue(String value) {
                if (value != null) {
                    return SheetAction.INSTANCE.getValues().get(value);
                }
                return null;
            }

            @NotNull
            public final Map<String, SheetAction> getValues() {
                return SheetAction.values;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ SheetAction[] $values() {
            return new SheetAction[]{COMPOSER_ACTION, TRAVEL_RESULT_ACTION, SHARE, SHARE_LINK, REMOVE_FROM_LIST, SUBSCRIBE_TO_STOCK, UNSUBSCRIBE_FROM_STOCK, ADD_TO_CART, FAVORITES_SHARE_LIST, DELETE_LIST, PIN_LIST, UNPIN_LIST, FAVORITE_CREATE_LIST, FAVORITE_SELLER_ADD, FAVORITE_SELLER_REMOVE, ADD_TO_FAVORITE_ENTITY, REMOVE_FROM_FAVORITE_ENTITY, VOTE_QUESTION, VOTE_ANSWER_LIKE, VOTE_ANSWER_DISLIKE, REPORT_QUESTION, REPORT_ANSWER, MAKE_ANSWER_BEST, MAKE_QUESTION_ANONYMOUS, MAKE_ANSWER_ANONYMOUS, DELETE_QUESTION, DELETE_ANSWER, ADD_TO_COMPARISON, REMOVE_FROM_COMPARISON, DELETE_COMPARISON_LIST, REMOVE_SPLIT, DELETE_REVIEW, MAKE_REVIEW_ANONYMOUS, DELETE_COMMENT, DELETE_ADDRESS, SAVE_AND_CLOSE_PHOTOS, SAVE_AND_CLOSE_CATEGORY, SAVE_AND_CLOSE_PARAMETERS, SAVE_AND_CLOSE_CHARACTERISTICS, SAVE_AND_CLOSE_PRICE, SAVE_AND_CLOSE_COMMUNICATION_WAYS, SAVE_AND_CLOSE_PREVIEW, SAVE_AND_CLOSE_DEPARTURE_CITY, COMPOSER_ACTION_WITH_REFRESH};
        }

        static {
            SheetAction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
            INSTANCE = new Companion(null);
            SheetAction[] values2 = values();
            int h11 = U.h(values2.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(h11 >= 16 ? h11 : 16);
            for (SheetAction sheetAction : values2) {
                linkedHashMap.put(sheetAction.id, sheetAction);
            }
            values = linkedHashMap;
        }

        private SheetAction(String str, int i11, String str2) {
            this.id = str2;
        }

        public static SheetAction valueOf(String str) {
            return (SheetAction) Enum.valueOf(SheetAction.class, str);
        }

        public static SheetAction[] values() {
            return (SheetAction[]) $VALUES.clone();
        }

        @NotNull
        public final String getId() {
            return this.id;
        }
    }

    void clear();

    boolean handle(@NotNull AtomAction action);

    void onBind();

    void setTrackingData(@NotNull c trackingData);

    void setWidgetViewItem(l viewItem);
}
