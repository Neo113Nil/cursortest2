package com.vk.stories.design.view.polls;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.vk.core.serialize.Serializer;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollContentColor;
import com.vk.dto.polls.PollOption;
import com.vkontakte.android.R;
import java.util.List;
import xsna.abg0;
import xsna.asp;
import xsna.dhr0;
import xsna.e3m;
import xsna.iah0;
import xsna.l8g;
import xsna.lhg;
import xsna.m33;
import xsna.p79;
import xsna.rqb0;
import xsna.zrp;

/* compiled from: PollOptionView.kt */
/* loaded from: classes6.dex */
public final class a extends FrameLayout {
    public static final float l = iah0.a(48);
    public c b;
    public final TextView c;
    public final TextView d;
    public final AppCompatCheckBox e;
    public final ProgressBar f;
    public final rqb0 g;
    public Poll h;
    public PollOption i;
    public int j;
    public int k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PollOptionView.kt */
    /* renamed from: com.vk.stories.design.view.polls.a$a, reason: collision with other inner class name */
    public static final class EnumC1805a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EnumC1805a[] $VALUES;
        public static final EnumC1805a DONE_ICON_COLOR_NO_BACKGROUND;
        public static final EnumC1805a PROGRESS_BAR_COLOR_NO_BACKGROUND;
        public static final EnumC1805a REST_PART_COLOR_NO_BACKGROUND;
        public static final EnumC1805a RESULT_LEADER_PART_COLOR_NO_BACKGROUND;
        public static final EnumC1805a RESULT_PART_COLOR_NO_BACKGROUND;
        public static final EnumC1805a TEXT_COLOR_NO_BACKGROUND;
        public static final EnumC1805a VOTE_COUNT_COLOR_NO_BACKGROUND;
        private final int res;

        /* compiled from: PollOptionView.kt */
        /* renamed from: com.vk.stories.design.view.polls.a$a$a, reason: collision with other inner class name */
        public static final class C1806a extends EnumC1805a {
            @Override // com.vk.stories.design.view.polls.a.EnumC1805a
            public final int a(Context context) {
                return l8g.f(0.1f, e3m.f(R.attr.vk_ui_background_accent_themed, context));
            }
        }

        /* compiled from: PollOptionView.kt */
        /* renamed from: com.vk.stories.design.view.polls.a$a$b */
        public static final class b extends EnumC1805a {
            @Override // com.vk.stories.design.view.polls.a.EnumC1805a
            public final int a(Context context) {
                return l8g.f(0.22f, e3m.f(R.attr.vk_ui_background_accent_themed, context));
            }
        }

        /* compiled from: PollOptionView.kt */
        /* renamed from: com.vk.stories.design.view.polls.a$a$c */
        public static final class c extends EnumC1805a {
            @Override // com.vk.stories.design.view.polls.a.EnumC1805a
            public final int a(Context context) {
                return l8g.f(0.16f, e3m.f(R.attr.vk_ui_background_accent_themed, context));
            }
        }

        static {
            EnumC1805a enumC1805a = new EnumC1805a("TEXT_COLOR_NO_BACKGROUND", 0, R.attr.vk_ui_text_primary);
            TEXT_COLOR_NO_BACKGROUND = enumC1805a;
            EnumC1805a enumC1805a2 = new EnumC1805a("VOTE_COUNT_COLOR_NO_BACKGROUND", 1, R.attr.vk_ui_text_muted);
            VOTE_COUNT_COLOR_NO_BACKGROUND = enumC1805a2;
            b bVar = new b("RESULT_LEADER_PART_COLOR_NO_BACKGROUND", 2, R.attr.vk_ui_background_accent_themed);
            RESULT_LEADER_PART_COLOR_NO_BACKGROUND = bVar;
            c cVar = new c("RESULT_PART_COLOR_NO_BACKGROUND", 3, R.attr.vk_ui_background_accent_themed);
            RESULT_PART_COLOR_NO_BACKGROUND = cVar;
            C1806a c1806a = new C1806a("REST_PART_COLOR_NO_BACKGROUND", 4, R.attr.vk_ui_background_accent_themed);
            REST_PART_COLOR_NO_BACKGROUND = c1806a;
            EnumC1805a enumC1805a3 = new EnumC1805a("PROGRESS_BAR_COLOR_NO_BACKGROUND", 5, R.attr.vk_ui_text_accent);
            PROGRESS_BAR_COLOR_NO_BACKGROUND = enumC1805a3;
            EnumC1805a enumC1805a4 = new EnumC1805a("DONE_ICON_COLOR_NO_BACKGROUND", 6, R.attr.vk_ui_text_accent);
            DONE_ICON_COLOR_NO_BACKGROUND = enumC1805a4;
            EnumC1805a[] enumC1805aArr = {enumC1805a, enumC1805a2, bVar, cVar, c1806a, enumC1805a3, enumC1805a4};
            $VALUES = enumC1805aArr;
            $ENTRIES = new asp(enumC1805aArr);
        }

