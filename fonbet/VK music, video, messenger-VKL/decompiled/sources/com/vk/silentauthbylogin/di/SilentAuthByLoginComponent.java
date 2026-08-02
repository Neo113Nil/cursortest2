package com.vk.silentauthbylogin.di;

import android.content.Context;
import com.vk.di.component.DiScopedComponent;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.i2q;
import xsna.pwj0;
import xsna.umj0;
import xsna.wmj0;
import xsna.ymj0;

/* compiled from: SilentAuthByLoginComponent.kt */
/* loaded from: classes11.dex */
public interface SilentAuthByLoginComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: SilentAuthByLoginComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final SilentAuthByLoginComponent getSTUB() {
            return new SilentAuthByLoginComponent() { // from class: com.vk.silentauthbylogin.di.SilentAuthByLoginComponent$Companion$STUB$1
                public final c a = new c();
                public final b b = new b();
                public final a c = new a();

                @Override // com.vk.silentauthbylogin.di.SilentAuthByLoginComponent
                public final ymj0 a() {
                    return this.a;
                }

                @Override // com.vk.silentauthbylogin.di.SilentAuthByLoginComponent
                public final wmj0 c() {
                    return this.b;
                }

                @Override // com.vk.silentauthbylogin.di.SilentAuthByLoginComponent
                public final umj0 d() {
                    return this.c;
                }

                /* compiled from: SilentAuthByLoginComponent.kt */
                public static final class a implements umj0 {
                    @Override // xsna.umj0
                    public final void a() {
                    }
                }

                /* compiled from: SilentAuthByLoginComponent.kt */
                public static final class b implements wmj0 {
                    @Override // xsna.wmj0
                    public final List<i2q> a(Context context, String str) {
                        return EmptyList.b;
                    }

                    @Override // xsna.wmj0
                    public final boolean b(String str) {
                        return false;
                    }

                    @Override // xsna.wmj0
                    public final void c(String str) {
                    }
                }

                /* compiled from: SilentAuthByLoginComponent.kt */
                public static final class c implements ymj0 {
                    @Override // xsna.ymj0
                    public final boolean a(VkAuthValidateAccountResponse vkAuthValidateAccountResponse) {
                        return false;
                    }

                    @Override // xsna.ymj0
                    public final void b(NavigationDelegateActivity navigationDelegateActivity, String str, String str2) {
                    }
                }
            };
        }
    }

    ymj0 a();

    wmj0 c();

    umj0 d();
}
