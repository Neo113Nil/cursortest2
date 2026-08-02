package com.playtika.sharedsdk.shaded.okio;

import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InflaterSource.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\b\u0002\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0086\b¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"inflate", "Lcom/playtika/sharedsdk/shaded/okio/InflaterSource;", "Lcom/playtika/sharedsdk/shaded/okio/Source;", "inflater", "Ljava/util/zip/Inflater;", "Lcom/playtika/sharedsdk/shaded/okio/Inflater;", "(Lokio/Source;Ljava/util/zip/Inflater;)Lokio/InflaterSource;", "com.playtika.sharedsdk.shaded.okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* renamed from: com.playtika.sharedsdk.shaded.okio.-InflaterSourceExtensions, reason: invalid class name */
/* loaded from: classes8.dex */
public final class InflaterSourceExtensions {
    public static /* synthetic */ InflaterSource inflate$default(Source source, Inflater inflater, int i, Object obj) {
        if ((i & 1) != 0) {
            inflater = new Inflater();
        }
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }

    public static final InflaterSource inflate(Source source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }
}
