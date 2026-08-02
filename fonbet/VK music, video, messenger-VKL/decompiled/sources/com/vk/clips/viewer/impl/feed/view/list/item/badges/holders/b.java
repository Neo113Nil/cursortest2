package com.vk.clips.viewer.impl.feed.view.list.item.badges.holders;

import android.graphics.Rect;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cn70;
import xsna.izs;
import xsna.mih0;
import xsna.tlo0;

/* compiled from: DescriptionBadgeHolder.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class b extends FunctionReferenceImpl implements izs<BaseBadgeHolder.a, Rect> {
    @Override // xsna.izs
    public final Rect invoke(BaseBadgeHolder.a aVar) {
        tlo0 e;
        BaseBadgeHolder.a aVar2 = aVar;
        c cVar = (c) this.receiver;
        int i = c.q;
        cVar.getClass();
        if (aVar2 instanceof BaseBadgeHolder.a.b) {
            return new Rect(cn70.b(0), cn70.b(0), cn70.b(0), cn70.b(0));
        }
        if (!(aVar2 instanceof BaseBadgeHolder.a.C0709a)) {
            throw new NoWhenBranchMatchedException();
        }
        mih0 mih0Var = cVar.p;
        CharSequence a = (mih0Var == null || (e = mih0Var.e()) == null) ? null : e.a(cVar.itemView.getContext());
        return (a == null || a.length() == 0) ? new Rect(cn70.b(4), cn70.b(4), cn70.b(4), cn70.b(4)) : new Rect(cn70.b(6), cn70.b(4), cn70.b(2), cn70.b(4));
    }
}
