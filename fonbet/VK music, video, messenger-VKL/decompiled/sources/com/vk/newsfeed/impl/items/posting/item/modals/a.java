package com.vk.newsfeed.impl.items.posting.item.modals;

import com.vkontakte.android.R;
import xsna.b410;
import xsna.epx;
import xsna.gzs;
import xsna.ho8;
import xsna.m7b;
import xsna.pp00;
import xsna.qoy;
import xsna.s3q0;
import xsna.sf3;
import xsna.shy;

/* compiled from: PostingItemModel.kt */
/* loaded from: classes4.dex */
public abstract class a {

    /* compiled from: PostingItemModel.kt */
    /* renamed from: com.vk.newsfeed.impl.items.posting.item.modals.a$a, reason: collision with other inner class name */
    public static final class C1383a extends a {
        public final b410 b;
        public final pp00 c;
        public final m7b d;
        public final int a = R.drawable.vk_icon_message_text_outline_28;
        public final String e = "CreateChannelButton";

        public C1383a(b410 b410Var, pp00 pp00Var, m7b m7bVar) {
            this.b = b410Var;
            this.c = pp00Var;
            this.d = m7bVar;
        }

        @Override // com.vk.newsfeed.impl.items.posting.item.modals.a
        public final gzs<s3q0> a() {
            return this.c;
        }

        @Override // com.vk.newsfeed.impl.items.posting.item.modals.a
        public final gzs<Boolean> b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1383a)) {
                return false;
            }
            C1383a c1383a = (C1383a) obj;
            return this.a == c1383a.a && epx.f(this.b, c1383a.b) && epx.f(this.c, c1383a.c) && epx.f(this.d, c1383a.d) && epx.f(this.e, c1383a.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChannelItem(iconRes=");
            sb.append(this.a);
            sb.append(", isVisible=");
            sb.append(this.b);
            sb.append(", onClick=");
            sb.append(this.c);
            sb.append(", channelParams=");
            sb.append(this.d);
            sb.append(", id=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: PostingItemModel.kt */
    public static final class b extends a {
        public final int a;
        public final int b;
        public final gzs<Boolean> c;
        public final gzs<s3q0> d;
        public final Onboarding e;
        public final c f;
        public final String g;

        public b() {
            throw null;
        }

        public b(int i, int i2, gzs gzsVar, gzs gzsVar2, Onboarding onboarding, c cVar, String str, int i3) {
            onboarding = (i3 & 32) != 0 ? null : onboarding;
            cVar = (i3 & 64) != 0 ? null : cVar;
            this.a = i;
            this.b = i2;
            this.c = gzsVar;
            this.d = gzsVar2;
            this.e = onboarding;
            this.f = cVar;
            this.g = str;
        }

        @Override // com.vk.newsfeed.impl.items.posting.item.modals.a
        public final gzs<s3q0> a() {
            return this.d;
        }

        @Override // com.vk.newsfeed.impl.items.posting.item.modals.a
        public final gzs<Boolean> b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g);
        }

        public final int hashCode() {
            int b = qoy.b(sf3.a(sf3.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, false);
            Onboarding onboarding = this.e;
            int hashCode = (b + (onboarding == null ? 0 : onboarding.hashCode())) * 31;
            c cVar = this.f;
            return this.g.hashCode() + ((hashCode + (cVar != null ? cVar.a.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RegularItem(iconRes=");
            sb.append(this.a);
            sb.append(", titleRes=");
            sb.append(this.b);
            sb.append(", isVisible=");
            sb.append(this.c);
            sb.append(", onClick=");
            sb.append(this.d);
            sb.append(", shouldShowOnboarding=false, onboarding=");
            sb.append(this.e);
            sb.append(", tooltip=");
            sb.append(this.f);
            sb.append(", id=");
            return ho8.a(sb, this.g, ')');
        }
    }

    /* compiled from: PostingItemModel.kt */
    public static final class c {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Tooltip(title="), this.a, ')');
        }
    }

    public abstract gzs<s3q0> a();

    public abstract gzs<Boolean> b();
}
