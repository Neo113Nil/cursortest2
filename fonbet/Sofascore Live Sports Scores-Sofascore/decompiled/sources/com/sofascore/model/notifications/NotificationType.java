package com.sofascore.model.notifications;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/sofascore/model/notifications/NotificationType;", "", "label", "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "FantasyRoundRevealAvailable", "FantasyDeadlineCountdown", "Lcom/sofascore/model/notifications/NotificationType$FantasyDeadlineCountdown;", "Lcom/sofascore/model/notifications/NotificationType$FantasyRoundRevealAvailable;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class NotificationType {

    @NotNull
    private final String label;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/sofascore/model/notifications/NotificationType$FantasyDeadlineCountdown;", "Lcom/sofascore/model/notifications/NotificationType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FantasyDeadlineCountdown extends NotificationType {

        @NotNull
        public static final FantasyDeadlineCountdown INSTANCE = new FantasyDeadlineCountdown();

        private FantasyDeadlineCountdown() {
            super("fantasy_silent_transfer_deadline_counter", null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof FantasyDeadlineCountdown);
        }

        public int hashCode() {
            return -274576207;
        }

        @NotNull
        public String toString() {
            return "FantasyDeadlineCountdown";
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/sofascore/model/notifications/NotificationType$FantasyRoundRevealAvailable;", "Lcom/sofascore/model/notifications/NotificationType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FantasyRoundRevealAvailable extends NotificationType {

        @NotNull
        public static final FantasyRoundRevealAvailable INSTANCE = new FantasyRoundRevealAvailable();

        private FantasyRoundRevealAvailable() {
            super("fantasy_round_reveal_available", null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof FantasyRoundRevealAvailable);
        }

        public int hashCode() {
            return -724352746;
        }

        @NotNull
        public String toString() {
            return "FantasyRoundRevealAvailable";
        }
    }

    private NotificationType(String str) {
        this.label = str;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public /* synthetic */ NotificationType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
