package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.a8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2327a8 extends Throwable {
    private final IronSourceError a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2327a8(IronSourceError error) {
        super(error.getErrorMessage());
        Intrinsics.checkNotNullParameter(error, "error");
        this.a = error;
    }

    public final IronSourceError a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(C2327a8.class, obj.getClass())) {
            return false;
        }
        C2327a8 c2327a8 = (C2327a8) obj;
        if (this.a.getErrorCode() != c2327a8.a.getErrorCode()) {
            return false;
        }
        return Intrinsics.areEqual(this.a.getErrorMessage(), c2327a8.a.getErrorMessage());
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a.getErrorCode()), this.a.getErrorMessage());
    }
}
