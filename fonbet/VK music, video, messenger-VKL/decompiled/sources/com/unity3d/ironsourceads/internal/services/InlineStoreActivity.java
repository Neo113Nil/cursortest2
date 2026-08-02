package com.unity3d.ironsourceads.internal.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.C4452n4;
import com.ironsource.C4632x5;
import com.ironsource.EnumC4421l9;
import com.ironsource.EnumC4650y5;
import com.ironsource.InterfaceC4340h;
import com.ironsource.Kb;
import com.ironsource.P9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import xsna.fo8;
import xsna.lhg;
import xsna.si0;

/* loaded from: classes14.dex */
public class InlineStoreActivity extends Activity {
    private static final String c = "InlineStoreActivity";
    private static final int d = 1001;
    private v a;
    private boolean b = false;

    public static class a {
        static final String a = "inline_store_intent";
        static final String b = "destroy_inline_store";

        private a() {
        }
    }

    public static class b {
        private final InterfaceC4340h a;
        private Intent b;

        public b(InterfaceC4340h interfaceC4340h) {
            this.a = interfaceC4340h;
        }

        public b a(Intent intent) {
            this.b = intent;
            return this;
        }

        public Intent a(Context context) {
            Intent a = this.a.a(context);
            a.putExtra("inline_store_intent", this.b);
            return a;
        }
    }

    private void a() {
        getWindow().setFlags(1024, 1024);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            v vVar = this.a;
            if (vVar != null) {
                vVar.a(i2, this.b);
            }
            HashMap hashMap = new HashMap();
            String a2 = lhg.a(i2, "resultCode:");
            if (this.b) {
                a2 = fo8.a(a2, ",destroyCalled:true");
            }
            hashMap.put(IronSourceConstants.EVENTS_EXT1, a2);
            a(EnumC4650y5.INLINE_STORE_CLOSED, hashMap);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(c, "onCreate()");
        try {
            this.a = (v) P9.b((Context) this).a().k();
            b();
            a();
            a((Intent) getIntent().getExtras().getParcelable("inline_store_intent"));
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            v vVar = this.a;
            if (vVar != null) {
                vVar.j(e.toString());
            }
            a(EnumC4650y5.INLINE_STORE_ACTIVITY_FAILED, (Map<String, Object>) null);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        v vVar = this.a;
        if (vVar != null) {
            vVar.a(true, "inlineStoreClose");
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.hasExtra("destroy_inline_store")) {
            IronLog.INTERNAL.verbose("onNewIntent() - destroy inline store request detected");
            this.b = true;
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        v vVar = this.a;
        if (vVar != null) {
            vVar.a(false, "inlineStoreOpen");
        }
    }

    private void b() {
        requestWindowFeature(1);
    }

    private void a(Intent intent) {
        startActivityForResult(intent, 1001);
        v vVar = this.a;
        if (vVar != null) {
            vVar.z();
        }
        a(EnumC4650y5.INLINE_STORE_LAUNCHED, (Map<String, Object>) null);
    }

    private void a(EnumC4650y5 enumC4650y5, Map<String, Object> map) {
        new Thread(new si0(4, map, enumC4650y5)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Map map, EnumC4650y5 enumC4650y5) {
        try {
            HashMap hashMap = map != null ? new HashMap(map) : new HashMap();
            String str = "strategy:" + EnumC4421l9.APP_ACTIVITY.b();
            Object obj = hashMap.get(IronSourceConstants.EVENTS_EXT1);
            if ((obj instanceof String) && !TextUtils.isEmpty((String) obj)) {
                hashMap.put(IronSourceConstants.EVENTS_EXT1, str + StringUtils.COMMA + obj);
            } else {
                hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
            }
            Kb.Y().q().a(new C4632x5(enumC4650y5, new JSONObject(hashMap)));
        } catch (Exception e) {
            C4452n4.d().a(e);
        }
    }
}
