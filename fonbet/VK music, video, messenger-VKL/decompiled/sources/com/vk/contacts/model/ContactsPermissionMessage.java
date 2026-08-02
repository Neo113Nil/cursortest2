package com.vk.contacts.model;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContactsPermissionMessage.kt */
/* loaded from: classes17.dex */
public final class ContactsPermissionMessage {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ContactsPermissionMessage[] $VALUES;
    public static final ContactsPermissionMessage DEFAULT;
    public static final ContactsPermissionMessage EDU;
    private final int deniedPermissionMessageRes;
    private final int deniedPermissionTitleRes;
    private final int requirePermissionMessageRes;
    private final int requirePermissionTitleRes;

    static {
        ContactsPermissionMessage contactsPermissionMessage = new ContactsPermissionMessage("DEFAULT", 0, R.string.vk_permissions_contacts_title, R.string.vk_permissions_contacts_sync_auto, R.string.vk_permissions_contacts_sync_setting_title, R.string.vk_permissions_contacts_sync_settings);
        DEFAULT = contactsPermissionMessage;
        ContactsPermissionMessage contactsPermissionMessage2 = new ContactsPermissionMessage("EDU", 1, R.string.vk_permissions_contacts_edu_title, R.string.vk_permissions_contacts_edu_sync_auto, R.string.vk_permissions_contacts_edu_title, R.string.vk_permissions_contacts_sync_edu_settings);
        EDU = contactsPermissionMessage2;
        ContactsPermissionMessage[] contactsPermissionMessageArr = {contactsPermissionMessage, contactsPermissionMessage2};
        $VALUES = contactsPermissionMessageArr;
        $ENTRIES = new asp(contactsPermissionMessageArr);
    }

    public ContactsPermissionMessage(String str, int i, int i2, int i3, int i4, int i5) {
        this.requirePermissionTitleRes = i2;
        this.requirePermissionMessageRes = i3;
        this.deniedPermissionTitleRes = i4;
        this.deniedPermissionMessageRes = i5;
    }

    public static ContactsPermissionMessage valueOf(String str) {
        return (ContactsPermissionMessage) Enum.valueOf(ContactsPermissionMessage.class, str);
    }

    public static ContactsPermissionMessage[] values() {
        return (ContactsPermissionMessage[]) $VALUES.clone();
    }

    public final int h() {
        return this.deniedPermissionMessageRes;
    }

    public final int i() {
        return this.deniedPermissionTitleRes;
    }

    public final int j() {
        return this.requirePermissionMessageRes;
    }

    public final int k() {
        return this.requirePermissionTitleRes;
    }
}
