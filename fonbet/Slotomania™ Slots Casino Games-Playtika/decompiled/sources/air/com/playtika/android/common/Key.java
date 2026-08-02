package air.com.playtika.android.common;

/* loaded from: classes6.dex */
public enum Key {
    Unknown(0),
    BackSpace(9),
    Tab(59),
    Enter(10),
    Delete(58);

    private final int id;

    Key(int i) {
        this.id = i;
    }

    public int getId() {
        return this.id;
    }
}
