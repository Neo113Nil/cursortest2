package ru.ozon.uni.atoms.parsing.adapter;

import Sc.o;
import Y9.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.extensions.ExtensionsKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\b\u0001\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cRh\u0010\u001f\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b \u001e*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u001d0\u001d \u001e**\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b \u001e*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u001d0\u001d\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/uni/atoms/parsing/adapter/ActionAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/x;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "nameAndValue", "(Lcom/squareup/moshi/x;Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/AtomActionDTO$Behavior;", ActionAdapter.FIELD_BEHAVIOR, "id", "mapActionBehaviorToAtomConstant", "(Lru/ozon/uni/atoms/data/AtomActionDTO$Behavior;Ljava/lang/String;)Ljava/lang/String;", "behaviorValue", "mapAtomConstantToActionBehavior", "(Ljava/lang/String;Ljava/lang/String;)Lru/ozon/uni/atoms/data/AtomActionDTO$Behavior;", "writer", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/AtomActionDTO;", "", "kotlin.jvm.PlatformType", "mapAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ActionAdapter extends JsonAdapter<AtomActionDTO> {

    @NotNull
    public static final String BEHAVIOR_TYPE_ACTION_SHEET = "BEHAVIOR_TYPE_ACTION_SHEET";

    @NotNull
    public static final String BEHAVIOR_TYPE_COMPOSER_ACTION = "BEHAVIOR_TYPE_COMPOSER_ACTION";

    @NotNull
    public static final String BEHAVIOR_TYPE_COMPOSER_NESTED_PAGE = "BEHAVIOR_TYPE_COMPOSER_NESTED_PAGE";

    @NotNull
    public static final String BEHAVIOR_TYPE_CUSTOM = "BEHAVIOR_TYPE_CUSTOM";

    @NotNull
    public static final String BEHAVIOR_TYPE_DISMISS = "BEHAVIOR_TYPE_DISMISS";

    @NotNull
    public static final String BEHAVIOR_TYPE_DISMISS_AND_REDIRECT = "BEHAVIOR_TYPE_DISMISS_AND_REDIRECT";

    @NotNull
    public static final String BEHAVIOR_TYPE_DISMISS_AND_REFRESH = "BEHAVIOR_TYPE_DISMISS_AND_REFRESH";

    @NotNull
    public static final String BEHAVIOR_TYPE_DISMISS_AND_SCROLL = "BEHAVIOR_TYPE_DISMISS_AND_SCROLL";

    @NotNull
    public static final String BEHAVIOR_TYPE_INVALID = "BEHAVIOR_TYPE_INVALID";

    @NotNull
    public static final String BEHAVIOR_TYPE_NESTED_PAGE = "BEHAVIOR_TYPE_NESTED_PAGE";

    @NotNull
    public static final String BEHAVIOR_TYPE_REDIRECT = "BEHAVIOR_TYPE_REDIRECT";

    @NotNull
    public static final String BEHAVIOR_TYPE_REFRESH = "BEHAVIOR_TYPE_REFRESH";

    @NotNull
    public static final String BEHAVIOR_TYPE_SCROLL_TO_WIDGET = "BEHAVIOR_TYPE_SCROLL_TO_WIDGET";

    @NotNull
    public static final String BEHAVIOR_TYPE_SUBSCRIBE = "BEHAVIOR_TYPE_SUBSCRIBE";

    @NotNull
    private static final String FIELD_ID = "id";

    @NotNull
    public static final String ID_COMPOSER_ACTION = "composerAction";

    @NotNull
    public static final String ID_DISMISS = "dismiss";

    @NotNull
    public static final String ID_DISMISS_REDIRECT = "dismissAndRedirect";

    @NotNull
    public static final String ID_DISMISS_REFRESH = "dismissAndRefresh";

    @NotNull
    public static final String ID_DISMISS_SCROLL = "dismissAndScroll";

    @NotNull
    public static final String ID_OPEN_COMPOSER_NESTED_PAGE = "composerNestedPage";

    @NotNull
    public static final String ID_OPEN_CUSTOM = "custom";

    @NotNull
    public static final String ID_OPEN_NESTED_PAGE = "nestedPage";

    @NotNull
    public static final String ID_OPEN_REDIRECT = "redirect";

    @NotNull
    public static final String ID_OPEN_UPDATE = "update";

    @NotNull
    public static final String ID_SCROLL_TO_WIDGET = "scrollToWidget";

    @NotNull
    public static final String ID_SUBSCRIBE_TO_STOCK = "subscribeToStock";

    @NotNull
    public static final String ID_UNSUBSCRIBE_FROM_STOCK = "unsubscribeFromStock";

    @NotNull
    private static final Type type;
    private final JsonAdapter<Map<String, String>> mapAdapter;
    public static final int $stable = 8;

    @NotNull
    private static final String FIELD_LINK = "link";

    @NotNull
    private static final String FIELD_BEHAVIOR = "behavior";

    @NotNull
    private static final String FIELD_PARAMS = "params";
    private static final n.a NAMES = n.a.C0918a.a("id", FIELD_LINK, FIELD_BEHAVIOR, FIELD_PARAMS);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AtomActionDTO.Behavior.values().length];
            try {
                iArr[AtomActionDTO.Behavior.CUSTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AtomActionDTO.Behavior.REDIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AtomActionDTO.Behavior.BEHAVIOR_TYPE_REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AtomActionDTO.Behavior.NESTED_PAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AtomActionDTO.Behavior.COMPOSER_NESTED_PAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AtomActionDTO.Behavior.DISMISS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AtomActionDTO.Behavior.DISMISS_AND_SCROLL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AtomActionDTO.Behavior.DISMISS_REDIRECT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AtomActionDTO.Behavior.DISMISS_REFRESH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AtomActionDTO.Behavior.SCROLL_TO_WIDGET.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AtomActionDTO.Behavior.COMPOSER_ACTION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AtomActionDTO.Behavior.BEHAVIOR_TYPE_ACTION_SHEET.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AtomActionDTO.Behavior.INVALID_ACTION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        b e11 = D.e(Map.class, String.class, String.class);
        Intrinsics.checkNotNullExpressionValue(e11, "newParameterizedType(...)");
        type = e11;
    }

    public ActionAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.mapAdapter = moshi.d(type);
    }

    private final String mapActionBehaviorToAtomConstant(AtomActionDTO.Behavior behavior, String id2) {
        String str = "BEHAVIOR_TYPE_REDIRECT";
        switch (WhenMappings.$EnumSwitchMapping$0[behavior.ordinal()]) {
            case 1:
                if (!Intrinsics.d(id2, "subscribeToStock") && !Intrinsics.d(id2, "unsubscribeFromStock")) {
                    str = "BEHAVIOR_TYPE_CUSTOM";
                    break;
                } else {
                    str = "BEHAVIOR_TYPE_SUBSCRIBE";
                    break;
                }
            case 2:
            case 8:
                break;
            case 3:
                str = "BEHAVIOR_TYPE_REFRESH";
                break;
            case 4:
                str = "BEHAVIOR_TYPE_NESTED_PAGE";
                break;
            case 5:
                str = "BEHAVIOR_TYPE_COMPOSER_NESTED_PAGE";
                break;
            case 6:
                str = "BEHAVIOR_TYPE_DISMISS";
                break;
            case 7:
                str = "BEHAVIOR_TYPE_DISMISS_AND_SCROLL";
                break;
            case 9:
                str = "BEHAVIOR_TYPE_DISMISS_AND_REFRESH";
                break;
            case 10:
                str = "BEHAVIOR_TYPE_SCROLL_TO_WIDGET";
                break;
            case 11:
                str = "BEHAVIOR_TYPE_COMPOSER_ACTION";
                break;
            case 12:
                str = "BEHAVIOR_TYPE_ACTION_SHEET";
                break;
            case 13:
                str = "BEHAVIOR_TYPE_INVALID";
                break;
            default:
                throw new o();
        }
        return (String) ExtensionsKt.getExhaustive(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00ea, code lost:
    
        if (r9.equals("composerAction") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00f7, code lost:
    
        if (r9.equals("custom") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x015a, code lost:
    
        if (r9.equals("dismissAndRefresh") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x010d, code lost:
    
        return ru.ozon.uni.atoms.data.AtomActionDTO.Behavior.DISMISS_AND_SCROLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0112, code lost:
    
        if (r10.equals("dismissAndRedirect") != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0117, code lost:
    
        return ru.ozon.uni.atoms.data.AtomActionDTO.Behavior.DISMISS_REDIRECT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x011c, code lost:
    
        if (r10.equals("composerNestedPage") != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0121, code lost:
    
        return ru.ozon.uni.atoms.data.AtomActionDTO.Behavior.COMPOSER_NESTED_PAGE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0126, code lost:
    
        if (r10.equals("scrollToWidget") != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x012b, code lost:
    
        return ru.ozon.uni.atoms.data.AtomActionDTO.Behavior.SCROLL_TO_WIDGET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0130, code lost:
    
        if (r10.equals("redirect") != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0135, code lost:
    
        return ru.ozon.uni.atoms.data.AtomActionDTO.Behavior.REDIRECT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x013a, code lost:
    
        if (r10.equals("nestedPage") != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x013f, code lost:
    
        return ru.ozon.uni.atoms.data.AtomActionDTO.Behavior.NESTED_PAGE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0144, code lost:
    
        if (r10.equals("composerAction") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0149, code lost:
    
        return ru.ozon.uni.atoms.data.AtomActionDTO.Behavior.COMPOSER_ACTION;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014e, code lost:
    
        if (r10.equals("dismissAndRefresh") != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0155, code lost:
    
        return ru.ozon.uni.atoms.data.AtomActionDTO.Behavior.DISMISS_REFRESH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0152, code lost:
    
        return ru.ozon.uni.atoms.data.AtomActionDTO.Behavior.CUSTOM;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0034, code lost:
    
        if (r9.equals("dismiss") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0084, code lost:
    
        return ru.ozon.uni.atoms.data.AtomActionDTO.Behavior.DISMISS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r9.equals("BEHAVIOR_TYPE_CUSTOM") != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x004b, code lost:
    
        if (r9.equals("BEHAVIOR_TYPE_DISMISS_AND_REDIRECT") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006d, code lost:
    
        return ru.ozon.uni.atoms.data.AtomActionDTO.Behavior.DISMISS_REDIRECT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0055, code lost:
    
        if (r9.equals("BEHAVIOR_TYPE_COMPOSER_ACTION") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f0, code lost:
    
        return ru.ozon.uni.atoms.data.AtomActionDTO.Behavior.COMPOSER_ACTION;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x005f, code lost:
    
        if (r9.equals("BEHAVIOR_TYPE_DISMISS_AND_REFRESH") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0161, code lost:
    
        return ru.ozon.uni.atoms.data.AtomActionDTO.Behavior.DISMISS_REFRESH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0067, code lost:
    
        if (r9.equals("dismissAndRedirect") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0074, code lost:
    
        if (r9.equals("BEHAVIOR_TYPE_COMPOSER_NESTED_PAGE") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00fe, code lost:
    
        switch(r10.hashCode()) {
            case -1352422610: goto L126;
            case -1278356618: goto L121;
            case -888609754: goto L116;
            case -776144932: goto L111;
            case -342918516: goto L106;
            case 100309350: goto L101;
            case 959375849: goto L96;
            case 1230436378: goto L91;
            default: goto L128;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x008f, code lost:
    
        return ru.ozon.uni.atoms.data.AtomActionDTO.Behavior.COMPOSER_NESTED_PAGE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x007e, code lost:
    
        if (r9.equals("BEHAVIOR_TYPE_DISMISS") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0089, code lost:
    
        if (r9.equals("composerNestedPage") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0096, code lost:
    
        if (r9.equals("BEHAVIOR_TYPE_REDIRECT") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00c6, code lost:
    
        return ru.ozon.uni.atoms.data.AtomActionDTO.Behavior.REDIRECT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ab, code lost:
    
        if (r9.equals("scrollToWidget") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00bb, code lost:
    
        return ru.ozon.uni.atoms.data.AtomActionDTO.Behavior.SCROLL_TO_WIDGET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00b5, code lost:
    
        if (r9.equals("BEHAVIOR_TYPE_SCROLL_TO_WIDGET") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0108, code lost:
    
        if (r10.equals("dismissAndScroll") != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00c0, code lost:
    
        if (r9.equals("redirect") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00cd, code lost:
    
        if (r9.equals("update") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00d5, code lost:
    
        if (r9.equals("nestedPage") == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00e5, code lost:
    
        return ru.ozon.uni.atoms.data.AtomActionDTO.Behavior.NESTED_PAGE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00df, code lost:
    
        if (r9.equals("BEHAVIOR_TYPE_NESTED_PAGE") == false) goto L134;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AtomActionDTO.Behavior mapAtomConstantToActionBehavior(String behaviorValue, String id2) {
        switch (behaviorValue.hashCode()) {
            case -1352422610:
                break;
            case -1349088399:
                break;
            case -1278356618:
                break;
            case -1067676257:
                break;
            case -888609754:
                break;
            case -838846263:
                break;
            case -776144932:
                break;
            case -498042418:
                break;
            case -342918516:
                break;
            case 4984707:
                if (behaviorValue.equals("BEHAVIOR_TYPE_REFRESH")) {
                    return AtomActionDTO.Behavior.BEHAVIOR_TYPE_REFRESH;
                }
                return AtomActionDTO.Behavior.INVALID_ACTION;
            case 89329684:
                break;
            case 100309350:
                break;
            case 591212338:
                break;
            case 660223088:
                break;
            case 959375849:
                break;
            case 1159687846:
                break;
            case 1229382397:
                break;
            case 1525388625:
                break;
            case 1574751218:
                if (behaviorValue.equals("BEHAVIOR_TYPE_SUBSCRIBE")) {
                    return AtomActionDTO.Behavior.CUSTOM;
                }
                return AtomActionDTO.Behavior.INVALID_ACTION;
            case 1671672458:
                break;
            case 1924564526:
                if (behaviorValue.equals("BEHAVIOR_TYPE_ACTION_SHEET")) {
                    return AtomActionDTO.Behavior.BEHAVIOR_TYPE_ACTION_SHEET;
                }
                return AtomActionDTO.Behavior.INVALID_ACTION;
            case 2079741353:
                break;
            default:
                return AtomActionDTO.Behavior.INVALID_ACTION;
        }
    }

    private final void nameAndValue(x xVar, String str, String str2) {
        xVar.w(str);
        if (str2 != null) {
            xVar.R(str2);
        } else {
            xVar.x();
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public AtomActionDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        if (reader.p() == n.b.NULL) {
            reader.m();
            return null;
        }
        reader.beginObject();
        String str = null;
        String str2 = null;
        Map<String, String> map = null;
        String str3 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(NAMES);
            if (v11 == 0) {
                str2 = reader.nextString();
            } else if (v11 == 1) {
                str = reader.nextString();
            } else if (v11 == 2) {
                str3 = reader.nextString();
            } else if (v11 != 3) {
                reader.y();
                reader.skipValue();
            } else {
                map = this.mapAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new AtomActionDTO(mapAtomConstantToActionBehavior(str3 == null ? "" : str3, str2 != null ? str2 : ""), str, str2, map, str3);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AtomActionDTO value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            writer.x();
            return;
        }
        writer.j();
        nameAndValue(writer, FIELD_BEHAVIOR, mapActionBehaviorToAtomConstant(value.getBehavior(), value.getId()));
        nameAndValue(writer, FIELD_LINK, value.getLink());
        nameAndValue(writer, "id", value.getId());
        writer.w(FIELD_PARAMS);
        Map<String, String> params = value.getParams();
        if (params != null) {
            this.mapAdapter.mo44toJson(writer, (x) params);
        } else {
            writer.x();
        }
        writer.p();
    }
}
