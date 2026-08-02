package g5;

/* loaded from: classes.dex */
final class N extends J4.A {
    @Override // J4.A
    public final String createQuery() {
        return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
    }
}
