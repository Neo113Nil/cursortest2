package ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.button;

import A00.a;
import Dq.C2878a;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.text.h;
import ks.C7753a;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.csma.tips.core.TipItem;
import ru.ozon.app.android.csma.tips.core.TipsInput;
import ru.ozon.app.android.csma.tips.databinding.WidgetCourierTipsDetailsNoUiBinding;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.data.TipCourierReviewDO;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.data.TipCourierReviewDTO;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.data.TipCourierReviewInitState;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.di.TipCourierReviewV2Component;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.TipCourierReviewViewModelImpl;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.utils.StringExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\n\u0010!\u001a\u00060\u001fj\u0002` H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R&\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/button/TipCourierReviewOverlayViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/di/TipCourierReviewV2Component;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDTO;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDO;", "<init>", "()V", "dto", "mapToVO", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDTO;)Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDO;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDTO$TipsReview;", "tips", "Ljava/math/BigDecimal;", "selectCurrentTips", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDTO$TipsReview;)Ljava/math/BigDecimal;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDO;)Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDO;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/button/RemoveReviewInitState;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TipCourierReviewOverlayViewMapper extends OverlayWidgetScreenViewItemMapper2<TipCourierReviewV2Component, TipCourierReviewDTO, TipCourierReviewDO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<RemoveReviewInitState>> supportedUpdates = C7714v.a0(RemoveReviewInitState.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$2(WidgetCourierTipsDetailsNoUiBinding widgetCourierTipsDetailsNoUiBinding, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FrameLayout constraintLayout = widgetCourierTipsDetailsNoUiBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    private final TipCourierReviewDO mapToVO(TipCourierReviewDTO dto) {
        AtomDTO actionButton = dto.getActionButton();
        long hashCode = actionButton != null ? actionButton.hashCode() : 0;
        TipCourierReviewDTO.TipsReview tips = dto.getTips();
        AtomDTO actionButton2 = dto.getActionButton();
        AtomDTO cancelButton = dto.getCancelButton();
        TipCourierReviewDTO.TipsReview tips2 = dto.getTips();
        return new TipCourierReviewDO(hashCode, new TipCourierReviewInitState(tips, actionButton2, cancelButton, tips2 != null ? selectCurrentTips(tips2) : null));
    }

    private final BigDecimal selectCurrentTips(TipCourierReviewDTO.TipsReview tips) {
        Object obj;
        Iterator<T> it = tips.getTipsVariants().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((TipItem) obj).isSelected()) {
                break;
            }
        }
        TipItem tipItem = (TipItem) obj;
        TipsInput tipsInput = tips.getTipsInput();
        if (tipItem != null && !h.K(tipItem.getText())) {
            return new BigDecimal(StringExtKt.getDigits(tipItem.getText()));
        }
        if (tipsInput == null || !tipsInput.isSelected()) {
            return null;
        }
        return tipsInput.getCurrentValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TipCourierReviewV2Component widgetComponent$lambda$3(C7475g c7475g) {
        return TipCourierReviewV2Component.INSTANCE.create(c7475g);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<TipCourierReviewDO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        WidgetCourierTipsDetailsNoUiBinding inflate = WidgetCourierTipsDetailsNoUiBinding.inflate(LayoutInflater.from(container.L()), container.Z(), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new TipCourierReviewBottomWidgetViewHolder(inflate, (TipCourierReviewViewModelImpl) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.button.TipCourierReviewOverlayViewMapper$createHolder$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TipCourierReviewViewModelImpl viewModel = TipCourierReviewOverlayViewMapper.this.component().getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(TipCourierReviewViewModelImpl.class), component().getRouter(), (CreateAndPayViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.button.TipCourierReviewOverlayViewMapper$createHolder$$inlined$createViewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CreateAndPayViewModel createAndPayViewModel = TipCourierReviewOverlayViewMapper.this.component().getCreateAndPayViewModel();
                Intrinsics.g(createAndPayViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return createAndPayViewModel;
            }
        }).a(CreateAndPayViewModel.class), container, new C7753a(inflate, 0));
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<RemoveReviewInitState>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TipCourierReviewV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(TipCourierReviewV2Component.class), new C2878a(storage, 8));
    }

    @Override // c20.r, I00.d
    @NotNull
    public TipCourierReviewDO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull TipCourierReviewDO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return update instanceof RemoveReviewInitState ? TipCourierReviewDO.copy$default(oldItem, 0L, null, 1, null) : oldItem;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<TipCourierReviewDO> map(@NotNull TipCourierReviewDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(mapToVO(state));
    }
}
