package com.adsbynimbus.google;

import defpackage.fsf;
import defpackage.of;
import defpackage.xka;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes.dex */
public final class DynamicPriceRenderer$render$2$2 extends xka implements Function1<Throwable, Unit> {
    public final /* synthetic */ fsf i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicPriceRenderer$render$2$2(fsf fsfVar) {
        super(1);
        this.i = fsfVar;
    }

    public final void invoke(Throwable th) {
        of ofVar = (of) this.i.a;
        if (ofVar != null) {
            ofVar.a();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.a;
    }
}
