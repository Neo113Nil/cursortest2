package com.vk.stickers.roulette;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.imageloader.blur.view.BlurBubbleView;
import com.vk.stickers.roulette.StickersRouletteFragment;
import com.vk.stickers.roulette.roulett_view.RouletteView;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.HashSet;
import xsna.a0a;
import xsna.bwt0;
import xsna.cnw;
import xsna.dhr0;
import xsna.drm0;
import xsna.fes;
import xsna.fnj;
import xsna.h7u0;
import xsna.iah0;
import xsna.ies;
import xsna.ji70;
import xsna.kes;
import xsna.kn9;
import xsna.krv0;
import xsna.l8g;
import xsna.nds;
import xsna.nng0;
import xsna.ocl0;
import xsna.oyt;
import xsna.p90;
import xsna.pcl0;
import xsna.q3;
import xsna.q700;
import xsna.r800;
import xsna.rcl0;
import xsna.rg0;
import xsna.rk8;
import xsna.sg0;
import xsna.t6g0;
import xsna.vds;
import xsna.wpb;
import xsna.xwk;

/* compiled from: StickersRouletteFragment.kt */
/* loaded from: classes6.dex */
public final class StickersRouletteFragment extends BaseMvpFragment<ocl0> implements pcl0, ies, vds, fes, kes, nds {
    public static final /* synthetic */ int o0 = 0;
    public View T;
    public TextView U;
    public ImageView V;
    public RouletteView W;
    public LottieAnimationView X;
    public TextView Y;
    public View Z;
    public TextView a0;
    public TextView b0;
    public VkButton c0;
    public TextView d0;
    public View e0;
    public View f0;
    public TextView g0;
    public View h0;
    public SearchStatsLoggingInfo i0;
    public String j0;
    public int k0;
    public final rg0 l0;
    public final sg0 m0;
    public final cnw n0;

    /* compiled from: StickersRouletteFragment.kt */
    public static final class a {
        public static void a(Activity activity) {
            HashSet hashSet = iah0.a;
            if (fnj.d(activity) || iah0.n(activity)) {
                return;
            }
            p90.d(activity);
        }
    }

    /* compiled from: StickersRouletteFragment.kt */
    public static final class b extends ClickableSpan {
        public b() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            rk8 browser = xwk.d().getBrowser();
            Context requireContext = StickersRouletteFragment.this.requireContext();
            Uri parse = Uri.parse(String.format("https://%s/stickers/random?&page=rules", Arrays.copyOf(new Object[]{"m.".concat(a0a.d)}, 1)));
            LaunchContext launchContext = LaunchContext.A;
            browser.d(requireContext, parse, true);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public StickersRouletteFragment() {
        t6g0 t6g0Var = t6g0.b;
        this.S = new rcl0(this, t6g0.d());
        this.l0 = new rg0(this, 10);
        this.m0 = new sg0(this, 17);
        this.n0 = new cnw(this, 7);
    }

