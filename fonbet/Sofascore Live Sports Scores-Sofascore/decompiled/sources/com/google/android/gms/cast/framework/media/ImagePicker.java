package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import defpackage.ioo;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class ImagePicker {
    public ImagePicker() {
        new ioo(this);
    }

    public static WebImage a(MediaMetadata mediaMetadata) {
        List list;
        if (mediaMetadata == null || (list = mediaMetadata.a) == null || list.isEmpty()) {
            return null;
        }
        return (WebImage) list.get(0);
    }
}
