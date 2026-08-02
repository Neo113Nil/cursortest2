package com.vk.voip.ui.scheduled.creation.ui.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduledCallInput;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduledCallReportType;
import com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipEditTimeScheduledCallFragment;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bwt0;
import xsna.exw0;
import xsna.gm50;
import xsna.hww0;
import xsna.izs;
import xsna.krv0;
import xsna.lbt0;
import xsna.lnw0;
import xsna.lrv0;
import xsna.lxh0;
import xsna.mk50;
import xsna.mnw0;
import xsna.msy;
import xsna.mvl0;
import xsna.pyw0;
import xsna.s3q0;
import xsna.vxw0;
import xsna.wfu0;
import xsna.x5h0;
import xsna.xn50;

/* compiled from: VoipEditTimeScheduledCallFragment.kt */
/* loaded from: classes7.dex */
public final class VoipEditTimeScheduledCallFragment extends VoipCreateScheduleCallFragment {
    public static final /* synthetic */ int X = 0;
    public final mnw0 T = new lrv0.a() { // from class: xsna.mnw0
        @Override // xsna.lrv0.a
        public final void xb() {
            int i = VoipEditTimeScheduledCallFragment.X;
            VoipEditTimeScheduledCallFragment.this.tn();
        }
    };
    public final Object U = msy.a(LazyThreadSafetyMode.NONE, new wfu0(this, 4));
    public ViewFlipper V;
    public TextView W;

    /* compiled from: VoipEditTimeScheduledCallFragment.kt */
    public static final class a {
        public final VoipEditTimeScheduledCallFragment a = new VoipEditTimeScheduledCallFragment();
    }

    /* compiled from: VoipEditTimeScheduledCallFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<VoipScheduleCallViewState.ScreenState, s3q0> {
        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.izs
        public final s3q0 invoke(VoipScheduleCallViewState.ScreenState screenState) {
            VoipScheduleCallViewState.ScreenState screenState2 = screenState;
            VoipEditTimeScheduledCallFragment voipEditTimeScheduledCallFragment = (VoipEditTimeScheduledCallFragment) this.receiver;
            int i = VoipEditTimeScheduledCallFragment.X;
            voipEditTimeScheduledCallFragment.getClass();
            if (screenState2 instanceof VoipScheduleCallViewState.ScreenState.a) {
                VoipScheduleCallViewState.ScreenState.a aVar = (VoipScheduleCallViewState.ScreenState.a) screenState2;
                ViewFlipper viewFlipper = voipEditTimeScheduledCallFragment.V;
                if (viewFlipper == null) {
                    viewFlipper = null;
                }
                if (viewFlipper.getDisplayedChild() != 1) {
                    ViewFlipper viewFlipper2 = voipEditTimeScheduledCallFragment.V;
                    (viewFlipper2 != null ? viewFlipper2 : null).setDisplayedChild(1);
                }
                ((exw0) voipEditTimeScheduledCallFragment.U.getValue()).setItems(aVar.a);
            } else if (screenState2 instanceof VoipScheduleCallViewState.ScreenState.c) {
                ViewFlipper viewFlipper3 = voipEditTimeScheduledCallFragment.V;
                (viewFlipper3 != null ? viewFlipper3 : null).setDisplayedChild(0);
            } else {
                if (!(screenState2 instanceof VoipScheduleCallViewState.ScreenState.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                VoipScheduleCallViewState.ScreenState.b bVar = (VoipScheduleCallViewState.ScreenState.b) screenState2;
                ViewFlipper viewFlipper4 = voipEditTimeScheduledCallFragment.V;
                if (viewFlipper4 == null) {
                    viewFlipper4 = null;
                }
                if (viewFlipper4.getDisplayedChild() != 2) {
                    ViewFlipper viewFlipper5 = voipEditTimeScheduledCallFragment.V;
                    if (viewFlipper5 == null) {
                        viewFlipper5 = null;
                    }
                    viewFlipper5.setDisplayedChild(2);
                }
                TextView textView = voipEditTimeScheduledCallFragment.W;
                (textView != null ? textView : null).setText(bVar.a);
            }
            return s3q0.a;
        }
    }

    @Override // com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment, xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.voip_scheduled_call_edit_time);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void close() {
        tn();
    }

    @Override // com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment
    public final lnw0 fo(Context context) {
        return new lnw0(context, new vxw0(context));
    }

    @Override // com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment
    public final x5h0 go() {
        Bundle arguments = getArguments();
        return (arguments != null ? (VoipScheduledCallInput) arguments.getParcelable("scheduled_call") : null).b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment, xsna.xn50
    /* renamed from: ho */
    public final void Jh(VoipScheduleCallViewState voipScheduleCallViewState, View view) {
        ((RecyclerView) view.findViewById(R.id.voip_schedule_call_recycler)).setAdapter((exw0) this.U.getValue());
        bwt0.i0(view.findViewById(R.id.voip_edit_time_action_button), new lbt0(this, 7));
        ViewFlipper viewFlipper = (ViewFlipper) view.findViewById(R.id.voip_schedule_call_flipper);
        AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        alphaAnimation.setDuration(200L);
        viewFlipper.setInAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        alphaAnimation2.setDuration(200L);
        viewFlipper.setOutAnimation(alphaAnimation2);
        this.V = viewFlipper;
        this.W = (TextView) view.findViewById(R.id.voip_error_text);
        bwt0.i0(view.findViewById(R.id.voip_error_retry), new lxh0(this, 20));
        gm50.a.b(this, voipScheduleCallViewState.a, new mvl0(this, 20));
    }

    @Override // com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment
    public final void io(CallId callId, MobileOfficialAppsCallsStat$TypeVoipCallItem.SharingChannel sharingChannel) {
        xn50.a.c(this, new hww0.r(new pyw0(VoipScheduledCallReportType.SCHEDULED_CALL_EDITED, callId, sharingChannel)));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = krv0.a;
        krv0.a(this.T);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        TypedValue typedValue = krv0.a;
        krv0.k(this.T);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        getParentFragmentManager().k0(new Bundle(), "EditScheduledCall");
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((View) view.getParent()).setBackgroundResource(R.drawable.bg_bottom_sheet_rounded_corners);
    }

    @Override // androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        return new com.google.android.material.bottomsheet.b(requireContext(), this.m);
    }
}
