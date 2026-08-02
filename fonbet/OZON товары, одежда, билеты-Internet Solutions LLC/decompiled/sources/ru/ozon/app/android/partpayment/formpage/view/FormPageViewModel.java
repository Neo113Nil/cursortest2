package ru.ozon.app.android.partpayment.formpage.view;

import Ak.b;
import B0.A0;
import B90.C2618u;
import D3.g;
import N3.C3660k;
import android.content.Intent;
import androidx.lifecycle.P;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.screenstate.ScreenState;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002/0J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u000bJ'\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\rH&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\rH&¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\rH&¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\rH&¢\u0006\u0004\b\u0018\u0010\u0015J!\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u001a0\u0019H&¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H&¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H&¢\u0006\u0004\b(\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel;", "", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "force", "", "onFieldChanged", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;Z)V", "field", "onPickerClick", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;)V", "onButtonClick", "", AppMeasurementSdk.ConditionalUserProperty.NAME, ImagesContract.URL, SearchIntents.EXTRA_QUERY, "onAutocompleteRequested", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "deeplink", "onNewPaymentMethodSelected", "(Ljava/lang/String;)V", "onEditFormClicked", "onActionClicked", "onReportErrorClicked", "Lio/reactivex/p;", "Lkotlin/Pair;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO;", "pageSource", "()Lio/reactivex/p;", "", "requestCode", "Landroid/content/Intent;", "data", "onActivityResult", "(ILandroid/content/Intent;)V", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$RetryInfo;", "retryInfo", "onRetryClick", "(Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$RetryInfo;)V", "onStart", "()V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action;", "getAction", "()Landroidx/lifecycle/P;", "action", "Action", "RetryInfo", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface FormPageViewModel {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action;", "", "<init>", "()V", "Refresh", "GoBack", "ShowPickerScreen", "ShowPage", "ShowCameraScreen", "Loading", "Alert", "ClearFocus", "RetryUploadPhoto", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action$Alert;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action$ClearFocus;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action$GoBack;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action$Loading;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action$Refresh;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action$RetryUploadPhoto;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action$ShowCameraScreen;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action$ShowPage;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action$ShowPickerScreen;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action$Alert;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action;", "", "message", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "screenState", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/uikit/screenstate/ScreenState;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "getScreenState", "()Lru/ozon/app/android/uikit/screenstate/ScreenState;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Alert extends Action {
            private final String message;
            private final ScreenState screenState;

            /* JADX WARN: Multi-variable type inference failed */
            public Alert() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Alert)) {
                    return false;
                }
                Alert alert = (Alert) other;
                return Intrinsics.d(this.message, alert.message) && Intrinsics.d(this.screenState, alert.screenState);
            }

            public final String getMessage() {
                return this.message;
            }

            public final ScreenState getScreenState() {
                return this.screenState;
            }

            public int hashCode() {
                String str = this.message;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                ScreenState screenState = this.screenState;
                return hashCode + (screenState != null ? screenState.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Alert(message=" + this.message + ", screenState=" + this.screenState + ")";
            }

            public /* synthetic */ Alert(String str, ScreenState screenState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : screenState);
            }

            public Alert(String str, ScreenState screenState) {
                super(null);
                this.message = str;
                this.screenState = screenState;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action$ClearFocus;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action;", "", "tag", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTag", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ClearFocus extends Action {

            @NotNull
            private final String tag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClearFocus(@NotNull String tag) {
                super(null);
                Intrinsics.checkNotNullParameter(tag, "tag");
                this.tag = tag;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ClearFocus) && Intrinsics.d(this.tag, ((ClearFocus) other).tag);
            }

            public int hashCode() {
                return this.tag.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("ClearFocus(tag=", this.tag, ")");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action$GoBack;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action;", "<init>", "()V", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class GoBack extends Action {

            @NotNull
            public static final GoBack INSTANCE = new GoBack();

            private GoBack() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action$Loading;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action;", "", "isShowing", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading extends Action {
            private final boolean isShowing;

            public Loading(boolean z11) {
                super(null);
                this.isShowing = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && this.isShowing == ((Loading) other).isShowing;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isShowing);
            }

            /* renamed from: isShowing, reason: from getter */
            public final boolean getIsShowing() {
                return this.isShowing;
            }

            @NotNull
            public String toString() {
                return C2618u.g("Loading(isShowing=", ")", this.isShowing);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action$Refresh;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action;", "<init>", "()V", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Refresh extends Action {

            @NotNull
            public static final Refresh INSTANCE = new Refresh();

            private Refresh() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action$RetryUploadPhoto;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$RetryInfo$UploadPhoto;", "retryInfo", "<init>", "(Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$RetryInfo$UploadPhoto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$RetryInfo$UploadPhoto;", "getRetryInfo", "()Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$RetryInfo$UploadPhoto;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RetryUploadPhoto extends Action {

            @NotNull
            private final RetryInfo.UploadPhoto retryInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RetryUploadPhoto(@NotNull RetryInfo.UploadPhoto retryInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(retryInfo, "retryInfo");
                this.retryInfo = retryInfo;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RetryUploadPhoto) && Intrinsics.d(this.retryInfo, ((RetryUploadPhoto) other).retryInfo);
            }

            @NotNull
            public final RetryInfo.UploadPhoto getRetryInfo() {
                return this.retryInfo;
            }

            public int hashCode() {
                return this.retryInfo.hashCode();
            }

            @NotNull
            public String toString() {
                return "RetryUploadPhoto(retryInfo=" + this.retryInfo + ")";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action$ShowCameraScreen;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "borderRatio", "", "uploadFromGallery", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getBorderRatio", "Ljava/lang/Boolean;", "getUploadFromGallery", "()Ljava/lang/Boolean;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowCameraScreen extends Action {
            private final String borderRatio;
            private final String title;
            private final Boolean uploadFromGallery;

            public ShowCameraScreen(String str, String str2, Boolean bool) {
                super(null);
                this.title = str;
                this.borderRatio = str2;
                this.uploadFromGallery = bool;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowCameraScreen)) {
                    return false;
                }
                ShowCameraScreen showCameraScreen = (ShowCameraScreen) other;
                return Intrinsics.d(this.title, showCameraScreen.title) && Intrinsics.d(this.borderRatio, showCameraScreen.borderRatio) && Intrinsics.d(this.uploadFromGallery, showCameraScreen.uploadFromGallery);
            }

            public int hashCode() {
                String str = this.title;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.borderRatio;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool = this.uploadFromGallery;
                return hashCode2 + (bool != null ? bool.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.title;
                String str2 = this.borderRatio;
                return g.d(C3660k.d("ShowCameraScreen(title=", str, ", borderRatio=", str2, ", uploadFromGallery="), this.uploadFromGallery, ")");
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action$ShowPage;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action;", "", "deeplink", "", "forBackWithRefresh", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "Z", "getForBackWithRefresh", "()Z", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowPage extends Action {

            @NotNull
            private final String deeplink;
            private final boolean forBackWithRefresh;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowPage(@NotNull String deeplink, boolean z11) {
                super(null);
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.deeplink = deeplink;
                this.forBackWithRefresh = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowPage)) {
                    return false;
                }
                ShowPage showPage = (ShowPage) other;
                return Intrinsics.d(this.deeplink, showPage.deeplink) && this.forBackWithRefresh == showPage.forBackWithRefresh;
            }

            @NotNull
            public final String getDeeplink() {
                return this.deeplink;
            }

            public final boolean getForBackWithRefresh() {
                return this.forBackWithRefresh;
            }

            public int hashCode() {
                return Boolean.hashCode(this.forBackWithRefresh) + (this.deeplink.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return b.f("ShowPage(deeplink=", this.deeplink, ", forBackWithRefresh=", ")", this.forBackWithRefresh);
            }

            public /* synthetic */ ShowPage(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i11 & 2) != 0 ? false : z11);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action$ShowPickerScreen;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$Action;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Picker;", "field", "<init>", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Picker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Picker;", "getField", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$Picker;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowPickerScreen extends Action {

            @NotNull
            private final FormPageVO.Field.Picker field;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowPickerScreen(@NotNull FormPageVO.Field.Picker field) {
                super(null);
                Intrinsics.checkNotNullParameter(field, "field");
                this.field = field;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowPickerScreen) && Intrinsics.d(this.field, ((ShowPickerScreen) other).field);
            }

            @NotNull
            public final FormPageVO.Field.Picker getField() {
                return this.field;
            }

            public int hashCode() {
                return this.field.hashCode();
            }

            @NotNull
            public String toString() {
                return "ShowPickerScreen(field=" + this.field + ")";
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$RetryInfo;", "", "<init>", "()V", "UploadPhoto", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$RetryInfo$UploadPhoto;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class RetryInfo {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$RetryInfo$UploadPhoto;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$RetryInfo;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$UploadPhotoButton;", "field", "", "photoFilePath", "<init>", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$UploadPhotoButton;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$UploadPhotoButton;", "getField", "()Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field$UploadPhotoButton;", "Ljava/lang/String;", "getPhotoFilePath", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UploadPhoto extends RetryInfo {

            @NotNull
            private final FormPageVO.Field.UploadPhotoButton field;

            @NotNull
            private final String photoFilePath;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UploadPhoto(@NotNull FormPageVO.Field.UploadPhotoButton field, @NotNull String photoFilePath) {
                super(null);
                Intrinsics.checkNotNullParameter(field, "field");
                Intrinsics.checkNotNullParameter(photoFilePath, "photoFilePath");
                this.field = field;
                this.photoFilePath = photoFilePath;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UploadPhoto)) {
                    return false;
                }
                UploadPhoto uploadPhoto = (UploadPhoto) other;
                return Intrinsics.d(this.field, uploadPhoto.field) && Intrinsics.d(this.photoFilePath, uploadPhoto.photoFilePath);
            }

            @NotNull
            public final FormPageVO.Field.UploadPhotoButton getField() {
                return this.field;
            }

            @NotNull
            public final String getPhotoFilePath() {
                return this.photoFilePath;
            }

            public int hashCode() {
                return this.photoFilePath.hashCode() + (this.field.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "UploadPhoto(field=" + this.field + ", photoFilePath=" + this.photoFilePath + ")";
            }
        }

        public /* synthetic */ RetryInfo(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private RetryInfo() {
        }
    }

    @NotNull
    P<Action> getAction();

    void onActionClicked(@NotNull String deeplink);

    void onActivityResult(int requestCode, Intent data);

    void onAutocompleteRequested(@NotNull String name, @NotNull String url, @NotNull String query);

    void onButtonClick(@NotNull FormPageVO.Field field);

    void onEditFormClicked(@NotNull String deeplink);

    void onFieldChanged(@NotNull FormPageVO.Field value, boolean force);

    void onNewPaymentMethodSelected(@NotNull String deeplink);

    void onPickerClick(@NotNull FormPageVO.Field field);

    void onReportErrorClicked(@NotNull String deeplink);

    void onRetryClick(@NotNull RetryInfo retryInfo);

    void onStart();

    @NotNull
    p<Pair<FormPageVO, Boolean>> pageSource();
}
