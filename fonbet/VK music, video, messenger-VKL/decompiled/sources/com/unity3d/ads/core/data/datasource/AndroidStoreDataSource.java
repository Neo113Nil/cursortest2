package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import xsna.j5g;

/* compiled from: AndroidStoreDataSource.kt */
/* loaded from: classes14.dex */
public final class AndroidStoreDataSource implements StoreDataSource {
    private final Context context;

    public AndroidStoreDataSource(Context context) {
        this.context = context;
    }

    @Override // com.unity3d.ads.core.data.datasource.StoreDataSource
    public List<String> fetchStores(List<String> list) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        AndroidKnownStore[] values = AndroidKnownStore.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (AndroidKnownStore androidKnownStore : values) {
            arrayList.add(androidKnownStore.getPackageName());
        }
        List R = j5g.R(j5g.u0(list, arrayList));
        PackageManager packageManager = this.context.getPackageManager();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : R) {
            String str = (String) obj;
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    of = PackageManager.PackageInfoFlags.of(0L);
                    packageInfo = packageManager.getPackageInfo(str, of);
                } else {
                    packageInfo = packageManager.getPackageInfo(str, 0);
                }
                if (packageInfo != null) {
                    arrayList2.add(obj);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return arrayList2;
    }
}
