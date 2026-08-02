package com.google.protobuf;

import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/TimestampKt$Dsl;", "", "block", "Lcom/google/protobuf/Timestamp;", "-initializetimestamp", "(Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/Timestamp;", "timestamp", "copy", "(Lcom/google/protobuf/Timestamp;Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/Timestamp;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TimestampKtKt {
    @NotNull
    /* renamed from: -initializetimestamp, reason: not valid java name */
    public static final Timestamp m49initializetimestamp(@NotNull Function1<? super TimestampKt.Dsl, Unit> function1) {
        function1.getClass();
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.INSTANCE;
        Timestamp.Builder newBuilder = Timestamp.newBuilder();
        newBuilder.getClass();
        TimestampKt.Dsl _create = companion._create(newBuilder);
        function1.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final Timestamp copy(@NotNull Timestamp timestamp, @NotNull Function1<? super TimestampKt.Dsl, Unit> function1) {
        timestamp.getClass();
        function1.getClass();
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.INSTANCE;
        Timestamp.Builder builder = timestamp.toBuilder();
        builder.getClass();
        TimestampKt.Dsl _create = companion._create(builder);
        function1.invoke(_create);
        return _create._build();
    }
}
