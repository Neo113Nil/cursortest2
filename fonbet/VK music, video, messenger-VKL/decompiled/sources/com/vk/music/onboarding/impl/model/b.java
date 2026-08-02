package com.vk.music.onboarding.impl.model;

import com.vk.dto.music.AudioRecommendationOnBoardingInfo;
import com.vk.music.onboarding.impl.model.RecommendationOnBoardingModel;
import xsna.izs;
import xsna.s3q0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements izs {
    public final /* synthetic */ RecommendationOnBoardingModel b;

    public /* synthetic */ b(RecommendationOnBoardingModel recommendationOnBoardingModel) {
        this.b = recommendationOnBoardingModel;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        AudioRecommendationOnBoardingInfo audioRecommendationOnBoardingInfo = (AudioRecommendationOnBoardingInfo) obj;
        RecommendationOnBoardingModel recommendationOnBoardingModel = this.b;
        recommendationOnBoardingModel.f.e.addAll(audioRecommendationOnBoardingInfo.b);
        RecommendationOnBoardingModel.RecommendationOnBoardingData recommendationOnBoardingData = recommendationOnBoardingModel.f;
        recommendationOnBoardingData.b = audioRecommendationOnBoardingInfo.d;
        recommendationOnBoardingData.c = audioRecommendationOnBoardingInfo.c;
        return s3q0.a;
    }
}
