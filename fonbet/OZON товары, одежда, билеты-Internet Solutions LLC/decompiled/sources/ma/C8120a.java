package ma;

import Sc.r;
import We.L;
import com.vk.id.internal.api.VKIDApiService;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ma.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C8120a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74700a;

    public /* synthetic */ C8120a(int i11) {
        this.f74700a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        r userInfo$lambda$0;
        switch (this.f74700a) {
            case 0:
                userInfo$lambda$0 = VKIDApiService.getUserInfo$lambda$0((L) obj);
                return userInfo$lambda$0;
            default:
                Map.Entry it = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getKey() + "=" + it.getValue();
        }
    }
}
