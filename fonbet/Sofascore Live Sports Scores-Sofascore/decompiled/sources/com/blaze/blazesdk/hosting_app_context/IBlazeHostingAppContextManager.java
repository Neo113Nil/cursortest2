package com.blaze.blazesdk.hosting_app_context;

import androidx.annotation.Keep;
import com.ironsource.U3;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006H&J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001H&J\u001c\u0010\n\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006H&J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/hosting_app_context/IBlazeHostingAppContextManager;", "", "getValue", U3.i.W, "", "getContext", "", "setValue", "", U3.i.X, "setContext", "context", "deleteValue", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IBlazeHostingAppContextManager {
    void deleteValue(@NotNull String key);

    @NotNull
    Map<String, Object> getContext();

    @Nullable
    Object getValue(@NotNull String key);

    void setContext(@NotNull Map<String, ? extends Object> context);

    void setValue(@NotNull String key, @Nullable Object value);
}
