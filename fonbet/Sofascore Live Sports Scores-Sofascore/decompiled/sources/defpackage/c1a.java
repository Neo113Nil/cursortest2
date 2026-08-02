package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class c1a extends vv9 {
    @Override // defpackage.wu9
    public final int e(int i, Object[] objArr) {
        return d().e(i, objArr);
    }

    public abstract Object get(int i);

    @Override // defpackage.wu9
    /* renamed from: q */
    public final cck iterator() {
        return d().listIterator(0);
    }

    @Override // defpackage.vv9
    public final hv9 v() {
        return new b1a(this);
    }

    @Override // defpackage.vv9, defpackage.wu9
    public Object writeReplace() {
        return super.writeReplace();
    }
}
