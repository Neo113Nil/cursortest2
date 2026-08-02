package ru.ozon.app.android.travel.molecules.fragment.alertDialog;

import B4.V;
import K00.b;
import Nh.a;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.f;
import androidx.core.os.d;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.fragment.alertDialog.TravelAlertDialogFragment;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.R$style;
import spay.sdk.api.ErrorCode;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/molecules/fragment/alertDialog/TravelAlertDialogFragment;", "Landroidx/fragment/app/k;", "<init>", "()V", "", "isOkResult", "", "sendResult", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "Companion", "Settings", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelAlertDialogFragment extends DialogInterfaceOnCancelListenerC5390k {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/molecules/fragment/alertDialog/TravelAlertDialogFragment$Companion;", "", "<init>", "()V", "ARG_KEY_SETTINGS", "", "ARG_KEY_REQUEST_KEY", "UNDEFINED", "RESULT_KEY_IS_OK", "newInstance", "Lru/ozon/app/android/travel/molecules/fragment/alertDialog/TravelAlertDialogFragment;", "dialogSettings", "Lru/ozon/app/android/travel/molecules/fragment/alertDialog/TravelAlertDialogFragment$Settings;", "requestKey", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TravelAlertDialogFragment newInstance(@NotNull Settings dialogSettings, @NotNull String requestKey) {
            Intrinsics.checkNotNullParameter(dialogSettings, "dialogSettings");
            Intrinsics.checkNotNullParameter(requestKey, "requestKey");
            TravelAlertDialogFragment travelAlertDialogFragment = new TravelAlertDialogFragment();
            travelAlertDialogFragment.setArguments(d.b(new Pair("KEY_SETTINGS", dialogSettings), new Pair("KEY_REQUEST_KEY", requestKey)));
            return travelAlertDialogFragment;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b$\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b%\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b&\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b'\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b(\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b)\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010\u0016¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/molecules/fragment/alertDialog/TravelAlertDialogFragment$Settings;", "Landroid/os/Parcelable;", "", "message", "", "messageStr", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleStr", "positiveBtn", "positiveBtnStr", "negativeBtn", "negativeBtnStr", "style", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMessage", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getMessageStr", "getTitle", "getTitleStr", "getPositiveBtn", "getPositiveBtnStr", "getNegativeBtn", "getNegativeBtnStr", "I", "getStyle", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Settings implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Settings> CREATOR = new Creator();
        private final Integer message;
        private final String messageStr;
        private final Integer negativeBtn;
        private final String negativeBtnStr;
        private final Integer positiveBtn;
        private final String positiveBtnStr;
        private final int style;
        private final Integer title;
        private final String titleStr;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Settings> {
            @Override // android.os.Parcelable.Creator
            public final Settings createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Settings(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Settings[] newArray(int i11) {
                return new Settings[i11];
            }
        }

        public Settings() {
            this(null, null, null, null, null, null, null, null, 0, 511, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) other;
            return Intrinsics.d(this.message, settings.message) && Intrinsics.d(this.messageStr, settings.messageStr) && Intrinsics.d(this.title, settings.title) && Intrinsics.d(this.titleStr, settings.titleStr) && Intrinsics.d(this.positiveBtn, settings.positiveBtn) && Intrinsics.d(this.positiveBtnStr, settings.positiveBtnStr) && Intrinsics.d(this.negativeBtn, settings.negativeBtn) && Intrinsics.d(this.negativeBtnStr, settings.negativeBtnStr) && this.style == settings.style;
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

        public final String getNegativeBtnStr() {
            return this.negativeBtnStr;
        }

        public final Integer getPositiveBtn() {
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
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num3 = this.positiveBtn;
            int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str3 = this.positiveBtnStr;
            int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num4 = this.negativeBtn;
            int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
            String str4 = this.negativeBtnStr;
            return Integer.hashCode(this.style) + ((hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            Integer num = this.message;
            String str = this.messageStr;
            Integer num2 = this.title;
            String str2 = this.titleStr;
            Integer num3 = this.positiveBtn;
            String str3 = this.positiveBtnStr;
            Integer num4 = this.negativeBtn;
            String str4 = this.negativeBtnStr;
            int i11 = this.style;
            StringBuilder sb2 = new StringBuilder("Settings(message=");
            sb2.append(num);
            sb2.append(", messageStr=");
            sb2.append(str);
            sb2.append(", title=");
            V.f(num2, ", titleStr=", str2, ", positiveBtn=", sb2);
            V.f(num3, ", positiveBtnStr=", str3, ", negativeBtn=", sb2);
            V.f(num4, ", negativeBtnStr=", str4, ", style=", sb2);
            return b.e(i11, ")", sb2);
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
            Integer num3 = this.positiveBtn;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                a.f(dest, 1, num3);
            }
            dest.writeString(this.positiveBtnStr);
            Integer num4 = this.negativeBtn;
            if (num4 == null) {
                dest.writeInt(0);
            } else {
                a.f(dest, 1, num4);
            }
            dest.writeString(this.negativeBtnStr);
            dest.writeInt(this.style);
        }

        public Settings(Integer num, String str, Integer num2, String str2, Integer num3, String str3, Integer num4, String str4, int i11) {
            this.message = num;
            this.messageStr = str;
            this.title = num2;
            this.titleStr = str2;
            this.positiveBtn = num3;
            this.positiveBtnStr = str3;
            this.negativeBtn = num4;
            this.negativeBtnStr = str4;
            this.style = i11;
        }

        public /* synthetic */ Settings(Integer num, String str, Integer num2, String str2, Integer num3, String str3, Integer num4, String str4, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : num2, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : num3, (i12 & 32) != 0 ? null : str3, (i12 & 64) != 0 ? null : num4, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str4, (i12 & 256) != 0 ? R$style.OzAlertDialog : i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendResult(boolean isOkResult) {
        String str;
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("KEY_REQUEST_KEY")) == null) {
            str = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE;
        }
        getParentFragmentManager().m1(d.b(new Pair("KEY_IS_OK", Boolean.valueOf(isOkResult))), str);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        sendResult(false);
        super.onCancel(dialog);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Settings settings;
        Parcelable parcelable;
        Object parcelable2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("KEY_SETTINGS", Settings.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                parcelable = arguments.getParcelable("KEY_SETTINGS");
            }
            settings = (Settings) parcelable;
        } else {
            settings = null;
        }
        if (settings == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        f.a aVar = new f.a(requireContext(), settings.getStyle());
        Integer title = settings.getTitle();
        if (title != null) {
            aVar.p(title.intValue());
        }
        String titleStr = settings.getTitleStr();
        if (titleStr != null) {
            aVar.setTitle(titleStr);
        }
        Integer message = settings.getMessage();
        if (message != null) {
            aVar.e(message.intValue());
        }
        String messageStr = settings.getMessageStr();
        if (messageStr != null) {
            aVar.f(messageStr);
        }
        Integer positiveBtn = settings.getPositiveBtn();
        if (positiveBtn != null) {
            aVar.setPositiveButton(positiveBtn.intValue(), new DialogInterface.OnClickListener() { // from class: cU.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    TravelAlertDialogFragment.this.sendResult(true);
                }
            });
        }
        String positiveBtnStr = settings.getPositiveBtnStr();
        if (positiveBtnStr != null) {
            aVar.m(positiveBtnStr, new DialogInterface.OnClickListener() { // from class: cU.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    TravelAlertDialogFragment.this.sendResult(true);
                }
            });
        }
        Integer negativeBtn = settings.getNegativeBtn();
        if (negativeBtn != null) {
            aVar.setNegativeButton(negativeBtn.intValue(), new DialogInterface.OnClickListener() { // from class: cU.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    TravelAlertDialogFragment.this.sendResult(false);
                }
            });
        }
        String negativeBtnStr = settings.getNegativeBtnStr();
        if (negativeBtnStr != null) {
            aVar.h(negativeBtnStr, new cU.d(this, 0));
        }
        f create = aVar.create();
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return create;
    }
}
