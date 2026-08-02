package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.y6a;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.yo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3921yo extends S0 {
    public final Ze b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3921yo(Ze ze, C3906y9 c3906y9) {
        super(c3906y9);
        ze.getClass();
        this.b = ze;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.inmobi.media.S0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        C3895xo c3895xo;
        int i;
        if (rq3Var instanceof C3895xo) {
            c3895xo = (C3895xo) rq3Var;
            int i2 = c3895xo.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3895xo.c = i2 - Integer.MIN_VALUE;
                Object obj = c3895xo.a;
                lu3 lu3Var = lu3.a;
                i = c3895xo.c;
                if (i != 0) {
                    y6a.M(obj);
                    C3741s0 c3741s0 = C3741s0.a;
                    Ze ze = this.b;
                    c3895xo.c = 1;
                    obj = c3741s0.a(ze, c3895xo);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                InterfaceC3317bf interfaceC3317bf = (InterfaceC3317bf) obj;
                IntRange intRange = AbstractC3446gf.a;
                interfaceC3317bf.getClass();
                return interfaceC3317bf.d().r(Charsets.UTF_8);
            }
        }
        c3895xo = new C3895xo(this, (sq3) rq3Var);
        Object obj2 = c3895xo.a;
        lu3 lu3Var2 = lu3.a;
        i = c3895xo.c;
        if (i != 0) {
        }
        InterfaceC3317bf interfaceC3317bf2 = (InterfaceC3317bf) obj2;
        IntRange intRange2 = AbstractC3446gf.a;
        interfaceC3317bf2.getClass();
        return interfaceC3317bf2.d().r(Charsets.UTF_8);
    }

    @Override // com.inmobi.media.S0
    public final Unit a(AdResponse adResponse, Function1 function1) {
        Objects.toString(adResponse);
        W0.a(adResponse, this.a, function1);
        return Unit.a;
    }
}
