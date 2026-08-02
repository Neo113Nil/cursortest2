package bo.app;

import com.braze.Constants;
import com.braze.models.IPutIntoJson;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b(\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0004\u001a\u00020\u0003H\u0016j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006+"}, d2 = {"Lbo/app/e1;", "", "Lcom/braze/models/IPutIntoJson;", "", "w", "jsonKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", Constants.BRAZE_PUSH_CONTENT_KEY, "LOCATION_RECORDED", "CUSTOM_EVENT", ViewHierarchyConstants.PURCHASE, "PUSH_STORY_PAGE_CLICK", "PUSH_CLICKED", "PUSH_ACTION_BUTTON_CLICKED", "INTERNAL", "INTERNAL_ERROR", "NEWS_FEED_CARD_IMPRESSION", "NEWS_FEED_CARD_CLICK", "GEOFENCE", "CONTENT_CARDS_CLICK", "CONTENT_CARDS_IMPRESSION", "CONTENT_CARDS_CONTROL_IMPRESSION", "CONTENT_CARDS_DISMISS", "INCREMENT", "ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", "REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", "SET_CUSTOM_ATTRIBUTE_ARRAY", "INAPP_MESSAGE_IMPRESSION", "INAPP_MESSAGE_CONTROL_IMPRESSION", "INAPP_MESSAGE_CLICK", "INAPP_MESSAGE_BUTTON_CLICK", "INAPP_MESSAGE_DISPLAY_FAILURE", "USER_ALIAS", "SESSION_START", "SESSION_END", "TEST_TYPE", "LOCATION_CUSTOM_ATTRIBUTE_ADD", "LOCATION_CUSTOM_ATTRIBUTE_REMOVE", "NESTED_CUSTOM_ATTRIBUTE_MERGE", "SUBSCRIPTION_GROUP_UPDATE", "PUSH_DELIVERY_EVENT", "UNKNOWN", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public enum e1 implements IPutIntoJson<String> {
    LOCATION_RECORDED("lr"),
    CUSTOM_EVENT("ce"),
    PURCHASE("p"),
    PUSH_STORY_PAGE_CLICK("cic"),
    PUSH_CLICKED("pc"),
    PUSH_ACTION_BUTTON_CLICKED("ca"),
    INTERNAL("i"),
    INTERNAL_ERROR("ie"),
    NEWS_FEED_CARD_IMPRESSION("ci"),
    NEWS_FEED_CARD_CLICK("cc"),
    GEOFENCE("g"),
    CONTENT_CARDS_CLICK("ccc"),
    CONTENT_CARDS_IMPRESSION("cci"),
    CONTENT_CARDS_CONTROL_IMPRESSION("ccic"),
    CONTENT_CARDS_DISMISS("ccd"),
    INCREMENT("inc"),
    ADD_TO_CUSTOM_ATTRIBUTE_ARRAY(com.safedk.android.analytics.brandsafety.m.l),
    REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY("rem"),
    SET_CUSTOM_ATTRIBUTE_ARRAY("set"),
    INAPP_MESSAGE_IMPRESSION("si"),
    INAPP_MESSAGE_CONTROL_IMPRESSION("iec"),
    INAPP_MESSAGE_CLICK("sc"),
    INAPP_MESSAGE_BUTTON_CLICK("sbc"),
    INAPP_MESSAGE_DISPLAY_FAILURE("sfe"),
    USER_ALIAS("uae"),
    SESSION_START("ss"),
    SESSION_END("se"),
    TEST_TYPE(TtmlNode.TAG_TT),
    LOCATION_CUSTOM_ATTRIBUTE_ADD("lcaa"),
    LOCATION_CUSTOM_ATTRIBUTE_REMOVE("lcar"),
    NESTED_CUSTOM_ATTRIBUTE_MERGE("ncam"),
    SUBSCRIPTION_GROUP_UPDATE("sgu"),
    PUSH_DELIVERY_EVENT("pde"),
    UNKNOWN("");

    public static final a c = new a(null);
    private static final Map<String, e1> d;
    private final String b;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lbo/app/e1$a;", "", "", "value", "Lbo/app/e1;", Constants.BRAZE_PUSH_CONTENT_KEY, "", "map", "Ljava/util/Map;", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final e1 a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Object obj = e1.d.get(value);
            if (obj == null) {
                obj = e1.UNKNOWN;
            }
            return (e1) obj;
        }
    }

    static {
        int i = 0;
        e1[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
        int length = values.length;
        while (i < length) {
            e1 e1Var = values[i];
            i++;
            linkedHashMap.put(e1Var.b, e1Var);
        }
        d = linkedHashMap;
    }

    e1(String str) {
        this.b = str;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: w, reason: from getter and merged with bridge method [inline-methods] */
    public String getJsonKey() {
        return this.b;
    }
}
