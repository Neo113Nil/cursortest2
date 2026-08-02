package com.braze.enums;

import com.braze.Constants;
import com.braze.models.IPutIntoJson;
import com.ironsource.M6;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b*\b\u0087\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,¨\u0006-"}, d2 = {"Lcom/braze/enums/BrazeSdkMetadata;", "", "Lcom/braze/models/IPutIntoJson;", "", "forJsonPut", "jsonKey", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", k.M, Constants.BRAZE_PUSH_CONTENT_KEY, "ADJUST", "AIRBRIDGE", "APPSFLYER", "BLUEDOT", "BRANCH", "CORDOVA", "EXPO", "FACTUAL", "FOURSQUARE", "FLUTTER", "GRADLE", "GOOGLE", "GIMBAL", "IONIC", "KOCHAVA", "MANUAL", "MPARTICLE", "NPM", "NATIVESCRIPT", "NUGET", "PUB", "RADAR", "REACTNATIVE", "REACTNATIVENEWARCH", "SEGMENT", "SINGULAR", "SPM", "TEALIUM", "UNREAL", "UNITY_PACKAGE_MANAGER", "UNITY", "VIZBEE", "WEBCDN", "XAMARIN", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public enum BrazeSdkMetadata implements IPutIntoJson<String> {
    ADJUST("adj"),
    AIRBRIDGE("air"),
    APPSFLYER("apf"),
    BLUEDOT("blt"),
    BRANCH("brc"),
    CORDOVA("cdva"),
    EXPO("expo"),
    FACTUAL("fct"),
    FOURSQUARE("fsq"),
    FLUTTER("ft"),
    GRADLE("gd"),
    GOOGLE("gg"),
    GIMBAL("gmb"),
    IONIC("ionc"),
    KOCHAVA("kch"),
    MANUAL("manu"),
    MPARTICLE("mp"),
    NPM("npm"),
    NATIVESCRIPT("ns"),
    NUGET("nugt"),
    PUB("pub"),
    RADAR("rdr"),
    REACTNATIVE("rn"),
    REACTNATIVENEWARCH("rnna"),
    SEGMENT(M6.l1),
    SINGULAR("sng"),
    SPM("spm"),
    TEALIUM("tl"),
    UNREAL("un"),
    UNITY_PACKAGE_MANAGER("unpm"),
    UNITY("ut"),
    VIZBEE("vzb"),
    WEBCDN("wcd"),
    XAMARIN("xam");


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String jsonKey;

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/braze/enums/BrazeSdkMetadata$a;", "", "Ljava/util/EnumSet;", "Lcom/braze/enums/BrazeSdkMetadata;", "Lcom/braze/enums/MetadataTags;", "set", "Lorg/json/JSONArray;", Constants.BRAZE_PUSH_CONTENT_KEY, "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.braze.enums.BrazeSdkMetadata$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final JSONArray a(EnumSet<BrazeSdkMetadata> set) {
            Intrinsics.checkNotNullParameter(set, "set");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            for (BrazeSdkMetadata it : set) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                arrayList.add(it.jsonKey);
            }
            return new JSONArray((Collection) CollectionsKt.sorted(arrayList));
        }
    }

    BrazeSdkMetadata(String str) {
        this.jsonKey = str;
    }

    @JvmStatic
    public static final JSONArray toJsonArray(EnumSet<BrazeSdkMetadata> enumSet) {
        return INSTANCE.a(enumSet);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public String getJsonObject() {
        return this.jsonKey;
    }
}
