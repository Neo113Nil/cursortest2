package ru.ozon.android.messenger.framework.navigation.controller;

import B90.C2618u;
import C.o0;
import Kk.C3532b;
import T7.P;
import Ve.Om;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.z0;

/* loaded from: classes10.dex */
public interface d {

    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, String> f89179a;

        public a(Map<String, String> map) {
            this.f89179a = map;
        }

        public final Map<String, String> a() {
            return this.f89179a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f89179a, ((a) obj).f89179a);
        }

        public final int hashCode() {
            Map<String, String> map = this.f89179a;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        @NotNull
        public final String toString() {
            return P.f(new StringBuilder("AiRefresh(params="), this.f89179a, ")");
        }
    }

    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        private final int f89180a;

        public b(int i11) {
            Intrinsics.checkNotNullParameter("m_ic_disclaimer", "icon");
            this.f89180a = i11;
        }

        public final int a() {
            return this.f89180a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            if (this.f89180a != ((b) obj).f89180a) {
                return false;
            }
            Long l11 = 5000L;
            return l11.equals(5000L);
        }

        public final int hashCode() {
            Long l11 = 5000L;
            return l11.hashCode() + (((Integer.hashCode(this.f89180a) * 31) + 1003387278) * 31);
        }

        @NotNull
        public final String toString() {
            return "AlertNew(textRes=" + this.f89180a + ", icon=m_ic_disclaimer, ttl=" + ((Object) 5000L) + ")";
        }
    }

    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f89181a;

        public c(String text) {
            Intrinsics.checkNotNullParameter("input_issues_alert_block_id", "alertBlockId");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter("ic_m_danger_filled", "icon");
            this.f89181a = text;
        }

        @NotNull
        public final String a() {
            return this.f89181a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            return Intrinsics.d(this.f89181a, cVar.f89181a);
        }

        public final int hashCode() {
            return (((this.f89181a.hashCode() - 379685632) * 31) + 175109511) * 31;
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("AlertWithCustomTextNew(alertBlockId=input_issues_alert_block_id, text="), this.f89181a, ", icon=ic_m_danger_filled, ttl=null)");
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.navigation.controller.d$d, reason: collision with other inner class name */
    public static final class C1642d implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C1642d f89182a = new C1642d();
    }

    public static final class e implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f89183a;

        public e(@NotNull String chatId) {
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            this.f89183a = chatId;
        }

        @NotNull
        public final String a() {
            return this.f89183a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.d(this.f89183a, ((e) obj).f89183a);
        }

        public final int hashCode() {
            return this.f89183a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("EditMessage(chatId="), this.f89183a, ")");
        }
    }

    public static final class f implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.framework.navigation.action.a f89184a;

        public f(@NotNull ru.ozon.android.messenger.framework.navigation.action.a actionWrapper) {
            Intrinsics.checkNotNullParameter(actionWrapper, "actionWrapper");
            this.f89184a = actionWrapper;
        }

        @NotNull
        public final ru.ozon.android.messenger.framework.navigation.action.a a() {
            return this.f89184a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.d(this.f89184a, ((f) obj).f89184a);
        }

        public final int hashCode() {
            return this.f89184a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "HandleAction(actionWrapper=" + this.f89184a + ")";
        }
    }

    public static final class g implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Map<String, MessengerTrackingInfo> f89185a;

        public g(@NotNull Map<String, MessengerTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
            this.f89185a = trackingInfo;
        }

        @NotNull
        public final Map<String, MessengerTrackingInfo> a() {
            return this.f89185a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.d(this.f89185a, ((g) obj).f89185a);
        }

        public final int hashCode() {
            return this.f89185a.hashCode();
        }

        @NotNull
        public final String toString() {
            return P.f(new StringBuilder("HandleClickEvent(trackingInfo="), this.f89185a, ")");
        }
    }

    public static final class h implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.framework.navigation.action.c f89186a;

        public h(@NotNull ru.ozon.android.messenger.framework.navigation.action.c action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.f89186a = action;
        }

        @NotNull
        public final ru.ozon.android.messenger.framework.navigation.action.c a() {
            return this.f89186a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.d(this.f89186a, ((h) obj).f89186a);
        }

        public final int hashCode() {
            return this.f89186a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "HandleClientAction(action=" + this.f89186a + ")";
        }
    }

    public static final class i implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Map<String, MessengerTrackingInfo> f89187a;

        public i(@NotNull Map<String, MessengerTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
            this.f89187a = trackingInfo;
        }

        @NotNull
        public final Map<String, MessengerTrackingInfo> a() {
            return this.f89187a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Intrinsics.d(this.f89187a, ((i) obj).f89187a);
        }

        public final int hashCode() {
            return this.f89187a.hashCode();
        }

        @NotNull
        public final String toString() {
            return P.f(new StringBuilder("HandleCustomEvent(trackingInfo="), this.f89187a, ")");
        }
    }

    public static final class j implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.framework.analytics.d f89188a;

        public j(@NotNull ru.ozon.android.messenger.framework.analytics.d customEvent) {
            Intrinsics.checkNotNullParameter(customEvent, "customEvent");
            this.f89188a = customEvent;
        }

        @NotNull
        public final ru.ozon.android.messenger.framework.analytics.d a() {
            return this.f89188a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.d(this.f89188a, ((j) obj).f89188a);
        }

        public final int hashCode() {
            return this.f89188a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "HandleCustomEventV2(customEvent=" + this.f89188a + ")";
        }
    }

    public static final class k implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<Uri> f89189a;

        /* JADX WARN: Multi-variable type inference failed */
        public k(@NotNull List<? extends Uri> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f89189a = data;
        }

        @NotNull
        public final List<Uri> a() {
            return this.f89189a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && Intrinsics.d(this.f89189a, ((k) obj).f89189a);
        }

        public final int hashCode() {
            return this.f89189a.hashCode();
        }

        @NotNull
        public final String toString() {
            return C2618u.h(new StringBuilder("HandlePickFileData(data="), this.f89189a, ")");
        }
    }

    public static final class l implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f89190a;

        public l(@NotNull ArrayList data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f89190a = data;
        }

        @NotNull
        public final List<Uri> a() {
            return this.f89190a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f89190a.equals(((l) obj).f89190a);
        }

        public final int hashCode() {
            return this.f89190a.hashCode();
        }

        @NotNull
        public final String toString() {
            return Om.a(")", new StringBuilder("HandlePickPhotoData(data="), this.f89190a);
        }
    }

    public static final class m implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Uri f89191a;

        public m(@NotNull Uri data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f89191a = data;
        }

        @NotNull
        public final Uri a() {
            return this.f89191a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && Intrinsics.d(this.f89191a, ((m) obj).f89191a);
        }

        public final int hashCode() {
            return this.f89191a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "HandleTakePhotoData(data=" + this.f89191a + ")";
        }
    }

    public static final class n implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Map<String, MessengerTrackingInfo> f89192a;

        public n(@NotNull Map<String, MessengerTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
            this.f89192a = trackingInfo;
        }

        @NotNull
        public final Map<String, MessengerTrackingInfo> a() {
            return this.f89192a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.d(this.f89192a, ((n) obj).f89192a);
        }

        public final int hashCode() {
            return this.f89192a.hashCode();
        }

        @NotNull
        public final String toString() {
            return P.f(new StringBuilder("HandleViewEvent(trackingInfo="), this.f89192a, ")");
        }
    }

    public static final class o implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Uri f89193a;

        /* renamed from: b, reason: collision with root package name */
        private final String f89194b;

        /* renamed from: c, reason: collision with root package name */
        private final String f89195c;

        public o(@NotNull Uri deeplink, String str, String str2) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f89193a = deeplink;
            this.f89194b = str;
            this.f89195c = str2;
        }

        public final String a() {
            return this.f89194b;
        }

        @NotNull
        public final Uri b() {
            return this.f89193a;
        }

        public final String c() {
            return this.f89195c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Intrinsics.d(this.f89193a, oVar.f89193a) && Intrinsics.d(this.f89194b, oVar.f89194b) && Intrinsics.d(this.f89195c, oVar.f89195c);
        }

        public final int hashCode() {
            int hashCode = this.f89193a.hashCode() * 31;
            String str = this.f89194b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f89195c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenChatDetails(deeplink=");
            sb2.append(this.f89193a);
            sb2.append(", chatId=");
            sb2.append(this.f89194b);
            sb2.append(", firstUnreadMsgId=");
            return o0.c(sb2, this.f89195c, ")");
        }
    }

    public static final class p implements d {
        static {
            new p();
        }

        private p() {
        }
    }

    public static final class q implements d {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, Object> f89196a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f89197b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f89198c;

        public /* synthetic */ q(Map map, int i11) {
            this(map, false, (i11 & 4) == 0);
        }

        public final Map<String, Object> a() {
            return this.f89196a;
        }

        public final boolean b() {
            return this.f89198c;
        }

        public final boolean c() {
            return this.f89197b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return Intrinsics.d(this.f89196a, qVar.f89196a) && this.f89197b == qVar.f89197b && this.f89198c == qVar.f89198c;
        }

        public final int hashCode() {
            Map<String, Object> map = this.f89196a;
            return Boolean.hashCode(this.f89198c) + C3532b.a((map == null ? 0 : map.hashCode()) * 31, 31, this.f89197b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Refresh(params=");
            sb2.append(this.f89196a);
            sb2.append(", isSilent=");
            sb2.append(this.f89197b);
            sb2.append(", isFull=");
            return Pk0.a.a(")", sb2, this.f89198c);
        }

        public q(Map<String, ? extends Object> map, boolean z11, boolean z12) {
            this.f89196a = map;
            this.f89197b = z11;
            this.f89198c = z12;
        }
    }

    public static final class r implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f89199a;

        public r(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f89199a = id2;
        }

        @NotNull
        public final String a() {
            return this.f89199a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Intrinsics.d(this.f89199a, ((r) obj).f89199a);
        }

        public final int hashCode() {
            return this.f89199a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("RemoveNoUiBlockById(id="), this.f89199a, ")");
        }
    }

    public static final class s implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f89200a;

        public s(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f89200a = id2;
        }

        @NotNull
        public final String a() {
            return this.f89200a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Intrinsics.d(this.f89200a, ((s) obj).f89200a);
        }

        public final int hashCode() {
            return this.f89200a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("ScrollToMessage(id="), this.f89200a, ")");
        }
    }

    public static final class t implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final z0 f89201a;

        public t(@NotNull z0 messageTypeUI) {
            Intrinsics.checkNotNullParameter(messageTypeUI, "messageTypeUI");
            this.f89201a = messageTypeUI;
        }

        @NotNull
        public final z0 a() {
            return this.f89201a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && Intrinsics.d(this.f89201a, ((t) obj).f89201a);
        }

        public final int hashCode() {
            return this.f89201a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "SendMessage(messageTypeUI=" + this.f89201a + ")";
        }
    }

    public static final class u implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f89202a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ContextMenuDTO f89203b;

        public u(@NotNull String itemId, @NotNull ContextMenuDTO contextMenu) {
            Intrinsics.checkNotNullParameter(itemId, "itemId");
            Intrinsics.checkNotNullParameter(contextMenu, "contextMenu");
            this.f89202a = itemId;
            this.f89203b = contextMenu;
        }

        @NotNull
        public final ContextMenuDTO a() {
            return this.f89203b;
        }

        @NotNull
        public final String b() {
            return this.f89202a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return Intrinsics.d(this.f89202a, uVar.f89202a) && Intrinsics.d(this.f89203b, uVar.f89203b);
        }

        public final int hashCode() {
            return this.f89203b.hashCode() + (this.f89202a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "ShowContextMenu(itemId=" + this.f89202a + ", contextMenu=" + this.f89203b + ")";
        }
    }

    public static final class v implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.blocks.curtain.c f89204a;

        public v(@NotNull ru.ozon.android.messenger.blocks.curtain.c curtainModalVO) {
            Intrinsics.checkNotNullParameter(curtainModalVO, "curtainModalVO");
            this.f89204a = curtainModalVO;
        }

        @NotNull
        public final ru.ozon.android.messenger.blocks.curtain.c a() {
            return this.f89204a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && Intrinsics.d(this.f89204a, ((v) obj).f89204a);
        }

        public final int hashCode() {
            return this.f89204a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ShowCurtainModal(curtainModalVO=" + this.f89204a + ")";
        }
    }

    public static final class w implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final a f89205a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f89206b;

        public interface a {
        }

        public w(@NotNull a updateKey) {
            Intrinsics.checkNotNullParameter(updateKey, "updateKey");
            this.f89205a = updateKey;
            this.f89206b = true;
        }

        @NotNull
        public final a a() {
            return this.f89205a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return Intrinsics.d(this.f89205a, wVar.f89205a) && this.f89206b == wVar.f89206b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f89206b) + (this.f89205a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Update(updateKey=");
            sb2.append(this.f89205a);
            sb2.append(", notify=");
            return Pk0.a.a(")", sb2, this.f89206b);
        }
    }
}
