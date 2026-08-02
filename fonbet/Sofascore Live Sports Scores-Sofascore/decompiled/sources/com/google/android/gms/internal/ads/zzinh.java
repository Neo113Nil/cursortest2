package com.google.android.gms.internal.ads;

import com.ironsource.U3;
import defpackage.yhk;
import defpackage.zqo;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzinh implements Iterator, Closeable, zzave {
    public static final zqo g = new zqo("eof ");
    public zzava a;
    public zzini b;
    public zzavd c = null;
    public long d = 0;
    public long e = 0;
    public final ArrayList f = new ArrayList();

    static {
        zzino.b(zzinh.class);
    }

    @Override // java.util.Iterator
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final zzavd next() {
        zzavd a;
        zzavd zzavdVar = this.c;
        if (zzavdVar != null && zzavdVar != g) {
            this.c = null;
            return zzavdVar;
        }
        zzini zziniVar = this.b;
        if (zziniVar == null || this.d >= this.e) {
            this.c = g;
            yhk.d();
            return null;
        }
        try {
            synchronized (zziniVar) {
                this.b.l(this.d);
                a = this.a.a(this.b, this);
                this.d = this.b.zzc();
            }
            return a;
        } catch (EOFException unused) {
            yhk.d();
            return null;
        } catch (IOException unused2) {
            yhk.d();
            return null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzavd zzavdVar = this.c;
        zqo zqoVar = g;
        if (zzavdVar == zqoVar) {
            return false;
        }
        if (zzavdVar != null) {
            return true;
        }
        try {
            this.c = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.c = zqoVar;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append(U3.j.d);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i >= arrayList.size()) {
                sb.append(U3.j.e);
                return sb.toString();
            }
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((zzavd) arrayList.get(i)).toString());
            i++;
        }
    }

    public void close() {
    }
}
