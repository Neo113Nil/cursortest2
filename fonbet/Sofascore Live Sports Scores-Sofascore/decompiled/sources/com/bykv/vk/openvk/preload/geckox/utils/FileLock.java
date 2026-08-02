package com.bykv.vk.openvk.preload.geckox.utils;

import android.os.Process;
import defpackage.bf3;
import defpackage.cp4;
import defpackage.i3c;
import defpackage.wt3;
import defpackage.yhk;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class FileLock {
    private static final Map<String, Integer> a = new HashMap();
    private final int b;
    private final String c;

    static {
        System.loadLibrary("file_lock_pgl");
    }

    private FileLock(String str, int i) {
        this.c = str;
        this.b = i;
    }

    public static FileLock a(String str) {
        try {
            int d = d(str);
            nLockFile(d);
            return new FileLock(str, d);
        } catch (Exception e) {
            StringBuilder q = wt3.q("lock failed, file:", str, ", pid:");
            q.append(Process.myPid());
            q.append(" caused by:");
            i3c.n(q, e.getMessage());
            return null;
        }
    }

    public static FileLock c(String str) throws Exception {
        try {
            int d = d(str);
            if (nTryLock(d)) {
                return new FileLock(str, d);
            }
            new FileLock(str, d).b();
            return null;
        } catch (Exception e) {
            cp4.h(bf3.j(e, wt3.q("try lock failed, file:", str, " caused by:")));
            return null;
        }
    }

    private static int d(String str) throws Exception {
        Integer num;
        Map<String, Integer> map = a;
        synchronized (map) {
            try {
                num = map.get(str);
                if (num == null) {
                    new File(str).getParentFile().mkdirs();
                    num = Integer.valueOf(nGetFD(str));
                    map.put(str, num);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return num.intValue();
    }

    private static native int nGetFD(String str) throws Exception;

    private static native void nLockFile(int i) throws Exception;

    private static native void nLockFileSegment(int i, int i2) throws Exception;

    private static native void nRelease(int i) throws Exception;

    private static native boolean nTryLock(int i) throws Exception;

    private static native void nUnlockFile(int i) throws Exception;

    public final void b() {
        Integer remove;
        Map<String, Integer> map = a;
        synchronized (map) {
            remove = map.remove(this.c);
        }
        try {
            nRelease(remove.intValue());
        } catch (Exception e) {
            throw new RuntimeException("release lock failed, file:" + this.c + " caused by:" + e.getMessage());
        }
    }

    public static FileLock a(String str, int i) {
        try {
            int d = d(str);
            nLockFileSegment(d, i);
            return new FileLock(str, d);
        } catch (Exception e) {
            cp4.h(bf3.j(e, wt3.q("lock segment failed, file:", str, " caused by:")));
            return null;
        }
    }

    public final void a() {
        try {
            nUnlockFile(this.b);
        } catch (Exception unused) {
            yhk.w(this.c, "release lock failed，path:");
        }
    }

    public static FileLock b(String str) {
        try {
            int d = d(str);
            if (nTryLock(d)) {
                return new FileLock(str, d);
            }
            return null;
        } catch (Exception e) {
            cp4.h(bf3.j(e, wt3.q("try lock failed, file:", str, " caused by:")));
            return null;
        }
    }
}
