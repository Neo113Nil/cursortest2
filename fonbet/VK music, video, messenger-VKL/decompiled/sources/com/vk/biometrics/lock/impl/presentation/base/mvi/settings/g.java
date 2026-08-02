package com.vk.biometrics.lock.impl.presentation.base.mvi.settings;

import android.content.Context;
import androidx.compose.runtime.a;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.e;
import com.vkontakte.android.R;
import xsna.a97;
import xsna.ao50;
import xsna.b97;
import xsna.c3j;
import xsna.d370;
import xsna.dlv0;
import xsna.f4z;
import xsna.f5z;
import xsna.fc0;
import xsna.gy0;
import xsna.gzs;
import xsna.h2p0;
import xsna.i47;
import xsna.i6v0;
import xsna.izs;
import xsna.jk50;
import xsna.k97;
import xsna.n0u0;
import xsna.oq0;
import xsna.s3q0;
import xsna.ug5;
import xsna.v;
import xsna.wh50;
import xsna.wj50;
import xsna.y87;
import xsna.yy;
import xsna.yzt0;
import xsna.z87;
import xsna.zy;

/* compiled from: BiometricsLockSettingsView.kt */
/* loaded from: classes15.dex */
public final class g extends i6v0<k97, a> {
    public final wj50<f> f;
    public final e.b.a g;
    public final dlv0 h;

    public g(f4z f4zVar, e.b.a aVar, dlv0 dlv0Var, f5z f5zVar, Context context) {
        super(context, f5zVar);
        this.f = f4zVar;
        this.g = aVar;
        this.h = dlv0Var;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        j((k97) ao50Var, izsVar, aVar, 512);
    }

    public final void h(e.b.a aVar, izs<? super a, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(1535266161);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1535266161, i2, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.settings.BiometricsLockSettingsView.InitialScreen (BiometricsLockSettingsView.kt:142)");
            }
            h.a(this.h, izsVar, aVar.b, aVar.a, aVar.c, M, i2 & 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fc0(this, aVar, izsVar, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(e.a aVar, izs<? super a, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        izs<? super a, s3q0> izsVar2;
        a.C0011a.C0012a c0012a;
        int i2;
        a.C0011a.C0012a c0012a2;
        androidx.compose.runtime.a M = aVar2.M(816384956);
        int i3 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(816384956, i3, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.settings.BiometricsLockSettingsView.MainScreen (BiometricsLockSettingsView.kt:79)");
            }
            yzt0<Boolean> yzt0Var = aVar.b;
            Boolean bool = Boolean.TRUE;
            boolean booleanValue = ((Boolean) jk50.d(yzt0Var, bool, M, 48).getValue()).booleanValue();
            boolean booleanValue2 = ((Boolean) jk50.d(aVar.a, bool, M, 48).getValue()).booleanValue();
            i47 i47Var = (i47) jk50.d(aVar.d, new i47(false, false, false), M, 0).getValue();
            int i4 = i3 & 112;
            h.a(this.h, izsVar, booleanValue, booleanValue2, (ug5) jk50.d(aVar.c, ug5.a.b, M, 48).getValue(), M, i4);
            izsVar2 = izsVar;
            boolean z = i47Var.a;
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            if (z) {
                M.K(-1474574881);
                String N = d370.N(R.string.bl_disable_secure_entrance_title, 0, M);
                String N2 = d370.N(R.string.bl_disable_secure_entrance_description, 0, M);
                String N3 = d370.N(R.string.bl_disable, 0, M);
                String N4 = d370.N(R.string.bl_cancel, 0, M);
                boolean z2 = i4 == 32;
                Object x = M.x();
                if (z2 || x == c0012a3) {
                    x = new y87(izsVar2, 0);
                    M.R(x);
                }
                izs izsVar3 = (izs) x;
                boolean y = M.y(this);
                Object x2 = M.x();
                if (y || x2 == c0012a3) {
                    x2 = new gy0(this, 9);
                    M.R(x2);
                }
                gzs gzsVar = (gzs) x2;
                boolean z3 = i4 == 32;
                Object x3 = M.x();
                if (z3 || x3 == c0012a3) {
                    x3 = new z87(izsVar2, 0);
                    M.R(x3);
                }
                c0012a = c0012a3;
                i2 = -1479099610;
                c3j.a(N3, N4, null, N, N2, false, izsVar3, gzsVar, (gzs) x3, M, 0, 36);
            } else {
                c0012a = c0012a3;
                i2 = -1479099610;
                M.K(-1479099610);
            }
            M.j();
            if (i47Var.b) {
                M.K(-1473767889);
                String N5 = d370.N(R.string.bl_biometrics_disabled_title, 0, M);
                String N6 = d370.N(R.string.bl_biometrics_disabled_description, 0, M);
                String N7 = d370.N(R.string.bl_open_settings, 0, M);
                String N8 = d370.N(R.string.bl_cancel, 0, M);
                Object x4 = M.x();
                a.C0011a.C0012a c0012a4 = c0012a;
                if (x4 == c0012a4) {
                    x4 = new yy(5);
                    M.R(x4);
                }
                izs izsVar4 = (izs) x4;
                boolean y2 = M.y(this);
                Object x5 = M.x();
                if (y2 || x5 == c0012a4) {
                    x5 = new zy(this, 10);
                    M.R(x5);
                }
                gzs gzsVar2 = (gzs) x5;
                boolean z4 = i4 == 32;
                Object x6 = M.x();
                if (z4 || x6 == c0012a4) {
                    x6 = new a97(izsVar2, 0);
                    M.R(x6);
                }
                c0012a2 = c0012a4;
                c3j.a(N7, N8, null, N5, N6, false, izsVar4, gzsVar2, (gzs) x6, M, 1769472, 4);
            } else {
                c0012a2 = c0012a;
                M.K(i2);
            }
            M.j();
            if (i47Var.c) {
                M.K(-1473007180);
                String N9 = d370.N(R.string.bl_too_many_biometrics_attempts_settings_title, 0, M);
                String N10 = d370.N(R.string.bl_too_many_biometrics_attempts_settings_description, 0, M);
                boolean z5 = i4 == 32;
                Object x7 = M.x();
                if (z5 || x7 == c0012a2) {
                    x7 = new b97(izsVar2, 0);
                    M.R(x7);
                }
                h2p0.a(null, N9, N10, (gzs) x7, M, 0, 1);
            } else {
                M.K(i2);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v(i, 1, this, aVar, izsVar2);
        }
    }

    public final void j(k97 k97Var, izs<? super a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1251592904);
        int i2 = (M.J(k97Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1251592904, i2, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.settings.BiometricsLockSettingsView.ThemedContent (BiometricsLockSettingsView.kt:65)");
            }
            wh50 d = d(e.b.a, new n0u0[]{k97Var.a}, M, (i2 & 896) | 6);
            if (((e) d.getValue()) instanceof e.a) {
                M.K(1593471329);
                i((e.a) ((e) d.getValue()), izsVar, M, i2 & 1008);
                M.j();
            } else {
                M.K(1593564732);
                h(this.g, izsVar, M, i2 & 1008);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new oq0(this, k97Var, izsVar, i, 1);
        }
    }
}
