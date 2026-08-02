package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzez;
import defpackage.kzn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class GoogleAnalyticsServerPreviewActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzez f = zzez.f(this, null);
        Intent intent = getIntent();
        f.getClass();
        f.c(new kzn(f, intent, 2));
        finish();
    }
}
