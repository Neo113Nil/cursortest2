package com.inmobi.media;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import java.util.Objects;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.uj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3812uj implements AppLovinCommunicatorSubscriber {
    public final /* synthetic */ Function2 a;

    public C3812uj(Function2 function2) {
        this.a = function2;
    }

    public final String getCommunicatorId() {
        return "AdInfoInterceptor";
    }

    public final void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        appLovinCommunicatorMessage.getClass();
        Uri data = appLovinCommunicatorMessage.getData();
        appLovinCommunicatorMessage.getTopic();
        Objects.toString(data);
        Function2 function2 = this.a;
        Bundle messageData = appLovinCommunicatorMessage.getMessageData();
        String topic = appLovinCommunicatorMessage.getTopic();
        topic.getClass();
        function2.invoke(messageData, topic);
    }
}
