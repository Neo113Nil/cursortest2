package com.vk.voip.ui.report.dialog;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.ui.themes.ThemableActivity;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.voip.api.id.CallId;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.b;
import xsna.bpn0;
import xsna.c5v0;
import xsna.c63;
import xsna.dhr0;
import xsna.dw20;
import xsna.egu0;
import xsna.ikv0;
import xsna.lpj;
import xsna.pis0;
import xsna.r3y;
import xsna.sy0;
import xsna.tlo0;
import xsna.tq;
import xsna.v5n0;

/* compiled from: VoipReportSuspiciousCallActivity.kt */
/* loaded from: classes7.dex */
public final class VoipReportSuspiciousCallActivity extends ThemableActivity {
    public static final /* synthetic */ int q = 0;
    public dw20 l;
    public boolean m;
    public boolean n;
    public final bpn0 o = new bpn0(new egu0(this, 5));
    public final b p = new b();

    /* compiled from: VoipReportSuspiciousCallActivity.kt */
    public static final class a extends c63.b {
        public a() {
        }

        @Override // xsna.c63.b
        public final void p(Activity activity) {
            int i = VoipReportSuspiciousCallActivity.q;
            ikv0.a aVar = new ikv0.a(activity);
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_28, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
            VoipReportSuspiciousCallActivity voipReportSuspiciousCallActivity = VoipReportSuspiciousCallActivity.this;
            aVar.u = new ikv0.d(voipReportSuspiciousCallActivity.i.getString(R.string.voip_report_call_snackbar), (String) null, (ikv0.d.a) null, 6);
            aVar.n();
            c63 c63Var = c63.a;
            c63.c((c63.b) voipReportSuspiciousCallActivity.o.getValue());
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (this.m) {
            r3y.c("VKWebAppReturnReason");
        }
        this.p.e();
        if (this.n) {
            c63 c63Var = c63.a;
            c63.a((c63.b) this.o.getValue());
        }
    }

    @Override // com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        CallId callId;
        UserId userId;
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable4 = extras.getParcelable("call_id", CallId.class);
                parcelable3 = (Parcelable) parcelable4;
            } else {
                Parcelable parcelable5 = extras.getParcelable("call_id");
                if (!(parcelable5 instanceof CallId)) {
                    parcelable5 = null;
                }
                parcelable3 = (CallId) parcelable5;
            }
            callId = (CallId) parcelable3;
        } else {
            callId = null;
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = extras2.getParcelable("user_id", UserId.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable6 = extras2.getParcelable("user_id");
                if (!(parcelable6 instanceof UserId)) {
                    parcelable6 = null;
                }
                parcelable = (UserId) parcelable6;
            }
            userId = (UserId) parcelable;
        } else {
            userId = null;
        }
        if (callId == null || userId == null) {
            finish();
            return;
        }
        dw20 b = new VkModal(VkModal.Mode.Card, new b.a.C0790b(null, new c5v0.b(14, tq.h(tlo0.Companion, R.string.voip_report_suspicious_call_modal_dialog_title), null), null, new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.voip_report_suspicious_call_modal_dialog_no_button), new v5n0(this, 27), null, VkButton.Mode.Secondary, null, false, 444), new c5v0.a.C2643a(new tlo0.f(R.string.voip_report_suspicious_call_modal_dialog_yes_button), new sy0(this, userId, callId, 3), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), 4), 53), null, false, 28).b(new lpj(this, dhr0.C().c), "VoipReportSuspiciousCallModalDialog");
        b.Vn(new pis0(this, 19));
        this.l = b;
    }
}
