package com.plaid.internal;

import android.util.Log;

/* loaded from: classes3.dex */
public final class Z3 {

    /* renamed from: a, reason: collision with root package name */
    public static final W3 f39803a;

    /* renamed from: b, reason: collision with root package name */
    public static final X3 f39804b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f39805c;

    public class b {
    }

    static {
        O o10 = new O();
        f39803a = W3.INFO;
        f39804b = o10;
        f39805c = new a();
    }

    public class a implements X3 {
        @Override // com.plaid.internal.X3
        public final void a(W3 w32, String str) {
            try {
                Z3.f39804b.a(w32, str);
            } catch (Exception e10) {
                Log.e("ProveSDK", "log writer error!", e10);
            }
        }

        @Override // com.plaid.internal.X3
        public final void a(W3 w32, String str, Exception exc) {
            try {
                Z3.f39804b.a(w32, str, exc);
            } catch (Exception e10) {
                Log.e("ProveSDK", "log writer error!", e10);
            }
        }
    }
}
