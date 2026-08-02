package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.Job;

/* loaded from: classes6.dex */
public final class l<L extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w> {
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> a;
    public com.moloco.sdk.internal.ortb.model.B b;
    public C2803k c;
    public Job d;
    public boolean e;
    public String f;
    public String g;
    public boolean h;

    public l() {
        this(null, null, null, null, false, null, null, false, 255, null);
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> b) {
        this.a = b;
    }

    public final C2803k b() {
        return this.c;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.f;
    }

    public final com.moloco.sdk.internal.ortb.model.B e() {
        return this.b;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> f() {
        return this.a;
    }

    public final boolean g() {
        return this.h;
    }

    public final boolean h() {
        return this.e;
    }

    public l(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<L> b, com.moloco.sdk.internal.ortb.model.B b2, C2803k c2803k, Job job, boolean z, String str, String str2, boolean z2) {
        this.a = b;
        this.b = b2;
        this.c = c2803k;
        this.d = job;
        this.e = z;
        this.f = str;
        this.g = str2;
        this.h = z2;
    }

    public final void a(com.moloco.sdk.internal.ortb.model.B b) {
        this.b = b;
    }

    public final void b(boolean z) {
        this.e = z;
    }

    public final void a(C2803k c2803k) {
        this.c = c2803k;
    }

    public final void b(String str) {
        this.f = str;
    }

    public final Job a() {
        return this.d;
    }

    public final void a(Job job) {
        this.d = job;
    }

    public final void a(String str) {
        this.g = str;
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public /* synthetic */ l(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B b, com.moloco.sdk.internal.ortb.model.B b2, C2803k c2803k, Job job, boolean z, String str, String str2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : b, (i & 2) != 0 ? null : b2, (i & 4) != 0 ? null : c2803k, (i & 8) != 0 ? null : job, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? false : z2);
    }
}
