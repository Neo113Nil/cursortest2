package org.chromium.net.impl;

import C2.C2727w;
import C2.C2728x;
import C2.C2729y;
import C2.C2730z;
import android.net.http.CallbackException;
import android.net.http.HttpException;

/* loaded from: classes10.dex */
final class G {

    interface a<T, E extends Exception> {
        void run() throws Exception;
    }

    public static void a(a aVar) throws org.chromium.net.f, Exception {
        try {
            aVar.run();
        } catch (Exception e11) {
            if (!C2730z.d(e11)) {
                if (C2728x.e(e11)) {
                    throw b(e11);
                }
                if (!Exception.class.isInstance(e11)) {
                    throw e11;
                }
                throw e11;
            }
            if (!C2730z.d(e11)) {
                throw new IllegalArgumentException("Not an Android Cronet exception", e11);
            }
            if (!C2730z.d(e11)) {
                throw new UnsupportedOperationException("Unchecked exception translation discrepancy", e11);
            }
            org.chromium.net.n nVar = new org.chromium.net.n();
            nVar.initCause(e11);
            throw nVar;
        }
    }

    public static org.chromium.net.f b(Exception exc) {
        String message;
        String message2;
        Throwable cause;
        if (!C2728x.e(exc)) {
            throw new IllegalArgumentException("Not an Android Cronet exception", exc);
        }
        if (C8769h.b(exc)) {
            return new r(C8770i.a(exc));
        }
        if (E0.B.c(exc)) {
            return new C8776o(C8771j.b(exc), false);
        }
        if (C8772k.b(exc)) {
            CallbackException a11 = C2727w.a(exc);
            message2 = a11.getMessage();
            cause = a11.getCause();
            return new C8762a(message2, cause);
        }
        if (!C2728x.e(exc)) {
            throw new UnsupportedOperationException("Checked exception translation discrepancy", exc);
        }
        HttpException b11 = C2729y.b(exc);
        message = b11.getMessage();
        return new C8775n(message, b11);
    }
}
