package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteFullException;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jwm implements Handler.Callback, dsm {
    public final Context a;
    public final kem b;
    public volatile sem d;
    public volatile Handler e;
    public volatile Handler f;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public volatile boolean g = false;

    public jwm(Context context, kem kemVar) {
        this.a = context;
        this.b = kemVar;
        kemVar.sf(true);
        for (Map.Entry<Class<? extends itm>, iwm> entry : kemVar.vj().entrySet()) {
            Class<? extends itm> key = entry.getKey();
            this.c.put(key, new lum(this, entry.getValue()));
            Objects.toString(key);
        }
        new dwm(this, 0).start();
        new dwm(this, 1).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01a6, code lost:
    
        if (r4.inTransaction() != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01a8, code lost:
    
        r4.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01bf, code lost:
    
        if (r4.inTransaction() != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0112, code lost:
    
        if (r8.inTransaction() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x012c, code lost:
    
        if (r8.inTransaction() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0114, code lost:
    
        r8.endTransaction();
     */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0222: IF  (r8 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:181:0x022d (LINE:547), block:B:180:0x0222 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(lum lumVar) {
        ArrayList arrayList;
        SQLiteDatabase sQLiteDatabase;
        ArrayList arrayList2;
        boolean z;
        HashSet hashSet;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteDatabase sQLiteDatabase3;
        if (lumVar.a.size() == 0) {
            Objects.toString(lumVar.c);
            return;
        }
        kem kemVar = this.b;
        sem c = c();
        synchronized (lumVar.a) {
            arrayList = new ArrayList(lumVar.a);
        }
        boolean z2 = false;
        boolean z3 = true;
        try {
            if (arrayList.isEmpty()) {
                z = false;
                Objects.toString(lumVar.c);
                if (this.e != null) {
                    if (!z) {
                        c();
                        lumVar.e();
                        return;
                    }
                    if (!this.e.hasMessages(1002, lumVar) && lumVar.d.isEmpty()) {
                        z2 = true;
                    }
                    boolean z4 = !this.b.vy();
                    if (z2 || !lumVar.n || lumVar.h.get() < lumVar.c.kj()) {
                        z3 = z2;
                    } else {
                        Objects.toString(lumVar.c);
                        z4 = true;
                    }
                    if (z3) {
                        e(lumVar, z4);
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                sQLiteDatabase3 = c.getWritableDatabase();
                try {
                    try {
                        sQLiteDatabase3.beginTransaction();
                        if (lumVar.k == null) {
                            lumVar.k = sQLiteDatabase3.compileStatement("INSERT OR REPLACE INTO " + lumVar.c.oo() + "(data_id,data,priority,upload_retry_count,create_time) VALUES (?,?,?,?,?)");
                        }
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            try {
                                itm itmVar = (itm) arrayList.get(i);
                                byte[] oo = itmVar.oo();
                                if (oo == null || oo.length == 0) {
                                    arrayList2 = arrayList;
                                    itmVar.toString();
                                    jtm jtmVar = lumVar.j;
                                    if (jtmVar != null) {
                                        jtmVar.b(9, 1);
                                    }
                                } else {
                                    eem oo2 = kemVar.oo();
                                    if (oo2 != null) {
                                        byte[] pcc = oo2.pcc(oo);
                                        jtm jtmVar2 = lumVar.j;
                                        if (pcc != null) {
                                            if (jtmVar2 != null) {
                                                jtmVar2.b(5, 1);
                                            }
                                            oo = pcc;
                                        } else if (jtmVar2 != null) {
                                            jtmVar2.b(6, 1);
                                        }
                                    }
                                    lumVar.k.clearBindings();
                                    lumVar.k.bindString(1, itmVar.wh());
                                    lumVar.k.bindBlob(2, oo);
                                    arrayList2 = arrayList;
                                    try {
                                        try {
                                            lumVar.k.bindLong(3, itmVar.sf());
                                            lumVar.k.bindLong(4, itmVar.vj());
                                            lumVar.k.bindLong(5, itmVar.pcc());
                                            lumVar.k.executeInsert();
                                        } catch (Exception unused) {
                                            try {
                                                jtm jtmVar3 = lumVar.j;
                                                if (jtmVar3 != null) {
                                                    jtmVar3.b(12, 1);
                                                }
                                                i++;
                                                arrayList = arrayList2;
                                            } catch (SQLiteFullException unused2) {
                                                arrayList2.size();
                                                jtm jtmVar4 = lumVar.j;
                                                if (jtmVar4 != null) {
                                                    jtmVar4.b(10006, 1);
                                                }
                                                if (sQLiteDatabase3 != null) {
                                                }
                                                z = false;
                                                if (z) {
                                                }
                                                Objects.toString(lumVar.c);
                                                if (this.e != null) {
                                                }
                                            }
                                        }
                                    } catch (Throwable unused3) {
                                        jtm jtmVar5 = lumVar.j;
                                        if (jtmVar5 != null) {
                                            jtmVar5.b(10004, 1);
                                        }
                                        if (sQLiteDatabase3 != null) {
                                        }
                                        z = false;
                                        if (z) {
                                        }
                                        Objects.toString(lumVar.c);
                                        if (this.e != null) {
                                        }
                                    }
                                }
                            } catch (Exception unused4) {
                                arrayList2 = arrayList;
                            }
                            i++;
                            arrayList = arrayList2;
                        }
                        arrayList2 = arrayList;
                        sQLiteDatabase3.setTransactionSuccessful();
                        arrayList2.size();
                        try {
                            if (sQLiteDatabase3.inTransaction()) {
                                sQLiteDatabase3.endTransaction();
                            }
                        } catch (Exception unused5) {
                        }
                        z = true;
                    } catch (SQLiteFullException unused6) {
                        arrayList2 = arrayList;
                    }
                } catch (Throwable unused7) {
                    arrayList2 = arrayList;
                }
            } catch (SQLiteFullException unused8) {
                arrayList2 = arrayList;
                sQLiteDatabase3 = null;
            } catch (Throwable unused9) {
                arrayList2 = arrayList;
                sQLiteDatabase3 = null;
            }
            if (z) {
                lumVar.m = SystemClock.elapsedRealtime();
                lumVar.h.addAndGet(arrayList2.size());
                synchronized (lumVar.a) {
                    lumVar.a.removeAll(arrayList2);
                    arrayList2.size();
                }
                if (!lumVar.e.isEmpty()) {
                    synchronized (lumVar.e) {
                        hashSet = new HashSet(lumVar.e);
                        lumVar.e.clear();
                    }
                    try {
                        sQLiteDatabase2 = c.getWritableDatabase();
                    } catch (Throwable unused10) {
                        sQLiteDatabase2 = null;
                    }
                    try {
                        sQLiteDatabase2.beginTransaction();
                        HashSet hashSet2 = new HashSet();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (sQLiteDatabase2.delete(lumVar.c.oo(), "data_id = ?", new String[]{str}) == 0) {
                                hashSet2.add(str);
                            }
                        }
                        sQLiteDatabase2.setTransactionSuccessful();
                        hashSet.size();
                        hashSet2.size();
                    } catch (Throwable unused11) {
                        try {
                            jtm jtmVar6 = lumVar.j;
                            if (jtmVar6 != null) {
                                jtmVar6.b(Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE, 1);
                            }
                            if (sQLiteDatabase2 != null) {
                            }
                            Objects.toString(lumVar.c);
                            if (this.e != null) {
                            }
                        } catch (Throwable th) {
                            if (sQLiteDatabase2 != null) {
                                try {
                                    if (sQLiteDatabase2.inTransaction()) {
                                        sQLiteDatabase2.endTransaction();
                                    }
                                } catch (Exception unused12) {
                                }
                            }
                            throw th;
                        }
                    }
                }
            }
            Objects.toString(lumVar.c);
            if (this.e != null) {
            }
        } catch (Throwable th2) {
            if (sQLiteDatabase != null) {
                try {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                } catch (Exception unused13) {
                }
            }
            throw th2;
        }
    }

    public final void b() {
        if (this.e == null || this.f == null) {
            return;
        }
        for (lum lumVar : this.c.values()) {
            try {
                sem c = c();
                jtm jtmVar = lumVar.j;
                iwm iwmVar = lumVar.c;
                long vj = iwmVar.vj();
                if (vj > 0) {
                    try {
                        int delete = c.getWritableDatabase().delete(iwmVar.oo(), "create_time < ?", new String[]{String.valueOf(System.currentTimeMillis() - vj)});
                        if (delete > 0 && jtmVar != null) {
                            jtmVar.b(4, delete);
                        }
                    } catch (Throwable unused) {
                        if (jtmVar != null) {
                            jtmVar.b(10003, 1);
                        }
                    }
                }
                e(lumVar, false);
                jtm jtmVar2 = lumVar.j;
                if (jtmVar2 != null) {
                    jtmVar2.c(this.e.getLooper(), lumVar);
                }
            } catch (Exception unused2) {
            }
        }
        this.g = true;
    }

    public final sem c() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        this.d = new sem(this.a, this, this.b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.d;
    }

    public final void d(itm itmVar, boolean z) {
        int size;
        char c;
        Handler handler;
        Objects.toString(itmVar);
        lum lumVar = (lum) this.c.get(itmVar.getClass());
        if (lumVar == null) {
            return;
        }
        synchronized (lumVar.a) {
            lumVar.a.add(itmVar);
            size = lumVar.a.size();
        }
        if (itmVar.sf() == 1) {
            c = 6;
        } else {
            int e0 = (int) (aik.e0(true) * lumVar.c.vy());
            if (e0 <= 0) {
                e0 = 1;
            }
            c = size > e0 ? (char) 2 : (char) 1;
        }
        if ((c & 4) == 4 && this.b.pcc()) {
            itmVar.toString();
            c();
            lumVar.e();
        }
        if (z || (c & 2) == 2) {
            if (this.f != null) {
                this.f.removeMessages(1001, lumVar);
            }
            itmVar.toString();
            a(lumVar);
        } else if (this.f != null && !this.f.hasMessages(1001, lumVar)) {
            Handler handler2 = this.f;
            Message obtainMessage = this.f.obtainMessage(1001, lumVar);
            long e02 = (long) (aik.e0(true) * lumVar.c.ork());
            if (e02 <= 0) {
                e02 = 100;
            }
            handler2.sendMessageDelayed(obtainMessage, e02);
            lumVar.c.ork();
            aik.e0(true);
        }
        jtm jtmVar = lumVar.j;
        if (jtmVar == null || (handler = jtmVar.f) == null || handler.hasMessages(10000)) {
            return;
        }
        jtmVar.f.sendEmptyMessageDelayed(10000, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }

    public final void e(lum lumVar, boolean z) {
        long j = 0;
        if (!z) {
            long e0 = (long) (aik.e0(false) * lumVar.c.pcc());
            if (e0 <= 0 || e0 > TTAdConstant.AD_MAX_EVENT_TIME) {
                e0 = 15000;
            }
            if (lumVar.i.get() < 2) {
                j = e0;
            } else {
                j = (long) Math.min(600000.0d, Math.pow(2.0d, lumVar.i.get()) * e0);
                lumVar.i.get();
            }
        }
        this.e.removeMessages(1002, lumVar);
        this.e.sendMessageDelayed(this.e.obtainMessage(1002, lumVar), j);
        Objects.toString(lumVar.c);
    }

    public final void f(lum lumVar, boolean z, boolean z2, boolean z3) {
        if (z2 && !z) {
            Objects.toString(lumVar.c);
            return;
        }
        if (z2 && z3) {
            Objects.toString(lumVar.c);
        } else if (this.e.hasMessages(1002, lumVar)) {
            return;
        }
        e(lumVar, z2 && z);
    }

    public final void g(itm itmVar) {
        bem sf = this.b.sf();
        ExecutorService pcc = sf != null ? sf.pcc() : null;
        if (pcc == null && (pcc = ktm.b) == null) {
            synchronized (ktm.class) {
                try {
                    pcc = ktm.b;
                    if (pcc == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 60L, TimeUnit.SECONDS, new PriorityBlockingQueue(), new ct4(3));
                        ktm.b = threadPoolExecutor;
                        pcc = threadPoolExecutor;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Objects.toString(itmVar);
        pcc.execute(new fwm(this, itmVar.qf(), itmVar));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (pea.f) {
            try {
                switch (message.what) {
                    case 1000:
                        Object obj = message.obj;
                        if (!(obj instanceof itm)) {
                            obj.getClass();
                            break;
                        } else {
                            d((itm) obj, false);
                            return true;
                        }
                    case 1001:
                        a((lum) message.obj);
                        return true;
                    case 1002:
                        lum lumVar = (lum) message.obj;
                        if (this.b.ork()) {
                            lumVar.h(c());
                            return true;
                        }
                        lumVar.c(c(), this.b.kj());
                        return true;
                    case 1003:
                        ((lum) message.obj).b(c());
                        return true;
                    case 1004:
                        ((lum) message.obj).f(c());
                        return true;
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }
}
