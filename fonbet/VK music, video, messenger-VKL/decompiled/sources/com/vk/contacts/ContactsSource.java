package com.vk.contacts;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContactsSource.kt */
/* loaded from: classes17.dex */
public final class ContactsSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ContactsSource[] $VALUES;
    public static final ContactsSource CACHE;
    public static final ContactsSource SYSTEM;

    static {
        ContactsSource contactsSource = new ContactsSource("CACHE", 0);
        CACHE = contactsSource;
        ContactsSource contactsSource2 = new ContactsSource("SYSTEM", 1);
        SYSTEM = contactsSource2;
        ContactsSource[] contactsSourceArr = {contactsSource, contactsSource2};
        $VALUES = contactsSourceArr;
        $ENTRIES = new asp(contactsSourceArr);
    }

    public ContactsSource() {
        throw null;
    }

    public static ContactsSource valueOf(String str) {
        return (ContactsSource) Enum.valueOf(ContactsSource.class, str);
    }

    public static ContactsSource[] values() {
        return (ContactsSource[]) $VALUES.clone();
    }
}
