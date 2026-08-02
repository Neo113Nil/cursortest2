package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.os.Process;
import defpackage.b6p;
import defpackage.fn0;
import defpackage.wt3;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzsv implements zzrt {
    public final zzafc a;
    public zzro[] b;

    public zzsv(zzafc zzafcVar) {
        this.a = zzafcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzrt
    public final Object a(zzrs zzrsVar) {
        Uri uri = zzrsVar.d;
        AtomicLong atomicLong = b6p.a;
        int myPid = Process.myPid();
        long id = Thread.currentThread().getId();
        long currentTimeMillis = System.currentTimeMillis();
        long andIncrement = b6p.a.getAndIncrement();
        int length = String.valueOf(myPid).length();
        StringBuilder sb = new StringBuilder(wt3.h(length + 15 + String.valueOf(id).length(), 1, String.valueOf(currentTimeMillis).length(), 1, String.valueOf(andIncrement).length()));
        wt3.u(myPid, ".mobstore_tmp-", "-", sb);
        sb.append(id);
        fn0.t(currentTimeMillis, "-", "-", sb);
        sb.append(andIncrement);
        Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb.toString())).build();
        zzsx zzsxVar = zzrsVar.a;
        ArrayList a = zzrsVar.a(zzsxVar.c(build));
        zzro[] zzroVarArr = this.b;
        if (zzroVarArr != null) {
            zzroVarArr[0].a(a);
        }
        try {
            OutputStream outputStream = (OutputStream) a.get(0);
            try {
                this.a.d(outputStream);
                zzro[] zzroVarArr2 = this.b;
                if (zzroVarArr2 != null) {
                    zzroVarArr2[0].zzb();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                zzsxVar.e(build, uri);
                return null;
            } finally {
            }
        } catch (Exception e) {
            try {
                zzsxVar.d(build);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }
}
