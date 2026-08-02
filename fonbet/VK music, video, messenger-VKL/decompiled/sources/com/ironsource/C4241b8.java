package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;
import xsna.epx;

/* renamed from: com.ironsource.b8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4241b8 extends Throwable {
    private final IronSourceError a;

    public C4241b8(IronSourceError ironSourceError) {
        super(ironSourceError.getErrorMessage());
        this.a = ironSourceError;
    }

    public final IronSourceError a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C4241b8.class.equals(obj.getClass())) {
            return false;
        }
        C4241b8 c4241b8 = (C4241b8) obj;
        if (this.a.getErrorCode() != c4241b8.a.getErrorCode()) {
            return false;
        }
        return epx.f(this.a.getErrorMessage(), c4241b8.a.getErrorMessage());
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a.getErrorCode()), this.a.getErrorMessage());
    }
}
