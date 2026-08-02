package we0;

import Sc.InterfaceC4008j;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.geometry.Bounds;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f104429a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m f104430b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final m f104431c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final m f104432d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f104433e;

    static final class a extends AbstractC7737t implements Function0<Bounds> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Bounds invoke() {
            return i.a(i.this);
        }
    }

    public i(@NotNull m topLeft, @NotNull m topRight, @NotNull m bottomRight, @NotNull m bottomLeft) {
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(topRight, "topRight");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        Intrinsics.checkNotNullParameter(bottomLeft, "bottomLeft");
        this.f104429a = topLeft;
        this.f104430b = topRight;
        this.f104431c = bottomRight;
        this.f104432d = bottomLeft;
        this.f104433e = Sc.k.b(new a());
    }

    public static final Bounds a(i iVar) {
        m mVar = iVar.f104429a;
        Double valueOf = Double.valueOf(mVar.getLatitude());
        m mVar2 = iVar.f104430b;
        Double valueOf2 = Double.valueOf(mVar2.getLatitude());
        m mVar3 = iVar.f104431c;
        Double valueOf3 = Double.valueOf(mVar3.getLatitude());
        m mVar4 = iVar.f104432d;
        List b02 = C7714v.b0(valueOf, valueOf2, valueOf3, Double.valueOf(mVar4.getLatitude()));
        List b03 = C7714v.b0(Double.valueOf(mVar.getLongitude()), Double.valueOf(mVar2.getLongitude()), Double.valueOf(mVar3.getLongitude()), Double.valueOf(mVar4.getLongitude()));
        List list = b02;
        return new Bounds(C7714v.j0(b03), C7714v.f0(b03), C7714v.j0(list), C7714v.f0(list));
    }

    public final boolean b(@NotNull i other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return ((Bounds) this.f104433e.getValue()).contains((Bounds) other.f104433e.getValue());
    }

    public final boolean c(@NotNull m position) {
        Intrinsics.checkNotNullParameter(position, "position");
        return ((Bounds) this.f104433e.getValue()).contains(position.getLongitude(), position.getLatitude());
    }

    @NotNull
    public final m d() {
        return this.f104432d;
    }

    @NotNull
    public final m e() {
        return this.f104431c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f104429a, iVar.f104429a) && Intrinsics.d(this.f104430b, iVar.f104430b) && Intrinsics.d(this.f104431c, iVar.f104431c) && Intrinsics.d(this.f104432d, iVar.f104432d);
    }

    @NotNull
    public final m f() {
        return this.f104429a;
    }

    @NotNull
    public final m g() {
        return this.f104430b;
    }

    public final int hashCode() {
        return this.f104432d.hashCode() + ((this.f104431c.hashCode() + ((this.f104430b.hashCode() + (this.f104429a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "CameraVisibleArea(topLeft=" + this.f104429a + ", topRight=" + this.f104430b + ", bottomRight=" + this.f104431c + ", bottomLeft=" + this.f104432d + ")";
    }
}
