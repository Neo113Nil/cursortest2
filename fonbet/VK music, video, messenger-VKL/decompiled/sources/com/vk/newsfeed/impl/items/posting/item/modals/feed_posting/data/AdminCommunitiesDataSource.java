package com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import io.reactivex.rxjava3.internal.operators.single.n;
import io.reactivex.rxjava3.internal.operators.single.o;
import io.reactivex.rxjava3.internal.operators.single.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.asp;
import xsna.c5g;
import xsna.dt;
import xsna.e43;
import xsna.gxh;
import xsna.jt;
import xsna.koi0;
import xsna.m20;
import xsna.max0;
import xsna.qt0;
import xsna.rsg0;
import xsna.st0;
import xsna.tfx;
import xsna.thl0;
import xsna.tt0;
import xsna.yfb;
import xsna.zrp;
import xsna.zx;

/* compiled from: AdminCommunitiesDataSource.kt */
/* loaded from: classes4.dex */
public final class AdminCommunitiesDataSource {
    public final max0 a;
    public final gxh b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    /* compiled from: AdminCommunitiesDataSource.kt */
    public static final class CacheReadException extends Exception {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdminCommunitiesDataSource.kt */
    public static final class LoadStrategy {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LoadStrategy[] $VALUES;
        public static final LoadStrategy LOCAL;
        public static final LoadStrategy REMOTE;

        static {
            LoadStrategy loadStrategy = new LoadStrategy("LOCAL", 0);
            LOCAL = loadStrategy;
            LoadStrategy loadStrategy2 = new LoadStrategy("REMOTE", 1);
            REMOTE = loadStrategy2;
            LoadStrategy[] loadStrategyArr = {loadStrategy, loadStrategy2};
            $VALUES = loadStrategyArr;
            $ENTRIES = new asp(loadStrategyArr);
        }

        public LoadStrategy() {
            throw null;
        }

        public static LoadStrategy valueOf(String str) {
            return (LoadStrategy) Enum.valueOf(LoadStrategy.class, str);
        }

        public static LoadStrategy[] values() {
            return (LoadStrategy[]) $VALUES.clone();
        }
    }

    public AdminCommunitiesDataSource(max0 max0Var, gxh gxhVar) {
        this.a = max0Var;
        this.b = gxhVar;
    }

    public final y a() {
        ArrayList arrayList;
        List singletonList = Collections.singletonList(GroupsFilterDto.EDITOR);
        List l = e43.l(GroupsFieldsDto.CAN_POST, GroupsFieldsDto.WALL, GroupsFieldsDto.PHOTO_BASE, GroupsFieldsDto.CAN_UPLOAD_STORY, GroupsFieldsDto.CAN_UPLOAD_CLIP, GroupsFieldsDto.CAN_UPLOAD_VIDEO);
        this.a.getClass();
        tfx tfxVar = new tfx("wall.getLastPostingInfo", new koi0(12), new thl0(11));
        tfxVar.j("extended", true);
        ArrayList arrayList2 = null;
        if (singletonList != null) {
            List list = singletonList;
            arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((GroupsFilterDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("filter", arrayList);
        }
        if (l != null) {
            List list2 = l;
            arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((GroupsFieldsDto) it2.next()).k());
            }
        }
        if (arrayList2 != null) {
            tfxVar.i("fields", arrayList2);
        }
        return new o(new n(rsg0.w0(yfb.x(tfxVar)).l(new dt(new qt0(0), 1)), new st0(new zx(this, 3), 0)), new m20(new com.vk.im.engine.internal.api_commands.messages.a(this, 3), 2)).l(new tt0(new jt(1), 0));
    }
}
