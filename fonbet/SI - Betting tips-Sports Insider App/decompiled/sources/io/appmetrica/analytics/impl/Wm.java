package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Wm implements InterfaceC0137eo {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13134a;

    public Wm(@NotNull String str, @NotNull List<String> list, int i5, @NotNull Ln ln, @NotNull so soVar, @NotNull J2 j22) {
        List S = CollectionsKt.S(i5, CollectionsKt.W(CollectionsKt.Z(list)));
        ArrayList arrayList = new ArrayList(kotlin.collections.v.k(S, 10));
        int i10 = 0;
        for (Object obj : S) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.u.j();
                throw null;
            }
            arrayList.add(new Ym(str + '_' + i10, (String) obj, ln, soVar, j22));
            i10 = i11;
        }
        this.f13134a = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0137eo
    public final void a(@NotNull Cdo cdo) {
        Iterator it = this.f13134a.iterator();
        while (it.hasNext()) {
            ((Ym) it.next()).a(cdo);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0137eo
    public final void a(@NotNull PublicLogger publicLogger) {
        Iterator it = this.f13134a.iterator();
        while (it.hasNext()) {
            ((Ym) it.next()).f11995e = publicLogger;
        }
    }
}
