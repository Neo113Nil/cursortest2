package g5;

/* renamed from: g5.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6649w extends J4.l<C6647u> {
    @Override // J4.l
    public final void bind(O4.f fVar, C6647u c6647u) {
        C6647u c6647u2 = c6647u;
        if (c6647u2.b() == null) {
            fVar.C0(1);
        } else {
            fVar.e0(1, c6647u2.b());
        }
        byte[] e11 = androidx.work.e.e(c6647u2.a());
        if (e11 == null) {
            fVar.C0(2);
        } else {
            fVar.q0(2, e11);
        }
    }

    @Override // J4.A
    public final String createQuery() {
        return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
    }
}
