package ru.ozon.composer.ui.view.issue;

import android.text.Spanned;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements Function1<String, Spanned> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f94860b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(String str) {
        super(1);
        this.f94860b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Spanned invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        Spanned a11 = androidx.core.text.b.a(this.f94860b, 63);
        Intrinsics.checkNotNullExpressionValue(a11, "fromHtml(...)");
        return a11;
    }
}
