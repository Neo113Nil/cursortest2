package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import defpackage.hoi;
import defpackage.k13;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Lm extends hoi implements Function2 {
    public final /* synthetic */ Nm a;
    public final /* synthetic */ S3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lm(Nm nm, S3 s3, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = nm;
        this.b = s3;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Lm(this.a, this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Lm(this.a, this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        C3906y9 c3906y9 = this.a.e;
        if (c3906y9 != null) {
            c3906y9.a("VideoExperienceManager", "Companion Ad Rendered");
        }
        ViewGroup viewGroup = this.a.j;
        ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        Nm nm = this.a;
        nm.j = null;
        InterfaceC3727rc interfaceC3727rc = nm.h;
        if (interfaceC3727rc == null) {
            Intrinsics.i("mediaPlayer");
            throw null;
        }
        ((C3445ge) interfaceC3727rc).a();
        if (frameLayout == null) {
            return null;
        }
        S3 s3 = this.b;
        s3.getClass();
        if (!Intrinsics.c(s3.i, T3.a)) {
            X3 x3 = s3.i;
            throw new Q3(!Intrinsics.c(x3, U3.a) ? !Intrinsics.c(x3, W3.a) ? Intrinsics.c(x3, V3.a) ? "Companion ad failed to load" : "Companion ad view is not available" : "Companion ad is still loading" : "Companion ad has not started loading");
        }
        C3906y9 c3906y92 = s3.c;
        if (c3906y92 != null) {
            c3906y92.a("CompanionAdManager", "renderCompanionView");
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(s3.f, layoutParams);
        s3.b();
        Ll ll = s3.g;
        if (ll != null) {
            ArrayList w0 = CollectionsKt.w0(ll.c, ll.b);
            ArrayList arrayList = new ArrayList();
            Iterator it = w0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (Intrinsics.c(((Je) next).b, "creativeView")) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Je) it2.next()).a);
            }
            Map a = Hk.a(s3.b.a);
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b("CompanionAdRendered", a, EnumC3943zk.SDK);
            X4.a(s3.d, s3.a, new C3383e4(arrayList2));
        }
        return Unit.a;
    }
}
