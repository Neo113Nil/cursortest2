package androidx.appcompat.app;

import android.os.Bundle;
import com.sports.insider.ui.activities.MainActivity;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m implements q2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f331a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f332b;

    public m(q2.d registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f332b = new LinkedHashSet();
        registry.c("androidx.savedstate.Restarter", this);
    }

    @Override // q2.c
    public final Bundle a() {
        switch (this.f331a) {
            case 0:
                Bundle bundle = new Bundle();
                ((MainActivity) this.f332b).t().getClass();
                return bundle;
            default:
                kotlin.collections.n0.c().getClass();
                Bundle source = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                Intrinsics.checkNotNullParameter(source, "source");
                h8.b.y(source, "classes_to_restore", CollectionsKt.W((LinkedHashSet) this.f332b));
                return source;
        }
    }

    public m(MainActivity mainActivity) {
        this.f332b = mainActivity;
    }
}
