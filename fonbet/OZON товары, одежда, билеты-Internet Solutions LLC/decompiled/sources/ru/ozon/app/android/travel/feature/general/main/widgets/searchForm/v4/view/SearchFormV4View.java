package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.view;

import B90.C2618u;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation.SearchFormV4VO;
import ru.ozon.app.android.travel.molecules.view.iconField.IconFieldVO;
import ru.ozon.app.android.travel.molecules.view.iconField.IconFieldView;
import ru.ozon.app.android.travel.utils.extensions.ViewsExtensionsKt;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import yQ.e;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 d2\u00020\u0001:\u0001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ)\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u001b¢\u0006\u0004\b!\u0010\"J3\u0010%\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u001c2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010#¢\u0006\u0004\b'\u0010(J3\u0010)\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u001c2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\u0004\b)\u0010&J\u0017\u0010*\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010#¢\u0006\u0004\b*\u0010(J3\u0010+\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u001c2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\u0004\b+\u0010&J\u0017\u0010,\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010#¢\u0006\u0004\b,\u0010(J)\u0010.\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020-2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\u0004\b.\u0010/J+\u00102\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u0001002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b4\u00105J\u0015\u00108\u001a\u00020\r2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b:\u00105J\u0017\u0010;\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b;\u00105J\u000f\u0010<\u001a\u00020\rH\u0007¢\u0006\u0004\b<\u0010\u0012J\u000f\u0010=\u001a\u00020\rH\u0007¢\u0006\u0004\b=\u0010\u0012R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0014\u0010B\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u0014\u0010C\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010DR\u0014\u0010F\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010DR\u0014\u0010G\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010DR\u0014\u0010H\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010DR\u0014\u0010I\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010DR\u0016\u0010J\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010MR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010UR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010UR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010c\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010b¨\u0006e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/view/SearchFormV4View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "color", "", "parseColor", "(Ljava/lang/String;)I", "Landroid/graphics/Canvas;", "canvas", "", "bindPatches", "(Landroid/graphics/Canvas;)V", "drawPatchTint", "requestInvalidate", "()V", "draw", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO$Content;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO$Content;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO$Content$Locations;", "", "isCrossFadeDepartureAnimated", "isCrossFadeDestinationAnimated", "bindLocations", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO$Content$Locations;ZZLkotlin/jvm/functions/Function1;)V", "swapLocations", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO$Content$Locations;)V", "Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;", "isTextAnimated", "bindDateField", "(Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;ZLkotlin/jvm/functions/Function1;)V", "updateDateFieldModel", "(Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;)V", "bindRightField", "updateRightFieldModel", "bindTouristField", "updateTouristFieldModel", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "bindSearchButton", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "bindToggleCell", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lkotlin/jvm/functions/Function1;)V", "bindBackgroundColor", "(Ljava/lang/String;)V", "", "radius", "bindCornerRadius", "(F)V", "bindLeftPatchColor", "bindRightPatchColor", "showLoader", "hideLoader", "Landroid/graphics/Paint;", "patchPaint", "Landroid/graphics/Paint;", "backgroundPaint", "pathTintPaint", "dp16", "I", "dp12", "dp10", "dp8", "dp6", "dp4", "cornerRadius", "F", "leftPathColor", "Ljava/lang/Integer;", "rightPathColor", "pathTintColor", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/view/SearchFormV4LocationsView;", "locationsView", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/view/SearchFormV4LocationsView;", "Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldView;", "dateFieldView", "Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldView;", "rightFieldView", "Landroidx/constraintlayout/widget/Barrier;", "bottomBarrier", "Landroidx/constraintlayout/widget/Barrier;", "touristFieldView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Lru/ozon/uni/android/cell/CellView;", "cellView", "Lru/ozon/uni/android/cell/CellView;", "batchingUpdates", "Z", "invalidateRequested", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchFormV4View extends ConstraintLayout {

    @NotNull
    private final Paint backgroundPaint;
    private boolean batchingUpdates;

    @NotNull
    private final Barrier bottomBarrier;

    @NotNull
    private final ButtonV3View buttonView;

    @NotNull
    private final CellView cellView;
    private float cornerRadius;

    @NotNull
    private final IconFieldView dateFieldView;
    private final int dp10;
    private final int dp12;
    private final int dp16;
    private final int dp4;
    private final int dp6;
    private final int dp8;
    private boolean invalidateRequested;
    private Integer leftPathColor;

    @NotNull
    private final SearchFormV4LocationsView locationsView;

    @NotNull
    private final Paint patchPaint;
    private Integer pathTintColor;

    @NotNull
    private final Paint pathTintPaint;

    @NotNull
    private final IconFieldView rightFieldView;
    private Integer rightPathColor;

    @NotNull
    private final IconFieldView touristFieldView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/view/SearchFormV4View$Companion;", "", "<init>", "()V", "LOCATOR_DATES_FIELD", "", "LOCATOR_RIGHT_FIELD", "LOCATOR_TOURISTS_FIELD", "LOCATOR_SEARCH_BUTTON", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFormV4View(@NotNull Context context) {
        super(context);
        View view;
        q qVar;
        ButtonV3View buttonV3View;
        View view2;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.patchPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        this.backgroundPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        this.pathTintPaint = paint3;
        int px = UiExtKt.toPx(16, context);
        this.dp16 = px;
        int px2 = UiExtKt.toPx(12, context);
        this.dp12 = px2;
        int px3 = UiExtKt.toPx(10, context);
        this.dp10 = px3;
        int px4 = UiExtKt.toPx(8, context);
        this.dp8 = px4;
        int px5 = UiExtKt.toPx(6, context);
        this.dp6 = px5;
        int px6 = UiExtKt.toPx(4, context);
        this.dp4 = px6;
        SearchFormV4LocationsView searchFormV4LocationsView = new SearchFormV4LocationsView(context);
        searchFormV4LocationsView.setId(7163);
        searchFormV4LocationsView.setPadding(px, px5, px, px5);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41636i = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.setMargins(px, 0, px, 0);
        searchFormV4LocationsView.setLayoutParams(bVar);
        this.locationsView = searchFormV4LocationsView;
        IconFieldView iconFieldView = new IconFieldView(context, null, 0, 6, null);
        iconFieldView.setId(7164);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41638j = 7163;
        bVar2.f41656t = 0;
        bVar2.f41657u = 7165;
        bVar2.setMargins(px, px4, px6, 0);
        iconFieldView.setLayoutParams(bVar2);
        this.dateFieldView = iconFieldView;
        IconFieldView iconFieldView2 = new IconFieldView(context, null, 0, 6, null);
        iconFieldView2.setId(7165);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        bVar3.f41638j = 7163;
        bVar3.f41655s = 7164;
        bVar3.f41658v = 0;
        bVar3.setMargins(px6, px4, px, 0);
        iconFieldView2.setLayoutParams(bVar3);
        this.rightFieldView = iconFieldView2;
        Barrier barrier = new Barrier(context);
        barrier.setId(7166);
        barrier.setLayoutParams(new ConstraintLayout.b(-2, -2));
        barrier.setReferencedIds(new int[]{7164, 7165});
        barrier.f(3);
        this.bottomBarrier = barrier;
        IconFieldView iconFieldView3 = new IconFieldView(context, null, 0, 6, null);
        iconFieldView3.setId(7167);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(0, -2);
        bVar4.f41638j = 7166;
        bVar4.f41656t = 0;
        bVar4.f41658v = 0;
        bVar4.setMargins(px, px4, px, 0);
        iconFieldView3.setLayoutParams(bVar4);
        this.touristFieldView = iconFieldView3;
        q qVar2 = q.f64554a;
        ButtonV3View buttonV3View2 = (ButtonV3View) qVar2.i(N.b(ButtonV3View.class), context);
        if (buttonV3View2 == null) {
            view = iconFieldView3;
            qVar = qVar2;
            buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        } else {
            view = iconFieldView3;
            qVar = qVar2;
            buttonV3View = buttonV3View2;
        }
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, 7168, 0, -2);
        e11.f41638j = 7167;
        e11.f41656t = 0;
        e11.f41658v = 0;
        e11.f41640k = 7169;
        e11.f41662z = px3;
        e11.setMargins(px, px2, px, px6);
        buttonV3View.setLayoutParams(e11);
        this.buttonView = buttonV3View;
        CellView cellView = (CellView) qVar.i(N.b(CellView.class), context);
        if (cellView == null) {
            i12 = 7169;
            view2 = buttonV3View;
            i11 = 7168;
            cellView = new CellView(context, null, 0, 0, null, 30, null);
        } else {
            view2 = buttonV3View;
            i11 = 7168;
            i12 = 7169;
        }
        cellView.setId(i12);
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(0, -2);
        bVar5.f41638j = i11;
        bVar5.f41656t = 0;
        bVar5.f41658v = 0;
        bVar5.f41642l = 0;
        cellView.setLayoutParams(bVar5);
        this.cellView = cellView;
        setWillNotDraw(false);
        addView(searchFormV4LocationsView);
        addView(iconFieldView);
        addView(iconFieldView2);
        addView(barrier);
        addView(view);
        addView(view2);
        addView(cellView);
    }

    private final void bindPatches(Canvas canvas) {
        Canvas canvas2;
        Integer num = this.leftPathColor;
        if (num != null) {
            this.patchPaint.setColor(num.intValue());
            float f7 = this.cornerRadius;
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, f7, f7, this.patchPaint);
        } else {
            canvas2 = canvas;
        }
        Integer num2 = this.rightPathColor;
        if (num2 != null) {
            this.patchPaint.setColor(num2.intValue());
            canvas2.drawRect(getWidth() - this.cornerRadius, 0.0f, getWidth(), this.cornerRadius, this.patchPaint);
        }
    }

    private final void drawPatchTint(Canvas canvas) {
        if (this.pathTintColor != null) {
            float f7 = this.cornerRadius;
            canvas.drawRect(0.0f, 0.0f, f7, f7, this.pathTintPaint);
            canvas.drawRect(getWidth() - this.cornerRadius, 0.0f, getWidth(), this.cornerRadius, this.pathTintPaint);
        }
    }

    private final int parseColor(String color) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, color);
        if (parseColor != null) {
            return parseColor.intValue();
        }
        return 0;
    }

    private final void requestInvalidate() {
        if (this.batchingUpdates) {
            this.invalidateRequested = true;
        } else {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showLoader$lambda$17(View view, MotionEvent motionEvent) {
        return true;
    }

    public final void bind(@NotNull SearchFormV4VO.Content item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        bindLocations(item.getLocations(), false, false, actionHandler);
        bindDateField(item.getDateField(), false, actionHandler);
        bindRightField(item.getRightField(), false, actionHandler);
        bindTouristField(item.getTouristField(), false, actionHandler);
        bindSearchButton(item.getSearchButton(), actionHandler);
        bindToggleCell(item.getToggleCell(), actionHandler);
        this.batchingUpdates = true;
        try {
            bindBackgroundColor(item.getBackgroundColor());
            bindCornerRadius(item.getCornerRadius());
            bindLeftPatchColor(item.getLeftPatchColor());
            bindRightPatchColor(item.getRightPatchColor());
        } finally {
            this.batchingUpdates = false;
            if (this.invalidateRequested) {
                this.invalidateRequested = false;
                invalidate();
            }
        }
    }

    public final void bindBackgroundColor(String color) {
        this.backgroundPaint.setColor(parseColor(color));
        requestInvalidate();
    }

    public final void bindCornerRadius(float radius) {
        this.cornerRadius = radius;
        requestInvalidate();
    }

    public final void bindDateField(IconFieldVO item, boolean isTextAnimated, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.dateFieldView.bindOrGone(item, isTextAnimated, actionHandler);
        ViewsExtensionsKt.appendContentDescription(this.dateFieldView, "dateFieldView");
    }

    public final void bindLeftPatchColor(String color) {
        this.leftPathColor = Integer.valueOf(parseColor(color));
        requestInvalidate();
    }

    public final void bindLocations(@NotNull SearchFormV4VO.Content.Locations item, boolean isCrossFadeDepartureAnimated, boolean isCrossFadeDestinationAnimated, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.locationsView.bind(item, isCrossFadeDepartureAnimated, isCrossFadeDestinationAnimated, actionHandler);
    }

    public final void bindRightField(IconFieldVO item, boolean isTextAnimated, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.rightFieldView.bindOrGone(item, isTextAnimated, actionHandler);
        ViewsExtensionsKt.appendContentDescription(this.rightFieldView, "rightFieldView");
    }

    public final void bindRightPatchColor(String color) {
        this.rightPathColor = Integer.valueOf(parseColor(color));
        requestInvalidate();
    }

    public final void bindSearchButton(@NotNull ButtonV3DTO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ButtonV3HolderKt.bind(this.buttonView, item, actionHandler);
        this.buttonView.setContentDescription("SearchButton");
    }

    public final void bindToggleCell(CellDTO cell, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        CellHolderKt.bindOrGone(this.cellView, cell, actionHandler);
    }

    public final void bindTouristField(IconFieldVO item, boolean isTextAnimated, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.touristFieldView.bindOrGone(item, isTextAnimated, actionHandler);
        ViewsExtensionsKt.appendContentDescription(this.touristFieldView, "touristFieldView");
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        bindPatches(canvas);
        drawPatchTint(canvas);
        float width = getWidth();
        float height = getHeight();
        float f7 = this.cornerRadius;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, f7, f7, this.backgroundPaint);
        super.draw(canvas);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void hideLoader() {
        this.buttonView.hideLoader();
        this.buttonView.setOnTouchListener(null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void showLoader() {
        this.buttonView.setOnTouchListener(new e());
        this.buttonView.showLoader();
    }

    public final void swapLocations(@NotNull SearchFormV4VO.Content.Locations item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.locationsView.swapLocations(item);
    }

    public final void updateDateFieldModel(IconFieldVO item) {
        this.dateFieldView.updateModel(item);
    }

    public final void updateRightFieldModel(IconFieldVO item) {
        this.rightFieldView.updateModel(item);
    }

    public final void updateTouristFieldModel(IconFieldVO item) {
        this.touristFieldView.updateModel(item);
    }
}
