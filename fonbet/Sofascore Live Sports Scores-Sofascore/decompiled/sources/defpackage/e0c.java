package defpackage;

import android.os.Bundle;
import com.unity3d.ads.core.data.datasource.MaxAdRevenueListener;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class e0c implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ e0c(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CharSequence bundleToTraceString$lambda$1;
        boolean containsKey;
        int i = this.a;
        Bundle bundle = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                bundleToTraceString$lambda$1 = MaxAdRevenueListener.bundleToTraceString$lambda$1(bundle, str);
                return bundleToTraceString$lambda$1;
            case 1:
                str.getClass();
                containsKey = bundle.containsKey(str);
                break;
            default:
                str.getClass();
                containsKey = bundle.containsKey(str);
                break;
        }
        return Boolean.valueOf(!containsKey);
    }
}
