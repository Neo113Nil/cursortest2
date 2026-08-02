package com.airbnb.lottie.parser;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.model.content.i;

/* loaded from: classes.dex */
public abstract class x {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (r0.equals("s") == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.airbnb.lottie.model.content.i a(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j) {
        boolean z10;
        cVar.m();
        i.a aVar = null;
        F3.h hVar = null;
        F3.d dVar = null;
        boolean z11 = false;
        while (cVar.hasNext()) {
            String f02 = cVar.f0();
            f02.getClass();
            char c10 = 3;
            switch (f02.hashCode()) {
                case 111:
                    if (f02.equals("o")) {
                        z10 = false;
                        break;
                    }
                    z10 = -1;
                    break;
                case 3588:
                    if (f02.equals("pt")) {
                        z10 = true;
                        break;
                    }
                    z10 = -1;
                    break;
                case 104433:
                    if (f02.equals("inv")) {
                        z10 = 2;
                        break;
                    }
                    z10 = -1;
                    break;
                case 3357091:
                    if (f02.equals("mode")) {
                        z10 = 3;
                        break;
                    }
                    z10 = -1;
                    break;
                default:
                    z10 = -1;
                    break;
            }
            switch (z10) {
                case false:
                    dVar = AbstractC2950d.h(cVar, c2940j);
                    break;
                case true:
                    hVar = AbstractC2950d.k(cVar, c2940j);
                    break;
                case true:
                    z11 = cVar.k();
                    break;
                case true:
                    String M02 = cVar.M0();
                    M02.getClass();
                    switch (M02.hashCode()) {
                        case 97:
                            if (M02.equals("a")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 105:
                            if (M02.equals(com.google.android.material.shape.i.f35755A)) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 110:
                            if (M02.equals("n")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 115:
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                            aVar = i.a.MASK_MODE_ADD;
                            break;
                        case 1:
                            c2940j.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            aVar = i.a.MASK_MODE_INTERSECT;
                            break;
                        case 2:
                            aVar = i.a.MASK_MODE_NONE;
                            break;
                        case 3:
                            aVar = i.a.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            com.airbnb.lottie.utils.g.c("Unknown mask mode " + f02 + ". Defaulting to Add.");
                            aVar = i.a.MASK_MODE_ADD;
                            break;
                    }
                default:
                    cVar.C();
                    break;
            }
        }
        cVar.t();
        return new com.airbnb.lottie.model.content.i(aVar, hVar, dVar, z11);
    }
}
