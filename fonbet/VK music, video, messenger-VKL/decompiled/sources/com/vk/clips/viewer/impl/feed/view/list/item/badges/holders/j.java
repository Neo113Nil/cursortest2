package com.vk.clips.viewer.impl.feed.view.list.item.badges.holders;

import android.graphics.Rect;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cn70;
import xsna.izs;

/* compiled from: ShopsMoreBadgeHolder.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class j extends FunctionReferenceImpl implements izs<BaseBadgeHolder.a, Rect> {
    @Override // xsna.izs
    public final Rect invoke(BaseBadgeHolder.a aVar) {
        BaseBadgeHolder.a aVar2 = aVar;
        k kVar = (k) this.receiver;
        int i = k.r;
        kVar.getClass();
        if (aVar2 instanceof BaseBadgeHolder.a.b) {
            return new Rect(cn70.b(0), cn70.b(0), cn70.b(0), cn70.b(0));
        }
        if (aVar2 instanceof BaseBadgeHolder.a.C0709a) {
            return new Rect(cn70.b(6), cn70.b(4), cn70.b(2), cn70.b(4));
        }
        throw new NoWhenBranchMatchedException();
    }
}
