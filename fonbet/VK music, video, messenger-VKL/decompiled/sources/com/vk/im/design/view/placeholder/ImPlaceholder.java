package com.vk.im.design.view.placeholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.im.design.view.placeholder.a;
import com.vk.im.design.view.placeholder.b;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.awt0;
import xsna.cpy;
import xsna.dko;
import xsna.e3m;
import xsna.ey2;
import xsna.f4m;
import xsna.gpo0;
import xsna.jjc;
import xsna.law;
import xsna.maw;
import xsna.tlo0;
import xsna.udo;

/* compiled from: ImPlaceholder.kt */
/* loaded from: classes2.dex */
public final class ImPlaceholder extends FrameLayout {
    public static final /* synthetic */ int t = 0;
    public a b;
    public maw c;
    public law d;
    public final FrameLayout e;
    public final AppCompatImageView f;
    public final VKReplacerView g;
    public final VKReplacerView h;
    public final ViewGroup i;
    public final TextView j;
    public final TextView k;
    public final ViewGroup l;
    public final AppCompatImageView m;
    public final TextView n;
    public final VkUserStack o;
    public final ViewGroup p;
    public final ViewGroup q;
    public VkButton r;
    public VkButton s;

    /* compiled from: ImPlaceholder.kt */
    public interface a {

        /* compiled from: ImPlaceholder.kt */
        /* renamed from: com.vk.im.design.view.placeholder.ImPlaceholder$a$a, reason: collision with other inner class name */
        public static final class C1101a implements a {
            public final c.d a;
            public final int b;

            public C1101a(c.d dVar, int i) {
                this.a = dVar;
                this.b = i;
            }
        }

        /* compiled from: ImPlaceholder.kt */
        public static final class b implements a {
            public final dko a;

            public b(dko dkoVar) {
                this.a = dkoVar;
            }
        }

        /* compiled from: ImPlaceholder.kt */
        public static final class c implements a {
        }
    }

