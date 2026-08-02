package com.vk.clips.attachments.impl.publish.geolocation.presentation;

import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.tr;
import xsna.urd0;
import xsna.vu5;
import xsna.wow;
import xsna.yzt0;

/* compiled from: ClipsGeoPickerViewState.kt */
/* loaded from: classes16.dex */
public final class j implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: ClipsGeoPickerViewState.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final int c;

        public a(String str, String str2, int i) {
            this.a = str;
            this.b = str2;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GeoItem(title=");
            sb.append(this.a);
            sb.append(", subtitle=");
            sb.append(this.b);
            sb.append(", id=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsGeoPickerViewState.kt */
    public static final class b implements d {
        public final yzt0<String> a;
        public final yzt0<wow<a>> b;

        public b(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(input=");
            sb.append(this.a);
            sb.append(", items=");
            return tr.c(sb, this.b, ')');
        }
    }

    /* compiled from: ClipsGeoPickerViewState.kt */
    public static final class c implements d {
        public static final c a = new c();
    }

    /* compiled from: ClipsGeoPickerViewState.kt */
    public interface d extends fm50<ClipsGeoPickerState> {
    }

    /* compiled from: ClipsGeoPickerViewState.kt */
    public static final class e implements d {
        public static final e a = new e();
    }

    public j(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
