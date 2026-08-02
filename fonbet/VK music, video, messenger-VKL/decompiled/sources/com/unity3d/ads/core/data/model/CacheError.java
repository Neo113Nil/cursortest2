package com.unity3d.ads.core.data.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CacheError.kt */
/* loaded from: classes14.dex */
public final class CacheError {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CacheError[] $VALUES;
    public static final CacheError FILE_IO_CREATE = new CacheError("FILE_IO_CREATE", 0);
    public static final CacheError FILE_IO_ERROR = new CacheError("FILE_IO_ERROR", 1);
    public static final CacheError FILE_NOT_FOUND = new CacheError("FILE_NOT_FOUND", 2);
    public static final CacheError FILE_ALREADY_CACHING = new CacheError("FILE_ALREADY_CACHING", 3);
    public static final CacheError NOT_CACHING = new CacheError("NOT_CACHING", 4);
    public static final CacheError JSON_ERROR = new CacheError("JSON_ERROR", 5);
    public static final CacheError NO_INTERNET = new CacheError("NO_INTERNET", 6);
    public static final CacheError MALFORMED_URL = new CacheError("MALFORMED_URL", 7);
    public static final CacheError NETWORK_ERROR = new CacheError("NETWORK_ERROR", 8);
    public static final CacheError ILLEGAL_STATE = new CacheError("ILLEGAL_STATE", 9);
    public static final CacheError INVALID_ARGUMENT = new CacheError("INVALID_ARGUMENT", 10);
    public static final CacheError UNSUPPORTED_ENCODING = new CacheError("UNSUPPORTED_ENCODING", 11);
    public static final CacheError FILE_STATE_WRONG = new CacheError("FILE_STATE_WRONG", 12);
    public static final CacheError CACHE_DIRECTORY_NULL = new CacheError("CACHE_DIRECTORY_NULL", 13);
    public static final CacheError CACHE_DIRECTORY_TYPE_NULL = new CacheError("CACHE_DIRECTORY_TYPE_NULL", 14);
    public static final CacheError CACHE_DIRECTORY_EXISTS = new CacheError("CACHE_DIRECTORY_EXISTS", 15);
    public static final CacheError CACHE_DIRECTORY_DOESNT_EXIST = new CacheError("CACHE_DIRECTORY_DOESNT_EXIST", 16);
    public static final CacheError UNKNOWN_ERROR = new CacheError("UNKNOWN_ERROR", 17);

    private static final /* synthetic */ CacheError[] $values() {
        return new CacheError[]{FILE_IO_CREATE, FILE_IO_ERROR, FILE_NOT_FOUND, FILE_ALREADY_CACHING, NOT_CACHING, JSON_ERROR, NO_INTERNET, MALFORMED_URL, NETWORK_ERROR, ILLEGAL_STATE, INVALID_ARGUMENT, UNSUPPORTED_ENCODING, FILE_STATE_WRONG, CACHE_DIRECTORY_NULL, CACHE_DIRECTORY_TYPE_NULL, CACHE_DIRECTORY_EXISTS, CACHE_DIRECTORY_DOESNT_EXIST, UNKNOWN_ERROR};
    }

    static {
        CacheError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private CacheError(String str, int i) {
    }

    public static zrp<CacheError> getEntries() {
        return $ENTRIES;
    }

    public static CacheError valueOf(String str) {
        return (CacheError) Enum.valueOf(CacheError.class, str);
    }

    public static CacheError[] values() {
        return (CacheError[]) $VALUES.clone();
    }
}
