package z8;

import android.content.Context;
import com.facebook.soloader.E;
import com.facebook.soloader.p;
import com.facebook.soloader.w;
import java.io.File;

/* loaded from: classes2.dex */
public class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f68636a;

    /* renamed from: b, reason: collision with root package name */
    public final C6942a f68637b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68638c;

    public g(Context context, C6942a c6942a) {
        this.f68636a = context;
        this.f68637b = c6942a;
        this.f68638c = c6942a.c();
    }

    @Override // z8.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (b()) {
            d(eArr);
            return true;
        }
        if (this.f68638c == this.f68637b.c()) {
            return false;
        }
        p.g("soloader.recovery.DetectDataAppMove", "Context was updated (perhaps by another thread)");
        return true;
    }

    public final boolean b() {
        String c10 = c();
        return new File(c10).exists() && this.f68637b.a(c10);
    }

    public final String c() {
        return this.f68636a.getApplicationInfo().sourceDir;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(E[] eArr) {
        for (int i10 = 0; i10 < eArr.length; i10++) {
            Object[] objArr = eArr[i10];
            if (objArr instanceof w) {
                eArr[i10] = ((w) objArr).b(this.f68636a);
            }
        }
    }
}
