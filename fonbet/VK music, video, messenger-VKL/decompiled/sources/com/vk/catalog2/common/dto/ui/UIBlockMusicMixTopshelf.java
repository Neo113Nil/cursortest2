package com.vk.catalog2.common.dto.ui;

import android.os.Parcel;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.d1a;
import xsna.dfp0;
import xsna.e43;
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;
import xsna.j5g;
import xsna.ms9;
import xsna.zcl;

/* compiled from: UIBlockMusicMixTopshelf.kt */
/* loaded from: classes16.dex */
public final class UIBlockMusicMixTopshelf extends UIBlock implements d1a, dfp0 {
    public static final Serializer.c<UIBlockMusicMixTopshelf> CREATOR = new a();
    public final List<Item> y;

    /* compiled from: UIBlockMusicMixTopshelf.kt */
    public static final class Item implements Serializer.StreamParcelable {
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final List<VideoFile> g;

        /* JADX WARN: Multi-variable type inference failed */
        public Item(String str, String str2, String str3, String str4, String str5, List<? extends VideoFile> list) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = list;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.j0(this.e);
            serializer.j0(this.f);
            serializer.f0(this.g);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            if (!epx.f(this.b, item.b) || !epx.f(this.c, item.c) || !epx.f(this.d, item.d) || !epx.f(this.e, item.e) || !epx.f(this.f, item.f)) {
                return false;
            }
            List<VideoFile> list = item.g;
            List<VideoFile> list2 = this.g;
            if (list2.size() != list.size()) {
                return false;
            }
            ArrayList X0 = j5g.X0(list2, list);
            if (X0.isEmpty()) {
                return true;
            }
            Iterator it = X0.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (!epx.f(((VideoFile) pair.d()).a1(), ((VideoFile) pair.g()).a1())) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.d;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.e;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f;
            return this.g.hashCode() + ((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Item["), this.c, ']');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockMusicMixTopshelf> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockMusicMixTopshelf a(Serializer serializer) {
            return new UIBlockMusicMixTopshelf(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockMusicMixTopshelf[i];
        }
    }

    public /* synthetic */ UIBlockMusicMixTopshelf(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List list, Set set, UIBlockHint uIBlockHint, CatalogViewStyle catalogViewStyle, List list2, int i, zcl zclVar) {
        this(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, (i & 256) != 0 ? null : catalogViewStyle, list2);
    }

    public static boolean Pb(UIBlockMusicMixTopshelf uIBlockMusicMixTopshelf, UIBlockMusicMixTopshelf uIBlockMusicMixTopshelf2) {
        List<Item> list = uIBlockMusicMixTopshelf.y;
        if (list.size() == uIBlockMusicMixTopshelf2.y.size()) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                if (epx.f((Item) obj, uIBlockMusicMixTopshelf2.y.get(i))) {
                    i = i2;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final boolean Bb(Object obj) {
        if (!super.Bb(obj) || !(obj instanceof UIBlockMusicMixTopshelf)) {
            return false;
        }
        UIBlockMusicMixTopshelf uIBlockMusicMixTopshelf = (UIBlockMusicMixTopshelf) obj;
        uIBlockMusicMixTopshelf.getClass();
        return Pb(this, uIBlockMusicMixTopshelf);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_RDSGN_TOPSHELF;
        videoFeatures.getClass();
        return b.A.a(videoFeatures) ? this.b : UUID.randomUUID().toString();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(null);
        serializer.W(this.y);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockMusicMixTopshelf) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockMusicMixTopshelf uIBlockMusicMixTopshelf = (UIBlockMusicMixTopshelf) obj;
        uIBlockMusicMixTopshelf.getClass();
        return Pb(this, uIBlockMusicMixTopshelf);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), null, this.y);
    }

    @Override // xsna.d1a
    public final VideoFile m7() {
        return null;
    }

    @Override // xsna.dfp0
    public final String r() {
        return null;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return ms9.a(']', new StringBuilder("UIBlockMusicMixTopshelf["), this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it = Db.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zb());
        }
        UIBlockHint uIBlockHint = this.j;
        UIBlockHint zb = uIBlockHint != null ? uIBlockHint.zb() : null;
        CatalogViewStyle catalogViewStyle = this.l;
        CatalogViewStyle copy = catalogViewStyle != null ? catalogViewStyle.copy() : null;
        List<Item> list = this.y;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (Item item : list) {
            arrayList.add(new Item(item.b, item.c, item.d, item.e, item.f, i7o0.a(item.g)));
        }
        return new UIBlockMusicMixTopshelf(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, copy, arrayList);
    }

    public UIBlockMusicMixTopshelf(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, CatalogViewStyle catalogViewStyle, List<Item> list2) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, catalogViewStyle, null, null, null, null, null, 32000, null);
        this.y = list2;
    }

    public UIBlockMusicMixTopshelf(Serializer serializer) {
        super(serializer);
        ArrayList k = serializer.k(Item.class);
        List<Item> O0 = k != null ? j5g.O0(k) : null;
        this.y = O0 == null ? EmptyList.b : O0;
    }
}
