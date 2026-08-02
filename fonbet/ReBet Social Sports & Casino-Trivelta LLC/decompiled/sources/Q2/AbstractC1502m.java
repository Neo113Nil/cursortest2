package Q2;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Q2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1502m {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9289a;

    static {
        String i10 = AbstractC1508t.i("InputMerger");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"InputMerger\")");
        f9289a = i10;
    }

    public static final AbstractC1500k a(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            Object newInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
            Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (AbstractC1500k) newInstance;
        } catch (Exception e10) {
            AbstractC1508t.e().d(f9289a, "Trouble instantiating " + className, e10);
            return null;
        }
    }
}
