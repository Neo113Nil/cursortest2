package androidx.datastore.core;

import xsna.gtk0;
import xsna.o7i;
import xsna.spj;
import xsna.wzs;

/* compiled from: Message.kt */
/* loaded from: classes.dex */
public abstract class l<T> {

    /* compiled from: Message.kt */
    public static final class a<T> extends l<T> {
        public final wzs<T, spj<? super T>, Object> a;
        public final o7i b;
        public final gtk0<T> c;
        public final kotlin.coroutines.d d;

        public a(wzs wzsVar, o7i o7iVar, gtk0 gtk0Var, kotlin.coroutines.d dVar) {
            this.a = wzsVar;
            this.b = o7iVar;
            this.c = gtk0Var;
            this.d = dVar;
        }
    }
}
