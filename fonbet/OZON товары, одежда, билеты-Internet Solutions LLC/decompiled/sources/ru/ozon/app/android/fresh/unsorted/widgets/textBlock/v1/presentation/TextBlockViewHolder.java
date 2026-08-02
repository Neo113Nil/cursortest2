package ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v1.presentation;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.navigation.CatalogTabsPartViewHolder;
import ru.ozon.app.android.fresh.navigation.CatalogTabsSharedViewModel;
import ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v1.data.TextBlockDTO;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00022\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v1/presentation/TextBlockViewHolder;", "Lru/ozon/app/android/fresh/navigation/CatalogTabsPartViewHolder;", "Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v1/presentation/TextBlockVO;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "containerView", "Lru/ozon/app/android/fresh/navigation/CatalogTabsSharedViewModel;", "catalogTabsSharedViewModel", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;Lru/ozon/app/android/fresh/navigation/CatalogTabsSharedViewModel;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v1/presentation/TextBlockVO;Ll20/d;)V", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TextBlockViewHolder extends CatalogTabsPartViewHolder<TextBlockVO> {
    public static final int $stable = TextAtomView.$stable;

    @NotNull
    private final TextAtomView containerView;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextBlockDTO.AlignmentPosition.values().length];
            try {
                iArr[TextBlockDTO.AlignmentPosition.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextBlockDTO.AlignmentPosition.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextBlockDTO.AlignmentPosition.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextBlockViewHolder(@NotNull TextAtomView containerView, @NotNull CatalogTabsSharedViewModel catalogTabsSharedViewModel) {
        super(containerView, catalogTabsSharedViewModel);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(catalogTabsSharedViewModel, "catalogTabsSharedViewModel");
        this.containerView = containerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TextBlockVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.setTag(item.getCatalogueTabsConnectionTag());
        TextAtomHolderKt.bindOrGone$default(this.containerView, item.getBody(), null, 2, null);
        int i11 = WhenMappings.$EnumSwitchMapping$0[item.getAlignment().ordinal()];
        if (i11 == 1) {
            this.containerView.setGravity(8388611);
        } else if (i11 == 2) {
            this.containerView.setGravity(8388613);
        } else {
            if (i11 != 3) {
                throw new o();
            }
            this.containerView.setGravity(1);
        }
    }
}
