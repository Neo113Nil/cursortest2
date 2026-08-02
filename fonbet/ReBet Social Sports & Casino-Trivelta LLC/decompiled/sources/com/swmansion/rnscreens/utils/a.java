package com.swmansion.rnscreens.utils;

import dd.C4054a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0600a f42060c = new C0600a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final a f42061d = new a(new C4054a(Integer.MIN_VALUE, false), 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final C4054a f42062a;

    /* renamed from: b, reason: collision with root package name */
    public final float f42063b;

    /* renamed from: com.swmansion.rnscreens.utils.a$a, reason: collision with other inner class name */
    public static final class C0600a {
        public /* synthetic */ C0600a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f42061d;
        }

        public C0600a() {
        }
    }

    public a(C4054a cacheKey, float f10) {
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        this.f42062a = cacheKey;
        this.f42063b = f10;
    }

    public final float b() {
        return this.f42063b;
    }

    public final boolean c(C4054a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f42062a.a() != Integer.MIN_VALUE && Intrinsics.areEqual(this.f42062a, key);
    }
}
