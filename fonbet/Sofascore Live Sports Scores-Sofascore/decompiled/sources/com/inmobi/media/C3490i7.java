package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import defpackage.a70;
import defpackage.h2d;
import defpackage.j2d;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import java.util.Objects;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.i7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3490i7 {
    public static InMobiUserDataModel b;
    public static final C3490i7 a = new C3490i7();
    public static final h2d c = new j2d();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(InMobiUserDataModel inMobiUserDataModel, sq3 sq3Var) {
        C3464h7 c3464h7;
        int i;
        h2d h2dVar;
        try {
            if (sq3Var instanceof C3464h7) {
                c3464h7 = (C3464h7) sq3Var;
                int i2 = c3464h7.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3464h7.d = i2 - Integer.MIN_VALUE;
                    Object obj = c3464h7.c;
                    lu3 lu3Var = lu3.a;
                    i = c3464h7.d;
                    if (i != 0) {
                        y6a.M(obj);
                        h2dVar = c;
                        c3464h7.a = inMobiUserDataModel;
                        c3464h7.b = h2dVar;
                        c3464h7.d = 1;
                        if (h2dVar.e(c3464h7) == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h2d h2dVar2 = c3464h7.b;
                        InMobiUserDataModel inMobiUserDataModel2 = c3464h7.a;
                        y6a.M(obj);
                        h2dVar = h2dVar2;
                        inMobiUserDataModel = inMobiUserDataModel2;
                    }
                    Objects.toString(b);
                    Objects.toString(inMobiUserDataModel);
                    b = inMobiUserDataModel;
                    return Unit.a;
                }
            }
            Objects.toString(b);
            Objects.toString(inMobiUserDataModel);
            b = inMobiUserDataModel;
            return Unit.a;
        } finally {
            h2dVar.f(null);
        }
        c3464h7 = new C3464h7(sq3Var);
        Object obj2 = c3464h7.c;
        lu3 lu3Var2 = lu3.a;
        i = c3464h7.d;
        if (i != 0) {
        }
    }

    public final String toString() {
        return String.valueOf(b);
    }
}
