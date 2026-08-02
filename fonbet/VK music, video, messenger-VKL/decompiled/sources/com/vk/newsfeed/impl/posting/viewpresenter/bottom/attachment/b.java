package com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment;

import android.content.Context;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoUrl;
import com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.e;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingVideoAttachment;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import io.reactivex.rxjava3.internal.operators.single.y;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.builders.ListBuilder;
import xsna.am0;
import xsna.asu0;
import xsna.b25;
import xsna.bpn0;
import xsna.c5g;
import xsna.c7;
import xsna.d7;
import xsna.e43;
import xsna.epx;
import xsna.fhc0;
import xsna.iz10;
import xsna.p4g;
import xsna.qdc0;
import xsna.r68;
import xsna.rf;
import xsna.sf;
import xsna.sh6;
import xsna.wro0;
import xsna.wvw;
import xsna.yz10;

/* compiled from: BottomPanelPostingAttachmentPresenter.kt */
/* loaded from: classes4.dex */
public final class b {
    public final d a;
    public final qdc0 b;
    public final b25 c;
    public final wvw d;
    public final fhc0 e;
    public final io.reactivex.rxjava3.disposables.b f = new io.reactivex.rxjava3.disposables.b();
    public final yz10 g;
    public final int h;
    public boolean i;
    public boolean j;
    public PostingMetricsCreationEntryPoint k;
    public final ArrayList l;
    public final r68 m;
    public final wro0 n;

    /* compiled from: BottomPanelPostingAttachmentPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonPanelPosting.values().length];
            try {
                iArr[ButtonPanelPosting.IMAGE_BUTTON_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonPanelPosting.VIDEO_BUTTON_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonPanelPosting.MUSIC_BUTTON_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonPanelPosting.MORE_ATTACHMENT_BUTTON_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonPanelPosting.MORE_BUTTON_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(d dVar, qdc0 qdc0Var, b25 b25Var, wvw wvwVar, fhc0 fhc0Var) {
        this.a = dVar;
        this.b = qdc0Var;
        this.c = b25Var;
        this.d = wvwVar;
        this.e = fhc0Var;
        bpn0 bpn0Var = iz10.a;
        Context context = e43.a;
        this.g = iz10.a(context == null ? null : context);
        this.h = 111;
        this.k = PostingMetricsCreationEntryPoint.Other;
        ListBuilder e = e43.e();
        e.add(new e.a.b(ButtonPanelPosting.IMAGE_BUTTON_TYPE));
        e.a.b bVar = new e.a.b(ButtonPanelPosting.MUSIC_BUTTON_TYPE);
        b25Var.getClass();
        p4g.a aVar = p4g.a;
        e.add(bVar);
        e.add(e.a.AbstractC1393a.b.e);
        this.l = new ArrayList(e.g());
        this.m = new r68(this);
        this.n = new wro0();
    }

    public static final void a(b bVar, Attachment attachment, boolean z) {
        String uri = attachment instanceof PendingPhotoAttachment ? ((PendingPhotoAttachment) attachment).f : attachment instanceof PendingVideoAttachment ? ((PendingVideoAttachment) attachment).getUri() : attachment instanceof PhotoAttachment ? ((PhotoAttachment) attachment).o : attachment instanceof VideoAttachment ? ((VideoAttachment) attachment).k.w9().Ab(VideoUrl.EXTERNAL_URL) : null;
        if (uri != null) {
            Iterator it = bVar.l.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (eVar instanceof e.b) {
                    e.b bVar2 = (e.b) eVar;
                    if (epx.f(bVar2.b.f().toString(), uri)) {
                        bVar2.c = z;
                    }
                }
            }
            bVar.d();
        }
    }

    public final void b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.l;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            e eVar = (e) next;
            if (!(eVar instanceof e.b) && (!(eVar instanceof e.a.b) || ((e.a.b) eVar).c != ButtonPanelPosting.MORE_ATTACHMENT_BUTTON_TYPE)) {
                arrayList.add(next);
            }
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public final void c() {
        y l = this.g.d(this.h, -2, 0, 13).l(new c7(new am0(14), 9));
        asu0 asu0Var = asu0.a;
        this.f.b(l.q(asu0Var.c()).m(asu0Var.d()).subscribe(new sh6(new d7(this, 10), 1), new sf(new rf(6), 6)));
    }

    public final void d() {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((e) it.next()).a());
        }
        this.a.f(arrayList2, true);
    }
}
