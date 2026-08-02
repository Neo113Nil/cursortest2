package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidStoreDataSource;", "Lcom/unity3d/ads/core/data/datasource/StoreDataSource;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "fetchStores", "", "", "additionalStores", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidStoreDataSource implements StoreDataSource {

    @NotNull
    private final Context context;

    public AndroidStoreDataSource(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    @Override // com.unity3d.ads.core.data.datasource.StoreDataSource
    @NotNull
    public List<String> fetchStores(@NotNull List<String> additionalStores) {
        additionalStores.getClass();
        AndroidKnownStore[] values = AndroidKnownStore.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (AndroidKnownStore androidKnownStore : values) {
            arrayList.add(androidKnownStore.getPackageName());
        }
        List S0 = CollectionsKt.S0(CollectionsKt.V0(CollectionsKt.w0(additionalStores, arrayList)));
        PackageManager packageManager = this.context.getPackageManager();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : S0) {
            String str = (String) obj;
            try {
                if ((Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(str, 0)) != null) {
                    arrayList2.add(obj);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return arrayList2;
    }
}
