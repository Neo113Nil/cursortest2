package defpackage;

import com.google.android.gms.internal.ads.x;
import com.google.android.gms.internal.ads.zziei;
import com.google.protobuf.ByteString;
import com.google.protobuf.h2;
import com.google.protobuf.l;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class v6g implements Iterator {
    public final /* synthetic */ int a = 2;
    public final ArrayDeque b;
    public Object c;

    public v6g(zziei zzieiVar) {
        if (!(zzieiVar instanceof x)) {
            this.b = null;
            this.c = (lpo) zzieiVar;
            return;
        }
        x xVar = (x) zzieiVar;
        ArrayDeque arrayDeque = new ArrayDeque(xVar.g);
        this.b = arrayDeque;
        arrayDeque.push(xVar);
        zziei zzieiVar2 = xVar.d;
        while (zzieiVar2 instanceof x) {
            x xVar2 = (x) zzieiVar2;
            this.b.push(xVar2);
            zzieiVar2 = xVar2.d;
        }
        this.c = (lpo) zzieiVar2;
    }

    public l a() {
        l lVar = (l) this.c;
        l lVar2 = null;
        if (lVar == null) {
            yhk.d();
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque = this.b;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            ByteString byteString = ((h2) arrayDeque.pop()).c;
            while (byteString instanceof h2) {
                h2 h2Var = (h2) byteString;
                arrayDeque.push(h2Var);
                byteString = h2Var.b;
            }
            l lVar3 = (l) byteString;
            if (!lVar3.isEmpty()) {
                lVar2 = lVar3;
                break;
            }
        }
        this.c = lVar2;
        return lVar;
    }

    public d8n b() {
        d8n d8nVar = (d8n) this.c;
        d8n d8nVar2 = null;
        if (d8nVar == null) {
            yhk.d();
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque = this.b;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            g8n g8nVar = ((ocn) arrayDeque.pop()).e;
            while (g8nVar instanceof ocn) {
                ocn ocnVar = (ocn) g8nVar;
                arrayDeque.push(ocnVar);
                g8nVar = ocnVar.d;
            }
            d8n d8nVar3 = (d8n) g8nVar;
            if (d8nVar3.d() != 0) {
                d8nVar2 = d8nVar3;
                break;
            }
        }
        this.c = d8nVar2;
        return d8nVar;
    }

    public lpo c() {
        lpo lpoVar = (lpo) this.c;
        lpo lpoVar2 = null;
        if (lpoVar == null) {
            yhk.d();
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque = this.b;
            if (arrayDeque != null && !arrayDeque.isEmpty()) {
                zziei zzieiVar = ((x) arrayDeque.pop()).e;
                while (zzieiVar instanceof x) {
                    x xVar = (x) zzieiVar;
                    arrayDeque.push(xVar);
                    zzieiVar = xVar.d;
                }
                lpo lpoVar3 = (lpo) zzieiVar;
                if (lpoVar3.o() != 0) {
                    lpoVar2 = lpoVar3;
                    break;
                }
            } else {
                break;
            }
        }
        this.c = lpoVar2;
        return lpoVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (((l) this.c) != null) {
                }
                break;
            case 1:
                if (((d8n) this.c) != null) {
                }
                break;
            default:
                if (((lpo) this.c) != null) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        switch (this.a) {
            case 0:
                return a();
            case 1:
                return b();
            default:
                return c();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public v6g(g8n g8nVar) {
        if (g8nVar instanceof ocn) {
            ocn ocnVar = (ocn) g8nVar;
            ArrayDeque arrayDeque = new ArrayDeque(ocnVar.g);
            this.b = arrayDeque;
            arrayDeque.push(ocnVar);
            g8n g8nVar2 = ocnVar.d;
            while (g8nVar2 instanceof ocn) {
                ocn ocnVar2 = (ocn) g8nVar2;
                this.b.push(ocnVar2);
                g8nVar2 = ocnVar2.d;
            }
            this.c = (d8n) g8nVar2;
            return;
        }
        this.b = null;
        this.c = (d8n) g8nVar;
    }

    public v6g(ByteString byteString) {
        if (byteString instanceof h2) {
            h2 h2Var = (h2) byteString;
            ArrayDeque arrayDeque = new ArrayDeque(h2Var.e);
            this.b = arrayDeque;
            arrayDeque.push(h2Var);
            ByteString byteString2 = h2Var.b;
            while (byteString2 instanceof h2) {
                h2 h2Var2 = (h2) byteString2;
                this.b.push(h2Var2);
                byteString2 = h2Var2.b;
            }
            this.c = (l) byteString2;
            return;
        }
        this.b = null;
        this.c = (l) byteString;
    }
}
