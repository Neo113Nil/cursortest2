package ru.ozon.app.android.pdp.ui.configurators.ugc.question;

import B6.b;
import C.J;
import G.g;
import N3.C3660k;
import Nh.a;
import Pk0.c;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.ActionType;
import ru.ozon.app.android.pdp.ui.configurators.ugc.question.QuestionsDialogFragment;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/question/QuestionsDialogFragment;", "Landroidx/fragment/app/k;", "<init>", "()V", "", "resultCode", "", "passResult", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "Companion", "Params", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class QuestionsDialogFragment extends DialogInterfaceOnCancelListenerC5390k {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/question/QuestionsDialogFragment$Companion;", "", "<init>", "()V", "EXTRA_PARAMS", "", "TAG", "REQUEST_KEY_SUBMIT", "newInstance", "Lru/ozon/app/android/pdp/ui/configurators/ugc/question/QuestionsDialogFragment;", "params", "Lru/ozon/app/android/pdp/ui/configurators/ugc/question/QuestionsDialogFragment$Params;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final QuestionsDialogFragment newInstance(@NotNull Params params) {
            Intrinsics.checkNotNullParameter(params, "params");
            QuestionsDialogFragment questionsDialogFragment = new QuestionsDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_params", params);
            questionsDialogFragment.setArguments(bundle);
            return questionsDialogFragment;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void passResult(int resultCode) {
        Params params;
        HashMap hashMap;
        dismiss();
        Bundle arguments = getArguments();
        if (arguments != null && (params = (Params) arguments.getParcelable("extra_params")) != null) {
            Map<String, String> params2 = params.getParams();
            Unit unit = null;
            if (params2 != null) {
                hashMap = new HashMap();
                hashMap.putAll(params2);
            } else {
                hashMap = null;
            }
            ComponentCallbacksC5392m targetFragment = getTargetFragment();
            if (targetFragment != null) {
                int targetRequestCode = getTargetRequestCode();
                Intent intent = new Intent();
                intent.putExtra("extra_id", params.getId());
                intent.putExtra("extra_action_type", params.getActionType());
                intent.putExtra("extra_action_name", params.getActionName());
                intent.putExtra("delete_review_extra_action_name", params.getDeleteReviewAction());
                Map<String, String> deleteReviewActionParams = params.getDeleteReviewActionParams();
                intent.putExtra("delete_review_extra_action_params", deleteReviewActionParams instanceof HashMap ? (HashMap) deleteReviewActionParams : null);
                intent.putExtra("extra_action_params", hashMap);
                intent.putExtra("delete_review_extra_params", hashMap);
                Unit unit2 = Unit.f71690a;
                targetFragment.onActivityResult(targetRequestCode, resultCode, intent);
                unit = Unit.f71690a;
            }
            if (unit != null) {
                return;
            }
        }
        if (resultCode == -1) {
            Bundle EMPTY = Bundle.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            getParentFragmentManager().m1(EMPTY, "request_key_submit");
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
        aVar.m(params.getPositiveBtn(), new DialogInterface.OnClickListener() { // from class: DC.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                QuestionsDialogFragment.this.passResult(-1);
            }
        });
        String negativeBtn = params.getNegativeBtn();
        if (negativeBtn != null) {
            aVar.h(negativeBtn, new DialogInterface.OnClickListener() { // from class: DC.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    QuestionsDialogFragment.this.passResult(0);
                }
            });
        }
        f create = aVar.create();
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return create;
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b.\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b/\u0010\u001cR%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b1\u00102R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b3\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/question/QuestionsDialogFragment$Params;", "Landroid/os/Parcelable;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "positiveBtn", "negativeBtn", "", "id", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "actionName", "deleteReviewAction", "", "deleteReviewActionParams", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getMessage", "getPositiveBtn", "getNegativeBtn", "J", "getId", "()J", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;", "getActionType", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;", "getActionName", "getDeleteReviewAction", "Ljava/util/Map;", "getDeleteReviewActionParams", "()Ljava/util/Map;", "getParams", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Params implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Params> CREATOR = new Creator();
        private final String actionName;
        private final ActionType actionType;
        private final String deleteReviewAction;
        private final Map<String, String> deleteReviewActionParams;
        private final long id;
        private final String message;
        private final String negativeBtn;
        private final Map<String, String> params;

        @NotNull
        private final String positiveBtn;
        private final String title;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Params> {
            @Override // android.os.Parcelable.Creator
            public final Params createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                LinkedHashMap linkedHashMap2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                long readLong = parcel.readLong();
                ActionType valueOf = parcel.readInt() == 0 ? null : ActionType.valueOf(parcel.readString());
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                int i11 = 0;
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    int i12 = 0;
                    while (i12 != readInt) {
                        i12 = b.a(parcel, linkedHashMap, parcel.readString(), i12, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    linkedHashMap2 = null;
                } else {
                    int readInt2 = parcel.readInt();
                    linkedHashMap2 = new LinkedHashMap(readInt2);
                    while (i11 != readInt2) {
                        i11 = b.a(parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                }
                return new Params(readString, readString2, readString3, readString4, readLong, valueOf, readString5, readString6, linkedHashMap, linkedHashMap2);
            }

            @Override // android.os.Parcelable.Creator
            public final Params[] newArray(int i11) {
                return new Params[i11];
            }
        }

        public Params(String str, String str2, @NotNull String positiveBtn, String str3, long j11, ActionType actionType, String str4, String str5, Map<String, String> map, Map<String, String> map2) {
            Intrinsics.checkNotNullParameter(positiveBtn, "positiveBtn");
            this.title = str;
            this.message = str2;
            this.positiveBtn = positiveBtn;
            this.negativeBtn = str3;
            this.id = j11;
            this.actionType = actionType;
            this.actionName = str4;
            this.deleteReviewAction = str5;
            this.deleteReviewActionParams = map;
            this.params = map2;
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
            return Intrinsics.d(this.title, params.title) && Intrinsics.d(this.message, params.message) && Intrinsics.d(this.positiveBtn, params.positiveBtn) && Intrinsics.d(this.negativeBtn, params.negativeBtn) && this.id == params.id && this.actionType == params.actionType && Intrinsics.d(this.actionName, params.actionName) && Intrinsics.d(this.deleteReviewAction, params.deleteReviewAction) && Intrinsics.d(this.deleteReviewActionParams, params.deleteReviewActionParams) && Intrinsics.d(this.params, params.params);
        }

        public final String getActionName() {
            return this.actionName;
        }

        public final ActionType getActionType() {
            return this.actionType;
        }

        public final String getDeleteReviewAction() {
            return this.deleteReviewAction;
        }

        public final Map<String, String> getDeleteReviewActionParams() {
            return this.deleteReviewActionParams;
        }

        public final long getId() {
            return this.id;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getNegativeBtn() {
            return this.negativeBtn;
        }

        public final Map<String, String> getParams() {
            return this.params;
        }

        @NotNull
        public final String getPositiveBtn() {
            return this.positiveBtn;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.message;
            int a11 = g.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.positiveBtn);
            String str3 = this.negativeBtn;
            int a12 = c.a((a11 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.id);
            ActionType actionType = this.actionType;
            int hashCode2 = (a12 + (actionType == null ? 0 : actionType.hashCode())) * 31;
            String str4 = this.actionName;
            int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.deleteReviewAction;
            int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Map<String, String> map = this.deleteReviewActionParams;
            int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, String> map2 = this.params;
            return hashCode5 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.message;
            String str3 = this.positiveBtn;
            String str4 = this.negativeBtn;
            long j11 = this.id;
            ActionType actionType = this.actionType;
            String str5 = this.actionName;
            String str6 = this.deleteReviewAction;
            Map<String, String> map = this.deleteReviewActionParams;
            Map<String, String> map2 = this.params;
            StringBuilder d11 = C3660k.d("Params(title=", str, ", message=", str2, ", positiveBtn=");
            a.h(d11, str3, ", negativeBtn=", str4, ", id=");
            d11.append(j11);
            d11.append(", actionType=");
            d11.append(actionType);
            a.h(d11, ", actionName=", str5, ", deleteReviewAction=", str6);
            d11.append(", deleteReviewActionParams=");
            d11.append(map);
            d11.append(", params=");
            d11.append(map2);
            d11.append(")");
            return d11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.message);
            dest.writeString(this.positiveBtn);
            dest.writeString(this.negativeBtn);
            dest.writeLong(this.id);
            ActionType actionType = this.actionType;
            if (actionType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(actionType.name());
            }
            dest.writeString(this.actionName);
            dest.writeString(this.deleteReviewAction);
            Map<String, String> map = this.deleteReviewActionParams;
            if (map == null) {
                dest.writeInt(0);
            } else {
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeString((String) entry.getValue());
                }
            }
            Map<String, String> map2 = this.params;
            if (map2 == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e12 = J.e(map2, dest, 1);
            while (e12.hasNext()) {
                Map.Entry entry2 = (Map.Entry) e12.next();
                dest.writeString((String) entry2.getKey());
                dest.writeString((String) entry2.getValue());
            }
        }

        public /* synthetic */ Params(String str, String str2, String str3, String str4, long j11, ActionType actionType, String str5, String str6, Map map, Map map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, str2, str3, (i11 & 8) != 0 ? null : str4, j11, (i11 & 32) != 0 ? null : actionType, (i11 & 64) != 0 ? null : str5, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str6, (i11 & 256) != 0 ? null : map, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : map2);
        }
    }
}
