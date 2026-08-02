package ru.ozon.app.android.composer.configurators;

import Ae.B0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import He.b;
import Sc.s;
import Wc.a;
import android.net.Uri;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.D;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.storage.cookiePreference.RefreshByGenderCookieEvents;
import xe.C10720e0;
import xe.N;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/composer/configurators/RefreshByGenderConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "refreshByGenderEvents", "Lru/ozon/app/android/storage/cookiePreference/RefreshByGenderCookieEvents;", "<init>", "(Lru/ozon/app/android/storage/cookiePreference/RefreshByGenderCookieEvents;)V", "onComposerInitialized", "", "clearQueryExceptMiniapp", "", ImagesContract.URL, "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefreshByGenderConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final RefreshByGenderCookieEvents refreshByGenderEvents;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/composer/configurators/RefreshByGenderConfigurator$Companion;", "", "<init>", "()V", "MINIAPP_QUERY_PARAM", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public RefreshByGenderConfigurator(@NotNull RefreshByGenderCookieEvents refreshByGenderEvents) {
        Intrinsics.checkNotNullParameter(refreshByGenderEvents, "refreshByGenderEvents");
        this.refreshByGenderEvents = refreshByGenderEvents;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String clearQueryExceptMiniapp(String url) {
        if (url == null) {
            return null;
        }
        Uri parse = Uri.parse(url);
        String queryParameter = parse.getQueryParameter("miniapp");
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        buildUpon.appendQueryParameter("miniapp", queryParameter);
        return buildUpon.build().toString();
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        final B0<String> flow = this.refreshByGenderEvents.getFlow();
        C2408n0 c2408n0 = new C2408n0(C2399j.o(C5427n.a(new InterfaceC2395h<String>() { // from class: ru.ozon.app.android.composer.configurators.RefreshByGenderConfigurator$onComposerInitialized$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.composer.configurators.RefreshByGenderConfigurator$onComposerInitialized$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ RefreshByGenderConfigurator this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.composer.configurators.RefreshByGenderConfigurator$onComposerInitialized$$inlined$filter$1$2", f = "RefreshByGenderConfigurator.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.composer.configurators.RefreshByGenderConfigurator$onComposerInitialized$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes11.dex */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, RefreshByGenderConfigurator refreshByGenderConfigurator) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = refreshByGenderConfigurator;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
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
                                if (this.this$0.getOwner().getLifecycle().b() != AbstractC5434v.b.RESUMED) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
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
            public Object collect(InterfaceC2397i<? super String> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, getOwner().getLifecycle(), AbstractC5434v.b.STARTED)), new RefreshByGenderConfigurator$onComposerInitialized$2(this, null));
        D a11 = K.a(getOwner());
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2399j.C(c2408n0, N.g(a11, b.f10879b));
    }
}
