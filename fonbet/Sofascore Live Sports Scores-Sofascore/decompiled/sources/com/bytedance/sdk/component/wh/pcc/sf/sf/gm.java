package com.bytedance.sdk.component.wh.pcc.sf.sf;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.sdk.component.wh.pcc.pcc.oo;
import com.bytedance.sdk.component.wh.pcc.qf;
import com.bytedance.sdk.component.wh.pcc.vj;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends HandlerThread implements Handler.Callback {
    private static int gpj = 200;
    private static int nac = 10;
    private final AtomicInteger dax;
    private final int fum;
    private final List<com.bytedance.sdk.component.wh.pcc.oo.pcc> gbb;
    private final Object gm;
    private volatile Handler hc;
    private final AtomicInteger jr;
    private volatile long kj;
    private final int lo;
    private long lu;
    private com.bytedance.sdk.component.wh.pcc.sf.gm oo;
    private final long ork;
    protected oo pcc;
    private volatile long qf;
    private volatile boolean sf;
    private final AtomicInteger tmg;
    private final int tz;
    private final long vh;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.wh.pcc.oo.pcc> vj;
    private final AtomicInteger vy;
    private volatile int wh;

    public gm(PriorityBlockingQueue<com.bytedance.sdk.component.wh.pcc.oo.pcc> priorityBlockingQueue) {
        super("csj_log");
        this.sf = true;
        this.gm = new Object();
        this.qf = 0L;
        this.kj = 0L;
        this.vy = new AtomicInteger(0);
        this.ork = 5000L;
        this.vh = 5000000000L;
        this.tmg = new AtomicInteger(0);
        this.gbb = new ArrayList();
        this.jr = new AtomicInteger(0);
        this.dax = new AtomicInteger(0);
        this.lu = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        this.lo = 1;
        this.fum = 2;
        this.tz = 3;
        this.vj = priorityBlockingQueue;
        this.pcc = new com.bytedance.sdk.component.wh.pcc.pcc.sf();
        if (com.bytedance.sdk.component.wh.pcc.sf.sf()) {
            return;
        }
        long tmg = qf.wh().jr().tmg();
        if (tmg > 0) {
            this.lu = tmg;
        }
    }

    private boolean kj() {
        if (com.bytedance.sdk.component.wh.pcc.sf.oo.pcc.sf) {
            return this.wh == 4 || this.wh == 7 || this.wh == 6 || this.wh == 5 || this.wh == 2;
        }
        return false;
    }

    private boolean oo(int i) {
        if (i < 4 || this.tmg.get() != 0) {
            return false;
        }
        com.bytedance.sdk.component.wh.pcc.sf.oo ooVar = com.bytedance.sdk.component.wh.pcc.sf.oo.pcc;
        return (ooVar.sf || ooVar.gm) ? false : true;
    }

    private void ork() {
        long nanoTime;
        com.bytedance.sdk.component.wh.pcc.sf.oo ooVar;
        if (this.hc.hasMessages(11)) {
            vy();
        } else {
            vj(1);
        }
        com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc pccVar = com.bytedance.sdk.component.wh.pcc.sf.oo.oo;
        com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(pccVar.sf(), 1);
        if (this.wh == 2) {
            com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(pccVar.qf(), 1);
            synchronized (this.gm) {
                try {
                    try {
                        long nanoTime2 = System.nanoTime();
                        this.gm.wait(5000L);
                        nanoTime = System.nanoTime() - nanoTime2;
                        ooVar = com.bytedance.sdk.component.wh.pcc.sf.oo.pcc;
                        if (!ooVar.sf) {
                            boolean z = ooVar.gm;
                        }
                    } catch (InterruptedException e) {
                        e.getMessage();
                    }
                    if (nanoTime < 5000000000L && 5000000000L - nanoTime >= 50000000) {
                        if (!ooVar.sf && !ooVar.gm) {
                            com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(pccVar.rnn(), 1);
                            gm(2);
                            return;
                        }
                        com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(pccVar.vh(), 1);
                        return;
                    }
                    com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(pccVar.ork(), 1);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:8:0x0005, B:11:0x000b, B:21:0x00e4, B:23:0x00e8, B:24:0x00ed, B:27:0x0030, B:29:0x003e, B:31:0x0043, B:33:0x0050, B:35:0x0052, B:37:0x0060, B:38:0x0065, B:39:0x006a, B:41:0x0070, B:43:0x0074, B:45:0x0080, B:46:0x0085, B:48:0x008d, B:49:0x0092, B:50:0x00af, B:52:0x00bd, B:54:0x00bf, B:56:0x00cc, B:58:0x00ce, B:60:0x00dc, B:61:0x00e1, B:4:0x00f4), top: B:7:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pcc(int i, List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list, long j) {
        synchronized (this.gm) {
            if (list != null) {
                try {
                    if (this.hc != null) {
                        com.bytedance.sdk.component.wh.pcc.gm.pcc.pcc(i, list, j);
                        this.pcc.pcc(i, list);
                        qf.wh().jr();
                        if (i != -2) {
                            if (i != -1) {
                                if (i != 0) {
                                    if (i != 200) {
                                        if (i == 509) {
                                            com.bytedance.sdk.component.wh.pcc.sf.oo ooVar = com.bytedance.sdk.component.wh.pcc.sf.oo.pcc;
                                            ooVar.sf = true;
                                            ooVar.gm = false;
                                            if (this.hc.hasMessages(2)) {
                                                return;
                                            }
                                            if (System.currentTimeMillis() - this.qf < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                                                return;
                                            }
                                            this.qf = System.currentTimeMillis();
                                            if (this.hc.hasMessages(3)) {
                                                this.hc.removeMessages(3);
                                            }
                                            pcc(2, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
                                        }
                                        if (this.wh == 2) {
                                            this.gm.notify();
                                        }
                                        this.vj.size();
                                    }
                                }
                            }
                            com.bytedance.sdk.component.wh.pcc.sf.oo ooVar2 = com.bytedance.sdk.component.wh.pcc.sf.oo.pcc;
                            if (ooVar2.sf || ooVar2.gm) {
                                ooVar2.sf = false;
                                ooVar2.gm = false;
                                if (this.hc.hasMessages(2)) {
                                    this.hc.removeMessages(2);
                                }
                                if (this.hc.hasMessages(3)) {
                                    this.hc.removeMessages(3);
                                }
                                this.kj = 0L;
                                this.qf = 0L;
                                this.jr.set(0);
                                this.dax.set(0);
                                com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.kun(), 1);
                                gm(2);
                            }
                            if (this.wh == 2) {
                            }
                            this.vj.size();
                        }
                        com.bytedance.sdk.component.wh.pcc.sf.oo ooVar3 = com.bytedance.sdk.component.wh.pcc.sf.oo.pcc;
                        ooVar3.sf = false;
                        ooVar3.gm = true;
                        if (this.hc.hasMessages(3)) {
                            return;
                        }
                        if (System.currentTimeMillis() - this.kj < 15000) {
                            return;
                        }
                        this.kj = System.currentTimeMillis();
                        if (this.hc.hasMessages(2)) {
                            this.hc.removeMessages(2);
                        }
                        pcc(3, 15000L);
                        if (this.wh == 2) {
                        }
                        this.vj.size();
                    }
                } finally {
                }
            }
        }
    }

    private void qf() {
        if (this.vj.size() >= 100) {
            for (int i = 0; i < 100; i++) {
                com.bytedance.sdk.component.wh.pcc.oo.pcc poll = this.vj.poll();
                if (!(poll instanceof com.bytedance.sdk.component.wh.pcc.oo.sf) && poll != null) {
                    pcc(poll);
                }
            }
        }
    }

    private void sf(List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list, final boolean z, final long j) {
        this.tmg.incrementAndGet();
        com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.ew(), 1);
        try {
            HashMap hashMap = new HashMap();
            Iterator<com.bytedance.sdk.component.wh.pcc.oo.pcc> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.wh.pcc.oo.pcc next = it.next();
                int vy = next == null ? 0 : next.vy();
                if (hashMap.get(Integer.valueOf(vy)) == null) {
                    hashMap.put(Integer.valueOf(vy), new ArrayList());
                }
                ((List) hashMap.get(Integer.valueOf(vy))).add(next);
            }
            for (Integer num : hashMap.keySet()) {
                if (num.intValue() != 0 && qf.wh().sf() != null && qf.wh().sf().get(num) != null) {
                    qf.wh().sf().get(num).pcc(list, new com.bytedance.sdk.component.wh.pcc.sf.sf() { // from class: com.bytedance.sdk.component.wh.pcc.sf.sf.gm.3
                        @Override // com.bytedance.sdk.component.wh.pcc.sf.sf
                        public void pcc(List<pcc> list2) {
                            try {
                                gm.this.tmg.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i = 0; i < size; i++) {
                                    pcc pccVar = list2.get(i);
                                    if (pccVar != null) {
                                        gm.this.pcc(z, pccVar.pcc(), pccVar.sf(), j);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
                this.oo.pcc(list, new com.bytedance.sdk.component.wh.pcc.sf.sf() { // from class: com.bytedance.sdk.component.wh.pcc.sf.sf.gm.2
                    @Override // com.bytedance.sdk.component.wh.pcc.sf.sf
                    public void pcc(List<pcc> list2) {
                        try {
                            gm.this.tmg.decrementAndGet();
                            if (list2 == null || list2.size() == 0) {
                                return;
                            }
                            int size = list2.size();
                            for (int i = 0; i < size; i++) {
                                pcc pccVar = list2.get(i);
                                if (pccVar != null) {
                                    gm.this.pcc(z, pccVar.pcc(), pccVar.sf(), j);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.getMessage();
            com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.tsx(), 1);
            this.tmg.decrementAndGet();
        }
    }

    private void vj() {
        while (pcc()) {
            try {
                com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc pccVar = com.bytedance.sdk.component.wh.pcc.sf.oo.oo;
                com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(pccVar.kj(), 1);
                com.bytedance.sdk.component.wh.pcc.oo.pcc poll = this.vj.poll(this.lu, TimeUnit.MILLISECONDS);
                int size = this.vj.size();
                if (poll instanceof com.bytedance.sdk.component.wh.pcc.oo.sf) {
                    pcc(poll, size);
                } else if (poll == null) {
                    int incrementAndGet = this.vy.incrementAndGet();
                    com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(pccVar.iv(), 1);
                    if (oo(incrementAndGet)) {
                        wh();
                        return;
                    } else if (incrementAndGet < 4) {
                        this.wh = 1;
                        sf((com.bytedance.sdk.component.wh.pcc.oo.pcc) null);
                    }
                } else {
                    pcc(poll);
                    sf(poll);
                }
            } catch (Throwable th) {
                th.getMessage();
                com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.tsx(), 1);
            }
        }
    }

    private void vy() {
        try {
            if (this.vj.size() == 0 && this.hc.hasMessages(11) && pcc()) {
                pcc(false);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void wh() {
        com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.tz(), 1);
        pcc(false);
        com.bytedance.sdk.component.wh.pcc.sf.oo.pcc.gm();
    }

    public void gm(int i) {
        try {
            boolean pcc = pcc(i, com.bytedance.sdk.component.wh.pcc.sf.oo.pcc.sf);
            if (i != 6 && !pcc) {
                return;
            }
            com.bytedance.sdk.component.wh.pcc.oo.sf sfVar = new com.bytedance.sdk.component.wh.pcc.oo.sf();
            sfVar.pcc(i);
            this.vj.add(sfVar);
            vj(3);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        try {
        } catch (Throwable th) {
            th.getMessage();
        }
        if (i == 1) {
            com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.vy(), 1);
            sf();
            pcc(true);
            vj();
        } else {
            if (i != 2 && i != 3) {
                if (i == 11) {
                    ArrayList arrayList = new ArrayList(this.gbb);
                    this.gbb.clear();
                    pcc((List<com.bytedance.sdk.component.wh.pcc.oo.pcc>) arrayList, false, "timeout_dispatch");
                    ork();
                }
                return true;
            }
            gm();
        }
        return true;
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        super.onLooperPrepared();
        this.hc = new Handler(getLooper(), this);
        com.bytedance.sdk.component.wh.pcc.sf.oo.pcc.pcc(this.hc);
        this.hc.sendEmptyMessage(1);
    }

    private void oo() {
        if (!isAlive()) {
            com.bytedance.sdk.component.wh.pcc.sf.oo.pcc.oo();
        } else {
            if (pcc()) {
                return;
            }
            gm(6);
        }
    }

    private void gm() {
        oo();
        com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.nn(), 1);
        gm(1);
    }

    private void vj(int i) {
        if (!pcc()) {
            if (this.hc == null) {
                return;
            }
            com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc pccVar = com.bytedance.sdk.component.wh.pcc.sf.oo.oo;
            com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(pccVar.gm(), 1);
            if (this.hc.hasMessages(1)) {
                return;
            }
            if (i == 1) {
                com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(pccVar.wh(), 1);
            } else if (i == 2) {
                com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(pccVar.oo(), 1);
            } else if (i == 3) {
                com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(pccVar.vj(), 1);
            }
            this.hc.sendEmptyMessage(1);
            return;
        }
        com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.pcc(), 1);
    }

    public static void sf(int i) {
        gpj = i;
    }

    private void sf() {
        long dax = qf.wh().dax();
        if (dax <= 0) {
            return;
        }
        this.pcc.pcc(Integer.MAX_VALUE, dax);
    }

    private void sf(com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar) {
        if (com.bytedance.sdk.component.wh.pcc.gm.pcc.sf() && qf.wh().pcc()) {
            return;
        }
        int i = 0;
        if (kj()) {
            com.bytedance.sdk.component.wh.pcc.gm.pcc.pcc(this.wh);
            com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.tmg(), 1);
            if (this.vj.size() != 0) {
                return;
            }
            if (!this.hc.hasMessages(2)) {
                com.bytedance.sdk.component.wh.pcc.sf.oo.pcc.sf = false;
                this.kj = 0L;
                this.qf = 0L;
                this.jr.set(0);
                this.dax.set(0);
            } else {
                pcc(false);
                return;
            }
        }
        do {
            boolean pcc = pcc(this.wh, com.bytedance.sdk.component.wh.pcc.sf.oo.pcc.sf);
            com.bytedance.sdk.component.wh.pcc.gm.pcc.pcc(pcc, this.wh, pccVar);
            com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.hc(), 1);
            if (pcc) {
                List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc2 = this.pcc.pcc(this.wh, -1, null);
                if (pcc2 != null) {
                    pcc2.size();
                    pcc(pcc2);
                } else {
                    vy();
                }
            } else {
                vy();
            }
            i++;
            if (!pcc) {
                return;
            }
        } while (i <= 6);
    }

    private void sf(List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list) {
        this.gbb.addAll(list);
        this.gbb.size();
        vj jr = qf.wh().jr();
        if (jr != null && jr.vh() != null) {
            nac = jr.vh().sf();
        }
        if (this.gbb.size() >= nac) {
            if (this.hc.hasMessages(11)) {
                this.hc.removeMessages(11);
            }
            ArrayList arrayList = new ArrayList(this.gbb);
            this.gbb.clear();
            pcc((List<com.bytedance.sdk.component.wh.pcc.oo.pcc>) arrayList, false, "max_size_dispatch");
            ork();
            return;
        }
        if (this.vj.size() == 0) {
            pcc(false);
            if (this.hc.hasMessages(11)) {
                this.hc.removeMessages(11);
            }
            if (this.hc.hasMessages(1)) {
                this.hc.removeMessages(1);
            }
            long j = gpj;
            if (jr != null && jr.vh() != null) {
                j = jr.vh().pcc();
            }
            this.hc.sendEmptyMessageDelayed(11, j);
            return;
        }
        this.gbb.size();
    }

    public static void pcc(int i) {
        nac = i;
    }

    public void pcc(boolean z) {
        this.sf = z;
    }

    public boolean pcc() {
        return this.sf;
    }

    public boolean pcc(int i, boolean z) {
        vj jr = qf.wh().jr();
        if (jr == null || !jr.pcc(qf.wh().vj())) {
            return false;
        }
        return this.pcc.pcc(i, z);
    }

    public void pcc(com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar, boolean z) {
        if (pccVar == null) {
            return;
        }
        pccVar.oo();
        if (z) {
            if (this.hc != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(pccVar);
                pcc((List<com.bytedance.sdk.component.wh.pcc.oo.pcc>) arrayList, true, "ignore_result_dispatch");
                return;
            }
            return;
        }
        this.vj.add(pccVar);
        vj(2);
    }

    private void pcc(com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar, int i) {
        this.vy.set(0);
        if (i == 0) {
            this.wh = ((com.bytedance.sdk.component.wh.pcc.oo.sf) pccVar).ork();
            if (this.wh != 6) {
                com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.lrr(), 1);
                sf(pccVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.component.wh.pcc.oo.sf sfVar = (com.bytedance.sdk.component.wh.pcc.oo.sf) pccVar;
        if (sfVar.ork() == 1) {
            this.wh = 1;
            sf(pccVar);
        } else if (sfVar.ork() == 2) {
            qf();
            this.wh = 2;
            sf(pccVar);
        }
    }

    private void pcc(com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar) {
        this.vy.set(0);
        com.bytedance.sdk.component.wh.pcc.sf.oo ooVar = com.bytedance.sdk.component.wh.pcc.sf.oo.pcc;
        if (ooVar.sf) {
            this.wh = 5;
        } else if (ooVar.gm) {
            this.wh = 7;
        } else {
            this.wh = 4;
        }
        com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.gd(), 1);
        this.pcc.pcc(pccVar, this.wh);
        com.bytedance.sdk.component.wh.pcc.gm.pcc.qf(pccVar);
    }

    private void pcc(List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list, String str) {
        pcc(str);
        pcc(list, false, str);
        ork();
    }

    private void pcc(List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list) {
        if (list.size() != 0) {
            com.bytedance.sdk.component.wh.pcc.gm.pcc.pcc(list, this.vj.size());
            if (list.size() <= 1 && !com.bytedance.sdk.component.wh.pcc.gm.pcc.gm()) {
                com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar = list.get(0);
                if (pccVar != null) {
                    if (pccVar.vj() == 1) {
                        pcc(list, "highPriority");
                        return;
                    }
                    if (pccVar.oo() == 0 && pccVar.vj() == 2) {
                        if (pccVar.sf() == 3) {
                            pcc(list, "version_v3");
                            return;
                        } else {
                            sf(list);
                            return;
                        }
                    }
                    if (pccVar.oo() == 1) {
                        pcc(list, "stats");
                        return;
                    } else if (pccVar.oo() == 3) {
                        pcc(list, "adType_v3");
                        return;
                    } else {
                        if (pccVar.oo() == 2) {
                            pcc(list, "other");
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            pcc(list, "batchRead");
            return;
        }
        vy();
    }

    private void pcc(String str) {
        if (this.hc.hasMessages(11)) {
            this.hc.removeMessages(11);
        }
        if (this.gbb.size() != 0) {
            ArrayList arrayList = new ArrayList(this.gbb);
            this.gbb.clear();
            pcc((List<com.bytedance.sdk.component.wh.pcc.oo.pcc>) arrayList, false, "before_".concat(String.valueOf(str)));
            ork();
            arrayList.size();
        }
    }

    private void pcc(List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list, boolean z, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.component.wh.pcc.gm.pcc.pcc(list, this.wh, str);
        com.bytedance.sdk.component.wh.pcc.sf.gm qf = qf.wh().qf();
        this.oo = qf;
        if (qf != null) {
            sf(list, z, currentTimeMillis);
        } else {
            pcc(list, z, currentTimeMillis);
        }
    }

    private void pcc(final List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list, final boolean z, final long j) {
        vj jr = qf.wh().jr();
        if (jr != null) {
            Executor vj = jr.vj();
            if (list.get(0).vj() == 1) {
                vj = jr.oo();
            }
            if (vj == null) {
                return;
            }
            this.tmg.incrementAndGet();
            vj.execute(new com.bytedance.sdk.component.wh.pcc.vj.vj("csj_log_upload") { // from class: com.bytedance.sdk.component.wh.pcc.sf.sf.gm.1
                @Override // java.lang.Runnable
                public void run() {
                    gm gmVar = gm.this;
                    gmVar.pcc((List<com.bytedance.sdk.component.wh.pcc.oo.pcc>) list, z, j, gmVar.wh);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list, boolean z, long j, int i) {
        gm gmVar;
        Throwable th;
        com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar;
        sf pcc;
        try {
            pccVar = list.get(0);
            com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.ew(), 1);
        } catch (Throwable th2) {
            th = th2;
            gmVar = this;
        }
        try {
            if (pccVar.oo() == 0) {
                pcc = qf.oo().pcc(list);
                pcc(pcc, list);
                if (pcc != null) {
                    com.bytedance.sdk.component.wh.pcc.gm.pcc.pcc(list, pcc.oo);
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<com.bytedance.sdk.component.wh.pcc.oo.pcc> it = list.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next().wh());
                    }
                    jSONObject.put("stats_list", jSONArray);
                } catch (Exception e) {
                    e.getMessage();
                }
                pcc = qf.oo().pcc(jSONObject);
            }
            sf sfVar = pcc;
            this.tmg.decrementAndGet();
            gmVar = this;
            try {
                gmVar.pcc(z, sfVar, list, j);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                th.getMessage();
                com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.tsx(), 1);
                gmVar.tmg.decrementAndGet();
            }
        } catch (Throwable th4) {
            th = th4;
            gmVar = this;
            th.getMessage();
            com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.tsx(), 1);
            gmVar.tmg.decrementAndGet();
        }
    }

    private void pcc(sf sfVar, List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list) {
        if (sfVar == null || !sfVar.pcc) {
            return;
        }
        List<Object> pcc = com.bytedance.sdk.component.wh.pcc.sf.pcc();
        if (list == null || pcc == null || pcc.size() == 0) {
            return;
        }
        for (com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar : list) {
            if (pccVar.vj() == 1) {
                com.bytedance.sdk.component.wh.pcc.gm.pcc.pcc(pccVar);
                com.bytedance.sdk.component.wh.pcc.gm.pcc.vj(pccVar);
                Iterator<Object> it = pcc.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(boolean z, sf sfVar, List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list, long j) {
        if (z || sfVar == null) {
            return;
        }
        int i = sfVar.sf;
        int i2 = -2;
        if (sfVar.vj) {
            i = -1;
        } else if (i < 0) {
            i = -2;
        }
        if (i == 510 || i == 511) {
            i = -2;
        }
        if (sfVar.pcc || ((i < 500 || i >= 509) && i <= 513 && i != 404)) {
            i2 = i;
        }
        if (list != null) {
            list.size();
            this.tmg.get();
        }
        pcc(i2, list, j);
    }

    public void pcc(int i, long j) {
        if (this.hc == null) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = i;
        if (i == 2) {
            this.hc.sendMessageDelayed(obtain, (((this.jr.incrementAndGet() - 1) % 4) + 1) * j);
        } else if (i == 3) {
            this.hc.sendMessageDelayed(obtain, (((this.dax.incrementAndGet() - 1) % 4) + 1) * j);
        }
    }
}
