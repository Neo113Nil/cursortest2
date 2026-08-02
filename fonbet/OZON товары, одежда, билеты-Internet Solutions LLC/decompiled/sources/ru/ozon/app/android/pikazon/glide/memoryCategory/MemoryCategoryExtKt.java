package ru.ozon.app.android.pikazon.glide.memoryCategory;

import Sc.o;
import com.bumptech.glide.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pikazon/glide/memoryCategory/MemoryCategory;", "Lcom/bumptech/glide/h;", "toGlideValue", "(Lru/ozon/app/android/pikazon/glide/memoryCategory/MemoryCategory;)Lcom/bumptech/glide/h;", "lib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MemoryCategoryExtKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MemoryCategory.values().length];
            try {
                iArr[MemoryCategory.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MemoryCategory.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MemoryCategory.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final h toGlideValue(@NotNull MemoryCategory memoryCategory) {
        Intrinsics.checkNotNullParameter(memoryCategory, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[memoryCategory.ordinal()];
        if (i11 == 1) {
            return h.LOW;
        }
        if (i11 == 2) {
            return h.NORMAL;
        }
        if (i11 == 3) {
            return h.HIGH;
        }
        throw new o();
    }
}
