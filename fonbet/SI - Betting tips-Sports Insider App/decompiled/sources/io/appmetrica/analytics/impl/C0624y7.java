package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.y7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624y7 {

    /* renamed from: a, reason: collision with root package name */
    public final Ia f14946a;

    /* renamed from: b, reason: collision with root package name */
    public String f14947b = "";

    public C0624y7(Ia ia2) {
        this.f14946a = ia2;
    }

    public final void a(String str, boolean z5) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || Intrinsics.areEqual(this.f14947b, str)) {
                return;
            }
            this.f14947b = str;
            this.f14946a.a(str, z5);
        }
    }
}
