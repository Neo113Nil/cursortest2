package androidx.navigation;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.objectweb.asm.Opcodes;

/* compiled from: NavGraphViewModelLazy.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = Opcodes.ARETURN)
/* loaded from: classes5.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$5 implements Function0<CreationExtras> {
    final /* synthetic */ Lazy<NavBackStackEntry> $backStackEntry$delegate;

    public NavGraphViewModelLazyKt$navGraphViewModels$5(Lazy<NavBackStackEntry> lazy) {
        this.$backStackEntry$delegate = lazy;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CreationExtras invoke() {
        NavBackStackEntry m9833navGraphViewModels$lambda2;
        m9833navGraphViewModels$lambda2 = NavGraphViewModelLazyKt.m9833navGraphViewModels$lambda2(this.$backStackEntry$delegate);
        return m9833navGraphViewModels$lambda2.getDefaultViewModelCreationExtras();
    }
}
