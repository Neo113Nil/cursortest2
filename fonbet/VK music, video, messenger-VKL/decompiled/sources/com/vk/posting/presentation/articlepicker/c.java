package com.vk.posting.presentation.articlepicker;

import com.vk.dto.attachments.ArticleAttachment;
import xsna.am50;
import xsna.epx;
import xsna.uf90;
import xsna.wf90;

/* compiled from: ArticlePickerSideEffect.kt */
/* loaded from: classes5.dex */
public abstract class c {

    /* compiled from: ArticlePickerSideEffect.kt */
    public static abstract class a extends c {

        /* compiled from: ArticlePickerSideEffect.kt */
        /* renamed from: com.vk.posting.presentation.articlepicker.c$a$a, reason: collision with other inner class name */
        public static final class C1530a extends a {
            public final ArticleAttachment a;
            public final am50 b;

            public C1530a(ArticleAttachment articleAttachment, am50 am50Var) {
                this.a = articleAttachment;
                this.b = am50Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1530a)) {
                    return false;
                }
                C1530a c1530a = (C1530a) obj;
                return epx.f(this.a, c1530a.a) && epx.f(this.b, c1530a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "ReturnResult(article=" + this.a + ", techMetricsCollector=" + this.b + ')';
            }
        }
    }

    /* compiled from: ArticlePickerSideEffect.kt */
    public static abstract class b extends c {

        /* compiled from: ArticlePickerSideEffect.kt */
        public static final class a extends b {
            public final uf90 a;

            public a(wf90 wf90Var) {
                this.a = wf90Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Init(pagingHelper=" + this.a + ')';
            }
        }
    }
}
