package ru.ozon.fintech.ui.dots;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u001a*\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\u0012\u0012\u0004\u0012\u0002H\n0\u000bj\b\u0012\u0004\u0012\u0002H\n`\f2\u0006\u0010\r\u001a\u00020\u0004H\u0000\u001a\f\u0010\u000e\u001a\u00020\u0004*\u00020\u000fH\u0000\u001a\u0014\u0010\u0016\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\"\u0018\u0010\u0010\u001a\u00020\t*\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012\"\u0018\u0010\u0010\u001a\u00020\t*\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0014\"\u001a\u0010\u0015\u001a\u00020\t*\u0004\u0018\u00010\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012\"\u001a\u0010\u0015\u001a\u00020\t*\u0004\u0018\u00010\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0019"}, d2 = {"setPaddingHorizontal", "", "Landroid/view/View;", "padding", "", "setPaddingVertical", "setWidth", "width", "isInBounds", "", "T", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "index", "getThemePrimaryColor", "Landroid/content/Context;", "isNotEmpty", "Landroidx/viewpager/widget/ViewPager;", "(Landroidx/viewpager/widget/ViewPager;)Z", "Landroidx/viewpager2/widget/ViewPager2;", "(Landroidx/viewpager2/widget/ViewPager2;)Z", "isEmpty", "setBackgroundCompat", "background", "Landroid/graphics/drawable/Drawable;", "fintech-ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExtensionsKt {
    public static final int getThemePrimaryColor(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        return typedValue.data;
    }

    public static final boolean isEmpty(ViewPager viewPager) {
        androidx.viewpager.widget.a adapter;
        return (viewPager == null || (adapter = viewPager.getAdapter()) == null || adapter.getCount() != 0) ? false : true;
    }

    public static final <T> boolean isInBounds(@NotNull ArrayList<T> arrayList, int i11) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return i11 >= 0 && i11 < arrayList.size();
    }

    public static final boolean isNotEmpty(@NotNull ViewPager viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "<this>");
        androidx.viewpager.widget.a adapter = viewPager.getAdapter();
        return (adapter != null ? adapter.getCount() : 0) > 0;
    }

    public static final void setBackgroundCompat(@NotNull View view, Drawable drawable) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setBackground(drawable);
    }

    public static final void setPaddingHorizontal(@NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(i11, view.getPaddingTop(), i11, view.getPaddingBottom());
    }

    public static final void setPaddingVertical(@NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(view.getPaddingLeft(), i11, view.getPaddingRight(), i11);
    }

    public static final void setWidth(@NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.getLayoutParams().width = i11;
        view.requestLayout();
    }

    public static final boolean isEmpty(ViewPager2 viewPager2) {
        RecyclerView.g e11;
        return (viewPager2 == null || (e11 = viewPager2.e()) == null || e11.getCardsCount() != 0) ? false : true;
    }

    public static final boolean isNotEmpty(@NotNull ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        RecyclerView.g e11 = viewPager2.e();
        return (e11 != null ? e11.getCardsCount() : 0) > 0;
    }
}
