package com.google.android.gms.internal.tapandpay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tapandpay.TapAndPay;
import com.google.android.gms.tapandpay.TapAndPayClient;
import com.google.android.gms.tapandpay.issuer.IsTokenizedRequest;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tapandpay.issuer.TokenStatus;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzad extends GoogleApi<Api.ApiOptions.NotRequiredOptions> implements TapAndPayClient {
    public static final /* synthetic */ int zza = 0;

    public zzad(Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) TapAndPay.zza, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void createWallet(final Activity activity, final int i11) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzd) ((zzag) obj).getService()).zzc(new zzaf(activity, i11));
            }
        }).setMethodKey(2112).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<String> getActiveWalletId() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzd) ((zzag) obj).getService()).zzd(new zzx(zzad.this, (TaskCompletionSource) obj2));
            }
        }).setMethodKey(2103).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<String> getEnvironment() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzd) ((zzag) obj).getService()).zze(new zzz(zzad.this, (TaskCompletionSource) obj2));
            }
        }).setMethodKey(2110).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<String> getLinkingToken(final String str) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzad zzadVar = zzad.this;
                ((zzd) ((zzag) obj).getService()).zzf(str, new zzaa(zzadVar, (TaskCompletionSource) obj2));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzb).setMethodKey(2111).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<String> getStableHardwareId() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzd) ((zzag) obj).getService()).zzg(new zzy(zzad.this, (TaskCompletionSource) obj2));
            }
        }).setMethodKey(2109).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<TokenStatus> getTokenStatus(final int i11, final String str) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzad zzadVar = zzad.this;
                ((zzd) ((zzag) obj).getService()).zzh(i11, str, new zzw(zzadVar, (TaskCompletionSource) obj2));
            }
        }).setMethodKey(2102).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<Boolean> isTokenized(final IsTokenizedRequest isTokenizedRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzh
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzad zzadVar = zzad.this;
                ((zzd) ((zzag) obj).getService()).zzi(isTokenizedRequest, new zzac(zzadVar, (TaskCompletionSource) obj2));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzx).setMethodKey(2164).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<List<TokenInfo>> listTokens() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzd) ((zzag) obj).getService()).zzj(new zzab(zzad.this, (TaskCompletionSource) obj2));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzx).setMethodKey(2163).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void pushTokenize(final Activity activity, final PushTokenizeRequest pushTokenizeRequest, final int i11) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzd) ((zzag) obj).getService()).zzk(PushTokenizeRequest.this, new zzaf(activity, i11));
            }
        }).setMethodKey(2106).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<Void> registerDataChangedListener(TapAndPay.DataChangedListener dataChangedListener) {
        final ListenerHolder<L> registerListener = registerListener(dataChangedListener, TapAndPayClient.DATA_CHANGED_LISTENER_KEY);
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(registerListener).register(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzp
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzd) ((zzag) obj).getService()).zzl(new com.google.android.gms.tapandpay.zzd(null, ListenerHolder.this));
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzl
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
            }
        }).setMethodKey(2155).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<Void> removeDataChangedListener(TapAndPay.DataChangedListener dataChangedListener) {
        return TaskUtil.toVoidTaskThatFailsOnFalse(doUnregisterEventListener(ListenerHolders.createListenerKey(dataChangedListener, TapAndPayClient.DATA_CHANGED_LISTENER_KEY), 2152));
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void requestDeleteToken(final Activity activity, final String str, final int i11, final int i12) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzg
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzd) ((zzag) obj).getService()).zzm(i11, str, new zzaf(activity, i12));
            }
        }).setMethodKey(2104).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void requestSelectToken(final Activity activity, final String str, final int i11, final int i12) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzd) ((zzag) obj).getService()).zzn(i11, str, new zzaf(activity, i12));
            }
        }).setMethodKey(2105).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void tokenize(final Activity activity, final String str, final int i11, final String str2, final int i12, final int i13) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzd) ((zzag) obj).getService()).zzo(i11, str, str2, i12, new zzaf(activity, i13));
            }
        }).setMethodKey(2101).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<PendingIntent> viewToken(final ViewTokenRequest viewTokenRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzi
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzad zzadVar = zzad.this;
                ((zzd) ((zzag) obj).getService()).zzp(viewTokenRequest, new zzv(zzadVar, (TaskCompletionSource) obj2));
            }
        }).setMethodKey(2160).setFeatures(com.google.android.gms.tapandpay.zza.zzj).build());
    }

    public zzad(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) TapAndPay.zza, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
