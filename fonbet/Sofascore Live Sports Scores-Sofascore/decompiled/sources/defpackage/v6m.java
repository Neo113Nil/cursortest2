package defpackage;

import com.blaze.blazesdk.ads.models.ui.BlazeStoriesAdsConfigType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import com.blaze.blazesdk.shared.results.o;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v6m extends hoi implements Function1 {
    public ilm r;
    public String s;
    public String t;
    public BlazeStoriesAdsConfigType u;
    public int v;
    public final /* synthetic */ String w;
    public final /* synthetic */ ilm x;
    public final /* synthetic */ String y;
    public final /* synthetic */ BlazeStoriesAdsConfigType z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6m(String str, ilm ilmVar, String str2, BlazeStoriesAdsConfigType blazeStoriesAdsConfigType, rq3 rq3Var) {
        super(1, rq3Var);
        this.w = str;
        this.x = ilmVar;
        this.y = str2;
        this.z = blazeStoriesAdsConfigType;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new v6m(this.w, this.x, this.y, this.z, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((v6m) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2;
        BlazeStoriesAdsConfigType blazeStoriesAdsConfigType;
        Object fetchStories$default;
        ilm ilmVar;
        String str2;
        lu3 lu3Var = lu3.a;
        int i = this.v;
        if (i == 0) {
            y6a.M(obj);
            str = this.w;
            if (str != null) {
                ilm ilmVar2 = this.x;
                StoriesRepositoryImpl storiesRepositoryImpl = ilmVar2.k0;
                String H = ilmVar2.H();
                storiesRepositoryImpl.getClass();
                List o = StoriesRepositoryImpl.o(H);
                boolean isEmpty = o.isEmpty();
                String str3 = this.y;
                BlazeStoriesAdsConfigType blazeStoriesAdsConfigType2 = this.z;
                if (isEmpty) {
                    StoriesRepositoryImpl storiesRepositoryImpl2 = StoriesRepositoryImpl.a;
                    BlazeDataSourceType.Ids ids = new BlazeDataSourceType.Ids(a.c(str), null, null, 6, null);
                    String C = ilmVar2.C();
                    this.r = ilmVar2;
                    this.s = str;
                    this.t = str3;
                    this.u = blazeStoriesAdsConfigType2;
                    this.v = 1;
                    obj2 = null;
                    blazeStoriesAdsConfigType = blazeStoriesAdsConfigType2;
                    fetchStories$default = yrl.fetchStories$default(storiesRepositoryImpl2, ids, str, null, C, true, true, null, null, this, 196, null);
                    if (fetchStories$default == lu3Var) {
                        return lu3Var;
                    }
                    ilmVar = ilmVar2;
                    str2 = str3;
                } else {
                    StoryModel storyModel = (StoryModel) CollectionsKt.Y(o);
                    storyModel.getClass();
                    ilm.e0(ilmVar2, a.c(v7a.g(storyModel)), str3, blazeStoriesAdsConfigType2);
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        BlazeStoriesAdsConfigType blazeStoriesAdsConfigType3 = this.u;
        str2 = this.t;
        str = this.s;
        ilmVar = this.r;
        y6a.M(obj);
        obj2 = null;
        blazeStoriesAdsConfigType = blazeStoriesAdsConfigType3;
        fetchStories$default = obj;
        a9m a9mVar = (a9m) fetchStories$default;
        if (a9mVar instanceof qbm) {
            StoryModel storyModel2 = (StoryModel) CollectionsKt.firstOrNull((List) ((qbm) a9mVar).a);
            if (storyModel2 != null) {
                ilm.e0(ilmVar, a.c(v7a.g(storyModel2)), str2, blazeStoriesAdsConfigType);
            } else {
                o oVar = new o();
                oVar.g = tub.h(new Pair("storyId", str), new Pair("pageId", String.valueOf(str2)));
                j1m.a(oVar);
            }
        }
        if (a9mVar instanceof a6m) {
            a6m a6mVar = (a6m) a9mVar;
            vp2.e(a6mVar.b(), a6mVar.a());
            return obj2;
        }
        return Unit.a;
    }
}
