package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.unity3d.services.core.fid.FIdBridge;
import com.unity3d.services.core.fid.FIdStaticBridge;
import defpackage.p2g;
import defpackage.td4;
import defpackage.w2g;
import kotlin.Metadata;
import kotlin.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidFIdDataSource;", "Lcom/unity3d/ads/core/data/datasource/FIdDataSource;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "bridge", "Lcom/unity3d/services/core/fid/FIdStaticBridge;", "invoke", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidFIdDataSource implements FIdDataSource {

    @NotNull
    private FIdStaticBridge bridge;

    @NotNull
    private final Context context;

    public AndroidFIdDataSource(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.bridge = new FIdStaticBridge();
    }

    @Override // com.unity3d.ads.core.data.datasource.FIdDataSource
    @Nullable
    public String invoke() {
        Task<String> appInstanceId;
        try {
            p2g p2gVar = w2g.b;
            FIdBridge fIdStaticBridge = this.bridge.getInstance(this.context);
            if (fIdStaticBridge != null && (appInstanceId = fIdStaticBridge.getAppInstanceId()) != null) {
                return (String) td4.t0(g.a, new AndroidFIdDataSource$invoke$1$1(appInstanceId, null));
            }
            return null;
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
            return null;
        }
    }
}
