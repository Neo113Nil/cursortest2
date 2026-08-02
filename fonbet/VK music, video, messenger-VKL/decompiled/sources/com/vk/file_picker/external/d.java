package com.vk.file_picker.external;

import com.vk.file_picker.external.c;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.j5n;
import xsna.leq;
import xsna.oeq;
import xsna.v7;

/* compiled from: ExternalFilePickerReducer.kt */
/* loaded from: classes18.dex */
public final class d extends dm50<e, c, oeq> {
    @Override // xsna.dm50
    public final oeq c(oeq oeqVar, c cVar) {
        c cVar2 = cVar;
        if (cVar2 instanceof c.C1067c) {
            return new oeq(null, null, 5);
        }
        if (cVar2 instanceof c.a) {
            return new oeq(null, ((c.a) cVar2).b, 3);
        }
        if (cVar2 instanceof c.b) {
            return new oeq(((c.b) cVar2).b, null, 6);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final e d() {
        return new e(e(new j5n(2)), e(new leq(0)), e(new v7(28)));
    }

    @Override // xsna.dm50
    public final void h(oeq oeqVar, e eVar) {
        oeq oeqVar2 = oeqVar;
        e eVar2 = eVar;
        if (oeqVar2.c) {
            f(eVar2.c, oeqVar2);
        } else if (oeqVar2.b != null) {
            f(eVar2.b, oeqVar2);
        } else {
            if (oeqVar2.d == null) {
                throw new IllegalStateException("Unimplemented state selector!");
            }
            f(eVar2.a, oeqVar2);
        }
    }
}
