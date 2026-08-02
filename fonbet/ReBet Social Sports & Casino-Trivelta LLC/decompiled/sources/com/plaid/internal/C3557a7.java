package com.plaid.internal;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nSharedPreferencesBackedFeatureStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesBackedFeatureStore.kt\ncom/plaid/core/features/SharedPreferencesBackedFeatureStore\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1855#2,2:77\n1855#2,2:79\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesBackedFeatureStore.kt\ncom/plaid/core/features/SharedPreferencesBackedFeatureStore\n*L\n22#1:77,2\n23#1:79,2\n*E\n"})
/* renamed from: com.plaid.internal.a7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3557a7 extends AbstractC3606d1 {
    public C3557a7(@NotNull SharedPreferences overridePreferences, @NotNull SharedPreferences serverFlagPreferences) {
        Intrinsics.checkNotNullParameter(overridePreferences, "overridePreferences");
        Intrinsics.checkNotNullParameter(serverFlagPreferences, "serverFlagPreferences");
    }
}
