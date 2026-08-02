package x0;

import java.util.LinkedHashSet;

/* renamed from: x0.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10589S implements S0.M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10586O f104695a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f104696b;

    public C10589S(C10586O c10586o, Object obj) {
        this.f104695a = c10586o;
        this.f104696b = obj;
    }

    @Override // S0.M
    public final void dispose() {
        LinkedHashSet linkedHashSet;
        linkedHashSet = this.f104695a.f104691c;
        linkedHashSet.add(this.f104696b);
    }
}
