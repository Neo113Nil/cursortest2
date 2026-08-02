package com.vk.clips.sdk.shared.feed.recycler.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t0;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import defpackage.e;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.aje;
import xsna.asp;
import xsna.hfz;
import xsna.i0q0;
import xsna.izs;
import xsna.j5g;
import xsna.jjf0;
import xsna.l77;
import xsna.vfz;
import xsna.vic;
import xsna.wke;
import xsna.zrp;

/* compiled from: ClipFeedAdapter.kt */
/* loaded from: classes17.dex */
public final class ClipFeedAdapter extends wke implements vic {
    public final e m;
    public final aje n;
    public final List<jjf0> o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipFeedAdapter.kt */
    public static final class ViewType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType ADS;
        public static final ViewType ADS_CONTROLS;
        public static final ViewType BLOCK_EXTERNAL_NPS;
        public static final ViewType CLIP;
        public static final ViewType CLIP_CONTROLS;
        public static final ViewType LIVE;
        public static final ViewType MARKET_ADS;
        public static final ViewType MUSIC_TEMPLATE;
        public static final ViewType PAGINATION_EMPTY;
        public static final ViewType PAGINATION_ERROR;
        public static final ViewType PAGINATION_LOADING;
        public static final ViewType SHOPS_GRID_BLOCK;
        public static final ViewType STATIC_ADS;
        private final Class<? extends FeedItem> itemClazz;

        static {
            ViewType viewType = new ViewType("STATIC_ADS", 0, FeedItem.m.class);
            STATIC_ADS = viewType;
            ViewType viewType2 = new ViewType("MARKET_ADS", 1, FeedItem.j.class);
            MARKET_ADS = viewType2;
            ViewType viewType3 = new ViewType("PAGINATION_LOADING", 2, FeedItem.Pagination.b.class);
            PAGINATION_LOADING = viewType3;
            ViewType viewType4 = new ViewType("PAGINATION_ERROR", 3, FeedItem.Pagination.a.class);
            PAGINATION_ERROR = viewType4;
            ViewType viewType5 = new ViewType("PAGINATION_EMPTY", 4, FeedItem.Pagination.Empty.class);
            PAGINATION_EMPTY = viewType5;
            ViewType viewType6 = new ViewType("SHOPS_GRID_BLOCK", 5, FeedItem.h.a.class);
            SHOPS_GRID_BLOCK = viewType6;
            ViewType viewType7 = new ViewType("CLIP_CONTROLS", 6, FeedItem.g.class);
            CLIP_CONTROLS = viewType7;
            ViewType viewType8 = new ViewType("CLIP", 7, FeedItem.f.class);
            CLIP = viewType8;
            ViewType viewType9 = new ViewType("ADS_CONTROLS", 8, FeedItem.b.class);
            ADS_CONTROLS = viewType9;
            ViewType viewType10 = new ViewType("ADS", 9, FeedItem.a.class);
            ADS = viewType10;
            ViewType viewType11 = new ViewType("MUSIC_TEMPLATE", 10, FeedItem.k.class);
            MUSIC_TEMPLATE = viewType11;
            ViewType viewType12 = new ViewType("LIVE", 11, FeedItem.i.class);
            LIVE = viewType12;
            ViewType viewType13 = new ViewType("BLOCK_EXTERNAL_NPS", 12, FeedItem.e.a.class);
            BLOCK_EXTERNAL_NPS = viewType13;
            ViewType[] viewTypeArr = {viewType, viewType2, viewType3, viewType4, viewType5, viewType6, viewType7, viewType8, viewType9, viewType10, viewType11, viewType12, viewType13};
            $VALUES = viewTypeArr;
            $ENTRIES = new asp(viewTypeArr);
        }

        public ViewType(String str, int i, Class cls) {
            this.itemClazz = cls;
        }

        public static zrp<ViewType> h() {
            return $ENTRIES;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }

        public final Class<? extends FeedItem> i() {
            return this.itemClazz;
        }
    }

    /* compiled from: ClipFeedAdapter.kt */
    public interface a {
        void a(RecyclerView.e0 e0Var);

        izs<ViewGroup, vfz<? extends FeedItem>> b(ViewType viewType);
    }

    public ClipFeedAdapter(a aVar, int i, e eVar, aje ajeVar, List list) {
        super(i);
        this.m = eVar;
        this.n = ajeVar;
        this.o = list;
        for (ViewType viewType : ViewType.values()) {
            y0(new com.vk.clips.sdk.shared.feed.recycler.adapter.a(viewType.i(), this.o, viewType, new l77(aVar.b(viewType), 1)));
        }
        setHasStableIds(true);
    }

    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: E0 */
    public final vfz onCreateViewHolder(int i, ViewGroup viewGroup) {
        t0 t0Var = (t0) this.m.invoke();
        RecyclerView.e0 e0Var = null;
        if (t0Var != null && i0q0.b()) {
            e0Var = t0Var.d.n(i);
        }
        vfz vfzVar = (vfz) e0Var;
        if (vfzVar == null) {
            vfzVar = super.onCreateViewHolder(i, viewGroup);
        }
        this.n.a(i);
        return vfzVar;
    }

    public final FeedItem O0(int i) {
        Object b0 = j5g.b0(i, this.h.f);
        if (b0 instanceof FeedItem) {
            return (FeedItem) b0;
        }
        return null;
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        N0(EmptyList.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(vfz<hfz> vfzVar) {
        return true;
    }
}
