package e2;

import e2.AbstractC6263g;
import org.jetbrains.annotations.NotNull;

/* renamed from: e2.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6260d extends AbstractC6279w {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f61816b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC6263g.b f61817c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AbstractC6263g.a f61818d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AbstractC6263g.b f61819e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final AbstractC6263g.a f61820f;

    public C6260d(@NotNull Object obj) {
        super(obj);
        this.f61816b = obj;
        this.f61817c = new AbstractC6263g.b(obj, -2, this);
        this.f61818d = new AbstractC6263g.a(obj, 0, this);
        this.f61819e = new AbstractC6263g.b(obj, -1, this);
        this.f61820f = new AbstractC6263g.a(obj, 1, this);
    }

    @Override // e2.AbstractC6279w
    @NotNull
    public final Object a() {
        return this.f61816b;
    }

    @NotNull
    public final AbstractC6263g.a b() {
        return this.f61820f;
    }

    @NotNull
    public final AbstractC6263g.b c() {
        return this.f61819e;
    }

    @NotNull
    public final AbstractC6263g.b d() {
        return this.f61817c;
    }

    @NotNull
    public final AbstractC6263g.a e() {
        return this.f61818d;
    }
}
