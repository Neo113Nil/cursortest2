package hi;

import com.google.firebase.messaging.x;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final gi.a f10827c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f10828a;

    /* renamed from: b, reason: collision with root package name */
    public final ji.a f10829b;

    static {
        Intrinsics.checkNotNullParameter("_root_", "name");
        f10827c = new gi.a("_root_");
    }

    public a(x _koin) {
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(...)");
        this.f10828a = newSetFromMap;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        gi.a aVar = f10827c;
        ji.a aVar2 = new ji.a(aVar, _koin);
        this.f10829b = aVar2;
        newSetFromMap.add(aVar);
        concurrentHashMap.put("_root_", aVar2);
    }
}
