package g5;

/* renamed from: g5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6634g extends J4.l<C6632e> {
    @Override // J4.l
    public final void bind(O4.f fVar, C6632e c6632e) {
        C6632e c6632e2 = c6632e;
        if (c6632e2.a() == null) {
            fVar.C0(1);
        } else {
            fVar.e0(1, c6632e2.a());
        }
        if (c6632e2.b() == null) {
            fVar.C0(2);
        } else {
            fVar.m0(2, c6632e2.b().longValue());
        }
    }

    @Override // J4.A
    public final String createQuery() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }
}
