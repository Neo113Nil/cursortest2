package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.esz0;
import xsna.h5s;
import xsna.j4r0;
import xsna.n401;
import xsna.o0a;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public class MediaMetadata extends AbstractSafeParcelable {
    public static final j4r0 f;
    public final List b;
    public final Bundle c;
    public int d;
    public static final String[] e = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};

    @NonNull
    public static final Parcelable.Creator<MediaMetadata> CREATOR = new n401();

    static {
        j4r0 j4r0Var = new j4r0();
        j4r0Var.e(4, "com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime");
        j4r0Var.e(4, "com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate");
        j4r0Var.e(4, "com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate");
        j4r0Var.e(1, "com.google.android.gms.cast.metadata.TITLE", "title");
        j4r0Var.e(1, "com.google.android.gms.cast.metadata.SUBTITLE", "subtitle");
        j4r0Var.e(1, "com.google.android.gms.cast.metadata.ARTIST", "artist");
        j4r0Var.e(1, "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist");
        j4r0Var.e(1, "com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName");
        j4r0Var.e(1, "com.google.android.gms.cast.metadata.COMPOSER", "composer");
        j4r0Var.e(2, "com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber");
        j4r0Var.e(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber");
        j4r0Var.e(2, "com.google.android.gms.cast.metadata.SEASON_NUMBER", "season");
        j4r0Var.e(2, "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode");
        j4r0Var.e(1, "com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle");
        j4r0Var.e(1, "com.google.android.gms.cast.metadata.STUDIO", "studio");
        j4r0Var.e(2, "com.google.android.gms.cast.metadata.WIDTH", "width");
        j4r0Var.e(2, "com.google.android.gms.cast.metadata.HEIGHT", "height");
        j4r0Var.e(1, "com.google.android.gms.cast.metadata.LOCATION_NAME", "location");
        j4r0Var.e(3, "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude");
        j4r0Var.e(3, "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude");
        j4r0Var.e(5, "com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration");
        j4r0Var.e(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia");
        j4r0Var.e(5, "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime");
        j4r0Var.e(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer");
        j4r0Var.e(2, "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId");
        j4r0Var.e(1, "com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle");
        j4r0Var.e(2, "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber");
        j4r0Var.e(1, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle");
        f = j4r0Var;
    }

    public MediaMetadata() {
        this(0);
    }

    public static void i(int i, @NonNull String str) throws IllegalArgumentException {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        Integer num = (Integer) ((HashMap) f.c).get(str);
        int intValue = num != null ? num.intValue() : 0;
        if (intValue == i || intValue == 0) {
            return;
        }
        String str2 = e[i];
        throw new IllegalArgumentException(h5s.d(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length()), "Value for ", str, " must be a ", str2));
    }

    public static boolean l(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !l((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final String b(@NonNull String str) {
        i(1, str);
        return this.c.getString(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMetadata)) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        return l(this.c, mediaMetadata.c) && this.b.equals(mediaMetadata.b);
    }

    public final int hashCode() {
        int i = 17;
        Bundle bundle = this.c;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                i = (i * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.b.hashCode() + (i * 31);
    }

    @NonNull
    public final JSONObject j() {
        Bundle bundle;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.d);
        } catch (JSONException unused) {
        }
        JSONArray b = esz0.b(this.b);
        if (b.length() != 0) {
            try {
                jSONObject.put("images", b);
            } catch (JSONException unused2) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i = this.d;
        if (i == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        try {
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                bundle = this.c;
                if (!hasNext) {
                    break;
                }
                String str = (String) it.next();
                if (str != null && bundle.containsKey(str)) {
                    j4r0 j4r0Var = f;
                    String str2 = (String) ((HashMap) j4r0Var.a).get(str);
                    if (str2 != null) {
                        Integer num = (Integer) ((HashMap) j4r0Var.c).get(str);
                        int intValue = num != null ? num.intValue() : 0;
                        if (intValue != 1) {
                            if (intValue == 2) {
                                jSONObject.put(str2, bundle.getInt(str));
                            } else if (intValue == 3) {
                                jSONObject.put(str2, bundle.getDouble(str));
                            } else if (intValue != 4) {
                                if (intValue == 5) {
                                    long j = bundle.getLong(str);
                                    Pattern pattern = o0a.a;
                                    jSONObject.put(str2, j / 1000.0d);
                                }
                            }
                        }
                        jSONObject.put(str2, bundle.getString(str));
                    }
                }
            }
            for (String str3 : bundle.keySet()) {
                if (!str3.startsWith("com.google.")) {
                    Object obj = bundle.get(str3);
                    if (obj instanceof String) {
                        jSONObject.put(str3, obj);
                    } else if (obj instanceof Integer) {
                        jSONObject.put(str3, obj);
                    } else if (obj instanceof Double) {
                        jSONObject.put(str3, obj);
                    }
                }
            }
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    public final void k(@NonNull JSONObject jSONObject) {
        HashSet hashSet;
        Bundle bundle = this.c;
        bundle.clear();
        List list = this.b;
        list.clear();
        int i = 0;
        this.d = 0;
        try {
            this.d = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            esz0.a(list, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i2 = this.d;
        if (i2 == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i2 == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i2 == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i2 == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i2 == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i2 == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet2 = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    j4r0 j4r0Var = f;
                    String str = (String) ((HashMap) j4r0Var.b).get(next);
                    if (str == null) {
                        hashSet = hashSet2;
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            bundle.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            bundle.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            bundle.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet2.contains(str)) {
                        try {
                            Object obj2 = jSONObject.get(next);
                            if (obj2 != null) {
                                Integer num = (Integer) ((HashMap) j4r0Var.c).get(str);
                                int intValue = num != null ? num.intValue() : i;
                                if (intValue == 1) {
                                    hashSet = hashSet2;
                                    if (obj2 instanceof String) {
                                        bundle.putString(str, (String) obj2);
                                    }
                                } else if (intValue == 2) {
                                    hashSet = hashSet2;
                                    if (obj2 instanceof Integer) {
                                        bundle.putInt(str, ((Integer) obj2).intValue());
                                    }
                                } else if (intValue == 3) {
                                    hashSet = hashSet2;
                                    double optDouble = jSONObject.optDouble(next);
                                    if (!Double.isNaN(optDouble)) {
                                        bundle.putDouble(str, optDouble);
                                    }
                                } else if (intValue == 4) {
                                    hashSet = hashSet2;
                                    if (obj2 instanceof String) {
                                        String str2 = (String) obj2;
                                        if (esz0.c(str2) != null) {
                                            bundle.putString(str, str2);
                                        }
                                    }
                                } else if (intValue == 5) {
                                    long optLong = jSONObject.optLong(next);
                                    Pattern pattern = o0a.a;
                                    hashSet = hashSet2;
                                    try {
                                        bundle.putLong(str, optLong * 1000);
                                    } catch (JSONException unused2) {
                                    }
                                }
                            }
                        } catch (JSONException unused3) {
                            hashSet = hashSet2;
                        }
                    }
                    hashSet2 = hashSet;
                    i = 0;
                }
            }
        } catch (JSONException unused4) {
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.u(parcel, 2, this.b, false);
        ozg0.d(parcel, 3, this.c, false);
        int i2 = this.d;
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(i2);
        ozg0.x(w, parcel);
    }

    public MediaMetadata(int i) {
        this(new ArrayList(), new Bundle(), i);
    }

    public MediaMetadata(ArrayList arrayList, Bundle bundle, int i) {
        this.b = arrayList;
        this.c = bundle;
        this.d = i;
    }
}
