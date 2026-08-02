package com.vk.voip.ui.share.link.pager.view;

import xsna.epx;
import xsna.ho8;

/* compiled from: VoipShareLinkPagerAction.kt */
/* loaded from: classes7.dex */
public interface a {

    /* compiled from: VoipShareLinkPagerAction.kt */
    /* renamed from: com.vk.voip.ui.share.link.pager.view.a$a, reason: collision with other inner class name */
    public static final class C2091a implements a {
        public final com.vk.voip.ui.share.link.pager.view.c a;

        public C2091a(com.vk.voip.ui.share.link.pager.view.c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2091a) && epx.f(this.a, ((C2091a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnClickLinkTabBtn(linkType=" + this.a + ')';
        }
    }

    /* compiled from: VoipShareLinkPagerAction.kt */
    public static final class b implements a {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1859818093;
        }

        public final String toString() {
            return "OnClickRefreshBtn";
        }
    }

    /* compiled from: VoipShareLinkPagerAction.kt */
    public static final class c implements a {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OnClickShareBtn(link="), this.a, ')');
        }
    }

    /* compiled from: VoipShareLinkPagerAction.kt */
    public static final class d implements a {
        static {
            new d();
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 101176886;
        }

        public final String toString() {
            return "OnCopyClicked";
        }
    }
}
