package ru.ozon.android.messenger.framework.presentation.chatdetail;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.I0;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.x0;
import Bi.k;
import De.C2860c;
import Sc.InterfaceC4008j;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import fd.InterfaceC6511n;
import g.AbstractC6592d;
import g.InterfaceC6590b;
import h.C6758d;
import h.C6763i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.C7740w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.messagefile.g;
import ru.ozon.android.messenger.framework.presentation.chatdetail.k;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.C0;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.C9462b;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.C9467e;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.C9472j;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.p0;
import ru.ozon.android.messenger.framework.presentation.common.keyboard.b;
import ru.ozon.android.messenger.utils.m;
import ru.ozon.app.android.messenger.databinding.MFragmentChatBinding;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/chatdetail/d;", "Lru/ozon/android/messenger/framework/presentation/common/screen/i;", "Lru/ozon/app/android/messenger/databinding/MFragmentChatBinding;", "Lru/ozon/android/messenger/framework/presentation/common/launcher/a;", "Lru/ozon/android/messenger/utils/camera/a;", "<init>", "()V", "b", "c", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d extends ru.ozon.android.messenger.framework.presentation.common.screen.i<MFragmentChatBinding> implements ru.ozon.android.messenger.framework.presentation.common.launcher.a, ru.ozon.android.messenger.utils.camera.a {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ ru.ozon.android.messenger.utils.camera.e f89730c;

    /* renamed from: d, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.core.initialization.d f89731d;

    /* renamed from: e, reason: collision with root package name */
    public k.b f89732e;

    /* renamed from: f, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.data.b f89733f;

    /* renamed from: g, reason: collision with root package name */
    private ru.ozon.android.messenger.framework.presentation.chatdetail.k f89734g;

    /* renamed from: h, reason: collision with root package name */
    private Bundle f89735h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final y0 f89736i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final y0 f89737j;

    /* renamed from: k, reason: collision with root package name */
    private ru.ozon.android.messenger.framework.di.l f89738k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final y0 f89739l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final Ti.a f89740m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final Object f89741n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final Object f89742o;

    /* renamed from: p, reason: collision with root package name */
    private b.a f89743p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.keyboard.e f89744q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final Object f89745r;

    public static final class A extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f89746b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f89746b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f89746b.getValue()).getViewModelStore();
        }
    }

    public static final class B extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f89747b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f89747b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f89747b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public static final class C extends AbstractC7737t implements Function0<z0.b> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f89749c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f89749c = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            z0.b defaultViewModelProviderFactory;
            B0 b02 = (B0) this.f89749c.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return (interfaceC5431s == null || (defaultViewModelProviderFactory = interfaceC5431s.getDefaultViewModelProviderFactory()) == null) ? d.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class D extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public D() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return d.this;
        }
    }

    public static final class E extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D f89751b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public E(D d11) {
            super(0);
            this.f89751b = d11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f89751b.invoke();
        }
    }

    public static final class F extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f89752b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f89752b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f89752b.getValue()).getViewModelStore();
        }
    }

    public static final class G extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f89753b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public G(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f89753b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f89753b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    static final class H extends AbstractC7737t implements Function0<z0.b> {
        H() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            return new C9462b(d.x(d.this));
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.d$a, reason: case insensitive filesystem */
    /* synthetic */ class C9453a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MFragmentChatBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final C9453a f89755a = new C9453a(3, MFragmentChatBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MFragmentChatBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MFragmentChatBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MFragmentChatBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.d$b, reason: case insensitive filesystem */
    public static final class C9454b {
        @NotNull
        public static d a(@NotNull Uri deeplink, String str, String str2, boolean z11, boolean z12, @NotNull EnumC9455c scrollPosition) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(scrollPosition, "scrollPosition");
            G.c.e();
            d dVar = new d();
            ru.ozon.android.messenger.utils.g.g(dVar, new Pair("ARG_CHAT_DEEPLINK", deeplink), new Pair("ARG_CHAT_ID", str), new Pair("ARG_UNREAD_MSG_ID", str2), new Pair("ARG_FORCE_SCROLL", Boolean.valueOf(z11)), new Pair("ARG_SCROLL_POSITION", scrollPosition), new Pair("ARG_NEED_TO_HIGHLIGHT_ITEM", Boolean.valueOf(z12)));
            return dVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.d$c, reason: case insensitive filesystem */
    public static final class EnumC9455c implements Parcelable {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC9455c[] $VALUES;
        public static final EnumC9455c BOTTOM;
        public static final EnumC9455c CENTER;

        @NotNull
        public static final Parcelable.Creator<EnumC9455c> CREATOR;
        public static final EnumC9455c TOP;

        /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.d$c$a */
        public static final class a implements Parcelable.Creator<EnumC9455c> {
            @Override // android.os.Parcelable.Creator
            public final EnumC9455c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return EnumC9455c.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EnumC9455c[] newArray(int i11) {
                return new EnumC9455c[i11];
            }
        }

        static {
            EnumC9455c enumC9455c = new EnumC9455c("TOP", 0);
            TOP = enumC9455c;
            EnumC9455c enumC9455c2 = new EnumC9455c("CENTER", 1);
            CENTER = enumC9455c2;
            EnumC9455c enumC9455c3 = new EnumC9455c("BOTTOM", 2);
            BOTTOM = enumC9455c3;
            EnumC9455c[] enumC9455cArr = {enumC9455c, enumC9455c2, enumC9455c3};
            $VALUES = enumC9455cArr;
            $ENTRIES = Xc.b.a(enumC9455cArr);
            CREATOR = new a();
        }

        private EnumC9455c() {
            throw null;
        }

        public static EnumC9455c valueOf(String str) {
            return (EnumC9455c) Enum.valueOf(EnumC9455c.class, str);
        }

        public static EnumC9455c[] values() {
            return (EnumC9455c[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.d$d, reason: collision with other inner class name */
    static final class C1658d extends AbstractC7737t implements Function0<androidx.fragment.app.r> {
        C1658d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.fragment.app.r invoke() {
            return d.this.requireActivity();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.d$e, reason: case insensitive filesystem */
    static final class C9456e extends AbstractC7737t implements Function1<List<? extends Hi.l>, Unit> {
        C9456e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends Hi.l> list) {
            List<? extends Hi.l> selectedMedia = list;
            Intrinsics.checkNotNullParameter(selectedMedia, "selectedMedia");
            InterfaceC9460a A11 = d.this.A();
            List<? extends Hi.l> list2 = selectedMedia;
            ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Hi.l) it.next()).getUri());
            }
            A11.r(arrayList);
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.d$f, reason: case insensitive filesystem */
    static final class C9457f extends AbstractC7737t implements Function0<B0> {
        C9457f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            ComponentCallbacksC5392m requireParentFragment = d.this.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
            return requireParentFragment;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.ChatFragment$onViewCreated$$inlined$observe$1", f = "ChatFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.d$g, reason: case insensitive filesystem */
    public static final class C9458g extends kotlin.coroutines.jvm.internal.j implements Function2<Uri, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f89759d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f89760e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9458g(kotlin.coroutines.d dVar, d dVar2) {
            super(2, dVar);
            this.f89760e = dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C9458g c9458g = new C9458g(dVar, this.f89760e);
            c9458g.f89759d = obj;
            return c9458g;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Uri uri, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C9458g) create(uri, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            this.f89760e.A().R((Uri) this.f89759d);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.ChatFragment$onViewCreated$$inlined$observe$2", f = "ChatFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.d$h, reason: case insensitive filesystem */
    public static final class C9459h extends kotlin.coroutines.jvm.internal.j implements Function2<NotificationDTO, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f89761d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f89762e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9459h(kotlin.coroutines.d dVar, d dVar2) {
            super(2, dVar);
            this.f89762e = dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C9459h c9459h = new C9459h(dVar, this.f89762e);
            c9459h.f89761d = obj;
            return c9459h;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(NotificationDTO notificationDTO, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C9459h) create(notificationDTO, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            NotificationDTO notificationDTO = (NotificationDTO) this.f89761d;
            d dVar = this.f89762e;
            ConstraintLayout chatContainerCl = d.w(dVar).chatContainerCl;
            Intrinsics.checkNotNullExpressionValue(chatContainerCl, "chatContainerCl");
            NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(chatContainerCl, null, 1, null);
            if (asNotificationLayoutManager$default != null) {
                NotificationBar.Companion companion = NotificationBar.INSTANCE;
                J viewLifecycleOwner = dVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                NotificationBar.Companion.make$default(companion, asNotificationLayoutManager$default, notificationDTO, viewLifecycleOwner, null, 8, null).show();
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.ChatFragment$onViewCreated$$inlined$observe$3", f = "ChatFragment.kt", l = {}, m = "invokeSuspend")
    public static final class i extends kotlin.coroutines.jvm.internal.j implements Function2<ru.ozon.android.messenger.blocks.messagetext.m, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f89763d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f89764e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(kotlin.coroutines.d dVar, d dVar2) {
            super(2, dVar);
            this.f89764e = dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            i iVar = new i(dVar, this.f89764e);
            iVar.f89763d = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ru.ozon.android.messenger.blocks.messagetext.m mVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(mVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            ru.ozon.android.messenger.framework.presentation.models.responses.d externalTransitionModalVO = ((ru.ozon.android.messenger.blocks.messagetext.m) this.f89763d).a();
            Intrinsics.checkNotNullParameter(externalTransitionModalVO, "externalTransitionModalVO");
            ru.ozon.android.messenger.blocks.messagetext.b bVar = new ru.ozon.android.messenger.blocks.messagetext.b();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTERNAL_TRANSITION_MODAL_ARG_KEY", externalTransitionModalVO);
            bVar.setArguments(bundle);
            bVar.show(this.f89764e.getChildFragmentManager(), ru.ozon.android.messenger.blocks.messagetext.b.class.getSimpleName());
            return Unit.f71690a;
        }
    }

    /* synthetic */ class j extends C7735q implements Function1<List<? extends ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends ru.ozon.android.messenger.framework.presentation.models.q> list) {
            List<? extends ru.ozon.android.messenger.framework.presentation.models.q> p02 = list;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((InterfaceC9460a) this.receiver).T(p02);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class k extends C7740w {
        @Override // kotlin.reflect.n
        public final Object get() {
            return ((ru.ozon.android.messenger.framework.presentation.chatdetail.k) this.receiver).C();
        }

        @Override // kotlin.reflect.j
        public final void set(Object obj) {
            ((ru.ozon.android.messenger.framework.presentation.chatdetail.k) this.receiver).N((Integer) obj);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.ChatFragment$onViewCreated$lambda$14$$inlined$observe$10", f = "ChatFragment.kt", l = {}, m = "invokeSuspend")
    public static final class l extends kotlin.coroutines.jvm.internal.j implements Function2<ru.ozon.android.messenger.framework.presentation.messenger.i, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f89765d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.chatdetail.k f89766e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.presentation.chatdetail.k kVar) {
            super(2, dVar);
            this.f89766e = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            l lVar = new l(dVar, this.f89766e);
            lVar.f89765d = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ru.ozon.android.messenger.framework.presentation.messenger.i iVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(iVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            this.f89766e.x((ru.ozon.android.messenger.framework.presentation.messenger.i) this.f89765d);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.ChatFragment$onViewCreated$lambda$14$$inlined$observe$1", f = "ChatFragment.kt", l = {}, m = "invokeSuspend")
    public static final class m extends kotlin.coroutines.jvm.internal.j implements Function2<C0, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f89767d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.chatdetail.k f89768e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.presentation.chatdetail.k kVar) {
            super(2, dVar);
            this.f89768e = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            m mVar = new m(dVar, this.f89768e);
            mVar.f89767d = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C0 c02, kotlin.coroutines.d<? super Unit> dVar) {
            return ((m) create(c02, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            this.f89768e.U((C0) this.f89767d);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.ChatFragment$onViewCreated$lambda$14$$inlined$observe$2", f = "ChatFragment.kt", l = {}, m = "invokeSuspend")
    public static final class n extends kotlin.coroutines.jvm.internal.j implements Function2<Boolean, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f89769d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.chatdetail.k f89770e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.presentation.chatdetail.k kVar) {
            super(2, dVar);
            this.f89770e = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            n nVar = new n(dVar, this.f89770e);
            nVar.f89769d = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, kotlin.coroutines.d<? super Unit> dVar) {
            return ((n) create(bool, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            this.f89770e.v(((Boolean) this.f89769d).booleanValue());
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.ChatFragment$onViewCreated$lambda$14$$inlined$observe$3", f = "ChatFragment.kt", l = {}, m = "invokeSuspend")
    public static final class o extends kotlin.coroutines.jvm.internal.j implements Function2<ru.ozon.android.messenger.framework.presentation.chatdetail.j, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f89771d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.chatdetail.k f89772e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.presentation.chatdetail.k kVar) {
            super(2, dVar);
            this.f89772e = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            o oVar = new o(dVar, this.f89772e);
            oVar.f89771d = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ru.ozon.android.messenger.framework.presentation.chatdetail.j jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((o) create(jVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            this.f89772e.z((ru.ozon.android.messenger.framework.presentation.chatdetail.j) this.f89771d);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.ChatFragment$onViewCreated$lambda$14$$inlined$observe$4", f = "ChatFragment.kt", l = {}, m = "invokeSuspend")
    public static final class p extends kotlin.coroutines.jvm.internal.j implements Function2<ru.ozon.android.messenger.framework.domain.g, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f89773d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.chatdetail.k f89774e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.presentation.chatdetail.k kVar) {
            super(2, dVar);
            this.f89774e = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            p pVar = new p(dVar, this.f89774e);
            pVar.f89773d = obj;
            return pVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ru.ozon.android.messenger.framework.domain.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((p) create(gVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            this.f89774e.V((ru.ozon.android.messenger.framework.domain.g) this.f89773d);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.ChatFragment$onViewCreated$lambda$14$$inlined$observe$5", f = "ChatFragment.kt", l = {}, m = "invokeSuspend")
    public static final class q extends kotlin.coroutines.jvm.internal.j implements Function2<Integer, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f89775d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.chatdetail.k f89776e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.presentation.chatdetail.k kVar) {
            super(2, dVar);
            this.f89776e = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            q qVar = new q(dVar, this.f89776e);
            qVar.f89775d = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, kotlin.coroutines.d<? super Unit> dVar) {
            return ((q) create(num, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            this.f89776e.W(((Number) this.f89775d).intValue());
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.ChatFragment$onViewCreated$lambda$14$$inlined$observe$6", f = "ChatFragment.kt", l = {}, m = "invokeSuspend")
    public static final class r extends kotlin.coroutines.jvm.internal.j implements Function2<Integer, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f89777d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.j f89778e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(kotlin.coroutines.d dVar, kotlin.reflect.j jVar) {
            super(2, dVar);
            this.f89778e = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            r rVar = new r(dVar, this.f89778e);
            rVar.f89777d = obj;
            return rVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, kotlin.coroutines.d<? super Unit> dVar) {
            return ((r) create(num, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            this.f89778e.set((Integer) this.f89777d);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.ChatFragment$onViewCreated$lambda$14$$inlined$observe$7", f = "ChatFragment.kt", l = {}, m = "invokeSuspend")
    public static final class s extends kotlin.coroutines.jvm.internal.j implements Function2<ru.ozon.android.messenger.framework.presentation.common.screen.l, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f89779d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.chatdetail.k f89780e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.presentation.chatdetail.k kVar) {
            super(2, dVar);
            this.f89780e = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            s sVar = new s(dVar, this.f89780e);
            sVar.f89779d = obj;
            return sVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ru.ozon.android.messenger.framework.presentation.common.screen.l lVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((s) create(lVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            this.f89780e.J((ru.ozon.android.messenger.framework.presentation.common.screen.l) this.f89779d);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.ChatFragment$onViewCreated$lambda$14$$inlined$observe$8", f = "ChatFragment.kt", l = {}, m = "invokeSuspend")
    public static final class t extends kotlin.coroutines.jvm.internal.j implements Function2<Unit, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f89781d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.chatdetail.k f89782e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.presentation.chatdetail.k kVar) {
            super(2, dVar);
            this.f89782e = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            t tVar = new t(dVar, this.f89782e);
            tVar.f89781d = obj;
            return tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, kotlin.coroutines.d<? super Unit> dVar) {
            return ((t) create(unit, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            this.f89782e.B();
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.ChatFragment$onViewCreated$lambda$14$$inlined$observe$9", f = "ChatFragment.kt", l = {}, m = "invokeSuspend")
    public static final class u extends kotlin.coroutines.jvm.internal.j implements Function2<ru.ozon.android.messenger.framework.presentation.chatdetail.w, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f89783d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.chatdetail.k f89784e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.presentation.chatdetail.k kVar) {
            super(2, dVar);
            this.f89784e = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            u uVar = new u(dVar, this.f89784e);
            uVar.f89783d = obj;
            return uVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ru.ozon.android.messenger.framework.presentation.chatdetail.w wVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((u) create(wVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            this.f89784e.y((ru.ozon.android.messenger.framework.presentation.chatdetail.w) this.f89783d);
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class v extends AbstractC7737t implements Function0<androidx.lifecycle.G> {

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f89786a;

            static {
                int[] iArr = new int[AbstractC5434v.a.values().length];
                try {
                    iArr[AbstractC5434v.a.ON_STOP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f89786a = iArr;
            }
        }

        v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.G invoke() {
            return new QD.a(d.this, 2);
        }
    }

    public static final class w extends AbstractC7737t implements Function0<A0> {
        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return d.this.requireActivity().getViewModelStore();
        }
    }

    public static final class x extends AbstractC7737t implements Function0<AbstractC6409a> {
        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            return d.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class y extends AbstractC7737t implements Function0<z0.b> {
        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            return d.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class z extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f89790b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Function0 function0) {
            super(0);
            this.f89790b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f89790b.invoke();
        }
    }

    public d() {
        super(C9453a.f89755a);
        this.f89730c = new ru.ozon.android.messenger.utils.camera.e();
        this.f89736i = b0.b(this, N.b(ru.ozon.android.messenger.framework.presentation.messenger.b.class), new w(), new x(), new y());
        C9457f c9457f = new C9457f();
        Sc.n nVar = Sc.n.NONE;
        InterfaceC4008j a11 = Sc.k.a(nVar, new z(c9457f));
        this.f89737j = b0.b(this, N.b(ru.ozon.android.messenger.framework.presentation.messenger.l.class), new A(a11), new B(a11), new C(a11));
        H h11 = new H();
        InterfaceC4008j a12 = Sc.k.a(nVar, new E(new D()));
        this.f89739l = b0.b(this, N.b(C9467e.class), new F(a12), new G(a12), h11);
        int i11 = Bi.k.f3828a;
        this.f89740m = k.a.i(this, new C9456e(), 7);
        this.f89741n = ru.ozon.android.messenger.utils.f.b(new v());
        this.f89742o = ru.ozon.android.messenger.utils.f.b(new C1658d());
        this.f89744q = ru.ozon.android.messenger.framework.presentation.common.keyboard.e.f90775a;
        this.f89745r = U.j(new Pair("PICK_FILE", registerForActivityResult(new C6758d(), new InterfaceC6590b() { // from class: ru.ozon.android.messenger.framework.presentation.chatdetail.b
            @Override // g.InterfaceC6590b
            public final void onActivityResult(Object obj) {
                d.u(d.this, (List) obj);
            }
        })), new Pair("REQUEST_PERMISSION", registerForActivityResult(new C6763i(), new c(this, 0))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC9460a A() {
        return (InterfaceC9460a) this.f89739l.getValue();
    }

    public static void u(d dVar, List uriList) {
        Intrinsics.checkNotNullParameter(uriList, "uriList");
        dVar.A().q(uriList);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public static void v(d dVar, boolean z11) {
        boolean shouldShowRequestPermissionRationale = ((androidx.fragment.app.r) dVar.f89742o.getValue()).shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE");
        if (!z11 && !shouldShowRequestPermissionRationale) {
            dVar.A().f();
        } else {
            Bundle arguments = dVar.getArguments();
            dVar.A().getController().v(new g.a(z11, arguments != null ? arguments.getString("M_FILE_ID_KEY") : null));
        }
    }

    public static final /* synthetic */ MFragmentChatBinding w(d dVar) {
        return dVar.getBinding();
    }

    public static final ru.ozon.android.messenger.framework.di.l x(d dVar) {
        ru.ozon.android.messenger.framework.di.l lVar = dVar.f89738k;
        if (lVar != null) {
            return lVar;
        }
        ru.ozon.android.messenger.framework.core.initialization.di.c d11 = ru.ozon.android.messenger.utils.g.d(dVar);
        Bundle requireArguments = dVar.requireArguments();
        Intrinsics.f(requireArguments);
        ru.ozon.android.messenger.framework.di.l a11 = d11.j().a(new ru.ozon.android.messenger.framework.presentation.chatdetail.i((Uri) ru.ozon.android.messenger.utils.f.a(requireArguments, "ARG_CHAT_DEEPLINK", Uri.class), requireArguments.getString("ARG_CHAT_ID"), requireArguments.getString("ARG_UNREAD_MSG_ID"), requireArguments.getBoolean("ARG_FORCE_SCROLL")));
        dVar.f89738k = a11;
        a11.b(dVar);
        return a11;
    }

    @Override // ru.ozon.android.messenger.utils.camera.a
    public final void b(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f89730c.b(fragment);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // ru.ozon.android.messenger.framework.presentation.common.launcher.a
    @NotNull
    public final <T> AbstractC6592d<T> g(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        AbstractC6592d<T> abstractC6592d = (AbstractC6592d) this.f89745r.get(tag);
        if (abstractC6592d != null) {
            return abstractC6592d;
        }
        throw new IllegalArgumentException("Unable to find launcher by ".concat(tag));
    }

    @NotNull
    public final Bi.k getGalleryLauncher() {
        return this.f89740m;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        ProcessLifecycleOwner processLifecycleOwner;
        ru.ozon.android.messenger.utils.g.d(this).b(this);
        super.onCreate(bundle);
        Intrinsics.checkNotNullParameter(this, "fragment");
        this.f89730c.i(this);
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().a((androidx.lifecycle.G) this.f89741n.getValue());
        ((ru.ozon.android.messenger.framework.presentation.messenger.b) this.f89736i.getValue()).g0(A().e());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Sc.j, java.lang.Object] */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroy() {
        ProcessLifecycleOwner processLifecycleOwner;
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().e((androidx.lifecycle.G) this.f89741n.getValue());
        super.onDestroy();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.screen.i, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        C9472j i11 = A().i();
        ru.ozon.android.messenger.framework.presentation.chatdetail.k kVar = this.f89734g;
        i11.d(kVar != null ? kVar.I() : null);
        InterfaceC9460a A11 = A();
        String value = A().e().getValue();
        ru.ozon.android.messenger.framework.presentation.chatdetail.k kVar2 = this.f89734g;
        A11.l(kVar2 != null ? kVar2.E() : null, value);
        ru.ozon.android.messenger.framework.presentation.chatdetail.k kVar3 = this.f89734g;
        if (kVar3 != null) {
            kVar3.w();
        }
        ru.ozon.android.messenger.framework.presentation.chatdetail.k kVar4 = this.f89734g;
        if (kVar4 != null) {
            kVar4.u();
        }
        ru.ozon.android.messenger.framework.presentation.chatdetail.k kVar5 = this.f89734g;
        this.f89735h = kVar5 != null ? kVar5.A() : null;
        ru.ozon.android.messenger.framework.presentation.common.keyboard.e eVar = this.f89744q;
        eVar.getClass();
        eVar.a(b.c.a.f90771a);
        this.f89743p = null;
        if (isRemoving() || requireActivity().isFinishing()) {
            this.f89738k = null;
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onPause() {
        super.onPause();
        b.a aVar = this.f89743p;
        this.f89744q.a(aVar != null ? aVar.d() : null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        ru.ozon.android.messenger.framework.presentation.chatdetail.k kVar = this.f89734g;
        outState.putBundle("CHAT_VIEW_DELEGATE_SAVE_BUNDLE_KEY", kVar != null ? kVar.A() : null);
        b.a aVar = this.f89743p;
        b.c d11 = aVar != null ? aVar.d() : null;
        this.f89744q.getClass();
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putParcelable("KEYBOARD_STATE_BUNDLE_KEY", d11);
        outState.putAll(this.f89730c.h());
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        A().i().b();
        ((ru.ozon.android.messenger.framework.presentation.messenger.l) this.f89737j.getValue()).t0("communications_chat_detail");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        A().i().c();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Sc.j, java.lang.Object] */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Bundle bundle2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Intrinsics.checkNotNullParameter(this, "fragment");
        ru.ozon.android.messenger.utils.camera.e eVar = this.f89730c;
        eVar.g(this, bundle);
        AbstractC5434v lifecycle = getViewLifecycleOwner().getLifecycle();
        m.a aVar = m.a.ADJUST_RESIZE;
        Window window = ((androidx.fragment.app.r) this.f89742o.getValue()).getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        lifecycle.a(new ru.ozon.android.messenger.utils.m(aVar, window));
        ConstraintLayout constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.f89743p = new b.a(constraintLayout, K.a(this));
        this.f89744q.b(bundle);
        ru.ozon.android.messenger.framework.navigation.controller.a controller = A().getController();
        ConstraintLayout constraintLayout2 = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ru.ozon.android.messenger.framework.presentation.messenger.a f02 = ((ru.ozon.android.messenger.framework.presentation.messenger.b) this.f89736i.getValue()).f0();
        ru.ozon.android.messenger.framework.data.b bVar = this.f89733f;
        if (bVar == null) {
            Intrinsics.n("blockStore");
            throw null;
        }
        ru.ozon.android.messenger.framework.core.d dVar = new ru.ozon.android.messenger.framework.core.d(controller, constraintLayout2, viewLifecycleOwner, this, f02, bVar);
        k.b bVar2 = this.f89732e;
        if (bVar2 == null) {
            Intrinsics.n("chatViewDelegateFactory");
            throw null;
        }
        MFragmentChatBinding binding = getBinding();
        ru.ozon.android.messenger.framework.presentation.common.view.recycler.p pVar = new ru.ozon.android.messenger.framework.presentation.common.view.recycler.p(A().c());
        j jVar = new j(1, A(), InterfaceC9460a.class, "onItemsAppeared", "onItemsAppeared(Ljava/util/List;)V", 0);
        if (bundle == null || (bundle2 = bundle.getBundle("CHAT_VIEW_DELEGATE_SAVE_BUNDLE_KEY")) == null) {
            bundle2 = this.f89735h;
        }
        ru.ozon.android.messenger.framework.presentation.chatdetail.k a11 = bVar2.a(binding, pVar, jVar, dVar, bundle2);
        this.f89734g = a11;
        a11.P(A().B(A().e().getValue()));
        a11.R(requireArguments().getString("ARG_UNREAD_MSG_ID"));
        Bundle requireArguments = requireArguments();
        Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments(...)");
        a11.S((EnumC9455c) ru.ozon.android.messenger.utils.f.a(requireArguments, "ARG_SCROLL_POSITION", EnumC9455c.class));
        a11.O(requireArguments().getBoolean("ARG_FORCE_SCROLL"));
        a11.Q(requireArguments().getBoolean("ARG_NEED_TO_HIGHLIGHT_ITEM"));
        M0<C0> h11 = A().h();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner2, h11, new m(null, a11));
        p0 p11 = A().p();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner3, p11, new n(null, a11));
        InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.chatdetail.j> events = A().getEvents();
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner4, events, new o(null, a11));
        M0<ru.ozon.android.messenger.framework.domain.g> o11 = A().o();
        androidx.lifecycle.D a12 = K.a(this);
        int i11 = I0.f818a;
        Ae.B0 K11 = C2399j.K(o11, a12, I0.a.d(), 0);
        J viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner5, K11, new p(null, a11));
        InterfaceC2395h<Integer> g10 = A().g();
        J viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner6, g10, new q(null, a11));
        x0 J11 = A().J();
        k kVar = new k(a11, ru.ozon.android.messenger.framework.presentation.chatdetail.k.class, "firstScrollToPosition", "getFirstScrollToPosition()Ljava/lang/Integer;", 0);
        J viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
        new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner7, J11, new r(null, kVar));
        InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.common.screen.l> loader = A().getLoader();
        J viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "getViewLifecycleOwner(...)");
        new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner8, loader, new s(null, a11));
        InterfaceC2395h<Unit> b02 = A().b0();
        J viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "getViewLifecycleOwner(...)");
        new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner9, b02, new t(null, a11));
        InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.chatdetail.w> C11 = A().C();
        J viewLifecycleOwner10 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner10, "getViewLifecycleOwner(...)");
        new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner10, C11, new u(null, a11));
        Ae.C0 r02 = ((ru.ozon.android.messenger.framework.presentation.messenger.l) this.f89737j.getValue()).r0();
        J viewLifecycleOwner11 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner11, "getViewLifecycleOwner(...)");
        new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner11, r02, new l(null, a11));
        ConstraintLayout constraintLayout3 = getBinding().getConstraintLayout();
        if (this.f89731d == null) {
            Intrinsics.n("messengerConfig");
            throw null;
        }
        constraintLayout3.setFitsSystemWindows(!r2.getEnabledInsets());
        ru.ozon.android.messenger.framework.core.initialization.d dVar2 = this.f89731d;
        if (dVar2 == null) {
            Intrinsics.n("messengerConfig");
            throw null;
        }
        if (dVar2.getEnabledInsets()) {
            Y.J(getBinding().getConstraintLayout(), new C2860c());
        }
        C2406m0 c2406m0 = new C2406m0(eVar.f());
        J viewLifecycleOwner12 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner12, "getViewLifecycleOwner(...)");
        new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner12, c2406m0, new C9458g(null, this));
        Ae.B0<NotificationDTO> d11 = A().d();
        J viewLifecycleOwner13 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner13, "getViewLifecycleOwner(...)");
        new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner13, d11, new C9459h(null, this));
        Ae.B0<ru.ozon.android.messenger.blocks.messagetext.m> t2 = A().t();
        J viewLifecycleOwner14 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner14, "getViewLifecycleOwner(...)");
        new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner14, t2, new i(null, this));
    }
}
