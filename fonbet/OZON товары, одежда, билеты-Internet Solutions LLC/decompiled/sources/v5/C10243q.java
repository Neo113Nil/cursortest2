package v5;

import Kk.C3532b;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import n5.EnumC8444d;
import org.jetbrains.annotations.NotNull;
import t5.InterfaceC9758c;

/* renamed from: v5.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10243q extends AbstractC10235i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Drawable f102269a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10234h f102270b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC8444d f102271c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC9758c.b f102272d;

    /* renamed from: e, reason: collision with root package name */
    private final String f102273e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f102274f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f102275g;

    public C10243q(@NotNull Drawable drawable, @NotNull C10234h c10234h, @NotNull EnumC8444d enumC8444d, InterfaceC9758c.b bVar, String str, boolean z11, boolean z12) {
        super(0);
        this.f102269a = drawable;
        this.f102270b = c10234h;
        this.f102271c = enumC8444d;
        this.f102272d = bVar;
        this.f102273e = str;
        this.f102274f = z11;
        this.f102275g = z12;
    }

    @Override // v5.AbstractC10235i
    @NotNull
    public final Drawable a() {
        return this.f102269a;
    }

    @Override // v5.AbstractC10235i
    @NotNull
    public final C10234h b() {
        return this.f102270b;
    }

    @NotNull
    public final EnumC8444d c() {
        return this.f102271c;
    }

    public final boolean d() {
        return this.f102275g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10243q)) {
            return false;
        }
        C10243q c10243q = (C10243q) obj;
        if (Intrinsics.d(this.f102269a, c10243q.f102269a)) {
            return Intrinsics.d(this.f102270b, c10243q.f102270b) && this.f102271c == c10243q.f102271c && Intrinsics.d(this.f102272d, c10243q.f102272d) && Intrinsics.d(this.f102273e, c10243q.f102273e) && this.f102274f == c10243q.f102274f && this.f102275g == c10243q.f102275g;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f102271c.hashCode() + ((this.f102270b.hashCode() + (this.f102269a.hashCode() * 31)) * 31)) * 31;
        InterfaceC9758c.b bVar = this.f102272d;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = this.f102273e;
        return Boolean.hashCode(this.f102275g) + C3532b.a((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f102274f);
    }
}
