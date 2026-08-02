package com.vk.music.pref;

import com.vk.dto.common.id.UserId;
import com.vk.music.player.LoopMode;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: MusicPrefs.kt */
/* loaded from: classes.dex */
public interface a {
    public static final C1353a a = C1353a.a;

    void A(UserId userId);

    boolean A0();

    long B();

    void B0(boolean z);

    void C(long j);

    void C0(UserId userId, Set<String> set);

    void D(CrossfadeOnboarding crossfadeOnboarding);

    void D0(long j);

    boolean E();

    void E0();

    void F(boolean z);

    void F0(long j);

    long G();

    boolean G0();

    void H(long j);

    long H0();

    void I(long j);

    void I0(boolean z);

    void J(UserId userId);

    void J0(float f);

    void K(UserId userId);

    boolean K0();

    void L(UserId userId, String str);

    boolean L0();

    boolean M();

    void M0(boolean z);

    void N();

    Set<String> N0();

    boolean O();

    long O0();

    void P(Long[] lArr);

    void P0(boolean z);

    boolean Q();

    void Q0(boolean z);

    boolean R();

    String R0();

    boolean S();

    void T(String str);

    String U();

    void V();

    void W(boolean z);

    long X();

    boolean Y();

    Long[] Z();

    boolean a();

    void a0(long j);

    void b(LoopMode loopMode);

    boolean b0();

    boolean c();

    long c0();

    void d(boolean z);

    void d0(UserId userId);

    long e0();

    void f0(long j);

    boolean g0();

    void h0(Set<String> set);

    void i0(UserId userId);

    boolean j0();

    void k0();

    float l();

    boolean l0();

    void m(UserId userId);

    long m0();

    void n();

    LoopMode n0();

    boolean o();

    long o0();

    void p(long j);

    Long[] p0();

    CrossfadeOnboarding q();

    void q0(UserId userId);

    void r(UserId userId);

    Set<Long> r0();

    long s();

    void s0();

    Set<String> t();

    void t0(String str);

    void u();

    void u0();

    void v(long j);

    long v0();

    void w(Long[] lArr);

    String w0();

    void x();

    void x0(long j);

    void y(long j);

    void y0(String str);

    long z();

    boolean z0();

    /* compiled from: MusicPrefs.kt */
    /* renamed from: com.vk.music.pref.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C1353a {
        public static final /* synthetic */ C1353a a = new C1353a();
        private static final a STUB = new C1354a();

        public final a getSTUB() {
            return STUB;
        }

        /* compiled from: MusicPrefs.kt */
        /* renamed from: com.vk.music.pref.a$a$a, reason: collision with other inner class name */
        public static final class C1354a implements a {
            public long b;
            public boolean c;
            public boolean g;
            public boolean i;
            public long j;
            public String d = "flat";
            public String e = "";
            public final EmptySet f = EmptySet.b;
            public CrossfadeOnboarding h = CrossfadeOnboarding.BothOnboardings;

            @Override // com.vk.music.pref.a
            public final boolean A0() {
                return false;
            }

            @Override // com.vk.music.pref.a
            public final long B() {
                return 0L;
            }

            @Override // com.vk.music.pref.a
            public final void D(CrossfadeOnboarding crossfadeOnboarding) {
                this.h = crossfadeOnboarding;
            }

            @Override // com.vk.music.pref.a
            public final boolean E() {
                return false;
            }

            @Override // com.vk.music.pref.a
            public final void F0(long j) {
                this.b = j;
            }

            @Override // com.vk.music.pref.a
            public final long G() {
                return 0L;
            }

            @Override // com.vk.music.pref.a
            public final boolean G0() {
                return false;
            }

            @Override // com.vk.music.pref.a
            public final long H0() {
                return 0L;
            }

            @Override // com.vk.music.pref.a
            public final void I0(boolean z) {
                this.g = z;
            }

            @Override // com.vk.music.pref.a
            public final boolean K0() {
                return false;
            }

            @Override // com.vk.music.pref.a
            public final boolean L0() {
                return false;
            }

            @Override // com.vk.music.pref.a
            public final boolean M() {
                return false;
            }

            @Override // com.vk.music.pref.a
            public final Set<String> N0() {
                return EmptySet.b;
            }

            @Override // com.vk.music.pref.a
            public final boolean O() {
                return false;
            }

            @Override // com.vk.music.pref.a
            public final long O0() {
                return 0L;
            }

            @Override // com.vk.music.pref.a
            public final void P0(boolean z) {
                this.c = z;
            }

            @Override // com.vk.music.pref.a
            public final boolean Q() {
                return false;
            }

            @Override // com.vk.music.pref.a
            public final boolean R() {
                return false;
            }

            @Override // com.vk.music.pref.a
            public final String R0() {
                return this.d;
            }

            @Override // com.vk.music.pref.a
            public final boolean S() {
                return false;
            }

            @Override // com.vk.music.pref.a
            public final String U() {
                return "none";
            }

            @Override // com.vk.music.pref.a
            public final void W(boolean z) {
                this.i = z;
            }

            @Override // com.vk.music.pref.a
            public final long X() {
                return this.j;
            }

            @Override // com.vk.music.pref.a
            public final boolean Y() {
                return false;
            }

            @Override // com.vk.music.pref.a
            public final Long[] Z() {
                return new Long[0];
            }

            @Override // com.vk.music.pref.a
            public final boolean a() {
                return this.c;
            }

