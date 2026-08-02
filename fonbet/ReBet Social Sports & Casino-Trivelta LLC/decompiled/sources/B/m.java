package B;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class m extends v {

    /* renamed from: b, reason: collision with root package name */
    public final B f511b;

    public m(B b10, Function0 function0) {
        super(function0);
        this.f511b = b10;
    }

    @Override // B.v
    public w a(Object obj) {
        return new w(this, obj, obj == null, this.f511b, null, null, true);
    }
}
