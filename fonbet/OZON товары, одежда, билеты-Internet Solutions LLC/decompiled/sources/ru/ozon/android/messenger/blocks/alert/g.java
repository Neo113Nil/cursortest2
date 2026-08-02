package ru.ozon.android.messenger.blocks.alert;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

/* loaded from: classes10.dex */
public final class g implements ru.ozon.android.messenger.framework.presentation.models.g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f84394a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f84395b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final DisclaimerDTO f84396c;

    static {
        int i11 = DisclaimerDTO.$stable;
    }

    public g(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, Long l11, @NotNull DisclaimerDTO disclaimer) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.f84394a = blockId;
        this.f84395b = l11;
        this.f84396c = disclaimer;
    }

    @NotNull
    public final DisclaimerDTO a() {
        return this.f84396c;
    }

    public final Long b() {
        return this.f84395b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f84394a, gVar.f84394a) && Intrinsics.d(this.f84395b, gVar.f84395b) && Intrinsics.d(this.f84396c, gVar.f84396c);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f84394a;
    }

    public final int hashCode() {
        int hashCode = this.f84394a.hashCode() * 31;
        Long l11 = this.f84395b;
        return this.f84396c.hashCode() + ((hashCode + (l11 == null ? 0 : l11.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        return "AlertVO(blockId=" + this.f84394a + ", ttl=" + this.f84395b + ", disclaimer=" + this.f84396c + ")";
    }
}
