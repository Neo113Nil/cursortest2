package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.view;

import Am.C2438a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/view/HotelsGalleryView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dsProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dp4", "", "dp8", "dp12", "hotelsGalleryVp", "Landroidx/viewpager2/widget/ViewPager2;", "getHotelsGalleryVp", "()Landroidx/viewpager2/widget/ViewPager2;", "hotelsGalleryIndicatorContainer", "Landroid/widget/FrameLayout;", "getHotelsGalleryIndicatorContainer", "()Landroid/widget/FrameLayout;", "hotelsGalleryButtonsRv", "Landroidx/recyclerview/widget/RecyclerView;", "getHotelsGalleryButtonsRv", "()Landroidx/recyclerview/widget/RecyclerView;", "hotelsGalleryBadge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getHotelsGalleryBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "hotelsGalleryBadge$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "nestedContainerLL", "Landroid/widget/LinearLayout;", "getNestedContainerLL", "()Landroid/widget/LinearLayout;", "addViews", "", "setConstrains", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryView extends ConstraintLayout {
    private final int dp12;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final DesignSystemDimensProvider dsProvider;

    /* renamed from: hotelsGalleryBadge$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsGalleryBadge;

    @NotNull
    private final RecyclerView hotelsGalleryButtonsRv;

    @NotNull
    private final FrameLayout hotelsGalleryIndicatorContainer;

    @NotNull
    private final ViewPager2 hotelsGalleryVp;

    @NotNull
    private final LinearLayout nestedContainerLL;
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(HotelsGalleryView.class, "hotelsGalleryBadge", "getHotelsGalleryBadge()Lru/ozon/uni/android/atom/badge/BadgeView;", 0)};

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/view/HotelsGalleryView$Companion;", "", "<init>", "()V", "HOTELS_GALLERY_RATIO", "", "FULL_BIAS", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsGalleryView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsProvider = dimens$default;
        int margin4 = dimens$default.getMargin4();
        this.dp4 = margin4;
        int margin8 = dimens$default.getMargin8();
        this.dp8 = margin8;
        int margin12 = dimens$default.getMargin12();
        this.dp12 = margin12;
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41600G = "1:1";
        viewPager2.setLayoutParams(bVar);
        viewPager2.w(0);
        this.hotelsGalleryVp = viewPager2;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(View.generateViewId());
        frameLayout.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.hotelsGalleryIndicatorContainer = frameLayout;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.setMargins(((ViewGroup.MarginLayoutParams) bVar2).leftMargin, ((ViewGroup.MarginLayoutParams) bVar2).topMargin, margin12, margin8);
        bVar2.f41662z = margin4;
        bVar2.f41617X = true;
        bVar2.f41599F = 1.0f;
        recyclerView.setLayoutParams(bVar2);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setNestedScrollingEnabled(false);
        ViewExtKt.gone(recyclerView);
        this.hotelsGalleryButtonsRv = recyclerView;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.hotelsGalleryBadge = new PreCreationViewPoolDelegate(context2, N.b(BadgeView.class), new HotelsGalleryView$special$$inlined$preCreationViewPool$default$1(this), new HotelsGalleryView$special$$inlined$preCreationViewPool$default$2(this));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(View.generateViewId());
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        bVar3.setMargins(((ViewGroup.MarginLayoutParams) bVar3).leftMargin, margin12, ((ViewGroup.MarginLayoutParams) bVar3).rightMargin, ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin);
        bVar3.f41599F = 1.0f;
        linearLayout.setLayoutParams(bVar3);
        linearLayout.setOrientation(1);
        this.nestedContainerLL = linearLayout;
        addViews();
        setConstrains();
    }

    private final void addViews() {
        addView(this.hotelsGalleryVp);
        addView(this.hotelsGalleryIndicatorContainer);
        addView(this.hotelsGalleryButtonsRv);
        addView(getHotelsGalleryBadge());
        addView(this.nestedContainerLL);
    }

    private final void setConstrains() {
        ConstraintLayoutExtKt.updateConstraints(this, new HotelsGalleryView$setConstrains$1(this));
    }

    @NotNull
    public final BadgeView getHotelsGalleryBadge() {
        return (BadgeView) this.hotelsGalleryBadge.getValue(this, $$delegatedProperties[0]);
    }

    @NotNull
    public final RecyclerView getHotelsGalleryButtonsRv() {
        return this.hotelsGalleryButtonsRv;
    }

    @NotNull
    public final FrameLayout getHotelsGalleryIndicatorContainer() {
        return this.hotelsGalleryIndicatorContainer;
    }

    @NotNull
    public final ViewPager2 getHotelsGalleryVp() {
        return this.hotelsGalleryVp;
    }

    @NotNull
    public final LinearLayout getNestedContainerLL() {
        return this.nestedContainerLL;
    }
}
