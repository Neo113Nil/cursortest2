package com.vk.im.engine.models.dialogs;

import xsna.asp;
import xsna.lhg;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DialogsFilter.kt */
/* loaded from: classes2.dex */
public final class DialogsFilter {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DialogsFilter[] $VALUES;
    public static final DialogsFilter ARCHIVE;
    public static final DialogsFilter BUSINESS_NOTIFY;
    public static final DialogsFilter CHATS;
    public static final a Companion;
    public static final DialogsFilter MAIN;
    public static final DialogsFilter REQUESTS;
    public static final DialogsFilter UNREAD;
    private final int id;

    /* compiled from: DialogsFilter.kt */
    public static final class a {
        public static DialogsFilter a(int i) {
            DialogsFilter dialogsFilter;
            DialogsFilter[] values = DialogsFilter.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    dialogsFilter = null;
                    break;
                }
                dialogsFilter = values[i2];
                if (dialogsFilter.id == i) {
                    break;
                }
                i2++;
            }
            if (dialogsFilter != null) {
                return dialogsFilter;
            }
            throw new IllegalArgumentException(lhg.a(i, "Illegal id value: "));
        }
    }

    static {
        DialogsFilter dialogsFilter = new DialogsFilter("MAIN", 0, 0);
        MAIN = dialogsFilter;
        DialogsFilter dialogsFilter2 = new DialogsFilter("UNREAD", 1, 1);
        UNREAD = dialogsFilter2;
        DialogsFilter dialogsFilter3 = new DialogsFilter("REQUESTS", 2, 2);
        REQUESTS = dialogsFilter3;
        DialogsFilter dialogsFilter4 = new DialogsFilter("BUSINESS_NOTIFY", 3, 3);
        BUSINESS_NOTIFY = dialogsFilter4;
        DialogsFilter dialogsFilter5 = new DialogsFilter("CHATS", 4, 4);
        CHATS = dialogsFilter5;
        DialogsFilter dialogsFilter6 = new DialogsFilter("ARCHIVE", 5, 5);
        ARCHIVE = dialogsFilter6;
        DialogsFilter[] dialogsFilterArr = {dialogsFilter, dialogsFilter2, dialogsFilter3, dialogsFilter4, dialogsFilter5, dialogsFilter6};
        $VALUES = dialogsFilterArr;
        $ENTRIES = new asp(dialogsFilterArr);
        Companion = new a();
    }

    public DialogsFilter(String str, int i, int i2) {
        this.id = i2;
    }

    public static zrp<DialogsFilter> h() {
        return $ENTRIES;
    }

    public static DialogsFilter valueOf(String str) {
        return (DialogsFilter) Enum.valueOf(DialogsFilter.class, str);
    }

    public static DialogsFilter[] values() {
        return (DialogsFilter[]) $VALUES.clone();
    }

    public final int i() {
        return this.id;
    }
}
