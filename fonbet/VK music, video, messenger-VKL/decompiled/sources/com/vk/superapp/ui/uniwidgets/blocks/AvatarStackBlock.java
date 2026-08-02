package com.vk.superapp.ui.uniwidgets.blocks;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.ui.uniwidgets.WidgetObjects;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.j5g;

/* compiled from: AvatarStackBlock.kt */
/* loaded from: classes6.dex */
public final class AvatarStackBlock implements BaseBlock {
    public static final a CREATOR = new a();
    public final List<ImageBlock> b;
    public final int c;

    /* compiled from: AvatarStackBlock.kt */
    public static final class a implements Parcelable.Creator<AvatarStackBlock> {
        public static AvatarStackBlock a(JSONObject jSONObject, WidgetObjects widgetObjects) {
            ArrayList arrayList = null;
            if (jSONObject == null) {
                return null;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("items");
            if (jSONArray != null) {
                arrayList = new ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        ImageBlock.a aVar = ImageBlock.CREATOR;
                        ImageBlock.Style style = new ImageBlock.Style(ImageBlock.Style.Size.NONE, ImageBlock.Style.Outline.CIRCLE, null, 4, null);
                        aVar.getClass();
                        arrayList.add(ImageBlock.a.a(optJSONObject, widgetObjects, style));
                    }
                }
            }
            return new AvatarStackBlock(arrayList != null ? j5g.V(arrayList) : EmptyList.b, jSONObject.optInt("count", 0));
        }

        @Override // android.os.Parcelable.Creator
        public final AvatarStackBlock createFromParcel(Parcel parcel) {
            return new AvatarStackBlock(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AvatarStackBlock[] newArray(int i) {
            return new AvatarStackBlock[i];
        }
    }

    public AvatarStackBlock(List<ImageBlock> list, int i) {
        this.b = list;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.b);
        parcel.writeInt(this.c);
    }

    public AvatarStackBlock(Parcel parcel) {
        this(parcel.createTypedArrayList(ImageBlock.CREATOR), parcel.readInt());
    }
}
