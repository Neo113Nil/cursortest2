package com.vk.im.ui.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import defpackage.b0;
import defpackage.v;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bwt0;
import xsna.f9;
import xsna.kkm;
import xsna.kvm0;
import xsna.kyq0;
import xsna.q2x;
import xsna.zrp;

/* compiled from: WriteBarDisabled.kt */
/* loaded from: classes2.dex */
public final class WriteBarDisabled extends FrameLayout {
    public kkm b;
    public final TextView c;
    public final ImageView d;
    public final View e;
    public final q2x f;
    public a g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WriteBarDisabled.kt */
    public static final class Reason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Reason[] $VALUES;
        public static final Reason INFO;
        public static final Reason WARNING;

        static {
            Reason reason = new Reason("WARNING", 0);
            WARNING = reason;
            Reason reason2 = new Reason("INFO", 1);
            INFO = reason2;
            Reason[] reasonArr = {reason, reason2};
            $VALUES = reasonArr;
            $ENTRIES = new asp(reasonArr);
        }

        public Reason() {
            throw null;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WriteBarDisabled.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a INFO;
        public static final a NOTIFICATIONS;
        public static final a PLACEHOLDER;
        public static final a WARNING;
        private final int iconColorRes;
        private final int textColorRes;

        static {
            a aVar = new a("WARNING", 0, R.attr.vk_ui_text_secondary, R.attr.vk_legacy_destructive);
            WARNING = aVar;
            a aVar2 = new a("INFO", 1, R.attr.vk_ui_text_tertiary, R.attr.vk_ui_text_tertiary);
            INFO = aVar2;
            a aVar3 = new a("NOTIFICATIONS", 2, R.attr.vk_legacy_accent, R.attr.vk_legacy_accent);
            NOTIFICATIONS = aVar3;
            a aVar4 = new a("PLACEHOLDER", 3, 0, 0);
            PLACEHOLDER = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, int i2, int i3) {
            this.textColorRes = i2;
            this.iconColorRes = i3;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int h() {
            return this.iconColorRes;
        }

        public final int i() {
            return this.textColorRes;
        }
    }

    /* compiled from: WriteBarDisabled.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Reason.values().length];
            try {
                iArr[Reason.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Reason.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public WriteBarDisabled(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new kkm(0);
        q2x q2xVar = new q2x(context);
        this.f = q2xVar;
        this.g = a.PLACEHOLDER;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LayoutInflater.from(context).inflate(R.layout.vkim_write_bar_disabled, (ViewGroup) this, true);
        this.e = getChildAt(0);
        this.c = (TextView) findViewById(R.id.text);
        this.d = (ImageView) findViewById(R.id.icon);
        setClickable(true);
        bwt0.Z(R.attr.vk_legacy_background_content, this);
        addView(q2xVar, -1, -2);
    }

    private final void setStateResources(a aVar) {
        this.g = aVar;
        this.c.setTextColor(this.b.f(aVar.i()));
        this.d.setImageTintList(ColorStateList.valueOf(this.b.f(aVar.h())));
    }

    public final void a(int i, String str) {
        setStateResources(a.NOTIFICATIONS);
        this.c.setText(str);
        ImageView imageView = this.d;
        imageView.setVisibility(0);
        imageView.setImageResource(i);
        q2x q2xVar = this.f;
        q2xVar.setVisibility(8);
        View view = this.e;
        ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity = 17;
        view.setVisibility(0);
        q2xVar.setVisibility(8);
    }

    public final void b(String str, Integer num, Reason reason) {
        a aVar;
        int i = b.$EnumSwitchMapping$0[reason.ordinal()];
        if (i == 1) {
            aVar = a.WARNING;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = a.INFO;
        }
        setStateResources(aVar);
        this.c.setText(str);
        ImageView imageView = this.d;
        if (num != null) {
            imageView.setVisibility(0);
            imageView.setImageResource(num.intValue());
        } else {
            imageView.setVisibility(8);
        }
        View view = this.e;
        ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity = 17;
        view.setVisibility(0);
        this.f.setVisibility(8);
    }

    public final void c(String str, String str2, f9 f9Var) {
        setStateResources(a.PLACEHOLDER);
        q2x q2xVar = this.f;
        q2xVar.setText(str);
        q2xVar.setButtonText(str2);
        q2xVar.setOnButtonClickListener(f9Var);
        q2xVar.setVisibility(0);
        this.e.setVisibility(8);
    }

    public final kkm getThemeBinder() {
        return this.b;
    }

    public final void setThemeBinder(kkm kkmVar) {
        kkm kkmVar2 = this.b;
        TextView textView = this.c;
        kkmVar2.h(textView);
        kkm kkmVar3 = this.b;
        ImageView imageView = this.d;
        kkmVar3.h(imageView);
        this.b = kkmVar;
        kkmVar.a(textView, "textColor", new b0(14, new kvm0(this, 23), kkmVar));
        kkm kkmVar4 = this.b;
        kyq0 kyq0Var = new kyq0(this, 20);
        kkmVar4.getClass();
        kkmVar4.a(imageView, "imageTint", new v(8, kyq0Var, kkmVar4));
    }
}
