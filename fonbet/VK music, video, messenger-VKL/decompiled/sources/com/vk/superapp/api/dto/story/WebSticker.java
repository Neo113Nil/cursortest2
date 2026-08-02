package com.vk.superapp.api.dto.story;

import com.vk.core.serialize.Serializer;
import xsna.bxx;

/* compiled from: WebSticker.kt */
/* loaded from: classes6.dex */
public abstract class WebSticker extends Serializer.StreamParcelableAdapter implements bxx {
    public final WebTransform b;
    public final boolean c;

    public WebSticker(WebTransform webTransform, boolean z, boolean z2) {
        this.b = webTransform;
        this.c = z;
    }

    public boolean g1() {
        return this.c;
    }

    public WebTransform zb() {
        return this.b;
    }
}
