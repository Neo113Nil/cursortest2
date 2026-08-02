package ru.ozon.push.sdk.fcm;

import Sc.InterfaceC4008j;
import Sc.k;
import Wh0.e;
import Yg0.a;
import androidx.collection.Z;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.G;
import hh0.InterfaceC6956a;
import java.util.Map;
import jh0.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.external.service.RemoteMessage;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/push/sdk/fcm/FcmPushService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "fcm_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class FcmPushService extends FirebaseMessagingService {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97689a;

    static final class a extends AbstractC7737t implements Function0<InterfaceC6956a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f97690b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC6956a invoke() {
            Yg0.a.f35038y.getClass();
            return a.C0652a.b().q();
        }
    }

    public FcmPushService() {
        InterfaceC4008j b11 = k.b(a.f97690b);
        this.f97689a = b11;
        ((InterfaceC6956a) b11.getValue()).a(e.a(this));
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((InterfaceC6956a) this.f97689a.getValue()).d(this);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onDeletedMessages() {
        super.onDeletedMessages();
        ((InterfaceC6956a) this.f97689a.getValue()).e(e.a(this));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(@NotNull G message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Object data = message.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        ((Z) data).put("priority", String.valueOf(message.getPriority()));
        Object data2 = message.getData();
        Intrinsics.checkNotNullExpressionValue(data2, "getData(...)");
        ((Z) data2).put("original_priority", String.valueOf(message.getOriginalPriority()));
        String messageId = message.getMessageId();
        Map<String, String> data3 = message.getData();
        Intrinsics.checkNotNullExpressionValue(data3, "getData(...)");
        ((InterfaceC6956a) this.f97689a.getValue()).c(new RemoteMessage(messageId, data3), b.FCM, e.a(this));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        ((InterfaceC6956a) this.f97689a.getValue()).b(token, b.FCM);
    }
}
