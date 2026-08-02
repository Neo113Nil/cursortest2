package io.ktor.util.collections;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MapDelegates.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class MapDelegatesKt$asBoolean$2 extends FunctionReferenceImpl implements Function1<String, Boolean> {
    public static final MapDelegatesKt$asBoolean$2 INSTANCE = new MapDelegatesKt$asBoolean$2();

    MapDelegatesKt$asBoolean$2() {
        super(1, StringsKt.class, "toBoolean", "toBoolean(Ljava/lang/String;)Z", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(Boolean.parseBoolean(p0));
    }
}
