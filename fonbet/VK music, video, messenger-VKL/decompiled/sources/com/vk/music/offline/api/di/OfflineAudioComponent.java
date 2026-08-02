package com.vk.music.offline.api.di;

import androidx.media3.exoplayer.offline.c;
import com.vk.di.component.DiScopedComponent;
import com.vk.music.offline.api.domain.download.b;
import com.vk.music.player.cache.a;
import xsna.abo;
import xsna.bf5;
import xsna.ctp;
import xsna.df5;
import xsna.du70;
import xsna.ef40;
import xsna.ilb;
import xsna.k850;
import xsna.kgp0;
import xsna.lq40;
import xsna.mzc0;
import xsna.pwj0;
import xsna.qh4;
import xsna.rbb0;
import xsna.wa40;
import xsna.whb0;

/* compiled from: OfflineAudioComponent.kt */
/* loaded from: classes.dex */
public interface OfflineAudioComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: OfflineAudioComponent.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final OfflineAudioComponent STUB = new OfflineAudioComponent() { // from class: com.vk.music.offline.api.di.OfflineAudioComponent$Companion$STUB$1
            public final kgp0 a = kgp0.a.a.getSTUB();
            public final qh4 b = qh4.a.a.getSTUB();
            public final ilb c = ilb.a.a.getSTUB();
            public final whb0 d = whb0.a.a.getSTUB();
            public final ctp e = ctp.a.a.getSTUB();
            public final df5 f = df5.a.a.getSTUB();
            public final rbb0 g = rbb0.a.a.getSTUB();
            public final k850 h = k850.a.a.getSTUB();
            public final ef40 i = ef40.a.a.getSTUB();
            public final du70 j = du70.a.getSTUB();
            public final lq40.a k = lq40.a.a;
            public final abo l = abo.a.a.getSTUB();
            public final b m = b.a.getSTUB();
            public final a.b n = a.b.a;
            public final mzc0 o;
            public final wa40 p;

            {
                new bf5.b((Object) null);
                this.o = mzc0.a.a.getSTUB();
                this.p = wa40.a.a.getSTUB();
            }

            @Override // com.vk.music.offline.api.di.OfflineAudioComponent
            public final qh4 Ae() {
                return this.b;
            }

            @Override // com.vk.music.offline.api.di.OfflineAudioComponent
            public final b I() {
                return this.m;
            }

            @Override // com.vk.music.offline.api.di.OfflineAudioComponent
            public final k850 Ib() {
                return this.h;
            }

            @Override // com.vk.music.offline.api.di.OfflineAudioComponent
            public final lq40 Ja() {
                return this.k;
            }

            @Override // com.vk.music.offline.api.di.OfflineAudioComponent
            public final rbb0 K1() {
                return this.g;
            }

            @Override // com.vk.music.offline.api.di.OfflineAudioComponent
            public final ef40 Na() {
                return this.i;
            }

            @Override // com.vk.music.offline.api.di.OfflineAudioComponent
            public final ilb O2() {
                return this.c;
            }

            @Override // com.vk.music.offline.api.di.OfflineAudioComponent
            public final c P6() {
                throw new UnsupportedOperationException("called downloadManager on STUB");
            }

            @Override // com.vk.music.offline.api.di.OfflineAudioComponent
            public final du70 U8() {
                return this.j;
            }

            @Override // com.vk.music.offline.api.di.OfflineAudioComponent
            public final ctp W8() {
                return this.e;
            }

            @Override // com.vk.music.offline.api.di.OfflineAudioComponent
            public final abo l8() {
                return this.l;
            }

            @Override // com.vk.music.offline.api.di.OfflineAudioComponent
            public final kgp0 n7() {
                return this.a;
            }

            @Override // com.vk.music.offline.api.di.OfflineAudioComponent
            public final df5 u3() {
                return this.f;
            }

            @Override // com.vk.music.offline.api.di.OfflineAudioComponent
            public final a v0() {
                return this.n;
            }

            @Override // com.vk.music.offline.api.di.OfflineAudioComponent
            public final whb0 v7() {
                return this.d;
            }

            @Override // com.vk.music.offline.api.di.OfflineAudioComponent
            public final mzc0 x0() {
                return this.o;
            }
        };

        public final OfflineAudioComponent getSTUB() {
            return STUB;
        }
    }

    qh4 Ae();

    b I();

    k850 Ib();

    lq40 Ja();

    rbb0 K1();

    ef40 Na();

    ilb O2();

    c P6();

    du70 U8();

    ctp W8();

    abo l8();

    kgp0 n7();

    df5 u3();

    a v0();

    whb0 v7();

    mzc0 x0();
}
