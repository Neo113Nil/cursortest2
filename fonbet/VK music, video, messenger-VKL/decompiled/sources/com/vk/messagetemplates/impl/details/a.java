package com.vk.messagetemplates.impl.details;

import xsna.epx;
import xsna.ho8;
import xsna.lj50;

/* compiled from: TemplateDetailsAction.kt */
/* loaded from: classes3.dex */
public interface a extends lj50 {

    /* compiled from: TemplateDetailsAction.kt */
    /* renamed from: com.vk.messagetemplates.impl.details.a$a, reason: collision with other inner class name */
    public static final class C1271a implements a {
        public final String b;

        public C1271a(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1271a) && epx.f(this.b, ((C1271a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ContentUpdate(text="), this.b, ')');
        }
    }

    /* compiled from: TemplateDetailsAction.kt */
    public static final class b implements a {
        public final String b;

        public b(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("TitleUpdate(text="), this.b, ')');
        }
    }
}
