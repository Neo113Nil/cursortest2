package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class voe implements Handler.Callback {
    public final l2a a;
    public final t9d b;
    public zc4 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final TreeMap e = new TreeMap();
    public final Handler d = nik.q(this);
    public final ce0 c = new ce0(1);

    public voe(zc4 zc4Var, t9d t9dVar, l2a l2aVar) {
        this.f = zc4Var;
        this.b = t9dVar;
        this.a = l2aVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.i) {
            if (message.what != 1) {
                return false;
            }
            toe toeVar = (toe) message.obj;
            long j = toeVar.a;
            long j2 = toeVar.b;
            Long valueOf = Long.valueOf(j2);
            TreeMap treeMap = this.e;
            Long l = (Long) treeMap.get(valueOf);
            if (l == null) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                return true;
            }
            if (l.longValue() > j) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
            }
        }
        return true;
    }
}
