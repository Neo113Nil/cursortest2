package t80;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final FinLargeButtonState f99266a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f99267b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f99268c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f99269d;

    /* renamed from: e, reason: collision with root package name */
    private final int f99270e;

    public e(@NotNull FinLargeButtonState button, @NotNull String title, @NotNull String description, ArrayList arrayList, int i11) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f99266a = button;
        this.f99267b = title;
        this.f99268c = description;
        this.f99269d = arrayList;
        this.f99270e = i11;
    }

    @NotNull
    public final FinLargeButtonState a() {
        return this.f99266a;
    }

    @NotNull
    public final String b() {
        return this.f99268c;
    }

    public final int c() {
        return this.f99270e;
    }

    public final List<String> d() {
        return this.f99269d;
    }

    @NotNull
    public final String e() {
        return this.f99267b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f99266a.equals(eVar.f99266a) && Intrinsics.d(this.f99267b, eVar.f99267b) && this.f99268c.equals(eVar.f99268c) && Intrinsics.d(this.f99269d, eVar.f99269d) && this.f99270e == eVar.f99270e;
    }

    public final int hashCode() {
        int a11 = G.g.a(G.g.a(this.f99266a.hashCode() * 31, 31, this.f99267b), 31, this.f99268c);
        ArrayList arrayList = this.f99269d;
        return Integer.hashCode(this.f99270e) + ((a11 + (arrayList == null ? 0 : arrayList.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UpdateWallState(button=");
        sb2.append(this.f99266a);
        sb2.append(", title=");
        sb2.append(this.f99267b);
        sb2.append(", description=");
        sb2.append(this.f99268c);
        sb2.append(", steps=");
        sb2.append(this.f99269d);
        sb2.append(", gravity=");
        return K00.b.e(this.f99270e, ")", sb2);
    }
}
