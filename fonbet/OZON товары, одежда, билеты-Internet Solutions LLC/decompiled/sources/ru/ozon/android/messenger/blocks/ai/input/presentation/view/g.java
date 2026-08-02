package ru.ozon.android.messenger.blocks.ai.input.presentation.view;

import Bl0.C2652m;
import Q1.K;
import S0.InterfaceC3967k;
import j1.r;
import j1.v;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.ai.input.data.Settings;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f84235b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TextDTO f84236c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f84237d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f84238e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Settings f84239f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f84240g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ IconButtonV3DTO f84241h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ r f84242i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Function1<K, Unit> f84243j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Function1<v, Unit> f84244k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ Function2<Map<String, MessengerTrackingInfo>, ru.ozon.android.messenger.framework.navigation.action.a, Unit> f84245l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ int f84246m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(K k11, TextDTO textDTO, String str, String str2, Settings settings, boolean z11, IconButtonV3DTO iconButtonV3DTO, r rVar, Function1 function1, Function1 function12, Function2 function2, int i11) {
        super(2);
        this.f84235b = k11;
        this.f84236c = textDTO;
        this.f84237d = str;
        this.f84238e = str2;
        this.f84239f = settings;
        this.f84240g = z11;
        this.f84241h = iconButtonV3DTO;
        this.f84242i = rVar;
        this.f84243j = function1;
        this.f84244k = function12;
        this.f84245l = function2;
        this.f84246m = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f84246m | 1);
        r rVar = this.f84242i;
        Function1<K, Unit> function1 = this.f84243j;
        h.a(this.f84235b, this.f84236c, this.f84237d, this.f84238e, this.f84239f, this.f84240g, this.f84241h, rVar, function1, this.f84244k, this.f84245l, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
