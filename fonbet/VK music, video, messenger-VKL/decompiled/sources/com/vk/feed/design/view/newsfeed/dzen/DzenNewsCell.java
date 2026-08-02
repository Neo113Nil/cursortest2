package com.vk.feed.design.view.newsfeed.dzen;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.awt0;
import xsna.cn70;
import xsna.eko;
import xsna.epx;
import xsna.ey2;
import xsna.f4m;
import xsna.gt;
import xsna.jq;
import xsna.krv0;
import xsna.pr;
import xsna.shy;
import xsna.tlo0;
import xsna.vt1;

/* compiled from: DzenNewsCell.kt */
/* loaded from: classes18.dex */
public final class DzenNewsCell extends ConstraintLayout {
    public static final /* synthetic */ int B = 0;
    public final VkText A;
    public a t;
    public c u;
    public b v;
    public final FrameLayout w;
    public final VkImage x;
    public final VkImageSimple y;
    public final VkText z;

    /* compiled from: DzenNewsCell.kt */
    public interface a {

        /* compiled from: DzenNewsCell.kt */
        /* renamed from: com.vk.feed.design.view.newsfeed.dzen.DzenNewsCell$a$a, reason: collision with other inner class name */
        public static final class C1050a implements a {
            public final String a;
            public final Size b;
            public final tlo0.f c;

            public C1050a(String str, Size size, tlo0.f fVar) {
                this.a = str;
                this.b = size;
                this.c = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1050a)) {
                    return false;
                }
                C1050a c1050a = (C1050a) obj;
                return this.a.equals(c1050a.a) && this.b.equals(c1050a.b) && this.c.equals(c1050a.c);
            }

            public final int hashCode() {
                return Integer.hashCode(this.c.a) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CircleImage(url=");
                sb.append(this.a);
                sb.append(", size=");
                sb.append(this.b);
                sb.append(", contentDescription=");
                return pr.b(sb, this.c, ')');
            }
        }

        /* compiled from: DzenNewsCell.kt */
        public static final class b implements a {
            public final eko a;
            public final tlo0.f b;

            public b(eko ekoVar, tlo0.f fVar) {
                this.a = ekoVar;
                this.b = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && this.b.equals(bVar.b);
            }

            public final int hashCode() {
                return Integer.hashCode(this.b.a) + (this.a.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Icon(drawableSource=");
                sb.append(this.a);
                sb.append(", contentDescription=");
                return pr.b(sb, this.b, ')');
            }
        }
    }

    /* compiled from: DzenNewsCell.kt */
    public static final class b {
        public final tlo0.h a;

        public b(tlo0.h hVar) {
            this.a = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return jq.c(new StringBuilder("Subtitle(subtitle="), this.a, ')');
        }
    }

    /* compiled from: DzenNewsCell.kt */
    public static final class c {
        public final tlo0 a;
        public final int b;
        public final TextUtils.TruncateAt c;

        public c(tlo0 tlo0Var) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.a = tlo0Var;
            this.b = 3;
            this.c = truncateAt;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "Title(title=" + this.a + ", maxLines=" + this.b + ", overflow=" + this.c + ')';
        }
    }

    public DzenNewsCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        tlo0.Companion.getClass();
        this.u = new c(tlo0.c.a);
        LayoutInflater.from(context).inflate(R.layout.news_dzen_cell, this);
        this.w = (FrameLayout) findViewById(R.id.dzen_item_left_container);
        VkImage vkImage = (VkImage) findViewById(R.id.dzen_item_circle_image);
        this.x = vkImage;
        VkImageSimple vkImageSimple = (VkImageSimple) findViewById(R.id.dzen_item_icon);
        this.y = vkImageSimple;
        this.z = (VkText) findViewById(R.id.dzen_item_title);
        this.A = (VkText) findViewById(R.id.dzen_item_subtitle);
        awt0.o(vkImageSimple, new vt1(23));
        awt0.o(vkImage, new gt(21));
        vkImage.setRound(true);
        vkImage.y0(cn70.a() * 0.33f, krv0.l(R.attr.vk_ui_image_border_alpha));
    }

    @Override // android.view.View
    public final a getLeft() {
        return this.t;
    }

    public final b getSubtitle() {
        return this.v;
    }

    public final c getTitle() {
        return this.u;
    }

    public final void setLeft(a aVar) {
        this.t = aVar;
        awt0.v(this.w, aVar != null);
        VkImageSimple vkImageSimple = this.y;
        f4m.j(vkImageSimple);
        VkImage vkImage = this.x;
        f4m.j(vkImage);
        if (aVar instanceof a.b) {
            vkImageSimple.setVisibility(0);
            a.b bVar = (a.b) aVar;
            eko ekoVar = bVar.a;
            getContext();
            vkImageSimple.setImageDrawable(ekoVar.a);
            vkImageSimple.setContentDescription(tlo0.b.a(bVar.b, getContext()));
            return;
        }
        if (!(aVar instanceof a.C1050a)) {
            if (aVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        vkImage.clear();
        vkImage.setVisibility(0);
        a.C1050a c1050a = (a.C1050a) aVar;
        f4m.A(vkImage, c1050a.b);
        vkImage.o0(c1050a.a, null);
        vkImage.setContentDescription(tlo0.b.a(c1050a.c, getContext()));
    }

    public final void setSubtitle(b bVar) {
        this.v = bVar;
        VkText vkText = this.A;
        if (bVar == null) {
            f4m.j(vkText);
        } else {
            vkText.setVisibility(0);
            ey2.h(vkText, bVar.a);
        }
    }

    public final void setTitle(c cVar) {
        this.u = cVar;
        tlo0 tlo0Var = cVar.a;
        VkText vkText = this.z;
        ey2.h(vkText, tlo0Var);
        vkText.setMaxLines(cVar.b);
        vkText.setEllipsize(cVar.c);
    }
}
