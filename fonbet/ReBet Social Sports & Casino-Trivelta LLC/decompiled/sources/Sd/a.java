package Sd;

import com.plaid.internal.EnumC3631g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: Sd.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0209a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Vd.a.values().length];
            try {
                iArr[Vd.a.AudioInitiate.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Vd.a.AudioAccept.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Vd.a.AudioOffer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Vd.a.AudioAnswer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Vd.a.AudioConnect.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Vd.a.AudioReject.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Vd.a.AudioCancel.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Vd.a.AudioEnd.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Vd.a.AudioMiss.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Vd.a.AudioUIShown.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Vd.a.AudioUICleared.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Vd.a.AudioInvitationShown.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Vd.a.AudioInvitationCleared.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Vd.a.AudioOutgoingUIShown.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Vd.a.AudioOutgoingUICleared.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Vd.a.AudioIncomingSoundStart.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Vd.a.AudioOutgoingSoundStart.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[Vd.a.AudioSoundStop.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[Vd.a.AudioMicPermissionAllowed.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[Vd.a.AudioMicPermissionBlocked.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[Vd.a.AudioInputDeviceChanged.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[Vd.a.AudioOutputDeviceChanged.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[Vd.a.AudioMute.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[Vd.a.AudioUnMute.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[Vd.a.AudioVoice.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[Vd.a.AudioStart.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[Vd.a.AudioReconnectState.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[Vd.a.AudioRenegotiationInitiate.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[Vd.a.AudioRenegotiationAccept.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[Vd.a.AudioRenegotiationCancel.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[Vd.a.AudioRenegotiationReject.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[Vd.a.AudioRenegotiationMiss.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[Vd.a.AudioRenegotiationTrackAdded.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[Vd.a.AudioRenegotiationTrackRemoved.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int a(Vd.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        switch (C0209a.$EnumSwitchMapping$0[aVar.ordinal()]) {
            case 1:
                return 101;
            case 2:
                return 102;
            case 3:
                return 103;
            case 4:
                return 104;
            case 5:
                return 105;
            case 6:
                return 106;
            case 7:
                return 107;
            case 8:
                return 108;
            case 9:
                return 109;
            case 10:
                return 131;
            case 11:
                return EnumC3631g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE;
            case 12:
                return EnumC3631g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE;
            case 13:
                return 134;
            case 14:
                return EnumC3631g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE;
            case 15:
                return 136;
            case 16:
                return EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE;
            case 17:
                return 147;
            case 18:
                return EnumC3631g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE;
            case 19:
                return EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE;
            case 20:
                return EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_NAVBAR_PLAID_LOGO_VALUE;
            case 21:
                return 151;
            case 22:
                return EnumC3631g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE;
            case 23:
                return EnumC3631g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE;
            case 24:
                return EnumC3631g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE;
            case 25:
                return EnumC3631g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE;
            case 26:
                return EnumC3631g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
            case 27:
                return 165;
            case 28:
                return EnumC3631g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE;
            case 29:
                return EnumC3631g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE;
            case 30:
                return EnumC3631g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE;
            case 31:
                return EnumC3631g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE;
            case 32:
                return EnumC3631g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE;
            case 33:
                return EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE;
            case 34:
                return EnumC3631g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
