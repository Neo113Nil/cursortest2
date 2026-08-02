package com.unity3d.ironsourceads.internal.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.C2556n4;
import com.ironsource.C2736x5;
import com.ironsource.EnumC2507k9;
import com.ironsource.EnumC2754y5;
import com.ironsource.InterfaceC2444h;
import com.ironsource.Jb;
import com.ironsource.O9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.v;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class InlineStoreActivity extends Activity {
    private static final String c = "InlineStoreActivity";
    private static final int d = 1001;
    private v a;
    private boolean b = false;

    static class a {
        static final String a = "inline_store_intent";
        static final String b = "destroy_inline_store";

        private a() {
        }
    }

    public static class b {
        private final InterfaceC2444h a;
        private Intent b;

        public b(InterfaceC2444h interfaceC2444h) {
            this.a = interfaceC2444h;
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

    private void b() {
        requestWindowFeature(1);
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            v vVar = this.a;
            if (vVar != null) {
                vVar.a(i2, this.b);
            }
            Map<String, Object> hashMap = new HashMap<>();
            String str = "resultCode:" + i2;
            if (this.b) {
                str = str + ",destroyCalled:true";
            }
            hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
            a(EnumC2754y5.INLINE_STORE_CLOSED, hashMap);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.ironsource.sdk.utils.Logger.i(c, "onCreate()");
        try {
            this.a = (v) O9.b((Context) this).a().k();
            b();
            a();
            a((Intent) getIntent().getExtras().getParcelable("inline_store_intent"));
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            v vVar = this.a;
            if (vVar != null) {
                vVar.j(e.toString());
            }
            a(EnumC2754y5.INLINE_STORE_ACTIVITY_FAILED, (Map<String, Object>) null);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        v vVar = this.a;
        if (vVar != null) {
            vVar.a(true, "inlineStoreClose");
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.hasExtra("destroy_inline_store")) {
            IronLog.INTERNAL.verbose("onNewIntent() - destroy inline store request detected");
            this.b = true;
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        v vVar = this.a;
        if (vVar != null) {
            vVar.a(false, "inlineStoreOpen");
        }
    }

    private void a(Intent intent) {
        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(this, intent, 1001);
        v vVar = this.a;
        if (vVar != null) {
            vVar.z();
        }
        a(EnumC2754y5.INLINE_STORE_LAUNCHED, (Map<String, Object>) null);
    }

    private void a(final EnumC2754y5 enumC2754y5, final Map<String, Object> map) {
        new Thread(new Runnable() { // from class: com.unity3d.ironsourceads.internal.services.InlineStoreActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                InlineStoreActivity.a(map, enumC2754y5);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Map map, EnumC2754y5 enumC2754y5) {
        try {
            HashMap hashMap = map != null ? new HashMap(map) : new HashMap();
            String str = "strategy:" + EnumC2507k9.APP_ACTIVITY.b();
            Object obj = hashMap.get(IronSourceConstants.EVENTS_EXT1);
            if ((obj instanceof String) && !TextUtils.isEmpty((String) obj)) {
                hashMap.put(IronSourceConstants.EVENTS_EXT1, str + "," + obj);
            } else {
                hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
            }
            Jb.Y().q().a(new C2736x5(enumC2754y5, new JSONObject(hashMap)));
        } catch (Exception e) {
            C2556n4.d().a(e);
        }
    }
}
