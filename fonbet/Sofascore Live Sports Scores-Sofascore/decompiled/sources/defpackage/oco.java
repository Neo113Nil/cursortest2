package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzgfn;
import com.google.android.gms.internal.ads.zznq;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzxk;
import com.google.android.gms.internal.ads.zzxo;
import com.google.android.gms.internal.measurement.zzcs;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzpp;
import com.google.android.gms.measurement.internal.zzr;
import com.ironsource.C4094gc;
import com.mbridge.msdk.foundation.download.Command;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class oco implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ oco(zzgfn zzgfnVar, String str, uh2 uh2Var, boolean z, String str2, byte[] bArr) {
        this.e = zzgfnVar;
        this.b = str;
        this.f = uh2Var;
        this.d = z;
        this.c = str2;
        this.g = bArr;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        SocketTimeoutException socketTimeoutException;
        HttpURLConnection httpURLConnection;
        byte[] byteArray;
        RemoteException remoteException;
        Throwable th2;
        zzpp zzppVar;
        zzgb zzgbVar;
        AtomicReference atomicReference;
        zznl zznlVar;
        zzgb zzgbVar2;
        HttpURLConnection httpURLConnection2 = null;
        switch (this.a) {
            case 0:
                zzgfn zzgfnVar = (zzgfn) this.e;
                String str = (String) this.b;
                uh2 uh2Var = (uh2) this.f;
                boolean z = this.d;
                String str2 = (String) this.c;
                byte[] bArr = (byte[]) this.g;
                try {
                    try {
                        httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
                    } catch (Throwable th3) {
                        if (httpURLConnection2 == null) {
                            throw th3;
                        }
                        httpURLConnection2.disconnect();
                        throw th3;
                    }
                } catch (SocketTimeoutException e) {
                    socketTimeoutException = e;
                } catch (Throwable th4) {
                    th = th4;
                }
                try {
                    Objects.requireNonNull(httpURLConnection);
                    x3o x3oVar = new x3o(httpURLConnection, 19);
                    ExecutorService executorService = zzgfnVar.a;
                    b1g b1gVar = uh2Var.c;
                    if (b1gVar != null) {
                        b1gVar.addListener(x3oVar, executorService);
                    }
                    httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, zzgfnVar.b);
                    int i = (int) zzgfnVar.c;
                    httpURLConnection.setConnectTimeout(i);
                    httpURLConnection.setReadTimeout(i);
                    if (z) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setRequestMethod(C4094gc.b);
                        if (str2 != null) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        try {
                            bufferedOutputStream.write(bArr);
                            bufferedOutputStream.close();
                        } finally {
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    InputStream inputStream = responseCode < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            if (inputStream == null) {
                                byteArray = new byte[0];
                                byteArrayOutputStream.close();
                            } else {
                                byte[] bArr2 = new byte[4096];
                                while (true) {
                                    int read = inputStream.read(bArr2);
                                    if (read != -1) {
                                        byteArrayOutputStream.write(bArr2, 0, read);
                                    } else {
                                        byteArray = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        inputStream.close();
                                    }
                                }
                            }
                            uh2Var.a(new qco(responseCode, byteArray));
                        } finally {
                        }
                    } finally {
                    }
                } catch (SocketTimeoutException e2) {
                    socketTimeoutException = e2;
                    httpURLConnection2 = httpURLConnection;
                    String message = socketTimeoutException.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 9);
                    sb.append("Timeout: ");
                    sb.append(message);
                    uh2Var.c(new TimeoutException(sb.toString()));
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    httpURLConnection2 = httpURLConnection;
                    uh2Var.c(th);
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    return;
                }
                return;
            case 1:
                String str3 = (String) this.c;
                String str4 = (String) this.b;
                zzcs zzcsVar = (zzcs) this.f;
                zznl zznlVar2 = (zznl) this.g;
                zzic zzicVar = (zzic) zznlVar2.b;
                Bundle bundle = new Bundle();
                try {
                    try {
                        zzgbVar = zznlVar2.e;
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                } catch (RemoteException e3) {
                    remoteException = e3;
                }
                if (zzgbVar == null) {
                    zzgu zzguVar = zzicVar.f;
                    zzic.m(zzguVar);
                    zzguVar.g.c(str4, str3, "Failed to get user properties; not connected to service");
                    zzppVar = zzicVar.i;
                    zzic.k(zzppVar);
                    zzppVar.I0(zzcsVar, bundle);
                    return;
                }
                List<zzpl> i4 = zzgbVar.i4(str4, str3, this.d, (zzr) this.e);
                Bundle bundle2 = new Bundle();
                if (i4 != null) {
                    for (zzpl zzplVar : i4) {
                        String str5 = zzplVar.e;
                        String str6 = zzplVar.b;
                        if (str5 != null) {
                            bundle2.putString(str6, str5);
                        } else {
                            Long l = zzplVar.d;
                            if (l != null) {
                                bundle2.putLong(str6, l.longValue());
                            } else {
                                Double d = zzplVar.g;
                                if (d != null) {
                                    bundle2.putDouble(str6, d.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    zznlVar2.d0();
                    zzpp zzppVar2 = zzicVar.i;
                    zzic.k(zzppVar2);
                    zzppVar2.I0(zzcsVar, bundle2);
                    return;
                } catch (RemoteException e4) {
                    remoteException = e4;
                    bundle = bundle2;
                    zzgu zzguVar2 = zzicVar.f;
                    zzic.m(zzguVar2);
                    zzguVar2.g.c(str4, remoteException, "Failed to get user properties; remote exception");
                    zzppVar = zzicVar.i;
                    zzic.k(zzppVar);
                    zzppVar.I0(zzcsVar, bundle);
                    return;
                } catch (Throwable th7) {
                    th2 = th7;
                    bundle = bundle2;
                    zzpp zzppVar3 = zzicVar.i;
                    zzic.k(zzppVar3);
                    zzppVar3.I0(zzcsVar, bundle);
                    throw th2;
                }
            case 2:
                Pair pair = (Pair) this.b;
                ((zznq) ((wxo) this.e).b.k).g(((Integer) pair.first).intValue(), (zzxo) pair.second, (zzxf) this.c, (zzxk) this.f, (IOException) this.g, this.d);
                return;
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.e;
                synchronized (atomicReference2) {
                    try {
                        try {
                            zznlVar = (zznl) this.g;
                            zzgbVar2 = zznlVar.e;
                        } catch (RemoteException e5) {
                            zzgu zzguVar3 = ((zzic) ((zznl) this.g).b).f;
                            zzic.m(zzguVar3);
                            zzguVar3.g.d("(legacy) Failed to get user properties; remote exception", null, (String) this.b, e5);
                            ((AtomicReference) this.e).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.e;
                        }
                        if (zzgbVar2 == null) {
                            zzgu zzguVar4 = ((zzic) zznlVar.b).f;
                            zzic.m(zzguVar4);
                            zzguVar4.g.d("(legacy) Failed to get user properties; not connected to service", null, (String) this.b, (String) this.c);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(zzgbVar2.i4((String) this.b, (String) this.c, this.d, (zzr) this.f));
                        } else {
                            atomicReference2.set(zzgbVar2.O(null, (String) this.b, (String) this.c, this.d));
                        }
                        zznlVar.d0();
                        atomicReference = (AtomicReference) this.e;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th8) {
                        ((AtomicReference) this.e).notify();
                        throw th8;
                    }
                }
        }
    }

    public /* synthetic */ oco(wxo wxoVar, Pair pair, zzxf zzxfVar, zzxk zzxkVar, IOException iOException, boolean z) {
        this.e = wxoVar;
        this.b = pair;
        this.c = zzxfVar;
        this.f = zzxkVar;
        this.g = iOException;
        this.d = z;
    }

    public oco(zznl zznlVar, String str, String str2, zzr zzrVar, boolean z, zzcs zzcsVar) {
        this.b = str;
        this.c = str2;
        this.e = zzrVar;
        this.d = z;
        this.f = zzcsVar;
        this.g = zznlVar;
    }

    public oco(zznl zznlVar, AtomicReference atomicReference, String str, String str2, zzr zzrVar, boolean z) {
        this.e = atomicReference;
        this.b = str;
        this.c = str2;
        this.f = zzrVar;
        this.d = z;
        this.g = zznlVar;
    }
}
