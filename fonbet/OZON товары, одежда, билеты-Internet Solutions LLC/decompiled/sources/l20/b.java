package l20;

import B0.C2454a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8047b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final long f72566a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f72567b;

    /* renamed from: c, reason: collision with root package name */
    private final int f72568c;

    /* renamed from: d, reason: collision with root package name */
    private final int f72569d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final d f72570e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, String> f72571f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, List<C7854a>> f72572g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC8047b f72573h;

    /* JADX WARN: Multi-variable type inference failed */
    public b(long j11, @NotNull c item, int i11, int i12, @NotNull d info, Map<String, String> map, Map<String, ? extends List<? extends C7854a>> map2, @NotNull InterfaceC8047b widgetType) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        this.f72566a = j11;
        this.f72567b = item;
        this.f72568c = i11;
        this.f72569d = i12;
        this.f72570e = info;
        this.f72571f = map;
        this.f72572g = map2;
        this.f72573h = widgetType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b a(b bVar, c cVar, d dVar, Tc.d dVar2, int i11) {
        long j11 = bVar.f72566a;
        if ((i11 & 2) != 0) {
            cVar = bVar.f72567b;
        }
        c item = cVar;
        int i12 = bVar.f72568c;
        int i13 = bVar.f72569d;
        if ((i11 & 16) != 0) {
            dVar = bVar.f72570e;
        }
        d info = dVar;
        Map<String, String> map = bVar.f72571f;
        Map map2 = dVar2;
        if ((i11 & 64) != 0) {
            map2 = bVar.f72572g;
        }
        InterfaceC8047b widgetType = bVar.f72573h;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new b(j11, item, i12, i13, info, map, map2, widgetType);
    }

    @NotNull
    public final d b() {
        return this.f72570e;
    }

    @NotNull
    public final c c() {
        return this.f72567b;
    }

    public final long d() {
        return this.f72566a;
    }

    public final int e() {
        return this.f72568c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f72566a == bVar.f72566a && Intrinsics.d(this.f72567b, bVar.f72567b) && this.f72568c == bVar.f72568c && this.f72569d == bVar.f72569d && Intrinsics.d(this.f72570e, bVar.f72570e) && Intrinsics.d(this.f72571f, bVar.f72571f) && Intrinsics.d(this.f72572g, bVar.f72572g) && Intrinsics.d(this.f72573h, bVar.f72573h);
    }

    public final Map<String, List<C7854a>> f() {
        return this.f72572g;
    }

    public final Map<String, String> g() {
        return this.f72571f;
    }

    public final int h() {
        return this.f72569d;
    }

    public final int hashCode() {
        int hashCode = (this.f72570e.hashCode() + C2454a.a(this.f72569d, C2454a.a(this.f72568c, (this.f72567b.hashCode() + (Long.hashCode(this.f72566a) * 31)) * 31, 31), 31)) * 31;
        Map<String, String> map = this.f72571f;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, List<C7854a>> map2 = this.f72572g;
        return this.f72573h.hashCode() + ((hashCode2 + (map2 != null ? map2.hashCode() : 0)) * 31);
    }

    @NotNull
    public final InterfaceC8047b i() {
        return this.f72573h;
    }

    @NotNull
    public final String toString() {
        return "ComposerViewItemInfo(itemId=" + this.f72566a + ", item=" + this.f72567b + ", itemKey=" + this.f72568c + ", viewMapperKey=" + this.f72569d + ", info=" + this.f72570e + ", preparedPlaceholders=" + this.f72571f + ", placeholderWidgets=" + this.f72572g + ", widgetType=" + this.f72573h + ")";
    }
}