        public EnumC1805a(String str, int i, int i2) {
            this.res = i2;
        }

        public static EnumC1805a valueOf(String str) {
            return (EnumC1805a) Enum.valueOf(EnumC1805a.class, str);
        }

        public static EnumC1805a[] values() {
            return (EnumC1805a[]) $VALUES.clone();
        }

        public int a(Context context) {
            return e3m.f(this.res, context);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PollOptionView.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b DONE_ICON_COLOR_WITH_BACKGROUND;
        public static final b PROGRESS_BAR_COLOR_WITH_BACKGROUND;
        public static final b REST_PART_COLOR_WITH_BACKGROUND;
        public static final b RESULT_LEADER_PART_COLOR_WITH_BACKGROUND;
        public static final b RESULT_PART_COLOR_WITH_BACKGROUND;
        public static final b TEXT_COLOR_WITH_BACKGROUND;
        public static final b VOTE_COUNT_COLOR_WITH_BACKGROUND;

        /* renamed from: long, reason: not valid java name */
        private final long f41long;

        static {
            b bVar = new b("TEXT_COLOR_WITH_BACKGROUND", 0, 4294967295L);
            TEXT_COLOR_WITH_BACKGROUND = bVar;
            b bVar2 = new b("VOTE_COUNT_COLOR_WITH_BACKGROUND", 1, 1560281087L);
            VOTE_COUNT_COLOR_WITH_BACKGROUND = bVar2;
            b bVar3 = new b("RESULT_LEADER_PART_COLOR_WITH_BACKGROUND", 2, 1728053247L);
            RESULT_LEADER_PART_COLOR_WITH_BACKGROUND = bVar3;
            b bVar4 = new b("RESULT_PART_COLOR_WITH_BACKGROUND", 3, 1040187391L);
            RESULT_PART_COLOR_WITH_BACKGROUND = bVar4;
            b bVar5 = new b("REST_PART_COLOR_WITH_BACKGROUND", 4, 536870911L);
            REST_PART_COLOR_WITH_BACKGROUND = bVar5;
            b bVar6 = new b("PROGRESS_BAR_COLOR_WITH_BACKGROUND", 5, 4294967295L);
            PROGRESS_BAR_COLOR_WITH_BACKGROUND = bVar6;
            b bVar7 = new b("DONE_ICON_COLOR_WITH_BACKGROUND", 6, 4294967295L);
            DONE_ICON_COLOR_WITH_BACKGROUND = bVar7;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b(String str, int i, long j) {
            this.f41long = j;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final int h() {
            return (int) this.f41long;
        }
    }

    /* compiled from: PollOptionView.kt */
    public interface c {
        void a(long j, boolean z);
    }

    public a(Context context) {
        super(context);
        rqb0 rqb0Var = new rqb0();
        this.g = rqb0Var;
        this.j = R.attr.vk_ui_text_accent;
        this.k = R.attr.vk_ui_icon_accent_themed;
        LayoutInflater.from(getContext()).inflate(R.layout.view_poll_option, this);
        this.c = (TextView) findViewById(R.id.option_name);
        this.d = (TextView) findViewById(R.id.results);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) findViewById(R.id.multiple_choice_checkbox);
        this.e = appCompatCheckBox;
        this.f = (ProgressBar) findViewById(R.id.progress);
        setBackground(rqb0Var);
        appCompatCheckBox.setOnCheckedChangeListener(new p79(this, 1));
    }

    public final void a(Poll poll, PollOption pollOption, boolean z) {
        int[] iArr;
        Drawable drawable;
        Drawable a;
        Drawable newDrawable;
        String str = pollOption.c;
        float f = pollOption.e;
        this.h = poll;
        this.i = pollOption;
        List<Long> list = poll.e;
        long j = pollOption.b;
        boolean contains = list.contains(Long.valueOf(j));
        boolean z2 = poll.Fb() && !(poll.s instanceof PollContentColor);
        boolean contains2 = (poll.Ib() && poll.Bb()) ? poll.x.contains(Long.valueOf(j)) : false;
        AppCompatCheckBox appCompatCheckBox = this.e;
        appCompatCheckBox.setChecked(contains2);
        appCompatCheckBox.jumpDrawablesToCurrentState();
        appCompatCheckBox.setVisibility((poll.Ib() && poll.Bb()) ? 0 : 8);
        int[][] iArr2 = {new int[]{-16842912}, new int[]{android.R.attr.state_checked}};
        if (z2) {
            iArr = new int[]{getContext().getColor(R.color.vk_white), getContext().getColor(R.color.vk_white)};
        } else {
            int i = this.k;
            abg0 abg0Var = dhr0.t;
            iArr = new int[]{abg0Var.c(i), abg0Var.c(this.j)};
        }
        appCompatCheckBox.setButtonTintList(new ColorStateList(iArr2, iArr));
        Serializer.c<PollOption> cVar = PollOption.CREATOR;
        SpannableString spannableString = new SpannableString(lhg.a(pollOption.d, " · "));
        spannableString.setSpan(new ForegroundColorSpan(!poll.Bb() ? z2 ? b.VOTE_COUNT_COLOR_WITH_BACKGROUND.h() : EnumC1805a.VOTE_COUNT_COLOR_NO_BACKGROUND.a(getContext()) : 0), 0, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(iah0.a(14.0f)), 0, spannableString.length(), 33);
        Drawable drawable2 = null;
        String str2 = poll.Bb() ? str : null;
        TextView textView = this.c;
        textView.setContentDescription(str2);
        textView.setText(TextUtils.concat(str, spannableString));
        textView.setTextColor(z2 ? b.TEXT_COLOR_WITH_BACKGROUND.h() : EnumC1805a.TEXT_COLOR_NO_BACKGROUND.a(getContext()));
        String a2 = poll.Bb() ? "" : PollOption.a.a(f);
        TextView textView2 = this.d;
        textView2.setText(a2);
        if (!contains || (a = m33.a(R.drawable.vk_icon_done_16, getContext())) == null) {
            drawable = null;
        } else {
            Drawable.ConstantState constantState = a.getConstantState();
            drawable = (constantState == null || (newDrawable = constantState.newDrawable()) == null) ? null : newDrawable.mutate();
            if (drawable != null) {
                drawable.setTint(z2 ? b.DONE_ICON_COLOR_WITH_BACKGROUND.h() : EnumC1805a.DONE_ICON_COLOR_NO_BACKGROUND.a(getContext()));
            }
        }
        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView2.setVisibility(!poll.Bb() ? 0 : 4);
        textView2.setTextColor(z2 ? b.TEXT_COLOR_WITH_BACKGROUND.h() : EnumC1805a.TEXT_COLOR_NO_BACKGROUND.a(getContext()));
        Drawable background = getBackground();
        if (background instanceof rqb0) {
            rqb0 rqb0Var = (rqb0) background;
            rqb0Var.a(poll.Bb() ? 0 : Math.round((f / 100) * 10000), z);
            rqb0Var.b = z2 ? b.REST_PART_COLOR_WITH_BACKGROUND.h() : EnumC1805a.REST_PART_COLOR_NO_BACKGROUND.a(getContext());
            float Gb = poll.Gb();
            boolean Jb = poll.Jb();
            rqb0Var.a = z2 ? (f == Gb && Jb) ? b.RESULT_LEADER_PART_COLOR_WITH_BACKGROUND.h() : b.RESULT_PART_COLOR_WITH_BACKGROUND.h() : (f == Gb && Jb) ? EnumC1805a.RESULT_LEADER_PART_COLOR_NO_BACKGROUND.a(getContext()) : EnumC1805a.RESULT_PART_COLOR_NO_BACKGROUND.a(getContext());
        }
        ProgressBar progressBar = this.f;
        progressBar.setVisibility(4);
        progressBar.getIndeterminateDrawable().setColorFilter(z2 ? b.PROGRESS_BAR_COLOR_WITH_BACKGROUND.h() : EnumC1805a.PROGRESS_BAR_COLOR_NO_BACKGROUND.a(getContext()), PorterDuff.Mode.MULTIPLY);
        if (poll.Bb()) {
            drawable2 = m33.a(z2 ? R.drawable.poll_option_with_background_selector : R.drawable.poll_option_no_background_selector, getContext());
        }
        setForeground(drawable2);
    }

    public final c getOnOptionCheckedListenerListener() {
        return this.b;
    }

    public final void setCheckboxCheckedColorAttr(int i) {
        this.j = i;
    }

    public final void setCheckboxNotCheckedColorAttr(int i) {
        this.k = i;
    }

    public final void setCornerRadius(float f) {
        this.g.c = f;
    }

    public final void setMultipleChoiceClickable(boolean z) {
        this.e.setClickable(z);
    }

    public final void setOnOptionCheckedListenerListener(c cVar) {
        this.b = cVar;
    }
}
