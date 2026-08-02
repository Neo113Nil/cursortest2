package ru.ozon.app.android.travel.molecules.view.shiftedPreviewIcons;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0014J0\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0014J\u0010\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001f\u001a\u00020\rH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/molecules/view/shiftedPreviewIcons/ShiftedPreviewIconsView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "overlapPx", "iconViewsPool", "", "Lru/ozon/uni/android/atom/icon/IconView;", "textAtomView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "bindOrGone", "data", "Lru/ozon/app/android/travel/molecules/view/shiftedPreviewIcons/ShiftedPreviewIconsVO;", "bind", "createIconView", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShiftedPreviewIconsView extends ViewGroup {

    @NotNull
    private final List<IconView> iconViewsPool;
    private final int overlapPx;

    @NotNull
    private final TextAtomV2View textAtomView;

    public /* synthetic */ ShiftedPreviewIconsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final IconView createIconView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return iconView;
    }

    public final void bind(@NotNull ShiftedPreviewIconsVO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        List<IconDTO> icons = data.getIcons();
        int size = icons.size();
        if (size > this.iconViewsPool.size()) {
            int size2 = size - this.iconViewsPool.size();
            for (int i11 = 0; i11 < size2; i11++) {
                IconView createIconView = createIconView();
                this.iconViewsPool.add(createIconView);
                addView(createIconView, getChildCount() - 1);
            }
        }
        int i12 = 0;
        for (Object obj : this.iconViewsPool) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            IconView iconView = (IconView) obj;
            if (i12 < size) {
                iconView.setVisibility(0);
                IconHolderKt.bind$default(iconView, icons.get(i12), null, 2, null);
            } else {
                iconView.setVisibility(8);
            }
            i12 = i13;
        }
        int i14 = size - 1;
        if (data.getHiddenIconsCount() != null && i14 >= 0) {
            ShiftedPreviewIconsViewKt.loadWithBlur(this.iconViewsPool.get(i14));
        }
        TextHolderKt.bindOrGone$default(this.textAtomView, data.getHiddenIconsCount(), null, 2, null);
        requestLayout();
    }

    public final void bindOrGone(ShiftedPreviewIconsVO data) {
        if (data == null) {
            ViewExtKt.gone(this);
        } else {
            ViewExtKt.show(this);
            bind(data);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        List<IconView> list = this.iconViewsPool;
        ArrayList<IconView> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((IconView) obj).getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        for (IconView iconView : arrayList) {
            LayoutExtKt.layoutLeftTop(iconView, paddingLeft, paddingTop);
            paddingLeft += iconView.getMeasuredWidth() - this.overlapPx;
        }
        if (this.textAtomView.getVisibility() != 0 || arrayList.isEmpty()) {
            return;
        }
        IconView iconView2 = (IconView) C7714v.X(arrayList);
        int measuredWidth = this.textAtomView.getMeasuredWidth();
        int measuredHeight = this.textAtomView.getMeasuredHeight();
        int right2 = (iconView2.getRight() + iconView2.getLeft()) / 2;
        int i11 = right2 - (measuredWidth / 2);
        int bottom2 = ((iconView2.getBottom() + iconView2.getTop()) / 2) - (measuredHeight / 2);
        this.textAtomView.layout(i11, bottom2, measuredWidth + i11, measuredHeight + bottom2);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Iterator<View> it = C5316f0.b(this).iterator();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                break;
            }
            View view = (View) c5314e0.next();
            if (view.getVisibility() != 8) {
                measureChild(view, widthMeasureSpec, heightMeasureSpec);
                if (view != this.textAtomView) {
                    i12++;
                    i13 = Math.max(i13, view.getMeasuredHeight());
                }
            }
        }
        if (i12 > 0) {
            List<IconView> list = this.iconViewsPool;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((IconView) obj).getVisibility() == 0) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                i11 += ((IconView) it2.next()).getMeasuredWidth();
            }
            i11 = getPaddingRight() + getPaddingLeft() + (i11 - ((i12 - 1) * this.overlapPx));
        }
        setMeasuredDimension(View.resolveSize(i11, widthMeasureSpec), View.resolveSize(getPaddingBottom() + getPaddingTop() + i13, heightMeasureSpec));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShiftedPreviewIconsView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.overlapPx = ResourceExtKt.toPx(Paddings.PADDING_300.getPx(), context);
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < 3; i12++) {
            IconView createIconView = createIconView();
            arrayList.add(createIconView);
            addView(createIconView);
        }
        this.iconViewsPool = arrayList;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setVisibility(8);
        addView(textAtomV2View);
        this.textAtomView = textAtomV2View;
    }
}
