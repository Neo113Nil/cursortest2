package com.vk.im.engine.models.search;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchEntrypoint.kt */
/* loaded from: classes2.dex */
public final class SearchEntrypoint {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SearchEntrypoint[] $VALUES;
    public static final SearchEntrypoint CALLS;
    public static final SearchEntrypoint IM_SEARCH_CHATS;
    public static final SearchEntrypoint SEARCH_ARCHIVED_CHATS;
    public static final SearchEntrypoint SEARCH_CHATS;
    public static final SearchEntrypoint SEARCH_DIALOGS_COMPONENT;
    public static final SearchEntrypoint SEARCH_DIALOG_TO_SHARE;
    public static final SearchEntrypoint SEARCH_FILTER_ALL_DIALOGS;
    public static final SearchEntrypoint SEARCH_FILTER_ARCHIVE_DIALOGS;
    public static final SearchEntrypoint SEARCH_FILTER_BUSINESS_DIALOGS;
    public static final SearchEntrypoint SEARCH_FILTER_REQUESTS_DIALOGS;
    public static final SearchEntrypoint SEARCH_FILTER_UNREAD_DIALOGS;
    public static final SearchEntrypoint SEARCH_INVITE_DONS_TO_CHAT;
    public static final SearchEntrypoint SEARCH_INVITE_TO_CHAT;
    public static final SearchEntrypoint SEARCH_MSGS_IN_DIALOG;
    public static final SearchEntrypoint UNKNOWN;

    static {
        SearchEntrypoint searchEntrypoint = new SearchEntrypoint("IM_SEARCH_CHATS", 0);
        IM_SEARCH_CHATS = searchEntrypoint;
        SearchEntrypoint searchEntrypoint2 = new SearchEntrypoint("SEARCH_CHATS", 1);
        SEARCH_CHATS = searchEntrypoint2;
        SearchEntrypoint searchEntrypoint3 = new SearchEntrypoint("SEARCH_DIALOGS_COMPONENT", 2);
        SEARCH_DIALOGS_COMPONENT = searchEntrypoint3;
        SearchEntrypoint searchEntrypoint4 = new SearchEntrypoint("SEARCH_INVITE_TO_CHAT", 3);
        SEARCH_INVITE_TO_CHAT = searchEntrypoint4;
        SearchEntrypoint searchEntrypoint5 = new SearchEntrypoint("SEARCH_DIALOG_TO_SHARE", 4);
        SEARCH_DIALOG_TO_SHARE = searchEntrypoint5;
        SearchEntrypoint searchEntrypoint6 = new SearchEntrypoint("SEARCH_INVITE_DONS_TO_CHAT", 5);
        SEARCH_INVITE_DONS_TO_CHAT = searchEntrypoint6;
        SearchEntrypoint searchEntrypoint7 = new SearchEntrypoint("SEARCH_MSGS_IN_DIALOG", 6);
        SEARCH_MSGS_IN_DIALOG = searchEntrypoint7;
        SearchEntrypoint searchEntrypoint8 = new SearchEntrypoint("SEARCH_ARCHIVED_CHATS", 7);
        SEARCH_ARCHIVED_CHATS = searchEntrypoint8;
        SearchEntrypoint searchEntrypoint9 = new SearchEntrypoint("SEARCH_FILTER_UNREAD_DIALOGS", 8);
        SEARCH_FILTER_UNREAD_DIALOGS = searchEntrypoint9;
        SearchEntrypoint searchEntrypoint10 = new SearchEntrypoint("SEARCH_FILTER_REQUESTS_DIALOGS", 9);
        SEARCH_FILTER_REQUESTS_DIALOGS = searchEntrypoint10;
        SearchEntrypoint searchEntrypoint11 = new SearchEntrypoint("SEARCH_FILTER_BUSINESS_DIALOGS", 10);
        SEARCH_FILTER_BUSINESS_DIALOGS = searchEntrypoint11;
        SearchEntrypoint searchEntrypoint12 = new SearchEntrypoint("SEARCH_FILTER_ALL_DIALOGS", 11);
        SEARCH_FILTER_ALL_DIALOGS = searchEntrypoint12;
        SearchEntrypoint searchEntrypoint13 = new SearchEntrypoint("SEARCH_FILTER_ARCHIVE_DIALOGS", 12);
        SEARCH_FILTER_ARCHIVE_DIALOGS = searchEntrypoint13;
        SearchEntrypoint searchEntrypoint14 = new SearchEntrypoint("CALLS", 13);
        CALLS = searchEntrypoint14;
        SearchEntrypoint searchEntrypoint15 = new SearchEntrypoint(GrsBaseInfo.CountryCodeSource.UNKNOWN, 14);
        UNKNOWN = searchEntrypoint15;
        SearchEntrypoint[] searchEntrypointArr = {searchEntrypoint, searchEntrypoint2, searchEntrypoint3, searchEntrypoint4, searchEntrypoint5, searchEntrypoint6, searchEntrypoint7, searchEntrypoint8, searchEntrypoint9, searchEntrypoint10, searchEntrypoint11, searchEntrypoint12, searchEntrypoint13, searchEntrypoint14, searchEntrypoint15};
        $VALUES = searchEntrypointArr;
        $ENTRIES = new asp(searchEntrypointArr);
    }

    public SearchEntrypoint() {
        throw null;
    }

    public static SearchEntrypoint valueOf(String str) {
        return (SearchEntrypoint) Enum.valueOf(SearchEntrypoint.class, str);
    }

    public static SearchEntrypoint[] values() {
        return (SearchEntrypoint[]) $VALUES.clone();
    }
}
