package ld;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import nd.AbstractC8504A;
import nd.X;
import org.jetbrains.annotations.NotNull;

/* renamed from: ld.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7924e {
    @NotNull
    public static final ArrayList a(@NotNull kotlin.reflect.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Collection<AbstractC8504A<?>> f7 = ((X.a) ((X) dVar).N().getValue()).f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : f7) {
            AbstractC8504A abstractC8504A = (AbstractC8504A) obj;
            if (!(abstractC8504A.t().d0() != null) && (abstractC8504A instanceof o)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
