package com.vk.ecomm.reviews.impl.marketitem.replies.presentation;

import defpackage.q0;
import java.util.List;
import xsna.epx;
import xsna.f4g0;
import xsna.hfz;
import xsna.lm50;
import xsna.o4g0;
import xsna.qoy;

/* compiled from: MarketItemReviewRepliesViewState.kt */
/* loaded from: classes18.dex */
public interface p extends lm50 {

    /* compiled from: MarketItemReviewRepliesViewState.kt */
    public static final class a implements p {
        public final List<hfz> b;
        public final boolean c;
        public final boolean d;
        public final f4g0 e;
        public final o4g0 f;
        public final boolean g;
        public final boolean h;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends hfz> list, boolean z, boolean z2, f4g0 f4g0Var, o4g0 o4g0Var, boolean z3, boolean z4) {
            this.b = list;
            this.c = z;
            this.d = z2;
            this.e = f4g0Var;
            this.f = o4g0Var;
            this.g = z3;
            this.h = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && this.g == aVar.g && this.h == aVar.h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.h) + qoy.b((this.f.hashCode() + ((this.e.hashCode() + qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(items=");
            sb.append(this.b);
            sb.append(", isCommentBarVisible=");
            sb.append(this.c);
            sb.append(", isRefresh=");
            sb.append(this.d);
            sb.append(", replyBarFrom=");
            sb.append(this.e);
            sb.append(", replyBarToName=");
            sb.append(this.f);
            sb.append(", isReplyBarFromVisible=");
            sb.append(this.g);
            sb.append(", isScreenSpinnerVisible=");
            return q0.a(sb, this.h, ')');
        }
    }

    /* compiled from: MarketItemReviewRepliesViewState.kt */
    public static final class b implements p {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -461206714;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: MarketItemReviewRepliesViewState.kt */
    public static final class c implements p {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 977617658;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
