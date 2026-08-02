package com.facebook;

import T7.C1674n;
import T7.M;
import T7.Y;
import Y7.a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import b8.InterfaceC2410a;
import d8.r;
import g6.C4331C;
import g6.C4357q;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z6.AbstractC6933c;
import z6.AbstractC6934d;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\f\b\u0016\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0003R(\u0010\u001f\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b¨\u0006\""}, d2 = {"Lcom/facebook/FacebookActivity;", "Landroidx/fragment/app/s;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/fragment/app/Fragment;", "z", "()Landroidx/fragment/app/Fragment;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "prefix", "Ljava/io/FileDescriptor;", "fd", "Ljava/io/PrintWriter;", "writer", "", "args", "dump", "(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "A", "<set-?>", "f", "Landroidx/fragment/app/Fragment;", "y", "currentFragment", "g", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class FacebookActivity extends AbstractActivityC2168s {

    /* renamed from: h, reason: collision with root package name */
    public static final String f30289h = FacebookActivity.class.getName();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Fragment currentFragment;

    public final void A() {
        Intent requestIntent = getIntent();
        M m10 = M.f11009a;
        Intrinsics.checkNotNullExpressionValue(requestIntent, "requestIntent");
        C4357q t10 = M.t(M.y(requestIntent));
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        setResult(0, M.n(intent, null, t10));
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void dump(String prefix, FileDescriptor fd2, PrintWriter writer, String[] args) {
        if (a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(writer, "writer");
            InterfaceC2410a.f25005a.a();
            if (Intrinsics.areEqual((Object) null, Boolean.TRUE)) {
                return;
            }
            super.dump(prefix, fd2, writer, args);
        } catch (Throwable th2) {
            a.b(th2, this);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Fragment fragment = this.currentFragment;
        if (fragment == null) {
            return;
        }
        fragment.onConfigurationChanged(newConfig);
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        if (!C4331C.G()) {
            Y y10 = Y.f11042a;
            Y.k0(f30289h, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            C4331C.N(applicationContext);
        }
        setContentView(AbstractC6934d.f68606a);
        if (Intrinsics.areEqual("PassThrough", intent.getAction())) {
            A();
        } else {
            this.currentFragment = z();
        }
    }

    /* renamed from: y, reason: from getter */
    public final Fragment getCurrentFragment() {
        return this.currentFragment;
    }

    public Fragment z() {
        Intent intent = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        Fragment p02 = supportFragmentManager.p0("SingleFragment");
        if (p02 != null) {
            return p02;
        }
        if (Intrinsics.areEqual("FacebookDialogFragment", intent.getAction())) {
            C1674n c1674n = new C1674n();
            c1674n.setRetainInstance(true);
            c1674n.show(supportFragmentManager, "SingleFragment");
            return c1674n;
        }
        r rVar = new r();
        rVar.setRetainInstance(true);
        supportFragmentManager.s().c(AbstractC6933c.f68602c, rVar, "SingleFragment").h();
        return rVar;
    }
}
