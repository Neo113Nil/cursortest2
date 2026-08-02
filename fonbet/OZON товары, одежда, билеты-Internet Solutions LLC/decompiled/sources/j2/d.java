package j2;

import j2.f;
import java.util.ArrayList;
import java.util.Collections;
import m2.j;

/* loaded from: classes8.dex */
public class d extends C7241a implements k2.e {

    /* renamed from: k0, reason: collision with root package name */
    protected final f f68888k0;

    /* renamed from: l0, reason: collision with root package name */
    final f.d f68889l0;

    /* renamed from: m0, reason: collision with root package name */
    protected ArrayList<Object> f68890m0;

    public d(f fVar, f.d dVar) {
        super(fVar);
        this.f68890m0 = new ArrayList<>();
        this.f68888k0 = fVar;
        this.f68889l0 = dVar;
    }

    public final void H(Object... objArr) {
        Collections.addAll(this.f68890m0, objArr);
    }

    public final void I() {
        super.apply();
    }

    public j J() {
        return null;
    }

    public final f.d K() {
        return this.f68889l0;
    }

    @Override // j2.C7241a, j2.e
    public void apply() {
    }

    @Override // j2.C7241a, j2.e
    public final m2.e b() {
        return J();
    }
}
