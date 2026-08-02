package ru.ozon.app.android.tabbar.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MenuItem;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.ui.model.TabIconColor;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0011H&¢\u0006\u0004\b\u001a\u0010\u0014J\u0019\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\nH&¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\nH&¢\u0006\u0004\b$\u0010#J\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0011H&¢\u0006\u0004\b&\u0010\u0014J#\u0010+\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H&¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\u00020\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H&¢\u0006\u0004\b-\u0010.J\u0011\u0010/\u001a\u0004\u0018\u00010'H&¢\u0006\u0004\b/\u00100R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u0010!R\u001c\u00105\u001a\u0002048&@&X¦\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001c\u0010B\u001a\u00020=8&@&X¦\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/MenuItem;", "menuItem", "", "setChecked", "(Landroid/view/MenuItem;)V", "", "label", "setLabel", "(Ljava/lang/CharSequence;)V", "", "resId", "setLabelTextAppearance", "(I)V", "Landroid/content/res/ColorStateList;", "colorStateList", "setLabelColor", "(Landroid/content/res/ColorStateList;)V", "mode", "setLabelVisibility", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "animationId", "setAnimation", "(Ljava/lang/Integer;)V", "cancelAnimation", "()V", "playAnimationIfExists", "badgeVerticalOffset", "setBadgeTopOffset", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "indicator", "", "badgeDescription", "bindBadge", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Ljava/lang/String;)V", "removeBadge", "(Ljava/lang/String;)V", "getBadgeData", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getAnimationId", "()Ljava/lang/Integer;", "setAnimationId", "", "isAnimationCompleted", "()Z", "setAnimationCompleted", "(Z)V", "Lcom/airbnb/lottie/LottieAnimationView;", "getAnimatedIconView", "()Lcom/airbnb/lottie/LottieAnimationView;", "animatedIconView", "Lru/ozon/app/android/tabbar/ui/model/TabIconColor;", "getIconColor", "()Lru/ozon/app/android/tabbar/ui/model/TabIconColor;", "setIconColor", "(Lru/ozon/app/android/tabbar/ui/model/TabIconColor;)V", "iconColor", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BaseOzonBottomTabView extends ConstraintLayout {
    public /* synthetic */ BaseOzonBottomTabView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    public static /* synthetic */ void bindBadge$default(BaseOzonBottomTabView baseOzonBottomTabView, IndicatorDTO indicatorDTO, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindBadge");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        baseOzonBottomTabView.bindBadge(indicatorDTO, str);
    }

    public static /* synthetic */ void removeBadge$default(BaseOzonBottomTabView baseOzonBottomTabView, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeBadge");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        baseOzonBottomTabView.removeBadge(str);
    }

    public abstract void bindBadge(@NotNull IndicatorDTO indicator, String badgeDescription);

    public abstract void cancelAnimation();

    @NotNull
    public abstract LottieAnimationView getAnimatedIconView();

    public abstract Integer getAnimationId();

    public abstract IndicatorDTO getBadgeData();

    public abstract boolean isAnimationCompleted();

    public abstract void playAnimationIfExists();

    public abstract void removeBadge(String badgeDescription);

    public abstract void setAnimation(Integer animationId);

    public abstract void setBadgeTopOffset(int badgeVerticalOffset);

    public abstract void setChecked(@NotNull MenuItem menuItem);

    public abstract void setIcon(Drawable iconDrawable);

    public abstract void setIconColor(@NotNull TabIconColor tabIconColor);

    public abstract void setLabel(@NotNull CharSequence label);

    public abstract void setLabelColor(@NotNull ColorStateList colorStateList);

    public abstract void setLabelTextAppearance(int resId);

    public abstract void setLabelVisibility(int mode);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseOzonBottomTabView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
