package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.services.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class f {
    public static final int c = 0;
    public final z a;
    public final Integer b;

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final z a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public final Integer c() {
        return this.b;
    }

    public final z d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && Intrinsics.areEqual(this.b, fVar.b);
    }

    public int hashCode() {
        z zVar = this.a;
        int hashCode = (zVar == null ? 0 : zVar.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AudioSignal(muteSwitchState=" + this.a + ", mediaVolume=" + this.b + ')';
    }

    public f(z zVar, Integer num) {
        this.a = zVar;
        this.b = num;
    }

    public final f a(z zVar, Integer num) {
        return new f(zVar, num);
    }

    public static /* synthetic */ f a(f fVar, z zVar, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            zVar = fVar.a;
        }
        if ((i & 2) != 0) {
            num = fVar.b;
        }
        return fVar.a(zVar, num);
    }

    public /* synthetic */ f(z zVar, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : zVar, (i & 2) != 0 ? null : num);
    }
}
