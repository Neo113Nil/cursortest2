package T7;

import android.content.Intent;
import g6.C4331C;
import g6.InterfaceC4350j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: T7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1665e implements InterfaceC4350j {

    /* renamed from: b, reason: collision with root package name */
    public static final b f11105b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final Map f11106c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Map f11107a = new HashMap();

    /* renamed from: T7.e$a */
    public interface a {
        boolean a(int i10, Intent intent);
    }

    /* renamed from: T7.e$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized a b(int i10) {
            return (a) C1665e.f11106c.get(Integer.valueOf(i10));
        }

        public final synchronized void c(int i10, a callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (C1665e.f11106c.containsKey(Integer.valueOf(i10))) {
                return;
            }
            C1665e.f11106c.put(Integer.valueOf(i10), callback);
        }

        public final boolean d(int i10, int i11, Intent intent) {
            a b10 = b(i10);
            if (b10 == null) {
                return false;
            }
            return b10.a(i11, intent);
        }

        public b() {
        }
    }

    /* renamed from: T7.e$c */
    public enum c {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15),
        TournamentJoinDialog(16);


        /* renamed from: a, reason: collision with root package name */
        public final int f11125a;

        c(int i10) {
            this.f11125a = i10;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final int b() {
            return C4331C.q() + this.f11125a;
        }
    }

    @Override // g6.InterfaceC4350j
    public boolean a(int i10, int i11, Intent intent) {
        a aVar = (a) this.f11107a.get(Integer.valueOf(i10));
        return aVar == null ? f11105b.d(i10, i11, intent) : aVar.a(i11, intent);
    }

    public final void c(int i10, a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f11107a.put(Integer.valueOf(i10), callback);
    }
}
