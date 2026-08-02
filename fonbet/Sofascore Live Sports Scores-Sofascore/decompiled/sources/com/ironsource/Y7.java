package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Y7 extends Throwable {

    @NotNull
    private final IronSourceError a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y7(@NotNull IronSourceError ironSourceError) {
        super(ironSourceError.getErrorMessage());
        ironSourceError.getClass();
        this.a = ironSourceError;
    }

    @NotNull
    public final IronSourceError a() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Y7.class.equals(obj.getClass())) {
            return false;
        }
        Y7 y7 = (Y7) obj;
        if (this.a.getErrorCode() != y7.a.getErrorCode()) {
            return false;
        }
        return Intrinsics.c(this.a.getErrorMessage(), y7.a.getErrorMessage());
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a.getErrorCode()), this.a.getErrorMessage());
    }
}
