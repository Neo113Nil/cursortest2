package com.google.protobuf;

import com.google.protobuf.Option;
import com.google.protobuf.OptionKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/OptionKt$Dsl;", "", "block", "Lcom/google/protobuf/Option;", "-initializeoption", "(Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/Option;", "option", "copy", "(Lcom/google/protobuf/Option;Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/Option;", "Lcom/google/protobuf/OptionOrBuilder;", "Lcom/google/protobuf/Any;", "getValueOrNull", "(Lcom/google/protobuf/OptionOrBuilder;)Lcom/google/protobuf/Any;", "valueOrNull", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OptionKtKt {
    @NotNull
    /* renamed from: -initializeoption, reason: not valid java name */
    public static final Option m45initializeoption(@NotNull Function1<? super OptionKt.Dsl, Unit> function1) {
        function1.getClass();
        OptionKt.Dsl.Companion companion = OptionKt.Dsl.INSTANCE;
        Option.Builder newBuilder = Option.newBuilder();
        newBuilder.getClass();
        OptionKt.Dsl _create = companion._create(newBuilder);
        function1.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final Option copy(@NotNull Option option, @NotNull Function1<? super OptionKt.Dsl, Unit> function1) {
        option.getClass();
        function1.getClass();
        OptionKt.Dsl.Companion companion = OptionKt.Dsl.INSTANCE;
        Option.Builder builder = option.toBuilder();
        builder.getClass();
        OptionKt.Dsl _create = companion._create(builder);
        function1.invoke(_create);
        return _create._build();
    }

    @Nullable
    public static final Any getValueOrNull(@NotNull OptionOrBuilder optionOrBuilder) {
        optionOrBuilder.getClass();
        if (optionOrBuilder.hasValue()) {
            return optionOrBuilder.getValue();
        }
        return null;
    }
}
