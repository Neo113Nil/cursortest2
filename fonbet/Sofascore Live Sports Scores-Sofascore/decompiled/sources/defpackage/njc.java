package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class njc {
    public final int a;
    public final int b;

    public njc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(glg glgVar) {
        glgVar.getClass();
        if (!(glgVar instanceof cni)) {
            throw new ped("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        b(((cni) glgVar).a);
    }

    public void b(dni dniVar) {
        dniVar.getClass();
        throw new ped("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