            @Override // com.vk.music.pref.a
            public final void a0(long j) {
                this.j = j;
            }

            @Override // com.vk.music.pref.a
            public final boolean b0() {
                return false;
            }

            @Override // com.vk.music.pref.a
            public final boolean c() {
                return this.i;
            }

            @Override // com.vk.music.pref.a
            public final long c0() {
                return 0L;
            }

            @Override // com.vk.music.pref.a
            public final long e0() {
                return 0L;
            }

            @Override // com.vk.music.pref.a
            public final boolean g0() {
                return false;
            }

            @Override // com.vk.music.pref.a
            public final boolean j0() {
                return false;
            }

            @Override // com.vk.music.pref.a
            public final float l() {
                return 1.0f;
            }

            @Override // com.vk.music.pref.a
            public final boolean l0() {
                return false;
            }

            @Override // com.vk.music.pref.a
            public final long m0() {
                return 0L;
            }

            @Override // com.vk.music.pref.a
            public final LoopMode n0() {
                return LoopMode.LIST;
            }

            @Override // com.vk.music.pref.a
            public final boolean o() {
                return false;
            }

            @Override // com.vk.music.pref.a
            public final long o0() {
                return 0L;
            }

            @Override // com.vk.music.pref.a
            public final Long[] p0() {
                return new Long[0];
            }

            @Override // com.vk.music.pref.a
            public final CrossfadeOnboarding q() {
                return this.h;
            }

            @Override // com.vk.music.pref.a
            public final Set<Long> r0() {
                return this.f;
            }

            @Override // com.vk.music.pref.a
            public final long s() {
                return 0L;
            }

            @Override // com.vk.music.pref.a
            public final Set<String> t() {
                return EmptySet.b;
            }

            @Override // com.vk.music.pref.a
            public final void t0(String str) {
                this.e = str;
            }

            @Override // com.vk.music.pref.a
            public final long v0() {
                return this.b;
            }

            @Override // com.vk.music.pref.a
            public final String w0() {
                return this.e;
            }

            @Override // com.vk.music.pref.a
            public final void y0(String str) {
                this.d = str;
            }

            @Override // com.vk.music.pref.a
            public final long z() {
                return 0L;
            }

            @Override // com.vk.music.pref.a
            public final boolean z0() {
                return this.g;
            }

            @Override // com.vk.music.pref.a
            public final void E0() {
            }

            @Override // com.vk.music.pref.a
            public final void N() {
            }

            @Override // com.vk.music.pref.a
            public final void V() {
            }

            @Override // com.vk.music.pref.a
            public final void k0() {
            }

            @Override // com.vk.music.pref.a
            public final void n() {
            }

            @Override // com.vk.music.pref.a
            public final void s0() {
            }

            @Override // com.vk.music.pref.a
            public final void u() {
            }

            @Override // com.vk.music.pref.a
            public final void u0() {
            }

            @Override // com.vk.music.pref.a
            public final void x() {
            }

            @Override // com.vk.music.pref.a
            public final void A(UserId userId) {
            }

            @Override // com.vk.music.pref.a
            public final void B0(boolean z) {
            }

            @Override // com.vk.music.pref.a
            public final void C(long j) {
            }

            @Override // com.vk.music.pref.a
            public final void D0(long j) {
            }

            @Override // com.vk.music.pref.a
            public final void F(boolean z) {
            }

            @Override // com.vk.music.pref.a
            public final void H(long j) {
            }

            @Override // com.vk.music.pref.a
            public final void I(long j) {
            }

            @Override // com.vk.music.pref.a
            public final void J(UserId userId) {
            }

            @Override // com.vk.music.pref.a
            public final void J0(float f) {
            }

            @Override // com.vk.music.pref.a
            public final void K(UserId userId) {
            }

            @Override // com.vk.music.pref.a
            public final void M0(boolean z) {
            }

            @Override // com.vk.music.pref.a
            public final void P(Long[] lArr) {
            }

            @Override // com.vk.music.pref.a
            public final void Q0(boolean z) {
            }

            @Override // com.vk.music.pref.a
            public final void T(String str) {
            }

            @Override // com.vk.music.pref.a
            public final void b(LoopMode loopMode) {
            }

            @Override // com.vk.music.pref.a
            public final void d(boolean z) {
            }

            @Override // com.vk.music.pref.a
            public final void d0(UserId userId) {
            }

            @Override // com.vk.music.pref.a
            public final void f0(long j) {
            }

            @Override // com.vk.music.pref.a
            public final void h0(Set<String> set) {
            }

            @Override // com.vk.music.pref.a
            public final void i0(UserId userId) {
            }

            @Override // com.vk.music.pref.a
            public final void m(UserId userId) {
            }

            @Override // com.vk.music.pref.a
            public final void p(long j) {
            }

            @Override // com.vk.music.pref.a
            public final void q0(UserId userId) {
            }

            @Override // com.vk.music.pref.a
            public final void r(UserId userId) {
            }

            @Override // com.vk.music.pref.a
            public final void v(long j) {
            }

            @Override // com.vk.music.pref.a
            public final void w(Long[] lArr) {
            }

            @Override // com.vk.music.pref.a
            public final void x0(long j) {
            }

            @Override // com.vk.music.pref.a
            public final void y(long j) {
            }

            @Override // com.vk.music.pref.a
            public final void C0(UserId userId, Set<String> set) {
            }

            @Override // com.vk.music.pref.a
            public final void L(UserId userId, String str) {
            }
        }
    }
}
