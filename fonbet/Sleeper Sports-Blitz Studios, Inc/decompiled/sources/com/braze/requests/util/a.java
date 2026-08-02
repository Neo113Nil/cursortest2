package com.braze.requests.util;

import android.content.Context;
import com.braze.storage.j1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final j1 f679a;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f679a = new j1(context);
    }

    public static String a(String str) {
        return "uri-at-" + str.hashCode();
    }

    public static String b(String str) {
        return "uri-" + str.hashCode();
    }
}
