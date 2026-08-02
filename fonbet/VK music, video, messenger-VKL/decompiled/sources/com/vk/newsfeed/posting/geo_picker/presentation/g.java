package com.vk.newsfeed.posting.geo_picker.presentation;

import android.location.Location;
import com.vk.newsfeed.posting.geo_picker.presentation.PlacePickerState;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.qr;
import xsna.shy;
import xsna.vu5;
import xsna.xl50;
import xsna.yqa0;

/* compiled from: PlacePickerPatch.kt */
/* loaded from: classes4.dex */
public interface g extends xl50 {

    /* compiled from: PlacePickerPatch.kt */
    public static final class a implements g {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1939342148;
        }

        public final String toString() {
            return "ErrorPatch";
        }
    }

    /* compiled from: PlacePickerPatch.kt */
    public static final class b implements g {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 791666112;
        }

        public final String toString() {
            return "HideLoadingNextPage";
        }
    }

    /* compiled from: PlacePickerPatch.kt */
    public static final class c implements g {
    }

    /* compiled from: PlacePickerPatch.kt */
    public static final class d implements g {
        public final PlacePickerState.LoadingState b;

        public d(PlacePickerState.LoadingState loadingState) {
            this.b = loadingState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "LoadingStatePatch(loadingState=" + this.b + ')';
        }
    }

    /* compiled from: PlacePickerPatch.kt */
    public static final class e implements g {
        public final ArrayList b;
        public final int c;
        public final int d;

        public e(ArrayList arrayList, int i, int i2) {
            this.b = arrayList;
            this.c = i;
            this.d = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b.equals(eVar.b) && this.c == eVar.c && this.d == eVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PageLoaded(items=");
            sb.append(this.b);
            sb.append(", offset=");
            sb.append(this.c);
            sb.append(", totalCount=");
            return vu5.b(sb, this.d, ')');
        }
    }

    /* compiled from: PlacePickerPatch.kt */
    public static final class f implements g {
        public final boolean b;
        public final boolean c;

        public f(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.b == fVar.b && this.c == fVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PermissionGranted(isGeoRestrictedDevice=");
            sb.append(this.b);
            sb.append(", isGeoRestrictedApplication=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: PlacePickerPatch.kt */
    /* renamed from: com.vk.newsfeed.posting.geo_picker.presentation.g$g, reason: collision with other inner class name */
    public static final class C1416g implements g {
        public final String b;
        public final Location c;
        public final List<yqa0> d;
        public final int e;
        public final int f;
        public final boolean g;

        /* JADX WARN: Multi-variable type inference failed */
        public C1416g(String str, Location location, List<? extends yqa0> list, int i, int i2, boolean z) {
            this.b = str;
            this.c = location;
            this.d = list;
            this.e = i;
            this.f = i2;
            this.g = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1416g)) {
                return false;
            }
            C1416g c1416g = (C1416g) obj;
            return epx.f(this.b, c1416g.b) && epx.f(this.c, c1416g.c) && epx.f(this.d, c1416g.d) && this.e == c1416g.e && this.f == c1416g.f && this.g == c1416g.g;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            Location location = this.c;
            return Boolean.hashCode(this.g) + shy.a(this.f, shy.a(this.e, fw3.a((hashCode + (location == null ? 0 : location.hashCode())) * 31, 31, this.d), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ScreenReloaded(query=");
            sb.append(this.b);
            sb.append(", currentLocation=");
            sb.append(this.c);
            sb.append(", items=");
            sb.append(this.d);
            sb.append(", offset=");
            sb.append(this.e);
            sb.append(", totalCount=");
            sb.append(this.f);
            sb.append(", isNeedPermission=");
            return q0.a(sb, this.g, ')');
        }
    }

    /* compiled from: PlacePickerPatch.kt */
    public static final class h implements g {
    }

    /* compiled from: PlacePickerPatch.kt */
    public static final class i implements g {
        public final String b;
        public final Location c;
        public final ArrayList d;
        public final int e;
        public final int f;

        public i(String str, Location location, ArrayList arrayList, int i, int i2) {
            this.b = str;
            this.c = location;
            this.d = arrayList;
            this.e = i;
            this.f = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.b, iVar.b) && epx.f(this.c, iVar.c) && this.d.equals(iVar.d) && this.e == iVar.e && this.f == iVar.f;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            Location location = this.c;
            return Integer.hashCode(this.f) + shy.a(this.e, qr.a(this.d, (hashCode + (location == null ? 0 : location.hashCode())) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchResult(query=");
            sb.append(this.b);
            sb.append(", location=");
            sb.append(this.c);
            sb.append(", items=");
            sb.append(this.d);
            sb.append(", offset=");
            sb.append(this.e);
            sb.append(", totalCount=");
            return vu5.b(sb, this.f, ')');
        }
    }

    /* compiled from: PlacePickerPatch.kt */
    public static final class j implements g {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1803660635;
        }

        public final String toString() {
            return "ShowLoadingNextPage";
        }
    }

    /* compiled from: PlacePickerPatch.kt */
    public static final class k implements g {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1042403089;
        }

        public final String toString() {
            return "ShowRetryLoadingNextPage";
        }
    }

    /* compiled from: PlacePickerPatch.kt */
    public interface l extends g {

        /* compiled from: PlacePickerPatch.kt */
        public static final class a implements l {
            public final long b;

            public a(long j) {
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("Interactive(elapsedTime="));
            }
        }

        /* compiled from: PlacePickerPatch.kt */
        public static final class b implements l {
            public final long b;

            public b(long j) {
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("Pick(elapsedTime="));
            }
        }

        /* compiled from: PlacePickerPatch.kt */
        public static final class c implements l {
            public final long b;

            public c(long j) {
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.b == ((c) obj).b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("SaveStartTime(elapsedTime="));
            }
        }
    }
}
