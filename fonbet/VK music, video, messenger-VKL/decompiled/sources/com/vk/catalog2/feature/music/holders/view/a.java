package com.vk.catalog2.feature.music.holders.view;

import android.content.Context;
import com.vkontakte.android.R;
import xsna.c4r;
import xsna.epx;
import xsna.izs;
import xsna.s3q0;
import xsna.shy;
import xsna.up;
import xsna.wcj;

/* compiled from: CatalogErrorViewWithImage.kt */
/* loaded from: classes16.dex */
public abstract class a {

    /* compiled from: CatalogErrorViewWithImage.kt */
    public static final class b extends a {
        public final int a;
        public final int b;
        public final int c;
        public final Integer d;
        public final wcj e;

        public b(int i, wcj wcjVar) {
            Integer valueOf = Integer.valueOf(R.string.music_offline_mode_open_downloads);
            this.a = R.drawable.vk_icon_illustration_end_of_subscription_music_144h;
            this.b = i;
            this.c = R.string.music_offline_mode_update_page;
            this.d = valueOf;
            this.e = wcjVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            int a = shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
            Integer num = this.d;
            int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
            wcj wcjVar = this.e;
            return hashCode + (wcjVar != null ? wcjVar.hashCode() : 0);
        }

        public final String toString() {
            return "Default(imageId=" + this.a + ", description=" + this.b + ", retryTitle=" + this.c + ", actionTitle=" + this.d + ", action=" + this.e + ')';
        }
    }

    /* compiled from: CatalogErrorViewWithImage.kt */
    /* renamed from: com.vk.catalog2.feature.music.holders.view.a$a, reason: collision with other inner class name */
    public static final class C0522a extends a {
        public final izs<Context, s3q0> a;

        public C0522a(c4r c4rVar) {
            this.a = c4rVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0522a) && epx.f(this.a, ((C0522a) obj).a);
        }

        public final int hashCode() {
            izs<Context, s3q0> izsVar = this.a;
            if (izsVar == null) {
                return 0;
            }
            return izsVar.hashCode();
        }

        public final String toString() {
            return up.c(new StringBuilder("AdultContent(action="), this.a, ')');
        }

        public C0522a() {
            this(null);
        }
    }
}
