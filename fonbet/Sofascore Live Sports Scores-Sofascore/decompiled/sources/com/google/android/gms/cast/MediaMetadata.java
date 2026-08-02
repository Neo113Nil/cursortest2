package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import defpackage.a70;
import defpackage.fc6;
import defpackage.tm3;
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

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class MediaMetadata extends AbstractSafeParcelable {
    public static final tm3 e;
    public final List a;
    public final Bundle b;
    public int c;
    public static final String[] d = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};

    @NonNull
    public static final Parcelable.Creator<MediaMetadata> CREATOR = new zzbv();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public class Writer {
    }

    static {
        tm3 tm3Var = new tm3();
        tm3Var.a = new HashMap();
        tm3Var.b = new HashMap();
        tm3Var.c = new HashMap();
        tm3Var.b(4, "com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime");
        tm3Var.b(4, "com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate");
        tm3Var.b(4, "com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate");
        tm3Var.b(1, "com.google.android.gms.cast.metadata.TITLE", "title");
        tm3Var.b(1, "com.google.android.gms.cast.metadata.SUBTITLE", "subtitle");
        tm3Var.b(1, "com.google.android.gms.cast.metadata.ARTIST", "artist");
        tm3Var.b(1, "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist");
        tm3Var.b(1, "com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName");
        tm3Var.b(1, "com.google.android.gms.cast.metadata.COMPOSER", "composer");
        tm3Var.b(2, "com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber");
        tm3Var.b(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber");
        tm3Var.b(2, "com.google.android.gms.cast.metadata.SEASON_NUMBER", TeamOfTheWeekRoundsResponseKt.TOTW_SEASON);
        tm3Var.b(2, "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode");
        tm3Var.b(1, "com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle");
        tm3Var.b(1, "com.google.android.gms.cast.metadata.STUDIO", "studio");
        tm3Var.b(2, "com.google.android.gms.cast.metadata.WIDTH", "width");
        tm3Var.b(2, "com.google.android.gms.cast.metadata.HEIGHT", "height");
        tm3Var.b(1, "com.google.android.gms.cast.metadata.LOCATION_NAME", "location");
        tm3Var.b(3, "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude");
        tm3Var.b(3, "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude");
        tm3Var.b(5, "com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration");
        tm3Var.b(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia");
        tm3Var.b(5, "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime");
        tm3Var.b(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer");
        tm3Var.b(2, "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId");
        tm3Var.b(1, "com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle");
        tm3Var.b(2, "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber");
        tm3Var.b(1, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle");
        e = tm3Var;
    }

    public MediaMetadata(int i) {
        this(new ArrayList(), new Bundle(), i);
    }

    public static void a1(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            a70.p("null and empty keys are not allowed");
            return;
        }
        Integer num = (Integer) e.c.get(str);
        int intValue = num != null ? num.intValue() : 0;
        if (intValue == i || intValue == 0) {
            return;
        }
        String str2 = d[i];
        a70.p(fc6.o(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length()), "Value for ", str, " must be a ", str2));
    }

    public static boolean d1(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !d1((Bundle) obj, (Bundle) obj2)) {
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

    public final String Y0(String str) {
        a1(1, str);
        return this.b.getString(str);
    }

    public final void Z0(String str, String str2) {
        a1(1, str);
        this.b.putString(str, str2);
    }

    public final JSONObject b1() {
        Bundle bundle;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.c);
        } catch (JSONException unused) {
        }
        JSONArray b = com.google.android.gms.cast.internal.media.zza.b(this.a);
        if (b.length() != 0) {
            try {
                jSONObject.put("images", b);
            } catch (JSONException unused2) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i = this.c;
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
                bundle = this.b;
                if (!hasNext) {
                    break;
                }
                String str = (String) it.next();
                if (str != null && bundle.containsKey(str)) {
                    tm3 tm3Var = e;
                    String str2 = (String) tm3Var.a.get(str);
                    if (str2 != null) {
                        Integer num = (Integer) tm3Var.c.get(str);
                        int intValue = num != null ? num.intValue() : 0;
                        if (intValue != 1) {
                            if (intValue == 2) {
                                jSONObject.put(str2, bundle.getInt(str));
                            } else if (intValue == 3) {
                                jSONObject.put(str2, bundle.getDouble(str));
                            } else if (intValue != 4) {
                                if (intValue == 5) {
                                    long j = bundle.getLong(str);
                                    Pattern pattern = CastUtils.a;
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

    public final void c1(JSONObject jSONObject) {
        Bundle bundle = this.b;
        bundle.clear();
        List list = this.a;
        list.clear();
        this.c = 0;
        try {
            this.c = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            com.google.android.gms.cast.internal.media.zza.a(list, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i = this.c;
        if (i == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    tm3 tm3Var = e;
                    String str = (String) tm3Var.b.get(next);
                    if (str == null) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            bundle.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            bundle.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            bundle.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(str)) {
                        try {
                            Object obj2 = jSONObject.get(next);
                            if (obj2 != null) {
                                Integer num = (Integer) tm3Var.c.get(str);
                                int intValue = num != null ? num.intValue() : 0;
                                if (intValue != 1) {
                                    if (intValue != 2) {
                                        if (intValue == 3) {
                                            double optDouble = jSONObject.optDouble(next);
                                            if (!Double.isNaN(optDouble)) {
                                                bundle.putDouble(str, optDouble);
                                            }
                                        } else if (intValue != 4) {
                                            if (intValue == 5) {
                                                long optLong = jSONObject.optLong(next);
                                                Pattern pattern = CastUtils.a;
                                                bundle.putLong(str, optLong * 1000);
                                            }
                                        } else if (obj2 instanceof String) {
                                            String str2 = (String) obj2;
                                            if (com.google.android.gms.cast.internal.media.zza.c(str2) != null) {
                                                bundle.putString(str, str2);
                                            }
                                        }
                                    } else if (obj2 instanceof Integer) {
                                        bundle.putInt(str, ((Integer) obj2).intValue());
                                    }
                                } else if (obj2 instanceof String) {
                                    bundle.putString(str, (String) obj2);
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMetadata)) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        return d1(this.b, mediaMetadata.b) && this.a.equals(mediaMetadata.a);
    }

    public final int hashCode() {
        int i = 17;
        Bundle bundle = this.b;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                i = (i * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.a.hashCode() + (i * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.q(parcel, 2, this.a, false);
        SafeParcelWriter.b(parcel, 3, this.b);
        int i2 = this.c;
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(i2);
        SafeParcelWriter.t(parcel, s);
    }

    public MediaMetadata() {
        this(0);
    }

    public MediaMetadata(ArrayList arrayList, Bundle bundle, int i) {
        this.a = arrayList;
        this.b = bundle;
        this.c = i;
    }
}
