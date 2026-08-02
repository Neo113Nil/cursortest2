package g5;

/* loaded from: classes.dex */
final class E extends J4.A {
    @Override // J4.A
    public final String createQuery() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}
