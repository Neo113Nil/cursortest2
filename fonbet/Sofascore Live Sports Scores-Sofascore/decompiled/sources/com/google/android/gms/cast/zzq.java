package com.google.android.gms.cast;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
/* loaded from: classes3.dex */
public interface zzq extends HasApiKey {
    Task a(String str);

    Task b(String str, String str2);

    Task c(String str, RemoteMediaClient remoteMediaClient);
}
