package com.vk.music.offline.api.domain.download;

import android.net.Uri;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.uqi;
import xsna.xh40;
import xsna.zrp;

/* compiled from: AudioDownloadManager.kt */
/* loaded from: classes.dex */
public interface AudioDownloadManager {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioDownloadManager.kt */
    public static final class Requirement {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Requirement[] $VALUES;
        public static final Requirement DEVICE_CHARGING;
        public static final Requirement DEVICE_IDLE;
        public static final Requirement DEVICE_STORAGE_NOT_LOW;
        public static final Requirement NETWORK;
        public static final Requirement NETWORK_UNMETERED;

        static {
            Requirement requirement = new Requirement("NETWORK", 0);
            NETWORK = requirement;
            Requirement requirement2 = new Requirement("NETWORK_UNMETERED", 1);
            NETWORK_UNMETERED = requirement2;
            Requirement requirement3 = new Requirement("DEVICE_CHARGING", 2);
            DEVICE_CHARGING = requirement3;
            Requirement requirement4 = new Requirement("DEVICE_IDLE", 3);
            DEVICE_IDLE = requirement4;
            Requirement requirement5 = new Requirement("DEVICE_STORAGE_NOT_LOW", 4);
            DEVICE_STORAGE_NOT_LOW = requirement5;
            Requirement[] requirementArr = {requirement, requirement2, requirement3, requirement4, requirement5};
            $VALUES = requirementArr;
            $ENTRIES = new asp(requirementArr);
        }

        public Requirement() {
            throw null;
        }

        public static Requirement valueOf(String str) {
            return (Requirement) Enum.valueOf(Requirement.class, str);
        }

        public static Requirement[] values() {
            return (Requirement[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioDownloadManager.kt */
    /* loaded from: classes3.dex */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State COMPLETED;
        public static final State DOWNLOADING;
        public static final State FAILED;
        public static final State QUEUE;
        public static final State REMOVING;
        public static final State RESTARTING;
        public static final State STOPPED;
        private final int value;

        static {
            State state = new State("QUEUE", 0, 0);
            QUEUE = state;
            State state2 = new State("STOPPED", 1, 1);
            STOPPED = state2;
            State state3 = new State("DOWNLOADING", 2, 2);
            DOWNLOADING = state3;
            State state4 = new State("COMPLETED", 3, 3);
            COMPLETED = state4;
            State state5 = new State(SignalingProtocol.HUNGUP_REASON_FAILED, 4, 4);
            FAILED = state5;
            State state6 = new State("REMOVING", 5, 5);
            REMOVING = state6;
            State state7 = new State("RESTARTING", 6, 7);
            RESTARTING = state7;
            State[] stateArr = {state, state2, state3, state4, state5, state6, state7};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State(String str, int i, int i2) {
            this.value = i2;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public final int h() {
            return this.value;
        }
    }

    /* compiled from: AudioDownloadManager.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public final Uri a;
        public final float b;
        public final State c;
        public final long d;
        public final long e;
        public final Integer f;

        public a(Uri uri, float f, State state, long j, long j2, Integer num) {
            this.a = uri;
            this.b = f;
            this.c = state;
            this.d = j;
            this.e = j2;
            this.f = num;
        }

        public final long a() {
            return this.e;
        }

        public final long b() {
            return this.d;
        }

        public final Integer c() {
            return this.f;
        }

        public final float d() {
            return this.b;
        }

        public final State e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && Float.compare(this.b, aVar.b) == 0 && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && epx.f(this.f, aVar.f);
        }

        public final Uri f() {
            return this.a;
        }

        public final int hashCode() {
            int a = bh10.a(bh10.a((this.c.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e);
            Integer num = this.f;
            return a + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Info(uri=");
            sb.append(this.a);
            sb.append(", percentDownloaded=");
            sb.append(this.b);
            sb.append(", state=");
            sb.append(this.c);
            sb.append(", contentLength=");
            sb.append(this.d);
            sb.append(", bytesDownloaded=");
            sb.append(this.e);
            sb.append(", failureReason=");
            return uqi.b(sb, this.f, ')');
        }
    }

    /* compiled from: AudioDownloadManager.kt */
    public interface b {
        void a(String str, State state, Exception exc);
    }

    a b(String str);

    void d(xh40 xh40Var);

    boolean isInitialized();

    void k(List<? extends Requirement> list);

    List<Requirement> n();
}
