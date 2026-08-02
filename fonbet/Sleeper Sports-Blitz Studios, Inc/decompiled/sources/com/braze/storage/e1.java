package com.braze.storage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public final class e1 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e1 f698a = new e1();

    public static String a() {
        return "Unsupported type for map deserialization: " + Reflection.getOrCreateKotlinClass(Long.class).getSimpleName();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        return a();
    }
}
