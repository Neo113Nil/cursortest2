package ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetSteppedThermometerBinding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import xe.E0;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 ;2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001;B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u001bJ\u001f\u0010#\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J)\u0010)\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0014\u0010.\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0014018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0017018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetSteppedThermometerBinding;", "binding", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/fresh/unsorted/databinding/WidgetSteppedThermometerBinding;Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerViewModel;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "item", "", "bindRanges", "(Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerVO;)V", "", "position", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getOrCreateMark", "(I)Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/RoundedProgressBarView;", "getOrCreateProgressBar", "(I)Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/RoundedProgressBarView;", "subscribeToWidgetUpdates", "()V", "unsubscribeFromWidgetUpdates", "newVO", "updateSteppedThermometer", "onAttach", "onDetach", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "defaultProgressBgColor", "I", "defaultProgressLineColor", "", "marksCache", "Ljava/util/Map;", "progressBarsCache", "Landroidx/constraintlayout/widget/ConstraintLayout;", "rootContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/cell/CellView;", "cellView", "Lru/ozon/uni/android/cell/CellView;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SteppedThermometerViewHolder extends k<SteppedThermometerVO> {

    @NotNull
    private final CellView cellView;
    private final int defaultProgressBgColor;
    private final int defaultProgressLineColor;

    @NotNull
    private final Map<Integer, TextAtomV2View> marksCache;

    @NotNull
    private final Map<Integer, RoundedProgressBarView> progressBarsCache;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final ConstraintLayout rootContainer;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final SteppedThermometerViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int defaultProgressLineColorResId = UniColors.GRAPHIC_POSITIVE_PRIMARY.getResId();
    private static final int defaultProgressBgColorResId = UniColors.BG_SECONDARY.getResId();
    private static final int defaultProgressHeight = ResourceExtKt.toPx(4);
    private static final float defaultProgressRadius = UiExtKt.toPxF(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerViewHolder$Companion;", "", "<init>", "()V", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SteppedThermometerViewHolder(@NotNull WidgetSteppedThermometerBinding binding, @NotNull SteppedThermometerViewModel viewModel, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.viewModel = viewModel;
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.defaultProgressBgColor = getContext().getColor(defaultProgressBgColorResId);
        this.defaultProgressLineColor = getContext().getColor(defaultProgressLineColorResId);
        this.marksCache = new LinkedHashMap();
        this.progressBarsCache = new LinkedHashMap();
        ConstraintLayout rootContainer = binding.rootContainer;
        Intrinsics.checkNotNullExpressionValue(rootContainer, "rootContainer");
        this.rootContainer = rootContainer;
        CellView deliveryInfoCell = binding.deliveryInfoCell;
        Intrinsics.checkNotNullExpressionValue(deliveryInfoCell, "deliveryInfoCell");
        this.cellView = deliveryInfoCell;
    }

    private final void bindRanges(SteppedThermometerVO item) {
        if (item.getProgresses().size() != item.getMarks().size() - 1) {
            return;
        }
        d dVar = new d();
        dVar.p(this.rootContainer);
        List<Integer> progresses = item.getProgresses();
        ArrayList arrayList = new ArrayList(C7714v.z(progresses, 10));
        int i11 = 0;
        for (Object obj : progresses) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            int intValue = ((Number) obj).intValue();
            RoundedProgressBarView orCreateProgressBar = getOrCreateProgressBar(i11);
            orCreateProgressBar.setProgress(intValue);
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = orCreateProgressBar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            orCreateProgressBar.setColors(this.defaultProgressBgColor, styleParser.parseColor(context, item.getProgressLineColor(), defaultProgressLineColorResId));
            arrayList.add(orCreateProgressBar);
            i11 = i12;
        }
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                C7714v.O0();
                throw null;
            }
            RoundedProgressBarView roundedProgressBarView = (RoundedProgressBarView) next;
            dVar.A(roundedProgressBarView.getId(), 0);
            dVar.w(roundedProgressBarView.getId(), defaultProgressHeight);
            dVar.t(roundedProgressBarView.getId(), 3, this.cellView.getId(), 4, item.getPaddings().getBetweenCellAndProgress());
            i13 = i14;
        }
        dVar.s(((RoundedProgressBarView) C7714v.K(arrayList)).getId(), 6, 0, 6);
        dVar.s(((RoundedProgressBarView) C7714v.X(arrayList)).getId(), 7, 0, 7);
        int P11 = C7714v.P(item.getProgresses());
        int i15 = 0;
        while (i15 < P11) {
            int i16 = i15 + 1;
            dVar.s(((RoundedProgressBarView) arrayList.get(i15)).getId(), 7, ((RoundedProgressBarView) arrayList.get(i16)).getId(), 6);
            dVar.t(((RoundedProgressBarView) arrayList.get(i16)).getId(), 6, ((RoundedProgressBarView) arrayList.get(i15)).getId(), 7, item.getPaddings().getBetweenProgressLines());
            i15 = i16;
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((RoundedProgressBarView) it2.next()).getId()));
        }
        dVar.E(C7714v.T0(arrayList2), null, 0);
        List<TextDTO> marks = item.getMarks();
        ArrayList arrayList3 = new ArrayList(C7714v.z(marks, 10));
        int i17 = 0;
        for (Object obj2 : marks) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                C7714v.O0();
                throw null;
            }
            TextAtomV2View orCreateMark = getOrCreateMark(i17);
            TextHolderKt.bind$default(orCreateMark, (TextDTO) obj2, null, 2, null);
            arrayList3.add(orCreateMark);
            i17 = i18;
        }
        int id2 = ((RoundedProgressBarView) C7714v.K(arrayList)).getId();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            TextAtomV2View textAtomV2View = (TextAtomV2View) it3.next();
            dVar.A(textAtomV2View.getId(), -2);
            dVar.w(textAtomV2View.getId(), -2);
            dVar.t(textAtomV2View.getId(), 3, id2, 4, item.getPaddings().getBetweenProgressAndRanges());
        }
        dVar.s(((TextAtomV2View) C7714v.K(arrayList3)).getId(), 6, 0, 6);
        dVar.s(((TextAtomV2View) C7714v.X(arrayList3)).getId(), 7, 0, 7);
        int P12 = C7714v.P(item.getMarks());
        for (int i19 = 1; i19 < P12; i19++) {
            dVar.s(((TextAtomV2View) arrayList3.get(i19)).getId(), 6, ((RoundedProgressBarView) arrayList.get(i19 - 1)).getId(), 7);
            dVar.s(((TextAtomV2View) arrayList3.get(i19)).getId(), 7, ((RoundedProgressBarView) arrayList.get(i19)).getId(), 6);
        }
        dVar.f(this.rootContainer);
    }

    private final TextAtomV2View getOrCreateMark(int position) {
        TextAtomV2View textAtomV2View = this.marksCache.get(Integer.valueOf(position));
        if (textAtomV2View != null) {
            return textAtomV2View;
        }
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(getContext(), null, 0, 6, null);
        textAtomV2View2.setId(View.generateViewId());
        textAtomV2View2.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.marksCache.put(Integer.valueOf(position), textAtomV2View2);
        this.rootContainer.addView(textAtomV2View2);
        return textAtomV2View2;
    }

    private final RoundedProgressBarView getOrCreateProgressBar(int position) {
        RoundedProgressBarView roundedProgressBarView = this.progressBarsCache.get(Integer.valueOf(position));
        if (roundedProgressBarView != null) {
            return roundedProgressBarView;
        }
        RoundedProgressBarView roundedProgressBarView2 = new RoundedProgressBarView(getContext(), null, 0, 6, null);
        roundedProgressBarView2.setId(View.generateViewId());
        roundedProgressBarView2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        roundedProgressBarView2.customize(defaultProgressRadius, defaultProgressHeight, this.defaultProgressBgColor, this.defaultProgressLineColor);
        this.progressBarsCache.put(Integer.valueOf(position), roundedProgressBarView2);
        this.rootContainer.addView(roundedProgressBarView2);
        return roundedProgressBarView2;
    }

    private final void subscribeToWidgetUpdates() {
        unsubscribeFromWidgetUpdates();
        C2399j.C(new C2408n0(C5427n.a(this.viewModel.getWidgetUpdates(), getLifecycle(), AbstractC5434v.b.STARTED), new SteppedThermometerViewHolder$subscribeToWidgetUpdates$1(this, null)), K.a(this));
    }

    private final void unsubscribeFromWidgetUpdates() {
        E0.d(K.a(this).getCoroutineContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSteppedThermometer(SteppedThermometerVO newVO) {
        this.references.getController().update(new SteppedThermometerStateUpdate(newVO));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        subscribeToWidgetUpdates();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        unsubscribeFromWidgetUpdates();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SteppedThermometerVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.bind(info);
        this.rootContainer.setPadding(item.getPaddings().getLeft(), item.getPaddings().getTop(), item.getPaddings().getRight(), item.getPaddings().getBottom());
        CellHolderKt.bind$default(this.cellView, item.getCell(), null, 2, null);
        bindRanges(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SteppedThermometerVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((SteppedThermometerViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
