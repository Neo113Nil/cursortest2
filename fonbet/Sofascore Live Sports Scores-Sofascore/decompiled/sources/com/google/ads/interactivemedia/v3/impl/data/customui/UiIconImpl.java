package com.google.ads.interactivemedia.v3.impl.data.customui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.b2p;
import defpackage.g9k;
import defpackage.h9k;
import defpackage.u1p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class UiIconImpl extends UiElementImpl implements g9k {
    private b2p clickUrl;
    private boolean clickable;
    private h9k image;

    public UiIconImpl(@NonNull String str, boolean z, @NonNull h9k h9kVar, boolean z2, @Nullable String str2) {
        super(str, z);
        this.clickable = false;
        this.clickUrl = u1p.a;
        this.image = h9kVar;
        this.clickable = z2;
        this.clickUrl = b2p.l(str2);
    }

    @NonNull
    public static UiIconImpl createFromJavaScriptMessage(@NonNull JavaScriptUiIconData javaScriptUiIconData) {
        return new UiIconImpl(javaScriptUiIconData.id(), javaScriptUiIconData.required(), UiImageImpl.createFromJavaScriptMessage(javaScriptUiIconData.image()), javaScriptUiIconData.clickable(), javaScriptUiIconData.clickUrl());
    }

    @Nullable
    public String getClickUrl() {
        return (String) this.clickUrl.i();
    }

    public boolean getClickable() {
        return this.clickable;
    }

    @NonNull
    public h9k getImage() {
        return this.image;
    }

    public void setClickUrl(@NonNull String str) {
        this.clickUrl = b2p.k(str);
    }

    public void setClickable(boolean z) {
        this.clickable = z;
    }

    public void setImage(@NonNull h9k h9kVar) {
        this.image = h9kVar;
    }
}
