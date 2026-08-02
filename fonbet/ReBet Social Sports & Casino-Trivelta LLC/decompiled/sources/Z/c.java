package Z;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public abstract class c {

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f14378d = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return null;
        }
    }

    public static final Object a(SemanticsConfiguration semanticsConfiguration, h key) {
        Intrinsics.checkNotNullParameter(semanticsConfiguration, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return semanticsConfiguration.b(key, a.f14378d);
    }
}
