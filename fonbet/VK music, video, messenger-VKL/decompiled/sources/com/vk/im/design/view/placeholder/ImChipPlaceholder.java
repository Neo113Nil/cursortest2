package com.vk.im.design.view.placeholder;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import xsna.f4m;
import xsna.jai;
import xsna.tlo0;
import xsna.tnc;

/* compiled from: ImChipPlaceholder.kt */
/* loaded from: classes2.dex */
public final class ImChipPlaceholder extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public final ComposeView b;

    public ImChipPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ComposeView composeView = new ComposeView(context, null, 6);
        this.b = composeView;
        f4m.j(composeView);
        addView(composeView);
    }

    public static void a(ImChipPlaceholder imChipPlaceholder, tlo0 tlo0Var) {
        com.vk.movika.sdk.base.model.props.a aVar = new com.vk.movika.sdk.base.model.props.a(13);
        ComposeView composeView = imChipPlaceholder.b;
        composeView.setContent(new jai(1168816662, new tnc(tlo0Var, imChipPlaceholder, aVar, 2), true));
        composeView.setVisibility(0);
    }
}
