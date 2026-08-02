package com.vk.music.audioeffect;

import java.util.ArrayList;
import java.util.List;
import xsna.b8f0;
import xsna.e43;
import xsna.hn40;
import xsna.j5g;
import xsna.rsr;
import xsna.vtk0;
import xsna.ztp;

/* compiled from: AudioEffectSettings.kt */
/* loaded from: classes3.dex */
public interface a {
    public static final C1320a a = C1320a.a;

    b8f0 a();

    b8f0 c();

    ztp.g d();

    void e(boolean z);

    hn40 f();

    void g(boolean z);

    b8f0 h();

    void i(short s, short s2);

    void j(ztp ztpVar);

    boolean k();

    /* compiled from: AudioEffectSettings.kt */
    /* renamed from: com.vk.music.audioeffect.a$a, reason: collision with other inner class name */
    public static final class C1320a {
        public static final /* synthetic */ C1320a a = new C1320a();
        private static final a STUB = new C1321a();
        public static final List<Integer> b = e43.l(120, 460, 1800, 7000, 20000);
        public static final int c = 5;
        public static final short d = (short) (-1500);
        public static final short e = (short) 1500;

        public static ArrayList a(ztp ztpVar) {
            int i = c;
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                List<Integer> list = b;
                Integer num = (Integer) j5g.b0(i2 - 1, list);
                arrayList.add(Short.valueOf(ztpVar.a((num != null ? num.intValue() : 0) * 1000, list.get(i2).intValue() * 1000, d, e)));
            }
            return arrayList;
        }

        public final a getSTUB() {
            return STUB;
        }

        /* compiled from: AudioEffectSettings.kt */
        /* renamed from: com.vk.music.audioeffect.a$a$a, reason: collision with other inner class name */
        public static final class C1321a implements a {
            public final hn40.a b = hn40.a.a;
            public final b8f0 c;
            public final b8f0 d;
            public final b8f0 e;

            public C1321a() {
                Boolean bool = Boolean.FALSE;
                this.c = rsr.f(vtk0.a(bool));
                this.d = rsr.f(vtk0.a(bool));
                this.e = rsr.f(vtk0.a(ztp.j.d));
            }

            @Override // com.vk.music.audioeffect.a
            public final b8f0 a() {
                return this.d;
            }

            @Override // com.vk.music.audioeffect.a
            public final b8f0 c() {
                return this.c;
            }

            @Override // com.vk.music.audioeffect.a
            public final ztp.g d() {
                return null;
            }

            @Override // com.vk.music.audioeffect.a
            public final hn40 f() {
                return this.b;
            }

            @Override // com.vk.music.audioeffect.a
            public final b8f0 h() {
                return this.e;
            }

            @Override // com.vk.music.audioeffect.a
            public final boolean k() {
                return false;
            }

            @Override // com.vk.music.audioeffect.a
            public final void e(boolean z) {
            }

            @Override // com.vk.music.audioeffect.a
            public final void g(boolean z) {
            }

            @Override // com.vk.music.audioeffect.a
            public final void j(ztp ztpVar) {
            }

            @Override // com.vk.music.audioeffect.a
            public final void i(short s, short s2) {
            }
        }
    }
}
