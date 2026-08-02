package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme;

import Vc.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.mapper.ParseTextStyleHelper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.SeatItemVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.TravelRailwaySeatSelectWithSchemeVO;
import ru.ozon.app.android.travel.utils.extensions.IsActivityDarkThemeExtensionKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!J\u001e\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\rJ4\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020&2\u0006\u0010%\u001a\u00020&2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001b\u0018\u00010,J\u0006\u0010-\u001a\u00020\u0018J\u000e\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\rJ\u0016\u00100\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\r2\u0006\u00101\u001a\u000202J\u0016\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u00102\u0006\u00101\u001a\u000202J\u0010\u00105\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u00106\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0002J\b\u00107\u001a\u00020\rH\u0002J\n\u00108\u001a\u0004\u0018\u00010\u0010H\u0002J\u0016\u00109\u001a\u00020\u00182\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00100;H\u0002J\b\u0010<\u001a\u00020\u0018H\u0002J\b\u0010=\u001a\u00020\u0018H\u0002J*\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00100;2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00100;2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00100;H\u0002J\u0010\u0010A\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u0010H\u0002J\u0010\u0010B\u001a\u00020C2\u0006\u0010 \u001a\u00020!H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeController;", "", "context", "Landroid/content/Context;", "loader", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeBitmapLoader;", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeBitmapLoader;)V", "itemRenderer", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeItemRenderer;", "backgroundRenderer", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeBackgroundRenderer;", "dpMultiplier", "", "seatItems", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/SeatItemVO;", "backgroundBitmap", "Landroid/graphics/Bitmap;", "viewCallbacks", "Ljava/lang/ref/WeakReference;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeActions;", "doOnItemShown", "Lkotlin/Function0;", "", "doShowTooltip", "isPrepareRunning", "", "isPreparePending", "setViewCallbackAndInvalidate", "callbacks", "bind", "schemeVO", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SchemeVO;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "scrollXValue", "", "viewportWidth", "onClick", "screenX", "screenY", "onItemClickListener", "Lkotlin/Function1;", "onScrollCompleted", "isIndexUnavailable", "index", "getBoundsByIndex", "outRect", "Landroid/graphics/RectF;", "getBounds", "seatItem", "bindBackground", "bindItems", "indexOfFirstActiveSeat", "firstSeatWithTooltip", "setItems", "list", "", "enableShowTooltip", "enableScrollToFirstActiveItem", "updateItemsEfficient", "oldList", "newList", "prepareItem", "getThemedBackgroundLink", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySchemeController {
    private Bitmap backgroundBitmap;

    @NotNull
    private final TravelRailwaySchemeBackgroundRenderer backgroundRenderer;

    @NotNull
    private final Context context;
    private Function0<Unit> doOnItemShown;
    private Function0<Unit> doShowTooltip;
    private final int dpMultiplier;
    private boolean isPreparePending;
    private boolean isPrepareRunning;

    @NotNull
    private final TravelRailwaySchemeItemRenderer itemRenderer;

    @NotNull
    private final TravelRailwaySchemeBitmapLoader loader;

    @NotNull
    private final List<SeatItemVO> seatItems;
    private WeakReference<TravelRailwaySchemeActions> viewCallbacks;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeController$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Bitmap, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
            invoke2(bitmap);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Bitmap it) {
            TravelRailwaySchemeActions travelRailwaySchemeActions;
            Intrinsics.checkNotNullParameter(it, "it");
            if (TravelRailwaySchemeController.this.isPrepareRunning) {
                TravelRailwaySchemeController.this.isPreparePending = true;
                return;
            }
            TravelRailwaySchemeController.this.isPrepareRunning = true;
            while (true) {
                if (!TravelRailwaySchemeController.this.isPreparePending && !TravelRailwaySchemeController.this.isPrepareRunning) {
                    break;
                }
                TravelRailwaySchemeController.this.isPreparePending = false;
                TravelRailwaySchemeController.this.enableScrollToFirstActiveItem();
                List list = TravelRailwaySchemeController.this.seatItems;
                TravelRailwaySchemeController travelRailwaySchemeController = TravelRailwaySchemeController.this;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    travelRailwaySchemeController.prepareItem((SeatItemVO) it2.next());
                }
                TravelRailwaySchemeController.this.isPrepareRunning = false;
            }
            WeakReference weakReference = TravelRailwaySchemeController.this.viewCallbacks;
            if (weakReference == null || (travelRailwaySchemeActions = (TravelRailwaySchemeActions) weakReference.get()) == null) {
                return;
            }
            travelRailwaySchemeActions.redraw();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "bgBitmap", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeController$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<Bitmap, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
            invoke2(bitmap);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Bitmap bgBitmap) {
            TravelRailwaySchemeActions travelRailwaySchemeActions;
            Intrinsics.checkNotNullParameter(bgBitmap, "bgBitmap");
            TravelRailwaySchemeController.this.backgroundBitmap = bgBitmap;
            WeakReference weakReference = TravelRailwaySchemeController.this.viewCallbacks;
            if (weakReference == null || (travelRailwaySchemeActions = (TravelRailwaySchemeActions) weakReference.get()) == null) {
                return;
            }
            travelRailwaySchemeActions.updateViewBounds(bgBitmap.getWidth(), bgBitmap.getHeight());
        }
    }

    public TravelRailwaySchemeController(@NotNull Context context, @NotNull TravelRailwaySchemeBitmapLoader loader) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loader, "loader");
        this.context = context;
        this.loader = loader;
        this.itemRenderer = new TravelRailwaySchemeItemRenderer();
        this.backgroundRenderer = new TravelRailwaySchemeBackgroundRenderer();
        this.dpMultiplier = ResourceExtKt.toPx(1, context);
        this.seatItems = new ArrayList();
        loader.setOnItemBitmapReadyCallback(new AnonymousClass1());
        loader.setOnBackgroundBitmapReadyCallback(new AnonymousClass2());
    }

    private final void bindBackground(TravelRailwaySeatSelectWithSchemeVO.SchemeVO schemeVO) {
        TravelRailwaySchemeActions travelRailwaySchemeActions;
        Bitmap backgroundBitmap = this.loader.getBackgroundBitmap(getThemedBackgroundLink(schemeVO), schemeVO);
        if (backgroundBitmap != null) {
            this.backgroundBitmap = backgroundBitmap;
            WeakReference<TravelRailwaySchemeActions> weakReference = this.viewCallbacks;
            if (weakReference == null || (travelRailwaySchemeActions = weakReference.get()) == null) {
                return;
            }
            travelRailwaySchemeActions.updateViewBounds(backgroundBitmap.getWidth(), backgroundBitmap.getHeight());
        }
    }

    private final void bindItems(TravelRailwaySeatSelectWithSchemeVO.SchemeVO schemeVO) {
        setItems(schemeVO.getSeats());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enableScrollToFirstActiveItem() {
        if (this.doOnItemShown == null) {
            this.doOnItemShown = new TravelRailwaySchemeController$enableScrollToFirstActiveItem$1(this);
        }
    }

    private final void enableShowTooltip() {
        SeatItemVO firstSeatWithTooltip = firstSeatWithTooltip();
        if (this.doShowTooltip != null || firstSeatWithTooltip == null) {
            return;
        }
        this.doShowTooltip = new TravelRailwaySchemeController$enableShowTooltip$1(this, firstSeatWithTooltip);
    }

    private final SeatItemVO firstSeatWithTooltip() {
        Object obj;
        Iterator<T> it = this.seatItems.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SeatItemVO) obj).getSeat().getTooltip() != null) {
                break;
            }
        }
        return (SeatItemVO) obj;
    }

    private final String getThemedBackgroundLink(TravelRailwaySeatSelectWithSchemeVO.SchemeVO schemeVO) {
        return IsActivityDarkThemeExtensionKt.isActivityDarkThemeActive(this.context) ? schemeVO.getDarkSchemeLink() : schemeVO.getLightSchemeLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int indexOfFirstActiveSeat() {
        Iterator<SeatItemVO> it = this.seatItems.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().getSeat().getAction() != null) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareItem(SeatItemVO seatItem) {
        Bitmap itemBitmap;
        CommonAtomIconDTO icon;
        String themedBitmapLink = seatItem.getThemedBitmapLink(this.context);
        if ((!Intrinsics.d(seatItem.getBitmapLink(), themedBitmapLink) || seatItem.getBitmap() == null) && (itemBitmap = this.loader.getItemBitmap(themedBitmapLink)) != null) {
            seatItem.setBitmapLink(themedBitmapLink);
            Point position = seatItem.getSeat().getPosition();
            seatItem.setX((position != null ? position.x : 0) * this.dpMultiplier);
            Point position2 = seatItem.getSeat().getPosition();
            seatItem.setY((position2 != null ? position2.y : 0) * this.dpMultiplier);
            TextPaint textPaint = seatItem.getTextPaint();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = this.context;
            String seatNumberTextColor = seatItem.getSeatType().getSeatNumberTextColor();
            if (seatNumberTextColor == null) {
                seatNumberTextColor = seatItem.getSeat().getNumberColor();
            }
            Integer parseColor = styleParser.parseColor(context, seatNumberTextColor);
            textPaint.setColor(parseColor != null ? parseColor.intValue() : ThemeExtKt.themeColor(this.context, R$attr.textPrimary));
            ParseTextStyleHelper.ParsedTextStyle seatNumberTextStyle = seatItem.getSeatType().getSeatNumberTextStyle();
            if (seatNumberTextStyle != null) {
                textPaint.setTypeface(seatNumberTextStyle.getFontFamily());
                textPaint.setTextSize(seatNumberTextStyle.getTextSize());
            }
            ParseTextStyleHelper.ParsedTextStyle numberTextStyle = seatItem.getSeat().getNumberTextStyle();
            if (numberTextStyle != null) {
                textPaint.setTypeface(numberTextStyle.getFontFamily());
                textPaint.setTextSize(numberTextStyle.getTextSize());
            }
            String number = seatItem.getSeat().getNumber();
            if (number != null) {
                seatItem.setText(number);
                seatItem.getTextPaint().getTextBounds(seatItem.getText(), 0, number.length(), seatItem.getTextBoundRect());
            }
            IconDTO icon2 = seatItem.getSeat().getIcon();
            if (icon2 != null && (icon = icon2.getIcon()) != null) {
                seatItem.setCancelIcon(this.loader.getCancelIcon(icon));
            }
            seatItem.setBitmap(itemBitmap);
        }
    }

    private final void setItems(List<SeatItemVO> list) {
        List<SeatItemVO> updateItemsEfficient = updateItemsEfficient(this.seatItems, list);
        final Comparator comparator = new Comparator() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeController$setItems$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                Point position = ((SeatItemVO) t2).getSeat().getPosition();
                Integer valueOf = position != null ? Integer.valueOf(position.x) : null;
                Point position2 = ((SeatItemVO) t11).getSeat().getPosition();
                return a.b(valueOf, position2 != null ? Integer.valueOf(position2.x) : null);
            }
        };
        List I02 = C7714v.I0(new Comparator() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeController$setItems$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                int compare = comparator.compare(t2, t11);
                return compare != 0 ? compare : a.b(Boolean.valueOf(((SeatItemVO) t2).getSeat().getIsTopLayer()), Boolean.valueOf(((SeatItemVO) t11).getSeat().getIsTopLayer()));
            }
        }, updateItemsEfficient);
        List<SeatItemVO> list2 = this.seatItems;
        list2.clear();
        list2.addAll(I02);
        enableScrollToFirstActiveItem();
        enableShowTooltip();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            prepareItem((SeatItemVO) it.next());
        }
    }

    private final List<SeatItemVO> updateItemsEfficient(List<SeatItemVO> oldList, List<SeatItemVO> newList) {
        HashMap hashMap = new HashMap(oldList.size());
        for (SeatItemVO seatItemVO : oldList) {
            hashMap.put(Integer.valueOf(seatItemVO.getSeat().getId()), seatItemVO);
        }
        ArrayList arrayList = new ArrayList(newList.size());
        for (SeatItemVO seatItemVO2 : newList) {
            SeatItemVO seatItemVO3 = (SeatItemVO) hashMap.get(Integer.valueOf(seatItemVO2.getSeat().getId()));
            if (seatItemVO3 == null) {
                arrayList.add(seatItemVO2);
            } else if (Intrinsics.d(seatItemVO3.getSeat(), seatItemVO2.getSeat()) && Intrinsics.d(seatItemVO3.getSeatType(), seatItemVO2.getSeatType())) {
                arrayList.add(seatItemVO3);
            } else {
                arrayList.add(seatItemVO2);
            }
        }
        return arrayList;
    }

    public final void bind(@NotNull TravelRailwaySeatSelectWithSchemeVO.SchemeVO schemeVO) {
        TravelRailwaySchemeActions travelRailwaySchemeActions;
        TravelRailwaySchemeActions travelRailwaySchemeActions2;
        Intrinsics.checkNotNullParameter(schemeVO, "schemeVO");
        WeakReference<TravelRailwaySchemeActions> weakReference = this.viewCallbacks;
        if (weakReference != null && (travelRailwaySchemeActions2 = weakReference.get()) != null) {
            travelRailwaySchemeActions2.hideTooltip();
        }
        this.doShowTooltip = null;
        bindBackground(schemeVO);
        bindItems(schemeVO);
        WeakReference<TravelRailwaySchemeActions> weakReference2 = this.viewCallbacks;
        if (weakReference2 == null || (travelRailwaySchemeActions = weakReference2.get()) == null) {
            return;
        }
        travelRailwaySchemeActions.redraw();
    }

    public final void getBounds(@NotNull SeatItemVO seatItem, @NotNull RectF outRect) {
        Intrinsics.checkNotNullParameter(seatItem, "seatItem");
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Bitmap bitmap = seatItem.getBitmap();
        float f7 = (seatItem.getSeat().getPosition() != null ? r1.x : 0) * this.dpMultiplier;
        float f11 = (seatItem.getSeat().getPosition() != null ? r5.y : 0) * this.dpMultiplier;
        if (bitmap != null) {
            outRect.set(f7, f11, bitmap.getWidth() + f7, bitmap.getHeight() + f11);
        } else {
            outRect.set(f7, f11, f7, f11);
        }
    }

    public final void getBoundsByIndex(int index, @NotNull RectF outRect) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        SeatItemVO seatItemVO = (SeatItemVO) C7714v.Q(index, this.seatItems);
        if (seatItemVO == null) {
            return;
        }
        getBounds(seatItemVO, outRect);
    }

    public final boolean isIndexUnavailable(int index) {
        boolean z11 = false;
        if (index >= 0 && index < this.seatItems.size()) {
            z11 = true;
        }
        return !z11;
    }

    public final void onClick(float screenX, float screenY, float scrollXValue, Function1<? super SeatItemVO, Boolean> onItemClickListener) {
        WeakReference<TravelRailwaySchemeActions> weakReference;
        TravelRailwaySchemeActions travelRailwaySchemeActions;
        RectF rectF = new RectF();
        float f7 = scrollXValue + screenX;
        int size = this.seatItems.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i11 = size - 1;
            SeatItemVO seatItemVO = this.seatItems.get(size);
            getBounds(seatItemVO, rectF);
            if (rectF.contains(f7, screenY)) {
                if (onItemClickListener == null || !onItemClickListener.invoke(seatItemVO).booleanValue() || (weakReference = this.viewCallbacks) == null || (travelRailwaySchemeActions = weakReference.get()) == null) {
                    return;
                }
                travelRailwaySchemeActions.centerOnItem(size);
                return;
            }
            if (i11 < 0) {
                return;
            } else {
                size = i11;
            }
        }
    }

    public final void onDraw(@NotNull Canvas canvas, float scrollXValue, int viewportWidth) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Bitmap bitmap = this.backgroundBitmap;
        if (bitmap != null) {
            this.backgroundRenderer.draw(canvas, bitmap);
            this.itemRenderer.draw(canvas, this.seatItems, scrollXValue, viewportWidth);
            Function0<Unit> function0 = this.doOnItemShown;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void onScrollCompleted() {
        Function0<Unit> function0 = this.doShowTooltip;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setViewCallbackAndInvalidate(TravelRailwaySchemeActions callbacks) {
        TravelRailwaySchemeActions travelRailwaySchemeActions;
        WeakReference<TravelRailwaySchemeActions> weakReference = new WeakReference<>(callbacks);
        this.viewCallbacks = weakReference;
        Bitmap bitmap = this.backgroundBitmap;
        if (bitmap == null || (travelRailwaySchemeActions = weakReference.get()) == null) {
            return;
        }
        travelRailwaySchemeActions.updateViewBounds(bitmap.getWidth(), bitmap.getHeight());
    }
}
