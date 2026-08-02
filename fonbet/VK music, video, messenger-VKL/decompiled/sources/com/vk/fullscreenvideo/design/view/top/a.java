package com.vk.fullscreenvideo.design.view.top;

import android.graphics.Rect;
import com.vk.dto.common.VideoFile;
import com.vk.fullscreenvideo.ControlsState;
import com.vk.fullscreenvideo.a;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.izs;
import xsna.jq;
import xsna.qoy;
import xsna.s3q0;
import xsna.y6c;

/* compiled from: TopControlsView.kt */
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: TopControlsView.kt */
    /* renamed from: com.vk.fullscreenvideo.design.view.top.a$a, reason: collision with other inner class name */
    public static final class C1076a {
        public final boolean a;
        public final ControlsState.ScreenState b;
        public final VideoFile c;
        public final boolean d;
        public final b e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final boolean l;
        public final boolean m;
        public final boolean n;
        public final ControlsState.CastStatus o;

        /* compiled from: TopControlsView.kt */
        /* renamed from: com.vk.fullscreenvideo.design.view.top.a$a$a, reason: collision with other inner class name */
        public static final class C1077a {
            public final y6c a;
            public final String b;

            public C1077a(y6c y6cVar, String str) {
                this.a = y6cVar;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1077a)) {
                    return false;
                }
                C1077a c1077a = (C1077a) obj;
                return this.a.equals(c1077a.a) && this.b.equals(c1077a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DonutChip(text=");
                sb.append(this.a);
                sb.append(", contentDescription=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: TopControlsView.kt */
        /* renamed from: com.vk.fullscreenvideo.design.view.top.a$a$b */
        public static final class b {
            public final String a;
            public final boolean b;
            public final C1077a c;

            public b(String str, boolean z, C1077a c1077a) {
                this.a = str;
                this.b = z;
                this.c = c1077a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
                C1077a c1077a = this.c;
                return b + (c1077a == null ? 0 : c1077a.hashCode());
            }

            public final String toString() {
                return "User(name=" + this.a + ", isVerified=" + this.b + ", donutChip=" + this.c + ')';
            }
        }

        public C1076a(boolean z, ControlsState.ScreenState screenState, VideoFile videoFile, boolean z2, b bVar, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, ControlsState.CastStatus castStatus) {
            this.a = z;
            this.b = screenState;
            this.c = videoFile;
            this.d = z2;
            this.e = bVar;
            this.f = z3;
            this.g = z4;
            this.h = z5;
            this.i = z6;
            this.j = z7;
            this.k = z8;
            this.l = z9;
            this.m = z10;
            this.n = z11;
            this.o = castStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1076a)) {
                return false;
            }
            C1076a c1076a = (C1076a) obj;
            return this.a == c1076a.a && this.b == c1076a.b && epx.f(this.c, c1076a.c) && this.d == c1076a.d && this.e.equals(c1076a.e) && this.f == c1076a.f && this.g == c1076a.g && this.h == c1076a.h && this.i == c1076a.i && this.j == c1076a.j && this.k == c1076a.k && this.l == c1076a.l && this.m == c1076a.m && this.n == c1076a.n && this.o == c1076a.o;
        }

        public final int hashCode() {
            return this.o.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.e.hashCode() + qoy.b(jq.b(this.c, (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31), 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, false), 31, this.n);
        }

        public final String toString() {
            return "State(isLandscape=" + this.a + ", screenState=" + this.b + ", videoFile=" + this.c + ", shouldShowFeedback=" + this.d + ", user=" + this.e + ", isAutoplayEnabled=" + this.f + ", isAutoplayInactive=" + this.g + ", shouldShowAutoplay=" + this.h + ", isHorizontalRedesignEnabled=" + this.i + ", isVerticalRedesignEnabled=" + this.j + ", isSubscribeButtonEnabled=" + this.k + ", canShowSubscribe=" + this.l + ", isSubscribed=" + this.m + ", isNavigationToAuthorDisabled=false, isDiscoveryRedesignEnabled=" + this.n + ", castStatus=" + this.o + ')';
        }
    }

    void a(ControlsState.CastStatus castStatus);

    void d(boolean z, boolean z2);

    Rect getSettingsButtonBoundsInWindow();

    void setControls(List<? extends a.d> list);

    void setIsAutoplayInactive(boolean z);

    void setOnClickAction(izs<? super com.vk.fullscreenvideo.a, s3q0> izsVar);

    void setScreenState(ControlsState.ScreenState screenState);

    void setSmallScreenMode(boolean z);

    void setState(C1076a c1076a);
}
