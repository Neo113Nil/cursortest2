package ru.ozon.android.messenger.framework.presentation.search;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

/* renamed from: ru.ozon.android.messenger.framework.presentation.search.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC9526f {

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.f$a */
    public static final class a implements InterfaceC9526f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.blocks.chat.search.i f91723a;

        public a(@NotNull ru.ozon.android.messenger.blocks.chat.search.i data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f91723a = data;
        }

        @NotNull
        public final ru.ozon.android.messenger.blocks.chat.search.i a() {
            return this.f91723a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f91723a, ((a) obj).f91723a);
        }

        public final int hashCode() {
            return this.f91723a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "OpenChat(data=" + this.f91723a + ")";
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.f$b */
    public static final class b implements InterfaceC9526f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f91724a;

        public b(@NotNull ArrayList blocksToRemove) {
            Intrinsics.checkNotNullParameter(blocksToRemove, "blocksToRemove");
            this.f91724a = blocksToRemove;
        }

        @NotNull
        public final List<ru.ozon.android.messenger.framework.presentation.models.e> a() {
            return this.f91724a;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.f$c */
    public static final class c implements InterfaceC9526f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.blocks.curtain.c f91725a;

        public c(@NotNull ru.ozon.android.messenger.blocks.curtain.c curtain) {
            Intrinsics.checkNotNullParameter(curtain, "curtain");
            this.f91725a = curtain;
        }

        @NotNull
        public final ru.ozon.android.messenger.blocks.curtain.c a() {
            return this.f91725a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.d(this.f91725a, ((c) obj).f91725a);
        }

        public final int hashCode() {
            return this.f91725a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ShowCurtainModal(curtain=" + this.f91725a + ")";
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.f$d */
    public static final class d implements InterfaceC9526f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final NotificationDTO f91726a;

        static {
            int i11 = NotificationDTO.$stable;
        }

        public d(@NotNull NotificationDTO notification) {
            Intrinsics.checkNotNullParameter(notification, "notification");
            this.f91726a = notification;
        }

        @NotNull
        public final NotificationDTO a() {
            return this.f91726a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.d(this.f91726a, ((d) obj).f91726a);
        }

        public final int hashCode() {
            return this.f91726a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ShowNotification(notification=" + this.f91726a + ")";
        }
    }
}
