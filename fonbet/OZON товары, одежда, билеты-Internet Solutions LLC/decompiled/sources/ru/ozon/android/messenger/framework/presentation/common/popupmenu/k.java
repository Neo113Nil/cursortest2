package ru.ozon.android.messenger.framework.presentation.common.popupmenu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.h;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.MessengerMetricsRecyclerView;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.r;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.uni.android.atom.icon.IconView;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.popupmenu.action.f f90916a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.a f90917b;

    /* renamed from: c, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.analytics.i f90918c;

    /* renamed from: d, reason: collision with root package name */
    private n f90919d;

    public k(ru.ozon.android.messenger.framework.presentation.common.popupmenu.action.f popupMenuActionsFactory, ru.ozon.android.messenger.framework.navigation.controller.a messengerController, ru.ozon.android.messenger.framework.analytics.i iVar) {
        ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.i popupMenuLayoutStateFactory = new ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.i();
        Intrinsics.checkNotNullParameter(popupMenuActionsFactory, "popupMenuActionsFactory");
        Intrinsics.checkNotNullParameter(messengerController, "messengerController");
        Intrinsics.checkNotNullParameter(popupMenuLayoutStateFactory, "popupMenuLayoutStateFactory");
        this.f90916a = popupMenuActionsFactory;
        this.f90917b = messengerController;
        this.f90918c = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i11, View itemView, ViewGroup selectionView, s sVar, List actions, Function0 function0, Function0 function02) {
        boolean z11;
        boolean z12;
        Map<String, MessengerTrackingInfo> map;
        RecyclerView recyclerView;
        int i12;
        int i13;
        ViewGroup viewGroup;
        ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.h bVar;
        n nVar;
        List<ContextMenuDTO.ContextMenuItem> additionalMenuItems;
        ru.ozon.android.messenger.framework.analytics.i iVar;
        ContextMenuDTO g10;
        ContextMenuDTO g11;
        int i14;
        int i15;
        Context context = selectionView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.a aVar = new ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.a(context);
        h onClickListener = new h(this, function02);
        i dismissBlock = new i(this, function02);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(selectionView, "bubbleContainer");
        Intrinsics.checkNotNullParameter(selectionView, "selectionView");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        Intrinsics.checkNotNullParameter(dismissBlock, "dismissBlock");
        boolean z13 = sVar != null && sVar.p();
        boolean z14 = (sVar == null || sVar.p()) ? false : true;
        IconView iconView = (IconView) itemView.findViewById(R$id.avatarIv);
        if (iconView != null) {
            Intrinsics.checkNotNullParameter(iconView, "<this>");
            if (iconView.getVisibility() == 0) {
                z11 = true;
                boolean z15 = true;
                boolean z16 = itemView.getHeight() <= i11;
                int left = selectionView.getLeft();
                Intrinsics.checkNotNullParameter(selectionView, "<this>");
                int[] iArr = new int[2];
                selectionView.getLocationInWindow(iArr);
                int i16 = iArr[1];
                Context context2 = selectionView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Intrinsics.checkNotNullParameter(context2, "<this>");
                boolean z17 = z16;
                int identifier = context2.getResources().getIdentifier("status_bar_height", "dimen", "android");
                int dimensionPixelSize = i16 - (identifier <= 0 ? context2.getResources().getDimensionPixelSize(identifier) : 0);
                if (i11 >= itemView.getHeight()) {
                    int height = i11 - itemView.getHeight();
                    int size = actions.size();
                    i14 = ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.a.f90921e;
                    int i17 = i14 * size;
                    i15 = ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.a.f90922f;
                    if (height < i15 + i17) {
                        z12 = true;
                        ViewParent parent = itemView.getParent();
                        map = null;
                        recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
                        if (recyclerView == null) {
                            bVar = new h.b(dismissBlock);
                        } else {
                            int height2 = recyclerView.getHeight() - itemView.getBottom();
                            int size2 = actions.size();
                            i12 = ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.a.f90921e;
                            int i18 = i12 * size2;
                            i13 = ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.a.f90922f;
                            if (height2 < i13 + i18) {
                                z15 = false;
                            }
                            if (z17 && z13) {
                                bVar = new h.i.a(selectionView, actions, onClickListener);
                            } else {
                                if (!z17 || !z14) {
                                    if (z12 && z13) {
                                        bVar = new h.e(selectionView, left, dimensionPixelSize, actions, onClickListener);
                                        viewGroup = selectionView;
                                    } else if (z12 && z14) {
                                        viewGroup = selectionView;
                                        bVar = new h.C1696h(viewGroup, left, dimensionPixelSize, z11, actions, onClickListener);
                                    } else if (!z15 && z13) {
                                        viewGroup = selectionView;
                                        bVar = new h.d(viewGroup, left, dimensionPixelSize, actions, onClickListener);
                                    } else if (!z15 && z14) {
                                        viewGroup = selectionView;
                                        bVar = new h.g(viewGroup, left, dimensionPixelSize, actions, onClickListener);
                                    } else if (z15 && z13) {
                                        viewGroup = selectionView;
                                        bVar = new h.c(viewGroup, left, dimensionPixelSize, actions, onClickListener);
                                    } else if (z15 && z14) {
                                        viewGroup = selectionView;
                                        bVar = new h.f(viewGroup, left, dimensionPixelSize, actions, onClickListener);
                                    } else {
                                        viewGroup = selectionView;
                                        bVar = new h.b(dismissBlock);
                                    }
                                    bVar.a(aVar, new g(this, function02));
                                    n nVar2 = new n(aVar);
                                    this.f90919d = nVar2;
                                    nVar2.d(function02);
                                    nVar = this.f90919d;
                                    if (nVar != null) {
                                        nVar.e(viewGroup);
                                    }
                                    n.f91009b = Boolean.TRUE;
                                    additionalMenuItems = (sVar != null || (g11 = sVar.g()) == null) ? null : g11.getAdditionalMenuItems();
                                    iVar = this.f90918c;
                                    if (additionalMenuItems != null) {
                                        Iterator<T> it = additionalMenuItems.iterator();
                                        while (it.hasNext()) {
                                            Map<String, MessengerTrackingInfo> trackingInfo = ((ContextMenuDTO.ContextMenuItem) it.next()).getTrackingInfo();
                                            if (trackingInfo != null && trackingInfo.containsKey("view") && iVar != null) {
                                                ru.ozon.android.messenger.framework.analytics.h.f(iVar, trackingInfo);
                                            }
                                        }
                                    }
                                    if (sVar != null && (g10 = sVar.g()) != null) {
                                        map = g10.getTrackingInfo();
                                    }
                                    if (map != null && iVar != null) {
                                        ru.ozon.android.messenger.framework.analytics.h.f(iVar, map);
                                    }
                                    function0.invoke();
                                }
                                bVar = new h.i.b(selectionView, actions, z11, onClickListener);
                            }
                        }
                        viewGroup = selectionView;
                        bVar.a(aVar, new g(this, function02));
                        n nVar22 = new n(aVar);
                        this.f90919d = nVar22;
                        nVar22.d(function02);
                        nVar = this.f90919d;
                        if (nVar != null) {
                        }
                        n.f91009b = Boolean.TRUE;
                        if (sVar != null) {
                        }
                        iVar = this.f90918c;
                        if (additionalMenuItems != null) {
                        }
                        if (sVar != null) {
                            map = g10.getTrackingInfo();
                        }
                        if (map != null) {
                            ru.ozon.android.messenger.framework.analytics.h.f(iVar, map);
                        }
                        function0.invoke();
                    }
                }
                z12 = false;
                ViewParent parent2 = itemView.getParent();
                map = null;
                if (parent2 instanceof RecyclerView) {
                }
                if (recyclerView == null) {
                }
                viewGroup = selectionView;
                bVar.a(aVar, new g(this, function02));
                n nVar222 = new n(aVar);
                this.f90919d = nVar222;
                nVar222.d(function02);
                nVar = this.f90919d;
                if (nVar != null) {
                }
                n.f91009b = Boolean.TRUE;
                if (sVar != null) {
                }
                iVar = this.f90918c;
                if (additionalMenuItems != null) {
                }
                if (sVar != null) {
                }
                if (map != null) {
                }
                function0.invoke();
            }
        }
        z11 = false;
        boolean z152 = true;
        if (itemView.getHeight() <= i11) {
        }
        int left2 = selectionView.getLeft();
        Intrinsics.checkNotNullParameter(selectionView, "<this>");
        int[] iArr2 = new int[2];
        selectionView.getLocationInWindow(iArr2);
        int i162 = iArr2[1];
        Context context22 = selectionView.getContext();
        Intrinsics.checkNotNullExpressionValue(context22, "getContext(...)");
        Intrinsics.checkNotNullParameter(context22, "<this>");
        boolean z172 = z16;
        int identifier2 = context22.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize2 = i162 - (identifier2 <= 0 ? context22.getResources().getDimensionPixelSize(identifier2) : 0);
        if (i11 >= itemView.getHeight()) {
        }
        z12 = false;
        ViewParent parent22 = itemView.getParent();
        map = null;
        if (parent22 instanceof RecyclerView) {
        }
        if (recyclerView == null) {
        }
        viewGroup = selectionView;
        bVar.a(aVar, new g(this, function02));
        n nVar2222 = new n(aVar);
        this.f90919d = nVar2222;
        nVar2222.d(function02);
        nVar = this.f90919d;
        if (nVar != null) {
        }
        n.f91009b = Boolean.TRUE;
        if (sVar != null) {
        }
        iVar = this.f90918c;
        if (additionalMenuItems != null) {
        }
        if (sVar != null) {
        }
        if (map != null) {
        }
        function0.invoke();
    }

    public final void d() {
        n nVar = this.f90919d;
        if (nVar != null) {
            nVar.dismiss();
        }
        this.f90919d = null;
    }

    public final boolean e() {
        n nVar = this.f90919d;
        if (nVar != null) {
            return nVar.isShowing();
        }
        return false;
    }

    public final void g(@NotNull MessengerMetricsRecyclerView messengerMetricsRecyclerView, @NotNull q itemVO, int i11, @NotNull Function0 onShow, @NotNull Function0 onDismiss) {
        RecyclerView.C findViewHolderForAdapterPosition;
        View view;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        Intrinsics.checkNotNullParameter(messengerMetricsRecyclerView, "<this>");
        Intrinsics.checkNotNullParameter(itemVO, "itemVO");
        Intrinsics.checkNotNullParameter(onShow, "onShow");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        List<ru.ozon.android.messenger.framework.presentation.common.popupmenu.action.c> a11 = this.f90916a.a(itemVO);
        if (a11 != null) {
            ViewParent parent = messengerMetricsRecyclerView.getParent();
            ConstraintLayout constraintLayout = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
            if (constraintLayout == null || (findViewHolderForAdapterPosition = messengerMetricsRecyclerView.findViewHolderForAdapterPosition(i11)) == null || (view = findViewHolderForAdapterPosition.itemView) == null || (viewGroup = (ViewGroup) view.findViewById(R$id.bubbleContainerLl)) == null || (viewGroup2 = (ViewGroup) constraintLayout.findViewById(R$id.headerContainerLl)) == null || (viewGroup3 = (ViewGroup) constraintLayout.findViewById(R$id.bottomContainerLl)) == null) {
                return;
            }
            RecyclerView.o layoutManager = messengerMetricsRecyclerView.getLayoutManager();
            Intrinsics.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            int height = (constraintLayout.getHeight() - viewGroup2.getHeight()) - viewGroup3.getHeight();
            boolean z11 = false;
            boolean z12 = messengerMetricsRecyclerView.getHeight() < view.getHeight();
            boolean z13 = (i11 < findFirstCompletelyVisibleItemPosition || i11 > findLastCompletelyVisibleItemPosition) && !z12;
            if (z12 && view.getTop() < 0) {
                z11 = true;
            }
            if (!z13 && !z11) {
                f(height, view, viewGroup, r.f(itemVO), a11, onShow, onDismiss);
                return;
            }
            s f7 = r.f(itemVO);
            messengerMetricsRecyclerView.smoothScrollToPosition(i11);
            messengerMetricsRecyclerView.addOnScrollListener(new j(this, height, view, viewGroup, f7, a11, onShow, onDismiss, messengerMetricsRecyclerView));
        }
    }
}
