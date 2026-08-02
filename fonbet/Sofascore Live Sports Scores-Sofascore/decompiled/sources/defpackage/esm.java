package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.moments.models.ui.MomentModel;
import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.t0;
import com.blaze.blazesdk.shared.results.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class esm implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ BlazeDataSourceType d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ esm(String str, String str2, BlazeDataSourceType blazeDataSourceType, Function1 function1, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = blazeDataSourceType;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object d;
        Object d2;
        Object d3;
        int i = this.a;
        Function1 function1 = this.e;
        BlazeDataSourceType blazeDataSourceType = this.d;
        final BlazeResult blazeResult = (BlazeResult) obj;
        switch (i) {
            case 0:
                rsm rsmVar = rsm.a;
                blazeResult.getClass();
                if (!(blazeResult instanceof BlazeResult.Success)) {
                    if (!(blazeResult instanceof BlazeResult.Error)) {
                        zzl.b();
                        break;
                    } else {
                        j1m j1mVar = j1m.a;
                        t0 t0Var = new t0();
                        BlazeResult.Error error = (BlazeResult.Error) blazeResult;
                        t0Var.f = error.getCause();
                        t0Var.g = fn0.p("dataSource", blazeDataSourceType.getStringRepresentation$blazesdk_release());
                        t0Var.b(error.getMessage());
                        j1m.a(t0Var);
                        d = t0Var.d();
                    }
                } else {
                    BlazeResult.Success success = (BlazeResult.Success) blazeResult;
                    if (((List) success.getValue()).isEmpty()) {
                        d = new y0().d();
                    } else {
                        yda ydaVar = bmm.a;
                        String stringRepresentation$blazesdk_release = blazeDataSourceType.getStringRepresentation$blazesdk_release();
                        BlazePlayerType blazePlayerType = BlazePlayerType.MOMENTS;
                        Iterable iterable = (Iterable) success.getValue();
                        ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((MomentModel) it.next()).id);
                        }
                        final int i2 = 0;
                        bmm.d(this.b, this.c, stringRepresentation$blazesdk_release, blazePlayerType, arrayList, new Function1() { // from class: gsm
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                int i3 = i2;
                                BlazeResult blazeResult2 = blazeResult;
                                String str = (String) obj2;
                                switch (i3) {
                                    case 0:
                                        rsm rsmVar2 = rsm.a;
                                        str.getClass();
                                        List<MomentModel> list = (List) ((BlazeResult.Success) blazeResult2).getValue();
                                        list.getClass();
                                        ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
                                        for (MomentModel momentModel : list) {
                                            momentModel.getClass();
                                            arrayList2.add(new y7m(momentModel.id, momentModel.k));
                                        }
                                        return arrayList2;
                                    case 1:
                                        bxm bxmVar = bxm.a;
                                        str.getClass();
                                        List<StoryModel> list2 = (List) ((BlazeResult.Success) blazeResult2).getValue();
                                        list2.getClass();
                                        ArrayList arrayList3 = new ArrayList(k13.r(list2, 10));
                                        for (StoryModel storyModel : list2) {
                                            storyModel.getClass();
                                            arrayList3.add(new y7m(storyModel.id, storyModel.c));
                                        }
                                        return arrayList3;
                                    default:
                                        n0n n0nVar = n0n.a;
                                        str.getClass();
                                        List<VideoModel> list3 = (List) ((BlazeResult.Success) blazeResult2).getValue();
                                        list3.getClass();
                                        ArrayList arrayList4 = new ArrayList(k13.r(list3, 10));
                                        for (VideoModel videoModel : list3) {
                                            videoModel.getClass();
                                            arrayList4.add(new y7m(videoModel.id, videoModel.k));
                                        }
                                        return arrayList4;
                                }
                            }
                        });
                        d = new BlazeResult.Success(Unit.a);
                    }
                }
                function1.invoke(d);
                break;
            case 1:
                bxm bxmVar = bxm.a;
                blazeResult.getClass();
                if (!(blazeResult instanceof BlazeResult.Success)) {
                    if (!(blazeResult instanceof BlazeResult.Error)) {
                        zzl.b();
                        break;
                    } else {
                        j1m j1mVar2 = j1m.a;
                        t0 t0Var2 = new t0();
                        BlazeResult.Error error2 = (BlazeResult.Error) blazeResult;
                        t0Var2.f = error2.getCause();
                        t0Var2.g = fn0.p("dataSource", blazeDataSourceType.getStringRepresentation$blazesdk_release());
                        t0Var2.b(error2.getMessage());
                        j1m.a(t0Var2);
                        d2 = t0Var2.d();
                    }
                } else {
                    BlazeResult.Success success2 = (BlazeResult.Success) blazeResult;
                    if (((List) success2.getValue()).isEmpty()) {
                        d2 = new y0().d();
                    } else {
                        yda ydaVar2 = bmm.a;
                        String stringRepresentation$blazesdk_release2 = blazeDataSourceType.getStringRepresentation$blazesdk_release();
                        BlazePlayerType blazePlayerType2 = BlazePlayerType.STORIES;
                        Iterable iterable2 = (Iterable) success2.getValue();
                        ArrayList arrayList2 = new ArrayList(k13.r(iterable2, 10));
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((StoryModel) it2.next()).id);
                        }
                        final int i3 = 1;
                        bmm.d(this.b, this.c, stringRepresentation$blazesdk_release2, blazePlayerType2, arrayList2, new Function1() { // from class: gsm
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                int i32 = i3;
                                BlazeResult blazeResult2 = blazeResult;
                                String str = (String) obj2;
                                switch (i32) {
                                    case 0:
                                        rsm rsmVar2 = rsm.a;
                                        str.getClass();
                                        List<MomentModel> list = (List) ((BlazeResult.Success) blazeResult2).getValue();
                                        list.getClass();
                                        ArrayList arrayList22 = new ArrayList(k13.r(list, 10));
                                        for (MomentModel momentModel : list) {
                                            momentModel.getClass();
                                            arrayList22.add(new y7m(momentModel.id, momentModel.k));
                                        }
                                        return arrayList22;
                                    case 1:
                                        bxm bxmVar2 = bxm.a;
                                        str.getClass();
                                        List<StoryModel> list2 = (List) ((BlazeResult.Success) blazeResult2).getValue();
                                        list2.getClass();
                                        ArrayList arrayList3 = new ArrayList(k13.r(list2, 10));
                                        for (StoryModel storyModel : list2) {
                                            storyModel.getClass();
                                            arrayList3.add(new y7m(storyModel.id, storyModel.c));
                                        }
                                        return arrayList3;
                                    default:
                                        n0n n0nVar = n0n.a;
                                        str.getClass();
                                        List<VideoModel> list3 = (List) ((BlazeResult.Success) blazeResult2).getValue();
                                        list3.getClass();
                                        ArrayList arrayList4 = new ArrayList(k13.r(list3, 10));
                                        for (VideoModel videoModel : list3) {
                                            videoModel.getClass();
                                            arrayList4.add(new y7m(videoModel.id, videoModel.k));
                                        }
                                        return arrayList4;
                                }
                            }
                        });
                        d2 = new BlazeResult.Success(Unit.a);
                    }
                }
                function1.invoke(d2);
                break;
            default:
                n0n n0nVar = n0n.a;
                blazeResult.getClass();
                if (!(blazeResult instanceof BlazeResult.Success)) {
                    if (!(blazeResult instanceof BlazeResult.Error)) {
                        zzl.b();
                        break;
                    } else {
                        j1m j1mVar3 = j1m.a;
                        t0 t0Var3 = new t0();
                        BlazeResult.Error error3 = (BlazeResult.Error) blazeResult;
                        t0Var3.f = error3.getCause();
                        t0Var3.g = fn0.p("dataSource", blazeDataSourceType.getStringRepresentation$blazesdk_release());
                        t0Var3.b(error3.getMessage());
                        j1m.a(t0Var3);
                        d3 = t0Var3.d();
                    }
                } else {
                    BlazeResult.Success success3 = (BlazeResult.Success) blazeResult;
                    if (((List) success3.getValue()).isEmpty()) {
                        d3 = new y0().d();
                    } else {
                        yda ydaVar3 = bmm.a;
                        String stringRepresentation$blazesdk_release3 = blazeDataSourceType.getStringRepresentation$blazesdk_release();
                        BlazePlayerType blazePlayerType3 = BlazePlayerType.VIDEOS;
                        Iterable iterable3 = (Iterable) success3.getValue();
                        ArrayList arrayList3 = new ArrayList(k13.r(iterable3, 10));
                        Iterator it3 = iterable3.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(((VideoModel) it3.next()).id);
                        }
                        final int i4 = 2;
                        bmm.d(this.b, this.c, stringRepresentation$blazesdk_release3, blazePlayerType3, arrayList3, new Function1() { // from class: gsm
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                int i32 = i4;
                                BlazeResult blazeResult2 = blazeResult;
                                String str = (String) obj2;
                                switch (i32) {
                                    case 0:
                                        rsm rsmVar2 = rsm.a;
                                        str.getClass();
                                        List<MomentModel> list = (List) ((BlazeResult.Success) blazeResult2).getValue();
                                        list.getClass();
                                        ArrayList arrayList22 = new ArrayList(k13.r(list, 10));
                                        for (MomentModel momentModel : list) {
                                            momentModel.getClass();
                                            arrayList22.add(new y7m(momentModel.id, momentModel.k));
                                        }
                                        return arrayList22;
                                    case 1:
                                        bxm bxmVar2 = bxm.a;
                                        str.getClass();
                                        List<StoryModel> list2 = (List) ((BlazeResult.Success) blazeResult2).getValue();
                                        list2.getClass();
                                        ArrayList arrayList32 = new ArrayList(k13.r(list2, 10));
                                        for (StoryModel storyModel : list2) {
                                            storyModel.getClass();
                                            arrayList32.add(new y7m(storyModel.id, storyModel.c));
                                        }
                                        return arrayList32;
                                    default:
                                        n0n n0nVar2 = n0n.a;
                                        str.getClass();
                                        List<VideoModel> list3 = (List) ((BlazeResult.Success) blazeResult2).getValue();
                                        list3.getClass();
                                        ArrayList arrayList4 = new ArrayList(k13.r(list3, 10));
                                        for (VideoModel videoModel : list3) {
                                            videoModel.getClass();
                                            arrayList4.add(new y7m(videoModel.id, videoModel.k));
                                        }
                                        return arrayList4;
                                }
                            }
                        });
                        d3 = new BlazeResult.Success(Unit.a);
                    }
                }
                function1.invoke(d3);
                break;
        }
        return null;
    }
}
