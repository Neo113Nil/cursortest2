package ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.compose;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final float f84085a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final TextDTO f84086b;

    public e(float f7, @NotNull TextDTO text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f84085a = f7;
        this.f84086b = text;
    }

    public final float a() {
        return this.f84085a;
    }

    @NotNull
    public final TextDTO b() {
        return this.f84086b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f84085a, eVar.f84085a) == 0 && Intrinsics.d(this.f84086b, eVar.f84086b);
    }

    public final int hashCode() {
        return this.f84086b.hashCode() + (Float.hashCode(this.f84085a) * 31);
    }

    @NotNull
    public final String toString() {
        return "StatusMessagesAnimState(alpha=" + this.f84085a + ", text=" + this.f84086b + ")";
    }
}
