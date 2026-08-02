package Vd;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AudioInitiate = new a("AudioInitiate", 0);
    public static final a AudioAccept = new a("AudioAccept", 1);
    public static final a AudioOffer = new a("AudioOffer", 2);
    public static final a AudioAnswer = new a("AudioAnswer", 3);
    public static final a AudioConnect = new a("AudioConnect", 4);
    public static final a AudioReject = new a("AudioReject", 5);
    public static final a AudioCancel = new a("AudioCancel", 6);
    public static final a AudioEnd = new a("AudioEnd", 7);
    public static final a AudioMiss = new a("AudioMiss", 8);
    public static final a AudioUIShown = new a("AudioUIShown", 9);
    public static final a AudioUICleared = new a("AudioUICleared", 10);
    public static final a AudioInvitationShown = new a("AudioInvitationShown", 11);
    public static final a AudioInvitationCleared = new a("AudioInvitationCleared", 12);
    public static final a AudioOutgoingUIShown = new a("AudioOutgoingUIShown", 13);
    public static final a AudioOutgoingUICleared = new a("AudioOutgoingUICleared", 14);
    public static final a AudioIncomingSoundStart = new a("AudioIncomingSoundStart", 15);
    public static final a AudioOutgoingSoundStart = new a("AudioOutgoingSoundStart", 16);
    public static final a AudioSoundStop = new a("AudioSoundStop", 17);
    public static final a AudioMicPermissionAllowed = new a("AudioMicPermissionAllowed", 18);
    public static final a AudioMicPermissionBlocked = new a("AudioMicPermissionBlocked", 19);
    public static final a AudioInputDeviceChanged = new a("AudioInputDeviceChanged", 20);
    public static final a AudioOutputDeviceChanged = new a("AudioOutputDeviceChanged", 21);
    public static final a AudioMute = new a("AudioMute", 22);
    public static final a AudioUnMute = new a("AudioUnMute", 23);
    public static final a AudioVoice = new a("AudioVoice", 24);
    public static final a AudioStart = new a("AudioStart", 25);
    public static final a AudioReconnectState = new a("AudioReconnectState", 26);
    public static final a AudioRenegotiationInitiate = new a("AudioRenegotiationInitiate", 27);
    public static final a AudioRenegotiationAccept = new a("AudioRenegotiationAccept", 28);
    public static final a AudioRenegotiationCancel = new a("AudioRenegotiationCancel", 29);
    public static final a AudioRenegotiationReject = new a("AudioRenegotiationReject", 30);
    public static final a AudioRenegotiationMiss = new a("AudioRenegotiationMiss", 31);
    public static final a AudioRenegotiationTrackAdded = new a("AudioRenegotiationTrackAdded", 32);
    public static final a AudioRenegotiationTrackRemoved = new a("AudioRenegotiationTrackRemoved", 33);

    private static final /* synthetic */ a[] $values() {
        return new a[]{AudioInitiate, AudioAccept, AudioOffer, AudioAnswer, AudioConnect, AudioReject, AudioCancel, AudioEnd, AudioMiss, AudioUIShown, AudioUICleared, AudioInvitationShown, AudioInvitationCleared, AudioOutgoingUIShown, AudioOutgoingUICleared, AudioIncomingSoundStart, AudioOutgoingSoundStart, AudioSoundStop, AudioMicPermissionAllowed, AudioMicPermissionBlocked, AudioInputDeviceChanged, AudioOutputDeviceChanged, AudioMute, AudioUnMute, AudioVoice, AudioStart, AudioReconnectState, AudioRenegotiationInitiate, AudioRenegotiationAccept, AudioRenegotiationCancel, AudioRenegotiationReject, AudioRenegotiationMiss, AudioRenegotiationTrackAdded, AudioRenegotiationTrackRemoved};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private a(String str, int i10) {
    }

    @NotNull
    public static EnumEntries<a> getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
