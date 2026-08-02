package com.vk.libvideo.autoplay;

import android.annotation.SuppressLint;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.libvideo.models.autoplay.ad_pixels.AutoPlayAdPixelsTrackerType;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.libvideo.models.videotracker.ScreenType;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.chs0;
import xsna.epx;
import xsna.qoy;
import xsna.toz;

/* compiled from: AutoPlayConfig.kt */
/* loaded from: classes2.dex */
public final class a {

    @SuppressLint({"StaticFieldLeak"})
    public static final a t = new a(false, null, null, false, false, false, null, null, null, null, null, null, false, null, 524287);
    public final boolean a;
    public final RepeatMode b;
    public final boolean c;
    public final Float d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final InterfaceC1207a l;
    public final SubtitlesConfigurationMode m;
    public final toz n;
    public final AutoPlayAdPixelsTrackerType o;
    public final PlayerType p;
    public final ScreenType q;
    public final boolean r;
    public final chs0 s;

    /* compiled from: AutoPlayConfig.kt */
    /* renamed from: com.vk.libvideo.autoplay.a$a, reason: collision with other inner class name */
    public interface InterfaceC1207a {
        int a();

        int getSessionId();
    }

    public a() {
        this(false, null, null, false, false, false, null, null, null, null, null, null, false, null, 524287);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [xsna.toz] */
    public static a a(a aVar, RepeatMode repeatMode, Float f, SubtitlesConfigurationMode subtitlesConfigurationMode, toz.a aVar2, PlayerType playerType, ScreenType screenType, int i) {
        boolean z = (i & 1) != 0 ? aVar.a : true;
        RepeatMode repeatMode2 = (i & 2) != 0 ? aVar.b : repeatMode;
        boolean z2 = aVar.c;
        Float f2 = (i & 8) != 0 ? aVar.d : f;
        boolean z3 = aVar.e;
        boolean z4 = aVar.f;
        boolean z5 = (i & 64) != 0 ? aVar.g : true;
        boolean z6 = aVar.h;
        boolean z7 = aVar.i;
        boolean z8 = aVar.j;
        boolean z9 = (i & 1024) != 0 ? aVar.k : false;
        InterfaceC1207a interfaceC1207a = (i & 2048) != 0 ? aVar.l : null;
        SubtitlesConfigurationMode subtitlesConfigurationMode2 = (i & 4096) != 0 ? aVar.m : subtitlesConfigurationMode;
        toz.a aVar3 = (i & 8192) != 0 ? aVar.n : aVar2;
        AutoPlayAdPixelsTrackerType autoPlayAdPixelsTrackerType = aVar.o;
        PlayerType playerType2 = (32768 & i) != 0 ? aVar.p : playerType;
        ScreenType screenType2 = (i & 65536) != 0 ? aVar.q : screenType;
        boolean z10 = aVar.r;
        chs0 chs0Var = aVar.s;
        aVar.getClass();
        return new a(z, repeatMode2, z2, f2, z3, z4, z5, z6, z7, z8, z9, interfaceC1207a, subtitlesConfigurationMode2, aVar3, autoPlayAdPixelsTrackerType, playerType2, screenType2, z10, chs0Var);
    }

    public final boolean b() {
        return this.g;
    }

    public final boolean c() {
        if (this.c) {
            return false;
        }
        if (this.d != null) {
            return true;
        }
        return this.a;
    }

    public final Float d() {
        return this.d;
    }

    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && epx.f(this.l, aVar.l) && this.m == aVar.m && epx.f(this.n, aVar.n) && this.o == aVar.o && this.p == aVar.p && this.q == aVar.q && this.r == aVar.r && epx.f(this.s, aVar.s);
    }

    public final boolean f() {
        Float f = this.d;
        if (f != null) {
            return epx.d(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (this.c) {
            e eVar = e.a;
            return e.b();
        }
        e eVar2 = e.a;
        return e.c();
    }

    public final boolean g() {
        return this.k;
    }

    public final int hashCode() {
        int b = qoy.b((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c);
        Float f = this.d;
        int b2 = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((b + (f == null ? 0 : f.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        InterfaceC1207a interfaceC1207a = this.l;
        int b3 = qoy.b((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((b2 + (interfaceC1207a == null ? 0 : interfaceC1207a.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.r);
        chs0 chs0Var = this.s;
        return b3 + (chs0Var != null ? System.identityHashCode(chs0Var.a) : 0);
    }

    public final String toString() {
        return "AutoPlayConfig(fullscreen=" + this.a + ", repeatMode=" + this.b + ')';
    }

    public a(boolean z, RepeatMode repeatMode, boolean z2, Float f, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, InterfaceC1207a interfaceC1207a, SubtitlesConfigurationMode subtitlesConfigurationMode, toz tozVar, AutoPlayAdPixelsTrackerType autoPlayAdPixelsTrackerType, PlayerType playerType, ScreenType screenType, boolean z10, chs0 chs0Var) {
        this.a = z;
        this.b = repeatMode;
        this.c = z2;
        this.d = f;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = z9;
        this.l = interfaceC1207a;
        this.m = subtitlesConfigurationMode;
        this.n = tozVar;
        this.o = autoPlayAdPixelsTrackerType;
        this.p = playerType;
        this.q = screenType;
        this.r = z10;
        this.s = chs0Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(boolean z, RepeatMode repeatMode, Float f, boolean z2, boolean z3, boolean z4, InterfaceC1207a interfaceC1207a, SubtitlesConfigurationMode subtitlesConfigurationMode, toz.a aVar, AutoPlayAdPixelsTrackerType autoPlayAdPixelsTrackerType, PlayerType playerType, ScreenType screenType, boolean z5, chs0 chs0Var, int i) {
        this(r4, r5, r6, r1, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, (i & 16384) != 0 ? AutoPlayAdPixelsTrackerType.NONE : autoPlayAdPixelsTrackerType, (32768 & i) != 0 ? PlayerType.INLINE : playerType, (65536 & i) != 0 ? ScreenType.INLINE : screenType, (131072 & i) != 0 ? false : z5, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : chs0Var);
        toz tozVar;
        boolean z6 = (i & 1) != 0 ? false : z;
        RepeatMode repeatMode2 = (i & 2) != 0 ? RepeatMode.OFF : repeatMode;
        boolean z7 = (i & 4) == 0;
        Float f2 = (i & 8) != 0 ? null : f;
        boolean z8 = (i & 16) != 0;
        boolean z9 = (i & 32) == 0;
        boolean z10 = (i & 64) != 0 ? true : z2;
        boolean z11 = (i & 128) != 0;
        boolean z12 = (i & 256) != 0 ? false : z3;
        boolean z13 = (i & 512) != 0;
        boolean z14 = (i & 1024) != 0 ? true : z4;
        InterfaceC1207a interfaceC1207a2 = (i & 2048) != 0 ? null : interfaceC1207a;
        SubtitlesConfigurationMode subtitlesConfigurationMode2 = (i & 4096) != 0 ? SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE : subtitlesConfigurationMode;
        if ((i & 8192) != 0) {
            toz.a.getClass();
            tozVar = toz.b.b;
        } else {
            tozVar = aVar;
        }
    }
}
