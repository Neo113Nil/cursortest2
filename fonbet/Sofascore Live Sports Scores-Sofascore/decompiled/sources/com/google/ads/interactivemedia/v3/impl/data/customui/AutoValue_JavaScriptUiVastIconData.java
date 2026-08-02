package com.google.ads.interactivemedia.v3.impl.data.customui;

import androidx.annotation.Nullable;
import defpackage.bf3;
import defpackage.wt3;
import defpackage.yhk;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_JavaScriptUiVastIconData extends JavaScriptUiVastIconData {
    private final String clickUrl;
    private final boolean clickable;
    private final List<JavaScriptUiFallbackImageData> fallbackImages;
    private final String id;
    private final JavaScriptUiImageData image;
    private final String program;
    private final boolean required;

    @Nullable
    private final String xPosition;

    @Nullable
    private final String yPosition;

    public AutoValue_JavaScriptUiVastIconData(String str, String str2, boolean z, String str3, boolean z2, JavaScriptUiImageData javaScriptUiImageData, List<JavaScriptUiFallbackImageData> list, @Nullable String str4, @Nullable String str5) {
        if (str == null) {
            yhk.s("Null id");
            throw null;
        }
        this.id = str;
        if (str2 == null) {
            yhk.s("Null program");
            throw null;
        }
        this.program = str2;
        this.required = z;
        if (str3 == null) {
            yhk.s("Null clickUrl");
            throw null;
        }
        this.clickUrl = str3;
        this.clickable = z2;
        if (javaScriptUiImageData == null) {
            yhk.s("Null image");
            throw null;
        }
        this.image = javaScriptUiImageData;
        if (list == null) {
            yhk.s("Null fallbackImages");
            throw null;
        }
        this.fallbackImages = list;
        this.xPosition = str4;
        this.yPosition = str5;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiVastIconData
    public String clickUrl() {
        return this.clickUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiVastIconData
    public boolean clickable() {
        return this.clickable;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof JavaScriptUiVastIconData) {
            JavaScriptUiVastIconData javaScriptUiVastIconData = (JavaScriptUiVastIconData) obj;
            if (this.id.equals(javaScriptUiVastIconData.id()) && this.program.equals(javaScriptUiVastIconData.program()) && this.required == javaScriptUiVastIconData.required() && this.clickUrl.equals(javaScriptUiVastIconData.clickUrl()) && this.clickable == javaScriptUiVastIconData.clickable() && this.image.equals(javaScriptUiVastIconData.image()) && this.fallbackImages.equals(javaScriptUiVastIconData.fallbackImages()) && ((str = this.xPosition) != null ? str.equals(javaScriptUiVastIconData.xPosition()) : javaScriptUiVastIconData.xPosition() == null) && ((str2 = this.yPosition) != null ? str2.equals(javaScriptUiVastIconData.yPosition()) : javaScriptUiVastIconData.yPosition() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiVastIconData
    public List<JavaScriptUiFallbackImageData> fallbackImages() {
        return this.fallbackImages;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.program.hashCode()) * 1000003) ^ (true != this.required ? 1237 : 1231)) * 1000003) ^ this.clickUrl.hashCode()) * 1000003) ^ (true != this.clickable ? 1237 : 1231)) * 1000003) ^ this.image.hashCode()) * 1000003) ^ this.fallbackImages.hashCode();
        String str = this.xPosition;
        int hashCode2 = ((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.yPosition;
        return hashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiVastIconData
    public String id() {
        return this.id;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiVastIconData
    public JavaScriptUiImageData image() {
        return this.image;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiVastIconData
    public String program() {
        return this.program;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiVastIconData
    public boolean required() {
        return this.required;
    }

    public String toString() {
        List<JavaScriptUiFallbackImageData> list = this.fallbackImages;
        String valueOf = String.valueOf(this.image);
        String valueOf2 = String.valueOf(list);
        String str = this.id;
        int length = String.valueOf(str).length();
        String str2 = this.program;
        int length2 = String.valueOf(str2).length();
        boolean z = this.required;
        int length3 = String.valueOf(z).length();
        String str3 = this.clickUrl;
        int length4 = String.valueOf(str3).length();
        boolean z2 = this.clickable;
        int length5 = String.valueOf(z2).length();
        int length6 = valueOf.length();
        int length7 = valueOf2.length();
        String str4 = this.xPosition;
        int length8 = String.valueOf(str4).length();
        String str5 = this.yPosition;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 11 + length3 + 11 + length4 + 12 + length5 + 8 + length6 + 17 + length7 + 12 + length8 + 12 + String.valueOf(str5).length() + 1);
        bf3.v(sb, "JavaScriptUiVastIconData{id=", str, ", program=", str2);
        sb.append(", required=");
        sb.append(z);
        sb.append(", clickUrl=");
        sb.append(str3);
        sb.append(", clickable=");
        sb.append(z2);
        sb.append(", image=");
        sb.append(valueOf);
        bf3.v(sb, ", fallbackImages=", valueOf2, ", xPosition=", str4);
        return wt3.m(", yPosition=", str5, sb, "}");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiVastIconData
    @Nullable
    public String xPosition() {
        return this.xPosition;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiVastIconData
    @Nullable
    public String yPosition() {
        return this.yPosition;
    }
}
