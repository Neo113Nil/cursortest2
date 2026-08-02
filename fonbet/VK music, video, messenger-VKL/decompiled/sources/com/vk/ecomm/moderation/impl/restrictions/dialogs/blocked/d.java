package com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked;

import android.os.Bundle;
import com.vk.common.links.LinksParserData;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.a;
import com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.e;
import com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.f;
import kotlin.NoWhenBranchMatchedException;
import xsna.a530;
import xsna.a7f0;
import xsna.e430;
import xsna.e810;
import xsna.f4z;
import xsna.hkp;
import xsna.l6u;
import xsna.qdz;
import xsna.rsg0;
import xsna.saz;
import xsna.taz;
import xsna.wk50;
import xsna.yd10;
import xsna.yfb;

/* compiled from: ModerationBlockedItemFeature.kt */
/* loaded from: classes18.dex */
public final class d extends wk50<i, e430, a, f> {
    public final ModerationBlockedItemArgs f;
    public final qdz g;
    public final a530 h;
    public final hkp i;
    public final f4z j;
    public final f4z k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, ModerationBlockedItemArgs moderationBlockedItemArgs, qdz qdzVar, a530 a530Var) {
        super(a.b.b, gVar);
        hkp hkpVar = new hkp(1);
        this.f = moderationBlockedItemArgs;
        this.g = qdzVar;
        this.h = a530Var;
        this.i = hkpVar;
        this.j = new f4z();
        this.k = new f4z();
    }

    @Override // xsna.wk50
    public final void N(e430 e430Var, a aVar) {
        a aVar2 = aVar;
        boolean z = aVar2 instanceof a.b;
        ModerationBlockedItemArgs moderationBlockedItemArgs = this.f;
        if (z) {
            T(new f.a(U(moderationBlockedItemArgs.e), U(moderationBlockedItemArgs.f), moderationBlockedItemArgs.h));
            return;
        }
        boolean z2 = aVar2 instanceof a.d;
        f4z f4zVar = this.j;
        if (z2) {
            f4zVar.b(e.b.a);
            return;
        }
        if (aVar2 instanceof a.C0952a) {
            T(f.b.b);
            UserId userId = moderationBlockedItemArgs.c;
            a7f0.a.f(this, rsg0.w0(yfb.x(((yd10) this.i.b).c((int) moderationBlockedItemArgs.d, userId))), new l6u(this, 15), new e810(this, 4), 1);
            return;
        }
        if (aVar2 instanceof a.e) {
            f4zVar.b(new e.c(moderationBlockedItemArgs.g));
        } else {
            if (!(aVar2 instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(new e.c(((a.c) aVar2).b));
        }
    }

    public final CharSequence U(String str) {
        return this.g.a().d(str, new LinksParserData(891, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382));
    }
}
