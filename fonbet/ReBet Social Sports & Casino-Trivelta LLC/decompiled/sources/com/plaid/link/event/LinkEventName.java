package com.plaid.link.event;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\bB\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \r2\u00020\u0001:>\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001@FGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001¨\u0006\u0083\u0001"}, d2 = {"Lcom/plaid/link/event/LinkEventName;", "Landroid/os/Parcelable;", "json", "", "(Ljava/lang/String;)V", "getJson", "()Ljava/lang/String;", "toString", "AUTO_SELECT_SAVED_INSTITUTION", "AUTO_SUBMIT_PHONE", "BANK_INCOME_INSIGHTS_COMPLETED", "CLOSE_OAUTH", "CONNECT_NEW_INSTITUTION", "Companion", "ERROR", "EXIT", "FAIL_OAUTH", "HANDOFF", "IDENTITY_MATCH_FAILED", "IDENTITY_MATCH_PASSED", "IDENTITY_VERIFICATION_CLOSE_UI", "IDENTITY_VERIFICATION_CREATE_SESSION", "IDENTITY_VERIFICATION_FAIL_SESSION", "IDENTITY_VERIFICATION_FAIL_STEP", "IDENTITY_VERIFICATION_OPEN_UI", "IDENTITY_VERIFICATION_PASS_SESSION", "IDENTITY_VERIFICATION_PASS_STEP", "IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION", "IDENTITY_VERIFICATION_PENDING_REVIEW_STEP", "IDENTITY_VERIFICATION_RESUME_SESSION", "IDENTITY_VERIFICATION_RESUME_UI", "IDENTITY_VERIFICATION_START_STEP", "ISSUE_FOLLOWED", "LAYER_AUTOFILL_NOT_AVAILABLE", "LAYER_NOT_AVAILABLE", "LAYER_READY", "MATCHED_SELECT_INSTITUTION", "MATCHED_SELECT_VERIFY_METHOD", "OPEN", "OPEN_MY_PLAID", "OPEN_OAUTH", "PLAID_CHECK_PANE", "PROFILE_ELIGIBILITY_CHECK_READY", "REMEMBER_ME_DISABLED", "REMEMBER_ME_ENABLED", "REMEMBER_ME_HOLDOUT", "SEARCH_INSTITUTION", "SELECT_ACCOUNT", "SELECT_AUTH_TYPE", "SELECT_BRAND", "SELECT_DEGRADED_INSTITUTION", "SELECT_DOWN_INSTITUTION", "SELECT_FILTERED_INSTITUTION", "SELECT_INSTITUTION", "SKIP_SUBMIT_EMAIL", "SKIP_SUBMIT_PHONE", "SUBMIT_ACCOUNT_NUMBER", "SUBMIT_CREDENTIALS", "SUBMIT_DOCUMENTS", "SUBMIT_DOCUMENTS_ERROR", "SUBMIT_DOCUMENTS_SUCCESS", "SUBMIT_EMAIL", "SUBMIT_MFA", "SUBMIT_OTP", "SUBMIT_PHONE", "SUBMIT_ROUTING_NUMBER", "TRANSITION_VIEW", "UNKNOWN", "VERIFY_PHONE", "VIEW_DATA_TYPES", "Lcom/plaid/link/event/LinkEventName$AUTO_SELECT_SAVED_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName$AUTO_SUBMIT_PHONE;", "Lcom/plaid/link/event/LinkEventName$BANK_INCOME_INSIGHTS_COMPLETED;", "Lcom/plaid/link/event/LinkEventName$CLOSE_OAUTH;", "Lcom/plaid/link/event/LinkEventName$CONNECT_NEW_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName$ERROR;", "Lcom/plaid/link/event/LinkEventName$EXIT;", "Lcom/plaid/link/event/LinkEventName$FAIL_OAUTH;", "Lcom/plaid/link/event/LinkEventName$HANDOFF;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_MATCH_FAILED;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_MATCH_PASSED;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_CLOSE_UI;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_CREATE_SESSION;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_FAIL_SESSION;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_FAIL_STEP;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_OPEN_UI;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_PASS_SESSION;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_PASS_STEP;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_PENDING_REVIEW_STEP;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_RESUME_SESSION;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_RESUME_UI;", "Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_START_STEP;", "Lcom/plaid/link/event/LinkEventName$ISSUE_FOLLOWED;", "Lcom/plaid/link/event/LinkEventName$LAYER_AUTOFILL_NOT_AVAILABLE;", "Lcom/plaid/link/event/LinkEventName$LAYER_NOT_AVAILABLE;", "Lcom/plaid/link/event/LinkEventName$LAYER_READY;", "Lcom/plaid/link/event/LinkEventName$MATCHED_SELECT_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName$MATCHED_SELECT_VERIFY_METHOD;", "Lcom/plaid/link/event/LinkEventName$OPEN;", "Lcom/plaid/link/event/LinkEventName$OPEN_MY_PLAID;", "Lcom/plaid/link/event/LinkEventName$OPEN_OAUTH;", "Lcom/plaid/link/event/LinkEventName$PLAID_CHECK_PANE;", "Lcom/plaid/link/event/LinkEventName$PROFILE_ELIGIBILITY_CHECK_READY;", "Lcom/plaid/link/event/LinkEventName$REMEMBER_ME_DISABLED;", "Lcom/plaid/link/event/LinkEventName$REMEMBER_ME_ENABLED;", "Lcom/plaid/link/event/LinkEventName$REMEMBER_ME_HOLDOUT;", "Lcom/plaid/link/event/LinkEventName$SEARCH_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName$SELECT_ACCOUNT;", "Lcom/plaid/link/event/LinkEventName$SELECT_AUTH_TYPE;", "Lcom/plaid/link/event/LinkEventName$SELECT_BRAND;", "Lcom/plaid/link/event/LinkEventName$SELECT_DEGRADED_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName$SELECT_DOWN_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName$SELECT_FILTERED_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName$SELECT_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName$SKIP_SUBMIT_EMAIL;", "Lcom/plaid/link/event/LinkEventName$SKIP_SUBMIT_PHONE;", "Lcom/plaid/link/event/LinkEventName$SUBMIT_ACCOUNT_NUMBER;", "Lcom/plaid/link/event/LinkEventName$SUBMIT_CREDENTIALS;", "Lcom/plaid/link/event/LinkEventName$SUBMIT_DOCUMENTS;", "Lcom/plaid/link/event/LinkEventName$SUBMIT_DOCUMENTS_ERROR;", "Lcom/plaid/link/event/LinkEventName$SUBMIT_DOCUMENTS_SUCCESS;", "Lcom/plaid/link/event/LinkEventName$SUBMIT_EMAIL;", "Lcom/plaid/link/event/LinkEventName$SUBMIT_MFA;", "Lcom/plaid/link/event/LinkEventName$SUBMIT_OTP;", "Lcom/plaid/link/event/LinkEventName$SUBMIT_PHONE;", "Lcom/plaid/link/event/LinkEventName$SUBMIT_ROUTING_NUMBER;", "Lcom/plaid/link/event/LinkEventName$TRANSITION_VIEW;", "Lcom/plaid/link/event/LinkEventName$UNKNOWN;", "Lcom/plaid/link/event/LinkEventName$VERIFY_PHONE;", "Lcom/plaid/link/event/LinkEventName$VIEW_DATA_TYPES;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class LinkEventName implements Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<String, LinkEventName> map;

    @NotNull
    private final String json;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$AUTO_SELECT_SAVED_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AUTO_SELECT_SAVED_INSTITUTION extends LinkEventName {

        @NotNull
        public static final AUTO_SELECT_SAVED_INSTITUTION INSTANCE = new AUTO_SELECT_SAVED_INSTITUTION();

        @NotNull
        public static final Parcelable.Creator<AUTO_SELECT_SAVED_INSTITUTION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AUTO_SELECT_SAVED_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final AUTO_SELECT_SAVED_INSTITUTION createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AUTO_SELECT_SAVED_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final AUTO_SELECT_SAVED_INSTITUTION[] newArray(int i10) {
                return new AUTO_SELECT_SAVED_INSTITUTION[i10];
            }
        }

        private AUTO_SELECT_SAVED_INSTITUTION() {
            super("AUTO_SELECT_SAVED_INSTITUTION", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$AUTO_SUBMIT_PHONE;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AUTO_SUBMIT_PHONE extends LinkEventName {

        @NotNull
        public static final AUTO_SUBMIT_PHONE INSTANCE = new AUTO_SUBMIT_PHONE();

        @NotNull
        public static final Parcelable.Creator<AUTO_SUBMIT_PHONE> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AUTO_SUBMIT_PHONE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final AUTO_SUBMIT_PHONE createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AUTO_SUBMIT_PHONE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final AUTO_SUBMIT_PHONE[] newArray(int i10) {
                return new AUTO_SUBMIT_PHONE[i10];
            }
        }

        private AUTO_SUBMIT_PHONE() {
            super("AUTO_SUBMIT_PHONE", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$BANK_INCOME_INSIGHTS_COMPLETED;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BANK_INCOME_INSIGHTS_COMPLETED extends LinkEventName {

        @NotNull
        public static final BANK_INCOME_INSIGHTS_COMPLETED INSTANCE = new BANK_INCOME_INSIGHTS_COMPLETED();

        @NotNull
        public static final Parcelable.Creator<BANK_INCOME_INSIGHTS_COMPLETED> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BANK_INCOME_INSIGHTS_COMPLETED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final BANK_INCOME_INSIGHTS_COMPLETED createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BANK_INCOME_INSIGHTS_COMPLETED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final BANK_INCOME_INSIGHTS_COMPLETED[] newArray(int i10) {
                return new BANK_INCOME_INSIGHTS_COMPLETED[i10];
            }
        }

        private BANK_INCOME_INSIGHTS_COMPLETED() {
            super("BANK_INCOME_INSIGHTS_COMPLETED", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$CLOSE_OAUTH;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CLOSE_OAUTH extends LinkEventName {

        @NotNull
        public static final CLOSE_OAUTH INSTANCE = new CLOSE_OAUTH();

        @NotNull
        public static final Parcelable.Creator<CLOSE_OAUTH> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CLOSE_OAUTH> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final CLOSE_OAUTH createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CLOSE_OAUTH.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final CLOSE_OAUTH[] newArray(int i10) {
                return new CLOSE_OAUTH[i10];
            }
        }

        private CLOSE_OAUTH() {
            super("CLOSE_OAUTH", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$CONNECT_NEW_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CONNECT_NEW_INSTITUTION extends LinkEventName {

        @NotNull
        public static final CONNECT_NEW_INSTITUTION INSTANCE = new CONNECT_NEW_INSTITUTION();

        @NotNull
        public static final Parcelable.Creator<CONNECT_NEW_INSTITUTION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CONNECT_NEW_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final CONNECT_NEW_INSTITUTION createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CONNECT_NEW_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final CONNECT_NEW_INSTITUTION[] newArray(int i10) {
                return new CONNECT_NEW_INSTITUTION[i10];
            }
        }

        private CONNECT_NEW_INSTITUTION() {
            super("CONNECT_NEW_INSTITUTION", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\tR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$Companion;", "", "()V", "map", "", "", "Lcom/plaid/link/event/LinkEventName;", "fromString", "string", "fromString$link_sdk_release", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LinkEventName fromString$link_sdk_release(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            LinkEventName linkEventName = (LinkEventName) LinkEventName.map.get(string);
            return linkEventName == null ? new UNKNOWN(string) : linkEventName;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$ERROR;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ERROR extends LinkEventName {

        @NotNull
        public static final ERROR INSTANCE = new ERROR();

        @NotNull
        public static final Parcelable.Creator<ERROR> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ERROR createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ERROR[] newArray(int i10) {
                return new ERROR[i10];
            }
        }

        private ERROR() {
            super("ERROR", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$EXIT;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EXIT extends LinkEventName {

        @NotNull
        public static final EXIT INSTANCE = new EXIT();

        @NotNull
        public static final Parcelable.Creator<EXIT> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EXIT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final EXIT createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EXIT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final EXIT[] newArray(int i10) {
                return new EXIT[i10];
            }
        }

        private EXIT() {
            super("EXIT", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$FAIL_OAUTH;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FAIL_OAUTH extends LinkEventName {

        @NotNull
        public static final FAIL_OAUTH INSTANCE = new FAIL_OAUTH();

        @NotNull
        public static final Parcelable.Creator<FAIL_OAUTH> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FAIL_OAUTH> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final FAIL_OAUTH createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FAIL_OAUTH.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final FAIL_OAUTH[] newArray(int i10) {
                return new FAIL_OAUTH[i10];
            }
        }

        private FAIL_OAUTH() {
            super("FAIL_OAUTH", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$HANDOFF;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HANDOFF extends LinkEventName {

        @NotNull
        public static final HANDOFF INSTANCE = new HANDOFF();

        @NotNull
        public static final Parcelable.Creator<HANDOFF> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HANDOFF> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final HANDOFF createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HANDOFF.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final HANDOFF[] newArray(int i10) {
                return new HANDOFF[i10];
            }
        }

        private HANDOFF() {
            super("HANDOFF", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_MATCH_FAILED;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_MATCH_FAILED extends LinkEventName {

        @NotNull
        public static final IDENTITY_MATCH_FAILED INSTANCE = new IDENTITY_MATCH_FAILED();

        @NotNull
        public static final Parcelable.Creator<IDENTITY_MATCH_FAILED> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_MATCH_FAILED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_MATCH_FAILED createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_MATCH_FAILED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_MATCH_FAILED[] newArray(int i10) {
                return new IDENTITY_MATCH_FAILED[i10];
            }
        }

        private IDENTITY_MATCH_FAILED() {
            super("IDENTITY_MATCH_FAILED", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_MATCH_PASSED;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_MATCH_PASSED extends LinkEventName {

        @NotNull
        public static final IDENTITY_MATCH_PASSED INSTANCE = new IDENTITY_MATCH_PASSED();

        @NotNull
        public static final Parcelable.Creator<IDENTITY_MATCH_PASSED> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_MATCH_PASSED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_MATCH_PASSED createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_MATCH_PASSED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_MATCH_PASSED[] newArray(int i10) {
                return new IDENTITY_MATCH_PASSED[i10];
            }
        }

        private IDENTITY_MATCH_PASSED() {
            super("IDENTITY_MATCH_PASSED", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_CLOSE_UI;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_CLOSE_UI extends LinkEventName {

        @NotNull
        public static final IDENTITY_VERIFICATION_CLOSE_UI INSTANCE = new IDENTITY_VERIFICATION_CLOSE_UI();

        @NotNull
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_CLOSE_UI> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_CLOSE_UI> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_CLOSE_UI createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_CLOSE_UI.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_CLOSE_UI[] newArray(int i10) {
                return new IDENTITY_VERIFICATION_CLOSE_UI[i10];
            }
        }

        private IDENTITY_VERIFICATION_CLOSE_UI() {
            super("IDENTITY_VERIFICATION_CLOSE_UI", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_CREATE_SESSION;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_CREATE_SESSION extends LinkEventName {

        @NotNull
        public static final IDENTITY_VERIFICATION_CREATE_SESSION INSTANCE = new IDENTITY_VERIFICATION_CREATE_SESSION();

        @NotNull
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_CREATE_SESSION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_CREATE_SESSION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_CREATE_SESSION createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_CREATE_SESSION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_CREATE_SESSION[] newArray(int i10) {
                return new IDENTITY_VERIFICATION_CREATE_SESSION[i10];
            }
        }

        private IDENTITY_VERIFICATION_CREATE_SESSION() {
            super("IDENTITY_VERIFICATION_CREATE_SESSION", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_FAIL_SESSION;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_FAIL_SESSION extends LinkEventName {

        @NotNull
        public static final IDENTITY_VERIFICATION_FAIL_SESSION INSTANCE = new IDENTITY_VERIFICATION_FAIL_SESSION();

        @NotNull
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_FAIL_SESSION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_FAIL_SESSION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_FAIL_SESSION createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_FAIL_SESSION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_FAIL_SESSION[] newArray(int i10) {
                return new IDENTITY_VERIFICATION_FAIL_SESSION[i10];
            }
        }

        private IDENTITY_VERIFICATION_FAIL_SESSION() {
            super("IDENTITY_VERIFICATION_FAIL_SESSION", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_FAIL_STEP;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_FAIL_STEP extends LinkEventName {

        @NotNull
        public static final IDENTITY_VERIFICATION_FAIL_STEP INSTANCE = new IDENTITY_VERIFICATION_FAIL_STEP();

        @NotNull
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_FAIL_STEP> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_FAIL_STEP> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_FAIL_STEP createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_FAIL_STEP.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_FAIL_STEP[] newArray(int i10) {
                return new IDENTITY_VERIFICATION_FAIL_STEP[i10];
            }
        }

        private IDENTITY_VERIFICATION_FAIL_STEP() {
            super("IDENTITY_VERIFICATION_FAIL_STEP", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_OPEN_UI;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_OPEN_UI extends LinkEventName {

        @NotNull
        public static final IDENTITY_VERIFICATION_OPEN_UI INSTANCE = new IDENTITY_VERIFICATION_OPEN_UI();

        @NotNull
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_OPEN_UI> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_OPEN_UI> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_OPEN_UI createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_OPEN_UI.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_OPEN_UI[] newArray(int i10) {
                return new IDENTITY_VERIFICATION_OPEN_UI[i10];
            }
        }

        private IDENTITY_VERIFICATION_OPEN_UI() {
            super("IDENTITY_VERIFICATION_OPEN_UI", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_PASS_SESSION;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_PASS_SESSION extends LinkEventName {

        @NotNull
        public static final IDENTITY_VERIFICATION_PASS_SESSION INSTANCE = new IDENTITY_VERIFICATION_PASS_SESSION();

        @NotNull
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_PASS_SESSION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_PASS_SESSION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_PASS_SESSION createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_PASS_SESSION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_PASS_SESSION[] newArray(int i10) {
                return new IDENTITY_VERIFICATION_PASS_SESSION[i10];
            }
        }

        private IDENTITY_VERIFICATION_PASS_SESSION() {
            super("IDENTITY_VERIFICATION_PASS_SESSION", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_PASS_STEP;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_PASS_STEP extends LinkEventName {

        @NotNull
        public static final IDENTITY_VERIFICATION_PASS_STEP INSTANCE = new IDENTITY_VERIFICATION_PASS_STEP();

        @NotNull
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_PASS_STEP> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_PASS_STEP> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_PASS_STEP createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_PASS_STEP.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_PASS_STEP[] newArray(int i10) {
                return new IDENTITY_VERIFICATION_PASS_STEP[i10];
            }
        }

        private IDENTITY_VERIFICATION_PASS_STEP() {
            super("IDENTITY_VERIFICATION_PASS_STEP", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION extends LinkEventName {

        @NotNull
        public static final IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION INSTANCE = new IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION();

        @NotNull
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION[] newArray(int i10) {
                return new IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION[i10];
            }
        }

        private IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION() {
            super("IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_PENDING_REVIEW_STEP;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_PENDING_REVIEW_STEP extends LinkEventName {

        @NotNull
        public static final IDENTITY_VERIFICATION_PENDING_REVIEW_STEP INSTANCE = new IDENTITY_VERIFICATION_PENDING_REVIEW_STEP();

        @NotNull
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_PENDING_REVIEW_STEP> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_PENDING_REVIEW_STEP> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_PENDING_REVIEW_STEP createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_PENDING_REVIEW_STEP.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_PENDING_REVIEW_STEP[] newArray(int i10) {
                return new IDENTITY_VERIFICATION_PENDING_REVIEW_STEP[i10];
            }
        }

        private IDENTITY_VERIFICATION_PENDING_REVIEW_STEP() {
            super("IDENTITY_VERIFICATION_PENDING_REVIEW_STEP", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_RESUME_SESSION;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_RESUME_SESSION extends LinkEventName {

        @NotNull
        public static final IDENTITY_VERIFICATION_RESUME_SESSION INSTANCE = new IDENTITY_VERIFICATION_RESUME_SESSION();

        @NotNull
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_RESUME_SESSION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_RESUME_SESSION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_RESUME_SESSION createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_RESUME_SESSION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_RESUME_SESSION[] newArray(int i10) {
                return new IDENTITY_VERIFICATION_RESUME_SESSION[i10];
            }
        }

        private IDENTITY_VERIFICATION_RESUME_SESSION() {
            super("IDENTITY_VERIFICATION_RESUME_SESSION", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_RESUME_UI;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_RESUME_UI extends LinkEventName {

        @NotNull
        public static final IDENTITY_VERIFICATION_RESUME_UI INSTANCE = new IDENTITY_VERIFICATION_RESUME_UI();

        @NotNull
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_RESUME_UI> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_RESUME_UI> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_RESUME_UI createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_RESUME_UI.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_RESUME_UI[] newArray(int i10) {
                return new IDENTITY_VERIFICATION_RESUME_UI[i10];
            }
        }

        private IDENTITY_VERIFICATION_RESUME_UI() {
            super("IDENTITY_VERIFICATION_RESUME_UI", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$IDENTITY_VERIFICATION_START_STEP;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IDENTITY_VERIFICATION_START_STEP extends LinkEventName {

        @NotNull
        public static final IDENTITY_VERIFICATION_START_STEP INSTANCE = new IDENTITY_VERIFICATION_START_STEP();

        @NotNull
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_START_STEP> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_START_STEP> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_START_STEP createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_START_STEP.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IDENTITY_VERIFICATION_START_STEP[] newArray(int i10) {
                return new IDENTITY_VERIFICATION_START_STEP[i10];
            }
        }

        private IDENTITY_VERIFICATION_START_STEP() {
            super("IDENTITY_VERIFICATION_START_STEP", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$ISSUE_FOLLOWED;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ISSUE_FOLLOWED extends LinkEventName {

        @NotNull
        public static final ISSUE_FOLLOWED INSTANCE = new ISSUE_FOLLOWED();

        @NotNull
        public static final Parcelable.Creator<ISSUE_FOLLOWED> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ISSUE_FOLLOWED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ISSUE_FOLLOWED createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ISSUE_FOLLOWED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ISSUE_FOLLOWED[] newArray(int i10) {
                return new ISSUE_FOLLOWED[i10];
            }
        }

        private ISSUE_FOLLOWED() {
            super("ISSUE_FOLLOWED", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$LAYER_AUTOFILL_NOT_AVAILABLE;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LAYER_AUTOFILL_NOT_AVAILABLE extends LinkEventName {

        @NotNull
        public static final LAYER_AUTOFILL_NOT_AVAILABLE INSTANCE = new LAYER_AUTOFILL_NOT_AVAILABLE();

        @NotNull
        public static final Parcelable.Creator<LAYER_AUTOFILL_NOT_AVAILABLE> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LAYER_AUTOFILL_NOT_AVAILABLE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final LAYER_AUTOFILL_NOT_AVAILABLE createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LAYER_AUTOFILL_NOT_AVAILABLE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final LAYER_AUTOFILL_NOT_AVAILABLE[] newArray(int i10) {
                return new LAYER_AUTOFILL_NOT_AVAILABLE[i10];
            }
        }

        private LAYER_AUTOFILL_NOT_AVAILABLE() {
            super("LAYER_AUTOFILL_NOT_AVAILABLE", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$LAYER_NOT_AVAILABLE;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LAYER_NOT_AVAILABLE extends LinkEventName {

        @NotNull
        public static final LAYER_NOT_AVAILABLE INSTANCE = new LAYER_NOT_AVAILABLE();

        @NotNull
        public static final Parcelable.Creator<LAYER_NOT_AVAILABLE> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LAYER_NOT_AVAILABLE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final LAYER_NOT_AVAILABLE createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LAYER_NOT_AVAILABLE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final LAYER_NOT_AVAILABLE[] newArray(int i10) {
                return new LAYER_NOT_AVAILABLE[i10];
            }
        }

        private LAYER_NOT_AVAILABLE() {
            super("LAYER_NOT_AVAILABLE", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$LAYER_READY;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LAYER_READY extends LinkEventName {

        @NotNull
        public static final LAYER_READY INSTANCE = new LAYER_READY();

        @NotNull
        public static final Parcelable.Creator<LAYER_READY> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LAYER_READY> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final LAYER_READY createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LAYER_READY.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final LAYER_READY[] newArray(int i10) {
                return new LAYER_READY[i10];
            }
        }

        private LAYER_READY() {
            super("LAYER_READY", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$MATCHED_SELECT_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MATCHED_SELECT_INSTITUTION extends LinkEventName {

        @NotNull
        public static final MATCHED_SELECT_INSTITUTION INSTANCE = new MATCHED_SELECT_INSTITUTION();

        @NotNull
        public static final Parcelable.Creator<MATCHED_SELECT_INSTITUTION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MATCHED_SELECT_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final MATCHED_SELECT_INSTITUTION createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MATCHED_SELECT_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final MATCHED_SELECT_INSTITUTION[] newArray(int i10) {
                return new MATCHED_SELECT_INSTITUTION[i10];
            }
        }

        private MATCHED_SELECT_INSTITUTION() {
            super("MATCHED_SELECT_INSTITUTION", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$MATCHED_SELECT_VERIFY_METHOD;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MATCHED_SELECT_VERIFY_METHOD extends LinkEventName {

        @NotNull
        public static final MATCHED_SELECT_VERIFY_METHOD INSTANCE = new MATCHED_SELECT_VERIFY_METHOD();

        @NotNull
        public static final Parcelable.Creator<MATCHED_SELECT_VERIFY_METHOD> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MATCHED_SELECT_VERIFY_METHOD> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final MATCHED_SELECT_VERIFY_METHOD createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MATCHED_SELECT_VERIFY_METHOD.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final MATCHED_SELECT_VERIFY_METHOD[] newArray(int i10) {
                return new MATCHED_SELECT_VERIFY_METHOD[i10];
            }
        }

        private MATCHED_SELECT_VERIFY_METHOD() {
            super("MATCHED_SELECT_VERIFY_METHOD", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$OPEN;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OPEN extends LinkEventName {

        @NotNull
        public static final OPEN INSTANCE = new OPEN();

        @NotNull
        public static final Parcelable.Creator<OPEN> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OPEN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final OPEN createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OPEN.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final OPEN[] newArray(int i10) {
                return new OPEN[i10];
            }
        }

        private OPEN() {
            super("OPEN", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$OPEN_MY_PLAID;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OPEN_MY_PLAID extends LinkEventName {

        @NotNull
        public static final OPEN_MY_PLAID INSTANCE = new OPEN_MY_PLAID();

        @NotNull
        public static final Parcelable.Creator<OPEN_MY_PLAID> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OPEN_MY_PLAID> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final OPEN_MY_PLAID createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OPEN_MY_PLAID.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final OPEN_MY_PLAID[] newArray(int i10) {
                return new OPEN_MY_PLAID[i10];
            }
        }

        private OPEN_MY_PLAID() {
            super("OPEN_MY_PLAID", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$OPEN_OAUTH;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OPEN_OAUTH extends LinkEventName {

        @NotNull
        public static final OPEN_OAUTH INSTANCE = new OPEN_OAUTH();

        @NotNull
        public static final Parcelable.Creator<OPEN_OAUTH> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OPEN_OAUTH> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final OPEN_OAUTH createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OPEN_OAUTH.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final OPEN_OAUTH[] newArray(int i10) {
                return new OPEN_OAUTH[i10];
            }
        }

        private OPEN_OAUTH() {
            super("OPEN_OAUTH", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$PLAID_CHECK_PANE;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PLAID_CHECK_PANE extends LinkEventName {

        @NotNull
        public static final PLAID_CHECK_PANE INSTANCE = new PLAID_CHECK_PANE();

        @NotNull
        public static final Parcelable.Creator<PLAID_CHECK_PANE> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PLAID_CHECK_PANE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final PLAID_CHECK_PANE createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PLAID_CHECK_PANE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final PLAID_CHECK_PANE[] newArray(int i10) {
                return new PLAID_CHECK_PANE[i10];
            }
        }

        private PLAID_CHECK_PANE() {
            super("PLAID_CHECK_PANE", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$PROFILE_ELIGIBILITY_CHECK_READY;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PROFILE_ELIGIBILITY_CHECK_READY extends LinkEventName {

        @NotNull
        public static final PROFILE_ELIGIBILITY_CHECK_READY INSTANCE = new PROFILE_ELIGIBILITY_CHECK_READY();

        @NotNull
        public static final Parcelable.Creator<PROFILE_ELIGIBILITY_CHECK_READY> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PROFILE_ELIGIBILITY_CHECK_READY> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final PROFILE_ELIGIBILITY_CHECK_READY createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PROFILE_ELIGIBILITY_CHECK_READY.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final PROFILE_ELIGIBILITY_CHECK_READY[] newArray(int i10) {
                return new PROFILE_ELIGIBILITY_CHECK_READY[i10];
            }
        }

        private PROFILE_ELIGIBILITY_CHECK_READY() {
            super("PROFILE_ELIGIBILITY_CHECK_READY", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$REMEMBER_ME_DISABLED;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class REMEMBER_ME_DISABLED extends LinkEventName {

        @NotNull
        public static final REMEMBER_ME_DISABLED INSTANCE = new REMEMBER_ME_DISABLED();

        @NotNull
        public static final Parcelable.Creator<REMEMBER_ME_DISABLED> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<REMEMBER_ME_DISABLED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final REMEMBER_ME_DISABLED createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return REMEMBER_ME_DISABLED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final REMEMBER_ME_DISABLED[] newArray(int i10) {
                return new REMEMBER_ME_DISABLED[i10];
            }
        }

        private REMEMBER_ME_DISABLED() {
            super("REMEMBER_ME_DISABLED", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$REMEMBER_ME_ENABLED;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class REMEMBER_ME_ENABLED extends LinkEventName {

        @NotNull
        public static final REMEMBER_ME_ENABLED INSTANCE = new REMEMBER_ME_ENABLED();

        @NotNull
        public static final Parcelable.Creator<REMEMBER_ME_ENABLED> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<REMEMBER_ME_ENABLED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final REMEMBER_ME_ENABLED createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return REMEMBER_ME_ENABLED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final REMEMBER_ME_ENABLED[] newArray(int i10) {
                return new REMEMBER_ME_ENABLED[i10];
            }
        }

        private REMEMBER_ME_ENABLED() {
            super("REMEMBER_ME_ENABLED", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$REMEMBER_ME_HOLDOUT;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class REMEMBER_ME_HOLDOUT extends LinkEventName {

        @NotNull
        public static final REMEMBER_ME_HOLDOUT INSTANCE = new REMEMBER_ME_HOLDOUT();

        @NotNull
        public static final Parcelable.Creator<REMEMBER_ME_HOLDOUT> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<REMEMBER_ME_HOLDOUT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final REMEMBER_ME_HOLDOUT createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return REMEMBER_ME_HOLDOUT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final REMEMBER_ME_HOLDOUT[] newArray(int i10) {
                return new REMEMBER_ME_HOLDOUT[i10];
            }
        }

        private REMEMBER_ME_HOLDOUT() {
            super("REMEMBER_ME_HOLDOUT", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SEARCH_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SEARCH_INSTITUTION extends LinkEventName {

        @NotNull
        public static final SEARCH_INSTITUTION INSTANCE = new SEARCH_INSTITUTION();

        @NotNull
        public static final Parcelable.Creator<SEARCH_INSTITUTION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SEARCH_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SEARCH_INSTITUTION createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SEARCH_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SEARCH_INSTITUTION[] newArray(int i10) {
                return new SEARCH_INSTITUTION[i10];
            }
        }

        private SEARCH_INSTITUTION() {
            super("SEARCH_INSTITUTION", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SELECT_ACCOUNT;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELECT_ACCOUNT extends LinkEventName {

        @NotNull
        public static final SELECT_ACCOUNT INSTANCE = new SELECT_ACCOUNT();

        @NotNull
        public static final Parcelable.Creator<SELECT_ACCOUNT> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SELECT_ACCOUNT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SELECT_ACCOUNT createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SELECT_ACCOUNT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SELECT_ACCOUNT[] newArray(int i10) {
                return new SELECT_ACCOUNT[i10];
            }
        }

        private SELECT_ACCOUNT() {
            super("SELECT_ACCOUNT", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SELECT_AUTH_TYPE;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELECT_AUTH_TYPE extends LinkEventName {

        @NotNull
        public static final SELECT_AUTH_TYPE INSTANCE = new SELECT_AUTH_TYPE();

        @NotNull
        public static final Parcelable.Creator<SELECT_AUTH_TYPE> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SELECT_AUTH_TYPE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SELECT_AUTH_TYPE createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SELECT_AUTH_TYPE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SELECT_AUTH_TYPE[] newArray(int i10) {
                return new SELECT_AUTH_TYPE[i10];
            }
        }

        private SELECT_AUTH_TYPE() {
            super("SELECT_AUTH_TYPE", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SELECT_BRAND;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELECT_BRAND extends LinkEventName {

        @NotNull
        public static final SELECT_BRAND INSTANCE = new SELECT_BRAND();

        @NotNull
        public static final Parcelable.Creator<SELECT_BRAND> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SELECT_BRAND> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SELECT_BRAND createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SELECT_BRAND.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SELECT_BRAND[] newArray(int i10) {
                return new SELECT_BRAND[i10];
            }
        }

        private SELECT_BRAND() {
            super("SELECT_BRAND", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SELECT_DEGRADED_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELECT_DEGRADED_INSTITUTION extends LinkEventName {

        @NotNull
        public static final SELECT_DEGRADED_INSTITUTION INSTANCE = new SELECT_DEGRADED_INSTITUTION();

        @NotNull
        public static final Parcelable.Creator<SELECT_DEGRADED_INSTITUTION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SELECT_DEGRADED_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SELECT_DEGRADED_INSTITUTION createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SELECT_DEGRADED_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SELECT_DEGRADED_INSTITUTION[] newArray(int i10) {
                return new SELECT_DEGRADED_INSTITUTION[i10];
            }
        }

        private SELECT_DEGRADED_INSTITUTION() {
            super("SELECT_DEGRADED_INSTITUTION", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SELECT_DOWN_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELECT_DOWN_INSTITUTION extends LinkEventName {

        @NotNull
        public static final SELECT_DOWN_INSTITUTION INSTANCE = new SELECT_DOWN_INSTITUTION();

        @NotNull
        public static final Parcelable.Creator<SELECT_DOWN_INSTITUTION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SELECT_DOWN_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SELECT_DOWN_INSTITUTION createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SELECT_DOWN_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SELECT_DOWN_INSTITUTION[] newArray(int i10) {
                return new SELECT_DOWN_INSTITUTION[i10];
            }
        }

        private SELECT_DOWN_INSTITUTION() {
            super("SELECT_DOWN_INSTITUTION", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SELECT_FILTERED_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELECT_FILTERED_INSTITUTION extends LinkEventName {

        @NotNull
        public static final SELECT_FILTERED_INSTITUTION INSTANCE = new SELECT_FILTERED_INSTITUTION();

        @NotNull
        public static final Parcelable.Creator<SELECT_FILTERED_INSTITUTION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SELECT_FILTERED_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SELECT_FILTERED_INSTITUTION createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SELECT_FILTERED_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SELECT_FILTERED_INSTITUTION[] newArray(int i10) {
                return new SELECT_FILTERED_INSTITUTION[i10];
            }
        }

        private SELECT_FILTERED_INSTITUTION() {
            super("SELECT_FILTERED_INSTITUTION", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SELECT_INSTITUTION;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELECT_INSTITUTION extends LinkEventName {

        @NotNull
        public static final SELECT_INSTITUTION INSTANCE = new SELECT_INSTITUTION();

        @NotNull
        public static final Parcelable.Creator<SELECT_INSTITUTION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SELECT_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SELECT_INSTITUTION createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SELECT_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SELECT_INSTITUTION[] newArray(int i10) {
                return new SELECT_INSTITUTION[i10];
            }
        }

        private SELECT_INSTITUTION() {
            super("SELECT_INSTITUTION", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SKIP_SUBMIT_EMAIL;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SKIP_SUBMIT_EMAIL extends LinkEventName {

        @NotNull
        public static final SKIP_SUBMIT_EMAIL INSTANCE = new SKIP_SUBMIT_EMAIL();

        @NotNull
        public static final Parcelable.Creator<SKIP_SUBMIT_EMAIL> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SKIP_SUBMIT_EMAIL> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SKIP_SUBMIT_EMAIL createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SKIP_SUBMIT_EMAIL.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SKIP_SUBMIT_EMAIL[] newArray(int i10) {
                return new SKIP_SUBMIT_EMAIL[i10];
            }
        }

        private SKIP_SUBMIT_EMAIL() {
            super("SKIP_SUBMIT_EMAIL", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SKIP_SUBMIT_PHONE;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SKIP_SUBMIT_PHONE extends LinkEventName {

        @NotNull
        public static final SKIP_SUBMIT_PHONE INSTANCE = new SKIP_SUBMIT_PHONE();

        @NotNull
        public static final Parcelable.Creator<SKIP_SUBMIT_PHONE> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SKIP_SUBMIT_PHONE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SKIP_SUBMIT_PHONE createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SKIP_SUBMIT_PHONE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SKIP_SUBMIT_PHONE[] newArray(int i10) {
                return new SKIP_SUBMIT_PHONE[i10];
            }
        }

        private SKIP_SUBMIT_PHONE() {
            super("SKIP_SUBMIT_PHONE", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SUBMIT_ACCOUNT_NUMBER;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_ACCOUNT_NUMBER extends LinkEventName {

        @NotNull
        public static final SUBMIT_ACCOUNT_NUMBER INSTANCE = new SUBMIT_ACCOUNT_NUMBER();

        @NotNull
        public static final Parcelable.Creator<SUBMIT_ACCOUNT_NUMBER> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SUBMIT_ACCOUNT_NUMBER> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SUBMIT_ACCOUNT_NUMBER createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_ACCOUNT_NUMBER.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SUBMIT_ACCOUNT_NUMBER[] newArray(int i10) {
                return new SUBMIT_ACCOUNT_NUMBER[i10];
            }
        }

        private SUBMIT_ACCOUNT_NUMBER() {
            super("SUBMIT_ACCOUNT_NUMBER", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SUBMIT_CREDENTIALS;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_CREDENTIALS extends LinkEventName {

        @NotNull
        public static final SUBMIT_CREDENTIALS INSTANCE = new SUBMIT_CREDENTIALS();

        @NotNull
        public static final Parcelable.Creator<SUBMIT_CREDENTIALS> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SUBMIT_CREDENTIALS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SUBMIT_CREDENTIALS createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_CREDENTIALS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SUBMIT_CREDENTIALS[] newArray(int i10) {
                return new SUBMIT_CREDENTIALS[i10];
            }
        }

        private SUBMIT_CREDENTIALS() {
            super("SUBMIT_CREDENTIALS", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SUBMIT_DOCUMENTS;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_DOCUMENTS extends LinkEventName {

        @NotNull
        public static final SUBMIT_DOCUMENTS INSTANCE = new SUBMIT_DOCUMENTS();

        @NotNull
        public static final Parcelable.Creator<SUBMIT_DOCUMENTS> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SUBMIT_DOCUMENTS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SUBMIT_DOCUMENTS createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_DOCUMENTS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SUBMIT_DOCUMENTS[] newArray(int i10) {
                return new SUBMIT_DOCUMENTS[i10];
            }
        }

        private SUBMIT_DOCUMENTS() {
            super("SUBMIT_DOCUMENTS", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SUBMIT_DOCUMENTS_ERROR;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_DOCUMENTS_ERROR extends LinkEventName {

        @NotNull
        public static final SUBMIT_DOCUMENTS_ERROR INSTANCE = new SUBMIT_DOCUMENTS_ERROR();

        @NotNull
        public static final Parcelable.Creator<SUBMIT_DOCUMENTS_ERROR> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SUBMIT_DOCUMENTS_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SUBMIT_DOCUMENTS_ERROR createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_DOCUMENTS_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SUBMIT_DOCUMENTS_ERROR[] newArray(int i10) {
                return new SUBMIT_DOCUMENTS_ERROR[i10];
            }
        }

        private SUBMIT_DOCUMENTS_ERROR() {
            super("SUBMIT_DOCUMENTS_ERROR", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SUBMIT_DOCUMENTS_SUCCESS;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_DOCUMENTS_SUCCESS extends LinkEventName {

        @NotNull
        public static final SUBMIT_DOCUMENTS_SUCCESS INSTANCE = new SUBMIT_DOCUMENTS_SUCCESS();

        @NotNull
        public static final Parcelable.Creator<SUBMIT_DOCUMENTS_SUCCESS> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SUBMIT_DOCUMENTS_SUCCESS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SUBMIT_DOCUMENTS_SUCCESS createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_DOCUMENTS_SUCCESS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SUBMIT_DOCUMENTS_SUCCESS[] newArray(int i10) {
                return new SUBMIT_DOCUMENTS_SUCCESS[i10];
            }
        }

        private SUBMIT_DOCUMENTS_SUCCESS() {
            super("SUBMIT_DOCUMENTS_SUCCESS", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SUBMIT_EMAIL;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_EMAIL extends LinkEventName {

        @NotNull
        public static final SUBMIT_EMAIL INSTANCE = new SUBMIT_EMAIL();

        @NotNull
        public static final Parcelable.Creator<SUBMIT_EMAIL> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SUBMIT_EMAIL> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SUBMIT_EMAIL createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_EMAIL.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SUBMIT_EMAIL[] newArray(int i10) {
                return new SUBMIT_EMAIL[i10];
            }
        }

        private SUBMIT_EMAIL() {
            super("SUBMIT_EMAIL", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SUBMIT_MFA;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_MFA extends LinkEventName {

        @NotNull
        public static final SUBMIT_MFA INSTANCE = new SUBMIT_MFA();

        @NotNull
        public static final Parcelable.Creator<SUBMIT_MFA> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SUBMIT_MFA> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SUBMIT_MFA createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_MFA.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SUBMIT_MFA[] newArray(int i10) {
                return new SUBMIT_MFA[i10];
            }
        }

        private SUBMIT_MFA() {
            super("SUBMIT_MFA", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SUBMIT_OTP;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_OTP extends LinkEventName {

        @NotNull
        public static final SUBMIT_OTP INSTANCE = new SUBMIT_OTP();

        @NotNull
        public static final Parcelable.Creator<SUBMIT_OTP> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SUBMIT_OTP> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SUBMIT_OTP createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_OTP.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SUBMIT_OTP[] newArray(int i10) {
                return new SUBMIT_OTP[i10];
            }
        }

        private SUBMIT_OTP() {
            super("SUBMIT_OTP", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SUBMIT_PHONE;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_PHONE extends LinkEventName {

        @NotNull
        public static final SUBMIT_PHONE INSTANCE = new SUBMIT_PHONE();

        @NotNull
        public static final Parcelable.Creator<SUBMIT_PHONE> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SUBMIT_PHONE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SUBMIT_PHONE createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_PHONE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SUBMIT_PHONE[] newArray(int i10) {
                return new SUBMIT_PHONE[i10];
            }
        }

        private SUBMIT_PHONE() {
            super("SUBMIT_PHONE", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$SUBMIT_ROUTING_NUMBER;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_ROUTING_NUMBER extends LinkEventName {

        @NotNull
        public static final SUBMIT_ROUTING_NUMBER INSTANCE = new SUBMIT_ROUTING_NUMBER();

        @NotNull
        public static final Parcelable.Creator<SUBMIT_ROUTING_NUMBER> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SUBMIT_ROUTING_NUMBER> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SUBMIT_ROUTING_NUMBER createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_ROUTING_NUMBER.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SUBMIT_ROUTING_NUMBER[] newArray(int i10) {
                return new SUBMIT_ROUTING_NUMBER[i10];
            }
        }

        private SUBMIT_ROUTING_NUMBER() {
            super("SUBMIT_ROUTING_NUMBER", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$TRANSITION_VIEW;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TRANSITION_VIEW extends LinkEventName {

        @NotNull
        public static final TRANSITION_VIEW INSTANCE = new TRANSITION_VIEW();

        @NotNull
        public static final Parcelable.Creator<TRANSITION_VIEW> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TRANSITION_VIEW> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final TRANSITION_VIEW createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TRANSITION_VIEW.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final TRANSITION_VIEW[] newArray(int i10) {
                return new TRANSITION_VIEW[i10];
            }
        }

        private TRANSITION_VIEW() {
            super("TRANSITION_VIEW", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\tHÖ\u0001J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/plaid/link/event/LinkEventName$UNKNOWN;", "Lcom/plaid/link/event/LinkEventName;", "rawJson", "", "(Ljava/lang/String;)V", "getRawJson", "()Ljava/lang/String;", "setRawJson", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UNKNOWN extends LinkEventName {

        @NotNull
        public static final Parcelable.Creator<UNKNOWN> CREATOR = new Creator();

        @NotNull
        private String rawJson;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UNKNOWN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final UNKNOWN createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UNKNOWN(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final UNKNOWN[] newArray(int i10) {
                return new UNKNOWN[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UNKNOWN(@NotNull String rawJson) {
            super(rawJson, null);
            Intrinsics.checkNotNullParameter(rawJson, "rawJson");
            this.rawJson = rawJson;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final String getRawJson() {
            return this.rawJson;
        }

        public final void setRawJson(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.rawJson = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.rawJson);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$VERIFY_PHONE;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VERIFY_PHONE extends LinkEventName {

        @NotNull
        public static final VERIFY_PHONE INSTANCE = new VERIFY_PHONE();

        @NotNull
        public static final Parcelable.Creator<VERIFY_PHONE> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VERIFY_PHONE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final VERIFY_PHONE createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return VERIFY_PHONE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final VERIFY_PHONE[] newArray(int i10) {
                return new VERIFY_PHONE[i10];
            }
        }

        private VERIFY_PHONE() {
            super("VERIFY_PHONE", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventName$VIEW_DATA_TYPES;", "Lcom/plaid/link/event/LinkEventName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VIEW_DATA_TYPES extends LinkEventName {

        @NotNull
        public static final VIEW_DATA_TYPES INSTANCE = new VIEW_DATA_TYPES();

        @NotNull
        public static final Parcelable.Creator<VIEW_DATA_TYPES> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VIEW_DATA_TYPES> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final VIEW_DATA_TYPES createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return VIEW_DATA_TYPES.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final VIEW_DATA_TYPES[] newArray(int i10) {
                return new VIEW_DATA_TYPES[i10];
            }
        }

        private VIEW_DATA_TYPES() {
            super("VIEW_DATA_TYPES", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    static {
        BANK_INCOME_INSIGHTS_COMPLETED bank_income_insights_completed = BANK_INCOME_INSIGHTS_COMPLETED.INSTANCE;
        Pair pair = TuplesKt.to(bank_income_insights_completed.getJson(), bank_income_insights_completed);
        CLOSE_OAUTH close_oauth = CLOSE_OAUTH.INSTANCE;
        Pair pair2 = TuplesKt.to(close_oauth.getJson(), close_oauth);
        ERROR error = ERROR.INSTANCE;
        Pair pair3 = TuplesKt.to(error.getJson(), error);
        EXIT exit = EXIT.INSTANCE;
        Pair pair4 = TuplesKt.to(exit.getJson(), exit);
        FAIL_OAUTH fail_oauth = FAIL_OAUTH.INSTANCE;
        Pair pair5 = TuplesKt.to(fail_oauth.getJson(), fail_oauth);
        HANDOFF handoff = HANDOFF.INSTANCE;
        Pair pair6 = TuplesKt.to(handoff.getJson(), handoff);
        IDENTITY_MATCH_PASSED identity_match_passed = IDENTITY_MATCH_PASSED.INSTANCE;
        Pair pair7 = TuplesKt.to(identity_match_passed.getJson(), identity_match_passed);
        IDENTITY_MATCH_FAILED identity_match_failed = IDENTITY_MATCH_FAILED.INSTANCE;
        Pair pair8 = TuplesKt.to(identity_match_failed.getJson(), identity_match_failed);
        IDENTITY_VERIFICATION_START_STEP identity_verification_start_step = IDENTITY_VERIFICATION_START_STEP.INSTANCE;
        Pair pair9 = TuplesKt.to(identity_verification_start_step.getJson(), identity_verification_start_step);
        IDENTITY_VERIFICATION_PASS_STEP identity_verification_pass_step = IDENTITY_VERIFICATION_PASS_STEP.INSTANCE;
        Pair pair10 = TuplesKt.to(identity_verification_pass_step.getJson(), identity_verification_pass_step);
        IDENTITY_VERIFICATION_FAIL_STEP identity_verification_fail_step = IDENTITY_VERIFICATION_FAIL_STEP.INSTANCE;
        Pair pair11 = TuplesKt.to(identity_verification_fail_step.getJson(), identity_verification_fail_step);
        IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION identity_verification_pending_review_session = IDENTITY_VERIFICATION_PENDING_REVIEW_SESSION.INSTANCE;
        Pair pair12 = TuplesKt.to(identity_verification_pending_review_session.getJson(), identity_verification_pending_review_session);
        IDENTITY_VERIFICATION_PENDING_REVIEW_STEP identity_verification_pending_review_step = IDENTITY_VERIFICATION_PENDING_REVIEW_STEP.INSTANCE;
        Pair pair13 = TuplesKt.to(identity_verification_pending_review_step.getJson(), identity_verification_pending_review_step);
        IDENTITY_VERIFICATION_CREATE_SESSION identity_verification_create_session = IDENTITY_VERIFICATION_CREATE_SESSION.INSTANCE;
        Pair pair14 = TuplesKt.to(identity_verification_create_session.getJson(), identity_verification_create_session);
        IDENTITY_VERIFICATION_RESUME_SESSION identity_verification_resume_session = IDENTITY_VERIFICATION_RESUME_SESSION.INSTANCE;
        Pair pair15 = TuplesKt.to(identity_verification_resume_session.getJson(), identity_verification_resume_session);
        IDENTITY_VERIFICATION_PASS_SESSION identity_verification_pass_session = IDENTITY_VERIFICATION_PASS_SESSION.INSTANCE;
        Pair pair16 = TuplesKt.to(identity_verification_pass_session.getJson(), identity_verification_pass_session);
        IDENTITY_VERIFICATION_FAIL_SESSION identity_verification_fail_session = IDENTITY_VERIFICATION_FAIL_SESSION.INSTANCE;
        Pair pair17 = TuplesKt.to(identity_verification_fail_session.getJson(), identity_verification_fail_session);
        IDENTITY_VERIFICATION_OPEN_UI identity_verification_open_ui = IDENTITY_VERIFICATION_OPEN_UI.INSTANCE;
        Pair pair18 = TuplesKt.to(identity_verification_open_ui.getJson(), identity_verification_open_ui);
        IDENTITY_VERIFICATION_RESUME_UI identity_verification_resume_ui = IDENTITY_VERIFICATION_RESUME_UI.INSTANCE;
        Pair pair19 = TuplesKt.to(identity_verification_resume_ui.getJson(), identity_verification_resume_ui);
        IDENTITY_VERIFICATION_CLOSE_UI identity_verification_close_ui = IDENTITY_VERIFICATION_CLOSE_UI.INSTANCE;
        Pair pair20 = TuplesKt.to(identity_verification_close_ui.getJson(), identity_verification_close_ui);
        ISSUE_FOLLOWED issue_followed = ISSUE_FOLLOWED.INSTANCE;
        Pair pair21 = TuplesKt.to(issue_followed.getJson(), issue_followed);
        MATCHED_SELECT_INSTITUTION matched_select_institution = MATCHED_SELECT_INSTITUTION.INSTANCE;
        Pair pair22 = TuplesKt.to(matched_select_institution.getJson(), matched_select_institution);
        MATCHED_SELECT_VERIFY_METHOD matched_select_verify_method = MATCHED_SELECT_VERIFY_METHOD.INSTANCE;
        Pair pair23 = TuplesKt.to(matched_select_verify_method.getJson(), matched_select_verify_method);
        OPEN open = OPEN.INSTANCE;
        Pair pair24 = TuplesKt.to(open.getJson(), open);
        OPEN_MY_PLAID open_my_plaid = OPEN_MY_PLAID.INSTANCE;
        Pair pair25 = TuplesKt.to(open_my_plaid.getJson(), open_my_plaid);
        OPEN_OAUTH open_oauth = OPEN_OAUTH.INSTANCE;
        Pair pair26 = TuplesKt.to(open_oauth.getJson(), open_oauth);
        PROFILE_ELIGIBILITY_CHECK_READY profile_eligibility_check_ready = PROFILE_ELIGIBILITY_CHECK_READY.INSTANCE;
        Pair pair27 = TuplesKt.to(profile_eligibility_check_ready.getJson(), profile_eligibility_check_ready);
        SEARCH_INSTITUTION search_institution = SEARCH_INSTITUTION.INSTANCE;
        Pair pair28 = TuplesKt.to(search_institution.getJson(), search_institution);
        SELECT_ACCOUNT select_account = SELECT_ACCOUNT.INSTANCE;
        Pair pair29 = TuplesKt.to(select_account.getJson(), select_account);
        SELECT_AUTH_TYPE select_auth_type = SELECT_AUTH_TYPE.INSTANCE;
        Pair pair30 = TuplesKt.to(select_auth_type.getJson(), select_auth_type);
        SELECT_BRAND select_brand = SELECT_BRAND.INSTANCE;
        Pair pair31 = TuplesKt.to(select_brand.getJson(), select_brand);
        SELECT_DEGRADED_INSTITUTION select_degraded_institution = SELECT_DEGRADED_INSTITUTION.INSTANCE;
        Pair pair32 = TuplesKt.to(select_degraded_institution.getJson(), select_degraded_institution);
        SELECT_FILTERED_INSTITUTION select_filtered_institution = SELECT_FILTERED_INSTITUTION.INSTANCE;
        Pair pair33 = TuplesKt.to(select_filtered_institution.getJson(), select_filtered_institution);
        SELECT_DOWN_INSTITUTION select_down_institution = SELECT_DOWN_INSTITUTION.INSTANCE;
        Pair pair34 = TuplesKt.to(select_down_institution.getJson(), select_down_institution);
        SELECT_INSTITUTION select_institution = SELECT_INSTITUTION.INSTANCE;
        Pair pair35 = TuplesKt.to(select_institution.getJson(), select_institution);
        SUBMIT_CREDENTIALS submit_credentials = SUBMIT_CREDENTIALS.INSTANCE;
        Pair pair36 = TuplesKt.to(submit_credentials.getJson(), submit_credentials);
        SUBMIT_MFA submit_mfa = SUBMIT_MFA.INSTANCE;
        Pair pair37 = TuplesKt.to(submit_mfa.getJson(), submit_mfa);
        SUBMIT_ROUTING_NUMBER submit_routing_number = SUBMIT_ROUTING_NUMBER.INSTANCE;
        Pair pair38 = TuplesKt.to(submit_routing_number.getJson(), submit_routing_number);
        SUBMIT_ACCOUNT_NUMBER submit_account_number = SUBMIT_ACCOUNT_NUMBER.INSTANCE;
        Pair pair39 = TuplesKt.to(submit_account_number.getJson(), submit_account_number);
        SUBMIT_DOCUMENTS submit_documents = SUBMIT_DOCUMENTS.INSTANCE;
        Pair pair40 = TuplesKt.to(submit_documents.getJson(), submit_documents);
        SUBMIT_DOCUMENTS_SUCCESS submit_documents_success = SUBMIT_DOCUMENTS_SUCCESS.INSTANCE;
        Pair pair41 = TuplesKt.to(submit_documents_success.getJson(), submit_documents_success);
        SUBMIT_DOCUMENTS_ERROR submit_documents_error = SUBMIT_DOCUMENTS_ERROR.INSTANCE;
        Pair pair42 = TuplesKt.to(submit_documents_error.getJson(), submit_documents_error);
        VIEW_DATA_TYPES view_data_types = VIEW_DATA_TYPES.INSTANCE;
        Pair pair43 = TuplesKt.to(view_data_types.getJson(), view_data_types);
        SUBMIT_EMAIL submit_email = SUBMIT_EMAIL.INSTANCE;
        Pair pair44 = TuplesKt.to(submit_email.getJson(), submit_email);
        SUBMIT_OTP submit_otp = SUBMIT_OTP.INSTANCE;
        Pair pair45 = TuplesKt.to(submit_otp.getJson(), submit_otp);
        SUBMIT_PHONE submit_phone = SUBMIT_PHONE.INSTANCE;
        Pair pair46 = TuplesKt.to(submit_phone.getJson(), submit_phone);
        AUTO_SUBMIT_PHONE auto_submit_phone = AUTO_SUBMIT_PHONE.INSTANCE;
        Pair pair47 = TuplesKt.to(auto_submit_phone.getJson(), auto_submit_phone);
        SKIP_SUBMIT_EMAIL skip_submit_email = SKIP_SUBMIT_EMAIL.INSTANCE;
        Pair pair48 = TuplesKt.to(skip_submit_email.getJson(), skip_submit_email);
        SKIP_SUBMIT_PHONE skip_submit_phone = SKIP_SUBMIT_PHONE.INSTANCE;
        Pair pair49 = TuplesKt.to(skip_submit_phone.getJson(), skip_submit_phone);
        VERIFY_PHONE verify_phone = VERIFY_PHONE.INSTANCE;
        Pair pair50 = TuplesKt.to(verify_phone.getJson(), verify_phone);
        CONNECT_NEW_INSTITUTION connect_new_institution = CONNECT_NEW_INSTITUTION.INSTANCE;
        Pair pair51 = TuplesKt.to(connect_new_institution.getJson(), connect_new_institution);
        REMEMBER_ME_ENABLED remember_me_enabled = REMEMBER_ME_ENABLED.INSTANCE;
        Pair pair52 = TuplesKt.to(remember_me_enabled.getJson(), remember_me_enabled);
        REMEMBER_ME_DISABLED remember_me_disabled = REMEMBER_ME_DISABLED.INSTANCE;
        Pair pair53 = TuplesKt.to(remember_me_disabled.getJson(), remember_me_disabled);
        REMEMBER_ME_HOLDOUT remember_me_holdout = REMEMBER_ME_HOLDOUT.INSTANCE;
        Pair pair54 = TuplesKt.to(remember_me_holdout.getJson(), remember_me_holdout);
        TRANSITION_VIEW transition_view = TRANSITION_VIEW.INSTANCE;
        Pair pair55 = TuplesKt.to(transition_view.getJson(), transition_view);
        LAYER_AUTOFILL_NOT_AVAILABLE layer_autofill_not_available = LAYER_AUTOFILL_NOT_AVAILABLE.INSTANCE;
        Pair pair56 = TuplesKt.to(layer_autofill_not_available.getJson(), layer_autofill_not_available);
        LAYER_READY layer_ready = LAYER_READY.INSTANCE;
        Pair pair57 = TuplesKt.to(layer_ready.getJson(), layer_ready);
        LAYER_NOT_AVAILABLE layer_not_available = LAYER_NOT_AVAILABLE.INSTANCE;
        Pair pair58 = TuplesKt.to(layer_not_available.getJson(), layer_not_available);
        PLAID_CHECK_PANE plaid_check_pane = PLAID_CHECK_PANE.INSTANCE;
        Pair pair59 = TuplesKt.to(plaid_check_pane.getJson(), plaid_check_pane);
        AUTO_SELECT_SAVED_INSTITUTION auto_select_saved_institution = AUTO_SELECT_SAVED_INSTITUTION.INSTANCE;
        map = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, pair29, pair30, pair31, pair32, pair33, pair34, pair35, pair36, pair37, pair38, pair39, pair40, pair41, pair42, pair43, pair44, pair45, pair46, pair47, pair48, pair49, pair50, pair51, pair52, pair53, pair54, pair55, pair56, pair57, pair58, pair59, TuplesKt.to(auto_select_saved_institution.getJson(), auto_select_saved_institution));
    }

    public /* synthetic */ LinkEventName(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getJson() {
        return this.json;
    }

    @NotNull
    public String toString() {
        return this.json;
    }

    private LinkEventName(String str) {
        this.json = str;
    }
}
