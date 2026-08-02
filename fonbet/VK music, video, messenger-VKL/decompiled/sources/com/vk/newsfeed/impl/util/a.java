package com.vk.newsfeed.impl.util;

import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.ui.p0;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import java.util.Iterator;
import java.util.List;
import xsna.b420;
import xsna.com;
import xsna.e1r0;
import xsna.epx;
import xsna.gvs;
import xsna.izs;
import xsna.rsg0;
import xsna.ubq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements izs {
    public final /* synthetic */ UserId b;

    public /* synthetic */ a(UserId userId) {
        this.b = userId;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UserId userId;
        Object obj2;
        Iterator it = ((List) obj).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            userId = this.b;
            if (!hasNext) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (epx.f(((MentionsStorage$SerializableMentionProfile) obj2).b, userId)) {
                break;
            }
        }
        MentionsStorage$SerializableMentionProfile mentionsStorage$SerializableMentionProfile = (MentionsStorage$SerializableMentionProfile) obj2;
        if (mentionsStorage$SerializableMentionProfile != null) {
            return q.T(new b420(mentionsStorage$SerializableMentionProfile.b, mentionsStorage$SerializableMentionProfile.c, "", mentionsStorage$SerializableMentionProfile.d, mentionsStorage$SerializableMentionProfile.e, mentionsStorage$SerializableMentionProfile.f));
        }
        j1 U = rsg0.y0(new e1r0(userId), null, null, 3).U(new p0(new com(13), 24));
        ubq ubqVar = new ubq(new gvs(7), 12);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(ubqVar, lVar, kVar, kVar);
    }
}
