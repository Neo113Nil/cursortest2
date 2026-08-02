package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.net.HttpHeaders;
import com.google.common.util.concurrent.ListenableFuture;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzgdt implements zzgdn {
    private final ExecutorService zza;
    private final String zzb;
    private final long zzc;

    public zzgdt(ExecutorService executorService, String str, long j) {
        this.zza = executorService;
        this.zzb = str;
        this.zzc = j;
    }

    private final ListenableFuture zze(final String str, final boolean z, final byte[] bArr, final String str2) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: com.google.android.gms.internal.ads.zzgdq
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final /* synthetic */ Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return zzgdt.this.zzc(str, z, str2, bArr, completer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void zzd(String str, CallbackToFutureAdapter.Completer completer, boolean z, String str2, byte[] bArr) {
        Throwable th;
        SocketTimeoutException e;
        final HttpURLConnection httpURLConnection;
        byte[] byteArray;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
                try {
                    Objects.requireNonNull(httpURLConnection);
                    completer.addCancellationListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgdr
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                        }
                    }, this.zza);
                    httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, this.zzb);
                    int i = (int) this.zzc;
                    httpURLConnection.setConnectTimeout(i);
                    httpURLConnection.setReadTimeout(i);
                    if (z) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setRequestMethod("POST");
                        if (str2 != null) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(AdMobNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
                        try {
                            bufferedOutputStream.write(bArr);
                            bufferedOutputStream.close();
                        } finally {
                        }
                    }
                    int httpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                    InputStream urlConnectionGetInputStream = httpUrlConnectionGetResponseCode < 400 ? AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnection) : httpURLConnection.getErrorStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            if (urlConnectionGetInputStream == null) {
                                byteArray = new byte[0];
                                byteArrayOutputStream.close();
                            } else {
                                byte[] bArr2 = new byte[4096];
                                while (true) {
                                    int read = urlConnectionGetInputStream.read(bArr2);
                                    if (read == -1) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr2, 0, read);
                                    }
                                }
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                urlConnectionGetInputStream.close();
                            }
                            completer.set(new zzgds(httpUrlConnectionGetResponseCode, byteArray));
                        } finally {
                        }
                    } finally {
                    }
                } catch (SocketTimeoutException e2) {
                    e = e2;
                    httpURLConnection2 = httpURLConnection;
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 9);
                    sb.append("Timeout: ");
                    sb.append(message);
                    completer.setException(new TimeoutException(sb.toString()));
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection2 = httpURLConnection;
                    completer.setException(th);
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                    }
                }
            } finally {
                if (httpURLConnection2 != null) {
                    AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection2);
                }
            }
        } catch (SocketTimeoutException e3) {
            e = e3;
        } catch (Throwable th3) {
            th = th3;
        }
        if (httpURLConnection != null) {
            AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdn
    public final ListenableFuture zza(String str) {
        return zze(str, false, new byte[0], null);
    }

    @Override // com.google.android.gms.internal.ads.zzgdn
    public final ListenableFuture zzb(String str, byte[] bArr, String str2) {
        return zze(str, true, bArr, CommonGatewayClient.HEADER_PROTOBUF);
    }

    final /* synthetic */ Object zzc(final String str, final boolean z, final String str2, final byte[] bArr, final CallbackToFutureAdapter.Completer completer) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgdp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgdt.this.zzd(str, completer, z, str2, bArr);
            }
        });
        return "";
    }
}
