package com.bytedance.adsdk.sf.pcc.pcc;

import android.graphics.Path;
import com.bytedance.adsdk.sf.gm.sf.vy;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class tmg implements hc, ork {
    private final String oo;
    private final com.bytedance.adsdk.sf.gm.sf.vy wh;
    private final Path pcc = new Path();
    private final Path sf = new Path();
    private final Path gm = new Path();
    private final List<hc> vj = new ArrayList();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.adsdk.sf.pcc.pcc.tmg$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pcc;

        static {
            int[] iArr = new int[vy.pcc.values().length];
            pcc = iArr;
            try {
                iArr[vy.pcc.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pcc[vy.pcc.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pcc[vy.pcc.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                pcc[vy.pcc.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                pcc[vy.pcc.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public tmg(com.bytedance.adsdk.sf.gm.sf.vy vyVar) {
        this.oo = vyVar.pcc();
        this.wh = vyVar;
    }

    private void pcc(Path.Op op) {
        List<hc> list;
        this.sf.reset();
        this.pcc.reset();
        int size = this.vj.size();
        while (true) {
            size--;
            list = this.vj;
            if (size <= 0) {
                break;
            }
            hc hcVar = list.get(size);
            if (hcVar instanceof oo) {
                oo ooVar = (oo) hcVar;
                List<hc> sf = ooVar.sf();
                for (int size2 = sf.size() - 1; size2 >= 0; size2--) {
                    Path oo = sf.get(size2).oo();
                    oo.transform(ooVar.gm());
                    this.sf.addPath(oo);
                }
            } else {
                this.sf.addPath(hcVar.oo());
            }
        }
        hc hcVar2 = list.get(0);
        if (hcVar2 instanceof oo) {
            oo ooVar2 = (oo) hcVar2;
            List<hc> sf2 = ooVar2.sf();
            for (int i = 0; i < sf2.size(); i++) {
                Path oo2 = sf2.get(i).oo();
                oo2.transform(ooVar2.gm());
                this.pcc.addPath(oo2);
            }
        } else {
            this.pcc.set(hcVar2.oo());
        }
        this.gm.op(this.pcc, this.sf, op);
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.hc
    public Path oo() {
        this.gm.reset();
        if (this.wh.gm()) {
            return this.gm;
        }
        int i = AnonymousClass1.pcc[this.wh.sf().ordinal()];
        if (i == 1) {
            pcc();
        } else if (i == 2) {
            pcc(Path.Op.UNION);
        } else if (i == 3) {
            pcc(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            pcc(Path.Op.INTERSECT);
        } else if (i == 5) {
            pcc(Path.Op.XOR);
        }
        return this.gm;
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.gm
    public void pcc(List<gm> list, List<gm> list2) {
        for (int i = 0; i < this.vj.size(); i++) {
            this.vj.get(i).pcc(list, list2);
        }
    }

    private void pcc() {
        for (int i = 0; i < this.vj.size(); i++) {
            this.gm.addPath(this.vj.get(i).oo());
        }
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.ork
    public void pcc(ListIterator<gm> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            gm previous = listIterator.previous();
            if (previous instanceof hc) {
                this.vj.add((hc) previous);
                listIterator.remove();
            }
        }
    }
}
