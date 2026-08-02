package Lg;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public final o f7196a = new o(b());

    /* renamed from: b, reason: collision with root package name */
    public final Context f7197b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7198c;

    public p(Context context, String str) {
        this.f7197b = context;
        this.f7198c = str;
    }

    public Context a() {
        return this.f7197b;
    }

    public String b() {
        return "Universal" + this.f7198c + "Module";
    }
}
