package d80;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.AbstractC5434v;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: d80.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6100a extends Z4.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final G f61275a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f61276b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f61277c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6100a(@NotNull G fragmentManager, @NotNull AbstractC5434v lifecycle, List<String> list, List<String> list2) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.f61275a = fragmentManager;
        this.f61276b = list;
        this.f61277c = list2;
    }

    @Override // Z4.a
    @NotNull
    public final ComponentCallbacksC5392m createFragment(int i11) {
        List<String> list = this.f61276b;
        if (list != null) {
            String str = list.get(i11);
            C6102c c6102c = new C6102c();
            c6102c.setArguments(str != null ? androidx.core.os.d.b(new Pair("URL", str)) : androidx.core.os.d.a());
            return c6102c;
        }
        List<String> list2 = this.f61277c;
        if (list2 == null) {
            C6102c c6102c2 = new C6102c();
            c6102c2.setArguments(androidx.core.os.d.a());
            return c6102c2;
        }
        String str2 = list2.get(i11);
        C6102c c6102c3 = new C6102c();
        c6102c3.setArguments(str2 != null ? androidx.core.os.d.b(new Pair("BASE_64_KEY", str2)) : androidx.core.os.d.a());
        return c6102c3;
    }

    public final ComponentCallbacksC5392m f(int i11) {
        return this.f61275a.g0(Ej.b.a(i11, "f"));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public final int getShimmersCount() {
        List<String> list = this.f61276b;
        if (list != null) {
            return list.size();
        }
        List<String> list2 = this.f61277c;
        if (list2 != null) {
            return list2.size();
        }
        return 0;
    }
}
