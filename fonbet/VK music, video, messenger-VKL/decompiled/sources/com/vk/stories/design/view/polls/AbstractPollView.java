package com.vk.stories.design.view.polls;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.AdaptiveSizeTextView;
import com.vk.core.view.PhotoStripView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.polls.PhotoPoll;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.polls.PollContentColor;
import com.vk.dto.polls.PollGradient;
import com.vk.dto.polls.PollTile;
import com.vk.log.L;
import com.vk.polls.R$styleable;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vk.stories.design.view.polls.AbstractPollView;
import com.vk.stories.design.view.polls.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xsna.asb0;
import xsna.asp;
import xsna.bh;
import xsna.bpn0;
import xsna.bwt0;
import xsna.ch;
import xsna.cn70;
import xsna.csb0;
import xsna.db;
import xsna.dhr0;
import xsna.dqb0;
import xsna.e3m;
import xsna.e43;
import xsna.e6o;
import xsna.enj;
import xsna.epx;
import xsna.f4m;
import xsna.fkq0;
import xsna.gtb0;
import xsna.i5g;
import xsna.iah0;
import xsna.j9x;
import xsna.jjc;
import xsna.l8g;
import xsna.m33;
import xsna.og;
import xsna.q01;
import xsna.qcy;
import xsna.qq2;
import xsna.rli0;
import xsna.s3q0;
import xsna.s6o;
import xsna.swe0;
import xsna.taa0;
import xsna.tg;
import xsna.ug;
import xsna.ulp0;
import xsna.vg;
import xsna.vrb0;
import xsna.vtb0;
import xsna.wg;
import xsna.wzs;
import xsna.z8x;
import xsna.zrp;

/* compiled from: AbstractPollView.kt */
/* loaded from: classes6.dex */
public abstract class AbstractPollView extends FrameLayout {
    public static final int S = iah0.a(8);
    public static final int T = iah0.a(12);
    public static final AdaptiveSizeTextView.a U = new AdaptiveSizeTextView.a(14.0f, (int) iah0.y(4));
    public static final AdaptiveSizeTextView.a V = new AdaptiveSizeTextView.a(23.0f, (int) iah0.y(6));
    public static final int W = iah0.a(36);
    public static final int a0 = iah0.a(60);
    public static final int b0 = R.drawable.highlight_unlimited;
    public static final int c0 = R.drawable.white_ripple_unbounded;
    public static final int d0 = R.drawable.vk_icon_more_vertical_24;
    public static final int e0 = R.drawable.vk_icon_more_vertical_shadow_24;
    public static final int f0 = R.attr.vk_ui_background_accent_themed;
    public static final int g0 = R.attr.vk_ui_background_contrast;
    public static final int h0 = R.drawable.highlight_radius_4;
    public static final int i0 = R.drawable.highlight_white_radius_4;
    public final PhotoStripView A;
    public final ProgressBar B;
    public final TextView C;
    public Animator D;
    public PopupMenu E;
    public String F;
    public com.vk.stories.design.view.polls.a G;
    public s6o H;
    public final og I;
    public View.OnClickListener J;
    public final q01 K;
    public final vg L;
    public final wg M;
    public e6o N;
    public e6o O;
    public e6o P;
    public e6o Q;
    public e6o R;
    public c b;
    public boolean c;
    public Poll d;
    public String e;
    public String f;
    public final int g;
    public final Drawable h;
    public final Drawable i;
    public final int j;
    public final int k;
    public final int l;
    public int m;
    public int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final AppCompatImageView r;
    public final AdaptiveSizeTextView s;
    public final TextView t;
    public final LinearLayout u;
    public final VkImage v;
    public final View w;
    public final TextView x;
    public final ViewGroup y;
    public final TextView z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AbstractPollView.kt */
    public static final class ColorAttrsNoBackground {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ColorAttrsNoBackground[] $VALUES;
        public static final ColorAttrsNoBackground AUTHOR_NO_BACKGROUND;
        public static final ColorAttrsNoBackground INFO_COLOR_NO_BACKGROUND;
        public static final ColorAttrsNoBackground PROGRESS_BAR_COLOR_NO_BACKGROUND;
        public static final ColorAttrsNoBackground REPLAY_NO_BACKGROUND_COLOR;
        public static final ColorAttrsNoBackground TITLE_COLOR_NO_BACKGROUND;
        public static final ColorAttrsNoBackground VOTE_BUTTON_NO_BACKGROUND_TEXT_COLOR;
        private final int res;

