package com.vk.im.ui.views.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.im.design.R$styleable;
import com.vk.im.ui.views.settings.MaterialSwitchSettingsView;
import com.vkontakte.android.R;
import xsna.dd6;
import xsna.drm0;
import xsna.iut0;
import xsna.zmn0;

/* compiled from: MaterialSwitchSettingsView.kt */
/* loaded from: classes2.dex */
public final class MaterialSwitchSettingsView extends ConstraintLayout {
    public static final /* synthetic */ int w = 0;
    public final TextView t;
    public final TextView u;
    public final SwitchCompat v;

    /* compiled from: MaterialSwitchSettingsView.kt */
    public interface a {
        void b(boolean z);
    }

    public MaterialSwitchSettingsView(Context context) {
        this(context, null, 0, 14, 0);
    }

    private final CharSequence getDescriptionText() {
        return this.u.getText();
    }

    private final CharSequence getLabelText() {
        return this.t.getText();
    }

    private final void setDescriptionText(CharSequence charSequence) {
        TextView textView = this.u;
        textView.setText(charSequence);
        textView.setVisibility(!drm0.N(charSequence) ? 0 : 8);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getLabelText());
        sb.append(' ');
        sb.append((Object) charSequence);
        setContentDescription(sb.toString());
    }

    private final void setLabelText(CharSequence charSequence) {
        this.t.setText(charSequence);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) charSequence);
        sb.append(' ');
        sb.append((Object) getDescriptionText());
        setContentDescription(sb.toString());
    }

    public final void setChecked(boolean z) {
        this.v.setChecked(z);
    }

    public final void setDescription(int i) {
        setDescription(getContext().getString(i));
    }

    public final void setLabel(int i) {
        setLabel(getContext().getString(i));
    }

    public final void setListener(final a aVar) {
        this.v.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: xsna.um10
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = MaterialSwitchSettingsView.w;
                MaterialSwitchSettingsView.a aVar2 = MaterialSwitchSettingsView.a.this;
                if (aVar2 != null) {
                    aVar2.b(z);
                }
            }
        });
    }

    public MaterialSwitchSettingsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public final void setDescription(String str) {
        setDescriptionText(str);
    }

    public final void setLabel(CharSequence charSequence) {
        setLabelText(charSequence);
    }

    public MaterialSwitchSettingsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ MaterialSwitchSettingsView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public MaterialSwitchSettingsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.material_switch_settings_view, this);
        setImportantForAccessibility(1);
        TextView textView = (TextView) findViewById(R.id.im_switch_label);
        this.t = textView;
        TextView textView2 = (TextView) findViewById(R.id.im_switch_description);
        this.u = textView2;
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.im_switch);
        this.v = switchCompat;
        iut0.q(this, new zmn0(switchCompat));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.e);
        try {
            textView.setTextAppearance(obtainStyledAttributes.getResourceId(3, R.style.VkLegacyTypography_Headline_Roboto_Regular_Primary));
            textView2.setTextAppearance(obtainStyledAttributes.getResourceId(1, R.style.VkLegacyTypography_Footnote_Regular));
            String string = obtainStyledAttributes.getString(4);
            String str = "";
            setLabelText(string == null ? "" : string);
            String string2 = obtainStyledAttributes.getString(2);
            if (string2 != null) {
                str = string2;
            }
            setDescriptionText(str);
            setChecked(obtainStyledAttributes.getBoolean(0, false));
            obtainStyledAttributes.recycle();
            setOnClickListener(new dd6(this, 5));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
