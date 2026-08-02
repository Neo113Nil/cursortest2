package j70;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.badgekit.BadgeKitState;
import ru.ozon.fintech.ui.toggleatom.ToggleAtomWrapperState;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;

/* loaded from: classes3.dex */
public interface g {

    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f69496a = new a();
    }

    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final FinToolbarState f69497a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final BadgeKitState f69498b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final BadgeKitState f69499c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final ToggleAtomWrapperState f69500d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final ToggleAtomWrapperState f69501e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final f f69502f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private final InterfaceC7305e f69503g;

        public b(@NotNull FinToolbarState finToolbarState, @NotNull BadgeKitState badgeKitStateLeft, @NotNull BadgeKitState badgeKitStateRight, @NotNull ToggleAtomWrapperState senderToggleState, @NotNull ToggleAtomWrapperState receiverToggleState, @NotNull f offlinePayStaticDataState, @NotNull InterfaceC7305e inputState) {
            Intrinsics.checkNotNullParameter(finToolbarState, "finToolbarState");
            Intrinsics.checkNotNullParameter(badgeKitStateLeft, "badgeKitStateLeft");
            Intrinsics.checkNotNullParameter(badgeKitStateRight, "badgeKitStateRight");
            Intrinsics.checkNotNullParameter(senderToggleState, "senderToggleState");
            Intrinsics.checkNotNullParameter(receiverToggleState, "receiverToggleState");
            Intrinsics.checkNotNullParameter(offlinePayStaticDataState, "offlinePayStaticDataState");
            Intrinsics.checkNotNullParameter(inputState, "inputState");
            this.f69497a = finToolbarState;
            this.f69498b = badgeKitStateLeft;
            this.f69499c = badgeKitStateRight;
            this.f69500d = senderToggleState;
            this.f69501e = receiverToggleState;
            this.f69502f = offlinePayStaticDataState;
            this.f69503g = inputState;
        }

        @NotNull
        public final BadgeKitState a() {
            return this.f69498b;
        }

        @NotNull
        public final BadgeKitState b() {
            return this.f69499c;
        }

        @NotNull
        public final FinToolbarState c() {
            return this.f69497a;
        }

        @NotNull
        public final InterfaceC7305e d() {
            return this.f69503g;
        }

        @NotNull
        public final f e() {
            return this.f69502f;
        }

        @NotNull
        public final ToggleAtomWrapperState f() {
            return this.f69501e;
        }

        @NotNull
        public final ToggleAtomWrapperState g() {
            return this.f69500d;
        }
    }
}
