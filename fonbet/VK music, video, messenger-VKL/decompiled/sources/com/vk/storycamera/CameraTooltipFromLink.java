package com.vk.storycamera;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CameraLinkTooltip.kt */
/* loaded from: classes6.dex */
public final class CameraTooltipFromLink {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CameraTooltipFromLink[] $VALUES;
    public static final a Companion;
    public static final CameraTooltipFromLink UNKNOWN;
    private final String key = "";

    /* compiled from: CameraLinkTooltip.kt */
    public static final class a {
        public static CameraTooltipFromLink a(String str) {
            CameraTooltipFromLink cameraTooltipFromLink;
            CameraTooltipFromLink[] values = CameraTooltipFromLink.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cameraTooltipFromLink = null;
                    break;
                }
                cameraTooltipFromLink = values[i];
                if (epx.f(cameraTooltipFromLink.h(), str)) {
                    break;
                }
                i++;
            }
            return cameraTooltipFromLink == null ? CameraTooltipFromLink.UNKNOWN : cameraTooltipFromLink;
        }
    }

    static {
        CameraTooltipFromLink cameraTooltipFromLink = new CameraTooltipFromLink();
        UNKNOWN = cameraTooltipFromLink;
        CameraTooltipFromLink[] cameraTooltipFromLinkArr = {cameraTooltipFromLink};
        $VALUES = cameraTooltipFromLinkArr;
        $ENTRIES = new asp(cameraTooltipFromLinkArr);
        Companion = new a();
    }

    public static CameraTooltipFromLink valueOf(String str) {
        return (CameraTooltipFromLink) Enum.valueOf(CameraTooltipFromLink.class, str);
    }

    public static CameraTooltipFromLink[] values() {
        return (CameraTooltipFromLink[]) $VALUES.clone();
    }

    public final String h() {
        return this.key;
    }
}
