package ru.ozon.app.android.ui.switchingbutton.state;

import IJ.a;
import Nc.C3667a;
import io.reactivex.p;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R:\u0010\u0013\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004 \u0012*\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e0\u000e0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ui/switchingbutton/state/SwitchingButtonStateStorage;", "", "<init>", "()V", "Lru/ozon/app/android/ui/switchingbutton/state/SwitchingButtonState;", "state", "", "addState", "(Lru/ozon/app/android/ui/switchingbutton/state/SwitchingButtonState;)V", "", "id", "Lio/reactivex/p;", "observeState", "(Ljava/lang/String;)Lio/reactivex/p;", "", "stateMap", "Ljava/util/Map;", "LNc/a;", "kotlin.jvm.PlatformType", "storage", "LNc/a;", "switchingbutton_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwitchingButtonStateStorage {

    @NotNull
    private final Map<String, SwitchingButtonState> stateMap = new LinkedHashMap();

    @NotNull
    private final C3667a<Map<String, SwitchingButtonState>> storage;

    public SwitchingButtonStateStorage() {
        C3667a<Map<String, SwitchingButtonState>> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.storage = d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean observeState$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwitchingButtonState observeState$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (SwitchingButtonState) function1.invoke(p02);
    }

    public final void addState(@NotNull SwitchingButtonState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.stateMap.put(state.getId(), state);
        this.storage.onNext(new HashMap(this.stateMap));
    }

    @NotNull
    public final p<SwitchingButtonState> observeState(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        p map = this.storage.filter(new a(new SwitchingButtonStateStorage$observeState$1(id2), 8)).map(new HX.a(new SwitchingButtonStateStorage$observeState$2(id2), 6));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
