package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.webkit.WebSettings;
import com.ironsource.C4094gc;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcr {
    public final Application b;
    public final zzco c;
    public final Executor d;
    public final boolean e;
    public final AtomicReference f = new AtomicReference(new ArrayDeque());
    public final AtomicReference g = new AtomicReference(new ArrayDeque());
    public final AtomicReference h = new AtomicReference(new ArrayDeque());
    public final AtomicReference i = new AtomicReference(new ArrayDeque());
    public final AtomicReference j = new AtomicReference(new ArrayDeque());
    public final AtomicReference k = new AtomicReference(new ArrayDeque());
    public final AtomicReference l = new AtomicReference(new ArrayDeque());
    public final AtomicReference a = new AtomicReference(null);

    public zzcr(Application application, Executor executor, zzco zzcoVar, boolean z) {
        this.e = z;
        this.b = application;
        this.c = zzcoVar;
        this.d = executor;
    }

    public final void a(Queue queue, int i, int i2, String str) {
        Long l = (Long) queue.poll();
        if (l != null) {
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            if (str != null) {
                i = i2;
            }
            AtomicReference atomicReference = this.k;
            ((Queue) atomicReference.get()).add(this.c.a(i, currentTimeMillis, str));
            if (this.e) {
                ((ArrayDeque) this.l.get()).addAll((Collection) atomicReference.get());
            }
            this.d.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzcq
                @Override // java.lang.Runnable
                public final void run() {
                    zzcr zzcrVar = zzcr.this;
                    AtomicReference atomicReference2 = zzcrVar.k;
                    String str2 = (String) zzcrVar.a.get();
                    if (str2 == null) {
                        return;
                    }
                    int size = ((Queue) atomicReference2.get()).size();
                    for (int i3 = 0; i3 < size; i3++) {
                        zzif zzifVar = (zzif) ((Queue) atomicReference2.get()).poll();
                        if (zzifVar != null) {
                            try {
                                HttpURLConnection httpURLConnection = (HttpURLConnection) new URI(str2).toURL().openConnection();
                                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, WebSettings.getDefaultUserAgent(zzcrVar.b));
                                httpURLConnection.setConnectTimeout(10000);
                                httpURLConnection.setReadTimeout(30000);
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setRequestMethod(C4094gc.b);
                                httpURLConnection.setRequestProperty("Content-Type", "application/protobuf");
                                zzifVar.b(httpURLConnection.getOutputStream());
                                int responseCode = httpURLConnection.getResponseCode();
                                if (responseCode != 200 && responseCode != 204) {
                                    if (httpURLConnection.getErrorStream() != null) {
                                        new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next();
                                    }
                                    ((Queue) atomicReference2.get()).add(zzifVar);
                                }
                            } catch (IOException e) {
                                "Fail to ping metrics reporting URL: ".concat(String.valueOf(e.getMessage()));
                                ((Queue) atomicReference2.get()).add(zzifVar);
                            } catch (URISyntaxException e2) {
                                e2.getMessage();
                            }
                        }
                    }
                }
            });
        }
    }
}
