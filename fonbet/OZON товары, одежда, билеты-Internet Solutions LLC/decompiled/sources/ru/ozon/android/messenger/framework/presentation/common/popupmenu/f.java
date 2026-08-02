package ru.ozon.android.messenger.framework.presentation.common.popupmenu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.a f90898a;

    /* renamed from: b, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.analytics.i f90899b;

    /* renamed from: c, reason: collision with root package name */
    private n f90900c;

    public f(@NotNull ru.ozon.android.messenger.framework.presentation.common.popupmenu.action.d popupMenuActionsFactory, @NotNull ru.ozon.android.messenger.framework.navigation.controller.a messengerController, ru.ozon.android.messenger.framework.analytics.i iVar) {
        Intrinsics.checkNotNullParameter(popupMenuActionsFactory, "popupMenuActionsFactory");
        Intrinsics.checkNotNullParameter(messengerController, "messengerController");
        this.f90898a = messengerController;
        this.f90899b = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(View view, ArrayList arrayList, ContextMenuDTO contextMenuDTO, Function0 function0, Function0 function02) {
        int i11;
        int i12;
        int i13;
        ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.c cVar;
        ru.ozon.android.messenger.framework.analytics.i iVar;
        int i14;
        Context context = view.getContext();
        Intrinsics.f(context);
        ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.a aVar = new ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.a(context);
        Intrinsics.checkNotNullParameter(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i15 = iArr[1];
        Intrinsics.checkNotNullParameter(context, "<this>");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = i15 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
        int size = arrayList.size();
        i11 = ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.a.f90921e;
        int i16 = i11 * size;
        i12 = ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.a.f90922f;
        int i17 = i12 + i16;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        boolean z11 = viewGroup.getHeight() - view.getBottom() >= i17;
        d dVar = new d(this, function02);
        aVar.o(view);
        aVar.n(0, dimensionPixelSize);
        aVar.j(R$drawable.m_bg_popup_menu_layout_selection_chat);
        aVar.g(arrayList, new a(this, dVar));
        if (z11) {
            i14 = ru.ozon.android.messenger.utils.e.f91911h;
            cVar = new b(i14, false, false);
        } else {
            i13 = ru.ozon.android.messenger.utils.e.f91911h;
            cVar = new c(i13, true, false);
        }
        aVar.h(cVar);
        aVar.i(dVar);
        aVar.p(false);
        n nVar = new n(aVar);
        this.f90900c = nVar;
        nVar.d(function02);
        n nVar2 = this.f90900c;
        if (nVar2 != null) {
            nVar2.e(view);
        }
        n.f91009b = Boolean.TRUE;
        List<ContextMenuDTO.ContextMenuItem> additionalMenuItems = contextMenuDTO.getAdditionalMenuItems();
        if (additionalMenuItems != null) {
            Iterator<T> it = additionalMenuItems.iterator();
            while (it.hasNext()) {
                Map<String, MessengerTrackingInfo> trackingInfo = ((ContextMenuDTO.ContextMenuItem) it.next()).getTrackingInfo();
                if (trackingInfo != null && (iVar = this.f90899b) != null) {
                    ru.ozon.android.messenger.framework.analytics.h.f(iVar, trackingInfo);
                }
            }
        }
        function0.invoke();
    }

    public final void d() {
        n nVar = this.f90900c;
        if (nVar != null) {
            nVar.dismiss();
        }
        this.f90900c = null;
    }

    public final boolean e() {
        n nVar = this.f90900c;
        if (nVar != null) {
            return nVar.isShowing();
        }
        return false;
    }

    public final void g(@NotNull RecyclerView recyclerView, ContextMenuDTO contextMenuDTO, int i11, @NotNull Function0<Unit> onShow, @NotNull Function0<Unit> onDismiss) {
        ArrayList arrayList;
        RecyclerView.C findViewHolderForAdapterPosition;
        View view;
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(onShow, "onShow");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        List<ContextMenuDTO.ContextMenuItem> additionalMenuItems = contextMenuDTO.getAdditionalMenuItems();
        List<ContextMenuDTO.ContextMenuItem> list = additionalMenuItems;
        if (list == null || list.isEmpty()) {
            arrayList = null;
        } else {
            List<ContextMenuDTO.ContextMenuItem> list2 = additionalMenuItems;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
            int i12 = 0;
            for (Object obj : list2) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C7714v.O0();
                    throw null;
                }
                ContextMenuDTO.ContextMenuItem contextMenuItem = (ContextMenuDTO.ContextMenuItem) obj;
                OzonSpannableString text = contextMenuItem.getTitle().getText();
                String textColor = contextMenuItem.getTitle().getTextColor();
                if (textColor == null) {
                    textColor = "textPrimary";
                }
                String str = textColor;
                String icon = contextMenuItem.getIcon().getIcon();
                String tintColor = contextMenuItem.getIcon().getTintColor();
                if (tintColor == null) {
                    tintColor = "graphicTertiary";
                }
                arrayList2.add(ru.ozon.android.messenger.framework.presentation.common.popupmenu.action.e.a(text, icon, contextMenuItem.getAction(), i12 != C7714v.P(additionalMenuItems), str, tintColor, contextMenuItem.getTrackingInfo()));
                i12 = i13;
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i11)) == null || (view = findViewHolderForAdapterPosition.itemView) == null) {
            return;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        if (findFirstCompletelyVisibleItemPosition <= i11 && i11 <= findLastCompletelyVisibleItemPosition) {
            f(view, arrayList, contextMenuDTO, onShow, onDismiss);
        } else {
            recyclerView.smoothScrollToPosition(i11);
            recyclerView.addOnScrollListener(new e(this, view, arrayList, contextMenuDTO, onShow, onDismiss, recyclerView));
        }
    }
}
