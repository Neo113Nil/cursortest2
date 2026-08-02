package x0;

import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: x0.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10590T extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10586O f104697b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f104698c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10590T(C10586O c10586o, Object obj) {
        super(1);
        this.f104697b = c10586o;
        this.f104698c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        LinkedHashSet linkedHashSet;
        C10586O c10586o = this.f104697b;
        linkedHashSet = c10586o.f104691c;
        Object obj = this.f104698c;
        linkedHashSet.remove(obj);
        return new C10589S(c10586o, obj);
    }
}
