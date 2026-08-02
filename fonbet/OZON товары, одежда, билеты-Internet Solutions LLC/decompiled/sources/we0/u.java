package we0;

import Kk.C3532b;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.geometry.LatLng;
import ru.ozon.app.android.geo.map.clusterization.PinMetadata;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;

/* loaded from: classes3.dex */
public final class u implements ClusterItem {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f104471a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final z f104472b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f104473c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f104474d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0<Unit> f104475e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0<Unit> f104476f;

    /* renamed from: g, reason: collision with root package name */
    private final Function1<m, Unit> f104477g;

    /* renamed from: h, reason: collision with root package name */
    private final Function0<Unit> f104478h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f104479i;

    /* renamed from: j, reason: collision with root package name */
    private Object f104480j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f104481k;

    public u(@NotNull m coordinates, @NotNull z displayOptions, Object obj, @NotNull String id2, Function0 function0, Function0 function02, Function1 function1, Function0 function03, boolean z11) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f104471a = coordinates;
        this.f104472b = displayOptions;
        this.f104473c = obj;
        this.f104474d = id2;
        this.f104475e = function0;
        this.f104476f = function02;
        this.f104477g = function1;
        this.f104478h = function03;
        this.f104479i = z11;
    }

    public static u a(u uVar, m mVar, z zVar, PinMetadata pinMetadata, String str, int i11) {
        if ((i11 & 1) != 0) {
            mVar = uVar.f104471a;
        }
        m coordinates = mVar;
        if ((i11 & 2) != 0) {
            zVar = uVar.f104472b;
        }
        z displayOptions = zVar;
        Object obj = pinMetadata;
        if ((i11 & 4) != 0) {
            obj = uVar.f104473c;
        }
        Object obj2 = obj;
        if ((i11 & 8) != 0) {
            str = uVar.f104474d;
        }
        String id2 = str;
        Function0<Unit> function0 = uVar.f104475e;
        Function0<Unit> function02 = uVar.f104476f;
        Function1<m, Unit> function1 = uVar.f104477g;
        Function0<Unit> function03 = uVar.f104478h;
        boolean z11 = (i11 & 256) != 0 ? uVar.f104479i : true;
        uVar.getClass();
        uVar.getClass();
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
        Intrinsics.checkNotNullParameter(id2, "id");
        return new u(coordinates, displayOptions, obj2, id2, function0, function02, function1, function03, z11);
    }

    public final Object b() {
        return this.f104480j;
    }

    @NotNull
    public final m c() {
        return this.f104471a;
    }

    @NotNull
    public final z d() {
        return this.f104472b;
    }

    @NotNull
    public final String e() {
        return this.f104474d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f104471a, uVar.f104471a) && Intrinsics.d(this.f104472b, uVar.f104472b) && Intrinsics.d(this.f104473c, uVar.f104473c) && Intrinsics.d(this.f104474d, uVar.f104474d) && Intrinsics.d(this.f104475e, uVar.f104475e) && Intrinsics.d(this.f104476f, uVar.f104476f) && Intrinsics.d(this.f104477g, uVar.f104477g) && Intrinsics.d(this.f104478h, uVar.f104478h) && this.f104479i == uVar.f104479i;
    }

    @NotNull
    public final LatLng f() {
        m mVar = this.f104471a;
        return new LatLng(mVar.getLatitude(), mVar.getLongitude());
    }

    public final Function0<Unit> g() {
        return this.f104478h;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem
    @NotNull
    public final String getItemId() {
        return this.f104474d;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem
    @NotNull
    public final m getPosition() {
        return this.f104471a;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem
    public final String getSnippet() {
        return null;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem
    public final String getTitle() {
        return null;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem
    public final Float getZIndex() {
        return Float.valueOf(this.f104472b.f());
    }

    public final Function1<m, Unit> h() {
        return this.f104477g;
    }

    public final int hashCode() {
        int hashCode = (this.f104472b.hashCode() + (this.f104471a.hashCode() * 31)) * 31;
        Object obj = this.f104473c;
        int a11 = G.g.a((hashCode + (obj == null ? 0 : obj.hashCode())) * 31, 31, this.f104474d);
        Function0<Unit> function0 = this.f104475e;
        int hashCode2 = (a11 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0<Unit> function02 = this.f104476f;
        int hashCode3 = (hashCode2 + (function02 == null ? 0 : function02.hashCode())) * 31;
        Function1<m, Unit> function1 = this.f104477g;
        int hashCode4 = (hashCode3 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function0<Unit> function03 = this.f104478h;
        return Boolean.hashCode(false) + C3532b.a((hashCode4 + (function03 == null ? 0 : function03.hashCode())) * 31, 31, this.f104479i);
    }

    public final Function0<Unit> i() {
        return this.f104476f;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem
    public final boolean isProcessed() {
        return this.f104481k;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem
    public final boolean isSeparated() {
        return false;
    }

    public final Function0<Unit> j() {
        return this.f104475e;
    }

    public final Object k() {
        return this.f104473c;
    }

    public final boolean l() {
        return this.f104479i;
    }

    public final void m(Object obj) {
        this.f104480j = obj;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MapPlacemark(coordinates=");
        sb2.append(this.f104471a);
        sb2.append(", displayOptions=");
        sb2.append(this.f104472b);
        sb2.append(", userData=");
        sb2.append(this.f104473c);
        sb2.append(", id=");
        sb2.append(this.f104474d);
        sb2.append(", onTap=");
        sb2.append(this.f104475e);
        sb2.append(", onDragStart=");
        sb2.append(this.f104476f);
        sb2.append(", onDragMove=");
        sb2.append(this.f104477g);
        sb2.append(", onDragEnd=");
        sb2.append(this.f104478h);
        sb2.append(", isClickable=");
        return Pk0.a.a(", isDraggable=false)", sb2, this.f104479i);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem
    public final void updateProcessedState(boolean z11) {
        this.f104481k = z11;
    }

    public /* synthetic */ u(m mVar, z zVar, Object obj, String str, Function0 function0, int i11) {
        this(mVar, zVar, (i11 & 4) != 0 ? null : obj, (i11 & 8) != 0 ? UUID.randomUUID().toString() : str, (i11 & 16) != 0 ? null : function0, null, null, null, true);
    }
}
