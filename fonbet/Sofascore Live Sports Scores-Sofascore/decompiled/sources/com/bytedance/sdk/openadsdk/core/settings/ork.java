package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.settings.vj;
import com.bytedance.sdk.openadsdk.utils.hc;
import com.bytedance.sdk.openadsdk.utils.rnn;
import defpackage.dmi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class ork implements vj {
    private final pcc ork;
    private final String qf;
    private boolean vh;
    private final ConcurrentHashMap<String, Object> gm = new ConcurrentHashMap<>();
    private final Object oo = new Object();
    private final Object vj = new Object();
    private final CountDownLatch wh = new CountDownLatch(1);
    private Properties kj = new Properties();
    private volatile boolean vy = false;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc();

        void sf();
    }

    public ork(pcc pccVar) {
        String pcc2 = pcc();
        this.qf = pcc2;
        this.ork = pccVar;
        rnn.pcc(new com.bytedance.sdk.component.kj.sf.gm(dmi.q("SetL_", pcc2)) { // from class: com.bytedance.sdk.openadsdk.core.settings.ork.1
            @Override // java.lang.Runnable
            public void run() {
                ork.this.pcc(false);
            }
        });
    }

    @Nullable
    private File qf() {
        Context pcc2 = lu.pcc();
        if (pcc2 != null) {
            return new File(pcc2.getFilesDir(), this.qf);
        }
        return null;
    }

    private void wh() {
        if (this.vh && lu.pcc() != null) {
            pcc(true);
        }
        if (this.vy) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.wh.await(rnn.wh() ? 4 : 8, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            lo.pcc("SdkSettings.Prop", "awaitLoadedLocked: ", e);
        }
    }

    public boolean gm() {
        return this.vy;
    }

    public void oo() {
        File qf = qf();
        if (qf == null || !qf.exists()) {
            return;
        }
        qf.delete();
    }

    public abstract String pcc();

    /* JADX WARN: Removed duplicated region for block: B:51:0x009a A[Catch: all -> 0x000b, TryCatch #3 {all -> 0x000b, blocks: (B:4:0x0003, B:7:0x0009, B:10:0x000e, B:12:0x0015, B:14:0x001e, B:16:0x0024, B:25:0x0054, B:26:0x006b, B:27:0x0058, B:40:0x0068, B:44:0x0084, B:45:0x0087, B:46:0x008c, B:32:0x007e, B:49:0x008f, B:51:0x009a, B:53:0x009e, B:54:0x00a1, B:56:0x008d, B:38:0x005f, B:35:0x0075), top: B:3:0x0003, inners: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(boolean z) {
        boolean z2;
        pcc pccVar;
        synchronized (this.oo) {
            try {
                if (!this.vy || z) {
                    if (lu.pcc() != null) {
                        this.vh = false;
                        File qf = qf();
                        if (qf != null && qf.exists()) {
                            Properties properties = new Properties();
                            FileInputStream fileInputStream = null;
                            try {
                                try {
                                    FileInputStream fileInputStream2 = new FileInputStream(qf);
                                    try {
                                        properties.load(fileInputStream2);
                                        properties.size();
                                        new StringBuilder("items from ").append(qf.getAbsolutePath());
                                        if (!properties.isEmpty()) {
                                            this.kj = properties;
                                            this.gm.clear();
                                        }
                                        hc.pcc(fileInputStream2);
                                    } catch (OutOfMemoryError unused) {
                                        fileInputStream = fileInputStream2;
                                        try {
                                            com.bytedance.sdk.component.utils.qf.gm(qf);
                                        } catch (Throwable th) {
                                            lo.pcc("SdkSettings.Prop", "delete: ", th);
                                        }
                                        if (fileInputStream != null) {
                                            hc.pcc(fileInputStream);
                                        }
                                        this.oo.notifyAll();
                                        z2 = this.vy;
                                        this.wh.countDown();
                                        this.vy = true;
                                        if (!z2) {
                                            pccVar.pcc();
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileInputStream = fileInputStream2;
                                        lo.pcc("SdkSettings.Prop", "reload: ", th);
                                        if (fileInputStream != null) {
                                            hc.pcc(fileInputStream);
                                        }
                                        this.oo.notifyAll();
                                        z2 = this.vy;
                                        this.wh.countDown();
                                        this.vy = true;
                                        if (!z2) {
                                        }
                                    }
                                } catch (Throwable th3) {
                                    if (fileInputStream != null) {
                                        hc.pcc(fileInputStream);
                                    }
                                    this.oo.notifyAll();
                                    throw th3;
                                }
                            } catch (OutOfMemoryError unused2) {
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            this.oo.notifyAll();
                        }
                    } else {
                        this.vh = true;
                    }
                    z2 = this.vy;
                    this.wh.countDown();
                    this.vy = true;
                    if (!z2 && (pccVar = this.ork) != null) {
                        pccVar.pcc();
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public vj.pcc sf() {
        return new sf();
    }

    public void vj() {
        pcc pccVar = this.ork;
        if (pccVar != null) {
            pccVar.sf();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class sf implements vj.pcc {
        private final Map<String, Object> sf = new HashMap();
        private final Object gm = new Object();

        public sf() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.vj.pcc
        public void pcc() {
            Object obj;
            Properties properties = new Properties();
            synchronized (this.gm) {
                try {
                    properties.putAll(ork.this.kj);
                    boolean z = false;
                    for (Map.Entry<String, Object> entry : this.sf.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != this && value != null) {
                            if (properties.containsKey(key) && (obj = properties.get(key)) != null && obj.equals(value)) {
                            }
                            properties.put(key, String.valueOf(value));
                            z = true;
                        }
                        if (properties.containsKey(key)) {
                            properties.remove(key);
                            z = true;
                        }
                    }
                    this.sf.clear();
                    if (z) {
                        ork.this.pcc(properties);
                        ork.this.kj = properties;
                        ork.this.gm.clear();
                        ork.this.vh = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.vj.pcc
        public vj.pcc pcc(String str, String str2) {
            synchronized (this.gm) {
                this.sf.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.vj.pcc
        public vj.pcc pcc(String str, int i) {
            synchronized (this.gm) {
                this.sf.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.vj.pcc
        public vj.pcc pcc(String str, long j) {
            synchronized (this.gm) {
                this.sf.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.vj.pcc
        public vj.pcc pcc(String str) {
            synchronized (this.gm) {
                this.sf.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.vj.pcc
        public vj.pcc pcc(String str, float f) {
            synchronized (this.gm) {
                this.sf.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.vj.pcc
        public vj.pcc pcc(String str, boolean z) {
            synchronized (this.gm) {
                this.sf.put(str, Boolean.valueOf(z));
            }
            return this;
        }
    }

    public String pcc(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        wh();
        return this.kj.getProperty(str, str2);
    }

    public int pcc(String str, int i) {
        if (str != null && !str.isEmpty()) {
            wh();
            try {
                return Integer.parseInt(this.kj.getProperty(str, String.valueOf(i)));
            } catch (NumberFormatException e) {
                lo.pcc("SdkSettings.Prop", "", e);
            }
        }
        return i;
    }

    public long pcc(String str, long j) {
        if (str != null && !str.isEmpty()) {
            wh();
            try {
                return Long.parseLong(this.kj.getProperty(str, String.valueOf(j)));
            } catch (NumberFormatException e) {
                lo.pcc("SdkSettings.Prop", "", e);
            }
        }
        return j;
    }

    public float pcc(String str, float f) {
        if (str != null && !str.isEmpty()) {
            wh();
            try {
                return Float.parseFloat(this.kj.getProperty(str, String.valueOf(f)));
            } catch (NumberFormatException e) {
                lo.pcc("SdkSettings.Prop", "", e);
            }
        }
        return f;
    }

    public boolean pcc(String str, boolean z) {
        if (str != null && !str.isEmpty()) {
            wh();
            try {
                return Boolean.parseBoolean(this.kj.getProperty(str, String.valueOf(z)));
            } catch (Exception e) {
                lo.pcc("SdkSettings.Prop", "", e);
            }
        }
        return z;
    }

    public <T> T pcc(String str, T t, vj.sf<T> sfVar) {
        T sf2;
        if (str != null && !str.isEmpty()) {
            T t2 = (T) this.gm.get(str);
            if (t2 != null) {
                return t2;
            }
            wh();
            String property = this.kj.getProperty(str, null);
            if (property != null && sfVar != null && (sf2 = sfVar.sf(property)) != null) {
                this.gm.put(str, sf2);
                return sf2;
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(Properties properties) {
        FileOutputStream fileOutputStream;
        synchronized (this.vj) {
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(qf());
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                properties.store(fileOutputStream, (String) null);
                hc.pcc(fileOutputStream);
            } catch (Exception e2) {
                e = e2;
                fileOutputStream2 = fileOutputStream;
                lo.pcc("SdkSettings.Prop", "saveToLocal: ", e);
                if (fileOutputStream2 != null) {
                    hc.pcc(fileOutputStream2);
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    hc.pcc(fileOutputStream2);
                }
                throw th;
            }
        }
    }
}
