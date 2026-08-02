package z8;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: z8.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11000c extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11000c(@NonNull String str) {
        super(str);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}
