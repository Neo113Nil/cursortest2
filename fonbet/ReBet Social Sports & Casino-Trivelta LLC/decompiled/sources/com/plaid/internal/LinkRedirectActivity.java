package com.plaid.internal;

import Ph.AbstractC1459k;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.U;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import m.AbstractActivityC5481c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/plaid/internal/LinkRedirectActivity;", "Lm/c;", "<init>", "()V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLinkRedirectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkRedirectActivity.kt\ncom/plaid/internal/LinkRedirectActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,21:1\n75#2,13:22\n*S KotlinDebug\n*F\n+ 1 LinkRedirectActivity.kt\ncom/plaid/internal/LinkRedirectActivity\n*L\n12#1:22,13\n*E\n"})
/* loaded from: classes3.dex */
public final class LinkRedirectActivity extends AbstractActivityC5481c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.lifecycle.T f39349a = new androidx.lifecycle.T(Reflection.getOrCreateKotlinClass(K2.class), new b(), new a(), new c());

    @SourceDebugExtension({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2\n*L\n1#1,90:1\n*E\n"})
    public static final class a extends Lambda implements Function0<U.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final U.c invoke() {
            return LinkRedirectActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    @SourceDebugExtension({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$3\n*L\n1#1,90:1\n*E\n"})
    public static final class b extends Lambda implements Function0<androidx.lifecycle.V> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.V invoke() {
            return LinkRedirectActivity.this.getViewModelStore();
        }
    }

    @SourceDebugExtension({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$4\n*L\n1#1,90:1\n*E\n"})
    public static final class c extends Lambda implements Function0<X0.a> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final X0.a invoke() {
            return LinkRedirectActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        K2 k22 = (K2) this.f39349a.getValue();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        k22.getClass();
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(this, "activity");
        AbstractC1459k.d(androidx.lifecycle.S.a(k22), null, null, new J2(this, K2.a(intent.getData()), null), 3, null);
        finish();
    }
}
