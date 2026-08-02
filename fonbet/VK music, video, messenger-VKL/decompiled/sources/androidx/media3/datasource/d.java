package androidx.media3.datasource;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.media3.datasource.a;
import androidx.media3.datasource.e;
import xsna.jk80;
import xsna.mjp0;

/* compiled from: DefaultDataSourceFactory.java */
@Deprecated
/* loaded from: classes12.dex */
public final class d implements a.InterfaceC0045a {
    public final Context a;

    @Nullable
    public final mjp0 b;
    public final a.InterfaceC0045a c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(Context context, @Nullable String str, @Nullable jk80.a aVar) {
        this(context, aVar, r0);
        e.a aVar2 = new e.a();
        aVar2.b = str;
    }

    @Override // androidx.media3.datasource.a.InterfaceC0045a
    public final a createDataSource() {
        c cVar = new c(this.a, this.c.createDataSource());
        mjp0 mjp0Var = this.b;
        if (mjp0Var != null) {
            cVar.addTransferListener(mjp0Var);
        }
        return cVar;
    }

    public d(Context context, @Nullable mjp0 mjp0Var, a.InterfaceC0045a interfaceC0045a) {
        this.a = context.getApplicationContext();
        this.b = mjp0Var;
        this.c = interfaceC0045a;
    }
}
