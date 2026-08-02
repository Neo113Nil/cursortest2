package com.vk.profile.user.impl.ui;

import com.vk.dto.newsfeed.WallGetMode;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.profile.user.impl.ui.g;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.List;
import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.s1z;
import xsna.sr;
import xsna.tr;
import xsna.yzt0;

/* compiled from: UserProfileViewState.kt */
/* loaded from: classes5.dex */
public final class h implements ao50 {
    public final fi50 a;

    /* compiled from: UserProfileViewState.kt */
    public static final class a implements fm50<g> {
        public final yzt0<g.b> a;
        public final yzt0<Boolean> b;
        public final yzt0<Boolean> c;
        public final yzt0<Boolean> d;
        public final yzt0<List<UserProfileAdapterItem>> e;
        public final yzt0<g.a> f;
        public final yzt0<CommunityProfileContent> g;
        public final yzt0<WallGetMode> h;
        public final yzt0<ExtendedUserProfile> i;
        public final yzt0<s1z> j;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9, h0u0 h0u0Var10) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
            this.g = h0u0Var7;
            this.h = h0u0Var8;
            this.i = h0u0Var9;
            this.j = h0u0Var10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j);
        }

        public final int hashCode() {
            return this.j.hashCode() + sr.a(this.i, sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(showSkeleton=");
            sb.append(this.a);
            sb.append(", showSwipeToRefresh=");
            sb.append(this.b);
            sb.append(", showError=");
            sb.append(this.c);
            sb.append(", showLoader=");
            sb.append(this.d);
            sb.append(", profileItems=");
            sb.append(this.e);
            sb.append(", header=");
            sb.append(this.f);
            sb.append(", content=");
            sb.append(this.g);
            sb.append(", wallMode=");
            sb.append(this.h);
            sb.append(", profile=");
            sb.append(this.i);
            sb.append(", legoHeader=");
            return tr.c(sb, this.j, ')');
        }
    }

    public h(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
