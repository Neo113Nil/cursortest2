package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.sofascore.results.feed.MediaShortsVideoDialog;
import com.sofascore.results.feed.compose.model.ShortVideoFeedCardModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ncc extends ouk {
    public int a;
    public final /* synthetic */ MediaShortsVideoDialog b;
    public final /* synthetic */ List c;

    public ncc(MediaShortsVideoDialog mediaShortsVideoDialog, List list) {
        this.b = mediaShortsVideoDialog;
        this.c = list;
    }

    @Override // defpackage.ouk
    public final void b(int i, float f, int i2) {
        RecyclerView c;
        u findViewHolderForAdapterPosition;
        snl snlVar;
        snl snlVar2;
        RecyclerView c2;
        u findViewHolderForAdapterPosition2;
        snl snlVar3;
        if (f >= 0.5d) {
            i++;
        }
        if (this.a != i) {
            MediaShortsVideoDialog mediaShortsVideoDialog = this.b;
            occ occVar = (occ) mediaShortsVideoDialog.s;
            if (occVar != null && (c2 = wrf.c(occVar.b)) != null && (findViewHolderForAdapterPosition2 = c2.findViewHolderForAdapterPosition(this.a)) != null) {
                pfh pfhVar = findViewHolderForAdapterPosition2 instanceof pfh ? (pfh) findViewHolderForAdapterPosition2 : null;
                if (pfhVar != null && pfhVar.f) {
                    pfhVar.f = false;
                    fye fyeVar = pfhVar.d;
                    if (fyeVar != null && (snlVar3 = fyeVar.a) != null) {
                        ((xnl) snlVar3).c();
                    }
                }
            }
            this.a = i;
            occ occVar2 = (occ) mediaShortsVideoDialog.s;
            if (occVar2 == null || (c = wrf.c(occVar2.b)) == null || (findViewHolderForAdapterPosition = c.findViewHolderForAdapterPosition(this.a)) == null) {
                return;
            }
            pfh pfhVar2 = findViewHolderForAdapterPosition instanceof pfh ? (pfh) findViewHolderForAdapterPosition : null;
            if (pfhVar2 == null || pfhVar2.f) {
                return;
            }
            pfhVar2.f = true;
            bne bneVar = pfhVar2.e;
            bne bneVar2 = bne.e;
            fye fyeVar2 = pfhVar2.d;
            if (bneVar == bneVar2) {
                if (fyeVar2 == null || (snlVar2 = fyeVar2.a) == null) {
                    return;
                }
                xnl xnlVar = (xnl) snlVar2;
                xnlVar.b(xnlVar.a, "playVideo", new Object[0]);
                return;
            }
            if (fyeVar2 == null || (snlVar = fyeVar2.a) == null) {
                return;
            }
            String str = pfhVar2.g;
            xnl xnlVar2 = (xnl) snlVar;
            str.getClass();
            xnlVar2.b(xnlVar2.a, "loadVideo", str, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
    }

    @Override // defpackage.ouk
    public final void c(int i) {
        ShortVideoFeedCardModel shortVideoFeedCardModel;
        MediaShortsVideoDialog mediaShortsVideoDialog = this.b;
        if (mediaShortsVideoDialog.A) {
            long currentTimeMillis = System.currentTimeMillis() - mediaShortsVideoDialog.y;
            Context requireContext = mediaShortsVideoDialog.requireContext();
            requireContext.getClass();
            List list = this.c;
            nv.Z(requireContext, (list == null || (shortVideoFeedCardModel = (ShortVideoFeedCardModel) CollectionsKt.a0(mediaShortsVideoDialog.z, list)) == null) ? 0 : shortVideoFeedCardModel.g, currentTimeMillis, Integer.valueOf(mediaShortsVideoDialog.z), null);
            mediaShortsVideoDialog.y = System.currentTimeMillis();
        }
        mediaShortsVideoDialog.A = true;
        mediaShortsVideoDialog.z = i;
    }
}
