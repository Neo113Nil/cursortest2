package com.vk.censoredsettings.presentation.obscenetext;

import defpackage.q0;
import xsna.xl50;

/* compiled from: ObsceneTextFilterPatch.kt */
/* loaded from: classes16.dex */
public abstract class c implements xl50 {

    /* compiled from: ObsceneTextFilterPatch.kt */
    public static final class a extends c {
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
            return q0.a(new StringBuilder("Initial(isObsceneTextFilterEnabled="), this.b, ')');
        }
    }

    /* compiled from: ObsceneTextFilterPatch.kt */
    public static final class b extends c {
        public final boolean b;

        public b(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("SettingChanged(isObsceneTextFilterEnabled="), this.b, ')');
        }
    }
}
