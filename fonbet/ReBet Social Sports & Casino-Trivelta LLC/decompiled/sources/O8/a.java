package O8;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.List;
import java.util.Random;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8358a = CollectionsKt.listOf((Object[]) new Integer[]{-1685834, -6736897, -16718132, -16724737});

    public static final int a() {
        return ((Number) f8358a.get(new Random().nextInt(r0.size() - 1))).intValue();
    }

    public static final int b(int i10) {
        List list = f8358a;
        return ((Number) list.get(i10 % list.size())).intValue();
    }

    public static final Drawable c(int i10) {
        return new ColorDrawable(b(i10));
    }
}
