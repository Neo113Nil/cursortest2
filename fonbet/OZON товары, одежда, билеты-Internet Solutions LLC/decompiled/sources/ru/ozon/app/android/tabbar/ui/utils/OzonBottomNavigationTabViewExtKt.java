package ru.ozon.app.android.tabbar.ui.utils;

import android.animation.Animator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView;

@Metadata(d1 = {"\u0000(\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000e\u001a\u00020\f*\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "", "", "deeplinks", "defaultMenuId", "getMenuId", "(Ljava/util/Map;I)I", "Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;", "", "hasAnimation", "(Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;)Z", "Lkotlin/Function0;", "", "callback", "whenAnimationCompleted", "(Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;Lkotlin/jvm/functions/Function0;)V", "tabbar_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OzonBottomNavigationTabViewExtKt {
    public static final int getMenuId(@NotNull Map<Integer, String> deeplinks, int i11) {
        Integer num;
        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
        return (deeplinks.containsKey(Integer.valueOf(i11)) || (num = (Integer) C7714v.L(deeplinks.keySet())) == null) ? i11 : num.intValue();
    }

    public static final boolean hasAnimation(@NotNull BaseOzonBottomTabView baseOzonBottomTabView) {
        Intrinsics.checkNotNullParameter(baseOzonBottomTabView, "<this>");
        return baseOzonBottomTabView.getAnimationId() != null;
    }

    public static final void whenAnimationCompleted(@NotNull final BaseOzonBottomTabView baseOzonBottomTabView, @NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(baseOzonBottomTabView, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (baseOzonBottomTabView.getAnimationId() == null) {
            throw new IllegalArgumentException("Tab animation is null. Use `hasAnimation` before");
        }
        if (baseOzonBottomTabView.getIsAnimationCompleted()) {
            callback.invoke();
        } else {
            if (baseOzonBottomTabView.getAnimationId() == null) {
                return;
            }
            baseOzonBottomTabView.getAnimatedIconView().addAnimatorListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.tabbar.ui.utils.OzonBottomNavigationTabViewExtKt$whenAnimationCompleted$2
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    callback.invoke();
                    baseOzonBottomTabView.getAnimatedIconView().removeAnimatorListener(this);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    callback.invoke();
                    baseOzonBottomTabView.getAnimatedIconView().removeAnimatorListener(this);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }
            });
        }
    }
}