        static {
            ColorAttrsNoBackground colorAttrsNoBackground = new ColorAttrsNoBackground("TITLE_COLOR_NO_BACKGROUND", 0, R.attr.vk_ui_text_muted);
            TITLE_COLOR_NO_BACKGROUND = colorAttrsNoBackground;
            ColorAttrsNoBackground colorAttrsNoBackground2 = new ColorAttrsNoBackground("REPLAY_NO_BACKGROUND_COLOR", 1, R.attr.vk_ui_icon_tertiary);
            REPLAY_NO_BACKGROUND_COLOR = colorAttrsNoBackground2;
            ColorAttrsNoBackground colorAttrsNoBackground3 = new ColorAttrsNoBackground("INFO_COLOR_NO_BACKGROUND", 2, R.attr.vk_ui_text_secondary);
            INFO_COLOR_NO_BACKGROUND = colorAttrsNoBackground3;
            ColorAttrsNoBackground colorAttrsNoBackground4 = new ColorAttrsNoBackground("AUTHOR_NO_BACKGROUND", 3, R.attr.vk_ui_text_secondary);
            AUTHOR_NO_BACKGROUND = colorAttrsNoBackground4;
            ColorAttrsNoBackground colorAttrsNoBackground5 = new ColorAttrsNoBackground("PROGRESS_BAR_COLOR_NO_BACKGROUND", 4, R.attr.vk_ui_text_accent);
            PROGRESS_BAR_COLOR_NO_BACKGROUND = colorAttrsNoBackground5;
            ColorAttrsNoBackground colorAttrsNoBackground6 = new ColorAttrsNoBackground("VOTE_BUTTON_NO_BACKGROUND_TEXT_COLOR", 5, R.attr.vk_ui_text_contrast_themed);
            VOTE_BUTTON_NO_BACKGROUND_TEXT_COLOR = colorAttrsNoBackground6;
            ColorAttrsNoBackground[] colorAttrsNoBackgroundArr = {colorAttrsNoBackground, colorAttrsNoBackground2, colorAttrsNoBackground3, colorAttrsNoBackground4, colorAttrsNoBackground5, colorAttrsNoBackground6};
            $VALUES = colorAttrsNoBackgroundArr;
            $ENTRIES = new asp(colorAttrsNoBackgroundArr);
        }

        public ColorAttrsNoBackground(String str, int i, int i2) {
            this.res = i2;
        }

        public static ColorAttrsNoBackground valueOf(String str) {
            return (ColorAttrsNoBackground) Enum.valueOf(ColorAttrsNoBackground.class, str);
        }

        public static ColorAttrsNoBackground[] values() {
            return (ColorAttrsNoBackground[]) $VALUES.clone();
        }

