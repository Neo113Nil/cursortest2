package ru.ozon.app.android.pdp.ui.configurators.pdp.tab;

import Ae.C2399j;
import Ae.C2408n0;
import a00.C4908c;
import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.K;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.PdpTabsSelectionState;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject;
import ru.ozon.composer.ui.widget.k;
import xe.M;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 $*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001$B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0004\b\u0017\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0005¢\u0006\u0004\b\u0017\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001eH\u0014¢\u0006\u0004\b\u001c\u0010 R\u0016\u0010\"\u001a\u0004\u0018\u00010!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedWidgetViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedViewObject;", "T", "Lru/ozon/composer/ui/widget/k;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Ll10/i;", "container", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Ll10/i;)V", "", "observeTabSelection", "()V", "item", "bindIfVisible", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedViewObject;)V", "", "widgetGroupId", "", "updateVisibility", "(Ljava/lang/String;)Z", "bind", "Ll20/d;", "info", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedViewObject;Ll20/d;)V", "isShow", "updateLoadingPayload", "(Z)V", "", "views", "(ZLjava/util/List;)V", "Lxe/M;", "scope", "Lxe/M;", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class TabEmbeddedWidgetViewHolder<T extends TabEmbeddedViewObject> extends k<T> {
    private final M scope;

    @NotNull
    protected static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0084\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedWidgetViewHolder$Companion;", "", "<init>", "()V", "LOADER_NOT_SHOWING_ALPHA", "", "LOADER_SHOWING_ALPHA", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    protected static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ TabEmbeddedWidgetViewHolder(View view, ComposerReferences composerReferences, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, composerReferences, (i11 & 4) != 0 ? null : iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindIfVisible(T item) {
        if (updateVisibility(item.getTabGroupId())) {
            bind(item);
        }
    }

    private final void observeTabSelection() {
        M m11 = this.scope;
        if (m11 != null) {
            C2399j.C(new C2408n0(PdpTabsSelectionState.INSTANCE.observeChanges(), new TabEmbeddedWidgetViewHolder$observeTabSelection$1$1(this, null)), m11);
        }
    }

    private final boolean updateVisibility(String widgetGroupId) {
        PdpTabsSelectionState.TabGroup value = PdpTabsSelectionState.INSTANCE.value();
        boolean z11 = true;
        if (widgetGroupId != null && !h.K(widgetGroupId) && value != null && !Intrinsics.d(value.getSelectedGroupId(), widgetGroupId) && value.getGroupIds().contains(widgetGroupId)) {
            z11 = false;
        }
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        itemView.setVisibility(z11 ? 0 : 8);
        if (this.itemView.getLayoutParams() != null) {
            View itemView2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            ViewGroup.LayoutParams layoutParams = itemView2.getLayoutParams();
            int i11 = layoutParams.height;
            int i12 = z11 ? -2 : 0;
            layoutParams.height = i12;
            if (i11 != i12) {
                itemView2.setLayoutParams(layoutParams);
            }
        }
        View view = this.itemView;
        ConstraintLayout constraintLayout = view instanceof ConstraintLayout ? (ConstraintLayout) view : null;
        if (constraintLayout != null) {
            constraintLayout.setMaxHeight(z11 ? Integer.MAX_VALUE : 0);
        }
        return z11;
    }

    public abstract void bind(@NotNull T item);

    protected void updateLoadingPayload(boolean isShow) {
        this.itemView.setAlpha(isShow ? 0.4f : 1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabEmbeddedWidgetViewHolder(@NotNull View containerView, ComposerReferences composerReferences, i iVar) {
        super(containerView);
        C4911f Q11;
        C4908c g10;
        C4911f container;
        C4908c g11;
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.scope = (composerReferences == null || (container = composerReferences.getContainer()) == null || (g11 = container.g()) == null) ? (iVar == null || (Q11 = iVar.Q()) == null || (g10 = Q11.g()) == null) ? null : K.a(g10) : K.a(g11);
        observeTabSelection();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public final void bind(@NotNull T item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindIfVisible(item);
    }

    protected void updateLoadingPayload(boolean isShow, @NotNull List<? extends View> views) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator<T> it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setAlpha(isShow ? 0.4f : 1.0f);
        }
    }
}
