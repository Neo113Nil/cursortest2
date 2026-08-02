package com.socure.idplus.device.internal.viewModel.location;

import android.location.Location;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f902a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function1 function1) {
        super(1);
        this.f902a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f902a.invoke((Location) obj);
        return Unit.INSTANCE;
    }
}
