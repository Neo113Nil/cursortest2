package ru.ozon.android.messenger.blocks.chat.common;

import Sc.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chat.common.UnreadCountIndicatorDTO;

/* loaded from: classes10.dex */
public final class l {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84552a;

        static {
            int[] iArr = new int[UnreadCountIndicatorDTO.a.values().length];
            try {
                iArr[UnreadCountIndicatorDTO.a.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UnreadCountIndicatorDTO.a.INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UnreadCountIndicatorDTO.a.MUTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f84552a = iArr;
        }
    }

    @NotNull
    public static final m a(@NotNull UnreadCountIndicatorDTO unreadCountIndicatorDTO) {
        n nVar;
        Intrinsics.checkNotNullParameter(unreadCountIndicatorDTO, "<this>");
        int value = unreadCountIndicatorDTO.getValue();
        UnreadCountIndicatorDTO.a type = unreadCountIndicatorDTO.getType();
        Intrinsics.checkNotNullParameter(type, "<this>");
        int i11 = a.f84552a[type.ordinal()];
        if (i11 == 1) {
            nVar = n.ACTIVE;
        } else {
            if (i11 != 2 && i11 != 3) {
                throw new o();
            }
            nVar = n.MUTED;
        }
        return new m(value, nVar);
    }
}
