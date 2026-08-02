package ru.ozon.android.messenger.blocks.chatlistheader.search;

import Bl0.C2652m;
import Q1.K;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
final class r extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f84838b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f84839c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ IconDTO f84840d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ TextDTO f84841e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f84842f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Integer f84843g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Integer f84844h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function1<K, Unit> f84845i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f84846j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f84847k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ ButtonV3DTO f84848l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ int f84849m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(androidx.compose.ui.e eVar, boolean z11, IconDTO iconDTO, TextDTO textDTO, String str, Integer num, Integer num2, Function1 function1, Function0 function0, Function0 function02, ButtonV3DTO buttonV3DTO, int i11) {
        super(2);
        this.f84838b = eVar;
        this.f84839c = z11;
        this.f84840d = iconDTO;
        this.f84841e = textDTO;
        this.f84842f = str;
        this.f84843g = num;
        this.f84844h = num2;
        this.f84845i = function1;
        this.f84846j = function0;
        this.f84847k = function02;
        this.f84848l = buttonV3DTO;
        this.f84849m = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f84849m | 1);
        Function1<K, Unit> function1 = this.f84845i;
        Function0<Unit> function0 = this.f84846j;
        x.a(this.f84838b, this.f84839c, this.f84840d, this.f84841e, this.f84842f, this.f84843g, this.f84844h, function1, function0, this.f84847k, this.f84848l, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
