package g5;

/* loaded from: classes.dex */
final class D extends J4.A {
    @Override // J4.A
    public final String createQuery() {
        return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
    }
}
