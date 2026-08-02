package defpackage;

import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x7f {
    public final Context a;
    public final mqi b;
    public final int c;
    public final mqi d;
    public final mqi e;
    public boolean f;

    public x7f(Context context, kjk kjkVar) {
        context.getClass();
        kjkVar.getClass();
        this.a = context;
        final int i = 0;
        this.b = ypa.b(new Function0(this) { // from class: w7f
            public final /* synthetic */ x7f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                x7f x7fVar = this.b;
                switch (i2) {
                    case 0:
                        return ((y7f) x7fVar.e.getValue()).a;
                    default:
                        return z9.i(x7fVar.a);
                }
            }
        });
        this.c = Process.myPid();
        this.d = ypa.b(new ate(kjkVar, 10));
        final int i2 = 1;
        this.e = ypa.b(new Function0(this) { // from class: w7f
            public final /* synthetic */ x7f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                x7f x7fVar = this.b;
                switch (i22) {
                    case 0:
                        return ((y7f) x7fVar.e.getValue()).a;
                    default:
                        return z9.i(x7fVar.a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.b.getValue();
    }

    public final Map b(Map map) {
        mqi mqiVar = this.d;
        if (map == null) {
            return sub.d(new Pair(a(), new v7f(Process.myPid(), (String) mqiVar.getValue())));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(a(), new v7f(Process.myPid(), (String) mqiVar.getValue()));
        return tub.p(linkedHashMap);
    }
}
