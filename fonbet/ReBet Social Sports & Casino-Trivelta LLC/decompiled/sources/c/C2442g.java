package c;

import Ph.C1469p;
import Ph.InterfaceC1465n;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: c.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2442g extends Lambda implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1465n f26554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2442g(C1469p c1469p) {
        super(1);
        this.f26554d = c1469p;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        this.f26554d.resumeWith(Result.m147constructorimpl(bool));
        return Unit.INSTANCE;
    }
}
