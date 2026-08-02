package ru.ozon.id.nativeauth.crossApp;

import Ae.C2406m0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Jb0.C3383a;
import Kb0.K;
import Sc.InterfaceC4003e;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.appcompat.app.g;
import androidx.lifecycle.D;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import nc0.C8495f;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.crossApp.dto.ModalCrossAppResponseDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import td0.f;
import wd0.C10540a;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/CrossAppAuthActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CrossAppAuthActivity extends g {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f97201k = 0;

    /* renamed from: h, reason: collision with root package name */
    private C3383a f97202h;

    /* renamed from: i, reason: collision with root package name */
    private C10540a f97203i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97204j = k.b(a.f97205b);

    /* loaded from: classes3.dex */
    static final class a extends AbstractC7737t implements Function0<C8495f> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f97205b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final C8495f invoke() {
            K k11 = Tb0.a.f26975d;
            if (k11 != null) {
                return k11.v().f().getValue();
            }
            throw new Lb0.a();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.CrossAppAuthActivity$onCreate$1$1", f = "CrossAppAuthActivity.kt", l = {29}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f97206d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CrossAppAuthActivity f97208a;

            a(CrossAppAuthActivity crossAppAuthActivity) {
                this.f97208a = crossAppAuthActivity;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C3383a c3383a = this.f97208a.f97202h;
                if (c3383a == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ProgressBar crossAppLoaderView = c3383a.f14394b;
                Intrinsics.checkNotNullExpressionValue(crossAppLoaderView, "crossAppLoaderView");
                crossAppLoaderView.setVisibility(booleanValue ? 0 : 8);
                return Unit.f71690a;
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return CrossAppAuthActivity.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f97206d;
            if (i11 == 0) {
                s.b(obj);
                CrossAppAuthActivity crossAppAuthActivity = CrossAppAuthActivity.this;
                InterfaceC2395h<Boolean> n11 = CrossAppAuthActivity.K(crossAppAuthActivity).n();
                a aVar2 = new a(crossAppAuthActivity);
                this.f97206d = 1;
                if (n11.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.CrossAppAuthActivity$onCreate$1$2", f = "CrossAppAuthActivity.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f97209d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CrossAppAuthActivity f97211a;

            a(CrossAppAuthActivity crossAppAuthActivity) {
                this.f97211a = crossAppAuthActivity;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C10540a c10540a = this.f97211a.f97203i;
                if (c10540a != null) {
                    c10540a.a(booleanValue);
                }
                return Unit.f71690a;
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return CrossAppAuthActivity.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f97209d;
            if (i11 == 0) {
                s.b(obj);
                CrossAppAuthActivity crossAppAuthActivity = CrossAppAuthActivity.this;
                InterfaceC2395h<Boolean> p11 = CrossAppAuthActivity.K(crossAppAuthActivity).p();
                a aVar2 = new a(crossAppAuthActivity);
                this.f97209d = 1;
                if (p11.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.CrossAppAuthActivity$onCreate$1$3", f = "CrossAppAuthActivity.kt", l = {DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f97212d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CrossAppAuthActivity f97214a;

            a(CrossAppAuthActivity crossAppAuthActivity) {
                this.f97214a = crossAppAuthActivity;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                CrossAppAuthActivity.M(this.f97214a, (ModalCrossAppResponseDTO.ModalDTO) obj);
                return Unit.f71690a;
            }
        }

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return CrossAppAuthActivity.this.new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f97212d;
            if (i11 == 0) {
                s.b(obj);
                CrossAppAuthActivity crossAppAuthActivity = CrossAppAuthActivity.this;
                C2406m0 o11 = CrossAppAuthActivity.K(crossAppAuthActivity).o();
                a aVar2 = new a(crossAppAuthActivity);
                this.f97212d = 1;
                if (o11.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.CrossAppAuthActivity$onCreate$1$4", f = "CrossAppAuthActivity.kt", l = {32}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class e extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f97215d;

        /* synthetic */ class a implements InterfaceC2397i, InterfaceC7732n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CrossAppAuthActivity f97217a;

            a(CrossAppAuthActivity crossAppAuthActivity) {
                this.f97217a = crossAppAuthActivity;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i11 = CrossAppAuthActivity.f97201k;
                CrossAppAuthActivity crossAppAuthActivity = this.f97217a;
                if (booleanValue) {
                    crossAppAuthActivity.getClass();
                } else {
                    crossAppAuthActivity.finish();
                }
                Unit unit = Unit.f71690a;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                return unit;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC2397i) && (obj instanceof InterfaceC7732n)) {
                    return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.InterfaceC7732n
            public final InterfaceC4003e<?> getFunctionDelegate() {
                return new C7719a(2, this.f97217a, CrossAppAuthActivity.class, "onCrossAppProgressStateChanged", "onCrossAppProgressStateChanged(Z)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return CrossAppAuthActivity.this.new e(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f97215d;
            if (i11 == 0) {
                s.b(obj);
                CrossAppAuthActivity crossAppAuthActivity = CrossAppAuthActivity.this;
                InterfaceC2395h<Boolean> q11 = CrossAppAuthActivity.K(crossAppAuthActivity).q();
                a aVar2 = new a(crossAppAuthActivity);
                this.f97215d = 1;
                if (q11.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public static final C8495f K(CrossAppAuthActivity crossAppAuthActivity) {
        return (C8495f) crossAppAuthActivity.f97204j.getValue();
    }

    public static final void M(CrossAppAuthActivity crossAppAuthActivity, ModalCrossAppResponseDTO.ModalDTO modalDTO) {
        wd0.c cVar = new wd0.c(crossAppAuthActivity);
        ModalCrossAppResponseDTO.ModalDTO.AvatarDTO avatar = modalDTO.getAvatar();
        if ((avatar != null ? avatar.getImage() : null) != null) {
            cVar.n(modalDTO.getAvatar().getImage());
        } else {
            ModalCrossAppResponseDTO.ModalDTO.AvatarDTO avatar2 = modalDTO.getAvatar();
            if ((avatar2 != null ? avatar2.getInitials() : null) != null) {
                cVar.q(modalDTO.getAvatar().getInitials());
            } else {
                ModalCrossAppResponseDTO.ModalDTO.AvatarDTO avatar3 = modalDTO.getAvatar();
                if ((avatar3 != null ? avatar3.getIcon() : null) != null) {
                    cVar.p(modalDTO.getAvatar().getIcon());
                } else {
                    cVar.r(modalDTO.getLogo());
                }
            }
        }
        cVar.w(modalDTO.getTitle());
        cVar.v(modalDTO.getSubtitle());
        cVar.x(TextDTO.TextAlignment.CENTER);
        cVar.u(modalDTO.getCrossAppButton().getTitle(), new ru.ozon.id.nativeauth.crossApp.a(crossAppAuthActivity, modalDTO));
        cVar.o(modalDTO.getEntryButton().getTitle(), new ru.ozon.id.nativeauth.crossApp.b(crossAppAuthActivity, modalDTO));
        cVar.s(new ru.ozon.id.nativeauth.crossApp.c(crossAppAuthActivity));
        cVar.a();
        C10540a z11 = cVar.z();
        crossAppAuthActivity.f97203i = z11;
        z11.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3383a b11 = C3383a.b(getLayoutInflater());
        this.f97202h = b11;
        setContentView(b11.a());
        D a11 = androidx.lifecycle.K.a(this);
        f.b(a11, null, new b(null));
        f.b(a11, null, new c(null));
        f.b(a11, null, new d(null));
        f.b(a11, null, new e(null));
    }
}
