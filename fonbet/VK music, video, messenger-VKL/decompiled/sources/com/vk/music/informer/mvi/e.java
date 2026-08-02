package com.vk.music.informer.mvi;

import defpackage.q0;
import xsna.epx;
import xsna.ho8;
import xsna.kj50;

/* compiled from: MusicPlayerInformerMviAction.kt */
/* loaded from: classes3.dex */
public interface e extends kj50 {

    /* compiled from: MusicPlayerInformerMviAction.kt */
    public static final class a implements e {
        public final boolean b;

        public a(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ChangeVisibility(isVisible="), this.b, ')');
        }
    }

    /* compiled from: MusicPlayerInformerMviAction.kt */
    public static final class b implements e {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1295288499;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: MusicPlayerInformerMviAction.kt */
    public static final class c implements e {
        public final String b;

        public c(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Open(url="), this.b, ')');
        }
    }

    /* compiled from: MusicPlayerInformerMviAction.kt */
    public static final class d implements e {
        public final boolean b;

        public d(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("PlayerStateChanged(isCollapsed="), this.b, ')');
        }
    }
}
