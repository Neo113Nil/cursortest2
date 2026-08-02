package X;

import B.E;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final a f13348c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final LayoutNode f13349a;

    /* renamed from: b, reason: collision with root package name */
    public final B.s f13350b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public e(LayoutNode layoutNode) {
        B.s b10;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f13349a = layoutNode;
        b10 = E.b(null, null, 2, null);
        this.f13350b = b10;
    }
}
