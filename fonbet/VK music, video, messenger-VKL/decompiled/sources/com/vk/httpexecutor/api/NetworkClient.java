package com.vk.httpexecutor.api;

import com.vk.httpexecutor.api.utils.debug.FakeNetworkConditions;
import java.util.EnumSet;
import java.util.Set;
import okhttp3.o;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.gzs;
import xsna.ml7;
import xsna.pd4;
import xsna.qo0;
import xsna.qoy;
import xsna.sf3;
import xsna.uf3;
import xsna.uw3;
import xsna.zrp;

/* compiled from: NetworkClient.kt */
/* loaded from: classes.dex */
public interface NetworkClient {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NetworkClient.kt */
    public static final class ClientType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClientType[] $VALUES;
        public static final ClientType CLIENT_API;
        public static final ClientType CLIENT_DEFAULT;
        public static final ClientType CLIENT_IMAGE_LOADER;
        public static final ClientType CLIENT_OFFLINE_MUSIC_DOWNLOADER;
        public static final ClientType CLIENT_PLAYER;
        public static final ClientType CLIENT_PLAYER_DOWNLOADER;
        public static final ClientType CLIENT_SSE;
        public static final ClientType CLIENT_WEB;
        public static final ClientType WEB_SOCKET;

        static {
            ClientType clientType = new ClientType("CLIENT_DEFAULT", 0);
            CLIENT_DEFAULT = clientType;
            ClientType clientType2 = new ClientType("CLIENT_API", 1);
            CLIENT_API = clientType2;
            ClientType clientType3 = new ClientType("CLIENT_WEB", 2);
            CLIENT_WEB = clientType3;
            ClientType clientType4 = new ClientType("CLIENT_IMAGE_LOADER", 3);
            CLIENT_IMAGE_LOADER = clientType4;
            ClientType clientType5 = new ClientType("CLIENT_PLAYER", 4);
            CLIENT_PLAYER = clientType5;
            ClientType clientType6 = new ClientType("CLIENT_PLAYER_DOWNLOADER", 5);
            CLIENT_PLAYER_DOWNLOADER = clientType6;
            ClientType clientType7 = new ClientType("CLIENT_SSE", 6);
            CLIENT_SSE = clientType7;
            ClientType clientType8 = new ClientType("CLIENT_OFFLINE_MUSIC_DOWNLOADER", 7);
            CLIENT_OFFLINE_MUSIC_DOWNLOADER = clientType8;
            ClientType clientType9 = new ClientType("WEB_SOCKET", 8);
            WEB_SOCKET = clientType9;
            ClientType[] clientTypeArr = {clientType, clientType2, clientType3, clientType4, clientType5, clientType6, clientType7, clientType8, clientType9};
            $VALUES = clientTypeArr;
            $ENTRIES = new asp(clientTypeArr);
        }

        public ClientType() {
            throw null;
        }

        public static zrp<ClientType> h() {
            return $ENTRIES;
        }

        public static ClientType valueOf(String str) {
            return (ClientType) Enum.valueOf(ClientType.class, str);
        }

        public static ClientType[] values() {
            return (ClientType[]) $VALUES.clone();
        }
    }

    /* compiled from: NetworkClient.kt */
    /* loaded from: classes2.dex */
    public interface b {
    }

    byte[] a(String str);

    o b(ClientType clientType);

    /* compiled from: NetworkClient.kt */
    public static final class a {
        public final boolean a;
        public final Set<String> b;
        public final boolean c;
        public final C1087a d;

        public a(boolean z, Set set, boolean z2, C1087a c1087a) {
            this.a = z;
            this.b = set;
            this.c = z2;
            this.d = c1087a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return this.a == aVar.a && this.b.equals(aVar.b) && this.c == aVar.c && this.d.equals(aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(fw3.b(qoy.b(qoy.b(Boolean.hashCode(true) * 31, 31, false), 31, this.a), 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "Config(isMainProcess=true, reuseSslSocketFactory=false, msgPackEnabled=" + this.a + ", ignoreExperimentsMethods=" + this.b + ", useDevTools=" + this.c + ", networkDebugConfig=" + this.d + ')';
        }

        /* compiled from: NetworkClient.kt */
        /* renamed from: com.vk.httpexecutor.api.NetworkClient$a$a, reason: collision with other inner class name */
        public static final class C1087a {
            public final gzs<EnumSet<ClientType>> a;
            public final gzs<Boolean> b;
            public final gzs<Integer> c;
            public final gzs<EnumSet<FakeNetworkConditions>> d;

            /* JADX WARN: Multi-variable type inference failed */
            public C1087a(gzs<? extends EnumSet<ClientType>> gzsVar, gzs<Boolean> gzsVar2, gzs<Integer> gzsVar3, gzs<? extends EnumSet<FakeNetworkConditions>> gzsVar4) {
                this.a = gzsVar;
                this.b = gzsVar2;
                this.c = gzsVar3;
                this.d = gzsVar4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1087a)) {
                    return false;
                }
                C1087a c1087a = (C1087a) obj;
                return epx.f(this.a, c1087a.a) && epx.f(this.b, c1087a.b) && epx.f(this.c, c1087a.c) && epx.f(this.d, c1087a.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + sf3.a(sf3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Debug(clientTypesToFailFor=");
                sb.append(this.a);
                sb.append(", knetFailWithExceptionEnabled=");
                sb.append(this.b);
                sb.append(", networkExceptionSleepTimeout=");
                sb.append(this.c);
                sb.append(", fakeConditions=");
                return uf3.d(sb, this.d, ')');
            }

            public C1087a() {
                this(new pd4(26), new ml7(17), new qo0(26), new uw3(29));
            }
        }
    }
}
