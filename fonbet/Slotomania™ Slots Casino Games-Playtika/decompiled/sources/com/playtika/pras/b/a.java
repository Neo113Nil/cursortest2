package com.playtika.pras.b;

/* loaded from: classes6.dex */
public final class a implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ b b;

    public a(b bVar, String str) {
        this.b = bVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.d.evaluateJavascript(this.a, null);
    }
}
