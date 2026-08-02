package com.braze.managers;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f612a;
    public final long b;

    public w0(String id, long j) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f612a = id;
        this.b = j;
    }

    public final String a() {
        return this.f612a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return Intrinsics.areEqual(this.f612a, w0Var.f612a) && this.b == w0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f612a.hashCode() * 31);
    }

    public final String toString() {
        return "CampaignData(id=" + this.f612a + ", timestamp=" + this.b + ")";
    }
}
