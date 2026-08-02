package com.plaid.internal.core.crashreporting.internal.models;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/DebugImage;", "Ljava/io/Serializable;", "uuid", "", "type", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getUuid", "toString", "Companion", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugImage implements Serializable {

    @NotNull
    private static final String DEFAULT_TYPE = "proguard";

    @NotNull
    private final String type;

    @NotNull
    private final String uuid;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public DebugImage(@NotNull String uuid) {
        this(uuid, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(uuid, "uuid");
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    @NotNull
    public String toString() {
        return "DebugImage{uuid='" + this.uuid + "', type='" + this.type + "'}";
    }

    @JvmOverloads
    public DebugImage(@NotNull String uuid, @NotNull String type) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(type, "type");
        this.uuid = uuid;
        this.type = type;
    }

    public /* synthetic */ DebugImage(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "proguard" : str2);
    }
}
