package g5;

/* loaded from: classes.dex */
final class L extends J4.A {
    @Override // J4.A
    public final String createQuery() {
        return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
    }
}
