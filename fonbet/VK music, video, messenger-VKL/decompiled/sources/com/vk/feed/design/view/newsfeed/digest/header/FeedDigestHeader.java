package com.vk.feed.design.view.newsfeed.digest.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.feed.design.view.newsfeed.news.VkFeedStreamlinedTextView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.awt0;
import xsna.bwt0;
import xsna.cj1;
import xsna.cn70;
import xsna.d94;
import xsna.dhr0;
import xsna.epx;
import xsna.f4m;
import xsna.gym;
import xsna.gzs;
import xsna.ho8;
import xsna.k1;
import xsna.s3q0;
import xsna.sd4;
import xsna.shy;
import xsna.vw0;
import xsna.z13;
import xsna.zxq;

/* compiled from: FeedDigestHeader.kt */
/* loaded from: classes18.dex */
public final class FeedDigestHeader extends FrameLayout {
    public static final /* synthetic */ int n = 0;
    public c b;
    public b c;
    public a d;
    public boolean e;
    public final View f;
    public final FrameLayout g;
    public final VkFeedStreamlinedTextView h;
    public final VkText i;
    public final VkSimpleButton j;
    public final VkImageSimple k;
    public final View l;
    public final VkContentBadge m;

    /* compiled from: FeedDigestHeader.kt */
    public interface a {

        /* compiled from: FeedDigestHeader.kt */
        /* renamed from: com.vk.feed.design.view.newsfeed.digest.header.FeedDigestHeader$a$a, reason: collision with other inner class name */
        public static final class C1045a implements a {
            public final String a;
            public final d94 b;

            public C1045a(String str, d94 d94Var) {
                this.a = str;
                this.b = d94Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1045a)) {
                    return false;
                }
                C1045a c1045a = (C1045a) obj;
                return epx.f(this.a, c1045a.a) && this.b.equals(c1045a.b);
            }

