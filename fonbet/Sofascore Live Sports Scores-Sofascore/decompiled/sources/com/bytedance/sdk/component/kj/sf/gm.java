package com.bytedance.sdk.component.kj.sf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class gm implements Comparable<gm>, Runnable {
    public static final int EIGHTH_PRIORITY = 8;
    public static final int FIFTH_PRIORITY = 5;
    public static final int FOURTH_PRIORITY = 4;
    public static final int MAX_PRIORITY = 10;
    public static final int MIN_PRIORITY = 1;
    public static final int NINTH_PRIORITY = 9;
    public static final int SECOND_PRIORITY = 2;
    public static final int SEVENTH_PRIORITY = 7;
    public static final int SIXTH_PRIORITY = 6;
    public static final int THIRD_PRIORITY = 3;
    private Runnable gm;
    private long oo;
    private int pcc;
    private String sf;
    private long vj;
    private long wh;

    public gm(String str, Runnable runnable) {
        this.pcc = 5;
        this.sf = str;
        this.gm = runnable;
    }

    @Override // java.lang.Comparable
    public int compareTo(gm gmVar) {
        if (getPriority() < gmVar.getPriority()) {
            return 1;
        }
        return getPriority() >= gmVar.getPriority() ? -1 : 0;
    }

    public long getAfterTimestamp() {
        return this.wh;
    }

    public long getBeforeTimestamp() {
        return this.vj;
    }

    public String getName() {
        return this.sf;
    }

    public int getPriority() {
        return this.pcc;
    }

    public long getRunTime() {
        return this.wh - this.vj;
    }

    public long getSubmitTimestamp() {
        return this.oo;
    }

    public Runnable getTarget() {
        return this.gm;
    }

    public long getWaitTime() {
        return this.vj - this.oo;
    }

    public void setAfterTimestamp(long j) {
        this.wh = j;
    }

    public void setBeforeTimestamp(long j) {
        this.vj = j;
    }

    public void setPriority(int i) {
        this.pcc = i;
    }

    public void setSubmitTimestamp(long j) {
        this.oo = j;
    }

    public void setTarget(Runnable runnable) {
        this.gm = runnable;
    }

    public gm(String str, int i) {
        this.pcc = i;
        this.sf = str;
    }

    public gm(int i, String str, Runnable runnable) {
        this.pcc = i;
        this.sf = str;
        this.gm = runnable;
    }

    public gm(String str) {
        this.pcc = 5;
        this.sf = str;
    }
}
