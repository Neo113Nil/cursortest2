package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.bf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051bf implements InterfaceC0060bo {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13446a;

    public C0051bf(@NotNull C0103df c0103df) {
        boolean z5;
        List<C0077cf> list = c0103df.f13593b;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C0077cf) it.next()).f13524c == S7.f12862c) {
                    z5 = false;
                    break;
                }
            }
        }
        z5 = true;
        this.f13446a = z5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0060bo, kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0077cf> invoke(@NotNull List<? extends C0077cf> list, @NotNull C0433qf c0433qf) {
        C0077cf c0077cf = new C0077cf(c0433qf.f14513a, c0433qf.f14514b, c0433qf.f14517e);
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C0077cf) it.next()).f13524c == c0433qf.f14517e) {
                    if (c0077cf.f13524c == S7.f12862c && this.f13446a) {
                        return CollectionsKt.O(list, c0077cf);
                    }
                    return null;
                }
            }
        }
        return CollectionsKt.O(list, c0077cf);
    }
}
