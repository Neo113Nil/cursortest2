package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class aaa implements l1c {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ Function1 d;

    public aaa(int i, int i2, Map map, Function1 function1) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = function1;
    }

    @Override // defpackage.l1c
    public final Map a() {
        return this.c;
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

    @Override // defpackage.l1c
    public final void b() {
    }
}
