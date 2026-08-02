package k30;

import com.vk.id.VKIDUser;
import com.vk.id.onetap.compose.button.auth.VKIDButtonSmallKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70450a;

    public /* synthetic */ h(int i11) {
        this.f70450a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit VKIDButtonSmall$lambda$2$lambda$1;
        switch (this.f70450a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "<destruct>");
                return "\"" + entry.getKey() + "\": " + i.a(entry.getValue());
            default:
                VKIDButtonSmall$lambda$2$lambda$1 = VKIDButtonSmallKt.VKIDButtonSmall$lambda$2$lambda$1((VKIDUser) obj);
                return VKIDButtonSmall$lambda$2$lambda$1;
        }
    }
}
