package ru.ozon.app.android.common.taglist.taglistv3.presentation.flexbox;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.common.taglist.taglistv3.TagListUtilsKt;
import ru.ozon.app.android.common.ui.taglist.databinding.FlexboxWidgetTagListBinding;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniColorsSelect;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001e\u0010\u0015\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00100 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/common/taglist/taglistv3/presentation/flexbox/FlexBoxTagListV3ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/taglist/taglistv3/presentation/flexbox/FlexboxTagListV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/utils/AppType;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/common/taglist/taglistv3/presentation/flexbox/FlexboxTagListV3VO;Ll20/d;)V", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "widgetInfo", "Ll20/d;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/app/android/common/ui/taglist/databinding/FlexboxWidgetTagListBinding;", "binding", "Lru/ozon/app/android/common/ui/taglist/databinding/FlexboxWidgetTagListBinding;", "", "defaultBgColor", "I", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FlexBoxTagListV3ViewHolder extends k<FlexboxTagListV3VO> {

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final FlexboxWidgetTagListBinding binding;

    @NotNull
    private final View containerView;
    private final int defaultBgColor;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final ComposerReferences refs;
    private d widgetInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexBoxTagListV3ViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull AppType appType) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.containerView = containerView;
        this.refs = refs;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        FlexboxWidgetTagListBinding bind = FlexboxWidgetTagListBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.defaultBgColor = appType == AppType.SELECT ? UniColorsSelect.LAYER_FLOOR_0_SELECT.getResId() : UniColors.LAYER_FLOOR_1.getResId();
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onPreProcess(new FlexBoxTagListV3ViewHolder$onAction$1(this)).buildHandler();
        this.onAction = buildHandler;
        atomsAdapter.setOnAction(buildHandler);
        bind.flexboxTagsAtomLayout.setAdapter(atomsAdapter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FlexboxTagListV3VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.widgetInfo = info;
        this.atomsAdapter.bind(getContext(), item.getTags());
        View view = this.containerView;
        view.setPadding((int) view.getResources().getDimension(item.getLeftPadding().getCellLayoutPadding()), (int) view.getResources().getDimension(item.getTopPadding().getCellLayoutPadding()), (int) view.getResources().getDimension(item.getRightPadding().getCellLayoutPadding()), (int) view.getResources().getDimension(item.getBottomPadding().getCellLayoutPadding()));
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer mapColor = styleParser.mapColor(context, item.getBackgroundColor());
        int intValue = mapColor != null ? mapColor.intValue() : this.defaultBgColor;
        if (item.getIsBottomRounded()) {
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            view.setBackground(TagListUtilsKt.getRoundedBackground(context2, intValue));
        } else {
            Context context3 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            view.setBackgroundColor(ResourceExtKt.color(context3, intValue));
        }
    }
}
