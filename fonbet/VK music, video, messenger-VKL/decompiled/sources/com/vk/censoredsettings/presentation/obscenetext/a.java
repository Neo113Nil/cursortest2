package com.vk.censoredsettings.presentation.obscenetext;

import defpackage.q0;
import xsna.kj50;

/* compiled from: ObsceneTextFilterAction.kt */
/* loaded from: classes16.dex */
public abstract class a implements kj50 {

    /* compiled from: ObsceneTextFilterAction.kt */
    /* renamed from: com.vk.censoredsettings.presentation.obscenetext.a$a, reason: collision with other inner class name */
    public static final class C0526a extends a {
        public static final C0526a b = new C0526a();
    }

    /* compiled from: ObsceneTextFilterAction.kt */
    public static final class b extends a {
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
            return q0.a(new StringBuilder("SwitchFilter(isEnabled="), this.b, ')');
        }
    }
}
