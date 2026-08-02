package com.facebook.internal;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.ironsource.U3;
import defpackage.cw3;
import defpackage.x2a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class q0 extends AsyncTask {
    public final String a;
    public final Bundle b;
    public Exception[] c = new Exception[0];
    public final /* synthetic */ s0 d;

    public q0(s0 s0Var, String str, Bundle bundle) {
        this.d = s0Var;
        this.a = str;
        this.b = bundle;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [com.facebook.internal.p0] */
    public final String[] a(Void... voidArr) {
        Set set = cw3.a;
        if (!set.contains(this)) {
            try {
                if (!set.contains(this)) {
                    try {
                        voidArr.getClass();
                        String[] stringArray = this.b.getStringArray(U3.i.I0);
                        if (stringArray != null) {
                            final String[] strArr = new String[stringArray.length];
                            this.c = new Exception[stringArray.length];
                            final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                            Date date = AccessToken.l;
                            AccessToken p = com.facebook.appevents.g.p();
                            try {
                                int length = stringArray.length;
                                for (final int i = 0; i < length; i++) {
                                    if (isCancelled()) {
                                        Iterator it = concurrentLinkedQueue.iterator();
                                        while (it.hasNext()) {
                                            ((com.facebook.e0) it.next()).cancel(true);
                                        }
                                    } else {
                                        Uri parse = Uri.parse(stringArray[i]);
                                        if (k0.B(parse)) {
                                            strArr[i] = parse.toString();
                                            countDownLatch.countDown();
                                        } else {
                                            ?? r9 = new com.facebook.z() { // from class: com.facebook.internal.p0
                                                @Override // com.facebook.z
                                                public final void a(com.facebook.g0 g0Var) {
                                                    FacebookRequestError facebookRequestError;
                                                    String str;
                                                    String[] strArr2 = strArr;
                                                    int i2 = i;
                                                    g0Var.getClass();
                                                    try {
                                                        facebookRequestError = g0Var.c;
                                                        str = "Error staging photo.";
                                                    } catch (Exception e) {
                                                        this.c[i2] = e;
                                                    }
                                                    if (facebookRequestError != null) {
                                                        String a = facebookRequestError.a();
                                                        if (a != null) {
                                                            str = a;
                                                        }
                                                        throw new com.facebook.r(g0Var, str);
                                                    }
                                                    JSONObject jSONObject = g0Var.b;
                                                    if (jSONObject == null) {
                                                        throw new com.facebook.q("Error staging photo.");
                                                    }
                                                    String optString = jSONObject.optString("uri");
                                                    if (optString == null) {
                                                        throw new com.facebook.q("Error staging photo.");
                                                    }
                                                    strArr2[i2] = optString;
                                                    countDownLatch.countDown();
                                                }
                                            };
                                            parse.getClass();
                                            concurrentLinkedQueue.add(x2a.G(p, parse, r9).d());
                                        }
                                    }
                                }
                                countDownLatch.await();
                                return strArr;
                            } catch (Exception unused) {
                                Iterator it2 = concurrentLinkedQueue.iterator();
                                while (it2.hasNext()) {
                                    ((com.facebook.e0) it2.next()).cancel(true);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        cw3.a(this, th);
                    }
                }
            } catch (Throwable th2) {
                cw3.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final void b(String[] strArr) {
        Bundle bundle = this.b;
        s0 s0Var = this.d;
        Set set = cw3.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (set.contains(this)) {
                return;
            }
            try {
                ProgressDialog progressDialog = s0Var.e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                for (Exception exc : this.c) {
                    if (exc != null) {
                        s0Var.e(exc);
                        return;
                    }
                }
                if (strArr == null) {
                    s0Var.e(new com.facebook.q("Failed to stage photos for web dialog"));
                    return;
                }
                List asList = Arrays.asList(strArr);
                asList.getClass();
                if (asList.contains(null)) {
                    s0Var.e(new com.facebook.q("Failed to stage photos for web dialog"));
                    return;
                }
                k0.G(bundle, new JSONArray((Collection) asList));
                s0Var.a = k0.a(k0.o(), bundle, com.facebook.w.d() + "/dialog/" + this.a).toString();
                ImageView imageView = s0Var.f;
                if (imageView == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                s0Var.f((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
            } catch (Throwable th) {
                cw3.a(this, th);
            }
        } catch (Throwable th2) {
            cw3.a(this, th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.lang.String[]] */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Set set = cw3.a;
        if (!set.contains(this)) {
            try {
                if (!set.contains(this)) {
                    try {
                        this = a((Void[]) objArr);
                        return this;
                    } catch (Throwable th) {
                        cw3.a(this, th);
                    }
                }
            } catch (Throwable th2) {
                cw3.a(this, th2);
                return null;
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Set set = cw3.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (set.contains(this)) {
                return;
            }
            try {
                b((String[]) obj);
            } catch (Throwable th) {
                cw3.a(this, th);
            }
        } catch (Throwable th2) {
            cw3.a(this, th2);
        }
    }
}
