package com.zoho.livechat.android;

import Yd.b;
import androidx.annotation.Keep;

/* loaded from: classes4.dex */
public class VisitorChat {

    /* renamed from: a, reason: collision with root package name */
    public String f42451a;

    /* renamed from: b, reason: collision with root package name */
    public String f42452b;

    /* renamed from: c, reason: collision with root package name */
    public String f42453c;

    /* renamed from: d, reason: collision with root package name */
    public String f42454d;

    /* renamed from: e, reason: collision with root package name */
    public String f42455e;

    /* renamed from: f, reason: collision with root package name */
    public String f42456f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f42457g;

    /* renamed from: h, reason: collision with root package name */
    public String f42458h;

    /* renamed from: i, reason: collision with root package name */
    public String f42459i;

    /* renamed from: k, reason: collision with root package name */
    public String f42461k;

    /* renamed from: l, reason: collision with root package name */
    public String f42462l;

    /* renamed from: m, reason: collision with root package name */
    public a f42463m;

    /* renamed from: j, reason: collision with root package name */
    public int f42460j = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f42464n = -1;

    /* renamed from: o, reason: collision with root package name */
    public Media f42465o = null;

    @Keep
    public static class Media {
        public Long connectedTime;
        public Long createdTime;
        public Long endTime;
        public UserType endedBy;

        /* renamed from: id, reason: collision with root package name */
        public String f42466id;
        public UserType initiatedBy;
        public Long pickupTime;
        public Status status;
        public String type;

        @Keep
        public enum Status {
            ENDED,
            REJECTED,
            MISSED,
            CANCELLED
        }

        @Keep
        public enum UserType {
            VISITOR,
            AGENT
        }

        public Media(String str, Long l10, UserType userType, Long l11, Long l12, Status status, UserType userType2, String str2, Long l13) {
            this.f42466id = str;
            this.endTime = l10;
            this.initiatedBy = userType;
            this.pickupTime = l11;
            this.connectedTime = l12;
            this.status = status;
            this.endedBy = userType2;
            this.type = str2;
            this.createdTime = l13;
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f42467a;

        /* renamed from: b, reason: collision with root package name */
        public String f42468b;

        /* renamed from: c, reason: collision with root package name */
        public String f42469c;

        /* renamed from: d, reason: collision with root package name */
        public String f42470d;

        /* renamed from: e, reason: collision with root package name */
        public Long f42471e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f42472f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f42473g;

        /* renamed from: h, reason: collision with root package name */
        public C0607a f42474h;

        /* renamed from: i, reason: collision with root package name */
        public b f42475i = null;

        /* renamed from: com.zoho.livechat.android.VisitorChat$a$a, reason: collision with other inner class name */
        public static class C0607a {

            /* renamed from: a, reason: collision with root package name */
            public String f42476a;

            /* renamed from: b, reason: collision with root package name */
            public String f42477b;

            /* renamed from: c, reason: collision with root package name */
            public String f42478c;

            /* renamed from: d, reason: collision with root package name */
            public Long f42479d;

            public String a() {
                return this.f42478c;
            }

            public String b() {
                return this.f42477b;
            }

            public String c() {
                return this.f42476a;
            }

            public Long d() {
                return this.f42479d;
            }

            public void e(String str) {
                this.f42478c = str;
            }

            public void f(String str) {
                this.f42477b = str;
            }

            public void g(String str) {
                this.f42476a = str;
            }

            public void h(Long l10) {
                this.f42479d = l10;
            }
        }

        public enum b {
            Sending,
            Uploading,
            Sent,
            Failure
        }

        public C0607a a() {
            return this.f42474h;
        }

        public String b() {
            return this.f42467a;
        }

        public String c() {
            return this.f42468b;
        }

        public Long d() {
            return this.f42471e;
        }

        public boolean e() {
            return this.f42472f;
        }

        public void f(C0607a c0607a) {
            this.f42474h = c0607a;
        }

        public void g(boolean z10) {
            this.f42472f = z10;
        }

        public void h(String str) {
            this.f42467a = str;
        }

        public void i(String str) {
            this.f42470d = str;
        }

        public void j(boolean z10) {
            this.f42473g = z10;
        }

        public void k(b bVar) {
            this.f42475i = bVar;
        }

        public void l(String str) {
            this.f42468b = str;
        }

        public void m(Long l10) {
            this.f42471e = l10;
        }

        public void n(String str) {
            this.f42469c = str;
        }
    }

    public void A(int i10) {
        this.f42462l = i10 == 1 ? "sad" : i10 == 2 ? "neutral" : i10 == 3 ? "happy" : null;
    }

    public void B(int i10) {
        this.f42460j = i10;
    }

    public String a() {
        return this.f42455e;
    }

    public String b() {
        return this.f42456f;
    }

    public String c() {
        return this.f42454d;
    }

    public String d() {
        return this.f42451a;
    }

    public String e() {
        return this.f42459i;
    }

    public String f() {
        return this.f42458h;
    }

    public String g() {
        return this.f42461k;
    }

    public a h() {
        return this.f42463m;
    }

    public String i() {
        return this.f42453c;
    }

    public int j() {
        return this.f42464n;
    }

    public String k() {
        return this.f42462l;
    }

    public int l() {
        return this.f42460j;
    }

    public boolean m() {
        return this.f42457g;
    }

    public void n(String str) {
        this.f42455e = str;
    }

    public void o(String str) {
        this.f42456f = str;
    }

    public void p(String str) {
        this.f42454d = str;
    }

    public void q(String str) {
        this.f42451a = str;
    }

    public void r(int i10) {
        this.f42459i = new String[]{"", "WAITING", "CONNECTED", "MISSED", "CLOSED", "WAITING", "TRIGGERED", "PROACTIVE"}[i10];
    }

    public void s(String str) {
        this.f42452b = str;
    }

    public void t(String str) {
        this.f42458h = str;
    }

    public String toString() {
        return b.a().v(this);
    }

    public void u(String str) {
        this.f42461k = str;
    }

    public void v(boolean z10) {
        this.f42457g = z10;
    }

    public void w(a aVar) {
        this.f42463m = aVar;
    }

    public void x(Media media) {
        this.f42465o = media;
    }

    public void y(String str) {
        this.f42453c = str;
    }

    public void z(int i10) {
        this.f42464n = i10;
    }
}
