package ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation;

import Sc.o;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private EnumC1701a f91160a;

    /* renamed from: b, reason: collision with root package name */
    private BaseInterpolator f91161b;

    /* renamed from: c, reason: collision with root package name */
    private View f91162c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation.a$a, reason: collision with other inner class name */
    public static final class EnumC1701a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC1701a[] $VALUES;
        public static final EnumC1701a ENTER;
        public static final EnumC1701a EXIT;

        static {
            EnumC1701a enumC1701a = new EnumC1701a("ENTER", 0);
            ENTER = enumC1701a;
            EnumC1701a enumC1701a2 = new EnumC1701a("EXIT", 1);
            EXIT = enumC1701a2;
            EnumC1701a[] enumC1701aArr = {enumC1701a, enumC1701a2};
            $VALUES = enumC1701aArr;
            $ENTRIES = Xc.b.a(enumC1701aArr);
        }

        private EnumC1701a() {
            throw null;
        }

        public static EnumC1701a valueOf(String str) {
            return (EnumC1701a) Enum.valueOf(EnumC1701a.class, str);
        }

        public static EnumC1701a[] values() {
            return (EnumC1701a[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91163a;

        static {
            int[] iArr = new int[EnumC1701a.values().length];
            try {
                iArr[EnumC1701a.ENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1701a.EXIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f91163a = iArr;
        }
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation.b a() {
        if (this.f91162c == null) {
            throw new IllegalArgumentException("Target view can not be null");
        }
        AnimatorSet animatorSet = new AnimatorSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setPropertyName("translationY");
        EnumC1701a enumC1701a = this.f91160a;
        Intrinsics.f(enumC1701a);
        int i11 = b.f91163a[enumC1701a.ordinal()];
        if (i11 == 1) {
            Intrinsics.f(this.f91162c);
            objectAnimator.setFloatValues(-r6.getHeight(), 0.0f);
        } else {
            if (i11 != 2) {
                throw new o();
            }
            Intrinsics.f(this.f91162c);
            objectAnimator.setFloatValues(0.0f, -r6.getHeight());
        }
        objectAnimator.setTarget(this.f91162c);
        linkedHashSet.add(objectAnimator);
        animatorSet.playTogether(linkedHashSet);
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(this.f91161b);
        return new ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation.b(animatorSet);
    }

    @NotNull
    public final void b() {
        this.f91160a = EnumC1701a.ENTER;
        this.f91161b = new DecelerateInterpolator();
    }

    @NotNull
    public final void c() {
        this.f91160a = EnumC1701a.EXIT;
        this.f91161b = new AccelerateInterpolator();
    }

    @NotNull
    public final void d(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f91162c = view;
    }
}
