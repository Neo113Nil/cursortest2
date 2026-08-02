package defpackage;

import android.widget.RemoteViews;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ixf {
    public static final ixf e = new ixf(new long[0], new RemoteViews[0], false, 1);
    public final long[] a;
    public final RemoteViews[] b;
    public final boolean c;
    public final int d;

    public ixf(long[] jArr, RemoteViews[] remoteViewsArr, boolean z, int i) {
        this.a = jArr;
        this.b = remoteViewsArr;
        this.c = z;
        this.d = i;
        if (jArr.length != remoteViewsArr.length) {
            a70.p("RemoteCollectionItems has different number of ids and views");
            throw null;
        }
        if (i < 1) {
            a70.p("View type count must be >= 1");
            throw null;
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = CollectionsKt.S0(CollectionsKt.V0(arrayList)).size();
        if (size <= this.d) {
            return;
        }
        ogj.h(me4.i(new StringBuilder("View type count is set to "), this.d, ", but the collection contains ", size, " different layout ids"));
        throw null;
    }
}
