package ru.sberdevices.salutevision.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lru/sberdevices/salutevision/core/SaluteVisionError;", "", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "Initialize", "ModelNotFound", "None", "Lru/sberdevices/salutevision/core/SaluteVisionError$Initialize;", "Lru/sberdevices/salutevision/core/SaluteVisionError$ModelNotFound;", "Lru/sberdevices/salutevision/core/SaluteVisionError$None;", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SaluteVisionError {

    @NotNull
    private final String message;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/sberdevices/salutevision/core/SaluteVisionError$Initialize;", "Lru/sberdevices/salutevision/core/SaluteVisionError;", "message", "", "(Ljava/lang/String;)V", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Initialize extends SaluteVisionError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialize(@NotNull String message) {
            super(message, null);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/sberdevices/salutevision/core/SaluteVisionError$ModelNotFound;", "Lru/sberdevices/salutevision/core/SaluteVisionError;", "message", "", "(Ljava/lang/String;)V", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ModelNotFound extends SaluteVisionError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ModelNotFound(@NotNull String message) {
            super(message, null);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/sberdevices/salutevision/core/SaluteVisionError$None;", "Lru/sberdevices/salutevision/core/SaluteVisionError;", "()V", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class None extends SaluteVisionError {

        @NotNull
        public static final None INSTANCE = new None();

        /* JADX WARN: Multi-variable type inference failed */
        private None() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ SaluteVisionError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    private SaluteVisionError(String str) {
        this.message = str;
    }

    public /* synthetic */ SaluteVisionError(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, null);
    }
}
