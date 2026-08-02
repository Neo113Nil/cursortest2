package ru.ozon.android.messenger.framework.presentation.common.notification;

import androidx.fragment.app.r;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1689a f90777a = new C1689a();

    /* renamed from: ru.ozon.android.messenger.framework.presentation.common.notification.a$a, reason: collision with other inner class name */
    public static final class C1689a {

        /* renamed from: ru.ozon.android.messenger.framework.presentation.common.notification.a$a$a, reason: collision with other inner class name */
        static final class C1690a extends AbstractC7737t implements Function1<NotificationDTO, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ NotificationLayoutManager f90778b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ J f90779c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1690a(NotificationLayoutManager notificationLayoutManager, J j11) {
                super(1);
                this.f90778b = notificationLayoutManager;
                this.f90779c = j11;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(NotificationDTO notificationDTO) {
                NotificationDTO notification = notificationDTO;
                Intrinsics.checkNotNullParameter(notification, "notification");
                NotificationBar.Companion.make$default(NotificationBar.INSTANCE, this.f90778b, notification, this.f90779c, null, 8, null).show();
                return Unit.f71690a;
            }
        }

        public static NotificationDTO a(C1689a c1689a, Map map, int i11) {
            String str;
            int i12 = (i11 & 2) == 0 ? 5 : 2;
            NotificationDTO.Preset preset = NotificationDTO.Preset.NEGATIVE;
            c1689a.getClass();
            if (map == null || (str = (String) ru.ozon.android.messenger.framework.navigation.action.b.b(d.c.ERROR_TITLE.a(), map)) == null) {
                return null;
            }
            return new NotificationDTO(str, (String) ru.ozon.android.messenger.framework.navigation.action.b.b(d.c.ERROR_SUBTITLE.a(), map), null, Integer.valueOf(i12), null, null, null, null, null, preset, 468, null);
        }

        public static void c(ru.ozon.android.messenger.framework.presentation.models.responses.e eVar, @NotNull Function1 emitNotificationEvent) {
            Intrinsics.checkNotNullParameter(emitNotificationEvent, "emitNotificationEvent");
            if ((eVar != null ? eVar.b() : null) != null) {
                emitNotificationEvent.invoke(new NotificationDTO(eVar.b(), eVar.a(), null, 5, null, null, null, null, null, !eVar.c() ? NotificationDTO.Preset.SUCCESS : NotificationDTO.Preset.NEGATIVE, 468, null));
            }
        }

        public static void d(ru.ozon.android.messenger.framework.presentation.models.responses.e eVar, @NotNull NotificationLayoutManager layoutManager, @NotNull r lifecycleOwner) {
            Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            c(eVar, new b(layoutManager, lifecycleOwner));
        }

        public final void b(Map<String, ? extends Object> map, @NotNull NotificationLayoutManager layoutManager, @NotNull J lifecycleOwner) {
            Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            C1690a emitNotificationEvent = new C1690a(layoutManager, lifecycleOwner);
            Intrinsics.checkNotNullParameter(emitNotificationEvent, "emitNotificationEvent");
            NotificationDTO a11 = a(this, map, 4);
            if (a11 == null) {
                return;
            }
            emitNotificationEvent.invoke(a11);
        }
    }
}
