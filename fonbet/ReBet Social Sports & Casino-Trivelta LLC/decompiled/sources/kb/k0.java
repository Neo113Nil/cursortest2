package kb;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.util.Objects;
import lb.InterfaceC5439s;

/* loaded from: classes3.dex */
public final class k0 implements InterfaceC5439s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f54405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f54406b;

    public k0(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        this.f54405a = firebaseUser;
        Objects.requireNonNull(firebaseAuth);
        this.f54406b = firebaseAuth;
    }

    @Override // lb.InterfaceC5439s
    public final void zza() {
        FirebaseUser firebaseUser;
        FirebaseUser firebaseUser2;
        firebaseUser = this.f54406b.f37562f;
        if (firebaseUser != null) {
            firebaseUser2 = this.f54406b.f37562f;
            if (firebaseUser2.a().equalsIgnoreCase(this.f54405a.a())) {
                this.f54406b.E0();
            }
        }
    }

    @Override // lb.r
    public final void zza(Status status) {
        if (status.i() == 17011 || status.i() == 17021 || status.i() == 17005) {
            this.f54406b.F();
        }
    }
}
