package com.vk.photos.root.photoflow.presentation;

import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.oq;
import xsna.qba0;
import xsna.qoy;
import xsna.sr;
import xsna.tr;
import xsna.y7a0;
import xsna.yzt0;

/* compiled from: PhotoFlowViewState.kt */
/* loaded from: classes4.dex */
public final class l implements ao50 {
    public final fi50 a;

    /* compiled from: PhotoFlowViewState.kt */
    public static final class a implements fm50<h> {
        public final yzt0<Boolean> a;
        public final yzt0<Boolean> b;
        public final yzt0<b> c;
        public final yzt0<c> d;
        public final yzt0<List<qba0>> e;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(isCurrentUser=");
            sb.append(this.a);
            sb.append(", showSkeleton=");
            sb.append(this.b);
            sb.append(", headerState=");
            sb.append(this.c);
            sb.append(", photosListState=");
            sb.append(this.d);
            sb.append(", photoTags=");
            return tr.c(sb, this.e, ')');
        }
    }

    /* compiled from: PhotoFlowViewState.kt */
    public static final class b {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public b(boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HeaderState(isVisible=");
            sb.append(this.a);
            sb.append(", isAddPhotoVisible=");
            sb.append(this.b);
            sb.append(", isInMultiSelect=");
            sb.append(this.c);
            sb.append(", isMultiSelectOptionsVisible=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: PhotoFlowViewState.kt */
    public static final class c {
        public final List<y7a0> a;
        public final Integer b;
        public final Throwable c;

        public c(ArrayList arrayList, Integer num, Throwable th) {
            this.a = arrayList;
            this.b = num;
            this.c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            List<y7a0> list = this.a;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Throwable th = this.c;
            return hashCode2 + (th != null ? th.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ListState(photos=");
            sb.append(this.a);
            sb.append(", counter=");
            sb.append(this.b);
            sb.append(", error=");
            return oq.c(sb, this.c, ')');
        }
    }

    public l(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
