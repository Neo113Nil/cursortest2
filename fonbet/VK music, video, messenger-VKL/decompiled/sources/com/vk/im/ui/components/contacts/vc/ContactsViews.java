package com.vk.im.ui.components.contacts.vc;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContactsViews.kt */
/* loaded from: classes2.dex */
public final class ContactsViews {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ContactsViews[] $VALUES;
    public static final ContactsViews BIRTHDAYS;
    public static final ContactsViews CONTACTS;
    public static final ContactsViews CREATE_CALL;
    public static final ContactsViews CREATE_CASPER_CHAT;
    public static final ContactsViews CREATE_CHANNEL;
    public static final ContactsViews CREATE_CHAT;
    public static final ContactsViews CREATE_CONTACT;
    public static final ContactsViews CREATE_SPACE;
    public static final ContactsViews EDU_CONTACTS;
    public static final ContactsViews EMPTY;
    public static final ContactsViews HINTS;
    public static final ContactsViews INVITE;
    public static final ContactsViews INVITE_BY_PHONE_NUMBER;
    public static final ContactsViews NEW_USERS_BANNER;
    public static final ContactsViews RECENT_USERS;
    public static final ContactsViews REQUEST_PERMISSION;
    public static final ContactsViews SELECTION_PREVIEW;
    public static final ContactsViews SHARE;
    public static final ContactsViews SHOW_CONTACT_LIST;
    public static final ContactsViews USERS;
    public static final ContactsViews USERS_FROM_ROOT_CONVERSATION;
    public static final ContactsViews WRITE_BY_PHONE_NUMBER;

    static {
        ContactsViews contactsViews = new ContactsViews("USERS", 0);
        USERS = contactsViews;
        ContactsViews contactsViews2 = new ContactsViews("CONTACTS", 1);
        CONTACTS = contactsViews2;
        ContactsViews contactsViews3 = new ContactsViews("EDU_CONTACTS", 2);
        EDU_CONTACTS = contactsViews3;
        ContactsViews contactsViews4 = new ContactsViews("HINTS", 3);
        HINTS = contactsViews4;
        ContactsViews contactsViews5 = new ContactsViews("RECENT_USERS", 4);
        RECENT_USERS = contactsViews5;
        ContactsViews contactsViews6 = new ContactsViews("NEW_USERS_BANNER", 5);
        NEW_USERS_BANNER = contactsViews6;
        ContactsViews contactsViews7 = new ContactsViews("BIRTHDAYS", 6);
        BIRTHDAYS = contactsViews7;
        ContactsViews contactsViews8 = new ContactsViews("REQUEST_PERMISSION", 7);
        REQUEST_PERMISSION = contactsViews8;
        ContactsViews contactsViews9 = new ContactsViews("EMPTY", 8);
        EMPTY = contactsViews9;
        ContactsViews contactsViews10 = new ContactsViews("USERS_FROM_ROOT_CONVERSATION", 9);
        USERS_FROM_ROOT_CONVERSATION = contactsViews10;
        ContactsViews contactsViews11 = new ContactsViews("CREATE_CHAT", 10);
        CREATE_CHAT = contactsViews11;
        ContactsViews contactsViews12 = new ContactsViews("CREATE_CASPER_CHAT", 11);
        CREATE_CASPER_CHAT = contactsViews12;
        ContactsViews contactsViews13 = new ContactsViews("CREATE_CHANNEL", 12);
        CREATE_CHANNEL = contactsViews13;
        ContactsViews contactsViews14 = new ContactsViews("CREATE_SPACE", 13);
        CREATE_SPACE = contactsViews14;
        ContactsViews contactsViews15 = new ContactsViews("CREATE_CALL", 14);
        CREATE_CALL = contactsViews15;
        ContactsViews contactsViews16 = new ContactsViews("INVITE", 15);
        INVITE = contactsViews16;
        ContactsViews contactsViews17 = new ContactsViews("INVITE_BY_PHONE_NUMBER", 16);
        INVITE_BY_PHONE_NUMBER = contactsViews17;
        ContactsViews contactsViews18 = new ContactsViews("WRITE_BY_PHONE_NUMBER", 17);
        WRITE_BY_PHONE_NUMBER = contactsViews18;
        ContactsViews contactsViews19 = new ContactsViews("SHARE", 18);
        SHARE = contactsViews19;
        ContactsViews contactsViews20 = new ContactsViews("SHOW_CONTACT_LIST", 19);
        SHOW_CONTACT_LIST = contactsViews20;
        ContactsViews contactsViews21 = new ContactsViews("CREATE_CONTACT", 20);
        CREATE_CONTACT = contactsViews21;
        ContactsViews contactsViews22 = new ContactsViews("SELECTION_PREVIEW", 21);
        SELECTION_PREVIEW = contactsViews22;
        ContactsViews[] contactsViewsArr = {contactsViews, contactsViews2, contactsViews3, contactsViews4, contactsViews5, contactsViews6, contactsViews7, contactsViews8, contactsViews9, contactsViews10, contactsViews11, contactsViews12, contactsViews13, contactsViews14, contactsViews15, contactsViews16, contactsViews17, contactsViews18, contactsViews19, contactsViews20, contactsViews21, contactsViews22};
        $VALUES = contactsViewsArr;
        $ENTRIES = new asp(contactsViewsArr);
    }

    public ContactsViews() {
        throw null;
    }

    public static ContactsViews valueOf(String str) {
        return (ContactsViews) Enum.valueOf(ContactsViews.class, str);
    }

    public static ContactsViews[] values() {
        return (ContactsViews[]) $VALUES.clone();
    }
}
