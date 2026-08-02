package com.vk.channels.impl.channel_screen.footer;

import xsna.epx;

/* compiled from: ChannelFooterViewState.kt */
/* loaded from: classes16.dex */
public final class l {
    public final int a;
    public final a b;

    /* compiled from: ChannelFooterViewState.kt */
    public static abstract class a {

        /* compiled from: ChannelFooterViewState.kt */
        /* renamed from: com.vk.channels.impl.channel_screen.footer.l$a$a, reason: collision with other inner class name */
        public static final class C0529a extends a {
            public static final C0529a a = new C0529a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0529a);
            }

            public final int hashCode() {
                return -2006833126;
            }

            public final String toString() {
                return "Progress";
            }
        }

        /* compiled from: ChannelFooterViewState.kt */
        public static final class b extends a {
            public final int a;

            public b(int i) {
                this.a = i;
            }
        }
    }

    public l(int i, a aVar) {
        this.a = i;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a == lVar.a && epx.f(this.b, lVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FooterButton(id=" + this.a + ", content=" + this.b + ')';
    }
}
