package ru.ozon.android.messenger.blocks.buttons.presentation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.buttons.g;
import ru.ozon.android.messenger.utils.h;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.R$styleable;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniTextStyles;

/* loaded from: classes10.dex */
public abstract class a extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f84427a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f84428b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f84427a = -1;
        this.f84428b = true;
        int[] m_ChatButtonLayout = R$styleable.m_ChatButtonLayout;
        Intrinsics.checkNotNullExpressionValue(m_ChatButtonLayout, "m_ChatButtonLayout");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, m_ChatButtonLayout, 0, 0);
        this.f84427a = obtainStyledAttributes.getDimensionPixelSize(R$styleable.m_ChatButtonLayout_android_maxWidth, -1);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(@NotNull View view, boolean z11) {
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackground(h.b(context) ? androidx.core.content.a.getDrawable(view.getContext(), R$drawable.m_bg_button_select_message) : androidx.core.content.a.getDrawable(view.getContext(), R$drawable.m_bg_button_message));
        view.setClickable(true);
        i11 = ru.ozon.android.messenger.utils.e.f91910g;
        i12 = ru.ozon.android.messenger.utils.e.f91908e;
        i13 = ru.ozon.android.messenger.utils.e.f91910g;
        int i14 = z11 ? ru.ozon.android.messenger.utils.e.f91910g : ru.ozon.android.messenger.utils.e.f91908e;
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(i11, i12, i13, i14);
    }

    public final boolean c() {
        return this.f84428b;
    }

    public final void d(boolean z11) {
        this.f84428b = z11;
        f();
    }

    protected final void e(@NotNull LinearLayout linearLayout, @NotNull List<g> textList) {
        Intrinsics.checkNotNullParameter(linearLayout, "<this>");
        Intrinsics.checkNotNullParameter(textList, "textList");
        linearLayout.removeAllViews();
        int size = textList.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = textList.get(i11);
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int parseColor = styleParser.parseColor(context, gVar.a(), R$color.text_primary);
            Integer parseTextStyle = styleParser.parseTextStyle(gVar.b());
            int intValue = parseTextStyle != null ? parseTextStyle.intValue() : UniTextStyles.BODY_500_MEDIUM.getResId();
            appCompatTextView.setText(gVar.c());
            appCompatTextView.setTextAppearance(intValue);
            if (!this.f84428b) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int i12 = R$color.text_tertiary;
                Intrinsics.checkNotNullParameter(context2, "<this>");
                parseColor = androidx.core.content.a.getColor(context2, i12);
            }
            appCompatTextView.setTextColor(parseColor);
            linearLayout.addView(appCompatTextView);
        }
    }

    public abstract void f();

    protected final void g(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setEnabled(this.f84428b);
        view.setClickable(this.f84428b);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        int i13 = this.f84427a;
        if (i13 == -1) {
            super.onMeasure(i11, i12);
            return;
        }
        Iterator<View> it = C5316f0.b(this).iterator();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                int min = Math.min(i14, i13);
                setMeasuredDimension(min, i15);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 0));
                return;
            }
            View view = (View) c5314e0.next();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            measureChild(view, i11, i12);
            int measuredWidth = view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int measuredHeight = view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            i14 = Math.max(i14, measuredWidth);
            i15 += measuredHeight;
        }
    }
}
