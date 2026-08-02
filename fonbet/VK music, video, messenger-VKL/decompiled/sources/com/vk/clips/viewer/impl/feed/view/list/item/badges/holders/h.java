package com.vk.clips.viewer.impl.feed.view.list.item.badges.holders;

import android.graphics.Rect;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cn70;
import xsna.izs;
import xsna.mih0;
import xsna.tlo0;

/* compiled from: PlaylistManyBadgeHolder.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class h extends FunctionReferenceImpl implements izs<BaseBadgeHolder.a, Rect> {
    @Override // xsna.izs
    public final Rect invoke(BaseBadgeHolder.a aVar) {
        tlo0 tlo0Var;
        BaseBadgeHolder.a aVar2 = aVar;
        i iVar = (i) this.receiver;
        int i = i.q;
        iVar.getClass();
        if (aVar2 instanceof BaseBadgeHolder.a.b) {
            return new Rect(cn70.b(0), cn70.b(0), cn70.b(0), cn70.b(0));
        }
        if (!(aVar2 instanceof BaseBadgeHolder.a.C0709a)) {
            throw new NoWhenBranchMatchedException();
        }
        mih0.l.a aVar3 = iVar.p;
        CharSequence a = (aVar3 == null || (tlo0Var = aVar3.c) == null) ? null : tlo0Var.a(iVar.itemView.getContext());
        return (a == null || a.length() == 0) ? new Rect(cn70.b(2), cn70.b(2), cn70.b(2), cn70.b(2)) : new Rect(cn70.b(0), cn70.b(2), cn70.b(4), cn70.b(2));
    }
}
