package ru.ozon.app.android.atoms.common.navigation;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/atoms/common/navigation/AtomRouter;", "", "navigators", "", "Lru/ozon/app/android/atoms/common/navigation/AtomNavigator;", "<init>", "(Ljava/util/Set;)V", "navigateFirst", "", "params", "", "", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AtomRouter {

    @NotNull
    private final Set<AtomNavigator> navigators;

    /* JADX WARN: Multi-variable type inference failed */
    public AtomRouter(@NotNull Set<? extends AtomNavigator> navigators) {
        Intrinsics.checkNotNullParameter(navigators, "navigators");
        this.navigators = navigators;
    }

    public final void navigateFirst(@NotNull Map<String, ? extends Object> params) {
        Object obj;
        Intrinsics.checkNotNullParameter(params, "params");
        Iterator<T> it = this.navigators.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((AtomNavigator) obj).canNavigate(params)) {
                    break;
                }
            }
        }
        AtomNavigator atomNavigator = (AtomNavigator) obj;
        if (atomNavigator != null) {
            atomNavigator.navigate(params);
        }
    }
}
