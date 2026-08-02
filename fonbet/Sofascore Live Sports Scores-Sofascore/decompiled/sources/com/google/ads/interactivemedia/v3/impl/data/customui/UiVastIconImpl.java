package com.google.ads.interactivemedia.v3.impl.data.customui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.b2p;
import defpackage.h9k;
import defpackage.u1p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class UiVastIconImpl extends UiIconImpl {
    private List<Object> fallbackImages;
    private String program;
    private b2p xPosition;
    private b2p yPosition;

    public UiVastIconImpl(@NonNull String str, boolean z, @NonNull h9k h9kVar, boolean z2, @NonNull String str2, @NonNull List<Object> list, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        super(str, z, h9kVar, z2, str3);
        this.program = "";
        u1p u1pVar = u1p.a;
        this.xPosition = u1pVar;
        this.yPosition = u1pVar;
        this.program = str2;
        this.fallbackImages = list;
        this.xPosition = b2p.l(str4);
        this.yPosition = b2p.l(str5);
    }

    @NonNull
    public static UiVastIconImpl createFromJavaScriptMessage(@NonNull JavaScriptUiVastIconData javaScriptUiVastIconData) {
        ArrayList arrayList = new ArrayList();
        Iterator<JavaScriptUiFallbackImageData> it = javaScriptUiVastIconData.fallbackImages().iterator();
        while (it.hasNext()) {
            arrayList.add(UiFallbackImageImpl.createFromJavaScriptMessage(it.next()));
        }
        return new UiVastIconImpl(javaScriptUiVastIconData.id(), javaScriptUiVastIconData.required(), UiImageImpl.createFromJavaScriptMessage(javaScriptUiVastIconData.image()), javaScriptUiVastIconData.clickable(), javaScriptUiVastIconData.program(), arrayList, javaScriptUiVastIconData.clickUrl(), javaScriptUiVastIconData.xPosition(), javaScriptUiVastIconData.yPosition());
    }

    @NonNull
    public List<Object> getFallbackImages() {
        return this.fallbackImages;
    }

    @NonNull
    public String getProgram() {
        return this.program;
    }

    @Nullable
    public String getXPosition() {
        return (String) this.xPosition.i();
    }

    @Nullable
    public String getYPosition() {
        return (String) this.yPosition.i();
    }

    public void setFallbackImages(@NonNull List<Object> list) {
        this.fallbackImages = list;
    }

    public void setProgram(@NonNull String str) {
        this.program = str;
    }

    public void setXPosition(@NonNull String str) {
        this.xPosition = b2p.l(str);
    }

    public void setYPosition(@NonNull String str) {
        this.yPosition = b2p.l(str);
    }
}
