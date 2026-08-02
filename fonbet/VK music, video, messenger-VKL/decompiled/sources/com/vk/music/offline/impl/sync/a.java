package com.vk.music.offline.impl.sync;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import xsna.epx;
import xsna.erm0;
import xsna.ho8;
import xsna.l5m;
import xsna.mnh0;
import xsna.oq;
import xsna.qoy;
import xsna.qrk0;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: MigrationStatEvent.kt */
/* loaded from: classes3.dex */
public abstract class a extends l5m {

    /* compiled from: MigrationStatEvent.kt */
    /* renamed from: com.vk.music.offline.impl.sync.a$a, reason: collision with other inner class name */
    public static final class C1329a extends a {
        public final String h;
        public final int i;
        public final String j = "audiobook_migration";
        public final String k;
        public final int l;

        public C1329a(String str, int i) {
            this.h = str;
            this.i = i;
            this.k = str;
            this.l = i;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String B() {
            return this.j;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String C() {
            return this.k;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1329a)) {
                return false;
            }
            C1329a c1329a = (C1329a) obj;
            return epx.f(this.h, c1329a.h) && this.i == c1329a.i;
        }

        public final int hashCode() {
            return Integer.hashCode(this.i) + (this.h.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioBookMigration(audioBookId=");
            sb.append(this.h);
            sb.append(", migratedChaptersCount=");
            return vu5.b(sb, this.i, ')');
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer v() {
            return Integer.valueOf(this.l);
        }
    }

    /* compiled from: MigrationStatEvent.kt */
    public static final class b extends a {
        public final String h;
        public final String i;
        public final int j;
        public final int k;
        public final String l = "backend_migration_album";
        public final String m;
        public final String n;
        public final int o;
        public final int p;

        public b(String str, String str2, int i, int i2) {
            this.h = str;
            this.i = str2;
            this.j = i;
            this.k = i2;
            this.m = str;
            this.n = str2;
            this.o = i;
            this.p = i2;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String B() {
            return this.l;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String C() {
            return this.m;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String D() {
            return this.n;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i) && this.j == bVar.j && this.k == bVar.k;
        }

        public final int hashCode() {
            return Integer.hashCode(this.k) + shy.a(this.j, urd0.a(this.h.hashCode() * 31, 31, this.i), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BackendMigrationAlbum(moosicPlaylistId=");
            sb.append(this.h);
            sb.append(", vkPlaylistId=");
            sb.append(this.i);
            sb.append(", moosicTracksCount=");
            sb.append(this.j);
            sb.append(", backendTracksCount=");
            return vu5.b(sb, this.k, ')');
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer v() {
            return Integer.valueOf(this.o);
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer w() {
            return Integer.valueOf(this.p);
        }
    }

    /* compiled from: MigrationStatEvent.kt */
    public static final class c extends a {
        public final String h;
        public final String i;
        public final int j;
        public final int k;
        public final String l = "backend_migration_playlist";
        public final String m;
        public final String n;
        public final int o;
        public final int p;

        public c(String str, String str2, int i, int i2) {
            this.h = str;
            this.i = str2;
            this.j = i;
            this.k = i2;
            this.m = str;
            this.n = str2;
            this.o = i;
            this.p = i2;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String B() {
            return this.l;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String C() {
            return this.m;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String D() {
            return this.n;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.h, cVar.h) && epx.f(this.i, cVar.i) && this.j == cVar.j && this.k == cVar.k;
        }

        public final int hashCode() {
            return Integer.hashCode(this.k) + shy.a(this.j, urd0.a(this.h.hashCode() * 31, 31, this.i), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BackendMigrationPlaylist(moosicPlaylistId=");
            sb.append(this.h);
            sb.append(", vkPlaylistId=");
            sb.append(this.i);
            sb.append(", moosicTracksCount=");
            sb.append(this.j);
            sb.append(", backendTracksCount=");
            return vu5.b(sb, this.k, ')');
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer v() {
            return Integer.valueOf(this.o);
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer w() {
            return Integer.valueOf(this.p);
        }
    }

    /* compiled from: MigrationStatEvent.kt */
    public static final class d extends a {
        public final int h;
        public final int i;
        public final int j;
        public final String k = "backend_migration_track";
        public final int l;
        public final int m;
        public final int n;

        public d(int i, int i2, int i3) {
            this.h = i;
            this.i = i2;
            this.j = i3;
            this.l = i;
            this.m = i2;
            this.n = i3;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String B() {
            return this.k;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.h == dVar.h && this.i == dVar.i && this.j == dVar.j;
        }

        public final int hashCode() {
            return Integer.hashCode(this.j) + shy.a(this.i, Integer.hashCode(this.h) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BackendMigrationTrack(moosicTracksCount=");
            sb.append(this.h);
            sb.append(", backendTracksCount=");
            sb.append(this.i);
            sb.append(", ugcTracksCount=");
            return vu5.b(sb, this.j, ')');
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer v() {
            return Integer.valueOf(this.l);
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer w() {
            return Integer.valueOf(this.m);
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer x() {
            return Integer.valueOf(this.n);
        }
    }

    /* compiled from: MigrationStatEvent.kt */
    public static final class e extends a {
        public final int h;
        public final String i = "client_migration_collection";
        public final int j;

        public e(int i) {
            this.h = i;
            this.j = i;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String B() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.h == ((e) obj).h;
        }

        public final int hashCode() {
            return Integer.hashCode(this.h);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ClientMigrationCollection(matchedTracksCount="), this.h, ')');
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer v() {
            return Integer.valueOf(this.j);
        }
    }

    /* compiled from: MigrationStatEvent.kt */
    public static final class f extends a {
        public final String h;
        public final boolean i;
        public final Throwable j;
        public final String k = "client_migration_error";
        public final String l;
        public final int m;

        public f(String str, Throwable th, boolean z) {
            this.h = str;
            this.i = z;
            this.j = th;
            this.l = erm0.D0(200, mnh0.A(th));
            this.m = z ? 1 : 0;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String B() {
            return this.k;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String C() {
            return this.l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.h, fVar.h) && this.i == fVar.i && epx.f(this.j, fVar.j);
        }

        public final int hashCode() {
            int b = qoy.b(this.h.hashCode() * 31, 31, this.i);
            Throwable th = this.j;
            return b + (th == null ? 0 : th.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClientMigrationError(errorType=");
            sb.append(this.h);
            sb.append(", isSkipped=");
            sb.append(this.i);
            sb.append(", throwable=");
            return oq.c(sb, this.j, ')');
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer v() {
            return Integer.valueOf(this.m);
        }
    }

    /* compiled from: MigrationStatEvent.kt */
    public static final class g extends a {
        public final int h;
        public final String i = "client_migration_tracks";
        public final int j;

        public g(int i) {
            this.h = i;
            this.j = i;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String B() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.h == ((g) obj).h;
        }

        public final int hashCode() {
            return Integer.hashCode(this.h);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ClientMigrationTracks(matchedTracksCount="), this.h, ')');
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer v() {
            return Integer.valueOf(this.j);
        }
    }

    /* compiled from: MigrationStatEvent.kt */
    public static final class l extends a {
        public static final l h = new l();
        public static final String i = "first_migration";

        @Override // com.vk.music.offline.impl.sync.a
        public final String B() {
            return i;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -842557777;
        }

        public final String toString() {
            return "FirstMigration";
        }
    }

    /* compiled from: MigrationStatEvent.kt */
    public static final class m extends a {
        public final String h;
        public final Throwable i;
        public final String j = "migration_api_error";
        public final String k;
        public final String l;

        public m(String str, Throwable th) {
            this.h = str;
            this.i = th;
            this.k = erm0.D0(200, mnh0.A(th));
            this.l = str;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String B() {
            return this.j;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String C() {
            return this.k;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String D() {
            return this.l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.h, mVar.h) && epx.f(this.i, mVar.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + (this.h.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MigrationApiError(method=");
            sb.append(this.h);
            sb.append(", throwable=");
            return oq.c(sb, this.i, ')');
        }
    }

    /* compiled from: MigrationStatEvent.kt */
    public static final class n extends a {
        public final String h;
        public final String i = "migration_warning";
        public final String j;

        public n(String str) {
            this.h = str;
            this.j = str;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String B() {
            return this.i;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String C() {
            return this.j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.h, ((n) obj).h);
        }

        public final int hashCode() {
            return this.h.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("MigrationWarning(errorType="), this.h, ')');
        }
    }

    /* compiled from: MigrationStatEvent.kt */
    public static final class o extends a {
        public final String h;
        public final int i;
        public final String j = "podcast_migration";
        public final String k;
        public final int l;

        public o(String str, int i) {
            this.h = str;
            this.i = i;
            this.k = str;
            this.l = i;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String B() {
            return this.j;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String C() {
            return this.k;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return epx.f(this.h, oVar.h) && this.i == oVar.i;
        }

        public final int hashCode() {
            return Integer.hashCode(this.i) + (this.h.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PodcastMigration(podcastId=");
            sb.append(this.h);
            sb.append(", migratedEpisodesCount=");
            return vu5.b(sb, this.i, ')');
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer v() {
            return Integer.valueOf(this.l);
        }
    }

    /* compiled from: MigrationStatEvent.kt */
    public static final class p extends a {
        public final int h;
        public final int i;
        public final int j;
        public final String k = "retry_migration";
        public final int l;
        public final int m;
        public final int n;

        public p(int i, int i2, int i3) {
            this.h = i;
            this.i = i2;
            this.j = i3;
            this.l = i;
            this.m = i2;
            this.n = i3;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String B() {
            return this.k;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return this.h == pVar.h && this.i == pVar.i && this.j == pVar.j;
        }

        public final int hashCode() {
            return Integer.hashCode(this.j) + shy.a(this.i, Integer.hashCode(this.h) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RetryMigration(prevMigrationTracksCount=");
            sb.append(this.h);
            sb.append(", prevMigrationPlaylistCount=");
            sb.append(this.i);
            sb.append(", prevMigrationAlbumsCount=");
            return vu5.b(sb, this.j, ')');
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer v() {
            return Integer.valueOf(this.l);
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer w() {
            return Integer.valueOf(this.m);
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer x() {
            return Integer.valueOf(this.n);
        }
    }

    /* compiled from: MigrationStatEvent.kt */
    public static final class q extends a {
        public static final q h = new q();
        public static final String i = "start_client_migration";

        @Override // com.vk.music.offline.impl.sync.a
        public final String B() {
            return i;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 1115528818;
        }

        public final String toString() {
            return "StartClientMigration";
        }
    }

    public a() {
        super(null, null, 3);
    }

    public Integer A() {
        return null;
    }

    public abstract String B();

    public String C() {
        return null;
    }

    public String D() {
        return null;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        this.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.AUDIO_ST3_MIGRATION.h(), null, B(), v(), C(), w(), D(), x(), null, y(), null, z(), null, A(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -11006, 3, null);
        return super.p();
    }

    public Integer v() {
        return null;
    }

    public Integer w() {
        return null;
    }

    public Integer x() {
        return null;
    }

    public Integer y() {
        return null;
    }

    public Integer z() {
        return null;
    }

    /* compiled from: MigrationStatEvent.kt */
    public static final class h extends a {
        public final Throwable h;
        public final String i;
        public final String j;

        public h(Throwable th) {
            this.h = th;
            this.i = "finish_books_podcasts_migration";
            this.j = th != null ? erm0.D0(200, mnh0.A(th)) : null;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String B() {
            return this.i;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String C() {
            return this.j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.h, ((h) obj).h);
        }

        public final int hashCode() {
            Throwable th = this.h;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("FinishAudioBookAndPodcastMigration(throwable="), this.h, ')');
        }

        public h() {
            this((Throwable) null);
        }

        public /* synthetic */ h(int i) {
            this((Throwable) null);
        }
    }

    /* compiled from: MigrationStatEvent.kt */
    public static final class i extends a {
        public final Throwable h;
        public final String i;
        public final String j;

        public i(Throwable th) {
            this.h = th;
            this.i = "finish_client_migration";
            this.j = th != null ? erm0.D0(200, mnh0.A(th)) : null;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String B() {
            return this.i;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String C() {
            return this.j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.h, ((i) obj).h);
        }

        public final int hashCode() {
            Throwable th = this.h;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("FinishClientMigration(throwable="), this.h, ')');
        }

        public i() {
            this((Throwable) null);
        }

        public /* synthetic */ i(int i) {
            this((Throwable) null);
        }
    }

    /* compiled from: MigrationStatEvent.kt */
    public static final class k extends a {
        public final Throwable h;
        public final String i;
        public final String j;

        public k(Throwable th) {
            this.h = th;
            this.i = "finish_podcasts_migration";
            this.j = th != null ? erm0.D0(200, mnh0.A(th)) : null;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String B() {
            return this.i;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String C() {
            return this.j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.h, ((k) obj).h);
        }

        public final int hashCode() {
            Throwable th = this.h;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("FinishPodcastMigration(throwable="), this.h, ')');
        }

        public k() {
            this((Throwable) null);
        }

        public /* synthetic */ k(int i) {
            this((Throwable) null);
        }
    }

    /* compiled from: MigrationStatEvent.kt */
    public static final class j extends a {
        public final String h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final boolean l;
        public final boolean m;
        public final Throwable n;
        public final String o;
        public final String p;
        public final String q;
        public final int r;
        public final int s;
        public final int t;
        public final int u;
        public final int v;
        public final int w;

        public j(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Throwable th) {
            this.h = str;
            this.i = z;
            this.j = z2;
            this.k = z3;
            this.l = z4;
            this.m = z5;
            this.n = th;
            this.o = "finish_migration";
            this.p = th != null ? erm0.D0(200, mnh0.A(th)) : null;
            this.q = str;
            this.r = (z3 && z4) ? 1 : 0;
            this.s = z ? 1 : 0;
            this.t = z2 ? 1 : 0;
            this.u = z3 ? 1 : 0;
            this.v = z4 ? 1 : 0;
            this.w = z5 ? 1 : 0;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer A() {
            return Integer.valueOf(this.w);
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String B() {
            return this.o;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String C() {
            return this.p;
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final String D() {
            return this.q;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.h, jVar.h) && this.i == jVar.i && this.j == jVar.j && this.k == jVar.k && this.l == jVar.l && this.m == jVar.m && epx.f(this.n, jVar.n);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(this.h.hashCode() * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
            Throwable th = this.n;
            return b + (th == null ? 0 : th.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FinishMigration(moosicUserId=");
            sb.append(this.h);
            sb.append(", isFirstChance=");
            sb.append(this.i);
            sb.append(", isSecondChance=");
            sb.append(this.j);
            sb.append(", isFirstChanceSynced=");
            sb.append(this.k);
            sb.append(", isSecondChanceSynced=");
            sb.append(this.l);
            sb.append(", isDbHelperPersist=");
            sb.append(this.m);
            sb.append(", throwable=");
            return oq.c(sb, this.n, ')');
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer v() {
            return Integer.valueOf(this.r);
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer w() {
            return Integer.valueOf(this.s);
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer x() {
            return Integer.valueOf(this.t);
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer y() {
            return Integer.valueOf(this.u);
        }

        @Override // com.vk.music.offline.impl.sync.a
        public final Integer z() {
            return Integer.valueOf(this.v);
        }

        public /* synthetic */ j(boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5) {
            this(str, z, z2, z3, z4, z5, null);
        }
    }
}
