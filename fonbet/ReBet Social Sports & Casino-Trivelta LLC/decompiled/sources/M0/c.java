package M0;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public Context f7396b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f7397c;

    public c(a aVar, Context context, Uri uri) {
        super(aVar);
        this.f7396b = context;
        this.f7397c = uri;
    }

    @Override // M0.a
    public boolean a() {
        return b.b(this.f7396b, this.f7397c);
    }

    @Override // M0.a
    public boolean c() {
        return b.d(this.f7396b, this.f7397c);
    }

    @Override // M0.a
    public long d() {
        return b.e(this.f7396b, this.f7397c);
    }
}
