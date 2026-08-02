package ru.ozon.app.android.common.filterWidgets.filters.common;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001aC\u0010\r\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction$Click;", "", "shouldIgnoreKeyboard", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)Z", "Landroidx/recyclerview/widget/RecyclerView$o;", "isHorizontalScrollEnabled", "", "maxRowsCount", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "onHasSubListCallback", "updateLayoutManagerIfNecessary", "(Landroidx/recyclerview/widget/RecyclerView$o;ZLjava/lang/Integer;Landroid/content/Context;Lkotlin/jvm/functions/Function0;)Landroidx/recyclerview/widget/RecyclerView$o;", "Lcom/google/android/flexbox/FlexboxLayoutManager;", "createFlexboxLayoutManager", "(Landroid/content/Context;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)Lcom/google/android/flexbox/FlexboxLayoutManager;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtKt {
    private static final FlexboxLayoutManager createFlexboxLayoutManager(final Context context, final Integer num, final Function0<Unit> function0) {
        return new FlexboxLayoutManager(context) { // from class: ru.ozon.app.android.common.filterWidgets.filters.common.ExtKt$createFlexboxLayoutManager$1
            @Override // androidx.recyclerview.widget.RecyclerView.o
            public RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams lp) {
                return new FlexboxLayoutManager.b(lp);
            }

            @Override // com.google.android.flexbox.FlexboxLayoutManager, com.google.android.flexbox.a
            public List<c> getFlexLinesInternal() {
                List<c> flexLinesInternal = super.getFlexLinesInternal();
                Integer num2 = num;
                if (num2 != null) {
                    Function0<Unit> function02 = function0;
                    int intValue = num2.intValue();
                    if (flexLinesInternal.size() > intValue) {
                        if (function02 != null) {
                            function02.invoke();
                        }
                        flexLinesInternal.subList(intValue, flexLinesInternal.size()).clear();
                    }
                }
                Intrinsics.f(flexLinesInternal);
                return flexLinesInternal;
            }
        };
    }

    public static final boolean shouldIgnoreKeyboard(@NotNull AtomAction.Click click) {
        String str;
        Intrinsics.checkNotNullParameter(click, "<this>");
        Map<String, String> params = click.getParams();
        if (params == null || (str = params.get("shouldIgnoreKeyboard")) == null) {
            return false;
        }
        return Intrinsics.d(h.t0(str), Boolean.TRUE);
    }

    public static final RecyclerView.o updateLayoutManagerIfNecessary(RecyclerView.o oVar, boolean z11, Integer num, @NotNull Context context, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (z11) {
            if (oVar instanceof LinearLayoutManager) {
                return null;
            }
            return new LinearLayoutManager(context, 0, false);
        }
        if (oVar instanceof FlexboxLayoutManager) {
            int size = ((FlexboxLayoutManager) oVar).getFlexLinesInternal().size();
            if (num != null && size == num.intValue()) {
                return null;
            }
        }
        return createFlexboxLayoutManager(context, num, function0);
    }
}
