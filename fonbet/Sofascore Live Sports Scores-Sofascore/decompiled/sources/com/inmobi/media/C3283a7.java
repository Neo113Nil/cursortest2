package com.inmobi.media;

import com.ironsource.C4427z5;
import defpackage.k62;
import defpackage.x52;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.a7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3283a7 extends Pi {
    public final String a;

    public C3283a7(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // com.inmobi.media.Pi
    public final void a(k62 k62Var) {
        k62Var.getClass();
        String str = this.a;
        str.getClass();
        x52 x52Var = new x52();
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            x52Var.r0(fileInputStream);
            fileInputStream.close();
        } finally {
        }
        try {
            try {
                k62Var.M0(x52Var);
            } finally {
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception unused) {
            Unit unit = Unit.a;
        }
    }

    @Override // com.inmobi.media.Pi
    public final String a() {
        return C4427z5.M;
    }
}
