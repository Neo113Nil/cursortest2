package ru.ozon.app.android.travel.molecules.view.emptyState.v1;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateLayout;", "", "bind", "", "item", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface EmptyStateLayout {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void bind$default(EmptyStateLayout emptyStateLayout, EmptyStateVO emptyStateVO, Function1 function1, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
            }
            if ((i11 & 2) != 0) {
                function1 = null;
            }
            emptyStateLayout.bind(emptyStateVO, function1);
        }
    }

    void bind(@NotNull EmptyStateVO item, Function1<? super AtomAction, Unit> onAction);
}
