package com.google.firebase.analytics;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdn;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.0.1 */
/* loaded from: classes6.dex */
public class GoogleAnalyticsServerPreviewActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzdn.zza(this).zza(getIntent());
        finish();
    }
}
