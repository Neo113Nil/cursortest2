package defpackage;

import android.net.Uri;
import com.blaze.blazesdk.features.moments.models.ui.MomentModel;
import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import com.blaze.blazesdk.shared.results.BlazeResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class w5m implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ w5m(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String encode = Uri.encode((String) entry.getValue());
                encode.getClass();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                cd9 cd9Var = (cd9) obj;
                Double d = jgm.b;
                cd9Var.getClass();
                break;
            case 5:
                String str = (String) obj;
                str.getClass();
                qom.b.getClass();
                List<VideoModel> l = qom.l(str);
                l.getClass();
                ArrayList arrayList = new ArrayList(k13.r(l, 10));
                for (VideoModel videoModel : l) {
                    videoModel.getClass();
                    arrayList.add(new y7m(videoModel.id, videoModel.k));
                }
                break;
            case 6:
                String str2 = (String) obj;
                str2.getClass();
                StoriesRepositoryImpl.a.getClass();
                List<StoryModel> o = StoriesRepositoryImpl.o(str2);
                o.getClass();
                ArrayList arrayList2 = new ArrayList(k13.r(o, 10));
                for (StoryModel storyModel : o) {
                    storyModel.getClass();
                    arrayList2.add(new y7m(storyModel.id, storyModel.c));
                }
                break;
            case 7:
                String str3 = (String) obj;
                str3.getClass();
                gum.b.getClass();
                List<MomentModel> q = gum.q(str3);
                q.getClass();
                ArrayList arrayList3 = new ArrayList(k13.r(q, 10));
                for (MomentModel momentModel : q) {
                    momentModel.getClass();
                    arrayList3.add(new y7m(momentModel.id, momentModel.k));
                }
                break;
            case 8:
                break;
            case 9:
                VideoModel videoModel2 = (VideoModel) obj;
                qom qomVar = qom.b;
                videoModel2.getClass();
                break;
            case 10:
                ((n4m) obj).getClass();
                break;
            case 11:
                dlm dlmVar = (dlm) obj;
                dlmVar.getClass();
                dlmVar.v();
                break;
            case 12:
                VideoModel videoModel3 = (VideoModel) obj;
                qom qomVar2 = qom.b;
                videoModel3.getClass();
                break;
            case 13:
                dlm dlmVar2 = (dlm) obj;
                dlmVar2.getClass();
                dlmVar2.v();
                break;
            case 14:
                dlm dlmVar3 = (dlm) obj;
                dlmVar3.getClass();
                wgm wgmVar = dlmVar3.b;
                wgmVar.C.setDuration(0L);
                wgmVar.C.setPosition(0L);
                break;
            case 15:
                dlm dlmVar4 = (dlm) obj;
                dlmVar4.getClass();
                wgm wgmVar2 = dlmVar4.b;
                wgmVar2.C.setDuration(0L);
                wgmVar2.C.setPosition(0L);
                break;
            case 16:
                dlm dlmVar5 = (dlm) obj;
                dlmVar5.getClass();
                xyl xylVar = dlmVar5.n;
                if (xylVar != null) {
                    xylVar.destroy();
                }
                dlmVar5.n = null;
                dlmVar5.b.b.removeAllViews();
                break;
            case 17:
                dlm dlmVar6 = (dlm) obj;
                dlmVar6.getClass();
                xyl xylVar2 = dlmVar6.n;
                if (xylVar2 != null) {
                    xylVar2.destroy();
                }
                dlmVar6.n = null;
                dlmVar6.b.b.removeAllViews();
                break;
            case 18:
                dlm dlmVar7 = (dlm) obj;
                dlmVar7.getClass();
                dlmVar7.n(new fqm(true, false));
                break;
            case 19:
                dlm dlmVar8 = (dlm) obj;
                dlmVar8.getClass();
                dlmVar8.n(new fqm(true, false));
                break;
            case 20:
                break;
            case 21:
                ((n4m) obj).getClass();
                break;
            case 22:
                efm efmVar = (efm) obj;
                efmVar.getClass();
                efmVar.t();
                break;
            case 23:
                efm efmVar2 = (efm) obj;
                efmVar2.getClass();
                efmVar2.t();
                break;
            case 24:
                efm efmVar3 = (efm) obj;
                efmVar3.getClass();
                efmVar3.a(0L, 0L);
                break;
            case 25:
                efm efmVar4 = (efm) obj;
                efmVar4.getClass();
                efmVar4.a(0L, 0L);
                break;
            case 26:
                efm efmVar5 = (efm) obj;
                efmVar5.getClass();
                xyl xylVar3 = efmVar5.i;
                if (xylVar3 != null) {
                    xylVar3.destroy();
                }
                efmVar5.i = null;
                efmVar5.b.e.removeAllViews();
                break;
            case 27:
                efm efmVar6 = (efm) obj;
                efmVar6.getClass();
                xyl xylVar4 = efmVar6.i;
                if (xylVar4 != null) {
                    xylVar4.destroy();
                }
                efmVar6.i = null;
                efmVar6.b.e.removeAllViews();
                break;
            case 28:
                rsm rsmVar = rsm.a;
                ((BlazeResult) obj).getClass();
                break;
            default:
                rsm rsmVar2 = rsm.a;
                ((BlazeResult) obj).getClass();
                break;
        }
        return Unit.a;
    }
}
