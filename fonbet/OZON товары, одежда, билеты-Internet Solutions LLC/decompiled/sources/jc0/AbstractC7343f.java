package jc0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.OtpDTO;

/* renamed from: jc0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7343f {

    /* renamed from: jc0.f$a */
    public static final class a extends AbstractC7343f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final OtpDTO.AgreementSheet f69708a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final FastEntryActionDTO f69709b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull OtpDTO.AgreementSheet curtain, @NotNull FastEntryActionDTO action) {
            super(0);
            Intrinsics.checkNotNullParameter(curtain, "curtain");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f69708a = curtain;
            this.f69709b = action;
        }

        @NotNull
        public final FastEntryActionDTO a() {
            return this.f69709b;
        }

        @NotNull
        public final OtpDTO.AgreementSheet b() {
            return this.f69708a;
        }
    }

    /* renamed from: jc0.f$b */
    public static final class b extends AbstractC7343f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final FastEntryActionDTO.FastEntryDataDTO.AuthCurtain f69710a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final FastEntryActionDTO.FastEntryDataDTO f69711b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final FastEntryActionDTO f69712c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull FastEntryActionDTO.FastEntryDataDTO.AuthCurtain curtain, @NotNull FastEntryActionDTO.FastEntryDataDTO data, @NotNull FastEntryActionDTO action) {
            super(0);
            Intrinsics.checkNotNullParameter(curtain, "curtain");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f69710a = curtain;
            this.f69711b = data;
            this.f69712c = action;
        }

        @NotNull
        public final FastEntryActionDTO a() {
            return this.f69712c;
        }

        @NotNull
        public final FastEntryActionDTO.FastEntryDataDTO.AuthCurtain b() {
            return this.f69710a;
        }

        @NotNull
        public final FastEntryActionDTO.FastEntryDataDTO c() {
            return this.f69711b;
        }
    }

    public /* synthetic */ AbstractC7343f(int i11) {
        this();
    }

    private AbstractC7343f() {
    }
}
