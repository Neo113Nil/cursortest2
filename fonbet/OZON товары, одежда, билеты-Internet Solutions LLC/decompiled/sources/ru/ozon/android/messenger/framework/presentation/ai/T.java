package ru.ozon.android.messenger.framework.presentation.ai;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.core.initialization.d;
import u0.C9915y;

/* loaded from: classes10.dex */
final class T extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e.a f89347b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89348c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f89349d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d.a f89350e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9915y f89351f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function0<Integer> f89352g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f89353h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function1<Map<String, ? extends Object>, Unit> f89354i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Function1<Boolean, Unit> f89355j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T(e.a aVar, C9414c0 c9414c0, ru.ozon.android.messenger.framework.core.d dVar, d.a aVar2, C9915y c9915y, Function0 function0, Function0 function02, Function1 function1, Function1 function12, int i11) {
        super(2);
        this.f89347b = aVar;
        this.f89348c = c9414c0;
        this.f89349d = dVar;
        this.f89350e = aVar2;
        this.f89351f = c9915y;
        this.f89352g = function0;
        this.f89353h = function02;
        this.f89354i = function1;
        this.f89355j = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        ru.ozon.android.messenger.framework.core.d dVar = this.f89349d;
        C9915y c9915y = this.f89351f;
        Function0<Integer> function0 = this.f89352g;
        Function0<Unit> function02 = this.f89353h;
        U.a(this.f89347b, this.f89348c, dVar, this.f89350e, c9915y, function0, function02, this.f89354i, this.f89355j, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
