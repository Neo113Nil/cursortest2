package com.vk.libvideo.videobottomsheet.api;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.izs;
import xsna.qoy;
import xsna.rcg0;
import xsna.s60;
import xsna.s6s0;
import xsna.u6s0;
import xsna.urd0;
import xsna.y6s0;
import xsna.z6s0;

/* compiled from: VideoCatalogHelper.kt */
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: VideoCatalogHelper.kt */
    /* renamed from: com.vk.libvideo.videobottomsheet.api.a$a, reason: collision with other inner class name */
    public interface InterfaceC1255a {

        /* compiled from: VideoCatalogHelper.kt */
        /* renamed from: com.vk.libvideo.videobottomsheet.api.a$a$a, reason: collision with other inner class name */
        public static final class C1256a {
            public final VideoFile a;
            public final c b;
            public final rcg0 c;
            public final boolean d;

            public /* synthetic */ C1256a(VideoFile videoFile, c cVar, rcg0 rcg0Var) {
                this(videoFile, cVar, rcg0Var, true);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1256a)) {
                    return false;
                }
                C1256a c1256a = (C1256a) obj;
                return epx.f(this.a, c1256a.a) && epx.f(this.b, c1256a.b) && epx.f(this.c, c1256a.c) && this.d == c1256a.d;
            }

            public final int hashCode() {
                int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
                rcg0 rcg0Var = this.c;
                return Boolean.hashCode(this.d) + ((hashCode + (rcg0Var == null ? 0 : rcg0Var.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Args(videoFile=");
                sb.append(this.a);
                sb.append(", block=");
                sb.append(this.b);
                sb.append(", restrictedUserActions=");
                sb.append(this.c);
                sb.append(", shouldShowNotInterestedButton=");
                return q0.a(sb, this.d, ')');
            }

            public C1256a(VideoFile videoFile, c cVar, rcg0 rcg0Var, boolean z) {
                this.a = videoFile;
                this.b = cVar;
                this.c = rcg0Var;
                this.d = z;
            }
        }

        s6s0 a(C1256a c1256a, s60 s60Var, izs<? super UserId, Boolean> izsVar);
    }

    /* compiled from: VideoCatalogHelper.kt */
    public interface b {
        y6s0 a(UserId userId, Integer num);
    }

    /* compiled from: VideoCatalogHelper.kt */
    public static final class c {
        public final Integer a;
        public final UserId b;
        public final UserId c;
        public final String d;
        public final boolean e;
        public final String f;

        public c(Integer num, UserId userId, UserId userId2, String str, boolean z, String str2) {
            this.a = num;
            this.b = userId;
            this.c = userId2;
            this.d = str;
            this.e = z;
            this.f = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && this.e == cVar.e && epx.f(this.f, cVar.f);
        }

        public final int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            UserId userId = this.b;
            return this.f.hashCode() + qoy.b(urd0.a(bh10.a((hashCode + (userId != null ? Long.hashCode(userId.b) : 0)) * 31, 31, this.c.b), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoBlock(albumId=");
            sb.append(this.a);
            sb.append(", albumOwnerId=");
            sb.append(this.b);
            sb.append(", ownerId=");
            sb.append(this.c);
            sb.append(", ref=");
            sb.append(this.d);
            sb.append(", isFromViewHistory=");
            sb.append(this.e);
            sb.append(", urlToBlock=");
            return ho8.a(sb, this.f, ')');
        }
    }

    z6s0 a();

    u6s0 b();
}
