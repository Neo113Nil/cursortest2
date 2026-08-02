package com.airbnb.lottie.parser;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.parser.moshi.c;

/* renamed from: com.airbnb.lottie.parser.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2954h {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29025a = c.a.a("ty", W9.d.f13160a);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00c2, code lost:
    
        if (r2.equals("gf") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.airbnb.lottie.model.content.c a(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        com.airbnb.lottie.model.content.c cVar2;
        String str;
        cVar.m();
        char c10 = 2;
        int i10 = 2;
        while (true) {
            cVar2 = null;
            if (!cVar.hasNext()) {
                str = null;
                break;
            }
            int U10 = cVar.U(f29025a);
            if (U10 == 0) {
                str = cVar.M0();
                break;
            }
            if (U10 != 1) {
                cVar.w0();
                cVar.C();
            } else {
                i10 = cVar.nextInt();
            }
        }
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 3239:
                if (str.equals("el")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 3270:
                if (str.equals("fl")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 3295:
                break;
            case 3307:
                if (str.equals("gr")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3308:
                if (str.equals("gs")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 3488:
                if (str.equals("mm")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 3633:
                if (str.equals("rc")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 3634:
                if (str.equals("rd")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 3646:
                if (str.equals("rp")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 3669:
                if (str.equals("sh")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 3679:
                if (str.equals("sr")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 3681:
                if (str.equals("st")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 3705:
                if (str.equals("tm")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 3710:
                if (str.equals("tr")) {
                    c10 = '\r';
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
                cVar2 = AbstractC2952f.a(cVar, c2940j, i10);
                break;
            case 1:
                cVar2 = I.a(cVar, c2940j);
                break;
            case 2:
                cVar2 = p.a(cVar, c2940j);
                break;
            case 3:
                cVar2 = J.a(cVar, c2940j);
                break;
            case 4:
                cVar2 = q.a(cVar, c2940j);
                break;
            case 5:
                cVar2 = y.a(cVar);
                c2940j.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                cVar2 = D.a(cVar, c2940j);
                break;
            case 7:
                cVar2 = F.a(cVar, c2940j);
                break;
            case '\b':
                cVar2 = E.a(cVar, c2940j);
                break;
            case '\t':
                cVar2 = K.a(cVar, c2940j);
                break;
            case '\n':
                cVar2 = C.a(cVar, c2940j, i10);
                break;
            case 11:
                cVar2 = L.a(cVar, c2940j);
                break;
            case '\f':
                cVar2 = M.a(cVar, c2940j);
                break;
            case '\r':
                cVar2 = AbstractC2949c.h(cVar, c2940j);
                break;
            default:
                com.airbnb.lottie.utils.g.c("Unknown shape type " + str);
                break;
        }
        while (cVar.hasNext()) {
            cVar.C();
        }
        cVar.t();
        return cVar2;
    }
}
