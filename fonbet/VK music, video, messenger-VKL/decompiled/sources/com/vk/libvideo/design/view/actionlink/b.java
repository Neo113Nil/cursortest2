package com.vk.libvideo.design.view.actionlink;

import com.vk.dto.common.Image;
import com.vkontakte.android.R;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;
import xsna.vu5;

/* compiled from: ActionLinkViewData.kt */
/* loaded from: classes2.dex */
public interface b {

    /* compiled from: ActionLinkViewData.kt */
    public static final class a implements b {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -500537152;
        }

        public final String toString() {
            return "NotProvided";
        }
    }

    /* compiled from: ActionLinkViewData.kt */
    /* renamed from: com.vk.libvideo.design.view.actionlink.b$b, reason: collision with other inner class name */
    public static final class C1229b implements b {
        public final boolean a;
        public final a b;
        public final String c;

        /* compiled from: ActionLinkViewData.kt */
        /* renamed from: com.vk.libvideo.design.view.actionlink.b$b$a */
        public static abstract class a {
            public final int a;
            public final Integer b;

            /* compiled from: ActionLinkViewData.kt */
            /* renamed from: com.vk.libvideo.design.view.actionlink.b$b$a$a, reason: collision with other inner class name */
            public static final class C1230a extends a {
                public static final C1230a c = new C1230a(R.drawable.vk_icon_services_16, 2);

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1230a);
                }

                public final int hashCode() {
                    return -1704570177;
                }

                public final String toString() {
                    return "App";
                }
            }

            /* compiled from: ActionLinkViewData.kt */
            /* renamed from: com.vk.libvideo.design.view.actionlink.b$b$a$b, reason: collision with other inner class name */
            public static final class C1231b extends a {
                public static final C1231b c = new C1231b(R.drawable.vk_icon_article_outline_16, 2);

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1231b);
                }

                public final int hashCode() {
                    return -1992022380;
                }

                public final String toString() {
                    return "Article";
                }
            }

            /* compiled from: ActionLinkViewData.kt */
            /* renamed from: com.vk.libvideo.design.view.actionlink.b$b$a$c */
            public static final class c extends a {
                public static final c c = new c(0, 3);

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return 285159391;
                }

                public final String toString() {
                    return "Default";
                }
            }

            /* compiled from: ActionLinkViewData.kt */
            /* renamed from: com.vk.libvideo.design.view.actionlink.b$b$a$d */
            public static final class d extends a {
                public static final d c = new d(R.drawable.vk_icon_users_16, 2);

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public final int hashCode() {
                    return -1703796835;
                }

                public final String toString() {
                    return "Group";
                }
            }

            /* compiled from: ActionLinkViewData.kt */
            /* renamed from: com.vk.libvideo.design.view.actionlink.b$b$a$e */
            public static final class e extends a {
                public static final e c = new e(R.drawable.vk_icon_link_16, Integer.valueOf(R.string.live_broadcast_link_open_link));

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof e);
                }

                public final int hashCode() {
                    return -1301746916;
                }

                public final String toString() {
                    return "Link";
                }
            }

            /* compiled from: ActionLinkViewData.kt */
            /* renamed from: com.vk.libvideo.design.view.actionlink.b$b$a$f */
            public static final class f extends a {
                public static final f c = new f(R.drawable.vk_icon_poll_16, Integer.valueOf(R.string.live_broadcast_link_open_poll));

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof f);
                }

                public final int hashCode() {
                    return -1301622047;
                }

                public final String toString() {
                    return "Poll";
                }
            }

            /* compiled from: ActionLinkViewData.kt */
            /* renamed from: com.vk.libvideo.design.view.actionlink.b$b$a$g */
            public static final class g extends a {
                public static final g c = new g(R.drawable.ic_newsfeed_16, Integer.valueOf(R.string.live_broadcast_link_open_post));

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof g);
                }

                public final int hashCode() {
                    return -1301621822;
                }

                public final String toString() {
                    return "Post";
                }
            }

            /* compiled from: ActionLinkViewData.kt */
            /* renamed from: com.vk.libvideo.design.view.actionlink.b$b$a$h */
            public static final class h extends a {
                public static final h c = new h(R.drawable.vk_icon_gift_16, 2);

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof h);
                }

                public final int hashCode() {
                    return 1799373346;
                }

                public final String toString() {
                    return "PostcardGift";
                }
            }

            /* compiled from: ActionLinkViewData.kt */
            /* renamed from: com.vk.libvideo.design.view.actionlink.b$b$a$i */
            public static final class i extends a {
                public static final i c = new i(R.drawable.vk_icon_market_16, Integer.valueOf(R.string.live_broadcast_link_open_product));

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof i);
                }

                public final int hashCode() {
                    return -1569118579;
                }

                public final String toString() {
                    return "Product";
                }
            }

            /* compiled from: ActionLinkViewData.kt */
            /* renamed from: com.vk.libvideo.design.view.actionlink.b$b$a$j */
            public static final class j extends a {
                public final long c;
                public final String d;
                public final String e;
                public final String f;
                public final Image g;
                public final String h;
                public final String i;
                public final long j;
                public final long k;

                public j(long j, String str, String str2, String str3, Image image, String str4, String str5, long j2, long j3) {
                    super(R.drawable.vk_icon_market_16, Integer.valueOf(R.string.live_broadcast_link_open_product));
                    this.c = j;
                    this.d = str;
                    this.e = str2;
                    this.f = str3;
                    this.g = image;
                    this.h = str4;
                    this.i = str5;
                    this.j = j2;
                    this.k = j3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof j)) {
                        return false;
                    }
                    j jVar = (j) obj;
                    return this.c == jVar.c && epx.f(this.d, jVar.d) && epx.f(this.e, jVar.e) && epx.f(this.f, jVar.f) && epx.f(this.g, jVar.g) && epx.f(this.h, jVar.h) && epx.f(this.i, jVar.i) && this.j == jVar.j && this.k == jVar.k;
                }

                public final int hashCode() {
                    int a = urd0.a(urd0.a(urd0.a(Long.hashCode(this.c) * 31, 31, this.d), 31, this.e), 31, this.f);
                    Image image = this.g;
                    return Long.hashCode(this.k) + bh10.a(urd0.a(urd0.a((a + (image == null ? 0 : image.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("ProductWithInfo(productId=");
                    sb.append(this.c);
                    sb.append(", nameFormatted=");
                    sb.append(this.d);
                    sb.append(", ratingFormatted=");
                    sb.append(this.e);
                    sb.append(", priceFormatted=");
                    sb.append(this.f);
                    sb.append(", image=");
                    sb.append(this.g);
                    sb.append(", vsid=");
                    sb.append(this.h);
                    sb.append(", videoType=");
                    sb.append(this.i);
                    sb.append(", videoId=");
                    sb.append(this.j);
                    sb.append(", videoOwnerId=");
                    return vu5.a(')', this.k, sb);
                }
            }

            /* compiled from: ActionLinkViewData.kt */
            /* renamed from: com.vk.libvideo.design.view.actionlink.b$b$a$k */
            public static final class k extends a {
                public static final k c = new k(R.drawable.vk_icon_user_16, Integer.valueOf(R.string.live_broadcast_link_open_user));

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof k);
                }

                public final int hashCode() {
                    return -1301469459;
                }

                public final String toString() {
                    return "User";
                }
            }

            /* compiled from: ActionLinkViewData.kt */
            /* renamed from: com.vk.libvideo.design.view.actionlink.b$b$a$l */
            public static final class l extends a {
                public static final l c = new l(0, 3);

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof l);
                }

                public final int hashCode() {
                    return -1690223207;
                }

                public final String toString() {
                    return "Video";
                }
            }

            public /* synthetic */ a(int i2, int i3) {
                this((i3 & 1) != 0 ? R.drawable.vk_icon_link_16 : i2, (Integer) null);
            }

            public a(int i2, Integer num) {
                this.a = i2;
                this.b = num;
            }
        }

        public C1229b(boolean z, a aVar, String str) {
            this.a = z;
            this.b = aVar;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1229b)) {
                return false;
            }
            C1229b c1229b = (C1229b) obj;
            return this.a == c1229b.a && epx.f(this.b, c1229b.b) && epx.f(this.c, c1229b.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(displayText=");
            sb.append(this.a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append(", openTitle=");
            return ho8.a(sb, this.c, ')');
        }
    }
}
