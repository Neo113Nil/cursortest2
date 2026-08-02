package ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v1.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.BxAtomConfig;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.generator.GeneratorId;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\u000f2\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\"\u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.R.\u00102\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u0001008\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v1/view/OverlayButtonsHorizontalAtomsLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "newAtoms", "", "onAdapterChanged", "(Ljava/util/List;)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "colorToken", "setBackgroundColor", "(Ljava/lang/String;)V", "setDividerColor", "Lru/ozon/uni/atoms/generator/GeneratorId;", "generator", "Lru/ozon/uni/atoms/generator/GeneratorId;", "dividerWidth", "I", "dividerHeight", "", "Landroid/graphics/RectF;", "dividerRects", "Ljava/util/List;", "backgroundColorCache", "Ljava/lang/String;", "dividerColorCache", "Lru/ozon/uni/atoms/af/AtomsAdapter;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "adapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "getAdapter", "()Lru/ozon/uni/atoms/af/AtomsAdapter;", "setAdapter", "(Lru/ozon/uni/atoms/af/AtomsAdapter;)V", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OverlayButtonsHorizontalAtomsLayout extends LinearLayout {
    private AtomsAdapter adapter;

    @NotNull
    private String backgroundColorCache;

    @NotNull
    private String dividerColorCache;
    private final int dividerHeight;

    @NotNull
    private final List<RectF> dividerRects;
    private final int dividerWidth;

    @NotNull
    private final GeneratorId generator;

    @NotNull
    private final Paint paint;

    public /* synthetic */ OverlayButtonsHorizontalAtomsLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAdapterChanged(List<? extends Atom<AtomDTO, Atom.AtomConfiguration>> newAtoms) {
        removeAllViews();
        int i11 = 0;
        for (Object obj : newAtoms) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            Atom<AtomDTO, Atom.AtomConfiguration> atom = (Atom) obj;
            View containerView = atom.getContainerView();
            atom.setTestId(this.generator.generateId(atom, i11));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i11 != 0) {
                layoutParams.leftMargin = this.dividerWidth;
            }
            Unit unit = Unit.f71690a;
            atom.onLayoutParamsChanged(layoutParams);
            addView(containerView, layoutParams);
            i11 = i12;
        }
        int childCount = getChildCount() > 1 ? getChildCount() - 1 : 0;
        while (this.dividerRects.size() > childCount) {
            List<RectF> list = this.dividerRects;
            list.remove(C7714v.P(list));
        }
        while (this.dividerRects.size() < childCount) {
            this.dividerRects.add(new RectF());
        }
        requestLayout();
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        for (RectF rectF : this.dividerRects) {
            if (!rectF.isEmpty()) {
                canvas.drawRect(rectF, this.paint);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (this.dividerRects.isEmpty()) {
            return;
        }
        int i11 = this.dividerHeight;
        float height = (getHeight() / 2.0f) - (i11 / 2.0f);
        float f7 = i11 + height;
        int size = this.dividerRects.size();
        for (int i12 = 0; i12 < size; i12++) {
            View childAt = getChildAt(i12);
            ViewGroup.LayoutParams layoutParams = childAt != null ? childAt.getLayoutParams() : null;
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
            if (childAt == null || layoutParams2 == null) {
                this.dividerRects.get(i12).setEmpty();
            } else {
                float right2 = childAt.getRight() + layoutParams2.getMarginEnd();
                this.dividerRects.get(i12).set(right2, height, this.dividerWidth + right2, f7);
            }
        }
    }

    public final void setAdapter(AtomsAdapter atomsAdapter) {
        if (Intrinsics.d(this.adapter, atomsAdapter)) {
            return;
        }
        AtomsAdapter atomsAdapter2 = this.adapter;
        if (atomsAdapter2 != null) {
            atomsAdapter2.removeObserver(new OverlayButtonsHorizontalAtomsLayout$adapter$1(this));
        }
        if (atomsAdapter != null) {
            atomsAdapter.addObserver(new OverlayButtonsHorizontalAtomsLayout$adapter$2(this));
        }
        if (atomsAdapter != null) {
            atomsAdapter.setGenerator(this.generator);
        }
        this.adapter = atomsAdapter;
    }

    public final void setBackgroundColor(String colorToken) {
        Paint paint;
        if (colorToken == null || colorToken.equals(this.backgroundColorCache)) {
            return;
        }
        Drawable background = getBackground();
        ShapeDrawable shapeDrawable = background instanceof ShapeDrawable ? (ShapeDrawable) background : null;
        if (shapeDrawable != null && (paint = shapeDrawable.getPaint()) != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            paint.setColor(styleParser.parseColor(context, colorToken, UniColors.LAYER_FLOOR_1_INVERTED.getResId()));
        }
        this.backgroundColorCache = colorToken;
    }

    public final void setDividerColor(String colorToken) {
        if (colorToken == null || colorToken.equals(this.dividerColorCache)) {
            return;
        }
        Paint paint = this.paint;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paint.setColor(styleParser.parseColor(context, colorToken, UniColors.GRAPHIC_TERTIARY_INVERTED.getResId()));
        this.dividerColorCache = colorToken;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayButtonsHorizontalAtomsLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.generator = BxAtomConfig.INSTANCE.getGeneratorIdFactory().create(this);
        this.dividerWidth = ResourceExtKt.toPx(1, context);
        this.dividerHeight = ResourceExtKt.toPx(20, context);
        this.dividerRects = new ArrayList();
        this.backgroundColorCache = UniColors.LAYER_FLOOR_1_INVERTED.getToken();
        this.dividerColorCache = UniColors.GRAPHIC_TERTIARY_INVERTED.getToken();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.graphicTertiaryInverted));
        this.paint = paint;
        setOrientation(0);
        setWillNotDraw(false);
        setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.layerFloor1Inverted), ResourceExtKt.toPxF(12, context)));
    }
}
