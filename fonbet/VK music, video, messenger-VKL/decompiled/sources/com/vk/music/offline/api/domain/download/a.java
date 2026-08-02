package com.vk.music.offline.api.domain.download;

import com.vk.music.offline.api.domain.download.AudioDownloadManager;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: CorruptedTracksRecoveryManager.kt */
/* loaded from: classes3.dex */
public interface a {
    void b(String str, String str2, String str3);

    void c(String str);

    Set<String> d();

    void e(String str, AudioDownloadManager.State state);

    void f(ArrayList arrayList);

    void release();
}
