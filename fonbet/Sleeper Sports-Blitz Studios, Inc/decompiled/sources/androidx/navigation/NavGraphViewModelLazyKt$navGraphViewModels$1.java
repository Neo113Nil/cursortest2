package androidx.navigation;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.objectweb.asm.Opcodes;

/* compiled from: NavGraphViewModelLazy.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = Opcodes.ARETURN)
/* loaded from: classes5.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$1 implements Function0<CreationExtras> {
    final /* synthetic */ Lazy<NavBackStackEntry> $backStackEntry$delegate;

    public NavGraphViewModelLazyKt$navGraphViewModels$1(Lazy<NavBackStackEntry> lazy) {
        this.$backStackEntry$delegate = lazy;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CreationExtras invoke() {
        NavBackStackEntry m9831navGraphViewModels$lambda0;
        m9831navGraphViewModels$lambda0 = NavGraphViewModelLazyKt.m9831navGraphViewModels$lambda0(this.$backStackEntry$delegate);
        return m9831navGraphViewModels$lambda0.getDefaultViewModelCreationExtras();
    }
}
