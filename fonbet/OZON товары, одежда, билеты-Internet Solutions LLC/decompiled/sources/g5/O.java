package g5;

/* loaded from: classes.dex */
final class O extends J4.A {
    @Override // J4.A
    public final String createQuery() {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }
}