            public final int hashCode() {
                String str = this.a;
                return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                return "Button(text=" + this.a + ", onClick=" + this.b + ')';
            }
        }

        /* compiled from: FeedDigestHeader.kt */
        public static final class b implements a {
            public final gym a;
            public final String b;

            public b(gym gymVar, String str) {
                this.a = gymVar;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DismissIconButton(onClick=");
                sb.append(this.a);
                sb.append(", contentDescription=");
                return ho8.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: FeedDigestHeader.kt */
    public static final class b {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Subtitle(text="), this.a, ')');
        }
    }

    /* compiled from: FeedDigestHeader.kt */
    public static final class c {
        public final String a;
        public final int b;
        public final a c;

        /* compiled from: FeedDigestHeader.kt */
        public interface a {

            /* compiled from: FeedDigestHeader.kt */
            /* renamed from: com.vk.feed.design.view.newsfeed.digest.header.FeedDigestHeader$c$a$a, reason: collision with other inner class name */
            public static final class C1046a implements a {
                public final String a;

                public C1046a(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1046a) && epx.f(this.a, ((C1046a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("Badge(text="), this.a, ')');
                }
            }
        }

        public c(String str, int i, a.C1046a c1046a) {
            this.a = str;
            this.b = i;
            this.c = c1046a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            String str = this.a;
            int a2 = shy.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
            a aVar = this.c;
            return a2 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "Title(title=" + this.a + ", titleMaxLine=" + this.b + ", extra=" + this.c + ')';
        }
    }

    public FeedDigestHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new c(null, 2, null);
        VkContentBadge vkContentBadge = new VkContentBadge(context, null, 6);
        vkContentBadge.setId(R.id.digest_badge);
        vkContentBadge.setImportantForAccessibility(1);
        vkContentBadge.setFocusable(true);
        vkContentBadge.setSize(VkContentBadge.Size.Small);
        vkContentBadge.setMode(VkContentBadge.Mode.Primary);
        vkContentBadge.setAppearance(VkContentBadge.Appearance.Design.Negative);
        this.m = vkContentBadge;
        LayoutInflater.from(context).inflate(R.layout.feed_digest_header, this);
        this.f = findViewById(R.id.stack);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.container);
        this.g = frameLayout;
        VkFeedStreamlinedTextView vkFeedStreamlinedTextView = (VkFeedStreamlinedTextView) findViewById(R.id.digest_title);
        this.h = vkFeedStreamlinedTextView;
        this.i = (VkText) findViewById(R.id.subtitle);
        this.j = (VkSimpleButton) findViewById(R.id.button);
        this.k = (VkImageSimple) findViewById(R.id.dismiss_icon_button);
        this.l = findViewById(R.id.separator);
        awt0.o(vkFeedStreamlinedTextView, new sd4(21));
        FontFamily fontFamily = FontFamily.MEDIUM;
        Float valueOf = Float.valueOf(17.0f);
        if (fontFamily != vkFeedStreamlinedTextView.f || !epx.a(17.0f, vkFeedStreamlinedTextView.e)) {
            vkFeedStreamlinedTextView.f = fontFamily;
            vkFeedStreamlinedTextView.e = valueOf;
            com.vk.typography.b.j(vkFeedStreamlinedTextView.d, vkFeedStreamlinedTextView.getContext(), fontFamily, valueOf, 8);
            vkFeedStreamlinedTextView.requestLayout();
            vkFeedStreamlinedTextView.invalidate();
        }
        vkFeedStreamlinedTextView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
        vkFeedStreamlinedTextView.b.add(vkContentBadge);
        vkFeedStreamlinedTextView.addView(vkContentBadge);
        awt0.o(frameLayout, new z13(18));
        f4m.s(cn70.b(6), vkContentBadge);
    }

    @Override // android.view.View
    public final a getRight() {
        return this.d;
    }

    public final boolean getShowBottomDivider() {
        return this.e;
    }

    public final b getSubtitle() {
        return this.c;
    }

    public final c getTitle() {
        return this.b;
    }

    public final void setOnHeaderClickListener(gzs<s3q0> gzsVar) {
        setOnClickListener(new zxq(0, gzsVar));
        awt0.o(this.g, new cj1(25));
    }

    public final void setRight(a aVar) {
        this.d = aVar;
        VkSimpleButton vkSimpleButton = this.j;
        f4m.j(vkSimpleButton);
        VkImageSimple vkImageSimple = this.k;
        f4m.j(vkImageSimple);
        if (aVar instanceof a.C1045a) {
            vkSimpleButton.setVisibility(0);
            vkSimpleButton.setText(((a.C1045a) aVar).a);
            vkSimpleButton.setOnClickListener(new k1((a.C1045a) aVar, 8));
        } else if (aVar instanceof a.b) {
            vkImageSimple.setVisibility(0);
            vkImageSimple.setContentDescription(((a.b) aVar).b);
            vkImageSimple.setOnClickListener(new vw0((a.b) aVar, 8));
        }
    }

    public final void setShowBottomDivider(boolean z) {
        this.e = z;
        awt0.x(this.f, 0, cn70.b(z ? 15 : 13), 0, cn70.b(z ? 14 : 9), 5);
        bwt0.p0(this.l, z);
    }

    public final void setSubtitle(b bVar) {
        this.c = bVar;
        VkText vkText = this.i;
        if (bVar == null) {
            f4m.j(vkText);
        } else {
            vkText.setVisibility(0);
            vkText.setText(bVar.a);
        }
    }

    public final void setTitle(c cVar) {
        this.b = cVar;
        String str = cVar.a;
        c.a aVar = cVar.c;
        VkFeedStreamlinedTextView vkFeedStreamlinedTextView = this.h;
        vkFeedStreamlinedTextView.setText(str);
        vkFeedStreamlinedTextView.setMaxLines(cVar.b);
        if (str == null) {
            str = "";
        }
        vkFeedStreamlinedTextView.setContentDescription(str);
        vkFeedStreamlinedTextView.setFocusable(false);
        boolean z = aVar instanceof c.a.C1046a;
        VkContentBadge vkContentBadge = this.m;
        if (z) {
            bwt0.p0(vkContentBadge, true);
            vkContentBadge.setText(((c.a.C1046a) aVar).a);
        } else {
            if (aVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            bwt0.p0(vkContentBadge, false);
        }
    }
}
