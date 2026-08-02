package com.vk.search.communities.map.api.router;

import com.vk.core.serialize.Serializer;
import java.util.LinkedHashMap;
import java.util.UUID;
import xsna.hyk0;
import xsna.zcl;

/* compiled from: SearchMapPreviewStateWrapper.kt */
/* loaded from: classes5.dex */
public final class SearchMapPreviewStateWrapper extends Serializer.StreamParcelableAdapter {
    public final String b;
    public static final LinkedHashMap c = new LinkedHashMap();
    public static final Serializer.c<SearchMapPreviewStateWrapper> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SearchMapPreviewStateWrapper> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SearchMapPreviewStateWrapper a(Serializer serializer) {
            return new SearchMapPreviewStateWrapper(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SearchMapPreviewStateWrapper[i];
        }
    }

    public SearchMapPreviewStateWrapper(String str) {
        this.b = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
    }

    public SearchMapPreviewStateWrapper(hyk0.a aVar) {
        this(UUID.randomUUID().toString());
        c.put(this.b, aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchMapPreviewStateWrapper(Serializer serializer, zcl zclVar) {
        this(r1 == null ? "" : r1);
        String H = serializer.H();
    }
}
