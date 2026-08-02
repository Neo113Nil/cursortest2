package lb;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import eb.C4196f;
import java.util.Objects;

/* renamed from: lb.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5438q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final String f55783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5435n f55784b;

    public RunnableC5438q(C5435n c5435n, String str) {
        Objects.requireNonNull(c5435n);
        this.f55784b = c5435n;
        this.f55783a = AbstractC3191o.g(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        G9.a aVar;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(this.f55783a));
        if (firebaseAuth.j() != null) {
            Task h10 = firebaseAuth.h(true);
            aVar = C5435n.f55766h;
            aVar.g("Token refreshing started", new Object[0]);
            h10.addOnFailureListener(new C5437p(this));
        }
    }
}
