package com.plaid.internal;

import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m.AbstractActivityC5481c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nOutOfProcessClosedDetectingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutOfProcessClosedDetectingActivity.kt\ncom/plaid/androidutils/OutOfProcessClosedDetectingActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
/* renamed from: com.plaid.internal.t4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractActivityC3752t4 extends AbstractActivityC5481c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public a f41091a = a.C0588a.f41093a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f41092b;

    /* renamed from: com.plaid.internal.t4$a */
    public static abstract class a {

        /* renamed from: com.plaid.internal.t4$a$a, reason: collision with other inner class name */
        public static final class C0588a extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0588a f41093a = new C0588a();
        }

        /* renamed from: com.plaid.internal.t4$a$b */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public final Intent f41094a;

            public b(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                this.f41094a = intent;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.f41094a, ((b) obj).f41094a);
            }

            public final int hashCode() {
                return this.f41094a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "OnCreate(intent=" + this.f41094a + ")";
            }
        }

        /* renamed from: com.plaid.internal.t4$a$c */
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @Nullable
            public final Intent f41095a;

            public c(@Nullable Intent intent) {
                this.f41095a = intent;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.f41095a, ((c) obj).f41095a);
            }

            public final int hashCode() {
                Intent intent = this.f41095a;
                if (intent == null) {
                    return 0;
                }
                return intent.hashCode();
            }

            @NotNull
            public final String toString() {
                return "OnNewIntent(intent=" + this.f41095a + ")";
            }
        }
    }

    public abstract void a(@Nullable Intent intent);

    @Override // androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f41092b = bundle.getBoolean("outOfProcessActivityLaunched", false);
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        this.f41091a = new a.b(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        this.f41091a = new a.c(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onResume() {
        super.onResume();
        a aVar = this.f41091a;
        if (this.f41092b) {
            this.f41092b = false;
            if (Intrinsics.areEqual(aVar, a.C0588a.f41093a)) {
                Intent intent = new Intent();
                intent.putExtra("link_out_of_process_closed_redirect_uri", true);
                aVar = new a.c(intent);
            } else if (aVar instanceof a.b) {
                ((a.b) aVar).f41094a.putExtra("link_out_of_process_closed_redirect_uri", true);
            }
        }
        this.f41091a = a.C0588a.f41093a;
        if (aVar instanceof a.C0588a) {
            return;
        }
        if (aVar instanceof a.b) {
            a(((a.b) aVar).f41094a);
        } else if (aVar instanceof a.c) {
            a(((a.c) aVar).f41095a);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public final void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("outOfProcessActivityLaunched", this.f41092b);
    }
}
