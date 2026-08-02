package ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment;

import androidx.lifecycle.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\f¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerFragmentViewModel;", "", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;", "option", "", "onSelect", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;)V", "onComplete", "()V", "Landroidx/lifecycle/P;", "", "getOptions", "()Landroidx/lifecycle/P;", "options", "Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerFragmentViewModel$Action;", "getAction", "action", "Action", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ModalPickerFragmentViewModel {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerFragmentViewModel$Action;", "", "<init>", "()V", "Complete", "Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerFragmentViewModel$Action$Complete;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerFragmentViewModel$Action$Complete;", "Lru/ozon/app/android/partpayment/formpage/view/modalpickerfragment/ModalPickerFragmentViewModel$Action;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;", "selectedOption", "<init>", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;", "getSelectedOption", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Options$Picker;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Complete extends Action {

            @NotNull
            private final FormPageVO.Field.Options.Picker selectedOption;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Complete(@NotNull FormPageVO.Field.Options.Picker selectedOption) {
                super(null);
                Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
                this.selectedOption = selectedOption;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Complete) && Intrinsics.d(this.selectedOption, ((Complete) other).selectedOption);
            }

            @NotNull
            public final FormPageVO.Field.Options.Picker getSelectedOption() {
                return this.selectedOption;
            }

            public int hashCode() {
                return this.selectedOption.hashCode();
            }

            @NotNull
            public String toString() {
                return "Complete(selectedOption=" + this.selectedOption + ")";
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
    P<List<FormPageVO.Field.Options.Picker>> getOptions();

    void onComplete();

    void onSelect(@NotNull FormPageVO.Field.Options.Picker option);
}
