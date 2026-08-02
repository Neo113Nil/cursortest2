package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2829i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {
    public static final int b = 8;
    public final C2829i a;

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final C2829i a() {
        return this.a;
    }

    public final C2829i b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.a, ((c) obj).a);
    }

    public int hashCode() {
        C2829i c2829i = this.a;
        if (c2829i == null) {
            return 0;
        }
        return c2829i.hashCode();
    }

    public String toString() {
        return "MraidAdData(dec=" + this.a + ')';
    }

    public c(C2829i c2829i) {
        this.a = c2829i;
    }

    public final c a(C2829i c2829i) {
        return new c(c2829i);
    }

    public static /* synthetic */ c a(c cVar, C2829i c2829i, int i, Object obj) {
        if ((i & 1) != 0) {
            c2829i = cVar.a;
        }
        return cVar.a(c2829i);
    }

    public /* synthetic */ c(C2829i c2829i, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c2829i);
    }
}
