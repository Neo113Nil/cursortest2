package qe;

import je.AbstractC7393m0;
import je.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: qe.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9034e<K, T> extends AbstractC9030a<K, T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private AbstractC9032c<T> f81950a;

    public AbstractC9034e() {
        C9041l arrayMap = C9041l.f81962a;
        Intrinsics.g(arrayMap, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        Intrinsics.checkNotNullParameter(arrayMap, "arrayMap");
        this.f81950a = arrayMap;
    }

    @Override // qe.AbstractC9030a
    @NotNull
    protected final AbstractC9032c<T> b() {
        return this.f81950a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qe.AbstractC9030a
    protected final void c(@NotNull String keyQualifiedName, @NotNull AbstractC7393m0 value) {
        Intrinsics.checkNotNullParameter(keyQualifiedName, "keyQualifiedName");
        Intrinsics.checkNotNullParameter(value, "value");
        int c11 = o0.f69907b.c(keyQualifiedName);
        int size = this.f81950a.getSize();
        if (size == 0) {
            this.f81950a = new r(value, c11);
            return;
        }
        if (size == 1) {
            AbstractC9032c<T> abstractC9032c = this.f81950a;
            Intrinsics.g(abstractC9032c, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
            r rVar = (r) abstractC9032c;
            if (rVar.c() == c11) {
                this.f81950a = new r(value, c11);
                return;
            } else {
                C9033d c9033d = new C9033d();
                this.f81950a = c9033d;
                c9033d.b(rVar.c(), rVar.e());
            }
        }
        this.f81950a.b(c11, value);
    }
}
