package com.vk.catalog2.feature.search.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupCatalogItem;
import java.util.List;
import java.util.Objects;
import xsna.dfp0;
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;
import xsna.j5g;
import xsna.lwp0;
import xsna.zcl;

/* compiled from: UIBlockGroupsMapPreview.kt */
/* loaded from: classes16.dex */
public final class UIBlockGroupsMapPreview extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockGroupsMapPreview> CREATOR = new a();
    public final List<PreviewGroupItem> y;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockGroupsMapPreview> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockGroupsMapPreview a(Serializer serializer) {
            return new UIBlockGroupsMapPreview(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockGroupsMapPreview[i];
        }
    }

    public UIBlockGroupsMapPreview(List<PreviewGroupItem> list, com.vk.catalog2.common.dto.api.ui.a aVar, String str) {
        super(aVar);
        this.y = list;
        this.z = str;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.f0(this.y);
        serializer.m0(this.z);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof UIBlockGroupsMapPreview) && UIBlock.a.b(this, (UIBlock) obj)) {
            return epx.f(this.y, ((UIBlockGroupsMapPreview) obj).y);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.z;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return ho8.a(new StringBuilder("UIBlockGroupsMapPreview("), j5g.g0(this.y, null, null, null, 0, new lwp0(0), 31), ')');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockGroupsMapPreview(i7o0.a(this.y), Ab(), this.z);
    }

    /* compiled from: UIBlockGroupsMapPreview.kt */
    public static final class PreviewGroupItem extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<PreviewGroupItem> CREATOR = new a();
        public final Group b;
        public final GroupCatalogItem c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<PreviewGroupItem> {
            @Override // com.vk.core.serialize.Serializer.c
            public final PreviewGroupItem a(Serializer serializer) {
                return new PreviewGroupItem(serializer, (zcl) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PreviewGroupItem[i];
            }
        }

        public PreviewGroupItem(Group group, GroupCatalogItem groupCatalogItem) {
            this.b = group;
            this.c = groupCatalogItem;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
            serializer.i0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreviewGroupItem)) {
                return false;
            }
            PreviewGroupItem previewGroupItem = (PreviewGroupItem) obj;
            return epx.f(this.b, previewGroupItem.b) && epx.f(this.c, previewGroupItem.c);
        }

        public final int hashCode() {
            return Long.hashCode(this.c.b) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "PreviewGroupItem(group=" + this.b + ", groupItem=" + this.c + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public PreviewGroupItem(Serializer serializer, zcl zclVar) {
            this(r4, (GroupCatalogItem) r3);
            Serializer.StreamParcelable G = serializer.G(Group.class.getClassLoader());
            if (G != null) {
                Group group = (Group) G;
                Serializer.StreamParcelable G2 = serializer.G(GroupCatalogItem.class.getClassLoader());
                if (G2 != null) {
                    return;
                }
                throw new IllegalArgumentException("Can't get value!");
            }
            throw new IllegalArgumentException("Can't get value!");
        }
    }

    public UIBlockGroupsMapPreview(Serializer serializer, zcl zclVar) {
        super(serializer);
        this.y = serializer.B(PreviewGroupItem.class.getClassLoader());
        this.z = serializer.I();
    }
}
