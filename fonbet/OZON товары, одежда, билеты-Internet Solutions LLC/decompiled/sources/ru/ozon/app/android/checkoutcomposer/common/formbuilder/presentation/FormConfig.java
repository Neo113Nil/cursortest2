package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;", "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig$Mode;", "mode", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig$Mode;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig$Mode;", "getMode", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig$Mode;", "Mode", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FormConfig {

    @NotNull
    private final Mode mode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig$Mode;", "", "<init>", "(Ljava/lang/String;I)V", "BORDER_FIELD", "BORDERLESS_FIELD", "BORDERLESS_GRAY_FIELD", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Mode {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode BORDER_FIELD = new Mode("BORDER_FIELD", 0);
        public static final Mode BORDERLESS_FIELD = new Mode("BORDERLESS_FIELD", 1);
        public static final Mode BORDERLESS_GRAY_FIELD = new Mode("BORDERLESS_GRAY_FIELD", 2);

        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{BORDER_FIELD, BORDERLESS_FIELD, BORDERLESS_GRAY_FIELD};
        }

        static {
            Mode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Mode(String str, int i11) {
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    public FormConfig(@NotNull Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.mode = mode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FormConfig) && this.mode == ((FormConfig) other).mode;
    }

    @NotNull
    public final Mode getMode() {
        return this.mode;
    }

    public int hashCode() {
        return this.mode.hashCode();
    }

    @NotNull
    public String toString() {
        return "FormConfig(mode=" + this.mode + ")";
    }
}
