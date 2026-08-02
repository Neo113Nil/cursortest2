package com.vk.auth.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bpn0;
import xsna.f4m;
import xsna.hnj;
import xsna.iah0;
import xsna.t65;
import xsna.zrp;

/* compiled from: VkExternalServiceLoginButton.kt */
/* loaded from: classes.dex */
public final class VkExternalServiceLoginButton extends ConstraintLayout {
    public static final int A;
    public static final int z;
    public final ImageView t;
    public final TextView u;
    public final ProgressWheel v;
    public boolean w;
    public boolean x;
    public VkIconGravity y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkExternalServiceLoginButton.kt */
    public static final class VkIconGravity {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VkIconGravity[] $VALUES;
        public static final VkIconGravity CENTER;
        public static final VkIconGravity END;
        public static final VkIconGravity START;

        static {
            VkIconGravity vkIconGravity = new VkIconGravity("START", 0);
            START = vkIconGravity;
            VkIconGravity vkIconGravity2 = new VkIconGravity("CENTER", 1);
            CENTER = vkIconGravity2;
            VkIconGravity vkIconGravity3 = new VkIconGravity("END", 2);
            END = vkIconGravity3;
            VkIconGravity[] vkIconGravityArr = {vkIconGravity, vkIconGravity2, vkIconGravity3};
            $VALUES = vkIconGravityArr;
            $ENTRIES = new asp(vkIconGravityArr);
        }

        public VkIconGravity() {
            throw null;
        }

        public static VkIconGravity valueOf(String str) {
            return (VkIconGravity) Enum.valueOf(VkIconGravity.class, str);
        }

        public static VkIconGravity[] values() {
            return (VkIconGravity[]) $VALUES.clone();
        }
    }

    /* compiled from: VkExternalServiceLoginButton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkIconGravity.values().length];
            try {
                iArr[VkIconGravity.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkIconGravity.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkIconGravity.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        bpn0 bpn0Var = t65.a;
        z = (int) Math.floor(8.0f * Resources.getSystem().getDisplayMetrics().density);
        A = (int) Math.floor(10.0f * Resources.getSystem().getDisplayMetrics().density);
    }

    public VkExternalServiceLoginButton(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), (4 & 2) != 0 ? null : attributeSet, 0);
        this.y = VkIconGravity.START;
        LayoutInflater.from(getContext()).inflate(R.layout.vk_external_service_login_layout, (ViewGroup) this, true);
        this.t = (ImageView) findViewById(R.id.external_service_login_icon);
        this.u = (TextView) findViewById(R.id.external_service_login_text);
        this.v = (ProgressWheel) findViewById(R.id.external_service_login_progress);
        boolean z2 = this.w;
        int i = z;
        if (z2) {
            setPadding(i, i, i, i);
        } else {
            setPadding(A, i, i, i);
        }
        setBackgroundResource(R.drawable.vk_bg_external_service);
        setOnlyImage(false);
        setLoading(false);
    }

    public static void P4(View view, b bVar) {
        bVar.h(view.getId(), 6);
        bVar.h(view.getId(), 7);
    }

    private final b getDefaultConstraintSet() {
        b bVar = new b();
        bVar.i(this);
        P4(this.t, bVar);
        P4(this.u, bVar);
        P4(this.v, bVar);
        return bVar;
    }

    public final void Q4() {
        b defaultConstraintSet = getDefaultConstraintSet();
        int i = a.$EnumSwitchMapping$0[this.y.ordinal()];
        ProgressWheel progressWheel = this.v;
        ImageView imageView = this.t;
        TextView textView = this.u;
        if (i == 1) {
            defaultConstraintSet.k(textView.getId(), 6, 0, 6);
            defaultConstraintSet.u(textView.getId()).e.W = 2;
            defaultConstraintSet.k(imageView.getId(), 6, 0, 6);
            defaultConstraintSet.k(textView.getId(), 7, progressWheel.getId(), 6);
        } else if (i == 2) {
            defaultConstraintSet.l(imageView.getId(), 7, textView.getId(), 6, iah0.a(8));
            defaultConstraintSet.k(textView.getId(), 6, imageView.getId(), 7);
            defaultConstraintSet.u(imageView.getId()).e.W = 2;
            defaultConstraintSet.k(imageView.getId(), 6, 0, 6);
            defaultConstraintSet.k(textView.getId(), 7, progressWheel.getId(), 6);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            defaultConstraintSet.k(textView.getId(), 7, imageView.getId(), 6);
            defaultConstraintSet.k(imageView.getId(), 6, textView.getId(), 7);
            defaultConstraintSet.u(imageView.getId()).e.W = 2;
            defaultConstraintSet.k(imageView.getId(), 7, 0, 7);
            defaultConstraintSet.k(textView.getId(), 6, 0, 6);
        }
        defaultConstraintSet.k(progressWheel.getId(), 6, textView.getId(), 7);
        defaultConstraintSet.k(progressWheel.getId(), 7, 0, 7);
        defaultConstraintSet.b(this);
    }

    public final void T4() {
        boolean z2 = this.x;
        TextView textView = this.u;
        ImageView imageView = this.t;
        ProgressWheel progressWheel = this.v;
        if (z2 && this.w) {
            b defaultConstraintSet = getDefaultConstraintSet();
            defaultConstraintSet.k(progressWheel.getId(), 6, 0, 6);
            defaultConstraintSet.k(progressWheel.getId(), 7, 0, 7);
            defaultConstraintSet.b(this);
            f4m.j(imageView);
            f4m.j(textView);
            progressWheel.setVisibility(0);
            setClickable(false);
            return;
        }
        if (z2 && !this.w) {
            Q4();
            imageView.setVisibility(0);
            f4m.j(textView);
            progressWheel.setVisibility(0);
            setClickable(false);
            return;
        }
        if (z2 || !this.w) {
            if (z2 || this.w) {
                return;
            }
            Q4();
            imageView.setVisibility(0);
            textView.setVisibility(0);
            f4m.j(progressWheel);
            setClickable(true);
            return;
        }
        b defaultConstraintSet2 = getDefaultConstraintSet();
        defaultConstraintSet2.k(imageView.getId(), 6, 0, 6);
        defaultConstraintSet2.k(imageView.getId(), 7, 0, 7);
        defaultConstraintSet2.b(this);
        imageView.setVisibility(0);
        f4m.j(textView);
        f4m.j(progressWheel);
        setClickable(true);
    }

    public final ColorStateList getTextColor() {
        return this.u.getTextColors();
    }

    public final void setContentDescription(String str) {
        this.t.setContentDescription(str);
    }

    public final void setIcon(Drawable drawable) {
        this.t.setImageDrawable(drawable);
    }

    public final void setIconGravity(VkIconGravity vkIconGravity) {
        this.y = vkIconGravity;
        T4();
    }

    public final void setLoading(boolean z2) {
        if (this.x == z2) {
            return;
        }
        this.x = z2;
        T4();
    }

    public final void setOnlyImage(boolean z2) {
        if (this.w == z2) {
            return;
        }
        this.w = z2;
        int i = z;
        if (z2) {
            setPadding(i, i, i, i);
        } else {
            setPadding(A, i, i, i);
        }
        T4();
    }

    public final void setText(String str) {
        this.u.setText(str);
    }

    public final void setTextColor(int i) {
        this.u.setTextColor(i);
    }
}
