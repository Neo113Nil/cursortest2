package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mso extends puo {
    public final /* synthetic */ int h = 1;
    public Object i;
    public final Object j;

    public mso(zro zroVar, s9n s9nVar, int i, Context context) {
        super(zroVar, "XXF2CX++qjQzFfJDmqd+84h356GlStFLqQSTRbbce/csPkd7M5mpQw1l7igXWffL", "FGCYjW2JaOcRH3mqSkgHIxbWzEwOVje6sx286yuA1xM=", s9nVar, i, 31);
        this.i = null;
        this.j = context;
    }

    @Override // defpackage.puo
    public final void a() {
        switch (this.h) {
            case 0:
                View view = (View) this.j;
                if (view == null) {
                    return;
                }
                Boolean bool = (Boolean) bwo.e.c.a(exo.m);
                boolean booleanValue = bool.booleanValue();
                Object[] objArr = (Object[]) this.e.invoke(null, view, (Activity) this.i, bool);
                s9n s9nVar = this.d;
                synchronized (s9nVar) {
                    try {
                        long longValue = ((Long) objArr[0]).longValue();
                        s9nVar.b();
                        ((cmn) s9nVar.b).Q(longValue);
                        long longValue2 = ((Long) objArr[1]).longValue();
                        s9nVar.b();
                        ((cmn) s9nVar.b).R(longValue2);
                        if (booleanValue) {
                            String str = (String) objArr[2];
                            s9nVar.b();
                            ((cmn) s9nVar.b).T(str);
                        }
                    } finally {
                    }
                }
                return;
            default:
                s9n s9nVar2 = this.d;
                s9nVar2.b();
                ((cmn) s9nVar2.b).E0(-1L);
                s9nVar2.b();
                ((cmn) s9nVar2.b).s(-1L);
                Context context = (Context) this.j;
                if (context == null) {
                    context = this.a.a;
                }
                List list = (List) this.i;
                if (list == null) {
                    list = (List) this.e.invoke(null, context);
                    this.i = list;
                }
                if (list == null || list.size() != 2) {
                    return;
                }
                synchronized (s9nVar2) {
                    long longValue3 = ((Long) ((List) this.i).get(0)).longValue();
                    s9nVar2.b();
                    ((cmn) s9nVar2.b).E0(longValue3);
                    long longValue4 = ((Long) ((List) this.i).get(1)).longValue();
                    s9nVar2.b();
                    ((cmn) s9nVar2.b).s(longValue4);
                }
                return;
        }
    }

    public mso(zro zroVar, s9n s9nVar, int i, View view, Activity activity) {
        super(zroVar, "9TfyKlP5TIIt3OrlcGubA3YBpCoy+oB4k/WnZndRDloYkwzEaKKPovjffC4zkV4k", "3uxZ+FD025vJO7qOv296UhrdOlNsopGnz6EvxCliHP4=", s9nVar, i, 62);
        this.j = view;
        this.i = activity;
    }
}
