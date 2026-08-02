package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.m;
import androidx.datastore.preferences.protobuf.m.b;
import java.io.IOException;
import java.util.Map;
import xsna.la20;

/* compiled from: ExtensionSchema.java */
/* loaded from: classes.dex */
public abstract class k<T extends m.b<T>> {
    public abstract void a(Map.Entry entry);

    public abstract GeneratedMessageLite.e b(j jVar, la20 la20Var, int i);

    public abstract m<T> c(Object obj);

    public abstract m<T> d(Object obj);

    public abstract boolean e(la20 la20Var);

    public abstract void f(Object obj);

    public abstract Object g(Object obj) throws IOException;

    public abstract void h(Object obj) throws IOException;

    public abstract void i(Object obj) throws IOException;

    public abstract void j(Map.Entry entry) throws IOException;
}
