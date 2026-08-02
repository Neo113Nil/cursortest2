package com.pgl.ssdk;

import android.content.Context;

/* loaded from: classes4.dex */
public class ao implements Runnable {
    private Context a;
    private int b;
    private Object[] c;

    public ao(Context context, int i, Object[] objArr) {
        this.a = context;
        this.b = i;
        this.c = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.b == 222) {
                ak.a(this.a).a();
            }
            byte[] bArr = (byte[]) com.pgl.ssdk.ces.a.meta(this.b, this.a, this.c);
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            new ap(this.a, this.b).a(1, 2, bArr);
        } catch (Throwable unused) {
        }
    }
}
