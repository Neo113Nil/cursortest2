package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import org.jetbrains.annotations.NotNull;
import xe.B0;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC9499k extends ru.ozon.android.messenger.framework.presentation.common.view.recycler.u {

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.k$a */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC9499k interfaceC9499k, b bVar, int i11, int i12, int i13) {
            boolean z11 = (i13 & 4) == 0;
            if ((i13 & 8) != 0) {
                i12 = 30;
            }
            interfaceC9499k.y(bVar, i11, z11, i12, (i13 & 16) == 0);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.k$b */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b FORWARD;
        public static final b REFRESH;

        static {
            b bVar = new b("FORWARD", 0);
            FORWARD = bVar;
            b bVar2 = new b("REFRESH", 1);
            REFRESH = bVar2;
            b[] bVarArr = {bVar, bVar2};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    @NotNull
    B0 y(@NotNull b bVar, int i11, boolean z11, int i12, boolean z12);
}
