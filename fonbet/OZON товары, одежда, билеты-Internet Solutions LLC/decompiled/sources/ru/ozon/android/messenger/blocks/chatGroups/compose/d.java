package ru.ozon.android.messenger.blocks.chatGroups.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e.a f84677b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ArrayList f84678c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f84679d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<ru.ozon.android.messenger.blocks.chatGroups.a, Unit> f84680e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e.a aVar, ArrayList arrayList, boolean z11, Function1 function1, int i11) {
        super(2);
        this.f84677b = aVar;
        this.f84678c = arrayList;
        this.f84679d = z11;
        this.f84680e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(7);
        e.a(this.f84677b, this.f84678c, this.f84679d, this.f84680e, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
