package com.vk.superapp.advertisement.api.di.sticky_banner_ad;

import java.util.List;
import xsna.del0;
import xsna.iel0;
import xsna.mel0;

/* compiled from: StickyBannerAdFactoriesProvider.kt */
/* loaded from: classes6.dex */
public interface b {

    /* compiled from: StickyBannerAdFactoriesProvider.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();

        /* compiled from: StickyBannerAdFactoriesProvider.kt */
        /* renamed from: com.vk.superapp.advertisement.api.di.sticky_banner_ad.b$a$a, reason: collision with other inner class name */
        public static final class C1858a implements b {
            @Override // com.vk.superapp.advertisement.api.di.sticky_banner_ad.b
            public final mel0 a() {
                return mel0.a.a.getSTUB();
            }

            @Override // com.vk.superapp.advertisement.api.di.sticky_banner_ad.b
            public final mel0 b() {
                return mel0.a.a.getSTUB();
            }

            @Override // com.vk.superapp.advertisement.api.di.sticky_banner_ad.b
            public final del0 c(List<? extends iel0> list) {
                return del0.a.a.getSTUB();
            }
        }

        public final b getSTUB() {
            return new C1858a();
        }
    }

    mel0 a();

    mel0 b();

    del0 c(List<? extends iel0> list);
}
