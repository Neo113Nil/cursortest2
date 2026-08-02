package com.vk.photos.ui.editalbum.domain;

import android.content.Context;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.photos.ui.editalbum.domain.Mode;
import com.vk.photos.ui.editalbum.domain.a;
import com.vk.photos.ui.editalbum.domain.d;
import com.vk.photos.ui.editalbum.domain.e;
import com.vk.photos.ui.editalbum.domain.g;
import com.vk.photos.ui.editalbum.domain.h;
import com.vkontakte.android.R;
import defpackage.b0;
import defpackage.h0;
import defpackage.i0;
import defpackage.n;
import defpackage.p;
import defpackage.x;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.completable.w;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a7f0;
import xsna.cvh;
import xsna.cw;
import xsna.e43;
import xsna.eaa;
import xsna.ei10;
import xsna.eph;
import xsna.epx;
import xsna.f4z;
import xsna.f55;
import xsna.f8a0;
import xsna.g6;
import xsna.g9b;
import xsna.he3;
import xsna.hk1;
import xsna.ifg;
import xsna.ir0;
import xsna.iu4;
import xsna.iz0;
import xsna.izs;
import xsna.j7k0;
import xsna.jed0;
import xsna.k41;
import xsna.k5;
import xsna.kp1;
import xsna.kpd;
import xsna.lp1;
import xsna.lpd;
import xsna.lrk;
import xsna.m40;
import xsna.oq;
import xsna.ozh;
import xsna.p41;
import xsna.ph3;
import xsna.qea0;
import xsna.qm;
import xsna.rsg0;
import xsna.s3q0;
import xsna.t3h;
import xsna.tlo0;
import xsna.tn0;
import xsna.tz;
import xsna.w97;
import xsna.wk50;
import xsna.x8;
import xsna.xcd;
import xsna.xt9;
import xsna.y89;
import xsna.yve;
import xsna.yyo;

/* compiled from: EditAlbumFeature.kt */
/* loaded from: classes3.dex */
public final class c extends wk50<i, h, com.vk.photos.ui.editalbum.domain.a, e> {
    public static h i;
    public final d f;
    public final f4z g;
    public com.vk.photos.ui.editalbum.domain.b h;

    /* compiled from: EditAlbumFeature.kt */
    public static final class a implements izs {
        public final /* synthetic */ PhotoAlbum c;

