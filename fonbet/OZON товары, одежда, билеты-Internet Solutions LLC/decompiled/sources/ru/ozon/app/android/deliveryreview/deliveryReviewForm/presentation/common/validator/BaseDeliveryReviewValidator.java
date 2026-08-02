package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.validator;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewItemVO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0004¨\u0006\r"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator;", "", "<init>", "()V", "validate", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator$ValidationResult;", "groups", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewItemVO;", "selected", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO;", "ValidationResult", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BaseDeliveryReviewValidator {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator$ValidationResult;", "", "<init>", "()V", "Success", "EmptyWithCheckboxError", "Error", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator$ValidationResult$EmptyWithCheckboxError;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator$ValidationResult$Error;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator$ValidationResult$Success;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ValidationResult {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator$ValidationResult$EmptyWithCheckboxError;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator$ValidationResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class EmptyWithCheckboxError extends ValidationResult {

            @NotNull
            public static final EmptyWithCheckboxError INSTANCE = new EmptyWithCheckboxError();

            private EmptyWithCheckboxError() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof EmptyWithCheckboxError);
            }

            public int hashCode() {
                return -1531133691;
            }

            @NotNull
            public String toString() {
                return "EmptyWithCheckboxError";
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator$ValidationResult$Error;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator$ValidationResult;", "errorGroupId", "", "position", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getErrorGroupId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPosition", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Error extends ValidationResult {
            private final Integer errorGroupId;
            private final Integer position;

            /* JADX WARN: Multi-variable type inference failed */
            public Error() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public final Integer getErrorGroupId() {
                return this.errorGroupId;
            }

            public final Integer getPosition() {
                return this.position;
            }

            public Error(Integer num, Integer num2) {
                super(null);
                this.errorGroupId = num;
                this.position = num2;
            }

            public /* synthetic */ Error(Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator$ValidationResult$Success;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/validator/BaseDeliveryReviewValidator$ValidationResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends ValidationResult {

            @NotNull
            public static final Success INSTANCE = new Success();

            private Success() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Success);
            }

            public int hashCode() {
                return -1919439248;
            }

            @NotNull
            public String toString() {
                return "Success";
            }
        }

        public /* synthetic */ ValidationResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ValidationResult() {
        }
    }

    protected final boolean selected(@NotNull ElementVO elementVO) {
        List<String> values;
        Intrinsics.checkNotNullParameter(elementVO, "<this>");
        if (elementVO instanceof ElementVO.Checkbox) {
            return ((ElementVO.Checkbox) elementVO).getIsSelected();
        }
        if (elementVO instanceof ElementVO.Radio) {
            return ((ElementVO.Radio) elementVO).getIsSelected();
        }
        if (!(elementVO instanceof ElementVO.Carousel)) {
            if (elementVO instanceof ElementVO.Textarea) {
                String value = ((ElementVO.Textarea) elementVO).getValue();
                return (value != null ? value.length() : 0) >= 5;
            }
            if (!(elementVO instanceof ElementVO.Toggle)) {
                return (elementVO instanceof ElementVO.UploadPhotos) && (values = ((ElementVO.UploadPhotos) elementVO).getValues()) != null && (values.isEmpty() ^ true);
            }
            ElementVO.Toggle toggle = (ElementVO.Toggle) elementVO;
            Boolean byUserSelected = toggle.getByUserSelected();
            return byUserSelected != null ? byUserSelected.booleanValue() : toggle.getIsSelected();
        }
        List<ElementVO.Carousel.Item> list = ((ElementVO.Carousel) elementVO).getList();
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((ElementVO.Carousel.Item) it.next()).getIsSelected()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public abstract ValidationResult validate(@NotNull List<? extends DeliveryReviewItemVO> groups);
}
