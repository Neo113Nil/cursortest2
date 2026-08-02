package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdShowListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.Job;

/* loaded from: classes6.dex */
public final class u<T extends AdShowListener> {
    public static final int f = 8;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> a;
    public com.moloco.sdk.internal.ortb.model.B b;
    public C2803k c;
    public Job d;
    public z e;

    public u() {
        this(null, null, null, null, null, 31, null);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> a() {
        return this.a;
    }

    public final Job b() {
        return this.d;
    }

    public final C2803k c() {
        return this.c;
    }

    public final z d() {
        return this.e;
    }

    public final com.moloco.sdk.internal.ortb.model.B e() {
        return this.b;
    }

    public u(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> lVar, com.moloco.sdk.internal.ortb.model.B b, C2803k c2803k, Job job, z zVar) {
        this.a = lVar;
        this.b = b;
        this.c = c2803k;
        this.d = job;
        this.e = zVar;
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<?, ?> lVar) {
        this.a = lVar;
    }

    public final void a(com.moloco.sdk.internal.ortb.model.B b) {
        this.b = b;
    }

    public final void a(C2803k c2803k) {
        this.c = c2803k;
    }

    public final void a(Job job) {
        this.d = job;
    }

    public final void a(z zVar) {
        this.e = zVar;
    }

    public /* synthetic */ u(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVar, com.moloco.sdk.internal.ortb.model.B b, C2803k c2803k, Job job, z zVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : lVar, (i & 2) != 0 ? null : b, (i & 4) != 0 ? null : c2803k, (i & 8) != 0 ? null : job, (i & 16) != 0 ? null : zVar);
    }
}
