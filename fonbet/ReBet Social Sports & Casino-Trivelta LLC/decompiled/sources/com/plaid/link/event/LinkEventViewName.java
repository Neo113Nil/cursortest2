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
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \r2\u00020\u0001:)\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u0082\u0001(123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWX¨\u0006Y"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName;", "Landroid/os/Parcelable;", "jsonValue", "", "(Ljava/lang/String;)V", "getJsonValue", "()Ljava/lang/String;", "setJsonValue", "ACCEPT_TOS", "BANK_INCOME_INSIGHTS_COMPLETED", "CONNECTED", "CONSENT", "CREDENTIAL", "Companion", "DATA_TRANSPARENCY", "DATA_TRANSPARENCY_CONSENT", "DOCUMENTARY_VERIFICATION", "ERROR", "EXIT", "KYC_CHECK", "LOADING", "MATCHED_CONSENT", "MATCHED_CREDENTIAL", "MATCHED_MFA", "MFA", "NUMBERS", "NUMBERS_SELECT_INSTITUTION", "OAUTH", "PROFILE_DATA_REVIEW", "RECAPTCHA", "RISK_CHECK", "SCREENING", "SELECT_ACCOUNT", "SELECT_AUTH_TYPE", "SELECT_BRAND", "SELECT_INSTITUTION", "SELECT_SAVED_ACCOUNT", "SELECT_SAVED_INSTITUTION", "SELFIE_CHECK", "SUBMIT_DOCUMENTS", "SUBMIT_DOCUMENTS_ERROR", "SUBMIT_DOCUMENTS_SUCCESS", "SUBMIT_EMAIL", "SUBMIT_PHONE", "UNKNOWN", "UPLOAD_DOCUMENTS", "VERIFY_EMAIL", "VERIFY_PHONE", "VERIFY_SMS", "Lcom/plaid/link/event/LinkEventViewName$ACCEPT_TOS;", "Lcom/plaid/link/event/LinkEventViewName$BANK_INCOME_INSIGHTS_COMPLETED;", "Lcom/plaid/link/event/LinkEventViewName$CONNECTED;", "Lcom/plaid/link/event/LinkEventViewName$CONSENT;", "Lcom/plaid/link/event/LinkEventViewName$CREDENTIAL;", "Lcom/plaid/link/event/LinkEventViewName$DATA_TRANSPARENCY;", "Lcom/plaid/link/event/LinkEventViewName$DATA_TRANSPARENCY_CONSENT;", "Lcom/plaid/link/event/LinkEventViewName$DOCUMENTARY_VERIFICATION;", "Lcom/plaid/link/event/LinkEventViewName$ERROR;", "Lcom/plaid/link/event/LinkEventViewName$EXIT;", "Lcom/plaid/link/event/LinkEventViewName$KYC_CHECK;", "Lcom/plaid/link/event/LinkEventViewName$LOADING;", "Lcom/plaid/link/event/LinkEventViewName$MATCHED_CONSENT;", "Lcom/plaid/link/event/LinkEventViewName$MATCHED_CREDENTIAL;", "Lcom/plaid/link/event/LinkEventViewName$MATCHED_MFA;", "Lcom/plaid/link/event/LinkEventViewName$MFA;", "Lcom/plaid/link/event/LinkEventViewName$NUMBERS;", "Lcom/plaid/link/event/LinkEventViewName$NUMBERS_SELECT_INSTITUTION;", "Lcom/plaid/link/event/LinkEventViewName$OAUTH;", "Lcom/plaid/link/event/LinkEventViewName$PROFILE_DATA_REVIEW;", "Lcom/plaid/link/event/LinkEventViewName$RECAPTCHA;", "Lcom/plaid/link/event/LinkEventViewName$RISK_CHECK;", "Lcom/plaid/link/event/LinkEventViewName$SCREENING;", "Lcom/plaid/link/event/LinkEventViewName$SELECT_ACCOUNT;", "Lcom/plaid/link/event/LinkEventViewName$SELECT_AUTH_TYPE;", "Lcom/plaid/link/event/LinkEventViewName$SELECT_BRAND;", "Lcom/plaid/link/event/LinkEventViewName$SELECT_INSTITUTION;", "Lcom/plaid/link/event/LinkEventViewName$SELECT_SAVED_ACCOUNT;", "Lcom/plaid/link/event/LinkEventViewName$SELECT_SAVED_INSTITUTION;", "Lcom/plaid/link/event/LinkEventViewName$SELFIE_CHECK;", "Lcom/plaid/link/event/LinkEventViewName$SUBMIT_DOCUMENTS;", "Lcom/plaid/link/event/LinkEventViewName$SUBMIT_DOCUMENTS_ERROR;", "Lcom/plaid/link/event/LinkEventViewName$SUBMIT_DOCUMENTS_SUCCESS;", "Lcom/plaid/link/event/LinkEventViewName$SUBMIT_EMAIL;", "Lcom/plaid/link/event/LinkEventViewName$SUBMIT_PHONE;", "Lcom/plaid/link/event/LinkEventViewName$UNKNOWN;", "Lcom/plaid/link/event/LinkEventViewName$UPLOAD_DOCUMENTS;", "Lcom/plaid/link/event/LinkEventViewName$VERIFY_EMAIL;", "Lcom/plaid/link/event/LinkEventViewName$VERIFY_PHONE;", "Lcom/plaid/link/event/LinkEventViewName$VERIFY_SMS;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class LinkEventViewName implements Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<String, LinkEventViewName> map;

    @NotNull
    private String jsonValue;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$ACCEPT_TOS;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ACCEPT_TOS extends LinkEventViewName {

        @NotNull
        public static final ACCEPT_TOS INSTANCE = new ACCEPT_TOS();

        @NotNull
        public static final Parcelable.Creator<ACCEPT_TOS> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ACCEPT_TOS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ACCEPT_TOS createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ACCEPT_TOS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final ACCEPT_TOS[] newArray(int i10) {
                return new ACCEPT_TOS[i10];
            }
        }

        private ACCEPT_TOS() {
            super("ACCEPT_TOS", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$BANK_INCOME_INSIGHTS_COMPLETED;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BANK_INCOME_INSIGHTS_COMPLETED extends LinkEventViewName {

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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$CONNECTED;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CONNECTED extends LinkEventViewName {

        @NotNull
        public static final CONNECTED INSTANCE = new CONNECTED();

        @NotNull
        public static final Parcelable.Creator<CONNECTED> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CONNECTED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final CONNECTED createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CONNECTED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final CONNECTED[] newArray(int i10) {
                return new CONNECTED[i10];
            }
        }

        private CONNECTED() {
            super("CONNECTED", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$CONSENT;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CONSENT extends LinkEventViewName {

        @NotNull
        public static final CONSENT INSTANCE = new CONSENT();

        @NotNull
        public static final Parcelable.Creator<CONSENT> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CONSENT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final CONSENT createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CONSENT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final CONSENT[] newArray(int i10) {
                return new CONSENT[i10];
            }
        }

        private CONSENT() {
            super("CONSENT", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$CREDENTIAL;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CREDENTIAL extends LinkEventViewName {

        @NotNull
        public static final CREDENTIAL INSTANCE = new CREDENTIAL();

        @NotNull
        public static final Parcelable.Creator<CREDENTIAL> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CREDENTIAL> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final CREDENTIAL createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CREDENTIAL.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final CREDENTIAL[] newArray(int i10) {
                return new CREDENTIAL[i10];
            }
        }

        private CREDENTIAL() {
            super("CREDENTIAL", null);
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\b\tR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$Companion;", "", "()V", "map", "", "", "Lcom/plaid/link/event/LinkEventViewName;", "fromString", "eventName", "fromString$link_sdk_release", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final LinkEventViewName fromString$link_sdk_release(@Nullable String eventName) {
            if (eventName == null || eventName.length() == 0) {
                return null;
            }
            LinkEventViewName linkEventViewName = (LinkEventViewName) LinkEventViewName.map.get(eventName);
            return linkEventViewName == null ? new UNKNOWN(eventName) : linkEventViewName;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$DATA_TRANSPARENCY;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DATA_TRANSPARENCY extends LinkEventViewName {

        @NotNull
        public static final DATA_TRANSPARENCY INSTANCE = new DATA_TRANSPARENCY();

        @NotNull
        public static final Parcelable.Creator<DATA_TRANSPARENCY> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DATA_TRANSPARENCY> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final DATA_TRANSPARENCY createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DATA_TRANSPARENCY.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final DATA_TRANSPARENCY[] newArray(int i10) {
                return new DATA_TRANSPARENCY[i10];
            }
        }

        private DATA_TRANSPARENCY() {
            super("DATA_TRANSPARENCY", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$DATA_TRANSPARENCY_CONSENT;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DATA_TRANSPARENCY_CONSENT extends LinkEventViewName {

        @NotNull
        public static final DATA_TRANSPARENCY_CONSENT INSTANCE = new DATA_TRANSPARENCY_CONSENT();

        @NotNull
        public static final Parcelable.Creator<DATA_TRANSPARENCY_CONSENT> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DATA_TRANSPARENCY_CONSENT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final DATA_TRANSPARENCY_CONSENT createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DATA_TRANSPARENCY_CONSENT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final DATA_TRANSPARENCY_CONSENT[] newArray(int i10) {
                return new DATA_TRANSPARENCY_CONSENT[i10];
            }
        }

        private DATA_TRANSPARENCY_CONSENT() {
            super("DATA_TRANSPARENCY_CONSENT", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$DOCUMENTARY_VERIFICATION;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DOCUMENTARY_VERIFICATION extends LinkEventViewName {

        @NotNull
        public static final DOCUMENTARY_VERIFICATION INSTANCE = new DOCUMENTARY_VERIFICATION();

        @NotNull
        public static final Parcelable.Creator<DOCUMENTARY_VERIFICATION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DOCUMENTARY_VERIFICATION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final DOCUMENTARY_VERIFICATION createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DOCUMENTARY_VERIFICATION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final DOCUMENTARY_VERIFICATION[] newArray(int i10) {
                return new DOCUMENTARY_VERIFICATION[i10];
            }
        }

        private DOCUMENTARY_VERIFICATION() {
            super("DOCUMENTARY_VERIFICATION", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$ERROR;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ERROR extends LinkEventViewName {

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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$EXIT;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EXIT extends LinkEventViewName {

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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$KYC_CHECK;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class KYC_CHECK extends LinkEventViewName {

        @NotNull
        public static final KYC_CHECK INSTANCE = new KYC_CHECK();

        @NotNull
        public static final Parcelable.Creator<KYC_CHECK> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<KYC_CHECK> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final KYC_CHECK createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return KYC_CHECK.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final KYC_CHECK[] newArray(int i10) {
                return new KYC_CHECK[i10];
            }
        }

        private KYC_CHECK() {
            super("KYC_CHECK", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$LOADING;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LOADING extends LinkEventViewName {

        @NotNull
        public static final LOADING INSTANCE = new LOADING();

        @NotNull
        public static final Parcelable.Creator<LOADING> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LOADING> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final LOADING createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LOADING.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final LOADING[] newArray(int i10) {
                return new LOADING[i10];
            }
        }

        private LOADING() {
            super("LOADING", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$MATCHED_CONSENT;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MATCHED_CONSENT extends LinkEventViewName {

        @NotNull
        public static final MATCHED_CONSENT INSTANCE = new MATCHED_CONSENT();

        @NotNull
        public static final Parcelable.Creator<MATCHED_CONSENT> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MATCHED_CONSENT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final MATCHED_CONSENT createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MATCHED_CONSENT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final MATCHED_CONSENT[] newArray(int i10) {
                return new MATCHED_CONSENT[i10];
            }
        }

        private MATCHED_CONSENT() {
            super("MATCHED_CONSENT", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$MATCHED_CREDENTIAL;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MATCHED_CREDENTIAL extends LinkEventViewName {

        @NotNull
        public static final MATCHED_CREDENTIAL INSTANCE = new MATCHED_CREDENTIAL();

        @NotNull
        public static final Parcelable.Creator<MATCHED_CREDENTIAL> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MATCHED_CREDENTIAL> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final MATCHED_CREDENTIAL createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MATCHED_CREDENTIAL.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final MATCHED_CREDENTIAL[] newArray(int i10) {
                return new MATCHED_CREDENTIAL[i10];
            }
        }

        private MATCHED_CREDENTIAL() {
            super("MATCHED_CREDENTIAL", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$MATCHED_MFA;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MATCHED_MFA extends LinkEventViewName {

        @NotNull
        public static final MATCHED_MFA INSTANCE = new MATCHED_MFA();

        @NotNull
        public static final Parcelable.Creator<MATCHED_MFA> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MATCHED_MFA> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final MATCHED_MFA createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MATCHED_MFA.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final MATCHED_MFA[] newArray(int i10) {
                return new MATCHED_MFA[i10];
            }
        }

        private MATCHED_MFA() {
            super("MATCHED_MFA", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$MFA;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MFA extends LinkEventViewName {

        @NotNull
        public static final MFA INSTANCE = new MFA();

        @NotNull
        public static final Parcelable.Creator<MFA> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MFA> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final MFA createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MFA.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final MFA[] newArray(int i10) {
                return new MFA[i10];
            }
        }

        private MFA() {
            super("MFA", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$NUMBERS;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NUMBERS extends LinkEventViewName {

        @NotNull
        public static final NUMBERS INSTANCE = new NUMBERS();

        @NotNull
        public static final Parcelable.Creator<NUMBERS> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NUMBERS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final NUMBERS createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NUMBERS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final NUMBERS[] newArray(int i10) {
                return new NUMBERS[i10];
            }
        }

        private NUMBERS() {
            super("NUMBERS", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$NUMBERS_SELECT_INSTITUTION;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NUMBERS_SELECT_INSTITUTION extends LinkEventViewName {

        @NotNull
        public static final NUMBERS_SELECT_INSTITUTION INSTANCE = new NUMBERS_SELECT_INSTITUTION();

        @NotNull
        public static final Parcelable.Creator<NUMBERS_SELECT_INSTITUTION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NUMBERS_SELECT_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final NUMBERS_SELECT_INSTITUTION createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NUMBERS_SELECT_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final NUMBERS_SELECT_INSTITUTION[] newArray(int i10) {
                return new NUMBERS_SELECT_INSTITUTION[i10];
            }
        }

        private NUMBERS_SELECT_INSTITUTION() {
            super("NUMBERS_SELECT_INSTITUTION", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$OAUTH;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OAUTH extends LinkEventViewName {

        @NotNull
        public static final OAUTH INSTANCE = new OAUTH();

        @NotNull
        public static final Parcelable.Creator<OAUTH> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OAUTH> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final OAUTH createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OAUTH.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final OAUTH[] newArray(int i10) {
                return new OAUTH[i10];
            }
        }

        private OAUTH() {
            super("OAUTH", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$PROFILE_DATA_REVIEW;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PROFILE_DATA_REVIEW extends LinkEventViewName {

        @NotNull
        public static final PROFILE_DATA_REVIEW INSTANCE = new PROFILE_DATA_REVIEW();

        @NotNull
        public static final Parcelable.Creator<PROFILE_DATA_REVIEW> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PROFILE_DATA_REVIEW> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final PROFILE_DATA_REVIEW createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PROFILE_DATA_REVIEW.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final PROFILE_DATA_REVIEW[] newArray(int i10) {
                return new PROFILE_DATA_REVIEW[i10];
            }
        }

        private PROFILE_DATA_REVIEW() {
            super("PROFILE_DATA_REVIEW", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$RECAPTCHA;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RECAPTCHA extends LinkEventViewName {

        @NotNull
        public static final RECAPTCHA INSTANCE = new RECAPTCHA();

        @NotNull
        public static final Parcelable.Creator<RECAPTCHA> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RECAPTCHA> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final RECAPTCHA createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RECAPTCHA.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final RECAPTCHA[] newArray(int i10) {
                return new RECAPTCHA[i10];
            }
        }

        private RECAPTCHA() {
            super("RECAPTCHA", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$RISK_CHECK;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RISK_CHECK extends LinkEventViewName {

        @NotNull
        public static final RISK_CHECK INSTANCE = new RISK_CHECK();

        @NotNull
        public static final Parcelable.Creator<RISK_CHECK> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RISK_CHECK> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final RISK_CHECK createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RISK_CHECK.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final RISK_CHECK[] newArray(int i10) {
                return new RISK_CHECK[i10];
            }
        }

        private RISK_CHECK() {
            super("RISK_CHECK", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$SCREENING;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SCREENING extends LinkEventViewName {

        @NotNull
        public static final SCREENING INSTANCE = new SCREENING();

        @NotNull
        public static final Parcelable.Creator<SCREENING> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SCREENING> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SCREENING createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SCREENING.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SCREENING[] newArray(int i10) {
                return new SCREENING[i10];
            }
        }

        private SCREENING() {
            super("SCREENING", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$SELECT_ACCOUNT;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELECT_ACCOUNT extends LinkEventViewName {

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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$SELECT_AUTH_TYPE;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELECT_AUTH_TYPE extends LinkEventViewName {

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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$SELECT_BRAND;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELECT_BRAND extends LinkEventViewName {

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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$SELECT_INSTITUTION;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELECT_INSTITUTION extends LinkEventViewName {

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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$SELECT_SAVED_ACCOUNT;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELECT_SAVED_ACCOUNT extends LinkEventViewName {

        @NotNull
        public static final SELECT_SAVED_ACCOUNT INSTANCE = new SELECT_SAVED_ACCOUNT();

        @NotNull
        public static final Parcelable.Creator<SELECT_SAVED_ACCOUNT> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SELECT_SAVED_ACCOUNT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SELECT_SAVED_ACCOUNT createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SELECT_SAVED_ACCOUNT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SELECT_SAVED_ACCOUNT[] newArray(int i10) {
                return new SELECT_SAVED_ACCOUNT[i10];
            }
        }

        private SELECT_SAVED_ACCOUNT() {
            super("SELECT_SAVED_ACCOUNT", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$SELECT_SAVED_INSTITUTION;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELECT_SAVED_INSTITUTION extends LinkEventViewName {

        @NotNull
        public static final SELECT_SAVED_INSTITUTION INSTANCE = new SELECT_SAVED_INSTITUTION();

        @NotNull
        public static final Parcelable.Creator<SELECT_SAVED_INSTITUTION> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SELECT_SAVED_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SELECT_SAVED_INSTITUTION createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SELECT_SAVED_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SELECT_SAVED_INSTITUTION[] newArray(int i10) {
                return new SELECT_SAVED_INSTITUTION[i10];
            }
        }

        private SELECT_SAVED_INSTITUTION() {
            super("SELECT_SAVED_INSTITUTION", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$SELFIE_CHECK;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SELFIE_CHECK extends LinkEventViewName {

        @NotNull
        public static final SELFIE_CHECK INSTANCE = new SELFIE_CHECK();

        @NotNull
        public static final Parcelable.Creator<SELFIE_CHECK> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SELFIE_CHECK> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SELFIE_CHECK createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SELFIE_CHECK.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final SELFIE_CHECK[] newArray(int i10) {
                return new SELFIE_CHECK[i10];
            }
        }

        private SELFIE_CHECK() {
            super("SELFIE_CHECK", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$SUBMIT_DOCUMENTS;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_DOCUMENTS extends LinkEventViewName {

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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$SUBMIT_DOCUMENTS_ERROR;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_DOCUMENTS_ERROR extends LinkEventViewName {

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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$SUBMIT_DOCUMENTS_SUCCESS;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_DOCUMENTS_SUCCESS extends LinkEventViewName {

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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$SUBMIT_EMAIL;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_EMAIL extends LinkEventViewName {

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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$SUBMIT_PHONE;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SUBMIT_PHONE extends LinkEventViewName {

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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$UNKNOWN;", "Lcom/plaid/link/event/LinkEventViewName;", "rawJson", "", "(Ljava/lang/String;)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UNKNOWN extends LinkEventViewName {

        @NotNull
        public static final Parcelable.Creator<UNKNOWN> CREATOR = new Creator();

        @NotNull
        private final String rawJson;

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

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.rawJson);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$UPLOAD_DOCUMENTS;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UPLOAD_DOCUMENTS extends LinkEventViewName {

        @NotNull
        public static final UPLOAD_DOCUMENTS INSTANCE = new UPLOAD_DOCUMENTS();

        @NotNull
        public static final Parcelable.Creator<UPLOAD_DOCUMENTS> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UPLOAD_DOCUMENTS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final UPLOAD_DOCUMENTS createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UPLOAD_DOCUMENTS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final UPLOAD_DOCUMENTS[] newArray(int i10) {
                return new UPLOAD_DOCUMENTS[i10];
            }
        }

        private UPLOAD_DOCUMENTS() {
            super("UPLOAD_DOCUMENTS", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$VERIFY_EMAIL;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VERIFY_EMAIL extends LinkEventViewName {

        @NotNull
        public static final VERIFY_EMAIL INSTANCE = new VERIFY_EMAIL();

        @NotNull
        public static final Parcelable.Creator<VERIFY_EMAIL> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VERIFY_EMAIL> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final VERIFY_EMAIL createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return VERIFY_EMAIL.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final VERIFY_EMAIL[] newArray(int i10) {
                return new VERIFY_EMAIL[i10];
            }
        }

        private VERIFY_EMAIL() {
            super("VERIFY_EMAIL", null);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$VERIFY_PHONE;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VERIFY_PHONE extends LinkEventViewName {

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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEventViewName$VERIFY_SMS;", "Lcom/plaid/link/event/LinkEventViewName;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VERIFY_SMS extends LinkEventViewName {

        @NotNull
        public static final VERIFY_SMS INSTANCE = new VERIFY_SMS();

        @NotNull
        public static final Parcelable.Creator<VERIFY_SMS> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VERIFY_SMS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final VERIFY_SMS createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return VERIFY_SMS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final VERIFY_SMS[] newArray(int i10) {
                return new VERIFY_SMS[i10];
            }
        }

        private VERIFY_SMS() {
            super("VERIFY_SMS", null);
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
        ACCEPT_TOS accept_tos = ACCEPT_TOS.INSTANCE;
        Pair pair = TuplesKt.to(accept_tos.getJsonValue(), accept_tos);
        BANK_INCOME_INSIGHTS_COMPLETED bank_income_insights_completed = BANK_INCOME_INSIGHTS_COMPLETED.INSTANCE;
        Pair pair2 = TuplesKt.to(bank_income_insights_completed.getJsonValue(), bank_income_insights_completed);
        CONNECTED connected = CONNECTED.INSTANCE;
        Pair pair3 = TuplesKt.to(connected.getJsonValue(), connected);
        CONSENT consent = CONSENT.INSTANCE;
        Pair pair4 = TuplesKt.to(consent.getJsonValue(), consent);
        CREDENTIAL credential = CREDENTIAL.INSTANCE;
        Pair pair5 = TuplesKt.to(credential.getJsonValue(), credential);
        DOCUMENTARY_VERIFICATION documentary_verification = DOCUMENTARY_VERIFICATION.INSTANCE;
        Pair pair6 = TuplesKt.to(documentary_verification.getJsonValue(), documentary_verification);
        ERROR error = ERROR.INSTANCE;
        Pair pair7 = TuplesKt.to(error.getJsonValue(), error);
        EXIT exit = EXIT.INSTANCE;
        Pair pair8 = TuplesKt.to(exit.getJsonValue(), exit);
        KYC_CHECK kyc_check = KYC_CHECK.INSTANCE;
        Pair pair9 = TuplesKt.to(kyc_check.getJsonValue(), kyc_check);
        LOADING loading = LOADING.INSTANCE;
        Pair pair10 = TuplesKt.to(loading.getJsonValue(), loading);
        MATCHED_CONSENT matched_consent = MATCHED_CONSENT.INSTANCE;
        Pair pair11 = TuplesKt.to(matched_consent.getJsonValue(), matched_consent);
        MATCHED_CREDENTIAL matched_credential = MATCHED_CREDENTIAL.INSTANCE;
        Pair pair12 = TuplesKt.to(matched_credential.getJsonValue(), matched_credential);
        MATCHED_MFA matched_mfa = MATCHED_MFA.INSTANCE;
        Pair pair13 = TuplesKt.to(matched_mfa.getJsonValue(), matched_mfa);
        MFA mfa = MFA.INSTANCE;
        Pair pair14 = TuplesKt.to(mfa.getJsonValue(), mfa);
        OAUTH oauth = OAUTH.INSTANCE;
        Pair pair15 = TuplesKt.to(oauth.getJsonValue(), oauth);
        NUMBERS numbers = NUMBERS.INSTANCE;
        Pair pair16 = TuplesKt.to(numbers.getJsonValue(), numbers);
        PROFILE_DATA_REVIEW profile_data_review = PROFILE_DATA_REVIEW.INSTANCE;
        Pair pair17 = TuplesKt.to(profile_data_review.getJsonValue(), profile_data_review);
        RECAPTCHA recaptcha = RECAPTCHA.INSTANCE;
        Pair pair18 = TuplesKt.to(recaptcha.getJsonValue(), recaptcha);
        RISK_CHECK risk_check = RISK_CHECK.INSTANCE;
        Pair pair19 = TuplesKt.to(risk_check.getJsonValue(), risk_check);
        SCREENING screening = SCREENING.INSTANCE;
        Pair pair20 = TuplesKt.to(screening.getJsonValue(), screening);
        SELECT_ACCOUNT select_account = SELECT_ACCOUNT.INSTANCE;
        Pair pair21 = TuplesKt.to(select_account.getJsonValue(), select_account);
        SELECT_AUTH_TYPE select_auth_type = SELECT_AUTH_TYPE.INSTANCE;
        Pair pair22 = TuplesKt.to(select_auth_type.getJsonValue(), select_auth_type);
        SELECT_INSTITUTION select_institution = SELECT_INSTITUTION.INSTANCE;
        Pair pair23 = TuplesKt.to(select_institution.getJsonValue(), select_institution);
        SELFIE_CHECK selfie_check = SELFIE_CHECK.INSTANCE;
        Pair pair24 = TuplesKt.to(selfie_check.getJsonValue(), selfie_check);
        UPLOAD_DOCUMENTS upload_documents = UPLOAD_DOCUMENTS.INSTANCE;
        Pair pair25 = TuplesKt.to(upload_documents.getJsonValue(), upload_documents);
        SUBMIT_DOCUMENTS submit_documents = SUBMIT_DOCUMENTS.INSTANCE;
        Pair pair26 = TuplesKt.to(submit_documents.getJsonValue(), submit_documents);
        SUBMIT_DOCUMENTS_SUCCESS submit_documents_success = SUBMIT_DOCUMENTS_SUCCESS.INSTANCE;
        Pair pair27 = TuplesKt.to(submit_documents_success.getJsonValue(), submit_documents_success);
        SUBMIT_DOCUMENTS_ERROR submit_documents_error = SUBMIT_DOCUMENTS_ERROR.INSTANCE;
        Pair pair28 = TuplesKt.to(submit_documents_error.getJsonValue(), submit_documents_error);
        VERIFY_SMS verify_sms = VERIFY_SMS.INSTANCE;
        Pair pair29 = TuplesKt.to(verify_sms.getJsonValue(), verify_sms);
        SUBMIT_EMAIL submit_email = SUBMIT_EMAIL.INSTANCE;
        Pair pair30 = TuplesKt.to(submit_email.getJsonValue(), submit_email);
        VERIFY_EMAIL verify_email = VERIFY_EMAIL.INSTANCE;
        Pair pair31 = TuplesKt.to(verify_email.getJsonValue(), verify_email);
        DATA_TRANSPARENCY data_transparency = DATA_TRANSPARENCY.INSTANCE;
        Pair pair32 = TuplesKt.to(data_transparency.getJsonValue(), data_transparency);
        DATA_TRANSPARENCY_CONSENT data_transparency_consent = DATA_TRANSPARENCY_CONSENT.INSTANCE;
        Pair pair33 = TuplesKt.to(data_transparency_consent.getJsonValue(), data_transparency_consent);
        NUMBERS_SELECT_INSTITUTION numbers_select_institution = NUMBERS_SELECT_INSTITUTION.INSTANCE;
        Pair pair34 = TuplesKt.to(numbers_select_institution.getJsonValue(), numbers_select_institution);
        SUBMIT_PHONE submit_phone = SUBMIT_PHONE.INSTANCE;
        Pair pair35 = TuplesKt.to(submit_phone.getJsonValue(), submit_phone);
        VERIFY_PHONE verify_phone = VERIFY_PHONE.INSTANCE;
        Pair pair36 = TuplesKt.to(verify_phone.getJsonValue(), verify_phone);
        SELECT_SAVED_INSTITUTION select_saved_institution = SELECT_SAVED_INSTITUTION.INSTANCE;
        Pair pair37 = TuplesKt.to(select_saved_institution.getJsonValue(), select_saved_institution);
        SELECT_SAVED_ACCOUNT select_saved_account = SELECT_SAVED_ACCOUNT.INSTANCE;
        Pair pair38 = TuplesKt.to(select_saved_account.getJsonValue(), select_saved_account);
        SELECT_BRAND select_brand = SELECT_BRAND.INSTANCE;
        map = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, pair29, pair30, pair31, pair32, pair33, pair34, pair35, pair36, pair37, pair38, TuplesKt.to(select_brand.getJsonValue(), select_brand));
    }

    public /* synthetic */ LinkEventViewName(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getJsonValue() {
        return this.jsonValue;
    }

    public final void setJsonValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.jsonValue = str;
    }

    private LinkEventViewName(String str) {
        this.jsonValue = str;
    }
}
