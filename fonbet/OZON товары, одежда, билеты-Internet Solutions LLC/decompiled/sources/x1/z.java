package x1;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f104930a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final MotionEvent f104931b;

    public z(@NotNull ArrayList arrayList, @NotNull MotionEvent motionEvent) {
        this.f104930a = arrayList;
        this.f104931b = motionEvent;
    }

    @NotNull
    public final MotionEvent a() {
        return this.f104931b;
    }

    @NotNull
    public final List<C10625A> b() {
        return this.f104930a;
    }
}
