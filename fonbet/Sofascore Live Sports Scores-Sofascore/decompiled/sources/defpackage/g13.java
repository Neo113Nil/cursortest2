package defpackage;

import android.widget.RemoteViews;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g13 {
    public static final g13 a = new g13();

    public final void a(@NotNull RemoteViews remoteViews, int i, @NotNull ixf ixfVar) {
        remoteViews.setRemoteAdapter(i, b(ixfVar));
    }

    @NotNull
    public final RemoteViews.RemoteCollectionItems b(@NotNull ixf ixfVar) {
        RemoteViews.RemoteCollectionItems.Builder viewTypeCount = new RemoteViews.RemoteCollectionItems.Builder().setHasStableIds(ixfVar.c).setViewTypeCount(ixfVar.d);
        long[] jArr = ixfVar.a;
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            viewTypeCount.addItem(jArr[i], ixfVar.b[i]);
        }
        return viewTypeCount.build();
    }
}