        public final int a(Context context) {
            return e3m.f(this.res, context);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AbstractPollView.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a AUTHOR_WITH_BACKGROUND;
        public static final a INFO_COLOR_WITH_BACKGROUND;
        public static final a PROGRESS_BAR_COLOR_WITH_BACKGROUND;
        public static final a REPLAY_WITH_BACKGROUND_COLOR;
        public static final a TITLE_COLOR_WITH_BACKGROUND;

        /* renamed from: long, reason: not valid java name */
        private final long f40long;

        static {
            a aVar = new a("TITLE_COLOR_WITH_BACKGROUND", 0, 4294967295L);
            TITLE_COLOR_WITH_BACKGROUND = aVar;
            a aVar2 = new a("REPLAY_WITH_BACKGROUND_COLOR", 1, 3640655871L);
            REPLAY_WITH_BACKGROUND_COLOR = aVar2;
            a aVar3 = new a("INFO_COLOR_WITH_BACKGROUND", 2, 3607101439L);
            INFO_COLOR_WITH_BACKGROUND = aVar3;
            a aVar4 = new a("AUTHOR_WITH_BACKGROUND", 3, 3607101439L);
            AUTHOR_WITH_BACKGROUND = aVar4;
            a aVar5 = new a("PROGRESS_BAR_COLOR_WITH_BACKGROUND", 4, 4294967295L);
            PROGRESS_BAR_COLOR_WITH_BACKGROUND = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, long j) {
            this.f40long = j;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int h() {
            return (int) this.f40long;
        }
    }

    /* compiled from: AbstractPollView.kt */
    public static final class b {
        public static String a(Context context, Poll poll, boolean z) {
            int i = poll.h;
            if (i == 0 && poll.Bb()) {
                return context.getString(z ? R.string.poll_vote_first_female : R.string.poll_vote_first_male);
            }
            return i == 0 ? context.getString(R.string.poll_no_votes) : enj.f(R.plurals.poll_voters, i, context);
        }
    }

    /* compiled from: AbstractPollView.kt */
    public interface c {
        void C3(Poll poll);

        boolean G4();

        void J3(Poll poll, String str);

        void J4(Poll poll);

        asb0 K2();

        void h3(Poll poll);

        void s3(UserId userId);
    }

    /* compiled from: AbstractPollView.kt */
    public static final class d implements a.c {
        public d() {
        }

        @Override // com.vk.stories.design.view.polls.a.c
        public final void a(long j, boolean z) {
            AbstractPollView abstractPollView = AbstractPollView.this;
            if (z) {
                abstractPollView.getPoll().x.add(Long.valueOf(j));
            } else {
                abstractPollView.getPoll().x.remove(Long.valueOf(j));
            }
            TransitionManager.beginDelayedTransition(abstractPollView, new Fade().setInterpolator(qq2.f).setDuration(200L));
            int i = AbstractPollView.S;
            abstractPollView.g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractPollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i = 0;
        this.c = true;
        this.e = t0.a(MobileOfficialAppsCoreNavStat$EventScreen.POLL);
        this.o = true;
        this.F = "";
        this.I = new og(this, i);
        this.J = new tg(this, i);
        ug ugVar = new ug(this, 0);
        bpn0 bpn0Var = jjc.a;
        this.K = new q01(ugVar, 2);
        this.L = new vg(this, i);
        this.M = new wg(this, 0);
        LayoutInflater.from(getContext()).inflate(R.layout.poll_view, this);
        this.r = (AppCompatImageView) findViewById(R.id.poll_actions);
        AdaptiveSizeTextView adaptiveSizeTextView = (AdaptiveSizeTextView) findViewById(R.id.poll_title);
        adaptiveSizeTextView.setMinSizeParams(U);
        adaptiveSizeTextView.setMaxSizeParams(V);
        this.s = adaptiveSizeTextView;
        TextView textView = (TextView) findViewById(R.id.poll_info);
        this.t = textView;
        this.u = (LinearLayout) findViewById(R.id.options_container);
        this.x = (TextView) findViewById(R.id.poll_multiple_vote_button);
        this.y = (ViewGroup) findViewById(R.id.poll_results);
        this.A = (PhotoStripView) findViewById(R.id.photo_strip_view);
        this.z = (TextView) findViewById(R.id.votes_count);
        this.B = (ProgressBar) findViewById(R.id.multiple_progress);
        this.v = (VkImage) findViewById(R.id.poll_background);
        TextView textView2 = (TextView) findViewById(R.id.poll_author_name);
        this.C = textView2;
        this.w = findViewById(R.id.poll_small_rect_view);
        h();
        n();
        addOnAttachStateChangeListener(new bh(this));
        TypedArray obtainStyledAttributes = attributeSet != null ? context.obtainStyledAttributes(attributeSet, R$styleable.a) : null;
        if (obtainStyledAttributes != null) {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, iah0.a(8));
            this.g = obtainStyledAttributes.getResourceId(2, R.drawable.default_poll_background);
            this.i = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDrawable(4) : m33.a(R.drawable.poll_view_no_background_selector, context);
            this.h = obtainStyledAttributes.hasValue(5) ? obtainStyledAttributes.getDrawable(5) : m33.a(R.drawable.poll_view_with_background_selector, context);
            this.m = dimensionPixelSize;
            this.n = dimensionPixelSize;
            this.j = obtainStyledAttributes.getDimensionPixelSize(9, iah0.a(22));
            float f = 14;
            this.l = obtainStyledAttributes.getDimensionPixelSize(3, iah0.a(f));
            this.k = obtainStyledAttributes.getDimensionPixelSize(0, iah0.a(f));
            this.o = obtainStyledAttributes.getBoolean(7, true);
            this.p = obtainStyledAttributes.getBoolean(8, false);
            this.q = obtainStyledAttributes.getBoolean(6, false);
        } else {
            int a2 = iah0.a(8);
            this.g = R.drawable.default_poll_background;
            this.i = m33.a(R.drawable.poll_view_no_background_selector, context);
            this.h = m33.a(R.drawable.poll_view_with_background_selector, context);
            this.m = a2;
            this.n = a2;
            this.j = iah0.a(22);
            float f2 = 14;
            this.l = iah0.a(f2);
            this.k = iah0.a(f2);
            this.o = true;
            this.p = false;
            this.q = false;
        }
        adaptiveSizeTextView.setTextSize(0, this.j);
        textView.setTextSize(0, this.l);
        textView2.setTextSize(0, this.k);
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }

    private final void setReplayVisibility(Poll poll) {
        boolean z = poll.Fb() && !(poll.s instanceof PollContentColor);
        int i = z ? e0 : d0;
        AppCompatImageView appCompatImageView = this.r;
        appCompatImageView.setImageResource(i);
        int[][] iArr = {new int[]{-16842910}, new int[]{android.R.attr.state_enabled}};
        int h = z ? a.REPLAY_WITH_BACKGROUND_COLOR.h() : ColorAttrsNoBackground.REPLAY_NO_BACKGROUND_COLOR.a(getContext());
        appCompatImageView.setImageTintList(new ColorStateList(iArr, new int[]{h, h}));
        appCompatImageView.setBackgroundResource(z ? c0 : b0);
    }

    public final void f(Poll poll, final boolean z) {
        boolean z2;
        long j;
        int a2;
        String str;
        String string;
        CharSequence text;
        boolean z3;
        setPoll(poll);
        VkImage vkImage = this.v;
        vkImage.clear();
        vkImage.setImageBitmap(null);
        vkImage.setBackgroundResource(0);
        PollBackground pollBackground = getPoll().s;
        if (pollBackground == null || ((z3 = pollBackground instanceof PollContentColor))) {
            Drawable a3 = m33.a(this.g, getContext());
            GradientDrawable gradientDrawable = a3 instanceof GradientDrawable ? (GradientDrawable) a3 : null;
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadius(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                vkImage.setImageDrawable(gradientDrawable);
                vkImage.setOutlineProvider(new ch(this.m, this.n));
            }
        } else {
            bpn0 bpn0Var = csb0.a;
            if (pollBackground instanceof PhotoPoll) {
                PhotoPoll photoPoll = (PhotoPoll) pollBackground;
                int i = taa0.o;
                ImageSize a4 = taa0.a.a(photoPoll, iah0.a(344), iah0.a(160));
                int c2 = l8g.c(0.6f, photoPoll.c);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(c2);
                gradientDrawable2.setCornerRadius(0);
                vkImage.setBackground(gradientDrawable2);
                vkImage.o0(a4.d.d, null);
            } else if (pollBackground instanceof PollGradient) {
                vkImage.setImageDrawable(new dqb0((PollGradient) pollBackground, 0));
            } else if (pollBackground instanceof PollTile) {
                PollTile pollTile = (PollTile) pollBackground;
                int i2 = vrb0.d;
                ImageSize a5 = vrb0.a.a(pollTile, iah0.v());
                int i3 = pollTile.c;
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setColor(i3);
                gradientDrawable3.setCornerRadius(0);
                vkImage.setBackground(gradientDrawable3);
                vkImage.o0(a5.d.d, null);
            } else {
                if (!z3) {
                    throw new NoWhenBranchMatchedException();
                }
                csb0.d(vkImage, (PollContentColor) pollBackground, null, 0);
            }
            vkImage.setOutlineProvider(new ch(this.m, this.n));
        }
        boolean Fb = getPoll().Fb();
        setReplayVisibility(getPoll());
        Poll poll2 = getPoll();
        boolean Fb2 = poll2.Fb();
        long j2 = poll2.k;
        Owner owner = poll2.w;
        boolean z4 = Fb2 && !(poll2.s instanceof PollContentColor);
        TextView textView = this.C;
        if (owner == null || (!poll2.isClosed() && j2 <= 0)) {
            textView.setVisibility(8);
            textView.setClickable(false);
            if (fkq0.c(poll2.r)) {
                L.l("Incorrect state of author: " + poll2.b + ", " + poll2.c);
            }
            z2 = true;
        } else {
            textView.setVisibility(0);
            textView.setBackgroundResource(z4 ? i0 : h0);
            textView.setTextColor(z4 ? a.AUTHOR_WITH_BACKGROUND.h() : ColorAttrsNoBackground.AUTHOR_NO_BACKGROUND.a(getContext()));
            textView.setText(owner.c);
            textView.setClickable(true);
            z2 = false;
        }
        AdaptiveSizeTextView adaptiveSizeTextView = this.s;
        CharSequence text2 = adaptiveSizeTextView.getText();
        boolean z5 = text2 == null || text2.length() == 0;
        adaptiveSizeTextView.setText(poll2.d);
        if (z4) {
            a2 = a.TITLE_COLOR_WITH_BACKGROUND.h();
            j = 0;
        } else {
            j = 0;
            a2 = ColorAttrsNoBackground.TITLE_COLOR_NO_BACKGROUND.a(getContext());
        }
        adaptiveSizeTextView.setTextColor(a2);
        adaptiveSizeTextView.setPreferredHeight(z2 ? a0 : W);
        if (!z5 && adaptiveSizeTextView.f > 0 && (text = adaptiveSizeTextView.getText()) != null && text.length() != 0) {
            AdaptiveSizeTextView.b e = adaptiveSizeTextView.e(adaptiveSizeTextView.getMeasuredWidth());
            adaptiveSizeTextView.setTextSize(2, e.b);
            adaptiveSizeTextView.setLineSpacing(e.c - ((adaptiveSizeTextView.getLineHeight() - adaptiveSizeTextView.getTextSize()) / 2), 1.0f);
        }
        bpn0 bpn0Var2 = csb0.a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String string2 = context.getString(poll2.i ? R.string.poll_anonym : R.string.poll_public);
        if (poll2.o) {
            String string3 = context.getString(R.string.poll_disable_unvote_title);
            if (j2 > j) {
                string2 = context.getString(R.string.poll_info_subtitle, string3, string2) + '\n';
            } else {
                string2 = context.getString(R.string.poll_info_subtitle, string2, string3.toLowerCase(Locale.ROOT)) + '\n';
            }
        }
        if (poll2.isClosed()) {
            string2 = context.getString(R.string.poll_info_subtitle, string2, context.getString(poll2.isExpired() ? R.string.poll_expired : R.string.poll_closed));
        } else if (j2 > j) {
            string2 = context.getString(R.string.poll_info_subtitle, string2, csb0.c((int) j2, this.q, true));
        } else if (owner != null && (str = owner.c) != null && (string = context.getString(R.string.poll_info_subtitle, str, string2)) != null) {
            string2 = string;
        }
        TextView textView2 = this.t;
        textView2.setText(string2);
        textView2.setTextColor(z4 ? a.INFO_COLOR_WITH_BACKGROUND.h() : ColorAttrsNoBackground.INFO_COLOR_NO_BACKGROUND.a(getContext()));
        m();
        this.r.setVisibility(0);
        LinearLayout linearLayout = this.u;
        int childCount = linearLayout.getChildCount();
        int size = getPoll().f.size();
        if (childCount < size) {
            j9x it = swe0.q(0, size - childCount).iterator();
            while (it.d) {
                it.nextInt();
                h();
            }
        } else if (childCount > size) {
            j9x it2 = swe0.q(size, childCount).iterator();
            while (it2.d) {
                linearLayout.getChildAt(it2.nextInt()).setVisibility(8);
            }
        }
        l(new wzs() { // from class: xsna.rg
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                com.vk.stories.design.view.polls.a aVar = (com.vk.stories.design.view.polls.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i4 = AbstractPollView.S;
                aVar.setVisibility(0);
                AbstractPollView abstractPollView = AbstractPollView.this;
                aVar.a(abstractPollView.getPoll(), abstractPollView.getPoll().f.get(intValue), z);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aVar.getLayoutParams();
                marginLayoutParams.topMargin = intValue != 0 ? AbstractPollView.S : 0;
                int i5 = AbstractPollView.T;
                marginLayoutParams.setMarginStart(i5);
                marginLayoutParams.setMarginEnd(i5);
                aVar.setLayoutParams(marginLayoutParams);
                aVar.setEnabled(true);
                aVar.setClickable(abstractPollView.getPoll().Bb());
                return s3q0.a;
            }
        });
        g();
        setForeground(getPoll().Bb() ? null : Fb ? this.h : this.i);
    }

    public final void g() {
        int a2;
        int i = 1;
        boolean z = getPoll().Fb() && !(getPoll().s instanceof PollContentColor);
        ProgressBar progressBar = this.B;
        int i2 = 4;
        progressBar.setVisibility(4);
        progressBar.getIndeterminateDrawable().setColorFilter(z ? a.PROGRESS_BAR_COLOR_WITH_BACKGROUND.h() : ColorAttrsNoBackground.PROGRESS_BAR_COLOR_NO_BACKGROUND.a(getContext()), PorterDuff.Mode.MULTIPLY);
        boolean isEmpty = getPoll().x.isEmpty();
        TextView textView = this.z;
        if (isEmpty) {
            Context context = getContext();
            Poll poll = getPoll();
            c cVar = this.b;
            textView.setText(b.a(context, poll, cVar != null && cVar.G4()));
            textView.setVisibility(0);
        } else {
            textView.setText("");
            textView.setVisibility(4);
        }
        textView.setTextColor(z ? a.INFO_COLOR_WITH_BACKGROUND.h() : ColorAttrsNoBackground.INFO_COLOR_NO_BACKGROUND.a(getContext()));
        Poll poll2 = getPoll();
        if (poll2.Ib() && poll2.Bb() && !poll2.x.isEmpty()) {
            i2 = 0;
        }
        TextView textView2 = this.x;
        textView2.setVisibility(i2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(cn70.c(8));
        int i3 = poll2.Fb() ? g0 : f0;
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.g0(textView2, gradientDrawable, i3);
        if (poll2.Fb()) {
            PollBackground pollBackground = poll2.s;
            if (pollBackground != null) {
                a2 = pollBackground.c;
                if (pollBackground instanceof PhotoPoll) {
                    a2 = l8g.c(0.6f, a2);
                }
            } else {
                a2 = -1;
            }
        } else {
            a2 = ColorAttrsNoBackground.VOTE_BUTTON_NO_BACKGROUND_TEXT_COLOR.a(getContext());
        }
        textView2.setTextColor(a2);
        ArrayList Db = getPoll().Db();
        boolean z2 = this.o;
        PhotoStripView photoStripView = this.A;
        if (!z2 || getPoll().i || getPoll().h == 0 || !getPoll().x.isEmpty() || Db.isEmpty()) {
            photoStripView.setVisibility(8);
            return;
        }
        photoStripView.setPadding(iah0.a(2));
        photoStripView.setOverlapOffset(0.8f);
        photoStripView.setVisibility(0);
        photoStripView.l(-1, rli0.A(rli0.y(rli0.m(new ulp0(new i5g(Db), new db(i))), 3)));
    }

    public final AppCompatImageView getActions() {
        return this.r;
    }

    public final boolean getAllowViewResults() {
        return this.c;
    }

    public final TextView getAuthorName() {
        return this.C;
    }

    public final VkImage getBackgroundView() {
        return this.v;
    }

    public final Animator getCurrentAnimator() {
        return this.D;
    }

    public final PopupMenu getCurrentMenu() {
        return this.E;
    }

    public final ProgressBar getMultipleProgress() {
        return this.B;
    }

    public final TextView getMultipleVoteButton() {
        return this.x;
    }

    public final LinearLayout getOptionsContainer() {
        return this.u;
    }

    public final Poll getPoll() {
        Poll poll = this.d;
        if (poll != null) {
            return poll;
        }
        return null;
    }

    public final TextView getPollInfo() {
        return this.t;
    }

    public final ViewGroup getPollResults() {
        return this.y;
    }

    public final AdaptiveSizeTextView getPollTitle() {
        return this.s;
    }

    public final c getPollViewCallback() {
        return this.b;
    }

    public abstract gtb0 getPollVoteController();

    public final String getRef() {
        return this.e;
    }

    public final View getSmallRectView() {
        return this.w;
    }

    public final String getTrackCode() {
        return this.f;
    }

    public final PhotoStripView getUserPhotos() {
        return this.A;
    }

    public final TextView getVotesCount() {
        return this.z;
    }

    public final void h() {
        com.vk.stories.design.view.polls.a aVar = new com.vk.stories.design.view.polls.a(getContext());
        this.G = aVar;
        View.OnClickListener onClickListener = this.R;
        if (onClickListener == null) {
            onClickListener = this.M;
        }
        aVar.setOnClickListener(onClickListener);
        com.vk.stories.design.view.polls.a aVar2 = this.G;
        if (aVar2 != null) {
            aVar2.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.xg
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    int i = AbstractPollView.S;
                    AbstractPollView abstractPollView = AbstractPollView.this;
                    boolean Ab = abstractPollView.getPoll().Ab();
                    int k = abstractPollView.k((com.vk.stories.design.view.polls.a) view);
                    if (k == -1) {
                        return false;
                    }
                    if (!abstractPollView.getPoll().e.contains(Long.valueOf(abstractPollView.getPoll().f.get(k).b)) || !Ab) {
                        return false;
                    }
                    abstractPollView.i();
                    return true;
                }
            });
        }
        com.vk.stories.design.view.polls.a aVar3 = this.G;
        if (aVar3 != null) {
            aVar3.setOnOptionCheckedListenerListener(new d());
        }
        this.u.addView(this.G, -1, -2);
    }

