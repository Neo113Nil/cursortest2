package ru.ozon.app.android.search.catalog.components.meta;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.search.R$dimen;
import ru.ozon.app.android.search.databinding.FragmentMetaLayoutBinding;
import ru.ozon.app.android.uikit.view.dialog.OzonBottomSheetDialog;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0003R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/search/catalog/components/meta/MetaFragment;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onDestroyView", "Lru/ozon/app/android/search/databinding/FragmentMetaLayoutBinding;", "binding", "Lru/ozon/app/android/search/databinding/FragmentMetaLayoutBinding;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MetaFragment extends b {
    private FragmentMetaLayoutBinding binding;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ$\u0010\u000f\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/search/catalog/components/meta/MetaFragment$Companion;", "", "<init>", "()V", "ARG_META_IMAGE", "", "ARG_META_DESCRIPTION", "ARG_META_DESIGN_TYPE", "newInstance", "Lru/ozon/app/android/search/catalog/components/meta/MetaFragment;", "image", "description", "Landroid/text/Spanned;", "designType", "Lru/ozon/app/android/search/catalog/components/meta/DesignType;", "makeArgs", "Landroid/os/Bundle;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Bundle makeArgs(String image, Spanned description, DesignType designType) {
            Bundle bundle = new Bundle();
            bundle.putString("MetaFragment_META_IMAGE", image);
            bundle.putString("MetaFragment_META_DESIGN_TYPE", designType.name());
            bundle.putCharSequence("MetaFragment_META_DESCRIPTION", description);
            return bundle;
        }

        @NotNull
        public final MetaFragment newInstance(String image, Spanned description, @NotNull DesignType designType) {
            Intrinsics.checkNotNullParameter(designType, "designType");
            MetaFragment metaFragment = new MetaFragment();
            metaFragment.setArguments(MetaFragment.INSTANCE.makeArgs(image, description, designType));
            return metaFragment;
        }

        private Companion() {
        }
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return new OzonBottomSheetDialog(requireContext, 0, 0, true, null, false, false, false, null, false, 1014, null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentMetaLayoutBinding inflate = FragmentMetaLayoutBinding.inflate(inflater, container, false);
        this.binding = inflate;
        if (inflate != null) {
            return inflate.getConstraintLayout();
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        this.binding = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        CharSequence charSequence;
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentMetaLayoutBinding fragmentMetaLayoutBinding = this.binding;
        if (fragmentMetaLayoutBinding != null) {
            super.onViewCreated(view, savedInstanceState);
            Bundle arguments = getArguments();
            if (arguments == null || (charSequence = arguments.getCharSequence("MetaFragment_META_DESCRIPTION")) == null) {
                charSequence = "";
            }
            Bundle arguments2 = getArguments();
            if (((arguments2 == null || (string = arguments2.getString("MetaFragment_META_DESIGN_TYPE")) == null) ? null : DesignType.valueOf(string)) == DesignType.PORTRAIT) {
                int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.meta_description_portrait_min_dimension);
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(R$dimen.meta_description_portrait_max_dimension);
                fragmentMetaLayoutBinding.metaIv.setMinimumHeight(dimensionPixelSize);
                fragmentMetaLayoutBinding.metaIv.setMaxHeight(dimensionPixelSize2);
                fragmentMetaLayoutBinding.metaIv.setMinimumWidth(dimensionPixelSize);
                fragmentMetaLayoutBinding.metaIv.setMaxWidth(dimensionPixelSize2);
            } else {
                int dimensionPixelSize3 = getResources().getDimensionPixelSize(R$dimen.meta_description_landscape_min_dimension);
                int dimensionPixelSize4 = getResources().getDimensionPixelSize(R$dimen.meta_description_landscape_max_dimension);
                fragmentMetaLayoutBinding.metaIv.setMaxHeight(dimensionPixelSize3);
                fragmentMetaLayoutBinding.metaIv.setMaxWidth(dimensionPixelSize4);
            }
            ImageView metaIv = fragmentMetaLayoutBinding.metaIv;
            Intrinsics.checkNotNullExpressionValue(metaIv, "metaIv");
            Bundle arguments3 = getArguments();
            ImageViewExtKt.loadImageOrGone(metaIv, arguments3 != null ? arguments3.getString("MetaFragment_META_IMAGE") : null);
            fragmentMetaLayoutBinding.metaDescriptionTv.setText(charSequence);
            TextView metaDescriptionTv = fragmentMetaLayoutBinding.metaDescriptionTv;
            Intrinsics.checkNotNullExpressionValue(metaDescriptionTv, "metaDescriptionTv");
            ViewExtKt.showOrGone(metaDescriptionTv, Boolean.valueOf(charSequence.length() > 0));
            fragmentMetaLayoutBinding.metaCloseIv.setOnClickListener(new AI.b(this, 11));
        }
    }
}
