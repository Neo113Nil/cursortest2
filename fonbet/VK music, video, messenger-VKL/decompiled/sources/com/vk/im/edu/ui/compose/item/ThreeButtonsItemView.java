package com.vk.im.edu.ui.compose.item;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import xsna.epx;
import xsna.f9h;
import xsna.gzs;
import xsna.kai;
import xsna.m2j;
import xsna.qoy;
import xsna.rrv0;
import xsna.s3q0;
import xsna.sfg;
import xsna.td;
import xsna.u61;
import xsna.uf3;
import xsna.vro0;
import xsna.wh50;
import xsna.zak0;

/* compiled from: ThreeButtonsItemView.kt */
/* loaded from: classes2.dex */
public final class ThreeButtonsItemView extends td {
    public static final /* synthetic */ int m = 0;
    public final wh50 l;

    /* compiled from: ThreeButtonsItemView.kt */
    public static final class a {
        public final gzs<s3q0> a;
        public final gzs<s3q0> b;

        public a() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int b = qoy.b(Boolean.hashCode(false) * 31, 31, false);
            gzs<s3q0> gzsVar = this.a;
            int hashCode = (b + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
            gzs<s3q0> gzsVar2 = this.b;
            return hashCode + (gzsVar2 != null ? gzsVar2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ThreeButtonsItemViewObject(showInvite=false, showAllOrgs=false, onInviteAction=");
            sb.append(this.a);
            sb.append(", onShowAllAction=");
            return uf3.d(sb, this.b, ')');
        }

        public a(sfg sfgVar, m2j m2jVar) {
            this.a = sfgVar;
            this.b = m2jVar;
        }
    }

    public ThreeButtonsItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.l = k.b(new a(null, null));
    }

    private final a getThreeButtonsItemViewObject() {
        return (a) ((zak0) this.l).getValue();
    }

    private final void setThreeButtonsItemViewObject(a aVar) {
        ((zak0) this.l).setValue(aVar);
    }

    public static s3q0 z(ThreeButtonsItemView threeButtonsItemView, androidx.compose.runtime.a aVar, int i) {
        if (aVar.t(i & 1, (i & 3) != 2)) {
            if (b.d()) {
                b.f(141581805, i, -1, "com.vk.im.edu.ui.compose.item.ThreeButtonsItemView.Content.<anonymous> (ThreeButtonsItemView.kt:22)");
            }
            threeButtonsItemView.getThreeButtonsItemViewObject().getClass();
            threeButtonsItemView.getThreeButtonsItemViewObject().getClass();
            vro0.a(0, aVar, threeButtonsItemView.getThreeButtonsItemViewObject().a, threeButtonsItemView.getThreeButtonsItemViewObject().b, null);
            if (b.d()) {
                b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }

    public final void A(a aVar) {
        setThreeButtonsItemViewObject(aVar);
    }

    @Override // xsna.td
    public final void o(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-371268088);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(-371268088, i2, -1, "com.vk.im.edu.ui.compose.item.ThreeButtonsItemView.Content (ThreeButtonsItemView.kt:20)");
            }
            rrv0.d(null, null, null, null, kai.c(141581805, new f9h(this, 12), M), M, 24576, 15);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new u61(this, i, 11);
        }
    }
}
