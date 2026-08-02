package ru.ozon.uni.atoms;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/atoms/AtomFeatures;", "", "<init>", "()V", "sendViewActionIfNotNull", "", "getSendViewActionIfNotNull", "()Z", "setSendViewActionIfNotNull", "(Z)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AtomFeatures {
    private static boolean sendViewActionIfNotNull;

    @NotNull
    public static final AtomFeatures INSTANCE = new AtomFeatures();
    public static final int $stable = 8;

    private AtomFeatures() {
    }

    public final boolean getSendViewActionIfNotNull() {
        return sendViewActionIfNotNull;
    }

    public final void setSendViewActionIfNotNull(boolean z11) {
        sendViewActionIfNotNull = z11;
    }
}
