package ru.ozon.android.messenger.utils.view;

import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class r implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private long f92025a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f92026b;

    /* JADX WARN: Multi-variable type inference failed */
    r(Function1 function1) {
        this.f92026b = (AbstractC7737t) function1;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View v11) {
        Intrinsics.checkNotNullParameter(v11, "v");
        if (SystemClock.elapsedRealtime() - this.f92025a < 600) {
            return;
        }
        this.f92025a = SystemClock.elapsedRealtime();
        this.f92026b.invoke(v11);
    }
}
