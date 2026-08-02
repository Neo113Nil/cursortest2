package p10;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: p10.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8833c {

    /* renamed from: a, reason: collision with root package name */
    private boolean f80018a;

    /* renamed from: b, reason: collision with root package name */
    private int f80019b;

    /* renamed from: c, reason: collision with root package name */
    private int f80020c;

    /* renamed from: d, reason: collision with root package name */
    private int f80021d;

    /* renamed from: e, reason: collision with root package name */
    private int f80022e;

    /* renamed from: f, reason: collision with root package name */
    private SwipeRefreshLayout f80023f;

    private final void a() {
        SwipeRefreshLayout swipeRefreshLayout = this.f80023f;
        if (swipeRefreshLayout == null) {
            return;
        }
        if (!this.f80018a) {
            this.f80019b = swipeRefreshLayout.getProgressViewStartOffset();
            this.f80020c = swipeRefreshLayout.getProgressViewEndOffset();
            this.f80018a = true;
        }
        int i11 = this.f80021d + this.f80022e;
        int i12 = this.f80019b;
        swipeRefreshLayout.setProgressViewOffset(false, i11 + i12, (i11 + this.f80020c) - Math.abs(i12));
    }

    public final void b(int i11) {
        if (this.f80021d == i11) {
            return;
        }
        this.f80021d = i11;
        a();
    }

    public final void c(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof SwipeRefreshLayout) {
            this.f80023f = (SwipeRefreshLayout) view;
        }
    }

    public final void d(int i11) {
        if (this.f80022e == i11) {
            return;
        }
        this.f80022e = i11;
        a();
    }
}
