package com.sports.insider.ui.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.view.h0;
import com.sports.insider.MyApp;
import e.j;
import eg.c0;
import io.sentry.android.core.internal.gestures.c;
import io.sentry.util.network.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rc.b0;
import rc.g;
import zc.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sports/insider/ui/activities/SplashActivity;", "Le/j;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SuppressLint({"CustomSplashScreen"})
@SourceDebugExtension({"SMAP\nSplashActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashActivity.kt\ncom/sports/insider/ui/activities/SplashActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"})
/* loaded from: classes.dex */
public final class SplashActivity extends j {

    /* renamed from: u, reason: collision with root package name */
    public boolean f6900u = true;

    @Override // e.j, c0.f, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            b bVar = i5 >= 31 ? new n0.b(this) : new b(this);
            bVar.h();
            c condition = new c(15, this);
            Intrinsics.checkNotNullParameter(condition, "condition");
            bVar.l(condition);
        }
        super.onCreate(bundle);
        Context context = getBaseContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        if (i5 <= 29) {
            try {
                c0.t(MyApp.f6830c, null, null, new ac.c(context, null, 1), 3);
            } catch (Exception e7) {
                d.b(4, "updateImageLoader", e7);
            }
        }
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        try {
            c0.t(MyApp.f6830c, null, null, new bd.b(2, null, 20), 3);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        Bundle extras;
        super.onStart();
        this.f6900u = false;
        c0.t(MyApp.f6830c, b0.b(), null, new rc.c(new g(), null, 12), 2);
        h0.k(this);
        Intent intent = new Intent();
        Intent intent2 = getIntent();
        if (intent2 != null && (extras = intent2.getExtras()) != null) {
            intent.putExtras(extras);
        }
        intent.setFlags(872448000);
        intent.setClass(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        h0.k(this);
    }
}
