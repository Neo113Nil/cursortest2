package ru.ozon.android.messenger.blocks.notification;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.databinding.MBlockNotificationBinding;

/* loaded from: classes10.dex */
public final class i extends ru.ozon.android.messenger.framework.core.viewmapper.a<NotificationDTO, ru.ozon.android.messenger.blocks.notification.b, MBlockNotificationBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockNotificationBinding> f85930a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.h<h> f85931b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<String, NotificationDTO> f85932c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f85933d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.b f85934e;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockNotificationBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f85935a = new a(3, MBlockNotificationBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockNotificationBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockNotificationBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockNotificationBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class b extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.notification.a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f85936b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.f85936b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.notification.a invoke() {
            return new ru.ozon.android.messenger.blocks.notification.a(this.f85936b);
        }
    }

    static final class c extends AbstractC7737t implements Function1<String, NotificationDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f85937b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(JsonParser jsonParser) {
            super(1);
            this.f85937b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final NotificationDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            NotificationDTO notificationDTO = (NotificationDTO) this.f85937b.fromJson(state, NotificationDTO.class);
            if (notificationDTO.getBadges() != null || notificationDTO.getButtons() != null || notificationDTO.getContent() != null || notificationDTO.getImage() != null) {
                return notificationDTO;
            }
            Lm0.a.f17149a.w(Nk.a.b("Can't parse notification dto from: ", state), new Object[0]);
            throw new InstantiationException("Empty notification dto");
        }
    }

    /* synthetic */ class d extends C7735q implements Function2<MBlockNotificationBinding, ru.ozon.android.messenger.framework.core.d, h> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f85938a = new d(2, h.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockNotificationBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final h invoke(MBlockNotificationBinding mBlockNotificationBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockNotificationBinding p02 = mBlockNotificationBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new h(p02, p12);
        }
    }

    public i(@NotNull JsonParser deserializer, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f85930a = a.f85935a;
        this.f85931b = d.f85938a;
        this.f85932c = new c(deserializer);
        this.f85933d = ru.ozon.android.messenger.utils.f.b(new b(context));
        this.f85934e = new a.AbstractC1563a.b(22, 0, null, Integer.valueOf(R$color.bg_primary), null);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f85934e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockNotificationBinding> getInflate() {
        return this.f85930a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.notification.a) this.f85933d.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, NotificationDTO> getParser() {
        return this.f85932c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final Function2<MBlockNotificationBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.notification.b, MBlockNotificationBinding>> getViewProducer() {
        return (Function2) this.f85931b;
    }
}
