package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import defpackage.h4n;
import defpackage.lda;
import defpackage.mqn;
import defpackage.oea;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class AdUiImpl {
    private final List<h4n> icons;
    private final mqn router;
    private final String sessionId;

    public AdUiImpl(mqn mqnVar, List<h4n> list, String str) {
        this.router = mqnVar;
        this.icons = list;
        this.sessionId = str;
    }

    private Map<String, Object> createIconData(h4n h4nVar) {
        HashMap hashMap = new HashMap(oea.D(1));
        hashMap.put("id", Integer.valueOf(h4nVar.getId()));
        return hashMap;
    }

    @NonNull
    public List<h4n> getIcons() {
        return this.icons;
    }

    public void iconClicked(h4n h4nVar) {
        this.router.d(new lda(JavaScriptMessage$MsgChannel.nativeUi, JavaScriptMessage$MsgType.iconClicked, this.sessionId, createIconData(h4nVar), null));
    }

    public void iconShown(h4n h4nVar) {
        this.router.d(new lda(JavaScriptMessage$MsgChannel.nativeUi, JavaScriptMessage$MsgType.iconRendered, this.sessionId, createIconData(h4nVar), null));
    }
}
