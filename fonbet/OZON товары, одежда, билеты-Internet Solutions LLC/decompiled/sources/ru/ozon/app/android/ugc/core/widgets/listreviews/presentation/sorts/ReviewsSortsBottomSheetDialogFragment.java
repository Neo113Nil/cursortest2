package ru.ozon.app.android.ugc.core.widgets.listreviews.presentation.sorts;

import FM.a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.pdp.ui.configurators.ugc.bottomsheets.ReviewBottomSheetDialog;
import ru.ozon.app.android.ugc.core.R$string;
import ru.ozon.app.android.ugc.core.databinding.FragmentBottomSheetSortsBinding;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 82\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\u0003J\u000f\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/listreviews/presentation/sorts/ReviewsSortsBottomSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "", "initViews", "initArguments", "bindApplySortButton", "bindAtomsLayout", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "updateRadioCellItemsOnAction", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "", "resultCode", "selectedPosition", "sendResult", "(II)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/bottomsheets/ReviewBottomSheetDialog;", "onCreateDialog", "(Landroid/os/Bundle;)Lru/ozon/app/android/pdp/ui/configurators/ugc/bottomsheets/ReviewBottomSheetDialog;", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "onDestroyView", "getTheme", "()I", "Lru/ozon/app/android/ugc/core/databinding/FragmentBottomSheetSortsBinding;", "_binding", "Lru/ozon/app/android/ugc/core/databinding/FragmentBottomSheetSortsBinding;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "items", "Ljava/util/List;", "Landroid/content/Intent;", "resultIntent", "Landroid/content/Intent;", "getBinding", "()Lru/ozon/app/android/ugc/core/databinding/FragmentBottomSheetSortsBinding;", "binding", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsSortsBottomSheetDialogFragment extends b {
    private FragmentBottomSheetSortsBinding _binding;

    @NotNull
    private final AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);

    @NotNull
    private List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> items = K.f71697a;
    private Intent resultIntent;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/listreviews/presentation/sorts/ReviewsSortsBottomSheetDialogFragment$Companion;", "", "<init>", "()V", "KEY_ITEMS", "", "KEY_RESULT_INTENT", "newInstance", "Lru/ozon/app/android/ugc/core/widgets/listreviews/presentation/sorts/ReviewsSortsBottomSheetDialogFragment;", "items", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "resultIntent", "Landroid/content/Intent;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ReviewsSortsBottomSheetDialogFragment newInstance(@NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> items, @NotNull Intent resultIntent) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
            ReviewsSortsBottomSheetDialogFragment reviewsSortsBottomSheetDialogFragment = new ReviewsSortsBottomSheetDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("KEY_ITEMS", new ArrayList<>(items));
            bundle.putParcelable("KEY_RESULT_INTENT", resultIntent);
            reviewsSortsBottomSheetDialogFragment.setArguments(bundle);
            return reviewsSortsBottomSheetDialogFragment;
        }

        private Companion() {
        }
    }

    private final void bindApplySortButton() {
        FragmentBottomSheetSortsBinding binding = getBinding();
        LargeButtonView applySortBtn = binding.applySortBtn;
        Intrinsics.checkNotNullExpressionValue(applySortBtn, "applySortBtn");
        OzonSpannableString ozonSpannableString = null;
        ButtonV3Atom.LargeButton.LargeButtonStyle largeButtonStyle = null;
        String str = null;
        LargeButtonHolderKt.bind$default(applySortBtn, new ButtonV3Atom.LargeButton(new OzonSpannableString(StringProvider.getString(R$string.reivews_see_reviews_sorts_btn)), ozonSpannableString, ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_PRIMARY, largeButtonStyle, str, new AtomActionDTO(AtomActionDTO.Behavior.DISMISS_REFRESH, null, null, null, 14, null), null, null, null, 474, null), null, 2, null);
        binding.applySortBtn.setOnClickListener(new a(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindApplySortButton$lambda$5$lambda$4(ReviewsSortsBottomSheetDialogFragment reviewsSortsBottomSheetDialogFragment, View view) {
        Iterator<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> it = reviewsSortsBottomSheetDialogFragment.items.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().isSelected()) {
                break;
            } else {
                i11++;
            }
        }
        reviewsSortsBottomSheetDialogFragment.sendResult(-1, i11);
    }

    private final void bindAtomsLayout() {
        FragmentBottomSheetSortsBinding binding = getBinding();
        binding.sortsAtomsLayout.setAdapter(this.atomsAdapter);
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        atomsAdapter.bind(requireContext, this.items);
        VerticalAtomsLayout sortsAtomsLayout = binding.sortsAtomsLayout;
        Intrinsics.checkNotNullExpressionValue(sortsAtomsLayout, "sortsAtomsLayout");
        Iterator<View> it = ViewGroupExtKt.children(sortsAtomsLayout).iterator();
        while (it.hasNext()) {
            it.next().setBackground(androidx.core.content.a.getDrawable(requireContext(), R$drawable.ripple_rect_transparent_background));
        }
        this.atomsAdapter.setOnAction(new ReviewsSortsBottomSheetDialogFragment$bindAtomsLayout$1$2(this));
    }

    private final FragmentBottomSheetSortsBinding getBinding() {
        FragmentBottomSheetSortsBinding fragmentBottomSheetSortsBinding = this._binding;
        Intrinsics.f(fragmentBottomSheetSortsBinding);
        return fragmentBottomSheetSortsBinding;
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
        }
    }

    private final void initViews() {
        bindAtomsLayout();
        bindApplySortButton();
    }

    private final void sendResult(int resultCode, int selectedPosition) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateRadioCellItemsOnAction(AtomAction.Click action) {
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio copy;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> list = this.items;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cellWithSubtitleCheckboxRadio : list) {
            AtomActionDTO action2 = cellWithSubtitleCheckboxRadio.getAction();
            copy = cellWithSubtitleCheckboxRadio.copy((r32 & 1) != 0 ? cellWithSubtitleCheckboxRadio.isSelected : Intrinsics.d(action2 != null ? action2.getId() : null, action.getId()), (r32 & 2) != 0 ? cellWithSubtitleCheckboxRadio.isRadio : false, (r32 & 4) != 0 ? cellWithSubtitleCheckboxRadio.isAutoToggleDisabled : false, (r32 & 8) != 0 ? cellWithSubtitleCheckboxRadio.title : null, (r32 & 16) != 0 ? cellWithSubtitleCheckboxRadio.titleColor : null, (r32 & 32) != 0 ? cellWithSubtitleCheckboxRadio.subtitle : null, (r32 & 64) != 0 ? cellWithSubtitleCheckboxRadio.subtitleColor : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cellWithSubtitleCheckboxRadio.align : null, (r32 & 256) != 0 ? cellWithSubtitleCheckboxRadio.maxLines : null, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cellWithSubtitleCheckboxRadio.action : null, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cellWithSubtitleCheckboxRadio.hideSeparator : false, (r32 & 2048) != 0 ? cellWithSubtitleCheckboxRadio.colorDisabledAsEnabled : false, (r32 & 4096) != 0 ? cellWithSubtitleCheckboxRadio.context : null, (r32 & 8192) != 0 ? cellWithSubtitleCheckboxRadio.testInfo : null, (r32 & 16384) != 0 ? cellWithSubtitleCheckboxRadio.trackingInfo : null);
            arrayList.add(copy);
        }
        this.items = arrayList;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public int getTheme() {
        return R$style.OzonBottomSheetDialog_AdjustResize;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onCancel(dialog);
        sendResult(0, -1);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentBottomSheetSortsBinding.inflate(inflater, container, false);
        LinearLayout constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        initArguments();
        initViews();
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public ReviewBottomSheetDialog onCreateDialog(Bundle savedInstanceState) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ReviewBottomSheetDialog reviewBottomSheetDialog = new ReviewBottomSheetDialog(requireContext, getTheme(), -2);
        BottomSheetBehavior<FrameLayout> behavior = reviewBottomSheetDialog.getBehavior();
        behavior.setFitToContents(true);
        behavior.setState(3);
        return reviewBottomSheetDialog;
    }
}
