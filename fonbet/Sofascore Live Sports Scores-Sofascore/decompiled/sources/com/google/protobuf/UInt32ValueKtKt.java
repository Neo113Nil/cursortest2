package com.google.protobuf;

import com.google.protobuf.UInt32Value;
import com.google.protobuf.UInt32ValueKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/UInt32ValueKt$Dsl;", "", "block", "Lcom/google/protobuf/UInt32Value;", "-initializeuInt32Value", "(Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/UInt32Value;", "uInt32Value", "copy", "(Lcom/google/protobuf/UInt32Value;Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/UInt32Value;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UInt32ValueKtKt {
    @NotNull
    /* renamed from: -initializeuInt32Value, reason: not valid java name */
    public static final UInt32Value m51initializeuInt32Value(@NotNull Function1<? super UInt32ValueKt.Dsl, Unit> function1) {
        function1.getClass();
        UInt32ValueKt.Dsl.Companion companion = UInt32ValueKt.Dsl.INSTANCE;
        UInt32Value.Builder newBuilder = UInt32Value.newBuilder();
        newBuilder.getClass();
        UInt32ValueKt.Dsl _create = companion._create(newBuilder);
        function1.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final UInt32Value copy(@NotNull UInt32Value uInt32Value, @NotNull Function1<? super UInt32ValueKt.Dsl, Unit> function1) {
        uInt32Value.getClass();
        function1.getClass();
        UInt32ValueKt.Dsl.Companion companion = UInt32ValueKt.Dsl.INSTANCE;
        UInt32Value.Builder builder = uInt32Value.toBuilder();
        builder.getClass();
        UInt32ValueKt.Dsl _create = companion._create(builder);
        function1.invoke(_create);
        return _create._build();
    }
}
