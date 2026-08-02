package ru.ozon.app.android.ui.widgets.textWidget.presentation;

import W10.c;
import WZ.t;
import android.view.View;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ui.widgets.databinding.WidgetTextBinding;
import ru.ozon.app.android.ui.widgets.textWidget.presentation.TextWidgetVO;
import ru.ozon.app.android.ui.widgets.textWidget.presentation.adapter.TextWidgetListAdapter;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 42\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00014B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010$\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010 \u001a\u00060\u001ej\u0002`\u001f2\u000e\u0010#\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"H\u0016¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\r0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "leftLayoutPadding", "rightLayoutPadding", "", "bindPaddings", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "", "backgroundColor", "bindBackground", "(Ljava/lang/String;)V", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$TextExpandableVO;", "atomVO", "changeExpandedState", "(Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$TextExpandableVO;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ui/widgets/databinding/WidgetTextBinding;", "binding", "Lru/ozon/app/android/ui/widgets/databinding/WidgetTextBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/adapter/TextWidgetListAdapter;", "textWidgetListAdapter", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/adapter/TextWidgetListAdapter;", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextWidgetViewHolder extends k<TextWidgetVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetTextBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final TextWidgetListAdapter textWidgetListAdapter;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetViewHolder$Companion;", "", "<init>", "()V", "ACTION_ID_CHANGE_EXPANDABLE_STATE", "", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.containerView = containerView;
        this.refs = refs;
        WidgetTextBinding bind = WidgetTextBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onPreProcess(TextWidgetViewHolder$actionHandler$1.INSTANCE).buildHandler();
        this.actionHandler = buildHandler;
        TextWidgetListAdapter textWidgetListAdapter = new TextWidgetListAdapter(buildHandler, new TextWidgetViewHolder$textWidgetListAdapter$1(this));
        this.textWidgetListAdapter = textWidgetListAdapter;
        RecyclerView recyclerView = bind.widgetTextRootRV;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(textWidgetListAdapter);
    }

    private final void bindBackground(String backgroundColor) {
        Integer mapColor = StyleParser.INSTANCE.mapColor(getContext(), backgroundColor);
        if (mapColor != null) {
            this.binding.widgetTextRootRV.setBackgroundColor(a.getColor(getContext(), mapColor.intValue()));
        }
    }

    private final void bindPaddings(CommonCellSettings.LayoutPadding leftLayoutPadding, CommonCellSettings.LayoutPadding rightLayoutPadding) {
        this.binding.widgetTextRootRV.setPadding((int) getResources().getDimension(leftLayoutPadding != null ? leftLayoutPadding.getCellLayoutPadding() : CommonCellSettingsKt.getNone()), this.binding.widgetTextRootRV.getPaddingTop(), (int) getResources().getDimension(rightLayoutPadding != null ? rightLayoutPadding.getCellLayoutPadding() : CommonCellSettingsKt.getNone()), this.binding.widgetTextRootRV.getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeExpandedState(TextWidgetVO.TextWidgetItemVO.TextExpandableVO atomVO) {
        AtomActionDTO action = atomVO.getText().getAction();
        if (Intrinsics.d(action != null ? action.getId() : null, "changeExpandableTextState")) {
            this.refs.getController().update(new ExpandableTextStateChangedUpdateKey(atomVO));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TextWidgetVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindBackground(item.getBackgroundColor());
        bindPaddings(item.getLeftLayoutPadding(), item.getRightLayoutPadding());
        this.textWidgetListAdapter.setItems(item.getAtoms());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TextWidgetVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), viewEvent, null, 2, null);
        }
    }
}
