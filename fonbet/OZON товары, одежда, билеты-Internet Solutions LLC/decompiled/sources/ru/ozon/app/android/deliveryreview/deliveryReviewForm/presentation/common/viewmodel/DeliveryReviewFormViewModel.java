package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel;

import Ae.M0;
import B0.A0;
import Kk.c;
import androidx.lifecycle.P;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.model.ControllingToggleState;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator.BaseDeliveryReviewValidator;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewItemVO;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u00019J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H&¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010!\u001a\u00020\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\t2\u0006\u0010 \u001a\u00020\u0013H&¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0007H&¢\u0006\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010)R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020/0&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010)R\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010)R \u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\t058&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewItemVO;", "group", "", "updateGroup", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewItemVO;)V", "", "componentId", "", "photos", "updatePhotos", "(Ljava/lang/String;Ljava/util/List;)V", "", "rating", "updateRating", "(I)V", "dependedComponentId", "selectControllingComponentId", "", "checked", "updateToggleSelection", "(Ljava/lang/String;Ljava/lang/String;Z)V", "actionName", "", "params", "sendForm", "(Ljava/lang/String;Ljava/util/Map;)V", "resetValidation", "()V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "list", "isChecked", "updateInformersList", "(Ljava/util/List;Z)V", "text", "updateAnnotationAfterUseTextArea", "(Ljava/lang/String;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator$ValidationResult;", "getValidation", "()Landroidx/lifecycle/P;", DeleteAccountApiResponse.Error.TYPE_VALIDATION, "getScroll", "scroll", "getLoadingState", "loadingState", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel$Action;", "getAction", "action", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/model/ControllingToggleState;", "getControllingToggleState", "controllingToggleState", "LAe/M0;", "getInformerList", "()LAe/M0;", "informerList", "Action", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface DeliveryReviewFormViewModel {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel$Action;", "", "<init>", "()V", "Error", "Success", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel$Action$Error;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel$Action$Success;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel$Action$Error;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel$Action;", "", "msg", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMsg", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends Action {

            @NotNull
            private final String msg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull String msg) {
                super(null);
                Intrinsics.checkNotNullParameter(msg, "msg");
                this.msg = msg;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.d(this.msg, ((Error) other).msg);
            }

            @NotNull
            public final String getMsg() {
                return this.msg;
            }

            public int hashCode() {
                return this.msg.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Error(msg=", this.msg, ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel$Action$Success;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends Action {

            @NotNull
            private final AtomAction action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull AtomAction action) {
                super(null);
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.d(this.action, ((Success) other).action);
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
                return c.e("Success(action=", ")", this.action);
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @NotNull
    P<Action> getAction();

    @NotNull
    P<ControllingToggleState> getControllingToggleState();

    @NotNull
    M0<List<TextDTO>> getInformerList();

    @NotNull
    P<Boolean> getLoadingState();

    @NotNull
    P<Integer> getScroll();

    @NotNull
    P<BaseDeliveryReviewValidator.ValidationResult> getValidation();

    void resetValidation();

    void sendForm(@NotNull String actionName, Map<String, String> params);

    void updateAnnotationAfterUseTextArea(@NotNull String text);

    void updateGroup(@NotNull DeliveryReviewItemVO group);

    void updateInformersList(@NotNull List<TextDTO> list, boolean isChecked);

    void updatePhotos(@NotNull String componentId, @NotNull List<String> photos);

    void updateRating(int rating);

    void updateToggleSelection(@NotNull String dependedComponentId, @NotNull String selectControllingComponentId, boolean checked);
}
