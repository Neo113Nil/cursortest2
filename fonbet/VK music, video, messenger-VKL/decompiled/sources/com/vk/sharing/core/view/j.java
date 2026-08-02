package com.vk.sharing.core.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.core.view.TargetSendActionView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import xsna.a4o0;
import xsna.an10;
import xsna.bi80;
import xsna.bwt0;
import xsna.c3k0;
import xsna.cn70;
import xsna.cz9;
import xsna.d3m;
import xsna.e3m;
import xsna.i1f;
import xsna.iah0;
import xsna.izs;
import xsna.jk9;
import xsna.n3t;
import xsna.o9r0;
import xsna.pq9;
import xsna.r2v;
import xsna.rm0;
import xsna.s3q0;
import xsna.ucp;

/* compiled from: TargetWithSendActionView.kt */
/* loaded from: classes5.dex */
public final class j extends LinearLayout {
    public static final /* synthetic */ int p = 0;
    public pq9 b;
    public izs<? super Target, s3q0> c;
    public izs<? super Target, s3q0> d;
    public Target e;
    public Integer f;
    public final ImAvatarView g;
    public final AppCompatTextView h;
    public final TextView i;
    public final ImageView j;
    public final cz9 k;
    public AnimatorSet l;
    public final TargetSendActionView m;
    public io.reactivex.rxjava3.disposables.c n;
    public io.reactivex.rxjava3.disposables.c o;

    /* compiled from: TargetWithSendActionView.kt */
    public static final class a {
        public static TargetSendActionView.State a(Target target, pq9 pq9Var) {
            return target.g ? TargetSendActionView.State.OPEN : (pq9Var == null || !pq9Var.d(target)) ? TargetSendActionView.State.SEND : TargetSendActionView.State.CANCEL;
        }
    }

