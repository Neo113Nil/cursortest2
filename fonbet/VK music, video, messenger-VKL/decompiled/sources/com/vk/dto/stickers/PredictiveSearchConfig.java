package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bxx;
import xsna.ms9;
import xsna.pn00;
import xsna.zcl;

/* compiled from: PredictiveSearchConfig.kt */
/* loaded from: classes18.dex */
public final class PredictiveSearchConfig extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<PredictiveSearchConfig> CREATOR = new a();
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final List<String> f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PredictiveSearchConfig> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PredictiveSearchConfig a(Serializer serializer) {
            return new PredictiveSearchConfig(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PredictiveSearchConfig[i];
        }
    }

    public PredictiveSearchConfig() {
        this(0, 0, 0, 0, null, 31, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
        serializer.S(this.e);
        serializer.h0(this.f);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return new JSONObject(pn00.k(new Pair("search_min_length", Integer.valueOf(this.b)), new Pair("search_max_length", Integer.valueOf(this.c)), new Pair("fuzzy_search_min_length", Integer.valueOf(this.d)), new Pair("fuzzy_search_max_length", Integer.valueOf(this.e)), new Pair("word_hashes", new JSONArray((Collection) this.f))));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreditctiveSearchConfig(searchMinLength=");
        sb.append(this.b);
        sb.append(", searchMaxLength=");
        sb.append(this.c);
        sb.append(", fuzzySearchMinLength=");
        sb.append(this.d);
        sb.append(", fuzzySearchMaxLength='");
        sb.append(this.e);
        sb.append("'excludedWords=");
        return ms9.a(')', sb, this.f);
    }

    public PredictiveSearchConfig(int i, int i2, int i3, int i4, List<String> list) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = list;
    }

    public PredictiveSearchConfig(Serializer serializer, zcl zclVar) {
        this(serializer.u(), serializer.u(), serializer.u(), serializer.u(), serializer.D());
    }

    public PredictiveSearchConfig(int i, int i2, int i3, int i4, List list, int i5, zcl zclVar) {
        this((i5 & 1) != 0 ? 2 : i, (i5 & 2) != 0 ? 15 : i2, (i5 & 4) != 0 ? 4 : i3, (i5 & 8) != 0 ? 10 : i4, (i5 & 16) != 0 ? EmptyList.b : list);
    }
}
