package com.vk.newsfeed.impl.discover.repository;

import com.vk.dto.newsfeed.discover.DiscoverCategoryType;
import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.newsfeed.domain.model.DiscoverCustomIntent;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.commons.http.Http;
import xsna.ac60;
import xsna.bpn0;
import xsna.bwq;
import xsna.ca90;
import xsna.f6n;
import xsna.hd60;
import xsna.krk0;
import xsna.l03;
import xsna.m3n;
import xsna.m6n;
import xsna.m6o0;
import xsna.msy;
import xsna.mx6;
import xsna.nh60;
import xsna.o1n;
import xsna.og60;
import xsna.p03;
import xsna.p1n;
import xsna.pi0;
import xsna.q1n;
import xsna.ucg;
import xsna.vrk0;
import xsna.x960;

/* compiled from: DiscoverNewsEntriesRepository.kt */
/* loaded from: classes.dex */
public final class DiscoverNewsEntriesRepository {
    public static final DiscoverNewsEntriesRepository a = new DiscoverNewsEntriesRepository();
    public static final HashMap<DiscoverId, mx6<x960>> b = new HashMap<>();
    public static final HashSet<DiscoverId> c = new HashSet<>();
    public static final TemporaryCache d = new TemporaryCache(null, 1, null);
    public static final ac60 e = new ac60();
    public static final vrk0 f;
    public static final ca90 g;
    public static final bpn0 h;
    public static final Object i;

    /* compiled from: DiscoverNewsEntriesRepository.kt */
    /* loaded from: classes4.dex */
    public static final class EmptyResponseException extends Exception {
        public EmptyResponseException() {
            super("Response is empty");
        }
    }

    /* compiled from: DiscoverNewsEntriesRepository.kt */
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiscoverCategoryType.values().length];
            try {
                iArr[DiscoverCategoryType.DISCOVER_MEDIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiscoverCategoryType.DISCOVER_FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        new o1n();
        f = new vrk0();
        g = new ca90(5, 10);
        h = new bpn0(new l03(2));
        i = msy.a(LazyThreadSafetyMode.NONE, new p03(1));
    }

    public static /* synthetic */ mx6 b(DiscoverNewsEntriesRepository discoverNewsEntriesRepository, DiscoverId discoverId, DiscoverCustomIntent discoverCustomIntent, krk0 krk0Var, int i2) {
        return discoverNewsEntriesRepository.a(discoverId, (i2 & 2) == 0, discoverCustomIntent, true, krk0Var);
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
    public static mx6 c(DiscoverId discoverId, String str, DiscoverCustomIntent discoverCustomIntent, krk0 krk0Var) {
        Integer num;
        String e2 = discoverId.e();
        if (e2 == null) {
            e2 = "";
        }
        String str2 = e2;
        nh60 nh60Var = (nh60) i.getValue();
        boolean a1 = hd60.a().a1();
        boolean z = str == null || str.equals("0");
        if (str2.equals(m3n.a().e())) {
            ca90 ca90Var = g;
            num = Integer.valueOf(z ? ca90Var.a : ca90Var.b);
        } else {
            num = null;
        }
        return nh60Var.a(new og60(str2, "discover_full", a1, str, discoverCustomIntent, null, num, null, null, Http.StatusCode.RANGE_NOT_SATISFIABLE), krk0Var);
    }

    public final synchronized mx6<x960> a(DiscoverId discoverId, boolean z, DiscoverCustomIntent discoverCustomIntent, boolean z2, krk0 krk0Var) {
        HashMap<DiscoverId, mx6<x960>> hashMap = b;
        mx6<x960> mx6Var = hashMap.get(discoverId);
        if (z && mx6Var != null) {
            return mx6Var;
        }
        mx6<x960> c2 = c(discoverId, null, discoverCustomIntent, krk0Var);
        c2.N0(new ucg(z2, discoverId));
        hashMap.put(discoverId, c2);
        c.add(discoverId);
        return c2;
    }

    public final mx6 d(DiscoverId discoverId, boolean z, boolean z2, q1n q1nVar, DiscoverCustomIntent discoverCustomIntent, m6o0 m6o0Var) {
        if (z) {
            m6n.a(discoverId);
            return b(this, discoverId, discoverCustomIntent, new krk0(true, m6o0Var.h(), p1n.b.a), 10);
        }
        e.getClass();
        bwq bwqVar = new bwq();
        return new mx6(q1nVar.b(discoverId).L(new pi0(new f6n(q1nVar, z2, discoverId, discoverCustomIntent, m6o0Var, bwqVar), 19), false), bwqVar);
    }
}
