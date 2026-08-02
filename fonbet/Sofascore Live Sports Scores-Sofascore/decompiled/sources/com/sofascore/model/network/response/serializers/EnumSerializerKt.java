package com.sofascore.model.network.response.serializers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a#\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\u0010\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\b\u001a.\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0010\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\u0006\u001a%\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003\"\u0010\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\u00020\bH\u0086\b\u001a%\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003\"\u0010\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\u00020\bH\u0086\b\"-\u0010\u0007\u001a\u0004\u0018\u00010\b\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"enumSerializer", "Lkotlinx/serialization/KSerializer;", "T", "", "enumSerializerWithDefaultValue", "defaultValue", "(Ljava/lang/Enum;)Lkotlinx/serialization/KSerializer;", "serialName", "", "getSerialName", "(Ljava/lang/Enum;)Ljava/lang/String;", "enumByName", "enumBySerialName", "model_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EnumSerializerKt {
    public static final <T extends Enum<T>> Enum<?> enumByName(String str) {
        str.getClass();
        EnumCaches enumCaches = EnumCaches.INSTANCE;
        Intrinsics.h();
        throw null;
    }

    public static final <T extends Enum<T>> Enum<?> enumBySerialName(String str) {
        str.getClass();
        EnumCaches enumCaches = EnumCaches.INSTANCE;
        Intrinsics.h();
        throw null;
    }

    public static final <T extends Enum<T>> KSerializer enumSerializer() {
        Intrinsics.h();
        throw null;
    }

    public static final <T extends Enum<T>> KSerializer enumSerializerWithDefaultValue(T t) {
        t.getClass();
        Intrinsics.h();
        throw null;
    }

    @Nullable
    public static final <T extends Enum<T>> String getSerialName(@NotNull Enum<T> r1) {
        r1.getClass();
        return EnumCaches.INSTANCE.serialNameByEnum(r1);
    }
}
