package ze;

import android.content.Context;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f25936a;

    /* renamed from: b, reason: collision with root package name */
    public float f25937b;

    /* renamed from: c, reason: collision with root package name */
    public float f25938c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f25940e;

    public f(g gVar, Context context) {
        this.f25940e = gVar;
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25936a = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
