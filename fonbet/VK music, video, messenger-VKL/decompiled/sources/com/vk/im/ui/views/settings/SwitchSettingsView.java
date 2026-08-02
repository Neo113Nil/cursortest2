package com.vk.im.ui.views.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.abg0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.iah0;
import xsna.iut0;
import xsna.m33;
import xsna.qyi0;
import xsna.too0;
import xsna.zmn0;

/* compiled from: SwitchSettingsView.kt */
/* loaded from: classes2.dex */
public final class SwitchSettingsView extends LinearLayout implements too0 {
    public AppCompatImageView b;
    public SwitchCompat c;
    public final a d;
    public final dhr0 e;
    public final float[] f;
    public b g;

    /* compiled from: SwitchSettingsView.kt */
    public final class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            b onCheckListener = SwitchSettingsView.this.getOnCheckListener();
            if (onCheckListener != null) {
                onCheckListener.c(z, true);
            }
        }
    }

    /* compiled from: SwitchSettingsView.kt */
    public interface b {
        void c(boolean z, boolean z2);
    }

    public SwitchSettingsView(Context context) {
        super(context);
        this.d = new a();
        this.e = dhr0.a;
        this.f = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        a(context, null, 0, 0);
    }

    @Override // xsna.too0
    public final void Ng() {
        SwitchCompat switchCompat = this.c;
        if (switchCompat == null) {
            switchCompat = null;
        }
        abg0 abg0Var = dhr0.t;
        switchCompat.setTextColor(abg0Var.c(R.attr.vk_legacy_text_primary));
        Drawable icon = getIcon();
        if (icon != null) {
            icon.setTint(abg0Var.c(R.attr.vk_legacy_accent));
        }
        SwitchCompat switchCompat2 = this.c;
        SwitchCompat switchCompat3 = switchCompat2 != null ? switchCompat2 : null;
        this.e.getClass();
        dhr0.U(switchCompat3);
    }

    public final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.switch_setting_content, (ViewGroup) this, true);
        this.b = (AppCompatImageView) findViewById(R.id.setting_icon);
        this.c = (SwitchCompat) findViewById(R.id.setting_switch);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.D, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId > 0) {
            setIcon(m33.a(resourceId, context));
        }
        AppCompatImageView appCompatImageView = this.b;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        bwt0.p0(appCompatImageView, getIcon() != null);
        setIconSize(obtainStyledAttributes.getDimensionPixelSize(2, iah0.a(28)));
        if (obtainStyledAttributes.hasValue(3)) {
            AppCompatImageView appCompatImageView2 = this.b;
            if (appCompatImageView2 == null) {
                appCompatImageView2 = null;
            }
            bwt0.o0(appCompatImageView2, obtainStyledAttributes.getColor(3, -16777216));
        }
        String string = obtainStyledAttributes.getString(6);
        if (string == null) {
            string = "";
        }
        setTitle(string);
        SwitchCompat switchCompat = this.c;
        if (switchCompat == null) {
            switchCompat = null;
        }
        switchCompat.setTextAppearance(obtainStyledAttributes.getResourceId(7, 0));
        setChecked(obtainStyledAttributes.getBoolean(0, false));
        if (obtainStyledAttributes.hasValue(5)) {
            SwitchCompat switchCompat2 = this.c;
            if (switchCompat2 == null) {
                switchCompat2 = null;
            }
            switchCompat2.setMaxLines(obtainStyledAttributes.getInteger(5, 1));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            SwitchCompat switchCompat3 = this.c;
            if (switchCompat3 == null) {
                switchCompat3 = null;
            }
            switchCompat3.setBackground(obtainStyledAttributes.getDrawable(4));
        }
        obtainStyledAttributes.recycle();
        SwitchCompat switchCompat4 = this.c;
        if (switchCompat4 == null) {
            switchCompat4 = null;
        }
        switchCompat4.setOnCheckedChangeListener(this.d);
        bwt0.i0(this, new qyi0(this, 8));
        SwitchCompat switchCompat5 = this.c;
        iut0.q(this, new zmn0(switchCompat5 != null ? switchCompat5 : null));
    }

    public final boolean getChecked() {
        SwitchCompat switchCompat = this.c;
        if (switchCompat == null) {
            switchCompat = null;
        }
        return switchCompat.isChecked();
    }

    public final Drawable getIcon() {
        AppCompatImageView appCompatImageView = this.b;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        return appCompatImageView.getDrawable();
    }

    public final int getIconSize() {
        AppCompatImageView appCompatImageView = this.b;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        return appCompatImageView.getLayoutParams().width;
    }

    public final float[] getLastTouch() {
        return this.f;
    }

    public final b getOnCheckListener() {
        return this.g;
    }

    public final CharSequence getTitle() {
        SwitchCompat switchCompat = this.c;
        if (switchCompat == null) {
            switchCompat = null;
        }
        return switchCompat.getText();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float[] fArr = this.f;
        fArr[0] = rawX;
        fArr[1] = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setChecked(boolean z) {
        SwitchCompat switchCompat = this.c;
        if (switchCompat == null) {
            switchCompat = null;
        }
        switchCompat.setOnCheckedChangeListener(null);
        SwitchCompat switchCompat2 = this.c;
        if (switchCompat2 == null) {
            switchCompat2 = null;
        }
        switchCompat2.setChecked(z);
        b bVar = this.g;
        if (bVar != null) {
            bVar.c(getChecked(), false);
        }
        SwitchCompat switchCompat3 = this.c;
        (switchCompat3 != null ? switchCompat3 : null).setOnCheckedChangeListener(this.d);
    }

    public final void setIcon(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.b;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        appCompatImageView.setImageDrawable(drawable);
        AppCompatImageView appCompatImageView2 = this.b;
        (appCompatImageView2 != null ? appCompatImageView2 : null).setVisibility(drawable == null ? 8 : 0);
    }

    public final void setIconSize(int i) {
        AppCompatImageView appCompatImageView = this.b;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        bwt0.m0(i, i, appCompatImageView);
    }

    public final void setOnCheckListener(b bVar) {
        this.g = bVar;
    }

    public final void setSwitchEnabled(boolean z) {
        SwitchCompat switchCompat = this.c;
        if (switchCompat == null) {
            switchCompat = null;
        }
        switchCompat.setEnabled(z);
        setEnabled(z);
    }

    public final void setTitle(CharSequence charSequence) {
        SwitchCompat switchCompat = this.c;
        if (switchCompat == null) {
            switchCompat = null;
        }
        switchCompat.setText(charSequence);
        setContentDescription(charSequence);
    }

    public SwitchSettingsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new a();
        this.e = dhr0.a;
        this.f = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        a(context, attributeSet, 0, 0);
    }

    public SwitchSettingsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new a();
        this.e = dhr0.a;
        this.f = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        a(context, attributeSet, i, 0);
    }

    public SwitchSettingsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d = new a();
        this.e = dhr0.a;
        this.f = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        a(context, attributeSet, i, i2);
    }
}
