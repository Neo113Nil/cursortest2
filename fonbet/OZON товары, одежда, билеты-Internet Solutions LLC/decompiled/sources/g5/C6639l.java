package g5;

/* renamed from: g5.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6639l extends J4.l<C6637j> {
    @Override // J4.l
    public final void bind(O4.f fVar, C6637j c6637j) {
        String str = c6637j.f63857a;
        if (str == null) {
            fVar.C0(1);
        } else {
            fVar.e0(1, str);
        }
        fVar.m0(2, r5.a());
        fVar.m0(3, r5.f63859c);
    }

    @Override // J4.A
    public final String createQuery() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }
}
