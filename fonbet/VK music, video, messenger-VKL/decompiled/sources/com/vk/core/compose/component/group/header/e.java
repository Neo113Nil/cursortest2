package com.vk.core.compose.component.group.header;

import androidx.compose.runtime.a;
import androidx.compose.runtime.k;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.movika.sdk.base.logic.interactor.m;
import xsna.gzs;
import xsna.jgz;
import xsna.l5g;
import xsna.lg90;
import xsna.nzu0;
import xsna.q630;
import xsna.txj0;
import xsna.wh50;
import xsna.xrc;
import xsna.zak0;
import xsna.zy60;

/* compiled from: GroupHeader.kt */
/* loaded from: classes17.dex */
public final class e {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    /* compiled from: GroupHeader.kt */
    public static final class a {
        public static e a(lg90 lg90Var, long j, String str, com.vk.core.compose.component.semantics.a aVar, gzs gzsVar, androidx.compose.runtime.a aVar2, int i, int i2) {
            String str2 = (i2 & 4) != 0 ? null : str;
            com.vk.core.compose.component.semantics.a aVar3 = (i2 & 8) != 0 ? null : aVar;
            gzs gzsVar2 = (i2 & 16) != 0 ? null : gzsVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1790847485, i, -1, "com.vk.core.compose.component.group.header.GroupHeader.Title.Along.Icon.Companion.invoke (GroupHeader.kt:293)");
            }
            Object x = aVar2.x();
            if (x == a.C0011a.a) {
                e eVar = new e(j, aVar3, str2, gzsVar2, lg90Var);
                aVar2.R(eVar);
                x = eVar;
            }
            e eVar2 = (e) x;
            ((zak0) eVar2.a).setValue(lg90Var);
            ((zak0) eVar2.b).setValue(new l5g(j));
            ((zak0) eVar2.c).setValue(str2);
            ((zak0) eVar2.d).setValue(aVar3);
            ((zak0) eVar2.e).setValue(gzsVar2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return eVar2;
        }
    }

    public e() {
        throw null;
    }

    public e(long j, SemanticsConfiguration semanticsConfiguration, String str, gzs gzsVar, lg90 lg90Var) {
        this.a = k.b(lg90Var);
        this.b = zy60.d(j);
        this.c = k.b(str);
        this.d = k.b(semanticsConfiguration);
        this.e = k.b(gzsVar);
    }

    public final void a(int i, androidx.compose.runtime.a aVar, b bVar, f.b bVar2) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1673708461);
        if ((196608 & i) == 0) {
            i2 = (M.J(this) ? 131072 : 65536) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (65537 & i2) != 65536)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1673708461, i2, -1, "com.vk.core.compose.component.group.header.GroupHeader.Title.Along.Icon.Content (GroupHeader.kt:272)");
            }
            q630 q = txj0.q(com.vk.core.compose.component.semantics.b.b(q630.a.a, (SemanticsConfiguration) ((zak0) this.d).getValue()), jgz.s().d);
            lg90 lg90Var = (lg90) ((zak0) this.a).getValue();
            long j = ((l5g) ((zak0) this.b).getValue()).a;
            String str = (String) ((zak0) this.c).getValue();
            wh50 wh50Var = this.e;
            gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
            if (gzsVar == null) {
                M.K(-1172852915);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new m(14);
                    M.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                M.K(-2116044288);
            }
            M.j();
            nzu0.c(gzsVar, lg90Var, str, q, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, false, null, ((gzs) ((zak0) wh50Var).getValue()) != null, null, null, M, 64, 1744);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xrc(this, bVar2, bVar, i);
        }
    }
}
