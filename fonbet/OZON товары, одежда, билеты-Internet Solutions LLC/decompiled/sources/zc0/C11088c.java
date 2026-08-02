package zc0;

import Sc.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.id.nativeauth.data.models.a;
import ru.ozon.id.nativeauth.data.models.b;

/* renamed from: zc0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11088c {

    /* renamed from: zc0.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f108793a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f108794b;

        static {
            int[] iArr = new int[a.EnumC2132a.values().length];
            try {
                iArr[a.EnumC2132a.RELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC2132a.DEEPLINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EnumC2132a.ACTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f108793a = iArr;
            int[] iArr2 = new int[EntryDTO.b.values().length];
            try {
                iArr2[EntryDTO.b.VKID.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EntryDTO.b.VKID_ONE_TAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f108794b = iArr2;
        }
    }

    @NotNull
    public static final b.InterfaceC2133b a(@NotNull EntryDTO.EntryButtonDTO entryButtonDTO) {
        Intrinsics.checkNotNullParameter(entryButtonDTO, "<this>");
        int i11 = a.f108793a[entryButtonDTO.getType().ordinal()];
        if (i11 == 1) {
            String deeplink = entryButtonDTO.getDeeplink();
            if (deeplink != null) {
                return new b.InterfaceC2133b.d(entryButtonDTO.getTitle(), deeplink);
            }
            throw new IllegalArgumentException("`deeplink` field should be not null with `type` = 'reload'");
        }
        if (i11 == 2) {
            String deeplink2 = entryButtonDTO.getDeeplink();
            if (deeplink2 != null) {
                return new b.InterfaceC2133b.c(entryButtonDTO.getTitle(), deeplink2, entryButtonDTO.getTrackClick());
            }
            throw new IllegalArgumentException("`deeplink` field should be not null with `type` = 'deeplink'");
        }
        if (i11 != 3) {
            throw new o();
        }
        String action = entryButtonDTO.getAction();
        if (action != null) {
            return new b.InterfaceC2133b.a(entryButtonDTO.getTitle(), action, entryButtonDTO.getData());
        }
        throw new IllegalArgumentException("`action` field should be not null with `type` = 'action'");
    }
}
