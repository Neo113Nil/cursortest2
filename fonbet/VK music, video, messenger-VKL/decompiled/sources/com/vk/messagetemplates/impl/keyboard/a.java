package com.vk.messagetemplates.impl.keyboard;

import xsna.epx;
import xsna.ho8;
import xsna.oq;
import xsna.pk50;
import xsna.uqi;

/* compiled from: TemplatesKeyboardEvent.kt */
/* loaded from: classes3.dex */
public interface a extends pk50 {

    /* compiled from: TemplatesKeyboardEvent.kt */
    /* renamed from: com.vk.messagetemplates.impl.keyboard.a$a, reason: collision with other inner class name */
    public static final class C1273a implements a {
        public final Throwable a;

        public C1273a(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1273a) && epx.f(this.a, ((C1273a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("ShowErrorToast(throwable="), this.a, ')');
        }
    }

    /* compiled from: TemplatesKeyboardEvent.kt */
    public static final class b implements a {
        public final Integer a;

        public b() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            Integer num = this.a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return uqi.b(new StringBuilder("TemplateDetails(id="), this.a, ')');
        }

        public b(Integer num) {
            this.a = num;
        }
    }

    /* compiled from: TemplatesKeyboardEvent.kt */
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
            return ho8.a(new StringBuilder("TemplateSelected(content="), this.a, ')');
        }
    }
}
