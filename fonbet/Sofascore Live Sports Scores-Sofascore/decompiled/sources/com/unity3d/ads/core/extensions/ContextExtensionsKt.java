package com.unity3d.ads.core.extensions;

import android.content.Context;
import com.ironsource.S5;
import com.unity3d.services.UnityAdsConstants;
import defpackage.dmi;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"unityAdsDataStoreFile", "Ljava/io/File;", "Landroid/content/Context;", S5.c.b, "", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContextExtensionsKt {
    @NotNull
    public static final File unityAdsDataStoreFile(@NotNull Context context, @NotNull String str) {
        context.getClass();
        str.getClass();
        return new File(context.getApplicationContext().getFilesDir(), dmi.q(UnityAdsConstants.Cache.DATASTORE_PATH, str));
    }
}
