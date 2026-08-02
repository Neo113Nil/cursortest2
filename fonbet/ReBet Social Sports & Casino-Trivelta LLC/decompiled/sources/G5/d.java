package G5;

import G5.CoralogixAndroidStackFrame;
import G5.CoralogixDartObfuscatedStackFrame;
import G5.CoralogixJsStackFrame;
import Zh.InterfaceC1901b;
import Zh.l;
import Zh.n;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@n
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0082\u0001\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"LG5/d;", "", "Companion", "a", "LG5/a;", "LG5/b;", "LG5/c;", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface d {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f3894a;

    /* renamed from: G5.d$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f3894a = new Companion();

        @NotNull
        public final InterfaceC1901b serializer() {
            return new l("com.coralogix.android.sdk.internal.infrastructure.threaddump.CoralogixStackFrame", Reflection.getOrCreateKotlinClass(d.class), new KClass[]{Reflection.getOrCreateKotlinClass(CoralogixAndroidStackFrame.class), Reflection.getOrCreateKotlinClass(CoralogixDartObfuscatedStackFrame.class), Reflection.getOrCreateKotlinClass(CoralogixJsStackFrame.class)}, new InterfaceC1901b[]{CoralogixAndroidStackFrame.C0083a.f3886a, CoralogixDartObfuscatedStackFrame.a.f3888a, CoralogixJsStackFrame.a.f3893a}, new Annotation[0]);
        }
    }
}
