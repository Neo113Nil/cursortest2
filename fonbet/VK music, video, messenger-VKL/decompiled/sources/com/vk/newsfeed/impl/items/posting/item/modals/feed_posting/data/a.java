package com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data;

import com.vk.dto.group.Group;
import com.vk.newsfeed.api.posting.author.PostingAuthor;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.AdminCommunitiesDataSource;
import io.reactivex.rxjava3.core.y;
import java.util.ArrayList;
import java.util.List;
import xsna.e60;
import xsna.gxh;
import xsna.i5g;
import xsna.rli0;
import xsna.ulp0;
import xsna.ut0;

/* compiled from: AdminCommunitiesDataSource.kt */
/* loaded from: classes4.dex */
public final class a implements gxh.a {
    public final /* synthetic */ y<List<PostingAuthor.Community>> a;

    public a(y<List<PostingAuthor.Community>> yVar) {
        this.a = yVar;
    }

    @Override // xsna.gxh.a
    public final void a(ArrayList<Group> arrayList) {
        this.a.onSuccess(ut0.a(rli0.A(new ulp0(rli0.m(new i5g(arrayList)), new e60(1)))));
    }

    @Override // xsna.gxh.a
    public final void onError() {
        this.a.onError(new AdminCommunitiesDataSource.CacheReadException("Failed to load communities from local cache"));
    }
}
