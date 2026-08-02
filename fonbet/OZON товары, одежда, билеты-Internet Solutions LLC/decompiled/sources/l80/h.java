package l80;

import Q90.c;
import android.content.Context;
import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h {
    public static final Context a(Context context, @NotNull O30.b fintechLibType) {
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        if (context != null) {
            try {
                int i11 = Q90.c.f23057s;
                if (c.a.d(S90.c.MOB_INTERFACE_SCALE, fintechLibType).b().isEnabled()) {
                    Configuration configuration = new Configuration(context.getResources().getConfiguration());
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    configuration.fontScale = context.getResources().getConfiguration().fontScale;
                    return context.createConfigurationContext(configuration);
                }
            } catch (Exception e11) {
                L80.a.b("AttachBaseContext", e11.getStackTrace().toString());
            }
        }
        return context;
    }
}
