package com.vk.dto.common;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Genre;
import com.vk.dto.newsfeed.Owner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.j5g;
import xsna.qoy;
import xsna.tsj;
import xsna.zcl;

/* compiled from: MusicVideoFile.kt */
/* loaded from: classes18.dex */
public final class MusicVideoFile extends VideoFileOld {
    public final boolean A1;
    public final List<Artist> B1;
    public final List<Artist> C1;
    public final String D1;
    public final List<Genre> E1;
    public final long F1;

    public MusicVideoFile(boolean z, List<Artist> list, List<Artist> list2, String str, List<Genre> list3, long j) {
        this.A1 = z;
        this.B1 = list;
        this.C1 = list2;
        this.D1 = str;
        this.E1 = list3;
        this.F1 = j;
        f1(list != null ? tsj.b(list, 0, null, 7) : null);
    }

    public static void Jb(JSONObject jSONObject, String str, List list) throws JSONException {
        if (list == null || list.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(((bxx) it.next()).e5());
        }
        jSONObject.put(str, jSONArray);
    }

    @Override // com.vk.dto.common.VideoFileOld, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.L(this.A1 ? (byte) 1 : (byte) 0);
        serializer.j0(this.D1);
        serializer.Y(this.F1);
        serializer.W(this.B1);
        serializer.W(this.C1);
        serializer.W(this.E1);
    }

    @Override // com.vk.dto.common.VideoFileOld, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        e5.put("is_explicit", this.A1);
        e5.put("subtitle", this.D1);
        e5.put("release_date", this.F1);
        Jb(e5, "main_artists", this.B1);
        Jb(e5, "featured_artists", this.C1);
        Jb(e5, "genres", this.E1);
        return e5;
    }

    @Override // com.vk.dto.common.VideoFileOld
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MusicVideoFile.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        MusicVideoFile musicVideoFile = (MusicVideoFile) obj;
        return this.A1 == musicVideoFile.A1 && epx.f(this.B1, musicVideoFile.B1) && epx.f(this.C1, musicVideoFile.C1) && epx.f(this.D1, musicVideoFile.D1) && epx.f(this.E1, musicVideoFile.E1) && this.F1 == musicVideoFile.F1;
    }

    @Override // com.vk.dto.common.VideoFileOld
    public final int hashCode() {
        int b = qoy.b(super.hashCode() * 31, 31, this.A1);
        List<Artist> list = this.B1;
        int hashCode = (b + (list != null ? list.hashCode() : 0)) * 31;
        List<Artist> list2 = this.C1;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.D1;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        List<Genre> list3 = this.E1;
        return Long.hashCode(this.F1) + ((hashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31);
    }

    public /* synthetic */ MusicVideoFile(JSONObject jSONObject, Map map, int i, zcl zclVar) {
        this(jSONObject, (i & 2) != 0 ? null : map);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MusicVideoFile(JSONObject jSONObject, Map<UserId, ? extends Group> map) {
        super(jSONObject);
        Group group;
        Artist artist;
        boolean z = false;
        this.A1 = jSONObject.optInt("is_explicit") == BaseBoolIntDto.YES.i();
        this.D1 = jSONObject.optString("subtitle");
        this.F1 = jSONObject.optLong("release_date");
        Artist.a aVar = Artist.o;
        ArrayList a = aay.a.a(jSONObject, "main_artists", aVar);
        this.B1 = a;
        this.C1 = aay.a.a(jSONObject, "featured_artists", aVar);
        this.E1 = aay.a.a(jSONObject, "genres", Genre.d);
        Owner owner = null;
        Long l = (a == null || (artist = (Artist) j5g.Y(a)) == null) ? null : artist.l;
        if (l != null) {
            long longValue = l.longValue();
            if (map != null) {
                group = map.get(new UserId(Math.abs(longValue)));
                if (a != null) {
                    int i = group != null ? group.v : 0;
                    if (group != null && group.C == 1) {
                        z = true;
                    }
                    owner = tsj.b(a, i, Boolean.valueOf(z), 1);
                }
                f1(owner);
            }
        }
        group = null;
        if (a != null) {
        }
        f1(owner);
    }

    public MusicVideoFile(Serializer serializer) {
        super(serializer);
        this.A1 = serializer.m();
        this.D1 = serializer.H();
        this.F1 = serializer.w();
        this.B1 = serializer.l(Artist.class.getClassLoader());
        this.C1 = serializer.l(Artist.class.getClassLoader());
        this.E1 = serializer.l(Genre.class.getClassLoader());
    }
}
