package com.vk.feed.design.view.newsfeed.topbar;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.bwt0;
import xsna.d9m;
import xsna.epx;
import xsna.gko;
import xsna.gzs;
import xsna.oa6;
import xsna.odm;
import xsna.pc3;
import xsna.qoy;
import xsna.s3q0;
import xsna.thl0;
import xsna.u4r;
import xsna.uf3;
import xsna.v4r;
import xsna.x16;

/* compiled from: FeedTopBar.kt */
/* loaded from: classes18.dex */
public final class FeedTopBar extends FrameLayout {
    public static final /* synthetic */ int p = 0;
    public final FrameLayout b;
    public final VkImageSimple c;
    public final VkAvatar d;
    public final LinearLayout e;
    public final VkText f;
    public final VkImageSimple g;
    public final FrameLayout h;
    public final VkImageSimple i;
    public final VkCounter j;
    public final VkImageSimple k;
    public final VkImageSimple l;
    public a m;
    public b n;
    public u4r o;

    /* compiled from: FeedTopBar.kt */
    public interface a {

        /* compiled from: FeedTopBar.kt */
        /* renamed from: com.vk.feed.design.view.newsfeed.topbar.FeedTopBar$a$a, reason: collision with other inner class name */
        public static final class C1056a implements a {
            public final String a;
            public final CharSequence b;
            public final gzs<s3q0> c;
            public final odm d;

            public C1056a(String str, String str2, gzs gzsVar, odm odmVar) {
                this.a = str;
                this.b = str2;
                this.c = gzsVar;
                this.d = odmVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1056a)) {
                    return false;
                }
                C1056a c1056a = (C1056a) obj;
                return epx.f(this.a, c1056a.a) && epx.f(this.b, c1056a.b) && epx.f(this.c, c1056a.c) && this.d.equals(c1056a.d);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                CharSequence charSequence = this.b;
                int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
                gzs<s3q0> gzsVar = this.c;
                return this.d.hashCode() + ((hashCode2 + (gzsVar != null ? gzsVar.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "Avatar(url=" + this.a + ", contentDescription=" + ((Object) this.b) + ", onClick=" + this.c + ", onLongClick=" + this.d + ')';
            }
        }

        /* compiled from: FeedTopBar.kt */
        public static final class b implements a {
            public final gzs<s3q0> a;
            public final CharSequence b;

            public b(gzs gzsVar, String str) {
                this.a = gzsVar;
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
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                CharSequence charSequence = this.b;
                return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Back(onClick=");
                sb.append(this.a);
                sb.append(", contentDescription=");
                return thl0.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: FeedTopBar.kt */
    public interface b {

        /* compiled from: FeedTopBar.kt */
        public static final class a implements b {
            public final String a;
            public final boolean b;
            public final gzs<s3q0> c;

            public a(String str, gzs gzsVar, boolean z) {
                this.a = str;
                this.b = z;
                this.c = gzsVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a.equals(aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
                gzs<s3q0> gzsVar = this.c;
                return b + (gzsVar == null ? 0 : gzsVar.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Title(text=");
                sb.append((Object) this.a);
                sb.append(", withDropdown=");
                sb.append(this.b);
                sb.append(", onClick=");
                return uf3.d(sb, this.c, ')');
            }
        }
    }

    public FeedTopBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.feed_top_bar, this);
        this.b = (FrameLayout) findViewById(R.id.feed_top_bar_before);
        this.c = (VkImageSimple) findViewById(R.id.feed_top_bar_before_back);
        VkAvatar vkAvatar = (VkAvatar) findViewById(R.id.feed_top_bar_before_avatar);
        vkAvatar.setPlaceholderImage(R.drawable.user_placeholder_square);
        this.d = vkAvatar;
        this.e = (LinearLayout) findViewById(R.id.feed_top_bar_middle);
        this.f = (VkText) findViewById(R.id.feed_top_bar_middle_title);
        this.g = (VkImageSimple) findViewById(R.id.feed_top_bar_middle_title_dropdown);
        this.h = (FrameLayout) findViewById(R.id.feed_top_bar_after_main_icon_wrapper);
        this.i = (VkImageSimple) findViewById(R.id.feed_top_bar_after_main_icon);
        this.j = (VkCounter) findViewById(R.id.feed_top_bar_after_main_icon_counter);
        this.k = (VkImageSimple) findViewById(R.id.feed_top_bar_after_extra_icon);
        this.l = (VkImageSimple) findViewById(R.id.feed_top_bar_after_second_extra_icon);
    }

    public static void a(VkImageSimple vkImageSimple, v4r v4rVar) {
        bwt0.p0(vkImageSimple, v4rVar != null);
        if (v4rVar == null) {
            return;
        }
        vkImageSimple.setImageDrawable(gko.b(v4rVar.a.a, vkImageSimple.getContext()));
        vkImageSimple.setOnClickListener(new oa6(v4rVar, 5));
        vkImageSimple.setContentDescription(v4rVar.c);
    }

    public final u4r getAfter() {
        return this.o;
    }

    public final Rect getAfterExtraRect() {
        return bwt0.F(this.k);
    }

    public final Rect getAfterMainRect() {
        return bwt0.F(this.i);
    }

    public final a getBefore() {
        return this.m;
    }

    public final RectF getBeforeAvatarRect() {
        return bwt0.G(this.d);
    }

    public final b getMiddle() {
        return this.n;
    }

    public final void setAfter(u4r u4rVar) {
        Integer num;
        Integer num2;
        this.o = u4rVar;
        boolean z = false;
        bwt0.p0(this.h, u4rVar != null);
        a(this.i, u4rVar != null ? u4rVar.a : null);
        if ((u4rVar != null ? u4rVar.a : null) != null && (num2 = u4rVar.a.d) != null && num2.intValue() > 0) {
            z = true;
        }
        VkCounter vkCounter = this.j;
        bwt0.p0(vkCounter, z);
        if (u4rVar != null && (num = u4rVar.a.d) != null) {
            vkCounter.setCounterWithAnimation(num.intValue());
        }
        a(this.k, u4rVar != null ? u4rVar.b : null);
        a(this.l, u4rVar != null ? u4rVar.c : null);
    }

    public final void setBefore(a aVar) {
        this.m = aVar;
        bwt0.p0(this.b, aVar != null);
        boolean z = aVar instanceof a.b;
        VkImageSimple vkImageSimple = this.c;
        bwt0.p0(vkImageSimple, z);
        boolean z2 = aVar instanceof a.C1056a;
        VkAvatar vkAvatar = this.d;
        bwt0.p0(vkAvatar, z2);
        if (z) {
            vkImageSimple.setContentDescription(((a.b) aVar).b);
            return;
        }
        if (!z2) {
            if (aVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        a.C1056a c1056a = (a.C1056a) aVar;
        vkAvatar.setContentDescription(c1056a.b);
        String str = c1056a.a;
        if (str == null) {
            str = "";
        }
        vkAvatar.setContent(new c.d(str, new gko(R.drawable.user_placeholder_square)));
        a.C1056a c1056a2 = (a.C1056a) aVar;
        vkAvatar.setOnClickListener(new x16(c1056a2, 10));
        vkAvatar.setOnLongClickListener(new d9m(c1056a2, 1));
    }

    public final void setMiddle(b bVar) {
        this.n = bVar;
        if (!(bVar instanceof b.a)) {
            if (bVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        b.a aVar = (b.a) bVar;
        this.f.setText(aVar.a);
        this.e.setOnClickListener(new pc3((b.a) bVar, 4));
        bwt0.p0(this.g, aVar.b);
    }
}
