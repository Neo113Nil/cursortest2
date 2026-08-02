package com.inmobi.media;

import android.webkit.WebView;
import defpackage.a70;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.n4o;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.oj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3657oj extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ C3683pj b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;
    public final /* synthetic */ WebView e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3657oj(C3683pj c3683pj, long j, String str, WebView webView, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = c3683pj;
        this.c = j;
        this.d = str;
        this.e = webView;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3657oj(this.b, this.c, this.d, this.e, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3657oj) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[ADDED_TO_REGION] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int ordinal;
        WebView webView;
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            long j = this.b.a;
            this.a = 1;
            if (n4o.y(j, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        boolean z2 = false;
        boolean z3 = this.c == this.b.e;
        String str = this.d;
        if (str != null) {
            WebView webView2 = this.e;
            if (str.equals(webView2 != null ? webView2.getUrl() : null)) {
                z = true;
                ordinal = this.b.g.ordinal();
                if (ordinal == 1 ? !this.b.h : ordinal == 3) {
                    z2 = true;
                }
                if (z3 && z && !this.b.f && z2 && (webView = this.e) != null && webView.isAttachedToWindow()) {
                    this.b.a("PAGE_COMMIT_VISIBLE", this.d);
                }
                return Unit.a;
            }
        }
        z = false;
        ordinal = this.b.g.ordinal();
        if (ordinal == 1) {
            z2 = true;
            if (z3) {
            }
            return Unit.a;
        }
        z2 = true;
        if (z3) {
            this.b.a("PAGE_COMMIT_VISIBLE", this.d);
        }
        return Unit.a;
    }
}
