package com.vk.auth.oauth.di;

import android.content.Context;
import com.vk.auth.oauth.VkOAuthService;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.do70;
import xsna.pnk;
import xsna.si6;

/* compiled from: OAuthManager.kt */
/* loaded from: classes.dex */
public interface a extends si6 {

    /* compiled from: OAuthManager.kt */
    /* renamed from: com.vk.auth.oauth.di.a$a, reason: collision with other inner class name */
    /* loaded from: classes15.dex */
    public static final class C0408a {
        private static final a STUB = new C0409a();

        /* compiled from: OAuthManager.kt */
        /* renamed from: com.vk.auth.oauth.di.a$a$a, reason: collision with other inner class name */
        public static final class C0409a implements a {
            @Override // xsna.si6
            public final do70 a(Context context, VkOAuthService vkOAuthService) {
                throw new OAuthImplementationNotFound(vkOAuthService);
            }

            @Override // com.vk.auth.oauth.di.a
            public final pnk b(VkOAuthService vkOAuthService) {
                return null;
            }

            @Override // xsna.si6
            public final boolean c(VkOAuthService vkOAuthService) {
                return false;
            }

            @Override // com.vk.auth.oauth.di.a
            public final List<VkOAuthService> e() {
                return EmptyList.b;
            }
        }

        public static a a() {
            return STUB;
        }
    }

    pnk b(VkOAuthService vkOAuthService);

    List<VkOAuthService> e();
}
