package com.vk.newsfeed.posting.mentions.data;

import com.vk.dto.common.id.UserId;
import com.vk.mentions.MentionProfileVO;
import com.vk.newsfeed.posting.mentions.data.MentionRepository;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import java.util.Iterator;
import java.util.List;
import xsna.amp;
import xsna.e1r0;
import xsna.ed;
import xsna.epx;
import xsna.ew;
import xsna.izs;
import xsna.rsg0;
import xsna.s6x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements izs {
    public final /* synthetic */ UserId b;
    public final /* synthetic */ MentionRepository c;

    public /* synthetic */ a(UserId userId, MentionRepository mentionRepository) {
        this.b = userId;
        this.c = mentionRepository;
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
            if (epx.f(((MentionRepository.CachedPostMentionProfile) obj2).b, userId)) {
                break;
            }
        }
        MentionRepository.CachedPostMentionProfile cachedPostMentionProfile = (MentionRepository.CachedPostMentionProfile) obj2;
        if (cachedPostMentionProfile != null) {
            return q.T(new MentionProfileVO(cachedPostMentionProfile.b, cachedPostMentionProfile.c, cachedPostMentionProfile.d, cachedPostMentionProfile.e, cachedPostMentionProfile.f));
        }
        j1 U = rsg0.y0(new e1r0(userId), null, null, 3).U(new ed(new s6x(5), 23));
        ew ewVar = new ew(new amp(this.c, 12), 29);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(ewVar, lVar, kVar, kVar);
    }
}
