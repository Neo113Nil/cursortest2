package com.vk.voip.ui.calls.presentation.feature.handler;

import com.vk.im.engine.external.ImMsgPushSettingsProvider;
import com.vk.voip.ui.calls.presentation.feature.handler.VoipCallServiceBannerHandler;
import io.reactivex.rxjava3.kotlin.c;
import io.reactivex.rxjava3.subjects.f;
import java.util.concurrent.TimeUnit;
import xsna.vgs0;

/* compiled from: VoipCallServiceBannerHandler.kt */
/* loaded from: classes7.dex */
public final class a implements ImMsgPushSettingsProvider.OnEnabledUpdateListener {
    public final f<VoipCallServiceBannerHandler.b.a> a;

    public a(VoipCallServiceBannerHandler voipCallServiceBannerHandler) {
        f<VoipCallServiceBannerHandler.b.a> fVar = new f<>();
        this.a = fVar;
        voipCallServiceBannerHandler.c.b(c.f(3, fVar.y(500L, TimeUnit.MILLISECONDS), null, null, new vgs0(voipCallServiceBannerHandler, 10)));
    }

    @Override // com.vk.im.engine.external.ImMsgPushSettingsProvider.OnEnabledUpdateListener
    public final void a() {
        this.a.onNext(VoipCallServiceBannerHandler.b.a.a);
    }
}
