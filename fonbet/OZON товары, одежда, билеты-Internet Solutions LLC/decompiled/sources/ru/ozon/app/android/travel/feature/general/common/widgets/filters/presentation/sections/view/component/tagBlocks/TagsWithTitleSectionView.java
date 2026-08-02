package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks;

import Bi.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;
import gk0.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.R$drawable;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012J\b\u0010\u0014\u001a\u00020\bH\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleSectionView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "cachedTagButtonViews", "", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "titleTagsWithTitle", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "tagsFilterFL", "Lcom/google/android/flexbox/FlexboxLayout;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleSectionInTabVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "createAndCacheTagButtonView", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TagsWithTitleSectionView extends LinearLayout {

    @NotNull
    private final List<TagButtonView> cachedTagButtonViews;

    @NotNull
    private final FlexboxLayout tagsFilterFL;

    @NotNull
    private final TextAtomV2View titleTagsWithTitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagsWithTitleSectionView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.cachedTagButtonViews = new ArrayList();
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.g(N.b(TextAtomV2View.class), context);
        a.d(-1, -2, textAtomV2View);
        this.titleTagsWithTitle = textAtomV2View;
        FlexboxLayout flexboxLayout = new FlexboxLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        flexboxLayout.setFlexWrap(1);
        flexboxLayout.setFlexDirection(0);
        flexboxLayout.setShowDivider(2);
        flexboxLayout.setDividerDrawable(androidx.core.content.a.getDrawable(context, R$drawable.divider_tag_item));
        flexboxLayout.setLayoutParams(layoutParams);
        this.tagsFilterFL = flexboxLayout;
        setOrientation(1);
        addView(textAtomV2View);
        addView(flexboxLayout);
    }

    private final TagButtonView createAndCacheTagButtonView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TagButtonView tagButtonView = new TagButtonView(context, null, 0, 0, 14, null);
        tagButtonView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.cachedTagButtonViews.add(tagButtonView);
        return tagButtonView;
    }

    public final void bind(@NotNull TagsWithTitleSectionInTabVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextHolderKt.bindOrGone$default(this.titleTagsWithTitle, item.getTitle(), null, 2, null);
        int size = item.getTags().size();
        int childCount = this.tagsFilterFL.getChildCount();
        int i11 = 0;
        if (this.cachedTagButtonViews.size() < size) {
            int size2 = size - this.cachedTagButtonViews.size();
            for (int i12 = 0; i12 < size2; i12++) {
                createAndCacheTagButtonView();
            }
        }
        if (size > childCount) {
            while (childCount < size) {
                TagButtonView tagButtonView = (TagButtonView) C7714v.Q(childCount, this.cachedTagButtonViews);
                if (tagButtonView != null) {
                    ViewParent parent = tagButtonView.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(tagButtonView);
                    }
                    this.tagsFilterFL.addView(tagButtonView);
                }
                childCount++;
            }
        } else if (size < childCount) {
            this.tagsFilterFL.removeViews(size, childCount - size);
        }
        for (Object obj : item.getTags()) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            TagButtonDTO tagButtonDTO = (TagButtonDTO) obj;
            View childAt = this.tagsFilterFL.getChildAt(i11);
            TagButtonView tagButtonView2 = childAt instanceof TagButtonView ? (TagButtonView) childAt : null;
            if (tagButtonView2 != null) {
                TagButtonHolderKt.bind(tagButtonView2, tagButtonDTO, actionHandler);
            }
            i11 = i13;
        }
    }
}
