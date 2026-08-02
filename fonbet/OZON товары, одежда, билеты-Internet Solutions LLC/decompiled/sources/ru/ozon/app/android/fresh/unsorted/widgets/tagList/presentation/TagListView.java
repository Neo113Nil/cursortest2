package ru.ozon.app.android.fresh.unsorted.widgets.tagList.presentation;

import GH.a;
import Lt.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.tagList.domain.TagListVO;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0001\u0018\u0000 $2\u00020\u0001:\u0002$%B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u0016J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0016\u0010\u001d\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001fH\u0002J\b\u0010 \u001a\u00020\u0012H\u0002J\b\u0010!\u001a\u00020\u0012H\u0002J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u000fH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/tagList/presentation/TagListView;", "Lcom/google/android/flexbox/FlexboxLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "clickCallback", "Lru/ozon/app/android/fresh/unsorted/widgets/tagList/presentation/TagListView$ClickCallback;", "betweenMargin", "tagsViewStore", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "Landroid/view/View;", "bind", "", "item", "Lru/ozon/app/android/fresh/unsorted/widgets/tagList/domain/TagListVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "setClickCallback", "cloudTabsCallbacks", "setSpaces", "spacers", "Lru/ozon/app/android/fresh/unsorted/widgets/tagList/domain/TagListVO$SpacersVO;", "setTags", DynamicElementDTO.TABS, "", "invalidateAllTabs", "setupLayout", "getOrCreateTabButton", "tag", "Companion", "ClickCallback", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TagListView extends FlexboxLayout {
    private int betweenMargin;
    private ClickCallback clickCallback;

    @NotNull
    private final Map<TagButtonDTO, View> tagsViewStore;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int defaultBackgroundColor = UniColors.LAYER_FLOOR_1.getResId();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/tagList/presentation/TagListView$ClickCallback;", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ClickCallback {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/tagList/presentation/TagListView$Companion;", "", "<init>", "()V", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ TagListView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1$lambda$0(Function1 function1, TagButtonDTO tag) {
        AtomAction atomAction;
        Intrinsics.checkNotNullParameter(tag, "tag");
        CommonControlSettings common = tag.getCommon();
        if (common == null || (atomAction = common.toAtomAction()) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final View getOrCreateTabButton(TagButtonDTO tag) {
        View view = this.tagsViewStore.get(tag);
        if (view == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TagButtonView tagButtonView = new TagButtonView(context, null, 0, 0, 14, null);
            tagButtonView.setLayoutParams(new FlexboxLayout.a(-2, -2));
            TagButtonHolderKt.bindOrGone$default(tagButtonView, tag, null, 2, null);
            tagButtonView.setContentDescription(tag.getText() + "_tag");
            tagButtonView.setOnClickListener(new c(2, this, tag));
            view = tagButtonView;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = this.betweenMargin;
        marginLayoutParams.rightMargin = i11;
        marginLayoutParams.bottomMargin = i11;
        view.setLayoutParams(marginLayoutParams);
        this.tagsViewStore.put(tag, view);
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOrCreateTabButton$lambda$8$lambda$7(TagListView tagListView, TagButtonDTO tagButtonDTO, View view) {
        ClickCallback clickCallback = tagListView.clickCallback;
        if (clickCallback != null) {
            bind$lambda$1$lambda$0(((a) clickCallback).f9821b, tagButtonDTO);
        }
    }

    private final void invalidateAllTabs() {
        removeAllViews();
        setupLayout();
    }

    private final void setClickCallback(ClickCallback cloudTabsCallbacks) {
        this.clickCallback = cloudTabsCallbacks;
    }

    private final void setSpaces(TagListVO.SpacersVO spacers) {
        setPadding(spacers.getLeft(), spacers.getTop(), spacers.getRight(), spacers.getBottom());
        this.betweenMargin = spacers.getBetween();
    }

    private final void setTags(List<TagButtonDTO> tabs) {
        List<TagButtonDTO> list = tabs;
        Iterator it = e0.d(this.tagsViewStore.keySet(), list).iterator();
        while (it.hasNext()) {
            this.tagsViewStore.remove((TagButtonDTO) it.next());
        }
        List l02 = C7714v.l0(list, this.tagsViewStore.keySet());
        ArrayList arrayList = new ArrayList(C7714v.z(l02, 10));
        Iterator it2 = l02.iterator();
        while (it2.hasNext()) {
            arrayList.add(new Pair((TagButtonDTO) it2.next(), null));
        }
        U.p(this.tagsViewStore, arrayList);
    }

    private final void setupLayout() {
        Iterator<T> it = this.tagsViewStore.keySet().iterator();
        while (it.hasNext()) {
            View orCreateTabButton = getOrCreateTabButton((TagButtonDTO) it.next());
            orCreateTabButton.setVisibility(0);
            addView(orCreateTabButton);
        }
    }

    public final void bind(@NotNull TagListVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setTags(item.getTags());
        setClickCallback(new a(actionHandler, 4));
        setSpaces(item.getSpacers());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context, item.getBackgroundColor(), defaultBackgroundColor));
        invalidateAllTabs();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagListView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.tagsViewStore = new LinkedHashMap();
        setFlexDirection(0);
        setFlexWrap(1);
        setAlignItems(4);
    }
}
