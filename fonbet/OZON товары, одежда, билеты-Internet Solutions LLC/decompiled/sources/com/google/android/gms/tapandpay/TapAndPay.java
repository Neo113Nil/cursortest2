package com.google.android.gms.tapandpay;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.tapandpay.zzad;
import com.google.android.gms.internal.tapandpay.zzag;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes9.dex */
public abstract class TapAndPay {
    public static final int CARD_NETWORK_AMEX = 1;
    public static final int CARD_NETWORK_DISCOVER = 2;
    public static final int CARD_NETWORK_EFTPOS = 7;
    public static final int CARD_NETWORK_ELO = 12;
    public static final int CARD_NETWORK_ID = 9;
    public static final int CARD_NETWORK_INTERAC = 5;
    public static final int CARD_NETWORK_JCB = 11;
    public static final int CARD_NETWORK_MAESTRO = 8;
    public static final int CARD_NETWORK_MASTERCARD = 3;
    public static final int CARD_NETWORK_MIR = 13;
    public static final int CARD_NETWORK_PRIVATE_LABEL = 6;
    public static final int CARD_NETWORK_QUICPAY = 10;
    public static final int CARD_NETWORK_VISA = 4;

    @RecentlyNonNull
    public static final String EXTRA_CARD_RESULT = "extra_card_result";

    @RecentlyNonNull
    public static final String EXTRA_ISSUER_TOKEN_ID = "extra_issuer_token_id";

    @RecentlyNonNull
    public static final String EXTRA_STATUS_LIST = "extra_status_list";

    @RecentlyNonNull
    public static final String EXTRA_TOKENIZATION_SESSION_ID = "extra_tokenization_session_id";

    @RecentlyNonNull
    public static final String EXTRA_TOKEN_RESULT = "extra_token_result";
    public static final int TOKEN_PROVIDER_AMEX = 2;
    public static final int TOKEN_PROVIDER_DISCOVER = 5;
    public static final int TOKEN_PROVIDER_EFTPOS = 6;
    public static final int TOKEN_PROVIDER_ELO = 14;
    public static final int TOKEN_PROVIDER_GEMALTO = 15;
    public static final int TOKEN_PROVIDER_INTERAC = 7;
    public static final int TOKEN_PROVIDER_JCB = 13;
    public static final int TOKEN_PROVIDER_MASTERCARD = 3;
    public static final int TOKEN_PROVIDER_MIR = 16;
    public static final int TOKEN_PROVIDER_OBERTHUR = 8;
    public static final int TOKEN_PROVIDER_PAYPAL = 9;
    public static final int TOKEN_PROVIDER_VISA = 4;
    public static final int TOKEN_STATE_ACTIVE = 5;
    public static final int TOKEN_STATE_FELICA_PENDING_PROVISIONING = 6;
    public static final int TOKEN_STATE_NEEDS_IDENTITY_VERIFICATION = 3;
    public static final int TOKEN_STATE_PENDING = 2;
    public static final int TOKEN_STATE_SUSPENDED = 4;
    public static final int TOKEN_STATE_UNTOKENIZED = 1;

    @RecentlyNonNull
    public static final Api<Api.ApiOptions.NotRequiredOptions> zza;
    private static final Api.ClientKey<zzag> zzb;
    private static final Api.AbstractClientBuilder<zzag, Api.ApiOptions.NotRequiredOptions> zzc;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CardNetwork {
    }

    public interface DataChangedListener {
        void onDataChanged();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TokenServiceProvider {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TokenState {
    }

    static {
        Api.ClientKey<zzag> clientKey = new Api.ClientKey<>();
        zzb = clientKey;
        zzb zzbVar = new zzb();
        zzc = zzbVar;
        zza = new Api<>("TapAndPay.TAP_AND_PAY_API", zzbVar, clientKey);
    }

    private TapAndPay() {
    }

    @RecentlyNonNull
    public static TapAndPayClient getClient(@RecentlyNonNull Activity activity) {
        return new zzad(activity);
    }

    @RecentlyNonNull
    public static TapAndPayClient getClient(@RecentlyNonNull Context context) {
        return new zzad(context);
    }
}
