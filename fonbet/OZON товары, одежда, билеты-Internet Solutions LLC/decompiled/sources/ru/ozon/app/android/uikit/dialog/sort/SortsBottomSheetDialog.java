package ru.ozon.app.android.uikit.dialog.sort;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.R$layout;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.app.android.uikit.databinding.FragmentSortsBottomSheetDialogBinding;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0012\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\u0003J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0010H\u0016¢\u0006\u0004\b+\u0010,R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Lru/ozon/app/android/uikit/dialog/sort/SortsBottomSheetDialog;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "", "setUpDialogWindowFlags", "initViews", "initArguments", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "setupTitle", "(Ljava/lang/String;)V", "", "Lru/ozon/app/android/uikit/dialog/sort/SortItem;", "items", "Lkotlin/Function1;", "", "onSelected", "setupItems", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "resultCode", "selectedPosition", "sendResult", "(II)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onActivityCreated", "(Landroid/os/Bundle;)V", "onDestroyView", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "getTheme", "()I", "Ljava/util/List;", "Landroid/content/Intent;", "resultIntent", "Landroid/content/Intent;", "Ljava/lang/String;", "Lru/ozon/app/android/uikit/databinding/FragmentSortsBottomSheetDialogBinding;", "mBinding", "Lru/ozon/app/android/uikit/databinding/FragmentSortsBottomSheetDialogBinding;", "getBinding", "()Lru/ozon/app/android/uikit/databinding/FragmentSortsBottomSheetDialogBinding;", "binding", "Companion", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SortsBottomSheetDialog extends b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private List<SortItem> items;
    private FragmentSortsBottomSheetDialogBinding mBinding;
    private Intent resultIntent;
    private String title;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/uikit/dialog/sort/SortsBottomSheetDialog$Companion;", "", "<init>", "()V", "KEY_SELECTED_POSITION", "", "KEY_SORTS_DEEPLINK_ARRAY", "KEY_YEARS_DEEPLINK_ARRAY", "KEY_SORTS_EVENTS_ARRAY", "ACTION_REQUEST_CODE", "", "KEY_ITEMS", "KEY_TITLE", "KEY_RESULT_INTENT", "newInstance", "Lru/ozon/app/android/uikit/dialog/sort/SortsBottomSheetDialog;", "items", "", "Lru/ozon/app/android/uikit/dialog/sort/SortItem;", "resultIntent", "Landroid/content/Intent;", SelectionItemFormDTO.TITLE_FIELD_NAME, "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SortsBottomSheetDialog newInstance$default(Companion companion, List list, Intent intent, String str, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str = null;
            }
            return companion.newInstance(list, intent, str);
        }

        @NotNull
        public final SortsBottomSheetDialog newInstance(@NotNull List<SortItem> items, @NotNull Intent resultIntent, String title) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
            SortsBottomSheetDialog sortsBottomSheetDialog = new SortsBottomSheetDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("KEY_ITEMS", new ArrayList<>(items));
            bundle.putString("KEY_TITLE", title);
            bundle.putParcelable("KEY_RESULT_INTENT", resultIntent);
            sortsBottomSheetDialog.setArguments(bundle);
            return sortsBottomSheetDialog;
        }

        private Companion() {
        }
    }

    private final FragmentSortsBottomSheetDialogBinding getBinding() {
        FragmentSortsBottomSheetDialogBinding fragmentSortsBottomSheetDialogBinding = this.mBinding;
        Intrinsics.f(fragmentSortsBottomSheetDialogBinding);
        return fragmentSortsBottomSheetDialogBinding;
    }

    private final void initArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("KEY_ITEMS");
            if (parcelableArrayList == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.items = parcelableArrayList;
            Parcelable parcelable = arguments.getParcelable("KEY_RESULT_INTENT");
            if (parcelable == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.resultIntent = (Intent) parcelable;
            this.title = arguments.getString("KEY_TITLE");
        }
    }

    private final void initViews() {
        setupTitle(this.title);
        List<SortItem> list = this.items;
        if (list != null) {
            setupItems(list, new SortsBottomSheetDialog$initViews$1(this));
        } else {
            Intrinsics.n("items");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendResult(int resultCode, int selectedPosition) {
        Intent intent = this.resultIntent;
        if (intent == null) {
            Intrinsics.n("resultIntent");
            throw null;
        }
        intent.putExtra("KEY_SELECTED_POSITION", selectedPosition);
        ComponentCallbacksC5392m targetFragment = getTargetFragment();
        if (targetFragment != null) {
            targetFragment.onActivityResult(getTargetRequestCode(), resultCode, intent);
        }
    }

    private final void setUpDialogWindowFlags() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.clearFlags(67108864);
        window.addFlags(LinearLayoutManager.INVALID_OFFSET);
        window.setStatusBarColor(0);
        window.setLayout(-1, -1);
    }

    private final void setupItems(List<SortItem> items, Function1<? super Integer, Unit> onSelected) {
        RecyclerView recyclerView = getBinding().itemsRv;
        recyclerView.setAdapter(new SortsAdapter(items, new SortsBottomSheetDialog$setupItems$1$1(onSelected, recyclerView)));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        Drawable drawable = a.getDrawable(recyclerView.getContext(), R$drawable.list_divider);
        if (drawable != null) {
            recyclerView.addItemDecoration(new SortsDividerItemDecorator(drawable));
        }
    }

    private final void setupTitle(String title) {
        TextView titleTv = getBinding().titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextViewExtKt.setTextOrGone(titleTv, title);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public int getTheme() {
        return R$style.OzonBottomSheetDialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ViewParent parent = requireView().getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
        BottomSheetBehavior.from((FrameLayout) parent).setState(3);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onCancel(dialog);
        sendResult(0, -1);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R$layout.fragment_sorts_bottom_sheet_dialog, container, false);
        this.mBinding = FragmentSortsBottomSheetDialogBinding.bind(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.mBinding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        setUpDialogWindowFlags();
        initArguments();
        initViews();
    }
}
