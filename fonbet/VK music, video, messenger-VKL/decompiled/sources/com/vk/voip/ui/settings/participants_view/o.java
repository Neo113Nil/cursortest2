package com.vk.voip.ui.settings.participants_view;

import android.view.View;
import android.widget.Button;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.bwt0;
import xsna.fuw0;
import xsna.jqr0;
import xsna.msy;
import xsna.n3b0;
import xsna.tbe0;

/* compiled from: VhPermissionBannerHolder.kt */
/* loaded from: classes7.dex */
public final class o extends jqr0<CallSettingsItem.c> {
    public static final /* synthetic */ int o = 0;
    public final fuw0 l;
    public final Object m;
    public com.vk.movika.sdk.base.observable.a n;

    public o(View view) {
        super(view);
        this.l = fuw0.a;
        Lazy a = msy.a(LazyThreadSafetyMode.NONE, new tbe0(this, 20));
        this.m = a;
        bwt0.i0((Button) a.getValue(), new n3b0(this, 22));
    }

    @Override // xsna.jqr0
    public final void V5() {
        this.n = null;
    }
}
