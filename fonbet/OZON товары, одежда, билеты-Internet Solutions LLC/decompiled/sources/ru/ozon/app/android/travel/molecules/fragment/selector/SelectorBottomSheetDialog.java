package ru.ozon.app.android.travel.molecules.fragment.selector;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.a;
import androidx.core.os.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.fragment.selector.adapter.SelectorAdapter;
import ru.ozon.app.android.travel.molecules.fragment.selector.adapter.SelectorDividerItemDecorator;
import ru.ozon.app.android.travel.molecules.fragment.selector.view.SelectorBottomSheetDialogView;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.view.dialog.OzonBottomSheetDialog;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00192\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorBottomSheetDialog;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "", "initArguments", "Lru/ozon/app/android/travel/molecules/fragment/selector/view/SelectorBottomSheetDialogView;", "view", "initViews", "(Lru/ozon/app/android/travel/molecules/fragment/selector/view/SelectorBottomSheetDialogView;)V", "Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorItem;", "selectedItem", "sendResult", "(Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorItem;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lru/ozon/app/android/uikit/view/dialog/OzonBottomSheetDialog;", "onCreateDialog", "(Landroid/os/Bundle;)Lru/ozon/app/android/uikit/view/dialog/OzonBottomSheetDialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Ljava/lang/String;", "", "items", "Ljava/util/List;", "Companion", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectorBottomSheetDialog extends b {

    @NotNull
    private List<SelectorItem> items = K.f71697a;
    private String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorBottomSheetDialog$Companion;", "", "<init>", "()V", "KEY_SELECTED_ITEM", "", "REQUEST_KEY", "KEY_TITLE", "KEY_ITEMS", "newInstance", "Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorBottomSheetDialog;", SelectionItemFormDTO.TITLE_FIELD_NAME, "items", "", "Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorItem;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SelectorBottomSheetDialog newInstance(@NotNull String title, @NotNull List<SelectorItem> items) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            SelectorBottomSheetDialog selectorBottomSheetDialog = new SelectorBottomSheetDialog();
            Bundle bundle = new Bundle();
            bundle.putString("KEY_TITLE", title);
            bundle.putParcelableArrayList("KEY_ITEMS", new ArrayList<>(items));
            selectorBottomSheetDialog.setArguments(bundle);
            return selectorBottomSheetDialog;
        }

        private Companion() {
        }
    }

    private final void initArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.title = arguments.getString("KEY_TITLE");
            List<SelectorItem> parcelableArrayList = arguments.getParcelableArrayList("KEY_ITEMS");
            if (parcelableArrayList == null) {
                parcelableArrayList = K.f71697a;
            }
            this.items = parcelableArrayList;
        }
    }

    private final void initViews(SelectorBottomSheetDialogView view) {
        RecyclerView recyclerView;
        view.bindTitle(this.title);
        recyclerView = view.selectorRv;
        recyclerView.setAdapter(new SelectorAdapter(this.items, new SelectorBottomSheetDialog$initViews$1$1(this)));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        Drawable drawable = a.getDrawable(recyclerView.getContext(), R$drawable.list_divider);
        if (drawable != null) {
            recyclerView.addItemDecoration(new SelectorDividerItemDecorator(drawable));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendResult(SelectorItem selectedItem) {
        getParentFragmentManager().m1(d.b(new Pair("KEY_SELECTED_ITEM", selectedItem)), "SelectorBottomSheetDialog.RequestKey");
        dismiss();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onCancel(dialog);
        Bundle EMPTY = Bundle.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        getParentFragmentManager().m1(EMPTY, "SelectorBottomSheetDialog.RequestKey");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArguments();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new SelectorBottomSheetDialogView(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        initViews((SelectorBottomSheetDialogView) view);
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public OzonBottomSheetDialog onCreateDialog(Bundle savedInstanceState) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return new OzonBottomSheetDialog(requireContext, 0, 0, true, null, true, true, false, null, false, 918, null);
    }
}
