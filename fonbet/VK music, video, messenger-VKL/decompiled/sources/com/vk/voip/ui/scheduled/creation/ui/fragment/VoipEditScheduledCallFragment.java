package com.vk.voip.ui.scheduled.creation.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduledCallInput;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduledCallReportType;
import xsna.hww0;
import xsna.knw0;
import xsna.lnw0;
import xsna.oz50;
import xsna.pyw0;
import xsna.vxw0;
import xsna.x5h0;
import xsna.xn50;

/* compiled from: VoipEditScheduledCallFragment.kt */
/* loaded from: classes7.dex */
public final class VoipEditScheduledCallFragment extends VoipCreateScheduleCallFragment {

    /* compiled from: VoipEditScheduledCallFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment
    public final lnw0 fo(Context context) {
        return new knw0(context, new vxw0(context));
    }

    @Override // com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment
    public final x5h0 go() {
        Bundle arguments = getArguments();
        return (arguments != null ? (VoipScheduledCallInput) arguments.getParcelable("scheduled_call") : null).b;
    }

    @Override // com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment
    public final void io(CallId callId, MobileOfficialAppsCallsStat$TypeVoipCallItem.SharingChannel sharingChannel) {
        xn50.a.c(this, new hww0.r(new pyw0(VoipScheduledCallReportType.SCHEDULED_CALL_EDITED, callId, sharingChannel)));
    }

    @Override // com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        xn50.a.c(this, hww0.t.b);
    }
}
