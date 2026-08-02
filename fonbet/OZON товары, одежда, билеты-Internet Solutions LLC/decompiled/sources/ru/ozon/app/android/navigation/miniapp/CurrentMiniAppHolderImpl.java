package ru.ozon.app.android.navigation.miniapp;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import BZ.d;
import BZ.e;
import BZ.f;
import Sc.InterfaceC3999a;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolderImpl;", "Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;", "LBZ/e;", "miniAppConfigHolder", "<init>", "(LBZ/e;)V", "LBZ/e;", "LAe/h;", "", "miniAppState", "LAe/h;", "getMiniAppState", "()LAe/h;", "getCurrentMiniApp", "()Ljava/lang/String;", "currentMiniApp", "getCurrentMiniAppExceptMain", "currentMiniAppExceptMain", "", "isMainMiniApp", "()Z", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CurrentMiniAppHolderImpl extends CurrentMiniAppHolder {

    @NotNull
    private final e miniAppConfigHolder;

    @NotNull
    private final InterfaceC2395h<String> miniAppState;

    public CurrentMiniAppHolderImpl(@NotNull e miniAppConfigHolder) {
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        this.miniAppConfigHolder = miniAppConfigHolder;
        final M0<d> h11 = miniAppConfigHolder.h();
        this.miniAppState = new InterfaceC2395h<String>() { // from class: ru.ozon.app.android.navigation.miniapp.CurrentMiniAppHolderImpl$special$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.navigation.miniapp.CurrentMiniAppHolderImpl$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes12.dex */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.app.android.navigation.miniapp.CurrentMiniAppHolderImpl$special$$inlined$map$1$2", f = "CurrentMiniAppHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.navigation.miniapp.CurrentMiniAppHolderImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                String b11 = ((d) obj).b();
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(b11, anonymousClass1) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super String> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
    }

    @Override // ru.ozon.app.android.navigation.miniapp.CurrentMiniAppHolder
    @NotNull
    public String getCurrentMiniApp() {
        return f.a(this.miniAppConfigHolder);
    }

    @Override // ru.ozon.app.android.navigation.miniapp.CurrentMiniAppHolder
    public String getCurrentMiniAppExceptMain() {
        String currentMiniApp = getCurrentMiniApp();
        if (Intrinsics.d(currentMiniApp, "main")) {
            return null;
        }
        return currentMiniApp;
    }

    @Override // ru.ozon.app.android.navigation.miniapp.CurrentMiniAppHolder
    public boolean isMainMiniApp() {
        return MiniAppExtKt.isMain(this.miniAppConfigHolder);
    }
}
