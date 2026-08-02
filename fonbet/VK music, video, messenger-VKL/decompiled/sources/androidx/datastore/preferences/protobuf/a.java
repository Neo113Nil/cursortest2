package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a.AbstractC0027a;
import java.io.IOException;
import xsna.la20;
import xsna.m8h0;
import xsna.oa20;

/* compiled from: AbstractMessageLite.java */
/* loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0027a<MessageType, BuilderType>> implements la20 {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0027a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0027a<MessageType, BuilderType>> implements oa20, Cloneable {
    }

    public int c() {
        throw new UnsupportedOperationException();
    }

    public int d(m8h0 m8h0Var) {
        int c = c();
        if (c != -1) {
            return c;
        }
        int e = m8h0Var.e(this);
        e(e);
        return e;
    }

    public void e(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // xsna.la20
    public final ByteString.g toByteString() {
        try {
            int d = ((GeneratedMessageLite) this).d(null);
            ByteString.g gVar = ByteString.b;
            ByteString.e eVar = new ByteString.e(d);
            ((GeneratedMessageLite) this).b(eVar.b());
            return eVar.a();
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
