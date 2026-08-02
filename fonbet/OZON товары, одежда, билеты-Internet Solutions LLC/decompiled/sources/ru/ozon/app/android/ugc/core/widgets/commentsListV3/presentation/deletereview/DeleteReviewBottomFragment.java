package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.deletereview;

import CG.a;
import Dc0.n;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.d;
import com.google.android.material.bottomsheet.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.databinding.FragmentDeleteReviewBinding;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.view.dialog.OzonBottomSheetDialog;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0003R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/deletereview/DeleteReviewBottomFragment;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "productId", "J", "", "id", "Ljava/lang/String;", "deleteActionName", "deleteActionNameParams", "Lru/ozon/app/android/ugc/core/databinding/FragmentDeleteReviewBinding;", "_binding", "Lru/ozon/app/android/ugc/core/databinding/FragmentDeleteReviewBinding;", "getBinding", "()Lru/ozon/app/android/ugc/core/databinding/FragmentDeleteReviewBinding;", "binding", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeleteReviewBottomFragment extends b {
    private FragmentDeleteReviewBinding _binding;
    private String deleteActionName;
    private String deleteActionNameParams;
    private String id;
    private long productId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/deletereview/DeleteReviewBottomFragment$Companion;", "", "<init>", "()V", "TITLE_EXTRA", "", "PRODUCT_ID_EXTRA", "ID_EXTRA", "DELETE_COMMENT_REQUEST_KEY", "newInstance", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/deletereview/DeleteReviewBottomFragment;", "uuid", SelectionItemFormDTO.TITLE_FIELD_NAME, "productId", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ DeleteReviewBottomFragment newInstance$default(Companion companion, String str, String str2, long j11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                j11 = 0;
            }
            return companion.newInstance(str, str2, j11);
        }

        @NotNull
        public final DeleteReviewBottomFragment newInstance(@NotNull String uuid, @NotNull String title, long productId) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(title, "title");
            DeleteReviewBottomFragment deleteReviewBottomFragment = new DeleteReviewBottomFragment();
            Bundle bundle = new Bundle();
            bundle.putString("title_extra", title);
            bundle.putLong("product_id_extra", productId);
            bundle.putString("id_extra", uuid);
            deleteReviewBottomFragment.setArguments(bundle);
            return deleteReviewBottomFragment;
        }

        private Companion() {
        }
    }

    private final FragmentDeleteReviewBinding getBinding() {
        FragmentDeleteReviewBinding fragmentDeleteReviewBinding = this._binding;
        Intrinsics.f(fragmentDeleteReviewBinding);
        return fragmentDeleteReviewBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(DeleteReviewBottomFragment deleteReviewBottomFragment, View view) {
        deleteReviewBottomFragment.dismiss();
        deleteReviewBottomFragment.getParentFragmentManager().m1(d.b(new Pair("delete_review_product_id_extra", Long.valueOf(deleteReviewBottomFragment.productId)), new Pair("review_uuid_extra", deleteReviewBottomFragment.id), new Pair("delete_review_extra_action_name", deleteReviewBottomFragment.deleteActionName), new Pair("delete_review_extra_action_params", deleteReviewBottomFragment.deleteActionNameParams)), "delete_comment_request_key");
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return new OzonBottomSheetDialog(requireContext, 0, 0, false, null, true, true, false, null, false, 926, null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentDeleteReviewBinding.inflate(inflater, container, false);
        ConstraintLayout constraintLayout = getBinding().getConstraintLayout();
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
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.productId = arguments.getLong("product_id_extra");
            this.id = arguments.getString("id_extra");
            this.deleteActionName = arguments.getString("delete_review_extra_action_name");
            this.deleteActionNameParams = arguments.getString("delete_review_extra_action_params");
            getBinding().titleTv.setText(arguments.getString("title_extra"));
        }
        getBinding().deleteCl.setOnClickListener(new n(this, 5));
        getBinding().cancelCl.setOnClickListener(new a(this, 2));
    }
}
