package gk0;

import android.app.Activity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
final class g extends AbstractC7737t implements Function1<s, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f64530b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(Activity activity) {
        super(1);
        this.f64530b = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(s sVar) {
        s poolItem = sVar;
        Intrinsics.checkNotNullParameter(poolItem, "poolItem");
        return Boolean.valueOf(Intrinsics.d(poolItem.b().getContext(), this.f64530b));
    }
}
