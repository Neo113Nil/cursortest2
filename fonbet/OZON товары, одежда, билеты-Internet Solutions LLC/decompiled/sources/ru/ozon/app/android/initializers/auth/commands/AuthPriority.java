package ru.ozon.app.android.initializers.auth.commands;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/initializers/auth/commands/AuthPriority;", "", "", "sort", "<init>", "(I)V", "I", "getSort", "()I", "Medium", "Low", "Lru/ozon/app/android/initializers/auth/commands/AuthPriority$Low;", "Lru/ozon/app/android/initializers/auth/commands/AuthPriority$Medium;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AuthPriority {
    private final int sort;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/initializers/auth/commands/AuthPriority$Low;", "Lru/ozon/app/android/initializers/auth/commands/AuthPriority;", "<init>", "()V", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Low extends AuthPriority {

        @NotNull
        public static final Low INSTANCE = new Low();

        private Low() {
            super(3, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/initializers/auth/commands/AuthPriority$Medium;", "Lru/ozon/app/android/initializers/auth/commands/AuthPriority;", "<init>", "()V", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Medium extends AuthPriority {

        @NotNull
        public static final Medium INSTANCE = new Medium();

        private Medium() {
            super(2, null);
        }
    }

    public /* synthetic */ AuthPriority(int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11);
    }

    public final int getSort() {
        return this.sort;
    }

    private AuthPriority(int i11) {
        this.sort = i11;
    }
}
