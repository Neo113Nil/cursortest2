package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.n0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9436n0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89643b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f89644c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f89645d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f89646e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9436n0(C9414c0 c9414c0, int i11, String str, ru.ozon.android.messenger.framework.navigation.action.a aVar) {
        super(0);
        this.f89643b = c9414c0;
        this.f89644c = i11;
        this.f89645d = str;
        this.f89646e = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C10727i.c(androidx.lifecycle.x0.a(this.f89643b), null, null, new C9434m0(this.f89643b, this.f89644c, this.f89645d, this.f89646e, null), 3);
        return Unit.f71690a;
    }
}
