package com.vk.security.proxy;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.ironsource.X3;
import com.vk.core.files.a;
import com.vk.metrics.eventtracking.b;
import com.vkontakte.android.R;
import java.io.File;
import xsna.cqm0;
import xsna.cvk;
import xsna.epx;
import xsna.fp;
import xsna.sv1;
import xsna.tv4;

/* compiled from: ProxySecurityActivity.kt */
/* loaded from: classes5.dex */
public final class ProxySecurityActivity extends Activity {
    public static final /* synthetic */ int b = 0;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().hasExtra("EXTRA_PROXY_INTENT")) {
            tv4.b("Empty proxy intent!", b.a);
        }
        Intent intent = (Intent) getIntent().getParcelableExtra("EXTRA_PROXY_INTENT");
        Uri data = intent != null ? intent.getData() : null;
        if ((intent != null ? intent.resolveActivity(getPackageManager()) : null) == null) {
            fp.d("Can't resolve proxy intent!");
            if (data == null) {
                cvk.u(R.string.proxy_unresolve_document, false);
                finish();
                return;
            }
            String m = a.m(this, data);
            String l = m != null ? a.l(new File(m)) : null;
            if (l != null) {
                cvk.v(R.string.proxy_unresolve_document_with_type, cqm0.n(l));
            } else {
                cvk.u(R.string.proxy_unresolve_document, false);
            }
            finish();
            return;
        }
        if (data != null && epx.f(data.getScheme(), X3.i.b)) {
            try {
                Uri N = a.N(sv1.E(data));
                if (N == null) {
                    throw new IllegalStateException("Could not resolve path " + data);
                }
                intent.setData(N);
            } catch (Throwable unused) {
                cvk.u(R.string.proxy_unresolve_document, false);
                finish();
                return;
            }
        }
        startActivity(intent);
        finish();
    }
}
