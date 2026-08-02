package ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation;

import androidx.recyclerview.widget.m;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.app.android.ugc.widgets.createlistwrapper.data.CreateListWrapperDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00182*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0018B\u0011\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0003j\u0002`\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/widgets/createlistwrapper/presentation/CreateListWrapperMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/createlistwrapper/data/CreateListWrapperDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/createlistwrapper/presentation/CreateListWrapperVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "ugcSelectedProductsManager", "<init>", "(Lru/ozon/app/android/favorites/common/SelectedProductsManager;)V", "", "stateId", "toVo", "(Lru/ozon/app/android/ugc/widgets/createlistwrapper/data/CreateListWrapperDTO;Ljava/lang/String;)Lru/ozon/app/android/ugc/widgets/createlistwrapper/presentation/CreateListWrapperVI;", "state", "", "addProductsToSelectMode", "(Lru/ozon/app/android/ugc/widgets/createlistwrapper/data/CreateListWrapperDTO;)V", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/createlistwrapper/data/CreateListWrapperDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CreateListWrapperMapper implements Function2<CreateListWrapperDTO, d, List<? extends CreateListWrapperVI>> {
    private final SelectedProductsManager ugcSelectedProductsManager;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/widgets/createlistwrapper/presentation/CreateListWrapperMapper$Companion;", "", "<init>", "()V", "DEFAULT_LIMIT", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CreateListWrapperMapper(SelectedProductsManager selectedProductsManager) {
        this.ugcSelectedProductsManager = selectedProductsManager;
    }

    private final void addProductsToSelectMode(CreateListWrapperDTO state) {
        List<Long> skus = state.getSkus();
        if (skus != null) {
            Iterator<T> it = skus.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                SelectedProductsManager selectedProductsManager = this.ugcSelectedProductsManager;
                if (selectedProductsManager != null) {
                    selectedProductsManager.addProduct(longValue);
                }
            }
        }
    }

    private final CreateListWrapperVI toVo(CreateListWrapperDTO createListWrapperDTO, String str) {
        long hashCode = str.hashCode();
        ButtonV3Atom.LargeButton button = createListWrapperDTO.getButton();
        List<Long> skus = createListWrapperDTO.getSkus();
        Integer limit = createListWrapperDTO.getLimit();
        return new CreateListWrapperVI(hashCode, button, skus, limit != null ? limit.intValue() : m.e.DEFAULT_SWIPE_ANIMATION_DURATION);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CreateListWrapperVI> invoke(@NotNull CreateListWrapperDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        addProductsToSelectMode(state);
        return C7714v.a0(toVo(state, widgetInfo.d()));
    }
}
