package t5;

import org.jetbrains.annotations.NotNull;
import t5.InterfaceC9758c;

/* renamed from: t5.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9760e implements InterfaceC9758c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9763h f99179a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC9764i f99180b;

    public C9760e(@NotNull InterfaceC9763h interfaceC9763h, @NotNull InterfaceC9764i interfaceC9764i) {
        this.f99179a = interfaceC9763h;
        this.f99180b = interfaceC9764i;
    }

    @Override // t5.InterfaceC9758c
    public final void a(int i11) {
        this.f99179a.a(i11);
        this.f99180b.a(i11);
    }

    @Override // t5.InterfaceC9758c
    public final InterfaceC9758c.C2178c b(@NotNull InterfaceC9758c.b bVar) {
        InterfaceC9758c.C2178c b11 = this.f99179a.b(bVar);
        return b11 == null ? this.f99180b.b(bVar) : b11;
    }

    @Override // t5.InterfaceC9758c
    public final void c(@NotNull InterfaceC9758c.b bVar, @NotNull InterfaceC9758c.C2178c c2178c) {
        this.f99179a.c(InterfaceC9758c.b.a(bVar, A5.c.b(bVar.b())), c2178c.a(), A5.c.b(c2178c.b()));
    }
}
