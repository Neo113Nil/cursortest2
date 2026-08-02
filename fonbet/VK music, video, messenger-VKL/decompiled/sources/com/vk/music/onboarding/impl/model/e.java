package com.vk.music.onboarding.impl.model;

import com.vk.dto.music.Artist;
import java.util.List;
import kotlin.Pair;
import xsna.izs;
import xsna.j5g;
import xsna.s3q0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements izs {
    public final /* synthetic */ RecommendationOnBoardingModel b;

    public /* synthetic */ e(RecommendationOnBoardingModel recommendationOnBoardingModel) {
        this.b = recommendationOnBoardingModel;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Pair pair = (Pair) obj;
        List list = (List) pair.d();
        Artist artist = (Artist) pair.g();
        RecommendationOnBoardingModel recommendationOnBoardingModel = this.b;
        recommendationOnBoardingModel.f.e.addAll(list);
        recommendationOnBoardingModel.f.d.put(artist, j5g.R0(list));
        return s3q0.a;
    }
}
