package com.squareup.picasso;

import androidx.annotation.NonNull;
import defpackage.d2g;
import defpackage.qzf;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public interface Downloader {
    @NonNull
    d2g load(@NonNull qzf qzfVar) throws IOException;

    void shutdown();
}
