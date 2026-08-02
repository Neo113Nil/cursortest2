package androidx.datastore.preferences;

import Ph.C1452g0;
import Ph.P;
import Ph.Q;
import Ph.X0;
import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.properties.ReadOnlyProperty;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.datastore.preferences.a$a, reason: collision with other inner class name */
    public static final class C0370a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final C0370a f19379d = new C0370a();

        public C0370a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.emptyList();
        }
    }

    public static final ReadOnlyProperty a(String name, J0.b bVar, Function1 produceMigrations, P scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new c(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ ReadOnlyProperty b(String str, J0.b bVar, Function1 function1, P p10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            function1 = C0370a.f19379d;
        }
        if ((i10 & 8) != 0) {
            p10 = Q.a(C1452g0.b().plus(X0.b(null, 1, null)));
        }
        return a(str, bVar, function1, p10);
    }
}
