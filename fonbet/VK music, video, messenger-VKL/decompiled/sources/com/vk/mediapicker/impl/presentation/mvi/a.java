package com.vk.mediapicker.impl.presentation.mvi;

import defpackage.q0;
import xsna.lj50;
import xsna.vu5;

/* compiled from: MediaPickerMviAction.kt */
/* loaded from: classes3.dex */
public interface a extends lj50 {

    /* compiled from: MediaPickerMviAction.kt */
    /* renamed from: com.vk.mediapicker.impl.presentation.mvi.a$a, reason: collision with other inner class name */
    public static final class C1266a implements a {
        public final int b;

        public C1266a(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1266a) && this.b == ((C1266a) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("AlbumSelected(id="), this.b, ')');
        }
    }

    /* compiled from: MediaPickerMviAction.kt */
    public static final class b implements a {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1078957899;
        }

        public final String toString() {
            return "CameraClick";
        }
    }

    /* compiled from: MediaPickerMviAction.kt */
    public static final class c implements a {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -821705498;
        }

        public final String toString() {
            return "ClearSelections";
        }
    }

    /* compiled from: MediaPickerMviAction.kt */
    public static final class d implements a {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1794948152;
        }

        public final String toString() {
            return "CloseActionClick";
        }
    }

    /* compiled from: MediaPickerMviAction.kt */
    public static final class e implements a {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 724325910;
        }

        public final String toString() {
            return "LoadNextPage";
        }
    }

    /* compiled from: MediaPickerMviAction.kt */
    public static final class f implements a {
        public final int b;

        public f(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("MediaClick(itemId="), this.b, ')');
        }
    }

    /* compiled from: MediaPickerMviAction.kt */
    public static final class g implements a {
        public final int b;

        public g(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("MediaLongClick(itemId="), this.b, ')');
        }
    }

    /* compiled from: MediaPickerMviAction.kt */
    public static final class h implements a {
        public final int b;

        public h(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b == ((h) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("MediaSelectorClick(itemId="), this.b, ')');
        }
    }

    /* compiled from: MediaPickerMviAction.kt */
    public static final class i implements a {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -222355857;
        }

        public final String toString() {
            return "PartMediaWarningClick";
        }
    }

    /* compiled from: MediaPickerMviAction.kt */
    public static final class j implements a {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1331695048;
        }

        public final String toString() {
            return "PermissionDenied";
        }
    }

    /* compiled from: MediaPickerMviAction.kt */
    public static final class k implements a {
        public final boolean b;

        public k(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.b == ((k) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("PermissionGranted(isPartPermission="), this.b, ')');
        }
    }

    /* compiled from: MediaPickerMviAction.kt */
    public static final class l implements a {
        public static final l b = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 36017322;
        }

        public final String toString() {
            return "ProceedSelectedMedias";
        }
    }

    /* compiled from: MediaPickerMviAction.kt */
    public static final class m implements a {
        public static final m b = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -2141137509;
        }

        public final String toString() {
            return "Resume";
        }
    }

    /* compiled from: MediaPickerMviAction.kt */
    public static final class n implements a {
        public static final n b = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -2093043755;
        }

        public final String toString() {
            return "ViewCreated";
        }
    }
}
