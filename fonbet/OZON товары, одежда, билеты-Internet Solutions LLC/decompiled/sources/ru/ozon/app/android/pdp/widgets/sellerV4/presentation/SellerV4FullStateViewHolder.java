package ru.ozon.app.android.pdp.widgets.sellerV4.presentation;

import A00.a;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.C5423j;
import androidx.lifecycle.T;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.pdp.widgets.sellerV4.presentation.SellerV4FullStateViewHolder;
import ru.ozon.app.android.pdp.widgets.sellerV4.presentation.scrollable.ScrollableAdapter;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0002J\b\u0010\u001c\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/SellerV4FullStateViewHolder;", "Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/SellerV4BaseViewHolder;", "sellerV4ViewGroup", "Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/SellerV4ViewGroup;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "inhibitor", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "frameBinder", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "<init>", "(Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/SellerV4ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;)V", "steps", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "afterRefresh", "", "bind", "", "item", "Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/SellerV4VO;", "onAttach", "onDetach", "onOffscreenPositionChanged", "offscreenOffsetPercent", "", "onRecycle", "baseBind", "bindSellerGroup", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerV4FullStateViewHolder extends SellerV4BaseViewHolder {
    private boolean afterRefresh;

    @NotNull
    private final FrameBinder frameBinder;

    @NotNull
    private final SellerV4ViewGroup sellerV4ViewGroup;

    @NotNull
    private final List<BindStep> steps;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$u$c;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(LA00/a$u$c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.sellerV4.presentation.SellerV4FullStateViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<a.u.c, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(a.u.c cVar) {
            invoke2(cVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(a.u.c cVar) {
            SellerV4FullStateViewHolder.this.afterRefresh = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerV4FullStateViewHolder(@NotNull SellerV4ViewGroup sellerV4ViewGroup, @NotNull ComposerReferences refs, @NotNull HandlersInhibitor inhibitor, @NotNull FrameBinder frameBinder) {
        super(sellerV4ViewGroup.getSellerDisclosureView(), sellerV4ViewGroup, refs, inhibitor);
        View view;
        Intrinsics.checkNotNullParameter(sellerV4ViewGroup, "sellerV4ViewGroup");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        this.sellerV4ViewGroup = sellerV4ViewGroup;
        this.frameBinder = frameBinder;
        this.steps = C7714v.b0(new BindStep() { // from class: QE.a
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit steps$lambda$0;
                steps$lambda$0 = SellerV4FullStateViewHolder.steps$lambda$0(SellerV4FullStateViewHolder.this);
                return steps$lambda$0;
            }
        }, new BindStep() { // from class: QE.b
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit steps$lambda$1;
                steps$lambda$1 = SellerV4FullStateViewHolder.steps$lambda$1(SellerV4FullStateViewHolder.this);
                return steps$lambda$1;
            }
        });
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        frameBinder.init(itemView);
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        frameBinder.applyRecycler((c11 == null || (view = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view));
        sellerV4ViewGroup.setViewPool(refs.getComposerViewPoolProvider().getViewPool());
        sellerV4ViewGroup.setScrollableAdapter(new ScrollableAdapter(getActionHandler()));
        C5423j events = refs.getController().getEvents();
        T t2 = new T();
        t2.a(events, new SellerV4FullStateViewHolder$inlined$sam$i$androidx_lifecycle_Observer$0(new SellerV4FullStateViewHolder$special$$inlined$filterIsInstance$1(t2)));
        t2.observe(refs.getContainer().g(), new SellerV4FullStateViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
    }

    private final void baseBind() {
        SellerV4VO boundedData = getBoundedData();
        if (boundedData != null) {
            super.bind(boundedData);
        }
    }

    private final void bindSellerGroup() {
        SellerV4VO boundedData = getBoundedData();
        if (boundedData != null) {
            if (this.afterRefresh) {
                RecyclerView scrollableView = this.sellerV4ViewGroup.getScrollableView();
                if (scrollableView != null) {
                    scrollableView.scrollToPosition(0);
                }
                this.afterRefresh = false;
            }
            this.sellerV4ViewGroup.bind(boundedData, getActionHandler());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$0(SellerV4FullStateViewHolder sellerV4FullStateViewHolder) {
        sellerV4FullStateViewHolder.baseBind();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$1(SellerV4FullStateViewHolder sellerV4FullStateViewHolder) {
        sellerV4FullStateViewHolder.bindSellerGroup();
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.pdp.widgets.sellerV4.presentation.SellerV4BaseViewHolder
    public void bind(@NotNull SellerV4VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.frameBinder.bind(this.steps, item.getViewItemKey());
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        FrameBinder.DefaultImpls.onAttach$default(this.frameBinder, null, 1, null);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.frameBinder.onDetach();
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.frameBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.frameBinder.onRecycle();
    }
}
