package com.vk.dto.group;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;
import xsna.ms9;
import xsna.shy;

/* compiled from: GroupChannelBlock.kt */
/* loaded from: classes18.dex */
public final class GroupChannelBlock extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GroupChannelBlock> CREATOR = new b();
    public final List<GroupChannelMessagePreview> b;
    public final String c;

    /* compiled from: GroupChannelBlock.kt */
    public static final class GroupChannelMessagePreview extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<GroupChannelMessagePreview> CREATOR = new a();
        public final int b;
        public final int c;
        public final String d;
        public final String e;
        public final int f;
        public final List<PreviewMedia> g;

        /* compiled from: GroupChannelBlock.kt */
        public static final class PreviewMedia extends Serializer.StreamParcelableAdapter {
            public static final Serializer.c<PreviewMedia> CREATOR = new a();
            public final Image b;
            public final float c;
            public final String d;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<PreviewMedia> {
                @Override // com.vk.core.serialize.Serializer.c
                public final PreviewMedia a(Serializer serializer) {
                    Image image = (Image) serializer.A(Image.class.getClassLoader());
                    float s = serializer.s();
                    String I = serializer.I();
                    if (I == null) {
                        I = "";
                    }
                    return new PreviewMedia(image, s, I);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PreviewMedia[i];
                }
            }

            public PreviewMedia(Image image, float f, String str) {
                this.b = image;
                this.c = f;
                this.d = str;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.e0(this.b);
                serializer.P(this.c);
                serializer.j0(this.d);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PreviewMedia)) {
                    return false;
                }
                PreviewMedia previewMedia = (PreviewMedia) obj;
                return epx.f(this.b, previewMedia.b) && Float.compare(this.c, previewMedia.c) == 0 && epx.f(this.d, previewMedia.d);
            }

            public final int hashCode() {
                Image image = this.b;
                return this.d.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.c, (image == null ? 0 : image.hashCode()) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PreviewMedia(imageList=");
                sb.append(this.b);
                sb.append(", ratio=");
                sb.append(this.c);
                sb.append(", mediaType=");
                return ho8.a(sb, this.d, ')');
            }
        }

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<GroupChannelMessagePreview> {
            @Override // com.vk.core.serialize.Serializer.c
            public final GroupChannelMessagePreview a(Serializer serializer) {
                return new GroupChannelMessagePreview(serializer.u(), serializer.u(), serializer.H(), serializer.H(), serializer.u(), serializer.B(PreviewMedia.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GroupChannelMessagePreview[i];
            }
        }

        public GroupChannelMessagePreview(int i, int i2, String str, String str2, int i3, List<PreviewMedia> list) {
            this.b = i;
            this.c = i2;
            this.d = str;
            this.e = str2;
            this.f = i3;
            this.g = list;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.S(this.c);
            serializer.j0(this.d);
            serializer.j0(this.e);
            serializer.S(this.f);
            serializer.f0(this.g);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupChannelMessagePreview)) {
                return false;
            }
            GroupChannelMessagePreview groupChannelMessagePreview = (GroupChannelMessagePreview) obj;
            return this.b == groupChannelMessagePreview.b && this.c == groupChannelMessagePreview.c && epx.f(this.d, groupChannelMessagePreview.d) && epx.f(this.e, groupChannelMessagePreview.e) && this.f == groupChannelMessagePreview.f && epx.f(this.g, groupChannelMessagePreview.g);
        }

        public final int hashCode() {
            int a2 = shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
            String str = this.d;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int a3 = shy.a(this.f, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
            List<PreviewMedia> list = this.g;
            return a3 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GroupChannelMessagePreview(id=");
            sb.append(this.b);
            sb.append(", time=");
            sb.append(this.c);
            sb.append(", text=");
            sb.append(this.d);
            sb.append(", messageUrl=");
            sb.append(this.e);
            sb.append(", mediaCount=");
            sb.append(this.f);
            sb.append(", mediaItems=");
            return ms9.a(')', sb, this.g);
        }
    }

    /* compiled from: GroupChannelBlock.kt */
    public static final class a {
        public static GroupChannelBlock a(JSONObject jSONObject) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int i;
            JSONArray jSONArray;
            Image image;
            JSONArray optJSONArray = jSONObject.optJSONArray("message_previews");
            if (optJSONArray != null) {
                ArrayList arrayList3 = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                int i2 = 0;
                while (i2 < length) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    Serializer.c<GroupChannelMessagePreview> cVar = GroupChannelMessagePreview.CREATOR;
                    int optInt = jSONObject2.optInt("cmid");
                    int optInt2 = jSONObject2.optInt("time");
                    String optString = jSONObject2.optString("text");
                    String optString2 = jSONObject2.optString("message_url");
                    int optInt3 = jSONObject2.optInt("all_media_count");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("media_items");
                    if (optJSONArray2 != null) {
                        ArrayList arrayList4 = new ArrayList(optJSONArray2.length());
                        int length2 = optJSONArray2.length();
                        int i3 = 0;
                        while (i3 < length2) {
                            JSONObject jSONObject3 = optJSONArray2.getJSONObject(i3);
                            Serializer.c<GroupChannelMessagePreview.PreviewMedia> cVar2 = GroupChannelMessagePreview.PreviewMedia.CREATOR;
                            JSONArray jSONArray2 = optJSONArray;
                            float optDouble = (float) jSONObject3.optDouble("frame_aspect_ratio");
                            JSONArray optJSONArray3 = jSONObject3.optJSONArray("images");
                            int i4 = length;
                            if (optJSONArray3 != null) {
                                i = i2;
                                jSONArray = optJSONArray2;
                                image = new Image(optJSONArray3, null, 2, null);
                            } else {
                                i = i2;
                                jSONArray = optJSONArray2;
                                image = null;
                            }
                            arrayList4.add(new GroupChannelMessagePreview.PreviewMedia(image, optDouble, jSONObject3.optString("media_type")));
                            i3++;
                            optJSONArray = jSONArray2;
                            length = i4;
                            i2 = i;
                            optJSONArray2 = jSONArray;
                        }
                        arrayList2 = arrayList4;
                    } else {
                        arrayList2 = null;
                    }
                    JSONArray jSONArray3 = optJSONArray;
                    int i5 = length;
                    int i6 = i2;
                    arrayList3.add(new GroupChannelMessagePreview(optInt, optInt2, optString, optString2, optInt3, arrayList2));
                    i2 = i6 + 1;
                    optJSONArray = jSONArray3;
                    length = i5;
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            return new GroupChannelBlock(arrayList, jSONObject.optString("channel_url"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GroupChannelBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupChannelBlock a(Serializer serializer) {
            ArrayList B = serializer.B(GroupChannelMessagePreview.class.getClassLoader());
            String I = serializer.I();
            if (I == null) {
                I = "";
            }
            return new GroupChannelBlock(B, I);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupChannelBlock[i];
        }
    }

    public GroupChannelBlock(List<GroupChannelMessagePreview> list, String str) {
        this.b = list;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.f0(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupChannelBlock)) {
            return false;
        }
        GroupChannelBlock groupChannelBlock = (GroupChannelBlock) obj;
        return epx.f(this.b, groupChannelBlock.b) && epx.f(this.c, groupChannelBlock.c);
    }

    public final int hashCode() {
        List<GroupChannelMessagePreview> list = this.b;
        return this.c.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupChannelBlock(messagePreviewList=");
        sb.append(this.b);
        sb.append(", channelUrl=");
        return ho8.a(sb, this.c, ')');
    }
}
