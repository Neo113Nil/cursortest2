package ru.ozon.app.android.pikazon.glide.loadPriority;

import Sc.o;
import com.bumptech.glide.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;", "Lcom/bumptech/glide/i;", "toGlideValue", "(Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;)Lcom/bumptech/glide/i;", "lib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LoadPriorityExtKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadPriority.values().length];
            try {
                iArr[LoadPriority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadPriority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadPriority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final i toGlideValue(@NotNull LoadPriority loadPriority) {
        Intrinsics.checkNotNullParameter(loadPriority, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[loadPriority.ordinal()];
        if (i11 == 1) {
            return i.LOW;
        }
        if (i11 == 2) {
            return i.NORMAL;
        }
        if (i11 == 3) {
            return i.HIGH;
        }
        throw new o();
    }
}
