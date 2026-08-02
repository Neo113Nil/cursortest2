package ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.presentation.views;

import Bi.b;
import Hj.C3143a;
import Hk0.c;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.domain.ProfileTilesVO;
import ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.presentation.views.BonusesTileView;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0001,B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/views/BonusesTileView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "color", "radius", "", "bindBackground", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO$Bonuses;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/domain/ProfileTilesVO$Bonuses;Lkotlin/jvm/functions/Function1;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "imageVisibility", "Z", "getImageVisibility", "()Z", "setImageVisibility", "(Z)V", "Landroid/widget/ImageView;", "imageView", "Landroid/widget/ImageView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/views/BadgeListAdapter;", "badgeAdapter", "Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/views/BadgeListAdapter;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BonusesTileView extends ConstraintLayout {
    private static final int badgesBottomMargin;
    private static final int badgesSpacer;
    private static final int componentsRightMargin;
    private static final int defaultBackgroundColor;
    private static final float defaultCornerRadius;
    private static final int imageWidth;
    private static final int titleLeftMargin;
    private static final int titleTopMargin;

    @NotNull
    private final BadgeListAdapter badgeAdapter;

    @NotNull
    private final ImageView imageView;
    private boolean imageVisibility;

    @NotNull
    private final TextAtomV2View titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileTiles/presentation/views/BonusesTileView$Companion;", "", "<init>", "()V", "", "defaultCornerRadius", "F", "getDefaultCornerRadius", "()F", "TITLE_HORIZONTAL_BIAS", "BADGES_VERTICAL_BIAS", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getDefaultCornerRadius() {
            return BonusesTileView.defaultCornerRadius;
        }

        private Companion() {
        }
    }

    static {
        int px = UiExtKt.toPx(4);
        titleTopMargin = px;
        badgesBottomMargin = px;
        titleLeftMargin = UiExtKt.toPx(8);
        componentsRightMargin = UiExtKt.toPx(6);
        badgesSpacer = UiExtKt.toPx(4);
        imageWidth = UiExtKt.toPx(75);
        defaultBackgroundColor = UniColors.LAYER_FLOOR_1.getResId();
        defaultCornerRadius = UiExtKt.toPxF(24);
    }

    public /* synthetic */ BonusesTileView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$9$lambda$8(ProfileTilesVO.Bonuses bonuses, Function1 function1, View view) {
        AtomAction action = bonuses.getAction();
        if (action != null) {
            function1.invoke(action);
        }
    }

    private final void bindBackground(String color, final Integer radius) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context, color, defaultBackgroundColor));
        setClipToOutline(true);
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.presentation.views.BonusesTileView$bindBackground$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                BonusesTileView.Companion companion;
                float defaultCornerRadius2;
                int f7 = C3143a.f(view, "view", outline, "outline");
                int height = view.getHeight();
                Integer num = radius;
                if (num != null) {
                    defaultCornerRadius2 = UiExtKt.toPxF(num.intValue());
                } else {
                    companion = BonusesTileView.Companion;
                    defaultCornerRadius2 = companion.getDefaultCornerRadius();
                }
                outline.setRoundRect(0, 0, f7, height, defaultCornerRadius2);
            }
        });
    }

    public final void bind(@NotNull ProfileTilesVO.Bonuses item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextHolderKt.bindOrGone(this.titleView, item.getTitle(), actionHandler);
        this.badgeAdapter.submitList(item.getBadges());
        ImageViewExtKt.load$default(this.imageView, item.getImage(), null, null, null, null, false, null, 126, null);
        bindBackground(item.getBackgroundColor(), item.getCornerRadius());
        setOnClickListener(new c(1, item, actionHandler));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (ev == null || ev.getAction() != 1) {
            return false;
        }
        return performClick();
    }

    public final void setImageVisibility(boolean z11) {
        this.imageView.setVisibility(z11 ? 0 : 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BonusesTileView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.imageVisibility = true;
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.profileTilesBonusesImage);
        ConstraintLayout.b bVar = new ConstraintLayout.b(imageWidth, -1);
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41634h = 0;
        imageView.setLayoutParams(bVar);
        addView(imageView);
        this.imageView = imageView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.profileTilesBonusesTitle, 0, -2);
        d11.f41598E = 0.0f;
        d11.f41636i = 0;
        d11.f41628e = 0;
        d11.f41632g = R$id.profileTilesBonusesImage;
        ((ViewGroup.MarginLayoutParams) d11).topMargin = titleTopMargin;
        ((ViewGroup.MarginLayoutParams) d11).leftMargin = titleLeftMargin;
        int i12 = componentsRightMargin;
        ((ViewGroup.MarginLayoutParams) d11).rightMargin = i12;
        textAtomV2View.setLayoutParams(d11);
        TextViewExtKt.setTextCopyable(textAtomV2View, false);
        addView(textAtomV2View);
        this.titleView = textAtomV2View;
        BadgeListAdapter badgeListAdapter = new BadgeListAdapter();
        this.badgeAdapter = badgeListAdapter;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.profileTilesBonusesBadges);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(badgeListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.addItemDecoration(new BadgesVerticalItemDecoration(badgesSpacer));
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41598E = 0.0f;
        bVar2.f41599F = 0.0f;
        int i13 = R$id.profileTilesBonusesTitle;
        bVar2.f41638j = i13;
        bVar2.f41628e = i13;
        bVar2.f41632g = R$id.profileTilesBonusesImage;
        bVar2.f41642l = 0;
        ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = badgesBottomMargin;
        ((ViewGroup.MarginLayoutParams) bVar2).rightMargin = i12;
        bVar2.f41605L = 1;
        recyclerView.setLayoutParams(bVar2);
        addView(recyclerView);
    }
}
