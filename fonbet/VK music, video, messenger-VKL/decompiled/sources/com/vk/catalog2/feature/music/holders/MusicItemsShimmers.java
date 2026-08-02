package com.vk.catalog2.feature.music.holders;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.VkCellSkeleton;
import com.vk.core.view.components.cell.VkCellSkeleton$Left$Main;
import com.vk.core.view.components.cell.c;
import com.vk.core.view.components.cell.e;
import com.vk.core.view.components.cell.f;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vkontakte.android.R;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import xsna.asp;
import xsna.e3m;
import xsna.epx;
import xsna.shy;
import xsna.tj0;
import xsna.ur;
import xsna.zrp;

/* compiled from: MusicItemsShimmers.kt */
/* loaded from: classes16.dex */
public final class MusicItemsShimmers implements CatalogViewHolder {
    public final a b;
    public final ContentType c;
    public final boolean d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MusicItemsShimmers.kt */
    public static final class ContentType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;
        public static final ContentType CATEGORY;
        public static final ContentType PLAYLISTS;
        public static final ContentType TRACKS;

        static {
            ContentType contentType = new ContentType("TRACKS", 0);
            TRACKS = contentType;
            ContentType contentType2 = new ContentType("PLAYLISTS", 1);
            PLAYLISTS = contentType2;
            ContentType contentType3 = new ContentType("CATEGORY", 2);
            CATEGORY = contentType3;
            ContentType[] contentTypeArr = {contentType, contentType2, contentType3};
            $VALUES = contentTypeArr;
            $ENTRIES = new asp(contentTypeArr);
        }

        public ContentType() {
            throw null;
        }

        public static ContentType valueOf(String str) {
            return (ContentType) Enum.valueOf(ContentType.class, str);
        }

