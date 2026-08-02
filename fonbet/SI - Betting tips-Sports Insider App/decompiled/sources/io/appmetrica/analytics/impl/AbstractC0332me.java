package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.me, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0332me {

    /* renamed from: a, reason: collision with root package name */
    public final int f14259a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final int f14260b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f14261c = 1;

    public final int a(@Nullable Boolean bool) {
        if (bool == null) {
            return this.f14259a;
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return this.f14260b;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return this.f14261c;
        }
        throw new gf.m();
    }

    @Nullable
    public final Boolean a(int i5) {
        if (i5 == this.f14260b) {
            return Boolean.FALSE;
        }
        if (i5 == this.f14261c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
