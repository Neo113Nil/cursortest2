package defpackage;

import android.database.SQLException;
import android.os.ConditionVariable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CachedContentIndex;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ghh implements he2 {
    public static final HashSet j = new HashSet();
    public final File a;
    public final h5b b;
    public final vng c;
    public final f4a d;
    public final HashMap e;
    public final Random f;
    public final boolean g;
    public long h;
    public ce2 i;

    public ghh(File file, h5b h5bVar, h9i h9iVar) {
        boolean add;
        vng vngVar = new vng();
        vngVar.a = new HashMap();
        vngVar.b = new SparseArray();
        vngVar.c = new SparseBooleanArray();
        vngVar.d = new SparseBooleanArray();
        ujg ujgVar = h9iVar != null ? new ujg(h9iVar) : null;
        File file2 = new File(file, CachedContentIndex.FILE_NAME);
        n72 n72Var = new n72();
        n72Var.b = null;
        n72Var.c = null;
        n72Var.d = new f4a(file2);
        if (ujgVar != null) {
            vngVar.e = ujgVar;
            vngVar.f = n72Var;
        } else {
            String str = nik.a;
            vngVar.e = n72Var;
            vngVar.f = ujgVar;
        }
        f4a f4aVar = h9iVar != null ? new f4a(h9iVar, 2) : null;
        synchronized (ghh.class) {
            add = j.add(file.getAbsoluteFile());
        }
        if (!add) {
            a70.r(fc6.k(file, "Another SimpleCache instance uses the folder: "));
            throw null;
        }
        this.a = file;
        this.b = h5bVar;
        this.c = vngVar;
        this.d = f4aVar;
        this.e = new HashMap();
        this.f = new Random();
        h5bVar.getClass();
        this.g = true;
        this.h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new c15(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void d(File file) {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        tgj.z(str);
        throw new ce2(str);
    }

    public final void a(hhh hhhVar) {
        String str = hhhVar.a;
        this.c.M(str).c.add(hhhVar);
        ArrayList arrayList = (ArrayList) this.e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((h5b) arrayList.get(size)).b(this, hhhVar);
            }
        }
        this.b.b(this, hhhVar);
    }

    public final synchronized void b(String str, fp3 fp3Var) {
        c();
        vng vngVar = this.c;
        lf2 M = vngVar.M(str);
        ao4 ao4Var = M.e;
        ao4 b = ao4Var.b(fp3Var);
        M.e = b;
        if (!b.equals(ao4Var)) {
            ((mf2) vngVar.e).f(M);
        }
        try {
            this.c.n0();
        } catch (IOException e) {
            throw new ce2(e);
        }
    }

    public final synchronized void c() {
        ce2 ce2Var = this.i;
        if (ce2Var != null) {
            throw ce2Var;
        }
    }

    public final synchronized long e(String str, long j2, long j3) {
        lf2 J;
        if (j3 == -1) {
            j3 = Long.MAX_VALUE;
        }
        J = this.c.J(str);
        return J != null ? J.a(j2, j3) : -j3;
    }

    public final synchronized ao4 f(String str) {
        lf2 J;
        J = this.c.J(str);
        return J != null ? J.e : ao4.c;
    }

    public final void g() {
        long j2;
        vng vngVar = this.c;
        File file = this.a;
        if (!file.exists()) {
            try {
                d(file);
            } catch (ce2 e) {
                this.i = e;
                return;
            }
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            tgj.z(str);
            this.i = new ce2(str);
            return;
        }
        int length = listFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j2 = -1;
                break;
            }
            File file2 = listFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j2 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    tgj.z("Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        this.h = j2;
        if (j2 == -1) {
            try {
                long nextLong = new SecureRandom().nextLong();
                j2 = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
                File file3 = new File(file, dmi.y(Long.toString(j2, 16), ".uid"));
                if (!file3.createNewFile()) {
                    is8.e(fc6.k(file3, "Failed to create UID file: "));
                    j2 = 0;
                }
                this.h = j2;
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                tgj.A(str2, e2);
                this.i = new ce2(str2, e2);
                return;
            }
        }
        try {
            vngVar.N(j2);
            f4a f4aVar = this.d;
            if (f4aVar != null) {
                f4aVar.l(this.h);
                HashMap i2 = f4aVar.i();
                i(file, true, listFiles, i2);
                f4aVar.v(i2.keySet());
            } else {
                i(file, true, listFiles, null);
            }
            cck it = vv9.t(((HashMap) vngVar.a).keySet()).iterator();
            while (it.hasNext()) {
                vngVar.W((String) it.next());
            }
            try {
                vngVar.n0();
            } catch (IOException e3) {
                tgj.A("Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            tgj.A(str3, e4);
            this.i = new ce2(str3, e4);
        }
    }

    public final synchronized boolean h(String str) {
        boolean z;
        lf2 J = this.c.J(str);
        if (J != null) {
            z = J.a(0L, 1L) >= 1;
        }
        return z;
    }

    public final void i(File file, boolean z, File[] fileArr, Map map) {
        long j2;
        long j3;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                i(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith(CachedContentIndex.FILE_NAME) && !name.endsWith(".uid"))) {
                ve2 ve2Var = map != null ? (ve2) map.remove(name) : null;
                if (ve2Var != null) {
                    j2 = ve2Var.a;
                    j3 = ve2Var.b;
                } else {
                    j2 = -1;
                    j3 = C.TIME_UNSET;
                }
                hhh b = hhh.b(file2, j2, j3, this.c);
                if (b != null) {
                    a(b);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void j(hhh hhhVar) {
        lf2 J = this.c.J(hhhVar.a);
        J.getClass();
        long j2 = hhhVar.b;
        ArrayList arrayList = J.d;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((kf2) arrayList.get(i)).a == j2) {
                arrayList.remove(i);
                this.c.W(J.b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    public final void k(hhh hhhVar) {
        String str = hhhVar.a;
        long j2 = hhhVar.c;
        File file = hhhVar.e;
        vng vngVar = this.c;
        lf2 J = vngVar.J(str);
        if (J == null || !J.c.remove(hhhVar)) {
            return;
        }
        if (file != null) {
            file.delete();
        }
        f4a f4aVar = this.d;
        if (f4aVar != null) {
            file.getClass();
            String name = file.getName();
            try {
                ((String) f4aVar.c).getClass();
                try {
                    ((h9i) f4aVar.b).getWritableDatabase().delete((String) f4aVar.c, "name = ?", new String[]{name});
                } catch (SQLException e) {
                    throw new jz2(e);
                }
            } catch (IOException unused) {
                mz1.z("Failed to remove file index entry for: ", name);
            }
        }
        vngVar.W(J.b);
        ArrayList arrayList = (ArrayList) this.e.get(hhhVar.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                h5b h5bVar = (h5b) arrayList.get(size);
                h5bVar.b.remove(hhhVar);
                h5bVar.c -= j2;
            }
        }
        h5b h5bVar2 = this.b;
        h5bVar2.b.remove(hhhVar);
        h5bVar2.c -= j2;
    }

    public final void l() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.c.a).values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((lf2) it.next()).c.iterator();
            while (it2.hasNext()) {
                hhh hhhVar = (hhh) it2.next();
                File file = hhhVar.e;
                file.getClass();
                if (file.length() != hhhVar.c) {
                    arrayList.add(hhhVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            k((hhh) arrayList.get(i));
        }
    }

    public final synchronized hhh m(long j2, long j3, String str) {
        long j4;
        hhh b;
        int i;
        c();
        lf2 J = this.c.J(str);
        if (J != null) {
            j4 = j2;
            while (true) {
                b = J.b(j4, j3);
                if (!b.d) {
                    break;
                }
                File file = b.e;
                file.getClass();
                if (file.length() == b.c) {
                    break;
                }
                l();
            }
        } else {
            j4 = j2;
            b = new hhh(str, j4, j3, C.TIME_UNSET, null);
        }
        if (b.d) {
            return n(str, b);
        }
        lf2 M = this.c.M(str);
        long j5 = b.c;
        ArrayList arrayList = M.d;
        while (i < arrayList.size()) {
            kf2 kf2Var = (kf2) arrayList.get(i);
            long j6 = kf2Var.a;
            if (j6 <= j4) {
                long j7 = kf2Var.b;
                i = (j7 != -1 && j6 + j7 <= j4) ? i + 1 : 0;
                return null;
            }
            if (j5 != -1 && j4 + j5 <= j6) {
            }
            return null;
        }
        arrayList.add(new kf2(j4, j5));
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hhh n(String str, hhh hhhVar) {
        boolean z;
        File file;
        ArrayList arrayList;
        long j2 = hhhVar.c;
        File file2 = hhhVar.e;
        if (!this.g) {
            return hhhVar;
        }
        file2.getClass();
        String name = file2.getName();
        long j3 = hhhVar.c;
        long currentTimeMillis = System.currentTimeMillis();
        f4a f4aVar = this.d;
        if (f4aVar != null) {
            try {
                f4aVar.w(j3, currentTimeMillis, name);
            } catch (IOException unused) {
                currentTimeMillis = currentTimeMillis;
                tgj.d0("Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        lf2 J = this.c.J(str);
        J.getClass();
        TreeSet treeSet = J.c;
        z1a.E(treeSet.remove(hhhVar));
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File c = hhh.c(parentFile, J.a, hhhVar.b, currentTimeMillis);
            if (file2.renameTo(c)) {
                file = c;
                z1a.E(hhhVar.d);
                hhh hhhVar2 = new hhh(hhhVar.a, hhhVar.b, hhhVar.c, currentTimeMillis, file);
                treeSet.add(hhhVar2);
                arrayList = (ArrayList) this.e.get(hhhVar.a);
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        h5b h5bVar = (h5b) arrayList.get(size);
                        h5bVar.b.remove(hhhVar);
                        h5bVar.c -= j2;
                        h5bVar.b(this, hhhVar2);
                    }
                }
                h5b h5bVar2 = this.b;
                h5bVar2.b.remove(hhhVar);
                h5bVar2.c -= j2;
                h5bVar2.b(this, hhhVar2);
                return hhhVar2;
            }
            tgj.d0("Failed to rename " + file2 + " to " + c);
        }
        file = file2;
        z1a.E(hhhVar.d);
        hhh hhhVar22 = new hhh(hhhVar.a, hhhVar.b, hhhVar.c, currentTimeMillis, file);
        treeSet.add(hhhVar22);
        arrayList = (ArrayList) this.e.get(hhhVar.a);
        if (arrayList != null) {
        }
        h5b h5bVar22 = this.b;
        h5bVar22.b.remove(hhhVar);
        h5bVar22.c -= j2;
        h5bVar22.b(this, hhhVar22);
        return hhhVar22;
    }
}
