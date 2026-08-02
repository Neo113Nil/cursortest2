package com.vk.clips.sdk.shared.feed.recycler.adapter;

import android.os.SystemClock;
import android.view.ViewGroup;
import com.vk.clips.sdk.shared.feed.recycler.adapter.ClipFeedAdapter;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.recycler.Measurement;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.hfz;
import xsna.i0q0;
import xsna.jjf0;
import xsna.l77;
import xsna.p1u0;
import xsna.vfz;

/* compiled from: ClipsMeasurableDelegate.kt */
/* loaded from: classes17.dex */
public final class a<T extends hfz> extends p1u0<T> {
    public final Class<?> a;
    public final List<jjf0> b;
    public final ClipFeedAdapter.ViewType c;
    public final l77 d;

    public a(Class cls, List list, ClipFeedAdapter.ViewType viewType, l77 l77Var) {
        this.a = cls;
        this.b = list;
        this.c = viewType;
        this.d = l77Var;
    }

    @Override // xsna.p1u0
    public final void a(vfz<T> vfzVar, T t, List<? extends Object> list) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        vfzVar.W5(t);
        d(elapsedRealtimeNanos, Measurement.Type.Bind);
    }

    @Override // xsna.p1u0
    public final vfz<? extends T> b(ViewGroup viewGroup) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        vfz<? extends T> vfzVar = (vfz) this.d.invoke(viewGroup);
        d(elapsedRealtimeNanos, Measurement.Type.Create);
        return vfzVar;
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return this.a.isAssignableFrom(hfzVar.getClass());
    }

    public final void d(long j, Measurement.Type type) {
        String str;
        if (j > 0) {
            List<jjf0> list = this.b;
            if (list.isEmpty()) {
                return;
            }
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - j;
            ClipFeedAdapter.ViewType viewType = this.c;
            int ordinal = viewType.ordinal();
            switch (b.$EnumSwitchMapping$0[viewType.ordinal()]) {
                case 1:
                    str = "type_clip";
                    break;
                case 2:
                    str = "type_clip_controls";
                    break;
                case 3:
                    str = "type_ad";
                    break;
                case 4:
                    str = "type_static_ad";
                    break;
                case 5:
                    str = "type_market_ad";
                    break;
                case 6:
                    str = "type_ad_controls";
                    break;
                case 7:
                    str = "type_music_template";
                    break;
                case 8:
                    str = "type_live";
                    break;
                case 9:
                    str = "type_block_external_nps";
                    break;
                case 10:
                    str = "type_pagination_loading";
                    break;
                case 11:
                    str = "type_pagination_error";
                    break;
                case 12:
                    str = "type_pagination_empty";
                    break;
                case 13:
                    str = "type_shops_grid_block";
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            String str2 = str;
            boolean z = false;
            if (type == Measurement.Type.Create && !i0q0.b()) {
                z = true;
            }
            Measurement measurement = new Measurement(ordinal, type, elapsedRealtimeNanos, str2, z);
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"ClipsMeasurableDelegate", "type = " + type + ", viewType = " + viewType + " : isWorkerThread = " + measurement.e});
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((jjf0) it.next()).l(measurement);
            }
        }
    }
}
