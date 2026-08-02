package kb;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class n0 implements lb.r, lb.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f54408a;

    public n0(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
        this.f54408a = firebaseAuth;
    }

    @Override // lb.m0
    public final void a(zzahv zzahvVar, FirebaseUser firebaseUser) {
        this.f54408a.i0(firebaseUser, zzahvVar, true, true);
    }

    @Override // lb.r
    public final void zza(Status status) {
        int i10 = status.i();
        if (i10 == 17011 || i10 == 17021 || i10 == 17005) {
            this.f54408a.F();
        }
    }
}
