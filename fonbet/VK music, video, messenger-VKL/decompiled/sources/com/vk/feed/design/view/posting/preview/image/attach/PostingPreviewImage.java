package com.vk.feed.design.view.posting.preview.image.attach;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.text.VkText;
import com.vk.feed.tool.view.posting.preview.crop.PreviewCropLayout;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bwt0;
import xsna.cn70;
import xsna.dko;
import xsna.ey2;
import xsna.f4m;
import xsna.gko;
import xsna.gzs;
import xsna.jsk;
import xsna.khk;
import xsna.lhk;
import xsna.pr;
import xsna.qxn;
import xsna.s3q0;
import xsna.shy;
import xsna.tlo0;
import xsna.w3d0;
import xsna.zrp;
import xsna.zzo;

/* compiled from: PostingPreviewImage.kt */
/* loaded from: classes18.dex */
public final class PostingPreviewImage extends ConstraintLayout {
    public static final /* synthetic */ int z = 0;
    public final w3d0 t;
    public final View u;
    public final FrameLayout v;
    public final View w;
    public final VkText x;
    public Badge y;

    /* compiled from: PostingPreviewImage.kt */
    public interface Badge {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PostingPreviewImage.kt */
        public static final class IconStyle {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ IconStyle[] $VALUES;
            public static final IconStyle Medium;
            public static final IconStyle Small;

            static {
                IconStyle iconStyle = new IconStyle("Small", 0);
                Small = iconStyle;
                IconStyle iconStyle2 = new IconStyle("Medium", 1);
                Medium = iconStyle2;
                IconStyle[] iconStyleArr = {iconStyle, iconStyle2};
                $VALUES = iconStyleArr;
                $ENTRIES = new asp(iconStyleArr);
            }

            public IconStyle() {
                throw null;
            }

            public static IconStyle valueOf(String str) {
                return (IconStyle) Enum.valueOf(IconStyle.class, str);
            }

            public static IconStyle[] values() {
                return (IconStyle[]) $VALUES.clone();
            }
        }

        /* compiled from: PostingPreviewImage.kt */
        public static final class a implements Badge {
            public final gko a;
            public final tlo0.f b;
            public final IconStyle c;
            public final tlo0.f d;

            public a(gko gkoVar, tlo0.f fVar, IconStyle iconStyle, tlo0.f fVar2) {
                this.a = gkoVar;
                this.b = fVar;
                this.c = iconStyle;
                this.d = fVar2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c == aVar.c && this.d.equals(aVar.d);
            }

            public final int hashCode() {
                return Integer.hashCode(this.d.a) + ((this.c.hashCode() + shy.a(this.b.a, Integer.hashCode(this.a.a) * 31, 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Default(icon=");
                sb.append(this.a);
                sb.append(", text=");
                sb.append(this.b);
                sb.append(", iconStyle=");
                sb.append(this.c);
                sb.append(", iconContentDescription=");
                return pr.b(sb, this.d, ')');
            }
        }

        /* compiled from: PostingPreviewImage.kt */
        public static final class b implements Badge {
            public final gko a;
            public final IconStyle b;
            public final tlo0.f c;

            public b(gko gkoVar, IconStyle iconStyle, tlo0.f fVar) {
                this.a = gkoVar;
                this.b = iconStyle;
                this.c = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && this.b == bVar.b && this.c.equals(bVar.c);
            }

            public final int hashCode() {
                return Integer.hashCode(this.c.a) + ((this.b.hashCode() + (Integer.hashCode(this.a.a) * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Icon(icon=");
                sb.append(this.a);
                sb.append(", iconStyle=");
                sb.append(this.b);
                sb.append(", iconContentDescription=");
                return pr.b(sb, this.c, ')');
            }
        }
    }

    public PostingPreviewImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.posting_preview_image, this);
        this.t = ((PreviewCropLayout) findViewById(R.id.preview_crop_layout)).getImageLayer();
        this.u = findViewById(R.id.preview_badge_background);
        this.v = (FrameLayout) findViewById(R.id.preview_badge_container);
        this.w = findViewById(R.id.preview_badge_icon);
        this.x = (VkText) findViewById(R.id.preview_badge_text);
    }

    public final void P4(boolean z2, Badge.IconStyle iconStyle) {
        int b;
        View view = this.u;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (z2) {
            if (bVar != null) {
                bVar.v = R.id.preview_badge_container;
            }
            if (bVar != null) {
                ((ViewGroup.MarginLayoutParams) bVar).width = 0;
            }
        } else {
            if (bVar != null) {
                bVar.v = -1;
            }
            if (bVar != null) {
                int i = a.$EnumSwitchMapping$0[iconStyle.ordinal()];
                if (i == 1) {
                    b = cn70.b(36);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b = cn70.b(40);
                }
                ((ViewGroup.MarginLayoutParams) bVar).width = b;
            }
        }
        view.setLayoutParams(bVar);
    }

    public final void Q4(Badge.IconStyle iconStyle) {
        int b;
        int b2;
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[iconStyle.ordinal()];
        if (i == 1) {
            b = cn70.b(20);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            b = cn70.b(16);
        }
        int i2 = iArr[iconStyle.ordinal()];
        if (i2 == 1) {
            b2 = cn70.b(8);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            b2 = cn70.b(16);
        }
        View view = this.w;
        f4m.z(b, b, view);
        f4m.s(b2, view);
    }

    public final Badge getBadge() {
        return this.y;
    }

    public final View getBadgeAnchor() {
        return this.u;
    }

    public final void setBadge(Badge badge) {
        this.y = badge;
        FrameLayout frameLayout = this.v;
        View view = this.u;
        if (badge == null) {
            bwt0.p0(view, false);
            bwt0.p0(frameLayout, false);
            return;
        }
        bwt0.p0(view, true);
        bwt0.p0(frameLayout, true);
        boolean z2 = badge instanceof Badge.b;
        View view2 = this.w;
        VkText vkText = this.x;
        if (z2) {
            Badge.b bVar = (Badge.b) badge;
            Badge.IconStyle iconStyle = bVar.b;
            gko gkoVar = bVar.a;
            view2.setBackground(gko.b(gkoVar.a, getContext()));
            view.setContentDescription(tlo0.b.a(bVar.c, getContext()));
            vkText.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Q4(iconStyle);
            P4(false, iconStyle);
            return;
        }
        if (!(badge instanceof Badge.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Badge.a aVar = (Badge.a) badge;
        Badge.IconStyle iconStyle2 = aVar.c;
        gko gkoVar2 = aVar.a;
        view2.setBackground(gko.b(gkoVar2.a, getContext()));
        view.setContentDescription(tlo0.b.a(aVar.d, getContext()));
        ey2.h(vkText, aVar.b);
        vkText.setAlpha(1.0f);
        Q4(iconStyle2);
        P4(true, iconStyle2);
    }

    public final void setBadgeBackground(dko dkoVar) {
        this.u.setBackground(dkoVar.a(getContext()));
    }

    public final void setCropImageDetachListener(gzs<s3q0> gzsVar) {
        this.t.setOnDetachListener(new qxn(1, gzsVar));
    }

    public final void setCropImageListener(khk khkVar) {
        this.t.setClickListener(khkVar);
    }

    public final void setEditOnboardingListener(zzo zzoVar) {
        this.t.setEditOnboardingListener(zzoVar);
    }

    public final void setImageState(lhk lhkVar) {
        this.t.setImageState(lhkVar);
    }

    public final void setOnBadgeClickListener(gzs<s3q0> gzsVar) {
        this.u.setOnClickListener(new jsk(gzsVar, 10));
    }
}
