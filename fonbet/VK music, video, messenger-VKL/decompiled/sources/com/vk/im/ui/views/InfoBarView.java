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
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.b5h;
import xsna.bwt0;
import xsna.dhr0;
import xsna.drm0;
import xsna.f4m;
import xsna.fxj0;
import xsna.hod;
import xsna.iah0;
import xsna.izs;
import xsna.jjc;
import xsna.kkm;
import xsna.qcy;
import xsna.s3q0;
import xsna.v4w;
import xsna.wzs;
import xsna.zpb;

/* compiled from: InfoBarView.kt */
/* loaded from: classes2.dex */
public final class InfoBarView extends ConstraintLayout {
    public final b5h A;
    public final v4w B;
    public izs<? super CharSequence, ? extends CharSequence> C;
    public wzs<? super InfoBar, ? super InfoBar.Button, s3q0> D;
    public izs<? super InfoBar, s3q0> E;
    public kkm F;
    public final int t;
    public final FrescoImageView u;
    public final TextView v;
    public final TextView w;
    public final InfoBarButtonsView x;
    public final View y;
    public InfoBar z;

    public InfoBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.t = context.getResources().getDimensionPixelSize(R.dimen.vkim_info_bar_icon_size);
        this.A = new b5h(this, 24);
        this.B = new v4w(this, 1);
        this.F = new kkm(0);
        View.inflate(context, R.layout.vkim_info_bar, this);
        this.u = (FrescoImageView) findViewById(R.id.icon);
        this.v = (TextView) findViewById(R.id.title);
        this.w = (TextView) findViewById(R.id.text);
        this.x = (InfoBarButtonsView) findViewById(R.id.buttons);
        this.y = findViewById(R.id.hide);
    }

    private final void setupButtons(InfoBar infoBar) {
        int i = infoBar.j.isEmpty() ? 8 : 0;
        InfoBarButtonsView infoBarButtonsView = this.x;
        infoBarButtonsView.setVisibility(i);
        infoBarButtonsView.setButtons(infoBar.j);
    }

    private final void setupDescriptionText(InfoBar infoBar) {
        int i;
        CharSequence invoke;
        String str = infoBar.d;
        String str2 = infoBar.c;
        int length = str.length();
        TextView textView = this.w;
        if (length == 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        CharSequence charSequence = infoBar.d;
        izs<? super CharSequence, ? extends CharSequence> izsVar = this.C;
        if (izsVar != null && (invoke = izsVar.invoke(charSequence)) != null) {
            charSequence = invoke;
        }
        textView.setText(charSequence);
        if (str2.length() == 0) {
            textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
            textView.post(new hod(this, 5));
        } else {
            textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_secondary));
        }
        boolean z = str2.length() == 0;
        if (z) {
            i = R.style.VkUiTypography_Paragraph;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.style.VkUiTypography_Footnote;
        }
        qcy<Object>[] qcyVarArr = bwt0.a;
        textView.setTextAppearance(i);
    }

    private final void setupHide(InfoBar infoBar) {
        this.y.setVisibility(infoBar.k ? 0 : 8);
    }

    private final void setupIcon(InfoBar infoBar) {
        boolean N = drm0.N(infoBar.e);
        FrescoImageView frescoImageView = this.u;
        if (N) {
            frescoImageView.setVisibility(8);
            frescoImageView.setRemoteImage((List<? extends fxj0>) EmptyList.b);
            return;
        }
        Integer num = infoBar.g;
        int i = this.t;
        int intValue = num != null ? num.intValue() : i;
        if (intValue != i) {
            bwt0.m0(intValue, intValue, frescoImageView);
        }
        frescoImageView.setScaleType(infoBar.i ? ScaleType.CENTER_INSIDE : ScaleType.FIT_XY);
        frescoImageView.setVisibility(0);
        frescoImageView.setRemoteImage(new Image(intValue, intValue, infoBar.e, false));
        Integer num2 = infoBar.h;
        if (num2 != null) {
            frescoImageView.getHierarchy().n(new PorterDuffColorFilter(num2.intValue(), PorterDuff.Mode.SRC_ATOP));
        }
    }

    private final void setupTitle(InfoBar infoBar) {
        CharSequence invoke;
        int length = infoBar.c.length();
        TextView textView = this.v;
        if (length == 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        CharSequence charSequence = infoBar.c;
        izs<? super CharSequence, ? extends CharSequence> izsVar = this.C;
        if (izsVar != null && (invoke = izsVar.invoke(charSequence)) != null) {
            charSequence = invoke;
        }
        textView.setText(charSequence);
    }

    public final kkm getDialogThemeBinder() {
        return this.F;
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

    public final void setDialogThemeBinder(kkm kkmVar) {
        this.F.h(this);
        this.F = kkmVar;
        kkmVar.e(this, new zpb((byte) 0, 6));
    }

    public final void setFromBar(InfoBar infoBar) {
        this.z = infoBar;
        View view = this.y;
        InfoBarButtonsView infoBarButtonsView = this.x;
        if (infoBar == null) {
            this.u.setVisibility(8);
            this.v.setVisibility(8);
            this.w.setVisibility(8);
            infoBarButtonsView.setVisibility(8);
            view.setVisibility(8);
            return;
        }
        setupIcon(infoBar);
        setupTitle(infoBar);
        setupDescriptionText(infoBar);
        setupButtons(infoBar);
        setupHide(infoBar);
        if (infoBar.e.length() != 0 || infoBar.c.length() != 0 || infoBar.d.length() != 0) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) infoBarButtonsView.getLayoutParams();
            bVar.u = -1;
            bVar.E = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
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
