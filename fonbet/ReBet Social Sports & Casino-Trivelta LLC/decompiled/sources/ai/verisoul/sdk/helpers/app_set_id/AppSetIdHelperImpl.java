package ai.verisoul.sdk.helpers.app_set_id;

import ai.verisoul.sdk.logger.Logger;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u9.AbstractC6531a;
import u9.InterfaceC6532b;
import u9.c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lai/verisoul/sdk/helpers/app_set_id/AppSetIdHelperImpl;", "Lai/verisoul/sdk/helpers/app_set_id/AppSetIdHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "logTag", "", "collect", "Lai/verisoul/sdk/helpers/app_set_id/AppSetIdData;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppSetIdHelperImpl implements AppSetIdHelper {

    @NotNull
    private final Context context;

    @NotNull
    private final String logTag;

    public AppSetIdHelperImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.logTag = "Verisoul-[" + AppSetIdHelperImpl.class.getSimpleName() + "]";
    }

    @Override // ai.verisoul.sdk.helpers.app_set_id.AppSetIdHelper
    @Nullable
    public AppSetIdData collect() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            InterfaceC6532b a10 = AbstractC6531a.a(this.context);
            Intrinsics.checkNotNull(a10, "null cannot be cast to non-null type com.google.android.gms.appset.AppSetIdClient");
            Task appSetIdInfo = a10.getAppSetIdInfo();
            Intrinsics.checkNotNullExpressionValue(appSetIdInfo, "getAppSetIdInfo(...)");
            Object await = Tasks.await(appSetIdInfo);
            Intrinsics.checkNotNullExpressionValue(await, "await(...)");
            c cVar = (c) await;
            Logger.INSTANCE.metricLog(this.logTag, "app_set_id_duration", System.currentTimeMillis() - currentTimeMillis);
            int b10 = cVar.b();
            String a11 = cVar.a();
            Intrinsics.checkNotNullExpressionValue(a11, "getId(...)");
            return new AppSetIdData(b10, a11);
        } catch (Exception e10) {
            Logger.INSTANCE.error(this.logTag, "Error retrieving AppSetId: " + e10.getMessage());
            e10.printStackTrace();
            return null;
        }
    }
}
