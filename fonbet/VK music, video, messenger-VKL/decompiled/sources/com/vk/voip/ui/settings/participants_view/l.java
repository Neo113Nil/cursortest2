package com.vk.voip.ui.settings.participants_view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import com.vkontakte.android.R;
import xsna.aer0;
import xsna.bwt0;
import xsna.jqr0;
import xsna.vup0;

/* compiled from: VhCallParticipant.kt */
/* loaded from: classes7.dex */
public final class l extends jqr0<CallSettingsItem.CallParticipant> {
    public static final /* synthetic */ int y = 0;
    public final VoipAvatarViewContainer l;
    public final ImageView m;
    public final TextView n;
    public final ImageView o;
    public final ImageView p;
    public final ImageView q;
    public final ImageView r;
    public final ImageView s;
    public final ImageView t;
    public final ImageView u;
    public final View v;
    public CallSettingsItem.CallParticipant w;
    public com.vk.movika.sdk.base.observable.a x;

    /* compiled from: VhCallParticipant.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CallSettingsItem.CallParticipant.CameraState.values().length];
            try {
                iArr[CallSettingsItem.CallParticipant.CameraState.MUTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallSettingsItem.CallParticipant.CameraState.OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CallSettingsItem.CallParticipant.CameraState.ON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CallSettingsItem.CallParticipant.MicrophoneState.values().length];
            try {
                iArr2[CallSettingsItem.CallParticipant.MicrophoneState.MUTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CallSettingsItem.CallParticipant.MicrophoneState.OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CallSettingsItem.CallParticipant.MicrophoneState.ON.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CallSettingsItem.CallParticipant.MicrophoneState.TALKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public l(ViewGroup viewGroup) {
        super(viewGroup);
        this.l = (VoipAvatarViewContainer) viewGroup.findViewById(R.id.avatar);
        this.m = (ImageView) viewGroup.findViewById(R.id.admin_indicator);
        this.n = (TextView) viewGroup.findViewById(R.id.name);
        this.o = (ImageView) viewGroup.findViewById(R.id.self_indicator);
        this.p = (ImageView) viewGroup.findViewById(R.id.pinned_indicator);
        this.q = (ImageView) viewGroup.findViewById(R.id.raised_hand_indicator);
        this.r = (ImageView) viewGroup.findViewById(R.id.screen_share_indicator);
        this.s = (ImageView) viewGroup.findViewById(R.id.camera_indicator);
        this.t = (ImageView) viewGroup.findViewById(R.id.microphone_indicator);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.connecting_indicator);
        this.u = imageView;
        View findViewById = viewGroup.findViewById(R.id.menu_btn);
        this.v = findViewById;
        imageView.setImageDrawable(new vup0(viewGroup.getContext()));
        bwt0.i0(findViewById, new aer0(this, 1));
    }

    @Override // xsna.jqr0
    public final void V5() {
        this.w = null;
        this.x = null;
    }
}