    public static boolean ko() {
        return Preference.d("random_sticker", "random_stickers_muted", true);
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // xsna.pcl0
    public final void R8(boolean z, boolean z2, boolean z3, String str, Integer num) {
        if (isAdded()) {
            if (z) {
                TextView textView = this.b0;
                if (textView != null) {
                    bwt0.p0(textView, false);
                }
                TextView textView2 = this.a0;
                if (textView2 != null) {
                    bwt0.p0(textView2, false);
                    return;
                }
                return;
            }
            if (z3) {
                TextView textView3 = this.b0;
                if (textView3 != null) {
                    textView3.setEnabled(false);
                }
                VkButton vkButton = this.c0;
                if (vkButton != null) {
                    bwt0.p0(vkButton, false);
                }
                TextView textView4 = this.b0;
                if (textView4 != null) {
                    textView4.setText(getResources().getString(R.string.running_magic));
                    return;
                }
                return;
            }
            if (str == null && num == null) {
                TextView textView5 = this.b0;
                if (textView5 != null) {
                    textView5.setEnabled(true);
                }
                TextView textView6 = this.b0;
                if (textView6 != null) {
                    textView6.setOnClickListener(this.m0);
                }
                TextView textView7 = this.b0;
                if (textView7 != null) {
                    textView7.setText(getResources().getString(R.string.try_your_luck_free));
                    return;
                }
                return;
            }
            if (z2) {
                TextView textView8 = this.b0;
                if (textView8 != null) {
                    textView8.setEnabled(true);
                }
                TextView textView9 = this.b0;
                if (textView9 != null) {
                    textView9.setOnClickListener(this.l0);
                }
                TextView textView10 = this.b0;
                if (textView10 != null) {
                    textView10.setText(getResources().getString(R.string.try_your_luck_gift, getResources().getQuantityString(R.plurals.balance_votes, num != null ? num.intValue() : 0, Integer.valueOf(num != null ? num.intValue() : 0))));
                    return;
                }
                return;
            }
            TextView textView11 = this.b0;
            if (textView11 != null) {
                textView11.setEnabled(true);
            }
            TextView textView12 = this.b0;
            if (textView12 != null) {
                textView12.setOnClickListener(this.n0);
            }
            TextView textView13 = this.b0;
            if (textView13 != null) {
                textView13.setText(getResources().getString(R.string.try_your_luck, str));
            }
        }
    }

    @Override // xsna.nds
    public final boolean W9() {
        TypedValue typedValue = krv0.a;
        return krv0.j();
    }

    @Override // xsna.kes
    public final boolean Xf() {
        if (getActivity() != null) {
            return !iah0.n(r0);
        }
        return true;
    }

    @Override // xsna.fes
    public final boolean df() {
        if (getActivity() != null) {
            return !iah0.n(r0);
        }
        return true;
    }

    public final void jo(int i) {
        ImageView imageView = this.V;
        ColorStateList imageTintList = imageView != null ? imageView.getImageTintList() : null;
        int defaultColor = imageTintList != null ? imageTintList.getDefaultColor() : dhr0.t.c(R.attr.vk_ui_separator_secondary);
        if (defaultColor != i) {
            ValueAnimator ofArgb = ValueAnimator.ofArgb(defaultColor, i);
            ofArgb.setDuration(600L);
            ofArgb.addUpdateListener(new ji70(this, 1));
            ofArgb.start();
        }
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return krv0.l(R.attr.vk_ui_background_modal);
    }

    public final void lo(String str) {
        if (str == null) {
            TextView textView = this.d0;
            if (textView != null) {
                textView.setText(getResources().getString(R.string.roulette_agreement_empty));
                return;
            }
            return;
        }
        String string = getResources().getString(R.string.roulette_rules);
        SpannableString spannableString = new SpannableString(str.length() == 0 ? getResources().getString(R.string.roulette_agreement_free, string, string) : getResources().getString(R.string.roulette_agreement, str, string));
        b bVar = new b();
        int K = drm0.K(0, 6, spannableString, string, false);
        int length = string.length() + K;
        spannableString.setSpan(new StyleSpan(1), K, length, 18);
        spannableString.setSpan(bVar, K, length, 33);
        TextView textView2 = this.d0;
        if (textView2 != null) {
            textView2.setText(spannableString);
        }
        TextView textView3 = this.d0;
        if (textView3 != null) {
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
        }
        TextView textView4 = this.d0;
        if (textView4 != null) {
            textView4.setHighlightColor(dhr0.t.c(R.attr.vk_ui_transparent_active));
        }
    }

    public final void mo(boolean z) {
        View view = this.Z;
        if (view != null) {
            bwt0.p0(view, z);
        }
    }

    public final void no(boolean z) {
        TextView textView;
        View view = this.h0;
        if (view != null) {
            bwt0.p0(view, z);
        }
        TextView textView2 = this.g0;
        if (textView2 != null) {
            bwt0.p0(textView2, z);
        }
        View view2 = this.f0;
        if (view2 != null) {
            bwt0.p0(view2, z);
        }
        if (!z || (textView = this.g0) == null) {
            return;
        }
        textView.setText(getResources().getString(R.string.default_network_error));
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.j0 = arguments != null ? arguments.getString("referrer") : null;
        Bundle arguments2 = getArguments();
        this.i0 = arguments2 != null ? (SearchStatsLoggingInfo) arguments2.getParcelable("search_stats_logging_info") : null;
        Bundle arguments3 = getArguments();
        this.k0 = arguments3 != null ? arguments3.getInt("arg_random_pack_attempt_id") : 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.roulette_fragment, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(dhr0.t.b(R.drawable.vk_icon_arrow_left_outline_28, R.attr.vk_ui_icon_accent_themed));
        dhr0.a.V(toolbar);
        toolbar.setNavigationOnClickListener(new q3(this, 13));
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.sound_button);
        imageButton.setSelected(ko());
        RouletteView rouletteView = this.W;
        if (rouletteView != null) {
            rouletteView.setMuted(ko());
        }
        Context context = imageButton.getContext();
        imageButton.setContentDescription(ko() ? context.getString(R.string.roulette_accessibility_sound_on) : context.getString(R.string.roulette_accessibility_sound_off));
        imageButton.setOnClickListener(new wpb(2, this, imageButton));
        BlurBubbleView blurBubbleView = (BlurBubbleView) inflate.findViewById(R.id.blurred_background);
        blurBubbleView.setOverlayColor(l8g.f(0.6f, dhr0.M() ? blurBubbleView.getContext().getColor(R.color.vk_gray_800) : blurBubbleView.getContext().getColor(R.color.vk_white)));
        ((ImageView) inflate.findViewById(R.id.random_pack_image)).setClipToOutline(true);
        this.V = (ImageView) inflate.findViewById(R.id.roulette_arrow);
        this.W = (RouletteView) inflate.findViewById(R.id.roulette_view);
        this.T = inflate.findViewById(R.id.roulette_group);
        this.X = (LottieAnimationView) inflate.findViewById(R.id.congrats_anim);
        FragmentActivity activity = getActivity();
        q700.h(activity, R.raw.confetti, q700.o(R.raw.confetti, activity)).b(new r800() { // from class: xsna.qcl0
            @Override // xsna.r800
            public final void onResult(Object obj) {
                i700 i700Var = (i700) obj;
                LottieAnimationView lottieAnimationView = StickersRouletteFragment.this.X;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setVisibility(4);
                    lottieAnimationView.setComposition(i700Var);
                }
            }
        });
        this.e0 = inflate.findViewById(R.id.progress);
        this.g0 = (TextView) inflate.findViewById(R.id.error_message_tv);
        this.h0 = inflate.findViewById(R.id.error_icon);
        View findViewById = inflate.findViewById(R.id.retry_button);
        this.f0 = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new oyt(this, 5));
        }
        this.Y = (TextView) inflate.findViewById(R.id.random_stickers_not_allowed_tv);
        this.a0 = (TextView) inflate.findViewById(R.id.balance_tv);
        TextView textView = (TextView) inflate.findViewById(R.id.available_packs);
        this.U = textView;
        if (textView != null) {
            textView.setOnClickListener(new kn9(this, 13));
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.roulette_button);
        this.b0 = textView2;
        if (textView2 != null) {
            textView2.setOnClickListener(this.n0);
        }
        VkButton vkButton = (VkButton) inflate.findViewById(R.id.gift_button);
        this.c0 = vkButton;
        if (vkButton != null) {
            vkButton.setOnClickListener(this.l0);
        }
        this.d0 = (TextView) inflate.findViewById(R.id.roulette_agreement);
        this.Z = inflate.findViewById(R.id.bottom_content_group);
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        nng0 presenter;
        super.onPause();
        RouletteView rouletteView = this.W;
        if (rouletteView == null || (presenter = rouletteView.getPresenter()) == null) {
            return;
        }
        presenter.onPause();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        nng0 presenter;
        super.onResume();
        RouletteView rouletteView = this.W;
        if (rouletteView == null || (presenter = rouletteView.getPresenter()) == null) {
            return;
        }
        presenter.onResume();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ocl0 ocl0Var = (ocl0) this.S;
        if (ocl0Var != null) {
            ocl0Var.Q0();
        }
    }

    public final void oo(boolean z) {
        View view = this.e0;
        if (view != null) {
            bwt0.p0(view, z);
        }
    }

    public final void po(boolean z) {
        View view = this.T;
        if (view != null) {
            bwt0.p0(view, z);
        }
    }

    public final void qo(int i, boolean z, boolean z2) {
        TextView textView = this.a0;
        if (textView != null) {
            bwt0.p0(textView, z);
        }
        TextView textView2 = this.a0;
        if (textView2 != null) {
            textView2.setText(getString(R.string.accout_votes_left, getResources().getQuantityString(z2 ? R.plurals.balance_votes : R.plurals.balance_attempts, i, Integer.valueOf(i))));
        }
    }

    public final void ro(String str) {
        int i = h7u0.p;
        h7u0.a a2 = h7u0.b.a(kn());
        a2.g0(R.string.error);
        a2.a.f = str;
        a2.c0(R.string.ok, null);
        a2.m();
    }
}
