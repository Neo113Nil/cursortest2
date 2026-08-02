package kotlin.collections;

import gd.InterfaceC6712a;
import java.util.Iterator;
import kotlin.jvm.internal.C7721c;

/* renamed from: kotlin.collections.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7710q implements Iterable<Object>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object[] f71756a;

    public C7710q(Object[] objArr) {
        this.f71756a = objArr;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return C7721c.a(this.f71756a);
    }
}
