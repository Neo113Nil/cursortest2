package ru.ozon.app.android.storefront.widgets.stickyScroll.core;

import A00.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import j10.h;
import java.util.List;
import k20.C7471c;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.events.AnchorVisibleEvent;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.base.ComposerInflater;
import ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2;
import ru.ozon.app.android.storefront.R$layout;
import ru.ozon.app.android.storefront.widgets.stickyScroll.data.ScrollEvent;
import ru.ozon.app.android.storefront.widgets.stickyScroll.data.StickyScrollDTO;
import ru.ozon.app.android.storefront.widgets.stickyScroll.presentation.StickyScrollVO;
import ru.ozon.app.android.storefront.widgets.stickyScroll.presentation.StickyScrollViewHolder;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00140\u0013j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001cj\b\u0012\u0004\u0012\u00020\u0002`\u001d2\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010#\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00032\n\u0010\"\u001a\u00060\u0014j\u0002`!2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b.\u0010/J'\u00103\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R6\u0010>\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060;j\u0002`<\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050=0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR(\u0010D\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020C0B0=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR,\u0010H\u001a\u0014\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010?\u001a\u0004\bI\u0010A¨\u0006J"}, d2 = {"Lru/ozon/app/android/storefront/widgets/stickyScroll/core/StickyScrollViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/BottomContainerViewMapper2;", "", "Lru/ozon/app/android/storefront/widgets/stickyScroll/presentation/StickyScrollViewHolder;", "Lru/ozon/app/android/storefront/widgets/stickyScroll/data/StickyScrollDTO;", "Lru/ozon/app/android/storefront/widgets/stickyScroll/presentation/StickyScrollVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "rootView", "Ll10/b;", "controller", "", "createAndAttachListener", "(Landroid/view/ViewGroup;Ll10/b;)V", "Lru/ozon/app/android/composer/widgets/base/ComposerInflater;", "composerInflater", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "createHolder", "(Lru/ozon/app/android/composer/widgets/base/ComposerInflater;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)Lru/ozon/app/android/storefront/widgets/stickyScroll/presentation/StickyScrollViewHolder;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "holder", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "bind", "(Lru/ozon/app/android/storefront/widgets/stickyScroll/presentation/StickyScrollViewHolder;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "root", "afterChange", "(Ll10/i;)V", "onRefresh", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroid/view/View;", "view", "composerRootView", "onViewRemoved", "(Landroid/view/View;Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroidx/recyclerview/widget/RecyclerView$t;", "onScrollListener", "Landroidx/recyclerview/widget/RecyclerView$t;", "shouldSendEvents", "Z", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "LA00/a$J$a;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "updateConsumer", "getUpdateConsumer", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StickyScrollViewMapper extends BottomContainerViewMapper2 {
    private RecyclerView.t onScrollListener;
    private boolean shouldSendEvents = true;

    @NotNull
    private final Function2<StickyScrollDTO, d, List<StickyScrollVO>> mapper = new StickyScrollMapper();

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(AnchorVisibleEvent.class, ScrollEvent.class);

    @NotNull
    private final Function2<a.J.InterfaceC0007a, StickyScrollVO, StickyScrollVO> updateConsumer = new StickyScrollViewMapper$updateConsumer$1(this);

    private final void createAndAttachListener(final ViewGroup rootView, final InterfaceC7851b controller) {
        RecyclerView.t tVar = this.onScrollListener;
        if (tVar != null) {
            ComposerViewExtensionKt.composerRecyclerView(rootView).removeOnScrollListener(tVar);
        }
        RecyclerView.t tVar2 = new RecyclerView.t() { // from class: ru.ozon.app.android.storefront.widgets.stickyScroll.core.StickyScrollViewMapper$createAndAttachListener$2
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                boolean z11;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 1) {
                    z11 = StickyScrollViewMapper.this.shouldSendEvents;
                    if (z11) {
                        controller.update(new ScrollEvent());
                    }
                    ComposerViewExtensionKt.composerRecyclerView(rootView).removeOnScrollListener(this);
                }
            }
        };
        this.onScrollListener = tVar2;
        ComposerViewExtensionKt.composerRecyclerView(rootView).addOnScrollListener(tVar2);
    }

    @Override // c20.s
    protected void afterChange(@NotNull i root) {
        Intrinsics.checkNotNullParameter(root, "root");
        createAndAttachListener(root.Z(), root.M());
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof StickyScrollDTO;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2
    public /* bridge */ /* synthetic */ k createHolder(ComposerInflater composerInflater, ComposerReferences composerReferences, h hVar) {
        return createHolder(composerInflater, composerReferences, (h<l>) hVar);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<StickyScrollDTO, d, List<StickyScrollVO>> getMapper() {
        return this.mapper;
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<a.J.InterfaceC0007a, StickyScrollVO, StickyScrollVO> getUpdateConsumer() {
        return this.updateConsumer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    public void onRefresh(@NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(references, "references");
        super.onRefresh(references);
        this.shouldSendEvents = true;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2
    public void onViewRemoved(@NotNull View view, @NotNull ViewGroup composerRootView, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        super.onViewRemoved(view, composerRootView, references);
        RecyclerView.t tVar = this.onScrollListener;
        if (tVar != null) {
            ComposerViewExtensionKt.composerRecyclerView(composerRootView).removeOnScrollListener(tVar);
        }
        this.onScrollListener = null;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return C7471c.f70357c;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.MultiplyNoUIViewMapper2
    public void bind(@NotNull StickyScrollViewHolder holder, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        c d11 = viewObject.d();
        StickyScrollVO stickyScrollVO = d11 instanceof StickyScrollVO ? (StickyScrollVO) d11 : null;
        if (stickyScrollVO == null) {
            return;
        }
        k.bindItem$default(holder, stickyScrollVO, viewObject.c(), null, 4, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2
    @NotNull
    public StickyScrollViewHolder createHolder(@NotNull ComposerInflater composerInflater, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerInflater, "composerInflater");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        return new StickyScrollViewHolder(composerInflater.inflate(R$layout.widget_sticky_scroll), references);
    }
}
