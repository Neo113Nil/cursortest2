package com.google.android.gms.tapandpay;

import android.app.Activity;
import android.app.PendingIntent;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tapandpay.TapAndPay;
import com.google.android.gms.tapandpay.issuer.IsTokenizedRequest;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tapandpay.issuer.TokenStatus;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* loaded from: classes9.dex */
public interface TapAndPayClient extends HasApiKey<Api.ApiOptions.NotRequiredOptions> {

    @RecentlyNonNull
    public static final String DATA_CHANGED_LISTENER_KEY = "tapAndPayDataChangedListener";

    void createWallet(@RecentlyNonNull Activity activity, int i11);

    @RecentlyNonNull
    Task<String> getActiveWalletId();

    @RecentlyNonNull
    Task<String> getEnvironment();

    @RecentlyNonNull
    Task<String> getLinkingToken(@RecentlyNonNull String str);

    @RecentlyNonNull
    Task<String> getStableHardwareId();

    @RecentlyNonNull
    Task<TokenStatus> getTokenStatus(int i11, @RecentlyNonNull String str);

    @RecentlyNonNull
    Task<Boolean> isTokenized(@RecentlyNonNull IsTokenizedRequest isTokenizedRequest);

    @RecentlyNonNull
    Task<List<TokenInfo>> listTokens();

    void pushTokenize(@RecentlyNonNull Activity activity, @RecentlyNonNull PushTokenizeRequest pushTokenizeRequest, int i11);

    @RecentlyNonNull
    Task<Void> registerDataChangedListener(@RecentlyNonNull TapAndPay.DataChangedListener dataChangedListener);

    @RecentlyNonNull
    Task<Void> removeDataChangedListener(@RecentlyNonNull TapAndPay.DataChangedListener dataChangedListener);

    void requestDeleteToken(@RecentlyNonNull Activity activity, @RecentlyNonNull String str, int i11, int i12);

    void requestSelectToken(@RecentlyNonNull Activity activity, @RecentlyNonNull String str, int i11, int i12);

    void tokenize(@RecentlyNonNull Activity activity, @RecentlyNonNull String str, int i11, @RecentlyNonNull String str2, int i12, int i13);

    @RecentlyNonNull
    Task<PendingIntent> viewToken(@RecentlyNonNull ViewTokenRequest viewTokenRequest);
}
