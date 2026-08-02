package com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment;

import android.content.Context;
import com.vk.newsfeed.api.posting.attachments.AttachType;
import com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.b;
import com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.e;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$ClickAttachmentEvent;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$NavigationEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.fhc0;
import xsna.ghc0;
import xsna.ihc0;
import xsna.izs;
import xsna.jhc0;
import xsna.qdc0;
import xsna.s3q0;
import xsna.x68;
import xsna.y68;

/* compiled from: BottomPanelPostingControllerRedesignImpl.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class c extends FunctionReferenceImpl implements izs<e.a, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(e.a aVar) {
        e.a aVar2 = aVar;
        b bVar = ((d) this.receiver).g;
        if (bVar != null) {
            fhc0 fhc0Var = bVar.e;
            qdc0 qdc0Var = bVar.b;
            int i = b.a.$EnumSwitchMapping$0[aVar2.b().ordinal()];
            if (i == 1) {
                ghc0.b h = fhc0Var.h();
                PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint = bVar.k;
                h.getClass();
                h.i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_GALLERY, postingMetricsCreationEntryPoint);
                qdc0Var.hb(AttachType.PHOTO);
            } else if (i == 2) {
                qdc0Var.hb(AttachType.VIDEO);
            } else if (i == 3) {
                ghc0.b h2 = fhc0Var.h();
                PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint2 = bVar.k;
                h2.getClass();
                h2.i(MobileOfficialAppsConPostingStat$ClickAttachmentEvent.ClickAttachmentEventType.OPEN_MUSIC, postingMetricsCreationEntryPoint2);
                qdc0Var.hb(AttachType.MUSIC);
            } else if (i == 4) {
                qdc0Var.hb(AttachType.PHOTO);
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                ghc0.f a = fhc0Var.a();
                PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint3 = bVar.k;
                a.getClass();
                a.c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.CLICK_TO_MORE, postingMetricsCreationEntryPoint3);
                d dVar = bVar.a;
                Context context = dVar.b;
                if (context != null) {
                    jhc0 jhc0Var = new jhc0(dVar.d(), context);
                    jhc0Var.setPresenter(dVar.f);
                    jhc0Var.setDismissCallback(new com.vk.movika.sdk.base.model.e(dVar, 7));
                    qdc0 qdc0Var2 = dVar.f;
                    new x68(qdc0Var2 != null ? qdc0Var2.G6() : false, dVar, 0).invoke(dVar.d());
                    ihc0 d = dVar.d();
                    jhc0.Q4(jhc0Var.v, d.a);
                    jhc0.Q4(jhc0Var.x, d.b);
                    jhc0.Q4(jhc0Var.w, d.c);
                    jhc0.Q4(jhc0Var.B, d.d);
                    jhc0.Q4(jhc0Var.A, d.i);
                    jhc0.Q4(jhc0Var.y, d.e);
                    jhc0.Q4(jhc0Var.z, d.f);
                    jhc0.Q4(jhc0Var.D, d.g);
                    jhc0.Q4(jhc0Var.C, d.h);
                    jhc0.Q4(jhc0Var.E, d.j);
                    jhc0.Q4(jhc0Var.F, d.k);
                    dVar.c.invoke(new y68(dVar, context, jhc0Var, 0));
                }
            }
        }
        return s3q0.a;
    }
}
