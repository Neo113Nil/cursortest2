package com.vk.im.ui.components.viewcontrollers.dialog_header.info;

import defpackage.q0;
import xsna.biu;

/* compiled from: MenuCallButtonState.kt */
/* loaded from: classes2.dex */
public abstract class c {

    /* compiled from: MenuCallButtonState.kt */
    public static final class a extends c {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
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
            return q0.a(new StringBuilder("Audio(isChat="), this.a, ')');
        }
    }

    /* compiled from: MenuCallButtonState.kt */
    public static final class b extends c {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 348244495;
        }

        public final String toString() {
            return "AudioVideo";
        }
    }

    /* compiled from: MenuCallButtonState.kt */
    /* renamed from: com.vk.im.ui.components.viewcontrollers.dialog_header.info.c$c, reason: collision with other inner class name */
    public static final class C1163c extends c {
        public static final C1163c a = new C1163c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1163c);
        }

        public final int hashCode() {
            return 557850450;
        }

        public final String toString() {
            return "AudioWithMax";
        }
    }

    /* compiled from: MenuCallButtonState.kt */
    public static final class d extends c {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 276484771;
        }

        public final String toString() {
            return "Invisible";
        }
    }

    /* compiled from: MenuCallButtonState.kt */
    public static final class e extends c {
        public final biu a;

        public e(biu biuVar) {
            this.a = biuVar;
        }
    }

    /* compiled from: MenuCallButtonState.kt */
    public static final class f extends c {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1102966159;
        }

        public final String toString() {
            return "Video";
        }
    }
}
