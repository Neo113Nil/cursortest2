package ru.ozon.app.android.account.orders.recipientWidget.presentation;

import B0.A0;
import androidx.lifecycle.P;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b`\u0018\u00002\u00020\u0001:\u0001\u001fJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016¨\u0006 "}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewModel;", "", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO;", "item", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "phone", "", "changeRecipient", "(Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO;Ljava/lang/String;Ljava/lang/String;)V", "newName", "nameIsChanged", "(Ljava/lang/String;)V", "newPhone", "phoneIsChanged", "", "isEnabled", "setNameInputValidationEnabled", "(Z)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewModel$ChangeRecipientResult;", "getChangeRecipientResult", "()Landroidx/lifecycle/P;", "changeRecipientResult", "getLoader", "loader", "isSaveButtonEnabled", "getErrorForName", "errorForName", "getErrorForPhone", "errorForPhone", "ChangeRecipientResult", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface RecipientViewModel {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewModel$ChangeRecipientResult;", "", "Success", "Error", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewModel$ChangeRecipientResult$Error;", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewModel$ChangeRecipientResult$Success;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ChangeRecipientResult {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewModel$ChangeRecipientResult$Error;", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewModel$ChangeRecipientResult;", "", "toastMessage", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToastMessage", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements ChangeRecipientResult {
            private final String toastMessage;

            public Error(String str) {
                this.toastMessage = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.d(this.toastMessage, ((Error) other).toastMessage);
            }

            public final String getToastMessage() {
                return this.toastMessage;
            }

            public int hashCode() {
                String str = this.toastMessage;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Error(toastMessage=", this.toastMessage, ")");
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewModel$ChangeRecipientResult$Success;", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewModel$ChangeRecipientResult;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success implements ChangeRecipientResult {
            private final String message;

            public Success(String str) {
                this.message = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.d(this.message, ((Success) other).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                String str = this.message;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Success(message=", this.message, ")");
            }
        }
    }

    void changeRecipient(@NotNull RecipientVO item, @NotNull String name, @NotNull String phone);

    @NotNull
    P<ChangeRecipientResult> getChangeRecipientResult();

    @NotNull
    P<String> getErrorForName();

    @NotNull
    P<String> getErrorForPhone();

    @NotNull
    P<Boolean> getLoader();

    @NotNull
    P<Boolean> isSaveButtonEnabled();

    void nameIsChanged(@NotNull String newName);

    void phoneIsChanged(@NotNull String newPhone);

    void setNameInputValidationEnabled(boolean isEnabled);
}
