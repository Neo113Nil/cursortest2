package ai.verisoul.sdk.di;

import ai.verisoul.sdk.logger.Logger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u0002H\t\"\u0006\b\u0000\u0010\t\u0018\u0001H\u0086\b¢\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\u0005¢\u0006\u0002\u0010\rJ\"\u0010\u000e\u001a\u00020\u000f\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u0002H\tH\u0086\b¢\u0006\u0002\u0010\u0011R!\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lai/verisoul/sdk/di/AppContainer;", "", "()V", "dependencies", "", "Ljava/lang/Class;", "getDependencies", "()Ljava/util/Map;", "get", "T", "()Ljava/lang/Object;", "injectClass", "clazz", "(Ljava/lang/Class;)Ljava/lang/Object;", "single", "", "instance", "(Ljava/lang/Object;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppContainer {

    @NotNull
    public static final AppContainer INSTANCE = new AppContainer();

    @NotNull
    private static final Map<Class<?>, Object> dependencies = new LinkedHashMap();

    private AppContainer() {
    }

    public final /* synthetic */ <T> T get() {
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) injectClass(Object.class);
    }

    @NotNull
    public final Map<Class<?>, Object> getDependencies() {
        return dependencies;
    }

    public final <T> T injectClass(@NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        T t10 = (T) dependencies.get(clazz);
        if (t10 == null) {
            t10 = null;
        }
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Instance not found for " + clazz.getSimpleName());
    }

    public final /* synthetic */ <T> void single(T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        try {
            Map<Class<?>, Object> dependencies2 = getDependencies();
            Intrinsics.reifiedOperationMarker(4, "T");
            dependencies2.put(Object.class, instance);
        } catch (Exception e10) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e10.getMessage());
        }
    }
}
