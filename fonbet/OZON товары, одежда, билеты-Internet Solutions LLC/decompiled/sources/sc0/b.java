package sc0;

import Sc.InterfaceC4008j;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rc0.C9246c;
import ru.ozon.id.nativeauth.crossApp.migration.data.api.PublicKeyBindMobileApi;
import ru.ozon.id.nativeauth.crossApp.migration.data.model.PublicKeyBindMobileRequestDto;
import ru.ozon.id.nativeauth.crossApp.migration.data.model.PublicKeyBindMobileResponseDto;
import tc0.EnumC9809a;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<PublicKeyBindMobileApi> f98555a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull InterfaceC4008j<? extends PublicKeyBindMobileApi> publicKeyBindMobileApi) {
        Intrinsics.checkNotNullParameter(publicKeyBindMobileApi, "publicKeyBindMobileApi");
        this.f98555a = publicKeyBindMobileApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull List list, @NotNull EnumC9809a enumC9809a, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9657a c9657a;
        int i11;
        if (cVar instanceof C9657a) {
            c9657a = (C9657a) cVar;
            int i12 = c9657a.f98554f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9657a.f98554f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9657a.f98552d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9657a.f98554f;
                if (i11 != 0) {
                    s.b(obj);
                    PublicKeyBindMobileRequestDto publicKeyBindMobileRequestDto = new PublicKeyBindMobileRequestDto(list);
                    PublicKeyBindMobileApi value = this.f98555a.getValue();
                    String a11 = enumC9809a.a();
                    c9657a.f98554f = 1;
                    obj = value.bind(a11, publicKeyBindMobileRequestDto, C9246c.f83290a, c9657a);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                List<String> authPublicKeys = ((PublicKeyBindMobileResponseDto) obj).getAuthPublicKeys();
                return authPublicKeys != null ? K.f71697a : authPublicKeys;
            }
        }
        c9657a = new C9657a(this, cVar);
        Object obj2 = c9657a.f98552d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9657a.f98554f;
        if (i11 != 0) {
        }
        List<String> authPublicKeys2 = ((PublicKeyBindMobileResponseDto) obj2).getAuthPublicKeys();
        if (authPublicKeys2 != null) {
        }
    }
}
