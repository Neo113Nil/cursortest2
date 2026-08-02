package ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import E0.C2942q;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u0003J\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e¢\u0006\u0004\b\u0017\u0010\u0010J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0003J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "addEnteredPhoneToAction", "(Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/uni/atoms/af/AtomAction;", "", "enteredPhone", "formatPhoneForAction", "(Ljava/lang/String;)Ljava/lang/String;", "", "onCleared", "LAe/h;", "phoneActionFlow", "()LAe/h;", "newPhone", "", "isFullPhoneEntered", "phoneAction", "onPhoneChanged", "(Ljava/lang/String;ZLru/ozon/uni/atoms/af/AtomAction;)V", "permissionGrantedFlow", "onPermissionGranted", "countryCode", "setCountryCode", "(Ljava/lang/String;)V", "getEnteredPhone", "()Ljava/lang/String;", "isPhoneChanged", "(Ljava/lang/String;)Z", "Ljava/lang/String;", "countryPhoneCode", "Lxe/B0;", "debounceJob", "Lxe/B0;", "LAe/x0;", "LAe/x0;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParticipantPhoneViewModel extends w0 {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private String countryPhoneCode;
    private B0 debounceJob;
    private String enteredPhone;

    @NotNull
    private final x0<AtomAction> phoneActionFlow = O0.a(null);

    @NotNull
    private final x0<Boolean> permissionGrantedFlow = O0.a(Boolean.FALSE);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneViewModel$Companion;", "", "<init>", "()V", "KEY_PHONE", "", "DEBOUNCE_MILLIS", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AtomAction addEnteredPhoneToAction(AtomAction action) {
        String str = this.enteredPhone;
        if (!(action instanceof AtomAction.ComposerAction) || str == null || str.length() == 0) {
            return action;
        }
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
        Map<String, String> params = composerAction.getParams();
        if (params == null) {
            params = U.c();
        }
        LinkedHashMap u11 = U.u(params);
        u11.put("phoneNumber", formatPhoneForAction(str));
        return AtomAction.ComposerAction.copy$default(composerAction, null, null, u11, null, null, 27, null);
    }

    private final String formatPhoneForAction(String enteredPhone) {
        StringBuilder sb2 = new StringBuilder();
        String str = this.countryPhoneCode;
        if (enteredPhone.length() > 0 && str != null) {
            sb2.append(str);
        }
        String c11 = C2942q.c(sb2, enteredPhone, "toString(...)");
        StringBuilder sb3 = new StringBuilder();
        int length = c11.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = c11.charAt(i11);
            if (Character.isDigit(charAt)) {
                sb3.append(charAt);
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    @NotNull
    public final String getEnteredPhone() {
        String str = this.enteredPhone;
        return str == null ? "" : str;
    }

    public final boolean isPhoneChanged(@NotNull String newPhone) {
        Intrinsics.checkNotNullParameter(newPhone, "newPhone");
        return !Intrinsics.d(newPhone, this.enteredPhone);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.enteredPhone = null;
        this.countryPhoneCode = null;
        B0 b02 = this.debounceJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.debounceJob = null;
    }

    public final void onPermissionGranted() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ParticipantPhoneViewModel$onPermissionGranted$1(this, null), 3);
    }

    public final void onPhoneChanged(@NotNull String newPhone, boolean isFullPhoneEntered, AtomAction phoneAction) {
        String str;
        Intrinsics.checkNotNullParameter(newPhone, "newPhone");
        boolean z11 = false;
        boolean z12 = (newPhone.length() != 0 || (str = this.enteredPhone) == null || str.length() == 0) ? false : true;
        if (isPhoneChanged(newPhone) && (isFullPhoneEntered || z12)) {
            z11 = true;
        }
        this.enteredPhone = newPhone;
        if (z11) {
            B0 b02 = this.debounceJob;
            if (b02 != null) {
                b02.j(null);
            }
            this.debounceJob = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ParticipantPhoneViewModel$onPhoneChanged$1(phoneAction, this, null), 3);
        }
    }

    @NotNull
    public final InterfaceC2395h<Boolean> permissionGrantedFlow() {
        final M0 b11 = C2399j.b(this.permissionGrantedFlow);
        return new InterfaceC2395h<Boolean>() { // from class: ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneViewModel$permissionGrantedFlow$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneViewModel$permissionGrantedFlow$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneViewModel$permissionGrantedFlow$$inlined$filter$1$2", f = "ParticipantPhoneViewModel.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneViewModel$permissionGrantedFlow$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
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
                                if (((Boolean) obj).booleanValue()) {
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
            public Object collect(InterfaceC2397i<? super Boolean> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
    }

    @NotNull
    public final InterfaceC2395h<AtomAction> phoneActionFlow() {
        return new C2406m0(this.phoneActionFlow);
    }

    public final void setCountryCode(@NotNull String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.countryPhoneCode = countryCode;
    }
}
