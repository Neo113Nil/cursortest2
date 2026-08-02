package com.vk.vendor.pushes;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.vk.dto.Push;
import java.util.Map;
import java.util.UUID;
import xsna.bhe0;
import xsna.fto0;
import xsna.rgd0;
import xsna.v801;
import xsna.wum0;

/* compiled from: FirebasePushService.kt */
/* loaded from: classes11.dex */
public final class FirebasePushService extends FirebaseMessagingService {
    public static v801 d;
    public volatile bhe0 b;
    public String c;

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        String uuid = UUID.randomUUID().toString();
        this.c = uuid;
        wum0.b(this, uuid);
        rgd0.a.getClass();
        this.b = fto0.h(this, rgd0.a(this).equals(getPackageName()), uuid);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onDeletedMessages() {
        bhe0 bhe0Var = this.b;
        if (bhe0Var != null) {
            bhe0Var.b();
        }
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b = null;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        bhe0 bhe0Var = this.b;
        if (bhe0Var != null) {
            String j = remoteMessage.j();
            Map<String, String> i = remoteMessage.i();
            Push.Priority.a aVar = Push.Priority.Companion;
            int k = remoteMessage.k();
            aVar.getClass();
            bhe0Var.c(new Push(i, Push.Priority.a.a(k), 4), j, this.c);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) {
        super.onNewToken(str);
        bhe0 bhe0Var = this.b;
        if (bhe0Var != null) {
            bhe0Var.a(str);
        }
    }
}
