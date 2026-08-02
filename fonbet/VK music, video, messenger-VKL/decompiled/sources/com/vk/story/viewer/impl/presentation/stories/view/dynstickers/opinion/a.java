package com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion;

import xsna.epx;
import xsna.ho8;
import xsna.kj50;

/* compiled from: OpinionStickerAction.kt */
/* loaded from: classes6.dex */
public abstract class a implements kj50 {

    /* compiled from: OpinionStickerAction.kt */
    /* renamed from: com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.a$a, reason: collision with other inner class name */
    public static final class C1835a extends a {
        public static final C1835a b = new C1835a();
    }

    /* compiled from: OpinionStickerAction.kt */
    public static final class b extends a {
        public static final b b = new b();
    }

    /* compiled from: OpinionStickerAction.kt */
    public static final class c extends a {
        public static final c b = new c();
    }

    /* compiled from: OpinionStickerAction.kt */
    public static final class d extends a {
        public final String b;

        public d(String str) {
            this.b = str;
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
            return ho8.a(new StringBuilder("Typing(text="), this.b, ')');
        }
    }
}
