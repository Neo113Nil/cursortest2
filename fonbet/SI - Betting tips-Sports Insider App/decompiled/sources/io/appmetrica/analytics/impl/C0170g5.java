package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.g5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0170g5 implements Bo {

    /* renamed from: a, reason: collision with root package name */
    public final List f13805a;

    public C0170g5(@NotNull List<? extends Pair<String, ? extends Bo>> list) {
        this.f13805a = list;
    }

    @Override // io.appmetrica.analytics.impl.Bo
    @Nullable
    public final String a() {
        Iterator it = this.f13805a.iterator();
        while (it.hasNext()) {
            String a7 = ((Bo) ((Pair) it.next()).f19193b).a();
            if (a7 != null && a7.length() > 0) {
                return a7;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final void a(@NotNull String str) {
        Iterator it = this.f13805a.iterator();
        while (it.hasNext()) {
            ((Bo) ((Pair) it.next()).f19193b).a(str);
        }
    }
}
