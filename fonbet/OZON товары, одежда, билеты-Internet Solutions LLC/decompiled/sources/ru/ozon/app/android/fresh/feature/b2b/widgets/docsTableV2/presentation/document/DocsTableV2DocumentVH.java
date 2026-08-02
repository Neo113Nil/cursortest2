package ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.presentation.document;

import Vg.c;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5402x;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetDocsTableDocumentBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.presentation.document.DocsTableV2DocumentVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/presentation/document/DocsTableV2DocumentVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/presentation/document/DocsTableV2DocumentVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetDocsTableDocumentBinding;", "binding", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetDocsTableDocumentBinding;LVg/c;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/presentation/document/DocsTableV2DocumentVO$Status;", "status", "", "bindStatusOrGone", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/presentation/document/DocsTableV2DocumentVO$Status;)V", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "bindButtonsOrGone", "(Ljava/util/List;)Lkotlin/Unit;", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/presentation/document/DocsTableV2DocumentVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetDocsTableDocumentBinding;", "LVg/c;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DocsTableV2DocumentVH extends k<DocsTableV2DocumentVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final WidgetDocsTableDocumentBinding binding;

    @NotNull
    private final c customActionHandlersStore;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<unused var>", "", "bundle", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.presentation.document.DocsTableV2DocumentVH$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<String, Bundle, Unit> {
        final /* synthetic */ ComposerReferences $references;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ComposerReferences composerReferences) {
            super(2);
            this.$references = composerReferences;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Bundle bundle) {
            invoke2(str, bundle);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str, Bundle bundle) {
            Object obj;
            Intrinsics.checkNotNullParameter(str, "<unused var>");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            if (Build.VERSION.SDK_INT >= 33) {
                obj = bundle.getSerializable("b2b_accept_act_key_refresh_flag", Boolean.class);
            } else {
                Object serializable = bundle.getSerializable("b2b_accept_act_key_refresh_flag");
                if (!(serializable instanceof Boolean)) {
                    serializable = null;
                }
                obj = (Boolean) serializable;
            }
            if (Intrinsics.d((Boolean) obj, Boolean.TRUE)) {
                InterfaceC7851b.a.a(this.$references.getController(), null, null, null, null, 15);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.presentation.document.DocsTableV2DocumentVH$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            DocsTableV2DocumentVO.Status status;
            AtomAction action;
            Intrinsics.checkNotNullParameter(it, "it");
            DocsTableV2DocumentVO boundData = DocsTableV2DocumentVH.this.getBoundData();
            if (boundData == null || (status = boundData.getStatus()) == null || (action = status.getAction()) == null) {
                return;
            }
            DocsTableV2DocumentVH.this.actionHandler.invoke(action);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DocsTableV2DocumentVH(@NotNull WidgetDocsTableDocumentBinding binding, @NotNull c customActionHandlersStore, @NotNull ComposerReferences references) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(references, "references");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.customActionHandlersStore = customActionHandlersStore;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).customActionHandlers(new DocsTableV2DocumentVH$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        atomsAdapter.setOnAction(buildHandler);
        binding.controlsAtom.setAdapter(atomsAdapter);
        ComponentCallbacksC5392m c11 = references.getContainer().c();
        if (c11 != null) {
            C5402x.b(c11, "b2b_accept_act_request_key_refresh", new AnonymousClass1(references));
        }
        Layer clickableArea = binding.clickableArea;
        Intrinsics.checkNotNullExpressionValue(clickableArea, "clickableArea");
        ViewExtKt.setOnClickListenerThrottle$default(clickableArea, 0L, new AnonymousClass2(), 1, null);
    }

    private final Unit bindButtonsOrGone(List<ButtonV3DTO> buttons) {
        AtomsAdapter adapter;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = this.binding.controlsAtom;
        Intrinsics.f(horizontalFlexAtomsLayout);
        ViewExtKt.showOrGone(horizontalFlexAtomsLayout, Boolean.valueOf(buttons != null));
        if (buttons == null || (adapter = horizontalFlexAtomsLayout.getAdapter()) == null) {
            return null;
        }
        Context context = this.binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        adapter.bind(context, buttons);
        return Unit.f71690a;
    }

    private final void bindStatusOrGone(DocsTableV2DocumentVO.Status status) {
        WidgetDocsTableDocumentBinding widgetDocsTableDocumentBinding = this.binding;
        TextAtomV2View statusInfo = widgetDocsTableDocumentBinding.statusInfo;
        Intrinsics.checkNotNullExpressionValue(statusInfo, "statusInfo");
        TextHolderKt.bindOrGone$default(statusInfo, status != null ? status.getStatusInfo() : null, null, 2, null);
        IconView statusIcon = widgetDocsTableDocumentBinding.statusIcon;
        Intrinsics.checkNotNullExpressionValue(statusIcon, "statusIcon");
        IconHolderKt.bindOrGone$default(statusIcon, status != null ? status.getStatusIcon() : null, null, 2, null);
        TextAtomV2View statusTitle = widgetDocsTableDocumentBinding.statusTitle;
        Intrinsics.checkNotNullExpressionValue(statusTitle, "statusTitle");
        TextHolderKt.bindOrGone$default(statusTitle, status != null ? status.getStatusTitle() : null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DocsTableV2DocumentVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetDocsTableDocumentBinding widgetDocsTableDocumentBinding = this.binding;
        CellView headerCell = widgetDocsTableDocumentBinding.headerCell;
        Intrinsics.checkNotNullExpressionValue(headerCell, "headerCell");
        CellHolderKt.bindOrGone(headerCell, item.getHeader(), this.actionHandler);
        TextAtomV2View sum = widgetDocsTableDocumentBinding.sum;
        Intrinsics.checkNotNullExpressionValue(sum, "sum");
        TextHolderKt.bindOrGone$default(sum, item.getSum(), null, 2, null);
        bindStatusOrGone(item.getStatus());
        TextAtomV2View dateInfo = widgetDocsTableDocumentBinding.dateInfo;
        Intrinsics.checkNotNullExpressionValue(dateInfo, "dateInfo");
        TextHolderKt.bindOrGone$default(dateInfo, item.getDateInfo(), null, 2, null);
        BadgeView badge = widgetDocsTableDocumentBinding.badge;
        Intrinsics.checkNotNullExpressionValue(badge, "badge");
        BadgeHolderKt.bindOrGone(badge, item.getBadge(), this.actionHandler);
        bindButtonsOrGone(item.getButtons());
        View divider = widgetDocsTableDocumentBinding.divider;
        Intrinsics.checkNotNullExpressionValue(divider, "divider");
        ViewExtKt.showOrGone(divider, Boolean.valueOf(item.getShowSeparator()));
    }
}
