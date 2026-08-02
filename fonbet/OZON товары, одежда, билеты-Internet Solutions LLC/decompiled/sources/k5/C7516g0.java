package k5;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;
import java.util.Collections;
import k5.C7501c1;

/* renamed from: k5.g0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7516g0 extends ContextWrapper implements R0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final C7525i1 f70739a;

    public C7516g0(@NonNull Context context) {
        super(context);
        X1 x12 = (X1) ((Jb.d) Jb.d.b(new Pc.a() { // from class: k5.f0
            @Override // Pc.a
            public final Object get() {
                C7516g0 c7516g0 = C7516g0.this;
                c7516g0.getClass();
                C7501c1.a aVar = new C7501c1.a();
                aVar.b(c7516g0);
                return new X1(aVar.a());
            }
        })).get();
        C7525i1 c11 = ((C7501c1) x12.a()).c();
        c11.d(Collections.singletonMap(Y1.class, x12));
        this.f70739a = c11;
    }

    @NonNull
    public final <T> T a(Class<T> cls) {
        return (T) this.f70739a.a(cls);
    }

    @Override // k5.R0
    @NonNull
    public final Object b() {
        return this.f70739a.c();
    }

    @Override // k5.R0
    @NonNull
    public final void c() {
        this.f70739a.b(Y1.class);
    }
}
