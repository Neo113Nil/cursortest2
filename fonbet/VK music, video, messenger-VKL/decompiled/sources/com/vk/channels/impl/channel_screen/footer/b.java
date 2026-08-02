package com.vk.channels.impl.channel_screen.footer;

import defpackage.q0;
import xsna.kj50;
import xsna.vu5;

/* compiled from: ChannelFooterAction.kt */
/* loaded from: classes16.dex */
public abstract class b implements kj50 {

    /* compiled from: ChannelFooterAction.kt */
    public static final class a extends b {
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
            return q0.a(new StringBuilder("ChangeDeactivationState(isDeactivated="), this.b, ')');
        }
    }

    /* compiled from: ChannelFooterAction.kt */
    /* renamed from: com.vk.channels.impl.channel_screen.footer.b$b, reason: collision with other inner class name */
    public static final class C0528b extends b {
        public static final C0528b b = new C0528b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0528b);
        }

        public final int hashCode() {
            return -438425088;
        }

        public final String toString() {
            return "ClickBanReasonButton";
        }
    }

    /* compiled from: ChannelFooterAction.kt */
    public static final class c extends b {
        public final int b;

        public c(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ClickButton(id="), this.b, ')');
        }
    }

    /* compiled from: ChannelFooterAction.kt */
    public static final class d extends b {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1797408485;
        }

        public final String toString() {
            return "ClickPostponedButton";
        }
    }
}
