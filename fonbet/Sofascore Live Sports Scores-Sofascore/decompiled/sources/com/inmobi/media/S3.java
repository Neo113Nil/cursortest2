package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.squareup.picasso.Picasso;
import defpackage.b1d;
import defpackage.beh;
import defpackage.cne;
import defpackage.k13;
import defpackage.ku3;
import defpackage.xw3;
import defpackage.yda;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class S3 {
    public final ku3 a;
    public final C3358d4 b;
    public final C3906y9 c;
    public final b1d d;
    public yda e;
    public View f;
    public Ll g;
    public Mj h;
    public X3 i;
    public final C3332c4 j;

    public S3(Context context, ku3 ku3Var, C3358d4 c3358d4, C3906y9 c3906y9) {
        context.getClass();
        ku3Var.getClass();
        c3358d4.getClass();
        this.a = ku3Var;
        this.b = c3358d4;
        this.c = c3906y9;
        this.d = beh.b(0, 0, null, 7);
        this.i = U3.a;
        this.j = new C3332c4(context, c3906y9);
    }

    public static final void a(S3 s3, View view) {
        Ll ll = s3.g;
        if (ll != null) {
            ArrayList w0 = CollectionsKt.w0(ll.c, ll.b);
            ArrayList arrayList = new ArrayList();
            Iterator it = w0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (Intrinsics.c(((Je) next).b, "click")) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Je) it2.next()).a);
            }
            X4.a(s3.d, s3.a, new Y3(arrayList2));
        }
    }

    public final void b() {
        View view = this.f;
        if (view != null) {
            view.setOnClickListener(new cne(this, 14));
        }
    }

    public final void a(ArrayList arrayList) {
        arrayList.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        if (!Intrinsics.c(this.i, U3.a)) {
            Objects.toString(this.i);
            return;
        }
        Map a = Hk.a(this.b.a);
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b("CompanionAdAvailable", a, EnumC3943zk.SDK);
        this.e = xw3.L(this.a, null, null, new R3(this, arrayList, null), 3);
    }

    public final void a() {
        ViewParent parent;
        C3906y9 c3906y9 = this.c;
        if (c3906y9 != null) {
            c3906y9.a("CompanionAdManager", "destroy");
        }
        Mj mj = this.h;
        if (mj != null) {
            Picasso picasso = C3447gg.a;
            C3447gg.b(mj.a).cancelTag(mj.c);
        }
        P6.a(this.e);
        View view = this.f;
        if (view != null && (parent = view.getParent()) != null) {
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f);
            }
        }
        this.e = null;
        this.h = null;
        this.f = null;
        this.i = U3.a;
    }
}
