package com.vk.ecomm.reviews.impl.allreviews.presentation;

import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewResult;
import xsna.epx;
import xsna.kj50;

/* compiled from: MarketAllReviewsAction.kt */
/* loaded from: classes18.dex */
public abstract class a implements kj50 {

    /* compiled from: MarketAllReviewsAction.kt */
    /* renamed from: com.vk.ecomm.reviews.impl.allreviews.presentation.a$a, reason: collision with other inner class name */
    public static final class C1004a extends a {
        public final int b;

        public C1004a(int i) {
            this.b = i;
        }
    }

    /* compiled from: MarketAllReviewsAction.kt */
    public static final class b extends a {
        public final String b;

        public b(String str) {
            this.b = str;
        }
    }

    /* compiled from: MarketAllReviewsAction.kt */
    public static final class c extends a {
        public static final c b = new c();
    }

    /* compiled from: MarketAllReviewsAction.kt */
    public static final class d extends a {
        public final int b;

        public d(int i) {
            this.b = i;
        }
    }

    /* compiled from: MarketAllReviewsAction.kt */
    public static abstract class e extends a {

        /* compiled from: MarketAllReviewsAction.kt */
        /* renamed from: com.vk.ecomm.reviews.impl.allreviews.presentation.a$e$a, reason: collision with other inner class name */
        public static final class C1005a extends e {
            public final int b;
            public final int c;

            public C1005a(int i, int i2) {
                this.b = i;
                this.c = i2;
            }
        }

        /* compiled from: MarketAllReviewsAction.kt */
        public static final class b extends e {
            public final int b;
            public final String c;

            public b(int i, String str) {
                this.b = i;
                this.c = str;
            }
        }
    }

    /* compiled from: MarketAllReviewsAction.kt */
    public static final class f extends a {
        public final int b;

        public f(int i) {
            this.b = i;
        }
    }

    /* compiled from: MarketAllReviewsAction.kt */
    public static abstract class g extends a {

        /* compiled from: MarketAllReviewsAction.kt */
        /* renamed from: com.vk.ecomm.reviews.impl.allreviews.presentation.a$g$a, reason: collision with other inner class name */
        public static final class C1006a extends g {
            public final int b;

            public C1006a(int i) {
                this.b = i;
            }
        }

        /* compiled from: MarketAllReviewsAction.kt */
        public static final class b extends g {
            public final int b;

            public b(int i) {
                this.b = i;
            }
        }

        /* compiled from: MarketAllReviewsAction.kt */
        public static final class c extends g {
            public final int b;
            public final View c;

            public c(int i, View view) {
                this.b = i;
                this.c = view;
            }
        }

        /* compiled from: MarketAllReviewsAction.kt */
        public static final class d extends g {
            public final int b;

            public d(int i) {
                this.b = i;
            }
        }
    }

    /* compiled from: MarketAllReviewsAction.kt */
    public static final class h extends a {
        public final CreateCommunityReviewResult b;

        public h(CreateCommunityReviewResult createCommunityReviewResult) {
            this.b = createCommunityReviewResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnEditCommunityReviewResult(data=" + this.b + ')';
        }
    }

    /* compiled from: MarketAllReviewsAction.kt */
    public static final class i extends a {
        public final String b;

        public i(String str) {
            this.b = str;
        }
    }

    /* compiled from: MarketAllReviewsAction.kt */
    public static abstract class j extends a {

        /* compiled from: MarketAllReviewsAction.kt */
        /* renamed from: com.vk.ecomm.reviews.impl.allreviews.presentation.a$j$a, reason: collision with other inner class name */
        public static final class C1007a extends j {
            public final String b;

            public C1007a(String str) {
                this.b = str;
            }
        }

        /* compiled from: MarketAllReviewsAction.kt */
        public static final class b extends j {
            public final String b;

            public b(String str) {
                this.b = str;
            }
        }

        /* compiled from: MarketAllReviewsAction.kt */
        public static final class c extends j {
            public final String b;
            public final View c;

            public c(View view, String str) {
                this.b = str;
                this.c = view;
            }
        }

        /* compiled from: MarketAllReviewsAction.kt */
        public static final class d extends j {
            public final String b;

            public d(String str) {
                this.b = str;
            }
        }
    }

    /* compiled from: MarketAllReviewsAction.kt */
    public static final class k extends a {
        public final long b;
        public final float c;
        public final boolean d;
        public final Integer e;

        public k(long j, float f, boolean z, Integer num) {
            this.b = j;
            this.c = f;
            this.d = z;
            this.e = num;
        }
    }

    /* compiled from: MarketAllReviewsAction.kt */
    public static final class l extends a {
        public static final l b = new l();
    }

    /* compiled from: MarketAllReviewsAction.kt */
    public static final class m extends a {
        public static final m b = new m();
    }

    /* compiled from: MarketAllReviewsAction.kt */
    public static final class n extends a {
        public static final n b = new n();
    }

    /* compiled from: MarketAllReviewsAction.kt */
    public static final class o extends a {
        public final MarketAllReviewsTabTypes b;

        public o(MarketAllReviewsTabTypes marketAllReviewsTabTypes) {
            this.b = marketAllReviewsTabTypes;
        }
    }

    /* compiled from: MarketAllReviewsAction.kt */
    public static final class p extends a {
        public static final p b = new p();
    }

    /* compiled from: MarketAllReviewsAction.kt */
    public static final class q extends a {
        public final long b;
        public final UserId c;
        public final float d;

        public q(long j, UserId userId, float f) {
            this.b = j;
            this.c = userId;
            this.d = f;
        }
    }
}
