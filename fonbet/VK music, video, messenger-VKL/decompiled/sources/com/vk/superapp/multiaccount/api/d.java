package com.vk.superapp.multiaccount.api;

import com.vk.dto.common.id.UserId;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MultiAccountRepository.kt */
/* loaded from: classes11.dex */
public interface d {
    void c();

    List<f> d();

    void e(UserId userId, SessionUnavailableType sessionUnavailableType);

    List<f> f();

    /* compiled from: MultiAccountRepository.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final d STUB = new C1890a();

        public final d getSTUB() {
            return STUB;
        }

        /* compiled from: MultiAccountRepository.kt */
        /* renamed from: com.vk.superapp.multiaccount.api.d$a$a, reason: collision with other inner class name */
        public static final class C1890a implements d {
            @Override // com.vk.superapp.multiaccount.api.d
            public final List<f> d() {
                return EmptyList.b;
            }

            @Override // com.vk.superapp.multiaccount.api.d
            public final List<f> f() {
                return EmptyList.b;
            }

            @Override // com.vk.superapp.multiaccount.api.d
            public final void c() {
            }

            @Override // com.vk.superapp.multiaccount.api.d
            public final void e(UserId userId, SessionUnavailableType sessionUnavailableType) {
            }
        }
    }
}
