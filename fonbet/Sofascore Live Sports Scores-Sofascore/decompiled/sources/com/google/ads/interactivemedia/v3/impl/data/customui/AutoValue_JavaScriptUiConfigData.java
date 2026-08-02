package com.google.ads.interactivemedia.v3.impl.data.customui;

import androidx.annotation.Nullable;
import defpackage.bf3;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_JavaScriptUiConfigData extends JavaScriptUiConfigData {

    @Nullable
    private final JavaScriptUiLinkData adTitle;

    @Nullable
    private final JavaScriptUiLabelData attribution;

    @Nullable
    private final JavaScriptUiIconData authorIcon;

    @Nullable
    private final JavaScriptUiLinkData authorName;

    @Nullable
    private final JavaScriptUiButtonData callToAction;

    @Nullable
    private final List<JavaScriptUiVastIconData> icons;

    @Nullable
    private final JavaScriptUiSkipData skip;

    @Nullable
    private final JavaScriptUiElementData videoOverlay;

    public AutoValue_JavaScriptUiConfigData(@Nullable JavaScriptUiElementData javaScriptUiElementData, @Nullable JavaScriptUiButtonData javaScriptUiButtonData, @Nullable JavaScriptUiLabelData javaScriptUiLabelData, @Nullable JavaScriptUiSkipData javaScriptUiSkipData, @Nullable List<JavaScriptUiVastIconData> list, @Nullable JavaScriptUiLinkData javaScriptUiLinkData, @Nullable JavaScriptUiIconData javaScriptUiIconData, @Nullable JavaScriptUiLinkData javaScriptUiLinkData2) {
        this.videoOverlay = javaScriptUiElementData;
        this.callToAction = javaScriptUiButtonData;
        this.attribution = javaScriptUiLabelData;
        this.skip = javaScriptUiSkipData;
        this.icons = list;
        this.adTitle = javaScriptUiLinkData;
        this.authorIcon = javaScriptUiIconData;
        this.authorName = javaScriptUiLinkData2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiConfigData
    @Nullable
    public JavaScriptUiLinkData adTitle() {
        return this.adTitle;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiConfigData
    @Nullable
    public JavaScriptUiLabelData attribution() {
        return this.attribution;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiConfigData
    @Nullable
    public JavaScriptUiIconData authorIcon() {
        return this.authorIcon;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiConfigData
    @Nullable
    public JavaScriptUiLinkData authorName() {
        return this.authorName;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiConfigData
    @Nullable
    public JavaScriptUiButtonData callToAction() {
        return this.callToAction;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JavaScriptUiConfigData) {
            JavaScriptUiConfigData javaScriptUiConfigData = (JavaScriptUiConfigData) obj;
            JavaScriptUiElementData javaScriptUiElementData = this.videoOverlay;
            if (javaScriptUiElementData != null ? javaScriptUiElementData.equals(javaScriptUiConfigData.videoOverlay()) : javaScriptUiConfigData.videoOverlay() == null) {
                JavaScriptUiButtonData javaScriptUiButtonData = this.callToAction;
                if (javaScriptUiButtonData != null ? javaScriptUiButtonData.equals(javaScriptUiConfigData.callToAction()) : javaScriptUiConfigData.callToAction() == null) {
                    JavaScriptUiLabelData javaScriptUiLabelData = this.attribution;
                    if (javaScriptUiLabelData != null ? javaScriptUiLabelData.equals(javaScriptUiConfigData.attribution()) : javaScriptUiConfigData.attribution() == null) {
                        JavaScriptUiSkipData javaScriptUiSkipData = this.skip;
                        if (javaScriptUiSkipData != null ? javaScriptUiSkipData.equals(javaScriptUiConfigData.skip()) : javaScriptUiConfigData.skip() == null) {
                            List<JavaScriptUiVastIconData> list = this.icons;
                            if (list != null ? list.equals(javaScriptUiConfigData.icons()) : javaScriptUiConfigData.icons() == null) {
                                JavaScriptUiLinkData javaScriptUiLinkData = this.adTitle;
                                if (javaScriptUiLinkData != null ? javaScriptUiLinkData.equals(javaScriptUiConfigData.adTitle()) : javaScriptUiConfigData.adTitle() == null) {
                                    JavaScriptUiIconData javaScriptUiIconData = this.authorIcon;
                                    if (javaScriptUiIconData != null ? javaScriptUiIconData.equals(javaScriptUiConfigData.authorIcon()) : javaScriptUiConfigData.authorIcon() == null) {
                                        JavaScriptUiLinkData javaScriptUiLinkData2 = this.authorName;
                                        if (javaScriptUiLinkData2 != null ? javaScriptUiLinkData2.equals(javaScriptUiConfigData.authorName()) : javaScriptUiConfigData.authorName() == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        JavaScriptUiElementData javaScriptUiElementData = this.videoOverlay;
        int hashCode = javaScriptUiElementData == null ? 0 : javaScriptUiElementData.hashCode();
        JavaScriptUiButtonData javaScriptUiButtonData = this.callToAction;
        int hashCode2 = javaScriptUiButtonData == null ? 0 : javaScriptUiButtonData.hashCode();
        int i = hashCode ^ 1000003;
        JavaScriptUiLabelData javaScriptUiLabelData = this.attribution;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (javaScriptUiLabelData == null ? 0 : javaScriptUiLabelData.hashCode())) * 1000003;
        JavaScriptUiSkipData javaScriptUiSkipData = this.skip;
        int hashCode4 = (hashCode3 ^ (javaScriptUiSkipData == null ? 0 : javaScriptUiSkipData.hashCode())) * 1000003;
        List<JavaScriptUiVastIconData> list = this.icons;
        int hashCode5 = (hashCode4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        JavaScriptUiLinkData javaScriptUiLinkData = this.adTitle;
        int hashCode6 = (hashCode5 ^ (javaScriptUiLinkData == null ? 0 : javaScriptUiLinkData.hashCode())) * 1000003;
        JavaScriptUiIconData javaScriptUiIconData = this.authorIcon;
        int hashCode7 = (hashCode6 ^ (javaScriptUiIconData == null ? 0 : javaScriptUiIconData.hashCode())) * 1000003;
        JavaScriptUiLinkData javaScriptUiLinkData2 = this.authorName;
        return hashCode7 ^ (javaScriptUiLinkData2 != null ? javaScriptUiLinkData2.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiConfigData
    @Nullable
    public List<JavaScriptUiVastIconData> icons() {
        return this.icons;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiConfigData
    @Nullable
    public JavaScriptUiSkipData skip() {
        return this.skip;
    }

    public String toString() {
        JavaScriptUiLinkData javaScriptUiLinkData = this.authorName;
        JavaScriptUiIconData javaScriptUiIconData = this.authorIcon;
        JavaScriptUiLinkData javaScriptUiLinkData2 = this.adTitle;
        List<JavaScriptUiVastIconData> list = this.icons;
        JavaScriptUiSkipData javaScriptUiSkipData = this.skip;
        JavaScriptUiLabelData javaScriptUiLabelData = this.attribution;
        JavaScriptUiButtonData javaScriptUiButtonData = this.callToAction;
        String valueOf = String.valueOf(this.videoOverlay);
        String valueOf2 = String.valueOf(javaScriptUiButtonData);
        String valueOf3 = String.valueOf(javaScriptUiLabelData);
        String valueOf4 = String.valueOf(javaScriptUiSkipData);
        String valueOf5 = String.valueOf(list);
        String valueOf6 = String.valueOf(javaScriptUiLinkData2);
        String valueOf7 = String.valueOf(javaScriptUiIconData);
        String valueOf8 = String.valueOf(javaScriptUiLinkData);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int length4 = valueOf4.length();
        int length5 = valueOf5.length();
        int length6 = valueOf6.length();
        StringBuilder sb = new StringBuilder(length + 51 + length2 + 14 + length3 + 7 + length4 + 8 + length5 + 10 + length6 + 13 + valueOf7.length() + 13 + valueOf8.length() + 1);
        bf3.v(sb, "JavaScriptUiConfigData{videoOverlay=", valueOf, ", callToAction=", valueOf2);
        bf3.v(sb, ", attribution=", valueOf3, ", skip=", valueOf4);
        bf3.v(sb, ", icons=", valueOf5, ", adTitle=", valueOf6);
        bf3.v(sb, ", authorIcon=", valueOf7, ", authorName=", valueOf8);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.customui.JavaScriptUiConfigData
    @Nullable
    public JavaScriptUiElementData videoOverlay() {
        return this.videoOverlay;
    }
}
