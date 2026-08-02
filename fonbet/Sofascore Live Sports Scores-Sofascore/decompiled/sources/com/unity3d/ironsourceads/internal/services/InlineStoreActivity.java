package com.unity3d.ironsourceads.internal.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.C4157k4;
import com.ironsource.C4355v5;
import com.ironsource.EnumC4180l9;
import com.ironsource.EnumC4373w5;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4099h;
import com.ironsource.O9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import defpackage.ljg;
import defpackage.yq5;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class InlineStoreActivity extends Activity {
    private static final String c = "InlineStoreActivity";
    private static final int d = 1001;
    private v a;
    private boolean b = false;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class a {
        static final String a = "inline_store_intent";
        static final String b = "destroy_inline_store";

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Map map, EnumC4373w5 enumC4373w5) {
        try {
            HashMap hashMap = map != null ? new HashMap(map) : new HashMap();
            String str = "strategy:" + EnumC4180l9.APP_ACTIVITY.b();
            Object obj = hashMap.get(IronSourceConstants.EVENTS_EXT1);
            if (!(obj instanceof String) || TextUtils.isEmpty((String) obj)) {
                hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
            } else {
                hashMap.put(IronSourceConstants.EVENTS_EXT1, str + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + obj);
            }
            Ib.a0().q().a(new C4355v5(enumC4373w5, new JSONObject(hashMap)));
        } catch (Exception e) {
            C4157k4.d().a(e);
        }
    }

    private void b() {
        requestWindowFeature(1);
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
            String j = ljg.j(i2, "resultCode:");
            if (this.b) {
                j = j.concat(",destroyCalled:true");
            }
            hashMap.put(IronSourceConstants.EVENTS_EXT1, j);
            a(EnumC4373w5.INLINE_STORE_CLOSED, hashMap);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(c, "onCreate()");
        try {
            this.a = (v) O9.b((Context) this).a().k();
            b();
            a();
            a((Intent) getIntent().getExtras().getParcelable("inline_store_intent"));
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            v vVar = this.a;
            if (vVar != null) {
                vVar.j(e.toString());
            }
            a(EnumC4373w5.INLINE_STORE_ACTIVITY_FAILED, (Map<String, Object>) null);
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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class b {
        private final InterfaceC4099h a;
        private Intent b;

        public b(InterfaceC4099h interfaceC4099h) {
            this.a = interfaceC4099h;
        }

        public Intent a(Context context) {
            Intent a = this.a.a(context);
            a.putExtra("inline_store_intent", this.b);
            return a;
        }

        @NotNull
        public b a(Intent intent) {
            this.b = intent;
            return this;
        }
    }

    private void a(Intent intent) {
        startActivityForResult(intent, 1001);
        v vVar = this.a;
        if (vVar != null) {
            vVar.z();
        }
        a(EnumC4373w5.INLINE_STORE_LAUNCHED, (Map<String, Object>) null);
    }

    private void a(EnumC4373w5 enumC4373w5, Map<String, Object> map) {
        new Thread(new yq5(14, map, enumC4373w5)).start();
    }

    private void a() {
        getWindow().setFlags(1024, 1024);
    }
}
