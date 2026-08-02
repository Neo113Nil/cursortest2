package com.vk.push.common.messaging;

import android.os.Bundle;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes9.dex */
final class a extends AbstractC7737t implements Function0<Map<String, ? extends String>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ RemoteMessage f60704b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(RemoteMessage remoteMessage) {
        super(0);
        this.f60704b = remoteMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends String> invoke() {
        Bundle bundle;
        Bundle bundle2;
        RemoteMessage remoteMessage = this.f60704b;
        bundle = remoteMessage.f60701a;
        Iterable stringArrayList = bundle.getStringArrayList("vk.data_key");
        if (stringArrayList == null) {
            stringArrayList = K.f71697a;
        }
        bundle2 = remoteMessage.f60701a;
        Iterable stringArrayList2 = bundle2.getStringArrayList("vk.data_value");
        if (stringArrayList2 == null) {
            stringArrayList2 = K.f71697a;
        }
        return U.s(C7714v.b1(stringArrayList, stringArrayList2));
    }
}
