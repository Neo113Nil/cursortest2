package ru.ozon.tracker.sendEvent;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0010\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/tracker/sendEvent/ResponseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "responseCode", "", "message", "", "<init>", "(ILjava/lang/String;)V", "getResponseCode", "()I", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class ResponseException extends Exception {
    private final int responseCode;

    public ResponseException(int i11, String str) {
        super(str);
        this.responseCode = i11;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }
}
