package m2;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements s2.a, ng.a {

    /* renamed from: a, reason: collision with root package name */
    public final s2.a f20234a;

    /* renamed from: b, reason: collision with root package name */
    public final ng.c f20235b;

    /* renamed from: c, reason: collision with root package name */
    public CoroutineContext f20236c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f20237d;

    /* renamed from: e, reason: collision with root package name */
    public final i f20238e;

    public j(s2.a delegate) {
        ng.c lock = new ng.c();
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.f20234a = delegate;
        this.f20235b = lock;
        this.f20238e = new i(this);
    }

    @Override // ng.a
    public final Object c(mf.c cVar) {
        return this.f20235b.c(cVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        i iVar = this.f20238e;
        if (iVar != null) {
            iVar.f(-1);
        }
        this.f20234a.close();
    }

    @Override // s2.a
    public final boolean j() {
        return this.f20234a.j();
    }

    @Override // ng.a
    public final void k(Object obj) {
        this.f20235b.k(null);
    }

    public final void n(StringBuilder builder) {
        int i5;
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (this.f20236c == null && this.f20237d == null) {
            builder.append("\t\tStatus: Free connection");
            builder.append('\n');
        } else {
            builder.append("\t\tStatus: Acquired connection");
            builder.append('\n');
            CoroutineContext coroutineContext = this.f20236c;
            if (coroutineContext != null) {
                builder.append("\t\tCoroutine: " + coroutineContext);
                builder.append('\n');
            }
            Throwable th2 = this.f20237d;
            if (th2 != null) {
                builder.append("\t\tAcquired:");
                builder.append('\n');
                Iterator it = CollectionsKt.B(StringsKt.K(gf.d.b(th2))).iterator();
                while (it.hasNext()) {
                    builder.append("\t\t" + ((String) it.next()));
                    builder.append('\n');
                }
            }
        }
        if (this.f20238e != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            i iVar = this.f20238e;
            synchronized (iVar.f22569c) {
                i5 = iVar.f22570d;
            }
            sb2.append(i5);
            builder.append(sb2.toString());
            builder.append('\n');
        }
    }

    @Override // s2.a
    public final s2.c r0(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        i iVar = this.f20238e;
        if (iVar == null) {
            return this.f20234a.r0(sql);
        }
        Object c2 = iVar.c(sql);
        Intrinsics.checkNotNull(c2);
        return new h((s2.c) c2);
    }

    public final String toString() {
        return this.f20234a.toString();
    }
}
