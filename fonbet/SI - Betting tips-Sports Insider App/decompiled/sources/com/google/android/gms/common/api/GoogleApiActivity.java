package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import c6.c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.measurement.h0;
import e6.e;
import g6.v;
import io.sentry.android.core.w0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4457b = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f4458a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i5, int i10, Intent intent) {
        super.onActivityResult(i5, i10, intent);
        if (i5 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f4458a = 0;
            setResult(i10, intent);
            if (booleanExtra) {
                e e7 = e.e(this);
                if (i10 == -1) {
                    h0 h0Var = e7.f8705n;
                    h0Var.sendMessage(h0Var.obtainMessage(3));
                } else if (i10 == 0) {
                    e7.i(new ConnectionResult(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i5 == 2) {
            this.f4458a = 0;
            setResult(i10, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f4458a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f4458a = bundle.getInt("resolution");
        }
        if (this.f4458a == 1) {
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            w0.d("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            w0.d("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            v.h(num);
            c.f3657e.c(this, num.intValue(), this);
            this.f4458a = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f4458a = 1;
            } catch (ActivityNotFoundException e7) {
                e = e7;
                if (extras.getBoolean("notify_manager", true)) {
                    e.e(this).i(new ConnectionResult(22, null, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String obj = pendingIntent.toString();
                    String m6 = d9.e.m(new StringBuilder(obj.length() + 36), "Activity not found while launching ", obj, ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        m6 = m6.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    w0.e("GoogleApiActivity", m6, e);
                }
                googleApiActivity.f4458a = 1;
                finish();
            } catch (IntentSender.SendIntentException e9) {
                e = e9;
                w0.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } catch (ActivityNotFoundException e10) {
            e = e10;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f4458a);
        super.onSaveInstanceState(bundle);
    }
}
