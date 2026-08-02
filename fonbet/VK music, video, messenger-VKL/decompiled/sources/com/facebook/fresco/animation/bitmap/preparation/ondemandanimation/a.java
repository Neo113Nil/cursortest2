package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import android.os.Handler;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.FrameResult;
import com.vk.movika.tools.controls.seekbar.n;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.bpn0;
import xsna.pn2;
import xsna.qn2;
import xsna.swe0;
import xsna.tqo;

/* compiled from: AnimationCoordinator.kt */
/* loaded from: classes12.dex */
public final class a {
    public static final AtomicInteger a = new AtomicInteger(0);
    public static final AtomicInteger b = new AtomicInteger(0);
    public static final AtomicInteger c = new AtomicInteger(0);
    public static final ConcurrentHashMap<tqo, Integer> d = new ConcurrentHashMap<>();
    public static final bpn0 e;
    public static final pn2 f;
    public static final qn2 g;

    /* compiled from: AnimationCoordinator.kt */
    /* renamed from: com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0108a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FrameResult.FrameType.values().length];
            try {
                iArr[FrameResult.FrameType.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FrameResult.FrameType.NEAREST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FrameResult.FrameType.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        bpn0 bpn0Var = new bpn0(new n(3));
        e = bpn0Var;
        pn2 pn2Var = new pn2();
        f = pn2Var;
        qn2 qn2Var = new qn2(0);
        g = qn2Var;
        ((Handler) bpn0Var.getValue()).post(pn2Var);
        ((Handler) bpn0Var.getValue()).post(qn2Var);
    }

    public static void a(tqo tqoVar, int i) {
        float b2 = tqoVar.b() * 0.5f;
        if (b2 < 1.0f) {
            b2 = 1.0f;
        }
        int g2 = swe0.g(tqoVar.a() + i, (int) b2, tqoVar.b());
        if (g2 != tqoVar.a()) {
            tqoVar.c(g2);
        }
    }
}
