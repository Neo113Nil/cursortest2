package ru.ozon.app.android.faq.state;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0006J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/faq/state/FaqVOStorage;", "", "<init>", "()V", "stateMap", "", "", "Lru/ozon/app/android/faq/state/FaqVOState;", ProductAction.ACTION_ADD, "", "key", "state", "update", "getState", "addState", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FaqVOStorage {

    @NotNull
    private final Map<String, FaqVOState> stateMap = new LinkedHashMap();

    private final void addState(String key, FaqVOState state) {
        this.stateMap.put(key, state);
    }

    public final void add(@NotNull String key, @NotNull FaqVOState state) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.stateMap.get(key) != null) {
            return;
        }
        addState(key, state);
    }

    public final FaqVOState getState(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.stateMap.get(key);
    }

    public final void update(@NotNull String key, @NotNull FaqVOState state) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.stateMap.get(key) == null) {
            return;
        }
        addState(key, state);
    }
}
