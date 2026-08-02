package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.login.LoginFragment;
import com.sofascore.results.R;
import defpackage.cw3;
import defpackage.fp8;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/FacebookActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class FacebookActivity extends FragmentActivity {
    public static final /* synthetic */ int i = 0;
    public Fragment h;

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            str.getClass();
            printWriter.getClass();
            super.dump(str, fileDescriptor, printWriter, strArr);
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.h;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment, com.facebook.internal.FacebookDialogFragment] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        LoginFragment loginFragment;
        q qVar;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!w.q.get()) {
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            synchronized (w.class) {
                w.j(applicationContext);
            }
        }
        setContentView(R.layout.com_facebook_activity_layout);
        if (!"PassThrough".equals(intent.getAction())) {
            Intent intent2 = getIntent();
            fp8 k = k();
            Fragment F = k.F("SingleFragment");
            if (F == null) {
                if ("FacebookDialogFragment".equals(intent2.getAction())) {
                    ?? facebookDialogFragment = new FacebookDialogFragment();
                    facebookDialogFragment.setRetainInstance(true);
                    facebookDialogFragment.p(k, "SingleFragment");
                    loginFragment = facebookDialogFragment;
                } else {
                    LoginFragment loginFragment2 = new LoginFragment();
                    loginFragment2.setRetainInstance(true);
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(k);
                    aVar.i(R.id.com_facebook_fragment_container, loginFragment2, "SingleFragment", 1);
                    aVar.f();
                    loginFragment = loginFragment2;
                }
                F = loginFragment;
            }
            this.h = F;
            return;
        }
        Intent intent3 = getIntent();
        intent3.getClass();
        Bundle j = com.facebook.internal.d0.j(intent3);
        if (!cw3.a.contains(com.facebook.internal.d0.class) && j != null) {
            try {
                String string = j.getString("error_type");
                if (string == null) {
                    string = j.getString("com.facebook.platform.status.ERROR_TYPE");
                }
                String string2 = j.getString("error_description");
                if (string2 == null) {
                    string2 = j.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
                }
                qVar = (string == null || !string.equalsIgnoreCase("UserCanceled")) ? new q(string2) : new s(string2);
            } catch (Throwable th) {
                cw3.a(com.facebook.internal.d0.class, th);
            }
            Intent intent4 = getIntent();
            intent4.getClass();
            setResult(0, com.facebook.internal.d0.f(intent4, null, qVar));
            finish();
        }
        qVar = null;
        Intent intent42 = getIntent();
        intent42.getClass();
        setResult(0, com.facebook.internal.d0.f(intent42, null, qVar));
        finish();
    }
}
