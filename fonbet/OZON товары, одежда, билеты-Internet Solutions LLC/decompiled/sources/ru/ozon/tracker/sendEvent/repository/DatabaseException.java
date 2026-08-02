package ru.ozon.tracker.sendEvent.repository;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/tracker/sendEvent/repository/DatabaseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "databaseMethod", "", "e", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getDatabaseMethod", "()Ljava/lang/String;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatabaseException extends Exception {

    @NotNull
    private final String databaseMethod;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatabaseException(@NotNull String databaseMethod, @NotNull Throwable e11) {
        super(e11);
        Intrinsics.checkNotNullParameter(databaseMethod, "databaseMethod");
        Intrinsics.checkNotNullParameter(e11, "e");
        this.databaseMethod = databaseMethod;
    }

    @NotNull
    public final String getDatabaseMethod() {
        return this.databaseMethod;
    }
}
