package com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion;

import xsna.epx;
import xsna.ho8;
import xsna.oq;
import xsna.xl50;

/* compiled from: OpinionStickerPatch.kt */
/* loaded from: classes6.dex */
public abstract class c implements xl50 {

    /* compiled from: OpinionStickerPatch.kt */
    public static final class a extends c {
        public static final a b = new a();
    }

    /* compiled from: OpinionStickerPatch.kt */
    public static final class b extends c {
        public static final b b = new b();
    }

    /* compiled from: OpinionStickerPatch.kt */
    /* renamed from: com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.c$c, reason: collision with other inner class name */
    public static final class C1836c extends c {
        public static final C1836c b = new C1836c();
    }

    /* compiled from: OpinionStickerPatch.kt */
    public static final class d extends c {
        public final Throwable b;

        public d(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("SendError(error="), this.b, ')');
        }
    }

    /* compiled from: OpinionStickerPatch.kt */
    public static final class e extends c {
        public static final e b = new e();
    }

    /* compiled from: OpinionStickerPatch.kt */
    public static final class f extends c {
        public final String b;

        public f(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Typing(text="), this.b, ')');
        }
    }
}