    public final void i() {
        if (getPoll().Ab()) {
            UserId userId = getPoll().c;
            int i = getPoll().b;
            boolean z = getPoll().j;
            String str = this.e;
            String str2 = this.f;
            c cVar = this.b;
            gtb0.a aVar = new gtb0.a(userId, i, z, str, str2, cVar != null ? cVar.K2() : null);
            gtb0 pollVoteController = getPollVoteController();
            if (pollVoteController != null) {
                pollVoteController.b(aVar);
            }
        }
    }

    public final void j() {
        Iterator<Integer> it = swe0.q(0, getPoll().f.size()).iterator();
        while (it.hasNext()) {
            View childAt = this.u.getChildAt(((z8x) it).nextInt());
            if (childAt != null && (childAt instanceof com.vk.stories.design.view.polls.a)) {
                com.vk.stories.design.view.polls.a aVar = (com.vk.stories.design.view.polls.a) childAt;
                aVar.setClickable(false);
                aVar.setEnabled(false);
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    public final int k(com.vk.stories.design.view.polls.a aVar) {
        LinearLayout linearLayout = this.u;
        j9x it = swe0.q(0, linearLayout.getChildCount()).iterator();
        int i = -1;
        while (it.d) {
            int nextInt = it.nextInt();
            if (epx.f(aVar, linearLayout.getChildAt(nextInt))) {
                i = nextInt;
            }
        }
        return i;
    }

    public final void l(wzs<? super com.vk.stories.design.view.polls.a, ? super Integer, s3q0> wzsVar) {
        j9x it = swe0.q(0, getPoll().f.size()).iterator();
        while (it.d) {
            int nextInt = it.nextInt();
            View childAt = this.u.getChildAt(nextInt);
            if (childAt != null && (childAt instanceof com.vk.stories.design.view.polls.a)) {
                wzsVar.invoke(childAt, Integer.valueOf(nextInt));
            }
        }
    }

    public final boolean m() {
        if (getPoll().Ab()) {
            return true;
        }
        if (getPoll().t0() && this.p) {
            return true;
        }
        if (getPoll().q) {
            vtb0.a().getClass();
            return true;
        }
        vtb0.a().getClass();
        return true;
    }

    public final void n() {
        View.OnClickListener onClickListener = this.N;
        if (onClickListener == null) {
            onClickListener = this.I;
        }
        this.x.setOnClickListener(onClickListener);
        View.OnClickListener onClickListener2 = this.O;
        if (onClickListener2 == null) {
            onClickListener2 = this.J;
        }
        this.r.setOnClickListener(onClickListener2);
        View.OnClickListener onClickListener3 = this.P;
        if (onClickListener3 == null) {
            onClickListener3 = this.K;
        }
        setOnClickListener(onClickListener3);
        View.OnClickListener onClickListener4 = this.Q;
        if (onClickListener4 == null) {
            onClickListener4 = this.L;
        }
        this.C.setOnClickListener(onClickListener4);
        com.vk.stories.design.view.polls.a aVar = this.G;
        if (aVar != null) {
            View.OnClickListener onClickListener5 = this.R;
            if (onClickListener5 == null) {
                onClickListener5 = this.M;
            }
            aVar.setOnClickListener(onClickListener5);
        }
    }

    public final void setActionVisible(boolean z) {
        AppCompatImageView appCompatImageView = this.r;
        if (z) {
            appCompatImageView.setVisibility(0);
        } else {
            f4m.j(appCompatImageView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.View$OnClickListener] */
    public final void setActionsClickListener(View.OnClickListener onClickListener) {
        this.J = onClickListener;
        s6o s6oVar = this.H;
        e6o a2 = s6oVar != null ? s6oVar.a(onClickListener, s6oVar.e) : null;
        this.O = a2;
        e6o e6oVar = a2;
        if (a2 == null) {
            e6oVar = this.J;
        }
        this.r.setOnClickListener(e6oVar);
    }

    public final void setAllowViewResults(boolean z) {
        this.c = z;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public final void setCurrentAnimator(Animator animator) {
        this.D = animator;
    }

    public final void setCurrentMenu(PopupMenu popupMenu) {
        this.E = popupMenu;
    }

    public final void setPoll(Poll poll) {
        this.d = poll;
    }

    public final void setPollViewCallback(c cVar) {
        this.b = cVar;
    }

    public abstract void setPollVoteController(gtb0 gtb0Var);

    public final void setRef(String str) {
        this.e = str;
    }

    public final void setSmallRectVisible(boolean z) {
        this.w.setVisibility(z ? 0 : 8);
    }

    public final void setTrackCode(String str) {
        this.f = str;
    }

    public final void setVoteContext(String str) {
        this.F = str;
    }
}
