package com.vk.clips.upload.vk.impl.uploader;

import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.upload.model.ClipUploadData;
import com.vk.clips.upload.model.ClipUploadParams;
import com.vk.clips.upload.vk.impl.uploader.ClipsPersistentStore;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.asu0;
import xsna.had;
import xsna.izs;
import xsna.kmv;
import xsna.npe;
import xsna.ope;
import xsna.ppe;
import xsna.qpe;
import xsna.s3q0;
import xsna.sp6;
import xsna.wmi0;
import xsna.xdd;
import xsna.zcl;
import xsna.zg9;
import xsna.zrp;

/* compiled from: ClipsPersistentStore.kt */
/* loaded from: classes.dex */
public final class ClipsPersistentStore {
    public final HashMap<String, PersistedUpload> a = new HashMap<>();
    public final CountDownLatch b = new CountDownLatch(1);

    public final void a() {
        synchronized (this) {
            try {
                wmi0 wmi0Var = wmi0.a;
                Collection<PersistedUpload> values = this.a.values();
                ArrayList arrayList = new ArrayList();
                for (Object obj : values) {
                    if (!((PersistedUpload) obj).Cb()) {
                        arrayList.add(obj);
                    }
                }
                wmi0Var.m("clips.persist.uploads", arrayList);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(izs<? super Map.Entry<String, PersistedUpload>, s3q0> izsVar) {
        synchronized (this) {
            try {
                Iterator<Map.Entry<String, PersistedUpload>> it = this.a.entrySet().iterator();
                while (it.hasNext()) {
                    izsVar.invoke(it.next());
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final PersistedUpload c(String str) {
        PersistedUpload persistedUpload;
        synchronized (this) {
            persistedUpload = this.a.get(str);
        }
        return persistedUpload;
    }

    public final io.reactivex.rxjava3.disposables.c d(final zg9 zg9Var) {
        return wmi0.a.e("clips.persist.uploads").r0(asu0.a.c()).subscribe(new ope(new npe(this, 0), 0), new qpe(new ppe(this, 0), 0), new io.reactivex.rxjava3.functions.a() { // from class: xsna.rpe
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                ClipsPersistentStore.this.b.countDown();
                zg9Var.invoke();
            }
        });
    }

    public final void e(PersistedUpload persistedUpload, PersistedUpload.State state) {
        synchronized (this) {
            persistedUpload.Ib(state);
            a();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    /* compiled from: ClipsPersistentStore.kt */
    /* loaded from: classes17.dex */
    public static final class PersistedUpload extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<PersistedUpload> CREATOR = new a();
        public final String b;
        public ClipUploadData c;
        public ClipsDraftVk d;
        public final String e;
        public State f;
        public String g;
        public UserId h;
        public volatile transient boolean i;
        public transient b j;
        public transient xdd k;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipsPersistentStore.kt */
        public static final class State {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ State[] $VALUES;
            public static final State CANCELLED;
            public static final State CREATED;
            public static final State DONE;
            public static final State FAILED;
            public static final State STARTED;

            static {
                State state = new State("CREATED", 0);
                CREATED = state;
                State state2 = new State(SignalingProtocol.STATE_STARTED, 1);
                STARTED = state2;
                State state3 = new State(SignalingProtocol.HUNGUP_REASON_FAILED, 2);
                FAILED = state3;
                State state4 = new State("CANCELLED", 3);
                CANCELLED = state4;
                State state5 = new State("DONE", 4);
                DONE = state5;
                State[] stateArr = {state, state2, state3, state4, state5};
                $VALUES = stateArr;
                $ENTRIES = new asp(stateArr);
            }

            public State() {
                throw null;
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) $VALUES.clone();
            }
        }

        /* compiled from: ClipsPersistentStore.kt */
        public static final class a extends Serializer.c<PersistedUpload> {
            @Override // com.vk.core.serialize.Serializer.c
            public final PersistedUpload a(Serializer serializer) {
                return new PersistedUpload(serializer.H(), ClipUploadData.CREATOR.a(serializer), (ClipsDraftVk) serializer.G(ClipsDraftVk.class.getClassLoader()), serializer.H(), State.values()[serializer.u()], serializer.H(), (UserId) serializer.A(UserId.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                PersistedUpload[] persistedUploadArr = new PersistedUpload[i];
                for (int i2 = 0; i2 < i; i2++) {
                    persistedUploadArr[i2] = null;
                }
                return persistedUploadArr;
            }
        }

        public /* synthetic */ PersistedUpload(String str, ClipUploadData clipUploadData, ClipsDraftVk clipsDraftVk, String str2, State state, String str3, UserId userId, int i, zcl zclVar) {
            this(str, clipUploadData, clipsDraftVk, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? State.CREATED : state, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : userId);
        }

        public final ClipsDraftVk Ab() {
            return this.d;
        }

        public final String Bb() {
            return this.b;
        }

        public final boolean Cb() {
            return this.i;
        }

        public final State Db() {
            return this.f;
        }

        public final ClipUploadData Eb() {
            return this.c;
        }

        public final kmv Fb() {
            b bVar = this.j;
            if (bVar != null) {
                return bVar;
            }
            b bVar2 = new b(this.b, this.c.c, this.g);
            this.j = bVar2;
            return bVar2;
        }

        public final void Gb() {
            this.i = true;
        }

        public final void Hb(String str) {
            this.g = str;
        }

        public final void Ib(State state) {
            this.f = state;
        }

        public final void Jb(b bVar) {
            if (this.j != null) {
                this.j = bVar;
            } else {
                this.j = bVar;
                this.k = null;
            }
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            this.c.O7(serializer);
            serializer.i0(this.d);
            serializer.j0(this.e);
            serializer.S(this.f.ordinal());
            serializer.j0(this.g);
            serializer.e0(this.h);
        }

        public final UserId q() {
            return this.h;
        }

        public final xdd zb() {
            boolean z;
            boolean z2;
            xdd xddVar = this.k;
            if (xddVar != null) {
                return xddVar;
            }
            int i = ((sp6) Fb()).d;
            ClipUploadData clipUploadData = this.c;
            ClipsEncoderParameters clipsEncoderParameters = clipUploadData.c;
            had hadVar = new had(clipsEncoderParameters.f, 0);
            State state = this.f;
            boolean z3 = false;
            boolean z4 = state == State.FAILED;
            if (state == State.CANCELLED) {
                z = false;
                z3 = true;
                z2 = true;
            } else {
                z = false;
                z2 = true;
            }
            UserId userId = this.h;
            ClipUploadParams clipUploadParams = clipUploadData.b;
            boolean z5 = z2;
            int i2 = clipUploadParams.m;
            if (clipsEncoderParameters.g != null) {
                z = z5;
            }
            xdd xddVar2 = new xdd(i, clipUploadData, hadVar, this.b, z4, z3, userId, i2, z, clipUploadParams.T);
            this.k = xddVar2;
            return xddVar2;
        }

        public PersistedUpload(String str, ClipUploadData clipUploadData, ClipsDraftVk clipsDraftVk, String str2, State state, String str3, UserId userId) {
            this.b = str;
            this.c = clipUploadData;
            this.d = clipsDraftVk;
            this.e = str2;
            this.f = state;
            this.g = str3;
            this.h = userId;
        }
    }
}
