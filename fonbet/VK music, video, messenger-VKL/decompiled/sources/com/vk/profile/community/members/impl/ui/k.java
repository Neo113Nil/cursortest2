package com.vk.profile.community.members.impl.ui;

import defpackage.q0;
import xsna.epx;
import xsna.hn50;
import xsna.ho8;
import xsna.ln50;
import xsna.on50;
import xsna.qoy;

/* compiled from: MembersTask.kt */
/* loaded from: classes5.dex */
public interface k extends hn50 {

    /* compiled from: MembersTask.kt */
    public static final class a implements k {
        public final String b;

        public a(String str) {
            this.b = str;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("CloseDonutBanner(bannerId="), this.b, ')');
        }
    }

    /* compiled from: MembersTask.kt */
    public static final class b implements k {
        public final String b;
        public final boolean c;
        public final boolean d;

        public b(String str, boolean z, boolean z2) {
            this.b = str;
            this.c = z;
            this.d = z2;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            String str = this.b;
            return Boolean.hashCode(this.d) + qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadData(offset=");
            sb.append(this.b);
            sb.append(", isRefresh=");
            sb.append(this.c);
            sb.append(", isForce=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: MembersTask.kt */
    public static final class c implements k {
        public final boolean b;

        public c(boolean z) {
            this.b = z;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("LoadDonutBanner(isPullToRefresh="), this.b, ')');
        }
    }
}
