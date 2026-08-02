package com.vk.contacts;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContactSyncState.kt */
/* loaded from: classes.dex */
public final class ContactSyncState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ContactSyncState[] $VALUES;
    public static final a Companion;
    public static final ContactSyncState DONE;
    public static final ContactSyncState FAILED;
    public static final ContactSyncState HIDDEN;
    public static final ContactSyncState NOT_PERMITTED;
    public static final ContactSyncState PERMITTED;
    public static final ContactSyncState SYNCING;
    public static final ContactSyncState UNSUPPORTED;
    private final int id;

    /* compiled from: ContactSyncState.kt */
    public static final class a {
    }

    static {
        ContactSyncState contactSyncState = new ContactSyncState("NOT_PERMITTED", 0, 0);
        NOT_PERMITTED = contactSyncState;
        ContactSyncState contactSyncState2 = new ContactSyncState("HIDDEN", 1, 1);
        HIDDEN = contactSyncState2;
        ContactSyncState contactSyncState3 = new ContactSyncState("SYNCING", 2, 2);
        SYNCING = contactSyncState3;
        ContactSyncState contactSyncState4 = new ContactSyncState(SignalingProtocol.HUNGUP_REASON_FAILED, 3, 3);
        FAILED = contactSyncState4;
        ContactSyncState contactSyncState5 = new ContactSyncState("DONE", 4, 4);
        DONE = contactSyncState5;
        ContactSyncState contactSyncState6 = new ContactSyncState("PERMITTED", 5, 5);
        PERMITTED = contactSyncState6;
        ContactSyncState contactSyncState7 = new ContactSyncState("UNSUPPORTED", 6, 6);
        UNSUPPORTED = contactSyncState7;
        ContactSyncState[] contactSyncStateArr = {contactSyncState, contactSyncState2, contactSyncState3, contactSyncState4, contactSyncState5, contactSyncState6, contactSyncState7};
        $VALUES = contactSyncStateArr;
        $ENTRIES = new asp(contactSyncStateArr);
        Companion = new a();
    }

    public ContactSyncState(String str, int i, int i2) {
        this.id = i2;
    }

    public static ContactSyncState valueOf(String str) {
        return (ContactSyncState) Enum.valueOf(ContactSyncState.class, str);
    }

    public static ContactSyncState[] values() {
        return (ContactSyncState[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
