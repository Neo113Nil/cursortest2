package com.socure.docv.capturesdk.di.docselection;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.socure.docv.capturesdk.di.fragment.FragmentComponent;
import com.socure.docv.capturesdk.feature.selection.persentation.ui.DocSelectionShim;
import com.socure.docv.capturesdk.models.IDSelectionModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocSelectionFragmentComponent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/di/docselection/DocSelectionFragmentComponent;", "Lcom/socure/docv/capturesdk/di/fragment/FragmentComponent;", "model", "Lcom/socure/docv/capturesdk/models/IDSelectionModel;", "getModel", "()Lcom/socure/docv/capturesdk/models/IDSelectionModel;", "shim", "Lcom/socure/docv/capturesdk/feature/selection/persentation/ui/DocSelectionShim;", "getShim", "()Lcom/socure/docv/capturesdk/feature/selection/persentation/ui/DocSelectionShim;", "Companion", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface DocSelectionFragmentComponent extends FragmentComponent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    IDSelectionModel getModel();

    DocSelectionShim getShim();

    /* compiled from: DocSelectionFragmentComponent.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/socure/docv/capturesdk/di/docselection/DocSelectionFragmentComponent$Companion;", "", "()V", "build", "Lcom/socure/docv/capturesdk/di/docselection/DocSelectionFragmentComponent;", "fragmentComponent", "Lcom/socure/docv/capturesdk/di/fragment/FragmentComponent;", "shim", "Lcom/socure/docv/capturesdk/feature/selection/persentation/ui/DocSelectionShim;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final DocSelectionFragmentComponent build(final FragmentComponent fragmentComponent, final DocSelectionShim shim) {
            Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
            Intrinsics.checkNotNullParameter(shim, "shim");
            return new DocSelectionFragmentComponentImpl(fragmentComponent, shim) { // from class: com.socure.docv.capturesdk.di.docselection.DocSelectionFragmentComponent$Companion$build$1
                @Override // com.socure.docv.capturesdk.di.docselection.DocSelectionFragmentComponent
                public IDSelectionModel getModel() {
                    Object obj;
                    Bundle requireArguments = getFragment().requireArguments();
                    Intrinsics.checkNotNullExpressionValue(requireArguments, "fragment\n               …      .requireArguments()");
                    if (Build.VERSION.SDK_INT >= 33) {
                        obj = requireArguments.getParcelable("model", IDSelectionModel.class);
                    } else {
                        Parcelable parcelable = requireArguments.getParcelable("model");
                        if (!(parcelable instanceof IDSelectionModel)) {
                            parcelable = null;
                        }
                        obj = (IDSelectionModel) parcelable;
                    }
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.socure.docv.capturesdk.models.IDSelectionModel");
                    return (IDSelectionModel) obj;
                }
            };
        }
    }
}
