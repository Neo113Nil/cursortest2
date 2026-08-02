package com.sofascore.results.service;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.wearable.CapabilityClient;
import com.google.android.gms.wearable.CapabilityInfo;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.PutDataMapRequest;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.Wearable;
import com.google.android.gms.wearable.internal.zzah;
import com.google.android.gms.wearable.internal.zzan;
import com.google.android.gms.wearable.internal.zzdt;
import com.sofascore.model.WearMessagingAction;
import com.sofascore.results.main.start.StartActivity;
import defpackage.ad2;
import defpackage.bga;
import defpackage.cu5;
import defpackage.db9;
import defpackage.e3c;
import defpackage.ejg;
import defpackage.gl5;
import defpackage.hs4;
import defpackage.is8;
import defpackage.o02;
import defpackage.qa6;
import defpackage.rob;
import defpackage.rzk;
import defpackage.s38;
import defpackage.s9a;
import defpackage.tz9;
import defpackage.vga;
import defpackage.xw3;
import defpackage.yf2;
import defpackage.yhk;
import defpackage.z45;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/service/WatchService;", "Lcom/google/android/gms/wearable/WearableListenerService;", "Lcom/google/android/gms/wearable/CapabilityClient$OnCapabilityChangedListener;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WatchService extends db9 implements CapabilityClient.OnCapabilityChangedListener {
    public boolean l;
    public boolean m;
    public yf2 n;
    public final ad2 o;
    public qa6 p;

    public WatchService() {
        hs4 hs4Var = z45.a;
        this.o = s9a.c(rob.a.plus(tz9.o()));
    }

    @Override // com.google.android.gms.wearable.WearableListenerService, com.google.android.gms.wearable.CapabilityApi.CapabilityListener
    public final void b(CapabilityInfo capabilityInfo) {
        capabilityInfo.getClass();
        Set T = capabilityInfo.T();
        T.getClass();
        if (T.isEmpty()) {
            return;
        }
        if (this.l || this.m) {
            try {
                if (this.m) {
                    i(1, false);
                } else {
                    h();
                }
            } catch (IOException e) {
                is8.h(e);
            }
        }
    }

    @Override // com.google.android.gms.wearable.WearableListenerService
    public final void g(MessageEvent messageEvent) {
        List split$default;
        List split$default2;
        messageEvent.getClass();
        String n = messageEvent.n();
        n.getClass();
        if (!c.v(n, "/v1-message", true) && !c.o(messageEvent.n(), "/event/details", true) && !c.o(messageEvent.n(), "/stage/details", true) && !c.o(messageEvent.n(), "/main", true)) {
            try {
                bga bgaVar = vga.a;
                byte[] data = messageEvent.getData();
                data.getClass();
                String k = c.k(data);
                bgaVar.getClass();
                WearMessagingAction wearMessagingAction = (WearMessagingAction) bgaVar.b(WearMessagingAction.INSTANCE.serializer(), k);
                if (wearMessagingAction instanceof WearMessagingAction.RefreshData) {
                    this.l = true;
                    h();
                    return;
                }
                if (wearMessagingAction instanceof WearMessagingAction.OpenEventDetails) {
                    Intent intent = new Intent(this, (Class<?>) StartActivity.class);
                    intent.setAction("notification_click_action");
                    intent.addFlags(268435456);
                    intent.putExtra("open_action", "open_details");
                    intent.putExtra("event_id", ((WearMessagingAction.OpenEventDetails) wearMessagingAction).getEventId());
                    startActivity(intent);
                    j(WearMessagingAction.OpenEventConfirmation.INSTANCE);
                    return;
                }
                if (wearMessagingAction instanceof WearMessagingAction.OpenApp) {
                    Intent intent2 = new Intent(this, (Class<?>) StartActivity.class);
                    intent2.setAction("notification_click_action");
                    intent2.addFlags(268435456);
                    intent2.putExtra("open_action", "open_main");
                    startActivity(intent2);
                    j(WearMessagingAction.OpenAppConfirmation.INSTANCE);
                    return;
                }
                return;
            } catch (Exception e) {
                s38.a().c(e);
                return;
            }
        }
        String n2 = messageEvent.n();
        n2.getClass();
        if (c.v(n2, "/v1-message", true)) {
            String n3 = messageEvent.n();
            n3.getClass();
            split$default = StringsKt__StringsKt.split$default(n3, new String[]{"/"}, false, 0, 6, null);
            int parseInt = Integer.parseInt((String) split$default.get(2));
            String n4 = messageEvent.n();
            n4.getClass();
            split$default2 = StringsKt__StringsKt.split$default(n4, new String[]{"/"}, false, 0, 6, null);
            boolean z = split$default2.size() > 3;
            this.m = true;
            i(parseInt, z);
            return;
        }
        if (c.o(messageEvent.n(), "/event/details", true)) {
            byte[] data2 = messageEvent.getData();
            data2.getClass();
            int parseInt2 = Integer.parseInt(new String(data2, Charsets.UTF_8));
            Intent intent3 = new Intent(this, (Class<?>) StartActivity.class);
            intent3.addFlags(268435456);
            intent3.setAction("notification_click_action");
            intent3.putExtra("open_action", "open_details");
            intent3.putExtra("event_id", parseInt2);
            startActivity(intent3);
            k("/event/details");
            return;
        }
        if (!c.o(messageEvent.n(), "/stage/details", true)) {
            if (c.o(messageEvent.n(), "/main", true)) {
                Intent intent4 = new Intent(this, (Class<?>) StartActivity.class);
                intent4.addFlags(268435456);
                intent4.setAction("notification_click_action");
                intent4.putExtra("open_action", "open_main");
                startActivity(intent4);
                k("/main");
                return;
            }
            return;
        }
        byte[] data3 = messageEvent.getData();
        data3.getClass();
        int parseInt3 = Integer.parseInt(new String(data3, Charsets.UTF_8));
        Intent intent5 = new Intent(this, (Class<?>) StartActivity.class);
        intent5.addFlags(268435456);
        intent5.setAction("notification_click_action");
        intent5.putExtra("open_action", "open_stage");
        intent5.putExtra("stage_id", parseInt3);
        startActivity(intent5);
    }

    public final void h() {
        if (this.l) {
            if (this.n == null) {
                this.n = new yf2(this, true);
            }
            xw3.L(this.o, null, null, new rzk(this, null), 3);
            o02.k0(this);
        }
    }

    public final void i(int i, boolean z) {
        if (this.m) {
            if (this.n == null) {
                this.n = new yf2(this, false);
            }
            xw3.L(this.o, null, null, new cu5(this, z, i, null), 3);
            o02.k0(this);
        }
    }

    public final void j(WearMessagingAction wearMessagingAction) {
        PutDataMapRequest b = PutDataMapRequest.b("/v2-message");
        DataMap dataMap = b.b;
        Long valueOf = Long.valueOf(new Date().getTime());
        HashMap hashMap = dataMap.a;
        hashMap.put("time", valueOf);
        hashMap.put(PglCryptUtils.KEY_MESSAGE, vga.a.c(WearMessagingAction.INSTANCE.serializer(), wearMessagingAction));
        PutDataRequest a = b.a();
        a.d = 0L;
        Api api = Wearable.a;
        new zzdt(this, GoogleApi.Settings.c).i(a);
    }

    public final void k(String str) {
        PutDataMapRequest b = PutDataMapRequest.b(str);
        DataMap dataMap = b.b;
        dataMap.a.put("time", Long.valueOf(new Date().getTime()));
        PutDataRequest a = b.a();
        a.d = 0L;
        Api api = Wearable.a;
        new zzdt(this, GoogleApi.Settings.c).i(a);
    }

    @Override // defpackage.db9, com.google.android.gms.wearable.WearableListenerService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.l = false;
        new IntentFilter().addAction("wearDataRefreshed");
        Api api = Wearable.a;
        zzan zzanVar = new zzan(this, Wearable.a, Wearable.WearableOptions.a, GoogleApi.Settings.c);
        new zzah();
        Uri parse = Uri.parse("wear://");
        parse.getClass();
        IntentFilter intentFilter = new IntentFilter("com.google.android.gms.wearable.CAPABILITY_CHANGED");
        if (parse.getScheme() != null) {
            intentFilter.addDataScheme(parse.getScheme());
        }
        if (parse.getAuthority() != null) {
            intentFilter.addDataAuthority(parse.getAuthority(), Integer.toString(parse.getPort()));
        }
        if (parse.getPath() != null) {
            intentFilter.addDataPath(parse.getPath(), 1);
        }
        ListenerHolder a = ListenerHolders.a(zzanVar.g, this, "CapabilityListener");
        RegistrationMethods.Builder builder = new RegistrationMethods.Builder();
        builder.c = gl5.b;
        builder.f = true;
        builder.d = a;
        builder.a = new ejg(23, this, a, new IntentFilter[]{intentFilter});
        builder.b = new e3c(this, 24);
        builder.g = 24013;
        zzanVar.e(builder.a());
    }

    @Override // com.google.android.gms.wearable.WearableListenerService, android.app.Service
    public final void onDestroy() {
        Api api = Wearable.a;
        zzan zzanVar = new zzan(this, Wearable.a, Wearable.WearableOptions.a, GoogleApi.Settings.c);
        new zzah();
        ListenerHolder.ListenerKey listenerKey = ListenerHolders.a(zzanVar.g, this, "CapabilityListener").b;
        if (listenerKey == null) {
            yhk.s("Key must not be null");
        } else {
            zzanVar.f(listenerKey, 24003);
            s9a.o(this.o, null);
        }
    }
}
