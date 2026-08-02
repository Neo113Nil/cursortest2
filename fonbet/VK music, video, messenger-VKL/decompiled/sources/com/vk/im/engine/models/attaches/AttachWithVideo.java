package com.vk.im.engine.models.attaches;

import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.camera.VideoParams;
import xsna.ftx0;

/* compiled from: AttachWithVideo.kt */
/* loaded from: classes2.dex */
public interface AttachWithVideo extends AttachWithId, AttachWithImage, ftx0, AttachWithDownload {
    VideoFile A();

    void E(String str);

    default boolean Q5() {
        return A().d8() || A().z0();
    }

    VideoParams V6();

    ImageList Y8();

    ImageList Z2();

    String b5();

    @Override // com.vk.dto.attaches.Attach
    AttachWithVideo copy();

    int getHeight();

    int getWidth();

    void i8(String str);

    void n3(ImageList imageList);

    void setId(long j);
}
