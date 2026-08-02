package com.facebook;

import T7.Y;
import T7.Z;
import X9.m;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bumptech.glide.gifdecoder.e;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.android.material.shape.i;
import g6.C4331C;
import g6.C4346f;
import g6.C4357q;
import g6.EnumC4347g;
import g6.M;
import g6.N;
import i3.C4527h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\u0017\u0018\u0000 C2\u00020\u0001:\u0002\u001c:B\u008b\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\u0017J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020'H\u0016¢\u0006\u0004\b-\u0010)J\u001f\u00100\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020'H\u0016¢\u0006\u0004\b0\u00101R\u0017\u00105\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\b3\u00104R\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002068\u0006¢\u0006\f\n\u0004\b\u001f\u00107\u001a\u0004\b8\u00109R\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002068\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002068\u0006¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u00109R\u0017\u0010A\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u0017R\u0017\u0010E\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b;\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010G\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b=\u00102\u001a\u0004\bF\u00104R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010?\u001a\u0004\b:\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010?\u001a\u0004\bI\u0010\u0017R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bF\u00102\u001a\u0004\b>\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010?\u001a\u0004\bH\u0010\u0017R\u0011\u0010L\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lcom/facebook/AccessToken;", "Landroid/os/Parcelable;", "", "accessToken", "applicationId", "userId", "", "permissions", "declinedPermissions", "expiredPermissions", "Lg6/g;", "accessTokenSource", "Ljava/util/Date;", "expirationTime", "lastRefreshTime", "dataAccessExpirationTime", "graphDomain", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lg6/g;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "Z", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "a", "(Ljava/lang/StringBuilder;)V", "tokenSource", com.google.crypto.tink.integration.android.b.f37029b, "(Lg6/g;Ljava/lang/String;)Lg6/g;", "toString", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lorg/json/JSONObject;", "Y", "()Lorg/json/JSONObject;", "describeContents", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Date;", C4527h.f48087o, "()Ljava/util/Date;", "expires", "", "Ljava/util/Set;", "k", "()Ljava/util/Set;", "c", "f", W9.d.f13160a, "g", e.f29601m, "Ljava/lang/String;", m.f13664a, "token", "Lg6/g;", "l", "()Lg6/g;", "source", "j", "lastRefresh", i.f35755A, "J", "N", "()Z", "isExpired", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AccessToken implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<AccessToken> CREATOR;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: m, reason: collision with root package name */
    public static final Date f30221m;

    /* renamed from: n, reason: collision with root package name */
    public static final Date f30222n;

    /* renamed from: o, reason: collision with root package name */
    public static final Date f30223o;

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC4347g f30224p;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Date expires;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Set permissions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Set declinedPermissions;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final Set expiredPermissions;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String token;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final EnumC4347g source;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final Date lastRefresh;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final String applicationId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final String userId;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final Date dataAccessExpirationTime;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final String graphDomain;

    public interface a {
        void a(C4357q c4357q);

        void b(AccessToken accessToken);
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccessToken createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new AccessToken(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AccessToken[] newArray(int i10) {
            return new AccessToken[i10];
        }
    }

    /* renamed from: com.facebook.AccessToken$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AccessToken a(AccessToken current) {
            Intrinsics.checkNotNullParameter(current, "current");
            return new AccessToken(current.getToken(), current.getApplicationId(), current.getUserId(), current.getPermissions(), current.getDeclinedPermissions(), current.getExpiredPermissions(), current.getSource(), new Date(), new Date(), current.getDataAccessExpirationTime(), null, 1024, null);
        }

        public final AccessToken b(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            if (jsonObject.getInt("version") > 1) {
                throw new C4357q("Unknown AccessToken serialization format.");
            }
            String token = jsonObject.getString("token");
            Date date = new Date(jsonObject.getLong("expires_at"));
            JSONArray permissionsArray = jsonObject.getJSONArray("permissions");
            JSONArray declinedPermissionsArray = jsonObject.getJSONArray("declined_permissions");
            JSONArray optJSONArray = jsonObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jsonObject.getLong("last_refresh"));
            String string = jsonObject.getString("source");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(SOURCE_KEY)");
            EnumC4347g valueOf = EnumC4347g.valueOf(string);
            String applicationId = jsonObject.getString("application_id");
            String userId = jsonObject.getString("user_id");
            Date date3 = new Date(jsonObject.optLong("data_access_expiration_time", 0L));
            String optString = jsonObject.optString("graph_domain", null);
            Intrinsics.checkNotNullExpressionValue(token, "token");
            Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
            Intrinsics.checkNotNullExpressionValue(userId, "userId");
            Y y10 = Y.f11042a;
            Intrinsics.checkNotNullExpressionValue(permissionsArray, "permissionsArray");
            List h02 = Y.h0(permissionsArray);
            Intrinsics.checkNotNullExpressionValue(declinedPermissionsArray, "declinedPermissionsArray");
            return new AccessToken(token, applicationId, userId, h02, Y.h0(declinedPermissionsArray), optJSONArray == null ? new ArrayList() : Y.h0(optJSONArray), valueOf, date, date2, date3, optString);
        }

        public final AccessToken c(Bundle bundle) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            List f10 = f(bundle, "com.facebook.TokenCachingStrategy.Permissions");
            List f11 = f(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List f12 = f(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            M.a aVar = M.f46977c;
            String a10 = aVar.a(bundle);
            if (Y.d0(a10)) {
                a10 = C4331C.m();
            }
            String str = a10;
            String f13 = aVar.f(bundle);
            if (f13 == null) {
                return null;
            }
            JSONObject f14 = Y.f(f13);
            if (f14 == null) {
                string = null;
            } else {
                try {
                    string = f14.getString(StackTraceHelper.ID_KEY);
                } catch (JSONException unused) {
                    return null;
                }
            }
            if (str == null || string == null) {
                return null;
            }
            return new AccessToken(f13, str, string, f10, f11, f12, aVar.e(bundle), aVar.c(bundle), aVar.d(bundle), null, null, 1024, null);
        }

        public final void d() {
            AccessToken i10 = C4346f.f47052f.e().i();
            if (i10 != null) {
                i(a(i10));
            }
        }

        public final AccessToken e() {
            return C4346f.f47052f.e().i();
        }

        public final List f(Bundle bundle, String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                return CollectionsKt.emptyList();
            }
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
            return unmodifiableList;
        }

        public final boolean g() {
            AccessToken i10 = C4346f.f47052f.e().i();
            return (i10 == null || i10.N()) ? false : true;
        }

        public final void h(a aVar) {
            C4346f.f47052f.e().k(aVar);
        }

        public final void i(AccessToken accessToken) {
            C4346f.f47052f.e().r(accessToken);
        }

        public Companion() {
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC4347g.valuesCustom().length];
            iArr[EnumC4347g.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            iArr[EnumC4347g.CHROME_CUSTOM_TAB.ordinal()] = 2;
            iArr[EnumC4347g.WEB_VIEW.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Date date = new Date(LongCompanionObject.MAX_VALUE);
        f30221m = date;
        f30222n = date;
        f30223o = new Date();
        f30224p = EnumC4347g.FACEBOOK_APPLICATION_WEB;
        CREATOR = new b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccessToken(String accessToken, String applicationId, String userId, Collection collection, Collection collection2, Collection collection3, EnumC4347g enumC4347g, Date date, Date date2, Date date3) {
        this(accessToken, applicationId, userId, collection, collection2, collection3, enumC4347g, date, date2, date3, null, 1024, null);
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
    }

    public static final void O(a aVar) {
        INSTANCE.h(aVar);
    }

    public static final void U(AccessToken accessToken) {
        INSTANCE.i(accessToken);
    }

    public static final AccessToken d() {
        return INSTANCE.e();
    }

    /* renamed from: J, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final boolean N() {
        return new Date().after(this.expires);
    }

    public final JSONObject Y() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.token);
        jSONObject.put("expires_at", this.expires.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.permissions));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.declinedPermissions));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.expiredPermissions));
        jSONObject.put("last_refresh", this.lastRefresh.getTime());
        jSONObject.put("source", this.source.name());
        jSONObject.put("application_id", this.applicationId);
        jSONObject.put("user_id", this.userId);
        jSONObject.put("data_access_expiration_time", this.dataAccessExpirationTime.getTime());
        String str = this.graphDomain;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public final String Z() {
        C4331C c4331c = C4331C.f46921a;
        return C4331C.I(N.INCLUDE_ACCESS_TOKENS) ? this.token : "ACCESS_TOKEN_REMOVED";
    }

    public final void a(StringBuilder builder) {
        builder.append(" permissions:");
        builder.append("[");
        builder.append(TextUtils.join(", ", this.permissions));
        builder.append("]");
    }

    public final EnumC4347g b(EnumC4347g tokenSource, String graphDomain) {
        if (graphDomain == null || !graphDomain.equals("instagram")) {
            return tokenSource;
        }
        int i10 = d.$EnumSwitchMapping$0[tokenSource.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? tokenSource : EnumC4347g.INSTAGRAM_WEB_VIEW : EnumC4347g.INSTAGRAM_CUSTOM_CHROME_TAB : EnumC4347g.INSTAGRAM_APPLICATION_WEB;
    }

    /* renamed from: c, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final Date getDataAccessExpirationTime() {
        return this.dataAccessExpirationTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) other;
        if (Intrinsics.areEqual(this.expires, accessToken.expires) && Intrinsics.areEqual(this.permissions, accessToken.permissions) && Intrinsics.areEqual(this.declinedPermissions, accessToken.declinedPermissions) && Intrinsics.areEqual(this.expiredPermissions, accessToken.expiredPermissions) && Intrinsics.areEqual(this.token, accessToken.token) && this.source == accessToken.source && Intrinsics.areEqual(this.lastRefresh, accessToken.lastRefresh) && Intrinsics.areEqual(this.applicationId, accessToken.applicationId) && Intrinsics.areEqual(this.userId, accessToken.userId) && Intrinsics.areEqual(this.dataAccessExpirationTime, accessToken.dataAccessExpirationTime)) {
            String str = this.graphDomain;
            String str2 = accessToken.graphDomain;
            if (str == null ? str2 == null : Intrinsics.areEqual(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f, reason: from getter */
    public final Set getDeclinedPermissions() {
        return this.declinedPermissions;
    }

    /* renamed from: g, reason: from getter */
    public final Set getExpiredPermissions() {
        return this.expiredPermissions;
    }

    /* renamed from: h, reason: from getter */
    public final Date getExpires() {
        return this.expires;
    }

    public int hashCode() {
        int hashCode = (((((((((((((((((((527 + this.expires.hashCode()) * 31) + this.permissions.hashCode()) * 31) + this.declinedPermissions.hashCode()) * 31) + this.expiredPermissions.hashCode()) * 31) + this.token.hashCode()) * 31) + this.source.hashCode()) * 31) + this.lastRefresh.hashCode()) * 31) + this.applicationId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.dataAccessExpirationTime.hashCode()) * 31;
        String str = this.graphDomain;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: i, reason: from getter */
    public final String getGraphDomain() {
        return this.graphDomain;
    }

    /* renamed from: j, reason: from getter */
    public final Date getLastRefresh() {
        return this.lastRefresh;
    }

    /* renamed from: k, reason: from getter */
    public final Set getPermissions() {
        return this.permissions;
    }

    /* renamed from: l, reason: from getter */
    public final EnumC4347g getSource() {
        return this.source;
    }

    /* renamed from: m, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{AccessToken");
        sb2.append(" token:");
        sb2.append(Z());
        a(sb2);
        sb2.append("}");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "builder.toString()");
        return sb3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.expires.getTime());
        dest.writeStringList(new ArrayList(this.permissions));
        dest.writeStringList(new ArrayList(this.declinedPermissions));
        dest.writeStringList(new ArrayList(this.expiredPermissions));
        dest.writeString(this.token);
        dest.writeString(this.source.name());
        dest.writeLong(this.lastRefresh.getTime());
        dest.writeString(this.applicationId);
        dest.writeString(this.userId);
        dest.writeLong(this.dataAccessExpirationTime.getTime());
        dest.writeString(this.graphDomain);
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, EnumC4347g enumC4347g, Date date, Date date2, Date date3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, collection, collection2, collection3, enumC4347g, date, date2, date3, (i10 & 1024) != 0 ? "facebook" : str4);
    }

    public AccessToken(String accessToken, String applicationId, String userId, Collection collection, Collection collection2, Collection collection3, EnumC4347g enumC4347g, Date date, Date date2, Date date3, String str) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Z.j(accessToken, "accessToken");
        Z.j(applicationId, "applicationId");
        Z.j(userId, "userId");
        this.expires = date == null ? f30222n : date;
        Set unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.permissions = unmodifiableSet;
        Set unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.declinedPermissions = unmodifiableSet2;
        Set unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.expiredPermissions = unmodifiableSet3;
        this.token = accessToken;
        this.source = b(enumC4347g == null ? f30224p : enumC4347g, str);
        this.lastRefresh = date2 == null ? f30223o : date2;
        this.applicationId = applicationId;
        this.userId = userId;
        this.dataAccessExpirationTime = (date3 == null || date3.getTime() == 0) ? f30222n : date3;
        this.graphDomain = str == null ? "facebook" : str;
    }

    public AccessToken(Parcel parcel) {
        EnumC4347g enumC4347g;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.expires = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.permissions = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.declinedPermissions = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.expiredPermissions = unmodifiableSet3;
        this.token = Z.n(parcel.readString(), "token");
        String readString = parcel.readString();
        if (readString != null) {
            enumC4347g = EnumC4347g.valueOf(readString);
        } else {
            enumC4347g = f30224p;
        }
        this.source = enumC4347g;
        this.lastRefresh = new Date(parcel.readLong());
        this.applicationId = Z.n(parcel.readString(), "applicationId");
        this.userId = Z.n(parcel.readString(), "userId");
        this.dataAccessExpirationTime = new Date(parcel.readLong());
        this.graphDomain = parcel.readString();
    }
}
