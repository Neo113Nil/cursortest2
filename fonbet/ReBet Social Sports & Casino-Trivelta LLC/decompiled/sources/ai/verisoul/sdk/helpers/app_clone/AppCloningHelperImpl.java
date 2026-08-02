package ai.verisoul.sdk.helpers.app_clone;

import ai.verisoul.sdk.logger.Logger;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lai/verisoul/sdk/helpers/app_clone/AppCloningHelperImpl;", "Lai/verisoul/sdk/helpers/app_clone/AppCloningHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dot", "", "logTag", "collect", "Lai/verisoul/sdk/helpers/app_clone/AppCloningData;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppCloningHelperImpl implements AppCloningHelper {

    @NotNull
    private final Context context;

    @NotNull
    private final String dot;

    @NotNull
    private final String logTag;

    public AppCloningHelperImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.logTag = "Verisoul-[" + AppCloningHelperImpl.class.getSimpleName() + "]";
        this.dot = ".";
    }

    @Override // ai.verisoul.sdk.helpers.app_clone.AppCloningHelper
    @NotNull
    public AppCloningData collect() {
        long currentTimeMillis = System.currentTimeMillis();
        this.context.getPackageManager();
        String path = this.context.getFilesDir().getPath();
        Intrinsics.checkNotNull(path);
        AppCloningData appCloningData = new AppCloningData(null, path, StringsKt.split$default((CharSequence) path, new String[]{this.dot}, false, 0, 6, (Object) null).size(), null);
        Logger.INSTANCE.metricLog(this.logTag, "app_clone_duration", System.currentTimeMillis() - currentTimeMillis);
        return appCloningData;
    }
}
