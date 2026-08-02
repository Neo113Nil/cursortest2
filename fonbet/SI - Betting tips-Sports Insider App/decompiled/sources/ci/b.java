package ci;

import androidx.appcompat.widget.a0;
import b6.o;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final ai.a f3946a;

    public b(ai.a beanDefinition) {
        Intrinsics.checkNotNullParameter(beanDefinition, "beanDefinition");
        this.f3946a = beanDefinition;
    }

    public Object a(a0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        io.sentry.config.a aVar = (io.sentry.config.a) context.f680b;
        StringBuilder sb2 = new StringBuilder("| (+) '");
        ai.a aVar2 = this.f3946a;
        sb2.append(aVar2);
        sb2.append('\'');
        aVar.f(sb2.toString());
        try {
            fi.a aVar3 = (fi.a) context.f684f;
            if (aVar3 == null) {
                aVar3 = new fi.a();
            }
            return aVar2.f185d.invoke((ji.a) context.f681c, aVar3);
        } catch (Exception parent) {
            Intrinsics.checkNotNullParameter(parent, "e");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(parent);
            sb3.append("\n\t");
            StackTraceElement[] stackTrace = parent.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
                if (StringsKt.A(className, "sun.reflect", false)) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb3.append(CollectionsKt.J(arrayList, "\n\t", null, null, null, 62));
            String msg = "* Instance creation error : could not create instance for '" + aVar2 + "': " + sb3.toString();
            aVar.getClass();
            Intrinsics.checkNotNullParameter(msg, "msg");
            aVar.s(di.b.f8384d, msg);
            String msg2 = "Could not create instance for '" + aVar2 + '\'';
            Intrinsics.checkNotNullParameter(msg2, "msg");
            Intrinsics.checkNotNullParameter(parent, "parent");
            throw new o(msg2, parent);
        }
    }

    public abstract Object b(a0 a0Var);
}
