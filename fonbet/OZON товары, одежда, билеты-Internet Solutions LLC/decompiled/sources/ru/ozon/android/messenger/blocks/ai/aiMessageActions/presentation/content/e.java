package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content;

import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final BadgeDTO f84009a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<a> f84010b;

    public e() {
        this(0);
    }

    @NotNull
    public final List<a> a() {
        return this.f84010b;
    }

    public final BadgeDTO b() {
        return this.f84009a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f84009a, eVar.f84009a) && Intrinsics.d(this.f84010b, eVar.f84010b);
    }

    public final int hashCode() {
        BadgeDTO badgeDTO = this.f84009a;
        return this.f84010b.hashCode() + ((badgeDTO == null ? 0 : badgeDTO.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "AiMessageActionsState(badge=" + this.f84009a + ", actionButtons=" + this.f84010b + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(BadgeDTO badgeDTO, @NotNull List<? extends a> actionButtons) {
        Intrinsics.checkNotNullParameter(actionButtons, "actionButtons");
        this.f84009a = badgeDTO;
        this.f84010b = actionButtons;
    }

    public e(int i11) {
        this(null, K.f71697a);
    }
}
