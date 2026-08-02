package com.vk.superapp.multiaccount.api;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;

/* compiled from: MultiAccountRouter.kt */
/* loaded from: classes6.dex */
public interface e {

    /* compiled from: MultiAccountRouter.kt */
    public static final class b {
    }

    boolean a(FragmentManager fragmentManager);

    void c(Context context, UserId userId, PinCodeAnalyticsParams pinCodeAnalyticsParams);

    void f(FragmentManager fragmentManager, UserId userId);

    void g(Context context, MultiAccountEntryPoint multiAccountEntryPoint);

    void i(Context context, ArrayList arrayList, MultiAccountEntryPoint multiAccountEntryPoint);

    void j(FragmentManager fragmentManager, MultiAccountEntryPoint multiAccountEntryPoint, SwitcherLaunchMode switcherLaunchMode, SwitcherUiMode switcherUiMode);

    void l(Context context, UserId userId);

    /* compiled from: MultiAccountRouter.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final e STUB = new C1891a();

        public final e getSTUB() {
            return STUB;
        }

        /* compiled from: MultiAccountRouter.kt */
        /* renamed from: com.vk.superapp.multiaccount.api.e$a$a, reason: collision with other inner class name */
        public static final class C1891a implements e {
            @Override // com.vk.superapp.multiaccount.api.e
            public final boolean a(FragmentManager fragmentManager) {
                return false;
            }

            @Override // com.vk.superapp.multiaccount.api.e
            public final void f(FragmentManager fragmentManager, UserId userId) {
            }

            @Override // com.vk.superapp.multiaccount.api.e
            public final void g(Context context, MultiAccountEntryPoint multiAccountEntryPoint) {
            }

            @Override // com.vk.superapp.multiaccount.api.e
            public final void l(Context context, UserId userId) {
            }

            @Override // com.vk.superapp.multiaccount.api.e
            public final void c(Context context, UserId userId, PinCodeAnalyticsParams pinCodeAnalyticsParams) {
            }

            @Override // com.vk.superapp.multiaccount.api.e
            public final void i(Context context, ArrayList arrayList, MultiAccountEntryPoint multiAccountEntryPoint) {
            }

            @Override // com.vk.superapp.multiaccount.api.e
            public final void j(FragmentManager fragmentManager, MultiAccountEntryPoint multiAccountEntryPoint, SwitcherLaunchMode switcherLaunchMode, SwitcherUiMode switcherUiMode) {
            }
        }
    }
}
