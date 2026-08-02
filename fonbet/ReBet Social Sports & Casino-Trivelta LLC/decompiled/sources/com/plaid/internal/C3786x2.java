package com.plaid.internal;

import android.view.View;
import com.plaid.link.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.plaid.internal.x2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3786x2 extends Lambda implements Function0<View> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3795y2 f41184a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3786x2(C3795y2 c3795y2) {
        super(0);
        this.f41184a = c3795y2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        return this.f41184a.findViewById(R.id.retry_container);
    }
}
