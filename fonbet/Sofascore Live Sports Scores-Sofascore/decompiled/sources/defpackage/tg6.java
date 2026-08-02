package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tg6 {
    public final WeakReference a;
    public final IntConsumer b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tg6(cwo cwoVar, Context context) {
        this.c = cwoVar;
        this.a = new WeakReference(context);
        IntConsumer intConsumer = new IntConsumer() { // from class: xvo
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i) {
                cwo cwoVar2 = (cwo) tg6.this.c;
                if (cwoVar2.T) {
                    return;
                }
                cwoVar2.p(1, 19, Integer.valueOf(i));
            }
        };
        this.b = intConsumer;
        context.registerDeviceIdChangeListener(new pan(cwoVar.t.a(cwoVar.r, null), 1), intConsumer);
    }

    public void a() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener((rg6) this.b);
    }

    public /* synthetic */ void b() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener((xvo) this.b);
    }

    public tg6(vg6 vg6Var, Context context) {
        this.c = vg6Var;
        this.a = new WeakReference(context);
        IntConsumer intConsumer = new IntConsumer() { // from class: rg6
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                vg6 vg6Var2 = (vg6) tg6.this.c;
                if (vg6Var2.i0) {
                    return;
                }
                vg6Var2.Z(1, 19, Integer.valueOf(i));
            }
        };
        this.b = intConsumer;
        context.registerDeviceIdChangeListener(new sg6(vg6Var.v.a(vg6Var.t, null), 0), intConsumer);
    }
}
