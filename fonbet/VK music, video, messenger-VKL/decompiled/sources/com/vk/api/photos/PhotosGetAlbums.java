package com.vk.api.photos;

import android.content.res.Resources;
import androidx.annotation.NonNull;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.fxj0;
import xsna.j03;
import xsna.rsg0;
import xsna.vx2;
import xsna.yea0;

/* loaded from: classes15.dex */
public final class PhotosGetAlbums extends rsg0<a> {
    public final yea0 s;

    public static class MultiThumbPhotoAlbum extends PhotoAlbum {
        public final ArrayList<String> A;

        public MultiThumbPhotoAlbum(JSONObject jSONObject) {
            super(jSONObject);
            this.A = new ArrayList<>();
            int t = vx2.d.t();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("last_photos");
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.A.add(new Photo(jSONArray.getJSONObject(i)).y.Cb(t, true, false).d.d);
                }
            } catch (Exception e) {
                L.C("Error parsing ext thumbs", e);
            }
        }
    }

    public PhotosGetAlbums(UserId userId, boolean z, yea0 yea0Var) {
        super("photos.getAlbums");
        if (userId.b != 0) {
            F(userId, "owner_id");
        }
        C(1, "need_covers");
        if (z) {
            C(1, "need_system");
        }
        C(1, "photo_sizes");
        this.s = yea0Var;
    }

    public static a F0(@NonNull JSONObject jSONObject, @NonNull String str, @NonNull yea0 yea0Var) {
        a aVar;
        int i;
        String str2;
        String str3;
        int i2;
        float f;
        JSONArray jSONArray;
        int i3;
        String str4;
        int i4;
        String str5;
        char i5;
        String str6 = "size";
        try {
            char i6 = ImageSizeKey.SIZE_P_0200.i();
            float b = vx2.d.b();
            if (b >= 1.5f) {
                try {
                    i6 = ImageSizeKey.SIZE_Q_0320.i();
                } catch (Exception e) {
                    e = e;
                    i = 0;
                    aVar = null;
                    L.E(e, new Object[i]);
                    return aVar;
                }
            }
            int i7 = (b > 2.0f ? 1 : (b == 2.0f ? 0 : -1));
            if (i7 >= 0) {
                i6 = (yea0Var.c ? ImageSizeKey.SIZE_X_0604 : ImageSizeKey.SIZE_R_0510).i();
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray2 = (JSONArray) j03.m(str, jSONObject).c;
            aVar = null;
            if (jSONArray2 != null) {
                int i8 = 0;
                int i9 = 0;
                while (i8 < jSONArray2.length()) {
                    try {
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i8);
                        if (jSONObject2.has(str6)) {
                            i2 = i8;
                            f = b;
                            if (jSONObject2.optInt(str6, -1) != -1) {
                                PhotoAlbum photoAlbum = new PhotoAlbum(jSONObject2);
                                if (photoAlbum.g.length() == 0) {
                                    Resources resources = vx2.d.getContext().getResources();
                                    yea0Var.getClass();
                                    str4 = str6;
                                    photoAlbum.g = resources.getString(R.string.album_unnamed);
                                } else {
                                    str4 = str6;
                                }
                                JSONArray optJSONArray = jSONObject2.optJSONArray("sizes");
                                i3 = i7;
                                if (optJSONArray != null) {
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= optJSONArray.length()) {
                                            jSONArray = jSONArray2;
                                            str5 = null;
                                            break;
                                        }
                                        JSONObject jSONObject3 = optJSONArray.getJSONObject(i10);
                                        int i11 = i10;
                                        jSONArray = jSONArray2;
                                        if (jSONObject3.optString("type").equals("base")) {
                                            str5 = jSONObject3.optString("src");
                                            if (str5.isEmpty()) {
                                                str5 = jSONObject3.optString("url");
                                            }
                                        } else {
                                            i10 = i11 + 1;
                                            jSONArray2 = jSONArray;
                                        }
                                    }
                                    if (str5 == null || str5.isEmpty()) {
                                        HashMap hashMap = new HashMap();
                                        int i12 = 0;
                                        while (i12 < optJSONArray.length()) {
                                            JSONObject jSONObject4 = optJSONArray.getJSONObject(i12);
                                            ImageSizeKey.Companion.getClass();
                                            hashMap.put(Character.valueOf(ImageSizeKey.a.d(jSONObject4, ImageSizeKey.SIZE_KEY_UNDEFINED)), jSONObject4.getString("src"));
                                            i12++;
                                            optJSONArray = optJSONArray;
                                        }
                                        if (hashMap.containsKey(Character.valueOf(i6))) {
                                            photoAlbum.k = (String) hashMap.get(Character.valueOf(i6));
                                        } else {
                                            if (i3 >= 0 && yea0Var.c) {
                                                ImageSizeKey imageSizeKey = ImageSizeKey.SIZE_X_0604;
                                                if (hashMap.containsKey(Character.valueOf(imageSizeKey.i()))) {
                                                    i5 = imageSizeKey.i();
                                                    photoAlbum.k = (String) hashMap.get(Character.valueOf(i5));
                                                }
                                            }
                                            i5 = ImageSizeKey.SIZE_M_0130.i();
                                            photoAlbum.k = (String) hashMap.get(Character.valueOf(i5));
                                        }
                                        ImageSizeKey imageSizeKey2 = ImageSizeKey.SIZE_S_0075;
                                        if (hashMap.containsKey(Character.valueOf(imageSizeKey2.i()))) {
                                            photoAlbum.l = (String) hashMap.get(Character.valueOf(imageSizeKey2.i()));
                                        }
                                    } else {
                                        Character valueOf = Character.valueOf(i6);
                                        ImageSizeKey.Companion.getClass();
                                        photoAlbum.k = fxj0.K7(ImageSizeKey.a.f(valueOf), str5);
                                        photoAlbum.l = fxj0.K7(ImageSizeKey.a.f(Character.valueOf(ImageSizeKey.SIZE_S_0075.i())), str5);
                                    }
                                } else {
                                    jSONArray = jSONArray2;
                                }
                                if (jSONObject2.has("can_upload")) {
                                    boolean z = true;
                                    if (jSONObject2.getInt("can_upload") != 1) {
                                        z = false;
                                    }
                                    photoAlbum.n = z;
                                }
                                if (photoAlbum.b < 0) {
                                    int i13 = i9;
                                    arrayList.add(i13, photoAlbum);
                                    i9 = i13 + 1;
                                    i8 = i2 + 1;
                                    b = f;
                                    str6 = str4;
                                    i7 = i3;
                                    jSONArray2 = jSONArray;
                                } else {
                                    i4 = i9;
                                    arrayList.add(photoAlbum);
                                    i9 = i4;
                                    i8 = i2 + 1;
                                    b = f;
                                    str6 = str4;
                                    i7 = i3;
                                    jSONArray2 = jSONArray;
                                }
                            }
                        } else {
                            i2 = i8;
                            f = b;
                        }
                        str4 = str6;
                        i3 = i7;
                        jSONArray = jSONArray2;
                        i4 = i9;
                        L.G("vk", "No size for album " + jSONObject2);
                        i9 = i4;
                        i8 = i2 + 1;
                        b = f;
                        str6 = str4;
                        i7 = i3;
                        jSONArray2 = jSONArray;
                    } catch (Exception e2) {
                        e = e2;
                        i = 0;
                        L.E(e, new Object[i]);
                        return aVar;
                    }
                }
            }
            float f2 = b;
            JSONObject optJSONObject = jSONObject.optJSONObject("response");
            ArrayList arrayList2 = new ArrayList();
            String str7 = "";
            if (optJSONObject == null || !optJSONObject.has("all_photos")) {
                str2 = "";
            } else {
                JSONObject jSONObject5 = jSONObject.getJSONObject("response").getJSONObject("all_photos");
                MultiThumbPhotoAlbum multiThumbPhotoAlbum = new MultiThumbPhotoAlbum(jSONObject5);
                multiThumbPhotoAlbum.g = vx2.d.getContext().getResources().getString(yea0Var.a);
                JSONArray optJSONArray2 = jSONObject5.optJSONArray("sizes");
                if (optJSONArray2 != null) {
                    str3 = "";
                    int i14 = 0;
                    while (true) {
                        if (i14 >= optJSONArray2.length()) {
                            str2 = str7;
                            break;
                        }
                        JSONObject jSONObject6 = optJSONArray2.getJSONObject(i14);
                        ImageSizeKey.Companion.getClass();
                        JSONArray jSONArray3 = optJSONArray2;
                        str2 = str7;
                        char d = ImageSizeKey.a.d(jSONObject6, ImageSizeKey.SIZE_KEY_UNDEFINED);
                        if (d == i6) {
                            multiThumbPhotoAlbum.k = jSONObject6.getString("src");
                            break;
                        }
                        if ((d == ImageSizeKey.SIZE_M_0130.i() && f2 < 2.0f) || (d == ImageSizeKey.SIZE_X_0604.i() && f2 <= 2.0f)) {
                            str3 = jSONObject6.getString("src");
                        }
                        if (d == ImageSizeKey.SIZE_S_0075.i()) {
                            multiThumbPhotoAlbum.l = jSONObject6.getString("src");
                        }
                        i14++;
                        optJSONArray2 = jSONArray3;
                        str7 = str2;
                    }
                } else {
                    str2 = "";
                    str3 = str2;
                }
                String str8 = multiThumbPhotoAlbum.k;
                if (str8 == null || str8.length() == 0) {
                    multiThumbPhotoAlbum.k = str3;
                }
                arrayList2.add(multiThumbPhotoAlbum);
            }
            if (optJSONObject != null && optJSONObject.has("user_photos")) {
                JSONObject jSONObject7 = jSONObject.getJSONObject("response").getJSONObject("user_photos");
                MultiThumbPhotoAlbum multiThumbPhotoAlbum2 = new MultiThumbPhotoAlbum(jSONObject7);
                multiThumbPhotoAlbum2.g = vx2.d.getContext().getResources().getString(yea0Var.b, multiThumbPhotoAlbum2.g);
                JSONArray optJSONArray3 = jSONObject7.optJSONArray("sizes");
                String str9 = str2;
                if (optJSONArray3 != null) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= optJSONArray3.length()) {
                            break;
                        }
                        JSONObject jSONObject8 = optJSONArray3.getJSONObject(i15);
                        ImageSizeKey.Companion.getClass();
                        char d2 = ImageSizeKey.a.d(jSONObject8, ImageSizeKey.SIZE_KEY_UNDEFINED);
                        if (d2 == i6) {
                            multiThumbPhotoAlbum2.k = jSONObject8.getString("src");
                            break;
                        }
                        if ((d2 == ImageSizeKey.SIZE_M_0130.i() && f2 < 2.0f) || (d2 == ImageSizeKey.SIZE_X_0604.i() && f2 <= 2.0f)) {
                            str9 = jSONObject8.getString("src");
                        }
                        i15++;
                    }
                }
                String str10 = multiThumbPhotoAlbum2.k;
                if (str10 == null || str10.length() == 0) {
                    multiThumbPhotoAlbum2.k = str9;
                }
                arrayList2.add(multiThumbPhotoAlbum2);
            }
            return new a(arrayList, arrayList2);
        } catch (Exception e3) {
            e = e3;
            aVar = null;
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(@NonNull JSONObject jSONObject) throws Exception, VKApiExecutionException {
        return F0(jSONObject, "response", this.s);
    }

    public static class a {
        public final ArrayList<PhotoAlbum> a;
        public final ArrayList<PhotoAlbum> b;

        public a() {
            this.a = new ArrayList<>();
            this.b = new ArrayList<>();
        }

        public a(ArrayList<PhotoAlbum> arrayList, ArrayList<PhotoAlbum> arrayList2) {
            this.a = arrayList;
            this.b = arrayList2;
        }
    }
}
