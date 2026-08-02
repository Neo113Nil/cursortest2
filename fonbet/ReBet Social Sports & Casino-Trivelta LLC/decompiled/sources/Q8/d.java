package Q8;

import com.giphy.sdk.core.models.enums.RenditionType;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f9535a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f9536b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f9537c;

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f9538d;

    /* renamed from: e, reason: collision with root package name */
    public static final ArrayList f9539e;

    static {
        RenditionType renditionType = RenditionType.fixedWidth;
        c cVar = c.TERMINATE;
        f9536b = CollectionsKt.arrayListOf(new f(renditionType, false, cVar));
        f9537c = CollectionsKt.arrayListOf(new f(RenditionType.fixedHeight, false, cVar));
        f9538d = CollectionsKt.arrayListOf(new f(renditionType, false, c.NEXT), new f(RenditionType.original, false, cVar));
        f9539e = CollectionsKt.arrayListOf(new f(RenditionType.fixedWidthSmall, false, cVar));
    }

    public final ArrayList a() {
        return f9539e;
    }

    public final ArrayList b() {
        return f9536b;
    }

    public final List c(RenditionType targetRendition) {
        Intrinsics.checkNotNullParameter(targetRendition, "targetRendition");
        return CollectionsKt.arrayListOf(new f(RenditionType.fixedWidth, false, c.NEXT), new f(targetRendition, false, c.TERMINATE));
    }
}
