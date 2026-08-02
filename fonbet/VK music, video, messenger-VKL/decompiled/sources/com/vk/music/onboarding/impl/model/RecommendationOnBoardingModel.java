package com.vk.music.onboarding.impl.model;

import android.os.Bundle;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.Artist;
import com.vk.music.bottomsheets.domain.model.AudioOnboardingScenarioType;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ac20;
import xsna.b8v;
import xsna.c5g;
import xsna.ca10;
import xsna.ex4;
import xsna.hq3;
import xsna.i80;
import xsna.izi0;
import xsna.j5g;
import xsna.jgp;
import xsna.rsg0;
import xsna.u750;
import xsna.w950;
import xsna.wmi0;
import xsna.yaf0;
import xsna.yn4;
import xsna.zcl;

/* compiled from: RecommendationOnBoardingModel.kt */
/* loaded from: classes3.dex */
public final class RecommendationOnBoardingModel implements i80 {
    public final String b;
    public final String c;
    public final u750 d;
    public final w950 e;
    public RecommendationOnBoardingData f = new RecommendationOnBoardingData(null, 0, null, null, 15, null);

    /* compiled from: RecommendationOnBoardingModel.kt */
    public static final class RecommendationOnBoardingData extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<RecommendationOnBoardingData> CREATOR = new a();
        public String b;
        public int c;
        public final Map<Artist, Set<Artist>> d;
        public final Set<Artist> e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<RecommendationOnBoardingData> {
            @Override // com.vk.core.serialize.Serializer.c
            public final RecommendationOnBoardingData a(Serializer serializer) {
                return new RecommendationOnBoardingData(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecommendationOnBoardingData[i];
            }
        }

        public RecommendationOnBoardingData() {
            this(null, 0, null, null, 15, null);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.S(this.c);
            Map<Artist, Set<Artist>> map = this.d;
            if (map == null) {
                serializer.S(-1);
            } else {
                Iterator c = n.c(serializer, map);
                while (c.hasNext()) {
                    Map.Entry entry = (Map.Entry) c.next();
                    serializer.e0((Artist) entry.getKey());
                    serializer.f0(j5g.O0((Set) entry.getValue()));
                }
            }
            serializer.f0(j5g.O0(this.e));
        }

        public /* synthetic */ RecommendationOnBoardingData(String str, int i, Map map, Set set, int i2, zcl zclVar) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? new HashMap() : map, (i2 & 8) != 0 ? new LinkedHashSet() : set);
        }

        public RecommendationOnBoardingData(String str, int i, Map<Artist, Set<Artist>> map, Set<Artist> set) {
            this.b = str;
            this.c = i;
            this.d = map;
            this.e = set;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RecommendationOnBoardingData(Serializer serializer) {
            this(r0, r1, new LinkedHashMap(r4), j5g.R0(serializer.l(Artist.class.getClassLoader())));
            Map map;
            String H = serializer.H();
            int u = serializer.u();
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            try {
                int u2 = serializer.u();
                if (u2 >= 0) {
                    map = new LinkedHashMap();
                    for (int i = 0; i < u2; i++) {
                        Artist artist = (Artist) serializer.G(Artist.class.getClassLoader());
                        Set S0 = j5g.S0(serializer.l(Artist.class.getClassLoader()));
                        if (artist != null && S0 != null) {
                            map.put(artist, S0);
                        }
                    }
                } else {
                    map = jgp.b;
                }
            } finally {
            }
        }
    }

    public RecommendationOnBoardingModel(String str, String str2, u750 u750Var, w950 w950Var) {
        this.b = str;
        this.c = str2;
        this.d = u750Var;
        this.e = w950Var;
    }

    public final boolean D() {
        return this.f.d.size() >= 5;
    }

    public final List<Artist> E(int i) {
        Map<Artist, Set<Artist>> map = this.f.d;
        return j5g.O0(j5g.H0(izi0.j(map.keySet(), c5g.v(map.values())), i));
    }

    public final boolean F(Artist artist) {
        return this.f.d.keySet().contains(artist);
    }

    public final q<List<Artist>> G() {
        RecommendationOnBoardingData recommendationOnBoardingData = this.f;
        recommendationOnBoardingData.b = null;
        recommendationOnBoardingData.e.clear();
        this.f.d.clear();
        return J();
    }

    public final q<List<Artist>> J() {
        String str = this.f.b;
        if (str != null && str.length() == 0) {
            return g0.b;
        }
        m1 a0 = rsg0.y0(new hq3(str, 1, (byte) 0), null, null, 3).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        ca10 ca10Var = new ca10(new b(this), 15);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return a0.E(ca10Var, lVar, kVar, kVar).U(new ac20(yaf0.b, 13));
    }

    public final AudioOnboardingScenarioType M() {
        AudioOnboardingScenarioType.a aVar = AudioOnboardingScenarioType.Companion;
        AudioOnboardingScenarioType audioOnboardingScenarioType = AudioOnboardingScenarioType.CA4;
        aVar.getClass();
        AudioOnboardingScenarioType a = AudioOnboardingScenarioType.a.a(this.c);
        return a == null ? audioOnboardingScenarioType : a;
    }

    public final m1 P() {
        Set<Artist> keySet = this.f.d.keySet();
        ArrayList arrayList = new ArrayList(c5g.u(keySet, 10));
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Artist) it.next()).b);
        }
        String h = M().h();
        this.d.d(arrayList.size(), h);
        yn4 yn4Var = new yn4("audio.finishRecomsOnboarding");
        yn4Var.i("artist_ids", arrayList);
        return rsg0.y0(yn4Var, null, null, 3).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public final m1 Q(int i, String str) {
        this.d.z(M().h());
        ex4 ex4Var = new ex4("audio.searchArtists", Artist.o);
        ex4Var.K(CampaignEx.JSON_KEY_AD_Q, str);
        ex4Var.C(i, SignalingProtocol.KEY_OFFSET);
        ex4Var.C(100, "count");
        return rsg0.y0(ex4Var, null, null, 3).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // xsna.i80
    public final Bundle e() {
        wmi0.a.a(this.b, this.f);
        return Bundle.EMPTY;
    }

    @Override // xsna.i80
    public final void u(Bundle bundle) {
        wmi0.a.h(this.b).subscribe(new b8v(new a(this), 24));
    }

    public final boolean y(Artist artist) {
        return !this.f.d.keySet().contains(artist) && (this.f.d.size() < 50);
    }

    @Override // xsna.i80
    public final void G1() {
    }

    @Override // xsna.i80
    public final void release() {
    }
}
