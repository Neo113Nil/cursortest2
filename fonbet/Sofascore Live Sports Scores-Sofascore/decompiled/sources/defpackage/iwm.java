package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class iwm {
    public final String gm() {
        return "CREATE TABLE IF NOT EXISTS " + oo() + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, data_id TEXT UNIQUE, data BLOB, priority INTEGER DEFAULT 0, upload_retry_count INTEGER DEFAULT 0, create_time INTEGER);";
    }

    public abstract int kj();

    public abstract String oo();

    public abstract long ork();

    public abstract long pcc();

    public abstract itm pcc(String str, byte[] bArr, int i, int i2);

    public abstract void pcc(ArrayList arrayList, iem iemVar);

    public abstract ydm qf();

    public abstract int sf();

    public abstract long vj();

    public abstract int vy();

    public abstract boolean wh();
}
