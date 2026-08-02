package kc0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.EntryDTO;

/* renamed from: kc0.O, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC7641O {

    /* renamed from: kc0.O$a */
    public static final class a implements InterfaceC7641O {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f71303a;

        /* renamed from: b, reason: collision with root package name */
        private final EntryDTO.InputDTO.ErrorButton f71304b;

        public a(@NotNull String message, EntryDTO.InputDTO.ErrorButton errorButton) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f71303a = message;
            this.f71304b = errorButton;
        }

        public final EntryDTO.InputDTO.ErrorButton a() {
            return this.f71304b;
        }

        @NotNull
        public final String b() {
            return this.f71303a;
        }
    }

    /* renamed from: kc0.O$b */
    public static final class b implements InterfaceC7641O {

        /* renamed from: a, reason: collision with root package name */
        private final String f71305a;

        /* renamed from: b, reason: collision with root package name */
        private final EntryDTO.InputDTO.ErrorButton f71306b;

        public b(String str, EntryDTO.InputDTO.ErrorButton errorButton) {
            this.f71305a = str;
            this.f71306b = errorButton;
        }

        public final EntryDTO.InputDTO.ErrorButton a() {
            return this.f71306b;
        }

        public final String b() {
            return this.f71305a;
        }
    }

    /* renamed from: kc0.O$c */
    public static final class c implements InterfaceC7641O {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f71307a = new c();
    }
}
