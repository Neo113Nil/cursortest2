package bo.app;

import android.content.Context;
import com.braze.support.StringUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class wf {
    public static vf a(q5 dispatchDataProvider, String filePrefix, String specificName) {
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
        Intrinsics.checkNotNullParameter(filePrefix, "filePrefix");
        Intrinsics.checkNotNullParameter(specificName, "specificName");
        ah ahVar = dispatchDataProvider.f25944a;
        Context context = ahVar.f25259a;
        return new vf(context, "com.braze.tokenbucket." + filePrefix + "." + specificName + StringUtils.getCacheFileSuffix(context, ahVar.f25263e, ahVar.f25264f));
    }
}
