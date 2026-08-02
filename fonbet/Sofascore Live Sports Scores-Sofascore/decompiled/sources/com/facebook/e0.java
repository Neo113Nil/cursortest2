package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import defpackage.cw3;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e0 extends AsyncTask {
    public final f0 a;
    public Exception b;

    public e0(f0 f0Var) {
        this.a = f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Set set = cw3.a;
        if (!set.contains(this)) {
            try {
                boolean contains = set.contains(this);
                this = this;
                if (!contains) {
                    try {
                        Void[] voidArr = (Void[]) objArr;
                        boolean contains2 = set.contains(this);
                        this = this;
                        if (!contains2) {
                            try {
                                boolean contains3 = set.contains(this);
                                this = this;
                                if (!contains3) {
                                    try {
                                        voidArr.getClass();
                                        try {
                                            f0 f0Var = this.a;
                                            String str = d0.j;
                                            this = com.moloco.sdk.internal.publisher.h0.v(f0Var);
                                            return this;
                                        } catch (Exception e) {
                                            this.b = e;
                                            this = this;
                                        }
                                    } catch (Throwable th) {
                                        cw3.a(this, th);
                                        this = this;
                                    }
                                }
                            } catch (Throwable th2) {
                                cw3.a(this, th2);
                                this = this;
                            }
                        }
                    } catch (Throwable th3) {
                        cw3.a(this, th3);
                        this = this;
                    }
                }
            } catch (Throwable th4) {
                cw3.a(this, th4);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.facebook.w] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
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
                List list = (List) obj;
                if (set.contains(this)) {
                    return;
                }
                try {
                    boolean contains = set.contains(this);
                    this = this;
                    if (!contains) {
                        try {
                            list.getClass();
                            super.onPostExecute(list);
                            Exception exc = this.b;
                            this = this;
                            if (exc != null) {
                                String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                                this = w.a;
                                this = this;
                            }
                        } catch (Throwable th) {
                            cw3.a(this, th);
                            this = this;
                        }
                    }
                } catch (Throwable th2) {
                    cw3.a(this, th2);
                }
            } catch (Throwable th3) {
                cw3.a(this, th3);
            }
        } catch (Throwable th4) {
            cw3.a(this, th4);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        f0 f0Var = this.a;
        Set set = cw3.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (set.contains(this)) {
                return;
            }
            try {
                super.onPreExecute();
                w wVar = w.a;
                if (f0Var.a == null) {
                    f0Var.a = Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                cw3.a(this, th);
            }
        } catch (Throwable th2) {
            cw3.a(this, th2);
        }
    }

    public final String toString() {
        return "{RequestAsyncTask:  connection: null, requests: " + this.a + "}";
    }
}
