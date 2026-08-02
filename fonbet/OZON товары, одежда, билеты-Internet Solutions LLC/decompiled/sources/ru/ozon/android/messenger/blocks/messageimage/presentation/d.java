package ru.ozon.android.messenger.blocks.messageimage.presentation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function1<Exception, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f85768b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f85769c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(a aVar, String str) {
        super(1);
        this.f85768b = aVar;
        this.f85769c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Exception exc) {
        this.f85768b.C(this.f85769c);
        return Unit.f71690a;
    }
}
