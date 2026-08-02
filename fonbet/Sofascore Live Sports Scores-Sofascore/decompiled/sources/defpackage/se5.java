package defpackage;

import com.sofascore.model.newNetwork.ShotActionArea;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class se5 implements kli {
    public final /* synthetic */ int a;
    public final List b;

    public se5(List list) {
        List list2;
        this.a = 3;
        if (list != null) {
            list2 = new ArrayList(k13.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ShotActionArea shotActionArea = (ShotActionArea) it.next();
                list2.add(new ShotActionArea(shotActionArea.getArea(), shotActionArea.getP1(), shotActionArea.getP2(), shotActionArea.getP3(), shotActionArea.getP4(), shotActionArea.getP5(), shotActionArea.getAverage()));
            }
        } else {
            list2 = km5.a;
        }
        this.b = list2;
    }

    public ShotActionArea a(int i) {
        for (ShotActionArea shotActionArea : this.b) {
            if (shotActionArea.getArea() == i) {
                return shotActionArea;
            }
        }
        return null;
    }

    @Override // defpackage.kli
    public List getCues(long j) {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return j >= 0 ? this.b : Collections.EMPTY_LIST;
            default:
                return this.b;
        }
    }

    @Override // defpackage.kli
    public long getEventTime(int i) {
        switch (this.a) {
            case 1:
                qx9.r(i == 0);
                break;
        }
        return 0L;
    }

    @Override // defpackage.kli
    public int getEventTimeCount() {
        switch (this.a) {
        }
        return 1;
    }

    @Override // defpackage.kli
    public int getNextEventTimeIndex(long j) {
        switch (this.a) {
            case 1:
                if (j < 0) {
                }
                break;
        }
        return -1;
    }

    public /* synthetic */ se5(List list, int i) {
        this.a = i;
        this.b = list;
    }

    public se5(ArrayList arrayList) {
        this.a = 1;
        this.b = Collections.unmodifiableList(arrayList);
    }
}
