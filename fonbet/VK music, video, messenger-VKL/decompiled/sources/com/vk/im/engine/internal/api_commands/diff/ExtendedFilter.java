package com.vk.im.engine.internal.api_commands.diff;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExtendedFilter.kt */
/* loaded from: classes2.dex */
public final class ExtendedFilter {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ExtendedFilter[] $VALUES;
    public static final ExtendedFilter CHANGED_OBJECTS;
    public static final ExtendedFilter CONTACTS;
    public static final ExtendedFilter COUNTERS;
    public static final ExtendedFilter CREDENTIALS;
    public static final ExtendedFilter FOLDERS;
    public static final ExtendedFilter FOLDERS_WITH_PEERS;
    public static final ExtendedFilter GROUPS;
    public static final ExtendedFilter MESSAGES;
    public static final ExtendedFilter PROFILES;
    public static final ExtendedFilter SERVER_TIME;
    public static final ExtendedFilter SERVER_VERSION;
    private final String apiValue;

    static {
        ExtendedFilter extendedFilter = new ExtendedFilter("PROFILES", 0, "profiles");
        PROFILES = extendedFilter;
        ExtendedFilter extendedFilter2 = new ExtendedFilter("CONTACTS", 1, "contacts");
        CONTACTS = extendedFilter2;
        ExtendedFilter extendedFilter3 = new ExtendedFilter("GROUPS", 2, "groups");
        GROUPS = extendedFilter3;
        ExtendedFilter extendedFilter4 = new ExtendedFilter("COUNTERS", 3, "counters");
        COUNTERS = extendedFilter4;
        ExtendedFilter extendedFilter5 = new ExtendedFilter("FOLDERS", 4, "folders");
        FOLDERS = extendedFilter5;
        ExtendedFilter extendedFilter6 = new ExtendedFilter("FOLDERS_WITH_PEERS", 5, "folders_with_peers");
        FOLDERS_WITH_PEERS = extendedFilter6;
        ExtendedFilter extendedFilter7 = new ExtendedFilter("MESSAGES", 6, "messages");
        MESSAGES = extendedFilter7;
        ExtendedFilter extendedFilter8 = new ExtendedFilter("SERVER_VERSION", 7, "server_version");
        SERVER_VERSION = extendedFilter8;
        ExtendedFilter extendedFilter9 = new ExtendedFilter("SERVER_TIME", 8, "server_time");
        SERVER_TIME = extendedFilter9;
        ExtendedFilter extendedFilter10 = new ExtendedFilter("CREDENTIALS", 9, "credentials");
        CREDENTIALS = extendedFilter10;
        ExtendedFilter extendedFilter11 = new ExtendedFilter("CHANGED_OBJECTS", 10, "changed_objects");
        CHANGED_OBJECTS = extendedFilter11;
        ExtendedFilter[] extendedFilterArr = {extendedFilter, extendedFilter2, extendedFilter3, extendedFilter4, extendedFilter5, extendedFilter6, extendedFilter7, extendedFilter8, extendedFilter9, extendedFilter10, extendedFilter11};
        $VALUES = extendedFilterArr;
        $ENTRIES = new asp(extendedFilterArr);
    }

    public ExtendedFilter(String str, int i, String str2) {
        this.apiValue = str2;
    }

    public static ExtendedFilter valueOf(String str) {
        return (ExtendedFilter) Enum.valueOf(ExtendedFilter.class, str);
    }

    public static ExtendedFilter[] values() {
        return (ExtendedFilter[]) $VALUES.clone();
    }

    public final String h() {
        return this.apiValue;
    }
}
