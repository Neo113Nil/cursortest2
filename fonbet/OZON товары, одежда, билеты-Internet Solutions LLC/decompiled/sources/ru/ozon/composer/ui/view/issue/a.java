package ru.ozon.composer.ui.view.issue;

import android.text.Spanned;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class a extends AbstractC7737t implements Function1<String, Spanned> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f94859b = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Spanned invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        Spanned a11 = androidx.core.text.b.a(it, 63);
        Intrinsics.checkNotNullExpressionValue(a11, "fromHtml(...)");
        return a11;
    }
}
