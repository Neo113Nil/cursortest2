package ve0;

import De.C2862e;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.N;
import xe.X0;

/* renamed from: ve0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10313a implements b, be0.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2862e f102870a = N.a(C10720e0.a().plus(X0.b()));

    @NotNull
    protected final C2862e i() {
        return this.f102870a;
    }

    @Override // ve0.b
    public void onDestroy() {
        N.c(this.f102870a, null);
    }
}