        public static ContentType[] values() {
            return (ContentType[]) $VALUES.clone();
        }
    }

    /* compiled from: MusicItemsShimmers.kt */
    public interface a {

        /* compiled from: MusicItemsShimmers.kt */
        public static final class b implements a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                ((b) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Integer.hashCode(10);
            }

            public final String toString() {
                return "VerticalList(itemsCount=10)";
            }
        }

        /* compiled from: MusicItemsShimmers.kt */
        /* renamed from: com.vk.catalog2.feature.music.holders.MusicItemsShimmers$a$a, reason: collision with other inner class name */
        public static final class C0520a implements a {
            public final int a;
            public final int b;
            public final int c;
            public final Set<Integer> d;

            public C0520a() {
                this(3, 6, EmptySet.b);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0520a)) {
                    return false;
                }
                C0520a c0520a = (C0520a) obj;
                return this.a == c0520a.a && this.b == c0520a.b && this.c == c0520a.c && epx.f(this.d, c0520a.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Grid(rowCount=");
                sb.append(this.a);
                sb.append(", columnCount=");
                sb.append(this.b);
                sb.append(", itemsCount=");
                sb.append(this.c);
                sb.append(", fullSpanIndices=");
                return ur.c(sb, this.d, ')');
            }

            public C0520a(int i, int i2, Set set) {
                this.a = i;
                this.b = 2;
                this.c = i2;
                this.d = set;
            }
        }
    }

    /* compiled from: MusicItemsShimmers.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContentType.values().length];
            try {
                iArr[ContentType.TRACKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentType.PLAYLISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContentType.CATEGORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MusicItemsShimmers(a aVar, ContentType contentType, boolean z) {
        this.b = aVar;
        this.c = contentType;
        this.d = z;
    }

    public static View b(ContentType contentType, Context context, ViewGroup.LayoutParams layoutParams) {
        int i = b.$EnumSwitchMapping$0[contentType.ordinal()];
        if (i == 1) {
            return c(context, layoutParams, VkCellSkeleton$Left$Main.Size.Medium);
        }
        if (i == 2) {
            return c(context, layoutParams, VkCellSkeleton$Left$Main.Size.Large);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        VkSkeleton vkSkeleton = new VkSkeleton(context, null, 0, 14, 0);
        vkSkeleton.setType(new VkSkeleton.a.C0862a(12.0f));
        vkSkeleton.setLayoutParams(layoutParams);
        return vkSkeleton;
    }

    public static VkCellSkeleton c(Context context, ViewGroup.LayoutParams layoutParams, VkCellSkeleton$Left$Main.Size size) {
        VkCellSkeleton vkCellSkeleton = new VkCellSkeleton(context, null, 6);
        vkCellSkeleton.setLeft(new c(new VkCellSkeleton$Left$Main.e(size), null));
        f.b bVar = f.Companion;
        int a2 = e3m.a(R.dimen.music_catalog_shimmer_track_title_width, context);
        bVar.getClass();
        vkCellSkeleton.setMiddle(new e(f.b.a(a2), f.b.a(e3m.a(R.dimen.music_catalog_shimmer_track_subtitle_width, context)), 12));
        vkCellSkeleton.setLayoutParams(layoutParams);
        return vkCellSkeleton;
    }

    public static int d(int i, Context context) {
        return (int) tj0.a(1, i, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.view.ViewGroup$MarginLayoutParams, android.widget.GridLayout$LayoutParams] */
    public final GridLayout a(a.C0520a c0520a, Context context) {
        ViewGroup.LayoutParams layoutParams;
        ?? layoutParams2;
        GridLayout gridLayout = new GridLayout(context);
        gridLayout.setRowCount(c0520a.a);
        gridLayout.setColumnCount(c0520a.b);
        gridLayout.setUseDefaultMargins(false);
        int[] iArr = b.$EnumSwitchMapping$0;
        ContentType contentType = this.c;
        int i = iArr[contentType.ordinal()];
        int i2 = 3;
        if (i == 1 || i == 2) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.setMargins(d(12, context), 0, d(12, context), 0);
            layoutParams = marginLayoutParams;
        }
        gridLayout.setLayoutParams(layoutParams);
        int i3 = c0520a.c;
        int i4 = 0;
        while (i4 < i3) {
            boolean contains = c0520a.d.contains(Integer.valueOf(i4));
            int i5 = b.$EnumSwitchMapping$0[contentType.ordinal()];
            if (i5 == 1 || i5 == 2) {
                layoutParams2 = new ViewGroup.LayoutParams(e3m.a(R.dimen.music_catalog_grid_shimmer_track_width, context), -2);
            } else {
                if (i5 != i2) {
                    throw new NoWhenBranchMatchedException();
                }
                layoutParams2 = new GridLayout.LayoutParams(GridLayout.spec(Integer.MIN_VALUE, 1), GridLayout.spec(Integer.MIN_VALUE, contains ? 2 : 1, 1.0f));
                ((GridLayout.LayoutParams) layoutParams2).width = 0;
                ((GridLayout.LayoutParams) layoutParams2).height = d(84, context);
                int d = d(4, context);
                layoutParams2.setMargins(d, d, d, d);
            }
            gridLayout.addView(b(contentType, context, layoutParams2));
            i4++;
            i2 = 3;
        }
        return gridLayout;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a aVar = this.b;
        boolean z = aVar instanceof a.b;
        boolean z2 = this.d;
        if (!z) {
            if (!(aVar instanceof a.C0520a)) {
                throw new NoWhenBranchMatchedException();
            }
            a.C0520a c0520a = (a.C0520a) aVar;
            if (!z2) {
                return a(c0520a, layoutInflater.getContext());
            }
            LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
            linearLayout.setOrientation(1);
            linearLayout.addView(new MusicTextShimmer(R.style.VkUiTypography_Title2).k5(layoutInflater, linearLayout, null));
            linearLayout.addView(a(c0520a, layoutInflater.getContext()));
            return linearLayout;
        }
        a.b bVar = (a.b) aVar;
        LinearLayout linearLayout2 = new LinearLayout(layoutInflater.getContext());
        linearLayout2.setOrientation(1);
        if (z2) {
            linearLayout2.addView(new MusicTextShimmer(R.style.VkUiTypography_Title2).k5(layoutInflater, linearLayout2, null));
        }
        bVar.getClass();
        for (int i = 0; i < 10; i++) {
            Context context = layoutInflater.getContext();
            int[] iArr = b.$EnumSwitchMapping$0;
            ContentType contentType = this.c;
            int i2 = iArr[contentType.ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            linearLayout2.addView(b(contentType, layoutInflater.getContext(), new ViewGroup.LayoutParams(e3m.a(R.dimen.music_catalog_vertical_list_shimmer_track_width, context), -2)));
        }
        return linearLayout2;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
    }
}
