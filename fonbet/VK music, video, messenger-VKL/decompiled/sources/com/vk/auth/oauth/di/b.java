package com.vk.auth.oauth.di;

import android.content.Context;
import com.vk.auth.oauth.VkOAuthService;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.gnr0;
import xsna.go70;
import xsna.si6;

/* compiled from: VerificationOAuthManager.kt */
/* loaded from: classes15.dex */
public interface b extends si6 {

    /* compiled from: VerificationOAuthManager.kt */
    public static final class a {
        private static final b STUB = new C0410a();

        /* compiled from: VerificationOAuthManager.kt */
        /* renamed from: com.vk.auth.oauth.di.b$a$a, reason: collision with other inner class name */
        public static final class C0410a implements b {
            @Override // com.vk.auth.oauth.di.b, xsna.si6
            public final gnr0 a(Context context, VkOAuthService vkOAuthService) {
                throw new OAuthImplementationNotFound(vkOAuthService);
            }

            @Override // xsna.si6
            public final boolean c(VkOAuthService vkOAuthService) {
                return false;
            }

            @Override // com.vk.auth.oauth.di.b
            public final List<go70> d() {
                return EmptyList.b;
            }
        }

        public static b a() {
            return STUB;
        }
    }

    @Override // xsna.si6
    gnr0 a(Context context, VkOAuthService vkOAuthService) throws OAuthImplementationNotFound;

    List<go70> d();
}
