package g5;

/* loaded from: classes.dex */
final class G extends J4.A {
    @Override // J4.A
    public final String createQuery() {
        return "UPDATE workspec SET generation=generation+1 WHERE id=?";
    }
}
