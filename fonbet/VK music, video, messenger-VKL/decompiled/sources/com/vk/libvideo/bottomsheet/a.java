package com.vk.libvideo.bottomsheet;

import android.view.View;
import android.widget.TextView;
import com.vk.dto.hints.HintId;
import xsna.pla;

/* compiled from: View.kt */
/* loaded from: classes2.dex */
public final class a implements View.OnLayoutChangeListener {
    public final /* synthetic */ TextView b;

    public a(TextView textView) {
        this.b = textView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        pla.e().b().q(this.b, HintId.INFO_VIDEO_DOWNLOAD_MENU);
    }
}
