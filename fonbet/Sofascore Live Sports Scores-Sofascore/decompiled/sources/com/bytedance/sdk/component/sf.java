package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    private static ArrayMap<File, sf> hc = null;
    protected static pcc pcc = null;
    private static boolean sf = false;
    private static ArrayMap<String, File> tmg;
    private final Object gm;
    private long kj;
    private final Object oo;
    private final File ork;
    private int qf;
    private final File vh;
    private Properties vj;
    private long vy;
    private volatile boolean wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        HandlerThread pcc(String str, int i);

        ExecutorService pcc();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.component.sf$sf, reason: collision with other inner class name */
    public static class C0053sf {
        final CountDownLatch gm;
        volatile boolean oo;
        final long pcc;
        final Properties sf;
        boolean vj;

        private C0053sf(long j, Properties properties) {
            this.gm = new CountDownLatch(1);
            this.oo = false;
            this.vj = false;
            this.pcc = j;
            this.sf = properties;
        }

        public void pcc(boolean z, boolean z2) {
            this.vj = z;
            this.oo = z2;
            this.gm.countDown();
        }
    }

    private sf(File file) {
        Object obj = new Object();
        this.gm = obj;
        this.oo = new Object();
        this.vj = new Properties();
        this.wh = false;
        this.qf = 0;
        this.ork = file;
        this.vh = pcc(file);
        synchronized (obj) {
            this.wh = false;
        }
        pcc pccVar = pcc;
        if (pccVar == null || pccVar.pcc() == null) {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.sf.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    sf.this.pcc();
                }
            }.start();
        } else {
            pcc.pcc().execute(new Runnable() { // from class: com.bytedance.sdk.component.sf.2
                @Override // java.lang.Runnable
                public void run() {
                    sf.this.pcc();
                }
            });
        }
    }

    private void oo() {
        while (!this.wh) {
            try {
                this.gm.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:40:0x0068, B:41:0x006a, B:58:0x00aa, B:60:0x00ae, B:61:0x00b1, B:63:0x00ba, B:64:0x00bd, B:87:0x00d0, B:88:0x00d1, B:55:0x0092, B:71:0x00a6, B:57:0x00a9, B:82:0x0097, B:75:0x00cf, B:80:0x00cc), top: B:39:0x0068, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ba A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:40:0x0068, B:41:0x006a, B:58:0x00aa, B:60:0x00ae, B:61:0x00b1, B:63:0x00ba, B:64:0x00bd, B:87:0x00d0, B:88:0x00d1, B:55:0x0092, B:71:0x00a6, B:57:0x00a9, B:82:0x0097, B:75:0x00cf, B:80:0x00cc), top: B:39:0x0068, inners: #3, #5 }] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0097 -> B:56:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void sf(C0053sf c0053sf, boolean z) {
        FileOutputStream fileOutputStream;
        Throwable th;
        boolean z2;
        if (sf) {
            System.currentTimeMillis();
        }
        boolean exists = this.ork.exists();
        if (sf) {
            System.currentTimeMillis();
        }
        if (exists) {
            if (this.vy >= c0053sf.pcc) {
                z2 = false;
            } else if (z) {
                z2 = true;
            } else {
                synchronized (this.gm) {
                    z2 = this.kj == c0053sf.pcc;
                }
            }
            if (!z2) {
                c0053sf.pcc(false, true);
                return;
            }
            boolean exists2 = this.vh.exists();
            if (sf) {
                System.currentTimeMillis();
            }
            File file = this.ork;
            if (exists2) {
                file.delete();
            } else if (!file.renameTo(this.vh)) {
                Objects.toString(this.ork);
                Objects.toString(this.vh);
                c0053sf.pcc(false, false);
                return;
            }
        }
        try {
            synchronized (this.oo) {
                FileOutputStream fileOutputStream2 = null;
                fileOutputStream2 = null;
                try {
                    try {
                        try {
                            fileOutputStream = new FileOutputStream(this.ork);
                        } finally {
                            if (sf) {
                            }
                            this.vh.delete();
                            if (sf) {
                            }
                            this.vy = c0053sf.pcc;
                            c0053sf.pcc(true, true);
                        }
                    } catch (Throwable th2) {
                        fileOutputStream = fileOutputStream2;
                        th = th2;
                    }
                } catch (Exception unused) {
                }
                try {
                    if (sf) {
                        System.currentTimeMillis();
                    }
                    c0053sf.sf.store(fileOutputStream, (String) null);
                    ?? r0 = sf;
                    FileOutputStream fileOutputStream3 = r0;
                    if (r0 != 0) {
                        Objects.toString(c0053sf.sf);
                        ?? r02 = this.ork;
                        r02.getAbsolutePath();
                        fileOutputStream3 = r02;
                    }
                    fileOutputStream.close();
                    fileOutputStream2 = fileOutputStream3;
                } catch (Exception unused2) {
                    fileOutputStream2 = fileOutputStream;
                    c0053sf.pcc(false, false);
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                        fileOutputStream2 = fileOutputStream2;
                    }
                    if (sf) {
                    }
                    this.vh.delete();
                    if (sf) {
                    }
                    this.vy = c0053sf.pcc;
                    c0053sf.pcc(true, true);
                } catch (Throwable th3) {
                    th = th3;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                        }
                    }
                    throw th;
                }
            }
            if (sf) {
                System.currentTimeMillis();
            }
            this.vh.delete();
            if (sf) {
                System.currentTimeMillis();
            }
            this.vy = c0053sf.pcc;
            c0053sf.pcc(true, true);
        } catch (Throwable unused3) {
            if (this.ork.exists() && !this.ork.delete()) {
                Objects.toString(this.ork);
            }
            c0053sf.pcc(false, false);
        }
    }

    public static /* synthetic */ int vj(sf sfVar) {
        int i = sfVar.qf;
        sfVar.qf = i + 1;
        return i;
    }

    public static /* synthetic */ int vy(sf sfVar) {
        int i = sfVar.qf;
        sfVar.qf = i - 1;
        return i;
    }

    public static /* synthetic */ long wh(sf sfVar) {
        long j = sfVar.kj;
        sfVar.kj = 1 + j;
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x005b -> B:27:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc() {
        synchronized (this.gm) {
            try {
                if (this.wh) {
                    return;
                }
                if (this.vh.exists()) {
                    this.ork.delete();
                    this.vh.renameTo(this.ork);
                }
                if (sf) {
                    this.ork.getAbsolutePath();
                    this.ork.exists();
                }
                Properties properties = null;
                FileInputStream fileInputStream = null;
                if (this.ork.exists()) {
                    Properties properties2 = new Properties();
                    try {
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(this.ork);
                            try {
                                properties2.load(fileInputStream2);
                                if (sf) {
                                    properties2.size();
                                    this.ork.getAbsolutePath();
                                }
                                fileInputStream2.close();
                            } catch (Throwable unused) {
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                properties = properties2;
                                synchronized (this.gm) {
                                }
                            }
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    } catch (Throwable unused2) {
                    }
                    properties = properties2;
                }
                synchronized (this.gm) {
                    if (properties != null) {
                        try {
                            if (!properties.isEmpty()) {
                                this.vj = properties;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    this.wh = true;
                    this.gm.notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class gm implements SharedPreferences.Editor {
        private final Object sf = new Object();
        private final Map<String, Object> gm = new HashMap();
        private boolean oo = false;

        public gm() {
        }

        private C0053sf sf() {
            Properties properties;
            long j;
            Object obj;
            boolean z;
            synchronized (sf.this.gm) {
                try {
                    if (sf.this.qf > 0) {
                        Properties properties2 = new Properties();
                        properties2.putAll(sf.this.vj);
                        sf.this.vj = properties2;
                    }
                    properties = sf.this.vj;
                    sf.vj(sf.this);
                    synchronized (this.sf) {
                        try {
                            boolean z2 = false;
                            if (this.oo) {
                                if (properties.isEmpty()) {
                                    z = false;
                                } else {
                                    properties.clear();
                                    z = true;
                                }
                                this.oo = false;
                                z2 = z;
                            }
                            for (Map.Entry<String, Object> entry : this.gm.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (value != this && value != null) {
                                    if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                        properties.put(key, String.valueOf(value));
                                        z2 = true;
                                    }
                                }
                                if (properties.containsKey(key)) {
                                    properties.remove(key);
                                    z2 = true;
                                }
                            }
                            this.gm.clear();
                            if (z2) {
                                sf.wh(sf.this);
                            }
                            j = sf.this.kj;
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new C0053sf(j, properties);
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            sf.this.pcc(sf(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            if (sf.sf) {
                System.currentTimeMillis();
            }
            C0053sf sf = sf();
            sf.this.pcc(sf, true);
            try {
                sf.gm.await();
                if (sf.sf) {
                    sf.this.ork.getName();
                    System.currentTimeMillis();
                }
                return sf.oo;
            } catch (InterruptedException unused) {
                if (!sf.sf) {
                    return false;
                }
                sf.this.ork.getName();
                long j = sf.pcc;
                System.currentTimeMillis();
                return false;
            } catch (Throwable th) {
                if (sf.sf) {
                    sf.this.ork.getName();
                    long j2 = sf.pcc;
                    System.currentTimeMillis();
                }
                throw th;
            }
        }

        public gm pcc(String str, Set<String> set) {
            synchronized (this.sf) {
                this.gm.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return pcc(str, (Set<String>) set);
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public gm putInt(String str, int i) {
            synchronized (this.sf) {
                this.gm.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public gm putLong(String str, long j) {
            synchronized (this.sf) {
                this.gm.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public gm putFloat(String str, float f) {
            synchronized (this.sf) {
                this.gm.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public gm putString(String str, String str2) {
            synchronized (this.sf) {
                this.gm.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public gm putBoolean(String str, boolean z) {
            synchronized (this.sf) {
                this.gm.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public gm remove(String str) {
            synchronized (this.sf) {
                this.gm.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public gm clear() {
            synchronized (this.sf) {
                this.oo = true;
            }
            return this;
        }
    }

    public static void pcc(@NotNull pcc pccVar) {
        pcc = pccVar;
    }

    public static sf pcc(@NotNull Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (sf.class) {
            try {
                ArrayMap<String, File> arrayMap = tmg;
                if (arrayMap == null) {
                    arrayMap = new ArrayMap<>();
                    tmg = arrayMap;
                }
                File file = arrayMap.get(str);
                if (file == null) {
                    file = new File(context.getFilesDir(), str);
                    tmg.put(str, file);
                }
                ArrayMap<File, sf> arrayMap2 = hc;
                if (arrayMap2 == null) {
                    arrayMap2 = new ArrayMap<>();
                    hc = arrayMap2;
                }
                sf sfVar = arrayMap2.get(file);
                if (sfVar != null) {
                    return sfVar;
                }
                sf sfVar2 = new sf(file);
                hc.put(file, sfVar2);
                return sfVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static File pcc(File file) {
        return new File(file.getPath() + ".bak");
    }

    public String pcc(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.gm) {
            oo();
            property = this.vj.getProperty(str, str2);
        }
        return property;
    }

    public int pcc(String str, int i) {
        int parseInt;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.gm) {
                try {
                    try {
                        oo();
                        parseInt = Integer.parseInt(this.vj.getProperty(str, String.valueOf(i)));
                    } catch (NumberFormatException e) {
                        e.getMessage();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return parseInt;
        }
        return i;
    }

    public long pcc(String str, long j) {
        long parseLong;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.gm) {
                try {
                    try {
                        oo();
                        parseLong = Long.parseLong(this.vj.getProperty(str, String.valueOf(j)));
                    } catch (NumberFormatException e) {
                        e.getMessage();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return parseLong;
        }
        return j;
    }

    public boolean pcc(String str, boolean z) {
        boolean parseBoolean;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.gm) {
                try {
                    try {
                        oo();
                        parseBoolean = Boolean.parseBoolean(this.vj.getProperty(str, String.valueOf(z)));
                    } catch (NumberFormatException e) {
                        e.getMessage();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return parseBoolean;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final C0053sf c0053sf, final boolean z) {
        boolean z2;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.sf.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (sf.this.oo) {
                    try {
                        sf.this.sf(c0053sf, z);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (sf.this.gm) {
                    sf.vy(sf.this);
                }
            }
        };
        if (z) {
            synchronized (this.gm) {
                z2 = this.qf == 1;
            }
            if (z2) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.gm.pcc(runnable, !z);
    }

    public gm sf() {
        return new gm();
    }
}
