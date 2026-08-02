package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.android.billingclient.api.EnableBillingProgramParams;
import com.google.android.gms.common.annotation.KeepForSdk;
import defpackage.a70;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class BillingClient {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface BillingProgram {

        @zze
        public static final int BILLING_CHOICE = 5;

        @zzh
        public static final int EXTERNAL_CONTENT_LINK = 1;

        @zzj
        public static final int EXTERNAL_OFFER = 3;

        @zzk
        public static final int EXTERNAL_PAYMENTS = 4;

        @zzf
        public static final int UNSPECIFIED_BILLING_PROGRAM = 0;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface BillingResponseCode {
        public static final int BILLING_UNAVAILABLE = 3;
        public static final int DEVELOPER_ERROR = 5;
        public static final int ERROR = 6;
        public static final int FEATURE_NOT_SUPPORTED = -2;
        public static final int ITEM_ALREADY_OWNED = 7;
        public static final int ITEM_NOT_OWNED = 8;
        public static final int ITEM_UNAVAILABLE = 4;
        public static final int NETWORK_ERROR = 12;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;

        @Deprecated
        public static final int SERVICE_TIMEOUT = -3;
        public static final int SERVICE_UNAVAILABLE = 2;
        public static final int USER_CANCELED = 1;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConnectionState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface FeatureType {

        @NonNull
        @zzc
        public static final String ALTERNATIVE_BILLING_ONLY = "jjj";

        @NonNull
        @zzl
        public static final String BILLING_CONFIG = "ggg";

        @NonNull
        @zzi
        public static final String EXTERNAL_OFFER = "kkk";

        @NonNull
        public static final String INCLUDE_SUSPENDED_SUBSCRIPTIONS = "nnn";

        @NonNull
        public static final String IN_APP_MESSAGING = "bbb";

        @NonNull
        public static final String PRICE_CHANGE_CONFIRMATION = "priceChangeConfirmation";

        @NonNull
        public static final String PRODUCT_DETAILS = "fff";

        @NonNull
        public static final String SUBSCRIPTIONS = "subscriptions";

        @NonNull
        public static final String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    @zzp
    public @interface OnPurchasesUpdatedSubResponseCode {
        public static final int NO_APPLICABLE_SUB_RESPONSE_CODE = 0;
        public static final int PAYMENT_DECLINED_DUE_TO_INSUFFICIENT_FUNDS = 1;
        public static final int USER_INELIGIBLE = 2;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProductType {

        @NonNull
        public static final String INAPP = "inapp";

        @NonNull
        public static final String SUBS = "subs";
    }

    @NonNull
    public static Builder newBuilder(@NonNull Context context) {
        return new Builder(context);
    }

    public abstract void acknowledgePurchase(@NonNull AcknowledgePurchaseParams acknowledgePurchaseParams, @NonNull AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener);

    public abstract void consumeAsync(@NonNull ConsumeParams consumeParams, @NonNull ConsumeResponseListener consumeResponseListener);

    @zzc
    @KeepForSdk
    public abstract void createAlternativeBillingOnlyReportingDetailsAsync(@NonNull AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener);

    @zzf
    public abstract void createBillingProgramReportingDetailsAsync(@NonNull BillingProgramReportingDetailsParams billingProgramReportingDetailsParams, @NonNull BillingProgramReportingDetailsListener billingProgramReportingDetailsListener);

    @zzi
    @Deprecated
    public abstract void createExternalOfferReportingDetailsAsync(@NonNull ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener);

    public abstract void endConnection();

    @zze
    public abstract void getBillingChoiceInfoAsync(@NonNull GetBillingChoiceInfoParams getBillingChoiceInfoParams, @NonNull BillingChoiceInfoResponseListener billingChoiceInfoResponseListener);

    @zzl
    public abstract void getBillingConfigAsync(@NonNull GetBillingConfigParams getBillingConfigParams, @NonNull BillingConfigResponseListener billingConfigResponseListener);

    public abstract int getConnectionState();

    @zzc
    @KeepForSdk
    public abstract void isAlternativeBillingOnlyAvailableAsync(@NonNull AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener);

    @zzf
    public abstract void isBillingProgramAvailableAsync(int i, @NonNull BillingProgramAvailabilityListener billingProgramAvailabilityListener);

    @zzi
    @Deprecated
    public abstract void isExternalOfferAvailableAsync(@NonNull ExternalOfferAvailabilityListener externalOfferAvailabilityListener);

    @NonNull
    public abstract BillingResult isFeatureSupported(@NonNull String str);

    public abstract boolean isReady();

    @NonNull
    public abstract BillingResult launchBillingFlow(@NonNull Activity activity, @NonNull BillingFlowParams billingFlowParams);

    @zzn
    public abstract void launchExternalLink(@NonNull Activity activity, @NonNull LaunchExternalLinkParams launchExternalLinkParams, @NonNull LaunchExternalLinkResponseListener launchExternalLinkResponseListener);

    public abstract void queryProductDetailsAsync(@NonNull QueryProductDetailsParams queryProductDetailsParams, @NonNull ProductDetailsResponseListener productDetailsResponseListener);

    public abstract void queryPurchasesAsync(@NonNull QueryPurchasesParams queryPurchasesParams, @NonNull PurchasesResponseListener purchasesResponseListener);

    @NonNull
    @zzc
    public abstract BillingResult showAlternativeBillingOnlyInformationDialog(@NonNull Activity activity, @NonNull AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener);

    @zze
    public abstract void showBillingProgramInformationDialog(@NonNull Activity activity, @NonNull BillingProgramInformationDialogParams billingProgramInformationDialogParams, @NonNull BillingProgramInformationDialogListener billingProgramInformationDialogListener);

    @NonNull
    @zzi
    @Deprecated
    public abstract BillingResult showExternalOfferInformationDialog(@NonNull Activity activity, @NonNull ExternalOfferInformationDialogListener externalOfferInformationDialogListener);

    @NonNull
    public abstract BillingResult showInAppMessages(@NonNull Activity activity, @NonNull InAppMessageParams inAppMessageParams, @NonNull InAppMessageResponseListener inAppMessageResponseListener);

    public abstract void startConnection(@NonNull BillingClientStateListener billingClientStateListener);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        public volatile PendingPurchasesParams a;
        public final Context b;
        public volatile PurchasesUpdatedListener c;
        public volatile UserChoiceBillingListener d;
        public volatile DeveloperProvidedBillingListener e;
        public volatile boolean f;
        public volatile boolean g;
        public volatile boolean h;
        public volatile boolean i;
        public volatile boolean j;
        public volatile boolean k;
        public volatile boolean l;

        public /* synthetic */ Builder(Context context) {
            this.b = context;
        }

        public final boolean a() {
            try {
                Context context = this.b;
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception unused) {
                int i = com.google.android.gms.internal.play_billing.zzc.a;
                return false;
            }
        }

        @NonNull
        public BillingClient build() {
            Context context = this.b;
            if (context == null) {
                a70.p("Please provide a valid Context.");
                return null;
            }
            if (this.c == null) {
                if (this.d != null || this.k) {
                    a70.p("Please provide a valid listener for Google Play Billing purchases updates when enabling user choice billing or billing choice.");
                    return null;
                }
                if (this.f || this.g || this.h || this.i || this.j) {
                    return a() ? new l(context, this) : new a(context, this);
                }
                a70.p("Please provide a valid listener for purchases updates.");
                return null;
            }
            if (this.a == null) {
                a70.p("Pending purchases for one-time products must be supported.");
                return null;
            }
            this.a.getClass();
            if (this.c == null) {
                PendingPurchasesParams pendingPurchasesParams = this.a;
                return a() ? new l(pendingPurchasesParams, context, this) : new a(pendingPurchasesParams, context, this);
            }
            if (this.d == null && this.e == null) {
                PendingPurchasesParams pendingPurchasesParams2 = this.a;
                PurchasesUpdatedListener purchasesUpdatedListener = this.c;
                return a() ? new l(pendingPurchasesParams2, context, purchasesUpdatedListener, this) : new a(pendingPurchasesParams2, context, purchasesUpdatedListener, this);
            }
            PendingPurchasesParams pendingPurchasesParams3 = this.a;
            PurchasesUpdatedListener purchasesUpdatedListener2 = this.c;
            UserChoiceBillingListener userChoiceBillingListener = this.d;
            DeveloperProvidedBillingListener developerProvidedBillingListener = this.e;
            return a() ? new l(pendingPurchasesParams3, context, purchasesUpdatedListener2, userChoiceBillingListener, developerProvidedBillingListener, this) : new a(pendingPurchasesParams3, context, purchasesUpdatedListener2, userChoiceBillingListener, developerProvidedBillingListener, this);
        }

        @NonNull
        @zzc
        public Builder enableAlternativeBillingOnly() {
            this.f = true;
            return this;
        }

        @NonNull
        @zzd
        public Builder enableAutoServiceReconnection() {
            this.l = true;
            return this;
        }

        @NonNull
        @zzk
        public Builder enableBillingProgram(@NonNull EnableBillingProgramParams enableBillingProgramParams) {
            if (enableBillingProgramParams.getDeveloperProvidedBillingListener() != null) {
                if (this.d != null) {
                    a70.p("UserChoiceBillingListener and DeveloperProvidedBillingListener cannot be set at the same time.");
                    return null;
                }
                if (enableBillingProgramParams.getBillingProgram() != 4 && enableBillingProgramParams.getBillingProgram() != 5) {
                    a70.p("DeveloperProvidedBillingListener can only be set when enabling the EXTERNAL_PAYMENTS or BILLING_CHOICE program.");
                    return null;
                }
                this.e = enableBillingProgramParams.getDeveloperProvidedBillingListener();
            }
            int billingProgram = enableBillingProgramParams.getBillingProgram();
            if (billingProgram == 1) {
                this.h = true;
                return this;
            }
            if (billingProgram == 2) {
                this.i = true;
                return this;
            }
            if (billingProgram == 3) {
                this.g = true;
                return this;
            }
            if (billingProgram == 4) {
                this.j = true;
                return this;
            }
            if (billingProgram == 5) {
                this.k = true;
                return this;
            }
            a70.p("An invalid BillingProgram has been provided.");
            return null;
        }

        @NonNull
        @zzi
        @Deprecated
        public Builder enableExternalOffer() {
            this.g = true;
            return this;
        }

        @NonNull
        @zzt
        public Builder enablePendingPurchases(@NonNull PendingPurchasesParams pendingPurchasesParams) {
            this.a = pendingPurchasesParams;
            return this;
        }

        @NonNull
        @zzv
        public Builder enableUserChoiceBilling(@NonNull UserChoiceBillingListener userChoiceBillingListener) {
            this.d = userChoiceBillingListener;
            if (this.e == null) {
                return this;
            }
            a70.p("UserChoiceBillingListener and DeveloperProvidedBillingListener cannot be set at the same time.");
            return null;
        }

        @NonNull
        public Builder setListener(@NonNull PurchasesUpdatedListener purchasesUpdatedListener) {
            this.c = purchasesUpdatedListener;
            return this;
        }

        @NonNull
        @zzf
        public Builder enableBillingProgram(int i) {
            EnableBillingProgramParams.Builder newBuilder = EnableBillingProgramParams.newBuilder();
            newBuilder.setBillingProgram(i);
            enableBillingProgram(newBuilder.build());
            return this;
        }
    }
}
