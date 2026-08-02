package com.vk.music.onboarding.impl;

import com.vk.dto.music.Artist;
import com.vk.music.onboarding.impl.MusicRecommendationOnboardingContract$Presenter;
import java.util.List;
import xsna.dc6;

/* compiled from: MusicRecommendationOnboardingContract.kt */
/* loaded from: classes3.dex */
public interface a extends dc6<MusicRecommendationOnboardingContract$Presenter> {
    void Em(List<Artist> list);

    void Kd(List<Artist> list);

    void e();

    void je(String str);

    void qe(MusicRecommendationOnboardingContract$Presenter.State state);

    void ra(long j, String str, String str2);

    void x3(List<Artist> list, Artist artist);
}