        public a(PhotoAlbum photoAlbum) {
            this.c = photoAlbum;
        }

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            AlbumsRepository albumsRepository = c.this.f.b;
            PhotoAlbum photoAlbum = this.c;
            return albumsRepository.a(photoAlbum.b, photoAlbum.c);
        }
    }

    /* compiled from: EditAlbumFeature.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            c.U((c) this.receiver, th);
            return s3q0.a;
        }
    }

    public c(d dVar) {
        super(a.d.b, dVar.a);
        this.f = dVar;
        this.g = new f4z();
    }

    public static final void U(c cVar, Throwable th) {
        cVar.g.b(new g.k(new j7k0(oq.d(tlo0.Companion, cVar.f.f.b(th)), Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), null, null, null, 32)));
    }

    public static String V(h hVar) {
        String str = hVar.d;
        int length = str.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean z2 = epx.g(str.charAt(!z ? i2 : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i2++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i2, length + 1).toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0388, code lost:
    
        if (com.vk.photos.ui.editalbum.domain.b.a(r6.c, r7.c) == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03b7, code lost:
    
        r6 = r1.h;
        r7 = r10.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03bd, code lost:
    
        if (r6 != r7.h) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03c3, code lost:
    
        if (r1.i != r7.i) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03c9, code lost:
    
        if (r1.j != r7.j) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03cf, code lost:
    
        if (r1.k != r7.k) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03d5, code lost:
    
        if (r1.l == r7.l) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03a9, code lost:
    
        if (com.vk.photos.ui.editalbum.domain.b.a(r6.c, r7.c) == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03b4, code lost:
    
        if (xsna.epx.f(r6, r7) == false) goto L144;
     */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(h hVar, com.vk.photos.ui.editalbum.domain.a aVar) {
        q qVar;
        h c;
        h hVar2 = hVar;
        com.vk.photos.ui.editalbum.domain.a aVar2 = aVar;
        PhotoAlbum photoAlbum = hVar2.c;
        boolean z = hVar2.k;
        boolean z2 = hVar2.l;
        Mode mode = hVar2.g;
        boolean equals = aVar2.equals(a.d.b);
        int i2 = 18;
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        d dVar = this.f;
        if (equals) {
            T(e.c.b);
            d.b bVar2 = dVar.h;
            PhotoAlbum photoAlbum2 = bVar2.a;
            UserId userId = bVar2.b;
            Context context = e43.a;
            Context context2 = context != null ? context : null;
            if (photoAlbum2 != null) {
                List<String> list = h.m;
                c = h.a.a(context2, photoAlbum2, userId, z2);
            } else {
                List<String> list2 = h.m;
                c = h.a.c(context2, userId, z, z2);
            }
            this.h = new com.vk.photos.ui.editalbum.domain.b(c, hVar2);
            jed0 jed0Var = dVar.e;
            if (!(mode instanceof Mode.User)) {
                if (mode instanceof Mode.SystemAlbum) {
                    bVar.b(a7f0.a.f(this, jed0Var.b(((Mode.SystemAlbum) mode).b.b.e), new ozh(this, 10), new lpd(1, this, c.class, "showErrorSnackBar", "showErrorSnackBar(Ljava/lang/Throwable;)V", 0, 6), 1));
                    return;
                }
                return;
            } else {
                Mode.User user = (Mode.User) mode;
                int i3 = 0;
                int i4 = 1;
                bVar.b(a7f0.a.f(this, jed0Var.b(user.b.b.e), new yve(this, i2), new lp1(i4, this, c.class, "showErrorSnackBar", "showErrorSnackBar(Ljava/lang/Throwable;)V", i3, 7), 1));
                bVar.b(a7f0.a.f(this, jed0Var.b(user.c.b.e), new t3h(this, 14), new kpd(i4, this, c.class, "showErrorSnackBar", "showErrorSnackBar(Ljava/lang/Throwable;)V", i3, 6), 1));
                return;
            }
        }
        boolean equals2 = aVar2.equals(a.f.b);
        int i5 = 21;
        int i6 = 12;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        if (equals2) {
            d.b bVar3 = dVar.h;
            PhotoAlbum photoAlbum3 = bVar3.a;
            int i7 = 27;
            int i8 = 19;
            int i9 = 3;
            if (photoAlbum3 == null) {
                if (mode instanceof Mode.User) {
                    Mode.User user2 = (Mode.User) mode;
                    qVar = rsg0.y0(new qea0(V(hVar2), hVar2.e, user2.b.b.zb(), user2.c.b.zb(), bVar3.b), null, null, 3);
                } else if (mode instanceof Mode.Community) {
                    Mode.Community community = (Mode.Community) mode;
                    qVar = rsg0.y0(new qea0(bVar3.b, V(hVar2), hVar2.e, community.b, community.c), null, null, 3);
                } else {
                    if (!(mode instanceof Mode.SystemAlbum)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qVar = g0.b;
                }
                bVar.b(X(qVar).E(new n(new eph(this, i6), 23), lVar, kVar, kVar).E(new p(new qm(i8), i5), lVar, kVar, kVar).subscribe(new tz(new iz0(this, i7), 16), new k5(new kp1(1, this, c.class, "showErrorSnackBar", "showErrorSnackBar(Ljava/lang/Throwable;)V", 0, 7), 18)));
                return;
            }
            if (photoAlbum != null) {
                new hk1();
                if (!hk1.a(photoAlbum3) && (mode instanceof Mode.User)) {
                    PrivacySetting privacySetting = ((Mode.User) mode).b.b;
                    ArrayList arrayList = new ArrayList();
                    Iterator<PrivacySetting.PrivacyRule> it = privacySetting.e.iterator();
                    while (it.hasNext()) {
                        arrayList.addAll(it.next().zb());
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (!epx.f((String) it2.next(), "all")) {
                                bVar.b(X(f8a0.g(dVar.d, photoAlbum.c, null, 6, 6).U(new iu4(new xcd(hVar2, i8), 11))).subscribe(new ph3(new f55(this, photoAlbum3, hVar2, i9), i7), new x8(new y89(1, this, c.class, "showErrorSnackBar", "showErrorSnackBar(Ljava/lang/Throwable;)V", 0, 7), 20)));
                                return;
                            }
                        }
                    }
                }
                T(e.f.b);
                W(photoAlbum3, hVar2);
                return;
            }
            return;
        }
        if (aVar2 instanceof a.b) {
            T(new e.a());
            return;
        }
        boolean equals3 = aVar2.equals(a.g.b);
        f4z f4zVar = this.g;
        if (equals3) {
            f4zVar.b(new g.i(hVar2));
            return;
        }
        if (aVar2.equals(a.h.b)) {
            f4zVar.b(new g.j(hVar2));
            return;
        }
        if (aVar2 instanceof a.j) {
            T(new e.h(((a.j) aVar2).b));
            return;
        }
        int i10 = 13;
        int i11 = 17;
        int i12 = 4;
        if (aVar2 instanceof a.k) {
            a.k kVar2 = (a.k) aVar2;
            bVar.b(a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.n(dVar.e.b(kVar2.b.e), new k41(new cvh(this, i12), i11)), new g9b(this, 1)), new eaa(i10, this, kVar2), new g6(i6, this, kVar2), 1));
            return;
        }
        if (aVar2 instanceof a.i) {
            a.i iVar = (a.i) aVar2;
            bVar.b(a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.n(dVar.e.b(iVar.b.e), new k41(new cvh(this, i12), i11)), new g9b(this, 1)), new tn0(11, this, iVar), new b0(18, this, iVar), 1));
            return;
        }
        if (aVar2 instanceof a.l) {
            T(new e.k(((a.l) aVar2).b));
            return;
        }
        if (aVar2 instanceof a.m) {
            T(new e.C1517e());
            return;
        }
        if (!aVar2.equals(a.C1516a.b)) {
            if (aVar2.equals(a.e.b)) {
                PhotoAlbum photoAlbum4 = dVar.h.a;
                if (photoAlbum4 == null) {
                    return;
                }
                f4zVar.b(new g.C1518g(photoAlbum4));
                return;
            }
            if (!aVar2.equals(a.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            final PhotoAlbum photoAlbum5 = dVar.h.a;
            if (photoAlbum5 == null) {
                return;
            }
            bVar.b(new w(dVar.b.d(photoAlbum5.b, photoAlbum5.c), new x(new ifg(this, i10), i5), lVar, kVar, kVar, kVar, kVar).j(new w97(this, 1)).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.zyo
                @Override // io.reactivex.rxjava3.functions.a
                public final void run() {
                    com.vk.photos.ui.editalbum.domain.c cVar = com.vk.photos.ui.editalbum.domain.c.this;
                    f4z f4zVar2 = cVar.g;
                    f4zVar2.b(new g.k(new j7k0(tq.h(tlo0.Companion, R.string.album_details_delete_album_success), Integer.valueOf(R.drawable.vk_icon_check_circle_outline_28), Integer.valueOf(R.attr.vk_ui_icon_positive), null, null, null, 32)));
                    cVar.f.i.a.c(photoAlbum5.b);
                    f4zVar2.b(g.b.a);
                }
            }, new ir0(new he3(22, this, photoAlbum5), i6)));
            return;
        }
        com.vk.photos.ui.editalbum.domain.b bVar4 = this.h;
        (bVar4 != null ? bVar4 : null).b = hVar2;
        PhotoAlbum photoAlbum6 = dVar.h.a;
        if (!z) {
            com.vk.photos.ui.editalbum.domain.b bVar5 = bVar4 != null ? bVar4 : null;
            h hVar3 = bVar5.a;
            boolean z3 = hVar3.b;
            h hVar4 = bVar5.b;
            if (z3 == hVar4.b && epx.f(hVar3.c, hVar4.c) && epx.f(hVar3.d, bVar5.b.d) && epx.f(hVar3.e, bVar5.b.e)) {
                boolean z4 = hVar3.f;
                h hVar5 = bVar5.b;
                if (z4 == hVar5.f) {
                    Mode mode2 = hVar3.g;
                    Mode mode3 = hVar5.g;
                    if (mode2 instanceof Mode.SystemAlbum) {
                        if (mode3 instanceof Mode.SystemAlbum) {
                            Mode.SystemAlbum systemAlbum = (Mode.SystemAlbum) mode2;
                            Mode.SystemAlbum systemAlbum2 = (Mode.SystemAlbum) mode3;
                            if (!com.vk.photos.ui.editalbum.domain.b.a(systemAlbum.b, systemAlbum2.b)) {
                            }
                        }
                    } else if (mode2 instanceof Mode.User) {
                        if (mode3 instanceof Mode.User) {
                            Mode.User user3 = (Mode.User) mode2;
                            Mode.User user4 = (Mode.User) mode3;
                            if (!com.vk.photos.ui.editalbum.domain.b.a(user3.b, user4.b)) {
                            }
                        }
                    } else if (!(mode2 instanceof Mode.Community)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            f4zVar.b(new g.f(new xt9(photoAlbum6, hVar2, this, i12)));
            return;
        }
        if (z && photoAlbum6 == null) {
            i = hVar2;
        }
        f4zVar.b(g.d.a);
    }

    public final void W(PhotoAlbum photoAlbum, h hVar) {
        q d;
        Mode mode = hVar.g;
        boolean z = mode instanceof Mode.User;
        d dVar = this.f;
        if (z) {
            int i2 = photoAlbum.b;
            Mode.User user = (Mode.User) mode;
            d = rsg0.y0(new ei10(V(hVar), hVar.e, user.b.b.zb(), i2, dVar.h.b, user.c.b.zb()), null, null, 3);
        } else if (mode instanceof Mode.Community) {
            Mode.Community community = (Mode.Community) mode;
            d = rsg0.y0(new ei10(photoAlbum.b, V(hVar), hVar.e, community.b, community.c, dVar.h.b), null, null, 3);
        } else {
            if (!(mode instanceof Mode.SystemAlbum)) {
                throw new NoWhenBranchMatchedException();
            }
            PhotoAlbum photoAlbum2 = hVar.c;
            if (photoAlbum2 == null) {
                return;
            } else {
                d = dVar.c.a(photoAlbum2, ((Mode.SystemAlbum) mode).b.b).d(q.T(photoAlbum));
            }
        }
        this.e.b(X(d.L(new m40(new a(photoAlbum), 13), false)).subscribe(new i0(new h0(13, this, photoAlbum), 18), new p41(new b(1, this, c.class, "showErrorSnackBar", "showErrorSnackBar(Ljava/lang/Throwable;)V", 0), 19)));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 X(q qVar) {
        cw cwVar = new cw(new lrk(this, 7), 19);
        qVar.getClass();
        return new c0(qVar, cwVar, io.reactivex.rxjava3.internal.functions.a.c).G(new yyo(this, 0));
    }
}
