package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MolocoAdError;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class s {
    public static final int d = 8;
    public final MolocoAdError a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b;
    public final Map<String, String> c;

    public s(MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c subErrorType, Map<String, String> details) {
        Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        Intrinsics.checkNotNullParameter(subErrorType, "subErrorType");
        Intrinsics.checkNotNullParameter(details, "details");
        this.a = molocoAdError;
        this.b = subErrorType;
        this.c = details;
    }

    public final MolocoAdError a() {
        return this.a;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b() {
        return this.b;
    }

    public final Map<String, String> c() {
        return this.c;
    }

    public final Map<String, String> d() {
        return this.c;
    }

    public final MolocoAdError e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.areEqual(this.a, sVar.a) && Intrinsics.areEqual(this.b, sVar.b) && Intrinsics.areEqual(this.c, sVar.c);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f() {
        return this.b;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "MolocoInternalAdError(molocoAdError=" + this.a + ", subErrorType=" + this.b + ", details=" + this.c + ')';
    }

    public final s a(MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c subErrorType, Map<String, String> details) {
        Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        Intrinsics.checkNotNullParameter(subErrorType, "subErrorType");
        Intrinsics.checkNotNullParameter(details, "details");
        return new s(molocoAdError, subErrorType, details);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ s a(s sVar, MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            molocoAdError = sVar.a;
        }
        if ((i & 2) != 0) {
            cVar = sVar.b;
        }
        if ((i & 4) != 0) {
            map = sVar.c;
        }
        return sVar.a(molocoAdError, cVar, map);
    }

    public /* synthetic */ s(MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(molocoAdError, cVar, (i & 4) != 0 ? MapsKt.emptyMap() : map);
    }
}
