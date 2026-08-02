package Y8;

import a9.C1924a;
import com.giphy.sdk.core.models.enums.RenditionType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f14089a = new d();

    public final RenditionType a(String str) {
        if (str != null) {
            for (RenditionType renditionType : RenditionType.values()) {
                if (Intrinsics.areEqual(renditionType.name(), C1924a.f15105a.b(str))) {
                    return renditionType;
                }
            }
        }
        return null;
    }
}
