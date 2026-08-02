package jk0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l f70184a = new l();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Rect f70185b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final int[] f70186c = new int[2];

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final int[] f70187d = new int[2];

    public final float a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView == null) {
            return -1.0f;
        }
        Integer valueOf = Integer.valueOf(recyclerView.getMeasuredHeight());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            int[] iArr = this.f70186c;
            view.getLocationOnScreen(iArr);
            int[] iArr2 = this.f70187d;
            recyclerView.getLocationOnScreen(iArr2);
            int measuredHeight = iArr[1] + view.getMeasuredHeight();
            int i11 = iArr2[1];
            Float valueOf2 = Float.valueOf(measuredHeight >= i11 ? -1.0f : (i11 - measuredHeight) / intValue);
            if (valueOf2.floatValue() <= 0.0f) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                return valueOf2.floatValue();
            }
            int i12 = iArr2[1] + intValue;
            int i13 = iArr[1];
            Float valueOf3 = Float.valueOf(i13 <= i12 ? -1.0f : (i13 - i12) / intValue);
            Float f7 = valueOf3.floatValue() > 0.0f ? valueOf3 : null;
            if (f7 != null) {
                return f7.floatValue();
            }
        }
        return -1.0f;
    }

    public final void b(@NotNull l info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f70184a.l(info);
    }

    public final void c(@NotNull View view, @NotNull q info) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(info, "info");
        Rect rect = this.f70185b;
        info.d(view.getGlobalVisibleRect(rect));
        if (!info.c()) {
            rect.setEmpty();
        }
        info.b().set(rect);
        info.a().l(this.f70184a);
    }
}
