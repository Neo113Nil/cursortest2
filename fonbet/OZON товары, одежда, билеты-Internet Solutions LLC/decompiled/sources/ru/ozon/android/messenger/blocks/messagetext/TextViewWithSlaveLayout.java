package ru.ozon.android.messenger.blocks.messagetext;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.view.timestatus.TimeStatusView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/android/messenger/blocks/messagetext/TextViewWithSlaveLayout;", "Landroid/view/ViewGroup;", "a", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TextViewWithSlaveLayout extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f85803a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f85804b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private a f85805c;

    public interface a {

        /* renamed from: ru.ozon.android.messenger.blocks.messagetext.TextViewWithSlaveLayout$a$a, reason: collision with other inner class name */
        public static final class C1512a implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C1512a f85806a = new C1512a();
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f85807a = new b();
        }

        public static final class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f85808a = new c();
        }

        public static final class d implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f85809a = new d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextViewWithSlaveLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f85803a = Sc.k.b(new o(this));
        this.f85804b = Sc.k.b(new p(this));
        this.f85805c = a.C1512a.f85806a;
    }

    private final AppCompatTextView a() {
        return (AppCompatTextView) this.f85803a.getValue();
    }

    private final TimeStatusView b() {
        return (TimeStatusView) this.f85804b.getValue();
    }

    @Override // android.view.ViewGroup
    @NotNull
    public final ViewGroup.LayoutParams generateLayoutParams(@NotNull AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        return new ViewGroup.MarginLayoutParams(getContext(), attrs);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int paddingTop;
        int i16;
        int paddingTop2;
        int i17;
        int i18;
        int i19;
        int i21;
        int measuredWidth = a().getMeasuredWidth();
        int measuredHeight = a().getMeasuredHeight();
        int measuredWidth2 = b().getMeasuredWidth();
        int measuredHeight2 = b().getMeasuredHeight();
        int paddingEnd = getPaddingEnd() / 2;
        ViewParent parent = getParent();
        ViewParent parent2 = parent != null ? parent.getParent() : null;
        ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        int measuredWidth3 = viewGroup != null ? viewGroup.getMeasuredWidth() : i13 - i11;
        AppCompatTextView a11 = a();
        int paddingStart = getPaddingStart();
        a aVar = this.f85805c;
        a.c cVar = a.c.f85808a;
        if (Intrinsics.d(aVar, cVar)) {
            i15 = ((i14 - i12) - measuredHeight2) - measuredHeight;
            paddingTop = getPaddingTop();
        } else {
            i15 = (i14 - i12) - measuredHeight;
            paddingTop = getPaddingTop();
        }
        int i22 = paddingTop + i15;
        int paddingEnd2 = getPaddingEnd() + measuredWidth;
        if (Intrinsics.d(this.f85805c, cVar)) {
            i16 = (i14 - i12) - measuredHeight2;
            paddingTop2 = getPaddingTop();
        } else {
            i16 = i14 - i12;
            paddingTop2 = getPaddingTop();
        }
        a11.layout(paddingStart, i22, paddingEnd2, paddingTop2 + i16);
        TimeStatusView b11 = b();
        int paddingEnd3 = ((measuredWidth3 - measuredWidth2) - getPaddingEnd()) + paddingEnd;
        a aVar2 = this.f85805c;
        a.d dVar = a.d.f85809a;
        boolean d11 = Intrinsics.d(aVar2, dVar);
        a.b bVar = a.b.f85807a;
        if (d11) {
            i17 = (i14 - i12) - measuredHeight;
        } else if (Intrinsics.d(aVar2, bVar)) {
            int i23 = ru.ozon.android.messenger.blocks.chat.a.f84478c;
            i18 = ru.ozon.android.messenger.utils.e.f91906c;
            i17 = (measuredHeight - measuredHeight2) + i18;
        } else {
            i17 = measuredHeight;
        }
        int paddingEnd4 = (measuredWidth3 - getPaddingEnd()) + paddingEnd;
        a aVar3 = this.f85805c;
        if (Intrinsics.d(aVar3, dVar)) {
            i19 = ((i14 - i12) - measuredHeight) + measuredHeight2;
        } else if (Intrinsics.d(aVar3, bVar)) {
            int i24 = ru.ozon.android.messenger.blocks.chat.a.f84478c;
            i21 = ru.ozon.android.messenger.utils.e.f91906c;
            i19 = i21 + measuredHeight;
        } else {
            i19 = measuredHeight + measuredHeight2;
        }
        b11.layout(paddingEnd3, i17, paddingEnd4, i19);
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        int i13;
        a().measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i11) - getPaddingStart()) - getPaddingEnd(), LinearLayoutManager.INVALID_OFFSET), i12);
        b().measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i11) - getPaddingStart()) - getPaddingEnd(), LinearLayoutManager.INVALID_OFFSET), i12);
        int paddingEnd = getPaddingEnd() + getPaddingStart();
        int size = View.MeasureSpec.getSize(i11) - paddingEnd;
        int lineWidth = (int) a().getLayout().getLineWidth(a().getLineCount() - 1);
        int measuredWidth = a().getMeasuredWidth();
        int measuredHeight = a().getMeasuredHeight();
        int measuredWidth2 = b().getMeasuredWidth();
        int measuredHeight2 = b().getMeasuredHeight();
        boolean z11 = a().getLineCount() == 1;
        int i14 = measuredWidth + measuredWidth2;
        a.c cVar = a.c.f85808a;
        Object obj = a.b.f85807a;
        Object obj2 = a.d.f85809a;
        a.c cVar2 = (i14 > size || !z11) ? (lineWidth + measuredWidth2 > size || z11) ? cVar : obj : obj2;
        this.f85805c = cVar2;
        if (!cVar2.equals(obj2)) {
            i14 = cVar2.equals(obj) ? Math.max(measuredWidth, lineWidth + measuredWidth2) : Math.max(measuredWidth, measuredWidth2);
        }
        int i15 = i14 + paddingEnd;
        if (Intrinsics.d(this.f85805c, cVar)) {
            i13 = measuredHeight + measuredHeight2;
        } else {
            int max = Math.max(measuredHeight, measuredHeight2);
            ViewGroup.LayoutParams layoutParams = b().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            i13 = max + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        }
        setMeasuredDimension(i15, getPaddingBottom() + getPaddingTop() + i13);
    }
}
