package io.sentry.android.replay.viewhierarchy;

import androidx.compose.ui.node.LayoutNode;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f16155e = new a(0);

    public static Method b() {
        try {
            Method declaredMethod = LayoutNode.class.getDeclaredMethod("getSemanticsConfiguration", null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        return b();
    }
}
