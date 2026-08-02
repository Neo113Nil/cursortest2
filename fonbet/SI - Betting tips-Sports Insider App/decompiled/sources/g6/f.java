package g6;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class f extends e implements d6.c {
    public static volatile p A;

    /* renamed from: z, reason: collision with root package name */
    public final Set f9833z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(Context context, Looper looper, int i5, androidx.appcompat.widget.a0 a0Var, d6.h hVar, d6.i iVar, int i10) {
        super(context, looper, r4, r5, i5, new h(hVar), new h(iVar), (String) a0Var.f683e);
        g0 a7 = g0.a(context);
        c6.c cVar = c6.c.f3657e;
        v.h(hVar);
        v.h(iVar);
        Set set = (Set) a0Var.f681c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f9833z = set;
        if (A == null) {
            synchronized (f.class) {
                try {
                    if (A == null) {
                        context.getPackageName();
                        A = p.a(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // g6.e
    public final Account g() {
        return null;
    }

    @Override // g6.e
    public final Executor i() {
        return A;
    }

    @Override // g6.e
    public final Set l() {
        return this.f9833z;
    }
}
