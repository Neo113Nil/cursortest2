package ei;

import ag.c;
import h8.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9258a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f9259b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f9260c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f9261d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f9262e;

    public a() {
        Intrinsics.checkNotNullParameter(ni.a.f21051a, "<this>");
        byte[] byteArray = new byte[16];
        dg.a.f8373a.nextBytes(byteArray);
        Intrinsics.checkNotNullParameter(byteArray, "randomBytes");
        byte b10 = (byte) (byteArray[6] & 15);
        byteArray[6] = b10;
        byteArray[6] = (byte) (b10 | 64);
        byte b11 = (byte) (byteArray[8] & Utf8.REPLACEMENT_BYTE);
        byteArray[8] = b11;
        byteArray[8] = (byte) (b11 | ByteCompanionObject.MIN_VALUE);
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        long r5 = b.r(0, byteArray);
        long r6 = b.r(8, byteArray);
        this.f9258a = ((r5 == 0 && r6 == 0) ? dg.b.f8375d : new dg.b(r5, r6)).toString();
        this.f9259b = new LinkedHashSet();
        this.f9260c = new LinkedHashMap();
        this.f9261d = new LinkedHashSet();
        this.f9262e = new ArrayList();
    }

    public final void a(ci.b factory) {
        Intrinsics.checkNotNullParameter(factory, "instanceFactory");
        ai.a aVar = factory.f3946a;
        c cVar = aVar.f183b;
        gi.a aVar2 = aVar.f184c;
        gi.a aVar3 = aVar.f182a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(li.a.a(cVar));
        sb2.append(':');
        sb2.append(aVar2 != null ? aVar2.f10338a : "");
        sb2.append(':');
        sb2.append(aVar3);
        String mapping = sb2.toString();
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f9260c.put(mapping, factory);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return Intrinsics.areEqual(this.f9258a, ((a) obj).f9258a);
    }

    public final int hashCode() {
        return this.f9258a.hashCode();
    }
}
