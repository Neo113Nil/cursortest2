package ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model;

import B0.C2454a;
import G.g;
import N3.C3660k;
import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.vm.TimerViewModel;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b(\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/TimerButtonConfig;", "", "", "timerKey", "actionId", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/ActionSignature;", "actionSignature", "", "totalSeconds", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/TimerTextTemplate;", "titleTemplate", "subtitleTemplate", "", "startOnBind", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/ActionSignature;ILru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/TimerTextTemplate;Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/TimerTextTemplate;Z)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/vm/TimerViewModel$TimerState;", "state", "render", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/vm/TimerViewModel$TimerState;)Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTimerKey", "getActionId", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/ActionSignature;", "getActionSignature", "()Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/ActionSignature;", "I", "getTotalSeconds", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/TimerTextTemplate;", "getTitleTemplate", "()Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/TimerTextTemplate;", "getSubtitleTemplate", "Z", "getStartOnBind", "()Z", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TimerButtonConfig {

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionSignature actionSignature;
    private final boolean startOnBind;
    private final TimerTextTemplate subtitleTemplate;

    @NotNull
    private final String timerKey;
    private final TimerTextTemplate titleTemplate;
    private final int totalSeconds;

    public TimerButtonConfig(@NotNull String timerKey, @NotNull String actionId, @NotNull ActionSignature actionSignature, int i11, TimerTextTemplate timerTextTemplate, TimerTextTemplate timerTextTemplate2, boolean z11) {
        Intrinsics.checkNotNullParameter(timerKey, "timerKey");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(actionSignature, "actionSignature");
        this.timerKey = timerKey;
        this.actionId = actionId;
        this.actionSignature = actionSignature;
        this.totalSeconds = i11;
        this.titleTemplate = timerTextTemplate;
        this.subtitleTemplate = timerTextTemplate2;
        this.startOnBind = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerButtonConfig)) {
            return false;
        }
        TimerButtonConfig timerButtonConfig = (TimerButtonConfig) other;
        return Intrinsics.d(this.timerKey, timerButtonConfig.timerKey) && Intrinsics.d(this.actionId, timerButtonConfig.actionId) && Intrinsics.d(this.actionSignature, timerButtonConfig.actionSignature) && this.totalSeconds == timerButtonConfig.totalSeconds && Intrinsics.d(this.titleTemplate, timerButtonConfig.titleTemplate) && Intrinsics.d(this.subtitleTemplate, timerButtonConfig.subtitleTemplate) && this.startOnBind == timerButtonConfig.startOnBind;
    }

    @NotNull
    public final String getActionId() {
        return this.actionId;
    }

    @NotNull
    public final ActionSignature getActionSignature() {
        return this.actionSignature;
    }

    public final boolean getStartOnBind() {
        return this.startOnBind;
    }

    @NotNull
    public final String getTimerKey() {
        return this.timerKey;
    }

    public final int getTotalSeconds() {
        return this.totalSeconds;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.totalSeconds, (this.actionSignature.hashCode() + g.a(this.timerKey.hashCode() * 31, 31, this.actionId)) * 31, 31);
        TimerTextTemplate timerTextTemplate = this.titleTemplate;
        int hashCode = (a11 + (timerTextTemplate == null ? 0 : timerTextTemplate.hashCode())) * 31;
        TimerTextTemplate timerTextTemplate2 = this.subtitleTemplate;
        return Boolean.hashCode(this.startOnBind) + ((hashCode + (timerTextTemplate2 != null ? timerTextTemplate2.hashCode() : 0)) * 31);
    }

    @NotNull
    public final ButtonV3DTO render(@NotNull ButtonV3DTO button, TimerViewModel.TimerState state) {
        Intrinsics.checkNotNullParameter(button, "button");
        int remainingSeconds = state != null ? state.getRemainingSeconds() : this.totalSeconds;
        boolean z11 = false;
        if (state != null && state.getIsActive()) {
            z11 = true;
        }
        TimerTextTemplate timerTextTemplate = this.titleTemplate;
        String render = timerTextTemplate != null ? timerTextTemplate.render(z11, remainingSeconds) : button.getTitle();
        TimerTextTemplate timerTextTemplate2 = this.subtitleTemplate;
        String render2 = timerTextTemplate2 != null ? timerTextTemplate2.render(z11, remainingSeconds) : button.getSubtitle();
        if (render == null) {
            render = button.getTitle();
        }
        return ButtonV3DTO.copy$default(button, null, null, render, render2, null, null, Boolean.valueOf(z11), null, null, null, null, null, null, null, null, null, null, 130995, null);
    }

    @NotNull
    public String toString() {
        String str = this.timerKey;
        String str2 = this.actionId;
        ActionSignature actionSignature = this.actionSignature;
        int i11 = this.totalSeconds;
        TimerTextTemplate timerTextTemplate = this.titleTemplate;
        TimerTextTemplate timerTextTemplate2 = this.subtitleTemplate;
        boolean z11 = this.startOnBind;
        StringBuilder d11 = C3660k.d("TimerButtonConfig(timerKey=", str, ", actionId=", str2, ", actionSignature=");
        d11.append(actionSignature);
        d11.append(", totalSeconds=");
        d11.append(i11);
        d11.append(", titleTemplate=");
        d11.append(timerTextTemplate);
        d11.append(", subtitleTemplate=");
        d11.append(timerTextTemplate2);
        d11.append(", startOnBind=");
        return a.a(")", d11, z11);
    }
}
