package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import Ae.I0;
import Ae.InterfaceC2395h;
import Ae.M0;
import Sc.r;
import android.net.Uri;
import android.os.Parcelable;
import android.util.Base64;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import h3.C6788a;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7741a;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.android.messenger.blocks.alert.a;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.data.remote.websocket.AbstractC9330a;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.android.messenger.framework.domain.model.f;
import ru.ozon.android.messenger.framework.domain.service.InterfaceC9383a;
import ru.ozon.android.messenger.framework.domain.usecases.C9393j;
import ru.ozon.android.messenger.framework.domain.usecases.C9402t;
import ru.ozon.android.messenger.framework.navigation.action.c;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.b;
import ru.ozon.android.messenger.framework.presentation.chatdetail.j;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a;
import ru.ozon.android.messenger.framework.presentation.chatdetail.w;
import ru.ozon.android.messenger.framework.presentation.common.notification.d;
import ru.ozon.android.messenger.framework.presentation.common.notification.i;
import ru.ozon.android.messenger.framework.presentation.models.A;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.android.networkinfo.models.NetworkInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xe.AbstractC10711a;
import xe.C10727i;
import xe.H0;
import ze.C11115c;
import ze.EnumC11113a;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9467e extends androidx.lifecycle.w0 implements InterfaceC9460a {

    /* renamed from: A0, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f90181A0 = new LinkedHashMap();

    /* renamed from: B0, reason: collision with root package name */
    public static final /* synthetic */ int f90182B0 = 0;

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.chatdetail.j> f90183A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final M0<ru.ozon.android.messenger.framework.presentation.models.l> f90184B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final M0<ru.ozon.android.messenger.framework.domain.g> f90185C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final M0<C0> f90186D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.view.recycler.u f90187E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.common.screen.l> f90188F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private final M0<String> f90189G;

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private final Ae.C0 f90190H;

    /* renamed from: I, reason: collision with root package name */
    @NotNull
    private final Ae.x0<Integer> f90191I;

    /* renamed from: J, reason: collision with root package name */
    @NotNull
    private final Ae.C0 f90192J;

    /* renamed from: K, reason: collision with root package name */
    @NotNull
    private final Ae.C0 f90193K;

    /* renamed from: L, reason: collision with root package name */
    @NotNull
    private final p0 f90194L;

    /* renamed from: M, reason: collision with root package name */
    @NotNull
    private final C9472j f90195M;

    /* renamed from: N, reason: collision with root package name */
    @NotNull
    private final C11115c f90196N;

    /* renamed from: O, reason: collision with root package name */
    @NotNull
    private final Ae.C0 f90197O;

    /* renamed from: P, reason: collision with root package name */
    @NotNull
    private final Ae.C0 f90198P;

    /* renamed from: Q, reason: collision with root package name */
    private xe.B0 f90199Q;

    /* renamed from: R, reason: collision with root package name */
    private xe.B0 f90200R;

    /* renamed from: S, reason: collision with root package name */
    private xe.B0 f90201S;

    /* renamed from: X, reason: collision with root package name */
    @NotNull
    private final HashMap<String, MessengerTrackingInfo> f90202X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f90203Y;

    /* renamed from: Z, reason: collision with root package name */
    @NotNull
    private final Function1<String, Unit> f90204Z;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.a f90205a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f90206b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.d f90207c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C9351a f90208d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.usecases.r f90209e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.alert.a f90210f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.usecases.b0 f90211g;

    /* renamed from: h, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.analytics.i f90212h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC9383a f90213i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.mappers.a f90214j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.usecases.g0 f90215k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final d.a f90216l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final i.a f90217m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.composer.navigation.router.a f90218n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.o f90219o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a f90220p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.startup.a f90221q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final C9402t f90222r;

    /* renamed from: r0, reason: collision with root package name */
    @NotNull
    private final Object f90223r0;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.usecases.P f90224s;

    /* renamed from: s0, reason: collision with root package name */
    @NotNull
    private final M0<ru.ozon.android.messenger.blocks.pinneditem.g> f90225s0;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.usecases.F f90226t;

    /* renamed from: t0, reason: collision with root package name */
    @NotNull
    private final M0<ru.ozon.android.messenger.blocks.input.d> f90227t0;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.mapper.a f90228u;

    /* renamed from: u0, reason: collision with root package name */
    private xe.B0 f90229u0;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.usecases.O f90230v;

    /* renamed from: v0, reason: collision with root package name */
    private xe.B0 f90231v0;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.chatdetail.a f90232w;

    /* renamed from: w0, reason: collision with root package name */
    private xe.B0 f90233w0;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.input.viewmodel.f f90234x;

    /* renamed from: x0, reason: collision with root package name */
    private xe.B0 f90235x0;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.input.viewmodel.e f90236y;

    /* renamed from: y0, reason: collision with root package name */
    private xe.B0 f90237y0;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.k f90238z;

    /* renamed from: z0, reason: collision with root package name */
    @NotNull
    private List<ru.ozon.android.messenger.framework.presentation.models.q> f90239z0;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.e$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f90240a;

        static {
            int[] iArr = new int[ru.ozon.android.messenger.framework.navigation.action.d.values().length];
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.RESEND_UNDELIVERED_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.SEND_MESSAGE_AFTER_CONFIRMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.REMOVE_MESSAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.COPY_MESSAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.ADD_NEW_FAST_ANSWER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.ON_CHAT_BUTTONS_CLICK_OLD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.ON_CHAT_BUTTONS_CLICK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.ON_UNREAD_MSG_DISPLAYED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.ON_MSG_COUNTER_CLICK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.GO_TO_SETTINGS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.SHOW_CHAT_LIST.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.ENABLE_NOTIFICATIONS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.ENABLE_NOTIFICATIONS_V2.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.CLOSE_ALERT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.REPORT_BUYER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.REPORT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.ACCEPT_ACTION.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.ON_APPLY_COUPON.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.ON_HIDE_COUPON.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.ON_CHAT_UPDATE_BLOCK.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.ON_SHOW_ORIGINAL_TEXT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.CHAT_GET_CURTAIN_MODAL.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.CHAT_GET_ACTION_CURTAIN_MODAL.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.DISMISS_POPUP_MENU.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.CHAT_GET_SUSPICIOUS_LINK_MODAL.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.UNPIN_HEADER_ITEM.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.COPY_TEXT.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.SHOW_TEXT_BUTTON.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.REPORT_ABUSE_FORM.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.CHAT_ACTION_WITH_SUCCESS_MESSAGE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.EDIT_CHAT_MESSAGE.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.REPLY_CHAT_MESSAGE.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.CANCEL_EDIT_CHAT_MESSAGE.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.CANCEL_REPLY_CHAT_MESSAGE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.SEND_UPDATE_CHAT_MESSAGE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.STUB_ACTION.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            f90240a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$describePermission$1", f = "ChatViewModel.kt", l = {283}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.e$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f90241d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C9467e f90242e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.coroutines.d dVar, C9467e c9467e) {
            super(2, dVar);
            this.f90242e = c9467e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(dVar, this.f90242e);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f90241d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C9467e c9467e = this.f90242e;
                ru.ozon.android.messenger.framework.presentation.models.q c11 = c9467e.f90210f.c();
                C9402t c9402t = c9467e.f90222r;
                C9402t.a.C1638a c1638a = new C9402t.a.C1638a(c11, ru.ozon.android.messenger.framework.presentation.models.x.FOOTER, null);
                this.f90241d = 1;
                c9402t.getClass();
                if (C9402t.e(c9402t, c1638a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$dismissPopup$1", f = "ChatViewModel.kt", l = {1240}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.e$c */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f90243d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C9467e f90244e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlin.coroutines.d dVar, C9467e c9467e) {
            super(2, dVar);
            this.f90244e = c9467e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(dVar, this.f90244e);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f90243d;
            if (i11 == 0) {
                Sc.s.b(obj);
                Ae.C0 c02 = this.f90244e.f90190H;
                Unit unit = Unit.f71690a;
                this.f90243d = 1;
                if (c02.emit(unit, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public C9467e(@NotNull ru.ozon.android.messenger.framework.navigation.controller.a controller, @NotNull ru.ozon.android.messenger.framework.domain.repository.b repository, @NotNull ru.ozon.android.messenger.framework.domain.repository.d messagesRepository, @NotNull C9351a actionRepository, @NotNull ru.ozon.android.messenger.framework.domain.usecases.r getSocketEventsUseCase, @NotNull ru.ozon.android.messenger.blocks.alert.a alertBlockFactory, @NotNull ru.ozon.android.messenger.framework.domain.usecases.b0 setStateUseCase, ru.ozon.android.messenger.framework.analytics.i iVar, InterfaceC9383a interfaceC9383a, @NotNull ru.ozon.android.messenger.framework.presentation.mappers.a reportContentMapper, @NotNull ru.ozon.android.messenger.framework.domain.usecases.g0 userIsTypingUseCase, @NotNull d.a noInternetNotificationOrEmptyScreenConditionFactory, @NotNull i.a notificationDelegate, @NotNull ru.ozon.android.messenger.framework.composer.navigation.router.a composerScreenRouter, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.o unreadMessagesDelegate, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a loadingDelegate, @NotNull ru.ozon.android.messenger.framework.presentation.common.startup.a chatStartupDelegate, @NotNull C9402t handleChatEventsUseCase, @NotNull ru.ozon.android.messenger.framework.domain.usecases.P sendMessageUseCase, @NotNull ru.ozon.android.messenger.framework.domain.usecases.F removeItemUseCase, @NotNull ru.ozon.android.messenger.framework.presentation.mapper.a chatUiMapper, @NotNull ru.ozon.android.messenger.framework.domain.usecases.O restoreFailedMessagesUseCase, @NotNull C9393j getChatMessagesUseCase, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.a args, @NotNull ru.ozon.android.messenger.blocks.input.viewmodel.f draftSaver, @NotNull ru.ozon.android.messenger.blocks.input.viewmodel.e draftLoader, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.k inputModeStore) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        Intrinsics.checkNotNullParameter(getSocketEventsUseCase, "getSocketEventsUseCase");
        Intrinsics.checkNotNullParameter(alertBlockFactory, "alertBlockFactory");
        Intrinsics.checkNotNullParameter(setStateUseCase, "setStateUseCase");
        Intrinsics.checkNotNullParameter(reportContentMapper, "reportContentMapper");
        Intrinsics.checkNotNullParameter(userIsTypingUseCase, "userIsTypingUseCase");
        Intrinsics.checkNotNullParameter(noInternetNotificationOrEmptyScreenConditionFactory, "noInternetNotificationOrEmptyScreenConditionFactory");
        Intrinsics.checkNotNullParameter(notificationDelegate, "notificationDelegate");
        Intrinsics.checkNotNullParameter(composerScreenRouter, "composerScreenRouter");
        Intrinsics.checkNotNullParameter(unreadMessagesDelegate, "unreadMessagesDelegate");
        Intrinsics.checkNotNullParameter(loadingDelegate, "loadingDelegate");
        Intrinsics.checkNotNullParameter(chatStartupDelegate, "chatStartupDelegate");
        Intrinsics.checkNotNullParameter(handleChatEventsUseCase, "handleChatEventsUseCase");
        Intrinsics.checkNotNullParameter(sendMessageUseCase, "sendMessageUseCase");
        Intrinsics.checkNotNullParameter(removeItemUseCase, "removeItemUseCase");
        Intrinsics.checkNotNullParameter(chatUiMapper, "chatUiMapper");
        Intrinsics.checkNotNullParameter(restoreFailedMessagesUseCase, "restoreFailedMessagesUseCase");
        Intrinsics.checkNotNullParameter(getChatMessagesUseCase, "getChatMessagesUseCase");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(draftSaver, "draftSaver");
        Intrinsics.checkNotNullParameter(draftLoader, "draftLoader");
        Intrinsics.checkNotNullParameter(inputModeStore, "inputModeStore");
        this.f90205a = controller;
        this.f90206b = repository;
        this.f90207c = messagesRepository;
        this.f90208d = actionRepository;
        this.f90209e = getSocketEventsUseCase;
        this.f90210f = alertBlockFactory;
        this.f90211g = setStateUseCase;
        this.f90212h = iVar;
        this.f90213i = interfaceC9383a;
        this.f90214j = reportContentMapper;
        this.f90215k = userIsTypingUseCase;
        this.f90216l = noInternetNotificationOrEmptyScreenConditionFactory;
        this.f90217m = notificationDelegate;
        this.f90218n = composerScreenRouter;
        this.f90219o = unreadMessagesDelegate;
        this.f90220p = loadingDelegate;
        this.f90221q = chatStartupDelegate;
        this.f90222r = handleChatEventsUseCase;
        this.f90224s = sendMessageUseCase;
        this.f90226t = removeItemUseCase;
        this.f90228u = chatUiMapper;
        this.f90230v = restoreFailedMessagesUseCase;
        this.f90232w = args;
        this.f90234x = draftSaver;
        this.f90236y = draftLoader;
        this.f90238z = inputModeStore;
        m0 m0Var = new m0(getChatMessagesUseCase.a(), this);
        C6788a a11 = androidx.lifecycle.x0.a(this);
        int i11 = I0.f818a;
        M0<ru.ozon.android.messenger.framework.presentation.models.l> M11 = C2399j.M(m0Var, a11, I0.a.d(), new ru.ozon.android.messenger.framework.presentation.models.l(0));
        this.f90184B = M11;
        n0 n0Var = new n0(M11);
        C6788a a12 = androidx.lifecycle.x0.a(this);
        I0 b11 = I0.a.b(2);
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        this.f90185C = C2399j.M(n0Var, a12, b11, new ru.ozon.android.messenger.framework.domain.g(k11, k11));
        M0<C0> M12 = C2399j.M(new o0(M11), androidx.lifecycle.x0.a(this), I0.a.b(2), new C0(new ArrayList(), false));
        this.f90186D = M12;
        this.f90187E = loadingDelegate.c();
        this.f90188F = loadingDelegate.getLoader();
        this.f90189G = chatStartupDelegate.e();
        this.f90190H = E0.b(0, 0, null, 7);
        this.f90191I = loadingDelegate.D();
        EnumC11113a enumC11113a = EnumC11113a.DROP_OLDEST;
        this.f90192J = E0.b(0, 1, enumC11113a, 1);
        this.f90193K = E0.b(0, 1, enumC11113a, 1);
        this.f90194L = new p0(M12);
        this.f90195M = new C9472j(this);
        C11115c a13 = ze.k.a(-2, 6, null);
        this.f90196N = a13;
        this.f90197O = E0.a(0, 1, enumC11113a);
        this.f90198P = E0.b(0, 0, null, 7);
        this.f90202X = new HashMap<>();
        this.f90204Z = ru.ozon.android.messenger.utils.coroutines.c.a(androidx.lifecycle.x0.a(this), 50L, new C9465c0(null, this));
        this.f90223r0 = ru.ozon.android.messenger.utils.f.b(new Y(this));
        this.f90225s0 = C2399j.M(new q0(M11), androidx.lifecycle.x0.a(this), I0.a.c(), null);
        this.f90227t0 = C2399j.M(new r0(M11), androidx.lifecycle.x0.a(this), I0.a.c(), null);
        this.f90239z0 = k11;
        this.f90183A = C2399j.H(a13);
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.l[] lVarArr = {(ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.d) loadingDelegate, unreadMessagesDelegate};
        for (int i12 = 0; i12 < 2; i12++) {
            lVarArr[i12].e(androidx.lifecycle.x0.a(this), this.f90196N, this.f90198P);
        }
        C2399j.C(new C2408n0(C2399j.q(this.f90225s0, C9464c.f90059b), new C9466d(null, this)), androidx.lifecycle.x0.a(this));
    }

    public static final String A0(C9467e c9467e) {
        Object a11;
        String Y11;
        String queryParameter = c9467e.f90232w.getDeeplink().getQueryParameter("prefillMessage");
        if (queryParameter == null) {
            return null;
        }
        try {
            r.Companion companion = Sc.r.INSTANCE;
            String Y12 = kotlin.text.h.Y(queryParameter, ' ', '+');
            byte[] decode = Base64.decode((Y12 == null || (Y11 = kotlin.text.h.Y(Y12, '_', '/')) == null) ? null : kotlin.text.h.Y(Y11, '-', '+'), 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            a11 = new String(decode, Charsets.UTF_8);
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        Throwable b11 = Sc.r.b(a11);
        if (b11 != null) {
            Lm0.a.f17149a.w("Unable to decode prefill message " + b11, new Object[0]);
        }
        return (String) (a11 instanceof r.b ? null : a11);
    }

    public static final void L0(C9467e c9467e, d.f fVar) {
        Map<String, String> params;
        String str;
        Map<String, String> params2;
        String str2;
        Map<String, String> params3;
        String link;
        Map<String, String> c11;
        Map<String, Object> d11;
        String value;
        c9467e.getClass();
        ru.ozon.android.messenger.framework.navigation.action.a a11 = fVar.a();
        d.a aVar = ru.ozon.android.messenger.framework.navigation.action.d.Companion;
        String id2 = a11.getId();
        aVar.getClass();
        ru.ozon.android.messenger.framework.navigation.action.d a12 = d.a.a(id2);
        int i11 = a12 == null ? -1 : a.f90240a[a12.ordinal()];
        C11115c c11115c = c9467e.f90196N;
        switch (i11) {
            case -1:
                if (Intrinsics.d(a11.getId(), d.b.ON_EXTERNAL_BUTTON_CLICK.a())) {
                    AtomActionDTO b11 = a11.b();
                    String link2 = b11 != null ? b11.getLink() : null;
                    if (link2 == null || link2.length() == 0) {
                        C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new C9483v(c9467e, c9467e.f90210f.b(5000L), null), 3);
                        break;
                    }
                }
                break;
            case 1:
                AtomAction c12 = a11.c();
                AtomAction.Click click = c12 instanceof AtomAction.Click ? (AtomAction.Click) c12 : null;
                String str3 = (click == null || (params = click.getParams()) == null) ? null : (String) ru.ozon.android.messenger.framework.navigation.action.b.a(d.c.RETRY_MESSAGE.a(), params);
                if (str3 != null) {
                    C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new C9473k(c9467e, str3, null), 3);
                    break;
                }
                break;
            case 2:
                C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new C9474l(null, a11, c9467e), 3);
                break;
            case 3:
                C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new G(null, fVar.a(), c9467e), 3);
                break;
            case 4:
                AtomAction c13 = fVar.a().c();
                Intrinsics.g(c13, "null cannot be cast to non-null type ru.ozon.uni.atoms.af.AtomAction.Click");
                Map<String, String> params4 = ((AtomAction.Click) c13).getParams();
                if (params4 != null && (str = (String) ru.ozon.android.messenger.framework.navigation.action.b.b(d.c.COPY_MESSAGE.a(), params4)) != null) {
                    c11115c.b(new j.a(str));
                    break;
                }
                break;
            case 5:
                xe.B0 b02 = c9467e.f90233w0;
                if (b02 == null || !((AbstractC10711a) b02).isActive()) {
                    AtomAction c14 = a11.c();
                    Intrinsics.g(c14, "null cannot be cast to non-null type ru.ozon.uni.atoms.af.AtomAction.Click");
                    c9467e.f90233w0 = C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new C9470h(c9467e, a11, ((AtomAction.Click) c14).getParams(), null), 3);
                    break;
                }
                break;
            case 6:
                c9467e.p1(new E(c9467e, a11.b(), ru.ozon.android.messenger.blocks.alert.a.f84375c));
                break;
            case 7:
                c9467e.p1(new E(c9467e, a11.b(), ru.ozon.android.messenger.blocks.alert.a.f84375c));
                break;
            case 8:
                AtomAction c15 = a11.c();
                AtomAction.Click click2 = c15 instanceof AtomAction.Click ? (AtomAction.Click) c15 : null;
                if (click2 != null && (params2 = click2.getParams()) != null && (str2 = params2.get(d.c.UNREAD_MESSAGE_ID.a())) != null) {
                    c9467e.f90204Z.invoke(str2);
                    break;
                }
                break;
            case 9:
                C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new F(null, c9467e), 3);
                break;
            case 10:
                c11115c.b(j.f.f89875a);
                break;
            case 11:
                c11115c.b(j.n.f89881a);
                break;
            case 12:
                c11115c.b(j.e.f89874a);
                break;
            case 13:
                xe.B0 b03 = c9467e.f90237y0;
                if (b03 == null || !((AbstractC10711a) b03).isActive()) {
                    AtomAction c16 = a11.c();
                    AtomAction.Click click3 = c16 instanceof AtomAction.Click ? (AtomAction.Click) c16 : null;
                    Map<String, String> params5 = click3 != null ? click3.getParams() : null;
                    c9467e.o1(a11);
                    c9467e.f90237y0 = C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new C9482u(null, a11, c9467e), 3);
                    if (params5 != null && params5.get(d.c.REDIRECT_URL.a()) != null) {
                        c9467e.f90205a.q(new ru.ozon.android.messenger.framework.navigation.action.a(new AtomActionDTO(AtomActionDTO.Behavior.REDIRECT, c9467e.f90232w.getDeeplink().toString(), null, null, 12, null), null, null, 6));
                        break;
                    } else {
                        c11115c.b(j.c.f89872a);
                        break;
                    }
                }
                break;
            case 14:
                c9467e.o1(a11);
                break;
            case 15:
                AtomAction c17 = a11.c();
                c9467e.f90214j.getClass();
                c11115c.b(new j.g(ru.ozon.android.messenger.framework.presentation.mappers.a.b(c17)));
                break;
            case 16:
                c9467e.p1(new j0(c9467e, a11));
                break;
            case 17:
                c9467e.p1(new C9469g(c9467e, a11));
                break;
            case 18:
                c9467e.p1(new C9476n(c9467e, fVar.a()));
                break;
            case 19:
                c9467e.p1(new C(c9467e, fVar.a()));
                break;
            case 20:
                c9467e.p1(new U(c9467e, fVar.a()));
                break;
            case 21:
                c9467e.p1(new O(c9467e, fVar.a()));
                break;
            case 22:
                c9467e.p1(new C9487z(c9467e, a11));
                break;
            case 23:
                c9467e.p1(new C9485x(c9467e, a11));
                break;
            case 24:
                c9467e.m1();
                break;
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                xe.B0 b04 = c9467e.f90229u0;
                if (b04 == null || !((AbstractC10711a) b04).isActive()) {
                    c9467e.f90229u0 = C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new A(null, a11, c9467e), 3);
                    break;
                }
                break;
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                c9467e.p1(new t0(c9467e, a11));
                break;
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                AtomAction c18 = a11.c();
                AtomAction.Click click4 = c18 instanceof AtomAction.Click ? (AtomAction.Click) c18 : null;
                if (click4 != null && (params3 = click4.getParams()) != null) {
                    c11115c.b(new j.b(params3));
                    break;
                }
                break;
            case 28:
                xe.B0 b05 = c9467e.f90235x0;
                if (b05 == null || !((AbstractC10711a) b05).isActive()) {
                    AtomAction c19 = a11.c();
                    Intrinsics.g(c19, "null cannot be cast to non-null type ru.ozon.uni.atoms.af.AtomAction.Click");
                    c9467e.f90235x0 = C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new l0(c9467e, a11, ((AtomAction.Click) c19).getParams(), null), 3);
                    break;
                }
                break;
            case 29:
                AtomActionDTO b12 = a11.b();
                if (b12 == null || (link = b12.getLink()) == null) {
                    AtomAction c21 = a11.c();
                    AtomAction.Click click5 = c21 instanceof AtomAction.Click ? (AtomAction.Click) c21 : null;
                    link = click5 != null ? click5.getLink() : null;
                    if (link == null) {
                    }
                }
                AtomActionDTO b13 = a11.b();
                if (b13 == null || (c11 = b13.getParams()) == null) {
                    AtomAction c22 = a11.c();
                    AtomAction.Click click6 = c22 instanceof AtomAction.Click ? (AtomAction.Click) c22 : null;
                    Map<String, String> params6 = click6 != null ? click6.getParams() : null;
                    c11 = params6 == null ? kotlin.collections.U.c() : params6;
                }
                String str4 = c11.get("bodyParams");
                try {
                    JSONObject jSONObject = new JSONObject(str4 != null ? str4 : "");
                    Iterator<String> keys = jSONObject.keys();
                    Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                    C7741a b14 = kotlin.sequences.l.b(keys);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = b14.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        linkedHashMap.put(next, jSONObject.getString((String) next));
                    }
                    c11 = linkedHashMap;
                } catch (Exception unused) {
                }
                c9467e.f90218n.a(link, c11);
                break;
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                c9467e.p1(new r(c9467e, a11));
                break;
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                c9467e.p1(new C9481t(c9467e, fVar.a()));
                break;
            case 32:
                c9467e.p1(new I(c9467e, fVar.a()));
                break;
            case 33:
                C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new C9477o(null, c9467e), 3);
                break;
            case 34:
                C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new C9478p(null, c9467e), 3);
                break;
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                ru.ozon.android.messenger.framework.navigation.action.a a13 = fVar.a();
                AtomAction c23 = a13.c();
                AtomAction.Click click7 = c23 instanceof AtomAction.Click ? (AtomAction.Click) c23 : null;
                if (click7 == null || (d11 = click7.getParams()) == null) {
                    d11 = a13.d();
                }
                Object obj = d11.get(d.c.MESSAGE_ID.a());
                String str5 = obj instanceof String ? (String) obj : null;
                if (str5 != null) {
                    Object obj2 = d11.get(d.c.TEXT.a());
                    String str6 = obj2 instanceof String ? (String) obj2 : null;
                    if (str6 != null) {
                        ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.k kVar = c9467e.f90238z;
                        ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.b value2 = kVar.e().getValue();
                        b.C1660b c1660b = value2 instanceof b.C1660b ? (b.C1660b) value2 : null;
                        if (c1660b != null && (value = c9467e.f90221q.e().getValue()) != null) {
                            String b15 = c1660b.b();
                            String str7 = b15 != null ? b15 : "";
                            if (!Intrinsics.d(kotlin.text.h.z0(str6).toString(), kotlin.text.h.z0(str7).toString())) {
                                ru.ozon.android.messenger.framework.presentation.models.q m11 = kVar.m(str6);
                                if (m11 != null) {
                                    C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new M(c9467e, value, str5, str6, m11, str7, a13, null), 3);
                                    break;
                                }
                            } else {
                                C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new L(null, c9467e), 3);
                                break;
                            }
                        }
                    } else {
                        C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new K(c9467e, str5, a13, null), 3);
                        break;
                    }
                }
                break;
        }
    }

    public static final Object M0(C9467e c9467e, d.b bVar, kotlin.coroutines.d dVar) {
        c9467e.getClass();
        C9402t.a.C1638a c1638a = new C9402t.a.C1638a(ru.ozon.android.messenger.blocks.alert.a.e(c9467e.f90210f, null, new Integer(bVar.a()), "m_ic_disclaimer", null, null, 5000L, 115), ru.ozon.android.messenger.framework.presentation.models.x.FOOTER, "button_alert");
        C9402t c9402t = c9467e.f90222r;
        c9402t.getClass();
        Object e11 = C9402t.e(c9402t, c1638a, dVar);
        return e11 == Wc.a.COROUTINE_SUSPENDED ? e11 : Unit.f71690a;
    }

    public static final Object N0(C9467e c9467e, d.c cVar, kotlin.coroutines.d dVar) {
        c9467e.getClass();
        cVar.getClass();
        String a11 = cVar.a();
        a.C1470a c1470a = ru.ozon.android.messenger.blocks.alert.a.f84375c;
        C9402t.a.C1638a c1638a = new C9402t.a.C1638a(c9467e.f90210f.d("input_issues_alert_block_id", null, a11, "ic_m_danger_filled", null, DisclaimerDTO.Theme.NEGATIVE, null), ru.ozon.android.messenger.framework.presentation.models.x.FOOTER, "button_alert");
        C9402t c9402t = c9467e.f90222r;
        c9402t.getClass();
        Object e11 = C9402t.e(c9402t, c1638a, dVar);
        return e11 == Wc.a.COROUTINE_SUSPENDED ? e11 : Unit.f71690a;
    }

    public static final Object O0(C9467e c9467e, A.a aVar, kotlin.coroutines.d dVar) {
        c9467e.getClass();
        if (aVar.c() == ru.ozon.android.messenger.framework.presentation.models.x.CURTAIN) {
            ru.ozon.android.messenger.framework.presentation.models.g b11 = ru.ozon.android.messenger.framework.presentation.models.r.b(aVar.b());
            ru.ozon.android.messenger.blocks.curtain.c cVar = b11 instanceof ru.ozon.android.messenger.blocks.curtain.c ? (ru.ozon.android.messenger.blocks.curtain.c) b11 : null;
            if (cVar != null) {
                c9467e.f90196N.b(new j.q(cVar));
            }
            return Unit.f71690a;
        }
        C9402t.a.C1638a c1638a = new C9402t.a.C1638a(aVar.b(), aVar.c(), aVar.a());
        C9402t c9402t = c9467e.f90222r;
        c9402t.getClass();
        Object e11 = C9402t.e(c9402t, c1638a, dVar);
        return e11 == Wc.a.COROUTINE_SUSPENDED ? e11 : Unit.f71690a;
    }

    public static final void P0(C9467e c9467e, Map map) {
        ru.ozon.android.messenger.framework.analytics.i iVar = c9467e.f90212h;
        if (iVar != null) {
            ru.ozon.android.messenger.framework.analytics.h.d(iVar, map);
        }
    }

    public static final void Q0(C9467e c9467e, Map map) {
        ru.ozon.android.messenger.framework.analytics.i iVar;
        c9467e.getClass();
        MessengerTrackingInfo messengerTrackingInfo = (MessengerTrackingInfo) map.get("click");
        if (messengerTrackingInfo == null || (iVar = c9467e.f90212h) == null) {
            return;
        }
        ru.ozon.android.messenger.framework.analytics.h.e(iVar, kotlin.collections.U.i(new Pair("click", messengerTrackingInfo)));
    }

    public static final Object S0(C9467e c9467e, A.g gVar, kotlin.coroutines.d dVar) {
        c9467e.getClass();
        if (c9467e.f90238z.d(gVar.a())) {
            return Unit.f71690a;
        }
        C9402t.a.b bVar = new C9402t.a.b(gVar.a());
        C9402t c9402t = c9467e.f90222r;
        c9402t.getClass();
        Object a11 = bVar.a(c9402t, dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    public static final void T0(C9467e c9467e) {
        c9467e.getClass();
        c9467e.f90196N.b(j.n.f89881a);
    }

    public static final Object U0(kotlin.coroutines.d dVar, C9467e c9467e) {
        c9467e.m1();
        Object u11 = c9467e.f90220p.u(new d.q(kotlin.collections.U.c(), true, true), dVar);
        return u11 == Wc.a.COROUTINE_SUSPENDED ? u11 : Unit.f71690a;
    }

    public static final void V0(C9467e c9467e, String str) {
        List<ru.ozon.android.messenger.framework.presentation.models.q> a11 = c9467e.f90186D.getValue().a();
        if (!(a11 instanceof Collection) || !a11.isEmpty()) {
            Iterator<T> it = a11.iterator();
            while (it.hasNext()) {
                if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d((ru.ozon.android.messenger.framework.presentation.models.q) it.next()), str)) {
                    c9467e.f90196N.b(new j.k(str));
                    return;
                }
            }
        }
        C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new J(c9467e, str, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public static final void W0(AbstractC9330a.e eVar, C9467e c9467e) {
        ((ru.ozon.android.messenger.framework.presentation.common.notification.d) c9467e.f90223r0.getValue()).a(c9467e.f90189G.getValue(), new P(c9467e), new S(eVar, c9467e));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r5.q(r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r5.f90207c.m(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object X0(C9467e c9467e, d.w wVar, kotlin.coroutines.d dVar) {
        V v11;
        int i11;
        c9467e.getClass();
        if (dVar instanceof V) {
            v11 = (V) dVar;
            int i12 = v11.f90037h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                v11.f90037h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = v11.f90035f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = v11.f90037h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    v11.f90033d = c9467e;
                    v11.f90034e = wVar;
                    v11.f90037h = 1;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    }
                    wVar = v11.f90034e;
                    c9467e = v11.f90033d;
                    Sc.s.b(obj);
                }
                ru.ozon.android.messenger.framework.domain.repository.d dVar2 = c9467e.f90207c;
                v11.f90033d = null;
                v11.f90034e = null;
                v11.f90037h = 2;
            }
        }
        v11 = new V(dVar, c9467e);
        Object obj2 = v11.f90035f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = v11.f90037h;
        if (i11 != 0) {
        }
        ru.ozon.android.messenger.framework.domain.repository.d dVar22 = c9467e.f90207c;
        v11.f90033d = null;
        v11.f90034e = null;
        v11.f90037h = 2;
    }

    public static final void Y0(C9467e c9467e, Map map) {
        c9467e.getClass();
        MessengerTrackingInfo messengerTrackingInfo = (MessengerTrackingInfo) map.get("view");
        if (messengerTrackingInfo != null) {
            HashMap<String, MessengerTrackingInfo> hashMap = c9467e.f90202X;
            if (hashMap.containsKey(messengerTrackingInfo.getKey())) {
                messengerTrackingInfo = null;
            }
            if (messengerTrackingInfo != null) {
                hashMap.put(messengerTrackingInfo.getKey(), messengerTrackingInfo);
                ru.ozon.android.messenger.framework.analytics.i iVar = c9467e.f90212h;
                if (iVar != null) {
                    ru.ozon.android.messenger.framework.analytics.h.f(iVar, kotlin.collections.U.i(new Pair("view", messengerTrackingInfo)));
                }
            }
        }
    }

    public static final void Z0(C9467e c9467e, ru.ozon.android.messenger.utils.i iVar, ru.ozon.android.messenger.framework.navigation.action.a aVar) {
        c9467e.getClass();
        boolean z11 = iVar instanceof i.b;
        Ae.C0 c02 = c9467e.f90192J;
        if (z11) {
            ru.ozon.android.messenger.framework.presentation.models.responses.b bVar = (ru.ozon.android.messenger.framework.presentation.models.responses.b) ((i.b) iVar).b();
            if (bVar != null) {
                c02.tryEmit(new NotificationDTO(bVar.b(), bVar.a(), null, Integer.MAX_VALUE, null, null, null, null, null, NotificationDTO.Preset.SUCCESS, 468, null));
            } else {
                Lm0.a.f17149a.w("Incorrect or empty action response", new Object[0]);
            }
        }
        if (iVar instanceof i.a) {
            AtomActionDTO b11 = aVar.b();
            if ((b11 != null ? b11.getParams() : null) == null) {
                Lm0.a.f17149a.e("Error notification params not found", new Object[0]);
                return;
            }
            NotificationDTO n12 = n1(aVar.b().getParams());
            if (n12 == null) {
                return;
            }
            c02.tryEmit(n12);
        }
    }

    public static final void b1(C9467e c9467e, z0 z0Var) {
        String value = c9467e.f90221q.e().getValue();
        if (value == null) {
            return;
        }
        C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new e0(c9467e, z0Var, value, null), 3);
    }

    public static final void c1(C9467e c9467e) {
        c9467e.m1();
        a.C1665a.b(c9467e.f90220p, null, new h0(null, c9467e), 1);
    }

    public static final void d0(C9467e c9467e) {
        xe.B0 b02 = c9467e.f90199Q;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        xe.B0 b03 = c9467e.f90200R;
        if (b03 != null) {
            ((H0) b03).j(null);
        }
    }

    public static final Object d1(C9467e c9467e, A.e eVar, kotlin.coroutines.d dVar) {
        c9467e.getClass();
        Object g10 = c9467e.f90226t.g(new f.b(eVar.a()), dVar);
        return g10 == Wc.a.COROUTINE_SUSPENDED ? g10 : Unit.f71690a;
    }

    public static final void e1(C9467e c9467e, String str) {
        c9467e.f90220p.n(str);
        String value = c9467e.f90189G.getValue();
        if (value != null) {
            InterfaceC9460a.f90044l0.getClass();
            InterfaceC9460a.C1664a.a().put(value, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b2, code lost:
    
        if (r7.g(r2, r0) != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        if (r2 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f0(C9467e c9467e, kotlin.coroutines.jvm.internal.c cVar) {
        C9471i c9471i;
        int i11;
        String value;
        Object a11;
        C9467e c9467e2;
        String str;
        c9467e.getClass();
        if (cVar instanceof C9471i) {
            c9471i = (C9471i) cVar;
            int i12 = c9471i.f90270h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9471i.f90270h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9471i.f90268f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9471i.f90270h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (c9467e.f90227t0.getValue() == null && (c9467e.f90238z.e().getValue() instanceof b.a)) {
                        value = c9467e.f90189G.getValue();
                        if (value != null) {
                            c9471i.f90266d = c9467e;
                            c9471i.f90267e = value;
                            c9471i.f90270h = 1;
                            a11 = c9467e.f90236y.a(value, c9471i);
                        }
                    }
                    return Unit.f71690a;
                }
                if (i11 == 1) {
                    String str2 = c9471i.f90267e;
                    C9467e c9467e3 = c9471i.f90266d;
                    Sc.s.b(obj);
                    value = str2;
                    c9467e = c9467e3;
                    a11 = obj;
                    if (!((ru.ozon.android.messenger.blocks.input.b) a11).e()) {
                        ru.ozon.android.messenger.blocks.input.viewmodel.f fVar = c9467e.f90234x;
                        c9471i.f90266d = c9467e;
                        c9471i.f90267e = value;
                        c9471i.f90270h = 2;
                        if (fVar.f(value, c9471i) != aVar) {
                            c9467e2 = c9467e;
                            str = value;
                            value = str;
                            c9467e = c9467e2;
                        }
                        return aVar;
                    }
                    ru.ozon.android.messenger.framework.domain.usecases.F f7 = c9467e.f90226t;
                    f.a aVar2 = new f.a(value);
                    c9471i.f90266d = null;
                    c9471i.f90267e = null;
                    c9471i.f90270h = 3;
                } else if (i11 == 2) {
                    str = c9471i.f90267e;
                    c9467e2 = c9471i.f90266d;
                    Sc.s.b(obj);
                    value = str;
                    c9467e = c9467e2;
                    ru.ozon.android.messenger.framework.domain.usecases.F f72 = c9467e.f90226t;
                    f.a aVar22 = new f.a(value);
                    c9471i.f90266d = null;
                    c9471i.f90267e = null;
                    c9471i.f90270h = 3;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            }
        }
        c9471i = new C9471i(c9467e, cVar);
        Object obj2 = c9471i.f90268f;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9471i.f90270h;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    public static final void f1(C9467e c9467e, ru.ozon.android.messenger.framework.presentation.chatdetail.j jVar) {
        c9467e.f90196N.b(jVar);
    }

    public static final void g0(C9467e c9467e) {
        xe.B0 b02 = c9467e.f90201S;
        if (b02 == null || !((AbstractC10711a) b02).isActive()) {
            c9467e.f90201S = C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new C9461a0(null, c9467e), 3);
        }
        xe.B0 b03 = c9467e.f90200R;
        if (b03 == null || !((AbstractC10711a) b03).isActive()) {
            c9467e.f90200R = C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new C9463b0(null, c9467e), 3);
        }
        xe.B0 b04 = c9467e.f90199Q;
        if (b04 == null || !((AbstractC10711a) b04).isActive()) {
            c9467e.f90199Q = C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new Z(null, c9467e), 3);
        }
    }

    public static final void i1(C9467e c9467e, ru.ozon.android.messenger.framework.navigation.action.a aVar) {
        Map<String, String> params;
        c9467e.getClass();
        AtomActionDTO b11 = aVar.b();
        if (b11 == null || (params = b11.getParams()) == null) {
            AtomAction c11 = aVar.c();
            AtomAction.Click click = c11 instanceof AtomAction.Click ? (AtomAction.Click) c11 : null;
            params = click != null ? click.getParams() : null;
        }
        if (params == null || params.isEmpty()) {
            Lm0.a.f17149a.e("Error notification params not found for GetSuspiciousLinkModal", new Object[0]);
            return;
        }
        NotificationDTO n12 = n1(params);
        if (n12 == null) {
            return;
        }
        c9467e.f90192J.tryEmit(n12);
    }

    public static final c.e j1(C9467e c9467e, ru.ozon.android.messenger.framework.presentation.models.m mVar) {
        c9467e.getClass();
        return new c.e(mVar.b(), Integer.valueOf(mVar.a()), mVar.c());
    }

    public static final NotificationDTO k1(C9467e c9467e, i.a aVar) {
        c9467e.getClass();
        if (aVar instanceof i.a.k) {
            return new NotificationDTO(((i.a.k) aVar).c(), null, null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 476, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l1() {
        List<ru.ozon.android.messenger.framework.presentation.models.q> list = this.f90239z0;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ru.ozon.android.messenger.framework.presentation.models.r.d((ru.ozon.android.messenger.framework.presentation.models.q) it.next()));
        }
        ru.ozon.android.messenger.blocks.pinneditem.g value = this.f90225s0.getValue();
        String c11 = value != null ? value.c() : null;
        ru.ozon.android.messenger.framework.presentation.chatdetail.w wVar = C7714v.A(arrayList, c11) ? w.a.f90412a : w.b.f90413a;
        Ae.C0 c02 = this.f90197O;
        if (c11 == null || wVar == null) {
            wVar = w.b.f90413a;
        }
        c02.tryEmit(wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m1() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new c(null, this), 3);
    }

    private static NotificationDTO n1(Map map) {
        String str = map != null ? (String) ru.ozon.android.messenger.framework.navigation.action.b.b(d.c.ERROR_TITLE.a(), map) : null;
        if (str != null) {
            return new NotificationDTO(str, (String) ru.ozon.android.messenger.framework.navigation.action.b.b(d.c.ERROR_SUBTITLE.a(), map), null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 476, null);
        }
        Lm0.a.f17149a.e("Required params for error notification not found", new Object[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o1(ru.ozon.android.messenger.framework.navigation.action.a aVar) {
        Object obj = aVar.d().get("itemId");
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            this.f90205a.t(str);
        }
    }

    private final void p1(Function0<Unit> function0) {
        if (this.f90206b.E().getValue() instanceof NetworkInfo.Available) {
            function0.invoke();
        } else {
            this.f90196N.b(j.s.f89885a);
        }
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    public final Parcelable B(String str) {
        return (Parcelable) f90181A0.get(str);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    @NotNull
    public final InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.chatdetail.w> C() {
        return C2399j.o(C2399j.l(this.f90197O, 100L));
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    public final Ae.x0 J() {
        return this.f90191I;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    public final void R(@NotNull Uri data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f90205a.f(data);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    public final void T(@NotNull List<ru.ozon.android.messenger.framework.presentation.models.q> visibleItems) {
        Intrinsics.checkNotNullParameter(visibleItems, "visibleItems");
        this.f90239z0 = visibleItems;
        l1();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    public final void W(@NotNull ru.ozon.android.messenger.framework.navigation.action.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f90205a.q(action);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    @NotNull
    public final InterfaceC2395h<Unit> b0() {
        return C2399j.a(this.f90190H);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.common.view.recycler.u c() {
        return this.f90187E;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    @NotNull
    public final Ae.B0<NotificationDTO> d() {
        return C2399j.a(this.f90192J);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    @NotNull
    public final M0<String> e() {
        return this.f90189G;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    public final void f() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new b(null, this), 3);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    public final InterfaceC2395h g() {
        return this.f90219o.h();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    @NotNull
    public final ru.ozon.android.messenger.framework.navigation.controller.a getController() {
        return this.f90205a;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    @NotNull
    public final InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.chatdetail.j> getEvents() {
        return this.f90183A;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    @NotNull
    public final InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.common.screen.l> getLoader() {
        return this.f90188F;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    @NotNull
    public final M0<C0> h() {
        return this.f90186D;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    @NotNull
    public final C9472j i() {
        return this.f90195M;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    public final void l(Parcelable parcelable, String str) {
        if (str != null) {
            f90181A0.put(str, parcelable);
        }
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    @NotNull
    public final M0<ru.ozon.android.messenger.framework.domain.g> o() {
        return this.f90185C;
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        this.f90202X.clear();
        xe.B0 b02 = this.f90199Q;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        xe.B0 b03 = this.f90200R;
        if (b03 != null) {
            ((H0) b03).j(null);
        }
        this.f90220p.cleanup();
        xe.B0 b04 = this.f90229u0;
        if (b04 != null) {
            ((H0) b04).j(null);
        }
        this.f90229u0 = null;
        this.f90239z0 = kotlin.collections.K.f71697a;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    @NotNull
    public final p0 p() {
        return this.f90194L;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    public final void q(@NotNull List<? extends Uri> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f90205a.d(data);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    public final void r(@NotNull ArrayList data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f90205a.n(data);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a
    @NotNull
    public final Ae.B0<ru.ozon.android.messenger.blocks.messagetext.m> t() {
        return C2399j.a(this.f90193K);
    }
}
