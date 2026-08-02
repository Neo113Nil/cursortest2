package ru.ozon.app.android.travel.calendar.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import hd.C6915b;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarDayVO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001OB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001f2\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\t2\b\b\u0001\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\t¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\t¢\u0006\u0004\b(\u0010'J\r\u0010)\u001a\u00020\t¢\u0006\u0004\b)\u0010'J\r\u0010*\u001a\u00020\t¢\u0006\u0004\b*\u0010'R(\u0010/\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020-0,\u0012\u0004\u0012\u00020.0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00104\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00105\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00102R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0016\u0010A\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/CalendarDayView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "width", "height", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarDayVO;", "item", "bind", "(Lru/ozon/app/android/travel/calendar/view/vo/CalendarDayVO;)V", "", "text", "textColor", "bindTitle", "(Ljava/lang/CharSequence;I)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "overdrawTextColor", "bindTextIndicator", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Integer;)V", "color", "bindColorIndicator", "(I)V", "hideTextIndicator", "()V", "hideColorIndicator", "showIndicatorContainer", "hideIndicatorContainer", "", "Lkotlin/reflect/d;", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarDayVO$DayState;", "Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay;", "drawingCommands", "Ljava/util/Map;", "selectedDayColor", "I", "matchedIndicatorColor", "rangePartDayColor", "borderColor", "", "cornerRadius", "F", "drawingSidePadding", "Landroid/graphics/Path;", "backgroundPath", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "borderPaint", "boundedData", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarDayVO;", "Landroidx/appcompat/widget/AppCompatTextView;", "dayTitleTv", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/widget/FrameLayout;", "indicatorContainerFl", "Landroid/widget/FrameLayout;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textIndicatorTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Landroid/view/View;", "colorIndicatorV", "Landroid/view/View;", "DrawDay", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CalendarDayView extends LinearLayout {

    @NotNull
    private final Paint backgroundPaint;

    @NotNull
    private final Path backgroundPath;
    private final int borderColor;

    @NotNull
    private final Paint borderPaint;

    @NotNull
    private CalendarDayVO boundedData;

    @NotNull
    private final View colorIndicatorV;
    private final float cornerRadius;

    @NotNull
    private final AppCompatTextView dayTitleTv;

    @NotNull
    private final Map<d<? extends CalendarDayVO.DayState>, DrawDay> drawingCommands;
    private final float drawingSidePadding;

    @NotNull
    private final FrameLayout indicatorContainerFl;
    private final int matchedIndicatorColor;
    private final int rangePartDayColor;
    private final int selectedDayColor;

    @NotNull
    private final TextAtomV2View textIndicatorTav;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000 $2\u00020\u0001:\b$%&'()*+B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0004J@\u0010\u0016\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0004J@\u0010\u0019\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0004JH\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0004JP\u0010\u001f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0004JP\u0010 \u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0004JP\u0010!\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0004J\u0018\u0010\"\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010#\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002R$\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0007,-./012¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay;", "", "<init>", "()V", "drawCommand", "Lkotlin/Function2;", "Landroid/graphics/Canvas;", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarDayVO;", "", "getDrawCommand", "()Lkotlin/jvm/functions/Function2;", "drawSquare", "view", "Landroid/view/View;", "canvas", "paint", "Landroid/graphics/Paint;", "color", "", "cornerRadius", "", "sidePadding", "drawLeftTopArrow", "path", "Landroid/graphics/Path;", "drawRightBottomArrow", "drawPath", "startX", "startY", "endX", "endY", "drawPathWithLeftSquaredCorners", "drawPathWithRightSquaredCorners", "drawPathWithSquaredCorners", "getSquareLeft", "getSquareRight", "Companion", "AsSelected", "AsMatched", "AsStartInterval", "AsEndInterval", "AsMediumInterval", "AsPart", "AsToday", "Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay$AsEndInterval;", "Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay$AsMatched;", "Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay$AsMediumInterval;", "Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay$AsPart;", "Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay$AsSelected;", "Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay$AsStartInterval;", "Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay$AsToday;", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static abstract class DrawDay {

        @NotNull
        private static final Companion Companion = new Companion(null);
        private static final float DPF_2 = ResourceExtKt.toPxF(2);
        private static final float DPF_4 = ResourceExtKt.toPxF(4);
        private static final float DPF_9 = ResourceExtKt.toPxF(9);
        private static final float DPF_20 = ResourceExtKt.toPxF(20);

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay$AsEndInterval;", "Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay;", "view", "Landroid/view/View;", "path", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "intervalColor", "", "selectedDayColor", "cornerRadius", "", "sidePadding", "<init>", "(Landroid/view/View;Landroid/graphics/Path;Landroid/graphics/Paint;IIFF)V", "drawCommand", "Lkotlin/Function2;", "Landroid/graphics/Canvas;", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarDayVO;", "", "getDrawCommand", "()Lkotlin/jvm/functions/Function2;", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AsEndInterval extends DrawDay {

            @NotNull
            private final Function2<Canvas, CalendarDayVO, Unit> drawCommand;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsEndInterval(@NotNull View view, @NotNull Path path, @NotNull Paint paint, int i11, int i12, float f7, float f11) {
                super(null);
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(paint, "paint");
                this.drawCommand = new CalendarDayView$DrawDay$AsEndInterval$drawCommand$1(this, path, paint, view, i11, i12, f7, f11);
            }

            @Override // ru.ozon.app.android.travel.calendar.view.CalendarDayView.DrawDay
            @NotNull
            public Function2<Canvas, CalendarDayVO, Unit> getDrawCommand() {
                return this.drawCommand;
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay$AsMatched;", "Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay;", "view", "Landroid/view/View;", "path", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "selectedDayColor", "", "matchedIndicatorColor", "cornerRadius", "", "sidePadding", "<init>", "(Landroid/view/View;Landroid/graphics/Path;Landroid/graphics/Paint;IIFF)V", "drawCommand", "Lkotlin/Function2;", "Landroid/graphics/Canvas;", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarDayVO;", "", "getDrawCommand", "()Lkotlin/jvm/functions/Function2;", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AsMatched extends DrawDay {

            @NotNull
            private final Function2<Canvas, CalendarDayVO, Unit> drawCommand;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsMatched(@NotNull View view, @NotNull Path path, @NotNull Paint paint, int i11, int i12, float f7, float f11) {
                super(null);
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(paint, "paint");
                this.drawCommand = new CalendarDayView$DrawDay$AsMatched$drawCommand$1(this, view, paint, i11, f7, f11, path, i12);
            }

            @Override // ru.ozon.app.android.travel.calendar.view.CalendarDayView.DrawDay
            @NotNull
            public Function2<Canvas, CalendarDayVO, Unit> getDrawCommand() {
                return this.drawCommand;
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay$AsMediumInterval;", "Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay;", "view", "Landroid/view/View;", "path", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "intervalColor", "", "selectedDayColor", "cornerRadius", "", "sidePadding", "<init>", "(Landroid/view/View;Landroid/graphics/Path;Landroid/graphics/Paint;IIFF)V", "drawCommand", "Lkotlin/Function2;", "Landroid/graphics/Canvas;", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarDayVO;", "", "getDrawCommand", "()Lkotlin/jvm/functions/Function2;", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AsMediumInterval extends DrawDay {

            @NotNull
            private final Function2<Canvas, CalendarDayVO, Unit> drawCommand;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsMediumInterval(@NotNull View view, @NotNull Path path, @NotNull Paint paint, int i11, int i12, float f7, float f11) {
                super(null);
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(paint, "paint");
                this.drawCommand = new CalendarDayView$DrawDay$AsMediumInterval$drawCommand$1(this, path, paint, view, i11, i12, f7, f11);
            }

            @Override // ru.ozon.app.android.travel.calendar.view.CalendarDayView.DrawDay
            @NotNull
            public Function2<Canvas, CalendarDayVO, Unit> getDrawCommand() {
                return this.drawCommand;
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay$AsPart;", "Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay;", "view", "Landroid/view/View;", "path", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "color", "", "cornerRadius", "", "<init>", "(Landroid/view/View;Landroid/graphics/Path;Landroid/graphics/Paint;IF)V", "drawCommand", "Lkotlin/Function2;", "Landroid/graphics/Canvas;", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarDayVO;", "", "getDrawCommand", "()Lkotlin/jvm/functions/Function2;", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AsPart extends DrawDay {

            @NotNull
            private final Function2<Canvas, CalendarDayVO, Unit> drawCommand;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsPart(@NotNull View view, @NotNull Path path, @NotNull Paint paint, int i11, float f7) {
                super(null);
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(paint, "paint");
                this.drawCommand = new CalendarDayView$DrawDay$AsPart$drawCommand$1(this, path, paint, view, i11, f7);
            }

            @Override // ru.ozon.app.android.travel.calendar.view.CalendarDayView.DrawDay
            @NotNull
            public Function2<Canvas, CalendarDayVO, Unit> getDrawCommand() {
                return this.drawCommand;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay$AsSelected;", "Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay;", "view", "Landroid/view/View;", "paint", "Landroid/graphics/Paint;", "selectedDayColor", "", "cornerRadius", "", "sidePadding", "<init>", "(Landroid/view/View;Landroid/graphics/Paint;IFF)V", "drawCommand", "Lkotlin/Function2;", "Landroid/graphics/Canvas;", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarDayVO;", "", "getDrawCommand", "()Lkotlin/jvm/functions/Function2;", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AsSelected extends DrawDay {

            @NotNull
            private final Function2<Canvas, CalendarDayVO, Unit> drawCommand;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsSelected(@NotNull View view, @NotNull Paint paint, int i11, float f7, float f11) {
                super(null);
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(paint, "paint");
                this.drawCommand = new CalendarDayView$DrawDay$AsSelected$drawCommand$1(this, view, paint, i11, f7, f11);
            }

            @Override // ru.ozon.app.android.travel.calendar.view.CalendarDayView.DrawDay
            @NotNull
            public Function2<Canvas, CalendarDayVO, Unit> getDrawCommand() {
                return this.drawCommand;
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay$AsStartInterval;", "Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay;", "view", "Landroid/view/View;", "path", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "intervalColor", "", "selectedDayColor", "cornerRadius", "", "sidePadding", "<init>", "(Landroid/view/View;Landroid/graphics/Path;Landroid/graphics/Paint;IIFF)V", "drawCommand", "Lkotlin/Function2;", "Landroid/graphics/Canvas;", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarDayVO;", "", "getDrawCommand", "()Lkotlin/jvm/functions/Function2;", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AsStartInterval extends DrawDay {

            @NotNull
            private final Function2<Canvas, CalendarDayVO, Unit> drawCommand;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsStartInterval(@NotNull View view, @NotNull Path path, @NotNull Paint paint, int i11, int i12, float f7, float f11) {
                super(null);
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(paint, "paint");
                this.drawCommand = new CalendarDayView$DrawDay$AsStartInterval$drawCommand$1(this, path, paint, view, i11, i12, f7, f11);
            }

            @Override // ru.ozon.app.android.travel.calendar.view.CalendarDayView.DrawDay
            @NotNull
            public Function2<Canvas, CalendarDayVO, Unit> getDrawCommand() {
                return this.drawCommand;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay$AsToday;", "Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay;", "view", "Landroid/view/View;", "borderPaint", "Landroid/graphics/Paint;", "borderColor", "", "cornerRadius", "", "sidePadding", "<init>", "(Landroid/view/View;Landroid/graphics/Paint;IFF)V", "drawCommand", "Lkotlin/Function2;", "Landroid/graphics/Canvas;", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarDayVO;", "", "getDrawCommand", "()Lkotlin/jvm/functions/Function2;", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AsToday extends DrawDay {

            @NotNull
            private final Function2<Canvas, CalendarDayVO, Unit> drawCommand;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsToday(@NotNull View view, @NotNull Paint borderPaint, int i11, float f7, float f11) {
                super(null);
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(borderPaint, "borderPaint");
                this.drawCommand = new CalendarDayView$DrawDay$AsToday$drawCommand$1(this, view, borderPaint, i11, f7, f11);
            }

            @Override // ru.ozon.app.android.travel.calendar.view.CalendarDayView.DrawDay
            @NotNull
            public Function2<Canvas, CalendarDayVO, Unit> getDrawCommand() {
                return this.drawCommand;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/travel/calendar/view/CalendarDayView$DrawDay$Companion;", "", "<init>", "()V", "calendar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public /* synthetic */ DrawDay(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float getSquareLeft(View view, float sidePadding) {
            float width = view.getWidth() / 2.0f;
            float height = view.getHeight() / 2.0f;
            return (width > height || sidePadding <= 0.0f) ? width - height : 0 + sidePadding;
        }

        private final float getSquareRight(View view, float sidePadding) {
            float width = view.getWidth() / 2.0f;
            float height = view.getHeight() / 2.0f;
            return (width > height || sidePadding <= 0.0f) ? width + height : view.getWidth() - sidePadding;
        }

        protected final void drawLeftTopArrow(@NotNull View view, @NotNull Canvas canvas, @NotNull Path path, @NotNull Paint paint, int color, float cornerRadius, float sidePadding) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(paint, "paint");
            paint.setColor(color);
            float squareLeft = getSquareLeft(view, sidePadding);
            path.reset();
            float f7 = DPF_20;
            path.moveTo(squareLeft, f7);
            path.lineTo(squareLeft, cornerRadius);
            float f11 = 2 * cornerRadius;
            path.arcTo(squareLeft, 0.0f, squareLeft + f11, f11, 180.0f, 90.0f, false);
            float f12 = squareLeft + cornerRadius;
            path.lineTo(DPF_9 + f12, 0.0f);
            path.lineTo(f12, DPF_4);
            float f13 = DPF_2;
            path.lineTo(f12, f13);
            path.quadTo(squareLeft, f13, squareLeft, f7);
            canvas.drawPath(path, paint);
        }

        protected final void drawPath(@NotNull Canvas canvas, @NotNull Path path, @NotNull Paint paint, float startX, float startY, float endX, float endY, int color) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(paint, "paint");
            paint.setColor(color);
            path.reset();
            path.moveTo(startX, startY);
            path.lineTo(endX, startY);
            path.lineTo(endX, endY);
            path.lineTo(startX, endY);
            path.lineTo(startX, startY);
            canvas.drawPath(path, paint);
        }

        protected final void drawPathWithLeftSquaredCorners(@NotNull Canvas canvas, @NotNull Path path, @NotNull Paint paint, float startX, float startY, float endX, float endY, int color, float cornerRadius) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(paint, "paint");
            paint.setColor(color);
            path.reset();
            path.moveTo(endX, startY);
            path.lineTo(endX, endY);
            path.lineTo(startX + cornerRadius, endY);
            float f7 = 2 * cornerRadius;
            float f11 = startX + f7;
            path.arcTo(startX, endY - f7, f11, endY, 90.0f, 90.0f, false);
            path.lineTo(startX, startY + cornerRadius);
            path.arcTo(startX, startY, f11, startY + f7, 180.0f, 90.0f, false);
            path.lineTo(endX, startY);
            canvas.drawPath(path, paint);
        }

        protected final void drawPathWithRightSquaredCorners(@NotNull Canvas canvas, @NotNull Path path, @NotNull Paint paint, float startX, float startY, float endX, float endY, int color, float cornerRadius) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(paint, "paint");
            paint.setColor(color);
            path.reset();
            path.moveTo(startX, startY);
            path.lineTo(endX - cornerRadius, startY);
            float f7 = 2 * cornerRadius;
            float f11 = endX - f7;
            path.arcTo(f11, startY, endX, startY + f7, 270.0f, 90.0f, false);
            path.lineTo(endX, endY - cornerRadius);
            path.arcTo(f11, endY - f7, endX, endY, 0.0f, 90.0f, false);
            path.lineTo(startX, endY);
            path.lineTo(startX, startY);
            canvas.drawPath(path, paint);
        }

        protected final void drawPathWithSquaredCorners(@NotNull Canvas canvas, @NotNull Path path, @NotNull Paint paint, float startX, float startY, float endX, float endY, int color, float cornerRadius) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(paint, "paint");
            paint.setColor(color);
            path.reset();
            float f7 = startX + cornerRadius;
            path.moveTo(f7, startY);
            path.lineTo(endX - cornerRadius, startY);
            float f11 = 2 * cornerRadius;
            float f12 = endX - f11;
            float f13 = startY + f11;
            path.arcTo(f12, startY, endX, f13, 270.0f, 90.0f, false);
            path.lineTo(endX, endY - cornerRadius);
            float f14 = endY - f11;
            path.arcTo(f12, f14, endX, endY, 0.0f, 90.0f, false);
            path.lineTo(f7, endY);
            float f15 = startX + f11;
            path.arcTo(startX, f14, f15, endY, 90.0f, 90.0f, false);
            path.lineTo(startX, startY + cornerRadius);
            path.arcTo(startX, startY, f15, f13, 180.0f, 90.0f, false);
            canvas.drawPath(path, paint);
        }

        protected final void drawRightBottomArrow(@NotNull View view, @NotNull Canvas canvas, @NotNull Path path, @NotNull Paint paint, int color, float cornerRadius, float sidePadding) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(paint, "paint");
            paint.setColor(color);
            float squareRight = getSquareRight(view, sidePadding);
            path.reset();
            float height = view.getHeight();
            float f7 = DPF_20;
            path.moveTo(squareRight, height - f7);
            path.lineTo(squareRight, view.getHeight() - cornerRadius);
            float f11 = 2 * cornerRadius;
            path.arcTo(squareRight - f11, view.getHeight() - f11, squareRight, view.getHeight(), 0.0f, 90.0f, false);
            float f12 = squareRight - cornerRadius;
            path.lineTo(f12 - DPF_9, view.getHeight());
            path.lineTo(f12, view.getHeight() - DPF_4);
            float height2 = view.getHeight();
            float f13 = DPF_2;
            path.lineTo(f12, height2 - f13);
            path.quadTo(squareRight, view.getHeight() - f13, squareRight, view.getHeight() - f7);
            canvas.drawPath(path, paint);
        }

        protected final void drawSquare(@NotNull View view, @NotNull Canvas canvas, @NotNull Paint paint, int color, float cornerRadius, float sidePadding) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(paint, "paint");
            paint.setColor(color);
            float squareLeft = getSquareLeft(view, sidePadding);
            float squareRight = getSquareRight(view, sidePadding);
            float strokeWidth = paint.getStrokeWidth() / 2;
            canvas.drawRoundRect(squareLeft + strokeWidth, strokeWidth + 0.0f, squareRight - strokeWidth, view.getHeight() - strokeWidth, cornerRadius, cornerRadius, paint);
        }

        @NotNull
        public abstract Function2<Canvas, CalendarDayVO, Unit> getDrawCommand();

        private DrawDay() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarDayView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.drawingCommands = new HashMap();
        this.selectedDayColor = ThemeExtKt.themeColor(context, R$attr.graphicPrimary);
        this.matchedIndicatorColor = ThemeExtKt.themeColor(context, R$attr.bgAquaPrimary);
        this.rangePartDayColor = ThemeExtKt.themeColor(context, R$attr.bgSecondary);
        this.borderColor = ThemeExtKt.themeColor(context, R$attr.graphicNeutral);
        this.cornerRadius = ResourceExtKt.toPxF(8, context);
        this.drawingSidePadding = ResourceExtKt.toPxF(3, context);
        this.backgroundPath = new Path();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.backgroundPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(ResourceExtKt.toPxF(1, context));
        this.borderPaint = paint2;
        this.boundedData = CalendarDayVO.INSTANCE.getEMPTY();
        setOrientation(1);
        setGravity(17);
        setWillNotDraw(false);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setTextAppearance(UniTextStyles.BODY_500_MEDIUM.getResId());
        appCompatTextView.setMaxLines(1);
        addView(appCompatTextView);
        this.dayTitleTv = appCompatTextView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        frameLayout.setMinimumHeight(C6915b.c(ResourceExtKt.toSpF(14)));
        addView(frameLayout);
        this.indicatorContainerFl = frameLayout;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 16));
        textAtomV2View.setTextIsSelectable(false);
        textAtomV2View.setVisibility(8);
        frameLayout.addView(textAtomV2View);
        this.textIndicatorTav = textAtomV2View;
        View view = new View(context);
        int px = ResourceExtKt.toPx(4, context);
        view.setLayoutParams(new FrameLayout.LayoutParams(px, px, 17));
        view.setBackground(new RoundedBackgroundProducer().produce(0, px / 2.0f));
        view.setVisibility(8);
        frameLayout.addView(view);
        this.colorIndicatorV = view;
    }

    public final void bind(@NotNull CalendarDayVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boundedData = item;
        invalidate();
    }

    public final void bindColorIndicator(int color) {
        Paint paint;
        View view = this.colorIndicatorV;
        view.setVisibility(0);
        Drawable background = view.getBackground();
        ShapeDrawable shapeDrawable = background instanceof ShapeDrawable ? (ShapeDrawable) background : null;
        if (shapeDrawable == null || (paint = shapeDrawable.getPaint()) == null) {
            return;
        }
        paint.setColor(color);
    }

    public final void bindTextIndicator(@NotNull TextDTO text, Integer overdrawTextColor) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextAtomV2View textAtomV2View = this.textIndicatorTav;
        textAtomV2View.setVisibility(0);
        TextHolderKt.bind$default(textAtomV2View, text, null, 2, null);
        if (overdrawTextColor != null) {
            textAtomV2View.setTextColor(overdrawTextColor.intValue());
        }
    }

    public final void bindTitle(@NotNull CharSequence text, int textColor) {
        Intrinsics.checkNotNullParameter(text, "text");
        AppCompatTextView appCompatTextView = this.dayTitleTv;
        appCompatTextView.setText(text);
        appCompatTextView.setTextColor(textColor);
    }

    public final void hideColorIndicator() {
        this.colorIndicatorV.setVisibility(8);
    }

    public final void hideIndicatorContainer() {
        this.indicatorContainerFl.setVisibility(8);
    }

    public final void hideTextIndicator() {
        this.textIndicatorTav.setVisibility(8);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Function2<Canvas, CalendarDayVO, Unit> drawCommand;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        DrawDay drawDay = this.drawingCommands.get(N.b(this.boundedData.getState().getClass()));
        if (drawDay == null || (drawCommand = drawDay.getDrawCommand()) == null) {
            return;
        }
        drawCommand.invoke(canvas, this.boundedData);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(C6915b.c(Math.max(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec))), 1073741824), heightMeasureSpec);
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        super.onSizeChanged(width, height, oldw, oldh);
        this.drawingCommands.put(N.b(CalendarDayVO.DayState.SingleSelection.class), new DrawDay.AsSelected(this, this.backgroundPaint, this.selectedDayColor, this.cornerRadius, this.drawingSidePadding));
        this.drawingCommands.put(N.b(CalendarDayVO.DayState.Matched.class), new DrawDay.AsMatched(this, this.backgroundPath, this.backgroundPaint, this.selectedDayColor, this.matchedIndicatorColor, this.cornerRadius, this.drawingSidePadding));
        this.drawingCommands.put(N.b(CalendarDayVO.DayState.StartInterval.class), new DrawDay.AsStartInterval(this, this.backgroundPath, this.backgroundPaint, this.rangePartDayColor, this.selectedDayColor, this.cornerRadius, this.drawingSidePadding));
        this.drawingCommands.put(N.b(CalendarDayVO.DayState.EndInterval.class), new DrawDay.AsEndInterval(this, this.backgroundPath, this.backgroundPaint, this.rangePartDayColor, this.selectedDayColor, this.cornerRadius, this.drawingSidePadding));
        this.drawingCommands.put(N.b(CalendarDayVO.DayState.MediumInterval.class), new DrawDay.AsMediumInterval(this, this.backgroundPath, this.backgroundPaint, this.rangePartDayColor, this.selectedDayColor, this.cornerRadius, this.drawingSidePadding));
        this.drawingCommands.put(N.b(CalendarDayVO.DayState.Part.class), new DrawDay.AsPart(this, this.backgroundPath, this.backgroundPaint, this.rangePartDayColor, this.cornerRadius));
        this.drawingCommands.put(N.b(CalendarDayVO.DayState.Today.class), new DrawDay.AsToday(this, this.borderPaint, this.borderColor, this.cornerRadius, this.drawingSidePadding));
    }

    public final void showIndicatorContainer() {
        this.indicatorContainerFl.setVisibility(0);
    }
}
