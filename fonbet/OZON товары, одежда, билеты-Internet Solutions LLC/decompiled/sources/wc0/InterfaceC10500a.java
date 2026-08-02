package wc0;

import java.util.Map;
import kotlin.coroutines.jvm.internal.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.biometry.data.dto.BiometryEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.LoginErrorActionDTO;

/* renamed from: wc0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC10500a {

    /* renamed from: wc0.a$a, reason: collision with other inner class name */
    public static final class C2252a {
        public static /* synthetic */ Object a(InterfaceC10500a interfaceC10500a, String str, Map map, kotlin.coroutines.jvm.internal.c cVar, int i11) {
            boolean z11;
            String str2;
            kotlin.coroutines.jvm.internal.c cVar2;
            InterfaceC10500a interfaceC10500a2;
            if ((i11 & 2) != 0) {
                map = null;
            }
            Map map2 = map;
            boolean z12 = (i11 & 4) == 0;
            if ((i11 & 8) != 0) {
                z11 = false;
                interfaceC10500a2 = interfaceC10500a;
                cVar2 = cVar;
                str2 = str;
            } else {
                z11 = true;
                str2 = str;
                cVar2 = cVar;
                interfaceC10500a2 = interfaceC10500a;
            }
            return interfaceC10500a2.a(str2, map2, z12, z11, cVar2);
        }
    }

    Object a(@NotNull String str, Map map, boolean z11, boolean z12, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object b(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object c(@NotNull FastEntryActionDTO.FastEntryDataDTO.MobileId mobileId, @NotNull kotlin.coroutines.d<? super FastEntryActionDTO> dVar);

    Object d(@NotNull String str, @NotNull j jVar);

    Object e(@NotNull String str, @NotNull Map map, @NotNull kotlin.coroutines.jvm.internal.c cVar);

    Object f(@NotNull String str, @NotNull kotlin.coroutines.d<? super FastEntryActionDTO> dVar);

    Object g(@NotNull String str, @NotNull kotlin.coroutines.d<? super LoginErrorActionDTO> dVar);

    Object h(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull kotlin.coroutines.d<? super BiometryEntryActionDTO> dVar);
}
