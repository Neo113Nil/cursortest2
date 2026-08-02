package com.google.ads.interactivemedia.v3.impl.data.customui;

import defpackage.bf3;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_JavaScriptUiSkipData extends JavaScriptUiSkipData {
    private final JavaScriptUiButtonData button;
    private final JavaScriptUiLabelData countdown;

    public AutoValue_JavaScriptUiSkipData(JavaScriptUiButtonData javaScriptUiButtonData, JavaScriptUiLabelData javaScriptUiLabelData) {
        if (javaScriptUiButtonData == null) {
            yhk.s("Null button");
            throw null;
        }
        this.button = javaScriptUiButtonData;
        if (javaScriptUiLabelData != null) {
            this.countdown = javaScriptUiLabelData;
        } else {
            yhk.s("Null countdown");
            throw null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiSkipData
    public JavaScriptUiButtonData button() {
        return this.button;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiSkipData
    public JavaScriptUiLabelData countdown() {
        return this.countdown;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JavaScriptUiSkipData) {
            JavaScriptUiSkipData javaScriptUiSkipData = (JavaScriptUiSkipData) obj;
            if (this.button.equals(javaScriptUiSkipData.button()) && this.countdown.equals(javaScriptUiSkipData.countdown())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.button.hashCode() ^ 1000003;
        return this.countdown.hashCode() ^ (hashCode * 1000003);
    }

    public String toString() {
        JavaScriptUiLabelData javaScriptUiLabelData = this.countdown;
        String valueOf = String.valueOf(this.button);
        String valueOf2 = String.valueOf(javaScriptUiLabelData);
        StringBuilder sb = new StringBuilder(valueOf.length() + 40 + valueOf2.length() + 1);
        bf3.v(sb, "JavaScriptUiSkipData{button=", valueOf, ", countdown=", valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
