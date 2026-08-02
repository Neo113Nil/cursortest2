package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.b6;
import io.sentry.c2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public s f16757a;

    /* renamed from: b, reason: collision with root package name */
    public List f16758b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f16759c;

    public static d a(d dVar, b6 b6Var) {
        ArrayList arrayList = new ArrayList();
        if (b6Var.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(b6Var.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : b6Var.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (dVar == null) {
            dVar = new d();
        }
        List list = dVar.f16758b;
        if (list == null) {
            dVar.f16758b = new ArrayList(arrayList);
            return dVar;
        }
        list.addAll(arrayList);
        return dVar;
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16757a != null) {
            aVar.u("sdk_info");
            aVar.H(iLogger, this.f16757a);
        }
        if (this.f16758b != null) {
            aVar.u("images");
            aVar.H(iLogger, this.f16758b);
        }
        HashMap hashMap = this.f16759c;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f16759c, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }
}
