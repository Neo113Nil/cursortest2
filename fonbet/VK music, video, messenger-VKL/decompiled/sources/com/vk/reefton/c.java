package com.vk.reefton;

import com.vk.reefton.literx.single.LambdaSingleObserver;
import com.vk.reefton.literx.single.SingleSubscribeOn;
import com.vk.reefton.utils.ReefNetworkUtil;
import java.util.concurrent.atomic.AtomicLong;
import xsna.hp30;
import xsna.juj0;
import xsna.qof0;
import xsna.z1v;

/* compiled from: ReefSharedState.kt */
/* loaded from: classes5.dex */
public final class c {
    public final qof0 a;
    public final AtomicLong b = new AtomicLong(0);
    public final AtomicLong c = new AtomicLong(0);
    public final AtomicLong d = new AtomicLong(0);
    public final AtomicLong e = new AtomicLong(0);
    public final AtomicLong f = new AtomicLong(0);
    public final AtomicLong g = new AtomicLong(0);
    public final AtomicLong h = new AtomicLong(0);
    public final AtomicLong i = new AtomicLong(0);
    public final AtomicLong j = new AtomicLong(0);
    public final AtomicLong k = new AtomicLong(0);
    public final AtomicLong l = new AtomicLong(0);
    public final AtomicLong m = new AtomicLong(0);
    public boolean n;

    /* compiled from: ReefSharedState.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReefNetworkUtil.NetworkType.values().length];
            try {
                iArr[ReefNetworkUtil.NetworkType.OFFLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReefNetworkUtil.NetworkType.WIFI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReefNetworkUtil.NetworkType.CELLULAR_2G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReefNetworkUtil.NetworkType.CELLULAR_3G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReefNetworkUtil.NetworkType.CELLULAR_4G.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReefNetworkUtil.NetworkType.CELLULAR_UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ReefNetworkUtil.NetworkType.OTHER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c(qof0 qof0Var) {
        this.a = qof0Var;
    }

    public final synchronized void a() {
        if (this.n) {
            return;
        }
        this.n = true;
        new SingleSubscribeOn(new juj0(new hp30(this, 18)), this.a.e()).a(new LambdaSingleObserver(null, z1v.b));
    }
}
