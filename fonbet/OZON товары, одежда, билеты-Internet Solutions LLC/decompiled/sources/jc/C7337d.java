package jc;

import Ve.E;
import Zb.C4899b;
import android.text.TextPaint;
import androidx.annotation.NonNull;

/* renamed from: jc.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7337d extends C4899b {
    protected C7337d(@NonNull C4899b.a aVar) {
        super(aVar);
    }

    public final int a(@NonNull TextPaint textPaint) {
        int i11 = this.f35797a;
        return i11 == 0 ? E.h(textPaint.getColor(), 75) : i11;
    }

    public final int b(@NonNull TextPaint textPaint) {
        int i11 = this.f35798b;
        return i11 < 0 ? (int) (textPaint.getStrokeWidth() + 0.5f) : i11;
    }

    public final int c() {
        return this.f35800d;
    }

    public final int d() {
        return this.f35801e;
    }

    public final int e(@NonNull TextPaint textPaint) {
        int i11 = this.f35799c;
        return i11 == 0 ? E.h(textPaint.getColor(), 22) : i11;
    }
}
