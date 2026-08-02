package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class M5 extends BaseRequestConfig.ComponentLoader {

    /* renamed from: a, reason: collision with root package name */
    public final SafePackageManager f12567a;

    public M5(@NonNull Context context, @NonNull String str) {
        this(context, str, new SafePackageManager());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* renamed from: a */
    public N5 load(@NonNull L5 l52) {
        N5 n52 = (N5) super.load((M5) l52);
        String packageName = getContext().getPackageName();
        ApplicationInfo applicationInfo = this.f12567a.getApplicationInfo(getContext(), getPackageName(), 0);
        if (applicationInfo != null) {
            int i5 = applicationInfo.flags;
            n52.f12626a = (i5 & 2) != 0 ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
            n52.f12627b = (i5 & 1) == 0 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        } else if (TextUtils.equals(packageName, getPackageName())) {
            n52.f12626a = (getContext().getApplicationInfo().flags & 2) != 0 ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
            n52.f12627b = (getContext().getApplicationInfo().flags & 1) == 0 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        } else {
            n52.f12626a = CommonUrlParts.Values.FALSE_INTEGER;
            n52.f12627b = CommonUrlParts.Values.FALSE_INTEGER;
        }
        C0161fm c0161fm = l52.f12506a;
        n52.f12628c = c0161fm;
        n52.setRetryPolicyConfig(c0161fm.f13770t);
        return n52;
    }

    public M5(@NonNull Context context, @NonNull String str, @NonNull SafePackageManager safePackageManager) {
        super(context, str);
        this.f12567a = safePackageManager;
    }
}
