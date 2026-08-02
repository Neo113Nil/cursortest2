package com.vk.push.rustore.impl;

import com.vk.log.L;
import com.vk.rustore.di.RuStoreComponent;
import com.vk.toggle.b;
import com.vk.toggle.features.NotificationFeatures;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import ru.rustore.sdk.pushclient.messaging.exception.RuStorePushClientException;
import ru.rustore.sdk.pushclient.messaging.service.RuStoreMessagingService;
import xsna.ls2;
import xsna.msy;
import xsna.nvf0;
import xsna.qkd0;
import xsna.rc4;
import xsna.ui70;
import xsna.z4g;

/* compiled from: RuStorePushService.kt */
/* loaded from: classes5.dex */
public final class RuStorePushService extends RuStoreMessagingService {
    public static final /* synthetic */ int n = 0;
    public final String l = UUID.randomUUID().toString();
    public final Object m = msy.a(LazyThreadSafetyMode.NONE, new qkd0(this, 4));

    @Override // ru.rustore.sdk.pushclient.messaging.service.RuStoreMessagingService
    public final void c() {
        g("push_on_deleted");
        ui70 d = z4g.d();
        L.e("[Push]: onDeletedMessages, longPollRunning=" + d.e());
        d.q();
        d.t(null);
    }

    @Override // ru.rustore.sdk.pushclient.messaging.service.RuStoreMessagingService
    public final void d(List<? extends RuStorePushClientException> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((RuStorePushClientException) it.next()).printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ru.rustore.sdk.pushclient.messaging.service.RuStoreMessagingService
    public final void e(nvf0 nvf0Var) {
        L.e("[Push]: Rustore send msg: priority=" + nvf0Var.a + " data=" + nvf0Var.b);
        g("push_on_message_received");
        g("push_delivered");
        z4g.d().q();
        ((RuStoreComponent) this.m.getValue()).F3().submit(new rc4(this, nvf0Var));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ru.rustore.sdk.pushclient.messaging.service.RuStoreMessagingService
    public final void f(String str) {
        g("push_on_new_token");
        ((RuStoreComponent) this.m.getValue()).se().b(str);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void g(String str) {
        NotificationFeatures notificationFeatures = NotificationFeatures.NOTIFICATION_PUSH_PIPELINE_ANALYTIC;
        notificationFeatures.getClass();
        if (b.A.a(notificationFeatures)) {
            ((RuStoreComponent) this.m.getValue()).F3().submit(new ls2(7, this, str));
        }
    }

    @Override // ru.rustore.sdk.pushclient.messaging.service.RuStoreMessagingService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        g("push_init");
        g("push_service_connected");
    }
}
