package ru.ozon.android.messenger.framework.presentation.models.responses;

import T7.P;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public abstract class m {

    public static final class a extends m {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f91520a;

        /* renamed from: b, reason: collision with root package name */
        private final ru.ozon.android.messenger.blocks.chat.common.b f91521b;

        /* renamed from: c, reason: collision with root package name */
        private final Map<String, MessengerTrackingInfo> f91522c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String chatId, ru.ozon.android.messenger.blocks.chat.common.b bVar, Map<String, MessengerTrackingInfo> map) {
            super(0);
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            this.f91520a = chatId;
            this.f91521b = bVar;
            this.f91522c = map;
        }

        public final ru.ozon.android.messenger.blocks.chat.common.b a() {
            return this.f91521b;
        }

        @NotNull
        public final String b() {
            return this.f91520a;
        }

        public final Map<String, MessengerTrackingInfo> c() {
            return this.f91522c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f91520a, aVar.f91520a) && Intrinsics.d(this.f91521b, aVar.f91521b) && Intrinsics.d(this.f91522c, aVar.f91522c);
        }

        public final int hashCode() {
            int hashCode = this.f91520a.hashCode() * 31;
            ru.ozon.android.messenger.blocks.chat.common.b bVar = this.f91521b;
            int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Map<String, MessengerTrackingInfo> map = this.f91522c;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChatExist(chatId=");
            sb2.append(this.f91520a);
            sb2.append(", chatBaseInfo=");
            sb2.append(this.f91521b);
            sb2.append(", trackingInfo=");
            return P.f(sb2, this.f91522c, ")");
        }
    }

    public static final class b extends m {

        /* renamed from: a, reason: collision with root package name */
        private final q f91523a;

        public b(q qVar) {
            super(0);
            this.f91523a = qVar;
        }

        public final q a() {
            return this.f91523a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f91523a, ((b) obj).f91523a);
        }

        public final int hashCode() {
            q qVar = this.f91523a;
            if (qVar == null) {
                return 0;
            }
            return qVar.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Error(errorBlock=" + this.f91523a + ")";
        }
    }

    public /* synthetic */ m(int i11) {
        this();
    }

    private m() {
    }
}
