package ru.ozon.android.messenger.framework.presentation.chatdetail;

import C.o0;
import T7.P;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.C9514a;
import ru.ozon.android.messenger.framework.presentation.models.responses.c;
import ru.ozon.android.messenger.framework.presentation.models.y;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

/* loaded from: classes10.dex */
public abstract class j {

    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f89870a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String messageText) {
            super(0);
            Intrinsics.checkNotNullParameter(messageText, "messageText");
            this.f89870a = messageText;
        }

        @NotNull
        public final String a() {
            return this.f89870a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f89870a, ((a) obj).f89870a);
        }

        public final int hashCode() {
            return this.f89870a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("CopyMessage(messageText="), this.f89870a, ")");
        }
    }

    public static final class b extends j {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, Object> f89871a;

        public b(Map<String, ? extends Object> map) {
            super(0);
            this.f89871a = map;
        }

        public final Map<String, Object> a() {
            return this.f89871a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f89871a, ((b) obj).f89871a);
        }

        public final int hashCode() {
            Map<String, Object> map = this.f89871a;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        @NotNull
        public final String toString() {
            return P.f(new StringBuilder("CopyText(params="), this.f89871a, ")");
        }
    }

    public static final class c extends j {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f89872a = new c(0);
    }

    public static final class d extends j {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Function1<String, Unit> f89873a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(@NotNull Function1<? super String, Unit> callback) {
            super(0);
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f89873a = callback;
        }

        @NotNull
        public final Function1<String, Unit> a() {
            return this.f89873a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.d(this.f89873a, ((d) obj).f89873a);
        }

        public final int hashCode() {
            return this.f89873a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "GetTopVisibleMsgId(callback=" + this.f89873a + ")";
        }
    }

    public static final class e extends j {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f89874a = new e(0);
    }

    public static final class f extends j {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final f f89875a = new f(0);
    }

    public static final class g extends j {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final y f89876a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@NotNull y reportContent) {
            super(0);
            Intrinsics.checkNotNullParameter(reportContent, "reportContent");
            this.f89876a = reportContent;
        }

        @NotNull
        public final y a() {
            return this.f89876a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.d(this.f89876a, ((g) obj).f89876a);
        }

        public final int hashCode() {
            return this.f89876a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Report(reportContent=" + this.f89876a + ")";
        }
    }

    public static final class h extends j {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final h f89877a = new h(0);
    }

    public static final class i extends j {
        public i() {
            super(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            ((i) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        @NotNull
        public final String toString() {
            return "ScrollToBottom(disableSmoothScroll=false)";
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.j$j, reason: collision with other inner class name */
    public static final class C1661j extends j {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C1661j f89878a = new C1661j(0);
    }

    public static final class k extends j {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f89879a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(@NotNull String id2) {
            super(0);
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f89879a = id2;
        }

        @NotNull
        public final String a() {
            return this.f89879a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && Intrinsics.d(this.f89879a, ((k) obj).f89879a);
        }

        public final int hashCode() {
            return this.f89879a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("ScrollToMessage(id="), this.f89879a, ")");
        }
    }

    public static final class l extends j {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            ((l) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0) * 31;
        }

        @NotNull
        public final String toString() {
            return "ScrollToPosition(position=0, offset=null)";
        }
    }

    public static final class m extends j {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C9514a f89880a;

        static {
            int i11 = CellDTO.$stable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(@NotNull C9514a actionsCurtainVO) {
            super(0);
            Intrinsics.checkNotNullParameter(actionsCurtainVO, "actionsCurtainVO");
            this.f89880a = actionsCurtainVO;
        }

        @NotNull
        public final C9514a a() {
            return this.f89880a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && Intrinsics.d(this.f89880a, ((m) obj).f89880a);
        }

        public final int hashCode() {
            return this.f89880a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ShowActionCurtain(actionsCurtainVO=" + this.f89880a + ")";
        }
    }

    public static final class n extends j {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final n f89881a = new n(0);
    }

    public static final class o extends j {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final c.b.C1710b f89882a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(@NotNull c.b.C1710b couponContent) {
            super(0);
            Intrinsics.checkNotNullParameter(couponContent, "couponContent");
            this.f89882a = couponContent;
        }

        @NotNull
        public final c.b.C1710b a() {
            return this.f89882a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && Intrinsics.d(this.f89882a, ((o) obj).f89882a);
        }

        public final int hashCode() {
            return this.f89882a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ShowCouponDialog(couponContent=" + this.f89882a + ")";
        }
    }

    public static final class p extends j {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.blocks.curtain.c f89883a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(@NotNull ru.ozon.android.messenger.blocks.curtain.c curtainModalVO) {
            super(0);
            Intrinsics.checkNotNullParameter(curtainModalVO, "curtainModalVO");
            this.f89883a = curtainModalVO;
        }

        @NotNull
        public final ru.ozon.android.messenger.blocks.curtain.c a() {
            return this.f89883a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && Intrinsics.d(this.f89883a, ((p) obj).f89883a);
        }

        public final int hashCode() {
            return this.f89883a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ShowCurtainModal(curtainModalVO=" + this.f89883a + ")";
        }
    }

    public static final class q extends j {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.blocks.curtain.c f89884a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(@NotNull ru.ozon.android.messenger.blocks.curtain.c curtainModalVO) {
            super(0);
            Intrinsics.checkNotNullParameter(curtainModalVO, "curtainModalVO");
            this.f89884a = curtainModalVO;
        }

        @NotNull
        public final ru.ozon.android.messenger.blocks.curtain.c a() {
            return this.f89884a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && Intrinsics.d(this.f89884a, ((q) obj).f89884a);
        }

        public final int hashCode() {
            return this.f89884a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ShowCurtainModalV2(curtainModalVO=" + this.f89884a + ")";
        }
    }

    public static final class r extends j {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            ((r) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        @NotNull
        public final String toString() {
            return "ShowFlashBar(message=null, iconRes=null)";
        }
    }

    public static final class s extends j {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final s f89885a = new s(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return -907599906;
        }

        @NotNull
        public final String toString() {
            return "ShowNoInternetNotification";
        }
    }

    public /* synthetic */ j(int i11) {
        this();
    }

    private j() {
    }
}
