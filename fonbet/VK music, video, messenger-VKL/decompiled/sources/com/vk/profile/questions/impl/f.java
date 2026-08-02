package com.vk.profile.questions.impl;

import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.profile.questions.impl.d;
import kotlin.collections.EmptyList;
import xsna.dn20;
import xsna.gqe0;
import xsna.i750;
import xsna.spe0;
import xsna.sxm;
import xsna.vic;
import xsna.xpt;

/* compiled from: QuestionsAdapter.kt */
/* loaded from: classes5.dex */
public final class f extends sxm implements vic {
    public final QuestionsListFragment.b i;

    public f(QuestionsListFragment.b bVar) {
        this.i = bVar;
        x0(d.b.class, new dn20(this, 19));
        x0(d.a.class, new gqe0(this, 0));
        x0(spe0.class, new xpt(22));
        x0(d.c.class, new i750(this, 21));
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        setItems(EmptyList.b);
    }
}
