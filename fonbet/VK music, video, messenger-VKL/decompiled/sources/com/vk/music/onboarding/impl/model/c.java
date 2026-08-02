package com.vk.music.onboarding.impl.model;

import com.vk.dto.music.Artist;
import xsna.izs;
import xsna.s3q0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements izs {
    public final /* synthetic */ RecommendationOnBoardingModel b;
    public final /* synthetic */ Artist c;

    public /* synthetic */ c(RecommendationOnBoardingModel recommendationOnBoardingModel, Artist artist) {
        this.b = recommendationOnBoardingModel;
        this.c = artist;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        this.b.f.d.remove(this.c);
        return s3q0.a;
    }
}
