package Fj;

import android.text.format.DateUtils;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Fj.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1162h {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f3750a = new StringBuilder();

    public final String a(long j10) {
        String formatElapsedTime = DateUtils.formatElapsedTime(this.f3750a, j10);
        Intrinsics.checkNotNullExpressionValue(formatElapsedTime, "formatElapsedTime(...)");
        return formatElapsedTime;
    }
}
