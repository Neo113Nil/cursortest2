package com.blaze.blazesdk.hosting_app_context;

import androidx.annotation.Keep;
import com.ironsource.U3;
import defpackage.tub;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/blaze/blazesdk/hosting_app_context/BlazeHostingAppContextManager;", "Lcom/blaze/blazesdk/hosting_app_context/IBlazeHostingAppContextManager;", "<init>", "()V", "hostingAppContextMap", "", "", "", "getValue", U3.i.W, "getContext", "", "setValue", "", U3.i.X, "setContext", "context", "deleteValue", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlazeHostingAppContextManager implements IBlazeHostingAppContextManager {
    public static final int $stable = 8;

    @NotNull
    private final Map<String, Object> hostingAppContextMap = new LinkedHashMap();

    @Override // com.blaze.blazesdk.hosting_app_context.IBlazeHostingAppContextManager
    public void deleteValue(@NotNull String key) {
        key.getClass();
        synchronized (this) {
            this.hostingAppContextMap.remove(key);
        }
    }

    @Override // com.blaze.blazesdk.hosting_app_context.IBlazeHostingAppContextManager
    @NotNull
    public Map<String, Object> getContext() {
        Map<String, Object> p;
        synchronized (this) {
            p = tub.p(this.hostingAppContextMap);
        }
        return p;
    }

    @Override // com.blaze.blazesdk.hosting_app_context.IBlazeHostingAppContextManager
    @Nullable
    public Object getValue(@NotNull String key) {
        Object obj;
        key.getClass();
        synchronized (this) {
            obj = this.hostingAppContextMap.get(key);
        }
        return obj;
    }

    @Override // com.blaze.blazesdk.hosting_app_context.IBlazeHostingAppContextManager
    public void setContext(@NotNull Map<String, ? extends Object> context) {
        context.getClass();
        synchronized (this) {
            this.hostingAppContextMap.clear();
            this.hostingAppContextMap.putAll(context);
            Unit unit = Unit.a;
        }
    }

    @Override // com.blaze.blazesdk.hosting_app_context.IBlazeHostingAppContextManager
    public void setValue(@NotNull String key, @Nullable Object value) {
        key.getClass();
        synchronized (this) {
            Map<String, Object> map = this.hostingAppContextMap;
            try {
                if (value == null) {
                    map.remove(key);
                } else {
                    map.put(key, value);
                    Unit unit = Unit.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
