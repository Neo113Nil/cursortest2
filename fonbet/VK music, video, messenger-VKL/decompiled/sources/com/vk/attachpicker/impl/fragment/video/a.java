package com.vk.attachpicker.impl.fragment.video;

import android.view.ViewGroup;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import xsna.iah0;
import xsna.izs;
import xsna.s3q0;

/* compiled from: AttachVideoFragment.kt */
/* loaded from: classes15.dex */
public final class a implements izs<Boolean, s3q0> {
    public final /* synthetic */ AttachVideoFragment.b b;

    public a(AttachVideoFragment.b bVar) {
        this.b = bVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Boolean bool) {
        ((ViewGroup.MarginLayoutParams) this.b.r.getLayoutParams()).rightMargin = bool.booleanValue() ? iah0.a(32) : 0;
        return s3q0.a;
    }
}
