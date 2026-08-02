package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class skb implements l1c {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ tkb f;

    public skb(int i, int i2, Map map, Function1 function1, Function1 function12, tkb tkbVar) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = function1;
        this.e = function12;
        this.f = tkbVar;
    }

    @Override // defpackage.l1c
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.l1c
    public final void b() {
        this.e.invoke(this.f.l);
    }

    @Override // defpackage.l1c
    public final Function1 c() {
        return this.d;
    }

    @Override // defpackage.l1c
    public final int getHeight() {
        return this.b;
    }

    @Override // defpackage.l1c
    public final int getWidth() {
        return this.a;
    }
}
