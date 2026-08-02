package com.vk.channels.impl.list.loader;

import android.content.Context;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import io.reactivex.rxjava3.internal.operators.observable.f2;
import io.reactivex.rxjava3.internal.operators.observable.n1;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.kotlin.c;
import io.reactivex.rxjava3.subjects.d;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import xsna.a1w;
import xsna.asp;
import xsna.asu0;
import xsna.eib;
import xsna.fjk0;
import xsna.hkb;
import xsna.ikb;
import xsna.jgp;
import xsna.mgb;
import xsna.ngb;
import xsna.ogb;
import xsna.pd;
import xsna.pj4;
import xsna.rkb;
import xsna.s41;
import xsna.sqt;
import xsna.tib;
import xsna.ygb;
import xsna.zrp;

/* compiled from: ChannelsListItemsLoader.kt */
/* loaded from: classes16.dex */
public final class ChannelsListItemsLoader implements ygb<a> {
    public final Context a;
    public final ogb b;
    public final rkb c;
    public final eib d;
    public final io.reactivex.rxjava3.disposables.b e;
    public final ngb f;
    public final f<ogb.b> g;
    public final d<ygb.a<a>> h;
    public final y i;
    public final q<ogb.b> j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelsListItemsLoader.kt */
    public static final class BannerKeys {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BannerKeys[] $VALUES;
        public static final BannerKeys BACKGROUND_COLOR;
        public static final BannerKeys FOREGROUND_COLOR;
        public static final BannerKeys IMAGE;
        public static final BannerKeys TEXT;
        public static final BannerKeys URL;
        private final String key;

        static {
            BannerKeys bannerKeys = new BannerKeys("TEXT", 0, "text");
            TEXT = bannerKeys;
            BannerKeys bannerKeys2 = new BannerKeys("URL", 1, "url");
            URL = bannerKeys2;
            BannerKeys bannerKeys3 = new BannerKeys("BACKGROUND_COLOR", 2, "background_color");
            BACKGROUND_COLOR = bannerKeys3;
            BannerKeys bannerKeys4 = new BannerKeys("FOREGROUND_COLOR", 3, "foreground_color");
            FOREGROUND_COLOR = bannerKeys4;
            BannerKeys bannerKeys5 = new BannerKeys("IMAGE", 4, "image");
            IMAGE = bannerKeys5;
            BannerKeys[] bannerKeysArr = {bannerKeys, bannerKeys2, bannerKeys3, bannerKeys4, bannerKeys5};
            $VALUES = bannerKeysArr;
            $ENTRIES = new asp(bannerKeysArr);
        }

        public BannerKeys(String str, int i, String str2) {
            this.key = str2;
        }

        public static BannerKeys valueOf(String str) {
            return (BannerKeys) Enum.valueOf(BannerKeys.class, str);
        }

        public static BannerKeys[] values() {
            return (BannerKeys[]) $VALUES.clone();
        }

        public final String h() {
            return this.key;
        }
    }

    /* compiled from: ChannelsListItemsLoader.kt */
    public static final class a {
        public final ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return j.b(')', new StringBuilder("ChannelsListState(listItems="), this.a);
        }
    }

    public ChannelsListItemsLoader(Context context, ogb ogbVar, rkb rkbVar, ikb ikbVar, tib tibVar, eib eibVar) {
        this.a = context;
        this.b = ogbVar;
        this.c = rkbVar;
        this.d = eibVar;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.e = bVar;
        this.f = new ngb(context);
        f<ogb.b> fVar = new f<>();
        this.g = fVar;
        d<ygb.a<a>> N0 = d.N0();
        rkbVar.c();
        q<ogb.a> e = ogbVar.e();
        y yVar = rkbVar.i;
        int i = 0;
        f2 j0 = ikbVar.a.a().j0(jgp.b, new pj4(new hkb(i), 12));
        fjk0 fjk0Var = (fjk0) eibVar.a;
        q s = q.s(q.T(0), q.X(new n1(((a1w) fjk0Var.a).C(fjk0Var, new sqt()).q(asu0.a.c()).w(), io.reactivex.rxjava3.internal.functions.a.g), (f) fjk0Var.b));
        s.getClass();
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        bVar.b(c.f(2, q.j(e, yVar, j0, new y(s, qVar, aVar), new s41(new mgb(this, i), 9)), null, new pd(this, 18), new com.vk.channels.impl.list.loader.a(1, N0, d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0)));
        this.h = N0;
        this.i = new y(N0, qVar, aVar);
        this.j = q.X(fVar, ogbVar.b());
    }

    @Override // xsna.pgb
    public final q<ogb.b> b() {
        throw null;
    }

    @Override // xsna.pgb
    public final void d() {
        this.b.d();
    }

    @Override // xsna.pgb
    public final void destroy() {
        this.b.destroy();
        this.e.dispose();
    }

    @Override // xsna.pgb
    public final q<ygb.a<a>> e() {
        throw null;
    }
}
