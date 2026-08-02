package com.unity3d.ads.core.data.model;

import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/data/model/CacheError;", "", "<init>", "(Ljava/lang/String;I)V", "FILE_IO_CREATE", "FILE_IO_ERROR", "FILE_NOT_FOUND", "FILE_ALREADY_CACHING", "NOT_CACHING", "JSON_ERROR", "NO_INTERNET", "MALFORMED_URL", "NETWORK_ERROR", "ILLEGAL_STATE", "INVALID_ARGUMENT", "UNSUPPORTED_ENCODING", "FILE_STATE_WRONG", "CACHE_DIRECTORY_NULL", "CACHE_DIRECTORY_TYPE_NULL", "CACHE_DIRECTORY_EXISTS", "CACHE_DIRECTORY_DOESNT_EXIST", "UNKNOWN_ERROR", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CacheError {
    private static final /* synthetic */ jp5 $ENTRIES;
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
        $ENTRIES = gz8.G($values);
    }

    private CacheError(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static CacheError valueOf(String str) {
        return (CacheError) Enum.valueOf(CacheError.class, str);
    }

    public static CacheError[] values() {
        return (CacheError[]) $VALUES.clone();
    }
}
