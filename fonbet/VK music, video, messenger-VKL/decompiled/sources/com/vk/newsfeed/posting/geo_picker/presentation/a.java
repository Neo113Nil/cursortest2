package com.vk.newsfeed.posting.geo_picker.presentation;

import com.vk.newsfeed.posting.impl.domain.model.NearbyPlaces;
import defpackage.q0;
import xsna.epx;
import xsna.ho8;
import xsna.kj50;
import xsna.vu5;

/* compiled from: PlacePickerAction.kt */
/* loaded from: classes4.dex */
public interface a extends kj50 {

    /* compiled from: PlacePickerAction.kt */
    /* renamed from: com.vk.newsfeed.posting.geo_picker.presentation.a$a, reason: collision with other inner class name */
    public interface InterfaceC1406a extends a {

        /* compiled from: PlacePickerAction.kt */
        /* renamed from: com.vk.newsfeed.posting.geo_picker.presentation.a$a$a, reason: collision with other inner class name */
        public static final class C1407a implements InterfaceC1406a {
            public final long b;
            public final NearbyPlaces c;

            public C1407a(long j, NearbyPlaces nearbyPlaces) {
                this.b = j;
                this.c = nearbyPlaces;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1407a)) {
                    return false;
                }
                C1407a c1407a = (C1407a) obj;
                return this.b == c1407a.b && epx.f(this.c, c1407a.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (Long.hashCode(this.b) * 31);
            }

            public final String toString() {
                return "Init(startScreenElapsedTime=" + this.b + ", nearbyPlaces=" + this.c + ')';
            }
        }

        /* compiled from: PlacePickerAction.kt */
        /* renamed from: com.vk.newsfeed.posting.geo_picker.presentation.a$a$b */
        public static final class b implements InterfaceC1406a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1683502296;
            }

            public final String toString() {
                return "LoadNextPage";
            }
        }

        /* compiled from: PlacePickerAction.kt */
        /* renamed from: com.vk.newsfeed.posting.geo_picker.presentation.a$a$c */
        public static final class c implements InterfaceC1406a {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1987140315;
            }

            public final String toString() {
                return "Refresh";
            }
        }

        /* compiled from: PlacePickerAction.kt */
        /* renamed from: com.vk.newsfeed.posting.geo_picker.presentation.a$a$d */
        public static final class d implements InterfaceC1406a {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -74270311;
            }

            public final String toString() {
                return "Reload";
            }
        }

        /* compiled from: PlacePickerAction.kt */
        /* renamed from: com.vk.newsfeed.posting.geo_picker.presentation.a$a$e */
        public static final class e implements InterfaceC1406a {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -1387861336;
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* compiled from: PlacePickerAction.kt */
        /* renamed from: com.vk.newsfeed.posting.geo_picker.presentation.a$a$f */
        public static final class f implements InterfaceC1406a {
            public final String b;

            public f(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Search(query="), this.b, ')');
            }
        }
    }

    /* compiled from: PlacePickerAction.kt */
    public interface b extends a {

        /* compiled from: PlacePickerAction.kt */
        /* renamed from: com.vk.newsfeed.posting.geo_picker.presentation.a$b$a, reason: collision with other inner class name */
        public static final class C1408a implements b {
            public static final C1408a b = new C1408a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1408a);
            }

            public final int hashCode() {
                return -507149488;
            }

            public final String toString() {
                return "Grant";
            }
        }

        /* compiled from: PlacePickerAction.kt */
        /* renamed from: com.vk.newsfeed.posting.geo_picker.presentation.a$b$b, reason: collision with other inner class name */
        public static final class C1409b implements b {
            public final boolean b;
            public final boolean c;

            public C1409b(boolean z, boolean z2) {
                this.b = z;
                this.c = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1409b)) {
                    return false;
                }
                C1409b c1409b = (C1409b) obj;
                return this.b == c1409b.b && this.c == c1409b.c;
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
    }

    /* compiled from: PlacePickerAction.kt */
    public interface c extends a {

        /* compiled from: PlacePickerAction.kt */
        /* renamed from: com.vk.newsfeed.posting.geo_picker.presentation.a$c$a, reason: collision with other inner class name */
        public static final class C1410a implements c {
            public final String b;

            public C1410a(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1410a) && epx.f(this.b, ((C1410a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Query(text="), this.b, ')');
            }
        }

        /* compiled from: PlacePickerAction.kt */
        public static final class b implements c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1859467780;
            }

            public final String toString() {
                return "QueryClick";
            }
        }

        /* compiled from: PlacePickerAction.kt */
        /* renamed from: com.vk.newsfeed.posting.geo_picker.presentation.a$c$c, reason: collision with other inner class name */
        public static final class C1411c implements c {
        }
    }

    /* compiled from: PlacePickerAction.kt */
    public interface d extends a {

        /* compiled from: PlacePickerAction.kt */
        /* renamed from: com.vk.newsfeed.posting.geo_picker.presentation.a$d$a, reason: collision with other inner class name */
        public static final class C1412a implements d {
            public final long b;

            public C1412a(long j) {
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1412a) && this.b == ((C1412a) obj).b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("Interactive(elapsedTime="));
            }
        }

        /* compiled from: PlacePickerAction.kt */
        public static final class b implements d {
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

        /* compiled from: PlacePickerAction.kt */
        public static final class c implements d {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1791724721;
            }

            public final String toString() {
                return "Send";
            }
        }

        /* compiled from: PlacePickerAction.kt */
        /* renamed from: com.vk.newsfeed.posting.geo_picker.presentation.a$d$d, reason: collision with other inner class name */
        public static final class C1413d implements d {
            public final long b;

            public C1413d(long j) {
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1413d) && this.b == ((C1413d) obj).b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("StartScreen(elapsedTime="));
            }
        }
    }
}
