package com.vk.superapp.browser.internal.ui.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.image.c;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.external.miniapp.net.personal.BannerType;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.brm0;
import xsna.dhr0;
import xsna.e370;
import xsna.enj;
import xsna.f4m;
import xsna.gb;
import xsna.gfx0;
import xsna.ifx0;
import xsna.jjc;
import xsna.l1a0;
import xsna.mz80;
import xsna.qb6;
import xsna.zrp;

/* compiled from: PersonalBannerView.kt */
/* loaded from: classes6.dex */
public final class PersonalBannerView extends ConstraintLayout {
    public static final /* synthetic */ int y = 0;
    public final View t;
    public final TextView u;
    public final TextView v;
    public final VKReplacerView w;
    public final ImageView x;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PersonalBannerView.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source ACTION_MENU;
        public static final Source BOTTOM_SHEET;

        static {
            Source source = new Source("BOTTOM_SHEET", 0);
            BOTTOM_SHEET = source;
            Source source2 = new Source("ACTION_MENU", 1);
            ACTION_MENU = source2;
            Source[] sourceArr = {source, source2};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        public Source() {
            throw null;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    /* compiled from: PersonalBannerView.kt */
    public interface a {
        void a(String str);

        void b(BannerType bannerType);
    }

    public PersonalBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final void P4(l1a0 l1a0Var, Source source, a aVar) {
        this.u.setText(l1a0Var.c);
        this.v.setText(l1a0Var.e);
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        gfx0Var.getClass();
        String str = dhr0.M() ? l1a0Var.b : l1a0Var.a;
        ifx0 ifx0Var = e370.c;
        if (ifx0Var == null) {
            ifx0Var = null;
        }
        VKImageController<View> create = ifx0Var.b().create(getContext());
        this.w.a(((c) create).getView());
        create.f(str, new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, 0, enj.e(R.drawable.vk_icon_coins_outline_28, R.attr.vk_ui_icon_accent_themed, getContext()), null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, (str != null ? Boolean.valueOf(brm0.v(str, ".svg", false)) : null) == null ? new Size(28, 28) : null, null, 49119));
        String str2 = l1a0Var.f;
        String str3 = l1a0Var.g;
        ImageView imageView = this.x;
        imageView.setVisibility(0);
        imageView.setImageDrawable(enj.e(R.drawable.vk_icon_help_outline_24, R.attr.vk_ui_icon_secondary, getContext()));
        if (str2 == null || str2.length() == 0) {
            jjc.g(imageView, new mz80(3, str3, this));
        } else {
            jjc.g(imageView, new gb(24, aVar, str2));
        }
        Source source2 = Source.BOTTOM_SHEET;
        View view = this.t;
        if (source == source2) {
            if (view != null) {
                view.setOnClickListener(null);
            }
        } else if (view != null) {
            jjc.g(view, new qb6(22, aVar, l1a0Var));
        }
    }

    public PersonalBannerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        View childAt;
        View.inflate(context, R.layout.vk_personal_banner_view, this).setBackgroundResource(R.drawable.vk_bg_personal_banner);
        if (getChildCount() > 0) {
            childAt = getChildAt(0);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
        } else {
            childAt = null;
        }
        if (childAt != null) {
            f4m.u(childAt, 0, 0, 0, 0);
        } else {
            childAt = null;
        }
        this.t = childAt;
        this.u = (TextView) findViewById(R.id.title_text);
        this.v = (TextView) findViewById(R.id.subtitle_text);
        VKReplacerView vKReplacerView = new VKReplacerView(context, null, 6);
        ((FrameLayout) findViewById(R.id.icon_container)).addView(vKReplacerView);
        this.w = vKReplacerView;
        this.x = (ImageView) findViewById(R.id.close_button);
    }
}
