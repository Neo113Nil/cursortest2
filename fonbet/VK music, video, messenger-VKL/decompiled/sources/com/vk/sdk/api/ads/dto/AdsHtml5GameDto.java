package com.vk.sdk.api.ads.dto;

import com.vk.sdk.api.base.dto.BaseImageDto;
import io.reactivex.rxjava3.subjects.b;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.vp;
import xsna.xe9;

/* compiled from: AdsHtml5GameDto.kt */
/* loaded from: classes5.dex */
public final class AdsHtml5GameDto {

    @pmi0("autolaunch")
    private final boolean autolaunch;

    @pmi0("inapp_actions")
    private final List<AdsHtml5GameInappActionDto> inappActions;

    @pmi0("launch_button_text")
    private final String launchButtonText;

    @pmi0("source_url")
    private final String sourceUrl;

    @pmi0("teaser_photo")
    private final List<BaseImageDto> teaserPhoto;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("viewport_ratio")
    private final float viewportRatio;

    public AdsHtml5GameDto(String str, String str2, boolean z, String str3, float f, List<BaseImageDto> list, List<AdsHtml5GameInappActionDto> list2) {
        this.trackCode = str;
        this.launchButtonText = str2;
        this.autolaunch = z;
        this.sourceUrl = str3;
        this.viewportRatio = f;
        this.teaserPhoto = list;
        this.inappActions = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsHtml5GameDto)) {
            return false;
        }
        AdsHtml5GameDto adsHtml5GameDto = (AdsHtml5GameDto) obj;
        return epx.f(this.trackCode, adsHtml5GameDto.trackCode) && epx.f(this.launchButtonText, adsHtml5GameDto.launchButtonText) && this.autolaunch == adsHtml5GameDto.autolaunch && epx.f(this.sourceUrl, adsHtml5GameDto.sourceUrl) && Float.compare(this.viewportRatio, adsHtml5GameDto.viewportRatio) == 0 && epx.f(this.teaserPhoto, adsHtml5GameDto.teaserPhoto) && epx.f(this.inappActions, adsHtml5GameDto.inappActions);
    }

    public final int hashCode() {
        return this.inappActions.hashCode() + fw3.a(b.a(this.viewportRatio, urd0.a(qoy.b(urd0.a(this.trackCode.hashCode() * 31, 31, this.launchButtonText), 31, this.autolaunch), 31, this.sourceUrl), 31), 31, this.teaserPhoto);
    }

    public final String toString() {
        String str = this.trackCode;
        String str2 = this.launchButtonText;
        boolean z = this.autolaunch;
        String str3 = this.sourceUrl;
        float f = this.viewportRatio;
        List<BaseImageDto> list = this.teaserPhoto;
        List<AdsHtml5GameInappActionDto> list2 = this.inappActions;
        StringBuilder a = xe9.a("AdsHtml5GameDto(trackCode=", str, ", launchButtonText=", str2, ", autolaunch=");
        a.append(z);
        a.append(", sourceUrl=");
        a.append(str3);
        a.append(", viewportRatio=");
        a.append(f);
        a.append(", teaserPhoto=");
        a.append(list);
        a.append(", inappActions=");
        return vp.b(")", a, list2);
    }
}
