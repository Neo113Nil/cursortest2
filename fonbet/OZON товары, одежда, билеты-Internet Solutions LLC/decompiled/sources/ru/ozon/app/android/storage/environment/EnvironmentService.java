package ru.ozon.app.android.storage.environment;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storage/environment/EnvironmentService;", "", "", "isProd", "()Z", "isStage", "", "changeEnvironment", "(Z)V", "toggleEnvironment", "()V", "Lru/ozon/app/android/storage/environment/OnEnvironmentChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnEnvironmentChangeListener", "(Lru/ozon/app/android/storage/environment/OnEnvironmentChangeListener;)V", "isEnabled", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface EnvironmentService {
    void addOnEnvironmentChangeListener(@NotNull OnEnvironmentChangeListener listener);

    void changeEnvironment(boolean isProd);

    boolean isEnabled();

    boolean isProd();

    boolean isStage();

    void toggleEnvironment();
}
