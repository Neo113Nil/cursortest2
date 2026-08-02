package io.ktor.util.collections;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MapDelegates.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class MapDelegatesKt$asBoolean$1 extends FunctionReferenceImpl implements Function1<Boolean, String> {
    public static final MapDelegatesKt$asBoolean$1 INSTANCE = new MapDelegatesKt$asBoolean$1();

    MapDelegatesKt$asBoolean$1() {
        super(1, Boolean.TYPE, "toString", "toString()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ String invoke(Boolean bool) {
        return invoke(bool.booleanValue());
    }

    public final String invoke(boolean z) {
        return String.valueOf(z);
    }
}
