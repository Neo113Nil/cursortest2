package ru.ozon.app.android.common.navigationblocks.presentation;

import Sc.o;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.common.navigationblocks.data.NavigationBlocksV2DTO;
import ru.ozon.app.android.common.navigationblocks.presentation.rv.BlocksAdapter;
import ru.ozon.app.android.common.navigationblocks.presentation.rv.BlocksMarginDecorator;
import ru.ozon.app.android.common.ui.naviblocks.databinding.WidgetNavigationBlocksV2Binding;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/common/navigationblocks/presentation/NavigationBlocksV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/navigationblocks/presentation/NavigationBlocksV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "color", "Lru/ozon/app/android/common/navigationblocks/data/NavigationBlocksV2DTO$RoundedCorners;", "roundedCorners", "", "bindBackground", "(Ljava/lang/String;Lru/ozon/app/android/common/navigationblocks/data/NavigationBlocksV2DTO$RoundedCorners;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/common/navigationblocks/presentation/NavigationBlocksV2VO;Ll20/d;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/common/navigationblocks/presentation/rv/BlocksAdapter;", "blocksAdapter", "Lru/ozon/app/android/common/navigationblocks/presentation/rv/BlocksAdapter;", "Lru/ozon/app/android/common/ui/naviblocks/databinding/WidgetNavigationBlocksV2Binding;", "binding", "Lru/ozon/app/android/common/ui/naviblocks/databinding/WidgetNavigationBlocksV2Binding;", "Landroid/graphics/drawable/GradientDrawable;", "background", "Landroid/graphics/drawable/GradientDrawable;", "", "roundedCornerRadius", "F", "", "bottomPadding", "I", "navigation-blocks_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NavigationBlocksV2ViewHolder extends k<NavigationBlocksV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final GradientDrawable background;

    @NotNull
    private final WidgetNavigationBlocksV2Binding binding;

    @NotNull
    private final BlocksAdapter blocksAdapter;
    private final int bottomPadding;
    private final float roundedCornerRadius;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavigationBlocksV2DTO.RoundedCorners.values().length];
            try {
                iArr[NavigationBlocksV2DTO.RoundedCorners.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavigationBlocksV2DTO.RoundedCorners.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBlocksV2ViewHolder(@NotNull View containerView, @NotNull ComposerReferences ref) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).buildHandler();
        this.actionHandler = buildHandler;
        BlocksAdapter blocksAdapter = new BlocksAdapter(buildHandler, ref.getTokenizedAnalytics(), this);
        this.blocksAdapter = blocksAdapter;
        WidgetNavigationBlocksV2Binding bind = WidgetNavigationBlocksV2Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.background = gradientDrawable;
        this.roundedCornerRadius = ResourceExtKt.toPxF(16);
        this.bottomPadding = ResourceExtKt.toPx(16);
        RecyclerView recyclerView = bind.rvBlocks;
        recyclerView.setAdapter(blocksAdapter);
        recyclerView.addItemDecoration(new BlocksMarginDecorator());
        recyclerView.setBackground(gradientDrawable);
    }

    private final void bindBackground(String color, NavigationBlocksV2DTO.RoundedCorners roundedCorners) {
        int i11;
        GradientDrawable gradientDrawable = this.background;
        gradientDrawable.setColor(StyleParser.INSTANCE.parseColor(getContext(), color, StyleParser.OzColor.OZ_SEMANTIC_COLOR_ACCENT_PRIMARY));
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i12 = iArr[roundedCorners.ordinal()];
        if (i12 == 1) {
            gradientDrawable.setCornerRadius(0.0f);
        } else {
            if (i12 != 2) {
                throw new o();
            }
            float f7 = this.roundedCornerRadius;
            gradientDrawable.setCornerRadii(DrawableExtKt.createCornerRadii$default(0.0f, 0.0f, f7, f7, 3, null));
        }
        RecyclerView rvBlocks = this.binding.rvBlocks;
        Intrinsics.checkNotNullExpressionValue(rvBlocks, "rvBlocks");
        int i13 = iArr[roundedCorners.ordinal()];
        if (i13 == 1) {
            i11 = 0;
        } else {
            if (i13 != 2) {
                throw new o();
            }
            i11 = this.bottomPadding;
        }
        ViewExtKt.updatePadding$default(rvBlocks, 0, 0, 0, i11, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NavigationBlocksV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindBackground(item.getOuterBackgroundColor(), item.getRoundedCorners());
        this.blocksAdapter.submitList(item.getBlocks());
    }
}
