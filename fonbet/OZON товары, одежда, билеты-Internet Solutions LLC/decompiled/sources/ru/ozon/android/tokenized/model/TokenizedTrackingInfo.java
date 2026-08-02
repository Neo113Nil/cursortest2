package ru.ozon.android.tokenized.model;

import Ak.b;
import C.J;
import G.g;
import Hj.C3143a;
import Kk.C3532b;
import N3.C3660k;
import Sc.InterfaceC3999a;
import android.os.Parcel;
import android.os.Parcelable;
import c8.C5766e;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 12\u00020\u0001:\u000223BY\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBO\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n¢\u0006\u0004\b\f\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001c\u001a\u00020\u00002\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0013¢\u0006\u0004\b#\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b*\u0010\u0017R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u00100\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00064"}, d2 = {"Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "Landroid/os/Parcelable;", "", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "key", "", "fastEvent", "sliceKey", "", "nested", "", "custom", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlin/Function1;", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo$a;", "", "block", "copy", "(Lkotlin/jvm/functions/Function1;)Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ljava/lang/String;", "getActionType", "getKey", "Z", "getFastEvent", "()Z", "getSliceKey", "Ljava/util/List;", "getNested", "()Ljava/util/List;", "Ljava/util/Map;", "getCustom", "()Ljava/util/Map;", "Companion", "a", "b", "analytic-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TokenizedTrackingInfo implements Parcelable {

    @NotNull
    public static final String ACTION_CLICK = "click";

    @NotNull
    public static final String ACTION_CLICK_APPS_FLYER = "clickAppsFlyer";

    @NotNull
    public static final String ACTION_CLICK_FB = "clickFB";

    @NotNull
    public static final String ACTION_CLICK_GA = "clickGA";

    @NotNull
    public static final String ACTION_COMPOSER = "composerAction";

    @NotNull
    public static final String ACTION_ERROR_VIEW = "error_view";

    @NotNull
    public static final String ACTION_FIRST_PURCHASE_FB = "firstPurchaseFB";

    @NotNull
    public static final String ACTION_MORE_INFO = "moreInfo";

    @NotNull
    public static final String ACTION_PURCHASE = "purchase";

    @NotNull
    public static final String ACTION_PURCHASE_APPS_FLYER = "purchaseAppsFlyer";

    @NotNull
    public static final String ACTION_PURCHASE_FB = "purchaseFB";

    @NotNull
    public static final String ACTION_PURCHASE_GA = "purchaseGA";

    @NotNull
    public static final String ACTION_SUBSCRIBE = "subscribe";

    @NotNull
    public static final String ACTION_UNSUBSCRIBE = "unsubscribe";

    @NotNull
    public static final String ACTION_VIEW = "view";

    @NotNull
    public static final String ACTION_VIEW_APPS_FLYER = "viewAppsFlyer";

    @NotNull
    public static final String ACTION_VIEW_FB = "viewFB";

    @NotNull
    public static final String ACTION_VIEW_GA = "viewGA";

    @NotNull
    private final String actionType;
    private final Map<String, String> custom;
    private final boolean fastEvent;

    @NotNull
    private final String key;
    private final List<TokenizedTrackingInfo> nested;
    private final String sliceKey;

    @NotNull
    public static final Parcelable.Creator<TokenizedTrackingInfo> CREATOR = new c();

    /* loaded from: classes10.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private String f92060a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private String f92061b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f92062c;

        /* renamed from: d, reason: collision with root package name */
        private String f92063d;

        /* renamed from: e, reason: collision with root package name */
        private List<TokenizedTrackingInfo> f92064e;

        /* renamed from: f, reason: collision with root package name */
        private Map<String, String> f92065f;

        public a(@NotNull TokenizedTrackingInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            String actionType = info.getActionType();
            String key = info.getKey();
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(key, "key");
            this.f92060a = actionType;
            this.f92061b = key;
            this.f92062c = info.getFastEvent();
            this.f92063d = info.getSliceKey();
            this.f92064e = info.getNested();
            this.f92065f = info.getCustom();
        }

        @NotNull
        public final TokenizedTrackingInfo a() {
            return new TokenizedTrackingInfo(this.f92060a, this.f92061b, this.f92062c, this.f92063d, this.f92064e, this.f92065f);
        }

        public final void b(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f92060a = str;
        }
    }

    public static final class c implements Parcelable.Creator<TokenizedTrackingInfo> {
        @Override // android.os.Parcelable.Creator
        public final TokenizedTrackingInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int i11 = 0;
            boolean z11 = parcel.readInt() != 0;
            String readString3 = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i12 = 0;
                while (i12 != readInt) {
                    i12 = b.b(TokenizedTrackingInfo.CREATOR, parcel, arrayList, i12, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt2);
                while (i11 != readInt2) {
                    i11 = B6.b.a(parcel, linkedHashMap, parcel.readString(), i11, 1);
                }
            }
            return new TokenizedTrackingInfo(readString, readString2, z11, readString3, arrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final TokenizedTrackingInfo[] newArray(int i11) {
            return new TokenizedTrackingInfo[i11];
        }
    }

    /* loaded from: classes10.dex */
    public static final class d extends AbstractC7737t implements Function1<a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f92066b = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    public TokenizedTrackingInfo(@NotNull String actionType, @NotNull String key) {
        this(actionType, key, null, null, null, 28, null);
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(key, "key");
    }

    public static /* synthetic */ TokenizedTrackingInfo copy$default(TokenizedTrackingInfo tokenizedTrackingInfo, Function1 block, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            block = d.f92066b;
        }
        Intrinsics.checkNotNullParameter(block, "block");
        a aVar = new a(tokenizedTrackingInfo);
        block.invoke(aVar);
        return aVar.a();
    }

    @NotNull
    public final TokenizedTrackingInfo copy(@NotNull Function1<? super a, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        a aVar = new a(this);
        block.invoke(aVar);
        return aVar.a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!TokenizedTrackingInfo.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.android.tokenized.model.TokenizedTrackingInfo");
        TokenizedTrackingInfo tokenizedTrackingInfo = (TokenizedTrackingInfo) other;
        return Intrinsics.d(this.actionType, tokenizedTrackingInfo.actionType) && Intrinsics.d(this.key, tokenizedTrackingInfo.key) && this.fastEvent == tokenizedTrackingInfo.fastEvent && Intrinsics.d(this.sliceKey, tokenizedTrackingInfo.sliceKey) && Intrinsics.d(this.nested, tokenizedTrackingInfo.nested) && Intrinsics.d(this.custom, tokenizedTrackingInfo.custom);
    }

    @NotNull
    public final String getActionType() {
        return this.actionType;
    }

    public final Map<String, String> getCustom() {
        return this.custom;
    }

    public final boolean getFastEvent() {
        return this.fastEvent;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final List<TokenizedTrackingInfo> getNested() {
        return this.nested;
    }

    public final String getSliceKey() {
        return this.sliceKey;
    }

    public int hashCode() {
        int a11 = C3532b.a(g.a(this.actionType.hashCode() * 31, 31, this.key), 31, this.fastEvent);
        String str = this.sliceKey;
        int hashCode = (a11 + (str != null ? str.hashCode() : 0)) * 31;
        List<TokenizedTrackingInfo> list = this.nested;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Map<String, String> map = this.custom;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.actionType;
        String str2 = this.key;
        boolean z11 = this.fastEvent;
        String str3 = this.sliceKey;
        List<TokenizedTrackingInfo> list = this.nested;
        Map<String, String> map = this.custom;
        StringBuilder d11 = C3660k.d("TokenizedTrackingInfo(actionType='", str, "', key='", str2, "', fastEvent='");
        C5766e.a("', sliceKey=", str3, ", nested=", d11, z11);
        return C3143a.h(d11, list, ", custom=", map, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.actionType);
        dest.writeString(this.key);
        dest.writeInt(this.fastEvent ? 1 : 0);
        dest.writeString(this.sliceKey);
        List<TokenizedTrackingInfo> list = this.nested;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator c11 = J.c(dest, 1, list);
            while (c11.hasNext()) {
                ((TokenizedTrackingInfo) c11.next()).writeToParcel(dest, flags);
            }
        }
        Map<String, String> map = this.custom;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator e11 = J.e(map, dest, 1);
        while (e11.hasNext()) {
            Map.Entry entry = (Map.Entry) e11.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    public TokenizedTrackingInfo(@NotNull String actionType, @NotNull String key, String str) {
        this(actionType, key, str, null, null, 24, null);
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(key, "key");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    public TokenizedTrackingInfo(@NotNull String actionType, @NotNull String key, String str, List<TokenizedTrackingInfo> list) {
        this(actionType, key, str, list, null, 16, null);
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(key, "key");
    }

    public TokenizedTrackingInfo(@NotNull String actionType, @NotNull String key, boolean z11, String str, List<TokenizedTrackingInfo> list, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(key, "key");
        this.actionType = actionType;
        this.key = key;
        this.fastEvent = z11;
        this.sliceKey = str;
        this.nested = list;
        this.custom = map;
    }

    public /* synthetic */ TokenizedTrackingInfo(String str, String str2, boolean z11, String str3, List list, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : list, (i11 & 32) != 0 ? null : map);
    }

    public /* synthetic */ TokenizedTrackingInfo(String str, String str2, String str3, List list, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : list, (i11 & 16) != 0 ? null : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    public TokenizedTrackingInfo(@NotNull String actionType, @NotNull String key, String str, List<TokenizedTrackingInfo> list, Map<String, String> map) {
        this(actionType, key, false, str, list, map);
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(key, "key");
    }
}
