package g5;

/* loaded from: classes.dex */
final class P extends J4.A {
    @Override // J4.A
    public final String createQuery() {
        return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
    }
}
