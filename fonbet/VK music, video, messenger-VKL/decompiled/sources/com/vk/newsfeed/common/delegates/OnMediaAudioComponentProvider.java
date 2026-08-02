package com.vk.newsfeed.common.delegates;

import android.os.Handler;
import android.os.Looper;
import android.view.animation.DecelerateInterpolator;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asp;
import xsna.b010;
import xsna.biq;
import xsna.cr4;
import xsna.cs4;
import xsna.dj60;
import xsna.dnp0;
import xsna.dx40;
import xsna.gd40;
import xsna.gzs;
import xsna.i21;
import xsna.izs;
import xsna.k780;
import xsna.kr50;
import xsna.lb6;
import xsna.lg;
import xsna.lm4;
import xsna.m780;
import xsna.msy;
import xsna.osj0;
import xsna.px40;
import xsna.re40;
import xsna.s3q0;
import xsna.sim;
import xsna.t780;
import xsna.wra;
import xsna.zrp;

/* compiled from: OnMediaAudioComponentProvider.kt */
/* loaded from: classes4.dex */
public final class OnMediaAudioComponentProvider {
    public final cr4 a;
    public final cs4 b;
    public final FunctionReferenceImpl c;
    public final FunctionReferenceImpl d;
    public final boolean e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Handler o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OnMediaAudioComponentProvider.kt */
    public static final class AudioType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AudioType[] $VALUES;
        public static final AudioType MULTI_TRACK;
        public static final AudioType PLAYLIST;
        public static final AudioType TRACK;
        private final boolean isMultiAudio;

        static {
            AudioType audioType = new AudioType("TRACK", 0, false);
            TRACK = audioType;
            AudioType audioType2 = new AudioType("PLAYLIST", 1, true);
            PLAYLIST = audioType2;
            AudioType audioType3 = new AudioType("MULTI_TRACK", 2, true);
            MULTI_TRACK = audioType3;
            AudioType[] audioTypeArr = {audioType, audioType2, audioType3};
            $VALUES = audioTypeArr;
            $ENTRIES = new asp(audioTypeArr);
        }

        public AudioType(String str, int i, boolean z) {
            this.isMultiAudio = z;
        }

        public static AudioType valueOf(String str) {
            return (AudioType) Enum.valueOf(AudioType.class, str);
        }

        public static AudioType[] values() {
            return (AudioType[]) $VALUES.clone();
        }

        public final boolean h() {
            return this.isMultiAudio;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnMediaAudioComponentProvider(cr4 cr4Var, cs4 cs4Var, AudioType audioType, px40 px40Var, gzs<s3q0> gzsVar, izs<? super Boolean, s3q0> izsVar) {
        this.a = cr4Var;
        this.b = cs4Var;
        this.c = (FunctionReferenceImpl) gzsVar;
        this.d = (FunctionReferenceImpl) izsVar;
        this.e = audioType.h();
        i21 i21Var = new i21(25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, i21Var);
        this.g = msy.a(lazyThreadSafetyMode, new sim(this, 27));
        this.h = msy.a(lazyThreadSafetyMode, new lg(26));
        this.i = msy.a(lazyThreadSafetyMode, new dj60(this, 2));
        this.j = msy.a(lazyThreadSafetyMode, new lb6(20, px40Var, this));
        this.k = msy.a(lazyThreadSafetyMode, new b010(this, 18));
        this.l = msy.a(lazyThreadSafetyMode, new kr50(this, 5));
        this.m = msy.a(lazyThreadSafetyMode, new gd40(this, 6));
        this.n = msy.a(lazyThreadSafetyMode, new re40(this, 5));
        dnp0 dnp0Var = new dnp0();
        dnp0Var.setInterpolator(new DecelerateInterpolator());
        dnp0Var.g(0);
        dnp0Var.e(400L);
        dnp0Var.c(new biq(2));
        dnp0Var.c(new wra());
        dnp0Var.c(new biq(1));
        this.o = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean a() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final k780 b() {
        return (k780) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final lm4 c() {
        return (lm4) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final m780 d() {
        return (m780) this.m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final t780 e() {
        return (t780) this.n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final dx40 f() {
        return (dx40) this.h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final osj0 g() {
        return (osj0) this.k.getValue();
    }
}
