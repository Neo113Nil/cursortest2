package com.vk.camera.clips.core.drafts;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.os.Parcel;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.camera.clips.core.drafts.ClipsDraftOld;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftMusicInfo;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.clips.filters.FilterInfo;
import com.vk.dto.clips.gallery.TranscodingState;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.medianative.MediaImageEncoder;
import com.vk.movika.sdk.base.model.props.d;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Future;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.asu0;
import xsna.be;
import xsna.brm0;
import xsna.bxx;
import xsna.bz;
import xsna.c5g;
import xsna.dz;
import xsna.e43;
import xsna.e8r;
import xsna.egg0;
import xsna.epx;
import xsna.g8;
import xsna.go9;
import xsna.gx8;
import xsna.i;
import xsna.i7o0;
import xsna.iad;
import xsna.itd;
import xsna.izs;
import xsna.j5g;
import xsna.jeq0;
import xsna.jtd;
import xsna.ktd;
import xsna.la2;
import xsna.lxn0;
import xsna.mrc;
import xsna.nbr;
import xsna.nrc;
import xsna.o25;
import xsna.orc;
import xsna.ozl;
import xsna.p4g;
import xsna.prc;
import xsna.psd;
import xsna.pvo0;
import xsna.qrc;
import xsna.rdi;
import xsna.rrc;
import xsna.s3q0;
import xsna.shy;
import xsna.vhk0;
import xsna.w29;
import xsna.w9y;
import xsna.zcl;

/* compiled from: ClipsDraftPersistentStore.kt */
/* loaded from: classes.dex */
public final class ClipsDraftPersistentStore implements gx8.a {
    public static final ClipsDraftPersistentStore b = new ClipsDraftPersistentStore();
    public static final a c;
    public static final Object d;
    public static Drafts e;
    public static ClipsDraftVk f;

    /* compiled from: ClipsDraftPersistentStore.kt */
    /* loaded from: classes14.dex */
    public static final class Drafts implements Serializer.StreamParcelable, bxx {
        public static final Serializer.c<Drafts> CREATOR = new b();
        public static final a c = new a();
        public final ArrayList<ClipsDraftVk> b;

        /* compiled from: JsonParser.kt */
        public static final class a extends aay<Drafts> {
            @Override // xsna.aay
            public final Drafts a(JSONObject jSONObject) {
                ArrayList arrayList;
                ClipsDraftVk.b bVar = ClipsDraftVk.d;
                JSONArray optJSONArray = jSONObject.optJSONArray("collection");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            try {
                                arrayList.add(bVar.a(optJSONObject));
                            } catch (Exception e) {
                                L.i(e);
                                s3q0 s3q0Var = s3q0.a;
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                return new Drafts(arrayList);
            }
        }

