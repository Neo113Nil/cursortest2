package com.vk.im.edu.ui.compose.item;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import com.vkontakte.android.R;
import xsna.epx;
import xsna.g84;
import xsna.ht7;
import xsna.izs;
import xsna.kai;
import xsna.qoy;
import xsna.rrv0;
import xsna.ry80;
import xsna.s3q0;
import xsna.shy;
import xsna.td;
import xsna.up;
import xsna.urd0;
import xsna.wa5;
import xsna.wh50;
import xsna.zak0;

/* compiled from: OrganizationItemView.kt */
/* loaded from: classes2.dex */
public final class OrganizationItemView extends td {
    public static final /* synthetic */ int m = 0;
    public final wh50 l;

    /* compiled from: OrganizationItemView.kt */
    public static final class a {
        public final long a;
        public final String b;
        public final String c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final izs<Long, s3q0> g;

        public a() {
            this(null, null, false, false, null, 127);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            int a = urd0.a(Long.hashCode(this.a) * 31, 31, this.b);
            String str = this.c;
            int b = qoy.b(qoy.b(shy.a(this.d, (a + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.e), 31, this.f);
            izs<Long, s3q0> izsVar = this.g;
            return b + (izsVar != null ? izsVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OrganizationItemViewObject(organizationId=");
            sb.append(this.a);
            sb.append(", organizationTitle=");
            sb.append(this.b);
            sb.append(", organizationDescription=");
            sb.append(this.c);
            sb.append(", organizationIcon=");
            sb.append(this.d);
            sb.append(", hasError=");
            sb.append(this.e);
            sb.append(", showChevron=");
            sb.append(this.f);
            sb.append(", onAction=");
            return up.c(sb, this.g, ')');
        }

        public a(String str, String str2, boolean z, boolean z2, g84 g84Var, int i) {
            str = (i & 2) != 0 ? "" : str;
            str2 = (i & 4) != 0 ? null : str2;
            z = (i & 16) != 0 ? false : z;
            z2 = (i & 32) != 0 ? false : z2;
            g84Var = (i & 64) != 0 ? null : g84Var;
            this.a = Long.MAX_VALUE;
            this.b = str;
            this.c = str2;
            this.d = R.drawable.vk_icon_bank_outline_24;
            this.e = z;
            this.f = z2;
            this.g = g84Var;
        }
    }

    public OrganizationItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.l = k.b(new a(null, null, false, false, null, 127));
    }

    private final a getOrganizationItemViewObject() {
        return (a) ((zak0) this.l).getValue();
    }

    private final void setOrganizationItemViewObject(a aVar) {
        ((zak0) this.l).setValue(aVar);
    }

    public static s3q0 z(OrganizationItemView organizationItemView, androidx.compose.runtime.a aVar, int i) {
        if (aVar.t(i & 1, (i & 3) != 2)) {
            if (b.d()) {
                b.f(1720137613, i, -1, "com.vk.im.edu.ui.compose.item.OrganizationItemView.Content.<anonymous> (OrganizationItemView.kt:23)");
            }
            ry80.a(organizationItemView.getOrganizationItemViewObject().a, organizationItemView.getOrganizationItemViewObject().b, organizationItemView.getOrganizationItemViewObject().d, null, organizationItemView.getOrganizationItemViewObject().e, organizationItemView.getOrganizationItemViewObject().c, organizationItemView.getOrganizationItemViewObject().f, 0, 0, organizationItemView.getOrganizationItemViewObject().g, aVar, 0);
            if (b.d()) {
                b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }

    public final void A(a aVar) {
        setOrganizationItemViewObject(aVar);
    }

    @Override // xsna.td
    public final void o(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1207287720);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(1207287720, i2, -1, "com.vk.im.edu.ui.compose.item.OrganizationItemView.Content (OrganizationItemView.kt:21)");
            }
            rrv0.d(null, null, null, null, kai.c(1720137613, new wa5(this, 9), M), M, 24576, 15);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new ht7(this, i, 9);
        }
    }
}
