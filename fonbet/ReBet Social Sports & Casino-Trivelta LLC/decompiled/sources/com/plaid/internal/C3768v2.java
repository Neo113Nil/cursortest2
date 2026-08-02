package com.plaid.internal;

import android.widget.ProgressBar;
import com.plaid.link.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.plaid.internal.v2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3768v2 extends Lambda implements Function0<ProgressBar> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3795y2 f41133a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3768v2(C3795y2 c3795y2) {
        super(0);
        this.f41133a = c3795y2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ProgressBar invoke() {
        return (ProgressBar) this.f41133a.findViewById(R.id.progress_bar);
    }
}
