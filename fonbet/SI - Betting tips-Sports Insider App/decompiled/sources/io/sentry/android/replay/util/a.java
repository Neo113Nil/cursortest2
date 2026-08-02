package io.sentry.android.replay.util;

import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final TextLayoutResult f16120a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16121b;

    static {
        int i5 = TextLayoutResult.$stable;
    }

    public a(TextLayoutResult layout, boolean z5) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f16120a = layout;
        this.f16121b = z5;
    }

    @Override // io.sentry.android.replay.util.l
    public final int g(int i5) {
        return wf.b.b(this.f16120a.getLineTop(i5));
    }

    @Override // io.sentry.android.replay.util.l
    public final float h(int i5, int i10) {
        float horizontalPosition = this.f16120a.getHorizontalPosition(i10, true);
        return (this.f16121b || n() != 1) ? horizontalPosition : horizontalPosition - this.f16120a.getLineLeft(i5);
    }

    @Override // io.sentry.android.replay.util.l
    public final int l(int i5) {
        return wf.b.b(this.f16120a.getLineBottom(i5));
    }

    @Override // io.sentry.android.replay.util.l
    public final int m(int i5) {
        return this.f16120a.getLineStart(i5);
    }

    @Override // io.sentry.android.replay.util.l
    public final int n() {
        return this.f16120a.getLineCount();
    }

    @Override // io.sentry.android.replay.util.l
    public final Integer p() {
        return null;
    }

    @Override // io.sentry.android.replay.util.l
    public final int q(int i5) {
        return this.f16120a.getLineEnd(i5, true);
    }

    @Override // io.sentry.android.replay.util.l
    public final int s(int i5) {
        return this.f16120a.isLineEllipsized(i5) ? 1 : 0;
    }
}
