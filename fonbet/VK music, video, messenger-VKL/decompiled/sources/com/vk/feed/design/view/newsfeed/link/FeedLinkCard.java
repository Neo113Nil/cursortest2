package com.vk.feed.design.view.newsfeed.link;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bt;
import xsna.cn70;
import xsna.dhr0;
import xsna.dko;
import xsna.e3m;
import xsna.edg0;
import xsna.epx;
import xsna.gko;
import xsna.gzs;
import xsna.ho8;
import xsna.jq;
import xsna.kci;
import xsna.m33;
import xsna.qoy;
import xsna.tlo0;
import xsna.u11;
import xsna.zrp;

/* compiled from: FeedLinkCard.kt */
/* loaded from: classes18.dex */
public final class FeedLinkCard extends LinearLayout {
    public b b;
    public OverlayContent c;
    public a d;
    public c e;
    public final ColorDrawable f;
    public Integer g;
    public final ConstraintLayout h;
    public final VkPlaceholder i;
    public final View j;
    public final VkImage k;
    public final VkText l;
    public final VkButton m;
    public final VkImageSimple n;
    public final VkCell o;

    /* compiled from: FeedLinkCard.kt */
    public interface OverlayContent {

        /* compiled from: FeedLinkCard.kt */
        public static final class ActionButtonWithTitle implements OverlayContent {
            public final String a;
            public final CharSequence b;
            public final Appearance c;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: FeedLinkCard.kt */
            public static final class Appearance {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Appearance[] $VALUES;
                public static final Appearance Contrast;
                public static final Appearance Primary;

                static {
                    Appearance appearance = new Appearance("Primary", 0);
                    Primary = appearance;
                    Appearance appearance2 = new Appearance("Contrast", 1);
                    Contrast = appearance2;
                    Appearance[] appearanceArr = {appearance, appearance2};
                    $VALUES = appearanceArr;
                    $ENTRIES = new asp(appearanceArr);
                }

                public Appearance() {
                    throw null;
                }

                public static Appearance valueOf(String str) {
                    return (Appearance) Enum.valueOf(Appearance.class, str);
                }

                public static Appearance[] values() {
                    return (Appearance[]) $VALUES.clone();
                }
            }

            public ActionButtonWithTitle(String str, CharSequence charSequence, Appearance appearance) {
                this.a = str;
                this.b = charSequence;
                this.c = appearance;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionButtonWithTitle)) {
                    return false;
                }
                ActionButtonWithTitle actionButtonWithTitle = (ActionButtonWithTitle) obj;
                return epx.f(this.a, actionButtonWithTitle.a) && epx.f(this.b, actionButtonWithTitle.b) && this.c == actionButtonWithTitle.c;
            }