    /* compiled from: TargetWithSendActionView.kt */
    public static final class b implements TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = 200 / 3000;
            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= f && f <= f2) {
                return f / f2;
            }
            if (1.0f - f2 > f || f > 1.0f) {
                return 1.0f;
            }
            return (1.0f - f) / f2;
        }
    }

    /* compiled from: TargetWithSendActionView.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TargetSendActionView.State.values().length];
            try {
                iArr[TargetSendActionView.State.SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TargetSendActionView.State.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TargetSendActionView.State.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j(Context context) {
        super(context, null, 0);
        setBackgroundResource(R.drawable.rounded_list_selector);
        View.inflate(context, R.layout.layout_share_target_with_send_action_view, this);
        setLayoutParams(new RecyclerView.p(-1, View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.sharing_target_with_send_action_height), 1073741824)));
        this.k = new cz9(context, R.drawable.vk_icon_ghost_12, iah0.a(1.5f), iah0.a(3.0f));
        this.g = (ImAvatarView) findViewById(R.id.avatar);
        this.j = (ImageView) findViewById(R.id.indicator);
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(R.id.title);
        appCompatTextView.setEmojiCompatEnabled(false);
        this.h = appCompatTextView;
        this.i = (TextView) findViewById(R.id.status);
        TargetSendActionView targetSendActionView = (TargetSendActionView) findViewById(R.id.action);
        this.m = targetSendActionView;
        Integer[] numArr = {Integer.valueOf(R.string.sharing_share), Integer.valueOf(R.string.sharing_send), Integer.valueOf(R.string.sharing_goto_group_short), Integer.valueOf(R.string.sharing_goto_chat), Integer.valueOf(R.string.sharing_animated_cancel_label)};
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (int i = 0; i < 5; i++) {
            String string = getContext().getString(numArr[i].intValue());
            f = Math.max(f, targetSendActionView.getPaint().measureText(string, 0, string.length()));
        }
        bwt0.m0(an10.b(f + e3m.a(R.dimen.vk_ui_button_padding_left, getContext()) + e3m.a(R.dimen.vk_ui_button_padding_right, getContext())), this.m.getLayoutParams().height, targetSendActionView);
        this.m.setOnClickListener(new i1f(this, 9));
        int a2 = e3m.a(R.dimen.layout_share_target_avatar_size, getContext());
        ImAvatarView imAvatarView = this.g;
        int b2 = cn70.b(0);
        int b3 = cn70.b(16);
        int b4 = cn70.b(0);
        int b5 = cn70.b(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        layoutParams.leftMargin = b3;
        layoutParams.topMargin = b4;
        layoutParams.rightMargin = b2;
        layoutParams.bottomMargin = b5;
        layoutParams.gravity = 16;
        imAvatarView.setLayoutParams(layoutParams);
        imAvatarView.setAvatarBorderConfigParamsOverride(new o9r0(false, null, Float.valueOf(cn70.b(2)), null, false, null, null, null, null, 2043));
    }

    public final void a() {
        float f = -cn70.f(9);
        float f2 = cn70.f(17);
        TextView textView = this.i;
        textView.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f};
        AppCompatTextView appCompatTextView = this.h;
        Property property = View.TRANSLATION_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) property, fArr), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, f2, f + f2), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        d3m.g(animatorSet, new bi80(this, 26));
        animatorSet.setInterpolator(new b());
        animatorSet.setDuration(3000L);
        animatorSet.start();
        this.l = animatorSet;
    }

    public final void b(Target target, boolean z) {
        this.i.setText(getContext().getResources().getString(z ? R.string.error : (target == null || !target.l) ? R.string.sharing_sent : R.string.sharing_shared));
    }

    public final pq9 getCancellationDelegate() {
        return this.b;
    }

    public final izs<Target, s3q0> getOnGotoClicked() {
        return this.d;
    }

    public final izs<Target, s3q0> getOnSendClicked() {
        return this.c;
    }

    public final Integer getPosition() {
        return this.f;
    }

    public final Target getTarget() {
        return this.e;
    }

    public final void setCancellationDelegate(pq9 pq9Var) {
        this.b = pq9Var;
        io.reactivex.rxjava3.disposables.c cVar = this.n;
        if (cVar != null) {
            cVar.dispose();
        }
        this.n = pq9Var != null ? new i0(pq9Var.d.a0(io.reactivex.rxjava3.android.schedulers.a.b()), new r2v(new c3k0(this, 2), 17)).subscribe(new n3t(new rm0(28, this, pq9Var), 25)) : null;
    }

    public final void setOnGotoClicked(izs<? super Target, s3q0> izsVar) {
        this.d = izsVar;
    }

    public final void setOnSendClicked(izs<? super Target, s3q0> izsVar) {
        this.c = izsVar;
    }

    public final void setPosition(Integer num) {
        this.f = num;
    }

    public final void setTarget(Target target) {
        Target target2 = this.e;
        TargetSendActionView targetSendActionView = this.m;
        ImAvatarView imAvatarView = this.g;
        boolean z = false;
        ImageView imageView = this.j;
        TextView textView = this.i;
        AppCompatTextView appCompatTextView = this.h;
        if (target != null) {
            pq9 pq9Var = this.b;
            if (target2 != null && target.equals(target2) && a.a(target2, pq9Var) != a.a(target, pq9Var)) {
                z = true;
            }
            b(target2, z);
            if (target != target2 && !z) {
                imAvatarView.r1(target.i, target.j);
                ucp ucpVar = ucp.a;
                appCompatTextView.setText(ucp.i(target.d));
                AnimatorSet animatorSet = this.l;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                appCompatTextView.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                textView.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                textView.setVisibility(8);
                setContentDescription(target.d);
                appCompatTextView.setSelected(target.g);
                imageView.setImageResource(R.drawable.ic_casper_chat_icon_22);
                bwt0.p0(imageView, target.n);
                this.k.getDrawable(1).setTint(target.o);
            }
            targetSendActionView.b(new a4o0(target), a.a(target, pq9Var), pq9Var);
        } else {
            imAvatarView.s1(null);
            appCompatTextView.setText((CharSequence) null);
            appCompatTextView.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            textView.setText((CharSequence) null);
            textView.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            textView.setVisibility(8);
            setContentDescription(null);
            appCompatTextView.setSelected(false);
            imageView.setVisibility(4);
            AnimatorSet animatorSet2 = this.l;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            targetSendActionView.getClass();
            targetSendActionView.post(new jk9(targetSendActionView, 12));
        }
        this.e = target;
    }

    public final void setTargetAccentColor(int i) {
        this.m.setColorAccent(i);
    }
}
