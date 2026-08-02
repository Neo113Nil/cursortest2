package u2;

import android.content.Context;
import com.android.billingclient.api.l0;
import gf.f0;
import gf.k;
import gf.t;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements t2.d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f24040a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24041b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f24042c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24043d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24044e;

    /* renamed from: f, reason: collision with root package name */
    public final t f24045f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24046g;

    public h(Context context, String str, l0 callback, boolean z5, boolean z7) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f24040a = context;
        this.f24041b = str;
        this.f24042c = callback;
        this.f24043d = z5;
        this.f24044e = z7;
        this.f24045f = k.b(new me.a(18, this));
    }

    @Override // t2.d
    public final t2.a M() {
        return ((g) this.f24045f.getValue()).c(false);
    }

    @Override // t2.d
    public final t2.a Q() {
        return ((g) this.f24045f.getValue()).c(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f24045f.f10037b != f0.f10021a) {
            ((g) this.f24045f.getValue()).close();
        }
    }

    @Override // t2.d
    public final String getDatabaseName() {
        return this.f24041b;
    }

    @Override // t2.d
    public final void setWriteAheadLoggingEnabled(boolean z5) {
        if (this.f24045f.f10037b != f0.f10021a) {
            ((g) this.f24045f.getValue()).setWriteAheadLoggingEnabled(z5);
        }
        this.f24046g = z5;
    }
}
