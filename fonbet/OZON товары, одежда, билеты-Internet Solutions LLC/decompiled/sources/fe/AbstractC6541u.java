package fe;

import Od.C3680a;
import he.C6924F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;

/* renamed from: fe.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6541u extends r {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C3680a f63256g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Pd.d f63257h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final M f63258i;

    /* renamed from: j, reason: collision with root package name */
    private Nd.l f63259j;

    /* renamed from: k, reason: collision with root package name */
    private C6924F f63260k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6541u(@NotNull Sd.c fqName, @NotNull ie.o storageManager, @NotNull InterfaceC9815F module, @NotNull Nd.l proto, @NotNull C3680a metadataVersion) {
        super(module, fqName);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.f63256g = metadataVersion;
        Nd.o I11 = proto.I();
        Intrinsics.checkNotNullExpressionValue(I11, "getStrings(...)");
        Nd.n H11 = proto.H();
        Intrinsics.checkNotNullExpressionValue(H11, "getQualifiedNames(...)");
        Pd.d dVar = new Pd.d(I11, H11);
        this.f63257h = dVar;
        this.f63258i = new M(proto, dVar, metadataVersion, new C6539s(this));
        this.f63259j = proto;
    }

    static ArrayList F0(AbstractC6541u abstractC6541u) {
        Set set;
        Collection<Sd.b> b11 = abstractC6541u.f63258i.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b11) {
            Sd.b bVar = (Sd.b) obj;
            if (!bVar.j()) {
                set = C6533l.f63216c;
                if (!set.contains(bVar)) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Sd.b) it.next()).h());
        }
        return arrayList2;
    }

    @Override // fe.r
    public final M C0() {
        return this.f63258i;
    }

    public final void G0(@NotNull C6535n components) {
        Intrinsics.checkNotNullParameter(components, "components");
        Nd.l lVar = this.f63259j;
        if (lVar == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f63259j = null;
        Nd.k G11 = lVar.G();
        Intrinsics.checkNotNullExpressionValue(G11, "getPackage(...)");
        this.f63260k = new C6924F(this, G11, this.f63257h, this.f63256g, null, components, "scope of " + this, new C6540t(this));
    }

    @Override // td.InterfaceC9820K
    @NotNull
    public final ce.l p() {
        C6924F c6924f = this.f63260k;
        if (c6924f != null) {
            return c6924f;
        }
        Intrinsics.n("_memberScope");
        throw null;
    }
}
