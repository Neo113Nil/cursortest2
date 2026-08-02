package com.vk.im.ui.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.common.im.Image;
import com.vk.im.engine.models.InfoBar;
import com.vkontakte.android.R;
import xsna.awt0;
import xsna.b5h;
import xsna.bwt0;
import xsna.drm0;
import xsna.dsc;
import xsna.f4m;
import xsna.iah0;
import xsna.izs;
import xsna.jjc;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: DialogListInfoBarView.kt */
/* loaded from: classes2.dex */
public final class DialogListInfoBarView extends ConstraintLayout {
    public final dsc A;
    public final b5h B;
    public izs<? super CharSequence, ? extends CharSequence> C;
    public wzs<? super InfoBar, ? super InfoBar.Button, s3q0> D;
    public izs<? super InfoBar, s3q0> E;
    public final int t;
    public final FrescoImageView u;
    public final TextView v;
    public final TextView w;
    public final InfoBarButtonsView x;
    public final View y;
    public InfoBar z;

    public DialogListInfoBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.t = context.getResources().getDimensionPixelSize(R.dimen.vkim_dialog_info_bar_icon_size);
        this.A = new dsc(this, 21);
        this.B = new b5h(this, 9);
        View.inflate(context, R.layout.vkim_dialog_list_info_bar, this);
        this.u = (FrescoImageView) findViewById(R.id.icon);
        this.v = (TextView) findViewById(R.id.title);
        this.w = (TextView) findViewById(R.id.text);
        this.x = (InfoBarButtonsView) findViewById(R.id.buttons);
        this.y = findViewById(R.id.hide);
    }

    private final void setupButtons(InfoBar infoBar) {
        boolean z = !infoBar.j.isEmpty();
        InfoBarButtonsView infoBarButtonsView = this.x;
        bwt0.p0(infoBarButtonsView, z);
        infoBarButtonsView.setButtons(infoBar.j);
    }

    private final void setupDescriptionText(InfoBar infoBar) {
        CharSequence invoke;
        int length = infoBar.d.length();
        TextView textView = this.w;
        if (length == 0) {
            bwt0.p0(textView, false);
            return;
        }
        bwt0.p0(textView, true);
        CharSequence charSequence = infoBar.d;
        izs<? super CharSequence, ? extends CharSequence> izsVar = this.C;
        if (izsVar != null && (invoke = izsVar.invoke(charSequence)) != null) {
            charSequence = invoke;
        }
        textView.setText(charSequence);
        textView.setTextAppearance(R.style.VkUiTypography_Paragraph);
    }

    private final void setupIcon(InfoBar infoBar) {
        Integer num = infoBar.g;
        String str = infoBar.e;
        int i = this.t;
        int intValue = num != null ? num.intValue() : i;
        FrescoImageView frescoImageView = this.u;
        if (intValue != i) {
            bwt0.m0(intValue, intValue, frescoImageView);
        }
        Integer num2 = infoBar.h;
        if (num2 != null) {
            frescoImageView.getHierarchy().n(new PorterDuffColorFilter(num2.intValue(), PorterDuff.Mode.SRC_ATOP));
        }
        frescoImageView.setScaleType(infoBar.i ? ScaleType.CENTER_INSIDE : ScaleType.FIT_XY);
        frescoImageView.setVisible(!drm0.N(str));
        frescoImageView.setRemoteImage(new Image(intValue, intValue, str, false));
    }

    private final void setupTitle(InfoBar infoBar) {
        CharSequence invoke;
        boolean z = infoBar.c.length() > 0;
        TextView textView = this.v;
        bwt0.p0(textView, z);
        CharSequence charSequence = infoBar.c;
        izs<? super CharSequence, ? extends CharSequence> izsVar = this.C;
        if (izsVar != null && (invoke = izsVar.invoke(charSequence)) != null) {
            charSequence = invoke;
        }
        textView.setText(charSequence);
    }

    public final wzs<InfoBar, InfoBar.Button, s3q0> getOnButtonClickListener() {
        return this.D;
    }

    public final izs<InfoBar, s3q0> getOnHideCloseListener() {
        return this.E;
    }

    public final izs<CharSequence, CharSequence> getTextFormatter() {
        return this.C;
    }

    public final void setDescriptionTextAlpha(float f) {
        this.w.setAlpha(f);
    }

    public final void setFromBar(InfoBar infoBar) {
        this.z = infoBar;
        InfoBarButtonsView infoBarButtonsView = this.x;
        if (infoBar == null) {
            this.u.setVisibility(8);
            this.v.setVisibility(8);
            this.w.setVisibility(8);
            infoBarButtonsView.setVisibility(8);
            return;
        }
        setupIcon(infoBar);
        setupTitle(infoBar);
        setupDescriptionText(infoBar);
        setupButtons(infoBar);
        boolean z = infoBar.k;
        View view = this.y;
        awt0.v(view, z);
        if (infoBar.e.length() != 0 || infoBar.c.length() != 0 || infoBar.d.length() != 0) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) infoBarButtonsView.getLayoutParams();
            bVar.u = -1;
            bVar.E = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            ((ConstraintLayout.b) view.getLayoutParams()).F = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            f4m.t(iah0.a(0), view);
            return;
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) infoBarButtonsView.getLayoutParams();
        InfoBar infoBar2 = this.z;
        if (infoBar2 == null || !infoBar2.k) {
            bVar2.v = getId();
        } else {
            bVar2.u = view.getId();
        }
        bVar2.E = 0.5f;
        ((ConstraintLayout.b) view.getLayoutParams()).F = 0.5f;
        f4m.t(iah0.a(4), view);
    }

    public final void setOnButtonClickListener(wzs<? super InfoBar, ? super InfoBar.Button, s3q0> wzsVar) {
        this.D = wzsVar;
        this.x.setOnButtonClickListener(wzsVar == null ? null : this.A);
    }

    public final void setOnHideCloseListener(izs<? super InfoBar, s3q0> izsVar) {
        this.E = izsVar;
        jjc.g(this.y, izsVar == null ? null : this.B);
    }

    public final void setTextFormatter(izs<? super CharSequence, ? extends CharSequence> izsVar) {
        CharSequence invoke;
        this.C = izsVar;
        TextView textView = this.w;
        CharSequence text = textView.getText();
        izs<? super CharSequence, ? extends CharSequence> izsVar2 = this.C;
        if (izsVar2 != null && (invoke = izsVar2.invoke(text)) != null) {
            text = invoke;
        }
        textView.setText(text);
    }
}