        /* compiled from: Serializer.kt */
        public static final class b extends Serializer.c<Drafts> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Drafts a(Serializer serializer) {
                return new Drafts(serializer, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Drafts[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Drafts() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.W(this.b);
        }

        public final ArrayList<ClipsDraftVk> d() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final ClipsDraftVk e(String str) {
            ArrayList<ClipsDraftVk> arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (epx.f(arrayList.get(i).b.b, str)) {
                    return arrayList.remove(i);
                }
            }
            return null;
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            w9y w9yVar = new w9y();
            w9yVar.e(this.b, "collection");
            s3q0 s3q0Var = s3q0.a;
            return w9yVar.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Drafts) && epx.f(this.b, ((Drafts) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return j.b(')', new StringBuilder("Drafts(collection="), this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }

        public Drafts(ArrayList<ClipsDraftVk> arrayList) {
            this.b = arrayList;
        }

        public /* synthetic */ Drafts(ArrayList arrayList, int i, zcl zclVar) {
            this((i & 1) != 0 ? new ArrayList() : arrayList);
        }

        public Drafts(Serializer serializer, zcl zclVar) {
            this(serializer.l(ClipsDraftVk.class.getClassLoader()));
        }
    }

    /* compiled from: ClipsDraftPersistentStore.kt */
    @ozl
    /* loaded from: classes14.dex */
    public static final class DraftsOld implements Serializer.StreamParcelable, bxx {
        public static final Serializer.c<DraftsOld> CREATOR = new b();
        public static final a c = new a();
        public final ArrayList<ClipsDraftOld> b;

        /* compiled from: JsonParser.kt */
        public static final class a extends aay<DraftsOld> {
            @Override // xsna.aay
            public final DraftsOld a(JSONObject jSONObject) {
                ArrayList arrayList;
                ClipsDraftOld.a aVar = ClipsDraftOld.B;
                JSONArray optJSONArray = jSONObject.optJSONArray("collection");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            try {
                                aVar.getClass();
                                arrayList.add(new ClipsDraftOld(optJSONObject));
                            } catch (Exception e) {
                                L.i(e);
                                s3q0 s3q0Var = s3q0.a;
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                return new DraftsOld(arrayList);
            }
        }

        /* compiled from: Serializer.kt */
        public static final class b extends Serializer.c<DraftsOld> {
            @Override // com.vk.core.serialize.Serializer.c
            public final DraftsOld a(Serializer serializer) {
                return new DraftsOld(serializer, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DraftsOld[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DraftsOld() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.W(this.b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            w9y w9yVar = new w9y();
            w9yVar.e(this.b, "collection");
            s3q0 s3q0Var = s3q0.a;
            return w9yVar.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DraftsOld) && epx.f(this.b, ((DraftsOld) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return j.b(')', new StringBuilder("DraftsOld(collection="), this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }

        public DraftsOld(ArrayList<ClipsDraftOld> arrayList) {
            this.b = arrayList;
        }

        public /* synthetic */ DraftsOld(ArrayList arrayList, int i, zcl zclVar) {
            this((i & 1) != 0 ? new ArrayList() : arrayList);
        }

        public DraftsOld(Serializer serializer, zcl zclVar) {
            this(serializer.l(ClipsDraftOld.class.getClassLoader()));
        }
    }

    /* compiled from: ClipsDraftPersistentStore.kt */
    public static final class a extends SQLiteOpenHelper {
        /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static List i(a aVar, String str, izs izsVar, SQLiteDatabase sQLiteDatabase, int i) {
            Exception exc;
            ArrayList arrayList;
            if ((i & 4) != 0) {
                sQLiteDatabase = aVar.getReadableDatabase();
            }
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            String str2 = (i & 8) != 0 ? "key=?" : "key LIKE ?";
            aVar.getClass();
            Cursor query = sQLiteDatabase2.query("ClipsDrafts", new String[]{"data"}, str2, new String[]{str}, null, null, "_id");
            if (query == null) {
                return EmptyList.b;
            }
            try {
                try {
                    if (query.moveToFirst()) {
                        arrayList = new ArrayList(query.getCount());
                        do {
                            try {
                                arrayList.add(izsVar.invoke(query));
                            } catch (Exception e) {
                                exc = e;
                                String arrays = Arrays.toString(query.getColumnNames());
                                L.i(exc);
                                com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Incorrect cursor rowCount=" + query.getCount() + ", colCount=" + query.getColumnCount() + ", colls=" + arrays));
                                if (arrayList == null) {
                                }
                            }
                        } while (query.moveToNext());
                    } else {
                        arrayList = null;
                    }
                } catch (Exception e2) {
                    exc = e2;
                    arrayList = null;
                }
                if (arrayList == null) {
                    return rdi.H(arrayList);
                }
                return null;
            } finally {
                query.close();
            }
        }

        public static void j(String str, List list, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.beginTransaction();
            try {
                try {
                    sQLiteDatabase.delete("ClipsDrafts", "key=?", new String[]{str});
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            bxx bxxVar = (bxx) it.next();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("key", str);
                            contentValues.put("data", bxxVar.e5().toString());
                            sQLiteDatabase.insert("ClipsDrafts", null, contentValues);
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                    sQLiteDatabase.endTransaction();
                }
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }

        public static /* synthetic */ void k(a aVar, String str, List list) {
            SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
            aVar.getClass();
            j(str, list, writableDatabase);
        }

        public final void b(String... strArr) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    for (String str : strArr) {
                        writableDatabase.delete("ClipsDrafts", "key=?", new String[]{str});
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                    writableDatabase.endTransaction();
                }
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        }

        public final void c(SQLiteDatabase sQLiteDatabase, be beVar) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            JSONObject S;
            String valueOf = String.valueOf(o25.a().c().b);
            String b = go9.b("clips_active_draft", valueOf);
            String b2 = go9.b("clips_drafts", valueOf);
            List i = i(this, b, new g8(9), sQLiteDatabase, 8);
            Drafts drafts = null;
            ClipsDraftVk clipsDraftVk = (i == null || (jSONObject2 = (JSONObject) j5g.b0(0, i)) == null || (S = beVar.S(jSONObject2)) == null) ? null : (ClipsDraftVk) ClipsDraftVk.d.a(S);
            List i2 = i(this, b2, new dz(11), sQLiteDatabase, 8);
            if (i2 != null && (jSONObject = (JSONObject) j5g.b0(0, i2)) != null) {
                drafts = (Drafts) Drafts.c.a(beVar.U(jSONObject));
            }
            if (clipsDraftVk != null) {
                j(b, Collections.singletonList(clipsDraftVk), sQLiteDatabase);
            }
            if (drafts != null) {
                j(b2, Collections.singletonList(drafts), sQLiteDatabase);
            }
        }

        @ozl
        public final void h(SQLiteDatabase sQLiteDatabase, be beVar) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            JSONObject S;
            String valueOf = String.valueOf(o25.a().c().b);
            String b = go9.b("clips_active_draft", valueOf);
            String b2 = go9.b("clips_drafts", valueOf);
            List i = i(this, b, new la2(9), sQLiteDatabase, 8);
            DraftsOld draftsOld = null;
            ClipsDraftOld clipsDraftOld = (i == null || (jSONObject2 = (JSONObject) j5g.b0(0, i)) == null || (S = beVar.S(jSONObject2)) == null) ? null : (ClipsDraftOld) ClipsDraftOld.B.a(S);
            List i2 = i(this, b2, new bz(9), sQLiteDatabase, 8);
            if (i2 != null && (jSONObject = (JSONObject) j5g.b0(0, i2)) != null) {
                draftsOld = (DraftsOld) DraftsOld.c.a(beVar.U(jSONObject));
            }
            if (clipsDraftOld != null) {
                j(b, Collections.singletonList(clipsDraftOld), sQLiteDatabase);
            }
            if (draftsOld != null) {
                j(b2, Collections.singletonList(draftsOld), sQLiteDatabase);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            lxn0.a c = new lxn0("ClipsDrafts").c("_id");
            c.c();
            c.b();
            sQLiteDatabase.execSQL(c.e("key").e("data").a());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.execSQL(lxn0.b("ClipsDrafts"));
            onCreate(sQLiteDatabase);
            L.g("vk", new SQLiteException(String.format(Locale.US, "Trying to downgrade db version from %d to %d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2))));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            PrivateFiles.a b;
            while (i != i2) {
                i++;
                switch (i) {
                    case 3:
                        b = e8r.a.b(r1, PrivateSubdir.CLIPS_PREVIEW.h(), true);
                        File[] listFiles = b.a.listFiles();
                        if (listFiles != null) {
                            for (File file : listFiles) {
                                if (nbr.m(file).equals("png")) {
                                    Regex regex = com.vk.core.files.a.a;
                                    vhk0.b(file);
                                }
                            }
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        h(sQLiteDatabase, new mrc());
                        break;
                    case 5:
                        h(sQLiteDatabase, new nrc());
                        break;
                    case 6:
                        h(sQLiteDatabase, new orc());
                        break;
                    case 7:
                        c(sQLiteDatabase, new prc());
                        break;
                    case 8:
                        c(sQLiteDatabase, new qrc());
                        break;
                    case 9:
                        c(sQLiteDatabase, new rrc());
                        break;
                    default:
                        sQLiteDatabase.execSQL(lxn0.b("ClipsDrafts"));
                        onCreate(sQLiteDatabase);
                        break;
                }
            }
        }
    }

    /* compiled from: ClipsDraftPersistentStore.kt */
    /* loaded from: classes14.dex */
    public static final class b {
        public final File a;
        public final int b;
        public final int c;
        public final int d;
        public final TranscodingState e;
        public final float f;
        public final MaskLight g;

        public b(File file, int i, int i2, int i3, TranscodingState transcodingState, float f, MaskLight maskLight) {
            this.a = file;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = transcodingState;
            this.f = f;
            this.g = maskLight;
        }

        public final int a() {
            return this.d;
        }

        public final File b() {
            return this.a;
        }

        public final MaskLight c() {
            return this.g;
        }

        public final float d() {
            return this.f;
        }

        public final int e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && Float.compare(this.f, bVar.f) == 0 && epx.f(this.g, bVar.g);
        }

        public final TranscodingState f() {
            return this.e;
        }

        public final int hashCode() {
            int a = io.reactivex.rxjava3.subjects.b.a(this.f, (this.e.hashCode() + shy.a(this.d, shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31)) * 31, 31);
            MaskLight maskLight = this.g;
            return a + (maskLight == null ? 0 : maskLight.hashCode());
        }

        public final String toString() {
            return "VideoFragment(file=" + this.a + ", originalDuration=" + this.b + ", startMs=" + this.c + ", endMs=" + this.d + ", transcodingState=" + this.e + ", speed=" + this.f + ", mask=" + this.g + ')';
        }
    }

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        c = new a(context, "ClipsDrafts", null, 9);
        d = new Object();
    }

    public static boolean A(ClipsDraftVk clipsDraftVk) {
        int i;
        if (clipsDraftVk == null) {
            return true;
        }
        if (!clipsDraftVk.d().e().isEmpty()) {
            List<ClipsEditorInputVideoItem> e2 = clipsDraftVk.d().e();
            if ((e2 instanceof Collection) && e2.isEmpty()) {
                i = 0;
            } else {
                Iterator<T> it = e2.iterator();
                i = 0;
                while (it.hasNext()) {
                    File g = ((ClipsEditorInputVideoItem) it.next()).g();
                    Regex regex = com.vk.core.files.a.a;
                    if (vhk0.g(g) && (i = i + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
            if (i == clipsDraftVk.d().e().size()) {
                return true;
            }
        }
        return false;
    }

    public static void b(ClipsDraftVk clipsDraftVk) {
        Drafts drafts;
        ArrayList<ClipsDraftVk> d2;
        ArrayList<ClipsDraftVk> d3;
        ClipsDraftCommonData d4;
        synchronized (d) {
            try {
                ClipsDraftVk clipsDraftVk2 = f;
                if (!epx.f((clipsDraftVk2 == null || (d4 = clipsDraftVk2.d()) == null) ? null : d4.getId(), clipsDraftVk.d().getId()) && (drafts = e) != null && (d2 = drafts.d()) != null) {
                    if (!d2.isEmpty()) {
                        Iterator<T> it = d2.iterator();
                        while (it.hasNext()) {
                            if (epx.f(((ClipsDraftVk) it.next()).d().getId(), clipsDraftVk.d().getId())) {
                                break;
                            }
                        }
                    }
                    Drafts drafts2 = e;
                    if (drafts2 != null && (d3 = drafts2.d()) != null) {
                        d3.add(clipsDraftVk);
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(boolean z) {
        synchronized (d) {
            try {
                Drafts drafts = e;
                ClipsDraftVk clipsDraftVk = f;
                if (drafts != null && clipsDraftVk != null) {
                    if (z) {
                        drafts.d().add(ClipsDraftVk.a(clipsDraftVk, ClipsDraftCommonData.a(clipsDraftVk.d(), null, pvo0.a(), null, 16319)));
                    } else {
                        drafts.d().add(clipsDraftVk);
                    }
                    f = null;
                    s3q0 s3q0Var = s3q0.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void d(ClipsDraftPersistentStore clipsDraftPersistentStore) {
        clipsDraftPersistentStore.getClass();
        c(false);
    }

    public static void e(String str) {
        Uri g;
        String path;
        PrivateFiles.a b2;
        if (str == null || (g = jeq0.g(str)) == null || (path = g.getPath()) == null) {
            return;
        }
        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
        b.getClass();
        b2 = e8r.a.b(r2, PrivateSubdir.CLIPS_PREVIEW.h(), true);
        if (brm0.B(absolutePath, b2.a.getAbsolutePath(), false)) {
            Regex regex = com.vk.core.files.a.a;
            vhk0.b(file);
        }
    }

    public static void f(ClipsDraftVk clipsDraftVk, boolean z) {
        if (z) {
            e(clipsDraftVk.d().f());
        }
        for (ClipsEditorInputVideoItem clipsEditorInputVideoItem : clipsDraftVk.d().e()) {
            File g = clipsEditorInputVideoItem.g();
            Regex regex = com.vk.core.files.a.a;
            vhk0.b(g);
            File e2 = clipsEditorInputVideoItem.e();
            if (e2 != null) {
                vhk0.b(e2);
            }
        }
        ClipsDraftMusicInfo e3 = clipsDraftVk.e().e();
        if (e3 != null) {
            String Ab = e3.d().Ab();
            Regex regex2 = com.vk.core.files.a.a;
            vhk0.c(Ab);
        }
        List<List<ClipsDraftMusicInfo>> d2 = clipsDraftVk.d().d();
        if (d2 != null) {
            Iterator<T> it = d2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                    String Ab2 = ((ClipsDraftMusicInfo) it2.next()).d().Ab();
                    Regex regex3 = com.vk.core.files.a.a;
                    vhk0.c(Ab2);
                }
            }
        }
    }

    public static String h(String str) {
        File file;
        File e2 = PrivateFiles.e(e8r.a, PrivateSubdir.CLIPS_PREVIEW, null, "jpg", 24);
        try {
            Bitmap k = MediaUtils.a.k(0L, str);
            if (k != null) {
                b.getClass();
                if (MediaImageEncoder.INSTANCE.encodeJpeg(k, e2, 100)) {
                    file = e2;
                } else {
                    Regex regex = com.vk.core.files.a.a;
                    vhk0.b(e2);
                    file = null;
                }
                if (file != null) {
                    return Uri.fromFile(file).toString();
                }
            }
            return null;
        } catch (Throwable unused) {
            Regex regex2 = com.vk.core.files.a.a;
            vhk0.d(e2);
            return null;
        }
    }

    public static String i() {
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID());
        sb.append('_');
        sb.append(System.currentTimeMillis());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r1.e().d() == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ClipsDraftVk j() {
        ClipsDraftVk clipsDraftVk;
        synchronized (d) {
            clipsDraftVk = f;
            if (clipsDraftVk != null) {
            }
            clipsDraftVk = null;
        }
        return clipsDraftVk;
    }

    public static ClipsDraftVk k() {
        ClipsDraftVk clipsDraftVk = f;
        if (clipsDraftVk == null || clipsDraftVk.e().d() != null) {
            return null;
        }
        return clipsDraftVk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ClipsDraftVk l(String str) {
        ArrayList<ClipsDraftVk> d2;
        ClipsDraftCommonData d3;
        synchronized (d) {
            try {
                ClipsDraftVk clipsDraftVk = f;
                ClipsDraftVk clipsDraftVk2 = null;
                if (epx.f((clipsDraftVk == null || (d3 = clipsDraftVk.d()) == null) ? null : d3.getId(), str) && clipsDraftVk.e().d() == null) {
                    return clipsDraftVk;
                }
                Drafts drafts = e;
                if (drafts != null && (d2 = drafts.d()) != null) {
                    Iterator<T> it = d2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        ClipsDraftVk clipsDraftVk3 = (ClipsDraftVk) next;
                        if (epx.f(clipsDraftVk3.d().getId(), str) && clipsDraftVk3.e().d() == null) {
                            clipsDraftVk2 = next;
                            break;
                        }
                    }
                    clipsDraftVk2 = clipsDraftVk2;
                }
                return clipsDraftVk2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static egg0 m() {
        ArrayList arrayList;
        egg0 egg0Var;
        ArrayList<ClipsDraftVk> d2;
        synchronized (d) {
            try {
                Drafts drafts = e;
                if (drafts == null || (d2 = drafts.d()) == null) {
                    arrayList = new ArrayList();
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : d2) {
                        if (((ClipsDraftVk) obj).e().d() == null) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayList = p4g.q(i7o0.a(arrayList2));
                }
                ClipsDraftVk clipsDraftVk = f;
                if (clipsDraftVk != null && clipsDraftVk.e().d() == null) {
                    arrayList.add(clipsDraftVk);
                }
                egg0Var = new egg0(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return egg0Var;
    }

    public static Future o(izs izsVar) {
        Looper looper = null;
        if (e != null) {
            if (izsVar != null) {
                izsVar.invoke(b);
            }
            return null;
        }
        if (izsVar != null) {
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                myLooper = Looper.getMainLooper();
            }
            looper = myLooper;
        }
        asu0.a.getClass();
        return asu0.j().submit(new i(6, looper, izsVar));
    }

    public static void p(boolean z) {
        synchronized (d) {
            try {
                ClipsDraftVk clipsDraftVk = f;
                if (clipsDraftVk != null) {
                    asu0.a.getClass();
                    asu0.n().execute(new jtd(clipsDraftVk, z));
                }
                f = null;
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void q(String str, boolean z, final boolean z2) {
        final ClipsDraftVk e2;
        synchronized (d) {
            try {
                ClipsDraftVk clipsDraftVk = f;
                if (clipsDraftVk != null && epx.f(clipsDraftVk.d().getId(), str)) {
                    f = null;
                    if (z) {
                        asu0.a.getClass();
                        asu0.n().execute(new ktd(clipsDraftVk, z2, 0));
                    }
                }
                Drafts drafts = e;
                if (drafts != null && (e2 = drafts.e(str)) != null && z) {
                    asu0.a.getClass();
                    asu0.n().execute(new Runnable() { // from class: xsna.ltd
                        @Override // java.lang.Runnable
                        public final void run() {
                            ClipsDraftPersistentStore.b.getClass();
                            ClipsDraftPersistentStore.f(ClipsDraftVk.this, z2);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void r(ClipsDraftPersistentStore clipsDraftPersistentStore, String str, int i) {
        boolean z = (i & 4) != 0;
        clipsDraftPersistentStore.getClass();
        q(str, true, z);
    }

    public static void s() {
        asu0.a.getClass();
        asu0.j().execute(new itd());
    }

    public static void t() {
        if (o25.a().b()) {
            String valueOf = String.valueOf(o25.a().o().a.b);
            String b2 = go9.b("clips_active_draft", valueOf);
            String b3 = go9.b("clips_drafts", valueOf);
            synchronized (d) {
                try {
                    ClipsDraftPersistentStore clipsDraftPersistentStore = b;
                    Drafts drafts = e;
                    clipsDraftPersistentStore.getClass();
                    x(drafts);
                    y(f);
                    ClipsDraftVk clipsDraftVk = f;
                    if (clipsDraftVk != null) {
                        a.k(c, b2, Collections.singletonList(clipsDraftVk));
                    } else {
                        c.b(b2);
                    }
                    Drafts drafts2 = e;
                    if (drafts2 != null) {
                        a.k(c, b3, Collections.singletonList(drafts2));
                    } else {
                        c.b(b3);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void v(String str) {
        synchronized (d) {
            try {
                ClipsDraftVk clipsDraftVk = f;
                if (clipsDraftVk != null) {
                    if (str.equals(clipsDraftVk.d().getId())) {
                        return;
                    }
                    Drafts drafts = e;
                    if (drafts != null) {
                        drafts.d().add(clipsDraftVk);
                        f = null;
                    }
                }
                Drafts drafts2 = e;
                if (drafts2 != null) {
                    f = drafts2.e(str);
                    s3q0 s3q0Var = s3q0.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void w(ClipsDraftVk clipsDraftVk) {
        String str;
        synchronized (d) {
            try {
                ClipsDraftVk clipsDraftVk2 = f;
                if (clipsDraftVk2 != null && !clipsDraftVk2.equals(clipsDraftVk)) {
                    ArrayList arrayList = new ArrayList();
                    String f2 = clipsDraftVk2.d().f();
                    if (f2 != null) {
                        if (f2.equals(clipsDraftVk.d().f())) {
                            f2 = null;
                        }
                        str = f2;
                    } else {
                        str = null;
                    }
                    for (ClipsEditorInputVideoItem clipsEditorInputVideoItem : clipsDraftVk2.d().e()) {
                        if (clipsDraftVk.d().b(clipsEditorInputVideoItem.g().getPath()) == null) {
                            arrayList.add(clipsEditorInputVideoItem);
                        }
                    }
                    if (str != null || !arrayList.isEmpty()) {
                        ClipsDraftVk clipsDraftVk3 = new ClipsDraftVk(new ClipsDraftCommonData("", 0, arrayList, null, 0L, false, 0, false, str, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 16120, null), new ClipsDraftVkExtraData(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null));
                        asu0.a.getClass();
                        asu0.n().execute(new w29(clipsDraftVk3, 1));
                    }
                }
                f = clipsDraftVk;
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean x(Drafts drafts) {
        ClipsDraftPersistentStore clipsDraftPersistentStore;
        if (drafts == null) {
            return false;
        }
        int size = drafts.d().size();
        Iterator<ClipsDraftVk> it = drafts.d().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            clipsDraftPersistentStore = b;
            if (!hasNext) {
                break;
            }
            ClipsDraftVk next = it.next();
            clipsDraftPersistentStore.getClass();
            if (!A(next)) {
                f(next, true);
                it.remove();
            }
        }
        boolean z = size != drafts.d().size();
        for (ClipsDraftVk clipsDraftVk : drafts.d()) {
            clipsDraftPersistentStore.getClass();
            if (y(clipsDraftVk)) {
                z = true;
            }
        }
        return z;
    }

    public static boolean y(ClipsDraftVk clipsDraftVk) {
        File file;
        Uri g;
        String path;
        PrivateFiles.a b2;
        if (clipsDraftVk == null) {
            return false;
        }
        String f2 = clipsDraftVk.d().f();
        if (f2 == null || (g = jeq0.g(f2)) == null || (path = g.getPath()) == null) {
            file = null;
        } else {
            File file2 = new File(path);
            b.getClass();
            b2 = e8r.a.b(r3, PrivateSubdir.CLIPS_PREVIEW.h(), true);
            file = iad.a(file2, b2.a);
        }
        if (file == null) {
            return false;
        }
        clipsDraftVk.d().g(Uri.fromFile(file).toString());
        return true;
    }

    public static ClipsDraftVk z(List list) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            File e2 = PrivateFiles.e(e8r.a, PrivateSubdir.CLIPS_VIDEO, null, "mp4", 24);
            File parentFile = e2.getParentFile();
            if (parentFile == null) {
                throw new IOException("Invalid clips dir");
            }
            if (brm0.B(bVar.b().getAbsolutePath(), parentFile.getAbsolutePath(), false)) {
                arrayList.add(bVar.b());
            } else {
                arrayList.add(e2);
                File a2 = iad.a(bVar.b(), parentFile);
                if (a2 == null) {
                    throw new IOException("Failed to copy file");
                }
                if (!a2.renameTo(e2)) {
                    Regex regex = com.vk.core.files.a.a;
                    vhk0.d(a2);
                    throw new IOException("Failed to rename file");
                }
            }
        }
        try {
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                b bVar2 = (b) obj;
                File file = (File) arrayList.get(i);
                long e3 = bVar2.e();
                long a3 = bVar2.a();
                TranscodingState f2 = bVar2.f();
                Serializer.c<ClipsVideoItemLocation> cVar = ClipsVideoItemLocation.CREATOR;
                ClipsEditorMusicInfo clipsEditorMusicInfo = null;
                File file2 = null;
                FilterInfo filterInfo = null;
                boolean z = false;
                arrayList2.add(new ClipsEditorInputVideoItem(file, e3, a3, bVar2.c(), clipsEditorMusicInfo, file2, f2, filterInfo, z, bVar2.d(), null, false, null, null, null, ClipsVideoItemLocation.a.a(MediaUtils.a.a(bVar2.b().getAbsolutePath())), null, 97712, null));
                i = i2;
            }
            String i3 = i();
            Iterator it2 = arrayList2.iterator();
            long j = 0;
            while (it2.hasNext()) {
                ClipsEditorInputVideoItem clipsEditorInputVideoItem = (ClipsEditorInputVideoItem) it2.next();
                j += clipsEditorInputVideoItem.d() - clipsEditorInputVideoItem.f();
            }
            return new ClipsDraftVk(new ClipsDraftCommonData(i3, (int) j, new ArrayList(arrayList2), null, 0L, false, pvo0.a(), false, h(((File) arrayList.get(0)).getAbsolutePath()), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 16056, null), new ClipsDraftVkExtraData(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null));
        } catch (Exception e4) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                File file3 = (File) it3.next();
                Regex regex2 = com.vk.core.files.a.a;
                vhk0.d(file3);
            }
            throw e4;
        }
    }

    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return CacheTarget.SYSTEM;
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        g();
    }

    public final void g() {
        synchronized (d) {
            f = null;
            e = null;
            s3q0 s3q0Var = s3q0.a;
        }
        new psd(new d(14)).a();
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return "ClipsDraftPersistentStore";
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore.f == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n() {
        ClipsDraftVkExtraData e2;
        ArrayList<ClipsDraftVk> d2;
        synchronized (d) {
            Drafts drafts = e;
            boolean z = false;
            if (drafts != null && (d2 = drafts.d()) != null && !d2.isEmpty()) {
                Iterator<T> it = d2.iterator();
                while (it.hasNext()) {
                    if (((ClipsDraftVk) it.next()).e().d() == null) {
                        return false;
                    }
                }
            }
            ClipsDraftVk clipsDraftVk = f;
            if (((clipsDraftVk == null || (e2 = clipsDraftVk.e()) == null) ? null : e2.d()) == null) {
            }
            z = true;
            return z;
        }
    }

    @Override // xsna.gx8.a
    public final long u() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return com.vk.core.files.a.I(context.getDatabasePath("ClipsDrafts"));
    }
}
