package ru.ozon.app.android.initializers.logger;

import Ec.e;
import Sc.o;
import Uy.a;
import io.reactivex.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nc.C8488c;
import nc.InterfaceC8487b;
import nf.C8590c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.startup.initializers.ActionInitializer;
import ru.ozon.app.android.storage.logging.HttpLoggingLevelStorage;
import ru.ozon.app.android.storage.logging.LoggingLevel;
import sc.C9653a;
import sc.C9656b;
import wc.v;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/initializers/logger/HttpLoggingActionIntializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "Lnf/c;", "httpLoggingInterceptor", "Lru/ozon/app/android/storage/logging/HttpLoggingLevelStorage;", "httpLoggingLevelStorage", "<init>", "(Lnf/c;Lru/ozon/app/android/storage/logging/HttpLoggingLevelStorage;)V", "Lru/ozon/app/android/storage/logging/LoggingLevel;", "it", "Lnf/c$a;", "map", "(Lru/ozon/app/android/storage/logging/LoggingLevel;)Lnf/c$a;", "", "init", "()V", "Lnf/c;", "Lru/ozon/app/android/storage/logging/HttpLoggingLevelStorage;", "Lnc/b;", "disposable", "Lnc/b;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpLoggingActionIntializer implements ActionInitializer {

    @NotNull
    private InterfaceC8487b disposable;

    @NotNull
    private final C8590c httpLoggingInterceptor;

    @NotNull
    private final HttpLoggingLevelStorage httpLoggingLevelStorage;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoggingLevel.values().length];
            try {
                iArr[LoggingLevel.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoggingLevel.BASIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoggingLevel.HEADERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoggingLevel.BODY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HttpLoggingActionIntializer(@NotNull C8590c httpLoggingInterceptor, @NotNull HttpLoggingLevelStorage httpLoggingLevelStorage) {
        Intrinsics.checkNotNullParameter(httpLoggingInterceptor, "httpLoggingInterceptor");
        Intrinsics.checkNotNullParameter(httpLoggingLevelStorage, "httpLoggingLevelStorage");
        this.httpLoggingInterceptor = httpLoggingInterceptor;
        this.httpLoggingLevelStorage = httpLoggingLevelStorage;
        InterfaceC8487b a11 = C8488c.a(C9653a.f98522b);
        Intrinsics.checkNotNullExpressionValue(a11, "empty(...)");
        this.disposable = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C8590c.a map(LoggingLevel it) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[it.ordinal()];
        if (i11 == 1) {
            return C8590c.a.NONE;
        }
        if (i11 == 2) {
            return C8590c.a.BASIC;
        }
        if (i11 == 3) {
            return C8590c.a.HEADERS;
        }
        if (i11 == 4) {
            return C8590c.a.BODY;
        }
        throw new o();
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        this.disposable.dispose();
        h<LoggingLevel> observeLevel = this.httpLoggingLevelStorage.observeLevel();
        a aVar = new a(new HttpLoggingActionIntializer$init$1(this));
        OJ.a aVar2 = new OJ.a(new HttpLoggingActionIntializer$init$2(Lm0.a.f17149a), 2);
        v vVar = v.INSTANCE;
        observeLevel.getClass();
        C9656b.c(vVar, "onSubscribe is null");
        e eVar = new e(aVar, aVar2, vVar);
        observeLevel.i(eVar);
        this.disposable = eVar;
    }
}
