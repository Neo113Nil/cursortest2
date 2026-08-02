package com.braze.managers;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public final class j0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f592a = new j0();

    public static String a() {
        return "Unsupported type for map deserialization: " + Reflection.getOrCreateKotlinClass(Boolean.class).getSimpleName();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        return a();
    }
}
