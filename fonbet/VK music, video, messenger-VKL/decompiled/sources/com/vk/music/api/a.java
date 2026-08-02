package com.vk.music.api;

import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g0;

/* compiled from: MusicPlayerServiceState.kt */
/* loaded from: classes3.dex */
public interface a {
    public static final C1318a a = C1318a.a;

    void a(boolean z);

    q<Boolean> b();

    /* compiled from: MusicPlayerServiceState.kt */
    /* renamed from: com.vk.music.api.a$a, reason: collision with other inner class name */
    public static final class C1318a {
        public static final /* synthetic */ C1318a a = new C1318a();
        private static final a STUB = new C1319a();

        public final a getSTUB() {
            return STUB;
        }

        /* compiled from: MusicPlayerServiceState.kt */
        /* renamed from: com.vk.music.api.a$a$a, reason: collision with other inner class name */
        public static final class C1319a implements a {
            public final g0 b = g0.b;

            @Override // com.vk.music.api.a
            public final q<Boolean> b() {
                return this.b;
            }

            @Override // com.vk.music.api.a
            public final void a(boolean z) {
            }
        }
    }
}
