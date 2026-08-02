package com.vk.dto.attaches;

import android.net.Uri;
import com.vk.dto.common.DownloadState;
import java.io.File;
import xsna.brm0;

/* compiled from: AttachWithDownload.kt */
/* loaded from: classes18.dex */
public interface AttachWithDownload extends Attach {
    void A6(DownloadState downloadState);

    default boolean C9() {
        return T0() == DownloadState.DOWNLOADING;
    }

    default boolean Q8() {
        String path = t7().getPath();
        return path != null && brm0.B(path, "/docmenu.php", false);
    }

    default boolean S4() {
        return T0() == DownloadState.DOWNLOADED;
    }

    DownloadState T0();

    default boolean X6() {
        return T0() == DownloadState.DOWNLOAD_REQUIRED;
    }

    void a3(File file);

    long getContentLength();

    String getFileName();

    @Override // com.vk.dto.attaches.Attach
    default boolean h0() {
        return G0().i() || C9();
    }

    File i1();

    Uri t7();
}