            public final int hashCode() {
                return this.c.hashCode() + u11.c(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                return "ActionButtonWithTitle(title=" + this.a + ", buttonText=" + ((Object) this.b) + ", appearance=" + this.c + ')';
            }
        }
    }

    /* compiled from: FeedLinkCard.kt */
    public interface a {

        /* compiled from: FeedLinkCard.kt */
        /* renamed from: com.vk.feed.design.view.newsfeed.link.FeedLinkCard$a$a, reason: collision with other inner class name */
        public static final class C1053a implements a {
            public static final C1053a a = new C1053a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1053a);
            }

            public final int hashCode() {
                return -1711342822;
            }

            public final String toString() {
                return "RemoveIcon";
            }
        }
    }

    /* compiled from: FeedLinkCard.kt */
    public interface b {

        /* compiled from: FeedLinkCard.kt */
        public static final class a implements b {
            public final String a;
            public final String b;
            public final boolean c;
            public final String d;

            public a(String str, String str2, boolean z, String str3) {
                this.a = str;
                this.b = str2;
                this.c = z;
                this.d = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int b = qoy.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
                String str3 = this.d;
                return b + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Image(url=");
                sb.append(this.a);
                sb.append(", thumbHash=");
                sb.append(this.b);
                sb.append(", isBlurred=");
                sb.append(this.c);
                sb.append(", dimensionRatio=");
                return ho8.a(sb, this.d, ')');
            }
        }

        /* compiled from: FeedLinkCard.kt */
        /* renamed from: com.vk.feed.design.view.newsfeed.link.FeedLinkCard$b$b, reason: collision with other inner class name */
        public static final class C1054b implements b {
            public final dko a;
            public final tlo0 b;

            public C1054b(gko gkoVar, tlo0 tlo0Var) {
                this.a = gkoVar;
                this.b = tlo0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1054b)) {
                    return false;
                }
                C1054b c1054b = (C1054b) obj;
                return epx.f(this.a, c1054b.a) && epx.f(this.b, c1054b.b);
            }

            public final int hashCode() {
                dko dkoVar = this.a;
                int hashCode = (dkoVar == null ? 0 : dkoVar.hashCode()) * 31;
                tlo0 tlo0Var = this.b;
                return hashCode + (tlo0Var != null ? tlo0Var.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Placeholder(icon=");
                sb.append(this.a);
                sb.append(", description=");
                return bt.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: FeedLinkCard.kt */
    public interface c {

        /* compiled from: FeedLinkCard.kt */
        public static final class a implements c {
            public final tlo0 a;
            public final tlo0.h b;

            public a(tlo0.h hVar, tlo0.h hVar2) {
                this.a = hVar;
                this.b = hVar2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b.equals(aVar.b);
            }

            public final int hashCode() {
                tlo0 tlo0Var = this.a;
                return this.b.a.hashCode() + ((tlo0Var == null ? 0 : tlo0Var.hashCode()) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Description(title=");
                sb.append(this.a);
                sb.append(", subtitle=");
                return jq.c(sb, this.b, ')');
            }
        }
    }

    /* compiled from: FeedLinkCard.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OverlayContent.ActionButtonWithTitle.Appearance.values().length];
            try {
                iArr[OverlayContent.ActionButtonWithTitle.Appearance.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OverlayContent.ActionButtonWithTitle.Appearance.Contrast.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FeedLinkCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f = new ColorDrawable(context.getColor(R.color.vk_black_alpha24));
        LayoutInflater.from(context).inflate(R.layout.feed_article_link, this);
        this.h = (ConstraintLayout) findViewById(R.id.content_wrapper);
        this.i = (VkPlaceholder) findViewById(R.id.placeholder);
        this.j = findViewById(R.id.background_content);
        VkImage vkImage = (VkImage) findViewById(R.id.image);
        this.k = vkImage;
        this.l = (VkText) findViewById(R.id.action_title);
        this.m = (VkButton) findViewById(R.id.action_button);
        this.n = (VkImageSimple) findViewById(R.id.card_badge);
        this.o = (VkCell) findViewById(R.id.card_description);
        vkImage.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_background_secondary));
    }

    public final void a(int i) {
        c cVar = this.e;
        if (cVar instanceof c.a) {
            i -= cn70.b(58);
            if (i < 0) {
                i = 0;
            }
        } else if (cVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        VkImage vkImage = this.k;
        ViewGroup.LayoutParams layoutParams = vkImage.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar == null || bVar.Q == i) {
            return;
        }
        bVar.Q = i;
        vkImage.setLayoutParams(bVar);
    }

    public final a getBadge() {
        return this.d;
    }

    public final b getContent() {
        return this.b;
    }

    public final c getFooter() {
        return this.e;
    }

    public final OverlayContent getOverlayContent() {
        return this.c;
    }

    public final void setBadge(a aVar) {
        this.d = aVar;
        VkImageSimple vkImageSimple = this.n;
        vkImageSimple.setVisibility(8);
        if (!epx.f(aVar, a.C1053a.a)) {
            if (aVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        vkImageSimple.setVisibility(0);
        Context context = getContext();
        e3m.a aVar2 = e3m.a;
        vkImageSimple.setImageDrawable(m33.a(R.drawable.vk_icon_dismiss_dark_24, context));
        vkImageSimple.setContentDescription(getContext().getString(R.string.delete));
    }

    public final void setCardEnabledState(boolean z) {
        this.o.setEnabled(z);
    }

    public final void setCardMaxHeight(int i) {
        this.g = Integer.valueOf(i);
        a(i);
    }

    public final void setContent(b bVar) {
        this.b = bVar;
        VkPlaceholder vkPlaceholder = this.i;
        vkPlaceholder.setVisibility(8);
        VkImage vkImage = this.k;
        vkImage.setVisibility(8);
        View view = this.j;
        view.setVisibility(0);
        int f = e3m.f(R.attr.vk_ui_background_secondary, getContext());
        ConstraintLayout constraintLayout = this.h;
        constraintLayout.setBackgroundColor(f);
        if (bVar instanceof b.C1054b) {
            b.C1054b c1054b = (b.C1054b) bVar;
            vkPlaceholder.setVisibility(0);
            tlo0 tlo0Var = c1054b.b;
            vkPlaceholder.setMiddle(tlo0Var != null ? new VkPlaceholder.b(new VkPlaceholder.b.c(2, (tlo0) null), new VkPlaceholder.b.C0859b(14, tlo0Var)) : null);
            dko dkoVar = c1054b.a;
            vkPlaceholder.setTop(dkoVar != null ? new VkPlaceholder.c.b(dkoVar, null, null, 14) : null);
            return;
        }
        if (!(bVar instanceof b.a)) {
            if (bVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        b.a aVar = (b.a) bVar;
        vkImage.setVisibility(0);
        view.setVisibility(8);
        constraintLayout.setBackgroundColor(e3m.f(R.attr.vk_ui_background_content, getContext()));
        if (aVar.c) {
            vkImage.setOverlayImage(this.f);
            kci.o(vkImage, edg0.a);
        } else {
            vkImage.setOverlayImage(null);
            vkImage.setVkPostprocessor(null);
        }
        String str = aVar.d;
        ViewGroup.LayoutParams layoutParams = vkImage.getLayoutParams();
        ConstraintLayout.b bVar2 = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar2 != null) {
            if (str == null) {
                str = "H,1.7777778:1";
            }
            if (!epx.f(bVar2.G, str)) {
                bVar2.G = str;
                vkImage.requestLayout();
            }
        }
        vkImage.o0(aVar.a, null);
    }

    public final void setFooter(c cVar) {
        VkCell.Middle.e eVar;
        this.e = cVar;
        VkCell vkCell = this.o;
        vkCell.setVisibility(8);
        if (cVar instanceof c.a) {
            c.a aVar = (c.a) cVar;
            vkCell.setVisibility(0);
            VkCell.Middle.a aVar2 = VkCell.Middle.Companion;
            tlo0 tlo0Var = aVar.a;
            if (tlo0Var == null) {
                eVar = null;
            } else {
                eVar = new VkCell.Middle.e(tlo0Var, 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50);
            }
            vkCell.setMiddle(VkCell.Middle.a.a(aVar2, eVar, new VkCell.Middle.d(aVar.b, (gzs) null, 1, TextUtils.TruncateAt.END, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), null, 12));
        } else if (cVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        Integer num = this.g;
        if (num != null) {
            a(num.intValue());
        }
    }

    public final void setOnBadgeClickListener(View.OnClickListener onClickListener) {
        this.n.setOnClickListener(onClickListener);
    }

    public final void setOverlayContent(OverlayContent overlayContent) {
        this.c = overlayContent;
        VkText vkText = this.l;
        vkText.setVisibility(8);
        VkButton vkButton = this.m;
        vkButton.setVisibility(8);
        if (!(overlayContent instanceof OverlayContent.ActionButtonWithTitle)) {
            if (overlayContent != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        OverlayContent.ActionButtonWithTitle actionButtonWithTitle = (OverlayContent.ActionButtonWithTitle) overlayContent;
        vkText.setVisibility(0);
        vkButton.setVisibility(0);
        vkText.setText(actionButtonWithTitle.a);
        vkButton.setText(actionButtonWithTitle.b);
        int i = d.$EnumSwitchMapping$0[actionButtonWithTitle.c.ordinal()];
        if (i == 1) {
            vkText.setTextColor(e3m.f(R.attr.vk_ui_text_primary, getContext()));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            vkText.setTextColor(e3m.f(R.attr.vk_ui_text_contrast, getContext()));
        }
    }
}
