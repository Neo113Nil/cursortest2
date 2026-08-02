package com.vk.music.onboarding.impl.model;

import com.vk.dto.music.Artist;
import java.util.List;
import kotlin.Pair;
import xsna.izs;
import xsna.j5g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements izs {
    public final /* synthetic */ RecommendationOnBoardingModel b;
    public final /* synthetic */ Artist c;

    public /* synthetic */ d(RecommendationOnBoardingModel recommendationOnBoardingModel, Artist artist) {
        this.b = recommendationOnBoardingModel;
        this.c = artist;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        RecommendationOnBoardingModel recommendationOnBoardingModel = this.b;
        return new Pair(j5g.H0(j5g.t0((List) obj, recommendationOnBoardingModel.f.e), recommendationOnBoardingModel.f.c), this.c);
    }
}
