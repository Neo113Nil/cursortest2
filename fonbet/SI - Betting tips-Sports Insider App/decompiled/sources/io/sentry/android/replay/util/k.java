package io.sentry.android.replay.util;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Color f16135a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16136b;

    public k(Color color, boolean z5) {
        this.f16135a = color;
        this.f16136b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f16135a, kVar.f16135a) && this.f16136b == kVar.f16136b;
    }

    public final int hashCode() {
        Color color = this.f16135a;
        return ((color == null ? 0 : Color.hashCode-impl(color.unbox-impl())) * 31) + (this.f16136b ? 1231 : 1237);
    }

    public final String toString() {
        return "TextAttributes(color=" + this.f16135a + ", hasFillModifier=" + this.f16136b + ')';
    }
}
