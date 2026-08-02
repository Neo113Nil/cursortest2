package ru.ozon.android.composerCommonViewKit.emptyState.v2.data.timers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model.TimerTextTemplate;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/timers/TemplateParseResult;", "", "NoPlaceholder", "Invalid", "Parsed", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/timers/TemplateParseResult$Invalid;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/timers/TemplateParseResult$NoPlaceholder;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/timers/TemplateParseResult$Parsed;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface TemplateParseResult {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/timers/TemplateParseResult$Invalid;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/timers/TemplateParseResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Invalid implements TemplateParseResult {

        @NotNull
        public static final Invalid INSTANCE = new Invalid();

        private Invalid() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Invalid);
        }

        public int hashCode() {
            return -424172165;
        }

        @NotNull
        public String toString() {
            return "Invalid";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/timers/TemplateParseResult$NoPlaceholder;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/timers/TemplateParseResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoPlaceholder implements TemplateParseResult {

        @NotNull
        public static final NoPlaceholder INSTANCE = new NoPlaceholder();

        private NoPlaceholder() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NoPlaceholder);
        }

        public int hashCode() {
            return -1003377290;
        }

        @NotNull
        public String toString() {
            return "NoPlaceholder";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/timers/TemplateParseResult$Parsed;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/timers/TemplateParseResult;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/TimerTextTemplate;", "template", "<init>", "(Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/TimerTextTemplate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/TimerTextTemplate;", "getTemplate", "()Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/TimerTextTemplate;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Parsed implements TemplateParseResult {

        @NotNull
        private final TimerTextTemplate template;

        public Parsed(@NotNull TimerTextTemplate template) {
            Intrinsics.checkNotNullParameter(template, "template");
            this.template = template;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Parsed) && Intrinsics.d(this.template, ((Parsed) other).template);
        }

        @NotNull
        public final TimerTextTemplate getTemplate() {
            return this.template;
        }

        public int hashCode() {
            return this.template.hashCode();
        }

        @NotNull
        public String toString() {
            return "Parsed(template=" + this.template + ")";
        }
    }
}
