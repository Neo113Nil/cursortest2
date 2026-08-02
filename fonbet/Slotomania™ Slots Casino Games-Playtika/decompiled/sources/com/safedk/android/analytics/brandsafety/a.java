package com.safedk.android.analytics.brandsafety;

import android.graphics.Bitmap;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.List;

/* loaded from: classes4.dex */
public interface a extends AppLovinCommunicatorSubscriber, f, com.safedk.android.internal.a {
    BrandSafetyUtils.AdType a();

    c a(String str, RedirectDetails redirectDetails, n nVar, boolean z, boolean z2);

    List<CreativeInfo> a(String str, String str2);

    void a(Bitmap bitmap, c cVar);

    void a(c cVar, String str, boolean z);

    void a(String str);

    void a(String str, String str2, String str3);

    boolean a(p pVar);

    boolean a(String str, z zVar);

    boolean a(String str, String str2, String str3, boolean z, String str4);

    boolean a(String str, String str2, boolean z, String str3);

    List<CreativeInfo> b(String str);

    List<CreativeInfo> b(String str, String str2);

    void b();

    boolean b(String str, String str2, String str3);

    c c(String str);

    void c();

    void c(String str, String str2, String str3);

    c d(String str);

    void e(String str);

    boolean f(String str);
}
