package com.vk.attachpicker.screen;

import defpackage.q0;

/* compiled from: EditorScreenState.kt */
/* loaded from: classes15.dex */
public interface i {

    /* compiled from: EditorScreenState.kt */
    public static final class a implements i {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // com.vk.attachpicker.screen.i
        public final boolean a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("Editing(isModified="), this.a, ')');
        }
    }

    /* compiled from: EditorScreenState.kt */
    public static final class b implements i {
        public static final b a = new b();
        public static final boolean b = true;

        @Override // com.vk.attachpicker.screen.i
        public final boolean a() {
            return b;
        }
    }

    /* compiled from: EditorScreenState.kt */
    public static final class c implements i {
        public final boolean a;
        public final boolean b;

        public c(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        @Override // com.vk.attachpicker.screen.i
        public final boolean a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Rendering(isModified=");
            sb.append(this.a);
            sb.append(", justSpoilerChanged=");
            return q0.a(sb, this.b, ')');
        }
    }

    boolean a();
}
