package g5;

/* loaded from: classes.dex */
final class V extends J4.l<T> {
    @Override // J4.l
    public final void bind(O4.f fVar, T t2) {
        T t11 = t2;
        if (t11.a() == null) {
            fVar.C0(1);
        } else {
            fVar.e0(1, t11.a());
        }
        if (t11.b() == null) {
            fVar.C0(2);
        } else {
            fVar.e0(2, t11.b());
        }
    }

    @Override // J4.A
    public final String createQuery() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }
}
