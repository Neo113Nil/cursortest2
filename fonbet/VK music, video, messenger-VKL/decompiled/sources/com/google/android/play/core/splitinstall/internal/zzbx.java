package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.splitinstall.SplitInstallException;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import xsna.pzl;
import xsna.ss9;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class zzbx extends RuntimeException {
    public static Object h(Callable callable) {
        try {
            return callable.call();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbx("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", e2);
        }
    }

    @Override // java.lang.Throwable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized Exception getCause() {
        Throwable cause;
        cause = super.getCause();
        cause.getClass();
        return (Exception) cause;
    }

    public final Exception g() {
        int indexOf;
        String a;
        Class[] clsArr = {SplitInstallException.class};
        int i = 0;
        for (int i2 = 0; i2 <= 0; i2++) {
            Class cls = clsArr[i2];
            if (RuntimeException.class.isAssignableFrom(cls)) {
                Object[] objArr = new Object[2];
                objArr[0] = "getCause";
                objArr[1] = cls;
                for (int i3 = 0; i3 < 2; i3++) {
                    Object obj = objArr[i3];
                    if (obj == null) {
                        a = "null";
                    } else {
                        try {
                            a = obj.toString();
                        } catch (Exception e) {
                            String b = pzl.b(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(b), (Throwable) e);
                            a = ss9.a("<", b, " threw ", e.getClass().getName(), ">");
                        }
                    }
                    objArr[i3] = a;
                }
                StringBuilder sb = new StringBuilder(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                int i4 = 0;
                while (i < 2 && (indexOf = "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s".indexOf("%s", i4)) != -1) {
                    sb.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i4, indexOf);
                    sb.append(objArr[i]);
                    i4 = indexOf + 2;
                    i++;
                }
                sb.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i4, 86);
                if (i < 2) {
                    sb.append(" [");
                    sb.append(objArr[i]);
                    for (int i5 = i + 1; i5 < 2; i5++) {
                        sb.append(", ");
                        sb.append(objArr[i5]);
                    }
                    sb.append(']');
                }
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (SplitInstallException.class.isInstance(getCause())) {
            return (Exception) SplitInstallException.class.cast(getCause());
        }
        Exception cause = getCause();
        ClassCastException classCastException = new ClassCastException("getCause(" + SplitInstallException.class + ") doesn't match underlying exception");
        classCastException.initCause(cause);
        throw classCastException;
    }
}
