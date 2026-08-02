package com.vk.newsfeed.posting.geo_picker.presentation;

import defpackage.q0;
import java.util.List;
import xsna.yqa0;

/* compiled from: PlacePickerListViewState.kt */
/* loaded from: classes4.dex */
public abstract class c {

    /* compiled from: PlacePickerListViewState.kt */
    public static final class a extends c {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1792553724;
        }

        public final String toString() {
            return "EmptyListState";
        }
    }

    /* compiled from: PlacePickerListViewState.kt */
    public static final class b extends c {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 947802903;
        }

        public final String toString() {
            return "EmptySearchResultListState";
        }
    }

    /* compiled from: PlacePickerListViewState.kt */
    /* renamed from: com.vk.newsfeed.posting.geo_picker.presentation.c$c, reason: collision with other inner class name */
    public static final class C1414c extends c {
        public static final C1414c a = new C1414c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1414c);
        }

        public final int hashCode() {
            return -1940846431;
        }

        public final String toString() {
            return "ErrorListState";
        }
    }

    /* compiled from: PlacePickerListViewState.kt */
    public static final class d extends c {
        public final List<yqa0> a;

        public d(List list) {
            this.a = list;
        }
    }

    /* compiled from: PlacePickerListViewState.kt */
    public static final class e extends c {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1044980115;
        }

        public final String toString() {
            return "LoadingListState";
        }
    }

    /* compiled from: PlacePickerListViewState.kt */
    public static final class f extends c {
        public final boolean a;
        public final boolean b;

        public f(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && this.b == fVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PermissionListState(isGeoRestrictedDevice=");
            sb.append(this.a);
            sb.append(", isGeoRestrictedApplication=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: PlacePickerListViewState.kt */
    public static final class g extends c {
        public final boolean a;
        public final List<yqa0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public g(boolean z, List<? extends yqa0> list) {
            this.a = z;
            this.b = list;
        }
    }
}
