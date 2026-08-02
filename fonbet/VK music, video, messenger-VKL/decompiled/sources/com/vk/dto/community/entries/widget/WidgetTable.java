package com.vk.dto.community.entries.widget;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: WidgetTable.kt */
/* loaded from: classes18.dex */
public final class WidgetTable extends Widget {
    public static final Serializer.c<WidgetTable> CREATOR = new a();
    public final ArrayList h;
    public final ArrayList i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WidgetTable> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WidgetTable a(Serializer serializer) {
            return new WidgetTable(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetTable[i];
        }
    }

    public WidgetTable(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        JSONArray optJSONArray = jSONObject2.optJSONArray(TtmlNode.TAG_HEAD);
        JSONArray jSONArray = jSONObject2.getJSONArray("body");
        this.h = new ArrayList();
        int min = Math.min(optJSONArray.length(), 6);
        for (int i = 0; i < min; i++) {
            ArrayList arrayList = this.h;
            if (arrayList != null) {
                arrayList.add(new HeadRowItem(optJSONArray.getJSONObject(i)));
            }
        }
        this.i = new ArrayList();
        int min2 = Math.min(jSONArray.length(), 10);
        for (int i2 = 0; i2 < min2; i2++) {
            this.i.add(new Row(jSONArray.getJSONArray(i2)));
        }
    }

    @Override // com.vk.dto.community.entries.widget.Widget, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.o0(this.h);
        serializer.o0(this.i);
    }

    /* compiled from: WidgetTable.kt */
    public static final class HeadRowItem extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<HeadRowItem> CREATOR = new a();
        public final String b;
        public final String c;
        public final float d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<HeadRowItem> {
            @Override // com.vk.core.serialize.Serializer.c
            public final HeadRowItem a(Serializer serializer) {
                return new HeadRowItem(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HeadRowItem[i];
            }
        }

        public HeadRowItem(JSONObject jSONObject) {
            this.b = jSONObject.optString("text");
            this.c = jSONObject.optString("align", TtmlNode.LEFT);
            this.d = (float) jSONObject.optDouble("weight", ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.P(this.d);
        }

        public HeadRowItem(Serializer serializer) {
            this.b = serializer.H();
            this.c = serializer.H();
            this.d = serializer.s();
        }
    }

    /* compiled from: WidgetTable.kt */
    public static final class Row extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Row> CREATOR = new a();
        public final ArrayList b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Row> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Row a(Serializer serializer) {
                return new Row(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Row[i];
            }
        }

        public Row(JSONArray jSONArray) throws JSONException {
            this.b = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    this.b.add(new RowItem(optJSONObject));
                }
            }
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.o0(this.b);
        }

        public Row(Serializer serializer) {
            this.b = serializer.j(RowItem.CREATOR);
        }
    }

    /* compiled from: WidgetTable.kt */
    public static final class RowItem extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<RowItem> CREATOR = new a();
        public final String b;
        public final String c;
        public final Image d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<RowItem> {
            @Override // com.vk.core.serialize.Serializer.c
            public final RowItem a(Serializer serializer) {
                return new RowItem(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RowItem[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RowItem(JSONObject jSONObject) throws JSONException {
            this.b = jSONObject.optString("text");
            JSONArray optJSONArray = jSONObject.optJSONArray("icon");
            JSONObject optJSONObject = jSONObject.optJSONObject("action");
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            this.c = optJSONObject != null ? optJSONObject.getString("url") : null;
            this.d = optJSONArray != null ? new Image(optJSONArray, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0) : null;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.i0(this.d);
        }

        public RowItem(Serializer serializer) {
            this.b = serializer.H();
            this.c = serializer.H();
            this.d = (Image) serializer.G(Image.class.getClassLoader());
        }
    }

    public WidgetTable(Serializer serializer) {
        super(serializer);
        this.h = serializer.j(HeadRowItem.CREATOR);
        this.i = serializer.j(Row.CREATOR);
    }
}
