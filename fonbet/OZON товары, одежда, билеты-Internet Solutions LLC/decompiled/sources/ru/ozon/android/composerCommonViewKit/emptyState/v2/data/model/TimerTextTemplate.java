package ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model;

import C.o0;
import G.g;
import V.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/TimerTextTemplate;", "", "", "totalSeconds", "", "activeText", "nonActiveText", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "seconds", "formatAsTimer", "(I)Ljava/lang/String;", "", "isActive", "remainingSeconds", "render", "(ZI)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getTotalSeconds", "Ljava/lang/String;", "getActiveText", "getNonActiveText", "Companion", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TimerTextTemplate {

    @NotNull
    private final String activeText;
    private final String nonActiveText;
    private final int totalSeconds;

    public TimerTextTemplate(int i11, @NotNull String activeText, String str) {
        Intrinsics.checkNotNullParameter(activeText, "activeText");
        this.totalSeconds = i11;
        this.activeText = activeText;
        this.nonActiveText = str;
    }

    private final String formatAsTimer(int seconds) {
        if (seconds < 0) {
            seconds = 0;
        }
        return e.b(new Object[]{Integer.valueOf(seconds / 60), Integer.valueOf(seconds % 60)}, 2, "%02d:%02d", "format(...)");
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerTextTemplate)) {
            return false;
        }
        TimerTextTemplate timerTextTemplate = (TimerTextTemplate) other;
        return this.totalSeconds == timerTextTemplate.totalSeconds && Intrinsics.d(this.activeText, timerTextTemplate.activeText) && Intrinsics.d(this.nonActiveText, timerTextTemplate.nonActiveText);
    }

    public final int getTotalSeconds() {
        return this.totalSeconds;
    }

    public int hashCode() {
        int a11 = g.a(Integer.hashCode(this.totalSeconds) * 31, 31, this.activeText);
        String str = this.nonActiveText;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    public final String render(boolean isActive, int remainingSeconds) {
        return isActive ? h.X(this.activeText, "$timer", formatAsTimer(remainingSeconds), false) : this.nonActiveText;
    }

    @NotNull
    public String toString() {
        int i11 = this.totalSeconds;
        String str = this.activeText;
        return o0.c(Cm.e.g(i11, "TimerTextTemplate(totalSeconds=", ", activeText=", str, ", nonActiveText="), this.nonActiveText, ")");
    }
}
