package dj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class j {

    public static final class a extends j {
    }

    public static final class b extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Exception error) {
            super(0);
            Intrinsics.checkNotNullParameter(error, "error");
        }
    }

    public static final class c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull k ozonInAppReviewStoreType) {
            super(0);
            Intrinsics.checkNotNullParameter(ozonInAppReviewStoreType, "ozonInAppReviewStoreType");
        }
    }

    public /* synthetic */ j(int i11) {
        this();
    }

    private j() {
    }
}
