package ru.ozon.android.messenger.blocks.paginationerror;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/android/messenger/blocks/paginationerror/PaginationErrorDTO;", "", "Lru/ozon/android/messenger/blocks/paginationerror/PaginationErrorDTO$a;", "type", "<init>", "(Lru/ozon/android/messenger/blocks/paginationerror/PaginationErrorDTO$a;)V", "Lru/ozon/android/messenger/blocks/paginationerror/PaginationErrorDTO$a;", "getType", "()Lru/ozon/android/messenger/blocks/paginationerror/PaginationErrorDTO$a;", "a", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PaginationErrorDTO {
    public static final int $stable = 0;

    @NotNull
    private final a type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a BOTTOM;
        public static final a TOP;

        static {
            a aVar = new a("TOP", 0);
            TOP = aVar;
            a aVar2 = new a("BOTTOM", 1);
            BOTTOM = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public PaginationErrorDTO(@NotNull a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
    }

    @NotNull
    public final a getType() {
        return this.type;
    }
}
