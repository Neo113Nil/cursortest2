package ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder;

import android.os.Looper;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0016J\u001e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/LegalsResultStateHolderImpl;", "Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/LegalsResultStateHolder;", "mainThreadChecker", "Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/LegalsResultStateHolderImpl$MainThreadChecker;", "<init>", "(Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/LegalsResultStateHolderImpl$MainThreadChecker;)V", "registerObservers", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "registerObserver", "", "tag", "removeObserver", "invokeIfChanged", "block", "Lkotlin/Function0;", "notifyChangeLegalState", "checkForReset", "MainThreadChecker", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LegalsResultStateHolderImpl implements LegalsResultStateHolder {

    @NotNull
    private final MainThreadChecker mainThreadChecker;

    @NotNull
    private final HashMap<String, Boolean> registerObservers;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/LegalsResultStateHolderImpl$MainThreadChecker;", "", "<init>", "()V", "checkMainThread", "", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MainThreadChecker {
        public final void checkMainThread() {
            if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
                throw new IllegalStateException("Can invoke only on main thread");
            }
        }
    }

    public LegalsResultStateHolderImpl(@NotNull MainThreadChecker mainThreadChecker) {
        Intrinsics.checkNotNullParameter(mainThreadChecker, "mainThreadChecker");
        this.mainThreadChecker = mainThreadChecker;
        this.registerObservers = new HashMap<>();
    }

    private final void checkForReset() {
        Collection<Boolean> values = this.registerObservers.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Collection<Boolean> collection = values;
        if (!collection.isEmpty()) {
            for (Boolean bool : collection) {
                Intrinsics.f(bool);
                if (bool.booleanValue()) {
                    return;
                }
            }
        }
        this.registerObservers.clear();
    }

    @Override // ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.LegalsResultStateHolder
    public void invokeIfChanged(@NotNull String tag, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        this.mainThreadChecker.checkMainThread();
        Boolean bool = this.registerObservers.get(tag);
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        block.invoke();
        this.registerObservers.put(tag, Boolean.FALSE);
        checkForReset();
    }

    @Override // ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.LegalsResultStateHolder
    public void notifyChangeLegalState() {
        this.mainThreadChecker.checkMainThread();
        Set<String> keySet = this.registerObservers.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            this.registerObservers.put((String) it.next(), Boolean.TRUE);
        }
    }

    @Override // ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.LegalsResultStateHolder
    public void registerObserver(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.mainThreadChecker.checkMainThread();
        if (this.registerObservers.containsKey(tag)) {
            return;
        }
        this.registerObservers.put(tag, Boolean.FALSE);
    }

    @Override // ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.LegalsResultStateHolder
    public void removeObserver(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.mainThreadChecker.checkMainThread();
        this.registerObservers.remove(tag);
    }
}
