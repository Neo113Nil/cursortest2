package com.vk.messagetemplates.impl.details;

import xsna.epx;
import xsna.oq;
import xsna.pk50;

/* compiled from: TemplateDetailsEvent.kt */
/* loaded from: classes3.dex */
public interface b extends pk50 {

    /* compiled from: TemplateDetailsEvent.kt */
    public static final class a implements b {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -361574094;
        }

        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: TemplateDetailsEvent.kt */
    /* renamed from: com.vk.messagetemplates.impl.details.b$b, reason: collision with other inner class name */
    public static final class C1272b implements b {
        public final Throwable a;

        public C1272b(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1272b) && epx.f(this.a, ((C1272b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("ShowErrorToast(throwable="), this.a, ')');
        }
    }
}
