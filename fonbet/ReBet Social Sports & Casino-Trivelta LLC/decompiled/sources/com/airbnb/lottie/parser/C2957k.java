package com.airbnb.lottie.parser;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.parser.moshi.c;

/* renamed from: com.airbnb.lottie.parser.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2957k {

    /* renamed from: f, reason: collision with root package name */
    public static final c.a f29033f = c.a.a("ef");

    /* renamed from: g, reason: collision with root package name */
    public static final c.a f29034g = c.a.a("nm", "v");

    /* renamed from: a, reason: collision with root package name */
    public F3.a f29035a;

    /* renamed from: b, reason: collision with root package name */
    public F3.b f29036b;

    /* renamed from: c, reason: collision with root package name */
    public F3.b f29037c;

    /* renamed from: d, reason: collision with root package name */
    public F3.b f29038d;

    /* renamed from: e, reason: collision with root package name */
    public F3.b f29039e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0052, code lost:
    
        if (r0.equals("Opacity") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        cVar.m();
        String str = "";
        while (cVar.hasNext()) {
            int U10 = cVar.U(f29034g);
            if (U10 != 0) {
                char c10 = 1;
                if (U10 == 1) {
                    str.getClass();
                    switch (str.hashCode()) {
                        case 353103893:
                            if (str.equals("Distance")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 397447147:
                            break;
                        case 1041377119:
                            if (str.equals("Direction")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1379387491:
                            if (str.equals("Shadow Color")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1383710113:
                            if (str.equals("Softness")) {
                                c10 = 4;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                            this.f29038d = AbstractC2950d.e(cVar, c2940j);
                            break;
                        case 1:
                            this.f29036b = AbstractC2950d.f(cVar, c2940j, false);
                            break;
                        case 2:
                            this.f29037c = AbstractC2950d.f(cVar, c2940j, false);
                            break;
                        case 3:
                            this.f29035a = AbstractC2950d.c(cVar, c2940j);
                            break;
                        case 4:
                            this.f29039e = AbstractC2950d.e(cVar, c2940j);
                            break;
                        default:
                            cVar.C();
                            break;
                    }
                } else {
                    cVar.w0();
                    cVar.C();
                }
            } else {
                str = cVar.M0();
            }
        }
        cVar.t();
    }

    public C2956j b(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        F3.b bVar;
        F3.b bVar2;
        F3.b bVar3;
        F3.b bVar4;
        while (cVar.hasNext()) {
            if (cVar.U(f29033f) != 0) {
                cVar.w0();
                cVar.C();
            } else {
                cVar.p();
                while (cVar.hasNext()) {
                    a(cVar, c2940j);
                }
                cVar.n();
            }
        }
        F3.a aVar = this.f29035a;
        if (aVar == null || (bVar = this.f29036b) == null || (bVar2 = this.f29037c) == null || (bVar3 = this.f29038d) == null || (bVar4 = this.f29039e) == null) {
            return null;
        }
        return new C2956j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
