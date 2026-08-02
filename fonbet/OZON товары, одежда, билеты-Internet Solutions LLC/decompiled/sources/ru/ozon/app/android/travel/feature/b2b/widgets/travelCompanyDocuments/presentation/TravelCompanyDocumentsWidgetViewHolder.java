package ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.presentation;

import Lm0.a;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdfviewer.presentation.FileDownloaderViewModel;
import ru.ozon.app.android.travel.feature.b2b.databinding.ItemTravelCompanyDocumentBinding;
import ru.ozon.app.android.travel.feature.b2b.databinding.WidgetTravelCompanyDocumentsBinding;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.presentation.adapter.TravelCompanyDocumentsAdapter;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.presentation.adapter.TravelDocumentsDecoration;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000e0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000e0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/presentation/TravelCompanyDocumentsWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/presentation/TravelCompanyDocumentsDetailsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;", "fileDownloaderViewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "", "downloadZip", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/presentation/TravelCompanyDocumentsDetailsVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;", "Lru/ozon/app/android/travel/feature/b2b/databinding/WidgetTravelCompanyDocumentsBinding;", "binding", "Lru/ozon/app/android/travel/feature/b2b/databinding/WidgetTravelCompanyDocumentsBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "pdfHandler", "Lkotlin/jvm/functions/Function1;", "zipHandler", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/presentation/adapter/TravelCompanyDocumentsAdapter;", "adapter", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelCompanyDocuments/presentation/adapter/TravelCompanyDocumentsAdapter;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TravelCompanyDocumentsWidgetViewHolder extends k<TravelCompanyDocumentsDetailsVO> {

    @NotNull
    private final TravelCompanyDocumentsAdapter adapter;

    @NotNull
    private final WidgetTravelCompanyDocumentsBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final FileDownloaderViewModel fileDownloaderViewModel;

    @NotNull
    private final Function1<AtomAction, Unit> pdfHandler;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final Function1<AtomAction, Unit> zipHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCompanyDocumentsWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull FileDownloaderViewModel fileDownloaderViewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(fileDownloaderViewModel, "fileDownloaderViewModel");
        this.containerView = containerView;
        this.references = references;
        this.fileDownloaderViewModel = fileDownloaderViewModel;
        WidgetTravelCompanyDocumentsBinding bind = WidgetTravelCompanyDocumentsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).buildHandler();
        this.pdfHandler = buildHandler;
        this.zipHandler = new ActionHandler.Builder(references, this).onClick(new TravelCompanyDocumentsWidgetViewHolder$zipHandler$1(this)).buildHandler();
        TravelCompanyDocumentsAdapter travelCompanyDocumentsAdapter = new TravelCompanyDocumentsAdapter(buildHandler);
        this.adapter = travelCompanyDocumentsAdapter;
        bind.documentsRv.setAdapter(travelCompanyDocumentsAdapter);
        bind.documentsRv.addItemDecoration(new TravelDocumentsDecoration(getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downloadZip(AtomAction.Click action) {
        Unit unit;
        r a11 = this.references.getContainer().a();
        if (a11 != null) {
            String link = action.getLink();
            if (link != null) {
                this.fileDownloaderViewModel.downloadFile(link, false, a11, true, "zip");
                unit = Unit.f71690a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        a.f17149a.e("Activity was null", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelCompanyDocumentsDetailsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        DisclaimerContainer annotationAtom = this.binding.annotationAtom;
        Intrinsics.checkNotNullExpressionValue(annotationAtom, "annotationAtom");
        DisclaimerHolderKt.bindOrGone$default(annotationAtom, item.getDisclaimer(), null, 2, null);
        this.adapter.setItems(item.getDocuments());
        ItemTravelCompanyDocumentBinding itemTravelCompanyDocumentBinding = this.binding.allDocumentsCard;
        CardView constraintLayout = itemTravelCompanyDocumentBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        constraintLayout.setVisibility(item.getAllDocumentsLink() != null ? 0 : 8);
        TravelCompanyDocumentVO allDocumentsLink = item.getAllDocumentsLink();
        if (allDocumentsLink != null) {
            TextAtomView nameTv = itemTravelCompanyDocumentBinding.nameTv;
            Intrinsics.checkNotNullExpressionValue(nameTv, "nameTv");
            TextAtomHolderKt.bind$default(nameTv, allDocumentsLink.getText(), null, 2, null);
            SmallButtonView downloadBtn = itemTravelCompanyDocumentBinding.downloadBtn;
            Intrinsics.checkNotNullExpressionValue(downloadBtn, "downloadBtn");
            WrappedButtonHolderKt.bind(downloadBtn, allDocumentsLink.getButton(), this.zipHandler);
        }
    }
}
