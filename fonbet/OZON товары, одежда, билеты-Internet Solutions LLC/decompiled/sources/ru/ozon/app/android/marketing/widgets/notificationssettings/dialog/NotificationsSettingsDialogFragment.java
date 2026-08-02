package ru.ozon.app.android.marketing.widgets.notificationssettings.dialog;

import G.g;
import I0.C3173b;
import Kz.DialogInterfaceOnClickListenerC3536b;
import N3.C3660k;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.f;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.notificationssettings.dialog.NotificationsSettingsDialogFragment;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/dialog/NotificationsSettingsDialogFragment;", "Landroidx/fragment/app/k;", "<init>", "()V", "", "resultCode", "", "passResult", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "Companion", "Params", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationsSettingsDialogFragment extends DialogInterfaceOnCancelListenerC5390k {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/dialog/NotificationsSettingsDialogFragment$Companion;", "", "<init>", "()V", "EXTRA_PARAMS", "", "EXTRA_INTENT", "newInstance", "Lru/ozon/app/android/marketing/widgets/notificationssettings/dialog/NotificationsSettingsDialogFragment;", "params", "Lru/ozon/app/android/marketing/widgets/notificationssettings/dialog/NotificationsSettingsDialogFragment$Params;", "resultIntent", "Landroid/content/Intent;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NotificationsSettingsDialogFragment newInstance(@NotNull Params params, Intent resultIntent) {
            Intrinsics.checkNotNullParameter(params, "params");
            NotificationsSettingsDialogFragment notificationsSettingsDialogFragment = new NotificationsSettingsDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_params", params);
            bundle.putParcelable("extra_intent", resultIntent);
            notificationsSettingsDialogFragment.setArguments(bundle);
            return notificationsSettingsDialogFragment;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/dialog/NotificationsSettingsDialogFragment$Params;", "Landroid/os/Parcelable;", "", "message", SelectionItemFormDTO.TITLE_FIELD_NAME, "positiveBtn", "negativeBtn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "getTitle", "getPositiveBtn", "getNegativeBtn", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Params implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Params> CREATOR = new Creator();
        private final String message;
        private final String negativeBtn;

        @NotNull
        private final String positiveBtn;
        private final String title;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Params> {
            @Override // android.os.Parcelable.Creator
            public final Params createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Params(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Params[] newArray(int i11) {
                return new Params[i11];
            }
        }

        public Params(String str, String str2, @NotNull String positiveBtn, String str3) {
            Intrinsics.checkNotNullParameter(positiveBtn, "positiveBtn");
            this.message = str;
            this.title = str2;
            this.positiveBtn = positiveBtn;
            this.negativeBtn = str3;
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
            return Intrinsics.d(this.message, params.message) && Intrinsics.d(this.title, params.title) && Intrinsics.d(this.positiveBtn, params.positiveBtn) && Intrinsics.d(this.negativeBtn, params.negativeBtn);
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getNegativeBtn() {
            return this.negativeBtn;
        }

        @NotNull
        public final String getPositiveBtn() {
            return this.positiveBtn;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.message;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            int a11 = g.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.positiveBtn);
            String str3 = this.negativeBtn;
            return a11 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.message;
            String str2 = this.title;
            return C3173b.c(C3660k.d("Params(message=", str, ", title=", str2, ", positiveBtn="), this.positiveBtn, ", negativeBtn=", this.negativeBtn, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.message);
            dest.writeString(this.title);
            dest.writeString(this.positiveBtn);
            dest.writeString(this.negativeBtn);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void passResult(int resultCode) {
        dismiss();
        ComponentCallbacksC5392m targetFragment = getTargetFragment();
        if (targetFragment != null) {
            int targetRequestCode = getTargetRequestCode();
            Bundle arguments = getArguments();
            targetFragment.onActivityResult(targetRequestCode, resultCode, arguments != null ? (Intent) arguments.getParcelable("extra_intent") : null);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        passResult(0);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        f.a aVar = new f.a(requireContext());
        Bundle arguments = getArguments();
        Params params = arguments != null ? (Params) arguments.getParcelable("extra_params") : null;
        if (params == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String title = params.getTitle();
        if (title != null) {
            aVar.setTitle(title);
        }
        String message = params.getMessage();
        if (message != null) {
            aVar.f(message);
        }
        aVar.m(params.getPositiveBtn(), new DialogInterface.OnClickListener() { // from class: Kz.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                NotificationsSettingsDialogFragment.this.passResult(-1);
            }
        });
        String negativeBtn = params.getNegativeBtn();
        if (negativeBtn != null) {
            aVar.h(negativeBtn, new DialogInterfaceOnClickListenerC3536b(this, 0));
        }
        f create = aVar.create();
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return create;
    }
}
