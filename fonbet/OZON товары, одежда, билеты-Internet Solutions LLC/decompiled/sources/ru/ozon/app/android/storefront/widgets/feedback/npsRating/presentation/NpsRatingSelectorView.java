package ru.ozon.app.android.storefront.widgets.feedback.npsRating.presentation;

import I1.w;
import Pk0.h;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import id.c;
import id.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.R$drawable;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 F2\u00020\u0001:\u0001FB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0015J\u0019\u0010\u001f\u001a\u00020\u001e2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\f¢\u0006\u0004\b%\u0010\u0015J!\u0010(\u001a\u00020\f2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0&¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u00020\f2\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0006¢\u0006\u0004\b.\u0010\u0018R\"\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00101R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00101R\u001c\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R+\u0010E\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010\u0018¨\u0006G"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingSelectorView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/MotionEvent;", "event", "", "trackEvent", "(Landroid/view/MotionEvent;)V", "selectedColor", "unselectedColor", "Landroid/graphics/drawable/StateListDrawable;", "createCellSelectorBackground", "(Ljava/lang/Integer;Ljava/lang/Integer;)Landroid/graphics/drawable/StateListDrawable;", "addViews", "()V", "newValue", "onProgressUpdate", "(I)V", "number", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "createSelectorCell", "(ILjava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "setPreviewData", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Canvas;", "canvas", "onDrawForeground", "(Landroid/graphics/Canvas;)V", "drawCells", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addSelectionListener", "(Lkotlin/jvm/functions/Function1;)V", "color", "setSelectionColor", "(Ljava/lang/Integer;)V", "fieldProgress", "setProgressWithoutCallback", "selectionListener", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/Integer;", "", "Landroid/view/View;", "cellViews", "Ljava/util/List;", "Landroid/graphics/Rect;", "rect", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "rectf", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "<set-?>", "progress$delegate", "Lid/f;", "getProgress", "()I", "setProgress", "progress", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NpsRatingSelectorView extends LinearLayout {

    @NotNull
    private List<? extends View> cellViews;

    @NotNull
    private final Paint paint;

    /* renamed from: progress$delegate, reason: from kotlin metadata */
    @NotNull
    private final f progress;
    private Rect rect;
    private RectF rectf;
    private Integer selectedColor;

    @NotNull
    private Function1<? super Integer, Unit> selectionListener;
    private final Integer unselectedColor;
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {w.c(NpsRatingSelectorView.class, "progress", "getProgress()I", 0)};
    public static final int $stable = 8;
    private static final float VIEW_CORNER_RADIUS = ResourceExtKt.toPx(12);
    private static final float STROKE_WIDTH = ResourceExtKt.toPx(2);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NpsRatingSelectorView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void addViews() {
        setWeightSum(11.0f);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 11; i11++) {
            TextAtomView createSelectorCell = createSelectorCell(i11, this.selectedColor, this.unselectedColor);
            addView(createSelectorCell);
            arrayList.add(createSelectorCell);
        }
        this.cellViews = arrayList;
        requestLayout();
        invalidate();
    }

    private final StateListDrawable createCellSelectorBackground(Integer selectedColor, Integer unselectedColor) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {R.attr.state_selected};
        if (selectedColor != null) {
            stateListDrawable.addState(iArr, new ColorDrawable(selectedColor.intValue()));
            int[] iArr2 = StateSet.WILD_CARD;
            if (unselectedColor != null) {
                stateListDrawable.addState(iArr2, new ColorDrawable(unselectedColor.intValue()));
            }
        }
        return stateListDrawable;
    }

    private final TextAtomView createSelectorCell(int number, Integer selectedColor, Integer unselectedColor) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        textAtomView.setGravity(17);
        textAtomView.setMaxLines(1);
        textAtomView.setContentDescription("rating_" + number);
        textAtomView.setText(String.valueOf(number));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        textAtomView.setLayoutParams(layoutParams);
        textAtomView.setBackground(createCellSelectorBackground(selectedColor, unselectedColor));
        return textAtomView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onProgressUpdate(int newValue) {
        int i11 = 0;
        for (Object obj : this.cellViews) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ((View) obj).setSelected(i11 <= newValue);
            i11 = i12;
        }
        this.selectionListener.invoke(Integer.valueOf(newValue));
    }

    private final void setPreviewData() {
        if (isInEditMode()) {
            drawCells();
            setProgress(4);
        }
    }

    private final void setProgress(int i11) {
        this.progress.setValue(this, $$delegatedProperties[0], Integer.valueOf(i11));
    }

    private final void trackEvent(MotionEvent event) {
        if (event.getAction() != 0) {
            return;
        }
        float x11 = event.getX();
        setProgress((x11 < ((float) getPaddingLeft()) ? 0 : x11 > ((float) (getWidth() - getPaddingRight())) ? Integer.valueOf(this.cellViews.size() - 1) : Float.valueOf((x11 - getPaddingLeft()) / (((getWidth() - getPaddingLeft()) - getPaddingRight()) / this.cellViews.size()))).intValue());
        invalidate();
    }

    public final void addSelectionListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.selectionListener = listener;
    }

    public final void drawCells() {
        removeAllViews();
        addViews();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getProgress() {
        return ((Number) this.progress.getValue(this, $$delegatedProperties[0])).intValue();
    }

    @Override // android.view.View
    public void onDrawForeground(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDrawForeground(canvas);
        getDrawingRect(this.rect);
        RectF rectF = this.rectf;
        if (rectF != null) {
            Rect rect = this.rect;
            if (rect == null) {
                return;
            } else {
                rectF.set(rect);
            }
        }
        RectF rectF2 = this.rectf;
        if (rectF2 == null) {
            return;
        }
        float f7 = VIEW_CORNER_RADIUS;
        canvas.drawRoundRect(rectF2, f7, f7, this.paint);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (event == null) {
            return false;
        }
        trackEvent(event);
        return true;
    }

    public final void setProgressWithoutCallback(int fieldProgress) {
        Function1<? super Integer, Unit> function1 = this.selectionListener;
        this.selectionListener = NpsRatingSelectorView$setProgressWithoutCallback$1.INSTANCE;
        setProgress(fieldProgress);
        this.selectionListener = function1;
    }

    public final void setSelectionColor(Integer color) {
        this.selectedColor = color;
    }

    public /* synthetic */ NpsRatingSelectorView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NpsRatingSelectorView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.selectionListener = NpsRatingSelectorView$selectionListener$1.INSTANCE;
        StyleParser styleParser = StyleParser.INSTANCE;
        this.unselectedColor = styleParser.parseColor(context, UniColors.LAYER_FLOOR_2.getToken());
        this.cellViews = K.f71697a;
        this.rect = new Rect();
        this.rectf = new RectF();
        Paint a11 = h.a(true);
        a11.setStrokeWidth(STROKE_WIDTH);
        a11.setStyle(Paint.Style.STROKE);
        Integer parseColor = styleParser.parseColor(context, UniColors.GRAPHIC_NEUTRAL.getToken());
        a11.setColor(parseColor != null ? parseColor.intValue() : 0);
        this.paint = a11;
        final Integer valueOf = Integer.valueOf(LinearLayoutManager.INVALID_OFFSET);
        this.progress = new c<Integer>(valueOf) { // from class: ru.ozon.app.android.storefront.widgets.feedback.npsRating.presentation.NpsRatingSelectorView$special$$inlined$observable$1
            @Override // id.c
            protected void afterChange(m<?> property, Integer oldValue, Integer newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                int intValue = newValue.intValue();
                if (oldValue.intValue() != intValue) {
                    this.onProgressUpdate(intValue);
                }
            }
        };
        setOrientation(0);
        setClipToOutline(true);
        setBackground(a.getDrawable(context, R$drawable.bg_nps_rating_selector));
        setPreviewData();
    }
}
