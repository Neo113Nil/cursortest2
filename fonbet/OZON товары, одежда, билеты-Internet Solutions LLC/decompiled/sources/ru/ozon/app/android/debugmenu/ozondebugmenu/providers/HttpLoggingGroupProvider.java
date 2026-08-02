package ru.ozon.app.android.debugmenu.ozondebugmenu.providers;

import U20.a;
import U20.b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r20.AbstractC9166c;
import ru.ozon.app.android.storage.logging.HttpLoggingLevelStorage;
import ru.ozon.app.android.storage.logging.LoggingLevel;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/HttpLoggingGroupProvider;", "Lr20/c;", "Lru/ozon/app/android/storage/logging/HttpLoggingLevelStorage;", "httpLoggingLevelStorage", "<init>", "(Lru/ozon/app/android/storage/logging/HttpLoggingLevelStorage;)V", "LU20/a;", "provide", "()LU20/a;", "Lru/ozon/app/android/storage/logging/HttpLoggingLevelStorage;", "Companion", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HttpLoggingGroupProvider extends AbstractC9166c {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final HttpLoggingLevelStorage httpLoggingLevelStorage;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/HttpLoggingGroupProvider$Companion;", "", "<init>", "()V", "HTTP_LOGGING", "", "GROUP", "RADIO", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public HttpLoggingGroupProvider(@NotNull HttpLoggingLevelStorage httpLoggingLevelStorage) {
        Intrinsics.checkNotNullParameter(httpLoggingLevelStorage, "httpLoggingLevelStorage");
        this.httpLoggingLevelStorage = httpLoggingLevelStorage;
    }

    @Override // r20.AbstractC9166c
    @NotNull
    public a provide() {
        int i11 = 0;
        LoggingLevel[] loggingLevelArr = (LoggingLevel[]) LoggingLevel.getEntries().toArray(new LoggingLevel[0]);
        int length = loggingLevelArr.length;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            if (loggingLevelArr[i11].getValue() == this.httpLoggingLevelStorage.getLevel().getValue()) {
                break;
            }
            i11++;
        }
        Xc.a<LoggingLevel> entries = LoggingLevel.getEntries();
        ArrayList arrayList = new ArrayList(C7714v.z(entries, 10));
        for (LoggingLevel loggingLevel : entries) {
            arrayList.add(new b.h.a(Nk.a.b("httpLoggingRadio", loggingLevel.name()), loggingLevel.name()));
        }
        return new a("httpLoggingGroup", "HTTP Logging", C7714v.a0(new b.h(arrayList, i11, new HttpLoggingGroupProvider$provide$2(this, loggingLevelArr))));
    }
}
