package com.plaid.internal;

import android.util.Log;

/* loaded from: classes3.dex */
public final class O implements X3 {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39469a;

        static {
            int[] iArr = new int[W3.values().length];
            f39469a = iArr;
            try {
                iArr[W3.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39469a[W3.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39469a[W3.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39469a[W3.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.plaid.internal.X3
    public final void a(W3 w32, String str) {
        int i10 = a.f39469a[w32.ordinal()];
        int i11 = 2;
        if (i10 != 1) {
            if (i10 == 2) {
                i11 = 3;
            } else if (i10 != 3) {
                i11 = 4;
                if (i10 == 4) {
                    i11 = 6;
                }
            } else {
                i11 = 5;
            }
        }
        Log.println(i11, "ProveSDK", str);
    }

    @Override // com.plaid.internal.X3
    public final void a(W3 w32, String str, Exception exc) {
        a(w32, str + '\n' + Log.getStackTraceString(exc));
    }
}
