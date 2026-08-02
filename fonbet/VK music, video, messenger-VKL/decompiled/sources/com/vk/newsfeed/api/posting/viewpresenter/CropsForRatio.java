package com.vk.newsfeed.api.posting.viewpresenter;

import com.vk.dto.photo.ImageCropData;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AttachmentsBottomPreviewControls.kt */
/* loaded from: classes3.dex */
public final class CropsForRatio {
    public transient boolean a;

    @pmi0("crops")
    private final List<ImageCropData> crops;

    @pmi0("customRatio")
    private final PreviewRatio customRatio;

    @pmi0("ratio")
    private final PreviewRatio ratio;

    @pmi0("ratioMeta")
    private final String ratioMeta;

    public CropsForRatio(PreviewRatio previewRatio, List<ImageCropData> list, PreviewRatio previewRatio2, String str) {
        this.ratio = previewRatio;
        this.crops = list;
        this.customRatio = previewRatio2;
        this.ratioMeta = str;
    }

    public final List<ImageCropData> a() {
        return this.crops;
    }

    public final PreviewRatio b() {
        return this.ratio;
    }

    public final String c() {
        return this.ratioMeta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CropsForRatio)) {
            return false;
        }
        CropsForRatio cropsForRatio = (CropsForRatio) obj;
        return epx.f(this.ratio, cropsForRatio.ratio) && epx.f(this.crops, cropsForRatio.crops) && epx.f(this.customRatio, cropsForRatio.customRatio) && epx.f(this.ratioMeta, cropsForRatio.ratioMeta);
    }

    public final int hashCode() {
        int hashCode = this.ratio.hashCode() * 31;
        List<ImageCropData> list = this.crops;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        PreviewRatio previewRatio = this.customRatio;
        int hashCode3 = (hashCode2 + (previewRatio == null ? 0 : previewRatio.hashCode())) * 31;
        String str = this.ratioMeta;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CropsForRatio(ratio=");
        sb.append(this.ratio);
        sb.append(", crops=");
        sb.append(this.crops);
        sb.append(", customRatio=");
        sb.append(this.customRatio);
        sb.append(", ratioMeta=");
        return ho8.a(sb, this.ratioMeta, ')');
    }

    public /* synthetic */ CropsForRatio(PreviewRatio previewRatio, List list, PreviewRatio previewRatio2, String str, int i, zcl zclVar) {
        this(previewRatio, list, (i & 4) != 0 ? null : previewRatio2, (i & 8) != 0 ? null : str);
    }
}
