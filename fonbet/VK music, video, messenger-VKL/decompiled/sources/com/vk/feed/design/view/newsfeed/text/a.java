package com.vk.feed.design.view.newsfeed.text;

import xsna.epx;
import xsna.thl0;

/* compiled from: TextEllipsizeDelegate.kt */
/* loaded from: classes18.dex */
public abstract class a {

    /* compiled from: TextEllipsizeDelegate.kt */
    /* renamed from: com.vk.feed.design.view.newsfeed.text.a$a, reason: collision with other inner class name */
    public static final class C1055a extends a {
        public static final C1055a a = new C1055a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1055a);
        }

        public final int hashCode() {
            return 828150534;
        }

        public final String toString() {
            return "Default";
        }
    }

    /* compiled from: TextEllipsizeDelegate.kt */
    public static final class b extends a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return epx.f(null, null) && epx.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Fade(text=");
            sb.append((Object) null);
            sb.append(", postText=");
            return thl0.a(sb, null, ')');
        }
    }
}
