package com.vk.newsfeed.api.posting.viewpresenter;

import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.vu5;
import xsna.zcl;

/* compiled from: AttachmentsBottomPreviewControls.kt */
/* loaded from: classes3.dex */
public final class PreviewRatio {
    public final transient int a;

    @pmi0("isCustom")
    private final boolean isCustom;

    @pmi0("ratioH")
    private final int ratioH;

    @pmi0("ratioW")
    private final int ratioW;

    public PreviewRatio(int i, int i2, boolean z, int i3) {
        this.ratioW = i;
        this.ratioH = i2;
        this.isCustom = z;
        this.a = i3;
    }

    public final int a() {
        return this.ratioH;
    }

    public final int b() {
        return this.ratioW;
    }

    public final boolean c() {
        return this.isCustom;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewRatio)) {
            return false;
        }
        PreviewRatio previewRatio = (PreviewRatio) obj;
        return this.ratioW == previewRatio.ratioW && this.ratioH == previewRatio.ratioH && this.isCustom == previewRatio.isCustom && this.a == previewRatio.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) + qoy.b(shy.a(this.ratioH, Integer.hashCode(this.ratioW) * 31, 31), 31, this.isCustom);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreviewRatio(ratioW=");
        sb.append(this.ratioW);
        sb.append(", ratioH=");
        sb.append(this.ratioH);
        sb.append(", isCustom=");
        sb.append(this.isCustom);
        sb.append(", iconResId=");
        return vu5.b(sb, this.a, ')');
    }

    public /* synthetic */ PreviewRatio(int i, int i2, boolean z, int i3, int i4, zcl zclVar) {
        this(i, i2, (i4 & 4) != 0 ? false : z, i3);
    }
}
