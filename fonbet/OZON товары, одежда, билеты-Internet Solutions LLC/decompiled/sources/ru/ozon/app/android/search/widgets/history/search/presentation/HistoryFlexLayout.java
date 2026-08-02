package ru.ozon.app.android.search.widgets.history.search.presentation;

import Cm.e;
import Sc.o;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import com.google.android.flexbox.FlexboxLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.history.search.presentation.HistoryItem;
import ru.ozon.app.android.search.widgets.history.search.presentation.HistoryVO;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolderKt;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 ?2\u00020\u0001:\u0003?@AB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0014J\u000e\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020%J\u0014\u0010&\u001a\u00020\r2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011J\u000e\u0010(\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aJ.\u0010)\u001a\u00020\r2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000bJ\u0006\u0010*\u001a\u00020\rJ\u0010\u0010+\u001a\u0004\u0018\u00010\u001e2\u0006\u0010,\u001a\u00020-J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0002J\u001c\u00101\u001a\b\u0012\u0004\u0012\u000203022\f\u00104\u001a\b\u0012\u0004\u0012\u0002000\u0011H\u0002J,\u00105\u001a\u00020\r2\f\u00106\u001a\b\u0012\u0004\u0012\u000203072\f\u00104\u001a\b\u0012\u0004\u0012\u0002000\u00112\u0006\u00108\u001a\u00020\u001eH\u0002J\b\u00109\u001a\u00020\rH\u0002J\b\u0010:\u001a\u00020\rH\u0002J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u000fH\u0002J\f\u0010=\u001a\u00020\r*\u00020>H\u0002R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryFlexLayout;", "Lcom/google/android/flexbox/FlexboxLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "itemActionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "callBack", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem;", "currentTags", "", "extraButton", "maxLinesCount", "minItemWidth", "horizontalMargin", "verticalMargin", "showMoreViewWidth", "parentWidth", "isExpanded", "", "hasMoreTags", "tagsViewStore", "", "Landroid/view/View;", "tagWithTruncatedIndex", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setPresentationSettings", "settings", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$PresentationSettings;", "setTags", "tags", "setMode", "setItemActionHandlers", "invalidateAllTags", "findVisibleViewForItemID", "id", "", "calculatingChildrenWidth", "", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryFlexLayout$ChildInfo;", "calculatingVisibleViews", "", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryFlexLayout$TagPosition;", "childInfos", "calculatingTagSizeDependOnFreeSpace", "visibleViewsIndices", "", "showMoreView", "setupExpandedMode", "setupCompactMode", "getOrCreateTagButton", "item", "setupLocator", "Landroid/view/ViewGroup;", "Companion", "ChildInfo", "TagPosition", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HistoryFlexLayout extends FlexboxLayout {
    private Function1<? super HistoryItem, Unit> callBack;

    @NotNull
    private List<? extends HistoryItem> currentTags;
    private HistoryItem extraButton;
    private boolean hasMoreTags;
    private int horizontalMargin;
    private boolean isExpanded;
    private Function1<? super AtomAction, Unit> itemActionHandler;
    private int maxLinesCount;
    private int minItemWidth;
    private int parentWidth;
    private int showMoreViewWidth;
    private int tagWithTruncatedIndex;

    @NotNull
    private final Map<HistoryItem, View> tagsViewStore;
    private int verticalMargin;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int MIN_ITEM_WIDTH = UiExtKt.toPx(80);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryFlexLayout$ChildInfo;", "", "Landroid/view/View;", "view", "", "fullWidth", "<init>", "(Landroid/view/View;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/view/View;", "getView", "()Landroid/view/View;", "I", "getFullWidth", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class ChildInfo {
        private final int fullWidth;

        @NotNull
        private final View view;

        public ChildInfo(@NotNull View view, int i11) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.fullWidth = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChildInfo)) {
                return false;
            }
            ChildInfo childInfo = (ChildInfo) other;
            return Intrinsics.d(this.view, childInfo.view) && this.fullWidth == childInfo.fullWidth;
        }

        public final int getFullWidth() {
            return this.fullWidth;
        }

        public int hashCode() {
            return Integer.hashCode(this.fullWidth) + (this.view.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ChildInfo(view=" + this.view + ", fullWidth=" + this.fullWidth + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryFlexLayout$Companion;", "", "<init>", "()V", "", "MAX_COUNT_LINES", "I", "", "MAX_PERCENT_WIDTH", "D", "", "TEXT_VIEW_CONTENT_DESCRIPTION", "Ljava/lang/String;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryFlexLayout$TagPosition;", "", "", "index", "numberLine", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getIndex", "getNumberLine", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class TagPosition {
        private final int index;
        private final int numberLine;

        public TagPosition(int i11, int i12) {
            this.index = i11;
            this.numberLine = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TagPosition)) {
                return false;
            }
            TagPosition tagPosition = (TagPosition) other;
            return this.index == tagPosition.index && this.numberLine == tagPosition.numberLine;
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getNumberLine() {
            return this.numberLine;
        }

        public int hashCode() {
            return Integer.hashCode(this.numberLine) + (Integer.hashCode(this.index) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("TagPosition(index=", this.index, ", numberLine=", ")", this.numberLine);
        }
    }

    public /* synthetic */ HistoryFlexLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final List<ChildInfo> calculatingChildrenWidth(int widthMeasureSpec, int heightMeasureSpec) {
        ArrayList arrayList = new ArrayList();
        Iterator<View> it = C5316f0.b(this).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return arrayList;
            }
            View view = (View) c5314e0.next();
            int i11 = widthMeasureSpec;
            int i12 = heightMeasureSpec;
            measureChildWithMargins(view, i11, 0, i12, 0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int measuredWidth = view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            if (view == this.tagsViewStore.get(this.extraButton)) {
                this.showMoreViewWidth = measuredWidth;
            } else {
                arrayList.add(new ChildInfo(view, measuredWidth));
            }
            widthMeasureSpec = i11;
            heightMeasureSpec = i12;
        }
    }

    private final void calculatingTagSizeDependOnFreeSpace(Set<TagPosition> visibleViewsIndices, List<ChildInfo> childInfos, View showMoreView) {
        TagPosition tagPosition;
        ArrayList arrayList = new ArrayList();
        for (Object obj : visibleViewsIndices) {
            if (((TagPosition) obj).getNumberLine() == this.maxLinesCount) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            i12 += childInfos.get(((TagPosition) it.next()).getIndex()).getFullWidth();
        }
        int i13 = (this.parentWidth - i12) - this.showMoreViewWidth;
        ViewGroup.LayoutParams layoutParams = showMoreView.getLayoutParams();
        int marginEnd = i13 - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0);
        ViewGroup.LayoutParams layoutParams2 = showMoreView.getLayoutParams();
        int marginStart = marginEnd - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0);
        if (marginStart > this.minItemWidth && getChildCount() > visibleViewsIndices.size()) {
            View childAt = getChildAt(visibleViewsIndices.size());
            ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
            Intrinsics.g(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            if (!(childAt instanceof ButtonV3View)) {
                if (marginStart < 0) {
                    marginStart = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth();
                if (marginStart > measuredWidth) {
                    marginStart = measuredWidth;
                }
                if (marginStart < this.minItemWidth) {
                    childAt.setVisibility(8);
                } else {
                    marginLayoutParams.width = marginStart;
                    childAt.setLayoutParams(marginLayoutParams);
                    childAt.setVisibility(0);
                    this.tagWithTruncatedIndex = visibleViewsIndices.size();
                }
            }
        }
        int d11 = l.d(C5316f0.b(this)) - 1;
        boolean z11 = visibleViewsIndices.size() == d11 && (tagPosition = (TagPosition) C7714v.Y(visibleViewsIndices)) != null && this.tagWithTruncatedIndex == tagPosition.getIndex();
        if (visibleViewsIndices.size() >= d11 && !this.hasMoreTags && !z11) {
            i11 = 8;
        }
        showMoreView.setVisibility(i11);
    }

    private final Set<TagPosition> calculatingVisibleViews(List<ChildInfo> childInfos) {
        int paddingLeft = (this.parentWidth - getPaddingLeft()) - getPaddingRight();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        for (ChildInfo childInfo : childInfos) {
            int i14 = i12 + 1;
            if (i11 > this.maxLinesCount) {
                break;
            }
            i13 += childInfo.getFullWidth();
            int i15 = this.maxLinesCount;
            if (i11 >= i15 ? i13 <= paddingLeft - this.showMoreViewWidth : i13 <= paddingLeft) {
                linkedHashSet.add(new TagPosition(i12, i11));
            } else {
                if (i11 >= i15) {
                    break;
                }
                i11++;
                i13 = childInfo.getFullWidth();
                linkedHashSet.add(new TagPosition(i12, i11));
            }
            i12 = i14;
        }
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View getOrCreateTagButton(HistoryItem item) {
        ButtonV3View buttonV3View;
        View view = this.tagsViewStore.get(item);
        if (view == null) {
            if (item instanceof HistoryItem.TagButtonVO) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                TagButtonView tagButtonView = new TagButtonView(context, null, 0, 0, 14, null);
                tagButtonView.setLayoutParams(new FlexboxLayout.a(-2, -2));
                TagButtonHolderKt.bindOrGone(tagButtonView, ((HistoryItem.TagButtonVO) item).getTagButton(), this.itemActionHandler);
                tagButtonView.setMaxWidth((int) (tagButtonView.getContext().getResources().getDisplayMetrics().widthPixels * 0.7d));
                setupLocator(tagButtonView);
                Function1<? super HistoryItem, Unit> function1 = this.callBack;
                buttonV3View = tagButtonView;
                if (function1 != null) {
                    function1.invoke(item);
                    buttonV3View = tagButtonView;
                }
            } else {
                if (!(item instanceof HistoryItem.ButtonVO)) {
                    throw new o();
                }
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                ButtonV3View buttonV3View2 = new ButtonV3View(context2, null, 0, 0, 14, null);
                buttonV3View2.setLayoutParams(new FlexboxLayout.a(-2, -2));
                ButtonV3HolderKt.bindOrGone(buttonV3View2, ((HistoryItem.ButtonVO) item).getButton(), this.itemActionHandler);
                buttonV3View2.setMaxWidth((int) (buttonV3View2.getContext().getResources().getDisplayMetrics().widthPixels * 0.7d));
                setupLocator(buttonV3View2);
                Function1<? super HistoryItem, Unit> function12 = this.callBack;
                buttonV3View = buttonV3View2;
                if (function12 != null) {
                    function12.invoke(item);
                    buttonV3View = buttonV3View2;
                }
            }
            view = buttonV3View;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = this.horizontalMargin;
        marginLayoutParams.rightMargin = i11;
        marginLayoutParams.leftMargin = i11;
        int i12 = this.verticalMargin;
        marginLayoutParams.bottomMargin = i12;
        marginLayoutParams.topMargin = i12;
        view.setLayoutParams(marginLayoutParams);
        this.tagsViewStore.put(item, view);
        return view;
    }

    private final void setupCompactMode() {
        Iterator<T> it = this.currentTags.iterator();
        while (it.hasNext()) {
            addView(getOrCreateTagButton((HistoryItem) it.next()));
        }
        HistoryItem historyItem = this.extraButton;
        if (historyItem != null) {
            addView(getOrCreateTagButton(historyItem));
        }
    }

    private final void setupExpandedMode() {
        Iterator<T> it = this.currentTags.iterator();
        while (it.hasNext()) {
            View orCreateTagButton = getOrCreateTagButton((HistoryItem) it.next());
            orCreateTagButton.setVisibility(0);
            addView(orCreateTagButton);
        }
    }

    private final void setupLocator(ViewGroup viewGroup) {
        Iterator<View> it = C5316f0.b(viewGroup).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            } else {
                ((View) c5314e0.next()).setContentDescription("ButtonV3.titleLabel");
            }
        }
    }

    public final View findVisibleViewForItemID(long id2) {
        Object obj;
        View view;
        Iterator<T> it = this.currentTags.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((HistoryItem) obj).getId() == id2) {
                break;
            }
        }
        HistoryItem historyItem = (HistoryItem) obj;
        if (historyItem == null || (view = this.tagsViewStore.get(historyItem)) == null || view.getVisibility() != 0) {
            return null;
        }
        return view;
    }

    public final void invalidateAllTags() {
        removeAllViews();
        this.tagsViewStore.clear();
        if (this.isExpanded || this.maxLinesCount >= Integer.MAX_VALUE) {
            setupExpandedMode();
        } else {
            setupCompactMode();
        }
    }

    @Override // com.google.android.flexbox.FlexboxLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i11;
        HistoryItem historyItem = this.extraButton;
        if (this.isExpanded || historyItem == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        View orCreateTagButton = getOrCreateTagButton(historyItem);
        this.parentWidth = View.MeasureSpec.getSize(widthMeasureSpec);
        List<ChildInfo> calculatingChildrenWidth = calculatingChildrenWidth(widthMeasureSpec, heightMeasureSpec);
        Set<TagPosition> calculatingVisibleViews = calculatingVisibleViews(calculatingChildrenWidth);
        Iterator<View> it = C5316f0.b(this).iterator();
        int i12 = 0;
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                calculatingTagSizeDependOnFreeSpace(calculatingVisibleViews, calculatingChildrenWidth, orCreateTagButton);
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                return;
            }
            Object next = c5314e0.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            View view = (View) next;
            Set<TagPosition> set = calculatingVisibleViews;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (((TagPosition) it2.next()).getIndex() == i12) {
                        i11 = 0;
                        break;
                    }
                }
            }
            i11 = 8;
            view.setVisibility(i11);
            i12 = i13;
        }
    }

    public final void setItemActionHandlers(@NotNull Function1<? super AtomAction, Unit> itemActionHandler, @NotNull Function1<? super HistoryItem, Unit> callBack) {
        Intrinsics.checkNotNullParameter(itemActionHandler, "itemActionHandler");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.itemActionHandler = itemActionHandler;
        this.callBack = callBack;
    }

    public final void setMode(boolean isExpanded) {
        if (!isExpanded || this.isExpanded) {
            this.isExpanded = isExpanded;
        } else {
            this.isExpanded = true;
        }
    }

    public final void setPresentationSettings(@NotNull HistoryVO.PresentationSettings settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.maxLinesCount = settings.getCollapsedMaxRows();
        this.minItemWidth = settings.getLastItemMinWidth();
        this.extraButton = settings.getShowMoreButton();
        this.horizontalMargin = settings.getHistoryPaddings().getColumnGap();
        this.verticalMargin = settings.getHistoryPaddings().getRowGap();
        this.hasMoreTags = settings.getHasMoreItems();
    }

    public final void setTags(@NotNull List<? extends HistoryItem> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Iterator it = e0.d(this.tagsViewStore.keySet(), tags).iterator();
        while (it.hasNext()) {
            this.tagsViewStore.remove((HistoryItem) it.next());
        }
        this.currentTags = tags;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryFlexLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.currentTags = K.f71697a;
        this.maxLinesCount = 2;
        this.minItemWidth = MIN_ITEM_WIDTH;
        this.tagsViewStore = new LinkedHashMap();
        this.tagWithTruncatedIndex = -1;
        setFlexDirection(0);
        setFlexWrap(1);
        setAlignItems(4);
    }
}
