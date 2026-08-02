package com.vk.newsfeed.impl.util;

import com.vk.log.L;
import io.reactivex.rxjava3.functions.f;
import java.util.Iterator;
import java.util.List;
import xsna.b420;
import xsna.epx;
import xsna.wmi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements f {
    public final /* synthetic */ b420 b;

    public /* synthetic */ b(b420 b420Var) {
        this.b = b420Var;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        List list = (List) obj;
        b420 b420Var = this.b;
        MentionsStorage$SerializableMentionProfile mentionsStorage$SerializableMentionProfile = new MentionsStorage$SerializableMentionProfile(b420Var);
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (epx.f(((MentionsStorage$SerializableMentionProfile) it.next()).b, b420Var.a)) {
                break;
            } else {
                i++;
            }
        }
        if (i > -1) {
            list.set(i, mentionsStorage$SerializableMentionProfile);
        } else {
            list.add(mentionsStorage$SerializableMentionProfile);
        }
        try {
            wmi0.a.m("mentionProfiles", list);
        } catch (Exception e) {
            L.i(e);
        }
    }
}
