package ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.presentation;

import android.content.Context;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetDocsTableDocumentItemBinding;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetDocsTableHeaderBinding;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetDocsTableStatusBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.presentation.DocsTableVO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00062\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\u0006*\u00020\u00182\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetDocsTableDocumentItemBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetDocsTableDocumentItemBinding;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Document$Header;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetDocsTableHeaderBinding;", "bindHeader", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Document$Header;)Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetDocsTableHeaderBinding;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Document$Status;", "docStatus", "bindStatusOrGone", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Document$Status;)V", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "bindButtonsOrGone", "(Ljava/util/List;)V", "Lru/ozon/uni/atoms/af/layout/HorizontalFlexAtomsLayout;", "setTestId", "(Lru/ozon/uni/atoms/af/layout/HorizontalFlexAtomsLayout;Ljava/util/List;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Document;", "item", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTable/presentation/DocsTableVO$Document;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetDocsTableDocumentItemBinding;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DocsTableItemViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final WidgetDocsTableDocumentItemBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DocsTableItemViewHolder(@NotNull WidgetDocsTableDocumentItemBinding binding, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.binding = binding;
        this.actionHandler = actionHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        atomsAdapter.setOnAction(actionHandler);
        binding.controlsAtom.setAdapter(atomsAdapter);
    }

    private final void bindButtonsOrGone(List<ButtonV3DTO> buttons) {
        AtomsAdapter adapter;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = this.binding.controlsAtom;
        Intrinsics.f(horizontalFlexAtomsLayout);
        ViewExtKt.showOrGone(horizontalFlexAtomsLayout, Boolean.valueOf(buttons != null));
        if (buttons == null || (adapter = horizontalFlexAtomsLayout.getAdapter()) == null) {
            return;
        }
        Context context = this.binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        adapter.bind(context, buttons);
    }

    private final WidgetDocsTableHeaderBinding bindHeader(DocsTableVO.Document.Header header) {
        WidgetDocsTableHeaderBinding widgetDocsTableHeaderBinding = this.binding.header;
        TextAtomV2View headerTitle = widgetDocsTableHeaderBinding.headerTitle;
        Intrinsics.checkNotNullExpressionValue(headerTitle, "headerTitle");
        TextHolderKt.bindOrGone$default(headerTitle, header.getTitle(), null, 2, null);
        IconButtonV3View headerIconButton = widgetDocsTableHeaderBinding.headerIconButton;
        Intrinsics.checkNotNullExpressionValue(headerIconButton, "headerIconButton");
        IconButtonV3HolderKt.bindOrGone(headerIconButton, header.getIconButton(), this.actionHandler);
        TextAtomV2View headerDate = widgetDocsTableHeaderBinding.headerDate;
        Intrinsics.checkNotNullExpressionValue(headerDate, "headerDate");
        TextHolderKt.bindOrGone$default(headerDate, header.getDate(), null, 2, null);
        Intrinsics.checkNotNullExpressionValue(widgetDocsTableHeaderBinding, "with(...)");
        return widgetDocsTableHeaderBinding;
    }

    private final void bindStatusOrGone(DocsTableVO.Document.Status docStatus) {
        WidgetDocsTableStatusBinding widgetDocsTableStatusBinding = this.binding.status;
        if (docStatus == null) {
            ConstraintLayout constraintLayout = widgetDocsTableStatusBinding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            constraintLayout.setVisibility(8);
        } else {
            ConstraintLayout constraintLayout2 = widgetDocsTableStatusBinding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
            constraintLayout2.setVisibility(0);
            TextAtomV2View statusTitle = widgetDocsTableStatusBinding.statusTitle;
            Intrinsics.checkNotNullExpressionValue(statusTitle, "statusTitle");
            TextHolderKt.bindOrGone$default(statusTitle, docStatus.getStatusTitle(), null, 2, null);
            IconView statusIcon = widgetDocsTableStatusBinding.statusIcon;
            Intrinsics.checkNotNullExpressionValue(statusIcon, "statusIcon");
            IconHolderKt.bindOrGone$default(statusIcon, docStatus.getIcon(), null, 2, null);
            TextAtomV2View status = widgetDocsTableStatusBinding.status;
            Intrinsics.checkNotNullExpressionValue(status, "status");
            TextHolderKt.bindOrGone$default(status, docStatus.getStatus(), null, 2, null);
            TextAtomV2View status2 = widgetDocsTableStatusBinding.status;
            Intrinsics.checkNotNullExpressionValue(status2, "status");
            IconView statusIcon2 = widgetDocsTableStatusBinding.statusIcon;
            Intrinsics.checkNotNullExpressionValue(statusIcon2, "statusIcon");
            status2.setVisibility(statusIcon2.getVisibility() == 0 ? 0 : 8);
        }
        Layer clickableAreaF = this.binding.status.clickableAreaF;
        Intrinsics.checkNotNullExpressionValue(clickableAreaF, "clickableAreaF");
        ViewExtKt.setOnClickListenerThrottle$default(clickableAreaF, 0L, new DocsTableItemViewHolder$bindStatusOrGone$1$1(docStatus, this), 1, null);
    }

    private final void setTestId(HorizontalFlexAtomsLayout horizontalFlexAtomsLayout, List<ButtonV3DTO> list) {
        ButtonV3DTO buttonV3DTO;
        TestInfo testInfo;
        int childCount = horizontalFlexAtomsLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            horizontalFlexAtomsLayout.getChildAt(i11).setContentDescription((list == null || (buttonV3DTO = list.get(i11)) == null || (testInfo = buttonV3DTO.getTestInfo()) == null) ? null : testInfo.getAutomatizationId());
        }
    }

    public final void bind(@NotNull DocsTableVO.Document item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetDocsTableDocumentItemBinding widgetDocsTableDocumentItemBinding = this.binding;
        TextAtomV2View headerTitle = widgetDocsTableDocumentItemBinding.header.headerTitle;
        Intrinsics.checkNotNullExpressionValue(headerTitle, "headerTitle");
        TextHolderKt.bindOrGone$default(headerTitle, item.getHeader().getTitle(), null, 2, null);
        bindHeader(item.getHeader());
        TextAtomV2View text = widgetDocsTableDocumentItemBinding.text;
        Intrinsics.checkNotNullExpressionValue(text, "text");
        TextHolderKt.bindOrGone$default(text, item.getText(), null, 2, null);
        bindStatusOrGone(item.getStatus());
        bindButtonsOrGone(item.getButtons());
        TextAtomV2View info = widgetDocsTableDocumentItemBinding.info;
        Intrinsics.checkNotNullExpressionValue(info, "info");
        TextHolderKt.bindOrGone$default(info, item.getInfo(), null, 2, null);
        HorizontalFlexAtomsLayout controlsAtom = widgetDocsTableDocumentItemBinding.controlsAtom;
        Intrinsics.checkNotNullExpressionValue(controlsAtom, "controlsAtom");
        setTestId(controlsAtom, item.getButtons());
    }
}
