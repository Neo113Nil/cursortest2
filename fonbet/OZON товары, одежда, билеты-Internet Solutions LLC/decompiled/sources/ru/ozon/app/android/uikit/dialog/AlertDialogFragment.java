package ru.ozon.app.android.uikit.dialog;

import B0.C2454a;
import B4.V;
import Nh.a;
import Pk0.i;
import Sc.o;
import T7.E;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.f;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.app.android.uikit.dialog.AlertDialogFragment;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0004\u0012\u0013\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/uikit/dialog/AlertDialogFragment;", "Landroidx/fragment/app/k;", "<init>", "()V", "", "resultCode", "", "passResult", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "Companion", "Params", "OnAlertDialogResult", "ResultTarget", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AlertDialogFragment extends DialogInterfaceOnCancelListenerC5390k {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int positiveResDefault = R$string.common_action_ok;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/uikit/dialog/AlertDialogFragment$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/uikit/dialog/AlertDialogFragment$Params;", "params", "Landroid/content/Intent;", "resultIntent", "Lru/ozon/app/android/uikit/dialog/AlertDialogFragment;", "newInstanceForFragmentResult", "(Lru/ozon/app/android/uikit/dialog/AlertDialogFragment$Params;Landroid/content/Intent;)Lru/ozon/app/android/uikit/dialog/AlertDialogFragment;", "newInstanceSkipResult", "(Lru/ozon/app/android/uikit/dialog/AlertDialogFragment$Params;)Lru/ozon/app/android/uikit/dialog/AlertDialogFragment;", "", "positiveResDefault", "I", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AlertDialogFragment newInstanceForFragmentResult(@NotNull Params params, Intent resultIntent) {
            Intrinsics.checkNotNullParameter(params, "params");
            AlertDialogFragment alertDialogFragment = new AlertDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("DIALOG_PARAMS", params);
            bundle.putParcelable("RESULT_TARGET", ResultTarget.TargetFragment.INSTANCE);
            bundle.putParcelable("RESULT_INTENT", resultIntent);
            alertDialogFragment.setArguments(bundle);
            return alertDialogFragment;
        }

        @NotNull
        public final AlertDialogFragment newInstanceSkipResult(@NotNull Params params) {
            Intrinsics.checkNotNullParameter(params, "params");
            AlertDialogFragment alertDialogFragment = new AlertDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("DIALOG_PARAMS", params);
            alertDialogFragment.setArguments(bundle);
            return alertDialogFragment;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lru/ozon/app/android/uikit/dialog/AlertDialogFragment$OnAlertDialogResult;", "", "onAlertDialogResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnAlertDialogResult {
        void onAlertDialogResult(int requestCode, int resultCode, Intent data);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b#\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b$\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b'\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b(\u0010 R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b)\u0010\u0015¨\u0006*"}, d2 = {"Lru/ozon/app/android/uikit/dialog/AlertDialogFragment$Params;", "Landroid/os/Parcelable;", "", "message", "", "messageStr", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleStr", "positiveBtn", "positiveBtnStr", "negativeBtn", "style", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;I)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMessage", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getMessageStr", "getTitle", "getTitleStr", "I", "getPositiveBtn", "getPositiveBtnStr", "getNegativeBtn", "getStyle", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Params implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Params> CREATOR = new Creator();
        private final Integer message;
        private final String messageStr;
        private final Integer negativeBtn;
        private final int positiveBtn;
        private final String positiveBtnStr;
        private final int style;
        private final Integer title;
        private final String titleStr;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Params> {
            @Override // android.os.Parcelable.Creator
            public final Params createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Params(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Params[] newArray(int i11) {
                return new Params[i11];
            }
        }

        public Params() {
            this(null, null, null, null, 0, null, null, 0, 255, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return Intrinsics.d(this.message, params.message) && Intrinsics.d(this.messageStr, params.messageStr) && Intrinsics.d(this.title, params.title) && Intrinsics.d(this.titleStr, params.titleStr) && this.positiveBtn == params.positiveBtn && Intrinsics.d(this.positiveBtnStr, params.positiveBtnStr) && Intrinsics.d(this.negativeBtn, params.negativeBtn) && this.style == params.style;
        }

        public final Integer getMessage() {
            return this.message;
        }

        public final String getMessageStr() {
            return this.messageStr;
        }

        public final Integer getNegativeBtn() {
            return this.negativeBtn;
        }

        public final int getPositiveBtn() {
            return this.positiveBtn;
        }

        public final String getPositiveBtnStr() {
            return this.positiveBtnStr;
        }

        public final int getStyle() {
            return this.style;
        }

        public final Integer getTitle() {
            return this.title;
        }

        public final String getTitleStr() {
            return this.titleStr;
        }

        public int hashCode() {
            Integer num = this.message;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.messageStr;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num2 = this.title;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.titleStr;
            int a11 = C2454a.a(this.positiveBtn, (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
            String str3 = this.positiveBtnStr;
            int hashCode4 = (a11 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num3 = this.negativeBtn;
            return Integer.hashCode(this.style) + ((hashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            Integer num = this.message;
            String str = this.messageStr;
            Integer num2 = this.title;
            String str2 = this.titleStr;
            int i11 = this.positiveBtn;
            String str3 = this.positiveBtnStr;
            Integer num3 = this.negativeBtn;
            int i12 = this.style;
            StringBuilder sb2 = new StringBuilder("Params(message=");
            sb2.append(num);
            sb2.append(", messageStr=");
            sb2.append(str);
            sb2.append(", title=");
            V.f(num2, ", titleStr=", str2, ", positiveBtn=", sb2);
            i.c(i11, ", positiveBtnStr=", str3, ", negativeBtn=", sb2);
            sb2.append(num3);
            sb2.append(", style=");
            sb2.append(i12);
            sb2.append(")");
            return sb2.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.message;
            if (num == null) {
                dest.writeInt(0);
            } else {
                a.f(dest, 1, num);
            }
            dest.writeString(this.messageStr);
            Integer num2 = this.title;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                a.f(dest, 1, num2);
            }
            dest.writeString(this.titleStr);
            dest.writeInt(this.positiveBtn);
            dest.writeString(this.positiveBtnStr);
            Integer num3 = this.negativeBtn;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                a.f(dest, 1, num3);
            }
            dest.writeInt(this.style);
        }

        public Params(Integer num, String str, Integer num2, String str2, int i11, String str3, Integer num3, int i12) {
            this.message = num;
            this.messageStr = str;
            this.title = num2;
            this.titleStr = str2;
            this.positiveBtn = i11;
            this.positiveBtnStr = str3;
            this.negativeBtn = num3;
            this.style = i12;
        }

        public /* synthetic */ Params(Integer num, String str, Integer num2, String str2, int i11, String str3, Integer num3, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : num2, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? AlertDialogFragment.positiveResDefault : i11, (i13 & 32) != 0 ? null : str3, (i13 & 64) != 0 ? null : num3, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? R$style.OzAlertDialog : i12);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/uikit/dialog/AlertDialogFragment$ResultTarget;", "Landroid/os/Parcelable;", "<init>", "()V", "TargetFragment", "Activity", "Lru/ozon/app/android/uikit/dialog/AlertDialogFragment$ResultTarget$Activity;", "Lru/ozon/app/android/uikit/dialog/AlertDialogFragment$ResultTarget$TargetFragment;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static abstract class ResultTarget implements Parcelable {

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/uikit/dialog/AlertDialogFragment$ResultTarget$Activity;", "Lru/ozon/app/android/uikit/dialog/AlertDialogFragment$ResultTarget;", "", "requestCode", "<init>", "(I)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getRequestCode", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Activity extends ResultTarget {

            @NotNull
            public static final Parcelable.Creator<Activity> CREATOR = new Creator();
            private final int requestCode;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Activity> {
                @Override // android.os.Parcelable.Creator
                public final Activity createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Activity(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Activity[] newArray(int i11) {
                    return new Activity[i11];
                }
            }

            public Activity(int i11) {
                super(null);
                this.requestCode = i11;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Activity) && this.requestCode == ((Activity) other).requestCode;
            }

            public final int getRequestCode() {
                return this.requestCode;
            }

            public int hashCode() {
                return Integer.hashCode(this.requestCode);
            }

            @NotNull
            public String toString() {
                return E.a(this.requestCode, "Activity(requestCode=", ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.requestCode);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/uikit/dialog/AlertDialogFragment$ResultTarget$TargetFragment;", "Lru/ozon/app/android/uikit/dialog/AlertDialogFragment$ResultTarget;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class TargetFragment extends ResultTarget {

            @NotNull
            public static final TargetFragment INSTANCE = new TargetFragment();

            @NotNull
            public static final Parcelable.Creator<TargetFragment> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<TargetFragment> {
                @Override // android.os.Parcelable.Creator
                public final TargetFragment createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return TargetFragment.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final TargetFragment[] newArray(int i11) {
                    return new TargetFragment[i11];
                }
            }

            private TargetFragment() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        public /* synthetic */ ResultTarget(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ResultTarget() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void passResult(int resultCode) {
        ResultTarget resultTarget;
        Bundle arguments = getArguments();
        if (arguments == null || (resultTarget = (ResultTarget) arguments.getParcelable("RESULT_TARGET")) == null) {
            return;
        }
        if (resultTarget instanceof ResultTarget.Activity) {
            OnAlertDialogResult onAlertDialogResult = (OnAlertDialogResult) getActivity();
            if (onAlertDialogResult != null) {
                int requestCode = ((ResultTarget.Activity) resultTarget).getRequestCode();
                Bundle arguments2 = getArguments();
                onAlertDialogResult.onAlertDialogResult(requestCode, resultCode, arguments2 != null ? (Intent) arguments2.getParcelable("RESULT_INTENT") : null);
                return;
            }
            return;
        }
        if (!resultTarget.equals(ResultTarget.TargetFragment.INSTANCE)) {
            throw new o();
        }
        ComponentCallbacksC5392m targetFragment = getTargetFragment();
        if (targetFragment != null) {
            int targetRequestCode = getTargetRequestCode();
            Bundle arguments3 = getArguments();
            targetFragment.onActivityResult(targetRequestCode, resultCode, arguments3 != null ? (Intent) arguments3.getParcelable("RESULT_INTENT") : null);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        passResult(0);
        super.onCancel(dialog);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        Params params = arguments != null ? (Params) arguments.getParcelable("DIALOG_PARAMS") : null;
        if (params == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        f.a aVar = new f.a(requireContext(), params.getStyle());
        Integer title = params.getTitle();
        if (title != null) {
            aVar.p(title.intValue());
        }
        String titleStr = params.getTitleStr();
        if (titleStr != null) {
            aVar.setTitle(titleStr);
        }
        Integer message = params.getMessage();
        if (message != null) {
            aVar.e(message.intValue());
        }
        String messageStr = params.getMessageStr();
        if (messageStr != null) {
            aVar.f(messageStr);
        }
        aVar.setPositiveButton(params.getPositiveBtn(), new DialogInterface.OnClickListener() { // from class: nX.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                AlertDialogFragment.this.passResult(-1);
            }
        });
        String positiveBtnStr = params.getPositiveBtnStr();
        if (positiveBtnStr != null) {
            aVar.m(positiveBtnStr, new DialogInterface.OnClickListener() { // from class: nX.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    AlertDialogFragment.this.passResult(-1);
                }
            });
        }
        Integer negativeBtn = params.getNegativeBtn();
        if (negativeBtn != null) {
            aVar.setNegativeButton(negativeBtn.intValue(), new DialogInterface.OnClickListener() { // from class: nX.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    AlertDialogFragment.this.passResult(0);
                }
            });
        }
        f create = aVar.create();
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return create;
    }
}
