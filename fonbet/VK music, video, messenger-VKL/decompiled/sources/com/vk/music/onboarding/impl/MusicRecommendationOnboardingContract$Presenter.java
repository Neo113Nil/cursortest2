package com.vk.music.onboarding.impl;

import android.content.Context;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.Artist;
import com.vk.lists.c;
import com.vk.music.onboarding.impl.model.RecommendationOnBoardingModel;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.asp;
import xsna.bk30;
import xsna.bn40;
import xsna.bpn0;
import xsna.gm6;
import xsna.izs;
import xsna.j720;
import xsna.pyz;
import xsna.s3q0;
import xsna.ubq;
import xsna.vp;
import xsna.w250;
import xsna.w950;
import xsna.zrp;

/* compiled from: MusicRecommendationOnboardingContract.kt */
/* loaded from: classes3.dex */
public final class MusicRecommendationOnboardingContract$Presenter implements gm6, c.l<List<? extends Artist>> {
    public final Context b;
    public final Object c;
    public final RecommendationOnBoardingModel d;
    public final io.reactivex.rxjava3.disposables.b e;
    public final Lazy f;
    public State g;
    public String h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MusicRecommendationOnboardingContract.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State CONTENT;
        public static final State SEARCH;

        static {
            State state = new State("CONTENT", 0);
            CONTENT = state;
            State state2 = new State("SEARCH", 1);
            SEARCH = state2;
            State[] stateArr = {state, state2};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: MusicRecommendationOnboardingContract.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<List<? extends Artist>, s3q0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.izs
        public final s3q0 invoke(List<? extends Artist> list) {
            ((com.vk.music.onboarding.impl.a) this.receiver).Kd(list);
            return s3q0.a;
        }
    }

    /* compiled from: MusicRecommendationOnboardingContract.kt */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            bn40.c(th, new Object[0]);
            return s3q0.a;
        }
    }

    public MusicRecommendationOnboardingContract$Presenter(Context context, com.vk.music.onboarding.impl.a aVar, RecommendationOnBoardingModel recommendationOnBoardingModel, io.reactivex.rxjava3.disposables.b bVar, bpn0 bpn0Var) {
        this.b = context;
        this.c = aVar;
        this.d = recommendationOnBoardingModel;
        this.e = bVar;
        this.f = bpn0Var;
        recommendationOnBoardingModel.d.m0(recommendationOnBoardingModel.M().h());
        w950.p(recommendationOnBoardingModel.e, null, null, null, 7);
        this.g = State.CONTENT;
    }

    public static void b(VKList vKList, c cVar) {
        cVar.l(vKList.i());
        cVar.r((cVar.j() == null || cVar.i() >= vKList.i() || vKList.isEmpty()) ? false : true);
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.vk.music.onboarding.impl.a, java.lang.Object] */
    public final void g() {
        State state = this.g;
        State state2 = State.SEARCH;
        ?? r2 = this.c;
        if (state == state2) {
            State state3 = State.CONTENT;
            r2.qe(state3);
            this.g = state3;
        } else {
            RecommendationOnBoardingModel recommendationOnBoardingModel = this.d;
            recommendationOnBoardingModel.d.A0(recommendationOnBoardingModel.M().h());
            r2.e();
        }
    }

    @Override // com.vk.lists.c.k
    public final q<List<Artist>> hj(c cVar, boolean z) {
        return this.d.G();
    }

    @Override // com.vk.lists.c.l
    public final q<List<? extends Artist>> ui(int i, c cVar) {
        State state = this.g;
        State state2 = State.CONTENT;
        RecommendationOnBoardingModel recommendationOnBoardingModel = this.d;
        if (state == state2) {
            return recommendationOnBoardingModel.J();
        }
        m1 Q = recommendationOnBoardingModel.Q(i, this.h);
        w250 w250Var = new w250(new bk30(cVar, this), 0);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return Q.E(w250Var, lVar, kVar, kVar).U(new vp(new pyz(11), 28));
    }

    @Override // com.vk.lists.c.k
    public final void wd(q<List<Artist>> qVar, boolean z, c cVar) {
        qVar.subscribe(new ubq(new a(1, this.c, com.vk.music.onboarding.impl.a.class, "onArtistsLoaded", "onArtistsLoaded(Ljava/util/List;)V", 0), 18), new j720(new b(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0), 3));
    }

    @Override // xsna.gm6
    public final void d() {
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
