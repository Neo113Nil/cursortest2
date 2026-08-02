package com.braintreepayments.browserswitch;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import com.playtika.pras.a.a;
import com.playtika.pras.a.b;
import com.playtika.pras.a.c;
import com.playtika.pras.a.g;
import com.playtika.pras.a.h;
import com.playtika.pras.a.l;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Arrays;
import org.json.JSONException;

/* loaded from: classes7.dex */
public class BrowserSwitchActivity extends Activity {
    public final b a = new b(new c(true), new a(), null);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch("com.braintree", me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b bVar = this.a;
        Intent intent = getIntent();
        bVar.getClass();
        if (intent != null) {
            Uri data = intent.getData();
            h a = g.a(this);
            if (a != null && data != null) {
                a.a = data;
                a.b = "SUCCESS";
                try {
                    l.a(this, a.a());
                } catch (JSONException e) {
                    Log.d("BrowserSwitch", e.getMessage());
                    Log.d("BrowserSwitch", Arrays.toString(e.getStackTrace()));
                }
            }
        }
        finish();
    }
}
