package defpackage;

import com.blaze.blazesdk.ads.models.ui.BlazeStoriesAdsConfigType;
import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r3m extends hoi implements Function1 {
    public final /* synthetic */ ilm r;
    public final /* synthetic */ String s;
    public final /* synthetic */ BlazeStoriesAdsConfigType t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3m(ilm ilmVar, String str, BlazeStoriesAdsConfigType blazeStoriesAdsConfigType, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = ilmVar;
        this.s = str;
        this.t = blazeStoriesAdsConfigType;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new r3m(this.r, this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((r3m) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        ilm ilmVar = this.r;
        StoriesRepositoryImpl storiesRepositoryImpl = ilmVar.k0;
        String H = ilmVar.H();
        storiesRepositoryImpl.getClass();
        List o = StoriesRepositoryImpl.o(H);
        o.getClass();
        ArrayList arrayList = new ArrayList(k13.r(o, 10));
        Iterator it = o.iterator();
        while (it.hasNext()) {
            arrayList.add(v7a.g((StoryModel) it.next()));
        }
        BlazeStoriesAdsConfigType blazeStoriesAdsConfigType = this.t;
        String str = this.s;
        if (str != null) {
            ilm.e0(ilmVar, arrayList, str, blazeStoriesAdsConfigType);
        } else {
            ilmVar.b0(blazeStoriesAdsConfigType, arrayList);
        }
        return Unit.a;
    }
}
