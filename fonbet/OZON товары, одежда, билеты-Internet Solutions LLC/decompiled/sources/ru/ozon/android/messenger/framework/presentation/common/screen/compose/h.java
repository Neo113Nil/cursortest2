package ru.ozon.android.messenger.framework.presentation.common.screen.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List<ButtonV3DTO> f91076b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.a f91077c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f91078d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f91079e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<Map<String, TokenizedTrackingInfo>, Unit> f91080f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function1<AtomAction, Unit> f91081g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f91082h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f91083i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(List list, e.a aVar, float f7, float f11, Function1 function1, Function1 function12, int i11, int i12) {
        super(2);
        this.f91076b = list;
        this.f91077c = aVar;
        this.f91078d = f7;
        this.f91079e = f11;
        this.f91080f = function1;
        this.f91081g = function12;
        this.f91082h = i11;
        this.f91083i = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f91082h | 1);
        Function1<Map<String, TokenizedTrackingInfo>, Unit> function1 = this.f91080f;
        float f7 = this.f91079e;
        i.a(this.f91076b, this.f91077c, this.f91078d, f7, function1, this.f91081g, interfaceC3967k, e11, this.f91083i);
        return Unit.f71690a;
    }
}
