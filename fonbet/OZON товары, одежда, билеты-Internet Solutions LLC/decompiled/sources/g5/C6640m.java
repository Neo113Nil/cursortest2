package g5;

/* renamed from: g5.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6640m extends J4.A {
    @Override // J4.A
    public final String createQuery() {
        return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
    }
}
