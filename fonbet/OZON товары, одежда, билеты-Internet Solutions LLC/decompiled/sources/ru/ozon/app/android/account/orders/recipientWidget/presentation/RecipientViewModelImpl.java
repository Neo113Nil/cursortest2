package ru.ozon.app.android.account.orders.recipientWidget.presentation;

import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeManager;
import ru.ozon.app.android.account.orders.recipientWidget.data.ChangeRecipientRepository;
import ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewModel;
import ru.ozon.app.android.cs_orders.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.C10727i;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00182\u0006\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010!J\u0017\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R \u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u00100\u001a\b\u0012\u0004\u0012\u00020\t0/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u00104\u001a\b\u0012\u0004\u0012\u00020\t0/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R \u00106\u001a\b\u0012\u0004\u0012\u00020\f0/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R \u00108\u001a\b\u0012\u0004\u0012\u00020\f0/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b8\u00103R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00109R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0016\u0010:\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewModel;", "Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRecipientRepository;", "repository", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeManager;", "orderChangeManager", "<init>", "(Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRecipientRepository;Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeManager;)V", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "phone", "", "validate", "(Ljava/lang/String;Ljava/lang/String;)Z", "checkLastNameAndSecondNameIsCorrect", "(Ljava/lang/String;)Z", "", "checkButtonEnable", "()V", "isNameNotBlank", "()Z", "isPhoneCorrect", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lkotlin/Pair;", "getFirstAndLastName", "(Ljava/lang/String;)Lkotlin/Pair;", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO;", "item", "changeRecipient", "(Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO;Ljava/lang/String;Ljava/lang/String;)V", "newName", "nameIsChanged", "(Ljava/lang/String;)V", "newPhone", "phoneIsChanged", "isEnabled", "setNameInputValidationEnabled", "(Z)V", "Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRecipientRepository;", "Lru/ozon/app/android/account/orders/onorderchangenew/OrderChangeManager;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewModel$ChangeRecipientResult;", "changeRecipientResult", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getChangeRecipientResult", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/V;", "errorForName", "Landroidx/lifecycle/V;", "getErrorForName", "()Landroidx/lifecycle/V;", "errorForPhone", "getErrorForPhone", "loader", "getLoader", "isSaveButtonEnabled", "Ljava/lang/String;", "isNameInputValidationEnabled", "Z", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RecipientViewModelImpl extends w0 implements RecipientViewModel {

    @NotNull
    private final SingleLiveEvent<RecipientViewModel.ChangeRecipientResult> changeRecipientResult;

    @NotNull
    private final V<String> errorForName;

    @NotNull
    private final V<String> errorForPhone;
    private boolean isNameInputValidationEnabled;

    @NotNull
    private final V<Boolean> isSaveButtonEnabled;

    @NotNull
    private final V<Boolean> loader;

    @NotNull
    private String name;

    @NotNull
    private final OrderChangeManager orderChangeManager;

    @NotNull
    private String phone;

    @NotNull
    private final ChangeRecipientRepository repository;

    public RecipientViewModelImpl(@NotNull ChangeRecipientRepository repository, @NotNull OrderChangeManager orderChangeManager) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(orderChangeManager, "orderChangeManager");
        this.repository = repository;
        this.orderChangeManager = orderChangeManager;
        this.changeRecipientResult = new SingleLiveEvent<>();
        this.errorForName = new V<>();
        this.errorForPhone = new V<>();
        this.loader = new V<>();
        this.isSaveButtonEnabled = new V<>();
        this.name = "";
        this.phone = "";
    }

    private final void checkButtonEnable() {
        isSaveButtonEnabled().setValue(Boolean.valueOf((!this.isNameInputValidationEnabled || isNameNotBlank()) && isPhoneCorrect()));
    }

    private final boolean checkLastNameAndSecondNameIsCorrect(String str) {
        List m11 = h.m(str, new String[]{" "}, 0, 6);
        return m11.size() > 1 && ((CharSequence) m11.get(0)).length() > 0 && ((CharSequence) m11.get(1)).length() > 0;
    }

    private final Pair<String, String> getFirstAndLastName(String value) {
        List m11 = h.m(value, new String[]{" "}, 0, 6);
        String str = (String) C7714v.Q(0, m11);
        if (str == null) {
            str = "";
        }
        String str2 = (String) C7714v.Q(1, m11);
        return new Pair<>(str, str2 != null ? str2 : "");
    }

    private final boolean isNameNotBlank() {
        int length = this.name.length();
        return 1 <= length && length < 80;
    }

    private final boolean isPhoneCorrect() {
        int length = this.phone.length();
        return 1 <= length && length < 17;
    }

    private final boolean validate(String name, String phone) {
        if (this.isNameInputValidationEnabled && name.length() == 0 && phone.length() > 0) {
            getErrorForName().setValue(StringProvider.getString(R$string.error_recipient_enter_name));
            return false;
        }
        if (name.length() > 0 && phone.length() == 0) {
            getErrorForPhone().setValue(StringProvider.getString(R$string.error_recipient_enter_phone));
            return false;
        }
        if (this.isNameInputValidationEnabled && name.length() > 80) {
            getErrorForName().setValue(StringProvider.getString(R$string.error_recipient_name));
            return false;
        }
        if (phone.length() < 5 || phone.length() > 16) {
            getErrorForPhone().setValue(StringProvider.getString(R$string.error_recipient_phone));
            return false;
        }
        if (!this.isNameInputValidationEnabled || checkLastNameAndSecondNameIsCorrect(name)) {
            return true;
        }
        getErrorForName().setValue(StringProvider.getString(R$string.error_recipient_enter_name));
        return false;
    }

    @Override // ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewModel
    public void changeRecipient(@NotNull RecipientVO item, @NotNull String name, @NotNull String phone) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Pair<String, String> firstAndLastName = getFirstAndLastName(name);
        if (validate(name, phone)) {
            C10727i.c(x0.a(this), null, null, new RecipientViewModelImpl$changeRecipient$1(this, item, firstAndLastName, phone, null), 3);
        }
    }

    @Override // ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewModel
    public void nameIsChanged(@NotNull String newName) {
        Intrinsics.checkNotNullParameter(newName, "newName");
        getErrorForName().setValue(null);
        this.name = newName;
        checkButtonEnable();
    }

    @Override // ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewModel
    public void phoneIsChanged(@NotNull String newPhone) {
        String deleteAllExceptNumbers;
        Intrinsics.checkNotNullParameter(newPhone, "newPhone");
        getErrorForPhone().setValue(null);
        deleteAllExceptNumbers = RecipientViewModelKt.deleteAllExceptNumbers(newPhone);
        this.phone = deleteAllExceptNumbers;
        checkButtonEnable();
    }

    @Override // ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewModel
    public void setNameInputValidationEnabled(boolean isEnabled) {
        this.isNameInputValidationEnabled = isEnabled;
    }

    @Override // ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewModel
    @NotNull
    public SingleLiveEvent<RecipientViewModel.ChangeRecipientResult> getChangeRecipientResult() {
        return this.changeRecipientResult;
    }

    @Override // ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewModel
    @NotNull
    public V<String> getErrorForName() {
        return this.errorForName;
    }

    @Override // ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewModel
    @NotNull
    public V<String> getErrorForPhone() {
        return this.errorForPhone;
    }

    @Override // ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewModel
    @NotNull
    public V<Boolean> getLoader() {
        return this.loader;
    }

    @Override // ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewModel
    @NotNull
    public V<Boolean> isSaveButtonEnabled() {
        return this.isSaveButtonEnabled;
    }
}
