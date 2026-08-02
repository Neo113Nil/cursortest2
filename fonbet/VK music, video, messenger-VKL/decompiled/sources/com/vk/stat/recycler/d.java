package com.vk.stat.recycler;

import android.os.SystemClock;
import com.vk.stat.recycler.Measurement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.jjf0;
import xsna.rl3;

/* compiled from: RecyclerViewProfiler.kt */
/* loaded from: classes5.dex */
public final class d {
    public final ArrayList a;
    public long b;

    public d(List<? extends jjf0> list) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.addAll(list);
    }

    public final void a() {
        this.b = SystemClock.elapsedRealtimeNanos();
    }

    public final void b(int i, Measurement.Type type, String str) {
        if (this.b > 0) {
            ArrayList arrayList = this.a;
            if (arrayList.isEmpty()) {
                return;
            }
            Measurement measurement = new Measurement(i, type, SystemClock.elapsedRealtimeNanos() - this.b, str, false);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((jjf0) it.next()).l(measurement);
            }
            this.b = 0L;
        }
    }

    public d(jjf0... jjf0VarArr) {
        this((List<? extends jjf0>) rl3.u0(jjf0VarArr));
    }
}
