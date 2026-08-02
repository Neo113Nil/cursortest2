package ru.ozon.fintech.ui.dots;

import Cm.d;
import H30.i;
import Sc.InterfaceC3999a;
import Xc.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.dots.attacher.ViewPager2Attacher;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 Q2\u00020\u0001:\u0003QRSB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010,\u001a\u00020-H\u0014J\b\u0010.\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020-H\u0004J\u0010\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0007H\u0004J\u0010\u00102\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u001bH\u0004J\u0010\u00103\u001a\u00020-2\u0006\u00104\u001a\u00020\u0007H\u0004J\u0010\u00105\u001a\u00020-2\u0006\u00104\u001a\u00020\u0007H\u0002J\u0006\u00106\u001a\u00020-J\b\u00107\u001a\u00020-H\u0002J\b\u00108\u001a\u00020-H\u0002J\u0010\u00109\u001a\u00020-2\u0006\u0010:\u001a\u00020\u0007H&J\u0010\u0010;\u001a\u00020-2\u0006\u0010:\u001a\u00020\u0007H&J\b\u0010<\u001a\u00020-H&J\b\u0010=\u001a\u00020>H&J\u0010\u0010C\u001a\u00020-2\u0006\u0010D\u001a\u00020\u0007H\u0007J\u000e\u0010E\u001a\u00020-2\u0006\u0010F\u001a\u00020GJ0\u0010H\u001a\u00020-2\u0006\u0010I\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u0007H\u0014J\u0012\u0010N\u001a\u00020-2\b\u0010O\u001a\u0004\u0018\u00010PH\u0014R \u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001a\u0010#\u001a\u00020\u001bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0012\u0010?\u001a\u00020@X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006T"}, d2 = {"Lru/ozon/fintech/ui/dots/BaseDotsIndicator;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dots", "Ljava/util/ArrayList;", "Landroid/widget/ImageView;", "Lkotlin/collections/ArrayList;", "dotsClickable", "", "getDotsClickable", "()Z", "setDotsClickable", "(Z)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "dotsColor", "getDotsColor", "()I", "setDotsColor", "(I)V", "dotsSize", "", "getDotsSize", "()F", "setDotsSize", "(F)V", "dotsCornerRadius", "getDotsCornerRadius", "setDotsCornerRadius", "dotsSpacing", "getDotsSpacing", "setDotsSpacing", "pager", "Lru/ozon/fintech/ui/dots/BaseDotsIndicator$Pager;", "getPager", "()Lru/ozon/fintech/ui/dots/BaseDotsIndicator$Pager;", "setPager", "(Lru/ozon/fintech/ui/dots/BaseDotsIndicator$Pager;)V", "onAttachedToWindow", "", "refreshDotsCount", "refreshDotsColors", "dpToPx", "dp", "dpToPxF", "addDots", "count", "removeDots", "refreshDots", "refreshOnPageChangedListener", "refreshDotsSize", "refreshDotColor", "index", "addDot", "removeDot", "buildOnPageChangedListener", "Lru/ozon/fintech/ui/dots/OnPageChangeListenerHelper;", "type", "Lru/ozon/fintech/ui/dots/BaseDotsIndicator$Type;", "getType", "()Lru/ozon/fintech/ui/dots/BaseDotsIndicator$Type;", "setPointsColor", "color", "attachTo", "viewPager2", "Landroidx/viewpager2/widget/ViewPager2;", "onLayout", "changed", "left", "top", "right", "bottom", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "Companion", "Type", "Pager", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BaseDotsIndicator extends FrameLayout {
    public static final int DEFAULT_POINT_COLOR = -16711681;

    @NotNull
    protected final ArrayList<ImageView> dots;
    private boolean dotsClickable;
    private int dotsColor;
    private float dotsCornerRadius;
    private float dotsSize;
    private float dotsSpacing;
    private Pager pager;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\rH&J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004R\u0012\u0010\n\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/ui/dots/BaseDotsIndicator$Pager;", "", "isNotEmpty", "", "()Z", "currentItem", "", "getCurrentItem", "()I", "isEmpty", "count", "getCount", "setCurrentItem", "", "item", "smoothScroll", "removeOnPageChangeListener", "addOnPageChangeListener", "onPageChangeListenerHelper", "Lru/ozon/fintech/ui/dots/OnPageChangeListenerHelper;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Pager {
        void addOnPageChangeListener(@NotNull OnPageChangeListenerHelper onPageChangeListenerHelper);

        int getCount();

        int getCurrentItem();

        boolean isEmpty();

        boolean isNotEmpty();

        void removeOnPageChangeListener();

        void setCurrentItem(int item, boolean smoothScroll);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BU\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\b\u0012\b\b\u0001\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/fintech/ui/dots/BaseDotsIndicator$Type;", "", "defaultSize", "", "defaultSpacing", "styleableId", "", "dotsColorId", "", "dotsSizeId", "dotsSpacingId", "dotsCornerRadiusId", "dotsClickableId", "<init>", "(Ljava/lang/String;IFF[IIIIII)V", "getDefaultSize", "()F", "getDefaultSpacing", "getStyleableId", "()[I", "getDotsColorId", "()I", "getDotsSizeId", "getDotsSpacingId", "getDotsCornerRadiusId", "getDotsClickableId", "DEFAULT", "SPRING", "WORM", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type DEFAULT;
        public static final Type SPRING;
        public static final Type WORM;
        private final float defaultSize;
        private final float defaultSpacing;
        private final int dotsClickableId;
        private final int dotsColorId;
        private final int dotsCornerRadiusId;
        private final int dotsSizeId;
        private final int dotsSpacingId;

        @NotNull
        private final int[] styleableId;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{DEFAULT, SPRING, WORM};
        }

        static {
            int[] SpringDotsIndicator = G80.a.f9767e;
            Intrinsics.checkNotNullExpressionValue(SpringDotsIndicator, "SpringDotsIndicator");
            DEFAULT = new Type("DEFAULT", 0, 16.0f, 8.0f, SpringDotsIndicator, 2, 4, 5, 3, 1);
            int[] DotsIndicator = G80.a.f9764b;
            Intrinsics.checkNotNullExpressionValue(DotsIndicator, "DotsIndicator");
            SPRING = new Type("SPRING", 1, 16.0f, 4.0f, DotsIndicator, 1, 4, 5, 2, 1);
            int[] WormDotsIndicator = G80.a.f9769g;
            Intrinsics.checkNotNullExpressionValue(WormDotsIndicator, "WormDotsIndicator");
            WORM = new Type("WORM", 2, 16.0f, 4.0f, WormDotsIndicator, 1, 3, 4, 2, 1);
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i11, float f7, float f11, int[] iArr, int i12, int i13, int i14, int i15, int i16) {
            this.defaultSize = f7;
            this.defaultSpacing = f11;
            this.styleableId = iArr;
            this.dotsColorId = i12;
            this.dotsSizeId = i13;
            this.dotsSpacingId = i14;
            this.dotsCornerRadiusId = i15;
            this.dotsClickableId = i16;
        }

        @NotNull
        public static Xc.a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final float getDefaultSize() {
            return this.defaultSize;
        }

        public final float getDefaultSpacing() {
            return this.defaultSpacing;
        }

        public final int getDotsClickableId() {
            return this.dotsClickableId;
        }

        public final int getDotsColorId() {
            return this.dotsColorId;
        }

        public final int getDotsCornerRadiusId() {
            return this.dotsCornerRadiusId;
        }

        public final int getDotsSizeId() {
            return this.dotsSizeId;
        }

        public final int getDotsSpacingId() {
            return this.dotsSpacingId;
        }

        @NotNull
        public final int[] getStyleableId() {
            return this.styleableId;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseDotsIndicator(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshDots$lambda$1(BaseDotsIndicator baseDotsIndicator) {
        baseDotsIndicator.refreshDotsCount();
        baseDotsIndicator.refreshDotsColors();
        baseDotsIndicator.refreshDotsSize();
        baseDotsIndicator.refreshOnPageChangedListener();
    }

    private final void refreshDotsCount() {
        int size = this.dots.size();
        Pager pager = this.pager;
        Intrinsics.f(pager);
        if (size < pager.getCount()) {
            Pager pager2 = this.pager;
            Intrinsics.f(pager2);
            addDots(pager2.getCount() - this.dots.size());
            return;
        }
        int size2 = this.dots.size();
        Pager pager3 = this.pager;
        Intrinsics.f(pager3);
        if (size2 > pager3.getCount()) {
            int size3 = this.dots.size();
            Pager pager4 = this.pager;
            Intrinsics.f(pager4);
            removeDots(size3 - pager4.getCount());
        }
    }

    private final void refreshDotsSize() {
        Iterator<T> it = this.dots.iterator();
        while (it.hasNext()) {
            ExtensionsKt.setWidth((ImageView) it.next(), (int) this.dotsSize);
        }
    }

    private final void refreshOnPageChangedListener() {
        Pager pager = this.pager;
        Intrinsics.f(pager);
        if (pager.isNotEmpty()) {
            Pager pager2 = this.pager;
            Intrinsics.f(pager2);
            pager2.removeOnPageChangeListener();
            OnPageChangeListenerHelper buildOnPageChangedListener = buildOnPageChangedListener();
            Pager pager3 = this.pager;
            Intrinsics.f(pager3);
            pager3.addOnPageChangeListener(buildOnPageChangedListener);
            Pager pager4 = this.pager;
            Intrinsics.f(pager4);
            buildOnPageChangedListener.onPageScrolled(pager4.getCurrentItem(), 0.0f);
        }
    }

    private final void removeDots(int count) {
        for (int i11 = 0; i11 < count; i11++) {
            removeDot();
        }
    }

    public abstract void addDot(int index);

    protected final void addDots(int count) {
        for (int i11 = 0; i11 < count; i11++) {
            addDot(i11);
        }
    }

    public final void attachTo(@NotNull ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "viewPager2");
        new ViewPager2Attacher().setup(this, viewPager2);
    }

    @NotNull
    public abstract OnPageChangeListenerHelper buildOnPageChangedListener();

    protected final int dpToPx(int dp) {
        return (int) (getContext().getResources().getDisplayMetrics().density * dp);
    }

    protected final float dpToPxF(float dp) {
        return getContext().getResources().getDisplayMetrics().density * dp;
    }

    public final boolean getDotsClickable() {
        return this.dotsClickable;
    }

    public final int getDotsColor() {
        return this.dotsColor;
    }

    protected final float getDotsCornerRadius() {
        return this.dotsCornerRadius;
    }

    protected final float getDotsSize() {
        return this.dotsSize;
    }

    protected final float getDotsSpacing() {
        return this.dotsSpacing;
    }

    public final Pager getPager() {
        return this.pager;
    }

    @NotNull
    public abstract Type getType();

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new d(this, 5));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (getLayoutDirection() == 1) {
            setLayoutDirection(0);
            setRotation(180.0f);
            requestLayout();
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(state);
        post(new i(this, 4));
    }

    public abstract void refreshDotColor(int index);

    public final void refreshDots() {
        if (this.pager == null) {
            return;
        }
        post(new M30.a(this, 3));
    }

    protected final void refreshDotsColors() {
        int size = this.dots.size();
        for (int i11 = 0; i11 < size; i11++) {
            refreshDotColor(i11);
        }
    }

    public abstract void removeDot();

    public final void setDotsClickable(boolean z11) {
        this.dotsClickable = z11;
    }

    public final void setDotsColor(int i11) {
        this.dotsColor = i11;
        refreshDotsColors();
    }

    protected final void setDotsCornerRadius(float f7) {
        this.dotsCornerRadius = f7;
    }

    protected final void setDotsSize(float f7) {
        this.dotsSize = f7;
    }

    protected final void setDotsSpacing(float f7) {
        this.dotsSpacing = f7;
    }

    public final void setPager(Pager pager) {
        this.pager = pager;
    }

    @InterfaceC3999a
    public final void setPointsColor(int color) {
        setDotsColor(color);
        refreshDotsColors();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseDotsIndicator(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BaseDotsIndicator(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDotsIndicator(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dots = new ArrayList<>();
        this.dotsClickable = true;
        this.dotsColor = DEFAULT_POINT_COLOR;
        float dpToPxF = dpToPxF(getType().getDefaultSize());
        this.dotsSize = dpToPxF;
        this.dotsCornerRadius = dpToPxF / 2.0f;
        this.dotsSpacing = dpToPxF(getType().getDefaultSpacing());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getType().getStyleableId());
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            setDotsColor(obtainStyledAttributes.getColor(getType().getDotsColorId(), DEFAULT_POINT_COLOR));
            this.dotsSize = obtainStyledAttributes.getDimension(getType().getDotsSizeId(), this.dotsSize);
            this.dotsCornerRadius = obtainStyledAttributes.getDimension(getType().getDotsCornerRadiusId(), this.dotsCornerRadius);
            this.dotsSpacing = obtainStyledAttributes.getDimension(getType().getDotsSpacingId(), this.dotsSpacing);
            this.dotsClickable = obtainStyledAttributes.getBoolean(getType().getDotsClickableId(), true);
            obtainStyledAttributes.recycle();
        }
    }
}
