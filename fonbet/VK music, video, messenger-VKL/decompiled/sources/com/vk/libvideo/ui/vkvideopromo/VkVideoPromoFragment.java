package com.vk.libvideo.ui.vkvideopromo;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.b6f0;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.e0w0;
import xsna.e3m;
import xsna.f4m;
import xsna.gzs;
import xsna.h0w0;
import xsna.ipq0;
import xsna.jjc;
import xsna.msy;
import xsna.qcy;
import xsna.s1f0;
import xsna.s3q0;
import xsna.u0w0;
import xsna.w8i;

/* compiled from: VkVideoPromoFragment.kt */
/* loaded from: classes3.dex */
public final class VkVideoPromoFragment extends FragmentImpl implements w8i {
    public static final /* synthetic */ int Q = 0;
    public final Object N;
    public final Object O;
    public gzs<s3q0> P;

    public VkVideoPromoFragment() {
        ipq0 ipq0Var = new ipq0(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, ipq0Var);
        this.O = msy.a(lazyThreadSafetyMode, new b6f0(this, 22));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final h0w0 eo() {
        return (h0w0) this.N.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dhr0 dhr0Var = dhr0.a;
        Context context = layoutInflater.getContext();
        dhr0Var.getClass();
        LinearLayout linearLayout = new LinearLayout(dhr0.t(context));
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        qcy<Object>[] qcyVarArr = bwt0.a;
        int dimension = (int) linearLayout.getResources().getDimension(R.dimen.vk_ui_spacing_size2_xl);
        f4m.l(dimension, dimension, linearLayout);
        linearLayout.setBackgroundColor(e3m.f(R.attr.vk_ui_background_tertiary, linearLayout.getContext()));
        float a = cn70.a() * 20.0f;
        linearLayout.setClipToOutline(true);
        linearLayout.setOutlineProvider(new u0w0(a, false));
        ImageView imageView = new ImageView(linearLayout.getContext());
        imageView.setImageResource(R.drawable.vk_icon_logo_vk_video_color_56);
        linearLayout.addView(imageView);
        VkText vkText = new VkText(linearLayout.getContext(), null, 6, 0);
        vkText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        f4m.t((int) vkText.getResources().getDimension(R.dimen.vk_ui_spacing_size_xl), vkText);
        vkText.setTextAppearance(R.style.VkUiTypography_Title2);
        vkText.setTextColor(e3m.f(R.attr.vk_ui_text_primary, vkText.getContext()));
        vkText.setText(eo().d().a);
        vkText.setMaxLines(3);
        vkText.setTextAlignment(4);
        linearLayout.addView(vkText);
        VkButton vkButton = new VkButton(linearLayout.getContext(), null, 6, 0);
        vkButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        f4m.t((int) vkButton.getResources().getDimension(R.dimen.vk_ui_spacing_size4_xl), vkButton);
        vkButton.setText(eo().d().e ? eo().d().c : eo().d().b);
        VkButton.Size size = VkButton.Size.Large;
        vkButton.setSize(size);
        vkButton.setMode(VkButton.Mode.Primary);
        VkButton.Appearance appearance = VkButton.Appearance.Accent;
        vkButton.setAppearance(appearance);
        jjc.g(vkButton, new s1f0(9, this, vkButton));
        linearLayout.addView(vkButton);
        VkButton vkButton2 = new VkButton(linearLayout.getContext(), null, 6, 0);
        vkButton2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        f4m.t((int) vkButton2.getResources().getDimension(R.dimen.vk_ui_spacing_size_xl), vkButton2);
        vkButton2.setText(eo().d().d);
        vkButton2.setSize(size);
        vkButton2.setMode(VkButton.Mode.Tertiary);
        vkButton2.setAppearance(appearance);
        jjc.g(vkButton2, new e0w0(this, 0));
        linearLayout.addView(vkButton2);
        return linearLayout;
    }
}
