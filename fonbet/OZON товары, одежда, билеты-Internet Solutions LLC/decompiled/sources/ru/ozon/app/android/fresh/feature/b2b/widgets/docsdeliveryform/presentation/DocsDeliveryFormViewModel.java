package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation;

import Ak.b;
import V.e;
import androidx.lifecycle.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormVO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\"#J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001b¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$TextInput;", "addressInput", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;", "inputs", "", "bindInputs", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$TextInput;Ljava/util/List;)V", "", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "updateAddress", "(Ljava/lang/String;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel$DeliveryFormData;", "deliveryFormData", "onDeliverySubmitted", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel$DeliveryFormData;)V", "fieldName", "newValue", "onTextInputChanged", "(Ljava/lang/String;Ljava/lang/String;)V", "", "onCheckedChanged", "(Ljava/lang/String;Z)V", "Landroidx/lifecycle/P;", "getAddressInput", "()Landroidx/lifecycle/P;", "getInputs", "getLoadingState", "loadingState", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel$Action;", "getAction", "action", "Action", "DeliveryFormData", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface DocsDeliveryFormViewModel {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel$Action;", "", "<init>", "()V", "ShowMessage", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel$Action$ShowMessage;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel$Action$ShowMessage;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel$Action;", "", "message", "", "dismissDialog", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Z", "getDismissDialog", "()Z", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowMessage extends Action {
            private final boolean dismissDialog;
            private final String message;

            /* JADX WARN: Multi-variable type inference failed */
            public ShowMessage() {
                this(null, false, 3, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowMessage)) {
                    return false;
                }
                ShowMessage showMessage = (ShowMessage) other;
                return Intrinsics.d(this.message, showMessage.message) && this.dismissDialog == showMessage.dismissDialog;
            }

            public final boolean getDismissDialog() {
                return this.dismissDialog;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                String str = this.message;
                return Boolean.hashCode(this.dismissDialog) + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @NotNull
            public String toString() {
                return b.f("ShowMessage(message=", this.message, ", dismissDialog=", ")", this.dismissDialog);
            }

            public ShowMessage(String str, boolean z11) {
                super(null);
                this.message = str;
                this.dismissDialog = z11;
            }

            public /* synthetic */ ShowMessage(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? false : z11);
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormViewModel$DeliveryFormData;", "", "", "orderId", "deliveryVariantId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrderId", "getDeliveryVariantId", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeliveryFormData {

        @NotNull
        private final String deliveryVariantId;

        @NotNull
        private final String orderId;

        public DeliveryFormData(@NotNull String orderId, @NotNull String deliveryVariantId) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(deliveryVariantId, "deliveryVariantId");
            this.orderId = orderId;
            this.deliveryVariantId = deliveryVariantId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeliveryFormData)) {
                return false;
            }
            DeliveryFormData deliveryFormData = (DeliveryFormData) other;
            return Intrinsics.d(this.orderId, deliveryFormData.orderId) && Intrinsics.d(this.deliveryVariantId, deliveryFormData.deliveryVariantId);
        }

        @NotNull
        public final String getDeliveryVariantId() {
            return this.deliveryVariantId;
        }

        @NotNull
        public final String getOrderId() {
            return this.orderId;
        }

        public int hashCode() {
            return this.deliveryVariantId.hashCode() + (this.orderId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("DeliveryFormData(orderId=", this.orderId, ", deliveryVariantId=", this.deliveryVariantId, ")");
        }
    }

    void bindInputs(@NotNull DocsDeliveryFormVO.Input.TextInput addressInput, @NotNull List<? extends DocsDeliveryFormVO.Input> inputs);

    @NotNull
    P<Action> getAction();

    @NotNull
    P<DocsDeliveryFormVO.Input.TextInput> getAddressInput();

    @NotNull
    P<List<DocsDeliveryFormVO.Input>> getInputs();

    @NotNull
    P<Boolean> getLoadingState();

    void onCheckedChanged(@NotNull String fieldName, boolean newValue);

    void onDeliverySubmitted(@NotNull DeliveryFormData deliveryFormData);

    void onTextInputChanged(@NotNull String fieldName, String newValue);

    void updateAddress(@NotNull String address);
}
