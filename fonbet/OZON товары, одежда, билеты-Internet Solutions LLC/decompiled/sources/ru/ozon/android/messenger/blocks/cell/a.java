package ru.ozon.android.messenger.blocks.cell;

import Sc.o;
import android.content.Context;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.viewmapper.e;
import ru.ozon.android.messenger.framework.domain.f;
import ru.ozon.android.messenger.framework.presentation.models.h;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.u;
import ru.ozon.app.android.messenger.R$string;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f84453a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.b f84454b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ru.ozon.android.messenger.blocks.cell.a$a, reason: collision with other inner class name */
    public static final class EnumC1474a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC1474a[] $VALUES;
        public static final EnumC1474a HIDE_READ;

        static {
            EnumC1474a enumC1474a = new EnumC1474a("HIDE_READ", 0);
            HIDE_READ = enumC1474a;
            EnumC1474a[] enumC1474aArr = {enumC1474a};
            $VALUES = enumC1474aArr;
            $ENTRIES = Xc.b.a(enumC1474aArr);
        }

        private EnumC1474a() {
            throw null;
        }

        public static EnumC1474a valueOf(String str) {
            return (EnumC1474a) Enum.valueOf(EnumC1474a.class, str);
        }

        public static EnumC1474a[] values() {
            return (EnumC1474a[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84455a;

        static {
            int[] iArr = new int[EnumC1474a.values().length];
            try {
                iArr[EnumC1474a.HIDE_READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f84455a = iArr;
        }
    }

    public a(@NotNull Context context, @NotNull ru.ozon.android.messenger.framework.data.b blockStore) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blockStore, "blockStore");
        this.f84453a = context;
        this.f84454b = blockStore;
    }

    @NotNull
    public final q a(@NotNull EnumC1474a cell, @NotNull String cellItemId) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(cellItemId, "cellItemId");
        if (b.f84455a[cell.ordinal()] != 1) {
            throw new o();
        }
        return new q(C7714v.a0(new u(new c(h.a(cellItemId), ru.ozon.android.messenger.utils.c.d(R$string.messenger_hide_read, this.f84453a), false), ru.ozon.android.messenger.framework.data.d.g(this.f84454b, f.b.CELL), e.a.f87374a)), new p(cellItemId, 1, 0.0d));
    }
}
