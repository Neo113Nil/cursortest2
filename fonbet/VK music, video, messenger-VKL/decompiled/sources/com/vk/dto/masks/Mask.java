package com.vk.dto.masks;

import com.ironsource.C4217a2;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.masks.MaskGeo;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.brm0;
import xsna.c5g;
import xsna.cqm0;
import xsna.epx;
import xsna.ho8;
import xsna.j9x;
import xsna.k9x;
import xsna.qoy;
import xsna.zcl;

/* compiled from: Mask.kt */
/* loaded from: classes18.dex */
public final class Mask extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Mask> CREATOR = new b();
    public final UserProfile b;
    public final Group c;
    public final int d;
    public final UserId e;
    public final boolean f;
    public final String g;
    public final int h;
    public final long i;
    public final long j;
    public final String k;
    public final NotificationImage l;
    public boolean m;
    public final int n;
    public final int o;
    public final MaskDisableReason p;
    public final String q;
    public final MaskGeo r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public boolean w;
    public final String x;
    public final long y;

    /* compiled from: Mask.kt */
    public static final class a {
        public static Mask a(JSONObject jSONObject, UserProfile userProfile, Group group, long j) {
            MaskDisableReason maskDisableReason;
            boolean z;
            int i;
            UserId userId;
            MaskDisableReason maskDisableReason2;
            String optString;
            String optString2;
            int optInt = jSONObject.optInt("id");
            UserId userId2 = new UserId(jSONObject.optLong("owner_id"));
            String optString3 = jSONObject.optString("name");
            int optInt2 = jSONObject.optInt("section_id");
            long optLong = jSONObject.optLong("update_time");
            long optLong2 = jSONObject.optLong("create_time");
            String a = cqm0.a(jSONObject.optString("url"));
            MaskGeo maskGeo = null;
            String y = a != null ? brm0.y(a, "vk.me", "vk.com") : null;
            Serializer.c<NotificationImage> cVar = NotificationImage.CREATOR;
            NotificationImage a2 = NotificationImage.a.a(jSONObject.optJSONArray("previews"));
            boolean optBoolean = jSONObject.optBoolean("is_new");
            int optInt3 = jSONObject.optInt("engine_version");
            int optInt4 = jSONObject.optInt("vk_engine_version");
            String optString4 = jSONObject.optString("hint");
            JSONObject optJSONObject = jSONObject.optJSONObject("disabled_reason");
            if (optJSONObject != null) {
                if (jSONObject.optBoolean(C4217a2.e)) {
                    Serializer.c<MaskDisableReason> cVar2 = MaskDisableReason.CREATOR;
                    if (optJSONObject.has("reason")) {
                        optString2 = optJSONObject.optString("reason");
                        optString = null;
                    } else {
                        optString = optJSONObject.optString("title");
                        optString2 = optJSONObject.optString("subtitle");
                    }
                    maskDisableReason2 = new MaskDisableReason(optString, optString2, optJSONObject.optString("url"));
                } else {
                    maskDisableReason2 = null;
                }
                maskDisableReason = maskDisableReason2;
            } else {
                maskDisableReason = null;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("geo");
            if (optJSONArray != null) {
                Serializer.c<MaskGeo> cVar3 = MaskGeo.CREATOR;
                k9x k9xVar = new k9x(0, optJSONArray.length() - 1, 1);
                ArrayList arrayList = new ArrayList(c5g.u(k9xVar, 10));
                j9x it = k9xVar.iterator();
                while (it.d) {
                    arrayList.add(optJSONArray.optJSONObject(it.nextInt()));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((JSONObject) next) != null) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    JSONObject jSONObject2 = (JSONObject) it3.next();
                    Serializer.c<MaskGeo.MaskLocation> cVar4 = MaskGeo.MaskLocation.CREATOR;
                    arrayList3.add(new MaskGeo.MaskLocation(jSONObject2.optDouble("latitude", ConnectivityTracker.DEFAULT_UPLINK_BITRATE), jSONObject2.optDouble("longitude", ConnectivityTracker.DEFAULT_UPLINK_BITRATE), jSONObject2.optDouble("radius", ConnectivityTracker.DEFAULT_UPLINK_BITRATE)));
                    optInt = optInt;
                    userId2 = userId2;
                }
                i = optInt;
                userId = userId2;
                z = false;
                maskGeo = new MaskGeo((MaskGeo.MaskLocation[]) arrayList3.toArray(new MaskGeo.MaskLocation[0]));
            } else {
                z = false;
                i = optInt;
                userId = userId2;
            }
            return new Mask(userProfile, group, i, userId, false, optString3, optInt2, optLong, optLong2, y, a2, optBoolean, optInt3, optInt4, maskDisableReason, optString4, maskGeo, jSONObject.optBoolean("is_tappable", z), false, i < 0 ? true : z, false, jSONObject.optBoolean("is_favorite"), jSONObject.optString("category_display"), j);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Mask> {
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
            	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
            	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
            */
        @Override // com.vk.core.serialize.Serializer.c
        public final com.vk.dto.masks.Mask a(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
            	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
            	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
            */

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Mask[i];
        }
    }

    public /* synthetic */ Mask(UserProfile userProfile, Group group, int i, UserId userId, boolean z, String str, int i2, long j, long j2, String str2, NotificationImage notificationImage, boolean z2, int i3, int i4, MaskDisableReason maskDisableReason, String str3, MaskGeo maskGeo, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str4, long j3, int i5, zcl zclVar) {
        this(userProfile, group, i, userId, z, str, i2, j, j2, str2, notificationImage, (i5 & 2048) != 0 ? false : z2, (i5 & 4096) != 0 ? 0 : i3, (i5 & 8192) != 0 ? 0 : i4, maskDisableReason, str3, maskGeo, z3, (262144 & i5) != 0 ? false : z4, z5, z6, z7, str4, (i5 & 8388608) != 0 ? 0L : j3);
    }

    public final Mask Ab() {
        return new Mask(this.b, this.c, this.d, this.e, true, this.g, this.h, this.i, this.j, this.k, this.l, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y);
    }

    public final String Bb() {
        UserProfile userProfile = this.b;
        if (userProfile != null) {
            return userProfile.h;
        }
        Group group = this.c;
        if (group != null) {
            return group.e;
        }
        return null;
    }

    public final int Cb() {
        return this.n;
    }

    public final String Db() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append('_');
        sb.append(this.d);
        return sb.toString();
    }

    public final long Eb() {
        return this.i;
    }

    public final boolean Fb() {
        return this.r != null;
    }

    public final boolean Gb(Mask mask) {
        return mask != null && this.d == mask.d && epx.f(this.e, mask.e);
    }

    public final MaskLight Hb() {
        String str = this.g;
        if (str == null) {
            str = "";
        }
        return new MaskLight(this.d, this.e, this.h, str);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.S(this.d);
        serializer.e0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.j0(this.g);
        serializer.S(this.h);
        serializer.Y(this.i);
        serializer.Y(this.j);
        serializer.j0(this.k);
        serializer.i0(this.l);
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.S(this.n);
        serializer.S(this.o);
        serializer.i0(this.p);
        serializer.j0(this.q);
        serializer.i0(this.r);
        serializer.L(this.s ? (byte) 1 : (byte) 0);
        serializer.L(this.t ? (byte) 1 : (byte) 0);
        serializer.L(this.u ? (byte) 1 : (byte) 0);
        serializer.L(this.v ? (byte) 1 : (byte) 0);
        serializer.L(this.w ? (byte) 1 : (byte) 0);
        serializer.j0(this.x);
        serializer.Y(this.y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Mask.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Mask mask = (Mask) obj;
        return this.d == mask.d && this.f == mask.f && this.t == mask.t && this.w == mask.w;
    }

    public final int getId() {
        return this.d;
    }

    public final String getUrl() {
        return this.k;
    }

    public final int hashCode() {
        return ((qoy.b(this.d * 31, 31, this.f) + (this.t ? 1 : 0)) * 31) + (this.w ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mask(id=");
        sb.append(this.d);
        sb.append(", name=");
        return ho8.a(sb, this.g, ')');
    }

    public final Mask zb() {
        return new Mask(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y);
    }

    public Mask(UserProfile userProfile, Group group, int i, UserId userId, boolean z, String str, int i2, long j, long j2, String str2, NotificationImage notificationImage, boolean z2, int i3, int i4, MaskDisableReason maskDisableReason, String str3, MaskGeo maskGeo, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str4, long j3) {
        this.b = userProfile;
        this.c = group;
        this.d = i;
        this.e = userId;
        this.f = z;
        this.g = str;
        this.h = i2;
        this.i = j;
        this.j = j2;
        this.k = str2;
        this.l = notificationImage;
        this.m = z2;
        this.n = i3;
        this.o = i4;
        this.p = maskDisableReason;
        this.q = str3;
        this.r = maskGeo;
        this.s = z3;
        this.t = z4;
        this.u = z5;
        this.v = z6;
        this.w = z7;
        this.x = str4;
        this.y = j3;
    }
}
