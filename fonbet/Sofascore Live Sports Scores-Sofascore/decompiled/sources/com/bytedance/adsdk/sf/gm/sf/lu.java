package com.bytedance.adsdk.sf.gm.sf;

import android.graphics.Paint;
import com.bytedance.adsdk.sf.pcc.pcc.lo;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lu implements gm {
    private final List<com.bytedance.adsdk.sf.gm.pcc.sf> gm;
    private final sf kj;
    private final com.bytedance.adsdk.sf.gm.pcc.pcc oo;
    private final boolean ork;
    private final String pcc;
    private final pcc qf;
    private final com.bytedance.adsdk.sf.gm.pcc.sf sf;
    private final com.bytedance.adsdk.sf.gm.pcc.oo vj;
    private final float vy;
    private final com.bytedance.adsdk.sf.gm.pcc.sf wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.adsdk.sf.gm.sf.lu$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pcc;
        static final /* synthetic */ int[] sf;

        static {
            int[] iArr = new int[sf.values().length];
            sf = iArr;
            try {
                iArr[sf.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                sf[sf.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                sf[sf.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[pcc.values().length];
            pcc = iArr2;
            try {
                iArr2[pcc.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                pcc[pcc.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                pcc[pcc.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum pcc {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap pcc() {
            int i = AnonymousClass1.pcc[ordinal()];
            return i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum sf {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join pcc() {
            int i = AnonymousClass1.sf[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public lu(String str, com.bytedance.adsdk.sf.gm.pcc.sf sfVar, List<com.bytedance.adsdk.sf.gm.pcc.sf> list, com.bytedance.adsdk.sf.gm.pcc.pcc pccVar, com.bytedance.adsdk.sf.gm.pcc.oo ooVar, com.bytedance.adsdk.sf.gm.pcc.sf sfVar2, pcc pccVar2, sf sfVar3, float f, boolean z) {
        this.pcc = str;
        this.sf = sfVar;
        this.gm = list;
        this.oo = pccVar;
        this.vj = ooVar;
        this.wh = sfVar2;
        this.qf = pccVar2;
        this.kj = sfVar3;
        this.vy = f;
        this.ork = z;
    }

    public com.bytedance.adsdk.sf.gm.pcc.oo gm() {
        return this.vj;
    }

    public sf kj() {
        return this.kj;
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf oo() {
        return this.wh;
    }

    public boolean ork() {
        return this.ork;
    }

    @Override // com.bytedance.adsdk.sf.gm.sf.gm
    public com.bytedance.adsdk.sf.pcc.pcc.gm pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar) {
        return new lo(vyVar, pccVar, this);
    }

    public pcc qf() {
        return this.qf;
    }

    public com.bytedance.adsdk.sf.gm.pcc.pcc sf() {
        return this.oo;
    }

    public List<com.bytedance.adsdk.sf.gm.pcc.sf> vj() {
        return this.gm;
    }

    public float vy() {
        return this.vy;
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf wh() {
        return this.sf;
    }

    public String pcc() {
        return this.pcc;
    }
}
