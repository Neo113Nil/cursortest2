package ru.ozon.uni.android.flashbar.animation;

import Sc.o;
import Xc.a;
import Xc.b;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\rJ\r\u0010\u000e\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u000fJ\r\u0010\u0010\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/android/flashbar/animation/FlashbarAnimationBuilder;", "", "<init>", "()V", "type", "Lru/ozon/uni/android/flashbar/animation/FlashbarAnimationBuilder$Type;", "interpolator", "Landroid/view/animation/Interpolator;", "view", "Landroid/view/View;", "duration", "", "withView", "withView$uni_release", "enter", "enter$uni_release", "exit", "exit$uni_release", "build", "Lru/ozon/uni/android/flashbar/animation/FlashbarAnimator;", "build$uni_release", "Type", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashbarAnimationBuilder {
    private long duration = 250;
    private Interpolator interpolator;
    private Type type;
    private View view;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/android/flashbar/animation/FlashbarAnimationBuilder$Type;", "", "<init>", "(Ljava/lang/String;I)V", "ENTER", "EXIT", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ENTER = new Type("ENTER", 0);
        public static final Type EXIT = new Type("EXIT", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{ENTER, EXIT};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i11) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.ENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.EXIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public final FlashbarAnimator build$uni_release() {
        if (this.view == null) {
            throw new IllegalArgumentException("Target view can not be null");
        }
        AnimatorSet animatorSet = new AnimatorSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setPropertyName("translationY");
        Type type = this.type;
        Intrinsics.f(type);
        int i11 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1) {
            Intrinsics.f(this.view);
            objectAnimator.setFloatValues(-r6.getHeight(), 0.0f);
        } else {
            if (i11 != 2) {
                throw new o();
            }
            Intrinsics.f(this.view);
            objectAnimator.setFloatValues(0.0f, -r6.getHeight());
        }
        objectAnimator.setTarget(this.view);
        linkedHashSet.add(objectAnimator);
        animatorSet.playTogether(linkedHashSet);
        animatorSet.setDuration(this.duration);
        animatorSet.setInterpolator(this.interpolator);
        return new FlashbarAnimator(animatorSet);
    }

    @NotNull
    public final FlashbarAnimationBuilder enter$uni_release() {
        this.type = Type.ENTER;
        this.interpolator = new DecelerateInterpolator();
        return this;
    }

    @NotNull
    public final FlashbarAnimationBuilder exit$uni_release() {
        this.type = Type.EXIT;
        this.interpolator = new AccelerateInterpolator();
        return this;
    }

    @NotNull
    public final FlashbarAnimationBuilder withView$uni_release(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        return this;
    }
}
