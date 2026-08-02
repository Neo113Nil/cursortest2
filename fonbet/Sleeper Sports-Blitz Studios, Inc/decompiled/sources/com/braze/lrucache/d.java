package com.braze.lrucache;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final g f564a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ f d;

    public d(f fVar, g gVar) {
        this.d = fVar;
        this.f564a = gVar;
        this.b = gVar.c ? null : new boolean[fVar.g];
    }

    public final OutputStream a() {
        FileOutputStream fileOutputStream;
        c cVar;
        f fVar = this.d;
        if (fVar.g <= 0) {
            throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + this.d.g);
        }
        synchronized (fVar) {
            g gVar = this.f564a;
            if (gVar.d != this) {
                throw new IllegalStateException();
            }
            if (!gVar.c) {
                this.b[0] = true;
            }
            File a2 = gVar.a(0);
            try {
                fileOutputStream = new FileOutputStream(a2);
            } catch (FileNotFoundException unused) {
                this.d.f566a.mkdirs();
                try {
                    fileOutputStream = new FileOutputStream(a2);
                } catch (FileNotFoundException unused2) {
                    return f.q;
                }
            }
            cVar = new c(this, fileOutputStream);
        }
        return cVar;
    }
}
