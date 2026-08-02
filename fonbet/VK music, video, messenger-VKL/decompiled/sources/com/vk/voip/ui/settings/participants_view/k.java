package com.vk.voip.ui.settings.participants_view;

import android.view.View;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import com.vkontakte.android.R;
import xsna.ggb0;
import xsna.hfm0;
import xsna.jjc;
import xsna.jqr0;
import xsna.mga0;
import xsna.qjg0;
import xsna.wug0;

/* compiled from: VhAdminToolbar.kt */
/* loaded from: classes7.dex */
public final class k extends jqr0<CallSettingsItem.a> {
    public static final /* synthetic */ int p = 0;
    public com.vk.movika.sdk.base.observable.a l;
    public final View m;
    public final View n;
    public final View o;

    public k(View view) {
        super(view);
        View findViewById = this.itemView.findViewById(R.id.mute_microphones_for_all_btn);
        this.m = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.turn_off_cameras_for_all_btn);
        this.n = findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.lower_hands_for_all_btn);
        this.o = findViewById3;
        jjc.g(findViewById, new mga0(this, 27));
        jjc.g(findViewById2, new ggb0(this, 25));
        jjc.g(findViewById3, new wug0(this, 24));
        jjc.g(this.itemView.findViewById(R.id.request_media_for_all_btn), new qjg0(this, 11));
        jjc.g(this.itemView.findViewById(R.id.end_call_for_all_btn), new hfm0(this, 10));
    }

    @Override // xsna.jqr0
    public final void V5() {
        this.l = null;
    }
}
