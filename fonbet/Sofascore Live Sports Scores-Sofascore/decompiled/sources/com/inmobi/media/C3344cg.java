package com.inmobi.media;

import android.content.Context;
import com.squareup.picasso.Picasso;
import defpackage.a70;
import defpackage.h2d;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.cg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3344cg extends hoi implements Function2 {
    public h2d a;
    public Context b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3344cg(Context context, rq3 rq3Var) {
        super(2, rq3Var);
        this.e = context;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        C3344cg c3344cg = new C3344cg(this.e, rq3Var);
        c3344cg.d = obj;
        return c3344cg;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3344cg c3344cg = new C3344cg(this.e, (rq3) obj2);
        c3344cg.d = (ku3) obj;
        return c3344cg.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        h2d h2dVar;
        Context context;
        WeakReference weakReference;
        lu3 lu3Var = lu3.a;
        int i = this.c;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var = (ku3) this.d;
            h2dVar = C3447gg.b;
            Context context2 = this.e;
            this.d = ku3Var;
            this.a = h2dVar;
            this.b = context2;
            this.c = 1;
            if (h2dVar.e(this) == lu3Var) {
                return lu3Var;
            }
            context = context2;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = this.b;
            h2dVar = this.a;
            y6a.M(obj);
        }
        try {
            int size = C3447gg.c.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    weakReference = null;
                    break;
                }
                ArrayList arrayList = C3447gg.c;
                if (Intrinsics.c((Context) ((WeakReference) arrayList.get(i2)).get(), context)) {
                    weakReference = (WeakReference) arrayList.get(i2);
                    break;
                }
                i2++;
            }
            if (weakReference == null) {
                C3447gg.c.add(new WeakReference(context));
            }
            Picasso picasso = C3447gg.a;
            if (picasso == null) {
                AbstractC3424fj.a(context, C3447gg.d);
                picasso = C3447gg.a(context);
                C3447gg.a = picasso;
            }
            h2dVar.f(null);
            return picasso;
        } catch (Throwable th) {
            h2dVar.f(null);
            throw th;
        }
    }
}
