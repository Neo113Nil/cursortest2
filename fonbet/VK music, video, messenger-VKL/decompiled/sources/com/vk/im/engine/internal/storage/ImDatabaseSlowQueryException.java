package com.vk.im.engine.internal.storage;

import xsna.i5s;
import xsna.rqi;

/* compiled from: ImDatabaseLogger.kt */
/* loaded from: classes2.dex */
public final class ImDatabaseSlowQueryException extends IllegalStateException {
    private final String kind;
    private final String query;
    private final long timeMs;

    public ImDatabaseSlowQueryException(String str, String str2, long j) {
        super(i5s.a(rqi.d(j, "Slow ", str2, " query ("), " ms): ", str));
        this.query = str;
        this.kind = str2;
        this.timeMs = j;
    }
}
