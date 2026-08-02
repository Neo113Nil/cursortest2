package com.vk.channels.impl.comments;

import kotlin.collections.builders.ListBuilder;
import xsna.epx;
import xsna.oq;
import xsna.vu5;
import xsna.yn50;

/* compiled from: ChannelCommentsViewEvent.kt */
/* loaded from: classes16.dex */
public abstract class f implements yn50 {

    /* compiled from: ChannelCommentsViewEvent.kt */
    public static final class a extends f {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -448061969;
        }

        public final String toString() {
            return "ClearWriteBar";
        }
    }

    /* compiled from: ChannelCommentsViewEvent.kt */
    public static final class b extends f {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1210122618;
        }

        public final String toString() {
            return "FocusWriteBar";
        }
    }

    /* compiled from: ChannelCommentsViewEvent.kt */
    public static final class c extends f {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1303441802;
        }

        public final String toString() {
            return "HideConnectionError";
        }
    }

    /* compiled from: ChannelCommentsViewEvent.kt */
    public static final class d extends f {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -2051699525;
        }

        public final String toString() {
            return "HideKeyboard";
        }
    }

    /* compiled from: ChannelCommentsViewEvent.kt */
    public static final class e extends f {
        public final int a;

        public e(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ScrollToComment(commentId="), this.a, ')');
        }
    }

    /* compiled from: ChannelCommentsViewEvent.kt */
    /* renamed from: com.vk.channels.impl.comments.f$f, reason: collision with other inner class name */
    public static final class C0533f extends f {
        public static final C0533f a = new C0533f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0533f);
        }

        public final int hashCode() {
            return -394243877;
        }

        public final String toString() {
            return "ScrollToCommentsHeader";
        }
    }

    /* compiled from: ChannelCommentsViewEvent.kt */
    public static final class g extends f {
        public final int a;
        public final ListBuilder b;

        public g(int i, ListBuilder listBuilder) {
            this.a = i;
            this.b = listBuilder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && this.b.equals(gVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "ShowCommentContextMenuPopup(commentId=" + this.a + ", actions=" + this.b + ')';
        }
    }

    /* compiled from: ChannelCommentsViewEvent.kt */
    public static final class h extends f {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 396198747;
        }

        public final String toString() {
            return "ShowConnectionError";
        }
    }

    /* compiled from: ChannelCommentsViewEvent.kt */
    public static final class i extends f {
        public final Throwable a;

        public i(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("ShowError(throwable="), this.a, ')');
        }
    }
}
