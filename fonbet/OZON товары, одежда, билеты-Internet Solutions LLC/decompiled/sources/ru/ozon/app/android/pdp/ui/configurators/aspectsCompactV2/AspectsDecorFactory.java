package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2;

import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/AspectsDecorFactory;", "", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/AspectsDecorFactory$AspectMode;", "aspectMode", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/AspectsDecorFactory$AspectMode;)V", "", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "variants", "", "calculateGridsCount", "(Ljava/util/List;)I", "Landroidx/recyclerview/widget/RecyclerView$n;", "getItemDecoration", "()Landroidx/recyclerview/widget/RecyclerView$n;", "Landroidx/recyclerview/widget/RecyclerView$o;", "getLayoutManager", "()Landroidx/recyclerview/widget/RecyclerView$o;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "adjustPadding", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V", "Landroid/content/Context;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/AspectsDecorFactory$AspectMode;", "pageOffset", "I", "flexEdgeTopMargin", "flexEdgeMargin", "AspectMode", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsDecorFactory {

    @NotNull
    private final AspectMode aspectMode;

    @NotNull
    private final Context context;
    private final int flexEdgeMargin;
    private final int flexEdgeTopMargin;
    private final int pageOffset;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/AspectsDecorFactory$AspectMode;", "", "<init>", "(Ljava/lang/String;I)V", "HORIZONTAL", "HORIZONTAL_ZERO_SPACE_BETWEEN", "VERTICAL", "FOUR_COLUMN", "TWO_COLUMN", "FIVE_COLUMN", "GRID_ADJUST", "FLEXBOX", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AspectMode {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AspectMode[] $VALUES;
        public static final AspectMode HORIZONTAL = new AspectMode("HORIZONTAL", 0);
        public static final AspectMode HORIZONTAL_ZERO_SPACE_BETWEEN = new AspectMode("HORIZONTAL_ZERO_SPACE_BETWEEN", 1);
        public static final AspectMode VERTICAL = new AspectMode("VERTICAL", 2);
        public static final AspectMode FOUR_COLUMN = new AspectMode("FOUR_COLUMN", 3);
        public static final AspectMode TWO_COLUMN = new AspectMode("TWO_COLUMN", 4);
        public static final AspectMode FIVE_COLUMN = new AspectMode("FIVE_COLUMN", 5);
        public static final AspectMode GRID_ADJUST = new AspectMode("GRID_ADJUST", 6);
        public static final AspectMode FLEXBOX = new AspectMode("FLEXBOX", 7);

        private static final /* synthetic */ AspectMode[] $values() {
            return new AspectMode[]{HORIZONTAL, HORIZONTAL_ZERO_SPACE_BETWEEN, VERTICAL, FOUR_COLUMN, TWO_COLUMN, FIVE_COLUMN, GRID_ADJUST, FLEXBOX};
        }

        static {
            AspectMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AspectMode(String str, int i11) {
        }

        public static AspectMode valueOf(String str) {
            return (AspectMode) Enum.valueOf(AspectMode.class, str);
        }

        public static AspectMode[] values() {
            return (AspectMode[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AspectMode.values().length];
            try {
                iArr[AspectMode.HORIZONTAL_ZERO_SPACE_BETWEEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AspectMode.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AspectMode.VERTICAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AspectMode.TWO_COLUMN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AspectMode.FOUR_COLUMN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AspectMode.GRID_ADJUST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AspectMode.FIVE_COLUMN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AspectMode.FLEXBOX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AspectsDecorFactory(@NotNull Context context, @NotNull AspectMode aspectMode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aspectMode, "aspectMode");
        this.context = context;
        this.aspectMode = aspectMode;
        this.pageOffset = ResourceExtKt.toPx(88);
        this.flexEdgeTopMargin = ResourceExtKt.toPx(8);
        this.flexEdgeMargin = ResourceExtKt.toPx(12);
    }

    private final int calculateGridsCount(List<? extends AspectsCompactVO$Variant> variants) {
        Iterator<T> it = variants.iterator();
        int i11 = 4;
        while (it.hasNext()) {
            OzonSpannableString title = ((AspectsCompactVO$Variant) it.next()).getTitle();
            int i12 = 3;
            if (title.length() < 3) {
                i12 = 4;
            } else {
                int length = title.length();
                if (3 > length || length >= 6) {
                    i12 = 2;
                }
            }
            if (i11 > i12) {
                i11 = i12;
            }
        }
        return i11;
    }

    public final void adjustPadding(@NotNull RecyclerView recyclerView, @NotNull List<? extends AspectsCompactVO$Variant> variants) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(variants, "variants");
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.aspectMode.ordinal()];
        if (i11 == 1 || i11 == 2) {
            recyclerView.setPadding(0, 0, variants.size() > 1 ? this.pageOffset : 0, 0);
            return;
        }
        if (i11 == 5) {
            int i12 = this.flexEdgeMargin;
            recyclerView.setPadding(i12, this.flexEdgeTopMargin, i12, i12);
            return;
        }
        if (i11 != 6) {
            if (i11 != 7) {
                recyclerView.setPadding(0, 0, 0, 0);
                return;
            } else {
                recyclerView.setPadding(this.flexEdgeMargin, recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
                return;
            }
        }
        int i13 = this.flexEdgeMargin;
        recyclerView.setPadding(i13, this.flexEdgeTopMargin, i13, i13);
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        Intrinsics.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        ((GridLayoutManager) layoutManager).m(calculateGridsCount(variants));
    }

    @NotNull
    public final RecyclerView.n getItemDecoration() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.aspectMode.ordinal()]) {
            case 1:
                return new HorizontalAspectsZeroSpaceBetweenDecoration(this.context);
            case 2:
                return new HorizontalAspectsDecoration(this.context);
            case 3:
                return new VerticalAspectsDecoration(this.context);
            case 4:
                return new TwoColumnAspectsDecoration(this.context);
            case 5:
            case 6:
            case 7:
                return new FourColumnAspectsDecoration(this.context);
            case 8:
                return new FlexBoxAspectsDecoration(this.context);
            default:
                throw new o();
        }
    }

    @NotNull
    public final RecyclerView.o getLayoutManager() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.aspectMode.ordinal()]) {
            case 1:
            case 2:
                return new LinearLayoutManager(this.context, 0, false);
            case 3:
                return new LinearLayoutManager(this.context, 1, false);
            case 4:
                return new GridLayoutManager(this.context, 2);
            case 5:
                return new GridLayoutManager(this.context, 4);
            case 6:
                return new GridLayoutManager(this.context, 2);
            case 7:
                return new GridLayoutManager(this.context, 5);
            case 8:
                return new FlexboxLayoutManager(this.context);
            default:
                throw new o();
        }
    }
}
