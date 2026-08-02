package ru.ozon.fintech.exchanger.datapass;

import B0.C2454a;
import B90.C2616s;
import Bk.C2638a;
import Ef0.c;
import G.g;
import N3.C3660k;
import Nh.a;
import T7.P;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u0000 o2\u00020\u0001:\u0001pB\u0083\u0003\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013\u0012\u0010\b\u0003\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u0012\u0010\b\u0003\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u0012\u0010\b\u0003\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u0012\u0010\b\u0003\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u0012\u0010\b\u0003\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0003\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010 \u0012\u0016\b\u0003\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"\u0018\u00010 ¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010'J\u0012\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b/\u0010-J\u0012\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b0\u0010-J\u0012\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b1\u0010-J\u0012\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b2\u0010-J\u0012\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b3\u0010-J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010'J\u0012\u00105\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b9\u00108J\u0018\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b:\u00108J\u0018\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b;\u00108J\u0018\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b<\u00108J\u0018\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b=\u00108J\u0012\u0010>\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b>\u0010-J\u0012\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b?\u0010-J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010'J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010'J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u0010'J\u001e\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010 HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u001e\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"\u0018\u00010 HÆ\u0003¢\u0006\u0004\bE\u0010DJ\u008c\u0003\u0010F\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00132\u0010\b\u0003\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u0010\b\u0003\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u0010\b\u0003\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u0010\b\u0003\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u0010\b\u0003\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00022\u0016\b\u0003\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010 2\u0016\b\u0003\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"\u0018\u00010 HÆ\u0001¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bH\u0010'J\u0010\u0010I\u001a\u00020\bHÖ\u0001¢\u0006\u0004\bI\u0010JJ\u001a\u0010M\u001a\u00020L2\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bM\u0010NR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010O\u001a\u0004\bP\u0010'R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010O\u001a\u0004\bQ\u0010'R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010O\u001a\u0004\bR\u0010'R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010O\u001a\u0004\bS\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010O\u001a\u0004\bT\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010U\u001a\u0004\bV\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010U\u001a\u0004\bW\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010U\u001a\u0004\bX\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010U\u001a\u0004\bY\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010U\u001a\u0004\bZ\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010U\u001a\u0004\b[\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010U\u001a\u0004\b\\\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\b]\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010^\u001a\u0004\b_\u00106R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010`\u001a\u0004\ba\u00108R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010`\u001a\u0004\bb\u00108R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0017\u0010`\u001a\u0004\bc\u00108R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u0010`\u001a\u0004\bd\u00108R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0019\u0010`\u001a\u0004\be\u00108R\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u001a\u0010`\u001a\u0004\bf\u00108R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010U\u001a\u0004\bg\u0010-R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010U\u001a\u0004\bh\u0010-R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010O\u001a\u0004\bi\u0010'R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010O\u001a\u0004\bj\u0010'R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010O\u001a\u0004\bk\u0010'R%\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010l\u001a\u0004\bm\u0010DR%\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b#\u0010l\u001a\u0004\bn\u0010D¨\u0006q"}, d2 = {"Lru/ozon/fintech/exchanger/datapass/ActionResult2;", "", "", "cbottomId", "widgetId", "type", "text", ImagesContract.URL, "", "framePos", "storyPos", "fromStory", "fromFrame", "toStory", "toFrame", "previousStoryPos", "subWidgetId", "", "duration", "", "widgetIds", "", "bottomLeft", "bottomRight", "topLeft", "topRight", RichContentDTO.ALIGN_CENTER, "zoom", "versionStamp", "composerActionBehavior", "composerActionLink", "composerActionId", "", "composerActionParams", "Lru/ozon/fintech/exchanger/datapass/ComposerTrackingInfo;", "composerTrackingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "()Ljava/lang/Long;", "component15", "()Ljava/util/List;", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "()Ljava/util/Map;", "component27", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/fintech/exchanger/datapass/ActionResult2;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCbottomId", "getWidgetId", "getType", "getText", "getUrl", "Ljava/lang/Integer;", "getFramePos", "getStoryPos", "getFromStory", "getFromFrame", "getToStory", "getToFrame", "getPreviousStoryPos", "getSubWidgetId", "Ljava/lang/Long;", "getDuration", "Ljava/util/List;", "getWidgetIds", "getBottomLeft", "getBottomRight", "getTopLeft", "getTopRight", "getCenter", "getZoom", "getVersionStamp", "getComposerActionBehavior", "getComposerActionLink", "getComposerActionId", "Ljava/util/Map;", "getComposerActionParams", "getComposerTrackingInfo", "Companion", "a", "fintech-exchanger_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ActionResult2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private final List<Double> bottomLeft;
    private final List<Double> bottomRight;

    @NotNull
    private final String cbottomId;
    private final List<Double> center;
    private final String composerActionBehavior;
    private final String composerActionId;
    private final String composerActionLink;
    private final Map<String, String> composerActionParams;
    private final Map<String, ComposerTrackingInfo> composerTrackingInfo;
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
    private final List<Double> topLeft;
    private final List<Double> topRight;

    @NotNull
    private final String type;
    private final String url;
    private final Integer versionStamp;
    private final String widgetId;
    private final List<String> widgetIds;
    private final Integer zoom;

    /* renamed from: ru.ozon.fintech.exchanger.datapass.ActionResult2$a, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public static String a(@NotNull String uuid) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            return "ActionResult2#" + uuid;
        }
    }

    public ActionResult2(@i(name = "cbottomId") @NotNull String cbottomId, @i(name = "widgetId") String str, @i(name = "type") @NotNull String type, @i(name = "text") String str2, @i(name = "url") String str3, @i(name = "framePos") Integer num, @i(name = "storyPos") Integer num2, @i(name = "fromStory") Integer num3, @i(name = "fromFrame") Integer num4, @i(name = "toStory") Integer num5, @i(name = "toFrame") Integer num6, @i(name = "previousStoryPos") Integer num7, @i(name = "subWidgetId") String str4, @i(name = "duration") Long l11, @i(name = "widgetIds") List<String> list, @i(name = "bottomLeft") List<Double> list2, @i(name = "bottomRight") List<Double> list3, @i(name = "topLeft") List<Double> list4, @i(name = "topRight") List<Double> list5, @i(name = "center") List<Double> list6, @i(name = "zoom") Integer num8, @i(name = "versionStamp") Integer num9, @i(name = "composerActionBehavior") String str5, @i(name = "composerActionLink") String str6, @i(name = "composerActionId") String str7, @i(name = "composerActionParams") Map<String, String> map, @i(name = "composerTrackingInfo") Map<String, ComposerTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(cbottomId, "cbottomId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.cbottomId = cbottomId;
        this.widgetId = str;
        this.type = type;
        this.text = str2;
        this.url = str3;
        this.framePos = num;
        this.storyPos = num2;
        this.fromStory = num3;
        this.fromFrame = num4;
        this.toStory = num5;
        this.toFrame = num6;
        this.previousStoryPos = num7;
        this.subWidgetId = str4;
        this.duration = l11;
        this.widgetIds = list;
        this.bottomLeft = list2;
        this.bottomRight = list3;
        this.topLeft = list4;
        this.topRight = list5;
        this.center = list6;
        this.zoom = num8;
        this.versionStamp = num9;
        this.composerActionBehavior = str5;
        this.composerActionLink = str6;
        this.composerActionId = str7;
        this.composerActionParams = map;
        this.composerTrackingInfo = map2;
    }

    public static /* synthetic */ ActionResult2 copy$default(ActionResult2 actionResult2, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str6, Long l11, List list, List list2, List list3, List list4, List list5, List list6, Integer num8, Integer num9, String str7, String str8, String str9, Map map, Map map2, int i11, Object obj) {
        Map map3;
        Map map4;
        String str10 = (i11 & 1) != 0 ? actionResult2.cbottomId : str;
        String str11 = (i11 & 2) != 0 ? actionResult2.widgetId : str2;
        String str12 = (i11 & 4) != 0 ? actionResult2.type : str3;
        String str13 = (i11 & 8) != 0 ? actionResult2.text : str4;
        String str14 = (i11 & 16) != 0 ? actionResult2.url : str5;
        Integer num10 = (i11 & 32) != 0 ? actionResult2.framePos : num;
        Integer num11 = (i11 & 64) != 0 ? actionResult2.storyPos : num2;
        Integer num12 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? actionResult2.fromStory : num3;
        Integer num13 = (i11 & 256) != 0 ? actionResult2.fromFrame : num4;
        Integer num14 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? actionResult2.toStory : num5;
        Integer num15 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? actionResult2.toFrame : num6;
        Integer num16 = (i11 & 2048) != 0 ? actionResult2.previousStoryPos : num7;
        String str15 = (i11 & 4096) != 0 ? actionResult2.subWidgetId : str6;
        Long l12 = (i11 & 8192) != 0 ? actionResult2.duration : l11;
        String str16 = str10;
        List list7 = (i11 & 16384) != 0 ? actionResult2.widgetIds : list;
        List list8 = (i11 & 32768) != 0 ? actionResult2.bottomLeft : list2;
        List list9 = (i11 & 65536) != 0 ? actionResult2.bottomRight : list3;
        List list10 = (i11 & 131072) != 0 ? actionResult2.topLeft : list4;
        List list11 = (i11 & 262144) != 0 ? actionResult2.topRight : list5;
        List list12 = (i11 & 524288) != 0 ? actionResult2.center : list6;
        Integer num17 = (i11 & 1048576) != 0 ? actionResult2.zoom : num8;
        Integer num18 = (i11 & 2097152) != 0 ? actionResult2.versionStamp : num9;
        String str17 = (i11 & 4194304) != 0 ? actionResult2.composerActionBehavior : str7;
        String str18 = (i11 & 8388608) != 0 ? actionResult2.composerActionLink : str8;
        String str19 = (i11 & 16777216) != 0 ? actionResult2.composerActionId : str9;
        Map map5 = (i11 & 33554432) != 0 ? actionResult2.composerActionParams : map;
        if ((i11 & 67108864) != 0) {
            map4 = map5;
            map3 = actionResult2.composerTrackingInfo;
        } else {
            map3 = map2;
            map4 = map5;
        }
        return actionResult2.copy(str16, str11, str12, str13, str14, num10, num11, num12, num13, num14, num15, num16, str15, l12, list7, list8, list9, list10, list11, list12, num17, num18, str17, str18, str19, map4, map3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCbottomId() {
        return this.cbottomId;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getToStory() {
        return this.toStory;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getToFrame() {
        return this.toFrame;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getPreviousStoryPos() {
        return this.previousStoryPos;
    }

    /* renamed from: component13, reason: from getter */
    public final String getSubWidgetId() {
        return this.subWidgetId;
    }

    /* renamed from: component14, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    public final List<String> component15() {
        return this.widgetIds;
    }

    public final List<Double> component16() {
        return this.bottomLeft;
    }

    public final List<Double> component17() {
        return this.bottomRight;
    }

    public final List<Double> component18() {
        return this.topLeft;
    }

    public final List<Double> component19() {
        return this.topRight;
    }

    /* renamed from: component2, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    public final List<Double> component20() {
        return this.center;
    }

    /* renamed from: component21, reason: from getter */
    public final Integer getZoom() {
        return this.zoom;
    }

    /* renamed from: component22, reason: from getter */
    public final Integer getVersionStamp() {
        return this.versionStamp;
    }

    /* renamed from: component23, reason: from getter */
    public final String getComposerActionBehavior() {
        return this.composerActionBehavior;
    }

    /* renamed from: component24, reason: from getter */
    public final String getComposerActionLink() {
        return this.composerActionLink;
    }

    /* renamed from: component25, reason: from getter */
    public final String getComposerActionId() {
        return this.composerActionId;
    }

    public final Map<String, String> component26() {
        return this.composerActionParams;
    }

    public final Map<String, ComposerTrackingInfo> component27() {
        return this.composerTrackingInfo;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getFramePos() {
        return this.framePos;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getStoryPos() {
        return this.storyPos;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getFromStory() {
        return this.fromStory;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getFromFrame() {
        return this.fromFrame;
    }

    @NotNull
    public final ActionResult2 copy(@i(name = "cbottomId") @NotNull String cbottomId, @i(name = "widgetId") String widgetId, @i(name = "type") @NotNull String type, @i(name = "text") String text, @i(name = "url") String url, @i(name = "framePos") Integer framePos, @i(name = "storyPos") Integer storyPos, @i(name = "fromStory") Integer fromStory, @i(name = "fromFrame") Integer fromFrame, @i(name = "toStory") Integer toStory, @i(name = "toFrame") Integer toFrame, @i(name = "previousStoryPos") Integer previousStoryPos, @i(name = "subWidgetId") String subWidgetId, @i(name = "duration") Long duration, @i(name = "widgetIds") List<String> widgetIds, @i(name = "bottomLeft") List<Double> bottomLeft, @i(name = "bottomRight") List<Double> bottomRight, @i(name = "topLeft") List<Double> topLeft, @i(name = "topRight") List<Double> topRight, @i(name = "center") List<Double> center, @i(name = "zoom") Integer zoom, @i(name = "versionStamp") Integer versionStamp, @i(name = "composerActionBehavior") String composerActionBehavior, @i(name = "composerActionLink") String composerActionLink, @i(name = "composerActionId") String composerActionId, @i(name = "composerActionParams") Map<String, String> composerActionParams, @i(name = "composerTrackingInfo") Map<String, ComposerTrackingInfo> composerTrackingInfo) {
        Intrinsics.checkNotNullParameter(cbottomId, "cbottomId");
        Intrinsics.checkNotNullParameter(type, "type");
        return new ActionResult2(cbottomId, widgetId, type, text, url, framePos, storyPos, fromStory, fromFrame, toStory, toFrame, previousStoryPos, subWidgetId, duration, widgetIds, bottomLeft, bottomRight, topLeft, topRight, center, zoom, versionStamp, composerActionBehavior, composerActionLink, composerActionId, composerActionParams, composerTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionResult2)) {
            return false;
        }
        ActionResult2 actionResult2 = (ActionResult2) other;
        return Intrinsics.d(this.cbottomId, actionResult2.cbottomId) && Intrinsics.d(this.widgetId, actionResult2.widgetId) && Intrinsics.d(this.type, actionResult2.type) && Intrinsics.d(this.text, actionResult2.text) && Intrinsics.d(this.url, actionResult2.url) && Intrinsics.d(this.framePos, actionResult2.framePos) && Intrinsics.d(this.storyPos, actionResult2.storyPos) && Intrinsics.d(this.fromStory, actionResult2.fromStory) && Intrinsics.d(this.fromFrame, actionResult2.fromFrame) && Intrinsics.d(this.toStory, actionResult2.toStory) && Intrinsics.d(this.toFrame, actionResult2.toFrame) && Intrinsics.d(this.previousStoryPos, actionResult2.previousStoryPos) && Intrinsics.d(this.subWidgetId, actionResult2.subWidgetId) && Intrinsics.d(this.duration, actionResult2.duration) && Intrinsics.d(this.widgetIds, actionResult2.widgetIds) && Intrinsics.d(this.bottomLeft, actionResult2.bottomLeft) && Intrinsics.d(this.bottomRight, actionResult2.bottomRight) && Intrinsics.d(this.topLeft, actionResult2.topLeft) && Intrinsics.d(this.topRight, actionResult2.topRight) && Intrinsics.d(this.center, actionResult2.center) && Intrinsics.d(this.zoom, actionResult2.zoom) && Intrinsics.d(this.versionStamp, actionResult2.versionStamp) && Intrinsics.d(this.composerActionBehavior, actionResult2.composerActionBehavior) && Intrinsics.d(this.composerActionLink, actionResult2.composerActionLink) && Intrinsics.d(this.composerActionId, actionResult2.composerActionId) && Intrinsics.d(this.composerActionParams, actionResult2.composerActionParams) && Intrinsics.d(this.composerTrackingInfo, actionResult2.composerTrackingInfo);
    }

    public final List<Double> getBottomLeft() {
        return this.bottomLeft;
    }

    public final List<Double> getBottomRight() {
        return this.bottomRight;
    }

    @NotNull
    public final String getCbottomId() {
        return this.cbottomId;
    }

    public final List<Double> getCenter() {
        return this.center;
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

    public final Map<String, ComposerTrackingInfo> getComposerTrackingInfo() {
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

    public final List<Double> getTopLeft() {
        return this.topLeft;
    }

    public final List<Double> getTopRight() {
        return this.topRight;
    }

    @NotNull
    public final String getType() {
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

    public final Integer getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        int hashCode = this.cbottomId.hashCode() * 31;
        String str = this.widgetId;
        int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.type);
        String str2 = this.text;
        int hashCode2 = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.framePos;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.storyPos;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.fromStory;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.fromFrame;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.toStory;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.toFrame;
        int hashCode9 = (hashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.previousStoryPos;
        int hashCode10 = (hashCode9 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str4 = this.subWidgetId;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l11 = this.duration;
        int hashCode12 = (hashCode11 + (l11 == null ? 0 : l11.hashCode())) * 31;
        List<String> list = this.widgetIds;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        List<Double> list2 = this.bottomLeft;
        int hashCode14 = (hashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Double> list3 = this.bottomRight;
        int hashCode15 = (hashCode14 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Double> list4 = this.topLeft;
        int hashCode16 = (hashCode15 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<Double> list5 = this.topRight;
        int hashCode17 = (hashCode16 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<Double> list6 = this.center;
        int hashCode18 = (hashCode17 + (list6 == null ? 0 : list6.hashCode())) * 31;
        Integer num8 = this.zoom;
        int hashCode19 = (hashCode18 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.versionStamp;
        int hashCode20 = (hashCode19 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str5 = this.composerActionBehavior;
        int hashCode21 = (hashCode20 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.composerActionLink;
        int hashCode22 = (hashCode21 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.composerActionId;
        int hashCode23 = (hashCode22 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, String> map = this.composerActionParams;
        int hashCode24 = (hashCode23 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, ComposerTrackingInfo> map2 = this.composerTrackingInfo;
        return hashCode24 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.cbottomId;
        String str2 = this.widgetId;
        String str3 = this.type;
        String str4 = this.text;
        String str5 = this.url;
        Integer num = this.framePos;
        Integer num2 = this.storyPos;
        Integer num3 = this.fromStory;
        Integer num4 = this.fromFrame;
        Integer num5 = this.toStory;
        Integer num6 = this.toFrame;
        Integer num7 = this.previousStoryPos;
        String str6 = this.subWidgetId;
        Long l11 = this.duration;
        List<String> list = this.widgetIds;
        List<Double> list2 = this.bottomLeft;
        List<Double> list3 = this.bottomRight;
        List<Double> list4 = this.topLeft;
        List<Double> list5 = this.topRight;
        List<Double> list6 = this.center;
        Integer num8 = this.zoom;
        Integer num9 = this.versionStamp;
        String str7 = this.composerActionBehavior;
        String str8 = this.composerActionLink;
        String str9 = this.composerActionId;
        Map<String, String> map = this.composerActionParams;
        Map<String, ComposerTrackingInfo> map2 = this.composerTrackingInfo;
        StringBuilder d11 = C3660k.d("ActionResult2(cbottomId=", str, ", widgetId=", str2, ", type=");
        a.h(d11, str3, ", text=", str4, ", url=");
        C2454a.f(num, str5, ", framePos=", ", storyPos=", d11);
        c.e(d11, num2, ", fromStory=", num3, ", fromFrame=");
        c.e(d11, num4, ", toStory=", num5, ", toFrame=");
        c.e(d11, num6, ", previousStoryPos=", num7, ", subWidgetId=");
        d11.append(str6);
        d11.append(", duration=");
        d11.append(l11);
        d11.append(", widgetIds=");
        C2616s.g(", bottomLeft=", ", bottomRight=", d11, list, list2);
        C2616s.g(", topLeft=", ", topRight=", d11, list3, list4);
        C2616s.g(", center=", ", zoom=", d11, list5, list6);
        c.e(d11, num8, ", versionStamp=", num9, ", composerActionBehavior=");
        a.h(d11, str7, ", composerActionLink=", str8, ", composerActionId=");
        C2638a.e(d11, str9, ", composerActionParams=", map, ", composerTrackingInfo=");
        return P.f(d11, map2, ")");
    }

    public /* synthetic */ ActionResult2(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str6, Long l11, List list, List list2, List list3, List list4, List list5, List list6, Integer num8, Integer num9, String str7, String str8, String str9, Map map, Map map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, num, num2, num3, num4, num5, num6, num7, str6, (i11 & 8192) != 0 ? null : l11, (i11 & 16384) != 0 ? null : list, (32768 & i11) != 0 ? null : list2, (65536 & i11) != 0 ? null : list3, (131072 & i11) != 0 ? null : list4, (262144 & i11) != 0 ? null : list5, (524288 & i11) != 0 ? null : list6, (1048576 & i11) != 0 ? null : num8, (2097152 & i11) != 0 ? null : num9, (4194304 & i11) != 0 ? null : str7, (8388608 & i11) != 0 ? null : str8, (16777216 & i11) != 0 ? null : str9, (33554432 & i11) != 0 ? null : map, (i11 & 67108864) != 0 ? null : map2);
    }
}
