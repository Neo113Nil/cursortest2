package ru.ozon.fintech.ui;

import Bk.C2638a;
import Ef0.c;
import N3.C3660k;
import T7.P;
import Xc.a;
import Xc.b;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b8\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 Y2\u00020\u0001:\u0002XYB\u0097\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b\u0012\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010C\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010D\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010E\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010F\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010G\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010H\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010I\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u00101J\u0010\u0010J\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010(J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0016HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010O\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001bHÆ\u0003J\u0017\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001bHÆ\u0003J¤\u0002\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b2\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001bHÆ\u0001¢\u0006\u0002\u0010RJ\u0013\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020\u000bHÖ\u0001J\t\u0010W\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010)\u001a\u0004\b*\u0010(R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010)\u001a\u0004\b+\u0010(R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010)\u001a\u0004\b,\u0010(R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010)\u001a\u0004\b-\u0010(R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010)\u001a\u0004\b.\u0010(R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010)\u001a\u0004\b/\u0010(R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010)\u001a\u0004\b3\u0010(R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u001f\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u001f\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:¨\u0006Z"}, d2 = {"Lru/ozon/fintech/ui/ActionResult2UI;", "", "cbottomId", "", "widgetId", "type", "Lru/ozon/fintech/ui/ActionResult2UI$Type;", "subWidgetId", "text", ImagesContract.URL, "framePos", "", "storyPos", "fromStory", "fromFrame", "toStory", "toFrame", "previousStoryPos", "duration", "", "versionStamp", "widgetIds", "", "composerActionBehavior", "composerActionLink", "composerActionId", "composerActionParams", "", "composerTrackingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/ActionResult2UI$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "getCbottomId", "()Ljava/lang/String;", "getWidgetId", "getType", "()Lru/ozon/fintech/ui/ActionResult2UI$Type;", "getSubWidgetId", "getText", "getUrl", "getFramePos", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStoryPos", "getFromStory", "getFromFrame", "getToStory", "getToFrame", "getPreviousStoryPos", "getDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getVersionStamp", "getWidgetIds", "()Ljava/util/List;", "getComposerActionBehavior", "getComposerActionLink", "getComposerActionId", "getComposerActionParams", "()Ljava/util/Map;", "getComposerTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/ActionResult2UI$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/fintech/ui/ActionResult2UI;", "equals", "", "other", "hashCode", "toString", "Type", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ActionResult2UI {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String cbottomId;
    private final String composerActionBehavior;
    private final String composerActionId;
    private final String composerActionLink;
    private final Map<String, String> composerActionParams;
    private final Map<String, Object> composerTrackingInfo;
    private final Long duration;
    private final Integer framePos;
    private final Integer fromFrame;
    private final Integer fromStory;
    private final Integer previousStoryPos;
    private final Integer storyPos;
    private final String subWidgetId;
    private final String text;
    private final Integer toFrame;
    private final Integer toStory;

    @NotNull
    private final Type type;
    private final String url;
    private final Integer versionStamp;
    private final String widgetId;
    private final List<String> widgetIds;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/fintech/ui/ActionResult2UI$Companion;", "", "<init>", "()V", "dismissed", "Lru/ozon/fintech/ui/ActionResult2UI;", "cbottomId", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionResult2UI dismissed(@NotNull String cbottomId) {
            Intrinsics.checkNotNullParameter(cbottomId, "cbottomId");
            return new ActionResult2UI(cbottomId, null, Type.DISMISSED, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097144, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/ui/ActionResult2UI$Type;", "", "<init>", "(Ljava/lang/String;I)V", "CLICK", "TEXT_CHANGED", "URL_CLICK", "DISMISSED", "NAVIGATE", "BACK", "SELECTED", "PREV_STORY", "NEXT_STORY", "TAP_NEXT", "TAP_PREV", "TIME_VIEWED", "MAP_DID_UPDATE_CAMERA", "SHARE_FIRE_ERROR", "LIST_CHANGED", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CLICK = new Type("CLICK", 0);
        public static final Type TEXT_CHANGED = new Type("TEXT_CHANGED", 1);
        public static final Type URL_CLICK = new Type("URL_CLICK", 2);
        public static final Type DISMISSED = new Type("DISMISSED", 3);
        public static final Type NAVIGATE = new Type("NAVIGATE", 4);
        public static final Type BACK = new Type("BACK", 5);
        public static final Type SELECTED = new Type("SELECTED", 6);
        public static final Type PREV_STORY = new Type("PREV_STORY", 7);
        public static final Type NEXT_STORY = new Type("NEXT_STORY", 8);
        public static final Type TAP_NEXT = new Type("TAP_NEXT", 9);
        public static final Type TAP_PREV = new Type("TAP_PREV", 10);
        public static final Type TIME_VIEWED = new Type("TIME_VIEWED", 11);
        public static final Type MAP_DID_UPDATE_CAMERA = new Type("MAP_DID_UPDATE_CAMERA", 12);
        public static final Type SHARE_FIRE_ERROR = new Type("SHARE_FIRE_ERROR", 13);
        public static final Type LIST_CHANGED = new Type("LIST_CHANGED", 14);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{CLICK, TEXT_CHANGED, URL_CLICK, DISMISSED, NAVIGATE, BACK, SELECTED, PREV_STORY, NEXT_STORY, TAP_NEXT, TAP_PREV, TIME_VIEWED, MAP_DID_UPDATE_CAMERA, SHARE_FIRE_ERROR, LIST_CHANGED};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i11) {
        }

        @NotNull
        public static a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public ActionResult2UI(@NotNull String cbottomId, String str, @NotNull Type type, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Long l11, Integer num8, List<String> list, String str5, String str6, String str7, Map<String, String> map, Map<String, ? extends Object> map2) {
        Intrinsics.checkNotNullParameter(cbottomId, "cbottomId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.cbottomId = cbottomId;
        this.widgetId = str;
        this.type = type;
        this.subWidgetId = str2;
        this.text = str3;
        this.url = str4;
        this.framePos = num;
        this.storyPos = num2;
        this.fromStory = num3;
        this.fromFrame = num4;
        this.toStory = num5;
        this.toFrame = num6;
        this.previousStoryPos = num7;
        this.duration = l11;
        this.versionStamp = num8;
        this.widgetIds = list;
        this.composerActionBehavior = str5;
        this.composerActionLink = str6;
        this.composerActionId = str7;
        this.composerActionParams = map;
        this.composerTrackingInfo = map2;
    }

    public static /* synthetic */ ActionResult2UI copy$default(ActionResult2UI actionResult2UI, String str, String str2, Type type, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Long l11, Integer num8, List list, String str6, String str7, String str8, Map map, Map map2, int i11, Object obj) {
        Map map3;
        Map map4;
        String str9 = (i11 & 1) != 0 ? actionResult2UI.cbottomId : str;
        String str10 = (i11 & 2) != 0 ? actionResult2UI.widgetId : str2;
        Type type2 = (i11 & 4) != 0 ? actionResult2UI.type : type;
        String str11 = (i11 & 8) != 0 ? actionResult2UI.subWidgetId : str3;
        String str12 = (i11 & 16) != 0 ? actionResult2UI.text : str4;
        String str13 = (i11 & 32) != 0 ? actionResult2UI.url : str5;
        Integer num9 = (i11 & 64) != 0 ? actionResult2UI.framePos : num;
        Integer num10 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? actionResult2UI.storyPos : num2;
        Integer num11 = (i11 & 256) != 0 ? actionResult2UI.fromStory : num3;
        Integer num12 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? actionResult2UI.fromFrame : num4;
        Integer num13 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? actionResult2UI.toStory : num5;
        Integer num14 = (i11 & 2048) != 0 ? actionResult2UI.toFrame : num6;
        Integer num15 = (i11 & 4096) != 0 ? actionResult2UI.previousStoryPos : num7;
        Long l12 = (i11 & 8192) != 0 ? actionResult2UI.duration : l11;
        String str14 = str9;
        Integer num16 = (i11 & 16384) != 0 ? actionResult2UI.versionStamp : num8;
        List list2 = (i11 & 32768) != 0 ? actionResult2UI.widgetIds : list;
        String str15 = (i11 & 65536) != 0 ? actionResult2UI.composerActionBehavior : str6;
        String str16 = (i11 & 131072) != 0 ? actionResult2UI.composerActionLink : str7;
        String str17 = (i11 & 262144) != 0 ? actionResult2UI.composerActionId : str8;
        Map map5 = (i11 & 524288) != 0 ? actionResult2UI.composerActionParams : map;
        if ((i11 & 1048576) != 0) {
            map4 = map5;
            map3 = actionResult2UI.composerTrackingInfo;
        } else {
            map3 = map2;
            map4 = map5;
        }
        return actionResult2UI.copy(str14, str10, type2, str11, str12, str13, num9, num10, num11, num12, num13, num14, num15, l12, num16, list2, str15, str16, str17, map4, map3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCbottomId() {
        return this.cbottomId;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getFromFrame() {
        return this.fromFrame;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getToStory() {
        return this.toStory;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getToFrame() {
        return this.toFrame;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getPreviousStoryPos() {
        return this.previousStoryPos;
    }

    /* renamed from: component14, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    /* renamed from: component15, reason: from getter */
    public final Integer getVersionStamp() {
        return this.versionStamp;
    }

    public final List<String> component16() {
        return this.widgetIds;
    }

    /* renamed from: component17, reason: from getter */
    public final String getComposerActionBehavior() {
        return this.composerActionBehavior;
    }

    /* renamed from: component18, reason: from getter */
    public final String getComposerActionLink() {
        return this.composerActionLink;
    }

    /* renamed from: component19, reason: from getter */
    public final String getComposerActionId() {
        return this.composerActionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    public final Map<String, String> component20() {
        return this.composerActionParams;
    }

    public final Map<String, Object> component21() {
        return this.composerTrackingInfo;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubWidgetId() {
        return this.subWidgetId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getFramePos() {
        return this.framePos;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getStoryPos() {
        return this.storyPos;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getFromStory() {
        return this.fromStory;
    }

    @NotNull
    public final ActionResult2UI copy(@NotNull String cbottomId, String widgetId, @NotNull Type type, String subWidgetId, String text, String url, Integer framePos, Integer storyPos, Integer fromStory, Integer fromFrame, Integer toStory, Integer toFrame, Integer previousStoryPos, Long duration, Integer versionStamp, List<String> widgetIds, String composerActionBehavior, String composerActionLink, String composerActionId, Map<String, String> composerActionParams, Map<String, ? extends Object> composerTrackingInfo) {
        Intrinsics.checkNotNullParameter(cbottomId, "cbottomId");
        Intrinsics.checkNotNullParameter(type, "type");
        return new ActionResult2UI(cbottomId, widgetId, type, subWidgetId, text, url, framePos, storyPos, fromStory, fromFrame, toStory, toFrame, previousStoryPos, duration, versionStamp, widgetIds, composerActionBehavior, composerActionLink, composerActionId, composerActionParams, composerTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionResult2UI)) {
            return false;
        }
        ActionResult2UI actionResult2UI = (ActionResult2UI) other;
        return Intrinsics.d(this.cbottomId, actionResult2UI.cbottomId) && Intrinsics.d(this.widgetId, actionResult2UI.widgetId) && this.type == actionResult2UI.type && Intrinsics.d(this.subWidgetId, actionResult2UI.subWidgetId) && Intrinsics.d(this.text, actionResult2UI.text) && Intrinsics.d(this.url, actionResult2UI.url) && Intrinsics.d(this.framePos, actionResult2UI.framePos) && Intrinsics.d(this.storyPos, actionResult2UI.storyPos) && Intrinsics.d(this.fromStory, actionResult2UI.fromStory) && Intrinsics.d(this.fromFrame, actionResult2UI.fromFrame) && Intrinsics.d(this.toStory, actionResult2UI.toStory) && Intrinsics.d(this.toFrame, actionResult2UI.toFrame) && Intrinsics.d(this.previousStoryPos, actionResult2UI.previousStoryPos) && Intrinsics.d(this.duration, actionResult2UI.duration) && Intrinsics.d(this.versionStamp, actionResult2UI.versionStamp) && Intrinsics.d(this.widgetIds, actionResult2UI.widgetIds) && Intrinsics.d(this.composerActionBehavior, actionResult2UI.composerActionBehavior) && Intrinsics.d(this.composerActionLink, actionResult2UI.composerActionLink) && Intrinsics.d(this.composerActionId, actionResult2UI.composerActionId) && Intrinsics.d(this.composerActionParams, actionResult2UI.composerActionParams) && Intrinsics.d(this.composerTrackingInfo, actionResult2UI.composerTrackingInfo);
    }

    @NotNull
    public final String getCbottomId() {
        return this.cbottomId;
    }

    public final String getComposerActionBehavior() {
        return this.composerActionBehavior;
    }

    public final String getComposerActionId() {
        return this.composerActionId;
    }

    public final String getComposerActionLink() {
        return this.composerActionLink;
    }

    public final Map<String, String> getComposerActionParams() {
        return this.composerActionParams;
    }

    public final Map<String, Object> getComposerTrackingInfo() {
        return this.composerTrackingInfo;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final Integer getFramePos() {
        return this.framePos;
    }

    public final Integer getFromFrame() {
        return this.fromFrame;
    }

    public final Integer getFromStory() {
        return this.fromStory;
    }

    public final Integer getPreviousStoryPos() {
        return this.previousStoryPos;
    }

    public final Integer getStoryPos() {
        return this.storyPos;
    }

    public final String getSubWidgetId() {
        return this.subWidgetId;
    }

    public final String getText() {
        return this.text;
    }

    public final Integer getToFrame() {
        return this.toFrame;
    }

    public final Integer getToStory() {
        return this.toStory;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Integer getVersionStamp() {
        return this.versionStamp;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public final List<String> getWidgetIds() {
        return this.widgetIds;
    }

    public int hashCode() {
        int hashCode = this.cbottomId.hashCode() * 31;
        String str = this.widgetId;
        int hashCode2 = (this.type.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.subWidgetId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.framePos;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.storyPos;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.fromStory;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.fromFrame;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.toStory;
        int hashCode10 = (hashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.toFrame;
        int hashCode11 = (hashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.previousStoryPos;
        int hashCode12 = (hashCode11 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Long l11 = this.duration;
        int hashCode13 = (hashCode12 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num8 = this.versionStamp;
        int hashCode14 = (hashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
        List<String> list = this.widgetIds;
        int hashCode15 = (hashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.composerActionBehavior;
        int hashCode16 = (hashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.composerActionLink;
        int hashCode17 = (hashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.composerActionId;
        int hashCode18 = (hashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, String> map = this.composerActionParams;
        int hashCode19 = (hashCode18 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Object> map2 = this.composerTrackingInfo;
        return hashCode19 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.cbottomId;
        String str2 = this.widgetId;
        Type type = this.type;
        String str3 = this.subWidgetId;
        String str4 = this.text;
        String str5 = this.url;
        Integer num = this.framePos;
        Integer num2 = this.storyPos;
        Integer num3 = this.fromStory;
        Integer num4 = this.fromFrame;
        Integer num5 = this.toStory;
        Integer num6 = this.toFrame;
        Integer num7 = this.previousStoryPos;
        Long l11 = this.duration;
        Integer num8 = this.versionStamp;
        List<String> list = this.widgetIds;
        String str6 = this.composerActionBehavior;
        String str7 = this.composerActionLink;
        String str8 = this.composerActionId;
        Map<String, String> map = this.composerActionParams;
        Map<String, Object> map2 = this.composerTrackingInfo;
        StringBuilder d11 = C3660k.d("ActionResult2UI(cbottomId=", str, ", widgetId=", str2, ", type=");
        d11.append(type);
        d11.append(", subWidgetId=");
        d11.append(str3);
        d11.append(", text=");
        Nh.a.h(d11, str4, ", url=", str5, ", framePos=");
        c.e(d11, num, ", storyPos=", num2, ", fromStory=");
        c.e(d11, num3, ", fromFrame=", num4, ", toStory=");
        c.e(d11, num5, ", toFrame=", num6, ", previousStoryPos=");
        d11.append(num7);
        d11.append(", duration=");
        d11.append(l11);
        d11.append(", versionStamp=");
        d11.append(num8);
        d11.append(", widgetIds=");
        d11.append(list);
        d11.append(", composerActionBehavior=");
        Nh.a.h(d11, str6, ", composerActionLink=", str7, ", composerActionId=");
        C2638a.e(d11, str8, ", composerActionParams=", map, ", composerTrackingInfo=");
        return P.f(d11, map2, ")");
    }

    public /* synthetic */ ActionResult2UI(String str, String str2, Type type, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Long l11, Integer num8, List list, String str6, String str7, String str8, Map map, Map map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, type, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : num, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : num2, (i11 & 256) != 0 ? null : num3, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num4, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : num5, (i11 & 2048) != 0 ? null : num6, (i11 & 4096) != 0 ? null : num7, (i11 & 8192) != 0 ? null : l11, (i11 & 16384) != 0 ? null : num8, (32768 & i11) != 0 ? null : list, (65536 & i11) != 0 ? null : str6, (131072 & i11) != 0 ? null : str7, (262144 & i11) != 0 ? null : str8, (524288 & i11) != 0 ? null : map, (i11 & 1048576) != 0 ? null : map2);
    }
}
