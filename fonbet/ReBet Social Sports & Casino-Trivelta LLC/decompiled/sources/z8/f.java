package z8;

import android.content.Context;

/* loaded from: classes2.dex */
public class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f68633a;

    /* renamed from: b, reason: collision with root package name */
    public final C6942a f68634b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68635c;

    public f(Context context, int i10) {
        this.f68633a = context;
        this.f68635c = i10;
        C6942a c6942a = new C6942a(5);
        this.f68634b = c6942a;
        c6942a.a(context.getApplicationInfo().sourceDir);
    }

    @Override // z8.i
    public h get() {
        return new C6946e(new g(this.f68633a, this.f68634b), new C6943b(this.f68633a, this.f68634b), new l(), new C6944c(this.f68633a), new j(this.f68635c), new C6945d(), new k(), new l());
    }
}
