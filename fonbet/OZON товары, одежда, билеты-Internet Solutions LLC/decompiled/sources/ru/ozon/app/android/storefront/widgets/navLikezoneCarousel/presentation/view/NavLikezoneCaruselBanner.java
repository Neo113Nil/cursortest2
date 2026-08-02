package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view;

import Xc.a;
import Xc.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import dL.ViewOnClickListenerC6128a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.Dimens;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.LongTapDetector;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.NavLikezoneCaruselBanner;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.utils.ShellNavBarUtilsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b`\u0018\u00002\u00020\u0001:\u0002\u001e\u001fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H&¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0004H&¢\u0006\u0004\b\u001d\u0010\u001b¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/NavLikezoneCaruselBanner;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "updateTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "updateSubtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "updateBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "image", "", "needGoneIfNull", "updateAccentImage", "(Ljava/lang/String;Z)V", "color", "updateBackgroundColor", "(Ljava/lang/String;)V", "updateBackgroundImage", "", "margin", "updateTopMargin", "(I)V", "setupLeftAlign", "()V", "setupTopCenterAlign", "setupBottomCenterAlign", "View", "Align", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface NavLikezoneCaruselBanner {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/NavLikezoneCaruselBanner$Align;", "", "<init>", "(Ljava/lang/String;I)V", "None", "Left", "CenterTop", "CenterBottom", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Align {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Align[] $VALUES;
        public static final Align None = new Align("None", 0);
        public static final Align Left = new Align("Left", 1);
        public static final Align CenterTop = new Align("CenterTop", 2);
        public static final Align CenterBottom = new Align("CenterBottom", 3);

        private static final /* synthetic */ Align[] $values() {
            return new Align[]{None, Left, CenterTop, CenterBottom};
        }

        static {
            Align[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Align(String str, int i11) {
        }

        public static Align valueOf(String str) {
            return (Align) Enum.valueOf(Align.class, str);
        }

        public static Align[] values() {
            return (Align[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0001LB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010&J\u001d\u0010+\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0)H\u0016¢\u0006\u0004\b+\u0010,J+\u0010/\u001a\u00020\b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0)2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0)H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00192\u0006\u00102\u001a\u000201H\u0017¢\u0006\u0004\b3\u00104R\u0014\u00105\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u00108\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00106R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010A\u001a\u00020@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001e\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010J¨\u0006M"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/NavLikezoneCaruselBanner$View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/NavLikezoneCaruselBanner;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/constraintlayout/widget/d;", "", "clearAll", "(Landroidx/constraintlayout/widget/d;)V", "Lru/ozon/app/android/pikazon/image/ImageSize;", "backgroundImageSize", "(Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/NavLikezoneCaruselBanner$View;)Lru/ozon/app/android/pikazon/image/ImageSize;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "updateTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "updateSubtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "updateBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "image", "", "needGoneIfNull", "updateAccentImage", "(Ljava/lang/String;Z)V", "color", "updateBackgroundColor", "(Ljava/lang/String;)V", "updateBackgroundImage", "", "margin", "updateTopMargin", "(I)V", "setupLeftAlign", "()V", "setupTopCenterAlign", "setupBottomCenterAlign", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onClickListener", "(Lkotlin/jvm/functions/Function0;)V", "up", "down", "onLongTap", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "statusBarHeight", "I", "widgetWidth", "widgetHeight", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/LongTapDetector$Default;", "longTapDetector", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/LongTapDetector$Default;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "imageView", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/NavLikezoneCaruselBanner$Align;", "currentAlign", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/NavLikezoneCaruselBanner$Align;", "onLongTapDown", "Lkotlin/jvm/functions/Function0;", "onLongTapUp", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class View extends ConstraintLayout implements NavLikezoneCaruselBanner {

        @SuppressLint({"ClickableViewAccessibility"})
        @NotNull
        private final BadgeView badgeView;

        @NotNull
        private Align currentAlign;

        @NotNull
        private final AppCompatImageView imageView;

        @NotNull
        private final LongTapDetector.Default longTapDetector;
        private Function0<Unit> onLongTapDown;
        private Function0<Unit> onLongTapUp;
        private final int statusBarHeight;

        @NotNull
        private final TextAtomV2View subtitleView;

        @NotNull
        private final TextAtomV2View titleView;
        private final int widgetHeight;
        private final int widgetWidth;
        public static final int $stable = 8;
        private static final int CONTENT_HEIGHT = ResourceExtKt.toPx(256);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public View(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            int statusBarHeight = ResourceExtKt.getStatusBarHeight(context);
            this.statusBarHeight = statusBarHeight;
            this.widgetWidth = ResourceExtKt.getDisplaySizePx(context).e().intValue();
            this.widgetHeight = CONTENT_HEIGHT + statusBarHeight;
            this.longTapDetector = new LongTapDetector.Default();
            AttributeSet attributeSet = null;
            int i11 = 0;
            int i12 = 6;
            DefaultConstructorMarker defaultConstructorMarker = null;
            TextAtomV2View textAtomV2View = new TextAtomV2View(context, attributeSet, i11, i12, defaultConstructorMarker);
            ConstraintLayout.b d11 = Bi.b.d(textAtomV2View, R$id.navLikezoneCarusel_Banner_Titile, -2, -2);
            d11.f41616W = true;
            textAtomV2View.setLayoutParams(d11);
            textAtomV2View.setTextIsSelectable(false);
            this.titleView = textAtomV2View;
            TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, attributeSet, i11, i12, defaultConstructorMarker);
            ConstraintLayout.b d12 = Bi.b.d(textAtomV2View2, R$id.navLikezoneCarusel_Banner_Subtitile, -2, -2);
            d12.f41616W = true;
            textAtomV2View2.setLayoutParams(d12);
            textAtomV2View2.setTextIsSelectable(false);
            this.subtitleView = textAtomV2View2;
            BadgeView badgeView = new BadgeView(context, attributeSet, i11, 0, 14, null);
            ConstraintLayout.b a11 = com.google.android.gms.internal.mlkit_common.a.a(badgeView, R$id.navLikezoneCarusel_Banner_Badge, -2, -2);
            a11.f41616W = true;
            badgeView.setLayoutParams(a11);
            badgeView.setOnTouchListener(new BK.a(this, 2));
            this.badgeView = badgeView;
            AppCompatImageView appCompatImageView = new AppCompatImageView(context);
            appCompatImageView.setId(R$id.navLikezoneCarusel_Banner_Image);
            appCompatImageView.setOnClickListener(new FM.a(this, 10));
            this.imageView = appCompatImageView;
            this.currentAlign = Align.None;
            setId(R$id.navLikezoneCarusel_Banner_Root);
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            Dimens dimens = Dimens.INSTANCE;
            setPadding(dimens.getDp16(), statusBarHeight, dimens.getDp16(), dimens.getDp80());
            addView(textAtomV2View);
            addView(textAtomV2View2);
            addView(badgeView);
            addView(appCompatImageView);
        }

        private final ImageSize backgroundImageSize(View view) {
            int i11 = view.widgetWidth;
            if (i11 > 0) {
                return new ImageSize(i11, view.widgetHeight);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean badgeView$lambda$6$lambda$5(View view, android.view.View view2, MotionEvent motionEvent) {
            Intrinsics.f(motionEvent);
            return view.onTouchEvent(motionEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void clearAll(d dVar) {
            dVar.o(this.titleView.getId(), 3);
            dVar.o(this.titleView.getId(), 6);
            dVar.o(this.titleView.getId(), 7);
            dVar.o(this.titleView.getId(), 4);
            dVar.o(this.subtitleView.getId(), 3);
            dVar.o(this.subtitleView.getId(), 6);
            dVar.o(this.subtitleView.getId(), 7);
            dVar.o(this.subtitleView.getId(), 4);
            dVar.o(this.badgeView.getId(), 3);
            dVar.o(this.badgeView.getId(), 6);
            dVar.o(this.badgeView.getId(), 7);
            dVar.o(this.badgeView.getId(), 4);
            dVar.o(this.imageView.getId(), 3);
            dVar.o(this.imageView.getId(), 6);
            dVar.o(this.imageView.getId(), 7);
            dVar.o(this.imageView.getId(), 4);
        }

        public void onClickListener(@NotNull Function0<Unit> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            setOnClickListener(new ViewOnClickListenerC6128a(listener, 0));
        }

        public void onLongTap(@NotNull Function0<Unit> up, @NotNull Function0<Unit> down) {
            Intrinsics.checkNotNullParameter(up, "up");
            Intrinsics.checkNotNullParameter(down, "down");
            this.onLongTapUp = up;
            this.onLongTapDown = down;
        }

        @Override // android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(@NotNull MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            return this.longTapDetector.detect(this, event, this.onLongTapUp, this.onLongTapDown, new NavLikezoneCaruselBanner$View$onTouchEvent$1(this));
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.NavLikezoneCaruselBanner
        public void setupBottomCenterAlign() {
            Align align = this.currentAlign;
            Align align2 = Align.CenterBottom;
            if (align == align2) {
                return;
            }
            ConstraintLayoutExtKt.updateConstraints(this, new NavLikezoneCaruselBanner$View$setupBottomCenterAlign$1(this));
            TextAtomV2View textAtomV2View = this.titleView;
            ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.f41598E = 0.5f;
            bVar.f41616W = true;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = 0;
            Dimens dimens = Dimens.INSTANCE;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = dimens.getDp4();
            textAtomV2View.setLayoutParams(bVar);
            TextAtomV2View textAtomV2View2 = this.subtitleView;
            ViewGroup.LayoutParams layoutParams2 = textAtomV2View2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            bVar2.f41598E = 0.5f;
            bVar2.f41616W = true;
            ((ViewGroup.MarginLayoutParams) bVar2).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = dimens.getDp12();
            bVar2.f41662z = dimens.getDp36();
            textAtomV2View2.setLayoutParams(bVar2);
            BadgeView badgeView = this.badgeView;
            ViewGroup.LayoutParams layoutParams3 = badgeView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
            bVar3.f41598E = 0.5f;
            bVar3.f41616W = true;
            ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin = dimens.getDp36();
            badgeView.setLayoutParams(bVar3);
            this.currentAlign = align2;
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.NavLikezoneCaruselBanner
        public void setupLeftAlign() {
            Align align = this.currentAlign;
            Align align2 = Align.Left;
            if (align == align2) {
                return;
            }
            ConstraintLayoutExtKt.updateConstraints(this, new NavLikezoneCaruselBanner$View$setupLeftAlign$1(this));
            TextAtomV2View textAtomV2View = this.titleView;
            ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.f41598E = 0.0f;
            bVar.f41616W = true;
            Dimens dimens = Dimens.INSTANCE;
            bVar.setMarginEnd(dimens.getDp16());
            textAtomV2View.setLayoutParams(bVar);
            TextAtomV2View textAtomV2View2 = this.subtitleView;
            ViewGroup.LayoutParams layoutParams2 = textAtomV2View2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            bVar2.f41598E = 0.0f;
            bVar2.f41616W = true;
            bVar2.setMarginEnd(dimens.getDp16());
            ((ViewGroup.MarginLayoutParams) bVar2).topMargin = dimens.getDp4();
            textAtomV2View2.setLayoutParams(bVar2);
            BadgeView badgeView = this.badgeView;
            ViewGroup.LayoutParams layoutParams3 = badgeView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
            bVar3.f41598E = 0.0f;
            bVar3.f41616W = true;
            bVar3.setMarginEnd(dimens.getDp16());
            ((ViewGroup.MarginLayoutParams) bVar3).topMargin = dimens.getDp12();
            badgeView.setLayoutParams(bVar3);
            AppCompatImageView appCompatImageView = this.imageView;
            ViewGroup.LayoutParams layoutParams4 = appCompatImageView.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar4 = (ConstraintLayout.b) layoutParams4;
            ((ViewGroup.MarginLayoutParams) bVar4).height = dimens.getDp110();
            ((ViewGroup.MarginLayoutParams) bVar4).width = dimens.getDp120();
            ((ViewGroup.MarginLayoutParams) bVar4).topMargin = dimens.getDp27();
            appCompatImageView.setLayoutParams(bVar4);
            this.currentAlign = align2;
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.NavLikezoneCaruselBanner
        public void setupTopCenterAlign() {
            Align align = this.currentAlign;
            Align align2 = Align.CenterTop;
            if (align == align2) {
                return;
            }
            ConstraintLayoutExtKt.updateConstraints(this, new NavLikezoneCaruselBanner$View$setupTopCenterAlign$1(this));
            AppCompatImageView appCompatImageView = this.imageView;
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            Dimens dimens = Dimens.INSTANCE;
            ((ViewGroup.MarginLayoutParams) bVar).height = dimens.getDp72();
            ((ViewGroup.MarginLayoutParams) bVar).width = dimens.getDp134();
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = dimens.getDp8();
            appCompatImageView.setLayoutParams(bVar);
            TextAtomV2View textAtomV2View = this.titleView;
            ViewGroup.LayoutParams layoutParams2 = textAtomV2View.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            bVar2.f41598E = 0.5f;
            bVar2.f41616W = true;
            ((ViewGroup.MarginLayoutParams) bVar2).topMargin = dimens.getDp4();
            textAtomV2View.setLayoutParams(bVar2);
            TextAtomV2View textAtomV2View2 = this.subtitleView;
            ViewGroup.LayoutParams layoutParams3 = textAtomV2View2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
            bVar3.f41598E = 0.5f;
            bVar3.f41616W = true;
            ((ViewGroup.MarginLayoutParams) bVar3).topMargin = dimens.getDp4();
            textAtomV2View2.setLayoutParams(bVar3);
            BadgeView badgeView = this.badgeView;
            ViewGroup.LayoutParams layoutParams4 = badgeView.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar4 = (ConstraintLayout.b) layoutParams4;
            bVar4.f41598E = 0.5f;
            bVar4.f41616W = true;
            ((ViewGroup.MarginLayoutParams) bVar4).topMargin = dimens.getDp12();
            badgeView.setLayoutParams(bVar4);
            this.currentAlign = align2;
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.NavLikezoneCaruselBanner
        public void updateAccentImage(String image, boolean needGoneIfNull) {
            if (needGoneIfNull) {
                ImageViewExtKt.loadImageOrGone(this.imageView, image);
            } else {
                ImageViewExtKt.loadImageOrInvisible(this.imageView, image);
            }
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.NavLikezoneCaruselBanner
        public void updateBackgroundColor(String color) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, color);
            setBackgroundColor(parseColor != null ? parseColor.intValue() : 0);
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.NavLikezoneCaruselBanner
        public void updateBackgroundImage(@NotNull String image) {
            Intrinsics.checkNotNullParameter(image, "image");
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ContextExtKt.load(context, image, (r15 & 2) != 0 ? K.f71697a : C7714v.a0(ImageTransformation.CenterCrop.INSTANCE), (r15 & 4) != 0 ? null : new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.NavLikezoneCaruselBanner$View$updateBackgroundImage$1
                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadFailed(Exception e11) {
                    NavLikezoneCaruselBanner.View.this.setBackground(null);
                }

                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadSuccessful(Drawable resource) {
                    NavLikezoneCaruselBanner.View.this.setBackground(resource);
                }
            }, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? LoadPriority.NORMAL : null, (r15 & 32) != 0 ? false : false, (r15 & 64) != 0 ? null : backgroundImageSize(this));
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.NavLikezoneCaruselBanner
        public void updateBadge(BadgeDTO badge) {
            BadgeHolderKt.bindOrGone(this.badgeView, badge, new NavLikezoneCaruselBanner$View$updateBadge$1(this));
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.NavLikezoneCaruselBanner
        public void updateSubtitle(TextDTO text) {
            TextHolderKt.bindOrGone$default(this.subtitleView, text, null, 2, null);
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.NavLikezoneCaruselBanner
        public void updateTitle(@NotNull TextDTO text) {
            Intrinsics.checkNotNullParameter(text, "text");
            TextHolderKt.bind$default(this.titleView, text, null, 2, null);
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.NavLikezoneCaruselBanner
        public void updateTopMargin(int margin) {
            ShellNavBarUtilsKt.updateTopMarginIfNeeded(this.titleView, margin);
        }
    }

    void setupBottomCenterAlign();

    void setupLeftAlign();

    void setupTopCenterAlign();

    void updateAccentImage(String image, boolean needGoneIfNull);

    void updateBackgroundColor(String color);

    void updateBackgroundImage(@NotNull String image);

    void updateBadge(BadgeDTO badge);

    void updateSubtitle(TextDTO text);

    void updateTitle(@NotNull TextDTO text);

    void updateTopMargin(int margin);
}