    public ImPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, true, 0, null, null, null, VKImageController.ScaleType.CENTER_CROP, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65275);
        LayoutInflater.from(context).inflate(R.layout.im_ui_placeholder, this);
        this.e = (FrameLayout) findViewById(R.id.im_ui_top_content_wrapper);
        this.f = (AppCompatImageView) findViewById(R.id.im_ui_top_icon);
        this.g = (VKReplacerView) findViewById(R.id.im_ui_avatar_view);
        this.h = (VKReplacerView) findViewById(R.id.im_ui_picture_view);
        this.i = (ViewGroup) findViewById(R.id.im_ui_middle_content_wrapper);
        this.j = (TextView) findViewById(R.id.title);
        this.k = (TextView) findViewById(R.id.subtitle);
        this.l = (ViewGroup) findViewById(R.id.im_ui_middle_extra_wrapper);
        this.m = (AppCompatImageView) findViewById(R.id.im_ui_middle_extra_before);
        this.n = (TextView) findViewById(R.id.extra_subtitle);
        this.o = (VkUserStack) findViewById(R.id.im_ui_middle_user_stack);
        this.p = (ViewGroup) findViewById(R.id.im_ui_cell_group_wrapper);
        this.q = (ViewGroup) findViewById(R.id.im_ui_button_group_wrapper);
    }

    public static void a(VkButton vkButton, a.C1102a c1102a) {
        vkButton.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = vkButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        c1102a.getClass();
        layoutParams.width = -2;
        vkButton.setLayoutParams(layoutParams);
        vkButton.setText(c1102a.a.a(vkButton.getContext()));
        vkButton.setCount(null);
        vkButton.setSize(c1102a.c);
        vkButton.setMode(c1102a.d);
        vkButton.setAppearance(c1102a.e);
        jjc.g(vkButton, new udo(c1102a, 17));
    }

    @Override // android.view.View
    public final law getBottom() {
        return this.d;
    }

    public final VkButton getBottomFirstButton() {
        return this.r;
    }

    public final VkButton getBottomSecondButton() {
        return this.s;
    }

    public final VkButton getBottomThirdButton() {
        return null;
    }

    public final maw getMiddle() {
        return this.c;
    }

    @Override // android.view.View
    public final a getTop() {
        return this.b;
    }

    public final void setBottom(law lawVar) {
        this.d = lawVar;
        boolean z = lawVar != null;
        ViewGroup viewGroup = this.p;
        awt0.v(viewGroup, z);
        boolean z2 = this.d != null;
        ViewGroup viewGroup2 = this.q;
        awt0.v(viewGroup2, z2);
        law lawVar2 = this.d;
        if (lawVar2 != null) {
            viewGroup.setVisibility(8);
            com.vk.im.design.view.placeholder.a aVar = lawVar2.a;
            awt0.v(viewGroup2, aVar != null);
            if (aVar != null) {
                VkButton vkButton = this.r;
                if (vkButton == null) {
                    vkButton = new VkButton(getContext(), null, 6, 0);
                    vkButton.setId(R.id.im_ui_bottom_first_button);
                    viewGroup2.addView(vkButton, 0, cpy.b(0, 0, 0, 0, 0, 0, 63));
                    this.r = vkButton;
                }
                a(vkButton, aVar.a);
                a.C1102a c1102a = aVar.b;
                if (c1102a != null) {
                    VkButton vkButton2 = this.s;
                    if (vkButton2 == null) {
                        vkButton2 = new VkButton(getContext(), null, 6, 0);
                        vkButton2.setId(R.id.im_ui_bottom_second_button);
                        viewGroup2.addView(vkButton2, 1, cpy.b(0, 0, 0, e3m.a(R.dimen.vk_ui_spacing_size_xl, vkButton2.getContext()), 0, 0, 55));
                        this.s = vkButton2;
                    }
                    a(vkButton2, c1102a);
                } else {
                    VkButton vkButton3 = this.s;
                    if (vkButton3 != null) {
                        f4m.j(vkButton3);
                    }
                }
            }
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = 0;
            viewGroup.setLayoutParams(marginLayoutParams);
        }
    }

    public final void setMiddle(maw mawVar) {
        this.c = mawVar;
        awt0.v(this.i, mawVar != null);
        maw mawVar2 = this.c;
        if (mawVar2 != null) {
            tlo0 tlo0Var = mawVar2.a;
            ey2.i(this.j, tlo0Var != null ? tlo0Var.a(getContext()) : null);
            tlo0 tlo0Var2 = mawVar2.b;
            ey2.i(this.k, tlo0Var2 != null ? tlo0Var2.a(getContext()) : null);
            b bVar = mawVar2.c;
            boolean z = bVar != null;
            ViewGroup viewGroup = this.l;
            awt0.v(viewGroup, z);
            boolean z2 = bVar != null;
            VkUserStack vkUserStack = this.o;
            awt0.v(vkUserStack, z2);
            if (bVar != null) {
                b.a aVar = bVar.a;
                awt0.v(viewGroup, aVar != null);
                if (aVar != null) {
                    b.a.C1103a c1103a = aVar.b;
                    boolean z3 = c1103a != null;
                    AppCompatImageView appCompatImageView = this.m;
                    awt0.v(appCompatImageView, z3);
                    if (c1103a != null) {
                        appCompatImageView.setImageDrawable(c1103a.a.a(getContext()));
                        gpo0.g(appCompatImageView, c1103a.b);
                        appCompatImageView.setContentDescription(null);
                    }
                    ey2.i(this.n, tlo0.b.a(aVar.a, getContext()));
                }
                b.C1104b c1104b = bVar.b;
                awt0.v(vkUserStack, c1104b != null);
                if (c1104b != null) {
                    vkUserStack.setCounter(null);
                    vkUserStack.setSize(c1104b.c);
                    vkUserStack.setText(c1104b.b);
                    vkUserStack.setAvatarsPosition(c1104b.d);
                    vkUserStack.setAvatars(c1104b.a);
                }
            }
        }
    }

    public final void setTop(a aVar) {
        this.b = aVar;
        awt0.v(this.e, aVar != null);
        AppCompatImageView appCompatImageView = this.f;
        f4m.j(appCompatImageView);
        VKReplacerView vKReplacerView = this.g;
        f4m.j(vKReplacerView.getView());
        VKReplacerView vKReplacerView2 = this.h;
        f4m.j(vKReplacerView2.getView());
        a aVar2 = this.b;
        if (aVar2 instanceof a.b) {
            appCompatImageView.setVisibility(0);
            appCompatImageView.setImageDrawable(((a.b) aVar2).a.a(appCompatImageView.getContext()));
            gpo0.g(appCompatImageView, null);
            appCompatImageView.setContentDescription(null);
            return;
        }
        if (!(aVar2 instanceof a.C1101a)) {
            if (!(aVar2 instanceof a.c)) {
                if (aVar2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            vKReplacerView2.getView().setVisibility(0);
            VkPicture vkPicture = new VkPicture(vKReplacerView2.getContext(), null, 6, 0);
            vKReplacerView2.a(vkPicture);
            ((a.c) aVar2).getClass();
            f4m.A(vkPicture, null);
            vkPicture.setContent(null);
            vkPicture.setContentDescription(null);
            vkPicture.setCornerRadius(VkPicture.CornerRadius.Large);
            return;
        }
        a.C1101a c1101a = (a.C1101a) aVar2;
        vKReplacerView.getView().setVisibility(0);
        VkAvatar vkAvatar = new VkAvatar(vKReplacerView.getContext(), null, 6, 0);
        vKReplacerView.a(vkAvatar);
        int i = c1101a.b;
        f4m.z(i, i, vkAvatar);
        c.d dVar = c1101a.a;
        dko dkoVar = dVar.b;
        Drawable a2 = dkoVar != null ? dkoVar.a(getContext()) : null;
        if (a2 != null) {
            vkAvatar.setEmptyImagePlaceholder(a2);
        }
        vkAvatar.setContent(dVar);
        vkAvatar.setContentDescription(null);
        vKReplacerView.getView().setContentDescription(null);
    }
}
