package jk0;

import android.graphics.Rect;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: f, reason: collision with root package name */
    private Integer f70175f;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Rect f70170a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Rect f70171b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Rect f70172c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Rect f70173d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Rect f70174e = new Rect();

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Rect f70176g = new Rect();

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Rect f70177h = new Rect();

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f70178i = new LinkedHashSet();

    public final void a(int i11) {
        this.f70178i.add(Integer.valueOf(i11));
    }

    @NotNull
    public final Rect b() {
        return this.f70170a;
    }

    public final Integer c() {
        return this.f70175f;
    }

    @NotNull
    public final Rect d() {
        return this.f70173d;
    }

    @NotNull
    public final Rect e() {
        return this.f70177h;
    }

    @NotNull
    public final Rect f() {
        return this.f70174e;
    }

    @NotNull
    public final Rect g() {
        return this.f70171b;
    }

    @NotNull
    public final Rect h() {
        return this.f70176g;
    }

    @NotNull
    public final Rect i() {
        return this.f70172c;
    }

    public final void j() {
        int intValue;
        int intValue2;
        boolean isEmpty = this.f70178i.isEmpty();
        Rect rect = this.f70177h;
        if (!isEmpty) {
            rect.setEmpty();
            return;
        }
        Rect rect2 = this.f70172c;
        Integer valueOf = Integer.valueOf(rect2.bottom);
        if (rect2.isEmpty()) {
            valueOf = null;
        }
        Rect rect3 = this.f70176g;
        Rect rect4 = this.f70174e;
        if (valueOf != null) {
            intValue = valueOf.intValue();
        } else {
            Rect rect5 = this.f70170a;
            Integer valueOf2 = Integer.valueOf(rect5.bottom);
            if (rect5.isEmpty()) {
                valueOf2 = null;
            }
            intValue = valueOf2 != null ? valueOf2.intValue() : rect4.top + rect3.top;
        }
        Rect rect6 = this.f70173d;
        Integer valueOf3 = Integer.valueOf(rect6.top);
        if (rect6.isEmpty()) {
            valueOf3 = null;
        }
        if (valueOf3 != null) {
            intValue2 = valueOf3.intValue();
        } else {
            Integer num = this.f70175f;
            Integer valueOf4 = num != null ? Integer.valueOf(num.intValue() - rect3.bottom) : null;
            intValue2 = valueOf4 != null ? valueOf4.intValue() : rect4.bottom - rect3.bottom;
        }
        rect.set(rect4.left, intValue, rect4.right, intValue2);
    }

    public final void k(int i11) {
        this.f70178i.remove(Integer.valueOf(i11));
    }

    public final void l(@NotNull l info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f70170a.set(info.f70170a);
        this.f70171b.set(info.f70171b);
        this.f70172c.set(info.f70172c);
        this.f70173d.set(info.f70173d);
        this.f70174e.set(info.f70174e);
        this.f70175f = info.f70175f;
        this.f70176g.set(info.f70176g);
        this.f70177h.set(info.f70177h);
        this.f70178i.addAll(info.f70178i);
    }

    public final void m(Integer num) {
        this.f70175f = num;
    }
}
