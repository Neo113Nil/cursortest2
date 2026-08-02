package com.vk.core.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.vk.log.L;
import java.util.ArrayList;
import xsna.bv9;
import xsna.epx;
import xsna.gzs;
import xsna.jz9;

/* compiled from: RecreateActivity.kt */
/* loaded from: classes.dex */
public final class RecreateActivity extends Activity {
    public static final /* synthetic */ int b = 0;

    /* compiled from: RecreateActivity.kt */
    public static final class a {
        public static void a(long j, gzs gzsVar) {
            if (!epx.f(Looper.myLooper(), Looper.getMainLooper()) || j != 0) {
                new Handler(Looper.getMainLooper()).postDelayed(new bv9(gzsVar, 13), j);
                return;
            }
            try {
                gzsVar.invoke();
            } catch (Throwable th) {
                L.i(new b(th));
                com.vk.metrics.eventtracking.b.a.q(new b(th));
            }
        }

        public static void b(long j, Context context) {
            a(j, new jz9(context, 3));
        }
    }

    /* compiled from: RecreateActivity.kt */
    /* loaded from: classes17.dex */
    public static final class b extends RuntimeException {
        public b(Throwable th) {
            super(th);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("phoenix_restart_intents");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            L.l("empty activity intents");
        } else {
            startActivities((Intent[]) parcelableArrayListExtra.toArray(new Intent[parcelableArrayListExtra.size()]));
        }
        finish();
        Runtime.getRuntime().exit(0);
    }
}
