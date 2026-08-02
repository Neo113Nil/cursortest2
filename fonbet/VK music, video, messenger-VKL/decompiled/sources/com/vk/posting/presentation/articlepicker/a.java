package com.vk.posting.presentation.articlepicker;

import com.vk.dto.articles.Article;
import xsna.epx;
import xsna.kj50;

/* compiled from: ArticlePickerAction.kt */
/* loaded from: classes5.dex */
public abstract class a implements kj50 {

    /* compiled from: ArticlePickerAction.kt */
    /* renamed from: com.vk.posting.presentation.articlepicker.a$a, reason: collision with other inner class name */
    public static final class C1527a extends a {
        public final Article b;

        public C1527a(Article article) {
            this.b = article;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1527a) && epx.f(this.b, ((C1527a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ArticleSelected(article=" + this.b + ')';
        }
    }

    /* compiled from: ArticlePickerAction.kt */
    public static final class b extends a {
        public static final b b = new b();
    }

    /* compiled from: ArticlePickerAction.kt */
    public static abstract class c extends a {

        /* compiled from: ArticlePickerAction.kt */
        /* renamed from: com.vk.posting.presentation.articlepicker.a$c$a, reason: collision with other inner class name */
        public static final class C1528a extends c {
            public static final C1528a b = new C1528a();
        }
    }

    /* compiled from: ArticlePickerAction.kt */
    public static abstract class d extends a {

        /* compiled from: ArticlePickerAction.kt */
        /* renamed from: com.vk.posting.presentation.articlepicker.a$d$a, reason: collision with other inner class name */
        public static final class C1529a extends d {
        }

        /* compiled from: ArticlePickerAction.kt */
        public static final class b extends d {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1878520027;
            }

            public final String toString() {
                return "Success";
            }
        }
    }

    /* compiled from: ArticlePickerAction.kt */
    public static final class e extends a {
        public static final e b = new e();
    }
}
