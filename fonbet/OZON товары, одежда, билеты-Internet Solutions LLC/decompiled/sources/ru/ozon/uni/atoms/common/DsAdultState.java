package ru.ozon.uni.atoms.common;

import Ae.O0;
import Ae.x0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/atoms/common/DsAdultState;", "", "<init>", "()V", "LAe/x0;", "", "isUserAnAdult", "LAe/x0;", "()LAe/x0;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsAdultState {

    @NotNull
    public static final DsAdultState INSTANCE = new DsAdultState();

    @NotNull
    private static final x0<Boolean> isUserAnAdult = O0.a(Boolean.FALSE);
    public static final int $stable = 8;

    private DsAdultState() {
    }

    @NotNull
    public final x0<Boolean> isUserAnAdult() {
        return isUserAnAdult;
    }
}
